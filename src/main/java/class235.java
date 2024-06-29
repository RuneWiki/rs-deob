import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class235 extends class310 {

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
    private int field3896 = 6;

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
    public static int field3899 = 255;

    @OriginalMember(owner = "client!gh", name = "W", descriptor = "Ljava/lang/String;")
    public static String field3907 = null;

    @OriginalMember(owner = "client!gh", name = "X", descriptor = "I")
    public static int field3908 = 0;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!gh", name = "U", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "Lth;")
    public static class57 field3901;

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "Lth;")
    public static class57 field3902;

    @OriginalMember(owner = "client!gh", name = "T", descriptor = "[[Lgd;")
    public static class179[][] field3904;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)[[I", line = 6)
    public final int[][] method391(int arg0, boolean arg1) {
        field3897++;
        if (!arg1) {
            field3907 = (String) null;
        }
        int[][] var3 = this.field4942.method10((byte) -115, arg0);
        if (this.field4942.field30) {
            int[][] var4 = this.method2199(21101, arg0, 0);
            int[][] var5 = this.method2199(21101, arg0, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            int[] var12 = var5[2];
            int[] var13 = var5[0];
            int[] var14 = var5[1];
            int var15 = this.field3896;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class261.field4405; var63++) {
                    var6[var63] = var9[var63] + var13[var63];
                    var7[var63] = var11[var63] + var14[var63];
                    var8[var63] = var10[var63] + var12[var63];
                }
            } else if (var15 == 2) {
                for (int var62 = 0; var62 < class261.field4405; var62++) {
                    var6[var62] = var9[var62] - var13[var62];
                    var7[var62] = var11[var62] - var14[var62];
                    var8[var62] = var10[var62] - var12[var62];
                }
            } else if (var15 == 3) {
                for (int var61 = 0; var61 < class261.field4405; var61++) {
                    var6[var61] = var9[var61] * var13[var61] >> 12;
                    var7[var61] = var11[var61] * var14[var61] >> 12;
                    var8[var61] = var10[var61] * var12[var61] >> 12;
                }
            } else if (var15 == 4) {
                for (int var57 = 0; var57 < class261.field4405; var57++) {
                    int var58 = var13[var57];
                    int var59 = var12[var57];
                    int var60 = var14[var57];
                    var6[var57] = var58 == 0 ? 4096 : (var9[var57] << 12) / var58;
                    var7[var57] = var60 == 0 ? 4096 : (var11[var57] << 12) / var60;
                    var8[var57] = var59 == 0 ? 4096 : (var10[var57] << 12) / var59;
                }
            } else if (var15 == 5) {
                for (int var56 = 0; var56 < class261.field4405; var56++) {
                    var6[var56] = 4096 - ((4096 - var9[var56]) * (4096 - var13[var56]) >> 12);
                    var7[var56] = 4096 - ((4096 - var11[var56]) * (4096 - var14[var56]) >> 12);
                    var8[var56] = 4096 - ((4096 - var10[var56]) * (4096 - var12[var56]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var52 = 0; var52 < class261.field4405; var52++) {
                    int var53 = var14[var52];
                    int var54 = var13[var52];
                    int var55 = var12[var52];
                    var6[var52] = var54 < 2048 ? var9[var52] * var54 >> 11 : 4096 - ((4096 - var9[var52]) * (4096 - var54) >> 11);
                    var7[var52] = var53 >= 2048 ? 4096 - ((4096 - var53) * (4096 - var11[var52]) >> 11) : var11[var52] * var53 >> 11;
                    var8[var52] = var55 < 2048 ? var10[var52] * var55 >> 11 : 4096 - ((4096 - var10[var52]) * (4096 - var55) >> 11);
                }
            } else if (var15 == 7) {
                for (int var48 = 0; var48 < class261.field4405; var48++) {
                    int var49 = var10[var48];
                    int var50 = var11[var48];
                    int var51 = var9[var48];
                    var6[var48] = var51 == 4096 ? 4096 : (var13[var48] << 12) / (4096 - var51);
                    var7[var48] = var50 == 4096 ? 4096 : (var14[var48] << 12) / (4096 - var50);
                    var8[var48] = var49 == 4096 ? 4096 : (var12[var48] << 12) / (4096 - var49);
                }
            } else if (var15 == 8) {
                for (int var16 = 0; var16 < class261.field4405; var16++) {
                    int var17 = var9[var16];
                    int var18 = var11[var16];
                    int var19 = var10[var16];
                    var6[var16] = var17 == 0 ? 0 : 4096 - (4096 - var13[var16] << 12) / var17;
                    var7[var16] = var18 == 0 ? 0 : 4096 - ((4096 - var14[var16] << 12) / var18);
                    var8[var16] = var19 == 0 ? 0 : 4096 - (4096 - var12[var16] << 12) / var19;
                }
            } else if (var15 == 9) {
                for (int var20 = 0; var20 < class261.field4405; var20++) {
                    int var21 = var10[var20];
                    int var22 = var14[var20];
                    int var23 = var13[var20];
                    int var24 = var9[var20];
                    int var25 = var11[var20];
                    int var26 = var12[var20];
                    var6[var20] = var23 <= var24 ? var23 : var24;
                    var7[var20] = var22 <= var25 ? var22 : var25;
                    var8[var20] = var21 >= var26 ? var26 : var21;
                }
            } else if (var15 == 10) {
                for (int var41 = 0; var41 < class261.field4405; var41++) {
                    int var42 = var14[var41];
                    int var43 = var10[var41];
                    int var44 = var9[var41];
                    int var45 = var12[var41];
                    int var46 = var11[var41];
                    int var47 = var13[var41];
                    var6[var41] = var47 >= var44 ? var47 : var44;
                    var7[var41] = var42 < var46 ? var46 : var42;
                    var8[var41] = var45 >= var43 ? var45 : var43;
                }
            } else if (var15 == 11) {
                for (int var34 = 0; var34 < class261.field4405; var34++) {
                    int var35 = var10[var34];
                    int var36 = var14[var34];
                    int var37 = var13[var34];
                    int var38 = var11[var34];
                    int var39 = var12[var34];
                    int var40 = var9[var34];
                    var6[var34] = var37 >= var40 ? var37 - var40 : -var37 + var40;
                    var7[var34] = var36 < var38 ? var38 - var36 : -var38 + var36;
                    var8[var34] = var35 <= var39 ? var39 - var35 : -var39 + var35;
                }
            } else if (var15 == 12) {
                for (int var27 = 0; var27 < class261.field4405; var27++) {
                    int var28 = var13[var27];
                    int var29 = var10[var27];
                    int var30 = var12[var27];
                    int var31 = var11[var27];
                    int var32 = var14[var27];
                    int var33 = var9[var27];
                    var6[var27] = var28 + var33 - (var28 * var33 >> 11);
                    var7[var27] = var31 + var32 - (var31 * var32 >> 11);
                    var8[var27] = var29 + var30 - (var29 * var30 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V", line = 356)
    public class235() {
        super(2, false);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(IIB)V", line = 330)
    public static final void method1806(int arg0, int arg1, byte arg2) {
        int var3 = field3899 * arg0 >> 8;
        field3900++;
        if (arg1 == -1 && !class32.field461) {
            class339.method2380((byte) -113);
        } else if (arg1 != -1 && (class196.field3132 != arg1 || !class90.method711(-20904)) && var3 != 0 && !class32.field461) {
            class342.method2414(arg1, var3, 2, -1, false, class355.field5641, 0);
        }
        if (arg2 >= -61) {
            field3901 = (class57) null;
        }
        class196.field3132 = arg1;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIB)V", line = 362)
    public static final void method1807(int arg0, int arg1, int arg2, byte arg3) {
        field3903++;
        class6 var4 = class301.method2155(arg1, arg0, 5000, arg2);
        int var5 = 106 % ((18 - arg3) / 39);
        if (var4 == null) {
            return;
        }
        class191.field3056 = new int[var4.field56];
        if (var4.field52 == 15 || var4.field52 == 17 || var4.field52 == 16) {
            int var6 = 0;
            int var7 = 0;
            if (class308.field4909 != null) {
                var7 = class308.field4909.field4213;
                var6 = class308.field4909.field4147;
            }
            class191.field3056[1] = class77.field1343 - var7;
            class191.field3056[0] = class333.field5275 - var6;
        }
        class39.field576 = new String[var4.field57];
        class3.method16(var4, 200000, 9);
    }

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "(B)V", line = 401)
    public static void method1808(byte arg0) {
        field3904 = (class179[][]) null;
        field3902 = null;
        if (arg0 != -5) {
            field3908 = 112;
        }
        field3901 = null;
        field3907 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILjava/awt/Component;B)Lad;", line = 415)
    public static final class342 method1809(int arg0, int arg1, Component arg2, byte arg3) {
        field3905++;
        try {
            Class var4 = Class.forName("g");
            class342 var5 = (class342) var4.getDeclaredConstructor().newInstance();
            var5.method573(arg2, -52, arg1, arg0);
            int var6 = 16 % ((23 - arg3) / 53);
            return var5;
        } catch (Throwable var9) {
            class70 var8 = new class70();
            var8.method573(arg2, 120, arg1, arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lqm;II)V", line = 438)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg1 != -2470) {
            this.field3896 = 109;
        }
        if (arg2 == 0) {
            this.field3896 = arg0.method1720((byte) -28);
        } else if (arg2 == 1) {
            this.field4940 = arg0.method1720((byte) -109) == 1;
        }
        field3898++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[I", line = 486)
    public final int[] method77(int arg0, int arg1) {
        field3906++;
        if (arg1 != -13093) {
            field3901 = (class57) null;
        }
        int[] var3 = this.field4950.method930(arg0, arg1 + 13093);
        if (this.field4950.field2001) {
            int[] var4 = this.method2200(0, arg0, (byte) 74);
            int[] var5 = this.method2200(1, arg0, (byte) 74);
            int var6 = this.field3896;
            if (var6 == 1) {
                for (int var7 = 0; var7 < class261.field4405; var7++) {
                    var3[var7] = var4[var7] + var5[var7];
                }
            } else if (var6 == 2) {
                for (int var30 = 0; var30 < class261.field4405; var30++) {
                    var3[var30] = var4[var30] - var5[var30];
                }
            } else if (var6 == 3) {
                for (int var29 = 0; var29 < class261.field4405; var29++) {
                    var3[var29] = var4[var29] * var5[var29] >> 12;
                }
            } else if (var6 == 4) {
                for (int var27 = 0; var27 < class261.field4405; var27++) {
                    int var28 = var5[var27];
                    var3[var27] = var28 == 0 ? 4096 : (var4[var27] << 12) / var28;
                }
            } else if (var6 == 5) {
                for (int var26 = 0; var26 < class261.field4405; var26++) {
                    var3[var26] = 4096 - ((4096 - var4[var26]) * (4096 - var5[var26]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var8 = 0; var8 < class261.field4405; var8++) {
                    int var9 = var5[var8];
                    var3[var8] = var9 < 2048 ? var4[var8] * var9 >> 11 : 4096 - ((4096 - var9) * (4096 - var4[var8]) >> 11);
                }
            } else if (var6 == 7) {
                for (int var10 = 0; var10 < class261.field4405; var10++) {
                    int var11 = var4[var10];
                    var3[var10] = var11 == 4096 ? 4096 : (var5[var10] << 12) / (4096 - var11);
                }
            } else if (var6 == 8) {
                for (int var24 = 0; var24 < class261.field4405; var24++) {
                    int var25 = var4[var24];
                    var3[var24] = var25 == 0 ? 0 : 4096 - ((4096 - var5[var24] << 12) / var25);
                }
            } else if (var6 == 9) {
                for (int var21 = 0; var21 < class261.field4405; var21++) {
                    int var22 = var4[var21];
                    int var23 = var5[var21];
                    var3[var21] = var23 <= var22 ? var23 : var22;
                }
            } else if (var6 == 10) {
                for (int var18 = 0; var18 < class261.field4405; var18++) {
                    int var19 = var5[var18];
                    int var20 = var4[var18];
                    var3[var18] = var19 < var20 ? var20 : var19;
                }
            } else if (var6 == 11) {
                for (int var15 = 0; var15 < class261.field4405; var15++) {
                    int var16 = var5[var15];
                    int var17 = var4[var15];
                    var3[var15] = var16 < var17 ? var17 - var16 : -var17 + var16;
                }
            } else if (var6 == 12) {
                for (int var12 = 0; var12 < class261.field4405; var12++) {
                    int var13 = var5[var12];
                    int var14 = var4[var12];
                    var3[var12] = var14 + var13 - (var13 * var14 >> 11);
                }
            }
        }
        return var3;
    }
}
