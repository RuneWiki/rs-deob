import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class191 {

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field2979;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field2980;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field2981;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)I", line = 4)
    public final int method1352(int arg0, int arg1) {
        if (arg0 > -113) {
            this.field2979 = null;
        }
        return this.field2981.Present(arg1);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)Z", line = 16)
    public final boolean method1353(int arg0) {
        int var2 = -38 / ((-arg0 - 23) / 46);
        return this.field2981 != null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;Ljagdx/IDirect3DSwapChain;B)V", line = 24)
    public final void method1354(IDirect3DSurface arg0, IDirect3DSwapChain arg1, byte arg2) {
        this.field2981 = arg1;
        this.field2980 = arg0;
        this.field2979 = this.field2981.method3781(0, 0);
        if (arg2 != -40) {
            this.method1354(null, null, (byte) 27);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V", line = 37)
    public final void method1355(boolean arg0) {
        if (!arg0) {
            this.method1352(-96, 24);
        }
        if (this.field2979 != null) {
            this.field2979.method2012((byte) -6);
            this.field2979 = null;
        }
        if (this.field2980 != null) {
            this.field2980.method2012((byte) -6);
            this.field2980 = null;
        }
        if (this.field2981 != null) {
            this.field2981.method2012((byte) -6);
            this.field2981 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 65)
    public class191(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method1354(arg1, arg0, (byte) -40);
    }
}
