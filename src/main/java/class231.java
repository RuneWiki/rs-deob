import com.ms.awt.WComponentPeer;
import com.ms.com.IUnknown;
import com.ms.com._Guid;
import com.ms.directX.DDSurfaceDesc;
import com.ms.directX.DirectDraw;
import com.ms.directX.IEnumModesCallback;
import com.ms.win32.User32;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class231 implements IEnumModesCallback {

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field3020 = new DirectDraw();

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    private static int field3018;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "[I")
    private static int[] field3019;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILjava/awt/Frame;IIII)V", line = 3)
    public final void method1425(int arg0, Frame arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg1.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field3020.setCooperativeLevel(arg1, 17);
        this.field3020.setDisplayMode(arg0, arg5, arg4, arg2, 0);
        arg1.setBounds(0, 0, arg0, arg5);
        arg1.toFront();
        arg1.requestFocus();
        if (arg3 != 21582) {
            this.method1427(true);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/awt/Frame;I)V", line = 24)
    public final void method1426(Frame arg0, int arg1) {
        this.field3020.restoreDisplayMode();
        if (arg1 != -27740) {
            this.method1425(56, null, -93, 108, -93, -21);
        }
        this.field3020.setCooperativeLevel(arg0, 8);
    }

    @OriginalMember(owner = "client!rs", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 36)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field3019 == null) {
            field3018 += 4;
        } else {
            field3019[field3018++] = arg0.width;
            field3019[field3018++] = arg0.height;
            field3019[field3018++] = arg0.rgbBitCount;
            field3019[field3018++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V", line = 53)
    public class231() {
        this.field3020.initialize(null);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)[I", line = 62)
    public final int[] method1427(boolean arg0) {
        this.field3020.enumDisplayModes(0, null, null, this);
        field3019 = new int[field3018];
        field3018 = 0;
        this.field3020.enumDisplayModes(0, null, null, this);
        int[] var2 = field3019;
        field3019 = null;
        field3018 = 0;
        if (arg0) {
            this.callbackEnumModes(null, null);
        }
        return var2;
    }
}
