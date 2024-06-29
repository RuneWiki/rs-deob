import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class504 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6820;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field6821;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field6822;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public final void method2851(int arg0) {
        int var2 = 57 / ((30 - arg0) / 44);
        if (this.field6821 != null) {
            this.field6821.method1547((byte) -62);
            this.field6821 = null;
        }
        if (this.field6820 != null) {
            this.field6820.method1547((byte) -47);
            this.field6820 = null;
        }
        if (this.field6822 != null) {
            this.field6822.method1547((byte) -49);
            this.field6822 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)I")
    public final int method2852(int arg0, byte arg1) {
        if (arg1 != -15) {
            this.field6822 = null;
        }
        return this.field6822.Present(arg0);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLjagdx/IDirect3DSurface;Ljagdx/IDirect3DSwapChain;)V")
    public final void method2853(byte arg0, IDirect3DSurface arg1, IDirect3DSwapChain arg2) {
        if (arg0 <= 45) {
            this.method2852(-98, (byte) -66);
        }
        this.field6822 = arg2;
        this.field6820 = arg1;
        this.field6821 = this.field6822.method3798(0, 0);
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)Z")
    public final boolean method2854(int arg0) {
        if (arg0 == 10850) {
            return this.field6822 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class504(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method2853((byte) 76, arg1, arg0);
    }
}
