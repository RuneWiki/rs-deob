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

@OriginalClass("client!cw")
public class class513 implements IEnumModesCallback {

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field7348 = new DirectDraw();

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    private static int field7349;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "[I")
    private static int[] field7350;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)[I", line = 3)
    public final int[] method2935(int arg0) {
        this.field7348.enumDisplayModes(0, null, null, this);
        field7350 = new int[field7349];
        field7349 = 0;
        this.field7348.enumDisplayModes(0, null, null, this);
        if (arg0 != 8) {
            field7349 = 54;
        }
        int[] var2 = field7350;
        field7350 = null;
        field7349 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(BLjava/awt/Frame;)V", line = 22)
    public final void method2936(byte arg0, Frame arg1) {
        this.field7348.restoreDisplayMode();
        this.field7348.setCooperativeLevel(arg1, 8);
        if (arg0 >= -106) {
            field7350 = null;
        }
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "()V", line = 33)
    public class513() {
        this.field7348.initialize(null);
    }

    @OriginalMember(owner = "client!cw", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 43)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field7350 == null) {
            field7349 += 4;
        } else {
            field7350[field7349++] = arg0.width;
            field7350[field7349++] = arg0.height;
            field7350[field7349++] = arg0.rgbBitCount;
            field7350[field7349++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIILjava/awt/Frame;IB)V", line = 59)
    public final void method2937(int arg0, int arg1, int arg2, Frame arg3, int arg4, byte arg5) {
        arg3.setVisible(true);
        if (arg5 < 38) {
            return;
        }
        WComponentPeer var7 = (WComponentPeer) arg3.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field7348.setCooperativeLevel(arg3, 17);
        this.field7348.setDisplayMode(arg2, arg4, arg0, arg1, 0);
        arg3.setBounds(0, 0, arg2, arg4);
        arg3.toFront();
        arg3.requestFocus();
    }
}
