import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class560 {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field7827;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field7829;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field7828;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)Z")
    public final boolean method3145(byte arg0) {
        if (arg0 != -70) {
            this.field7828 = null;
        }
        return this.field7828 != null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public final void method3146(int arg0) {
        if (this.field7827 != null) {
            this.field7827.method3212((byte) 87);
            this.field7827 = null;
        }
        if (this.field7829 != null) {
            this.field7829.method3212((byte) 87);
            this.field7829 = null;
        }
        if (this.field7828 != null) {
            this.field7828.method3212((byte) 87);
            this.field7828 = null;
        }
        if (arg0 != 0) {
            this.field7829 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)I")
    public final int method3147(int arg0, int arg1) {
        return arg0 == 0 ? this.field7828.Present(arg1) : -94;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;Ljagdx/IDirect3DSwapChain;B)V")
    public final void method3148(IDirect3DSurface arg0, IDirect3DSwapChain arg1, byte arg2) {
        this.field7829 = arg0;
        if (arg2 != -83) {
            this.field7827 = null;
        }
        this.field7828 = arg1;
        this.field7827 = this.field7828.method2374(0, 0);
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class560(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method3148(arg1, arg0, (byte) -83);
    }
}
