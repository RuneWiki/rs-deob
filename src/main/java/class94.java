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

@OriginalClass("client!eg")
public class class94 implements IEnumModesCallback {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field1053 = new DirectDraw();

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    private static int field1055;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "[I")
    private static int[] field1054;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/awt/Frame;B)V", line = 5)
    public final void method588(Frame arg0, byte arg1) {
        int var3 = 30 % ((25 - arg1) / 52);
        this.field1053.restoreDisplayMode();
        this.field1053.setCooperativeLevel(arg0, 8);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)[I", line = 16)
    public final int[] method589(boolean arg0) {
        this.field1053.enumDisplayModes(0, null, null, this);
        field1054 = new int[field1055];
        field1055 = 0;
        this.field1053.enumDisplayModes(0, null, null, this);
        int[] var2 = field1054;
        if (arg0) {
            this.callbackEnumModes(null, null);
        }
        field1054 = null;
        field1055 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V", line = 33)
    public class94() {
        this.field1053.initialize(null);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILjava/awt/Frame;II)V", line = 42)
    public final void method590(int arg0, int arg1, int arg2, Frame arg3, int arg4, int arg5) {
        arg3.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg3.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, arg0, 8);
        this.field1053.setCooperativeLevel(arg3, 17);
        this.field1053.setDisplayMode(arg1, arg4, arg5, arg2, 0);
        arg3.setBounds(0, 0, arg1, arg4);
        arg3.toFront();
        arg3.requestFocus();
    }

    @OriginalMember(owner = "client!eg", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 60)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field1054 == null) {
            field1055 += 4;
        } else {
            field1054[field1055++] = arg0.width;
            field1054[field1055++] = arg0.height;
            field1054[field1055++] = arg0.rgbBitCount;
            field1054[field1055++] = arg0.refreshRate;
        }
    }
}
