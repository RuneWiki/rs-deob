import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class413 extends Callback {

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "Z")
    private volatile boolean field5710 = true;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    private int field5706;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    private volatile int field5707;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    private volatile int field5709;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "Z")
    private boolean field5708;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Ljava/awt/Component;ZI)V")
    public final void method2508(Component arg0, boolean arg1, int arg2) {
        WComponentPeer var4 = (WComponentPeer) arg0.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field5707 == var5 && arg1 == this.field5710) {
            return;
        }
        if (!this.field5708) {
            this.field5706 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field5708 = true;
        }
        if (this.field5707 != var5) {
            if (this.field5707 != 0) {
                this.field5710 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field5707, -4, this.field5709);
                }
            }
            synchronized (this) {
                this.field5707 = var5;
                this.field5709 = User32.SetWindowLong(this.field5707, -4, this);
            }
        }
        this.field5710 = arg1;
        User32.SendMessage(var5, 101024, arg2, 0);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)V")
    public final void method2509(int arg0, int arg1, int arg2) {
        if (arg0 == -20066) {
            User32.SetCursorPos(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!nn", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5707 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field5710 ? this.field5706 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field5710 ? this.field5706 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field5707 = 0;
            this.field5710 = true;
        }
        return User32.CallWindowProc(this.field5709, arg0, arg1, arg2, arg3);
    }
}
