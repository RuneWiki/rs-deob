import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class177 {

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field2189;

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field2190;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field2188;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)Z")
    public final boolean method1204(byte arg0) {
        if (arg0 != 14) {
            this.field2189 = null;
        }
        return this.field2188 != null;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;BLjagdx/IDirect3DSwapChain;)V")
    public final void method1205(IDirect3DSurface arg0, byte arg1, IDirect3DSwapChain arg2) {
        if (arg1 == 21) {
            this.field2188 = arg2;
            this.field2190 = arg0;
            this.field2189 = this.field2188.method3068(0, 0);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Z)V")
    public final void method1206(boolean arg0) {
        if (this.field2189 != null) {
            this.field2189.method4003(true);
            this.field2189 = null;
        }
        if (this.field2190 != null) {
            this.field2190.method4003(true);
            this.field2190 = null;
        }
        if (!arg0) {
            this.method1207(-10, true);
        }
        if (this.field2188 != null) {
            this.field2188.method4003(true);
            this.field2188 = null;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IZ)I")
    public final int method1207(int arg0, boolean arg1) {
        if (arg1) {
            this.field2188 = null;
        }
        return this.field2188.Present(arg0);
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class177(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method1205(arg1, (byte) 21, arg0);
    }
}
