import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class507;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class448 extends class335 implements class582 {

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    private int field6341;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    private int field6339;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    private int field6342;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field6340;

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lki;Lofa;III[B)V", line = 3)
    public class448(class735 arg0, class345 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class770.field10614, false, arg2 * arg4 * arg3);
        this.field6341 = arg3;
        this.field6339 = arg2;
        this.field6342 = arg4;
        this.field6340 = this.field4987.field10253.method2961(arg2, arg3, arg4, 1, 0, class735.method4116(arg1, 50, this.field4988), 1);
        PixelBuffer var7 = this.field4987.field10272;
        int var8 = this.field6340.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class507.method2947(var8, -46)) {
            int var9 = this.field4991.field5077 * this.field6339;
            int var10 = this.field6341 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2972(arg5, 0, 0, this.field6342 * var9 * this.field6341);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field6342; var13++) {
                        var7.method2972(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field6342; var14++) {
                        for (int var15 = 0; var15 < this.field6341; var15++) {
                            var7.method2972(arg5, var9 * var15 + var10 * var14, var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field6340.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 75)
    public final void method2686(int arg0) {
        this.field4987.method4118(this, (byte) 102);
        if (arg0 != 32104) {
            this.field6340 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lcr;Z)V", line = 88)
    public final void method2161(class597 arg0, boolean arg1) {
        if (arg1) {
            this.method2686(2);
        }
        super.method2161(arg0, arg1);
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 100)
    public final IDirect3DBaseTexture method2162(int arg0) {
        return arg0 == -26076 ? this.field6340 : (IDirect3DBaseTexture) null;
    }
}
