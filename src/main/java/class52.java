import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class52 extends Callback {

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "Z")
    private volatile boolean field761 = true;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "I")
    private int field758;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "I")
    private volatile int field759;

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "I")
    private volatile int field762;

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "Z")
    private boolean field760;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZLjava/awt/Component;I)V")
    public final void method387(boolean arg0, Component arg1, int arg2) {
        WComponentPeer var4 = (WComponentPeer) arg1.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field759 == var5 && this.field761 == arg0) {
            return;
        }
        if (!this.field760) {
            this.field758 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field760 = true;
        }
        if (this.field759 != var5) {
            if (this.field759 != 0) {
                this.field761 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field759, -4, this.field762);
                }
            }
            synchronized (this) {
                this.field759 = var5;
                this.field762 = User32.SetWindowLong(this.field759, -4, this);
            }
        }
        this.field761 = arg0;
        User32.SendMessage(var5, 101024, 0, arg2);
    }

    @OriginalMember(owner = "client!kaa", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field759 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field761 ? this.field758 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field761 ? this.field758 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field759 = 0;
            this.field761 = true;
        }
        return User32.CallWindowProc(this.field762, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III)V")
    public final void method388(int arg0, int arg1, int arg2) {
        User32.SetCursorPos(arg2, arg0);
        if (arg1 != 0) {
            this.callback(-31, 38, 48, -85);
        }
    }
}
