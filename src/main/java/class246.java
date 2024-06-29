import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class246 {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field3176;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field3177;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field3175;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
    public final void method1474(boolean arg0) {
        if (this.field3176 != null) {
            this.field3176.method3542(119);
            this.field3176 = null;
        }
        if (!arg0) {
            this.method1477(-60);
        }
        if (this.field3177 != null) {
            this.field3177.method3542(91);
            this.field3177 = null;
        }
        if (this.field3175 != null) {
            this.field3175.method3542(96);
            this.field3175 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljagdx/IDirect3DSwapChain;BLjagdx/IDirect3DSurface;)V")
    public final void method1475(IDirect3DSwapChain arg0, byte arg1, IDirect3DSurface arg2) {
        this.field3177 = arg2;
        this.field3175 = arg0;
        if (arg1 <= 19) {
            this.field3175 = null;
        }
        this.field3176 = this.field3175.method2479(0, 0);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)I")
    public final int method1476(int arg0, boolean arg1) {
        return arg1 ? this.field3175.Present(arg0) : 111;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class246(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method1475(arg0, (byte) 81, arg1);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Z")
    public final boolean method1477(int arg0) {
        if (arg0 == -11206) {
            return this.field3175 != null;
        } else {
            return true;
        }
    }
}
