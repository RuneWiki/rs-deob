import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class161 implements Runnable {

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "[Loa;")
    public volatile class22[] field2430 = new class22[2];

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Z")
    public volatile boolean field2422 = false;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Z")
    public volatile boolean field2421 = false;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field2423 = 0;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Ll;")
    public static class133 field2425;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Lki;")
    public class180 field2426;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILaj;Laj;)V", line = 7)
    public static final void method1095(int arg0, class199 arg1, class199 arg2) {
        int var3 = -78 / ((arg0 - 4) / 48);
        field2420++;
        if (arg1.field2979 != null) {
            arg1.method1412(0);
        }
        arg1.field2979 = arg2;
        arg1.field2982 = arg2.field2982;
        arg1.field2979.field2982 = arg1;
        arg1.field2982.field2979 = arg1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIZ)Ljava/lang/String;", line = 24)
    public static final String method1096(int arg0, int arg1, boolean arg2) {
        field2427++;
        if (arg2 && arg1 >= 0) {
            if (arg0 < 13) {
                field2423 = 61;
            }
            return class129.method935((byte) -98, 10, arg1, arg2);
        } else {
            return Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 42)
    public static final void method1097(int arg0) {
        field2431++;
        if (arg0 != 28263) {
            field2423 = 96;
        }
        while (true) {
            class128 var1;
            class123 var3;
            do {
                var1 = (class128) class288.field4483.method633(-1);
                if (var1 == null) {
                    return;
                }
                if (var1.field2019 < 0) {
                    int var2 = -var1.field2019 - 1;
                    if (class120.field1837 == var2) {
                        var3 = class98.field1566;
                    } else {
                        var3 = class254.field3992[var2];
                    }
                } else {
                    int var4 = var1.field2019 - 1;
                    var3 = class254.field3989[var4];
                }
            } while (var3 == null);
            class85 var5 = class201.method1431(-95, var1.field2018);
            if (class205.field3101 >= 3) {
            }
            int var6;
            int var7;
            if (var1.field2007 == 1 || var1.field2007 == 3) {
                var7 = var5.field1385;
                var6 = var5.field1390;
            } else {
                var6 = var5.field1385;
                var7 = var5.field1390;
            }
            int var8 = (var7 + 1 >> 1) + var1.field2017;
            int var9 = var1.field2005 + (var6 + 1 >> 1);
            int[][] var10 = class218.field3321[class205.field3101];
            int var11 = (var6 >> 1) + var1.field2005;
            int var12 = (var7 >> 1) + var1.field2017;
            int var13 = var10[var12][var9] + var10[var12][var11] + var10[var8][var11] + var10[var8][var9] >> 2;
            class253 var14 = null;
            int var15 = class177.field2683[var1.field2014];
            if (var15 == 0) {
                class103 var16 = class48.method416(class205.field3101, var1.field2017, var1.field2005);
                if (var16 != null) {
                    var14 = var16.field1598;
                }
            } else if (var15 == 1) {
                class228 var19 = class327.method2220(class205.field3101, var1.field2017, var1.field2005);
                if (var19 != null) {
                    var14 = var19.field3623;
                }
            } else if (var15 == 2) {
                class26 var17 = class104.method757(class205.field3101, var1.field2017, var1.field2005);
                if (var17 != null) {
                    var14 = var17.field406;
                }
            } else if (var15 == 3) {
                class279 var18 = class219.method1545(class205.field3101, var1.field2017, var1.field2005);
                if (var18 != null) {
                    var14 = var18.field4297;
                }
            }
            if (var14 != null) {
                class313.method2121(var1.field2005, var1.field2010 + 1, 0, var15, arg0 ^ 0x6E67, class205.field3101, var1.field2017, var1.field2023 + 1, -1, 0);
                int var20 = var1.field2013;
                var3.field1948 = var1.field2005 * 128 + (var6 * 64);
                var3.field1931 = var1.field2010 + class227.field3618;
                int var21 = var1.field2026;
                int var22 = var1.field2006;
                var3.field1863 = var13;
                if (var21 > var20) {
                    int var23 = var21;
                    var21 = var20;
                    var20 = var23;
                }
                var3.field1922 = var1.field2017 * 128 + var7 * 64;
                var3.field1893 = var14;
                var3.field1878 = var1.field2017 + var20;
                int var24 = var1.field2003;
                var3.field1879 = var1.field2017 + var21;
                var3.field1889 = class227.field3618 + var1.field2023;
                if (var24 < var22) {
                    int var25 = var22;
                    var22 = var24;
                    var24 = var25;
                }
                var3.field1950 = var1.field2005 + var22;
                var3.field1862 = var1.field2005 + var24;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIZIIIZ)V", line = 217)
    public static final void method1098(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, boolean arg11) {
        field2424++;
        int var12 = arg6 - arg2;
        int var13 = arg3 - arg9;
        int var14 = -1;
        int var15 = 983040 / arg4;
        if (class32.field464 > 0) {
            if (class60.field979 > 10) {
                var14 = 100 - class60.field979 * 5;
            } else {
                var14 = class60.field979 * 5;
            }
        }
        int var16 = 983040 / arg1;
        for (int var17 = -var15; var17 < var12 + var15; var17++) {
            int var18 = arg4 * var17 + arg8 >> 16;
            int var19 = (var17 + 1) * arg4 + arg8 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var10000 = arg5 + var19;
                int var22 = arg5 + var18;
                int var23 = var17 + arg2 >> 6;
                if (var23 >= 0 && var23 <= (class270.field4210.length - 1)) {
                    int[][] var24 = class270.field4210[var23];
                    for (int var25 = -var16; var25 < var13 + var16; var25++) {
                        int var26 = arg1 * var25 + arg10 >> 16;
                        int var27 = arg10 + ((var25 + 1) * arg1) >> 16;
                        int var28 = var27 - var26;
                        if (var28 > 0) {
                            var10000 = arg0 + var27;
                            int var30 = arg9 + var25 >> 6;
                            int var31 = arg0 + var26;
                            if (var30 >= 0 && var30 <= (var24.length - 1) && var24[var30] != null) {
                                int var32 = ((arg9 + var25 & 0x3F) << 6) + (arg2 + var17 & 0x3F);
                                int var33 = var24[var30][var32];
                                if (var33 != 0) {
                                    class85 var34 = class201.method1431(-114, var33 - 1);
                                    if (!class175.field2646[var34.field1326]) {
                                        if (var14 != -1 && class254.field3996 == var34.field1326) {
                                            class119 var35 = new class119();
                                            var35.field1818 = var34.field1326;
                                            var35.field1819 = var22;
                                            var35.field1820 = var31;
                                            class71.field1158.method632(-67, var35);
                                        } else {
                                            class141.field2183[var34.field1326].method617(var22 - 7, var31 - 7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        class119 var36 = (class119) class71.field1158.method636(-1);
        if (!arg11) {
            method1099((byte) 114);
        }
        while (var36 != null) {
            class109.method797(var36.field1819, var36.field1820, 15, 16776960, var14);
            class109.method797(var36.field1819, var36.field1820, 13, 16776960, var14);
            class109.method797(var36.field1819, var36.field1820, 11, 16776960, var14);
            class109.method797(var36.field1819, var36.field1820, 9, 16776960, var14);
            class141.field2183[var36.field1818].method617(var36.field1819 - 7, var36.field1820 + -7);
            var36 = (class119) class71.field1158.method638(122);
        }
        class71.field1158.method634((byte) -118);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 345)
    public static void method1099(byte arg0) {
        field2425 = null;
        if (arg0 != -64) {
            field2423 = -67;
        }
    }

    @OriginalMember(owner = "client!nb", name = "run", descriptor = "()V", line = 355)
    public final void run() {
        field2429++;
        this.field2421 = true;
        try {
            while (!this.field2422) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class22 var2 = this.field2430[var1];
                    if (var2 != null) {
                        var2.method225(true);
                    }
                }
                class5.method26(0, 10L);
                class315.method2135((Object) null, -9352, this.field2426);
            }
        } catch (Exception var7) {
            class184.method1322(var7, (String) null, (byte) -24);
        } finally {
            this.field2421 = false;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIII)V", line = 389)
    public static final void method1100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2419++;
        if (class321.method2189(arg8, (byte) 79)) {
            class208.method1480(arg4, 10602, arg6, arg7, arg1, arg2, arg0, class163.field2463[arg8], arg3, arg5);
        } else if (arg1 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class34.field510[var9] = true;
            }
        } else {
            class34.field510[arg1] = true;
        }
    }
}
