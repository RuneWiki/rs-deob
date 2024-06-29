import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class492 {

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field7000;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field7001;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field7002;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)I", line = 5)
    public final int method2944(int arg0, byte arg1) {
        if (arg1 != -110) {
            this.method2944(22, (byte) 54);
        }
        return this.field7002.Present(arg0);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)Z", line = 16)
    public final boolean method2945(byte arg0) {
        if (arg0 != -4) {
            this.method2947(119, null, null);
        }
        return this.field7002 != null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V", line = 27)
    public final void method2946(boolean arg0) {
        if (this.field7000 != null) {
            this.field7000.method3460(2266);
            this.field7000 = null;
        }
        if (!arg0) {
            this.field7001 = null;
        }
        if (this.field7001 != null) {
            this.field7001.method3460(2266);
            this.field7001 = null;
        }
        if (this.field7002 != null) {
            this.field7002.method3460(2266);
            this.field7002 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjagdx/IDirect3DSurface;Ljagdx/IDirect3DSwapChain;)V", line = 56)
    public final void method2947(int arg0, IDirect3DSurface arg1, IDirect3DSwapChain arg2) {
        this.field7001 = arg1;
        this.field7002 = arg2;
        this.field7000 = this.field7002.method2437(arg0, 0);
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 63)
    public class492(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method2947(0, arg1, arg0);
    }
}
