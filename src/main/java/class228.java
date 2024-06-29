import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class228 extends Callback {

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Z")
    private volatile boolean field3109 = true;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    private volatile int field3107;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    private int field3108;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    private volatile int field3111;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Z")
    private boolean field3110;

    @OriginalMember(owner = "client!jf", name = "callback", descriptor = "(IIII)I", line = 3)
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3107 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field3109 ? this.field3108 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field3109 ? this.field3108 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field3107 = 0;
            this.field3109 = true;
        }
        return User32.CallWindowProc(this.field3111, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V", line = 43)
    public final void method1495(int arg0, int arg1, int arg2) {
        if (arg0 < 117) {
            this.method1495(-77, 73, 10);
        }
        User32.SetCursorPos(arg1, arg2);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/awt/Component;ZI)V", line = 54)
    public final void method1496(Component arg0, boolean arg1, int arg2) {
        WComponentPeer var4 = (WComponentPeer) arg0.getPeer();
        if (arg2 != 15798) {
            this.field3107 = -73;
        }
        int var5 = var4.getTopHwnd();
        if (this.field3107 == var5 && arg1 == this.field3109) {
            return;
        }
        if (!this.field3110) {
            this.field3108 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field3110 = true;
        }
        if (this.field3107 != var5) {
            if (this.field3107 != 0) {
                this.field3109 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field3107, -4, this.field3111);
                }
            }
            synchronized (this) {
                this.field3107 = var5;
                this.field3111 = User32.SetWindowLong(this.field3107, -4, this);
            }
        }
        this.field3109 = arg1;
        User32.SendMessage(var5, 101024, 0, 0);
    }
}
