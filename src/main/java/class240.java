import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class240 extends Callback {

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "Z")
    private volatile boolean field3134 = true;

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    private volatile int field3135;

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "I")
    private int field3136;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "I")
    private volatile int field3138;

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "Z")
    private boolean field3137;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(III)V")
    public final void method1446(int arg0, int arg1, int arg2) {
        int var4 = -90 % ((arg0 + 63) / 48);
        User32.SetCursorPos(arg2, arg1);
    }

    @OriginalMember(owner = "client!kea", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3135 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field3134 ? this.field3136 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field3134 ? this.field3136 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field3135 = 0;
            this.field3134 = true;
        }
        return User32.CallWindowProc(this.field3138, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZLjava/awt/Component;B)V")
    public final void method1447(boolean arg0, Component arg1, byte arg2) {
        WComponentPeer var4 = (WComponentPeer) arg1.getPeer();
        if (arg2 >= -65) {
            this.method1446(-61, -37, -29);
        }
        int var5 = var4.getTopHwnd();
        if (this.field3135 == var5 && this.field3134 == arg0) {
            return;
        }
        if (!this.field3137) {
            this.field3136 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field3137 = true;
        }
        if (this.field3135 != var5) {
            if (this.field3135 != 0) {
                this.field3134 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field3135, -4, this.field3138);
                }
            }
            synchronized (this) {
                this.field3135 = var5;
                this.field3138 = User32.SetWindowLong(this.field3135, -4, this);
            }
        }
        this.field3134 = arg0;
        User32.SendMessage(var5, 101024, 0, 0);
    }
}
