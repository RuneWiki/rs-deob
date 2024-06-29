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

@OriginalClass("client!uj")
public class class349 implements IEnumModesCallback {

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field4652 = new DirectDraw();

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    private static int field4654;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "[I")
    private static int[] field4653;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZLjava/awt/Frame;)V", line = 4)
    public final void method2017(boolean arg0, Frame arg1) {
        this.field4652.restoreDisplayMode();
        this.field4652.setCooperativeLevel(arg1, 8);
        if (!arg0) {
            field4654 = -6;
        }
    }

    @OriginalMember(owner = "client!uj", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 15)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field4653 == null) {
            field4654 += 4;
        } else {
            field4653[field4654++] = arg0.width;
            field4653[field4654++] = arg0.height;
            field4653[field4654++] = arg0.rgbBitCount;
            field4653[field4654++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 31)
    public class349() {
        this.field4652.initialize(null);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILjava/awt/Frame;IIII)V", line = 41)
    public final void method2018(int arg0, Frame arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg1.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field4652.setCooperativeLevel(arg1, 17);
        this.field4652.setDisplayMode(arg0, arg2, arg3, arg5, 0);
        arg1.setBounds(0, 0, arg0, arg2);
        int var9 = 123 / ((-arg4 - 78) / 47);
        arg1.toFront();
        arg1.requestFocus();
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)[I", line = 61)
    public final int[] method2019(int arg0) {
        this.field4652.enumDisplayModes(0, null, null, this);
        field4653 = new int[field4654];
        field4654 = 0;
        this.field4652.enumDisplayModes(0, null, null, this);
        int var2 = 101 % ((arg0 - 24) / 33);
        int[] var3 = field4653;
        field4654 = 0;
        field4653 = null;
        return var3;
    }
}
