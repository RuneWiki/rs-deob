import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class223 {

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field3104;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field3105;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field3106;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V", line = 4)
    public final void method1409(int arg0) {
        if (arg0 < 47) {
            return;
        }
        if (this.field3104 != null) {
            this.field3104.method3495(-86);
            this.field3104 = null;
        }
        if (this.field3105 != null) {
            this.field3105.method3495(-62);
            this.field3105 = null;
        }
        if (this.field3106 != null) {
            this.field3106.method3495(-57);
            this.field3106 = null;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)I", line = 31)
    public final int method1410(int arg0, int arg1) {
        if (arg0 > -84) {
            this.method1410(48, 27);
        }
        return this.field3106.Present(arg1);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;Ljagdx/IDirect3DSwapChain;I)V", line = 41)
    public final void method1411(IDirect3DSurface arg0, IDirect3DSwapChain arg1, int arg2) {
        if (arg2 != -12630) {
            this.method1411(null, null, 52);
        }
        this.field3105 = arg0;
        this.field3106 = arg1;
        this.field3104 = this.field3106.method2547(0, 0);
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(I)Z", line = 56)
    public final boolean method1412(int arg0) {
        if (arg0 == 26362) {
            return this.field3106 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 64)
    public class223(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method1411(arg1, arg0, -12630);
    }
}
