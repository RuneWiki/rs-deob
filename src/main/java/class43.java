import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public class class43 {

    @OriginalMember(owner = "client!pja", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field649;

    @OriginalMember(owner = "client!pja", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field650;

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field648;

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(II)I", line = 4)
    public final int method294(int arg0, int arg1) {
        return arg1 == 0 ? this.field648.Present(arg0) : -89;
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(ILjagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 15)
    public final void method295(int arg0, IDirect3DSwapChain arg1, IDirect3DSurface arg2) {
        this.field648 = arg1;
        this.field650 = arg2;
        this.field649 = this.field648.method2971(arg0, 0);
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(Z)V", line = 25)
    public final void method296(boolean arg0) {
        if (!arg0) {
            this.method295(-126, null, null);
        }
        if (this.field649 != null) {
            this.field649.method3973(!arg0);
            this.field649 = null;
        }
        if (this.field650 != null) {
            this.field650.method3973(false);
            this.field650 = null;
        }
        if (this.field648 != null) {
            this.field648.method3973(false);
            this.field648 = null;
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(I)Z", line = 54)
    public final boolean method297(int arg0) {
        int var2 = 18 / ((arg0 - 18) / 37);
        return this.field648 != null;
    }

    @OriginalMember(owner = "client!pja", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 61)
    public class43(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method295(0, arg0, arg1);
    }
}
