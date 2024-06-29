import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class410;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class308 extends class550 implements class383 {

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    private int field4168;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    private int field4165;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    private int field4166;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field4167;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1481(int arg0) {
        if (arg0 <= 42) {
            this.method1482(42);
        }
        return this.field4167;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
    public final void method1482(int arg0) {
        if (arg0 == -31490) {
            this.field7609.method1593(this, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZLfj;)V")
    public final void method1483(boolean arg0, class564 arg1) {
        super.method1483(arg0, arg1);
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lbv;Ldk;III[B)V")
    public class308(class256 arg0, class435 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class608.field8759, false, arg3 * arg4 * arg2);
        this.field4168 = arg3;
        this.field4165 = arg2;
        this.field4166 = arg4;
        this.field4167 = this.field7609.field3527.method2437(arg2, arg3, arg4, 1, 0, class256.method1625(this.field7608, arg1, (byte) -101), 1);
        PixelBuffer var7 = this.field7609.field3542;
        int var8 = this.field4167.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class410.method2428(var8, (byte) 125)) {
            int var9 = this.field7606.field6194 * this.field4165;
            int var10 = this.field4168 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2446(arg5, 0, 0, this.field4168 * var9 * this.field4166);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var15 = 0; var15 < this.field4166; var15++) {
                        var7.method2446(arg5, var10 * var15, var11 * var15, var10);
                    }
                } else {
                    for (int var13 = 0; var13 < this.field4166; var13++) {
                        for (int var14 = 0; var14 < this.field4168; var14++) {
                            var7.method2446(arg5, var9 * var14 + var10 * var13, var11 * var13 - -(var12 * var14), var9);
                        }
                    }
                }
            }
            this.field4167.UnlockBox(0);
        }
    }
}
