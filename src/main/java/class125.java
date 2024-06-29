import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class125 {

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "[[I")
    public static int[][] field1997 = new int[104][104];

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "[I")
    public static int[] field1998 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public int field1989;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "Ljava/lang/String;")
    public String field1991;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "[I")
    public static int[] field1992;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lfk;)V", line = 11)
    public static final void method937(class45 arg0) {
        for (int var1 = arg0.field770; var1 <= arg0.field785; var1++) {
            for (int var2 = arg0.field772; var2 <= arg0.field784; var2++) {
                class272 var3 = class60.field946[arg0.field774][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field4220; var4++) {
                        if (var3.field4217[var4] == arg0) {
                            var3.field4220--;
                            for (int var5 = var4; var5 < var3.field4220; var5++) {
                                var3.field4217[var5] = var3.field4217[var5 + 1];
                                var3.field4228[var5] = var3.field4228[var5 + 1];
                            }
                            var3.field4217[var3.field4220] = null;
                            break;
                        }
                    }
                    var3.field4229 = 0;
                    for (int var6 = 0; var6 < var3.field4220; var6++) {
                        var3.field4229 |= var3.field4228[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Lmh;", line = 67)
    public static final class136 method938(int arg0, int arg1) {
        field1990++;
        class136 var2 = (class136) class160.field2516.method2017(1022, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class178.field2787.method467(0, 67, arg0);
        if (var3 == null) {
            return null;
        }
        class136 var4 = new class136();
        class101 var5 = new class101(var3);
        var5.field1667 = var5.field1661.length - 2;
        int var6 = var5.method731(false);
        int var7 = var5.field1661.length - var6 - 12 - 2;
        var5.field1667 = var7;
        int var8 = var5.method775(-88);
        var4.field2168 = var5.method731(false);
        var4.field2172 = var5.method731(false);
        var4.field2163 = var5.method731(false);
        var4.field2159 = var5.method731(false);
        int var9 = var5.method741(71);
        if (var9 > 0) {
            var4.field2164 = new class110[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method731(false);
                class110 var12 = new class110(class210.method1532(-1429694904, var11));
                var4.field2164[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method775(-121);
                    int var14 = var5.method775(arg1 ^ 0xFFFFFFA9);
                    var12.method845(new class250(var14), (byte) -83, (long) var13);
                }
            }
        }
        var5.field1667 = 0;
        var4.field2169 = var5.method753(0);
        var4.field2158 = new int[var8];
        var4.field2173 = new int[var8];
        int var15 = 0;
        var4.field2162 = new String[var8];
        while (var5.field1667 < var7) {
            int var16 = var5.method731(false);
            if (var16 == 3) {
                var4.field2162[var15] = var5.method749((byte) -124).intern();
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field2173[var15] = var5.method741(119);
            } else {
                var4.field2173[var15] = var5.method775(-127);
            }
            var4.field2158[var15++] = var16;
        }
        class160.field2516.method2018((long) arg0, var4, arg1 ^ 0x59);
        if (arg1 != -40) {
            field1995 = -23;
        }
        return var4;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIILdg;JLdg;Ldg;)V", line = 158)
    public static final void method939(int arg0, int arg1, int arg2, int arg3, class320 arg4, long arg5, class320 arg6, class320 arg7) {
        class183 var9 = new class183();
        var9.field2914 = arg4;
        var9.field2916 = arg1 * 128 + 64;
        var9.field2925 = arg2 * 128 + 64;
        var9.field2924 = arg3;
        var9.field2921 = arg5;
        var9.field2919 = arg6;
        var9.field2927 = arg7;
        int var10 = 0;
        class272 var11 = class60.field946[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field4220; var12++) {
                class45 var13 = var11.field4217[var12];
                if ((var13.field776 & 0x400000L) == 4194304L) {
                    int var14 = var13.field782.method207();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2926 = -var10;
        if (class60.field946[arg0][arg1][arg2] == null) {
            class60.field946[arg0][arg1][arg2] = new class272(arg0, arg1, arg2);
        }
        class60.field946[arg0][arg1][arg2].field4221 = var9;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZIIIII)V", line = 201)
    public static final void method940(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1999++;
        int var8 = arg0 + arg5;
        int var9 = arg4 - arg5;
        for (int var10 = arg0; var10 < var8; var10++) {
            class86.method614(arg6, -24891, arg7, arg3, class102.field1729[var10]);
        }
        int var11 = arg7 - arg5;
        int var12 = arg3 + arg5;
        if (!arg2) {
            method937((class45) null);
        }
        for (int var13 = arg4; var13 > var9; var13--) {
            class86.method614(arg6, -24891, arg7, arg3, class102.field1729[var13]);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class102.field1729[var14];
            class86.method614(arg6, -24891, var12, arg3, var15);
            class86.method614(arg1, -24891, var11, var12, var15);
            class86.method614(arg6, -24891, arg7, var11, var15);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lja;I)V", line = 246)
    public static final void method941(class64 arg0, int arg1) {
        field2000++;
        class134.field2125 = class284.method2014(0, -1, class62.field964, arg0);
        class195.field3107 = class84.method601(arg0, 5, 0, class256.field3961);
        class56.field900 = class84.method601(arg0, 5, 0, class278.field4300);
        if (arg1 != -18560) {
            field1997 = (int[][]) ((int[][]) null);
        }
        class205.field3253 = class84.method601(arg0, 5, 0, class294.field4621);
        class221.field3525 = class84.method601(arg0, 5, 0, class211.field3368);
        class293.field4614 = class84.method601(arg0, arg1 ^ 0xFFFFB785, 0, class180.field2882);
        class78.field1199 = class84.method601(arg0, 5, 0, class292.field4502);
        class258.field3983 = class10.method80(class17.field333, 0, arg0, arg1 ^ 0xFFFFB7F0);
        class87.field1330 = class88.method628(class326.field5063, 0, (byte) 32, arg0);
        class94.field1552 = class88.method628(class314.field4914, 0, (byte) 2, arg0);
        class327.field5067 = class178.method1321(arg1 + 18559, 0, arg0, class254.field3942);
        class224.field3600 = class178.method1321(-1, 0, arg0, class256.field3965);
        class127.field2035.method1036(class224.field3600, (int[]) null);
        class64.field1021.method1036(class224.field3600, (int[]) null);
        class95.field1558.method1036(class224.field3600, (int[]) null);
        if (class265.field4126) {
            class69.field1097 = class148.method1146(arg0, 27164, 0, class260.field4034);
            for (int var2 = 0; var2 < class69.field1097.length; var2++) {
                class69.field1097[var2].method2171();
            }
        }
        class7 var3 = class6.method31(0, 96, class217.field3483, arg0);
        var3.method61();
        if (class265.field4126) {
            class93.field1527 = new class105(var3);
        } else {
            class93.field1527 = var3;
        }
        class7[] var4 = class284.method2014(0, -1, class270.field4200, arg0);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method61();
        }
        if (class265.field4126) {
            class319.field4958 = new class126[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class319.field4958[var6] = new class105(var4[var6]);
            }
        } else {
            class319.field4958 = var4;
        }
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 41.0D) - 20;
        for (int var11 = 0; var11 < class134.field2125.length; var11++) {
            class134.field2125[var11].method52(var8 + var10, var9 + var10, var7 + var10);
        }
        if (class265.field4126) {
            class73.field1134 = new class126[class134.field2125.length];
            for (int var12 = 0; var12 < class134.field2125.length; var12++) {
                class73.field1134[var12] = new class105(class134.field2125[var12]);
            }
        } else {
            class73.field1134 = class134.field2125;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 349)
    public static final void method942(int arg0) {
        class29.field477.method1837(-121);
        if (arg0 >= -100) {
            method937((class45) null);
        }
        field1993++;
        class78.field1186.method1837(75);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V", line = 372)
    public static void method943(int arg0) {
        if (arg0 >= 93) {
            field1992 = null;
            field1997 = (int[][]) null;
            field1998 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZZIIIZ)Lai;", line = 384)
    public static final class126 method944(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field1994++;
        class179 var8 = class208.method1521(-1361, arg0);
        if (arg5 > 1 && var8.field2820 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field2819[var10] <= arg5 && var8.field2819[var10] != 0) {
                    var9 = var8.field2820[var10];
                }
            }
            if (var9 != -1) {
                var8 = class208.method1521(-1361, var9);
            }
        }
        class146 var11 = var8.method1327(-111);
        if (var11 == null) {
            return null;
        }
        class7 var12 = null;
        if (var8.field2810 != -1) {
            var12 = (class7) method944(var8.field2827, arg1 ^ 0x0, true, false, 1, 10, 0, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field2842 != -1) {
            var12 = (class7) method944(var8.field2800, 3, true, false, arg4, arg5, arg6, false);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class182.field2913;
        int var14 = class182.field2909;
        int[] var15 = new int[4];
        int var16 = class182.field2910;
        class182.method1362(var15);
        class7 var17 = new class7(36, 32);
        class182.method1371(var17.field117, 36, 32);
        class174.method1292();
        class174.method1299(16, 16);
        class174.field2738 = false;
        int var18 = var8.field2849;
        if (arg1 != 3) {
            return (class126) null;
        }
        if (arg7) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg4 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class174.field2732[var8.field2807] * var18 >> 16;
        int var20 = class174.field2731[var8.field2807] * var18 >> 16;
        var11.method1120(0, var8.field2845, var8.field2795, var8.field2807, var8.field2822, var20 + var8.field2841 - (var11.method207() / 2), var8.field2841 + var19, -1L);
        if (arg4 >= 1) {
            var17.method43(1);
            if (arg4 >= 2) {
                var17.method43(16777215);
            }
            class182.method1371(var17.field117, 36, 32);
        }
        if (arg6 != 0) {
            var17.method40(arg6);
        }
        if (var8.field2810 != -1) {
            var12.method59(0, 0);
        } else if (var8.field2842 != -1) {
            class182.method1371(var12.field117, 36, 32);
            var17.method59(0, 0);
            var17 = var12;
        }
        if (arg3 && (var8.field2829 == 1 || arg5 != 1) && arg5 != -1) {
            class3.field13.method1029(class12.method109(109, arg5), 0, 9, 16776960, 1);
        }
        class182.method1371(var13, var16, var14);
        class182.method1352(var15);
        class174.method1292();
        class174.field2738 = true;
        return class265.field4126 && !arg2 ? new class105(var17) : var17;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLja;)V", line = 519)
    public static final void method945(byte arg0, class64 arg1) {
        field1996++;
        class101.field1709 = class90.method653(false, class169.field2635, arg1);
        class261.field4061 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) ((class277.field4289[var2] & 0xFF00) >> 8);
            float var4 = (float) ((class277.field4289[var2] & 0xFF0000) >> 16);
            int var5 = (class277.field4289[var2 + 1] & 0xFF0000) >> 16;
            int var6 = (class277.field4289[var2 + 1] & 0xFF00) >> 8;
            float var7 = (float) (class277.field4289[var2] & 0xFF);
            float var8 = ((float) var5 - var4) / 64.0F;
            float var9 = ((float) var6 - var3) / 64.0F;
            int var10 = class277.field4289[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var7) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class261.field4061[var2 * 64 + var12] = class94.method673(class94.method673((int) var4 << 16, (int) var3 << 8), (int) var7);
                var3 += var9;
                var7 += var11;
                var4 += var8;
            }
        }
        if (arg0 <= 60) {
            return;
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class261.field4061[var13] = class277.field4289[3];
        }
        class309.field4867 = new int[32768];
        class302.field4756 = new int[32768];
        class198.method1439((class315) null, 0);
        class207.field3270 = new int[32768];
        class211.field3375 = new int[32768];
        class120.field1925 = new class7(128, 254);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V", line = 582)
    public static final void method946(int arg0, int arg1) {
        class272 var2 = class60.field946[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class272 var4 = class60.field946[var3][arg0][arg1] = class60.field946[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field4223--;
                for (int var5 = 0; var5 < var4.field4220; var5++) {
                    class45 var6 = var4.field4217[var5];
                    if ((var6.field776 >> 29 & 0x3L) == 2L && var6.field770 == arg0 && var6.field772 == arg1) {
                        var6.field774--;
                    }
                }
            }
        }
        if (class60.field946[0][arg0][arg1] == null) {
            class60.field946[0][arg0][arg1] = new class272(0, arg0, arg1);
        }
        class60.field946[0][arg0][arg1].field4224 = var2;
        class60.field946[3][arg0][arg1] = null;
    }
}
