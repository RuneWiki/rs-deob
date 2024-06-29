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

@OriginalClass("client!dr")
public class class560 implements IEnumModesCallback {

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field8172 = new DirectDraw();

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    private static int field8173;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "[I")
    private static int[] field8171;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
    public final void method3277(Frame arg0, byte arg1) {
        if (arg1 >= -44) {
            this.field8172 = null;
        }
        this.field8172.restoreDisplayMode();
        this.field8172.setCooperativeLevel(arg0, 8);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)[I")
    public final int[] method3278(int arg0) {
        this.field8172.enumDisplayModes(0, null, null, this);
        if (arg0 < 20) {
            this.method3278(17);
        }
        field8171 = new int[field8173];
        field8173 = 0;
        this.field8172.enumDisplayModes(0, null, null, this);
        int[] var2 = field8171;
        field8173 = 0;
        field8171 = null;
        return var2;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILjava/awt/Frame;III)V")
    public final void method3279(int arg0, int arg1, Frame arg2, int arg3, int arg4, int arg5) {
        arg2.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg2.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field8172.setCooperativeLevel(arg2, 17);
        this.field8172.setDisplayMode(arg0, arg1, arg3, arg5, 0);
        arg2.setBounds(arg4, 0, arg0, arg1);
        arg2.toFront();
        arg2.requestFocus();
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V")
    public class560() {
        this.field8172.initialize(null);
    }

    @OriginalMember(owner = "client!dr", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field8171 == null) {
            field8173 += 4;
        } else {
            field8171[field8173++] = arg0.width;
            field8171[field8173++] = arg0.height;
            field8171[field8173++] = arg0.rgbBitCount;
            field8171[field8173++] = arg0.refreshRate;
        }
    }
}
