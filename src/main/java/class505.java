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

@OriginalClass("client!cba")
public class class505 implements IEnumModesCallback {

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field6912 = new DirectDraw();

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "I")
    private static int field6911;

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "[I")
    private static int[] field6913;

    @OriginalMember(owner = "client!cba", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field6913 == null) {
            field6911 += 4;
        } else {
            field6913[field6911++] = arg0.width;
            field6913[field6911++] = arg0.height;
            field6913[field6911++] = arg0.rgbBitCount;
            field6913[field6911++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IILjava/awt/Frame;IBI)V")
    public final void method2815(int arg0, int arg1, Frame arg2, int arg3, byte arg4, int arg5) {
        arg2.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg2.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field6912.setCooperativeLevel(arg2, 17);
        this.field6912.setDisplayMode(arg5, arg1, arg3, arg0, 0);
        if (arg4 > 4) {
            arg2.setBounds(0, 0, arg5, arg1);
            arg2.toFront();
            arg2.requestFocus();
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)[I")
    public final int[] method2816(int arg0) {
        this.field6912.enumDisplayModes(0, null, null, this);
        field6913 = new int[field6911];
        field6911 = arg0;
        this.field6912.enumDisplayModes(0, null, null, this);
        int[] var2 = field6913;
        field6913 = null;
        field6911 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "()V")
    public class505() {
        this.field6912.initialize(null);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
    public final void method2817(Frame arg0, int arg1) {
        if (arg1 >= 90) {
            this.field6912.restoreDisplayMode();
            this.field6912.setCooperativeLevel(arg0, 8);
        }
    }
}
