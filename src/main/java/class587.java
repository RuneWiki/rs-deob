import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class587 {

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field8435;

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field8436;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field8437;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(ZLjagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 4)
    public final void method3488(boolean arg0, IDirect3DSwapChain arg1, IDirect3DSurface arg2) {
        this.field8437 = arg1;
        this.field8435 = arg2;
        if (arg0) {
            this.method3489(90, (byte) -73);
        }
        this.field8436 = this.field8437.method4123(0, 0);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IB)I", line = 19)
    public final int method3489(int arg0, byte arg1) {
        int var3 = 6 % ((-arg1 - 47) / 61);
        return this.field8437.Present(arg0);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Z)V", line = 28)
    public final void method3490(boolean arg0) {
        if (this.field8436 != null) {
            this.field8436.method2573((byte) -105);
            this.field8436 = null;
        }
        if (this.field8435 != null) {
            this.field8435.method2573((byte) -106);
            this.field8435 = null;
        }
        if (!arg0) {
            this.method3490(false);
        }
        if (this.field8437 != null) {
            this.field8437.method2573((byte) -119);
            this.field8437 = null;
        }
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 54)
    public class587(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method3488(false, arg0, arg1);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)Z", line = 63)
    public final boolean method3491(int arg0) {
        if (arg0 != 0) {
            this.field8437 = null;
        }
        return this.field8437 != null;
    }
}
