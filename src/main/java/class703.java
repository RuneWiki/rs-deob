import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class703 {

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field9977;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field9978;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field9979;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public final void method3937(int arg0) {
        if (this.field9977 != null) {
            this.field9977.method2063((byte) 47);
            this.field9977 = null;
        }
        if (this.field9978 != null) {
            this.field9978.method2063((byte) -87);
            this.field9978 = null;
        }
        int var2 = -18 / ((arg0 - 53) / 39);
        if (this.field9979 != null) {
            this.field9979.method2063((byte) 115);
            this.field9979 = null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;B)V")
    public final void method3938(IDirect3DSwapChain arg0, IDirect3DSurface arg1, byte arg2) {
        if (arg2 <= 27) {
            this.field9979 = null;
        }
        this.field9979 = arg0;
        this.field9978 = arg1;
        this.field9977 = this.field9979.method3750(0, 0);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)I")
    public final int method3939(int arg0, int arg1) {
        if (arg0 >= -8) {
            this.method3939(-82, 70);
        }
        return this.field9979.Present(arg1);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)Z")
    public final boolean method3940(boolean arg0) {
        if (arg0) {
            this.field9978 = null;
        }
        return this.field9979 != null;
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class703(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method3938(arg0, arg1, (byte) 107);
    }
}
