import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class431 {

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field5995;

    @OriginalMember(owner = "client!eja", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field5997;

    @OriginalMember(owner = "client!eja", name = "b", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field5996;

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(I)Z")
    public final boolean method2582(int arg0) {
        if (arg0 == 13993) {
            return this.field5996 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(II)I")
    public final int method2583(int arg0, int arg1) {
        return arg0 >= -96 ? 87 : this.field5996.Present(arg1);
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;BLjagdx/IDirect3DSwapChain;)V")
    public final void method2584(IDirect3DSurface arg0, byte arg1, IDirect3DSwapChain arg2) {
        this.field5997 = arg0;
        if (arg1 != -66) {
            this.field5997 = null;
        }
        this.field5996 = arg2;
        this.field5995 = this.field5996.method4166(0, 0);
    }

    @OriginalMember(owner = "client!eja", name = "b", descriptor = "(I)V")
    public final void method2585(int arg0) {
        if (this.field5995 != null) {
            this.field5995.method2320(-5017);
            this.field5995 = null;
        }
        if (arg0 > -120) {
            return;
        }
        if (this.field5997 != null) {
            this.field5997.method2320(-5017);
            this.field5997 = null;
        }
        if (this.field5996 != null) {
            this.field5996.method2320(-5017);
            this.field5996 = null;
        }
    }

    @OriginalMember(owner = "client!eja", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class431(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method2584(arg1, (byte) -66, arg0);
    }
}
