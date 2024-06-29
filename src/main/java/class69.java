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

@OriginalClass("client!qn")
public class class69 implements IEnumModesCallback {

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field826 = new DirectDraw();

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    private static int field827;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "[I")
    private static int[] field828;

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V")
    public class69() {
        this.field826.initialize(null);
    }

    @OriginalMember(owner = "client!qn", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field828 == null) {
            field827 += 4;
        } else {
            field828[field827++] = arg0.width;
            field828[field827++] = arg0.height;
            field828[field827++] = arg0.rgbBitCount;
            field828[field827++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLjava/awt/Frame;)V")
    public final void method577(byte arg0, Frame arg1) {
        if (arg0 == 20) {
            this.field826.restoreDisplayMode();
            this.field826.setCooperativeLevel(arg1, 8);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)[I")
    public final int[] method578(int arg0) {
        this.field826.enumDisplayModes(0, null, null, this);
        field828 = new int[field827];
        field827 = 0;
        int var2 = 10 % ((arg0 + 77) / 33);
        this.field826.enumDisplayModes(0, null, null, this);
        int[] var3 = field828;
        field827 = 0;
        field828 = null;
        return var3;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIILjava/awt/Frame;I)V")
    public final void method579(int arg0, int arg1, int arg2, int arg3, Frame arg4, int arg5) {
        arg4.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg4.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field826.setCooperativeLevel(arg4, 17);
        this.field826.setDisplayMode(arg3, arg0, arg5, arg1, 0);
        arg4.setBounds(arg2, 0, arg3, arg0);
        arg4.toFront();
        arg4.requestFocus();
    }
}
