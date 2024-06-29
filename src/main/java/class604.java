import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class604 extends Callback {

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "Z")
    private volatile boolean field8405 = true;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "I")
    private volatile int field8401;

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "I")
    private int field8402;

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "I")
    private volatile int field8403;

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "Z")
    private boolean field8404;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZZLjava/awt/Component;)V")
    public final void method3414(boolean arg0, boolean arg1, Component arg2) {
        WComponentPeer var4 = (WComponentPeer) arg2.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field8403 == var5 && this.field8405 == arg1) {
            return;
        }
        if (!this.field8404) {
            this.field8402 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field8404 = true;
        }
        if (arg0) {
            this.callback(-52, -42, 109, 9);
        }
        if (this.field8403 != var5) {
            if (this.field8403 != 0) {
                this.field8405 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field8403, -4, this.field8401);
                }
            }
            synchronized (this) {
                this.field8403 = var5;
                this.field8401 = User32.SetWindowLong(this.field8403, -4, this);
            }
        }
        this.field8405 = arg1;
        User32.SendMessage(var5, 101024, 0, 0);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III)V")
    public final void method3415(int arg0, int arg1, int arg2) {
        User32.SetCursorPos(arg2, arg1);
        if (arg0 > -26) {
            this.callback(-39, 6, 91, 43);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8403 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field8405 ? this.field8402 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field8405 ? this.field8402 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field8403 = 0;
            this.field8405 = true;
        }
        return User32.CallWindowProc(this.field8401, arg0, arg1, arg2, arg3);
    }
}
