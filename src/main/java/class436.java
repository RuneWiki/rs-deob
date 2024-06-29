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

@OriginalClass("client!lg")
public class class436 implements IEnumModesCallback {

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field6830 = new DirectDraw();

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    private static int field6829;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "[I")
    private static int[] field6828;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
    public final void method3432(Frame arg0, byte arg1) {
        this.field6830.restoreDisplayMode();
        this.field6830.setCooperativeLevel(arg0, 8);
        if (arg1 <= 101) {
            this.method3432(null, (byte) 95);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIILjava/awt/Frame;I)V")
    public final void method3433(int arg0, int arg1, int arg2, int arg3, Frame arg4, int arg5) {
        arg4.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg4.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field6830.setCooperativeLevel(arg4, 17);
        this.field6830.setDisplayMode(arg3, arg1, arg5, arg2, 0);
        arg4.setBounds(0, 0, arg3, arg1);
        arg4.toFront();
        if (arg0 <= 9) {
            this.method3434((byte) 23);
        }
        arg4.requestFocus();
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)[I")
    public final int[] method3434(byte arg0) {
        if (arg0 < 68) {
            field6829 = 119;
        }
        this.field6830.enumDisplayModes(0, null, null, this);
        field6828 = new int[field6829];
        field6829 = 0;
        this.field6830.enumDisplayModes(0, null, null, this);
        int[] var2 = field6828;
        field6828 = null;
        field6829 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!lg", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field6828 == null) {
            field6829 += 4;
        } else {
            field6828[field6829++] = arg0.width;
            field6828[field6829++] = arg0.height;
            field6828[field6829++] = arg0.rgbBitCount;
            field6828[field6829++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    public class436() {
        this.field6830.initialize(null);
    }
}
