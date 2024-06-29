import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class141 extends Callback {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Z")
    private volatile boolean field2367 = true;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    private int field2366;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    private volatile int field2368;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    private volatile int field2369;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Z")
    private boolean field2370;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/awt/Component;ZB)V")
    public final void method1198(Component arg0, boolean arg1, byte arg2) {
        if (arg2 != -126) {
            this.field2366 = 23;
        }
        WComponentPeer var4 = (WComponentPeer) arg0.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field2368 == var5 && arg1 == this.field2367) {
            return;
        }
        if (!this.field2370) {
            this.field2366 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field2370 = true;
        }
        if (this.field2368 != var5) {
            if (this.field2368 != 0) {
                this.field2367 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field2368, -4, this.field2369);
                }
            }
            synchronized (this) {
                this.field2368 = var5;
                this.field2369 = User32.SetWindowLong(this.field2368, -4, this);
            }
        }
        this.field2367 = arg1;
        User32.SendMessage(var5, 101024, 0, 0);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IBI)V")
    public final void method1199(int arg0, byte arg1, int arg2) {
        User32.SetCursorPos(arg0, arg2);
        int var4 = -122 / ((arg1 + 19) / 46);
    }

    @OriginalMember(owner = "client!g", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2368 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field2367 ? this.field2366 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field2367 ? this.field2366 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field2368 = 0;
            this.field2367 = true;
        }
        return User32.CallWindowProc(this.field2369, arg0, arg1, arg2, arg3);
    }
}
