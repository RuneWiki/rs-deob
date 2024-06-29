import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class451;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class564 extends class298 implements class524 {

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    private int field8250;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field8249;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method772(byte arg0) {
        if (arg0 < 118) {
            this.method773(83);
        }
        return this.field8249;
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lhg;IZ[[I)V")
    public class564(class644 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class121.field2214, class2.field372, arg2 && arg0.field9271, arg1 * 6 * arg1);
        this.field8250 = arg1;
        if (this.field4456) {
            this.field8249 = this.field4455.field9267.method2719(this.field8250, 0, 1024, 21, 1);
        } else {
            this.field8249 = this.field4455.field9267.method2719(this.field8250, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field4455.field9272;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field8249.LockRect(var6, 0, 0, 0, this.field8250, this.field8250, 0, var5);
            if (class451.method2727(var7, 3102)) {
                int var8 = var5.getRowPitch();
                if (this.field8250 * 4 == var8) {
                    var5.method2723(arg3[var6], 0, 0, this.field8250 * this.field8250);
                } else {
                    for (int var9 = 0; var9 < this.field8250; var9++) {
                        var5.method2723(arg3[var6], this.field8250 * var9, var8 * var9, this.field8250);
                    }
                }
                this.field8249.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)V")
    public final void method773(int arg0) {
        this.field4455.method3663(this, (byte) 45);
        if (arg0 != -23993) {
            this.field8249 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZLgw;)V")
    public final void method774(boolean arg0, class155 arg1) {
        super.method774(arg0, arg1);
        if (!arg0) {
            this.method774(false, null);
        }
    }
}
