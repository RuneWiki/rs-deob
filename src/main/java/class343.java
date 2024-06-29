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

@OriginalClass("client!saa")
public class class343 implements IEnumModesCallback {

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field5071 = new DirectDraw();

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "I")
    private static int field5070;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "[I")
    private static int[] field5069;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
    public final void method2189(Frame arg0, byte arg1) {
        this.field5071.restoreDisplayMode();
        if (arg1 < 87) {
            field5070 = 36;
        }
        this.field5071.setCooperativeLevel(arg0, 8);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Z)[I")
    public final int[] method2190(boolean arg0) {
        this.field5071.enumDisplayModes(0, null, null, this);
        field5069 = new int[field5070];
        field5070 = 0;
        if (arg0) {
            return null;
        }
        this.field5071.enumDisplayModes(0, null, null, this);
        int[] var2 = field5069;
        field5069 = null;
        field5070 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(BILjava/awt/Frame;III)V")
    public final void method2191(byte arg0, int arg1, Frame arg2, int arg3, int arg4, int arg5) {
        arg2.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg2.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field5071.setCooperativeLevel(arg2, 17);
        this.field5071.setDisplayMode(arg3, arg5, arg1, arg4, 0);
        if (arg0 != 87) {
            this.method2189(null, (byte) 97);
        }
        arg2.setBounds(0, 0, arg3, arg5);
        arg2.toFront();
        arg2.requestFocus();
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "()V")
    public class343() {
        this.field5071.initialize(null);
    }

    @OriginalMember(owner = "client!saa", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field5069 == null) {
            field5070 += 4;
        } else {
            field5069[field5070++] = arg0.width;
            field5069[field5070++] = arg0.height;
            field5069[field5070++] = arg0.rgbBitCount;
            field5069[field5070++] = arg0.refreshRate;
        }
    }
}
