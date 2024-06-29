import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class260 extends Callback {

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Z")
    private volatile boolean field3307 = true;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    private volatile int field3304;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    private volatile int field3305;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    private int field3308;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "Z")
    private boolean field3306;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLjava/awt/Component;B)V")
    public final void method1560(boolean arg0, Component arg1, byte arg2) {
        WComponentPeer var4 = (WComponentPeer) arg1.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field3305 == var5 && this.field3307 == arg0) {
            return;
        }
        if (!this.field3306) {
            this.field3308 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field3306 = true;
        }
        if (this.field3305 != var5) {
            if (this.field3305 != 0) {
                this.field3307 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field3305, -4, this.field3304);
                }
            }
            synchronized (this) {
                this.field3305 = var5;
                this.field3304 = User32.SetWindowLong(this.field3305, -4, this);
            }
        }
        if (arg2 < 29) {
            this.method1560(true, null, (byte) -120);
        }
        this.field3307 = arg0;
        User32.SendMessage(var5, 101024, 0, 0);
    }

    @OriginalMember(owner = "client!mm", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3305 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field3307 ? this.field3308 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field3307 ? this.field3308 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field3305 = 0;
            this.field3307 = true;
        }
        return User32.CallWindowProc(this.field3304, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)V")
    public final void method1561(int arg0, int arg1, int arg2) {
        User32.SetCursorPos(arg2, arg1);
        if (arg0 <= 91) {
            this.method1561(-63, -95, -45);
        }
    }
}
