import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class451;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class575 extends class283 implements class544 {

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    private int field7382;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    private int field7380;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    private int field7381;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field7383;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method33(int arg0) {
        if (arg0 >= -49) {
            this.method43(-26, null);
        }
        return this.field7383;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILju;)V")
    public final void method43(int arg0, class115 arg1) {
        super.method43(arg0, arg1);
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
    public final void method41(int arg0) {
        this.field3589.method335(this, (byte) -60);
        if (arg0 != -9341) {
            this.method41(-110);
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Ltga;Lnh;III[B)V")
    public class575(class54 arg0, class699 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class100.field1288, false, arg2 * arg4 * arg3);
        this.field7382 = arg4;
        this.field7380 = arg2;
        this.field7381 = arg3;
        this.field7383 = this.field3589.field696.method2466(arg2, arg3, arg4, 1, 0, class54.method338(22, this.field3586, arg1), 1);
        PixelBuffer var7 = this.field3589.field690;
        int var8 = this.field7383.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class451.method2482(14528, var8)) {
            int var9 = this.field3587.field9683 * this.field7380;
            int var10 = this.field7381 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2480(arg5, 0, 0, this.field7381 * var9 * this.field7382);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var15 = 0; var15 < this.field7382; var15++) {
                        var7.method2480(arg5, var10 * var15, var11 * var15, var10);
                    }
                } else {
                    for (int var13 = 0; var13 < this.field7382; var13++) {
                        for (int var14 = 0; var14 < this.field7381; var14++) {
                            var7.method2480(arg5, var9 * var14 + var10 * var13, var11 * var13 + var12 * var14, var9);
                        }
                    }
                }
            }
            this.field7383.UnlockBox(0);
        }
    }
}
