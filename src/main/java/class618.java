import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class618 {

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field8251;

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field8252;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field8250;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(ILjagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 5)
    public final void method3379(int arg0, IDirect3DSwapChain arg1, IDirect3DSurface arg2) {
        this.field8250 = arg1;
        this.field8251 = arg2;
        this.field8252 = this.field8250.method2765(0, 0);
        if (arg0 != 14721) {
            this.field8251 = null;
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(IZ)I", line = 18)
    public final int method3380(int arg0, boolean arg1) {
        if (!arg1) {
            this.field8250 = null;
        }
        return this.field8250.Present(arg0);
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)Z", line = 29)
    public final boolean method3381(int arg0) {
        if (arg0 >= -119) {
            this.field8250 = null;
        }
        return this.field8250 != null;
    }

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "(I)V", line = 39)
    public final void method3382(int arg0) {
        if (this.field8252 != null) {
            this.field8252.method3757((byte) 126);
            this.field8252 = null;
        }
        if (arg0 != 0) {
            return;
        }
        if (this.field8251 != null) {
            this.field8251.method3757((byte) -128);
            this.field8251 = null;
        }
        if (this.field8250 != null) {
            this.field8250.method3757((byte) 87);
            this.field8250 = null;
        }
    }

    @OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 66)
    public class618(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method3379(14721, arg0, arg1);
    }
}
