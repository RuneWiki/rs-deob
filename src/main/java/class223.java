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

@OriginalClass("client!ig")
public class class223 implements IEnumModesCallback {

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field3602 = new DirectDraw();

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    private static int field3600;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "[I")
    private static int[] field3601;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)[I", line = 3)
    public final int[] method1642(byte arg0) {
        this.field3602.enumDisplayModes(0, null, null, this);
        field3601 = new int[field3600];
        int var2 = -118 / ((73 - arg0) / 48);
        field3600 = 0;
        this.field3602.enumDisplayModes(0, null, null, this);
        int[] var3 = field3601;
        field3601 = null;
        field3600 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 20)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field3601 == null) {
            field3600 += 4;
        } else {
            field3601[field3600++] = arg0.width;
            field3601[field3600++] = arg0.height;
            field3601[field3600++] = arg0.rgbBitCount;
            field3601[field3600++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/awt/Frame;I)V", line = 36)
    public final void method1643(Frame arg0, int arg1) {
        this.field3602.restoreDisplayMode();
        if (arg1 <= -23) {
            this.field3602.setCooperativeLevel(arg0, 8);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILjava/awt/Frame;IBII)V", line = 49)
    public final void method1644(int arg0, Frame arg1, int arg2, byte arg3, int arg4, int arg5) {
        arg1.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg1.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field3602.setCooperativeLevel(arg1, 17);
        int var9 = 7 / ((arg3 - 5) / 44);
        this.field3602.setDisplayMode(arg2, arg4, arg0, arg5, 0);
        arg1.setBounds(0, 0, arg2, arg4);
        arg1.toFront();
        arg1.requestFocus();
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 69)
    public class223() {
        this.field3602.initialize(null);
    }
}
