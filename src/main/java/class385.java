import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class385 extends Callback {

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "Z")
    private volatile boolean field6176 = true;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    private int field6177;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    private volatile int field6178;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    private volatile int field6180;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Z")
    private boolean field6179;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)V")
    public final void method3145(int arg0, int arg1, int arg2) {
        User32.SetCursorPos(arg1, arg2);
        if (arg0 != 0) {
            this.callback(-71, -78, -46, 32);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZZLjava/awt/Component;)V")
    public final void method3146(boolean arg0, boolean arg1, Component arg2) {
        if (arg1) {
            return;
        }
        WComponentPeer var4 = (WComponentPeer) arg2.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field6180 == var5 && arg0 == this.field6176) {
            return;
        }
        if (!this.field6179) {
            this.field6177 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field6179 = true;
        }
        if (this.field6180 != var5) {
            if (this.field6180 != 0) {
                this.field6176 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field6180, -4, this.field6178);
                }
            }
            synchronized (this) {
                this.field6180 = var5;
                this.field6178 = User32.SetWindowLong(this.field6180, -4, this);
            }
        }
        this.field6176 = arg0;
        User32.SendMessage(var5, 101024, 0, 0);
    }

    @OriginalMember(owner = "client!ll", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field6180 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field6176 ? this.field6177 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field6176 ? this.field6177 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field6180 = 0;
            this.field6176 = true;
        }
        return User32.CallWindowProc(this.field6178, arg0, arg1, arg2, arg3);
    }
}
