import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public class class426 {

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field5808;

    @OriginalMember(owner = "client!hja", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field5810;

    @OriginalMember(owner = "client!hja", name = "b", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field5809;

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;ILjagdx/IDirect3DSwapChain;)V")
    public final void method2572(IDirect3DSurface arg0, int arg1, IDirect3DSwapChain arg2) {
        this.field5808 = arg0;
        this.field5809 = arg2;
        this.field5810 = this.field5809.method3077(arg1, 0);
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(I)Z")
    public final boolean method2573(int arg0) {
        if (arg0 <= 8) {
            this.method2572(null, 103, null);
        }
        return this.field5809 != null;
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(B)V")
    public final void method2574(byte arg0) {
        if (this.field5810 != null) {
            this.field5810.method3967(arg0 ^ 0xFFFF8ED5);
            this.field5810 = null;
        }
        if (this.field5808 != null) {
            this.field5808.method3967(29036);
            this.field5808 = null;
        }
        if (arg0 != -71) {
            this.field5809 = null;
        }
        if (this.field5809 != null) {
            this.field5809.method3967(arg0 ^ 0xFFFF8ED5);
            this.field5809 = null;
        }
    }

    @OriginalMember(owner = "client!hja", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class426(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method2572(arg1, 0, arg0);
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(IB)I")
    public final int method2575(int arg0, byte arg1) {
        int var3 = -72 % ((24 - arg1) / 49);
        return this.field5809.Present(arg0);
    }
}
