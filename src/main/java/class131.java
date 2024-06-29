import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class131 extends Callback {

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "Z")
    private volatile boolean field1977 = true;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    private volatile int field1975;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    private volatile int field1976;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    private int field1979;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "Z")
    private boolean field1978;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IZLjava/awt/Component;)V")
    public final void method972(int arg0, boolean arg1, Component arg2) {
        WComponentPeer var4 = (WComponentPeer) arg2.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field1976 == var5 && this.field1977 == arg1) {
            return;
        }
        if (!this.field1978) {
            this.field1979 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field1978 = true;
        }
        if (this.field1976 != var5) {
            if (this.field1976 != 0) {
                this.field1977 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field1976, -4, this.field1975);
                }
            }
            synchronized (this) {
                this.field1976 = var5;
                this.field1975 = User32.SetWindowLong(this.field1976, -4, this);
            }
        }
        if (arg0 == -4) {
            this.field1977 = arg1;
            User32.SendMessage(var5, 101024, 0, 0);
        }
    }

    @OriginalMember(owner = "client!fv", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1976 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field1977 ? this.field1979 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field1977 ? this.field1979 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field1976 = 0;
            this.field1977 = true;
        }
        return User32.CallWindowProc(this.field1975, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(III)V")
    public final void method973(int arg0, int arg1, int arg2) {
        if (arg2 != -2) {
            this.field1979 = -93;
        }
        User32.SetCursorPos(arg0, arg1);
    }
}
