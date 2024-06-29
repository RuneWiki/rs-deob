import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class439 {

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6099;

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6101;

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field6100;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)V", line = 5)
    public final void method2420(byte arg0) {
        if (this.field6099 != null) {
            this.field6099.method3457((byte) -34);
            this.field6099 = null;
        }
        int var2 = 48 % ((arg0 - 50) / 54);
        if (this.field6101 != null) {
            this.field6101.method3457((byte) -34);
            this.field6101 = null;
        }
        if (this.field6100 != null) {
            this.field6100.method3457((byte) -34);
            this.field6100 = null;
        }
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 33)
    public class439(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method2421(arg1, true, arg0);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;ZLjagdx/IDirect3DSwapChain;)V", line = 42)
    public final void method2421(IDirect3DSurface arg0, boolean arg1, IDirect3DSwapChain arg2) {
        if (arg1) {
            this.field6100 = arg2;
            this.field6101 = arg0;
            this.field6099 = this.field6100.method2445(0, 0);
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)Z", line = 54)
    public final boolean method2422(int arg0) {
        if (arg0 < 61) {
            this.field6101 = null;
        }
        return this.field6100 != null;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(II)I", line = 64)
    public final int method2423(int arg0, int arg1) {
        if (arg0 != -15220) {
            this.method2423(-63, 85);
        }
        return this.field6100.Present(arg1);
    }
}
