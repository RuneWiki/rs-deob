import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class196 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field2653;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field2655;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field2654;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;ZLjagdx/IDirect3DSwapChain;)V", line = 4)
    public final void method1248(IDirect3DSurface arg0, boolean arg1, IDirect3DSwapChain arg2) {
        this.field2653 = arg0;
        this.field2654 = arg2;
        if (arg1) {
            this.field2655 = this.field2654.method2634(0, 0);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V", line = 17)
    public final void method1249(boolean arg0) {
        if (this.field2655 != null) {
            this.field2655.method3429((byte) -128);
            this.field2655 = null;
        }
        if (arg0) {
            this.method1250((byte) 11);
        }
        if (this.field2653 != null) {
            this.field2653.method3429((byte) -65);
            this.field2653 = null;
        }
        if (this.field2654 != null) {
            this.field2654.method3429((byte) -83);
            this.field2654 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Z", line = 45)
    public final boolean method1250(byte arg0) {
        if (arg0 == -87) {
            return this.field2654 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I", line = 55)
    public final int method1251(int arg0, int arg1) {
        return arg1 == -2691 ? this.field2654.Present(arg0) : -97;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 65)
    public class196(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method1248(arg1, true, arg0);
    }
}
