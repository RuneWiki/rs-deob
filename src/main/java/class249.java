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

@OriginalClass("client!lf")
public class class249 implements IEnumModesCallback {

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field3880 = new DirectDraw();

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    private static int field3878;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "[I")
    private static int[] field3879;

    @OriginalMember(owner = "client!lf", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field3879 == null) {
            field3878 += 4;
        } else {
            field3879[field3878++] = arg0.width;
            field3879[field3878++] = arg0.height;
            field3879[field3878++] = arg0.rgbBitCount;
            field3879[field3878++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
    public final void method2117(Frame arg0, int arg1) {
        this.field3880.restoreDisplayMode();
        this.field3880.setCooperativeLevel(arg0, 8);
        if (arg1 != 0) {
            this.field3880 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)[I")
    public final int[] method2118(byte arg0) {
        this.field3880.enumDisplayModes(0, null, null, this);
        field3879 = new int[field3878];
        field3878 = 0;
        this.field3880.enumDisplayModes(0, null, null, this);
        if (arg0 == 55) {
            int[] var2 = field3879;
            field3879 = null;
            field3878 = 0;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIILjava/awt/Frame;II)V")
    public final void method2119(byte arg0, int arg1, int arg2, Frame arg3, int arg4, int arg5) {
        arg3.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg3.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        int var9 = -45 % ((-arg0 - 10) / 63);
        this.field3880.setCooperativeLevel(arg3, 17);
        this.field3880.setDisplayMode(arg4, arg1, arg5, arg2, 0);
        arg3.setBounds(0, 0, arg4, arg1);
        arg3.toFront();
        arg3.requestFocus();
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class249() {
        this.field3880.initialize(null);
    }
}
