import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class262 {

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field3844;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field3845;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field3846;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)I")
    public final int method1715(int arg0, byte arg1) {
        int var3 = -16 % ((20 - arg1) / 52);
        return this.field3846.Present(arg0);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljagdx/IDirect3DSwapChain;ILjagdx/IDirect3DSurface;)V")
    public final void method1716(IDirect3DSwapChain arg0, int arg1, IDirect3DSurface arg2) {
        this.field3844 = arg2;
        if (arg1 < 15) {
            this.method1716(null, 98, null);
        }
        this.field3846 = arg0;
        this.field3845 = this.field3846.method2720(0, 0);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)Z")
    public final boolean method1717(int arg0) {
        if (arg0 != -14214) {
            this.method1716(null, 114, null);
        }
        return this.field3846 != null;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class262(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method1716(arg0, 110, arg1);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
    public final void method1718(int arg0) {
        if (this.field3845 != null) {
            this.field3845.method3595((byte) -67);
            this.field3845 = null;
        }
        if (this.field3844 != null) {
            this.field3844.method3595((byte) -67);
            this.field3844 = null;
        }
        if (this.field3846 != null) {
            this.field3846.method3595((byte) -67);
            this.field3846 = null;
        }
        if (arg0 != 0) {
            this.method1718(-28);
        }
    }
}
