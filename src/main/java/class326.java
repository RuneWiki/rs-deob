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

@OriginalClass("client!rq")
public class class326 implements IEnumModesCallback {

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field4070 = new DirectDraw();

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    private static int field4071;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "[I")
    private static int[] field4069;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIILjava/awt/Frame;II)V")
    public final void method1875(int arg0, int arg1, int arg2, Frame arg3, int arg4, int arg5) {
        arg3.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg3.getPeer();
        int var8 = -121 / ((10 - arg0) / 50);
        int var9 = var7.getHwnd();
        User32.SetWindowLong(var9, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var9, -20, 8);
        this.field4070.setCooperativeLevel(arg3, 17);
        this.field4070.setDisplayMode(arg2, arg5, arg4, arg1, 0);
        arg3.setBounds(0, 0, arg2, arg5);
        arg3.toFront();
        arg3.requestFocus();
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BLjava/awt/Frame;)V")
    public final void method1876(byte arg0, Frame arg1) {
        this.field4070.restoreDisplayMode();
        this.field4070.setCooperativeLevel(arg1, 8);
        if (arg0 != 126) {
            this.method1876((byte) 93, null);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)[I")
    public final int[] method1877(int arg0) {
        if (arg0 != 4) {
            return null;
        }
        this.field4070.enumDisplayModes(0, null, null, this);
        field4069 = new int[field4071];
        field4071 = 0;
        this.field4070.enumDisplayModes(0, null, null, this);
        int[] var2 = field4069;
        field4069 = null;
        field4071 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!rq", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field4069 == null) {
            field4071 += 4;
        } else {
            field4069[field4071++] = arg0.width;
            field4069[field4071++] = arg0.height;
            field4069[field4071++] = arg0.rgbBitCount;
            field4069[field4071++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
    public class326() {
        this.field4070.initialize(null);
    }
}
