import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class383 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field5396;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field5397;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field5398;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)I")
    public final int method2248(boolean arg0, int arg1) {
        return arg0 ? this.field5398.Present(arg1) : 100;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;BLjagdx/IDirect3DSwapChain;)V")
    public final void method2249(IDirect3DSurface arg0, byte arg1, IDirect3DSwapChain arg2) {
        this.field5398 = arg2;
        int var4 = 97 / ((arg1 + 10) / 60);
        this.field5396 = arg0;
        this.field5397 = this.field5398.method2738(0, 0);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)Z")
    public final boolean method2250(int arg0) {
        if (arg0 != 0) {
            this.method2248(true, 65);
        }
        return this.field5398 != null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public final void method2251(byte arg0) {
        if (this.field5397 != null) {
            this.field5397.method3801(49);
            this.field5397 = null;
        }
        int var2 = 24 / ((arg0 + 10) / 48);
        if (this.field5396 != null) {
            this.field5396.method3801(99);
            this.field5396 = null;
        }
        if (this.field5398 != null) {
            this.field5398.method3801(63);
            this.field5398 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class383(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method2249(arg1, (byte) -113, arg0);
    }
}
