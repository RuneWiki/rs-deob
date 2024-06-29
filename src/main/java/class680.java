import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class680 extends Callback {

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Z")
    private volatile boolean field9443 = true;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    private int field9440;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    private volatile int field9441;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    private volatile int field9442;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "Z")
    private boolean field9444;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
    public final void method3898(int arg0, int arg1, int arg2) {
        User32.SetCursorPos(arg0, arg2);
        if (arg1 != 28937) {
            this.field9444 = true;
        }
    }

    @OriginalMember(owner = "client!gi", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9442 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field9443 ? this.field9440 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field9443 ? this.field9440 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field9442 = 0;
            this.field9443 = true;
        }
        return User32.CallWindowProc(this.field9441, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Component;ZI)V")
    public final void method3899(Component arg0, boolean arg1, int arg2) {
        WComponentPeer var4 = (WComponentPeer) arg0.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field9442 == var5 && arg1 == this.field9443) {
            return;
        }
        if (!this.field9444) {
            this.field9440 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field9444 = true;
        }
        if (arg2 != -30729) {
            this.field9443 = true;
        }
        if (this.field9442 != var5) {
            if (this.field9442 != 0) {
                this.field9443 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field9442, -4, this.field9441);
                }
            }
            synchronized (this) {
                this.field9442 = var5;
                this.field9441 = User32.SetWindowLong(this.field9442, -4, this);
            }
        }
        this.field9443 = arg1;
        User32.SendMessage(var5, 101024, 0, 0);
    }
}
