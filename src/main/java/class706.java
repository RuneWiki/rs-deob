import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class706 extends Callback {

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "Z")
    private volatile boolean field9994 = true;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    private int field9992;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    private volatile int field9995;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    private volatile int field9996;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "Z")
    private boolean field9993;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZII)V", line = 3)
    public final void method3970(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.method3970(false, -124, 22);
        }
        User32.SetCursorPos(arg2, arg1);
    }

    @OriginalMember(owner = "client!gq", name = "callback", descriptor = "(IIII)I", line = 13)
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9995 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field9994 ? this.field9992 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field9994 ? this.field9992 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field9995 = 0;
            this.field9994 = true;
        }
        return User32.CallWindowProc(this.field9996, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLjava/awt/Component;I)V", line = 59)
    public final void method3971(boolean arg0, Component arg1, int arg2) {
        WComponentPeer var4 = (WComponentPeer) arg1.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field9995 == var5 && this.field9994 == arg0) {
            return;
        }
        if (!this.field9993) {
            this.field9992 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field9993 = true;
        }
        if (arg2 > -17) {
            this.method3970(true, -41, -47);
        }
        if (this.field9995 != var5) {
            if (this.field9995 != 0) {
                this.field9994 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field9995, -4, this.field9996);
                }
            }
            synchronized (this) {
                this.field9995 = var5;
                this.field9996 = User32.SetWindowLong(this.field9995, -4, this);
            }
        }
        this.field9994 = arg0;
        User32.SendMessage(var5, 101024, 0, 0);
    }
}
