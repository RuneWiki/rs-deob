import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class441;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class668 extends class346 implements class560 {

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    private int field9527;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    private int field9529;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    private int field9526;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field9528;

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lgb;Lvj;III[B)V")
    public class668(class197 arg0, class402 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class271.field3429, false, arg2 * arg3 * arg4);
        this.field9527 = arg4;
        this.field9529 = arg3;
        this.field9526 = arg2;
        this.field9528 = this.field4512.field2376.method2443(arg2, arg3, arg4, 1, 0, class197.method1158(this.field4514, arg1, -1), 1);
        PixelBuffer var7 = this.field4512.field2377;
        int var8 = this.field9528.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class441.method2451(var8, (byte) -106)) {
            int var9 = this.field4515.field5354 * this.field9526;
            int var10 = this.field9529 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2446(arg5, 0, 0, this.field9529 * var9 * this.field9527);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field9527; var13++) {
                        var7.method2446(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field9527; var14++) {
                        for (int var15 = 0; var15 < this.field9529; var15++) {
                            var7.method2446(arg5, var9 * var15 + var10 * var14, var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field9528.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
    public final void method841(int arg0) {
        this.field4512.method1152(-20733, this);
        if (arg0 >= -124) {
            this.method1900((byte) -25);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1900(byte arg0) {
        return arg0 <= 54 ? (IDirect3DBaseTexture) null : this.field9528;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILup;)V")
    public final void method842(int arg0, class249 arg1) {
        super.method842(arg0 ^ 0x0, arg1);
        if (arg0 != 16327) {
            this.field9529 = 102;
        }
    }
}
