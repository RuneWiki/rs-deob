import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class125 extends Callback {

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "Z")
    private volatile boolean field1550 = true;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "I")
    private volatile int field1548;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    private volatile int field1549;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "Z")
    private boolean field1551;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)V")
    public final void method770(int arg0, int arg1, int arg2) {
        if (arg1 != 13212) {
            this.callback(51, -63, 11, -109);
        }
        User32.SetCursorPos(arg0, arg2);
    }

    @OriginalMember(owner = "client!mr", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1549 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field1550 ? this.field1552 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field1550 ? this.field1552 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field1549 = 0;
            this.field1550 = true;
        }
        return User32.CallWindowProc(this.field1548, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLjava/awt/Component;Z)V")
    public final void method771(byte arg0, Component arg1, boolean arg2) {
        WComponentPeer var4 = (WComponentPeer) arg1.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field1549 == var5 && arg2 == this.field1550) {
            return;
        }
        if (!this.field1551) {
            this.field1552 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field1551 = true;
        }
        if (this.field1549 != var5) {
            if (this.field1549 != 0) {
                this.field1550 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field1549, -4, this.field1548);
                }
            }
            synchronized (this) {
                this.field1549 = var5;
                this.field1548 = User32.SetWindowLong(this.field1549, -4, this);
            }
        }
        this.field1550 = arg2;
        if (arg0 != -11) {
            this.field1552 = -11;
        }
        User32.SendMessage(var5, 101024, 0, 0);
    }
}
