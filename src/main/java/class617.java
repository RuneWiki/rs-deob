import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class617 extends Callback {

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "Z")
    private volatile boolean field8346 = true;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    private volatile int field8345;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    private volatile int field8347;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    private int field8348;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "Z")
    private boolean field8344;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Ljava/awt/Component;ZI)V", line = 3)
    public final void method3373(Component arg0, boolean arg1, int arg2) {
        if (arg2 != 22192) {
            return;
        }
        WComponentPeer var4 = (WComponentPeer) arg0.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field8347 == var5 && this.field8346 == arg1) {
            return;
        }
        if (!this.field8344) {
            this.field8348 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field8344 = true;
        }
        if (this.field8347 != var5) {
            if (this.field8347 != 0) {
                this.field8346 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field8347, -4, this.field8345);
                }
            }
            synchronized (this) {
                this.field8347 = var5;
                this.field8345 = User32.SetWindowLong(this.field8347, -4, this);
            }
        }
        this.field8346 = arg1;
        User32.SendMessage(var5, 101024, 0, 0);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(III)V", line = 46)
    public final void method3374(int arg0, int arg1, int arg2) {
        if (arg1 == -4) {
            User32.SetCursorPos(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!vp", name = "callback", descriptor = "(IIII)I", line = 59)
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8347 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field8346 ? this.field8348 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field8346 ? this.field8348 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field8347 = 0;
            this.field8346 = true;
        }
        return User32.CallWindowProc(this.field8345, arg0, arg1, arg2, arg3);
    }
}
