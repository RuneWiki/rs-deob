import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class244 extends Callback {

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Z")
    private volatile boolean field3197 = true;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    private int field3196;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    private volatile int field3198;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    private volatile int field3199;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Z")
    private boolean field3195;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Component;ZZ)V")
    public final void method1524(Component arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            this.field3199 = -14;
        }
        WComponentPeer var4 = (WComponentPeer) arg0.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field3199 == var5 && this.field3197 == arg2) {
            return;
        }
        if (!this.field3195) {
            this.field3196 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field3195 = true;
        }
        if (this.field3199 != var5) {
            if (this.field3199 != 0) {
                this.field3197 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field3199, -4, this.field3198);
                }
            }
            synchronized (this) {
                this.field3199 = var5;
                this.field3198 = User32.SetWindowLong(this.field3199, -4, this);
            }
        }
        this.field3197 = arg2;
        User32.SendMessage(var5, 101024, 0, 0);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BII)V")
    public final void method1525(byte arg0, int arg1, int arg2) {
        if (arg0 <= 110) {
            this.method1525((byte) -113, -52, 31);
        }
        User32.SetCursorPos(arg2, arg1);
    }

    @OriginalMember(owner = "client!tg", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3199 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field3197 ? this.field3196 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field3197 ? this.field3196 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field3199 = 0;
            this.field3197 = true;
        }
        return User32.CallWindowProc(this.field3198, arg0, arg1, arg2, arg3);
    }
}
