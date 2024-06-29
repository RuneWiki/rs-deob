import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class252 extends Callback {

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "Z")
    private volatile boolean field3742 = true;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    private volatile int field3738;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    private int field3739;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    private volatile int field3740;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "Z")
    private boolean field3741;

    @OriginalMember(owner = "client!ew", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3740 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field3742 ? this.field3739 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field3742 ? this.field3739 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field3740 = 0;
            this.field3742 = true;
        }
        return User32.CallWindowProc(this.field3738, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZILjava/awt/Component;)V")
    public final void method1690(boolean arg0, int arg1, Component arg2) {
        WComponentPeer var4 = (WComponentPeer) arg2.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field3740 == var5 && this.field3742 == arg0) {
            return;
        }
        if (!this.field3741) {
            this.field3739 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field3741 = true;
        }
        if (arg1 != 5912) {
            this.field3738 = 108;
        }
        if (this.field3740 != var5) {
            if (this.field3740 != 0) {
                this.field3742 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field3740, -4, this.field3738);
                }
            }
            synchronized (this) {
                this.field3740 = var5;
                this.field3738 = User32.SetWindowLong(this.field3740, -4, this);
            }
        }
        this.field3742 = arg0;
        User32.SendMessage(var5, 101024, 0, 0);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)V")
    public final void method1691(int arg0, int arg1, int arg2) {
        if (arg1 != -33) {
            this.field3742 = true;
        }
        User32.SetCursorPos(arg2, arg0);
    }
}
