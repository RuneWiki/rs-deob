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

@OriginalClass("client!up")
public class class292 implements IEnumModesCallback {

    @OriginalMember(owner = "client!up", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field4014 = new DirectDraw();

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    private static int field4015;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "[I")
    private static int[] field4016;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Ljava/awt/Frame;I)V", line = 4)
    public final void method1856(Frame arg0, int arg1) {
        this.field4014.restoreDisplayMode();
        if (arg1 > -116) {
            field4015 = -23;
        }
        this.field4014.setCooperativeLevel(arg0, 8);
    }

    @OriginalMember(owner = "client!up", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 16)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field4016 == null) {
            field4015 += 4;
        } else {
            field4016[field4015++] = arg0.width;
            field4016[field4015++] = arg0.height;
            field4016[field4015++] = arg0.rgbBitCount;
            field4016[field4015++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIILjava/awt/Frame;II)V", line = 33)
    public final void method1857(int arg0, int arg1, int arg2, Frame arg3, int arg4, int arg5) {
        arg3.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg3.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, arg2, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field4014.setCooperativeLevel(arg3, 17);
        this.field4014.setDisplayMode(arg5, arg4, arg1, arg0, 0);
        arg3.setBounds(0, 0, arg5, arg4);
        arg3.toFront();
        arg3.requestFocus();
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V", line = 50)
    public class292() {
        this.field4014.initialize(null);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)[I", line = 59)
    public final int[] method1858(int arg0) {
        this.field4014.enumDisplayModes(0, null, null, this);
        field4016 = new int[field4015];
        field4015 = 0;
        this.field4014.enumDisplayModes(0, null, null, this);
        int[] var2 = field4016;
        field4015 = 0;
        field4016 = null;
        if (arg0 != -14048) {
            this.method1857(-32, 56, 123, null, 0, 110);
        }
        return var2;
    }
}
