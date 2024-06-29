import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class737;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class320 extends class687 implements class295 {

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "I")
    private int field4749;

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field4750;

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lhb;IZ[[I)V", line = 4)
    public class320(class585 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class238.field3830, class121.field1859, arg2 && arg0.field8270, arg1 * arg1 * 6);
        this.field4749 = arg1;
        if (this.field9697) {
            this.field4750 = this.field9695.field8281.method4122(this.field4749, 0, 1024, 21, 1);
        } else {
            this.field4750 = this.field9695.field8281.method4122(this.field4749, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field9695.field8260;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field4750.LockRect(var6, 0, 0, 0, this.field4749, this.field4749, 0, var5);
            if (class737.method4132(-95, var7)) {
                int var8 = var5.getRowPitch();
                if ((this.field4749 * 4) == var8) {
                    var5.method4112(arg3[var6], 0, 0, this.field4749 * this.field4749);
                } else {
                    for (int var9 = 0; var9 < this.field4749; var9++) {
                        var5.method4112(arg3[var6], this.field4749 * var9, var8 * var9, this.field4749);
                    }
                }
                this.field4750.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lgca;I)V", line = 56)
    public final void method204(class206 arg0, int arg1) {
        int var3 = 100 % ((-arg1 - 2) / 39);
        super.method204(arg0, 121);
    }

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 66)
    public final IDirect3DBaseTexture method1860(byte arg0) {
        if (arg0 != -66) {
            this.field4750 = null;
        }
        return this.field4750;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V", line = 78)
    public final void method195(int arg0) {
        int var2 = -6 % ((46 - arg0) / 52);
        this.field9695.method3379(false, this);
    }
}
