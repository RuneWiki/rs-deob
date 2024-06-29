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

@OriginalClass("client!hca")
public class class189 implements IEnumModesCallback {

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field2366 = new DirectDraw();

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    private static int field2365;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "[I")
    private static int[] field2367;

    @OriginalMember(owner = "client!hca", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 4)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field2367 == null) {
            field2365 += 4;
        } else {
            field2367[field2365++] = arg0.width;
            field2367[field2365++] = arg0.height;
            field2367[field2365++] = arg0.rgbBitCount;
            field2367[field2365++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)[I", line = 21)
    public final int[] method1152(int arg0) {
        this.field2366.enumDisplayModes(0, null, null, this);
        field2367 = new int[field2365];
        field2365 = 0;
        this.field2366.enumDisplayModes(0, null, null, this);
        if (arg0 >= -109) {
            this.field2366 = null;
        }
        int[] var2 = field2367;
        field2367 = null;
        field2365 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ljava/awt/Frame;IZIII)V", line = 40)
    public final void method1153(Frame arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        arg0.setVisible(arg2);
        WComponentPeer var7 = (WComponentPeer) arg0.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field2366.setCooperativeLevel(arg0, 17);
        this.field2366.setDisplayMode(arg5, arg1, arg3, arg4, 0);
        arg0.setBounds(0, 0, arg5, arg1);
        arg0.toFront();
        arg0.requestFocus();
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ljava/awt/Frame;Z)V", line = 58)
    public final void method1154(Frame arg0, boolean arg1) {
        this.field2366.restoreDisplayMode();
        this.field2366.setCooperativeLevel(arg0, 8);
        if (arg1) {
            field2367 = null;
        }
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "()V", line = 68)
    public class189() {
        this.field2366.initialize(null);
    }
}
