import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class316 implements Runnable {

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "[Lvh;")
    public volatile class53[] field5419 = new class53[2];

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "Z")
    public volatile boolean field5410 = false;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "Z")
    public volatile boolean field5423 = false;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Lna;")
    public static class26 field5405 = class69.method505("blanc:", (byte) -127);

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "[I")
    public static int[] field5412 = new int[32768];

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "Lll;")
    public class156 field5416;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Lim;")
    public static class180 field5417;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Z")
    public static boolean field5411;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "[[S")
    public static short[][] field5408;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILpb;ZIIII)Z", line = 6)
    public static final boolean method2189(int arg0, class78 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field5409++;
        class9 var7 = class120.method829(arg1.field1211, 0);
        if (var7.field110 == -1) {
            return true;
        }
        int var9;
        if (arg1.field1238) {
            int var8 = arg1.field1169 + arg6;
            var9 = var8 & 0x3;
        } else {
            var9 = 0;
        }
        if (arg2) {
            field5417 = (class180) null;
        }
        class183 var10 = var7.method59(var9, (byte) -111);
        if (var10 == null) {
            return false;
        }
        int var11 = arg1.field1171;
        int var12 = arg1.field1178;
        if ((var9 & 0x1) == 1) {
            var11 = arg1.field1178;
            var12 = arg1.field1171;
        }
        int var13 = var10.field2352;
        int var14 = var10.field2349;
        if (var7.field120) {
            var14 = var12 * 4;
            var13 = var11 * 4;
        }
        if (var7.field107 == 0) {
            var10.method1268(arg0 * 4 + 48, (-arg5 + -var12 + 104) * 4 + 48, var13, var14);
        } else {
            var10.method1260(arg0 * 4 + 48, (-arg5 + 104 + -var12) * 4 + 48, var13, var14, var7.field107);
        }
        return true;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLwa;)V", line = 70)
    public static final void method2190(byte arg0, class82 arg1) {
        if (arg0 != 105) {
            field5412 = (int[]) null;
        }
        field5407++;
        int var2 = class170.field2664 >> 1;
        int var3 = class76.field1152 >> 2 << 10;
        byte[][] var4 = new byte[class38.field623][class317.field5436];
        while (arg1.field1301 < arg1.field1280.length) {
            int var5 = 0;
            int var6 = 0;
            boolean var7 = false;
            if (arg1.method642((byte) -99) == 1) {
                var6 = arg1.method642((byte) -56);
                var5 = arg1.method642((byte) -51);
                var7 = true;
            }
            int var8 = arg1.method642((byte) -125);
            int var9 = arg1.method642((byte) -30);
            int var10 = var8 * 64 - class135.field2057;
            int var11 = class317.field5436 + class9.field111 - var9 * 64 - 1;
            if (var10 >= 0 && var11 - 63 >= 0 && class38.field623 > var10 + 63 && class317.field5436 > var11) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var7 || var12 >= var6 * 8 && var6 * 8 + 8 > var12 && var14 >= var5 * 8 && var14 < var5 * 8 + 8) {
                            var13[var11 - var14] = arg1.method599(false);
                        }
                    }
                }
            } else if (var7) {
                arg1.field1301 += 64;
            } else {
                arg1.field1301 += 4096;
            }
        }
        int var15 = class38.field623;
        int var16 = class317.field5436;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var15 > var24) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class24 var26 = class4.method19(true, var25 - 1);
                        var18[var23] += var26.field345;
                        var17[var23] += var26.field340;
                        var19[var23] += var26.field354;
                        var20[var23] += var26.field357;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class24 var29 = class4.method19(true, var28 - 1);
                        var18[var23] -= var29.field345;
                        var17[var23] -= var29.field340;
                        var19[var23] -= var29.field354;
                        var20[var23] -= var29.field357;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class189.field2970[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 + 5;
                    if (var16 > var37) {
                        var34 += var21[var37];
                        var32 += var17[var37];
                        var35 += var19[var37];
                        var31 += var18[var37];
                        var33 += var20[var37];
                    }
                    int var38 = var36 - 5;
                    if (var38 >= 0) {
                        var35 -= var19[var38];
                        var33 -= var20[var38];
                        var31 -= var18[var38];
                        var34 -= var21[var38];
                        var32 -= var17[var38];
                    }
                    if (var36 >= 0 && var34 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var33 == 0 ? 0 : class294.method2068(var35 / var34, 2, var32 / var34, var31 * 256 / var33);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var2;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var3 + var40 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[class4.method23(4032, var36 << 6) + class4.method23(63, var22)] = class200.field3098[class5.method36(96, true, var42)];
                        } else if (var39 != null) {
                            var39[class4.method23(4032, var36 << 6) + class4.method23(var22, 63)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;", line = 295)
    public static final Object method2191(boolean arg0, int arg1, byte[] arg2) {
        field5421++;
        if (arg2 == null) {
            return null;
        }
        if (arg1 >= -67) {
            method2192(19);
        }
        if (arg2.length > 136 && !class7.field83) {
            try {
                class254 var3 = (class254) Class.forName("ua").getDeclaredConstructor().newInstance();
                var3.method705(400, arg2);
                return var3;
            } catch (Throwable var5) {
                class7.field83 = true;
            }
        }
        return arg0 ? class137.method920((byte) 62, arg2) : arg2;
    }

    @OriginalMember(owner = "client!cj", name = "run", descriptor = "()V", line = 341)
    public final void run() {
        this.field5423 = true;
        try {
            while (!this.field5410) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class53 var2 = this.field5419[var1];
                    if (var2 != null) {
                        var2.method387((byte) -34);
                    }
                }
                class126.method862(10L, 64);
                class138.method924(this.field5416, (Object) null, -71);
            }
        } catch (Exception var7) {
            class302.method2124((String) null, var7, (byte) 111);
        } finally {
            this.field5423 = false;
        }
        field5415++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)[Lqf;", line = 375)
    public static final class148[] method2192(int arg0) {
        field5420++;
        class148[] var1 = new class148[class313.field5350];
        if (arg0 != -5) {
            method2195(113L, (byte) 48);
        }
        for (int var2 = 0; var2 < class313.field5350; var2++) {
            int var3 = class98.field1596[var2] * class141.field2149[var2];
            byte[] var4 = class205.field3203[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class190.field2975[class4.method23(255, var4[var6])];
            }
            if (class255.field4184) {
                var1[var2] = new class130(class88.field1445, class37.field607, class58.field936[var2], class82.field1281[var2], class141.field2149[var2], class98.field1596[var2], var5);
            } else {
                var1[var2] = new class256(class88.field1445, class37.field607, class58.field936[var2], class82.field1281[var2], class141.field2149[var2], class98.field1596[var2], var5);
            }
        }
        class160.method1088((byte) 116);
        return var1;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V", line = 423)
    public static void method2193(int arg0) {
        field5408 = (short[][]) null;
        field5405 = null;
        field5417 = null;
        if (arg0 <= 75) {
            field5411 = false;
        }
        field5412 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)I", line = 438)
    public static final int method2194(int arg0, byte arg1) {
        int var2 = -66 / ((67 - arg1) / 41);
        field5422++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(JB)Lna;", line = 447)
    public static final class26 method2195(long arg0, byte arg1) {
        field5406++;
        class132.field2001.setTime(new Date(arg0));
        int var3 = class132.field2001.get(7);
        int var4 = class132.field2001.get(5);
        int var5 = class132.field2001.get(2);
        if (arg1 < 9) {
            method2190((byte) 7, (class82) null);
        }
        int var6 = class132.field2001.get(1);
        int var7 = class132.field2001.get(11);
        int var8 = class132.field2001.get(12);
        int var9 = class132.field2001.get(13);
        return class236.method1587(new class26[] { class194.field3025[var3 - 1], class31.field528, class149.method1019((byte) 9, var4 / 10), class149.method1019((byte) 9, var4 % 10), class154.field2399, class324.field5574[var5], class154.field2399, class149.method1019((byte) 9, var6), class284.field4750, class149.method1019((byte) 9, var7 / 10), class149.method1019((byte) 9, var7 % 10), class53.field828, class149.method1019((byte) 9, var8 / 10), class149.method1019((byte) 9, var8 % 10), class53.field828, class149.method1019((byte) 9, var9 / 10), class149.method1019((byte) 9, var9 % 10), class279.field4650 }, (byte) -96);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZIIIIIIFB)[[I", line = 479)
    public static final int[][] method2196(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7, byte arg8) {
        field5418++;
        if (arg8 >= -52) {
            method2192(115);
        }
        int[][] var9 = new int[arg3][arg2];
        class84 var10 = new class84();
        var10.field1380 = (int) (arg7 * 4096.0F);
        var10.field1373 = arg1;
        var10.field1371 = arg5;
        var10.field1384 = arg0;
        var10.field1378 = arg6;
        var10.method130(16251);
        class320.method2224(122, arg3, arg2);
        for (int var11 = 0; var11 < arg3; var11++) {
            var10.method651(true, var11, var9[var11]);
        }
        return var9;
    }
}
