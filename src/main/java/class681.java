import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class672;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class681 extends class459 implements class695 {

    @OriginalMember(owner = "client!it", name = "i", descriptor = "I")
    private int field9620;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "I")
    private int field9618;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "I")
    private int field9619;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field9617;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lkk;I)V", line = 7)
    public final void method1215(class238 arg0, int arg1) {
        super.method1215(arg0, arg1);
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lik;Lwu;III[B)V", line = 17)
    public class681(class107 arg0, class149 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class106.field1573, false, arg2 * arg3 * arg4);
        this.field9620 = arg3;
        this.field9618 = arg4;
        this.field9619 = arg2;
        this.field9617 = this.field6617.field1600.method3757(arg2, arg3, arg4, 1, 0, class107.method810(arg1, this.field6619, 22), 1);
        PixelBuffer var7 = this.field6617.field1588;
        int var8 = this.field9617.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class672.method3775(var8, 10067)) {
            int var9 = this.field6618.field2109 * this.field9619;
            int var10 = this.field9620 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method163(arg5, 0, 0, this.field9620 * this.field9618 * var9);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field9618; var13++) {
                        var7.method163(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field9618; var14++) {
                        for (int var15 = 0; var15 < this.field9620; var15++) {
                            var7.method163(arg5, var9 * var15 + var10 * var14, var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field9617.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V", line = 88)
    public final void method1213(int arg0) {
        this.field6617.method815((byte) -116, this);
        if (arg0 < 23) {
            this.method1213(-25);
        }
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 98)
    public final IDirect3DBaseTexture method1214(int arg0) {
        if (arg0 > -14) {
            this.method1214(33);
        }
        return this.field9617;
    }
}
