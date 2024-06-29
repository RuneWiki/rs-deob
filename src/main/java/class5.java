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

@OriginalClass("client!dc")
public class class5 implements IEnumModesCallback {

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field56 = new DirectDraw();

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    private static int field55;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "[I")
    private static int[] field54;

    @OriginalMember(owner = "client!dc", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field54 == null) {
            field55 += 4;
        } else {
            field54[field55++] = arg0.width;
            field54[field55++] = arg0.height;
            field54[field55++] = arg0.rgbBitCount;
            field54[field55++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
    public final void method33(Frame arg0, int arg1) {
        this.field56.restoreDisplayMode();
        this.field56.setCooperativeLevel(arg0, 8);
        if (arg1 != 0) {
            this.method33(null, -62);
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class5() {
        this.field56.initialize(null);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)[I")
    public final int[] method34(int arg0) {
        this.field56.enumDisplayModes(arg0, null, null, this);
        field54 = new int[field55];
        field55 = 0;
        this.field56.enumDisplayModes(0, null, null, this);
        int[] var2 = field54;
        field54 = null;
        field55 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Frame;IBIII)V")
    public final void method35(Frame arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        arg0.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg0.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field56.setCooperativeLevel(arg0, 17);
        this.field56.setDisplayMode(arg1, arg3, arg5, arg4, 0);
        arg0.setBounds(0, 0, arg1, arg3);
        arg0.toFront();
        arg0.requestFocus();
        int var9 = -17 / ((-arg2 - 54) / 56);
    }
}
