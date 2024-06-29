import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class80 {

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field1227;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field1229;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field1228;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)Z")
    public final boolean method827(int arg0) {
        if (arg0 == 0) {
            return this.field1228 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
    public final void method828(int arg0) {
        if (this.field1227 != null) {
            this.field1227.method5123(-112);
            this.field1227 = null;
        }
        if (this.field1229 != null) {
            this.field1229.method5123(14);
            this.field1229 = null;
        }
        if (this.field1228 != null) {
            this.field1228.method5123(-109);
            this.field1228 = null;
        }
        int var2 = 14 / ((arg0 - 77) / 40);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;ZLjagdx/IDirect3DSwapChain;)V")
    public final void method829(IDirect3DSurface arg0, boolean arg1, IDirect3DSwapChain arg2) {
        this.field1229 = arg0;
        this.field1228 = arg2;
        this.field1227 = this.field1228.method3846(0, 0);
        if (!arg1) {
            this.method829(null, true, null);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)I")
    public final int method830(int arg0, int arg1) {
        if (arg0 != 12890) {
            this.method830(-9, 36);
        }
        return this.field1228.Present(arg1);
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class80(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method829(arg1, true, arg0);
    }
}
