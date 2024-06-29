import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class737;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class203 extends class85 implements class51 {

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    private int field2919;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
    private int field2921;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field2920;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "Z")
    public boolean field2917;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "Z")
    public boolean field2918;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIII[II)V")
    public final void method347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        if (class4.field10 != this.field1186 || class720.field10164 != this.field1184) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field1185.field7738;
        int var10 = this.field2920.LockRect(0, arg0, arg2, arg5, arg7, 0, var9);
        if (class737.method4096(arg3 ^ 0xFFFFF5B4, var10)) {
            int var11 = var9.getRowPitch();
            if (arg5 * 4 == var11 && arg1 == arg5) {
                var9.method4097(arg6, arg4, 0, arg5 * arg7);
            } else {
                for (int var12 = 0; var12 < arg7; var12++) {
                    var9.method4097(arg6, arg4 + (arg1 * var12), var11 * var12, arg5);
                }
            }
            this.field2920.UnlockRect(0);
        }
        if (arg3 != -2668) {
            this.field2921 = 2;
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method522(boolean arg0) {
        if (arg0) {
            this.field2921 = 41;
        }
        return this.field2920;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIBII[II)V")
    public final void method349(int arg0, int arg1, byte arg2, int arg3, int arg4, int[] arg5, int arg6) {
        if (class4.field10 != this.field1186 || class720.field10164 != this.field1184) {
            throw new RuntimeException();
        }
        PixelBuffer var8 = this.field1185.field7738;
        int var9 = this.field2920.LockRect(0, arg4, arg3, arg1, arg0, 16, var8);
        if (class737.method4096(121, var9)) {
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10) {
                var8.method4098(arg5, arg6, 0, arg5.length);
            } else {
                for (int var11 = 0; var11 < arg0; var11++) {
                    var8.method4098(arg5, arg1 * var11 + arg6, var10 * var11, arg1);
                }
            }
            this.field2920.UnlockRect(0);
        }
        if (arg2 <= 90) {
            this.field2918 = true;
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)I")
    public final int method350(int arg0) {
        if (arg0 >= -57) {
            this.field2921 = -110;
        }
        return this.field2919;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lrd;Lkea;IIZ[BII)V")
    public class203(class549 arg0, class77 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class720.field10164, arg4 && arg0.field7756, arg2 * arg3);
        if (this.field1185.field7754) {
            this.field2919 = arg3;
            this.field2921 = arg2;
        } else {
            this.field2921 = class670.method3834(arg2, 23538);
            this.field2919 = class670.method3834(arg3, 23538);
        }
        if (arg4) {
            this.field2920 = this.field1185.field7746.method4114(this.field2921, this.field2919, 0, 1024, class549.method3279(class720.field10164, this.field1186, -119), 1);
        } else {
            this.field2920 = this.field1185.field7746.method4114(this.field2921, this.field2919, 1, 0, class549.method3279(class720.field10164, this.field1186, -103), 1);
        }
        PixelBuffer var9 = this.field1185.field7738;
        int var10 = this.field2920.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class737.method4096(117, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field1186.field1054 * arg7;
            int var12 = this.field1186.field1054 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method2556(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2556(arg5, var11 * var14 + arg6, var13 * var14, var12);
                }
            }
            this.field2920.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lrd;IIZ[III)V")
    public class203(class549 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class4.field10, class720.field10164, arg3 && arg0.field7756, arg1 * arg2);
        if (this.field1185.field7754) {
            this.field2919 = arg2;
            this.field2921 = arg1;
        } else {
            this.field2921 = class670.method3834(arg1, 23538);
            this.field2919 = class670.method3834(arg2, 23538);
        }
        if (arg3) {
            this.field2920 = this.field1185.field7746.method4114(this.field2921, this.field2919, 0, 1024, 21, 1);
        } else {
            this.field2920 = this.field1185.field7746.method4114(this.field2921, this.field2919, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field1185.field7738;
        int var9 = this.field2920.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class737.method4096(68, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method4097(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method4097(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field2920.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZBZ)V")
    public final void method355(boolean arg0, byte arg1, boolean arg2) {
        this.field2918 = arg0;
        this.field2917 = arg2;
        if (arg1 >= -99) {
            this.method354(-64, -1.9483814F);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BF)F")
    public final float method353(byte arg0, float arg1) {
        if (arg0 < 90) {
            this.field2921 = 45;
        }
        return arg1 / (float) this.field2921;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLtb;)V")
    public final void method521(byte arg0, class657 arg1) {
        if (arg0 <= -65) {
            super.method521((byte) -88, arg1);
        }
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lrd;Lkea;Lkf;II)V")
    public class203(class549 arg0, class77 arg1, class720 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field1185.field7754) {
            this.field2921 = arg3;
            this.field2919 = arg4;
        } else {
            this.field2921 = class670.method3834(arg3, 23538);
            this.field2919 = class670.method3834(arg4, 23538);
        }
        this.field2920 = this.field1185.field7746.method4114(arg3, arg4, 1, 0, class549.method3279(this.field1184, this.field1186, -112), 1);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)I")
    public final int method351(boolean arg0) {
        if (arg0) {
            this.field2918 = false;
        }
        return this.field2921;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)Z")
    public final boolean method348(byte arg0) {
        if (arg0 != 117) {
            this.field2919 = 91;
        }
        return true;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    public final void method770(int arg0) {
        if (arg0 != -27531) {
            this.method351(false);
        }
        this.field1185.method3277(this, -14335);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "([BILkea;IIIIII)V")
    public final void method352(byte[] arg0, int arg1, class77 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field1186 != arg2 || class720.field10164 != this.field1184) {
            throw new RuntimeException();
        } else if (arg7 == 16288) {
            PixelBuffer var10 = this.field1185.field7738;
            int var11 = this.field2920.LockRect(0, arg1, arg3, arg6, arg8, 0, var10);
            if (class737.method4096(33, var11)) {
                int var12 = this.field1186.field1054 * arg5;
                int var13 = this.field1186.field1054 * arg6;
                int var14 = var10.getRowPitch();
                if (var13 == var14 && var12 == var13) {
                    var10.method2556(arg0, arg4, 0, arg8 * var13);
                } else {
                    for (int var15 = 0; var15 < arg8; var15++) {
                        var10.method2556(arg0, var12 * var15 + arg4, var14 * var15, var13);
                    }
                }
                this.field2920.UnlockRect(0);
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IF)F")
    public final float method354(int arg0, float arg1) {
        return arg0 == -23477 ? arg1 / (float) this.field2919 : -1.3120415F;
    }
}
