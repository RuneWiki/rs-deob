import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class723;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class343 extends class231 implements class375 {

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "I")
    private int field4448;

    @OriginalMember(owner = "client!eca", name = "i", descriptor = "I")
    private int field4451;

    @OriginalMember(owner = "client!eca", name = "h", descriptor = "I")
    private int field4450;

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field4449;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lbba;I)V", line = 9)
    public final void method1466(class721 arg0, int arg1) {
        if (arg1 == 13584) {
            super.method1466(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 21)
    public final IDirect3DBaseTexture method1465(int arg0) {
        return arg0 == 13367 ? this.field4449 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "(I)V", line = 31)
    public final void method1793(int arg0) {
        this.field3005.method1718(this, (byte) -57);
        if (arg0 != 3323) {
            this.field4451 = -38;
        }
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lcu;Lem;III[B)V", line = 40)
    public class343(class287 arg0, class610 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class240.field3093, false, arg2 * arg4 * arg3);
        this.field4448 = arg2;
        this.field4451 = arg3;
        this.field4450 = arg4;
        this.field4449 = this.field3005.field3643.method4020(arg2, arg3, arg4, 1, 0, class287.method1722(this.field3004, arg1, -343), 1);
        PixelBuffer var7 = this.field3005.field3642;
        int var8 = this.field4449.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class723.method3998(false, var8)) {
            int var9 = this.field3003.field8447 * this.field4448;
            int var10 = this.field4451 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method281(arg5, 0, 0, this.field4451 * var9 * this.field4450);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var15 = 0; var15 < this.field4450; var15++) {
                        var7.method281(arg5, var10 * var15, var11 * var15, var10);
                    }
                } else {
                    for (int var13 = 0; var13 < this.field4450; var13++) {
                        for (int var14 = 0; var14 < this.field4451; var14++) {
                            var7.method281(arg5, var9 * var14 + var10 * var13, var11 * var13 + var12 * var14, var9);
                        }
                    }
                }
            }
            this.field4449.UnlockBox(0);
        }
    }
}
