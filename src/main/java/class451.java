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

@OriginalClass("client!qd")
public class class451 implements IEnumModesCallback {

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field5974 = new DirectDraw();

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    private static int field5973;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "[I")
    private static int[] field5975;

    @OriginalMember(owner = "client!qd", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 3)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field5975 == null) {
            field5973 += 4;
        } else {
            field5975[field5973++] = arg0.width;
            field5975[field5973++] = arg0.height;
            field5975[field5973++] = arg0.rgbBitCount;
            field5975[field5973++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)[I", line = 19)
    public final int[] method2536(int arg0) {
        this.field5974.enumDisplayModes(arg0, null, null, this);
        field5975 = new int[field5973];
        field5973 = 0;
        this.field5974.enumDisplayModes(0, null, null, this);
        int[] var2 = field5975;
        field5973 = 0;
        field5975 = null;
        return var2;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLjava/awt/Frame;)V", line = 36)
    public final void method2537(byte arg0, Frame arg1) {
        if (arg0 != -97) {
            this.callbackEnumModes(null, null);
        }
        this.field5974.restoreDisplayMode();
        this.field5974.setCooperativeLevel(arg1, 8);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V", line = 47)
    public class451() {
        this.field5974.initialize(null);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/awt/Frame;IIIB)V", line = 56)
    public final void method2538(int arg0, Frame arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 >= -12) {
            return;
        }
        arg1.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg1.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field5974.setCooperativeLevel(arg1, 17);
        this.field5974.setDisplayMode(arg0, arg2, arg4, arg3, 0);
        arg1.setBounds(0, 0, arg0, arg2);
        arg1.toFront();
        arg1.requestFocus();
    }
}
