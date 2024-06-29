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

@OriginalClass("client!oc")
public class class468 implements IEnumModesCallback {

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field6381 = new DirectDraw();

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    private static int field6379;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "[I")
    private static int[] field6380;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)[I")
    public final int[] method2735(byte arg0) {
        this.field6381.enumDisplayModes(0, null, null, this);
        field6380 = new int[field6379];
        field6379 = 0;
        this.field6381.enumDisplayModes(0, null, null, this);
        if (arg0 == 15) {
            int[] var2 = field6380;
            field6379 = 0;
            field6380 = null;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/awt/Frame;)V")
    public final void method2736(int arg0, Frame arg1) {
        this.field6381.restoreDisplayMode();
        if (arg0 >= 121) {
            this.field6381.setCooperativeLevel(arg1, 8);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIILjava/awt/Frame;I)V")
    public final void method2737(int arg0, int arg1, int arg2, int arg3, Frame arg4, int arg5) {
        arg4.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg4.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, arg0, 8);
        this.field6381.setCooperativeLevel(arg4, 17);
        this.field6381.setDisplayMode(arg2, arg1, arg5, arg3, 0);
        arg4.setBounds(0, 0, arg2, arg1);
        arg4.toFront();
        arg4.requestFocus();
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class468() {
        this.field6381.initialize(null);
    }

    @OriginalMember(owner = "client!oc", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field6380 == null) {
            field6379 += 4;
        } else {
            field6380[field6379++] = arg0.width;
            field6380[field6379++] = arg0.height;
            field6380[field6379++] = arg0.rgbBitCount;
            field6380[field6379++] = arg0.refreshRate;
        }
    }
}
