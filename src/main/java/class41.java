import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class41 {

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field546;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field548;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field547;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method250(byte arg0) {
        if (arg0 != 14) {
            this.field546 = null;
        }
        return this.field547 != null;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(B)V", line = 16)
    public final void method251(byte arg0) {
        int var2 = 78 % ((arg0 - 36) / 36);
        if (this.field548 != null) {
            this.field548.method3435(6168);
            this.field548 = null;
        }
        if (this.field546 != null) {
            this.field546.method3435(6168);
            this.field546 = null;
        }
        if (this.field547 != null) {
            this.field547.method3435(6168);
            this.field547 = null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljagdx/IDirect3DSurface;Ljagdx/IDirect3DSwapChain;B)V", line = 43)
    public final void method252(IDirect3DSurface arg0, IDirect3DSwapChain arg1, byte arg2) {
        this.field547 = arg1;
        int var4 = 28 / ((arg2 + 15) / 47);
        this.field546 = arg0;
        this.field548 = this.field547.method2303(0, 0);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZI)I", line = 55)
    public final int method253(boolean arg0, int arg1) {
        if (!arg0) {
            this.method251((byte) 18);
        }
        return this.field547.Present(arg1);
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 64)
    public class41(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method252(arg1, arg0, (byte) 112);
    }
}
