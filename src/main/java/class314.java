import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class314 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field4354;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field4356;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field4355;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
    public final int method2050(int arg0, int arg1) {
        return arg1 >= -121 ? 4 : this.field4355.Present(arg0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public final void method2051(int arg0) {
        if (arg0 != 12122) {
            this.method2050(104, 5);
        }
        if (this.field4356 != null) {
            this.field4356.method2637(-10573);
            this.field4356 = null;
        }
        if (this.field4354 != null) {
            this.field4354.method2637(-10573);
            this.field4354 = null;
        }
        if (this.field4355 != null) {
            this.field4355.method2637(-10573);
            this.field4355 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjagdx/IDirect3DSurface;Ljagdx/IDirect3DSwapChain;)V")
    public final void method2052(int arg0, IDirect3DSurface arg1, IDirect3DSwapChain arg2) {
        this.field4354 = arg1;
        this.field4355 = arg2;
        this.field4356 = this.field4355.method4135(0, arg0);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)Z")
    public final boolean method2053(int arg0) {
        int var2 = 19 % ((-arg0 - 34) / 60);
        return this.field4355 != null;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V")
    public class314(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method2052(0, arg1, arg0);
    }
}
