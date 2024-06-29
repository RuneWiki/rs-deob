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

@OriginalClass("client!lfa")
public class class668 implements IEnumModesCallback {

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field9423 = new DirectDraw();

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "I")
    private static int field9422;

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "[I")
    private static int[] field9424;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Ljava/awt/Frame;Z)V", line = 3)
    public final void method4810(Frame arg0, boolean arg1) {
        this.field9423.restoreDisplayMode();
        if (arg1) {
            this.method4811((byte) -111);
        }
        this.field9423.setCooperativeLevel(arg0, 8);
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)[I", line = 14)
    public final int[] method4811(byte arg0) {
        this.field9423.enumDisplayModes(0, null, null, this);
        field9424 = new int[field9422];
        int var2 = -89 % ((arg0 - 44) / 40);
        field9422 = 0;
        this.field9423.enumDisplayModes(0, null, null, this);
        int[] var3 = field9424;
        field9422 = 0;
        field9424 = null;
        return var3;
    }

    @OriginalMember(owner = "client!lfa", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 32)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field9424 == null) {
            field9422 += 4;
        } else {
            field9424[field9422++] = arg0.width;
            field9424[field9422++] = arg0.height;
            field9424[field9422++] = arg0.rgbBitCount;
            field9424[field9422++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "()V", line = 48)
    public class668() {
        this.field9423.initialize(null);
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIIILjava/awt/Frame;I)V", line = 58)
    public final void method4812(int arg0, int arg1, int arg2, int arg3, Frame arg4, int arg5) {
        arg4.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg4.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, arg1, 8);
        this.field9423.setCooperativeLevel(arg4, 17);
        this.field9423.setDisplayMode(arg2, arg3, arg5, arg0, 0);
        arg4.setBounds(0, 0, arg2, arg3);
        arg4.toFront();
        arg4.requestFocus();
    }
}
