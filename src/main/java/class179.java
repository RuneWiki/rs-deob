import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class179 {

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field2355;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field2356;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field2354;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)I", line = 6)
    public final int method1218(int arg0, int arg1) {
        if (arg1 >= -57) {
            this.field2354 = null;
        }
        return this.field2354.Present(arg0);
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 15)
    public class179(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method1220(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V", line = 24)
    public final void method1219(int arg0) {
        if (this.field2355 != null) {
            this.field2355.method3820(true);
            this.field2355 = null;
        }
        if (this.field2356 != null) {
            this.field2356.method3820(true);
            this.field2356 = null;
        }
        if (this.field2354 != null) {
            this.field2354.method3820(true);
            this.field2354 = null;
        }
        if (arg0 < 56) {
            this.method1220(null, 24, null);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ljagdx/IDirect3DSwapChain;ILjagdx/IDirect3DSurface;)V", line = 53)
    public final void method1220(IDirect3DSwapChain arg0, int arg1, IDirect3DSurface arg2) {
        this.field2356 = arg2;
        this.field2354 = arg0;
        this.field2355 = this.field2354.method2975(0, arg1);
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)Z", line = 62)
    public final boolean method1221(int arg0) {
        if (arg0 <= 46) {
            this.field2356 = null;
        }
        return this.field2354 != null;
    }
}
