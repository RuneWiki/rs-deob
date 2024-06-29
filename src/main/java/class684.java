import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class684 extends Callback {

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "Z")
    private volatile boolean field9645 = true;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    private int field9642;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    private volatile int field9643;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    private volatile int field9644;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "Z")
    private boolean field9646;

    @OriginalMember(owner = "client!ql", name = "callback", descriptor = "(IIII)I", line = 6)
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9644 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field9645 ? this.field9642 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field9645 ? this.field9642 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field9644 = 0;
            this.field9645 = true;
        }
        return User32.CallWindowProc(this.field9643, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIB)V", line = 47)
    public final void method3780(int arg0, int arg1, byte arg2) {
        User32.SetCursorPos(arg0, arg1);
        int var4 = 3 / ((arg2 - 75) / 40);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZBLjava/awt/Component;)V", line = 62)
    public final void method3781(boolean arg0, byte arg1, Component arg2) {
        WComponentPeer var4 = (WComponentPeer) arg2.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field9644 == var5 && arg0 == this.field9645) {
            return;
        }
        if (!this.field9646) {
            this.field9642 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field9646 = true;
        }
        if (this.field9644 != var5) {
            if (this.field9644 != 0) {
                this.field9645 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field9644, -4, this.field9643);
                }
            }
            synchronized (this) {
                this.field9644 = var5;
                this.field9643 = User32.SetWindowLong(this.field9644, -4, this);
            }
        }
        int var8 = 80 / ((arg1 - 70) / 33);
        this.field9645 = arg0;
        User32.SendMessage(var5, 101024, 0, 0);
    }
}
