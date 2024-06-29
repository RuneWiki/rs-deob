import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class469 extends Callback {

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "Z")
    private volatile boolean field6367 = true;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    private volatile int field6363;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "I")
    private int field6365;

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
    private volatile int field6366;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "Z")
    private boolean field6364;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IZLjava/awt/Component;)V")
    public final void method2644(int arg0, boolean arg1, Component arg2) {
        WComponentPeer var4 = (WComponentPeer) arg2.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field6366 == var5 && arg1 == this.field6367) {
            return;
        }
        if (!this.field6364) {
            this.field6365 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field6364 = true;
        }
        if (this.field6366 != var5) {
            if (this.field6366 != 0) {
                this.field6367 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field6366, -4, this.field6363);
                }
            }
            synchronized (this) {
                this.field6366 = var5;
                this.field6363 = User32.SetWindowLong(this.field6366, -4, this);
            }
        }
        this.field6367 = arg1;
        User32.SendMessage(var5, 101024, 0, arg0);
    }

    @OriginalMember(owner = "client!hca", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field6366 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field6367 ? this.field6365 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field6367 ? this.field6365 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field6366 = 0;
            this.field6367 = true;
        }
        return User32.CallWindowProc(this.field6363, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)V")
    public final void method2645(int arg0, int arg1, int arg2) {
        if (arg2 > 0) {
            User32.SetCursorPos(arg0, arg1);
        }
    }
}
