import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class396;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class456 extends class463 implements class228 {

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
    private int field6584;

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
    private int field6585;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "I")
    private int field6583;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field6582;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 4)
    public final IDirect3DBaseTexture method1538(int arg0) {
        if (arg0 != -29358) {
            this.method1538(11);
        }
        return this.field6582;
    }

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "(I)V", line = 16)
    public final void method841(int arg0) {
        if (arg0 < 68) {
            this.field6585 = 35;
        }
        this.field6696.method116(this, 5);
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lde;Lkl;III[B)V", line = 25)
    public class456(class15 arg0, class468 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class343.field4922, false, arg2 * arg3 * arg4);
        this.field6584 = arg2;
        this.field6585 = arg3;
        this.field6583 = arg4;
        this.field6582 = this.field6696.field182.method2433(arg2, arg3, arg4, 1, 0, class15.method156(arg1, 1, this.field6694), 1);
        PixelBuffer var7 = this.field6696.field181;
        int var8 = this.field6582.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class396.method2412((byte) -115, var8)) {
            int var9 = this.field6698.field6743 * this.field6584;
            int var10 = this.field6585 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2410(arg5, 0, 0, this.field6585 * var9 * this.field6583);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field6583; var13++) {
                        var7.method2410(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field6583; var14++) {
                        for (int var15 = 0; var15 < this.field6585; var15++) {
                            var7.method2410(arg5, var10 * var14 + (var9 * var15), var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field6582.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lem;I)V", line = 99)
    public final void method840(class599 arg0, int arg1) {
        int var3 = 92 / ((-arg1 - 72) / 48);
        super.method840(arg0, -122);
    }
}
