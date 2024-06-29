import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class536 extends Callback {

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Z")
    private volatile boolean field7523 = true;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    private int field7521;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    private volatile int field7522;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    private volatile int field7524;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Z")
    private boolean field7525;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIZ)V")
    public final void method3106(int arg0, int arg1, boolean arg2) {
        User32.SetCursorPos(arg1, arg0);
        if (arg2) {
            this.method3107(null, true, -94);
        }
    }

    @OriginalMember(owner = "client!bf", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field7524 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field7523 ? this.field7521 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field7523 ? this.field7521 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field7524 = 0;
            this.field7523 = true;
        }
        return User32.CallWindowProc(this.field7522, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/awt/Component;ZI)V")
    public final void method3107(Component arg0, boolean arg1, int arg2) {
        WComponentPeer var4 = (WComponentPeer) arg0.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field7524 == var5 && this.field7523 == arg1) {
            return;
        }
        if (!this.field7525) {
            this.field7521 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field7525 = true;
        }
        if (this.field7524 != var5) {
            if (this.field7524 != 0) {
                this.field7523 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field7524, -4, this.field7522);
                }
            }
            synchronized (this) {
                this.field7524 = var5;
                this.field7522 = User32.SetWindowLong(this.field7524, -4, this);
            }
        }
        this.field7523 = arg1;
        User32.SendMessage(var5, 101024, 0, 0);
        if (arg2 <= 102) {
            this.field7523 = false;
        }
    }
}
