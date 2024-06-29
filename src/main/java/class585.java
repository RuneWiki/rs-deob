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

@OriginalClass("client!eba")
public class class585 implements IEnumModesCallback {

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field8243 = new DirectDraw();

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
    private static int field8245;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "[I")
    private static int[] field8244;

    @OriginalMember(owner = "client!eba", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field8244 == null) {
            field8245 += 4;
        } else {
            field8244[field8245++] = arg0.width;
            field8244[field8245++] = arg0.height;
            field8244[field8245++] = arg0.rgbBitCount;
            field8244[field8245++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "()V")
    public class585() {
        this.field8243.initialize(null);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIIIILjava/awt/Frame;)V")
    public final void method3377(int arg0, int arg1, int arg2, int arg3, int arg4, Frame arg5) {
        arg5.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg5.getPeer();
        int var8 = var7.getHwnd();
        if (arg1 != 4) {
            field8245 = 78;
        }
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field8243.setCooperativeLevel(arg5, 17);
        this.field8243.setDisplayMode(arg3, arg2, arg0, arg4, 0);
        arg5.setBounds(0, 0, arg3, arg2);
        arg5.toFront();
        arg5.requestFocus();
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
    public final void method3378(Frame arg0, int arg1) {
        this.field8243.restoreDisplayMode();
        this.field8243.setCooperativeLevel(arg0, arg1);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)[I")
    public final int[] method3379(int arg0) {
        this.field8243.enumDisplayModes(0, null, null, this);
        field8244 = new int[field8245];
        int var2 = 18 / ((54 - arg0) / 57);
        field8245 = 0;
        this.field8243.enumDisplayModes(0, null, null, this);
        int[] var3 = field8244;
        field8244 = null;
        field8245 = 0;
        return var3;
    }
}
