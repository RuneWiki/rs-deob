import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class725 {

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field10176;

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field10178;

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field10177;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)Z", line = 5)
    public final boolean method3998(byte arg0) {
        int var2 = -75 / ((-arg0 - 26) / 41);
        return this.field10177 != null;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(II)I", line = 13)
    public final int method3999(int arg0, int arg1) {
        if (arg0 != 31748) {
            this.field10177 = null;
        }
        return this.field10177.Present(arg1);
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(B)V", line = 23)
    public final void method4000(byte arg0) {
        if (this.field10178 != null) {
            this.field10178.method2604(false);
            this.field10178 = null;
        }
        if (this.field10176 != null) {
            this.field10176.method2604(false);
            this.field10176 = null;
        }
        if (this.field10177 != null) {
            this.field10177.method2604(false);
            this.field10177 = null;
        }
        int var2 = -79 % ((arg0 - 38) / 33);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;Ljagdx/IDirect3DSwapChain;I)V", line = 54)
    public final void method4001(IDirect3DSurface arg0, IDirect3DSwapChain arg1, int arg2) {
        if (arg2 == 22993) {
            this.field10176 = arg0;
            this.field10177 = arg1;
            this.field10178 = this.field10177.method4139(0, 0);
        }
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 65)
    public class725(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method4001(arg1, arg0, 22993);
    }
}
