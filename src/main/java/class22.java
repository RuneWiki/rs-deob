import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class22 {

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field264;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field265;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field266;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 5)
    public final void method265(int arg0) {
        if (this.field265 != null) {
            this.field265.method3176(true);
            this.field265 = null;
        }
        if (this.field264 != null) {
            this.field264.method3176(true);
            this.field264 = null;
        }
        if (arg0 == 31586 && this.field266 != null) {
            this.field266.method3176(true);
            this.field266 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 33)
    public final void method266(int arg0, IDirect3DSwapChain arg1, IDirect3DSurface arg2) {
        this.field264 = arg2;
        this.field266 = arg1;
        this.field265 = this.field266.method3155(arg0, 0);
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 42)
    public class22(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method266(0, arg0, arg1);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I", line = 51)
    public final int method267(int arg0, int arg1) {
        if (arg1 <= 86) {
            this.field264 = null;
        }
        return this.field266.Present(arg0);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)Z", line = 61)
    public final boolean method268(int arg0) {
        if (arg0 != -30483) {
            this.method265(102);
        }
        return this.field266 != null;
    }
}
