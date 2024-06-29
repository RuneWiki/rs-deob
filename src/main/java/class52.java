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

@OriginalClass("client!fw")
public class class52 implements IEnumModesCallback {

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field1200 = new DirectDraw();

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    private static int field1199;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "[I")
    private static int[] field1201;

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "()V")
    public class52() {
        this.field1200.initialize(null);
    }

    @OriginalMember(owner = "client!fw", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field1201 == null) {
            field1199 += 4;
        } else {
            field1201[field1199++] = arg0.width;
            field1201[field1199++] = arg0.height;
            field1201[field1199++] = arg0.rgbBitCount;
            field1201[field1199++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
    public final void method629(Frame arg0, byte arg1) {
        if (arg1 >= 5) {
            this.field1200.restoreDisplayMode();
            this.field1200.setCooperativeLevel(arg0, 8);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)[I")
    public final int[] method630(int arg0) {
        this.field1200.enumDisplayModes(0, null, null, this);
        field1201 = new int[field1199];
        field1199 = 0;
        this.field1200.enumDisplayModes(0, null, null, this);
        int[] var2 = field1201;
        field1199 = 0;
        field1201 = null;
        int var3 = 127 % ((arg0 + 56) / 35);
        return var2;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IILjava/awt/Frame;III)V")
    public final void method631(int arg0, int arg1, Frame arg2, int arg3, int arg4, int arg5) {
        arg2.setVisible(true);
        if (arg4 >= -22) {
            this.method629(null, (byte) -32);
        }
        WComponentPeer var7 = (WComponentPeer) arg2.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field1200.setCooperativeLevel(arg2, 17);
        this.field1200.setDisplayMode(arg3, arg1, arg5, arg0, 0);
        arg2.setBounds(0, 0, arg3, arg1);
        arg2.toFront();
        arg2.requestFocus();
    }
}
