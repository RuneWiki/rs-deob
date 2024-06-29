import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class28 extends Callback {

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Z")
    private volatile boolean field933 = true;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    private volatile int field930;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    private volatile int field931;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    private int field932;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Z")
    private boolean field929;

    @OriginalMember(owner = "client!o", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field931 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field933 ? this.field932 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field933 ? this.field932 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field931 = 0;
            this.field933 = true;
        }
        return User32.CallWindowProc(this.field930, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V")
    public final void method493(int arg0, int arg1, int arg2) {
        User32.SetCursorPos(arg0, arg1);
        if (arg2 != 32512) {
            this.field932 = 83;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLjava/awt/Component;B)V")
    public final void method494(boolean arg0, Component arg1, byte arg2) {
        WComponentPeer var4 = (WComponentPeer) arg1.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field931 == var5 && this.field933 == arg0) {
            return;
        }
        if (!this.field929) {
            this.field932 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field929 = true;
        }
        if (this.field931 != var5) {
            if (this.field931 != 0) {
                this.field933 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field931, -4, this.field930);
                }
            }
            synchronized (this) {
                this.field931 = var5;
                this.field930 = User32.SetWindowLong(this.field931, -4, this);
            }
        }
        this.field933 = arg0;
        if (arg2 < 16) {
            this.field930 = 119;
        }
        User32.SendMessage(var5, 101024, 0, 0);
    }
}
