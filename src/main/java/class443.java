import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class446;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class443 extends class461 implements class217 {

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
    private int field6141;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
    private int field6139;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
    private int field6138;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field6140;

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lega;Lpn;III[B)V", line = 4)
    public class443(class662 arg0, class692 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class309.field4271, false, arg3 * arg4 * arg2);
        this.field6141 = arg2;
        this.field6139 = arg3;
        this.field6138 = arg4;
        this.field6140 = this.field6355.field9273.method2545(arg2, arg3, arg4, 1, 0, class662.method3731(38, arg1, this.field6354), 1);
        PixelBuffer var7 = this.field6355.field9290;
        int var8 = this.field6140.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class446.method2528((byte) -119, var8)) {
            int var9 = this.field6353.field9861 * this.field6141;
            int var10 = this.field6139 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2548(arg5, 0, 0, this.field6139 * var9 * this.field6138);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var15 = 0; var15 < this.field6138; var15++) {
                        var7.method2548(arg5, var10 * var15, var11 * var15, var10);
                    }
                } else {
                    for (int var13 = 0; var13 < this.field6138; var13++) {
                        for (int var14 = 0; var14 < this.field6139; var14++) {
                            var7.method2548(arg5, var10 * var13 + (var9 * var14), var11 * var13 + var12 * var14, var9);
                        }
                    }
                }
            }
            this.field6140.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Z)V", line = 79)
    public final void method1271(boolean arg0) {
        if (arg0) {
            this.method2393((byte) -31);
        }
        this.field6355.method3730(this, 14511);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 90)
    public final IDirect3DBaseTexture method2393(byte arg0) {
        if (arg0 < 48) {
            this.method1271(true);
        }
        return this.field6140;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ldca;B)V", line = 100)
    public final void method1259(class160 arg0, byte arg1) {
        if (arg1 < 66) {
            this.field6141 = 60;
        }
        super.method1259(arg0, (byte) 114);
    }
}
