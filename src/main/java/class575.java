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

@OriginalClass("client!bha")
public class class575 implements IEnumModesCallback {

    @OriginalMember(owner = "client!bha", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field8086 = new DirectDraw();

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "I")
    private static int field8085;

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "[I")
    private static int[] field8084;

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(Z)[I")
    public final int[] method3227(boolean arg0) {
        if (arg0) {
            field8084 = null;
        }
        this.field8086.enumDisplayModes(0, null, null, this);
        field8084 = new int[field8085];
        field8085 = 0;
        this.field8086.enumDisplayModes(0, null, null, this);
        int[] var2 = field8084;
        field8085 = 0;
        field8084 = null;
        return var2;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(ILjava/awt/Frame;)V")
    public final void method3228(int arg0, Frame arg1) {
        this.field8086.restoreDisplayMode();
        this.field8086.setCooperativeLevel(arg1, 8);
        int var3 = -28 % ((arg0 - 36) / 32);
    }

    @OriginalMember(owner = "client!bha", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field8084 == null) {
            field8085 += 4;
        } else {
            field8084[field8085++] = arg0.width;
            field8084[field8085++] = arg0.height;
            field8084[field8085++] = arg0.rgbBitCount;
            field8084[field8085++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIIIILjava/awt/Frame;)V")
    public final void method3229(int arg0, int arg1, int arg2, int arg3, int arg4, Frame arg5) {
        arg5.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg5.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, arg1);
        User32.SetWindowLong(var8, -20, 8);
        this.field8086.setCooperativeLevel(arg5, 17);
        this.field8086.setDisplayMode(arg2, arg4, arg0, arg3, 0);
        arg5.setBounds(0, 0, arg2, arg4);
        arg5.toFront();
        arg5.requestFocus();
    }

    @OriginalMember(owner = "client!bha", name = "<init>", descriptor = "()V")
    public class575() {
        this.field8086.initialize(null);
    }
}
