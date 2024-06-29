import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class53 extends Callback {

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "Z")
    private volatile boolean field551 = true;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
    private volatile int field550;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
    private volatile int field553;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "Z")
    private boolean field549;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(ILjava/awt/Component;Z)V", line = 6)
    public final void method300(int arg0, Component arg1, boolean arg2) {
        WComponentPeer var4 = (WComponentPeer) arg1.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field550 == var5 && this.field551 == arg2) {
            return;
        }
        if (!this.field549) {
            this.field552 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field549 = true;
        }
        if (this.field550 != var5) {
            if (this.field550 != 0) {
                this.field551 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field550, -4, this.field553);
                }
            }
            synchronized (this) {
                this.field550 = var5;
                this.field553 = User32.SetWindowLong(this.field550, -4, this);
            }
        }
        this.field551 = arg2;
        User32.SendMessage(var5, 101024, arg0, 0);
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(III)V", line = 46)
    public final void method301(int arg0, int arg1, int arg2) {
        int var4 = -99 % ((-arg1 - 38) / 58);
        User32.SetCursorPos(arg2, arg0);
    }

    @OriginalMember(owner = "client!gda", name = "callback", descriptor = "(IIII)I", line = 55)
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field550 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field551 ? this.field552 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field551 ? this.field552 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field550 = 0;
            this.field551 = true;
        }
        return User32.CallWindowProc(this.field553, arg0, arg1, arg2, arg3);
    }
}
