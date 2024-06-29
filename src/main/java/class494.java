import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class494 {

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6896;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6898;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field6897;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method2869(byte arg0) {
        if (arg0 != -95) {
            this.field6898 = null;
        }
        return this.field6897 != null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;Ljagdx/IDirect3DSwapChain;B)V", line = 14)
    public final void method2870(IDirect3DSurface arg0, IDirect3DSwapChain arg1, byte arg2) {
        this.field6897 = arg1;
        this.field6898 = arg0;
        if (arg2 <= 72) {
            this.field6896 = null;
        }
        this.field6896 = this.field6897.method2667(0, 0);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BI)I", line = 26)
    public final int method2871(byte arg0, int arg1) {
        if (arg0 <= 71) {
            this.field6897 = null;
        }
        return this.field6897.Present(arg1);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)V", line = 37)
    public final void method2872(boolean arg0) {
        if (this.field6896 != null) {
            this.field6896.method3597(100);
            this.field6896 = null;
        }
        if (!arg0) {
            this.field6897 = null;
        }
        if (this.field6898 != null) {
            this.field6898.method3597(100);
            this.field6898 = null;
        }
        if (this.field6897 != null) {
            this.field6897.method3597(100);
            this.field6897 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 64)
    public class494(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method2870(arg1, arg0, (byte) 115);
    }
}
