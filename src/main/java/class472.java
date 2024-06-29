import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class472 {

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6783;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6784;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field6782;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;ILjagdx/IDirect3DSwapChain;)V")
    public final void method2858(IDirect3DSurface arg0, int arg1, IDirect3DSwapChain arg2) {
        this.field6782 = arg2;
        this.field6784 = arg0;
        this.field6783 = this.field6782.method2904(arg1, 0);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public final void method2859(byte arg0) {
        int var2 = 117 / ((61 - arg0) / 43);
        if (this.field6783 != null) {
            this.field6783.method3786(30216);
            this.field6783 = null;
        }
        if (this.field6784 != null) {
            this.field6784.method3786(30216);
            this.field6784 = null;
        }
        if (this.field6782 != null) {
            this.field6782.method3786(30216);
            this.field6782 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)Z")
    public final boolean method2860(int arg0) {
        int var2 = 97 % ((-arg0 - 9) / 41);
        return this.field6782 != null;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class472(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method2858(arg1, 0, arg0);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)I")
    public final int method2861(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method2859((byte) 67);
        }
        return this.field6782.Present(arg1);
    }
}
