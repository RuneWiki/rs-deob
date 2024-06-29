import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class771;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class697 extends class371 implements class546 {

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
    private int field9243;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
    private int field9245;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
    private int field9242;

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field9244;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V")
    public final void method773(byte arg0) {
        if (arg0 >= -12) {
            this.field9242 = -53;
        }
        this.field4541.method1616(this, (byte) -17);
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method2125(byte arg0) {
        if (arg0 > -103) {
            this.method774((byte) 39, null);
        }
        return this.field9244;
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lcka;Ltn;III[B)V")
    public class697(class248 arg0, class749 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class73.field990, false, arg2 * arg3 * arg4);
        this.field9243 = arg2;
        this.field9245 = arg3;
        this.field9242 = arg4;
        this.field9244 = this.field4541.field3402.method4184(arg2, arg3, arg4, 1, 0, class248.method1620(-122, this.field4543, arg1), 1);
        PixelBuffer var7 = this.field4541.field3387;
        int var8 = this.field9244.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class771.method4195(false, var8)) {
            int var9 = this.field4540.field10221 * this.field9243;
            int var10 = this.field9245 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2529(arg5, 0, 0, this.field9245 * this.field9242 * var9);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field9242; var13++) {
                        var7.method2529(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field9242; var14++) {
                        for (int var15 = 0; var15 < this.field9245; var15++) {
                            var7.method2529(arg5, var9 * var15 + var10 * var14, var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field9244.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(BLqt;)V")
    public final void method774(byte arg0, class525 arg1) {
        super.method774((byte) 19, arg1);
        int var3 = 96 / ((arg0 + 66) / 35);
    }
}
