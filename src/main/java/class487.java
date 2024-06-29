import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class487 {

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6973;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6974;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field6972;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILjagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public final void method2937(int arg0, IDirect3DSwapChain arg1, IDirect3DSurface arg2) {
        if (arg0 != -20008) {
            this.field6974 = null;
        }
        this.field6972 = arg1;
        this.field6974 = arg2;
        this.field6973 = this.field6972.method2916(0, 0);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)Z")
    public final boolean method2938(boolean arg0) {
        if (arg0) {
            return this.field6972 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BI)I")
    public final int method2939(byte arg0, int arg1) {
        if (arg0 <= 16) {
            this.field6972 = null;
        }
        return this.field6972.Present(arg1);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
    public final void method2940(int arg0) {
        if (this.field6973 != null) {
            this.field6973.method3834(-31315);
            this.field6973 = null;
        }
        int var2 = -17 % ((arg0 + 35) / 37);
        if (this.field6974 != null) {
            this.field6974.method3834(-31315);
            this.field6974 = null;
        }
        if (this.field6972 != null) {
            this.field6972.method3834(-31315);
            this.field6972 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class487(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method2937(-20008, arg0, arg1);
    }
}
