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

@OriginalClass("client!ga")
public class class341 implements IEnumModesCallback {

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Lcom/ms/directX/DirectDraw;")
    private DirectDraw field4360 = new DirectDraw();

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    private static int field4359;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "[I")
    private static int[] field4361;

    @OriginalMember(owner = "client!ga", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (field4361 == null) {
            field4359 += 4;
        } else {
            field4361[field4359++] = arg0.width;
            field4361[field4359++] = arg0.height;
            field4361[field4359++] = arg0.rgbBitCount;
            field4361[field4359++] = arg0.refreshRate;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
    public final void method1967(Frame arg0, byte arg1) {
        this.field4360.restoreDisplayMode();
        this.field4360.setCooperativeLevel(arg0, 8);
        if (arg1 <= 28) {
            this.callbackEnumModes(null, null);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)[I")
    public final int[] method1968(int arg0) {
        this.field4360.enumDisplayModes(0, null, null, this);
        field4361 = new int[field4359];
        field4359 = 0;
        if (arg0 != 8787) {
            this.field4360 = null;
        }
        this.field4360.enumDisplayModes(0, null, null, this);
        int[] var2 = field4361;
        field4359 = 0;
        field4361 = null;
        return var2;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class341() {
        this.field4360.initialize(null);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIZLjava/awt/Frame;I)V")
    public final void method1969(int arg0, int arg1, int arg2, boolean arg3, Frame arg4, int arg5) {
        arg4.setVisible(arg3);
        WComponentPeer var7 = (WComponentPeer) arg4.getPeer();
        int var8 = var7.getHwnd();
        User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(var8, -20, 8);
        this.field4360.setCooperativeLevel(arg4, 17);
        this.field4360.setDisplayMode(arg1, arg5, arg2, arg0, 0);
        arg4.setBounds(0, 0, arg1, arg5);
        arg4.toFront();
        arg4.requestFocus();
    }
}
