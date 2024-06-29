import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class484;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class733 extends class491 implements class568 {

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    private int field10257;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    private int field10258;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    private int field10256;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field10255;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 4)
    public final void method1335(int arg0) {
        this.field7008.method3256(this, -29497);
        if (arg0 != 193) {
            this.method1335(37);
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lfi;Lpd;III[B)V", line = 13)
    public class733(class558 arg0, class259 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class256.field3677, false, arg2 * arg3 * arg4);
        this.field10257 = arg4;
        this.field10258 = arg3;
        this.field10256 = arg2;
        this.field10255 = this.field7008.field7959.method2900(arg2, arg3, arg4, 1, 0, class558.method3260((byte) -32, arg1, this.field7006), 1);
        PixelBuffer var7 = this.field7008.field7979;
        int var8 = this.field10255.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class484.method2892((byte) 55, var8)) {
            int var9 = this.field7007.field3704 * this.field10256;
            int var10 = this.field10258 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2918(arg5, 0, 0, this.field10258 * var9 * this.field10257);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field10257; var13++) {
                        var7.method2918(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field10257; var14++) {
                        for (int var15 = 0; var15 < this.field10258; var15++) {
                            var7.method2918(arg5, var9 * var15 + var10 * var14, var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field10255.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 85)
    public final IDirect3DBaseTexture method1401(byte arg0) {
        if (arg0 != -35) {
            this.field10255 = null;
        }
        return this.field10255;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLej;)V", line = 99)
    public final void method1342(byte arg0, class123 arg1) {
        super.method1342((byte) 104, arg1);
        if (arg0 <= 33) {
            this.method1342((byte) -45, null);
        }
    }
}
