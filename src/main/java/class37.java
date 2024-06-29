import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class37 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field421;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field422;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field423;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)I")
    public final int method189(int arg0, byte arg1) {
        if (arg1 != 47) {
            this.field423 = null;
        }
        return this.field423.Present(arg0);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILjagdx/IDirect3DSurface;Ljagdx/IDirect3DSwapChain;)V")
    public final void method190(int arg0, IDirect3DSurface arg1, IDirect3DSwapChain arg2) {
        this.field423 = arg2;
        this.field422 = arg1;
        this.field421 = this.field423.method2379(0, arg0);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)Z")
    public final boolean method191(int arg0) {
        if (arg0 <= 4) {
            this.field423 = null;
        }
        return this.field423 != null;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public final void method192(int arg0) {
        if (this.field421 != null) {
            this.field421.method3340((byte) -27);
            this.field421 = null;
        }
        if (this.field422 != null) {
            this.field422.method3340((byte) -27);
            this.field422 = null;
        }
        if (this.field423 != null) {
            this.field423.method3340((byte) -27);
            this.field423 = null;
        }
        int var2 = 20 % ((arg0 + 78) / 35);
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class37(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method190(0, arg1, arg0);
    }
}
