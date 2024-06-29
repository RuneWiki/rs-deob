import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class507;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class427 extends class681 implements class307 {

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    private int field5812;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    private int field5813;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    private int field5814;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field5811;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILtda;)V", line = 6)
    public final void method2563(int arg0, class663 arg1) {
        super.method2563(arg0, arg1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 15)
    public final void method2561(int arg0) {
        int var2 = 8 / ((arg0 + 77) / 43);
        this.field9450.method1528(this, 31231);
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lta;Lvea;III[B)V", line = 24)
    public class427(class224 arg0, class288 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class34.field457, false, arg2 * arg3 * arg4);
        this.field5812 = arg3;
        this.field5813 = arg2;
        this.field5814 = arg4;
        this.field5811 = this.field9450.field3450.method3059(arg2, arg3, arg4, 1, 0, class224.method1527((byte) 41, arg1, this.field9449), 1);
        PixelBuffer var7 = this.field9450.field3451;
        int var8 = this.field5811.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class507.method3053(var8, -1)) {
            int var9 = this.field9448.field4228 * this.field5813;
            int var10 = this.field5812 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method3078(arg5, 0, 0, this.field5812 * var9 * this.field5814);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field5814; var13++) {
                        var7.method3078(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field5814; var14++) {
                        for (int var15 = 0; var15 < this.field5812; var15++) {
                            var7.method3078(arg5, var9 * var15 + var10 * var14, var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field5811.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;", line = 96)
    public final IDirect3DBaseTexture method2576(boolean arg0) {
        if (!arg0) {
            this.field5812 = -13;
        }
        return this.field5811;
    }
}
