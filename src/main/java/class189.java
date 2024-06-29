import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class189 extends Callback {

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Z")
    private volatile boolean field2847 = true;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    private int field2844;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    private volatile int field2845;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    private volatile int field2846;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Z")
    private boolean field2843;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/Component;ZI)V", line = 4)
    public final void method1363(Component arg0, boolean arg1, int arg2) {
        WComponentPeer var4 = (WComponentPeer) arg0.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field2846 == var5 && arg1 == this.field2847) {
            return;
        }
        if (!this.field2843) {
            this.field2844 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field2843 = true;
        }
        if (this.field2846 != var5) {
            if (this.field2846 != 0) {
                this.field2847 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field2846, -4, this.field2845);
                }
            }
            synchronized (this) {
                this.field2846 = var5;
                this.field2845 = User32.SetWindowLong(this.field2846, -4, this);
            }
        }
        this.field2847 = arg1;
        if (arg2 >= 5) {
            User32.SendMessage(var5, 101024, 0, 0);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V", line = 52)
    public final void method1364(int arg0, int arg1, int arg2) {
        User32.SetCursorPos(arg1, arg0);
        if (arg2 != 28841) {
            this.field2845 = -124;
        }
    }

    @OriginalMember(owner = "client!cc", name = "callback", descriptor = "(IIII)I", line = 62)
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2846 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field2847 ? this.field2844 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field2847 ? this.field2844 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field2846 = 0;
            this.field2847 = true;
        }
        return User32.CallWindowProc(this.field2845, arg0, arg1, arg2, arg3);
    }
}
