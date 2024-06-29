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

@OriginalClass("client!lea")
public class class66 implements IEnumModesCallback {

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field1048 = new DirectDraw();

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "I")
    private static int field1046;

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "[I")
    private static int[] field1047;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIZILjava/awt/Frame;I)V", line = 3)
    public final void method642(int arg0, int arg1, boolean arg2, int arg3, Frame arg4, int arg5) {
        arg4.setVisible(arg2);
        WComponentPeer var7 = (WComponentPeer) arg4.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field1048.setCooperativeLevel(arg4, 17);
        this.field1048.setDisplayMode(arg3, arg5, arg0, arg1, 0);
        arg4.setBounds(0, 0, arg3, arg5);
        arg4.toFront();
        arg4.requestFocus();
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)[I", line = 22)
    public final int[] method643(int arg0) {
        this.field1048.enumDisplayModes(0, null, null, this);
        field1047 = new int[field1046];
        field1046 = 0;
        this.field1048.enumDisplayModes(0, null, null, this);
        if (arg0 == 22900) {
            int[] var2 = field1047;
            field1047 = null;
            field1046 = 0;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 41)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field1047 == null) {
            field1046 += 4;
        } else {
            field1047[field1046++] = arg0.width;
            field1047[field1046++] = arg0.height;
            field1047[field1046++] = arg0.rgbBitCount;
            field1047[field1046++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILjava/awt/Frame;)V", line = 58)
    public final void method644(int arg0, Frame arg1) {
        this.field1048.restoreDisplayMode();
        this.field1048.setCooperativeLevel(arg1, 8);
        if (arg0 >= -122) {
            field1046 = 69;
        }
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "()V", line = 68)
    public class66() {
        this.field1048.initialize(null);
    }
}
