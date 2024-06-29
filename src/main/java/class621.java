import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class621 {

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field8355;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field8357;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field8356;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V", line = 5)
    public final void method3380(boolean arg0) {
        if (this.field8355 != null) {
            this.field8355.method1941((byte) -46);
            this.field8355 = null;
        }
        if (!arg0) {
            return;
        }
        if (this.field8357 != null) {
            this.field8357.method1941((byte) -46);
            this.field8357 = null;
        }
        if (this.field8356 != null) {
            this.field8356.method1941((byte) -46);
            this.field8356 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljagdx/IDirect3DSwapChain;ILjagdx/IDirect3DSurface;)V", line = 32)
    public final void method3381(IDirect3DSwapChain arg0, int arg1, IDirect3DSurface arg2) {
        this.field8356 = arg0;
        if (arg1 < -30) {
            this.field8357 = arg2;
            this.field8355 = this.field8356.method3696(0, 0);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZ)I", line = 45)
    public final int method3382(int arg0, boolean arg1) {
        return arg1 ? -109 : this.field8356.Present(arg0);
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 54)
    public class621(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method3381(arg0, -84, arg1);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)Z", line = 63)
    public final boolean method3383(byte arg0) {
        if (arg0 < 43) {
            this.method3380(false);
        }
        return this.field8356 != null;
    }
}
