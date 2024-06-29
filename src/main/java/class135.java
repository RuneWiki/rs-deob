import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class135 {

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field1492;

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field1494;

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field1493;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V")
    public final void method760(int arg0) {
        int var2 = 62 / ((38 - arg0) / 61);
        if (this.field1492 != null) {
            this.field1492.method3483(-128);
            this.field1492 = null;
        }
        if (this.field1494 != null) {
            this.field1494.method3483(-127);
            this.field1494 = null;
        }
        if (this.field1493 != null) {
            this.field1493.method3483(-128);
            this.field1493 = null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)Z")
    public final boolean method761(byte arg0) {
        if (arg0 <= 106) {
            return false;
        } else {
            return this.field1493 != null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(BI)I")
    public final int method762(byte arg0, int arg1) {
        if (arg0 != -127) {
            this.field1492 = null;
        }
        return this.field1493.Present(arg1);
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;I)V")
    public final void method763(IDirect3DSwapChain arg0, IDirect3DSurface arg1, int arg2) {
        this.field1493 = arg0;
        this.field1494 = arg1;
        this.field1492 = this.field1493.method2505(0, 0);
        if (arg2 < 2) {
            this.method762((byte) -64, 91);
        }
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class135(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method763(arg0, arg1, 32);
    }
}
