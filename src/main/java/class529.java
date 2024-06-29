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

@OriginalClass("client!fd")
public class class529 implements IEnumModesCallback {

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field7013 = new DirectDraw();

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    private static int field7011;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "[I")
    private static int[] field7012;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)[I")
    public final int[] method2955(byte arg0) {
        this.field7013.enumDisplayModes(0, null, null, this);
        field7012 = new int[field7011];
        field7011 = 0;
        this.field7013.enumDisplayModes(0, null, null, this);
        int[] var2 = field7012;
        field7011 = 0;
        int var3 = -100 % ((arg0 + 68) / 41);
        field7012 = null;
        return var2;
    }

    @OriginalMember(owner = "client!fd", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field7012 == null) {
            field7011 += 4;
        } else {
            field7012[field7011++] = arg0.width;
            field7012[field7011++] = arg0.height;
            field7012[field7011++] = arg0.rgbBitCount;
            field7012[field7011++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
    public final void method2956(Frame arg0, byte arg1) {
        this.field7013.restoreDisplayMode();
        if (arg1 == 85) {
            this.field7013.setCooperativeLevel(arg0, 8);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Frame;IIIII)V")
    public final void method2957(Frame arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg0.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field7013.setCooperativeLevel(arg0, 17);
        this.field7013.setDisplayMode(arg4, arg3, arg1, arg2, arg5);
        arg0.setBounds(0, 0, arg4, arg3);
        arg0.toFront();
        arg0.requestFocus();
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class529() {
        this.field7013.initialize(null);
    }
}
