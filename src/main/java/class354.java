import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class354 extends Callback {

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "Z")
    private volatile boolean field5230 = true;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    private int field5227;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    private volatile int field5228;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "I")
    private volatile int field5231;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "Z")
    private boolean field5229;

    @OriginalMember(owner = "client!lv", name = "callback", descriptor = "(IIII)I", line = 5)
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5231 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field5230 ? this.field5227 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field5230 ? this.field5227 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field5231 = 0;
            this.field5230 = true;
        }
        return User32.CallWindowProc(this.field5228, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIZ)V", line = 46)
    public final void method2254(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method2255(null, (byte) -37, true);
        }
        User32.SetCursorPos(arg1, arg0);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Ljava/awt/Component;BZ)V", line = 58)
    public final void method2255(Component arg0, byte arg1, boolean arg2) {
        WComponentPeer var4 = (WComponentPeer) arg0.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field5231 == var5 && this.field5230 == arg2) {
            return;
        }
        if (!this.field5229) {
            this.field5227 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field5229 = true;
        }
        if (this.field5231 != var5) {
            if (this.field5231 != 0) {
                this.field5230 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field5231, -4, this.field5228);
                }
            }
            synchronized (this) {
                this.field5231 = var5;
                this.field5228 = User32.SetWindowLong(this.field5231, -4, this);
            }
        }
        if (arg1 == -35) {
            this.field5230 = arg2;
            User32.SendMessage(var5, 101024, 0, 0);
        }
    }
}
