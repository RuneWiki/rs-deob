import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class447;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class50 extends class430 implements class69 {

    @OriginalMember(owner = "client!gda", name = "i", descriptor = "I")
    private int field675;

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "I")
    private int field672;

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field673;

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lto;Los;III[B)V", line = 4)
    public class50(class8 arg0, class408 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class134.field2197, false, arg3 * arg4 * arg2);
        this.field675 = arg4;
        this.field674 = arg3;
        this.field672 = arg2;
        this.field673 = this.field6547.field131.method2831(arg2, arg3, arg4, 1, 0, class8.method165((byte) -118, this.field6548, arg1), 1);
        PixelBuffer var7 = this.field6547.field148;
        int var8 = this.field673.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class447.method2814(var8, 141953135)) {
            int var9 = this.field6549.field6299 * this.field672;
            int var10 = this.field674 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2834(arg5, 0, 0, this.field674 * var9 * this.field675);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field675; var13++) {
                        var7.method2834(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field675; var14++) {
                        for (int var15 = 0; var15 < this.field674; var15++) {
                            var7.method2834(arg5, var9 * var15 + var10 * var14, var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field673.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ldca;B)V", line = 76)
    public final void method246(class161 arg0, byte arg1) {
        int var3 = -98 % ((arg1 - 64) / 39);
        super.method246(arg0, (byte) 122);
    }

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "(I)V", line = 86)
    public final void method247(int arg0) {
        if (arg0 != -4112) {
            this.method247(-121);
        }
        this.field6547.method139(this, arg0 ^ 0x107C);
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 101)
    public final IDirect3DBaseTexture method575(byte arg0) {
        int var2 = -69 % ((-arg0 - 83) / 34);
        return this.field673;
    }
}
