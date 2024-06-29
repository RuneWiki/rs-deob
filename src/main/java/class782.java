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

@OriginalClass("client!kq")
public class class782 implements IEnumModesCallback {

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field10739 = new DirectDraw();

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    private static int field10738;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "[I")
    private static int[] field10740;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIILjava/awt/Frame;I)V", line = 3)
    public final void method4299(int arg0, int arg1, int arg2, int arg3, Frame arg4, int arg5) {
        arg4.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg4.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field10739.setCooperativeLevel(arg4, 17);
        this.field10739.setDisplayMode(arg3, arg0, arg2, arg1, 0);
        arg4.setBounds(0, arg5, arg3, arg0);
        arg4.toFront();
        arg4.requestFocus();
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/awt/Frame;I)V", line = 22)
    public final void method4300(Frame arg0, int arg1) {
        this.field10739.restoreDisplayMode();
        this.field10739.setCooperativeLevel(arg0, arg1);
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V", line = 30)
    public class782() {
        this.field10739.initialize(null);
    }

    @OriginalMember(owner = "client!kq", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 39)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field10740 == null) {
            field10738 += 4;
        } else {
            field10740[field10738++] = arg0.width;
            field10740[field10738++] = arg0.height;
            field10740[field10738++] = arg0.rgbBitCount;
            field10740[field10738++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)[I", line = 55)
    public final int[] method4301(int arg0) {
        this.field10739.enumDisplayModes(arg0, null, null, this);
        field10740 = new int[field10738];
        field10738 = 0;
        this.field10739.enumDisplayModes(0, null, null, this);
        int[] var2 = field10740;
        field10738 = 0;
        field10740 = null;
        return var2;
    }
}
