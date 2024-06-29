import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class564 {

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field7470;

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field7471;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field7469;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)Z")
    public final boolean method3092(int arg0) {
        if (arg0 == 0) {
            return this.field7469 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)V")
    public final void method3093(int arg0) {
        if (this.field7470 != null) {
            this.field7470.method3494(-49);
            this.field7470 = null;
        }
        if (arg0 != 0) {
            this.method3094(58, null, null);
        }
        if (this.field7471 != null) {
            this.field7471.method3494(-63);
            this.field7471 = null;
        }
        if (this.field7469 != null) {
            this.field7469.method3494(-85);
            this.field7469 = null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class564(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method3094(0, arg1, arg0);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILjagdx/IDirect3DSurface;Ljagdx/IDirect3DSwapChain;)V")
    public final void method3094(int arg0, IDirect3DSurface arg1, IDirect3DSwapChain arg2) {
        this.field7471 = arg1;
        this.field7469 = arg2;
        this.field7470 = this.field7469.method2583(0, arg0);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IB)I")
    public final int method3095(int arg0, byte arg1) {
        if (arg1 > -118) {
            this.method3095(1, (byte) 126);
        }
        return this.field7469.Present(arg0);
    }
}
