import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class204 extends class23 {

    @OriginalMember(owner = "client!dk", name = "sb", descriptor = "[I")
    private int[] field3245 = new int[257];

    @OriginalMember(owner = "client!dk", name = "db", descriptor = "I")
    public static int field3230 = 0;

    @OriginalMember(owner = "client!dk", name = "fb", descriptor = "Lqd;")
    private static class40 field3232 = class147.method1106("Discard", (byte) -107);

    @OriginalMember(owner = "client!dk", name = "gb", descriptor = "Lqd;")
    public static class40 field3233 = field3232;

    @OriginalMember(owner = "client!dk", name = "ab", descriptor = "Lqd;")
    public static class40 field3227 = class147.method1106("<col=ff0000>", (byte) -91);

    @OriginalMember(owner = "client!dk", name = "rb", descriptor = "Lqd;")
    public static class40 field3244 = class147.method1106(":clan:", (byte) -117);

    @OriginalMember(owner = "client!dk", name = "ub", descriptor = "Lqd;")
    private static class40 field3247 = class147.method1106("shake:", (byte) -109);

    @OriginalMember(owner = "client!dk", name = "tb", descriptor = "Lqd;")
    public static class40 field3246 = class147.method1106("Speicher wird zugewiesen)3", (byte) -75);

    @OriginalMember(owner = "client!dk", name = "hb", descriptor = "Lqd;")
    public static class40 field3234 = class147.method1106("<)4col> x", (byte) -97);

    @OriginalMember(owner = "client!dk", name = "jb", descriptor = "Lqd;")
    private static class40 field3236 = class147.method1106("glow1:", (byte) -106);

    @OriginalMember(owner = "client!dk", name = "kb", descriptor = "Lqd;")
    public static class40 field3237 = field3247;

    @OriginalMember(owner = "client!dk", name = "nb", descriptor = "Lqd;")
    public static class40 field3240 = field3236;

    @OriginalMember(owner = "client!dk", name = "vb", descriptor = "I")
    public static int field3248 = 0;

    @OriginalMember(owner = "client!dk", name = "cb", descriptor = "Lqd;")
    public static class40 field3229 = field3236;

    @OriginalMember(owner = "client!dk", name = "xb", descriptor = "I")
    public static int field3250 = 0;

    @OriginalMember(owner = "client!dk", name = "eb", descriptor = "Lqd;")
    public static class40 field3231 = field3247;

    @OriginalMember(owner = "client!dk", name = "Ab", descriptor = "[J")
    public static long[] field3253 = new long[100];

    @OriginalMember(owner = "client!dk", name = "ob", descriptor = "I")
    public static int field3241 = 0;

    @OriginalMember(owner = "client!dk", name = "wb", descriptor = "Lqd;")
    private static class40 field3249 = class147.method1106("Created gameworld", (byte) -54);

    @OriginalMember(owner = "client!dk", name = "mb", descriptor = "Lqd;")
    public static class40 field3239 = field3249;

    @OriginalMember(owner = "client!dk", name = "Y", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!dk", name = "Z", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!dk", name = "bb", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!dk", name = "ib", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!dk", name = "lb", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!dk", name = "pb", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!dk", name = "qb", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!dk", name = "Bb", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!dk", name = "Cb", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!dk", name = "Db", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!dk", name = "Eb", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!dk", name = "yb", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3251;

    @OriginalMember(owner = "client!dk", name = "zb", descriptor = "[[I")
    private int[][] field3252;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "(I)V", line = 15)
    private final void method1432(int arg0) {
        field3243++;
        int var2 = -59 / ((-arg0 - 36) / 59);
        int var3 = this.field3252.length;
        if (var3 <= 0) {
            return;
        }
        for (int var4 = 0; var4 < 257; var4++) {
            int var5 = 0;
            int var6 = var4 << 4;
            for (int var7 = 0; var3 > var7 && var6 >= this.field3252[var7][0]; var7++) {
                var5++;
            }
            int var12;
            int var13;
            int var14;
            if (var5 < var3) {
                int[] var8 = this.field3252[var5];
                if (var5 > 0) {
                    int[] var9 = this.field3252[var5 - 1];
                    int var10 = (var6 - var9[0] << 12) / (var8[0] - var9[0]);
                    int var11 = 4096 - var10;
                    var12 = var8[2] * var10 + (var9[2] * var11) >> 12;
                    var13 = var8[3] * var10 + (var9[3] * var11) >> 12;
                    var14 = var8[1] * var10 + var9[1] * var11 >> 12;
                } else {
                    var13 = var8[3];
                    var12 = var8[2];
                    var14 = var8[1];
                }
            } else {
                int[] var15 = this.field3252[var3 - 1];
                var13 = var15[3];
                var14 = var15[1];
                var12 = var15[2];
            }
            int var16 = var13 >> 4;
            int var17 = var12 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            int var18 = var14 >> 4;
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field3245[var4] = class11.method71(class11.method71(var18 << 16, var17 << 8), var16);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 121)
    public final void method61(byte arg0) {
        if (this.field3252 == null) {
            this.method1438(1, -78);
        }
        if (arg0 != 4) {
            field3233 = (class40) null;
        }
        field3254++;
        this.method1432(arg0 ^ 0x38);
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V", line = 147)
    public class204() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I[JII[I)V", line = 155)
    public static final void method1433(int arg0, long[] arg1, int arg2, int arg3, int[] arg4) {
        if (arg2 != 2) {
            return;
        }
        field3235++;
        if (arg0 >= arg3) {
            return;
        }
        int var5 = arg0;
        int var6 = (arg0 + arg3) / 2;
        long var7 = arg1[var6];
        arg1[var6] = arg1[arg3];
        arg1[arg3] = var7;
        int var9 = arg4[var6];
        arg4[var6] = arg4[arg3];
        arg4[arg3] = var9;
        for (int var10 = arg0; var10 < arg3; var10++) {
            if ((long) (var10 & 0x1) + var7 > arg1[var10]) {
                long var11 = arg1[var10];
                arg1[var10] = arg1[var5];
                arg1[var5] = var11;
                int var13 = arg4[var10];
                arg4[var10] = arg4[var5];
                arg4[var5++] = var13;
            }
        }
        arg1[arg3] = arg1[var5];
        arg1[var5] = var7;
        arg4[arg3] = arg4[var5];
        arg4[var5] = var9;
        method1433(arg0, arg1, 2, var5 - 1, arg4);
        method1433(var5 + 1, arg1, arg2 ^ 0x0, arg3, arg4);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([BZZ)Ljava/lang/Object;", line = 222)
    public static final Object method1434(byte[] arg0, boolean arg1, boolean arg2) {
        field3238++;
        if (!arg2) {
            field3227 = (class40) null;
        }
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class235.field3855) {
            try {
                class25 var3 = (class25) Class.forName("qe").getDeclaredConstructor().newInstance();
                var3.method180(arg0, (byte) 37);
                return var3;
            } catch (Throwable var5) {
                class235.field3855 = true;
            }
        }
        return arg1 ? class153.method1196(false, arg0) : arg0;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIIII)V", line = 263)
    public static final void method1435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3242++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = arg3 - arg1;
        int var11 = 0;
        int var12 = arg2 * arg2;
        int var13 = arg3 * arg3;
        int var14 = arg2 - arg1;
        int var15 = var14 * var14;
        int var16 = var10 * var10;
        int var17 = var13 << 1;
        int var18 = var15 << 1;
        int var19 = var12 << 1;
        int var20 = arg3 << 1;
        int var21 = var10 << 1;
        int var22 = var13 - ((var20 - 1) * var19);
        int var23 = var16 << 1;
        int var24 = (1 - var20) * var12 + var17;
        int var25 = var16 - ((var21 - 1) * var18);
        int var26 = (1 - var21) * var15 + var23;
        int var27 = var15 << 2;
        int var28 = var12 << 2;
        if (arg6 != 27346) {
            method1437(-52);
        }
        int var29 = var13 << 2;
        int var30 = (var20 - 3) * var19;
        int var31 = var23 * 3;
        int var32 = var16 << 2;
        int var33 = (var21 - 3) * var18;
        int var34 = var29;
        int var35 = (var10 - 1) * var27;
        if (class220.field3664 <= arg4 && arg4 <= class72.field1275) {
            int[] var36 = class37.field694[arg4];
            int var37 = class110.method827((byte) 100, arg0 - arg2, class48.field941, class125.field2164);
            int var38 = class110.method827((byte) 74, arg0 + arg2, class48.field941, class125.field2164);
            int var39 = class110.method827((byte) 122, arg0 - var14, class48.field941, class125.field2164);
            int var40 = class110.method827((byte) 82, arg0 + var14, class48.field941, class125.field2164);
            class150.method1124(var39, var37, arg5, true, var36);
            class150.method1124(var40, var39, arg7, true, var36);
            class150.method1124(var38, var40, arg5, true, var36);
        }
        int var41 = var32;
        int var42 = (arg3 - 1) * var28;
        int var43 = var17 * 3;
        while (var9 > 0) {
            if (var24 < 0) {
                while (var24 < 0) {
                    var8++;
                    var24 += var43;
                    var22 += var34;
                    var34 += var29;
                    var43 += var29;
                }
            }
            if (var22 < 0) {
                var8++;
                var24 += var43;
                var22 += var34;
                var43 += var29;
                var34 += var29;
            }
            var24 += -var42;
            var42 -= var28;
            boolean var44 = var10 >= var9;
            if (var44) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var25 += var41;
                        var41 += var32;
                        var11++;
                        var26 += var31;
                        var31 += var32;
                    }
                }
                if (var25 < 0) {
                    var26 += var31;
                    var11++;
                    var31 += var32;
                    var25 += var41;
                    var41 += var32;
                }
                var26 += -var35;
                var25 += -var33;
                var33 -= var27;
                var35 -= var27;
            }
            var9--;
            var22 += -var30;
            var30 -= var28;
            int var45 = arg4 + var9;
            int var46 = arg4 - var9;
            if (class220.field3664 <= var45 && var46 <= class72.field1275) {
                int var47 = class110.method827((byte) 105, arg0 + var8, class48.field941, class125.field2164);
                int var48 = class110.method827((byte) -85, arg0 - var8, class48.field941, class125.field2164);
                if (var44) {
                    int var49 = class110.method827((byte) 76, arg0 + var11, class48.field941, class125.field2164);
                    int var50 = class110.method827((byte) 83, arg0 - var11, class48.field941, class125.field2164);
                    if (class220.field3664 <= var46) {
                        int[] var51 = class37.field694[var46];
                        class150.method1124(var50, var48, arg5, true, var51);
                        class150.method1124(var49, var50, arg7, true, var51);
                        class150.method1124(var47, var49, arg5, true, var51);
                    }
                    if (class72.field1275 >= var45) {
                        int[] var52 = class37.field694[var45];
                        class150.method1124(var50, var48, arg5, true, var52);
                        class150.method1124(var49, var50, arg7, true, var52);
                        class150.method1124(var47, var49, arg5, true, var52);
                    }
                } else {
                    if (var46 >= class220.field3664) {
                        class150.method1124(var47, var48, arg5, true, class37.field694[var46]);
                    }
                    if (class72.field1275 >= var45) {
                        class150.method1124(var47, var48, arg5, true, class37.field694[var45]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)Lu;", line = 470)
    public static final class247 method1436(int arg0, byte arg1) {
        if (arg1 >= -37) {
            return (class247) null;
        }
        field3228++;
        class247 var2 = (class247) class126.field2169.method984(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class92.field1679.method1651(class58.method489((byte) 127, arg0), class120.method904(arg0, -2), -1);
        class247 var4 = new class247();
        if (var3 != null) {
            var4.method1751(new class26(var3), 113);
        }
        class126.field2169.method982(var4, (long) arg0, (byte) 79);
        return var4;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILsd;)V", line = 529)
    public final void method23(int arg0, int arg1, class26 arg2) {
        if (arg0 == arg1) {
            int var4 = arg2.method226(255);
            if (var4 == 0) {
                this.field3252 = new int[arg2.method226(255)][4];
                for (int var5 = 0; var5 < this.field3252.length; var5++) {
                    this.field3252[var5][0] = arg2.method197(arg1 - 1);
                    this.field3252[var5][1] = arg2.method226(255) << 4;
                    this.field3252[var5][2] = arg2.method226(255) << 4;
                    this.field3252[var5][3] = arg2.method226(255) << 4;
                }
            } else {
                this.method1438(var4, -105);
            }
        }
        field3257++;
    }

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "(I)V", line = 570)
    public static void method1437(int arg0) {
        field3244 = null;
        field3253 = null;
        if (arg0 < 48) {
            method1434((byte[]) null, false, true);
        }
        field3232 = null;
        field3234 = null;
        field3227 = null;
        field3233 = null;
        field3239 = null;
        field3247 = null;
        field3240 = null;
        field3231 = null;
        field3249 = null;
        field3236 = null;
        field3251 = null;
        field3229 = null;
        field3237 = null;
        field3246 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)[[I", line = 606)
    public final int[][] method17(int arg0, int arg1) {
        field3256++;
        int[][] var3 = this.field417.method1251(arg1, 124);
        if (arg0 < 30) {
            this.method17(-39, 94);
        }
        if (this.field417.field2751) {
            int[] var4 = this.method174(0, 0, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class52.field1007; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field3245[var9];
                var5[var8] = class276.method1923(var10 >> 12, 4080);
                var7[var8] = class276.method1923(var10, 65280) >> 4;
                var6[var8] = class276.method1923(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)V", line = 652)
    private final void method1438(int arg0, int arg1) {
        field3225++;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field3252 = new int[2][4];
                this.field3252[0][3] = 0;
                this.field3252[0][1] = 0;
                this.field3252[0][2] = 0;
                this.field3252[0][0] = 0;
                this.field3252[1][0] = 4096;
                this.field3252[1][3] = 4096;
                this.field3252[1][1] = 4096;
                this.field3252[1][2] = 4096;
            } else if (arg0 == 2) {
                this.field3252 = new int[8][4];
                this.field3252[0][1] = 2650;
                this.field3252[0][2] = 2602;
                this.field3252[0][0] = 0;
                this.field3252[1][1] = 2313;
                this.field3252[2][1] = 2618;
                this.field3252[1][0] = 2867;
                this.field3252[0][3] = 2361;
                this.field3252[1][2] = 1799;
                this.field3252[2][2] = 1734;
                this.field3252[3][1] = 2296;
                this.field3252[3][2] = 1220;
                this.field3252[1][3] = 1558;
                this.field3252[2][0] = 3072;
                this.field3252[4][2] = 963;
                this.field3252[5][2] = 2152;
                this.field3252[2][3] = 1413;
                this.field3252[3][0] = 3276;
                this.field3252[4][1] = 2072;
                this.field3252[5][1] = 2730;
                this.field3252[6][2] = 1060;
                this.field3252[3][3] = 947;
                this.field3252[4][0] = 3481;
                this.field3252[4][3] = 722;
                this.field3252[7][2] = 1413;
                this.field3252[6][1] = 2232;
                this.field3252[5][0] = 3686;
                this.field3252[5][3] = 1766;
                this.field3252[6][0] = 3891;
                this.field3252[7][0] = 4096;
                this.field3252[7][1] = 1686;
                this.field3252[6][3] = 915;
                this.field3252[7][3] = 1140;
            } else if (arg0 == 3) {
                this.field3252 = new int[7][4];
                this.field3252[0][1] = 0;
                this.field3252[1][1] = 0;
                this.field3252[2][1] = 0;
                this.field3252[0][3] = 4096;
                this.field3252[3][1] = 4096;
                this.field3252[1][3] = 4096;
                this.field3252[2][3] = 0;
                this.field3252[0][0] = 0;
                this.field3252[0][2] = 0;
                this.field3252[1][0] = 663;
                this.field3252[3][3] = 0;
                this.field3252[4][1] = 4096;
                this.field3252[2][0] = 1363;
                this.field3252[4][3] = 0;
                this.field3252[5][3] = 4096;
                this.field3252[3][0] = 2048;
                this.field3252[4][0] = 2727;
                this.field3252[5][0] = 3411;
                this.field3252[1][2] = 4096;
                this.field3252[6][3] = 4096;
                this.field3252[6][0] = 4096;
                this.field3252[2][2] = 4096;
                this.field3252[5][1] = 4096;
                this.field3252[3][2] = 4096;
                this.field3252[4][2] = 0;
                this.field3252[5][2] = 0;
                this.field3252[6][2] = 0;
                this.field3252[6][1] = 0;
            } else if (arg0 == 4) {
                this.field3252 = new int[6][4];
                this.field3252[0][3] = 0;
                this.field3252[0][2] = 0;
                this.field3252[1][3] = 1493;
                this.field3252[1][2] = 0;
                this.field3252[2][3] = 2939;
                this.field3252[0][0] = 0;
                this.field3252[2][2] = 0;
                this.field3252[3][3] = 3565;
                this.field3252[3][2] = 1124;
                this.field3252[1][0] = 1843;
                this.field3252[4][2] = 3084;
                this.field3252[2][0] = 2457;
                this.field3252[0][1] = 0;
                this.field3252[1][1] = 0;
                this.field3252[2][1] = 0;
                this.field3252[3][0] = 2781;
                this.field3252[3][1] = 0;
                this.field3252[4][0] = 3481;
                this.field3252[5][0] = 4096;
                this.field3252[4][1] = 546;
                this.field3252[5][1] = 4096;
                this.field3252[4][3] = 4031;
                this.field3252[5][2] = 4096;
                this.field3252[5][3] = 4096;
            } else if (arg0 == 5) {
                this.field3252 = new int[16][4];
                this.field3252[0][1] = 80;
                this.field3252[0][0] = 0;
                this.field3252[0][2] = 192;
                this.field3252[0][3] = 321;
                this.field3252[1][3] = 562;
                this.field3252[1][2] = 449;
                this.field3252[2][3] = 803;
                this.field3252[1][1] = 321;
                this.field3252[2][1] = 578;
                this.field3252[1][0] = 155;
                this.field3252[2][2] = 690;
                this.field3252[3][1] = 947;
                this.field3252[3][3] = 1140;
                this.field3252[2][0] = 389;
                this.field3252[4][1] = 1285;
                this.field3252[3][2] = 995;
                this.field3252[4][2] = 1397;
                this.field3252[5][1] = 1525;
                this.field3252[5][2] = 1429;
                this.field3252[4][3] = 1509;
                this.field3252[5][3] = 1413;
                this.field3252[6][2] = 1461;
                this.field3252[3][0] = 671;
                this.field3252[6][1] = 1734;
                this.field3252[7][2] = 1525;
                this.field3252[4][0] = 897;
                this.field3252[7][1] = 1413;
                this.field3252[8][2] = 1590;
                this.field3252[9][2] = 2056;
                this.field3252[8][1] = 1108;
                this.field3252[10][2] = 2586;
                this.field3252[6][3] = 1333;
                this.field3252[9][1] = 1766;
                this.field3252[7][3] = 1702;
                this.field3252[11][2] = 3148;
                this.field3252[5][0] = 1175;
                this.field3252[6][0] = 1368;
                this.field3252[12][2] = 3710;
                this.field3252[13][2] = 3421;
                this.field3252[7][0] = 1507;
                this.field3252[10][1] = 2409;
                this.field3252[8][0] = 1736;
                this.field3252[14][2] = 3148;
                this.field3252[11][1] = 3116;
                this.field3252[8][3] = 2056;
                this.field3252[15][2] = 2505;
                this.field3252[9][3] = 2666;
                this.field3252[10][3] = 3276;
                this.field3252[9][0] = 2088;
                this.field3252[11][3] = 3228;
                this.field3252[10][0] = 2355;
                this.field3252[11][0] = 2691;
                this.field3252[12][3] = 3196;
                this.field3252[12][1] = 3806;
                this.field3252[13][1] = 3437;
                this.field3252[14][1] = 3116;
                this.field3252[15][1] = 2377;
                this.field3252[12][0] = 3031;
                this.field3252[13][3] = 3019;
                this.field3252[13][0] = 3522;
                this.field3252[14][3] = 3228;
                this.field3252[14][0] = 3727;
                this.field3252[15][0] = 4096;
                this.field3252[15][3] = 2746;
            } else if (arg0 == 6) {
                this.field3252 = new int[4][4];
                this.field3252[0][3] = 0;
                this.field3252[1][3] = 0;
                this.field3252[0][2] = 4096;
                this.field3252[0][1] = 0;
                this.field3252[1][2] = 4096;
                this.field3252[2][3] = 0;
                this.field3252[3][3] = 0;
                this.field3252[0][0] = 2048;
                this.field3252[1][0] = 2867;
                this.field3252[2][2] = 4096;
                this.field3252[2][0] = 3276;
                this.field3252[3][2] = 0;
                this.field3252[1][1] = 4096;
                this.field3252[3][0] = 4096;
                this.field3252[2][1] = 4096;
                this.field3252[3][1] = 4096;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg1 >= -57) {
            method1439(-52, 117, 63, 75, 62, 52, (class26) null, 66, true);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIILsd;IZ)V", line = 903)
    public static final void method1439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class26 arg6, int arg7, boolean arg8) {
        if (arg7 < 108) {
            field3236 = (class40) null;
        }
        field3255++;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            while (true) {
                int var11 = arg6.method226(255);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg6.method226(255);
                    break;
                }
                if (var11 <= 49) {
                    arg6.method226(255);
                }
            }
            return;
        }
        if (!arg8) {
            class274.field4564[arg2][arg0][arg1] = 0;
        }
        while (true) {
            int var9 = arg6.method226(255);
            if (var9 == 0) {
                if (arg8) {
                    class78.field1316[0][arg0][arg1] = class244.field4020[0][arg0][arg1];
                } else if (arg2 == 0) {
                    class78.field1316[0][arg0][arg1] = -class297.method2029((byte) -68, arg0 + arg4 + 932731, arg1 + arg5 + 556238) * 8;
                } else {
                    class78.field1316[arg2][arg0][arg1] = class78.field1316[arg2 - 1][arg0][arg1] - 240;
                }
                break;
            }
            if (var9 == 1) {
                int var10 = arg6.method226(255);
                if (arg8) {
                    class78.field1316[0][arg0][arg1] = class244.field4020[0][arg0][arg1] + (var10 * 8);
                } else {
                    if (var10 == 1) {
                        var10 = 0;
                    }
                    if (arg2 == 0) {
                        class78.field1316[0][arg0][arg1] = -var10 * 8;
                    } else {
                        class78.field1316[arg2][arg0][arg1] = class78.field1316[arg2 - 1][arg0][arg1] - (var10 * 8);
                    }
                }
                break;
            }
            if (var9 <= 49) {
                class89.field1609[arg2][arg0][arg1] = arg6.method234(2193);
                class205.field3270[arg2][arg0][arg1] = (byte) ((var9 - 2) / 4);
                class80.field1399[arg2][arg0][arg1] = (byte) class276.method1923(var9 + arg3 - 2, 3);
            } else if (var9 > 81) {
                class312.field5261[arg2][arg0][arg1] = (byte) (var9 - 81);
            } else if (!arg8) {
                class274.field4564[arg2][arg0][arg1] = (byte) (var9 - 49);
            }
        }
    }
}
