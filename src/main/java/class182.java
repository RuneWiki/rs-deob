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

@OriginalClass("client!be")
public class class182 implements IEnumModesCallback {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field2503 = new DirectDraw();

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    private static int field2504;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "[I")
    private static int[] field2505;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIILjava/awt/Frame;Z)V")
    public final void method1220(int arg0, int arg1, int arg2, int arg3, Frame arg4, boolean arg5) {
        if (arg5) {
            this.callbackEnumModes(null, null);
        }
        arg4.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg4.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field2503.setCooperativeLevel(arg4, 17);
        this.field2503.setDisplayMode(arg3, arg1, arg0, arg2, 0);
        arg4.setBounds(0, 0, arg3, arg1);
        arg4.toFront();
        arg4.requestFocus();
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class182() {
        this.field2503.initialize(null);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/Frame;Z)V")
    public final void method1221(Frame arg0, boolean arg1) {
        if (!arg1) {
            this.field2503.restoreDisplayMode();
            this.field2503.setCooperativeLevel(arg0, 8);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)[I")
    public final int[] method1222(int arg0) {
        this.field2503.enumDisplayModes(0, null, null, this);
        field2505 = new int[field2504];
        field2504 = 0;
        this.field2503.enumDisplayModes(0, null, null, this);
        int[] var2 = field2505;
        field2505 = null;
        field2504 = arg0;
        return var2;
    }

    @OriginalMember(owner = "client!be", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field2505 == null) {
            field2504 += 4;
        } else {
            field2505[field2504++] = arg0.width;
            field2505[field2504++] = arg0.height;
            field2505[field2504++] = arg0.rgbBitCount;
            field2505[field2504++] = arg0.refreshRate;
        }
    }
}
