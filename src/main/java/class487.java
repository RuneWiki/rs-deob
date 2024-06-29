import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class487 {

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6699;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6700;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field6701;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V")
    public final void method2858(boolean arg0) {
        if (this.field6700 != null) {
            this.field6700.method2234(-4840);
            this.field6700 = null;
        }
        if (this.field6699 != null) {
            this.field6699.method2234(-4840);
            this.field6699 = null;
        }
        if (!arg0) {
            this.method2858(true);
        }
        if (this.field6701 != null) {
            this.field6701.method2234(-4840);
            this.field6701 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;Ljagdx/IDirect3DSwapChain;B)V")
    public final void method2859(IDirect3DSurface arg0, IDirect3DSwapChain arg1, byte arg2) {
        this.field6699 = arg0;
        this.field6701 = arg1;
        if (arg2 < 39) {
            this.method2860(-64);
        }
        this.field6700 = this.field6701.method4165(0, 0);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Z")
    public final boolean method2860(int arg0) {
        if (arg0 != 6813) {
            this.field6700 = null;
        }
        return this.field6701 != null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)I")
    public final int method2861(int arg0, byte arg1) {
        return arg1 > -22 ? 100 : this.field6701.Present(arg0);
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class487(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method2859(arg1, arg0, (byte) 124);
    }
}
