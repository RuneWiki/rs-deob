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

@OriginalClass("client!el")
public class class719 implements IEnumModesCallback {

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field10135 = new DirectDraw();

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    private static int field10134;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "[I")
    private static int[] field10133;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILjava/awt/Frame;)V", line = 4)
    public final void method4037(int arg0, Frame arg1) {
        this.field10135.restoreDisplayMode();
        this.field10135.setCooperativeLevel(arg1, 8);
        int var3 = 3 / ((arg0 + 27) / 50);
    }

    @OriginalMember(owner = "client!el", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 14)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field10133 == null) {
            field10134 += 4;
        } else {
            field10133[field10134++] = arg0.width;
            field10133[field10134++] = arg0.height;
            field10133[field10134++] = arg0.rgbBitCount;
            field10133[field10134++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIILjava/awt/Frame;I)V", line = 31)
    public final void method4038(int arg0, int arg1, int arg2, int arg3, Frame arg4, int arg5) {
        arg4.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg4.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field10135.setCooperativeLevel(arg4, 17);
        this.field10135.setDisplayMode(arg1, arg5, arg3, arg2, 0);
        arg4.setBounds(0, arg0, arg1, arg5);
        arg4.toFront();
        arg4.requestFocus();
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)[I", line = 50)
    public final int[] method4039(byte arg0) {
        this.field10135.enumDisplayModes(0, null, null, this);
        field10133 = new int[field10134];
        field10134 = 0;
        this.field10135.enumDisplayModes(0, null, null, this);
        int[] var2 = field10133;
        int var3 = 75 / ((62 - arg0) / 59);
        field10133 = null;
        field10134 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V", line = 66)
    public class719() {
        this.field10135.initialize(null);
    }
}
