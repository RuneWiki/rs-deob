import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class675;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class161 extends class142 implements class444 {

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    private int field2006;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    private int field2008;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    private int field2007;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field2009;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1070(byte arg0) {
        if (arg0 != -72) {
            this.method1141(1);
        }
        return this.field2009;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public final void method1141(int arg0) {
        if (arg0 != 1896) {
            this.method1071(null, 121);
        }
        this.field1866.method565(arg0 - 2020, this);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lmba;Lpw;III[B)V")
    public class161(class70 arg0, class89 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class6.field48, false, arg2 * arg3 * arg4);
        this.field2006 = arg2;
        this.field2008 = arg4;
        this.field2007 = arg3;
        this.field2009 = this.field1866.field958.method3710(arg2, arg3, arg4, 1, 0, class70.method568(arg1, -1, this.field1864), 1);
        PixelBuffer var7 = this.field1866.field959;
        int var8 = this.field2009.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class675.method3703((byte) -58, var8)) {
            int var9 = this.field1867.field1177 * this.field2006;
            int var10 = this.field2007 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method125(arg5, 0, 0, this.field2007 * var9 * this.field2008);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var15 = 0; var15 < this.field2008; var15++) {
                        var7.method125(arg5, var10 * var15, var11 * var15, var10);
                    }
                } else {
                    for (int var13 = 0; var13 < this.field2008; var13++) {
                        for (int var14 = 0; var14 < this.field2007; var14++) {
                            var7.method125(arg5, var9 * var14 + var10 * var13, var11 * var13 - -(var12 * var14), var9);
                        }
                    }
                }
            }
            this.field2009.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lgv;I)V")
    public final void method1071(class39 arg0, int arg1) {
        super.method1071(arg0, arg1);
    }
}
