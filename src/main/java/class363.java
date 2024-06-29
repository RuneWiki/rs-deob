import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class363 {

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field4771;

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field4773;

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field4772;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(BI)I")
    public final int method2034(byte arg0, int arg1) {
        return arg0 < 70 ? -103 : this.field4772.Present(arg1);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;Ljagdx/IDirect3DSwapChain;I)V")
    public final void method2035(IDirect3DSurface arg0, IDirect3DSwapChain arg1, int arg2) {
        this.field4773 = arg0;
        this.field4772 = arg1;
        this.field4771 = this.field4772.method2338(0, arg2);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V")
    public final void method2036(int arg0) {
        if (this.field4771 != null) {
            this.field4771.method3355(-11385);
            this.field4771 = null;
        }
        if (this.field4773 != null) {
            this.field4773.method3355(-11385);
            this.field4773 = null;
        }
        if (arg0 == 0 && this.field4772 != null) {
            this.field4772.method3355(arg0 - 11385);
            this.field4772 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class363(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method2035(arg1, arg0, 0);
    }
}
