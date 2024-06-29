import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class447 extends Callback {

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "Z")
    private volatile boolean field6118 = true;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
    private volatile int field6117;

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
    private int field6119;

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "I")
    private volatile int field6121;

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "Z")
    private boolean field6120;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILjava/awt/Component;Z)V", line = 5)
    public final void method2518(int arg0, Component arg1, boolean arg2) {
        WComponentPeer var4 = (WComponentPeer) arg1.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field6121 == var5 && arg2 == this.field6118) {
            return;
        }
        if (!this.field6120) {
            this.field6119 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field6120 = true;
        }
        if (this.field6121 != var5) {
            if (this.field6121 != 0) {
                this.field6118 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field6121, -4, this.field6117);
                }
            }
            synchronized (this) {
                this.field6121 = var5;
                this.field6117 = User32.SetWindowLong(this.field6121, -4, this);
            }
        }
        if (arg0 != 16489) {
            this.field6119 = 91;
        }
        this.field6118 = arg2;
        User32.SendMessage(var5, 101024, 0, 0);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IZI)V", line = 49)
    public final void method2519(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            User32.SetCursorPos(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!iea", name = "callback", descriptor = "(IIII)I", line = 61)
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field6121 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field6118 ? this.field6119 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field6118 ? this.field6119 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field6121 = 0;
            this.field6118 = true;
        }
        return User32.CallWindowProc(this.field6117, arg0, arg1, arg2, arg3);
    }
}
