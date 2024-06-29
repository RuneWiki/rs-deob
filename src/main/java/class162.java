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

@OriginalClass("client!wp")
public class class162 implements IEnumModesCallback {

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field1990 = new DirectDraw();

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    private static int field1991;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "[I")
    private static int[] field1992;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljava/awt/Frame;IIIII)V", line = 5)
    public final void method1023(Frame arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.setVisible(true);
        int var7 = 12 % ((-arg1 - 52) / 63);
        WComponentPeer var8 = (WComponentPeer) arg0.getPeer();
        int var9 = var8.getHwnd();
        User32.SetWindowLong(var9, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var9, -20, 8);
        this.field1990.setCooperativeLevel(arg0, 17);
        this.field1990.setDisplayMode(arg2, arg3, arg4, arg5, 0);
        arg0.setBounds(0, 0, arg2, arg3);
        arg0.toFront();
        arg0.requestFocus();
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)[I", line = 25)
    public final int[] method1024(int arg0) {
        this.field1990.enumDisplayModes(0, null, null, this);
        field1992 = new int[field1991];
        if (arg0 >= -5) {
            return null;
        }
        field1991 = 0;
        this.field1990.enumDisplayModes(0, null, null, this);
        int[] var2 = field1992;
        field1991 = 0;
        field1992 = null;
        return var2;
    }

    @OriginalMember(owner = "client!wp", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 43)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field1992 == null) {
            field1991 += 4;
        } else {
            field1992[field1991++] = arg0.width;
            field1992[field1991++] = arg0.height;
            field1992[field1991++] = arg0.rgbBitCount;
            field1992[field1991++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLjava/awt/Frame;)V", line = 59)
    public final void method1025(byte arg0, Frame arg1) {
        if (arg0 == -122) {
            this.field1990.restoreDisplayMode();
            this.field1990.setCooperativeLevel(arg1, 8);
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V", line = 70)
    public class162() {
        this.field1990.initialize(null);
    }
}
