import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class446;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class607 extends class10 implements class456 {

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    private int field8555;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    private int field8554;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    private int field8553;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field8552;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lgaa;I)V")
    public final void method54(class267 arg0, int arg1) {
        super.method54(arg0, arg1);
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method55(int arg0) {
        if (arg0 != 26691) {
            this.field8553 = -51;
        }
        return this.field8552;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Ltb;Llca;III[B)V")
    public class607(class364 arg0, class597 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class218.field3050, false, arg2 * arg4 * arg3);
        this.field8555 = arg2;
        this.field8554 = arg4;
        this.field8553 = arg3;
        this.field8552 = this.field99.field5204.method2659(arg2, arg3, arg4, 1, 0, class364.method2213((byte) -71, this.field96, arg1), 1);
        PixelBuffer var7 = this.field99.field5202;
        int var8 = this.field8552.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class446.method2640(-113, var8)) {
            int var9 = this.field95.field8431 * this.field8555;
            int var10 = this.field8553 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2661(arg5, 0, 0, this.field8553 * var9 * this.field8554);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field8554; var13++) {
                        var7.method2661(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field8554; var14++) {
                        for (int var15 = 0; var15 < this.field8553; var15++) {
                            var7.method2661(arg5, var9 * var15 + var10 * var14, var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field8552.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public final void method861(int arg0) {
        this.field99.method2209((byte) -92, this);
        if (arg0 >= -42) {
            this.method55(-98);
        }
    }
}
