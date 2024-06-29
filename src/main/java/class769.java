import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class507;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class769 extends class335 implements class320 {

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    private int field10606;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field10605;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lcr;Z)V", line = 4)
    public final void method2161(class597 arg0, boolean arg1) {
        super.method2161(arg0, arg1);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 11)
    public final void method2686(int arg0) {
        if (arg0 == 32104) {
            this.field4987.method4123(-31430, this);
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lki;IZ[[I)V", line = 20)
    public class769(class735 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class12.field247, class770.field10614, arg2 && arg0.field10275, arg1 * arg1 * 6);
        this.field10606 = arg1;
        if (this.field4990) {
            this.field10605 = this.field4987.field10253.method2958(this.field10606, 0, 1024, 21, 1);
        } else {
            this.field10605 = this.field4987.field10253.method2958(this.field10606, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field4987.field10272;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field10605.LockRect(var6, 0, 0, 0, this.field10606, this.field10606, 0, var5);
            if (class507.method2947(var7, -9)) {
                int var8 = var5.getRowPitch();
                if (this.field10606 * 4 == var8) {
                    var5.method2974(arg3[var6], 0, 0, this.field10606 * this.field10606);
                } else {
                    for (int var9 = 0; var9 < this.field10606; var9++) {
                        var5.method2974(arg3[var6], this.field10606 * var9, var8 * var9, this.field10606);
                    }
                }
                this.field10605.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 71)
    public final IDirect3DBaseTexture method2162(int arg0) {
        if (arg0 != -26076) {
            this.method2162(58);
        }
        return this.field10605;
    }
}
