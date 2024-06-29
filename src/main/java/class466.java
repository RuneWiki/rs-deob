import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class466 extends Callback {

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Z")
    private volatile boolean field6653 = true;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    private int field6649;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    private volatile int field6650;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    private volatile int field6652;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Z")
    private boolean field6651;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZILjava/awt/Component;)V", line = 3)
    public final void method2689(boolean arg0, int arg1, Component arg2) {
        WComponentPeer var4 = (WComponentPeer) arg2.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field6652 == var5 && arg0 == this.field6653) {
            return;
        }
        if (!this.field6651) {
            this.field6649 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field6651 = true;
        }
        if (this.field6652 != var5) {
            if (this.field6652 != 0) {
                this.field6653 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field6652, -4, this.field6650);
                }
            }
            synchronized (this) {
                this.field6652 = var5;
                this.field6650 = User32.SetWindowLong(this.field6652, -4, this);
            }
        }
        this.field6653 = arg0;
        User32.SendMessage(var5, 101024, 0, arg1);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZI)V", line = 48)
    public final void method2690(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            User32.SetCursorPos(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!u", name = "callback", descriptor = "(IIII)I", line = 58)
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field6652 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field6653 ? this.field6649 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field6653 ? this.field6649 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field6652 = 0;
            this.field6653 = true;
        }
        return User32.CallWindowProc(this.field6650, arg0, arg1, arg2, arg3);
    }
}
