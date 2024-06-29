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

@OriginalClass("client!pi")
public class class524 implements IEnumModesCallback {

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field7423 = new DirectDraw();

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    private static int field7422;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "[I")
    private static int[] field7421;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILjava/awt/Frame;III)V", line = 3)
    public final void method3141(int arg0, int arg1, Frame arg2, int arg3, int arg4, int arg5) {
        arg2.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg2.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field7423.setCooperativeLevel(arg2, 17);
        if (arg4 != 28795) {
            this.field7423 = null;
        }
        this.field7423.setDisplayMode(arg3, arg0, arg1, arg5, 0);
        arg2.setBounds(0, 0, arg3, arg0);
        arg2.toFront();
        arg2.requestFocus();
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLjava/awt/Frame;)V", line = 24)
    public final void method3142(boolean arg0, Frame arg1) {
        if (!arg0) {
            this.field7423.restoreDisplayMode();
            this.field7423.setCooperativeLevel(arg1, 8);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)[I", line = 38)
    public final int[] method3143(int arg0) {
        if (arg0 >= -117) {
            return null;
        }
        this.field7423.enumDisplayModes(0, null, null, this);
        field7421 = new int[field7422];
        field7422 = 0;
        this.field7423.enumDisplayModes(0, null, null, this);
        int[] var2 = field7421;
        field7421 = null;
        field7422 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V", line = 55)
    public class524() {
        this.field7423.initialize(null);
    }

    @OriginalMember(owner = "client!pi", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 64)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field7421 == null) {
            field7422 += 4;
        } else {
            field7421[field7422++] = arg0.width;
            field7421[field7422++] = arg0.height;
            field7421[field7422++] = arg0.rgbBitCount;
            field7421[field7422++] = arg0.refreshRate;
        }
    }
}
