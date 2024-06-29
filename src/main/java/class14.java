import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class14 extends Callback {

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Z")
    private volatile boolean field250 = true;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    private volatile int field251;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    private int field252;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    private volatile int field254;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Z")
    private boolean field253;

    @OriginalMember(owner = "client!ib", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field254 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field250 ? this.field252 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field250 ? this.field252 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field254 = 0;
            this.field250 = true;
        }
        return User32.CallWindowProc(this.field251, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/Component;BZ)V")
    public final void method107(Component arg0, byte arg1, boolean arg2) {
        WComponentPeer var4 = (WComponentPeer) arg0.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field254 == var5 && this.field250 == arg2) {
            return;
        }
        int var6 = 111 % ((arg1 + 47) / 52);
        if (!this.field253) {
            this.field252 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field253 = true;
        }
        if (this.field254 != var5) {
            if (this.field254 != 0) {
                this.field250 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field254, -4, this.field251);
                }
            }
            synchronized (this) {
                this.field254 = var5;
                this.field251 = User32.SetWindowLong(this.field254, -4, this);
            }
        }
        this.field250 = arg2;
        User32.SendMessage(var5, 101024, 0, 0);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBI)V")
    public final void method108(int arg0, byte arg1, int arg2) {
        int var4 = 124 / ((arg1 + 47) / 55);
        User32.SetCursorPos(arg2, arg0);
    }
}
