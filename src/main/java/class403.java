import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class403 {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field5919;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field5920;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field5918;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)I")
    public final int method2516(byte arg0, int arg1) {
        if (arg0 != 91) {
            this.field5919 = null;
        }
        return this.field5918.Present(arg1);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public final void method2517(byte arg0) {
        if (this.field5920 != null) {
            this.field5920.method3799(9275);
            this.field5920 = null;
        }
        if (this.field5919 != null) {
            this.field5919.method3799(9275);
            this.field5919 = null;
        }
        int var2 = -115 / ((arg0 + 20) / 51);
        if (this.field5918 != null) {
            this.field5918.method3799(9275);
            this.field5918 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljagdx/IDirect3DSwapChain;BLjagdx/IDirect3DSurface;)V")
    public final void method2518(IDirect3DSwapChain arg0, byte arg1, IDirect3DSurface arg2) {
        this.field5919 = arg2;
        if (arg1 == -107) {
            this.field5918 = arg0;
            this.field5920 = this.field5918.method2855(0, 0);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Z")
    public final boolean method2519(int arg0) {
        int var2 = -21 / ((7 - arg0) / 51);
        return this.field5918 != null;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class403(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method2518(arg0, (byte) -107, arg1);
    }
}
