import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class127 {

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field1763;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "Ljagdx/IDirect3DSurface;")
    private IDirect3DSurface field1764;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "Ljagdx/IDirect3DSwapChain;")
    private IDirect3DSwapChain field1765;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method748(byte arg0) {
        if (arg0 <= 0) {
            return false;
        } else {
            return this.field1765 != null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)I", line = 15)
    public final int method749(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method748((byte) 30);
        }
        return this.field1765.Present(arg0);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V", line = 25)
    public final void method750(int arg0) {
        if (this.field1763 != null) {
            this.field1763.method3454((byte) 127);
            this.field1763 = null;
        }
        if (this.field1764 != null) {
            this.field1764.method3454((byte) 123);
            this.field1764 = null;
        }
        int var2 = -123 % ((arg0 - 67) / 42);
        if (this.field1765 != null) {
            this.field1765.method3454((byte) 127);
            this.field1765 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(BLjagdx/IDirect3DSurface;Ljagdx/IDirect3DSwapChain;)V", line = 53)
    public final void method751(byte arg0, IDirect3DSurface arg1, IDirect3DSwapChain arg2) {
        if (arg0 < 40) {
            this.method749(109, -105);
        }
        this.field1764 = arg1;
        this.field1765 = arg2;
        this.field1763 = this.field1765.method2436(0, 0);
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V", line = 63)
    public class127(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
        this.method751((byte) 125, arg1, arg0);
    }
}
