import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class675;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class582 extends class142 implements class309 {

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    private int field7918;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    private int field7917;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field7916;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Z")
    public boolean field7915;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Z")
    public boolean field7919;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lgv;I)V", line = 4)
    public final void method1071(class39 arg0, int arg1) {
        super.method1071(arg0, arg1);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([IIBIIIII)V", line = 13)
    public final void method1132(int[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class135.field1774 != this.field1867 || class6.field48 != this.field1864) {
            throw new RuntimeException();
        }
        if (arg2 < 45) {
            this.method1070((byte) -5);
        }
        PixelBuffer var9 = this.field1866.field959;
        int var10 = this.field7916.LockRect(0, arg5, arg1, arg3, arg4, 0, var9);
        if (!class675.method3703((byte) -58, var10)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if ((arg3 * 4) == var11 && arg3 == arg7) {
            var9.method3694(arg0, arg6, 0, arg3 * arg4);
        } else {
            for (int var12 = 0; var12 < arg4; var12++) {
                var9.method3694(arg0, arg7 * var12 + arg6, var11 * var12, arg3);
            }
        }
        this.field7916.UnlockRect(0);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(FB)F", line = 54)
    public final float method1136(float arg0, byte arg1) {
        if (arg1 > -94) {
            this.field7916 = null;
        }
        return arg0 / (float) this.field7917;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IF)F", line = 65)
    public final float method1135(int arg0, float arg1) {
        if (arg0 != 7886) {
            this.field7918 = 94;
        }
        return arg1 / (float) this.field7918;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZZI)V", line = 75)
    public final void method1133(boolean arg0, boolean arg1, int arg2) {
        this.field7915 = arg1;
        if (arg2 != 19263) {
            this.field7917 = 92;
        }
        this.field7919 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)I", line = 87)
    public final int method1131(byte arg0) {
        int var2 = -68 / ((54 - arg0) / 62);
        return this.field7918;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)I", line = 95)
    public final int method1130(byte arg0) {
        if (arg0 != -91) {
            this.field7917 = -20;
        }
        return this.field7917;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lmba;Lpw;IIZ[BII)V", line = 105)
    public class582(class70 arg0, class89 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class6.field48, arg4 && arg0.field953, arg2 * arg3);
        if (this.field1866.field956) {
            this.field7917 = arg3;
            this.field7918 = arg2;
        } else {
            this.field7918 = class426.method2447(arg2, 250);
            this.field7917 = class426.method2447(arg3, 250);
        }
        if (arg4) {
            this.field7916 = this.field1866.field958.method3715(this.field7918, this.field7917, 0, 1024, class70.method568(this.field1867, -1, class6.field48), 1);
        } else {
            this.field7916 = this.field1866.field958.method3715(this.field7918, this.field7917, 1, 0, class70.method568(this.field1867, -1, class6.field48), 1);
        }
        PixelBuffer var9 = this.field1866.field959;
        int var10 = this.field7916.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class675.method3703((byte) -58, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field1867.field1177 * arg7;
            int var12 = this.field1867.field1177 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method125(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method125(arg5, arg6 + (var11 * var14), var13 * var14, var12);
                }
            }
            this.field7916.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)Z", line = 163)
    public final boolean method1128(int arg0) {
        return arg0 == -9355 ? true : true;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lmba;IIZ[III)V", line = 172)
    public class582(class70 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class135.field1774, class6.field48, arg3 && arg0.field953, arg1 * arg2);
        if (this.field1866.field956) {
            this.field7918 = arg1;
            this.field7917 = arg2;
        } else {
            this.field7918 = class426.method2447(arg1, 250);
            this.field7917 = class426.method2447(arg2, 250);
        }
        if (arg3) {
            this.field7916 = this.field1866.field958.method3715(this.field7918, this.field7917, 0, 1024, 21, 1);
        } else {
            this.field7916 = this.field1866.field958.method3715(this.field7918, this.field7917, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field1866.field959;
        int var9 = this.field7916.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class675.method3703((byte) -58, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method3694(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method3694(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field7916.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lmba;Lpw;Llj;II)V", line = 228)
    public class582(class70 arg0, class89 arg1, class6 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field1866.field956) {
            this.field7918 = arg3;
            this.field7917 = arg4;
        } else {
            this.field7918 = class426.method2447(arg3, 250);
            this.field7917 = class426.method2447(arg4, 250);
        }
        this.field7916 = this.field1866.field958.method3715(arg3, arg4, 1, 0, class70.method568(this.field1867, -1, this.field1864), 1);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 248)
    public final void method1141(int arg0) {
        this.field1866.method560((byte) 126, this);
        if (arg0 != 1896) {
            this.method1141(-6);
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 258)
    public final IDirect3DBaseTexture method1070(byte arg0) {
        return arg0 == -72 ? this.field7916 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILpw;I[BIIIII)V", line = 268)
    public final void method1129(int arg0, class89 arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field1867 != arg1 || class6.field48 != this.field1864) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field1866.field959;
        if (arg5 != 1780) {
            return;
        }
        int var11 = this.field7916.LockRect(0, arg4, arg8, arg2, arg0, 0, var10);
        if (!class675.method3703((byte) -58, var11)) {
            return;
        }
        int var12 = this.field1867.field1177 * arg2;
        int var13 = this.field1867.field1177 * arg7;
        int var14 = var10.getRowPitch();
        if (var12 == var14 && var12 == var13) {
            var10.method125(arg3, arg6, 0, arg0 * var12);
        } else {
            for (int var15 = 0; var15 < arg0; var15++) {
                var10.method125(arg3, var13 * var15 + arg6, var14 * var15, var12);
            }
        }
        this.field7916.UnlockRect(0);
    }
}
