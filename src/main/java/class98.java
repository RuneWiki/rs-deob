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

@OriginalClass("client!nb")
public class class98 implements IEnumModesCallback {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field1374 = new DirectDraw();

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    private static int field1373;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "[I")
    private static int[] field1375;

    @OriginalMember(owner = "client!nb", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 3)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field1375 == null) {
            field1373 += 4;
        } else {
            field1375[field1373++] = arg0.width;
            field1375[field1373++] = arg0.height;
            field1375[field1373++] = arg0.rgbBitCount;
            field1375[field1373++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)[I", line = 19)
    public final int[] method666(int arg0) {
        this.field1374.enumDisplayModes(0, null, null, this);
        field1375 = new int[field1373];
        field1373 = 0;
        this.field1374.enumDisplayModes(0, null, null, this);
        int[] var2 = field1375;
        int var3 = -95 / ((-arg0 - 78) / 38);
        field1373 = 0;
        field1375 = null;
        return var2;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/awt/Frame;IIIII)V", line = 36)
    public final void method667(Frame arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg0.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field1374.setCooperativeLevel(arg0, 17);
        this.field1374.setDisplayMode(arg2, arg4, arg5, arg1, 0);
        arg0.setBounds(0, 0, arg2, arg4);
        arg0.toFront();
        if (arg3 < 1) {
            this.method667(null, -13, 120, -28, -76, 6);
        }
        arg0.requestFocus();
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/awt/Frame;)V", line = 57)
    public final void method668(int arg0, Frame arg1) {
        this.field1374.restoreDisplayMode();
        if (arg0 >= 1) {
            this.field1374.setCooperativeLevel(arg1, 8);
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V", line = 69)
    public class98() {
        this.field1374.initialize(null);
    }
}
