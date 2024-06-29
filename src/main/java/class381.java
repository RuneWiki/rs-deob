import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class381 extends Callback {

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "Z")
    private volatile boolean field5322 = true;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "I")
    private volatile int field5321;

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "I")
    private volatile int field5323;

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "I")
    private int field5324;

    @OriginalMember(owner = "client!qha", name = "e", descriptor = "Z")
    private boolean field5325;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(ZZLjava/awt/Component;)V")
    public final void method2298(boolean arg0, boolean arg1, Component arg2) {
        WComponentPeer var4 = (WComponentPeer) arg2.getPeer();
        int var5 = var4.getTopHwnd();
        if (this.field5321 == var5 && this.field5322 == arg1) {
            return;
        }
        if (!this.field5325) {
            this.field5324 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field5325 = true;
        }
        if (this.field5321 != var5) {
            if (this.field5321 != 0) {
                this.field5322 = true;
                User32.SendMessage(var5, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.field5321, -4, this.field5323);
                }
            }
            synchronized (this) {
                this.field5321 = var5;
                this.field5323 = User32.SetWindowLong(this.field5321, -4, this);
            }
        }
        this.field5322 = arg1;
        User32.SendMessage(var5, 101024, 0, 0);
        if (arg0) {
            this.callback(-90, -89, -112, 122);
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(III)V")
    public final void method2299(int arg0, int arg1, int arg2) {
        User32.SetCursorPos(arg2, arg0);
        if (arg1 != 0) {
            this.field5323 = -123;
        }
    }

    @OriginalMember(owner = "client!qha", name = "callback", descriptor = "(IIII)I")
    public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5321 != arg0) {
            int var5 = User32.GetWindowLong(arg0, -4);
            return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32) {
            int var6 = arg3 & 0xFFFF;
            if (var6 == 1) {
                User32.SetCursor(this.field5322 ? this.field5324 : 0);
                return 0;
            }
        }
        if (arg1 == 101024) {
            User32.SetCursor(this.field5322 ? this.field5324 : 0);
            return 0;
        }
        if (arg1 == 1) {
            this.field5321 = 0;
            this.field5322 = true;
        }
        return User32.CallWindowProc(this.field5323, arg0, arg1, arg2, arg3);
    }
}
