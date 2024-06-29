import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class411;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class548 extends class75 implements class462 {

    @OriginalMember(owner = "client!av", name = "h", descriptor = "I")
    private int field8187;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "I")
    private int field8185;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    private int field8188;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field8186;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(B)V")
    public final void method22(byte arg0) {
        int var2 = 19 / ((-arg0 - 72) / 49);
        this.field1005.method3328(this, (byte) 81);
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method588(int arg0) {
        return arg0 == 281 ? this.field8186 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lwda;Laq;III[B)V")
    public class548(class547 arg0, class141 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class194.field2874, false, arg2 * arg4 * arg3);
        this.field8187 = arg4;
        this.field8185 = arg2;
        this.field8188 = arg3;
        this.field8186 = this.field1005.field8175.method2424(arg2, arg3, arg4, 1, 0, class547.method3321(this.field1006, (byte) 78, arg1), 1);
        PixelBuffer var7 = this.field1005.field8176;
        int var8 = this.field8186.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class411.method2436(var8, (byte) 52)) {
            int var9 = this.field1002.field1992 * this.field8185;
            int var10 = this.field8188 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2438(arg5, 0, 0, this.field8188 * this.field8187 * var9);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field8187; var13++) {
                        var7.method2438(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field8187; var14++) {
                        for (int var15 = 0; var15 < this.field8188; var15++) {
                            var7.method2438(arg5, var9 * var15 + var10 * var14, var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field8186.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lpw;I)V")
    public final void method31(class606 arg0, int arg1) {
        super.method31(arg0, arg1);
    }
}
