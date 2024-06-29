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

@OriginalClass("client!il")
public class class7 implements IEnumModesCallback {

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field110 = new DirectDraw();

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    private static int field109;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "[I")
    private static int[] field111;

    @OriginalMember(owner = "client!il", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field111 == null) {
            field109 += 4;
        } else {
            field111[field109++] = arg0.width;
            field111[field109++] = arg0.height;
            field111[field109++] = arg0.rgbBitCount;
            field111[field109++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILjava/awt/Frame;)V")
    public final void method45(int arg0, Frame arg1) {
        this.field110.restoreDisplayMode();
        this.field110.setCooperativeLevel(arg1, 8);
        int var3 = 98 % ((-arg0 - 29) / 55);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
    public class7() {
        this.field110.initialize(null);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BLjava/awt/Frame;IIII)V")
    public final void method46(byte arg0, Frame arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.setVisible(true);
        if (arg0 >= -90) {
            field111 = null;
        }
        WComponentPeer var7 = (WComponentPeer) arg1.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field110.setCooperativeLevel(arg1, 17);
        this.field110.setDisplayMode(arg5, arg2, arg4, arg3, 0);
        arg1.setBounds(0, 0, arg5, arg2);
        arg1.toFront();
        arg1.requestFocus();
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)[I")
    public final int[] method47(int arg0) {
        this.field110.enumDisplayModes(arg0, null, null, this);
        field111 = new int[field109];
        field109 = 0;
        this.field110.enumDisplayModes(0, null, null, this);
        int[] var2 = field111;
        field109 = 0;
        field111 = null;
        return var2;
    }
}
