import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class347 extends Callback {

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "Z")
    private volatile boolean field5380 = true;

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "I")
    private volatile int field5378;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "I")
    private volatile int field5381;

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
    private int field5382;

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "Z")
    private boolean field5379;

    @OriginalMember(owner = "client!ofa", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5381 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field5380 ? this.field5382 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field5380 ? this.field5382 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field5381 = 0;
            this.field5380 = true;
        }
        return User32.CallWindowProc(this.field5378, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BZLjava/awt/Component;)V")
    public final void method2865(byte arg0, boolean arg1, Component arg2) {
        if (arg0 > -74) {
            return;
        }
        WComponentPeer var4 = (WComponentPeer) arg2.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field5381 == var5 && arg1 == this.field5380) {
            return;
        }
        if (!this.field5379) {
            this.field5382 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field5379 = true;
        }
        if (this.field5381 != var5) {
            if (this.field5381 != 0) {
                this.field5380 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field5381, -4, this.field5378);
                }
            }
            synchronized (this) {
                this.field5381 = var5;
                this.field5378 = User32.SetWindowLong(this.field5381, -4, this);
            }
        }
        this.field5380 = arg1;
        User32.SendMessage(var5, 101024, 0, 0);
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIZ)V")
    public final void method2866(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method2866(54, -14, true);
        }
        User32.SetCursorPos(arg0, arg1);
    }
}
