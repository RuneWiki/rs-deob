import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class586 extends Callback {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Z")
    private volatile boolean field8331 = true;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    private int field8332;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    private volatile int field8333;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    private volatile int field8335;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Z")
    private boolean field8334;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZLjava/awt/Component;)V", line = 7)
    public final void method3291(int arg0, boolean arg1, Component arg2) {
        WComponentPeer var4 = (WComponentPeer) arg2.getPeer();
        int var5 = 118 / ((arg0 + 49) / 56);
        int var6 = var4.getTopHwnd();
        if (this.field8333 == var6 && arg1 == this.field8331) {
            return;
        }
        if (!this.field8334) {
            this.field8332 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field8334 = true;
        }
        if (this.field8333 != var6) {
            if (this.field8333 != 0) {
                this.field8331 = true;
                User32.SendMessage(var6, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field8333, -4, this.field8335);
                }
            }
            synchronized (this) {
                this.field8333 = var6;
                this.field8335 = User32.SetWindowLong(this.field8333, -4, this);
            }
        }
        this.field8331 = arg1;
        User32.SendMessage(var6, 101024, 0, 0);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V", line = 51)
    public final void method3292(int arg0, int arg1, int arg2) {
        User32.SetCursorPos(arg0, arg1);
        if (arg2 != 0) {
            this.method3291(-120, true, null);
        }
    }

    @OriginalMember(owner = "client!rg", name = "callback", descriptor = "(IIII)I", line = 65)
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8333 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field8331 ? this.field8332 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field8331 ? this.field8332 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field8333 = 0;
            this.field8331 = true;
        }
        return User32.CallWindowProc(this.field8335, arg0, arg1, arg2, arg3);
    }
}
