import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class605 {

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field8549;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field8551;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field8550;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)I")
    public final int method3512(int arg0, byte arg1) {
        return arg1 == -127 ? this.field8550.Present(arg0) : -47;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
    public final void method3513(int arg0) {
        if (this.field8551 != null) {
            this.field8551.method3883((byte) 108);
            this.field8551 = null;
        }
        if (this.field8549 != null) {
            this.field8549.method3883((byte) 85);
            this.field8549 = null;
        }
        if (arg0 != 0) {
            this.field8551 = null;
        }
        if (this.field8550 != null) {
            this.field8550.method3883((byte) 109);
            this.field8550 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILjagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public final void method3514(int arg0, IDirect3DSwapChain arg1, IDirect3DSurface arg2) {
        this.field8549 = arg2;
        this.field8550 = arg1;
        this.field8551 = this.field8550.method2917(arg0, 0);
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)Z")
    public final boolean method3515(int arg0) {
        if (arg0 == -32628) {
            return this.field8550 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class605(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method3514(0, arg0, arg1);
    }
}
