import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class411 {

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6102;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6103;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field6101;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
    public final void method2492(byte arg0) {
        if (this.field6102 != null) {
            this.field6102.method3258(55);
            this.field6102 = null;
        }
        if (this.field6103 != null) {
            this.field6103.method3258(65);
            this.field6103 = null;
        }
        if (this.field6101 != null) {
            this.field6101.method3258(103);
            this.field6101 = null;
        }
        if (arg0 >= -98) {
            this.field6103 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)Z")
    public final boolean method2493(int arg0) {
        if (arg0 == 0) {
            return this.field6101 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZI)I")
    public final int method2494(boolean arg0, int arg1) {
        if (arg0) {
            this.field6101 = null;
        }
        return this.field6101.Present(arg1);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljagdx/IDirect3DSwapChain;ILjagdx/IDirect3DSurface;)V")
    public final void method2495(IDirect3DSwapChain arg0, int arg1, IDirect3DSurface arg2) {
        this.field6103 = arg2;
        this.field6101 = arg0;
        this.field6102 = this.field6101.method2409(arg1, 0);
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class411(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method2495(arg0, 0, arg1);
    }
}
