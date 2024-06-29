import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class552 extends Callback {

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "Z")
    private volatile boolean field7602 = true;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    private volatile int field7603;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    private int field7604;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    private volatile int field7605;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "Z")
    private boolean field7606;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IBI)V", line = 3)
    public final void method3177(int arg0, byte arg1, int arg2) {
        if (arg1 >= 65) {
            User32.SetCursorPos(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZILjava/awt/Component;)V", line = 21)
    public final void method3178(boolean arg0, int arg1, Component arg2) {
        WComponentPeer var4 = (WComponentPeer) arg2.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field7603 == var5 && arg0 == this.field7602) {
            return;
        }
        if (arg1 != 13259) {
            this.method3178(true, -90, null);
        }
        if (!this.field7606) {
            this.field7604 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field7606 = true;
        }
        if (this.field7603 != var5) {
            if (this.field7603 != 0) {
                this.field7602 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field7603, -4, this.field7605);
                }
            }
            synchronized (this) {
                this.field7603 = var5;
                this.field7605 = User32.SetWindowLong(this.field7603, -4, this);
            }
        }
        this.field7602 = arg0;
        User32.SendMessage(var5, 101024, 0, 0);
    }

    @OriginalMember(owner = "client!lq", name = "callback", descriptor = "(IIII)I", line = 65)
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field7603 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field7602 ? this.field7604 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field7602 ? this.field7604 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field7603 = 0;
            this.field7602 = true;
        }
        return User32.CallWindowProc(this.field7605, arg0, arg1, arg2, arg3);
    }
}
