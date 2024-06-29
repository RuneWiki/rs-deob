import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class570 extends Callback {

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "Z")
    private volatile boolean field8294 = true;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
    private int field8291;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
    private volatile int field8292;

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "I")
    private volatile int field8295;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "Z")
    private boolean field8293;

    @OriginalMember(owner = "client!oca", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8295 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field8294 ? this.field8291 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field8294 ? this.field8291 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field8295 = 0;
            this.field8294 = true;
        }
        return User32.CallWindowProc(this.field8292, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)V")
    public final void method3277(int arg0, int arg1, int arg2) {
        User32.SetCursorPos(arg0, arg1);
        if (arg2 != 0) {
            this.field8293 = false;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZILjava/awt/Component;)V")
    public final void method3278(boolean arg0, int arg1, Component arg2) {
        WComponentPeer var4 = (WComponentPeer) arg2.getPeer();
        int var5 = -109 % ((68 - arg1) / 57);
        int var6 = var4.getTopHwnd();
        if (this.field8295 == var6 && arg0 == this.field8294) {
            return;
        }
        if (!this.field8293) {
            this.field8291 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field8293 = true;
        }
        if (this.field8295 != var6) {
            if (this.field8295 != 0) {
                this.field8294 = true;
                User32.SendMessage(var6, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field8295, -4, this.field8292);
                }
            }
            synchronized (this) {
                this.field8295 = var6;
                this.field8292 = User32.SetWindowLong(this.field8295, -4, this);
            }
        }
        this.field8294 = arg0;
        User32.SendMessage(var6, 101024, 0, 0);
    }
}
