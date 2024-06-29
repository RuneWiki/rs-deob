import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class16 {

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field157;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field158;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field156;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)Z")
    public final boolean method65(byte arg0) {
        if (arg0 != 21) {
            this.field157 = null;
        }
        return this.field156 != null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)I")
    public final int method66(int arg0, byte arg1) {
        if (arg1 != 90) {
            this.method65((byte) 35);
        }
        return this.field156.Present(arg0);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
    public final void method67(int arg0) {
        if (this.field157 != null) {
            this.field157.method2546(true);
            this.field157 = null;
        }
        if (this.field158 != null) {
            this.field158.method2546(true);
            this.field158 = null;
        }
        if (this.field156 != null) {
            this.field156.method2546(true);
            this.field156 = null;
        }
        int var2 = -41 % ((arg0 + 21) / 34);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;ILjagdx/IDirect3DSwapChain;)V")
    public final void method68(IDirect3DSurface arg0, int arg1, IDirect3DSwapChain arg2) {
        this.field156 = arg2;
        if (arg1 < 14) {
            this.field156 = null;
        }
        this.field158 = arg0;
        this.field157 = this.field156.method4194(0, 0);
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class16(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method68(arg1, 50, arg0);
    }
}
