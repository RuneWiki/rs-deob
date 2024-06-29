import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class265 extends Callback {

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "Z")
    private volatile boolean field3523 = true;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    private volatile int field3522;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    private volatile int field3524;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    private int field3526;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Z")
    private boolean field3525;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZILjava/awt/Component;)V", line = 4)
    public final void method1674(boolean arg0, int arg1, Component arg2) {
        WComponentPeer var4 = (WComponentPeer) arg2.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field3524 == var5 && this.field3523 == arg0) {
            return;
        }
        if (arg1 < 35) {
            this.field3526 = -29;
        }
        if (!this.field3525) {
            this.field3526 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field3525 = true;
        }
        if (this.field3524 != var5) {
            if (this.field3524 != 0) {
                this.field3523 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field3524, -4, this.field3522);
                }
            }
            synchronized (this) {
                this.field3524 = var5;
                this.field3522 = User32.SetWindowLong(this.field3524, -4, this);
            }
        }
        this.field3523 = arg0;
        User32.SendMessage(var5, 101024, 0, 0);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V", line = 48)
    public final void method1675(int arg0, int arg1, int arg2) {
        User32.SetCursorPos(arg1, arg0);
        if (arg2 < 99) {
            this.field3526 = -7;
        }
    }

    @OriginalMember(owner = "client!lk", name = "callback", descriptor = "(IIII)I", line = 59)
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3524 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field3523 ? this.field3526 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field3523 ? this.field3526 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field3524 = 0;
            this.field3523 = true;
        }
        return User32.CallWindowProc(this.field3522, arg0, arg1, arg2, arg3);
    }
}
