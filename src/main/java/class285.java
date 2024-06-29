import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class742;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class285 extends class566 implements class361 {

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "I")
    private int field4106;

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
    private int field4104;

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "I")
    private int field4105;

    @OriginalMember(owner = "client!tfa", name = "i", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field4107;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1211(byte arg0) {
        if (arg0 != -15) {
            this.method1211((byte) -84);
        }
        return this.field4107;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Ltha;B)V")
    public final void method1121(class372 arg0, byte arg1) {
        super.method1121(arg0, arg1);
    }

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "(I)V")
    public final void method1118(int arg0) {
        if (arg0 >= 105) {
            this.field7844.method2428(this, 0);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lkfa;Liv;III[B)V")
    public class285(class386 arg0, class25 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class38.field472, false, arg2 * arg3 * arg4);
        this.field4106 = arg3;
        this.field4104 = arg4;
        this.field4105 = arg2;
        this.field4107 = this.field7844.field5542.method4129(arg2, arg3, arg4, 1, 0, class386.method2416(this.field7845, arg1, -775), 1);
        PixelBuffer var7 = this.field7844.field5557;
        int var8 = this.field4107.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class742.method4137(var8, -1)) {
            int var9 = this.field7847.field313 * this.field4105;
            int var10 = this.field4106 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2620(arg5, 0, 0, this.field4106 * var9 * this.field4104);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field4104; var13++) {
                        var7.method2620(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field4104; var14++) {
                        for (int var15 = 0; var15 < this.field4106; var15++) {
                            var7.method2620(arg5, var9 * var15 + var10 * var14, var11 * var14 - -(var12 * var15), var9);
                        }
                    }
                }
            }
            this.field4107.UnlockBox(0);
        }
    }
}
