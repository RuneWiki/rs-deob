import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class304 {

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field3972;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field3973;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field3971;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)I")
    public final int method1809(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method1809(2, 34);
        }
        return this.field3971.Present(arg0);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLjagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public final void method1810(byte arg0, IDirect3DSwapChain arg1, IDirect3DSurface arg2) {
        if (arg0 != 7) {
            this.field3972 = null;
        }
        this.field3971 = arg1;
        this.field3973 = arg2;
        this.field3972 = this.field3971.method2884(0, 0);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)Z")
    public final boolean method1811(int arg0) {
        if (arg0 != 19545) {
            this.method1810((byte) 36, null, null);
        }
        return this.field3971 != null;
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class304(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method1810((byte) 7, arg0, arg1);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
    public final void method1812(byte arg0) {
        if (arg0 != -114) {
            return;
        }
        if (this.field3972 != null) {
            this.field3972.method3809((byte) -36);
            this.field3972 = null;
        }
        if (this.field3973 != null) {
            this.field3973.method3809((byte) -36);
            this.field3973 = null;
        }
        if (this.field3971 != null) {
            this.field3971.method3809((byte) -36);
            this.field3971 = null;
        }
    }
}
