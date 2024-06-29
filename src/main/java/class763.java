import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class508;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class763 extends class413 implements class380 {

    @OriginalMember(owner = "client!eja", name = "g", descriptor = "I")
    private int field11045;

    @OriginalMember(owner = "client!eja", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field11044;

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(ZLli;)V", line = 4)
    public final void method2776(boolean arg0, class451 arg1) {
        super.method2776(arg0, arg1);
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(I)V", line = 15)
    public final void method2774(int arg0) {
        this.field6087.method879(21249, this);
        if (arg0 != 15416) {
            this.method2774(-102);
        }
    }

    @OriginalMember(owner = "client!eja", name = "<init>", descriptor = "(Lsd;IZ[[I)V", line = 24)
    public class763(class103 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class215.field3276, class157.field1952, arg2 && arg0.field1168, arg1 * 6 * arg1);
        this.field11045 = arg1;
        if (this.field6090) {
            this.field11044 = this.field6087.field1151.method3836(this.field11045, 0, 1024, 21, 1);
        } else {
            this.field11044 = this.field6087.field1151.method3836(this.field11045, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field6087.field1169;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field11044.LockRect(var6, 0, 0, 0, this.field11045, this.field11045, 0, var5);
            if (class508.method3822(var7, true)) {
                int var8 = var5.getRowPitch();
                if (this.field11045 * 4 == var8) {
                    var5.method3849(arg3[var6], 0, 0, this.field11045 * this.field11045);
                } else {
                    for (int var9 = 0; var9 < this.field11045; var9++) {
                        var5.method3849(arg3[var6], this.field11045 * var9, var8 * var9, this.field11045);
                    }
                }
                this.field11044.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!eja", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 75)
    public final IDirect3DBaseTexture method3152(byte arg0) {
        return arg0 > -84 ? (IDirect3DBaseTexture) null : this.field11044;
    }
}
