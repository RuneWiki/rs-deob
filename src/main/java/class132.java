import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class132 extends Callback {

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "Z")
    private volatile boolean field1687 = true;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    private int field1685;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    private volatile int field1686;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    private volatile int field1688;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Z")
    private boolean field1684;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/awt/Component;ZI)V", line = 3)
    public final void method888(Component arg0, boolean arg1, int arg2) {
        WComponentPeer var4 = (WComponentPeer) arg0.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field1686 == var5 && this.field1687 == arg1) {
            return;
        }
        if (!this.field1684) {
            this.field1685 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field1684 = true;
        }
        if (this.field1686 != var5) {
            if (this.field1686 != 0) {
                this.field1687 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field1686, -4, this.field1688);
                }
            }
            synchronized (this) {
                this.field1686 = var5;
                this.field1688 = User32.SetWindowLong(this.field1686, -4, this);
            }
        }
        this.field1687 = arg1;
        User32.SendMessage(var5, 101024, 0, arg2);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIB)V", line = 45)
    public final void method889(int arg0, int arg1, byte arg2) {
        User32.SetCursorPos(arg1, arg0);
        if (arg2 != 105) {
            this.method888(null, false, 11);
        }
    }

    @OriginalMember(owner = "client!mg", name = "callback", descriptor = "(IIII)I", line = 56)
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1686 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field1687 ? this.field1685 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field1687 ? this.field1685 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field1686 = 0;
            this.field1687 = true;
        }
        return User32.CallWindowProc(this.field1688, arg0, arg1, arg2, arg3);
    }
}
