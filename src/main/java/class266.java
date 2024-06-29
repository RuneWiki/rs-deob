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

@OriginalClass("client!sr")
public class class266 implements IEnumModesCallback {

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field3930 = new DirectDraw();

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    private static int field3931;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "[I")
    private static int[] field3932;

    @OriginalMember(owner = "client!sr", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 4)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field3932 == null) {
            field3931 += 4;
        } else {
            field3932[field3931++] = arg0.width;
            field3932[field3931++] = arg0.height;
            field3932[field3931++] = arg0.rgbBitCount;
            field3932[field3931++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)[I", line = 21)
    public final int[] method1740(int arg0) {
        this.field3930.enumDisplayModes(0, null, null, this);
        field3932 = new int[field3931];
        field3931 = 0;
        this.field3930.enumDisplayModes(0, null, null, this);
        int[] var2 = field3932;
        field3931 = 0;
        int var3 = 88 / ((arg0 - 78) / 41);
        field3932 = null;
        return var2;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V", line = 37)
    public class266() {
        this.field3930.initialize(null);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/awt/Frame;I)V", line = 47)
    public final void method1741(Frame arg0, int arg1) {
        if (arg1 <= -114) {
            this.field3930.restoreDisplayMode();
            this.field3930.setCooperativeLevel(arg0, 8);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILjava/awt/Frame;IIII)V", line = 58)
    public final void method1742(int arg0, Frame arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg1.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field3930.setCooperativeLevel(arg1, 17);
        this.field3930.setDisplayMode(arg4, arg0, arg2, arg3, 0);
        arg1.setBounds(0, arg5, arg4, arg0);
        arg1.toFront();
        arg1.requestFocus();
    }
}
