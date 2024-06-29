import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class473 {

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6770;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6771;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field6769;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)Z")
    public final boolean method2776(byte arg0) {
        if (arg0 != 64) {
            this.field6771 = null;
        }
        return this.field6769 != null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;ILjagdx/IDirect3DSwapChain;)V")
    public final void method2777(IDirect3DSurface arg0, int arg1, IDirect3DSwapChain arg2) {
        this.field6769 = arg2;
        this.field6771 = arg0;
        this.field6770 = this.field6769.method4001(arg1, 0);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public final void method2778(int arg0) {
        if (this.field6770 != null) {
            this.field6770.method2211(arg0 ^ 0x7C);
            this.field6770 = null;
        }
        if (this.field6771 != null) {
            this.field6771.method2211(124);
            this.field6771 = null;
        }
        if (this.field6769 != null) {
            this.field6769.method2211(arg0 - 7);
            this.field6769 = null;
        }
        if (arg0 != 0) {
            this.method2779(108, -52);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)I")
    public final int method2779(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field6769 = null;
        }
        return this.field6769.Present(arg1);
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class473(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method2777(arg1, 0, arg0);
    }
}
