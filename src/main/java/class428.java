import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class428 extends Callback {

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "Z")
    private volatile boolean field6156 = true;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    private volatile int field6153;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    private int field6154;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    private volatile int field6157;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "Z")
    private boolean field6155;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILjava/awt/Component;Z)V")
    public final void method3306(int arg0, Component arg1, boolean arg2) {
        WComponentPeer var4 = (WComponentPeer) arg1.getPeer();
        if (arg0 != -2) {
            return;
        }
        int var5 = var4.getTopHwnd();
        if (this.field6157 == var5 && this.field6156 == arg2) {
            return;
        }
        if (!this.field6155) {
            this.field6154 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field6155 = true;
        }
        if (this.field6157 != var5) {
            if (this.field6157 != 0) {
                this.field6156 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field6157, -4, this.field6153);
                }
            }
            synchronized (this) {
                this.field6157 = var5;
                this.field6153 = User32.SetWindowLong(this.field6157, -4, this);
            }
        }
        this.field6156 = arg2;
        User32.SendMessage(var5, 101024, 0, 0);
    }

    @OriginalMember(owner = "client!nr", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field6157 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field6156 ? this.field6154 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field6156 ? this.field6154 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field6157 = 0;
            this.field6156 = true;
        }
        return User32.CallWindowProc(this.field6153, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIB)V")
    public final void method3307(int arg0, int arg1, byte arg2) {
        User32.SetCursorPos(arg1, arg0);
        int var4 = 66 % ((arg2 - 22) / 46);
    }
}
