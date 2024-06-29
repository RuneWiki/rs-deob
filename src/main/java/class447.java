import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class447 extends Callback {

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "Z")
    private volatile boolean field6336 = true;

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "I")
    private int field6335;

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "I")
    private volatile int field6337;

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "I")
    private volatile int field6338;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "Z")
    private boolean field6334;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(III)V", line = 4)
    public final void method2684(int arg0, int arg1, int arg2) {
        User32.SetCursorPos(arg2, arg0);
        if (arg1 >= -24) {
            this.callback(33, -5, -104, -119);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Ljava/awt/Component;IZ)V", line = 16)
    public final void method2685(Component arg0, int arg1, boolean arg2) {
        if (arg1 != 5496) {
            this.callback(75, 67, -91, -3);
        }
        WComponentPeer var4 = (WComponentPeer) arg0.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field6337 == var5 && arg2 == this.field6336) {
            return;
        }
        if (!this.field6334) {
            this.field6335 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field6334 = true;
        }
        if (this.field6337 != var5) {
            if (this.field6337 != 0) {
                this.field6336 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field6337, -4, this.field6338);
                }
            }
            synchronized (this) {
                this.field6337 = var5;
                this.field6338 = User32.SetWindowLong(this.field6337, -4, this);
            }
        }
        this.field6336 = arg2;
        User32.SendMessage(var5, 101024, 0, 0);
    }

    @OriginalMember(owner = "client!ifa", name = "callback", descriptor = "(IIII)I", line = 63)
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field6337 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field6336 ? this.field6335 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field6336 ? this.field6335 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field6337 = 0;
            this.field6336 = true;
        }
        return User32.CallWindowProc(this.field6338, arg0, arg1, arg2, arg3);
    }
}
