import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class162 extends Callback {

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "Z")
    private volatile boolean field2445 = true;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    private volatile int field2441;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    private volatile int field2442;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    private int field2444;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "Z")
    private boolean field2443;

    @OriginalMember(owner = "client!aq", name = "callback", descriptor = "(IIII)I", line = 6)
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2442 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field2445 ? this.field2444 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field2445 ? this.field2444 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field2442 = 0;
            this.field2445 = true;
        }
        return User32.CallWindowProc(this.field2441, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILjava/awt/Component;Z)V", line = 48)
    public final void method1162(int arg0, Component arg1, boolean arg2) {
        WComponentPeer var4 = (WComponentPeer) arg1.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field2442 == var5 && this.field2445 == arg2) {
            return;
        }
        if (!this.field2443) {
            this.field2444 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field2443 = true;
        }
        if (this.field2442 != var5) {
            if (this.field2442 != 0) {
                this.field2445 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field2442, -4, this.field2441);
                }
            }
            synchronized (this) {
                this.field2442 = var5;
                this.field2441 = User32.SetWindowLong(this.field2442, -4, this);
            }
        }
        this.field2445 = arg2;
        int var8 = 4 % ((39 - arg0) / 54);
        User32.SendMessage(var5, 101024, 0, 0);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)V", line = 93)
    public final void method1163(int arg0, int arg1, int arg2) {
        if (arg1 <= 59) {
            this.callback(-74, 30, 25, 73);
        }
        User32.SetCursorPos(arg0, arg2);
    }
}
