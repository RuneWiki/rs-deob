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

@OriginalClass("client!br")
public class class365 implements IEnumModesCallback {

    @OriginalMember(owner = "client!br", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field4945 = new DirectDraw();

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    private static int field4944;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "[I")
    private static int[] field4946;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIILjava/awt/Frame;)V")
    public final void method2154(int arg0, int arg1, int arg2, int arg3, int arg4, Frame arg5) {
        arg5.setVisible(true);
        if (arg2 > -107) {
            this.field4945 = null;
        }
        WComponentPeer var7 = (WComponentPeer) arg5.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field4945.setCooperativeLevel(arg5, 17);
        this.field4945.setDisplayMode(arg0, arg3, arg1, arg4, 0);
        arg5.setBounds(0, 0, arg0, arg3);
        arg5.toFront();
        arg5.requestFocus();
    }

    @OriginalMember(owner = "client!br", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field4946 == null) {
            field4944 += 4;
        } else {
            field4946[field4944++] = arg0.width;
            field4946[field4944++] = arg0.height;
            field4946[field4944++] = arg0.rgbBitCount;
            field4946[field4944++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ZLjava/awt/Frame;)V")
    public final void method2155(boolean arg0, Frame arg1) {
        if (!arg0) {
            this.field4945.restoreDisplayMode();
            this.field4945.setCooperativeLevel(arg1, 8);
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
    public class365() {
        this.field4945.initialize(null);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)[I")
    public final int[] method2156(boolean arg0) {
        this.field4945.enumDisplayModes(0, null, null, this);
        field4946 = new int[field4944];
        field4944 = 0;
        this.field4945.enumDisplayModes(0, null, null, this);
        if (arg0) {
            int[] var2 = field4946;
            field4944 = 0;
            field4946 = null;
            return var2;
        } else {
            return null;
        }
    }
}
