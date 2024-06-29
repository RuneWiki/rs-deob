import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class757;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class186 extends class22 implements class232 {

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    private int field2809;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    private int field2812;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    private int field2811;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field2810;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V", line = 5)
    public final void method1159(int arg0) {
        if (arg0 != 16033) {
            this.field2810 = null;
        }
        this.field252.method56(this, (byte) -52);
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Llj;Lnea;III[B)V", line = 17)
    public class186(class8 arg0, class600 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class629.field8918, false, arg3 * arg4 * arg2);
        this.field2809 = arg3;
        this.field2812 = arg2;
        this.field2811 = arg4;
        this.field2810 = this.field252.field100.method4173(arg2, arg3, arg4, 1, 0, class8.method100(arg1, this.field254, (byte) -116), 1);
        PixelBuffer var7 = this.field252.field115;
        int var8 = this.field2810.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class757.method4191(-2005530600, var8)) {
            int var9 = this.field255.field8555 * this.field2812;
            int var10 = this.field2809 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method236(arg5, 0, 0, this.field2809 * var9 * this.field2811);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var15 = 0; var15 < this.field2811; var15++) {
                        var7.method236(arg5, var10 * var15, var11 * var15, var10);
                    }
                } else {
                    for (int var13 = 0; var13 < this.field2811; var13++) {
                        for (int var14 = 0; var14 < this.field2809; var14++) {
                            var7.method236(arg5, var9 * var14 + var10 * var13, var11 * var13 + var12 * var14, var9);
                        }
                    }
                }
            }
            this.field2810.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILrha;)V", line = 88)
    public final void method211(int arg0, class455 arg1) {
        super.method211(arg0, arg1);
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 96)
    public final IDirect3DBaseTexture method210(byte arg0) {
        if (arg0 != -78) {
            this.method211(-94, null);
        }
        return this.field2810;
    }
}
