import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class8 {

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field65;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field67;

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field66;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)I", line = 4)
    public final int method27(int arg0, int arg1) {
        if (arg1 != -32432) {
            this.method30(null, null, -81);
        }
        return this.field66.Present(arg0);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)Z", line = 14)
    public final boolean method28(byte arg0) {
        if (arg0 >= -121) {
            this.field66 = null;
        }
        return this.field66 != null;
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(B)V", line = 26)
    public final void method29(byte arg0) {
        if (this.field67 != null) {
            this.field67.method2583((byte) -113);
            this.field67 = null;
        }
        if (this.field65 != null) {
            this.field65.method2583((byte) -116);
            this.field65 = null;
        }
        if (this.field66 != null) {
            this.field66.method2583((byte) -98);
            this.field66 = null;
        }
        if (arg0 <= 118) {
            this.method30(null, null, -83);
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 54)
    public class8(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method30(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;I)V", line = 63)
    public final void method30(IDirect3DSwapChain arg0, IDirect3DSurface arg1, int arg2) {
        this.field66 = arg0;
        this.field65 = arg1;
        this.field67 = this.field66.method4120(arg2, 0);
    }
}
