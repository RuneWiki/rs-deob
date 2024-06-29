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

@OriginalClass("client!lga")
public class class19 implements IEnumModesCallback {

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field254 = new DirectDraw();

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "I")
    private static int field253;

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "[I")
    private static int[] field255;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILjava/awt/Frame;)V")
    public final void method215(int arg0, Frame arg1) {
        if (arg0 == -14820) {
            this.field254.restoreDisplayMode();
            this.field254.setCooperativeLevel(arg1, 8);
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)[I")
    public final int[] method216(int arg0) {
        if (arg0 != 17) {
            this.method217(109, null, true, -5, 13, -92);
        }
        this.field254.enumDisplayModes(0, null, null, this);
        field255 = new int[field253];
        field253 = 0;
        this.field254.enumDisplayModes(0, null, null, this);
        int[] var2 = field255;
        field255 = null;
        field253 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "()V")
    public class19() {
        this.field254.initialize(null);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILjava/awt/Frame;ZIII)V")
    public final void method217(int arg0, Frame arg1, boolean arg2, int arg3, int arg4, int arg5) {
        arg1.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg1.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field254.setCooperativeLevel(arg1, 17);
        this.field254.setDisplayMode(arg3, arg0, arg4, arg5, 0);
        arg1.setBounds(0, 0, arg3, arg0);
        arg1.toFront();
        if (arg2) {
            this.method216(35);
        }
        arg1.requestFocus();
    }

    @OriginalMember(owner = "client!lga", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field255 == null) {
            field253 += 4;
        } else {
            field255[field253++] = arg0.width;
            field255[field253++] = arg0.height;
            field255[field253++] = arg0.rgbBitCount;
            field255[field253++] = arg0.refreshRate;
        }
    }
}
