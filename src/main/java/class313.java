import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class482;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class313 extends class669 implements class369 {

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    private int field4337;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    private int field4334;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    private int field4335;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field4336;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
    public final void method80(int arg0) {
        if (arg0 == 20276) {
            this.field9086.method1452((byte) 71, this);
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1787(int arg0) {
        if (arg0 != -4406) {
            this.field4336 = null;
        }
        return this.field4336;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Ltg;Lbda;III[B)V")
    public class313(class229 arg0, class505 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class309.field4305, false, arg2 * arg3 * arg4);
        this.field4337 = arg4;
        this.field4334 = arg2;
        this.field4335 = arg3;
        this.field4336 = this.field9086.field3093.method2892(arg2, arg3, arg4, 1, 0, class229.method1482(this.field9090, arg1, -63), 1);
        PixelBuffer var7 = this.field9086.field3075;
        int var8 = this.field4336.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class482.method2873(-110, var8)) {
            int var9 = this.field9089.field7239 * this.field4334;
            int var10 = this.field4335 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2899(arg5, 0, 0, this.field4335 * var9 * this.field4337);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var15 = 0; var15 < this.field4337; var15++) {
                        var7.method2899(arg5, var10 * var15, var11 * var15, var10);
                    }
                } else {
                    for (int var13 = 0; var13 < this.field4337; var13++) {
                        for (int var14 = 0; var14 < this.field4335; var14++) {
                            var7.method2899(arg5, var10 * var13 + (var9 * var14), var11 * var13 + var12 * var14, var9);
                        }
                    }
                }
            }
            this.field4336.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Llda;I)V")
    public final void method81(class485 arg0, int arg1) {
        super.method81(arg0, arg1);
        if (arg1 != -21969) {
            this.method81(null, -98);
        }
    }
}
