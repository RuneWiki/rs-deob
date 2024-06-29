import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class509;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class767 extends class234 implements class69 {

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    private int field10557;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field10558;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;", line = 4)
    public final IDirect3DBaseTexture method1440(boolean arg0) {
        if (!arg0) {
            this.method1439(null, 119);
        }
        return this.field10558;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lko;I)V", line = 14)
    public final void method1439(class531 arg0, int arg1) {
        super.method1439(arg0, -36);
        if (arg1 > -19) {
            this.method1726(-81);
        }
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V", line = 27)
    public final void method1726(int arg0) {
        if (arg0 > -93) {
            this.field10557 = -48;
        }
        this.field2785.method35(this, (byte) 125);
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lus;IZ[[I)V", line = 38)
    public class767(class1 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class141.field1759, class748.field10384, arg2 && arg0.field3, arg1 * 6 * arg1);
        this.field10557 = arg1;
        if (this.field2784) {
            this.field10558 = this.field2785.field27.method3053(this.field10557, 0, 1024, 21, 1);
        } else {
            this.field10558 = this.field2785.field27.method3053(this.field10557, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field2785.field19;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field10558.LockRect(var6, 0, 0, 0, this.field10557, this.field10557, 0, var5);
            if (class509.method3048(-1, var7)) {
                int var8 = var5.getRowPitch();
                if (this.field10557 * 4 == var8) {
                    var5.method3072(arg3[var6], 0, 0, this.field10557 * this.field10557);
                } else {
                    for (int var9 = 0; var9 < this.field10557; var9++) {
                        var5.method3072(arg3[var6], this.field10557 * var9, var8 * var9, this.field10557);
                    }
                }
                this.field10558.UnlockRect(var6, 0);
            }
        }
    }
}
