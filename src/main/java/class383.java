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

@OriginalClass("client!du")
public class class383 implements IEnumModesCallback {

    @OriginalMember(owner = "client!du", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field4899 = new DirectDraw();

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    private static int field4900;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "[I")
    private static int[] field4901;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BLjava/awt/Frame;)V")
    public final void method2179(byte arg0, Frame arg1) {
        if (arg0 <= 36) {
            this.callbackEnumModes(null, null);
        }
        this.field4899.restoreDisplayMode();
        this.field4899.setCooperativeLevel(arg1, 8);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIIBLjava/awt/Frame;)V")
    public final void method2180(int arg0, int arg1, int arg2, int arg3, byte arg4, Frame arg5) {
        arg5.setVisible(true);
        if (arg4 > -87) {
            return;
        }
        WComponentPeer var7 = (WComponentPeer) arg5.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field4899.setCooperativeLevel(arg5, 17);
        this.field4899.setDisplayMode(arg0, arg3, arg1, arg2, 0);
        arg5.setBounds(0, 0, arg0, arg3);
        arg5.toFront();
        arg5.requestFocus();
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V")
    public class383() {
        this.field4899.initialize(null);
    }

    @OriginalMember(owner = "client!du", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field4901 == null) {
            field4900 += 4;
        } else {
            field4901[field4900++] = arg0.width;
            field4901[field4900++] = arg0.height;
            field4901[field4900++] = arg0.rgbBitCount;
            field4901[field4900++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)[I")
    public final int[] method2181(byte arg0) {
        this.field4899.enumDisplayModes(0, null, null, this);
        field4901 = new int[field4900];
        field4900 = 0;
        this.field4899.enumDisplayModes(0, null, null, this);
        if (arg0 != -77) {
            this.field4899 = null;
        }
        int[] var2 = field4901;
        field4901 = null;
        field4900 = 0;
        return var2;
    }
}
