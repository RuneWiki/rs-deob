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

@OriginalClass("client!wb")
public class class178 implements IEnumModesCallback {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field2501 = new DirectDraw();

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    private static int field2502;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "[I")
    private static int[] field2500;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BIIILjava/awt/Frame;I)V", line = 3)
    public final void method1201(byte arg0, int arg1, int arg2, int arg3, Frame arg4, int arg5) {
        arg4.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg4.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field2501.setCooperativeLevel(arg4, 17);
        this.field2501.setDisplayMode(arg5, arg3, arg2, arg1, 0);
        arg4.setBounds(0, 0, arg5, arg3);
        arg4.toFront();
        if (arg0 != -82) {
            field2500 = null;
        }
        arg4.requestFocus();
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)[I", line = 24)
    public final int[] method1202(boolean arg0) {
        this.field2501.enumDisplayModes(0, null, null, this);
        field2500 = new int[field2502];
        field2502 = 0;
        this.field2501.enumDisplayModes(0, null, null, this);
        if (!arg0) {
            field2500 = null;
        }
        int[] var2 = field2500;
        field2500 = null;
        field2502 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!wb", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 42)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field2500 == null) {
            field2502 += 4;
        } else {
            field2500[field2502++] = arg0.width;
            field2500[field2502++] = arg0.height;
            field2500[field2502++] = arg0.rgbBitCount;
            field2500[field2502++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/awt/Frame;)V", line = 58)
    public final void method1203(int arg0, Frame arg1) {
        if (arg0 != 5654) {
            field2502 = 30;
        }
        this.field2501.restoreDisplayMode();
        this.field2501.setCooperativeLevel(arg1, 8);
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V", line = 70)
    public class178() {
        this.field2501.initialize(null);
    }
}
