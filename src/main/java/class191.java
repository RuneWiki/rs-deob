import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class757;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class191 extends class366 implements class162 {

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    private int field2381;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    private int field2378;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    private int field2379;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field2380;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BLcw;)V")
    public final void method280(byte arg0, class144 arg1) {
        int var3 = -75 % ((arg0 - 18) / 60);
        super.method280((byte) -75, arg1);
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lsga;Lpb;III[B)V")
    public class191(class608 arg0, class2 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class612.field8616, false, arg2 * arg3 * arg4);
        this.field2381 = arg3;
        this.field2378 = arg2;
        this.field2379 = arg4;
        this.field2380 = this.field5266.field8555.method4184(arg2, arg3, arg4, 1, 0, class608.method3516(arg1, false, this.field5269), 1);
        PixelBuffer var7 = this.field5266.field8579;
        int var8 = this.field2380.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class757.method4192(var8, (byte) -109)) {
            int var9 = this.field5267.field17 * this.field2378;
            int var10 = this.field2381 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method120(arg5, 0, 0, this.field2381 * this.field2379 * var9);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field2379; var13++) {
                        var7.method120(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field2379; var14++) {
                        for (int var15 = 0; var15 < this.field2381; var15++) {
                            var7.method120(arg5, var9 * var15 + var10 * var14, var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field2380.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method334(int arg0) {
        if (arg0 > -10) {
            this.field2380 = null;
        }
        return this.field2380;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V")
    public final void method279(int arg0) {
        if (arg0 != 15320) {
            this.field2381 = -22;
        }
        this.field5266.method3523(true, this);
    }
}
