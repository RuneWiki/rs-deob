import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class646 extends class466 {

    @OriginalMember(owner = "client!eca", name = "J", descriptor = "I")
    private int field9378 = 0;

    @OriginalMember(owner = "client!eca", name = "F", descriptor = "[S")
    private short[] field9374 = new short[257];

    @OriginalMember(owner = "client!eca", name = "I", descriptor = "Ldv;")
    public static class566 field9377 = new class566(10, 6);

    @OriginalMember(owner = "client!eca", name = "U", descriptor = "Lml;")
    public static class325 field9388 = new class325(4, 2);

    @OriginalMember(owner = "client!eca", name = "V", descriptor = "Lml;")
    public static class325 field9389 = new class325(12, 7);

    @OriginalMember(owner = "client!eca", name = "E", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!eca", name = "G", descriptor = "I")
    public static int field9375;

    @OriginalMember(owner = "client!eca", name = "H", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!eca", name = "L", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!eca", name = "N", descriptor = "I")
    public static int field9381;

    @OriginalMember(owner = "client!eca", name = "O", descriptor = "I")
    public static int field9382;

    @OriginalMember(owner = "client!eca", name = "P", descriptor = "I")
    public static int field9383;

    @OriginalMember(owner = "client!eca", name = "R", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!eca", name = "S", descriptor = "I")
    public static int field9386;

    @OriginalMember(owner = "client!eca", name = "Q", descriptor = "Lsda;")
    public static class216 field9384;

    @OriginalMember(owner = "client!eca", name = "T", descriptor = "[I")
    private int[] field9387;

    @OriginalMember(owner = "client!eca", name = "W", descriptor = "[I")
    private int[] field9390;

    @OriginalMember(owner = "client!eca", name = "M", descriptor = "[[I")
    private int[][] field9380;

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "(I)V")
    private final void method3721(int arg0) {
        if (arg0 != -1556) {
            this.method6((class11) null, 114, -100);
        }
        int var2 = this.field9378;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field9380.length + -1 && this.field9380[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field9380[var5 - 1];
                    int[] var7 = this.field9380[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                    int var9 = -class46.field898[(var8 & 8181) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field9374[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field9380.length + -1) && ~var13 <= ~this.field9380[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field9380[var14 + -1];
                    int[] var16 = this.field9380[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] - var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field9374[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field9380.length + -1 && ~this.field9380[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field9380[var22 - 1];
                int[] var24 = this.field9380[var22];
                int var25 = this.method3727(-23568, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method3727(-23568, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + -var27 + var28 + var26;
                int var32 = -var26 + var25 - var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var26 + var37 + var35 + var36;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field9374[var20] = (short) var38;
            }
        }
        ++field9373;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIIZ)I")
    public static final int method3722(int arg0, int arg1, int arg2, boolean arg3) {
        ++field9386;
        if (arg3) {
            field9388 = null;
        }
        if (~arg1 < ~arg0) {
            return arg1;
        } else {
            return ~arg2 <= ~arg0 ? arg0 : arg2;
        }
    }

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "(III)Z")
    public static final boolean method3723(int arg0, int arg1, int arg2) {
        ++field9379;
        int var3 = 9 % ((-84 - arg2) / 32);
        return (~(arg1 & 8192) != -1 | class490.method2845(118, arg0, arg1) | class304.method1931(65536, arg1, arg0)) & class560.method3193((byte) -120, arg1, arg0);
    }

    @OriginalMember(owner = "client!eca", name = "i", descriptor = "(I)V")
    private final void method3724(int arg0) {
        ++field9385;
        int[] var2 = this.field9380[0];
        int[] var3 = this.field9380[1];
        int[] var4 = this.field9380[this.field9380.length + -2];
        if (arg0 != -2021220956) {
            this.method7(64);
        }
        int[] var5 = this.field9380[this.field9380.length - 1];
        this.field9390 = new int[] { var4[0] + var4[0] + -var5[0], var4[1] + var4[1] + -var5[1] };
        this.field9387 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - (-var2[1] - -var3[1]) };
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "()V")
    public class646() {
        super(1, true);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lcs;")
    public static final class286 method3725(Throwable arg0, String arg1) {
        ++field9375;
        class286 var2;
        if (arg0 instanceof class286) {
            var2 = (class286) arg0;
            var2.field3932 = var2.field3932 + ' ' + arg1;
        } else {
            var2 = new class286(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        ++field9383;
        if (this.field9380 == null) {
            this.field9380 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field9380.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (arg0 != -806066388) {
                this.field9374 = null;
            }
            if (this.field9378 == 2) {
                this.method3724(-2021220956);
            }
            class225.method1442(256);
            this.method3721(-1556);
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg1 != -5062) {
            this.field9378 = -88;
        }
        if (arg2 == 0) {
            this.field9378 = arg0.method110((byte) 118);
            this.field9380 = new int[arg0.method110((byte) 74)][2];
            for (int var4 = 0; var4 < this.field9380.length; ++var4) {
                this.field9380[var4][0] = arg0.method93((byte) 113);
                this.field9380[var4][1] = arg0.method93((byte) 82);
            }
        }
        ++field9382;
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(Z)V")
    public static void method3726(boolean arg0) {
        field9388 = null;
        field9389 = null;
        field9384 = null;
        field9377 = null;
        if (arg0) {
            field9389 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(II)[I")
    private final int[] method3727(int arg0, int arg1) {
        ++field9376;
        if (arg0 != -23568) {
            this.method7(-3);
        }
        if (arg1 < 0) {
            return this.field9387;
        } else {
            return ~arg1 <= ~this.field9380.length ? this.field9390 : this.field9380[arg1];
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field9381;
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (arg1 != 0) {
            this.field9390 = null;
        }
        if (super.field6557.field1163) {
            int[] var4 = this.method2721(0, arg0, arg1 + 2);
            for (int var5 = 0; ~var5 > ~class312.field4207; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field9374[var6];
            }
        }
        return var3;
    }
}
