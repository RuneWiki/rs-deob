import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class737;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class299 extends class85 implements class722 {

    @OriginalMember(owner = "client!bha", name = "i", descriptor = "I")
    private int field3909;

    @OriginalMember(owner = "client!bha", name = "f", descriptor = "I")
    private int field3906;

    @OriginalMember(owner = "client!bha", name = "g", descriptor = "I")
    private int field3907;

    @OriginalMember(owner = "client!bha", name = "h", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field3908;

    @OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Lrd;Lkea;III[B)V")
    public class299(class549 arg0, class77 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class720.field10164, false, arg2 * arg3 * arg4);
        this.field3909 = arg3;
        this.field3906 = arg4;
        this.field3907 = arg2;
        this.field3908 = this.field1185.field7746.method4107(arg2, arg3, arg4, 1, 0, class549.method3279(this.field1184, arg1, -101), 1);
        PixelBuffer var7 = this.field1185.field7738;
        int var8 = this.field3908.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class737.method4096(111, var8)) {
            int var9 = this.field1186.field1054 * this.field3907;
            int var10 = this.field3909 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2556(arg5, 0, 0, this.field3909 * var9 * this.field3906);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field3906; var13++) {
                        var7.method2556(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field3906; var14++) {
                        for (int var15 = 0; var15 < this.field3909; var15++) {
                            var7.method2556(arg5, var9 * var15 + var10 * var14, var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field3908.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)V")
    public final void method770(int arg0) {
        this.field1185.method3275((byte) -113, this);
        if (arg0 != -27531) {
            this.field3908 = null;
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(BLtb;)V")
    public final void method521(byte arg0, class657 arg1) {
        super.method521((byte) -110, arg1);
        if (arg0 > -65) {
            this.method522(false);
        }
    }

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method522(boolean arg0) {
        if (arg0) {
            this.field3907 = -107;
        }
        return this.field3908;
    }
}
