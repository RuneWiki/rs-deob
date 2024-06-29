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

@OriginalClass("client!rk")
public class class35 implements IEnumModesCallback {

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field375 = new DirectDraw();

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    private static int field376;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "[I")
    private static int[] field377;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/awt/Frame;IIIII)V", line = 3)
    public final void method206(Frame arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg0.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, arg3, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field375.setCooperativeLevel(arg0, 17);
        this.field375.setDisplayMode(arg2, arg4, arg5, arg1, 0);
        arg0.setBounds(0, 0, arg2, arg4);
        arg0.toFront();
        arg0.requestFocus();
    }

    @OriginalMember(owner = "client!rk", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 21)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field377 == null) {
            field376 += 4;
        } else {
            field377[field376++] = arg0.width;
            field377[field376++] = arg0.height;
            field377[field376++] = arg0.rgbBitCount;
            field377[field376++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/awt/Frame;I)V", line = 37)
    public final void method207(Frame arg0, int arg1) {
        this.field375.restoreDisplayMode();
        this.field375.setCooperativeLevel(arg0, 8);
        int var3 = -39 / ((arg1 - 42) / 40);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)[I", line = 49)
    public final int[] method208(byte arg0) {
        this.field375.enumDisplayModes(0, null, null, this);
        field377 = new int[field376];
        field376 = 0;
        this.field375.enumDisplayModes(0, null, null, this);
        int[] var2 = field377;
        field377 = null;
        field376 = 0;
        return arg0 == 17 ? var2 : null;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 66)
    public class35() {
        this.field375.initialize(null);
    }
}
