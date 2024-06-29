import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class402 {

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field5908;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field5910;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field5909;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZI)I", line = 4)
    public final int method2451(boolean arg0, int arg1) {
        if (!arg0) {
            this.field5909 = null;
        }
        return this.field5909.Present(arg1);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Z", line = 14)
    public final boolean method2452(int arg0) {
        if (arg0 != 0) {
            this.field5908 = null;
        }
        return this.field5909 != null;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V", line = 27)
    public final void method2453(int arg0) {
        if (arg0 != 0) {
            this.method2453(-18);
        }
        if (this.field5910 != null) {
            this.field5910.method3496((byte) -80);
            this.field5910 = null;
        }
        if (this.field5908 != null) {
            this.field5908.method3496((byte) -80);
            this.field5908 = null;
        }
        if (this.field5909 != null) {
            this.field5909.method3496((byte) -80);
            this.field5909 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljagdx/IDirect3DSwapChain;ILjagdx/IDirect3DSurface;)V", line = 55)
    public final void method2454(IDirect3DSwapChain arg0, int arg1, IDirect3DSurface arg2) {
        this.field5909 = arg0;
        this.field5908 = arg2;
        this.field5910 = this.field5909.method2660(0, 0);
        if (arg1 > -54) {
            this.field5909 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 65)
    public class402(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method2454(arg0, -98, arg1);
    }
}
