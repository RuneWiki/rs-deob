import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class509;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class295 extends class234 implements class175 {

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    private int field3522;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    private int field3521;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field3518;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "Z")
    public boolean field3519;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "Z")
    public boolean field3520;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII[BILpe;II)V", line = 4)
    public final void method1195(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, class636 arg6, int arg7, int arg8) {
        if (this.field2786 != arg6 || class748.field10384 != this.field2783) {
            throw new RuntimeException();
        }
        if (arg2 != -6201) {
            this.method1726(-109);
        }
        PixelBuffer var10 = this.field2785.field19;
        int var11 = this.field3518.LockRect(0, arg1, arg0, arg7, arg8, 0, var10);
        if (!class509.method3048(arg2 ^ 0x1838, var11)) {
            return;
        }
        int var12 = this.field2786.field8671 * arg5;
        int var13 = this.field2786.field8671 * arg7;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method3069(arg4, arg3, 0, arg8 * var13);
        } else {
            for (int var15 = 0; var15 < arg8; var15++) {
                var10.method3069(arg4, var12 * var15 + arg3, var14 * var15, var13);
            }
        }
        this.field3518.UnlockRect(0);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII[IBI)V", line = 46)
    public final void method1193(int arg0, int arg1, int arg2, int arg3, int[] arg4, byte arg5, int arg6) {
        if (arg5 <= 50) {
            this.method1197(53);
        }
        if (class141.field1759 != this.field2786 || class748.field10384 != this.field2783) {
            throw new RuntimeException();
        }
        PixelBuffer var8 = this.field2785.field19;
        int var9 = this.field3518.LockRect(0, arg1, arg0, arg3, arg6, 16, var8);
        if (!class509.method3048(-1, var9)) {
            return;
        }
        int var10 = var8.getRowPitch();
        if (arg3 * 4 == var10) {
            var8.method3071(arg4, arg2, 0, arg4.length);
        } else {
            for (int var11 = 0; var11 < arg6; var11++) {
                var8.method3071(arg4, arg3 * var11 + arg2, var10 * var11, arg3);
            }
        }
        this.field3518.UnlockRect(0);
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lus;Lpe;Ldw;II)V", line = 84)
    public class295(class1 arg0, class636 arg1, class748 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field2785.field8) {
            this.field3522 = arg4;
            this.field3521 = arg3;
        } else {
            this.field3521 = class783.method4337(arg3, (byte) 32);
            this.field3522 = class783.method4337(arg4, (byte) 105);
        }
        this.field3518 = this.field2785.field27.method3051(arg3, arg4, 1, 0, class1.method28(this.field2786, this.field2783, 6), 1);
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)I", line = 105)
    public final int method1199(int arg0) {
        int var2 = -56 / ((16 - arg0) / 45);
        return this.field3521;
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)V", line = 114)
    public final void method1726(int arg0) {
        this.field2785.method24(this, 1);
        if (arg0 >= -93) {
            this.method1193(-85, 25, 29, 105, null, (byte) 74, -59);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZZB)V", line = 125)
    public final void method1198(boolean arg0, boolean arg1, byte arg2) {
        this.field3519 = arg1;
        this.field3520 = arg0;
        int var4 = 100 % ((-arg2 - 68) / 55);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;", line = 135)
    public final IDirect3DBaseTexture method1440(boolean arg0) {
        if (!arg0) {
            this.method1439(null, -100);
        }
        return this.field3518;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lus;Lpe;IIZ[BII)V", line = 144)
    public class295(class1 arg0, class636 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class748.field10384, arg4 && arg0.field21, arg2 * arg3);
        if (this.field2785.field8) {
            this.field3522 = arg3;
            this.field3521 = arg2;
        } else {
            this.field3521 = class783.method4337(arg2, (byte) 93);
            this.field3522 = class783.method4337(arg3, (byte) 113);
        }
        if (arg4) {
            this.field3518 = this.field2785.field27.method3051(this.field3521, this.field3522, 0, 1024, class1.method28(this.field2786, class748.field10384, 6), 1);
        } else {
            this.field3518 = this.field2785.field27.method3051(this.field3521, this.field3522, 1, 0, class1.method28(this.field2786, class748.field10384, 6), 1);
        }
        PixelBuffer var9 = this.field2785.field19;
        int var10 = this.field3518.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class509.method3048(-1, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field2786.field8671 * arg7;
            int var12 = this.field2786.field8671 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method3069(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method3069(arg5, var11 * var14 + arg6, var13 * var14, var12);
                }
            }
            this.field3518.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)I", line = 205)
    public final int method1197(int arg0) {
        return arg0 == 7676 ? this.field3522 : -12;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII[IIBI)V", line = 215)
    public final void method1194(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, byte arg6, int arg7) {
        if (class141.field1759 != this.field2786 || class748.field10384 != this.field2783) {
            throw new RuntimeException();
        }
        if (arg6 != -96) {
            this.method1196(100, -1.3048406F);
        }
        PixelBuffer var9 = this.field2785.field19;
        int var10 = this.field3518.LockRect(0, arg2, arg7, arg0, arg3, 0, var9);
        if (!class509.method3048(-1, var10)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if (arg0 * 4 == var11 && arg0 == arg5) {
            var9.method3072(arg4, arg1, 0, arg0 * arg3);
        } else {
            for (int var12 = 0; var12 < arg3; var12++) {
                var9.method3072(arg4, arg1 + (arg5 * var12), var11 * var12, arg0);
            }
        }
        this.field3518.UnlockRect(0);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lko;I)V", line = 255)
    public final void method1439(class531 arg0, int arg1) {
        super.method1439(arg0, -68);
        if (arg1 > -19) {
            this.method1193(-34, 69, 117, -38, null, (byte) -13, 15);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IF)F", line = 265)
    public final float method1196(int arg0, float arg1) {
        if (arg0 != -23865) {
            this.method1195(-67, -71, -117, 40, null, -78, null, 127, -62);
        }
        return arg1 / (float) this.field3521;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lus;IIZ[III)V", line = 274)
    public class295(class1 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class141.field1759, class748.field10384, arg3 && arg0.field21, arg1 * arg2);
        if (this.field2785.field8) {
            this.field3521 = arg1;
            this.field3522 = arg2;
        } else {
            this.field3521 = class783.method4337(arg1, (byte) 19);
            this.field3522 = class783.method4337(arg2, (byte) 56);
        }
        if (arg3) {
            this.field3518 = this.field2785.field27.method3051(this.field3521, this.field3522, 0, 1024, 21, 1);
        } else {
            this.field3518 = this.field2785.field27.method3051(this.field3521, this.field3522, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field2785.field19;
        int var9 = this.field3518.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class509.method3048(-1, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method3072(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method3072(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field3518.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BF)F", line = 331)
    public final float method1200(byte arg0, float arg1) {
        int var3 = 4 / ((arg0 + 52) / 53);
        return arg1 / (float) this.field3522;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)Z", line = 340)
    public final boolean method1192(int arg0) {
        return arg0 < -70;
    }
}
