import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class160 extends class34 {

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "B")
    private byte field2395 = 0;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
    public int field2417 = 0;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "I")
    private int field2426 = 0;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "B")
    private byte field2416 = 0;

    @OriginalMember(owner = "client!oh", name = "ab", descriptor = "Z")
    public boolean field2429 = false;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "I")
    private int field2412 = 0;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "[I")
    private int[] field2404;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "[I")
    public int[] field2399;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "[I")
    public int[] field2423;

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "[I")
    public int[] field2418;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "[I")
    private int[] field2410;

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "[S")
    private short[] field2425;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "[S")
    private short[] field2414;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "[S")
    private short[] field2419;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "[S")
    private short[] field2401;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "[F")
    private float[] field2402;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "[F")
    private float[] field2409;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "[S")
    private short[] field2421;

    @OriginalMember(owner = "client!oh", name = "bb", descriptor = "[B")
    private byte[] field2430;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "[S")
    private short[] field2422;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "[S")
    private short[] field2403;

    @OriginalMember(owner = "client!oh", name = "gb", descriptor = "[S")
    private short[] field2435;

    @OriginalMember(owner = "client!oh", name = "eb", descriptor = "[S")
    private short[] field2433;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "[B")
    private byte[] field2396;

    @OriginalMember(owner = "client!oh", name = "cb", descriptor = "Loe;")
    public class75 field2431;

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "Lik;")
    public class79 field2408;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "Lik;")
    private class79 field2411;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "Lik;")
    private class79 field2398;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "Lik;")
    private class79 field2420;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "Lik;")
    private class79 field2397;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "S")
    private short field2400;

    @OriginalMember(owner = "client!oh", name = "ib", descriptor = "S")
    private short field2437;

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "[S")
    private short[] field2424;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "[I")
    private int[] field2407;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "Lii;")
    private static class221 field2415 = new class221(10000);

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "Loh;")
    private static class160 field2427 = new class160();

    @OriginalMember(owner = "client!oh", name = "hb", descriptor = "Loh;")
    private static class160 field2436 = new class160();

    @OriginalMember(owner = "client!oh", name = "jb", descriptor = "Loh;")
    private static class160 field2438 = new class160();

    @OriginalMember(owner = "client!oh", name = "kb", descriptor = "Loh;")
    private static class160 field2439 = new class160();

    @OriginalMember(owner = "client!oh", name = "nb", descriptor = "[I")
    private static int[] field2442 = new int[1];

    @OriginalMember(owner = "client!oh", name = "tb", descriptor = "[I")
    private static int[] field2448 = new int[1];

    @OriginalMember(owner = "client!oh", name = "lb", descriptor = "F")
    private static float field2440;

    @OriginalMember(owner = "client!oh", name = "pb", descriptor = "F")
    private static float field2444;

    @OriginalMember(owner = "client!oh", name = "qb", descriptor = "F")
    private static float field2445;

    @OriginalMember(owner = "client!oh", name = "rb", descriptor = "F")
    private static float field2446;

    @OriginalMember(owner = "client!oh", name = "sb", descriptor = "F")
    private static float field2447;

    @OriginalMember(owner = "client!oh", name = "vb", descriptor = "F")
    private static float field2450;

    @OriginalMember(owner = "client!oh", name = "mb", descriptor = "I")
    private static int field2441;

    @OriginalMember(owner = "client!oh", name = "ob", descriptor = "I")
    private static int field2443;

    @OriginalMember(owner = "client!oh", name = "ub", descriptor = "I")
    private static int field2449;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "Lej;")
    private class44 field2413;

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "Lwk;")
    private class54 field2428;

    @OriginalMember(owner = "client!oh", name = "db", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2432;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "[J")
    private static long[] field2406;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "[[I")
    private int[][] field2405;

    @OriginalMember(owner = "client!oh", name = "fb", descriptor = "[[I")
    private int[][] field2434;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lla;)Lla;", line = 5)
    public final class178 method1025(class178 arg0) {
        if (this.field2412 == 0) {
            return null;
        }
        if (!this.field2431.field1180) {
            this.method1044();
        }
        int var2;
        int var3;
        if (class293.field4944 > 0) {
            var2 = this.field2431.field1178 - (class293.field4944 * this.field2431.field1179 >> 8) >> 3;
            var3 = this.field2431.field1176 - (class293.field4944 * this.field2431.field1175 >> 8) >> 3;
        } else {
            var2 = this.field2431.field1178 - (class293.field4944 * this.field2431.field1175 >> 8) >> 3;
            var3 = this.field2431.field1176 - (class293.field4944 * this.field2431.field1179 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class293.field4952 > 0) {
            var4 = this.field2431.field1181 - (class293.field4952 * this.field2431.field1179 >> 8) >> 3;
            var5 = this.field2431.field1177 - (class293.field4952 * this.field2431.field1175 >> 8) >> 3;
        } else {
            var4 = this.field2431.field1181 - (class293.field4952 * this.field2431.field1175 >> 8) >> 3;
            var5 = this.field2431.field1177 - (class293.field4952 * this.field2431.field1179 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class178 var8;
        if (arg0 == null || arg0.field2704.length < var6 * var7) {
            var8 = new class178(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field1162 = arg0.field1163 = var6;
            arg0.field1171 = arg0.field1172 = var7;
            arg0.method1161();
        }
        var8.field1170 = var2;
        var8.field1165 = var4;
        if (field2448.length < this.field2412) {
            field2448 = new int[this.field2412];
            field2442 = new int[this.field2412];
        }
        for (int var9 = 0; var9 < this.field2417; var9++) {
            int var10 = (this.field2399[var9] - (this.field2423[var9] * class293.field4944 >> 8) >> 3) - var2;
            int var11 = (this.field2418[var9] - (this.field2423[var9] * class293.field4952 >> 8) >> 3) - var4;
            int var12 = this.field2404[var9];
            int var13 = this.field2404[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field2424[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field2448[var15] = var10;
                field2442[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field2426; var16++) {
            if (this.field2430[var16] <= 128) {
                short var17 = this.field2422[var16];
                short var18 = this.field2403[var16];
                short var19 = this.field2435[var16];
                int var20 = field2448[var17];
                int var21 = field2448[var18];
                int var22 = field2448[var19];
                int var23 = field2442[var17];
                int var24 = field2442[var18];
                int var25 = field2442[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class229.method1626(var8.field2704, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIIIJ)V", line = 128)
    public final void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (this.field2412 == 0) {
            return;
        }
        if (!this.field2431.field1180) {
            this.method1044();
        }
        short var11 = this.field2431.field1174;
        short var12 = this.field2431.field1175;
        short var13 = this.field2431.field1179;
        int var14 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var15 = arg1 * arg6 + arg2 * var14 >> 16;
        int var16 = (arg1 * var13 + arg2 * var11 >> 16) + var15;
        if (var16 <= 50) {
            return;
        }
        int var17 = (-var11 * arg2 + arg1 * var12 >> 16) + var15;
        if (var17 >= 3584) {
            return;
        }
        int var18 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var19 = var11 + var18 << 9;
        if (var19 / var16 <= class196.field3067) {
            return;
        }
        int var20 = var18 - var11 << 9;
        if (var20 / var16 >= class99.field1476) {
            return;
        }
        int var21 = arg2 * arg6 - arg1 * var14 >> 16;
        int var22 = (arg1 * var11 + arg2 * var13 >> 16) + var21 << 9;
        if (var22 / var16 <= class280.field4750) {
            return;
        }
        int var23 = (-var11 * arg1 + arg2 * var12 >> 16) + var21 << 9;
        if (var23 / var16 >= class84.field1276) {
            return;
        }
        int var24 = 0;
        int var25 = 0;
        if (arg0 != 0) {
            var24 = class229.field3805[arg0];
            var25 = class229.field3806[arg0];
        }
        if (arg8 > 0L && class242.field4033 && var17 > 0) {
            int var26;
            int var27;
            if (var18 > 0) {
                var26 = var20 / var16;
                var27 = var19 / var17;
            } else {
                var26 = var20 / var17;
                var27 = var19 / var16;
            }
            int var28;
            int var29;
            if (var21 > 0) {
                var28 = var23 / var16;
                var29 = var22 / var17;
            } else {
                var28 = var23 / var17;
                var29 = var22 / var16;
            }
            if (class73.field1148 >= var26 && class73.field1148 <= var27 && class170.field2619 >= var28 && class170.field2619 <= var29) {
                int var30 = 999999;
                int var31 = -999999;
                int var32 = 999999;
                int var33 = -999999;
                short var34 = this.field2431.field1178;
                short var35 = this.field2431.field1176;
                short var36 = this.field2431.field1181;
                short var37 = this.field2431.field1177;
                int[] var38 = new int[] { var34, var35, var34, var35, var34, var35, var34, var35 };
                int[] var39 = new int[] { var36, var36, var37, var37, var36, var36, var37, var37 };
                int[] var40 = new int[] { var12, var12, var12, var12, var13, var13, var13, var13 };
                for (int var41 = 0; var41 < 8; var41++) {
                    int var42 = var38[var41];
                    int var43 = var40[var41];
                    int var44 = var39[var41];
                    if (arg0 != 0) {
                        int var45 = var24 * var44 + var25 * var42 >> 16;
                        var44 = var25 * var44 - var24 * var42 >> 16;
                        var42 = var45;
                    }
                    int var46 = arg5 + var42;
                    int var47 = arg6 + var43;
                    int var48 = arg7 + var44;
                    int var49 = arg3 * var48 + arg4 * var46 >> 16;
                    int var50 = arg4 * var48 - arg3 * var46 >> 16;
                    int var52 = arg2 * var47 - arg1 * var50 >> 16;
                    int var53 = arg1 * var47 + arg2 * var50 >> 16;
                    if (var53 > 0) {
                        int var55 = (var49 << 9) / var53;
                        int var56 = (var52 << 9) / var53;
                        if (var55 < var30) {
                            var30 = var55;
                        }
                        if (var55 > var31) {
                            var31 = var55;
                        }
                        if (var56 < var32) {
                            var32 = var56;
                        }
                        if (var56 > var33) {
                            var33 = var56;
                        }
                    }
                }
                if (class73.field1148 >= var30 && class73.field1148 <= var31 && class170.field2619 >= var32 && class170.field2619 <= var33) {
                    if (this.field532) {
                        class181.field2746[class76.field1189++] = arg8;
                    } else {
                        if (field2448.length < this.field2412) {
                            field2448 = new int[this.field2412];
                            field2442 = new int[this.field2412];
                        }
                        int var57 = 0;
                        label118: while (true) {
                            if (var57 >= this.field2417) {
                                int var77 = 0;
                                while (true) {
                                    if (var77 >= this.field2426) {
                                        break label118;
                                    }
                                    short var78 = this.field2422[var77];
                                    short var79 = this.field2403[var77];
                                    short var80 = this.field2435[var77];
                                    if (this.method1039(class73.field1148, class170.field2619, field2442[var78], field2442[var79], field2442[var80], field2448[var78], field2448[var79], field2448[var80])) {
                                        class181.field2746[class76.field1189++] = arg8;
                                        break label118;
                                    }
                                    var77++;
                                }
                            }
                            int var58 = this.field2399[var57];
                            int var59 = this.field2423[var57];
                            int var60 = this.field2418[var57];
                            if (arg0 != 0) {
                                int var61 = var24 * var60 + var25 * var58 >> 16;
                                var60 = var25 * var60 - var24 * var58 >> 16;
                                var58 = var61;
                            }
                            int var62 = arg5 + var58;
                            int var63 = arg6 + var59;
                            int var64 = arg7 + var60;
                            int var65 = arg3 * var64 + arg4 * var62 >> 16;
                            int var66 = arg4 * var64 - arg3 * var62 >> 16;
                            int var68 = arg2 * var63 - arg1 * var66 >> 16;
                            int var69 = arg1 * var63 + arg2 * var66 >> 16;
                            if (var69 < 50) {
                                break;
                            }
                            int var71 = (var65 << 9) / var69;
                            int var72 = (var68 << 9) / var69;
                            int var73 = this.field2404[var57];
                            int var74 = this.field2404[var57 + 1];
                            for (int var75 = var73; var75 < var74; var75++) {
                                int var76 = this.field2424[var75] - 1;
                                if (var76 == -1) {
                                    break;
                                }
                                field2448[var76] = var71;
                                field2442[var76] = var72;
                            }
                            var57++;
                        }
                    }
                }
            }
        }
        GL var81 = class45.field688;
        var81.glPushMatrix();
        var81.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var81.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1058();
        var81.glPopMatrix();
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(III)V", line = 398)
    public final void method243(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2417; var4++) {
            this.field2399[var4] += arg0;
            this.field2423[var4] += arg1;
            this.field2418[var4] += arg2;
        }
        this.field2431.field1180 = false;
        this.field2408.field1229 = false;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "()I", line = 411)
    public final int method248() {
        if (!this.field2431.field1180) {
            this.method1044();
        }
        return this.field2431.field1175;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lkb;IIIZ)V", line = 418)
    public final void method1026(class280 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class160 var6 = (class160) arg0;
        if (this.field2426 == 0 || var6.field2426 == 0) {
            return;
        }
        int var7 = var6.field2417;
        int[] var8 = var6.field2399;
        int[] var9 = var6.field2423;
        int[] var10 = var6.field2418;
        short[] var11 = var6.field2425;
        short[] var12 = var6.field2414;
        short[] var13 = var6.field2419;
        short[] var14 = var6.field2401;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field2413 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field2413.field654;
            var16 = this.field2413.field655;
            var17 = this.field2413.field652;
            var18 = this.field2413.field653;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field2413 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field2413.field654;
            var20 = var6.field2413.field655;
            var21 = var6.field2413.field652;
            var22 = var6.field2413.field653;
        }
        int[] var23 = var6.field2404;
        short[] var24 = var6.field2424;
        if (!var6.field2431.field1180) {
            var6.method1044();
        }
        short var25 = var6.field2431.field1175;
        short var26 = var6.field2431.field1179;
        short var27 = var6.field2431.field1178;
        short var28 = var6.field2431.field1176;
        short var29 = var6.field2431.field1181;
        short var30 = var6.field2431.field1177;
        for (int var31 = 0; var31 < this.field2417; var31++) {
            int var32 = this.field2423[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field2399[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field2418[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field2404[var31];
                        int var37 = this.field2404[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field2424[var38] - 1;
                            if (var35 == -1 || this.field2401[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field2413 = new class44();
                                            var15 = this.field2413.field654 = class139.method901(this.field2425, false);
                                            var16 = this.field2413.field655 = class139.method901(this.field2414, false);
                                            var17 = this.field2413.field652 = class139.method901(this.field2419, false);
                                            var18 = this.field2413.field653 = class139.method901(this.field2401, false);
                                        }
                                        if (var19 == null) {
                                            class44 var44 = var6.field2413 = new class44();
                                            var19 = var44.field654 = class139.method901(var11, false);
                                            var20 = var44.field655 = class139.method901(var12, false);
                                            var21 = var44.field652 = class139.method901(var13, false);
                                            var22 = var44.field653 = class139.method901(var14, false);
                                        }
                                        short var45 = this.field2425[var35];
                                        short var46 = this.field2414[var35];
                                        short var47 = this.field2419[var35];
                                        short var48 = this.field2401[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field2404[var31];
                                        int var58 = this.field2404[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field2424[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "()V", line = 655)
    public final void method1027() {
        if (this.field2425 == null) {
            this.method230();
            return;
        }
        for (int var1 = 0; var1 < this.field2417; var1++) {
            int var2 = this.field2418[var1];
            this.field2418[var1] = this.field2399[var1];
            this.field2399[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2412; var3++) {
            short var4 = this.field2419[var3];
            this.field2419[var3] = this.field2425[var3];
            this.field2425[var3] = (short) (-var4);
        }
        this.field2431.field1180 = false;
        this.field2408.field1229 = false;
        if (this.field2398 != null) {
            this.field2398.field1229 = false;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I[IIIIZ)V", line = 693)
    private final void method1028(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field2449 = 0;
            field2441 = 0;
            field2443 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field2434.length) {
                    int[] var14 = this.field2434[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field2449 += this.field2399[var16];
                        field2441 += this.field2423[var16];
                        field2443 += this.field2418[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field2449 = field2449 / var11 + var8;
                field2441 = field2441 / var11 + var9;
                field2443 = field2443 / var11 + var10;
            } else {
                field2449 = var8;
                field2441 = var9;
                field2443 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field2434.length) {
                    int[] var22 = this.field2434[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field2399[var24] += var17;
                        this.field2423[var24] += var18;
                        this.field2418[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field2434.length) {
                    int[] var27 = this.field2434[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field2399[var29] -= field2449;
                        this.field2423[var29] -= field2441;
                        this.field2418[var29] -= field2443;
                        if (arg4 != 0) {
                            int var30 = class229.field3805[arg4];
                            int var31 = class229.field3806[arg4];
                            int var32 = this.field2423[var29] * var30 + this.field2399[var29] * var31 + 32767 >> 16;
                            this.field2423[var29] = this.field2423[var29] * var31 + 32767 - this.field2399[var29] * var30 >> 16;
                            this.field2399[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class229.field3805[arg2];
                            int var34 = class229.field3806[arg2];
                            int var35 = this.field2423[var29] * var34 + 32767 - this.field2418[var29] * var33 >> 16;
                            this.field2418[var29] = this.field2423[var29] * var33 + this.field2418[var29] * var34 + 32767 >> 16;
                            this.field2423[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class229.field3805[arg3];
                            int var37 = class229.field3806[arg3];
                            int var38 = this.field2418[var29] * var36 + this.field2399[var29] * var37 + 32767 >> 16;
                            this.field2418[var29] = this.field2418[var29] * var37 + 32767 - this.field2399[var29] * var36 >> 16;
                            this.field2399[var29] = var38;
                        }
                        this.field2399[var29] += field2449;
                        this.field2423[var29] += field2441;
                        this.field2418[var29] += field2443;
                    }
                }
            }
            if (arg5 && this.field2425 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field2434.length) {
                        int[] var41 = this.field2434[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field2404[var43];
                            int var45 = this.field2404[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field2424[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class229.field3805[arg4];
                                    int var49 = class229.field3806[arg4];
                                    int var50 = this.field2425[var47] * var49 + this.field2414[var47] * var48 + 32767 >> 16;
                                    this.field2414[var47] = (short) (this.field2414[var47] * var49 + 32767 - this.field2425[var47] * var48 >> 16);
                                    this.field2425[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class229.field3805[arg2];
                                    int var52 = class229.field3806[arg2];
                                    int var53 = this.field2414[var47] * var52 + 32767 - this.field2419[var47] * var51 >> 16;
                                    this.field2419[var47] = (short) (this.field2419[var47] * var52 + this.field2414[var47] * var51 + 32767 >> 16);
                                    this.field2414[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class229.field3805[arg3];
                                    int var55 = class229.field3806[arg3];
                                    int var56 = this.field2425[var47] * var55 + this.field2419[var47] * var54 + 32767 >> 16;
                                    this.field2419[var47] = (short) (this.field2419[var47] * var55 + 32767 - this.field2425[var47] * var54 >> 16);
                                    this.field2425[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field2398 != null) {
                    this.field2398.field1229 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field2434.length) {
                    int[] var59 = this.field2434[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field2399[var61] -= field2449;
                        this.field2423[var61] -= field2441;
                        this.field2418[var61] -= field2443;
                        this.field2399[var61] = this.field2399[var61] * arg2 >> 7;
                        this.field2423[var61] = this.field2423[var61] * arg3 >> 7;
                        this.field2418[var61] = this.field2418[var61] * arg4 >> 7;
                        this.field2399[var61] += field2449;
                        this.field2423[var61] += field2441;
                        this.field2418[var61] += field2443;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2405 != null && this.field2430 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field2405.length) {
                    int[] var64 = this.field2405[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field2430[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field2430[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field2411.field1229 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "()V", line = 1038)
    public final void method1029() {
        for (int var1 = 0; var1 < this.field2417; var1++) {
            this.field2418[var1] = -this.field2418[var1];
        }
        if (this.field2419 != null) {
            for (int var2 = 0; var2 < this.field2412; var2++) {
                this.field2419[var2] = (short) (-this.field2419[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field2426; var3++) {
            short var4 = this.field2422[var3];
            this.field2422[var3] = this.field2435[var3];
            this.field2435[var3] = var4;
        }
        this.field2431.field1180 = false;
        this.field2408.field1229 = false;
        if (this.field2398 != null) {
            this.field2398.field1229 = false;
        }
        this.field2397.field1229 = false;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(III)Lkb;", line = 1074)
    public final class280 method1030(int arg0, int arg1, int arg2) {
        this.field2429 = false;
        if (this.field2413 != null) {
            this.field2425 = this.field2413.field654;
            this.field2414 = this.field2413.field655;
            this.field2419 = this.field2413.field652;
            this.field2401 = this.field2413.field653;
            this.field2413 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "()V", line = 1087)
    public final void method1031() {
        if (this.field2425 == null) {
            this.method240();
            return;
        }
        for (int var1 = 0; var1 < this.field2417; var1++) {
            this.field2399[var1] = -this.field2399[var1];
            this.field2418[var1] = -this.field2418[var1];
        }
        for (int var2 = 0; var2 < this.field2412; var2++) {
            this.field2425[var2] = (short) (-this.field2425[var2]);
            this.field2419[var2] = (short) (-this.field2419[var2]);
        }
        this.field2431.field1180 = false;
        this.field2408.field1229 = false;
        if (this.field2398 != null) {
            this.field2398.field1229 = false;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "()V", line = 1122)
    public final void method230() {
        for (int var1 = 0; var1 < this.field2417; var1++) {
            int var2 = this.field2418[var1];
            this.field2418[var1] = this.field2399[var1];
            this.field2399[var1] = -var2;
        }
        this.field2431.field1180 = false;
        this.field2408.field1229 = false;
    }

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "()I", line = 1136)
    public final int method1032() {
        return this.field2437;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ISIB)I", line = 1140)
    private static final int method1033(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class229.field3791[class227.method1599(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class229.field3802.method1101((byte) -109, arg1 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class229.field3802.method1091(255, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZZ)Lkl;", line = 1198)
    public final class34 method239(boolean arg0, boolean arg1) {
        return this.method1045(arg0, arg1, field2436, field2427);
    }

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "()V", line = 1201)
    public final void method1034() {
        int var10002;
        if (this.field2410 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2417; var3++) {
                int var4 = this.field2410[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2434 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2434[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2417) {
                int var7 = this.field2410[var6] & 0xFF;
                this.field2434[var7][var1[var7]++] = var6++;
            }
            this.field2410 = null;
        }
        if (this.field2396 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2426; var10++) {
            int var11 = this.field2396[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2405 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2405[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2426) {
            int var14 = this.field2396[var13] & 0xFF;
            this.field2405[var14][var8[var14]++] = var13++;
        }
        this.field2396 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIII)V", line = 1295)
    public final void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2412 == 0) {
            return;
        }
        GL var8 = class45.field688;
        var8.glPushMatrix();
        if (arg3 != 0) {
            var8.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var8.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var8.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var8.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var8.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method1058();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([SI)[S", line = 1321)
    private static final short[] method1035(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class42.method297(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V", line = 1326)
    public final void method1036(int arg0) {
        this.field2400 = (short) arg0;
        this.field2411.field1229 = false;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIII)V", line = 1330)
    private final void method1037(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field2449 = 0;
            field2441 = 0;
            field2443 = 0;
            for (int var6 = 0; var6 < this.field2417; var6++) {
                field2449 += this.field2399[var6];
                field2441 += this.field2423[var6];
                field2443 += this.field2418[var6];
                var5++;
            }
            if (var5 > 0) {
                field2449 = field2449 / var5 + arg1;
                field2441 = field2441 / var5 + arg2;
                field2443 = field2443 / var5 + arg3;
            } else {
                field2449 = arg1;
                field2441 = arg2;
                field2443 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field2417; var7++) {
                this.field2399[var7] += arg1;
                this.field2423[var7] += arg2;
                this.field2418[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field2417; var8++) {
                this.field2399[var8] -= field2449;
                this.field2423[var8] -= field2441;
                this.field2418[var8] -= field2443;
                if (arg3 != 0) {
                    int var9 = class229.field3805[arg3];
                    int var10 = class229.field3806[arg3];
                    int var11 = this.field2423[var8] * var9 + this.field2399[var8] * var10 + 32767 >> 16;
                    this.field2423[var8] = this.field2423[var8] * var10 + 32767 - this.field2399[var8] * var9 >> 16;
                    this.field2399[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class229.field3805[arg1];
                    int var13 = class229.field3806[arg1];
                    int var14 = this.field2423[var8] * var13 + 32767 - this.field2418[var8] * var12 >> 16;
                    this.field2418[var8] = this.field2423[var8] * var12 + this.field2418[var8] * var13 + 32767 >> 16;
                    this.field2423[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class229.field3805[arg2];
                    int var16 = class229.field3806[arg2];
                    int var17 = this.field2418[var8] * var15 + this.field2399[var8] * var16 + 32767 >> 16;
                    this.field2418[var8] = this.field2418[var8] * var16 + 32767 - this.field2399[var8] * var15 >> 16;
                    this.field2399[var8] = var17;
                }
                this.field2399[var8] += field2449;
                this.field2423[var8] += field2441;
                this.field2418[var8] += field2443;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field2417; var18++) {
                this.field2399[var18] -= field2449;
                this.field2423[var18] -= field2441;
                this.field2418[var18] -= field2443;
                this.field2399[var18] = this.field2399[var18] * arg1 / 128;
                this.field2423[var18] = this.field2423[var18] * arg2 / 128;
                this.field2418[var18] = this.field2418[var18] * arg3 / 128;
                this.field2399[var18] += field2449;
                this.field2423[var18] += field2441;
                this.field2418[var18] += field2443;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field2426; var19++) {
                int var20 = (this.field2430[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field2430[var19] = (byte) var20;
            }
            this.field2411.field1229 = false;
        }
    }

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "()V", line = 1484)
    public static void method1038() {
        field2406 = null;
        field2415 = null;
        field2432 = null;
        field2427 = null;
        field2436 = null;
        field2438 = null;
        field2439 = null;
        field2448 = null;
        field2442 = null;
    }

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "()I", line = 1495)
    public final int method237() {
        if (!this.field2431.field1180) {
            this.method1044();
        }
        return this.field2431.field1181;
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "()I", line = 1501)
    public final int method232() {
        if (!this.field2431.field1180) {
            this.method1044();
        }
        return this.field2431.field1178;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(ZZ)Lkl;", line = 1507)
    public final class34 method241(boolean arg0, boolean arg1) {
        return this.method1045(arg0, arg1, field2439, field2438);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIII)Z", line = 1510)
    private final boolean method1039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZZZZZZZ)V", line = 1527)
    public final void method1040(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field2395 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field2412 != 0) {
            if (arg6) {
                boolean var8 = !this.field2411.field1229 && (arg1 || arg2 && !class8.field114);
                this.method1060(false, !this.field2408.field1229 && arg0, var8, this.field2398 != null && !this.field2398.field1229 && arg2, !this.field2420.field1229 && arg3);
                if (!this.field2397.field1229 && arg4 && arg1) {
                    this.method1049();
                }
            }
            if (arg0) {
                if (this.field2408.field1229) {
                    this.field2399 = null;
                    this.field2423 = null;
                    this.field2418 = null;
                    this.field2424 = null;
                    this.field2404 = null;
                } else {
                    this.field2416 = (byte) (this.field2416 | 0x1);
                }
            }
            if (arg1) {
                if (this.field2411.field1229) {
                    this.field2421 = null;
                    this.field2430 = null;
                } else {
                    this.field2416 = (byte) (this.field2416 | 0x2);
                }
            }
            if (arg2 && class8.field114) {
                if (this.field2398.field1229) {
                    this.field2425 = null;
                    this.field2414 = null;
                    this.field2419 = null;
                    this.field2401 = null;
                } else {
                    this.field2416 = (byte) (this.field2416 | 0x4);
                }
            }
            if (arg3) {
                if (this.field2420.field1229) {
                    this.field2402 = null;
                    this.field2409 = null;
                } else {
                    this.field2416 = (byte) (this.field2416 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field2397.field1229 && this.field2411.field1229) {
                    this.field2422 = null;
                    this.field2403 = null;
                    this.field2435 = null;
                } else {
                    this.field2416 = (byte) (this.field2416 | 0x10);
                }
            }
            if (arg5) {
                this.field2410 = null;
                this.field2396 = null;
                this.field2434 = (int[][]) null;
                this.field2405 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(SS)V", line = 1622)
    public final void method1041(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2426; var3++) {
            if (this.field2421[var3] == arg0) {
                this.field2421[var3] = arg1;
            }
        }
        this.field2411.field1229 = false;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIII[FIF)V", line = 1634)
    private static final void method1042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field2447 = var16;
        field2440 = var17;
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(III)V", line = 1680)
    public final void method251(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2417; var4++) {
            this.field2399[var4] = this.field2399[var4] * arg0 >> 7;
            this.field2423[var4] = this.field2423[var4] * arg1 >> 7;
            this.field2418[var4] = this.field2418[var4] * arg2 >> 7;
        }
        this.field2431.field1180 = false;
        this.field2408.field1229 = false;
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)V", line = 1693)
    public final void method1043(int arg0) {
        this.field2437 = (short) arg0;
        if (this.field2398 != null) {
            this.field2398.field1229 = false;
        }
    }

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "()V", line = 1700)
    private final void method1044() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field2417; var9++) {
            int var10 = this.field2399[var9];
            int var11 = this.field2423[var9];
            int var12 = this.field2418[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field2431.field1178 = (short) var1;
        this.field2431.field1176 = (short) var4;
        this.field2431.field1175 = (short) var2;
        this.field2431.field1179 = (short) var5;
        this.field2431.field1181 = (short) var3;
        this.field2431.field1177 = (short) var6;
        this.field2431.field1174 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field2431.field1180 = true;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V", line = 3739)
    private class160() {
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lch;IIZ)V", line = 3756)
    public class160(class183 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field2792];
        this.field2404 = new int[arg0.field2801 + 1];
        for (int var6 = 0; var6 < arg0.field2792; var6++) {
            if ((arg0.field2806 == null || arg0.field2806[var6] != 2) && (arg0.field2782 == null || arg0.field2782[var6] == -1 || !class229.field3802.method1098(arg0.field2782[var6] & 0xFFFF, (byte) -91))) {
                var5[this.field2426++] = var6;
                this.field2404[arg0.field2789[var6]]++;
                this.field2404[arg0.field2823[var6]]++;
                this.field2404[arg0.field2819[var6]]++;
            }
        }
        long[] var7 = new long[this.field2426];
        for (int var8 = 0; var8 < this.field2426; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field2782 != null) {
                var14 = arg0.field2782[var9];
                if (var14 != -1) {
                    var12 = class229.field3802.method1099((byte) -85, var14 & 0xFFFF);
                    var13 = class229.field3802.method1097(var14 & 0xFFFF, (byte) 103);
                }
            }
            boolean var15 = arg0.field2808 != null && arg0.field2808[var9] != 0 || var14 != -1 && !class229.field3802.method1090(var14 & 0xFFFF, 0);
            if ((arg3 || var15) && arg0.field2820 != null) {
                var10 += arg0.field2820[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class268.method1844(var7, (byte) -59, var5);
        this.field2417 = arg0.field2801;
        this.field2399 = arg0.field2790;
        this.field2423 = arg0.field2804;
        this.field2418 = arg0.field2787;
        this.field2410 = arg0.field2826;
        int var20 = this.field2426 * 3;
        this.field2425 = new short[var20];
        this.field2414 = new short[var20];
        this.field2419 = new short[var20];
        this.field2401 = new short[var20];
        this.field2402 = new float[var20];
        this.field2409 = new float[var20];
        this.field2421 = new short[this.field2426];
        this.field2430 = new byte[this.field2426];
        this.field2422 = new short[this.field2426];
        this.field2403 = new short[this.field2426];
        this.field2435 = new short[this.field2426];
        this.field2433 = new short[this.field2426];
        if (arg0.field2816 != null) {
            this.field2396 = new byte[this.field2426];
        }
        this.field2431 = new class75();
        this.field2408 = new class79();
        this.field2411 = new class79();
        if (class8.field114) {
            this.field2398 = new class79();
        }
        this.field2420 = new class79();
        this.field2397 = new class79();
        this.field2400 = (short) arg1;
        this.field2437 = (short) arg2;
        this.field2424 = new short[var20];
        field2406 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field2801; var22++) {
            int var23 = this.field2404[var22];
            this.field2404[var22] = var21;
            var21 += var23;
        }
        this.field2404[arg0.field2801] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field2783 != null) {
            int var28 = arg0.field2796;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field2426; var36++) {
                int var37 = var5[var36];
                if (arg0.field2783[var37] != -1) {
                    int var38 = arg0.field2783[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field2789[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field2823[var37];
                        } else {
                            var40 = arg0.field2819[var37];
                        }
                        int var41 = arg0.field2790[var40];
                        int var42 = arg0.field2804[var40];
                        int var43 = arg0.field2787[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field2814[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field2818[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field2827[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field2818[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field2827[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field2780[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field2818[var44] / 1024.0F;
                        var49 = (float) arg0.field2827[var44] / 1024.0F;
                        var48 = (float) arg0.field2780[var44] / 1024.0F;
                    }
                    var27[var44] = method1055(arg0.field2798[var44], arg0.field2784[var44], arg0.field2813[var44], arg0.field2785[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field2426; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field2799[var51] & 0xFFFF;
            short var53;
            if (arg0.field2782 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field2782[var51];
            }
            int var54;
            if (arg0.field2783 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field2783[var51];
            }
            int var55;
            if (arg0.field2808 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field2808[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field2814[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field2789[var51];
                        int var67 = arg0.field2823[var51];
                        int var68 = arg0.field2819[var51];
                        short var69 = arg0.field2798[var54];
                        short var70 = arg0.field2784[var54];
                        short var71 = arg0.field2813[var54];
                        float var72 = (float) arg0.field2790[var69];
                        float var73 = (float) arg0.field2804[var69];
                        float var74 = (float) arg0.field2787[var69];
                        float var75 = (float) arg0.field2790[var70] - var72;
                        float var76 = (float) arg0.field2804[var70] - var73;
                        float var77 = (float) arg0.field2787[var70] - var74;
                        float var78 = (float) arg0.field2790[var71] - var72;
                        float var79 = (float) arg0.field2804[var71] - var73;
                        float var80 = (float) arg0.field2787[var71] - var74;
                        float var81 = (float) arg0.field2790[var66] - var72;
                        float var82 = (float) arg0.field2804[var66] - var73;
                        float var83 = (float) arg0.field2787[var66] - var74;
                        float var84 = (float) arg0.field2790[var67] - var72;
                        float var85 = (float) arg0.field2804[var67] - var73;
                        float var86 = (float) arg0.field2787[var67] - var74;
                        float var87 = (float) arg0.field2790[var68] - var72;
                        float var88 = (float) arg0.field2804[var68] - var73;
                        float var89 = (float) arg0.field2787[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field2789[var51];
                        int var102 = arg0.field2823[var51];
                        int var103 = arg0.field2819[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field2805[var54];
                        float var109 = (float) arg0.field2817[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field2780[var54] & 0xFFFF) / 1024.0F;
                            method1053(arg0.field2790[var101], arg0.field2804[var101], arg0.field2787[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field2444;
                            var57 = field2445;
                            method1053(arg0.field2790[var102], arg0.field2804[var102], arg0.field2787[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field2444;
                            var59 = field2445;
                            method1053(arg0.field2790[var103], arg0.field2804[var103], arg0.field2787[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field2444;
                            var61 = field2445;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field2779[var54] / 256.0F;
                            float var113 = (float) arg0.field2797[var54] / 256.0F;
                            int var114 = arg0.field2790[var102] - arg0.field2790[var101];
                            int var115 = arg0.field2804[var102] - arg0.field2804[var101];
                            int var116 = arg0.field2787[var102] - arg0.field2787[var101];
                            int var117 = arg0.field2790[var103] - arg0.field2790[var101];
                            int var118 = arg0.field2804[var103] - arg0.field2804[var101];
                            int var119 = arg0.field2787[var103] - arg0.field2787[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field2818[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field2827[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field2780[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1061(var126, var127, var128);
                            method1057(arg0.field2790[var101], arg0.field2804[var101], arg0.field2787[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field2446;
                            var57 = field2450;
                            method1057(arg0.field2790[var102], arg0.field2804[var102], arg0.field2787[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field2446;
                            var59 = field2450;
                            method1057(arg0.field2790[var103], arg0.field2804[var103], arg0.field2787[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field2446;
                            var61 = field2450;
                        } else if (var65 == 3) {
                            method1042(arg0.field2790[var101], arg0.field2804[var101], arg0.field2787[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field2447;
                            var57 = field2440;
                            method1042(arg0.field2790[var102], arg0.field2804[var102], arg0.field2787[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field2447;
                            var59 = field2440;
                            method1042(arg0.field2790[var103], arg0.field2804[var103], arg0.field2787[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field2447;
                            var61 = field2440;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method1189();
            byte var129;
            if (arg0.field2806 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field2806[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field2789[var51];
                class214 var133 = arg0.field2793[var132];
                this.field2422[var50] = this.method1052(arg0, var132, var130, var133.field3395, var133.field3396, var133.field3403, var133.field3401, var56, var57);
                int var134 = arg0.field2823[var51];
                class214 var135 = arg0.field2793[var134];
                this.field2403[var50] = this.method1052(arg0, var134, (long) var62 + var130, var135.field3395, var135.field3396, var135.field3403, var135.field3401, var58, var59);
                int var136 = arg0.field2819[var51];
                class214 var137 = arg0.field2793[var136];
                this.field2435[var50] = this.method1052(arg0, var136, (long) var63 + var130, var137.field3395, var137.field3396, var137.field3403, var137.field3401, var60, var61);
            } else if (var129 == 1) {
                class138 var138 = arg0.field2788[var51];
                long var139 = (long) ((var54 << 2) + (var138.field2050 > 0 ? 1024 : 2048) + (var138.field2044 + 256 << 12) + (var138.field2046 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field2422[var50] = this.method1052(arg0, arg0.field2789[var51], var139, var138.field2050, var138.field2044, var138.field2046, 0, var56, var57);
                this.field2403[var50] = this.method1052(arg0, arg0.field2823[var51], (long) var62 + var139, var138.field2050, var138.field2044, var138.field2046, 0, var58, var59);
                this.field2435[var50] = this.method1052(arg0, arg0.field2819[var51], (long) var63 + var139, var138.field2050, var138.field2044, var138.field2046, 0, var60, var61);
            }
            if (arg0.field2782 == null) {
                this.field2433[var50] = -1;
            } else {
                this.field2433[var50] = arg0.field2782[var51];
            }
            if (this.field2396 != null) {
                this.field2396[var50] = (byte) arg0.field2816[var51];
            }
            this.field2421[var50] = arg0.field2799[var51];
            if (arg0.field2808 != null) {
                this.field2430[var50] = arg0.field2808[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field2426; var143++) {
            short var144 = this.field2433[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field2407 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field2426; var147++) {
            short var148 = this.field2433[var147];
            if (var146 != var148) {
                this.field2407[var145++] = var147;
                var146 = var148;
            }
        }
        this.field2407[var145] = this.field2426;
        field2406 = null;
        this.field2425 = method1035(this.field2425, this.field2412);
        this.field2414 = method1035(this.field2414, this.field2412);
        this.field2419 = method1035(this.field2419, this.field2412);
        this.field2401 = method1035(this.field2401, this.field2412);
        this.field2402 = method1051(this.field2402, this.field2412);
        this.field2409 = method1051(this.field2409, this.field2412);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZZLoh;Loh;)Lkl;", line = 1772)
    private final class34 method1045(boolean arg0, boolean arg1, class160 arg2, class160 arg3) {
        arg2.field2417 = this.field2417;
        arg2.field2412 = this.field2412;
        arg2.field2426 = this.field2426;
        arg2.field2400 = this.field2400;
        arg2.field2437 = this.field2437;
        arg2.field2395 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field2399 == null || arg2.field2399.length < this.field2417) {
            arg2.field2399 = new int[this.field2417 + 100];
            arg2.field2423 = new int[this.field2417 + 100];
            arg2.field2418 = new int[this.field2417 + 100];
        }
        for (int var5 = 0; var5 < this.field2417; var5++) {
            arg2.field2399[var5] = this.field2399[var5];
            arg2.field2423[var5] = this.field2423[var5];
            arg2.field2418[var5] = this.field2418[var5];
        }
        if (arg2.field2408 == null) {
            arg2.field2408 = new class79();
        }
        arg2.field2408.field1229 = false;
        if (arg2.field2431 == null) {
            arg2.field2431 = new class75();
        }
        arg2.field2431.field1180 = false;
        if (arg0) {
            arg2.field2430 = this.field2430;
            arg2.field2411 = this.field2411;
        } else {
            if (arg3.field2430 == null || arg3.field2430.length < this.field2426) {
                arg3.field2430 = new byte[this.field2426 + 100];
            }
            arg2.field2430 = arg3.field2430;
            for (int var6 = 0; var6 < this.field2426; var6++) {
                arg2.field2430[var6] = this.field2430[var6];
            }
            if (arg3.field2411 == null) {
                arg3.field2411 = new class79();
            }
            arg2.field2411 = arg3.field2411;
            arg2.field2411.field1229 = false;
        }
        if (arg1) {
            arg2.field2425 = this.field2425;
            arg2.field2414 = this.field2414;
            arg2.field2419 = this.field2419;
            arg2.field2401 = this.field2401;
            arg2.field2398 = this.field2398;
        } else {
            if (arg3.field2425 == null || arg3.field2425.length < this.field2412) {
                arg3.field2425 = new short[this.field2412 + 100];
                arg3.field2414 = new short[this.field2412 + 100];
                arg3.field2419 = new short[this.field2412 + 100];
                arg3.field2401 = new short[this.field2412 + 100];
            }
            arg2.field2425 = arg3.field2425;
            arg2.field2414 = arg3.field2414;
            arg2.field2419 = arg3.field2419;
            arg2.field2401 = arg3.field2401;
            for (int var7 = 0; var7 < this.field2412; var7++) {
                arg2.field2425[var7] = this.field2425[var7];
                arg2.field2414[var7] = this.field2414[var7];
                arg2.field2419[var7] = this.field2419[var7];
                arg2.field2401[var7] = this.field2401[var7];
            }
            if (class8.field114) {
                if (arg3.field2398 == null) {
                    arg3.field2398 = new class79();
                }
                arg2.field2398 = arg3.field2398;
                arg2.field2398.field1229 = false;
            } else {
                arg2.field2398 = null;
            }
        }
        arg2.field2402 = this.field2402;
        arg2.field2409 = this.field2409;
        arg2.field2410 = this.field2410;
        arg2.field2434 = this.field2434;
        arg2.field2421 = this.field2421;
        arg2.field2422 = this.field2422;
        arg2.field2403 = this.field2403;
        arg2.field2435 = this.field2435;
        arg2.field2433 = this.field2433;
        arg2.field2396 = this.field2396;
        arg2.field2405 = this.field2405;
        arg2.field2420 = this.field2420;
        arg2.field2397 = this.field2397;
        arg2.field2407 = this.field2407;
        arg2.field2424 = this.field2424;
        arg2.field2404 = this.field2404;
        arg2.field532 = this.field532;
        return arg2;
    }

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "()V", line = 1896)
    public final void method1046() {
        if (this.field2425 == null) {
            this.method234();
            return;
        }
        for (int var1 = 0; var1 < this.field2417; var1++) {
            int var2 = this.field2399[var1];
            this.field2399[var1] = this.field2418[var1];
            this.field2418[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2412; var3++) {
            short var4 = this.field2425[var3];
            this.field2425[var3] = this.field2419[var3];
            this.field2419[var3] = (short) (-var4);
        }
        this.field2431.field1180 = false;
        this.field2408.field1229 = false;
        if (this.field2398 != null) {
            this.field2398.field1229 = false;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V", line = 1934)
    public final void method245(int arg0) {
        int var2 = class229.field3805[arg0];
        int var3 = class229.field3806[arg0];
        for (int var4 = 0; var4 < this.field2417; var4++) {
            int var5 = this.field2418[var4] * var2 + this.field2399[var4] * var3 >> 16;
            this.field2418[var4] = this.field2418[var4] * var3 - this.field2399[var4] * var2 >> 16;
            this.field2399[var4] = var5;
        }
        this.field2431.field1180 = false;
        this.field2408.field1229 = false;
    }

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "()I", line = 1953)
    public final int method236() {
        if (!this.field2431.field1180) {
            this.method1044();
        }
        return this.field2431.field1176;
    }

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "()V", line = 1961)
    public static final void method1047() {
        field2427 = new class160();
        field2436 = new class160();
        field2438 = new class160();
        field2439 = new class160();
    }

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "(I)V", line = 1968)
    public final void method1048(int arg0) {
        if (this.field2425 == null) {
            this.method245(arg0);
            return;
        }
        int var2 = class229.field3805[arg0];
        int var3 = class229.field3806[arg0];
        for (int var4 = 0; var4 < this.field2417; var4++) {
            int var5 = this.field2418[var4] * var2 + this.field2399[var4] * var3 >> 16;
            this.field2418[var4] = this.field2418[var4] * var3 - this.field2399[var4] * var2 >> 16;
            this.field2399[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field2412; var6++) {
            int var7 = this.field2425[var6] * var3 + this.field2419[var6] * var2 >> 16;
            this.field2419[var6] = (short) (this.field2419[var6] * var3 - this.field2425[var6] * var2 >> 16);
            this.field2425[var6] = (short) var7;
        }
        this.field2431.field1180 = false;
        this.field2408.field1229 = false;
        if (this.field2398 != null) {
            this.field2398.field1229 = false;
        }
    }

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "()V", line = 2011)
    private final void method1049() {
        if (field2415.field3617.length < this.field2412 * 12) {
            field2415 = new class221((this.field2412 + 100) * 12);
        } else {
            field2415.field3610 = 0;
        }
        if (class45.field675) {
            for (int var1 = 0; var1 < this.field2426; var1++) {
                field2415.method1513(this.field2422[var1], false);
                field2415.method1513(this.field2403[var1], false);
                field2415.method1513(this.field2435[var1], false);
            }
        } else {
            for (int var2 = 0; var2 < this.field2426; var2++) {
                field2415.method1511(this.field2422[var2], (byte) 106);
                field2415.method1511(this.field2403[var2], (byte) 101);
                field2415.method1511(this.field2435[var2], (byte) 103);
            }
        }
        if (!class45.field674) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field2415.field3610);
            var5.put(field2415.field3617, 0, field2415.field3610);
            var5.flip();
            this.field2397.field1229 = true;
            this.field2397.field1225 = var5;
            this.field2397.field1228 = null;
            return;
        }
        class54 var3 = new class54();
        ByteBuffer var4 = ByteBuffer.wrap(field2415.field3617, 0, field2415.field3610);
        var3.method415(var4);
        this.field2397.field1229 = true;
        this.field2397.field1225 = null;
        this.field2397.field1228 = var3;
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "()I", line = 2070)
    public final int method231() {
        if (!this.field2431.field1180) {
            this.method1044();
        }
        return this.field2431.field1174;
    }

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "()V", line = 2079)
    public final void method240() {
        for (int var1 = 0; var1 < this.field2417; var1++) {
            this.field2399[var1] = -this.field2399[var1];
            this.field2418[var1] = -this.field2418[var1];
        }
        this.field2431.field1180 = false;
        this.field2408.field1229 = false;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(SS)V", line = 2094)
    public final void method1050(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2426; var3++) {
            if (this.field2433[var3] == arg0) {
                this.field2433[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class229.field3802.method1101((byte) -119, arg0 & 0xFFFF);
            var5 = class229.field3802.method1091(255, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class229.field3802.method1101((byte) 65, arg1 & 0xFFFF);
            var7 = class229.field3802.method1091(255, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field2411.field1229 = false;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([FI)[F", line = 2130)
    private static final float[] method1051(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class42.method295(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lcj;ILcj;I[IZ)V", line = 2135)
    public final void method233(class282 arg0, int arg1, class282 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method250(arg0, arg1, arg5);
            return;
        }
        class128 var7 = arg0.field4772[arg1];
        class128 var8 = arg2.field4772[arg3];
        class14 var9 = var7.field1921;
        for (int var10 = 0; var10 < this.field2417; var10++) {
            this.field2399[var10] <<= 0x4;
            this.field2423[var10] <<= 0x4;
            this.field2418[var10] <<= 0x4;
        }
        field2449 = 0;
        field2441 = 0;
        field2443 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field1923; var13++) {
            short var14 = var7.field1928[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field270[var14] == 0) {
                if (var7.field1920[var13] != -1) {
                    this.method1028(0, var9.field256[var7.field1920[var13]], 0, 0, 0, arg5);
                }
                this.method1028(var9.field270[var14], var9.field256[var14], var7.field1918[var13], var7.field1926[var13], var7.field1919[var13], arg5);
            }
        }
        field2449 = 0;
        field2441 = 0;
        field2443 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field1923; var17++) {
            short var18 = var8.field1928[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field270[var18] == 0) {
                if (var8.field1920[var17] != -1) {
                    this.method1028(0, var9.field256[var8.field1920[var17]], 0, 0, 0, arg5);
                }
                this.method1028(var9.field270[var18], var9.field256[var18], var8.field1918[var17], var8.field1926[var17], var8.field1919[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field2417; var19++) {
            this.field2399[var19] >>= 0x4;
            this.field2423[var19] >>= 0x4;
            this.field2418[var19] >>= 0x4;
        }
        this.field2431.field1180 = false;
        this.field2408.field1229 = false;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lch;IJIIIIFF)S", line = 2232)
    private final short method1052(class183 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field2404[arg1];
        int var12 = this.field2404[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field2424[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field2406[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field2424[var13] = (short) (this.field2412 + 1);
        field2406[var13] = arg2;
        this.field2425[this.field2412] = (short) arg3;
        this.field2414[this.field2412] = (short) arg4;
        this.field2419[this.field2412] = (short) arg5;
        this.field2401[this.field2412] = (short) arg6;
        this.field2402[this.field2412] = arg7;
        this.field2409[this.field2412] = arg8;
        return (short) (this.field2412++);
    }

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "()I", line = 2267)
    public final int method249() {
        if (!this.field2431.field1180) {
            this.method1044();
        }
        return this.field2431.field1177;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lcj;IZ)V", line = 2273)
    public final void method250(class282 arg0, int arg1, boolean arg2) {
        if (this.field2434 == null || arg1 == -1) {
            return;
        }
        class128 var4 = arg0.field4772[arg1];
        class14 var5 = var4.field1921;
        for (int var6 = 0; var6 < this.field2417; var6++) {
            this.field2399[var6] <<= 0x4;
            this.field2423[var6] <<= 0x4;
            this.field2418[var6] <<= 0x4;
        }
        field2449 = 0;
        field2441 = 0;
        field2443 = 0;
        for (int var7 = 0; var7 < var4.field1923; var7++) {
            short var8 = var4.field1928[var7];
            if (var4.field1920[var7] != -1) {
                this.method1028(0, var5.field256[var4.field1920[var7]], 0, 0, 0, arg2);
            }
            this.method1028(var5.field270[var8], var5.field256[var8], var4.field1918[var7], var4.field1926[var7], var4.field1919[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field2417; var9++) {
            this.field2399[var9] >>= 0x4;
            this.field2423[var9] >>= 0x4;
            this.field2418[var9] >>= 0x4;
        }
        this.field2431.field1180 = false;
        this.field2408.field1229 = false;
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "()V", line = 2328)
    public final void method234() {
        for (int var1 = 0; var1 < this.field2417; var1++) {
            int var2 = this.field2399[var1];
            this.field2399[var1] = this.field2418[var1];
            this.field2418[var1] = -var2;
        }
        this.field2431.field1180 = false;
        this.field2408.field1229 = false;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V", line = 2343)
    public final void method246(int arg0) {
        int var2 = class229.field3805[arg0];
        int var3 = class229.field3806[arg0];
        for (int var4 = 0; var4 < this.field2417; var4++) {
            int var5 = this.field2423[var4] * var2 + this.field2399[var4] * var3 >> 16;
            this.field2423[var4] = this.field2423[var4] * var3 - this.field2399[var4] * var2 >> 16;
            this.field2399[var4] = var5;
        }
        this.field2431.field1180 = false;
        this.field2408.field1229 = false;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIII[FFIF)V", line = 2362)
    private static final void method1053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field2444 = var16;
        field2445 = var17;
    }

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "()I", line = 2412)
    public final int method1054() {
        return this.field2400;
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V", line = 2421)
    public final void method252(int arg0) {
        int var2 = class229.field3805[arg0];
        int var3 = class229.field3806[arg0];
        for (int var4 = 0; var4 < this.field2417; var4++) {
            int var5 = this.field2423[var4] * var3 - this.field2418[var4] * var2 >> 16;
            this.field2418[var4] = this.field2423[var4] * var2 + this.field2418[var4] * var3 >> 16;
            this.field2423[var4] = var5;
        }
        this.field2431.field1180 = false;
        this.field2408.field1229 = false;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIFFF)[F", line = 2444)
    private static final float[] method1055(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float[] var8 = new float[9];
        float var9 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var10 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var11 = 1.0F - var9;
        var7[0] = var9;
        var7[1] = 0.0F;
        var7[2] = var10;
        var7[3] = 0.0F;
        var7[4] = 1.0F;
        var7[5] = 0.0F;
        var7[6] = -var10;
        var7[7] = 0.0F;
        var7[8] = var9;
        float[] var12 = new float[9];
        float var13 = 1.0F;
        float var14 = 0.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var17 = 1.0F - var15;
        float var18 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var18 == 0.0F && var15 == 0.0F) {
            var8 = var7;
        } else {
            if (var18 != 0.0F) {
                var13 = (float) (-arg2) / var18;
                var14 = (float) arg0 / var18;
            }
            var12[0] = var13 * var13 * var17 + var15;
            var12[1] = var14 * var16;
            var12[2] = var13 * var14 * var17;
            var12[3] = -var14 * var16;
            var12[4] = var15;
            var12[5] = var13 * var16;
            var12[6] = var13 * var14 * var17;
            var12[7] = -var13 * var16;
            var12[8] = var14 * var14 * var17 + var15;
            var8[0] = var7[2] * var12[6] + var7[0] * var12[0] + var7[1] * var12[3];
            var8[1] = var7[2] * var12[7] + var7[0] * var12[1] + var7[1] * var12[4];
            var8[2] = var7[2] * var12[8] + var7[0] * var12[2] + var7[1] * var12[5];
            var8[3] = var7[5] * var12[6] + var7[3] * var12[0] + var7[4] * var12[3];
            var8[4] = var7[5] * var12[7] + var7[3] * var12[1] + var7[4] * var12[4];
            var8[5] = var7[5] * var12[8] + var7[3] * var12[2] + var7[4] * var12[5];
            var8[6] = var7[8] * var12[6] + var7[6] * var12[0] + var7[7] * var12[3];
            var8[7] = var7[8] * var12[7] + var7[6] * var12[1] + var7[7] * var12[4];
            var8[8] = var7[8] * var12[8] + var7[6] * var12[2] + var7[7] * var12[5];
        }
        var8[0] *= arg4;
        var8[1] *= arg4;
        var8[2] *= arg4;
        var8[3] *= arg5;
        var8[4] *= arg5;
        var8[5] *= arg5;
        var8[6] *= arg6;
        var8[7] *= arg6;
        var8[8] *= arg6;
        return var8;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZZZZZZZZZZZ)Loh;", line = 2520)
    public final class160 method1056(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class160 var12 = new class160();
        var12.field2417 = this.field2417;
        var12.field2412 = this.field2412;
        var12.field2426 = this.field2426;
        if (arg0) {
            var12.field2399 = this.field2399;
            var12.field2418 = this.field2418;
        } else {
            var12.field2399 = class182.method1187(this.field2399, true);
            var12.field2418 = class182.method1187(this.field2418, true);
        }
        if (arg1) {
            var12.field2423 = this.field2423;
        } else {
            var12.field2423 = class182.method1187(this.field2423, true);
        }
        if (arg0 && arg1) {
            var12.field2408 = this.field2408;
            var12.field2431 = this.field2431;
        } else {
            var12.field2408 = new class79();
            var12.field2431 = new class75();
        }
        if (arg2) {
            var12.field2421 = this.field2421;
        } else {
            var12.field2421 = class139.method901(this.field2421, false);
        }
        if (arg3) {
            var12.field2430 = this.field2430;
        } else {
            var12.field2430 = class102.method649(this.field2430, 0);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class8.field114) {
            var12.field2411 = new class79();
        } else {
            var12.field2411 = this.field2411;
        }
        if (arg5) {
            var12.field2425 = this.field2425;
            var12.field2414 = this.field2414;
            var12.field2419 = this.field2419;
            var12.field2401 = this.field2401;
        } else {
            var12.field2425 = class139.method901(this.field2425, false);
            var12.field2414 = class139.method901(this.field2414, false);
            var12.field2419 = class139.method901(this.field2419, false);
            var12.field2401 = class139.method901(this.field2401, false);
        }
        if (!class8.field114) {
            var12.field2398 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field2398 = this.field2398;
        } else {
            var12.field2398 = new class79();
        }
        if (arg8) {
            var12.field2402 = this.field2402;
            var12.field2409 = this.field2409;
            var12.field2420 = this.field2420;
        } else {
            var12.field2402 = class12.method125(this.field2402, true);
            var12.field2409 = class12.method125(this.field2409, true);
            var12.field2420 = new class79();
        }
        if (arg9) {
            var12.field2422 = this.field2422;
            var12.field2403 = this.field2403;
            var12.field2435 = this.field2435;
            var12.field2397 = this.field2397;
        } else {
            var12.field2422 = class139.method901(this.field2422, false);
            var12.field2403 = class139.method901(this.field2403, false);
            var12.field2435 = class139.method901(this.field2435, false);
            var12.field2397 = new class79();
        }
        if (arg10) {
            var12.field2433 = this.field2433;
        } else {
            var12.field2433 = class139.method901(this.field2433, false);
        }
        var12.field2410 = this.field2410;
        var12.field2434 = this.field2434;
        var12.field2396 = this.field2396;
        var12.field2405 = this.field2405;
        var12.field2407 = this.field2407;
        var12.field2424 = this.field2424;
        var12.field2404 = this.field2404;
        var12.field2400 = this.field2400;
        var12.field2437 = this.field2437;
        return var12;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 2654)
    private static final void method1057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field2446 = var18;
        field2450 = var19;
    }

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "()V", line = 2734)
    private final void method1058() {
        GL var1 = class45.field688;
        if (this.field2426 == 0) {
            return;
        }
        if (this.field2395 != 0) {
            this.method1060(true, !this.field2408.field1229 && (this.field2395 & 0x1) != 0, !this.field2411.field1229 && (this.field2395 & 0x2) != 0, this.field2398 != null && !this.field2398.field1229 && (this.field2395 & 0x4) != 0, false);
        }
        this.method1060(false, !this.field2408.field1229, !this.field2411.field1229, this.field2398 != null && !this.field2398.field1229, !this.field2420.field1229);
        if (!this.field2397.field1229) {
            this.method1049();
        }
        if (this.field2416 != 0) {
            if ((this.field2416 & 0x1) != 0) {
                this.field2399 = null;
                this.field2423 = null;
                this.field2418 = null;
                this.field2424 = null;
                this.field2404 = null;
            }
            if ((this.field2416 & 0x2) != 0) {
                this.field2421 = null;
                this.field2430 = null;
            }
            if ((this.field2416 & 0x4) != 0) {
                this.field2425 = null;
                this.field2414 = null;
                this.field2419 = null;
                this.field2401 = null;
            }
            if ((this.field2416 & 0x8) != 0) {
                this.field2402 = null;
                this.field2409 = null;
            }
            if ((this.field2416 & 0x10) != 0) {
                this.field2422 = null;
                this.field2403 = null;
                this.field2435 = null;
            }
            this.field2416 = 0;
        }
        class54 var2 = null;
        if (this.field2408.field1228 != null) {
            this.field2408.field1228.method414();
            var2 = this.field2408.field1228;
            var1.glVertexPointer(3, 5126, this.field2408.field1222, (long) this.field2408.field1230);
        }
        if (this.field2411.field1228 != null) {
            if (this.field2411.field1228 != var2) {
                this.field2411.field1228.method414();
                var2 = this.field2411.field1228;
            }
            var1.glColorPointer(4, 5121, this.field2411.field1222, (long) this.field2411.field1230);
        }
        if (class8.field114 && this.field2398.field1228 != null) {
            if (this.field2398.field1228 != var2) {
                this.field2398.field1228.method414();
                var2 = this.field2398.field1228;
            }
            var1.glNormalPointer(5126, this.field2398.field1222, (long) this.field2398.field1230);
        }
        if (this.field2420.field1228 != null) {
            if (this.field2420.field1228 != var2) {
                this.field2420.field1228.method414();
                class54 var3 = this.field2420.field1228;
            }
            var1.glTexCoordPointer(2, 5126, this.field2420.field1222, (long) this.field2420.field1230);
        }
        if (this.field2397.field1228 != null) {
            this.field2397.field1228.method418();
        }
        if (this.field2408.field1228 == null || this.field2411.field1228 == null || class8.field114 && this.field2398.field1228 == null || this.field2420.field1228 == null) {
            if (class45.field674) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field2408.field1228 == null) {
                this.field2408.field1225.position(this.field2408.field1230);
                var1.glVertexPointer(3, 5126, this.field2408.field1222, this.field2408.field1225);
            }
            if (this.field2411.field1228 == null) {
                this.field2411.field1225.position(this.field2411.field1230);
                var1.glColorPointer(4, 5121, this.field2411.field1222, this.field2411.field1225);
            }
            if (class8.field114 && this.field2398.field1228 == null) {
                this.field2398.field1225.position(this.field2398.field1230);
                var1.glNormalPointer(5126, this.field2398.field1222, this.field2398.field1225);
            }
            if (this.field2420.field1228 == null) {
                this.field2420.field1225.position(this.field2420.field1230);
                var1.glTexCoordPointer(2, 5126, this.field2420.field1222, this.field2420.field1225);
            }
        }
        if (this.field2397.field1228 == null && class45.field674) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field2407.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field2407[var5];
            int var7 = this.field2407[var5 + 1];
            short var8 = this.field2433[var6];
            if (var8 == -1) {
                class45.method321(-1);
                class264.method1814(0, 0, (byte) 66);
            } else {
                class229.field3802.method1102(var8 & 0xFFFF, 255);
            }
            if (this.field2397.field1228 == null) {
                this.field2397.field1225.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field2397.field1225);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "()Z", line = 2909)
    public final boolean method1059() {
        return this.field2429 && this.field2399 != null && this.field2425 != null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lcj;I)V", line = 2912)
    public final void method244(class282 arg0, int arg1) {
        if (this.field2434 == null || arg1 == -1) {
            return;
        }
        class128 var3 = arg0.field4772[arg1];
        class14 var4 = var3.field1921;
        field2449 = 0;
        field2441 = 0;
        field2443 = 0;
        for (int var5 = 0; var5 < var3.field1923; var5++) {
            short var6 = var3.field1928[var5];
            if (var4.field261[var6]) {
                if (var3.field1920[var5] != -1) {
                    this.method1037(0, 0, 0, 0);
                }
                this.method1037(var4.field270[var6], var3.field1918[var5], var3.field1926[var5], var3.field1919[var5]);
            }
        }
        this.field2408.field1229 = false;
        this.field2431.field1180 = false;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZZZZZ)V", line = 2955)
    private final void method1060(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field2408.field1230 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field2411.field1230 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field2398.field1230 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field2420.field1230 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field2415.field3617.length < this.field2412 * var6) {
            field2415 = new class221((this.field2412 + 100) * var6);
        } else {
            field2415.field3610 = 0;
        }
        if (arg1) {
            if (class45.field675) {
                for (int var7 = 0; var7 < this.field2417; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field2399[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field2423[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field2418[var7]);
                    int var11 = this.field2404[var7];
                    int var12 = this.field2404[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field2424[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field2415.field3610 = var6 * var14;
                        field2415.method1513(var8, false);
                        field2415.method1513(var9, false);
                        field2415.method1513(var10, false);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field2417; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field2399[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field2423[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field2418[var15]);
                    int var19 = this.field2404[var15];
                    int var20 = this.field2404[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field2424[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field2415.field3610 = var6 * var22;
                        field2415.method1511(var16, (byte) 115);
                        field2415.method1511(var17, (byte) 104);
                        field2415.method1511(var18, (byte) 108);
                    }
                }
            }
        }
        if (arg2) {
            if (class8.field114) {
                for (int var42 = 0; var42 < this.field2426; var42++) {
                    int var43 = method1033(this.field2421[var42], this.field2433[var42], this.field2400, this.field2430[var42]);
                    field2415.field3610 = this.field2422[var42] * var6 + this.field2411.field1230;
                    field2415.method1513(var43, false);
                    field2415.field3610 = this.field2403[var42] * var6 + this.field2411.field1230;
                    field2415.method1513(var43, false);
                    field2415.field3610 = this.field2435[var42] * var6 + this.field2411.field1230;
                    field2415.method1513(var43, false);
                }
            } else {
                int var23 = (int) class293.field4955[0];
                int var24 = (int) class293.field4955[1];
                int var25 = (int) class293.field4955[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field2400 * 1.3F);
                int var28 = this.field2437 * var26 >> 8;
                for (int var29 = 0; var29 < this.field2426; var29++) {
                    short var30 = this.field2422[var29];
                    short var31 = this.field2401[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field2419[var30] * var25 + this.field2425[var30] * var23 + this.field2414[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field2419[var30] * var25 + this.field2425[var30] * var23 + this.field2414[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field2401[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field2403[var29];
                    short var34 = this.field2401[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field2419[var33] * var25 + this.field2425[var33] * var23 + this.field2414[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field2419[var33] * var25 + this.field2425[var33] * var23 + this.field2414[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field2401[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field2435[var29];
                    short var37 = this.field2401[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field2419[var36] * var25 + this.field2425[var36] * var23 + this.field2414[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field2419[var36] * var25 + this.field2425[var36] * var23 + this.field2414[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field2401[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1033(this.field2421[var29], this.field2433[var29], var32, this.field2430[var29]);
                    int var40 = method1033(this.field2421[var29], this.field2433[var29], var35, this.field2430[var29]);
                    int var41 = method1033(this.field2421[var29], this.field2433[var29], var38, this.field2430[var29]);
                    field2415.field3610 = var6 * var30 + this.field2411.field1230;
                    field2415.method1513(var39, false);
                    field2415.field3610 = var6 * var33 + this.field2411.field1230;
                    field2415.method1513(var40, false);
                    field2415.field3610 = var6 * var36 + this.field2411.field1230;
                    field2415.method1513(var41, false);
                }
                this.field2425 = null;
                this.field2414 = null;
                this.field2419 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field2437;
            float var45 = 3.0F / (float) (this.field2437 / 2 + this.field2437);
            field2415.field3610 = this.field2398.field1230;
            if (class45.field675) {
                for (int var46 = 0; var46 < this.field2412; var46++) {
                    short var47 = this.field2401[var46];
                    if (var47 == 0) {
                        field2415.method1538(false, (float) this.field2425[var46] * var45);
                        field2415.method1538(false, (float) this.field2414[var46] * var45);
                        field2415.method1538(false, (float) this.field2419[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field2415.method1538(false, (float) this.field2425[var46] * var48);
                        field2415.method1538(false, (float) this.field2414[var46] * var48);
                        field2415.method1538(false, (float) this.field2419[var46] * var48);
                    }
                    field2415.field3610 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field2412; var49++) {
                    short var50 = this.field2401[var49];
                    if (var50 == 0) {
                        field2415.method1558(-95, (float) this.field2425[var49] * var45);
                        field2415.method1558(-100, (float) this.field2414[var49] * var45);
                        field2415.method1558(-128, (float) this.field2419[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field2415.method1558(-127, (float) this.field2425[var49] * var51);
                        field2415.method1558(-74, (float) this.field2414[var49] * var51);
                        field2415.method1558(-95, (float) this.field2419[var49] * var51);
                    }
                    field2415.field3610 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field2415.field3610 = this.field2420.field1230;
            if (class45.field675) {
                for (int var52 = 0; var52 < this.field2412; var52++) {
                    field2415.method1538(false, this.field2402[var52]);
                    field2415.method1538(false, this.field2409[var52]);
                    field2415.field3610 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field2412; var53++) {
                    field2415.method1558(-73, this.field2402[var53]);
                    field2415.method1558(-124, this.field2409[var53]);
                    field2415.field3610 += var6 - 8;
                }
            }
        }
        field2415.field3610 = this.field2412 * var6;
        if (arg0) {
            if (class45.field673) {
                ByteBuffer var54 = ByteBuffer.wrap(field2415.field3617, 0, field2415.field3610);
                if (this.field2428 == null) {
                    this.field2428 = new class54(true);
                    this.field2428.method415(var54);
                } else {
                    this.field2428.method416(var54);
                }
                if (arg1) {
                    this.field2408.field1229 = true;
                    this.field2408.field1225 = null;
                    this.field2408.field1228 = this.field2428;
                    this.field2408.field1222 = var6;
                }
                if (arg2) {
                    this.field2411.field1229 = true;
                    this.field2411.field1225 = null;
                    this.field2411.field1228 = this.field2428;
                    this.field2411.field1222 = var6;
                }
                if (arg3) {
                    this.field2398.field1229 = true;
                    this.field2398.field1225 = null;
                    this.field2398.field1228 = this.field2428;
                    this.field2398.field1222 = var6;
                }
                if (arg4) {
                    this.field2420.field1229 = true;
                    this.field2420.field1225 = null;
                    this.field2420.field1228 = this.field2428;
                    this.field2420.field1222 = var6;
                }
            } else {
                if (field2432 == null || field2432.capacity() < field2415.field3610) {
                    field2432 = ByteBuffer.allocateDirect(var6 * 100 + field2415.field3610);
                } else {
                    field2432.clear();
                }
                field2432.put(field2415.field3617, 0, field2415.field3610);
                field2432.flip();
                if (arg1) {
                    this.field2408.field1229 = true;
                    this.field2408.field1225 = field2432;
                    this.field2408.field1228 = null;
                    this.field2408.field1222 = var6;
                }
                if (arg2) {
                    this.field2411.field1229 = true;
                    this.field2411.field1225 = field2432;
                    this.field2408.field1228 = null;
                    this.field2411.field1222 = var6;
                }
                if (arg3) {
                    this.field2398.field1229 = true;
                    this.field2398.field1225 = field2432;
                    this.field2398.field1228 = null;
                    this.field2398.field1222 = var6;
                }
                if (arg4) {
                    this.field2420.field1229 = true;
                    this.field2420.field1225 = field2432;
                    this.field2420.field1228 = null;
                    this.field2420.field1222 = var6;
                }
            }
        } else if (class45.field674) {
            class54 var55 = new class54();
            ByteBuffer var56 = ByteBuffer.wrap(field2415.field3617, 0, field2415.field3610);
            var55.method415(var56);
            if (arg1) {
                this.field2408.field1229 = true;
                this.field2408.field1225 = null;
                this.field2408.field1228 = var55;
                this.field2408.field1222 = var6;
            }
            if (arg2) {
                this.field2411.field1229 = true;
                this.field2411.field1225 = null;
                this.field2411.field1228 = var55;
                this.field2411.field1222 = var6;
            }
            if (arg3) {
                this.field2398.field1229 = true;
                this.field2398.field1225 = null;
                this.field2398.field1228 = var55;
                this.field2398.field1222 = var6;
            }
            if (arg4) {
                this.field2420.field1229 = true;
                this.field2420.field1225 = null;
                this.field2420.field1228 = var55;
                this.field2420.field1222 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field2415.field3610);
            var57.put(field2415.field3617, 0, field2415.field3610);
            var57.flip();
            if (arg1) {
                this.field2408.field1229 = true;
                this.field2408.field1225 = var57;
                this.field2408.field1228 = null;
                this.field2408.field1222 = var6;
            }
            if (arg2) {
                this.field2411.field1229 = true;
                this.field2411.field1225 = var57;
                this.field2408.field1228 = null;
                this.field2411.field1222 = var6;
            }
            if (arg3) {
                this.field2398.field1229 = true;
                this.field2398.field1225 = var57;
                this.field2398.field1228 = null;
                this.field2398.field1222 = var6;
            }
            if (arg4) {
                this.field2420.field1229 = true;
                this.field2420.field1225 = var57;
                this.field2420.field1228 = null;
                this.field2420.field1222 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(FFF)I", line = 3493)
    private static final int method1061(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILoh;[[I[[IIII)V", line = 3528)
    public final void method1062(int arg0, int arg1, class160 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field2431.field1180) {
            arg2.method1044();
        }
        int var9 = arg2.field2431.field1178 + arg5;
        int var10 = arg2.field2431.field1176 + arg5;
        int var11 = arg2.field2431.field1181 + arg7;
        int var12 = arg2.field2431.field1177 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field2417; var17++) {
                int var18 = this.field2399[var17] + arg5;
                int var19 = this.field2418[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field2423[var17] = this.field2423[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field2431.field1175;
            for (int var28 = 0; var28 < this.field2417; var28++) {
                int var29 = (this.field2423[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field2399[var28] + arg5;
                    int var31 = this.field2418[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field2423[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method238(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field2431.field1179 - arg2.field2431.field1175;
            for (int var42 = 0; var42 < this.field2417; var42++) {
                int var43 = this.field2399[var42] + arg5;
                int var44 = this.field2418[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field2423[var42] = var51 + this.field2423[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field2431.field1179 - arg2.field2431.field1175;
            for (int var53 = 0; var53 < this.field2417; var53++) {
                int var54 = this.field2399[var53] + arg5;
                int var55 = this.field2418[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field2423[var53] = ((this.field2423[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field2408.field1229 = false;
        this.field2431.field1180 = false;
    }
}
