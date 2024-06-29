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

@OriginalClass("client!am")
public class class549 implements IEnumModesCallback {

    @OriginalMember(owner = "client!am", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field7843 = new DirectDraw();

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    private static int field7842;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "[I")
    private static int[] field7841;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIILjava/awt/Frame;)V", line = 3)
    public final void method3188(int arg0, int arg1, int arg2, int arg3, int arg4, Frame arg5) {
        arg5.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg5.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        if (arg4 != 2957) {
            field7842 = 95;
        }
        User32.SetWindowLong(var8, -20, 8);
        this.field7843.setCooperativeLevel(arg5, 17);
        this.field7843.setDisplayMode(arg1, arg2, arg0, arg3, 0);
        arg5.setBounds(0, 0, arg1, arg2);
        arg5.toFront();
        arg5.requestFocus();
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)[I", line = 24)
    public final int[] method3189(int arg0) {
        this.field7843.enumDisplayModes(0, null, null, this);
        field7841 = new int[field7842];
        field7842 = 0;
        this.field7843.enumDisplayModes(arg0, null, null, this);
        int[] var2 = field7841;
        field7841 = null;
        field7842 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!am", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 42)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field7841 == null) {
            field7842 += 4;
        } else {
            field7841[field7842++] = arg0.width;
            field7841[field7842++] = arg0.height;
            field7841[field7842++] = arg0.rgbBitCount;
            field7841[field7842++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V", line = 57)
    public class549() {
        this.field7843.initialize(null);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/awt/Frame;)V", line = 66)
    public final void method3190(int arg0, Frame arg1) {
        this.field7843.restoreDisplayMode();
        if (arg0 == -5473) {
            this.field7843.setCooperativeLevel(arg1, 8);
        }
    }
}
