import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class450 {

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6610;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6611;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field6609;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)Z")
    public final boolean method3457(int arg0) {
        if (arg0 != 0) {
            this.method3457(-114);
        }
        return this.field6609 != null;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class450(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method3458(arg1, -12378, arg0);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;ILjagdx/IDirect3DSwapChain;)V")
    public final void method3458(IDirect3DSurface arg0, int arg1, IDirect3DSwapChain arg2) {
        this.field6609 = arg2;
        if (arg1 != -12378) {
            this.field6609 = null;
        }
        this.field6611 = arg0;
        this.field6610 = this.field6609.method3846(0, 0);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public final void method3459(int arg0) {
        if (this.field6610 != null) {
            this.field6610.method5121(110);
            this.field6610 = null;
        }
        if (this.field6611 != null) {
            this.field6611.method5121(102);
            this.field6611 = null;
        }
        if (arg0 != 0) {
            this.method3460(-68, -85);
        }
        if (this.field6609 != null) {
            this.field6609.method5121(arg0 - 112);
            this.field6609 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
    public final int method3460(int arg0, int arg1) {
        if (arg0 != 12960) {
            this.method3457(-16);
        }
        return this.field6609.Present(arg1);
    }
}
