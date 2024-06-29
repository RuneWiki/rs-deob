import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class109 {

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field1764;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field1765;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field1766;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public final void method1023(int arg0) {
        if (this.field1764 != null) {
            this.field1764.method3643(false);
            this.field1764 = null;
        }
        if (arg0 <= 73) {
            this.method1024(-69, null, null);
        }
        if (this.field1765 != null) {
            this.field1765.method3643(false);
            this.field1765 = null;
        }
        if (this.field1766 != null) {
            this.field1766.method3643(false);
            this.field1766 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILjagdx/IDirect3DSurface;Ljagdx/IDirect3DSwapChain;)V")
    public final void method1024(int arg0, IDirect3DSurface arg1, IDirect3DSwapChain arg2) {
        this.field1766 = arg2;
        this.field1765 = arg1;
        this.field1764 = this.field1766.method2833(0, arg0);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)I")
    public final int method1025(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1765 = null;
        }
        return this.field1766.Present(arg1);
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class109(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method1024(0, arg1, arg0);
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)Z")
    public final boolean method1026(int arg0) {
        if (arg0 != 0) {
            this.field1766 = null;
        }
        return this.field1766 != null;
    }
}
