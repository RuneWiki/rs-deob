import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class427 extends Callback {

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "Z")
    private volatile boolean field6268 = true;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    private volatile int field6269;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    private volatile int field6270;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    private int field6271;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "Z")
    private boolean field6267;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLjava/awt/Component;Z)V", line = 5)
    public final void method2666(byte arg0, Component arg1, boolean arg2) {
        WComponentPeer var4 = (WComponentPeer) arg1.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field6270 == var5 && arg2 == this.field6268) {
            return;
        }
        if (!this.field6267) {
            this.field6271 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field6267 = true;
        }
        if (this.field6270 != var5) {
            if (this.field6270 != 0) {
                this.field6268 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field6270, -4, this.field6269);
                }
            }
            synchronized (this) {
                this.field6270 = var5;
                this.field6269 = User32.SetWindowLong(this.field6270, -4, this);
            }
        }
        this.field6268 = arg2;
        User32.SendMessage(var5, 101024, 0, 0);
        int var8 = 30 / ((arg0 - 85) / 40);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IBI)V", line = 48)
    public final void method2667(int arg0, byte arg1, int arg2) {
        User32.SetCursorPos(arg0, arg2);
        if (arg1 != -82) {
            this.field6268 = true;
        }
    }

    @OriginalMember(owner = "client!qq", name = "callback", descriptor = "(IIII)I", line = 63)
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field6270 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field6268 ? this.field6271 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field6268 ? this.field6271 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field6270 = 0;
            this.field6268 = true;
        }
        return User32.CallWindowProc(this.field6269, arg0, arg1, arg2, arg3);
    }
}
