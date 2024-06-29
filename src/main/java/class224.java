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

@OriginalClass("client!nt")
public class class224 implements IEnumModesCallback {

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field3198 = new DirectDraw();

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    private static int field3199;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "[I")
    private static int[] field3197;

    @OriginalMember(owner = "client!nt", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field3197 == null) {
            field3199 += 4;
        } else {
            field3197[field3199++] = arg0.width;
            field3197[field3199++] = arg0.height;
            field3197[field3199++] = arg0.rgbBitCount;
            field3197[field3199++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)[I")
    public final int[] method1581(boolean arg0) {
        this.field3198.enumDisplayModes(0, null, null, this);
        field3197 = new int[field3199];
        field3199 = 0;
        this.field3198.enumDisplayModes(0, null, null, this);
        if (!arg0) {
            field3199 = 52;
        }
        int[] var2 = field3197;
        field3197 = null;
        field3199 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIILjava/awt/Frame;)V")
    public final void method1582(int arg0, int arg1, int arg2, int arg3, int arg4, Frame arg5) {
        arg5.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg5.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field3198.setCooperativeLevel(arg5, 17);
        this.field3198.setDisplayMode(arg2, arg0, arg1, arg4, 0);
        arg5.setBounds(0, 0, arg2, arg0);
        arg5.toFront();
        arg5.requestFocus();
        int var9 = -104 / ((32 - arg3) / 39);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
    public final void method1583(Frame arg0, int arg1) {
        this.field3198.restoreDisplayMode();
        this.field3198.setCooperativeLevel(arg0, arg1);
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V")
    public class224() {
        this.field3198.initialize(null);
    }
}
