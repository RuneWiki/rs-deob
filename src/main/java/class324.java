import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class398;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class324 extends class175 implements class560 {

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    private int field4802;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    private int field4805;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    private int field4803;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field4804;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lqq;I)V", line = 7)
    public final void method379(class599 arg0, int arg1) {
        super.method379(arg0, arg1);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;", line = 14)
    public final IDirect3DBaseTexture method1179(boolean arg0) {
        if (arg0) {
            this.field4802 = 52;
        }
        return this.field4804;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V", line = 24)
    public final void method380(int arg0) {
        this.field2663.method329(this, false);
        if (arg0 <= 3) {
            this.field4802 = 105;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lnca;Ljt;III[B)V", line = 37)
    public class324(class54 arg0, class489 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class629.field9208, false, arg3 * arg4 * arg2);
        this.field4802 = arg3;
        this.field4805 = arg2;
        this.field4803 = arg4;
        this.field4804 = this.field2663.field676.method2394(arg2, arg3, arg4, 1, 0, class54.method315((byte) 21, this.field2662, arg1), 1);
        PixelBuffer var7 = this.field2663.field674;
        int var8 = this.field4804.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class398.method2384(7155, var8)) {
            int var9 = this.field2665.field7400 * this.field4805;
            int var10 = this.field4802 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2380(arg5, 0, 0, this.field4802 * var9 * this.field4803);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field4803; var13++) {
                        var7.method2380(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field4803; var14++) {
                        for (int var15 = 0; var15 < this.field4802; var15++) {
                            var7.method2380(arg5, var9 * var15 + var10 * var14, var11 * var14 - -(var12 * var15), var9);
                        }
                    }
                }
            }
            this.field4804.UnlockBox(0);
        }
    }
}
