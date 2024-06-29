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

@OriginalClass("client!aha")
public class class94 implements IEnumModesCallback {

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field1294 = new DirectDraw();

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "I")
    private static int field1296;

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "[I")
    private static int[] field1295;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(B)[I", line = 3)
    public final int[] method564(byte arg0) {
        this.field1294.enumDisplayModes(0, null, null, this);
        field1295 = new int[field1296];
        field1296 = 0;
        if (arg0 != -95) {
            this.method565(19, 67, null, -112, 10, -38);
        }
        this.field1294.enumDisplayModes(0, null, null, this);
        int[] var2 = field1295;
        field1295 = null;
        field1296 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IILjava/awt/Frame;III)V", line = 22)
    public final void method565(int arg0, int arg1, Frame arg2, int arg3, int arg4, int arg5) {
        arg2.setVisible(true);
        WComponentPeer var7 = (WComponentPeer) arg2.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field1294.setCooperativeLevel(arg2, 17);
        this.field1294.setDisplayMode(arg0, arg5, arg3, arg4, 0);
        arg2.setBounds(0, 0, arg0, arg5);
        arg2.toFront();
        arg2.requestFocus();
        int var9 = 124 % ((32 - arg1) / 60);
    }

    @OriginalMember(owner = "client!aha", name = "<init>", descriptor = "()V", line = 41)
    public class94() {
        this.field1294.initialize(null);
    }

    @OriginalMember(owner = "client!aha", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V", line = 50)
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field1295 == null) {
            field1296 += 4;
        } else {
            field1295[field1296++] = arg0.width;
            field1295[field1296++] = arg0.height;
            field1295[field1296++] = arg0.rgbBitCount;
            field1295[field1296++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljava/awt/Frame;B)V", line = 68)
    public final void method566(Frame arg0, byte arg1) {
        if (arg1 == -39) {
            this.field1294.restoreDisplayMode();
            this.field1294.setCooperativeLevel(arg0, 8);
        }
    }
}
