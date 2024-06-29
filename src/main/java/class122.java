import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class122 {

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field1460;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field1461;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field1459;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 6)
    public final void method830(int arg0) {
        if (this.field1460 != null) {
            this.field1460.method3677(7516);
            this.field1460 = null;
        }
        if (this.field1461 != null) {
            this.field1461.method3677(7516);
            this.field1461 = null;
        }
        if (this.field1459 != null) {
            this.field1459.method3677(7516);
            this.field1459 = null;
        }
        if (arg0 > -54) {
            this.method832(8, false);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;Ljagdx/IDirect3DSwapChain;I)V", line = 34)
    public final void method831(IDirect3DSurface arg0, IDirect3DSwapChain arg1, int arg2) {
        this.field1459 = arg1;
        this.field1461 = arg0;
        this.field1460 = this.field1459.method2898(arg2, 0);
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 42)
    public class122(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method831(arg1, arg0, 0);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IZ)I", line = 51)
    public final int method832(int arg0, boolean arg1) {
        return arg1 ? this.field1459.Present(arg0) : 106;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)Z", line = 61)
    public final boolean method833(boolean arg0) {
        if (arg0) {
            this.method833(true);
        }
        return this.field1459 != null;
    }
}
