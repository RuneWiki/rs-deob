import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class308 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field4216;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field4218;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field4217;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 4)
    public final void method1967(byte arg0) {
        if (arg0 < 8) {
            return;
        }
        if (this.field4218 != null) {
            this.field4218.method3925(-6517);
            this.field4218 = null;
        }
        if (this.field4216 != null) {
            this.field4216.method3925(-6517);
            this.field4216 = null;
        }
        if (this.field4217 != null) {
            this.field4217.method3925(-6517);
            this.field4217 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I", line = 31)
    public final int method1968(int arg0, int arg1) {
        if (arg0 != -9364) {
            this.field4216 = null;
        }
        return this.field4217.Present(arg1);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)Z", line = 44)
    public final boolean method1969(byte arg0) {
        int var2 = -1 % ((-arg0 - 76) / 50);
        return this.field4217 != null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;ILjagdx/IDirect3DSwapChain;)V", line = 52)
    public final void method1970(IDirect3DSurface arg0, int arg1, IDirect3DSwapChain arg2) {
        this.field4217 = arg2;
        this.field4216 = arg0;
        this.field4218 = this.field4217.method2932(arg1, 0);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 60)
    public class308(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method1970(arg1, 0, arg0);
    }
}
