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

@OriginalClass("client!ow")
public class class346 implements IEnumModesCallback {

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field4481 = new DirectDraw();

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
    private static int field4479;

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "[I")
    private static int[] field4480;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Z)[I", line = 3)
    public final int[] method2059(boolean arg0) {
        this.field4481.enumDisplayModes(0, null, null, this);
        field4480 = new int[field4479];
        field4479 = 0;
        if (!arg0) {
            this.callbackEnumModes(null, null);
        }
        this.field4481.enumDisplayModes(0, null, null, this);
        int[] var2 = field4480;
        field4479 = 0;
        field4480 = null;
        return var2;
    }

    @OriginalMember(owner = "client!ow", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 21)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field4480 == null) {
            field4479 += 4;
        } else {
            field4480[field4479++] = arg0.width;
            field4480[field4479++] = arg0.height;
            field4480[field4479++] = arg0.rgbBitCount;
            field4480[field4479++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Ljava/awt/Frame;I)V", line = 37)
    public final void method2060(Frame arg0, int arg1) {
        this.field4481.restoreDisplayMode();
        this.field4481.setCooperativeLevel(arg0, arg1);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIILjava/awt/Frame;II)V", line = 46)
    public final void method2061(int arg0, int arg1, int arg2, Frame arg3, int arg4, int arg5) {
        arg3.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg3.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field4481.setCooperativeLevel(arg3, 17);
        this.field4481.setDisplayMode(arg5, arg2, arg1, arg4, 0);
        arg3.setBounds(0, 0, arg5, arg2);
        arg3.toFront();
        arg3.requestFocus();
        if (arg0 != 6130) {
            field4480 = null;
        }
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "()V", line = 68)
    public class346() {
        this.field4481.initialize(null);
    }
}
