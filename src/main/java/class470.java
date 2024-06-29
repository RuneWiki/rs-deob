import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class470 {

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6570;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6571;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field6569;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public final void method2673(byte arg0) {
        if (this.field6570 != null) {
            this.field6570.method3440(21066);
            this.field6570 = null;
        }
        if (this.field6571 != null) {
            this.field6571.method3440(21066);
            this.field6571 = null;
        }
        if (arg0 == 106 && this.field6569 != null) {
            this.field6569.method3440(21066);
            this.field6569 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)Z")
    public final boolean method2674(int arg0) {
        if (arg0 == 0) {
            return this.field6569 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;I)V")
    public final void method2675(IDirect3DSwapChain arg0, IDirect3DSurface arg1, int arg2) {
        this.field6569 = arg0;
        this.field6571 = arg1;
        this.field6570 = this.field6569.method2561(0, 0);
        if (arg2 != 5164) {
            this.field6569 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)I")
    public final int method2676(int arg0, byte arg1) {
        if (arg1 < 87) {
            this.field6570 = null;
        }
        return this.field6569.Present(arg0);
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class470(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method2675(arg0, arg1, 5164);
    }
}
