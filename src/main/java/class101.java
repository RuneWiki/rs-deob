import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class101 extends Callback {

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "Z")
    private volatile boolean field1423 = true;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
    private volatile int field1419;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "I")
    private volatile int field1420;

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "Z")
    private boolean field1421;

    @OriginalMember(owner = "client!qca", name = "callback", descriptor = "(IIII)I", line = 4)
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1420 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field1423 ? this.field1422 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field1423 ? this.field1422 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field1420 = 0;
            this.field1423 = true;
        }
        return User32.CallWindowProc(this.field1419, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ljava/awt/Component;ZI)V", line = 47)
    public final void method737(Component arg0, boolean arg1, int arg2) {
        WComponentPeer var4 = (WComponentPeer) arg0.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field1420 == var5 && this.field1423 == arg1) {
            return;
        }
        if (!this.field1421) {
            this.field1422 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field1421 = true;
        }
        if (this.field1420 != var5) {
            if (this.field1420 != 0) {
                this.field1423 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field1420, -4, this.field1419);
                }
            }
            synchronized (this) {
                this.field1420 = var5;
                this.field1419 = User32.SetWindowLong(this.field1420, -4, this);
            }
        }
        if (arg2 != -13527) {
            this.field1419 = 48;
        }
        this.field1423 = arg1;
        User32.SendMessage(var5, 101024, 0, 0);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IBI)V", line = 95)
    public final void method738(int arg0, byte arg1, int arg2) {
        User32.SetCursorPos(arg0, arg2);
        int var4 = 33 / ((arg1 + 54) / 51);
    }
}
