import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class354 {

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field4781;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field4782;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field4783;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)I")
    public final int method2122(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method2125((byte) 4, null, null);
        }
        return this.field4783.Present(arg0);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public final void method2123(int arg0) {
        if (this.field4781 != null) {
            this.field4781.method3306((byte) -115);
            this.field4781 = null;
        }
        if (this.field4782 != null) {
            this.field4782.method3306((byte) -72);
            this.field4782 = null;
        }
        if (this.field4783 != null) {
            this.field4783.method3306((byte) 127);
            this.field4783 = null;
        }
        if (arg0 != 0) {
            this.method2123(39);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)Z")
    public final boolean method2124(int arg0) {
        if (arg0 != 0) {
            this.method2123(-14);
        }
        return this.field4783 != null;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class354(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method2125((byte) 49, arg0, arg1);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLjagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public final void method2125(byte arg0, IDirect3DSwapChain arg1, IDirect3DSurface arg2) {
        if (arg0 > 27) {
            this.field4782 = arg2;
            this.field4783 = arg1;
            this.field4781 = this.field4783.method2445(0, 0);
        }
    }
}
