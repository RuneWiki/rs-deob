import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class607 extends Callback {

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "Z")
    private volatile boolean field8453 = true;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
    private int field8450;

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "I")
    private volatile int field8452;

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
    private volatile int field8454;

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "Z")
    private boolean field8451;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZLjava/awt/Component;B)V", line = 3)
    public final void method3372(boolean arg0, Component arg1, byte arg2) {
        WComponentPeer var4 = (WComponentPeer) arg1.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field8452 == var5 && arg0 == this.field8453) {
            return;
        }
        if (!this.field8451) {
            this.field8450 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field8451 = true;
        }
        if (this.field8452 != var5) {
            if (this.field8452 != 0) {
                this.field8453 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field8452, -4, this.field8454);
                }
            }
            synchronized (this) {
                this.field8452 = var5;
                this.field8454 = User32.SetWindowLong(this.field8452, -4, this);
            }
        }
        this.field8453 = arg0;
        if (arg2 == 71) {
            User32.SendMessage(var5, 101024, 0, 0);
        }
    }

    @OriginalMember(owner = "client!oda", name = "callback", descriptor = "(IIII)I", line = 50)
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8452 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field8453 ? this.field8450 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field8453 ? this.field8450 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field8452 = 0;
            this.field8453 = true;
        }
        return User32.CallWindowProc(this.field8454, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IBI)V", line = 93)
    public final void method3373(int arg0, byte arg1, int arg2) {
        User32.SetCursorPos(arg0, arg2);
        if (arg1 != 8) {
            this.method3373(-78, (byte) 28, -92);
        }
    }
}
