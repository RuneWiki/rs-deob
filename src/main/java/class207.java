import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class484;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class207 extends class491 implements class465 {

    @OriginalMember(owner = "client!dga", name = "f", descriptor = "I")
    private int field3044;

    @OriginalMember(owner = "client!dga", name = "h", descriptor = "I")
    private int field3046;

    @OriginalMember(owner = "client!dga", name = "j", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field3048;

    @OriginalMember(owner = "client!dga", name = "g", descriptor = "Z")
    public boolean field3045;

    @OriginalMember(owner = "client!dga", name = "i", descriptor = "Z")
    public boolean field3047;

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(I)I")
    public final int method1264(int arg0) {
        if (arg0 != 21110) {
            this.field3045 = false;
        }
        return this.field3046;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(BLej;)V")
    public final void method1342(byte arg0, class123 arg1) {
        if (arg0 < 33) {
            this.method1264(96);
        }
        super.method1342((byte) 46, arg1);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I[IIIIII)V")
    public final void method1271(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != -4685) {
            this.field3044 = -59;
        }
        if (class752.field10511 != this.field7007 || class256.field3677 != this.field7006) {
            throw new RuntimeException();
        }
        PixelBuffer var8 = this.field7008.field7979;
        int var9 = this.field3048.LockRect(0, arg0, arg3, arg6, arg2, 16, var8);
        if (!class484.method2892((byte) 105, var9)) {
            return;
        }
        int var10 = var8.getRowPitch();
        if ((arg6 * 4) == var10) {
            var8.method2921(arg1, arg4, 0, arg1.length);
        } else {
            for (int var11 = 0; var11 < arg2; var11++) {
                var8.method2921(arg1, arg4 + (arg6 * var11), var10 * var11, arg6);
            }
        }
        this.field3048.UnlockRect(0);
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lfi;Lpd;Lok;II)V")
    public class207(class558 arg0, class259 arg1, class256 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field7008.field7977) {
            this.field3046 = arg4;
            this.field3044 = arg3;
        } else {
            this.field3044 = class432.method2684(arg3, -21774);
            this.field3046 = class432.method2684(arg4, -21774);
        }
        this.field3048 = this.field7008.field7959.method2902(arg3, arg4, 1, 0, class558.method3260((byte) -82, this.field7007, this.field7006), 1);
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lfi;IIZ[III)V")
    public class207(class558 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class752.field10511, class256.field3677, arg3 && arg0.field7962, arg1 * arg2);
        if (this.field7008.field7977) {
            this.field3044 = arg1;
            this.field3046 = arg2;
        } else {
            this.field3044 = class432.method2684(arg1, -21774);
            this.field3046 = class432.method2684(arg2, -21774);
        }
        if (arg3) {
            this.field3048 = this.field7008.field7959.method2902(this.field3044, this.field3046, 0, 1024, 21, 1);
        } else {
            this.field3048 = this.field7008.field7959.method2902(this.field3044, this.field3046, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field7008.field7979;
        int var9 = this.field3048.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class484.method2892((byte) 88, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method2920(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2920(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field3048.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)I")
    public final int method1262(byte arg0) {
        return arg0 >= -37 ? 36 : this.field3044;
    }

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1401(byte arg0) {
        if (arg0 != -35) {
            this.method1401((byte) 111);
        }
        return this.field3048;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIIII[II)V")
    public final void method1268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        if (class752.field10511 != this.field7007 || class256.field3677 != this.field7006) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field7008.field7979;
        int var10 = -82 % ((-arg7 - 22) / 62);
        int var11 = this.field3048.LockRect(0, arg2, arg5, arg1, arg3, 0, var9);
        if (!class484.method2892((byte) 112, var11)) {
            return;
        }
        int var12 = var9.getRowPitch();
        if (arg1 * 4 == var12 && arg1 == arg4) {
            var9.method2920(arg6, arg0, 0, arg1 * arg3);
        } else {
            for (int var13 = 0; var13 < arg3; var13++) {
                var9.method2920(arg6, arg4 * var13 + arg0, var12 * var13, arg1);
            }
        }
        this.field3048.UnlockRect(0);
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lfi;Lpd;IIZ[BII)V")
    public class207(class558 arg0, class259 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class256.field3677, arg4 && arg0.field7962, arg2 * arg3);
        if (this.field7008.field7977) {
            this.field3046 = arg3;
            this.field3044 = arg2;
        } else {
            this.field3044 = class432.method2684(arg2, -21774);
            this.field3046 = class432.method2684(arg3, -21774);
        }
        if (arg4) {
            this.field3048 = this.field7008.field7959.method2902(this.field3044, this.field3046, 0, 1024, class558.method3260((byte) -102, this.field7007, class256.field3677), 1);
        } else {
            this.field3048 = this.field7008.field7959.method2902(this.field3044, this.field3046, 1, 0, class558.method3260((byte) 104, this.field7007, class256.field3677), 1);
        }
        PixelBuffer var9 = this.field7008.field7979;
        int var10 = this.field3048.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class484.method2892((byte) 79, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field7007.field3704 * arg2;
            int var12 = this.field7007.field3704 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2918(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2918(arg5, var12 * var14 + arg6, var13 * var14, var11);
                }
            }
            this.field3048.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZBZ)V")
    public final void method1272(boolean arg0, byte arg1, boolean arg2) {
        this.field3047 = arg0;
        if (arg1 > -65) {
            this.method1262((byte) -57);
        }
        this.field3045 = arg2;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(FI)F")
    public final float method1273(float arg0, int arg1) {
        return arg1 >= -72 ? -2.938902F : arg0 / (float) this.field3046;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)V")
    public final void method1335(int arg0) {
        if (arg0 != 193) {
            this.field3046 = 7;
        }
        this.field7008.method3264(-117, this);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIIIII[BLpd;)V")
    public final void method1265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, class259 arg8) {
        if (this.field7007 != arg8 || class256.field3677 != this.field7006) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field7008.field7979;
        int var11 = this.field3048.LockRect(0, arg6, arg0, arg1, arg5, 0, var10);
        if (class484.method2892((byte) 82, var11)) {
            int var12 = this.field7007.field3704 * arg1;
            int var13 = this.field7007.field3704 * arg4;
            int var14 = var10.getRowPitch();
            if (var12 == var14 && var12 == var13) {
                var10.method2918(arg7, arg2, 0, arg5 * var12);
            } else {
                for (int var15 = 0; var15 < arg5; var15++) {
                    var10.method2918(arg7, var13 * var15 + arg2, var14 * var15, var12);
                }
            }
            this.field3048.UnlockRect(0);
        }
        if (arg3 >= -67) {
            this.field3047 = true;
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(BF)F")
    public final float method1263(byte arg0, float arg1) {
        if (arg0 != 109) {
            this.field3045 = true;
        }
        return arg1 / (float) this.field3044;
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(B)Z")
    public final boolean method1266(byte arg0) {
        int var2 = -48 % ((arg0 + 60) / 32);
        return true;
    }
}
