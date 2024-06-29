import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class753 extends Callback {

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "Z")
    private volatile boolean field10375 = true;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
    private int field10374;

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "I")
    private volatile int field10376;

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "I")
    private volatile int field10377;

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "Z")
    private boolean field10378;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)V")
    public final void method4179(int arg0, int arg1, int arg2) {
        User32.SetCursorPos(arg1, arg0);
        if (arg2 < 69) {
            this.field10376 = -109;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Ljava/awt/Component;ZZ)V")
    public final void method4180(Component arg0, boolean arg1, boolean arg2) {
        WComponentPeer var4 = (WComponentPeer) arg0.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field10377 == var5 && arg1 == this.field10375) {
            return;
        }
        if (!this.field10378) {
            this.field10374 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field10378 = true;
        }
        if (this.field10377 != var5) {
            if (this.field10377 != 0) {
                this.field10375 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field10377, -4, this.field10376);
                }
            }
            synchronized (this) {
                this.field10377 = var5;
                this.field10376 = User32.SetWindowLong(this.field10377, -4, this);
            }
        }
        if (arg2) {
            this.method4179(118, 34, 69);
        }
        this.field10375 = arg1;
        User32.SendMessage(var5, 101024, 0, 0);
    }

    @OriginalMember(owner = "client!sda", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field10377 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field10375 ? this.field10374 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field10375 ? this.field10374 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field10377 = 0;
            this.field10375 = true;
        }
        return User32.CallWindowProc(this.field10376, arg0, arg1, arg2, arg3);
    }
}
