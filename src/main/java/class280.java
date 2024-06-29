import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class280 {

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "[[I")
    private int[][] field3991;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    private int field3984;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    private int field3983;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "[I")
    public static int[] field3992 = new int[25];

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field3982 = 0;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Z")
    public static boolean field3995 = true;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Lfh;")
    public static class140 field3993;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)I", line = 5)
    public final int method1885(int arg0, byte arg1) {
        field3989++;
        if (arg1 > -126) {
            method1887(-29L, (byte) -2);
        }
        if (this.field3991 != null) {
            arg0 = (int) ((long) this.field3983 * (long) arg0 / (long) this.field3984);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I", line = 20)
    public final int method1886(int arg0, int arg1) {
        if (arg0 >= -124) {
            method1887(103L, (byte) 34);
        }
        field3985++;
        if (this.field3991 != null) {
            arg1 = (int) ((long) this.field3983 * (long) arg1 / (long) this.field3984) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(JB)V", line = 38)
    public static final void method1887(long arg0, byte arg1) {
        field3990++;
        if (client.field1631 == 1 || client.field1631 == 5) {
            class192.method1396(0, arg0);
        } else if (client.field1631 == 2) {
            class237.method1691(24594);
        } else {
            class148.method1139((byte) 122);
        }
        if (!class159.field2263) {
            if (class179.field2446 != 0) {
                class73.field971 = class20.field231;
                class302.field4434 = class16.field204;
            } else if (class215.field3039 == 0) {
                class302.field4434 = class80.field1028;
                class73.field971 = class105.field1361;
            } else {
                class302.field4434 = class305.field4465;
                class73.field971 = class140.field1950;
            }
            class156.field2169[0] = 1006;
            class185.field2524[0] = class84.field1077;
            class328.field4805[0] = "";
            class66.field853 = 1;
            class42.field533[0] = class99.field1300;
        }
        class187.method1366((long) class313.field4603);
        if (class233.field3340 != -1) {
            class160.method1223(-22845, class233.field3340);
        }
        for (int var3 = 0; var3 < class345.field5370; var3++) {
            if (class229.field3276[var3]) {
                class185.field2520[var3] = true;
            }
            class306.field4485[var3] = class229.field3276[var3];
            class229.field3276[var3] = false;
        }
        class322.field4727 = null;
        class109.field1411 = class313.field4603;
        class182.field2486 = -1;
        class304.field4453 = -1;
        class304.field4450 = null;
        if (class47.field623) {
            class103.field1345 = true;
        }
        if (class233.field3340 != -1) {
            class345.field5370 = 0;
            class182.method1330((byte) 126);
        }
        if (class47.field623) {
            class129.method994();
        } else {
            class37.method255();
        }
        class214.method1566(109);
        if (class159.field2263) {
            if (class66.field846) {
                class330.method2288(false);
            } else {
                class179.method1321(true);
            }
        } else if (class322.field4727 != null) {
            class217.method1575(class306.field4476, false, class322.field4727, class82.field1060);
        } else if (class182.field2486 != -1) {
            class217.method1575(class182.field2486, false, (class333) null, class304.field4453);
        }
        int var4 = class159.field2263 ? -1 : class236.method1678(343760616);
        if (var4 == -1) {
            var4 = class145.field2022;
        }
        class67.method484(var4, 77);
        if (class185.field2532 == 1) {
            class185.field2532 = 2;
        }
        if (class352.field5502 == 1) {
            class352.field5502 = 2;
        }
        if (arg1 <= 117) {
            field3992 = (int[]) null;
        }
        if (class159.field2259 == 3) {
            for (int var5 = 0; var5 < class345.field5370; var5++) {
                if (class306.field4485[var5]) {
                    if (class47.field623) {
                        class129.method987(class64.field802[var5], class300.field4414[var5], class65.field826[var5], class322.field4728[var5], 16711935, 128);
                    } else {
                        class37.method239(class64.field802[var5], class300.field4414[var5], class65.field826[var5], class322.field4728[var5], 16711935, 128);
                    }
                } else if (class185.field2520[var5]) {
                    if (class47.field623) {
                        class129.method987(class64.field802[var5], class300.field4414[var5], class65.field826[var5], class322.field4728[var5], 16711680, 128);
                    } else {
                        class37.method239(class64.field802[var5], class300.field4414[var5], class65.field826[var5], class322.field4728[var5], 16711680, 128);
                    }
                }
            }
        }
        class106.method751(class56.field724, 78, class359.field5616.field4893, class359.field5616.field4855, class186.field2551);
        class186.field2551 = 0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B[B)[B", line = 202)
    public final byte[] method1888(byte arg0, byte[] arg1) {
        if (arg0 > -53) {
            field3982 = -25;
        }
        field3986++;
        if (this.field3991 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field3983 / (long) this.field3984) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var8 = arg1[var7];
                int[] var9 = this.field3991[var6];
                for (int var10 = 0; var10 < 14; var10++) {
                    var5[var4 + var10] += var9[var10] * var8;
                }
                int var11 = this.field3983 + var6;
                int var12 = var11 / this.field3984;
                var4 += var12;
                var6 = var11 - this.field3984 * var12;
            }
            arg1 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var5[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 > 127) {
                    arg1[var13] = 127;
                } else {
                    arg1[var13] = (byte) var14;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V", line = 271)
    public static final void method1889(boolean arg0) {
        if (class234.field3349 != -1) {
            class86.method626(false, -1, -1, class234.field3349, 27712);
            class234.field3349 = -1;
        }
        if (!arg0) {
            field3988++;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(II)V", line = 290)
    public class280(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class125.method922(arg0, (byte) 26, arg1);
            int var4 = arg0 / var3;
            this.field3991 = new int[var4][14];
            int var5 = arg1 / var3;
            this.field3984 = var4;
            this.field3983 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field3991[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var7 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                if (var10 < 0) {
                    var10 = 0;
                }
                while (var10 < var11) {
                    double var14 = ((double) var10 - var7) * 3.141592653589793D;
                    double var16 = var12;
                    if (-1.0E-4D > var14 || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(Z)V", line = 353)
    public static void method1890(boolean arg0) {
        field3992 = null;
        if (arg0) {
            field3993 = (class140) null;
        }
        field3993 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 365)
    public static final void method1891(int arg0) {
        if (arg0 != -12937) {
            method1892((class333) null, (byte) 20, 17, 17, 52);
        }
        for (int var1 = 0; var1 < class318.field4689; var1++) {
            int var2 = class35.field430[var1];
            class239 var3 = class311.field4574[var2];
            int var4 = class240.field3490.method2096((byte) -122);
            if ((var4 & 0x80) != 0) {
                var4 += class240.field3490.method2096((byte) -122) << 8;
            }
            class275.method1862(var2, var4, -20, var3);
        }
        field3987++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lwf;BIII)V", line = 403)
    public static final void method1892(class333 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3994++;
        if (class47.field623) {
            class129.method989(arg4, arg2, arg0.field5056 + arg4, arg2 - -arg0.field5172);
        }
        if (class160.field2292 >= 3) {
            if (class47.field623) {
                class158 var5 = arg0.method2325(false, (byte) -18);
                if (var5 != null) {
                    var5.method85(arg4, arg2);
                }
            } else {
                class37.method236(arg4, arg2, 0, arg0.field5195, arg0.field5057);
            }
        } else if (class47.field623) {
            ((class361) class84.field1090).method2510(arg4, arg2, arg0.field5056, arg0.field5172, class84.field1090.field2252 / 2, class84.field1090.field2250 / 2, (int) class247.field3601, 256, (class361) arg0.method2325(false, (byte) -18));
        } else {
            ((class11) class84.field1090).method69(arg4, arg2, arg0.field5056, arg0.field5172, class84.field1090.field2252 / 2, class84.field1090.field2250 / 2, (int) class247.field3601, 256, arg0.field5195, arg0.field5057);
        }
        class185.field2520[arg3] = true;
        if (arg1 < 2) {
            field3982 = 66;
        }
    }
}
