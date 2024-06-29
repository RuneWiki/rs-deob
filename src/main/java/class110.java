import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class110 {

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Li;")
    private static class88 field2008 = class208.method1425(105, "You have only just left another world)3");

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field2011 = -1;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Li;")
    public static class88 field2009 = class208.method1425(105, "k");

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "[I")
    public static int[] field2007 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Li;")
    public static class88 field2017 = field2008;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Z")
    public static boolean field2014 = false;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "[I")
    public static int[] field2018 = new int[50];

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field2020 = -2;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Li;")
    public static class88 field2019 = class208.method1425(105, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Lrc;")
    public static class188 field2012;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLq;B)V")
    public static final void method761(boolean arg0, class174 arg1, byte arg2) {
        field2010++;
        int var3 = arg1.field3386 == 0 ? arg1.field3382 : arg1.field3386;
        int var4 = arg1.field3377 == 0 ? arg1.field3424 : arg1.field3377;
        int var5 = 84 / ((-arg2 - 47) / 44);
        class155.method1057(var3, (byte) -94, arg0, arg1.field3425, var4, class78.field1418[arg1.field3425 >> 16]);
        if (arg1.field3467 != null) {
            class155.method1057(var3, (byte) -99, arg0, arg1.field3425, var4, arg1.field3467);
        }
        class168 var6 = (class168) class128.field2397.method1051(-1, (long) arg1.field3425);
        if (var6 != null) {
            class212.method1451(var3, var6.field3231, (byte) 34, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
    public static void method762(boolean arg0) {
        field2009 = null;
        field2012 = null;
        field2008 = null;
        field2017 = null;
        if (arg0) {
            field2007 = null;
            field2018 = null;
            field2019 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BILq;)I")
    public static final int method763(byte arg0, int arg1, class174 arg2) {
        field2015++;
        if (arg2.field3394 == null || arg1 >= arg2.field3394.length) {
            return -2;
        }
        try {
            if (arg0 > -90) {
                return -104;
            }
            int[] var3 = arg2.field3394[arg1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var9 = class105.field1909[var3[var5++]];
                }
                if (var7 == 2) {
                    var9 = class217.field4068[var3[var5++]];
                }
                if (var7 == 3) {
                    var9 = class179.field3564[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class174 var12 = class239.method1581(-64, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class71.method472(var13, (byte) -122).field2879 || class67.field1215)) {
                        for (int var14 = 0; var14 < var12.field3390.length; var14++) {
                            if (var13 + 1 == var12.field3390[var14]) {
                                var9 += var12.field3476[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class113.field2052[var3[var5++]];
                }
                if (var7 == 6) {
                    var9 = class90.field1711[class217.field4068[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class113.field2052[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class240.field4458.field747;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class17.field255[var15]) {
                            var9 += class217.field4068[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class174 var18 = class239.method1581(-64, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class71.method472(var19, (byte) -127).field2879 || class67.field1215)) {
                        for (int var20 = 0; var20 < var18.field3390.length; var20++) {
                            if (var19 + 1 == var18.field3390[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class240.field4460;
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 12) {
                    var9 = class199.field3790;
                }
                if (var7 == 13) {
                    int var21 = class113.field2052[var3[var5++]];
                    int var22 = var3[var5++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var9 = class142.method932(-17611, var23);
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 18) {
                    var9 = (class240.field4458.field4138 >> 7) + class223.field4214;
                }
                if (var7 == 19) {
                    var9 = (class240.field4458.field4123 >> 7) + class190.field3681;
                }
                if (var7 == 20) {
                    var9 = var3[var5++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var4 += var9;
                    }
                    if (var6 == 1) {
                        var4 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var4 /= var9;
                    }
                    if (var6 == 3) {
                        var4 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIILnc;Lnc;IIJ)V")
    public static final void method764(int arg0, int arg1, int arg2, int arg3, class145 arg4, class145 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class157 var10 = new class157();
        var10.field3030 = arg8;
        var10.field3031 = arg1 * 128 + 64;
        var10.field3025 = arg2 * 128 + 64;
        var10.field3033 = arg3;
        var10.field3023 = arg4;
        var10.field3034 = arg5;
        var10.field3029 = arg6;
        var10.field3026 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class29.field489[var11][arg1][arg2] == null) {
                class29.field489[var11][arg1][arg2] = new class52(var11, arg1, arg2);
            }
        }
        class29.field489[arg0][arg1][arg2].field959 = var10;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public static final void method765() {
        for (int var0 = 0; var0 < class25.field396; var0++) {
            class108 var1 = class149.field2908[var0];
            class137.method917(var1);
            class149.field2908[var0] = null;
        }
        class25.field396 = 0;
    }
}
