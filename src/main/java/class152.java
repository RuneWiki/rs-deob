import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class152 extends Callback {

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "Z")
    private volatile boolean field2092 = true;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    private volatile int field2091;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    private volatile int field2093;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    private int field2094;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "Z")
    private boolean field2095;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(III)V")
    public final void method972(int arg0, int arg1, int arg2) {
        if (arg0 <= 73) {
            this.method972(58, -75, 37);
        }
        User32.SetCursorPos(arg2, arg1);
    }

    @OriginalMember(owner = "client!nr", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2091 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field2092 ? this.field2094 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field2092 ? this.field2094 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field2091 = 0;
            this.field2092 = true;
        }
        return User32.CallWindowProc(this.field2093, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZLjava/awt/Component;I)V")
    public final void method973(boolean arg0, Component arg1, int arg2) {
        WComponentPeer var4 = (WComponentPeer) arg1.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field2091 == var5 && arg0 == this.field2092) {
            return;
        }
        if (!this.field2095) {
            this.field2094 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field2095 = true;
        }
        if (arg2 != 1) {
            this.field2092 = true;
        }
        if (this.field2091 != var5) {
            if (this.field2091 != 0) {
                this.field2092 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field2091, -4, this.field2093);
                }
            }
            synchronized (this) {
                this.field2091 = var5;
                this.field2093 = User32.SetWindowLong(this.field2091, -4, this);
            }
        }
        this.field2092 = arg0;
        User32.SendMessage(var5, 101024, 0, 0);
    }
}
