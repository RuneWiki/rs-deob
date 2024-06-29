import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class420 {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6027;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6029;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field6028;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method2590(int arg0) {
        if (arg0 != -29727) {
            this.method2590(70);
        }
        return this.field6028 != null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLjagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 14)
    public final void method2591(byte arg0, IDirect3DSwapChain arg1, IDirect3DSurface arg2) {
        this.field6028 = arg1;
        if (arg0 < -57) {
            this.field6027 = arg2;
            this.field6029 = this.field6028.method2979(0, 0);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 26)
    public final void method2592(int arg0) {
        if (arg0 != -32387) {
            this.method2591((byte) -22, null, null);
        }
        if (this.field6029 != null) {
            this.field6029.method3936((byte) -70);
            this.field6029 = null;
        }
        if (this.field6027 != null) {
            this.field6027.method3936((byte) -70);
            this.field6027 = null;
        }
        if (this.field6028 != null) {
            this.field6028.method3936((byte) -70);
            this.field6028 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I", line = 57)
    public final int method2593(int arg0, int arg1) {
        int var3 = -95 % ((arg0 - 57) / 58);
        return this.field6028.Present(arg1);
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 64)
    public class420(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method2591((byte) -63, arg0, arg1);
    }
}
