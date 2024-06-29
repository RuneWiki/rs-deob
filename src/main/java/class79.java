import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class79 extends Callback {

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "Z")
    private volatile boolean field1082 = true;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
    private volatile int field1080;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "I")
    private volatile int field1081;

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "I")
    private int field1084;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "Z")
    private boolean field1083;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(ZLjava/awt/Component;Z)V", line = 4)
    public final void method717(boolean arg0, Component arg1, boolean arg2) {
        if (!arg0) {
            return;
        }
        WComponentPeer var4 = (WComponentPeer) arg1.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field1080 == var5 && arg2 == this.field1082) {
            return;
        }
        if (!this.field1083) {
            this.field1084 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field1083 = true;
        }
        if (this.field1080 != var5) {
            if (this.field1080 != 0) {
                this.field1082 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field1080, -4, this.field1081);
                }
            }
            synchronized (this) {
                this.field1080 = var5;
                this.field1081 = User32.SetWindowLong(this.field1080, -4, this);
            }
        }
        this.field1082 = arg2;
        User32.SendMessage(var5, 101024, 0, 0);
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIB)V", line = 49)
    public final void method718(int arg0, int arg1, byte arg2) {
        User32.SetCursorPos(arg1, arg0);
        if (arg2 != -108) {
            this.method718(104, 99, (byte) -110);
        }
    }

    @OriginalMember(owner = "client!naa", name = "callback", descriptor = "(IIII)I", line = 67)
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1080 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field1082 ? this.field1084 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field1082 ? this.field1084 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field1080 = 0;
            this.field1082 = true;
        }
        return User32.CallWindowProc(this.field1081, arg0, arg1, arg2, arg3);
    }
}
