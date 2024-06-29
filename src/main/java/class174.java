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

@OriginalClass("client!hga")
public class class174 implements IEnumModesCallback {

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field2690 = new DirectDraw();

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "I")
    private static int field2689;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "[I")
    private static int[] field2688;

    @OriginalMember(owner = "client!hga", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field2688 == null) {
            field2689 += 4;
        } else {
            field2688[field2689++] = arg0.width;
            field2688[field2689++] = arg0.height;
            field2688[field2689++] = arg0.rgbBitCount;
            field2688[field2689++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
    public final void method1238(Frame arg0, byte arg1) {
        this.field2690.restoreDisplayMode();
        this.field2690.setCooperativeLevel(arg0, 8);
        if (arg1 > -17) {
            this.field2690 = null;
        }
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "()V")
    public class174() {
        this.field2690.initialize(null);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IILjava/awt/Frame;IZI)V")
    public final void method1239(int arg0, int arg1, Frame arg2, int arg3, boolean arg4, int arg5) {
        arg2.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg2.getPeer();
        if (arg4) {
            this.field2690 = null;
        }
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field2690.setCooperativeLevel(arg2, 17);
        this.field2690.setDisplayMode(arg1, arg3, arg5, arg0, 0);
        arg2.setBounds(0, 0, arg1, arg3);
        arg2.toFront();
        arg2.requestFocus();
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)[I")
    public final int[] method1240(byte arg0) {
        this.field2690.enumDisplayModes(0, null, null, this);
        if (arg0 < 120) {
            this.field2690 = null;
        }
        field2688 = new int[field2689];
        field2689 = 0;
        this.field2690.enumDisplayModes(0, null, null, this);
        int[] var2 = field2688;
        field2688 = null;
        field2689 = 0;
        return var2;
    }
}
