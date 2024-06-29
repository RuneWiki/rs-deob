import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class508;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class500 extends class413 implements class623 {

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    private int field7240;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    private int field7242;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    private int field7241;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field7243;

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lsd;Leu;III[B)V")
    public class500(class103 arg0, class505 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class157.field1952, false, arg2 * arg3 * arg4);
        this.field7240 = arg2;
        this.field7242 = arg3;
        this.field7241 = arg4;
        this.field7243 = this.field6087.field1151.method3845(arg2, arg3, arg4, 1, 0, class103.method864(this.field6091, arg1, (byte) 64), 1);
        PixelBuffer var7 = this.field6087.field1169;
        int var8 = this.field7243.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class508.method3822(var8, true)) {
            int var9 = this.field6089.field7318 * this.field7240;
            int var10 = this.field7242 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method3847(arg5, 0, 0, this.field7241 * var9 * this.field7242);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var15 = 0; var15 < this.field7241; var15++) {
                        var7.method3847(arg5, var10 * var15, var11 * var15, var10);
                    }
                } else {
                    for (int var13 = 0; var13 < this.field7241; var13++) {
                        for (int var14 = 0; var14 < this.field7242; var14++) {
                            var7.method3847(arg5, var9 * var14 + var10 * var13, var11 * var13 + var12 * var14, var9);
                        }
                    }
                }
            }
            this.field7243.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method3152(byte arg0) {
        if (arg0 > -84) {
            this.method2776(false, null);
        }
        return this.field7243;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public final void method2774(int arg0) {
        this.field6087.method863(arg0 - 15361, this);
        if (arg0 != 15416) {
            this.field7243 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZLli;)V")
    public final void method2776(boolean arg0, class451 arg1) {
        if (!arg0) {
            this.field7243 = null;
        }
        super.method2776(arg0, arg1);
    }
}
