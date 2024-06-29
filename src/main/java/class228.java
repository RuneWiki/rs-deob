import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class672;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class228 extends class459 implements class75 {

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    private int field3028;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    private int field3031;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field3029;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "Z")
    public boolean field3030;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "Z")
    public boolean field3032;

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lik;Lwu;Lbk;II)V", line = 3)
    public class228(class107 arg0, class149 arg1, class106 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field6617.field1602) {
            this.field3028 = arg4;
            this.field3031 = arg3;
        } else {
            this.field3031 = class240.method1478(-28325, arg3);
            this.field3028 = class240.method1478(-28325, arg4);
        }
        this.field3029 = this.field6617.field1600.method3766(arg3, arg4, 1, 0, class107.method810(this.field6618, this.field6619, 22), 1);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II[IIIIII)V", line = 24)
    public final void method430(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class564.field8245 != this.field6618 || class106.field1573 != this.field6619) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field6617.field1588;
        if (arg7 < 30) {
            this.field3029 = null;
        }
        int var10 = this.field3029.LockRect(0, arg1, arg5, arg6, arg4, 0, var9);
        if (!class672.method3775(var10, 10067)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if ((arg6 * 4) == var11 && arg0 == arg6) {
            var9.method3748(arg2, arg3, 0, arg4 * arg6);
        } else {
            for (int var12 = 0; var12 < arg4; var12++) {
                var9.method3748(arg2, arg0 * var12 + arg3, var11 * var12, arg6);
            }
        }
        this.field3029.UnlockRect(0);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)Z", line = 64)
    public final boolean method436(byte arg0) {
        if (arg0 != 13) {
            this.field3032 = false;
        }
        return true;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lik;IIZ[III)V", line = 73)
    public class228(class107 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class564.field8245, class106.field1573, arg3 && arg0.field1593, arg1 * arg2);
        if (this.field6617.field1602) {
            this.field3031 = arg1;
            this.field3028 = arg2;
        } else {
            this.field3031 = class240.method1478(-28325, arg1);
            this.field3028 = class240.method1478(-28325, arg2);
        }
        if (arg3) {
            this.field3029 = this.field6617.field1600.method3766(this.field3031, this.field3028, 0, 1024, 21, 1);
        } else {
            this.field3029 = this.field6617.field1600.method3766(this.field3031, this.field3028, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field6617.field1588;
        int var9 = this.field3029.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class672.method3775(var9, 10067)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method3748(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method3748(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field3029.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)I", line = 130)
    public final int method431(boolean arg0) {
        if (arg0) {
            this.method1215(null, 23);
        }
        return this.field3031;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lkk;I)V", line = 140)
    public final void method1215(class238 arg0, int arg1) {
        super.method1215(arg0, arg1);
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 147)
    public final IDirect3DBaseTexture method1214(int arg0) {
        if (arg0 >= -14) {
            this.method431(true);
        }
        return this.field3029;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V", line = 157)
    public final void method1213(int arg0) {
        if (arg0 < 23) {
            this.field3029 = null;
        }
        this.field6617.method777(this, 22008);
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lik;Lwu;IIZ[BII)V", line = 167)
    public class228(class107 arg0, class149 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class106.field1573, arg4 && arg0.field1593, arg2 * arg3);
        if (this.field6617.field1602) {
            this.field3031 = arg2;
            this.field3028 = arg3;
        } else {
            this.field3031 = class240.method1478(-28325, arg2);
            this.field3028 = class240.method1478(-28325, arg3);
        }
        if (arg4) {
            this.field3029 = this.field6617.field1600.method3766(this.field3031, this.field3028, 0, 1024, class107.method810(this.field6618, class106.field1573, 22), 1);
        } else {
            this.field3029 = this.field6617.field1600.method3766(this.field3031, this.field3028, 1, 0, class107.method810(this.field6618, class106.field1573, 22), 1);
        }
        PixelBuffer var9 = this.field6617.field1588;
        int var10 = this.field3029.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class672.method3775(var10, 10067)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field6618.field2109 * arg7;
            int var12 = this.field6618.field2109 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method163(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method163(arg5, arg6 + (var11 * var14), var13 * var14, var12);
                }
            }
            this.field3029.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZZB)V", line = 227)
    public final void method432(boolean arg0, boolean arg1, byte arg2) {
        if (arg2 < 79) {
            this.method1215(null, -74);
        }
        this.field3030 = arg1;
        this.field3032 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(FI)F", line = 239)
    public final float method429(float arg0, int arg1) {
        if (arg1 > -35) {
            this.method434(-64, -69, 18, -105, -97, -68, null, null, 81);
        }
        return arg0 / (float) this.field3028;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)I", line = 249)
    public final int method435(int arg0) {
        return arg0 == 2367 ? this.field3028 : -14;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIII[BLwu;I)V", line = 259)
    public final void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, class149 arg7, int arg8) {
        if (this.field6618 != arg7 || class106.field1573 != this.field6619) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field6617.field1588;
        int var11 = this.field3029.LockRect(0, arg5, arg2, arg1, arg0, 0, var10);
        if (arg8 != -11100) {
            this.method429(-1.041779F, 7);
        }
        if (!class672.method3775(var11, 10067)) {
            return;
        }
        int var12 = this.field6618.field2109 * arg3;
        int var13 = this.field6618.field2109 * arg1;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method163(arg6, arg4, 0, arg0 * var13);
        } else {
            for (int var15 = 0; var15 < arg0; var15++) {
                var10.method163(arg6, var12 * var15 + arg4, var14 * var15, var13);
            }
        }
        this.field3029.UnlockRect(0);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IF)F", line = 300)
    public final float method433(int arg0, float arg1) {
        if (arg0 != -27156) {
            this.field3030 = false;
        }
        return arg1 / (float) this.field3031;
    }
}
