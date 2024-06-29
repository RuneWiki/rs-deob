import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class258 extends class320 {

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field4182 = 0;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "[I")
    public static int[] field4174 = new int[4096];

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field4188 = 0;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "[I")
    public static int[] field4170 = new int[128];

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public int field4169;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public int field4177;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public int field4180;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public int field4181;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public int field4184;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Llg;")
    public class137 field4168;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "Llg;")
    public class137 field4189;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "Ljava/lang/String;")
    public String field4176;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Z")
    public static boolean field4175;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "Z")
    public boolean field4179;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "[Ljava/lang/Object;")
    public Object[] field4173;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIBIILgk;IZIIIILwi;)Lgk;", line = 7)
    public static final class10 method1786(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class10 arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11, int arg12, class285 arg13) {
        field4172++;
        long var14 = ((long) arg5 << 48) + ((long) arg12 << 32) + (long) ((arg7 << 24) + (arg4 << 16) + arg11);
        class10 var16 = (class10) class41.field612.method467(true, var14);
        if (var16 == null) {
            byte var17;
            if (arg11 == 1) {
                var17 = 9;
            } else if (arg11 == 2) {
                var17 = 12;
            } else if (arg11 == 3) {
                var17 = 15;
            } else if (arg11 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            class307 var20 = new class307(var17 * var19 + 1, var17 * var19 * 2 + -var17, 0);
            int[][] var21 = new int[var19][var17];
            int var22 = var20.method2120(0, 0, 0);
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = var18[var23];
                int var25 = var18[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class62.field961[var27] * var25 + arg10 >> 16;
                    int var29 = arg2 + (class62.field962[var27] * var24) >> 16;
                    var21[var23][var26] = var20.method2120(var29, 0, var28);
                }
            }
            for (int var30 = 0; var30 < var19; var30++) {
                int var31 = (var30 * 256 + 128) / var19;
                int var32 = 256 - var31;
                short var33 = (short) (((arg5 & 0x7F) * var31 + (arg12 & 0x7F) * var32 & 0x7F00) + ((arg5 & 0xFC00) * var31 + (arg12 & 0xFC00) * var32 & 0xFC0000) + ((arg5 & 0x380) * var31 + (arg12 & 0x380) * var32 & 0x38000) >> 8);
                byte var34 = (byte) (arg4 * var32 + arg7 * var31 >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method2115(var22, var21[0][(var35 + 1) % var17], var21[0][var35], (byte) 1, var33, var34);
                    } else {
                        var20.method2115(var21[var30 - 1][var35], var21[var30 - 1][(var35 + 1) % var17], var21[var30][(var35 + 1) % var17], (byte) 1, var33, var34);
                        var20.method2115(var21[var30 - 1][var35], var21[var30][(var35 + 1) % var17], var21[var30][var35], (byte) 1, var33, var34);
                    }
                }
            }
            var16 = var20.method2104(64, 768, -50, -10, -50);
            class41.field612.method465(var16, var14, (byte) 80);
        }
        int var36 = arg11 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = arg6.method86();
        int var40 = var36;
        int var41 = var36;
        if (arg8) {
            if (arg0 > 640 && arg0 < 1408) {
                var41 = var36 + 128;
            }
            if (arg0 > 1664 || arg0 < 384) {
                var37 -= 128;
            }
            if (arg0 > 128 && arg0 < 896) {
                var38 -= 128;
            }
            if (arg0 > 1152 && arg0 < 1920) {
                var40 = var36 + 128;
            }
        }
        if (var38 > var39) {
            var39 = var38;
        }
        int var42 = arg6.method82();
        int var43 = arg6.method102();
        if (var42 > var40) {
            var42 = var40;
        }
        class100 var44 = null;
        if (var43 < var37) {
            var43 = var37;
        }
        int var45 = arg6.method87();
        if (arg3 > -94) {
            field4182 = 122;
        }
        if (arg13 != null) {
            int var46 = arg13.field4531[arg9];
            var44 = class297.method2027(0, var46 >> 16);
            arg9 = var46 & 0xFFFF;
        }
        if (var45 > var41) {
            var45 = var41;
        }
        class10 var47;
        if (var44 == null) {
            var47 = var16.method73(true, true, true);
            var47.method89((var42 - var39) / 2, 128, (var45 - var43) / 2);
            var47.method85((var39 + var42) / 2, 0, (var43 + var45) / 2);
        } else {
            var47 = var16.method73(!var44.method871(arg9, -106), !var44.method863(arg9, 2), true);
            var47.method89((var42 - var39) / 2, 128, (var45 - var43) / 2);
            var47.method85((var39 + var42) / 2, 0, (var43 + var45) / 2);
            var47.method83(var44, arg9);
        }
        if (arg0 != 0) {
            var47.method80(arg0);
        }
        if (class43.field680) {
            class183 var48 = (class183) var47;
            if (class223.method1627((byte) -128, arg10 + var43, arg2 + var39, class205.field3497) != arg1 || class223.method1627((byte) -128, arg10 + var45, arg2 - -var42, class205.field3497) != arg1) {
                for (int var49 = 0; var49 < var48.field3055; var49++) {
                    var48.field3054[var49] += class223.method1627((byte) -120, var48.field3087[var49] + arg10, var48.field3080[var49] + arg2, class205.field3497) - arg1;
                }
                var48.field3078.field5466 = false;
                var48.field3065.field2650 = false;
            }
        } else {
            class103 var50 = (class103) var47;
            if (arg1 != class223.method1627((byte) -122, arg10 + var43, arg2 + var39, class205.field3497) || arg1 != class223.method1627((byte) -125, arg10 + var45, arg2 + var42, class205.field3497)) {
                for (int var51 = 0; var51 < var50.field1661; var51++) {
                    var50.field1671[var51] += class223.method1627((byte) -126, var50.field1664[var51] + arg10, var50.field1657[var51] - -arg2, class205.field3497) - arg1;
                }
                var50.field1654 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIII)V", line = 238)
    public static final void method1787(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4191++;
        if (arg3 < 128 || arg0 < 128 || arg3 > 13056 || arg0 > 13056) {
            class171.field2968 = -1;
            class286.field4558 = -1;
            return;
        }
        int var8 = class223.method1627((byte) -124, arg0, arg3, class205.field3497) - arg2;
        int var9 = class62.field961[class141.field2592];
        int var10 = var8 - class139.field2563;
        int var11 = class62.field962[class141.field2592];
        if (arg1 != 190123016) {
            method1794(-21, -22);
        }
        int var12 = arg3 - class269.field4309;
        int var13 = class62.field962[class311.field4924];
        int var14 = class62.field961[class311.field4924];
        int var15 = arg0 - class32.field454;
        int var16 = var13 * var15 + (var12 * var14) >> 16;
        int var17 = var14 * var15 - var12 * var13 >> 16;
        int var19 = var9 * var10 - var11 * var17 >> 16;
        int var20 = var9 * var17 + var10 * var11 >> 16;
        if (var20 < 50) {
            class171.field2968 = -1;
            class286.field4558 = -1;
        } else if (class43.field680) {
            int var22 = arg7 * 512 >> 8;
            int var23 = arg5 * 512 >> 8;
            class286.field4558 = arg4 + (var16 * var22 / var20);
            class171.field2968 = var19 * var23 / var20 + arg6;
        } else {
            class171.field2968 = (var19 << 9) / var20 + arg6;
            class286.field4558 = (var16 << 9) / var20 + arg4;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)I", line = 306)
    public static final int method1788(int arg0, int arg1, int arg2) {
        field4183++;
        class66 var3 = (class66) class70.field1146.method732((long) arg0, true);
        if (var3 == null) {
            return 0;
        } else if (arg1 == arg2) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field1071.length; var5++) {
                if (var3.field1067[var5] == arg2) {
                    var4 += var3.field1071[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V", line = 337)
    public static final void method1789(int arg0) {
        field4190++;
        if (arg0 != 15) {
            field4174 = (int[]) null;
        }
        int var1 = class213.field3590;
        int var2 = class42.field621;
        int var3 = class68.field1114;
        byte var4 = 20;
        int var5 = class292.field4678 - 3;
        if (class42.field620 == null || class147.field2644 == null) {
            if (class321.field5091.method432(class198.field3396, false) && class321.field5091.method432(class141.field2591, false)) {
                class42.field620 = class28.method259(class321.field5091, false, 0, class198.field3396);
                class147.field2644 = class28.method259(class321.field5091, false, 0, class141.field2591);
                if (class43.field680) {
                    if (class42.field620 instanceof class273) {
                        class42.field620 = new class182((class309) class42.field620);
                    } else {
                        class42.field620 = new class157((class309) class42.field620);
                    }
                    if (class147.field2644 instanceof class273) {
                        class147.field2644 = new class182((class309) class147.field2644);
                    } else {
                        class147.field2644 = new class157((class309) class147.field2644);
                    }
                }
            } else if (class43.field680) {
                class169.method1329(var1, var2, var3, var4, class79.field1284, 256 - class77.field1242);
            } else {
                class47.method417(var1, var2, var3, var4, class79.field1284, 256 - class77.field1242);
            }
        }
        if (class42.field620 != null && class147.field2644 != null) {
            int var6 = (var3 - (class147.field2644.field2967 * 2)) / class42.field620.field2967;
            for (int var7 = 0; var7 < var6; var7++) {
                class42.field620.method1248(var1 + (class42.field620.field2967 * var7) + class147.field2644.field2967, var2);
            }
            class147.field2644.method1248(var1, var2);
            class147.field2644.method1254(var1 + var3 - class147.field2644.field2967, var2);
        }
        class177.field3014.method2240(class5.field74, var1 + 3, var2 + 14, class12.field171, -1);
        if (class43.field680) {
            class169.method1329(var1, var2 + var4, var3, var5 - var4, class79.field1284, 256 - class77.field1242);
        } else {
            class47.method417(var1, var2 + var4, var3, var5 - var4, class79.field1284, 256 - class77.field1242);
        }
        int var8 = class284.field4508;
        int var9 = field4182;
        for (int var10 = 0; var10 < class293.field4708; var10++) {
            int var11 = (class293.field4708 - var10 - 1) * 15 + var4 + var2 + 13;
            if (var8 > var1 && var1 + var3 > var8 && (var11 - 13) < var9 && var9 < var11 + 3) {
                if (class43.field680) {
                    class169.method1329(var1, var11 - 12, var3, 15, class57.field874, 256 - class146.field2636);
                } else {
                    class47.method417(var1, var11 - 12, var3, 15, class57.field874, 256 - class146.field2636);
                }
            }
        }
        if ((class109.field1854 == null || class265.field4283 == null || class155.field2753 == null) && class321.field5091.method432(class272.field4330, false) && class321.field5091.method432(class214.field3601, false) && class321.field5091.method432(class122.field2128, false)) {
            class109.field1854 = class28.method259(class321.field5091, false, 0, class272.field4330);
            class265.field4283 = class28.method259(class321.field5091, false, 0, class214.field3601);
            class155.field2753 = class28.method259(class321.field5091, false, 0, class122.field2128);
            if (class43.field680) {
                if (class109.field1854 instanceof class273) {
                    class109.field1854 = new class182((class309) class109.field1854);
                } else {
                    class109.field1854 = new class157((class309) class109.field1854);
                }
                if (class265.field4283 instanceof class273) {
                    class265.field4283 = new class182((class309) class265.field4283);
                } else {
                    class265.field4283 = new class157((class309) class265.field4283);
                }
                if (class155.field2753 instanceof class273) {
                    class155.field2753 = new class182((class309) class155.field2753);
                } else {
                    class155.field2753 = new class157((class309) class155.field2753);
                }
            }
        }
        if (class109.field1854 != null && class265.field4283 != null && class155.field2753 != null) {
            int var12 = (var3 - (class155.field2753.field2967 * 2)) / class109.field1854.field2967;
            for (int var13 = 0; var13 < var12; var13++) {
                class109.field1854.method1248(class109.field1854.field2967 * var13 + class155.field2753.field2967 + var1, -class109.field1854.field2965 + var2 - -var5);
            }
            int var14 = (var5 - class155.field2753.field2965 - var4) / class265.field4283.field2965;
            for (int var15 = 0; var15 < var14; var15++) {
                class265.field4283.method1248(var1, class265.field4283.field2965 * var15 + var2 + var4);
                class265.field4283.method1254(var3 + var1 - class265.field4283.field2967, class265.field4283.field2965 * var15 + var2 + var4);
            }
            class155.field2753.method1248(var1, var2 + var5 - class155.field2753.field2965);
            class155.field2753.method1254(var3 + var1 - class155.field2753.field2967, -class155.field2753.field2965 + var2 + var5);
        }
        for (int var16 = 0; var16 < class293.field4708; var16++) {
            int var17 = (class293.field4708 - var16 - 1) * 15 + var2 + var4 + 13;
            int var18 = class12.field171;
            if (var8 > var1 && var1 + var3 > var8 && var9 > var17 - 13 && var9 < (var17 + 3)) {
                var18 = class304.field4827;
            }
            class177.field3014.method2240(class352.method2453(var16, 27884), var1 + 3, var17, var18, 0);
        }
        class89.method781(class213.field3590, class68.field1114, class292.field4678, 0, class42.field621);
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V", line = 517)
    public static void method1790(int arg0) {
        field4174 = null;
        field4170 = null;
        if (arg0 != 21908) {
            method1790(24);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIILuk;IZJ)Z", line = 528)
    public static final boolean method1791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class104 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class249.field4042 == class137.field2487;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class123.field2134 || var16 >= class185.field3144) {
                    return false;
                }
                class257 var17 = class279.field4430[arg0][var15][var16];
                if (var17 != null && var17.field4150 >= 5) {
                    return false;
                }
            }
        }
        class241 var18 = new class241();
        var18.field3936 = arg11;
        var18.field3939 = arg0;
        var18.field3931 = arg5;
        var18.field3925 = arg6;
        var18.field3934 = arg7;
        var18.field3940 = arg8;
        var18.field3937 = arg9;
        var18.field3932 = arg1;
        var18.field3929 = arg2;
        var18.field3930 = arg1 + arg3 - 1;
        var18.field3928 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class279.field4430[var22][var19][var20] == null) {
                        class279.field4430[var22][var19][var20] = new class257(var22, var19, var20);
                    }
                }
                class257 var23 = class279.field4430[arg0][var19][var20];
                var23.field4147[var23.field4150] = var18;
                var23.field4165[var23.field4150] = var21;
                var23.field4151 |= var21;
                var23.field4150++;
                if (var13 && class352.field5574[var19][var20] != 0) {
                    var14 = class352.field5574[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class352.field5574[var24][var25] == 0) {
                        class352.field5574[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class128.field2222[class13.field210++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lpi;Z)V", line = 647)
    public static final void method1792(class336 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        while (true) {
            while (arg0.field5342.length > arg0.field5353) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg0.method2364(-9069) == 1) {
                    var2 = arg0.method2364(-9069);
                    var3 = true;
                    var4 = arg0.method2364(-9069);
                }
                int var5 = arg0.method2364(-9069);
                int var6 = arg0.method2364(-9069);
                int var7 = var5 * 64 - class341.field5444;
                int var8 = class304.field4825 - (var6 * 64 - class259.field4201) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class113.field1893 > (var7 + 63) && var8 < class304.field4825) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var11 >= var2 * 8 && var11 < (var2 * 8 + 8) && var12 >= (var4 * 8) && var4 * 8 + 8 > var12) {
                                byte var13 = arg0.method2323(115);
                                if (var13 != 0) {
                                    if (class122.field2116[var9][var10] == null) {
                                        class122.field2116[var9][var10] = new byte[4096];
                                    }
                                    class122.field2116[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method2323(-41);
                                    if (class336.field5368[var9][var10] == null) {
                                        class336.field5368[var9][var10] = new byte[4096];
                                    }
                                    class336.field5368[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method2323(109);
                        if (var16 != 0) {
                            arg0.field5353++;
                        }
                    }
                }
            }
            field4192++;
            return;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Llg;I)V", line = 744)
    public static final void method1793(class137 arg0, int arg1) {
        if (class262.field4249 == arg0.field2494) {
            class272.field4337[arg0.field2391] = true;
        }
        field4178++;
        if (arg1 != 0) {
            field4182 = 46;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V", line = 769)
    public static final void method1794(int arg0, int arg1) {
        field4186++;
        class30 var2 = class99.method857((byte) -121, arg1, 12);
        var2.method276(arg0);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII[[II)I", line = 779)
    public static final int method1795(int arg0, int arg1, int arg2, int arg3, int[][] arg4, int arg5) {
        field4171++;
        int var6 = (128 - arg2) * arg4[arg5][arg1] + (arg4[arg5 + 1][arg1] * arg2) >> 7;
        int var7 = (arg3 - arg2) * arg4[arg5][arg1 + 1] + (arg4[arg5 + 1][arg1 + 1] * arg2) >> 7;
        return (128 - arg0) * var6 + arg0 * var7 >> 7;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V", line = 795)
    public static final void method1796(int arg0) {
        field4187++;
        if (class144.field2628 > 1) {
            class144.field2628--;
            class110.field1867 = class99.field1606;
        }
        if (class101.field1633 > 0) {
            class101.field1633--;
        }
        if (class37.field539) {
            class37.field539 = false;
            class327.method2272(arg0 ^ 0xFFFFB1EB);
            return;
        }
        if (arg0 != 20077) {
            method1787(93, 66, -51, 47, -33, -111, 22, 108);
        }
        for (int var1 = 0; var1 < 100 && class253.method1761(false); var1++) {
        }
        if (class88.field1397 != 30) {
            return;
        }
        class90.method792(class341.field5443, 0, 165);
        Object var2 = class11.field135.field3452;
        synchronized (class11.field135.field3452) {
            if (!class241.field3943) {
                class11.field135.field3464 = 0;
            } else if (class284.field4509 != 0 || class11.field135.field3464 >= 40) {
                class341.field5443.method26(31, 7);
                class341.field5443.method2370(0, (byte) -20);
                class89.field1409++;
                int var3 = 0;
                int var4 = class341.field5443.field5353;
                for (int var5 = 0; var5 < class11.field135.field3464 && class341.field5443.field5353 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class11.field135.field3465[var5];
                    boolean var7 = false;
                    int var8 = class11.field135.field3463[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    if (class11.field135.field3465[var5] == -1 && class11.field135.field3463[var5] == -1) {
                        var7 = true;
                        var6 = -1;
                        var8 = -1;
                    }
                    if (class177.field3008 != var8 || class331.field5267 != var6) {
                        int var9 = var6 - class331.field5267;
                        class331.field5267 = var6;
                        int var10 = var8 - class177.field3008;
                        class177.field3008 = var8;
                        if (class329.field5238 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class341.field5443.method2359(-805606200, (class329.field5238 << 12) + (var10 << 6) + var9);
                            class329.field5238 = 0;
                        } else if (class329.field5238 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            class341.field5443.method2370(class329.field5238 + 128, (byte) -20);
                            var9 += 128;
                            var10 += 128;
                            class341.field5443.method2359(-805606200, (var10 << 8) + var9);
                            class329.field5238 = 0;
                        } else if (class329.field5238 < 32) {
                            class341.field5443.method2370(class329.field5238 + 192, (byte) -20);
                            if (var7) {
                                class341.field5443.method2320(-6128, Integer.MIN_VALUE);
                            } else {
                                class341.field5443.method2320(-6128, var8 | var6 << 16);
                            }
                            class329.field5238 = 0;
                        } else {
                            class341.field5443.method2359(-805606200, class329.field5238 + 57344);
                            if (var7) {
                                class341.field5443.method2320(arg0 ^ 0xFFFFA67D, Integer.MIN_VALUE);
                            } else {
                                class341.field5443.method2320(arg0 - 26205, var6 << 16 | var8);
                            }
                            class329.field5238 = 0;
                        }
                    } else if (class329.field5238 < 2047) {
                        class329.field5238++;
                    }
                }
                class341.field5443.method2344(class341.field5443.field5353 - var4, (byte) 108);
                if (var3 >= class11.field135.field3464) {
                    class11.field135.field3464 = 0;
                } else {
                    class11.field135.field3464 -= var3;
                    for (int var11 = 0; var11 < class11.field135.field3464; var11++) {
                        class11.field135.field3463[var11] = class11.field135.field3463[var3 + var11];
                        class11.field135.field3465[var11] = class11.field135.field3465[var3 + var11];
                    }
                }
            }
        }
        if (class284.field4509 != 0) {
            class32.field463++;
            long var13 = (class190.field3185 - class130.field2240) / 50L;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            int var15 = class226.field3812;
            class130.field2240 = class190.field3185;
            int var16 = (int) var13;
            int var17 = class218.field3635;
            byte var18 = 0;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            if (class284.field4509 == 2) {
                var18 = 1;
            }
            class341.field5443.method26(185, 7);
            class341.field5443.method2316(-23240, var17 | var15 << 16);
            class341.field5443.method2366(90, var16 | var18 << 15);
        }
        if (class224.field3737 > 0) {
            class224.field3737--;
        }
        if (class247.field4003 && class224.field3737 <= 0) {
            class130.field2247++;
            class224.field3737 = 20;
            class247.field4003 = false;
            class341.field5443.method26(125, 7);
            class341.field5443.method2366(arg0 - 20122, (int) class288.field4590);
            class341.field5443.method2318((int) class83.field1331, arg0 ^ 0x4E1A);
        }
        if (class287.field4575 && !class239.field3915) {
            class233.field3857++;
            class239.field3915 = true;
            class341.field5443.method26(251, 7);
            class341.field5443.method2370(1, (byte) -20);
        }
        if (!class287.field4575 && class239.field3915) {
            class239.field3915 = false;
            class233.field3857++;
            class341.field5443.method26(251, 7);
            class341.field5443.method2370(0, (byte) -20);
        }
        if (!class257.field4149) {
            class341.field5443.method26(166, 7);
            class341.field5443.method2316(arg0 ^ 0xFFFFEB55, class108.method948(arg0 ^ 0xFFFFB1EE));
            class257.field4149 = true;
            class226.field3803++;
        }
        if (class74.field1223) {
            class74.field1223 = false;
        } else {
            class131.field2257 /= 2.0F;
        }
        if (class199.field3403) {
            class199.field3403 = false;
        } else {
            class349.field5549 /= 2.0F;
        }
        class75.method699(-74);
        if (class88.field1397 != 30) {
            return;
        }
        class44.method393((byte) -1);
        class321.method2205(-31100);
        class344.method2413(54);
        class207.field3514++;
        if (class207.field3514 > 750) {
            class327.method2272(arg0 ^ 0xFFFFB1C8);
            return;
        }
        class39.method331(arg0 - 18030);
        class84.method759(true);
        class109.method952(arg0 + 10901);
        if (class138.field2552 != null) {
            class282.method1925(15326);
        }
        for (int var19 = class214.method1584((byte) 97, true); var19 != -1; var19 = class214.method1584((byte) -2, false)) {
            class300.method2073(123, var19);
            class166.field2897[class36.method319(31, class155.field2749++)] = var19;
        }
        for (class30 var20 = class163.method1298((byte) -8); var20 != null; var20 = class163.method1298((byte) -8)) {
            int var21 = var20.method278((byte) 124);
            int var22 = var20.method283(111);
            if (var21 == 1) {
                class210.field3561[var22] = var20.field438;
                class190.field3187[class36.method319(class330.field5253++, 31)] = var22;
            } else if (var21 == 2) {
                class81.field1329[var22] = var20.field436;
                class259.field4203[class36.method319(class102.field1641++, 31)] = var22;
            } else if (var21 == 3) {
                class137 var43 = class146.method1167(1169843632, var22);
                if (!var20.field436.equals(var43.field2493)) {
                    var43.field2493 = var20.field436;
                    method1793(var43, 0);
                }
            } else if (var21 == 4) {
                class137 var39 = class146.method1167(1169843632, var22);
                int var40 = var20.field438;
                int var41 = var20.field441;
                int var42 = var20.field425;
                if (var39.field2389 != var40 || var39.field2382 != var41 || var39.field2387 != var42) {
                    var39.field2389 = var40;
                    var39.field2387 = var42;
                    var39.field2382 = var41;
                    method1793(var39, 0);
                }
            } else if (var21 == 5) {
                class137 var23 = class146.method1167(arg0 ^ 0x45BA2BDD, var22);
                if (var20.field438 != var23.field2385 || var20.field438 == -1) {
                    var23.field2522 = 0;
                    var23.field2380 = 1;
                    var23.field2385 = var20.field438;
                    var23.field2511 = 0;
                    method1793(var23, 0);
                }
            } else if (var21 == 6) {
                int var33 = var20.field438;
                int var34 = var33 >> 10 & 0x1F;
                int var35 = (var33 & 0x3F5) >> 5;
                int var36 = var33 & 0x1F;
                int var37 = (var36 << 3) + (var34 << 19) + (var35 << 11);
                class137 var38 = class146.method1167(arg0 ^ 0x45BA2BDD, var22);
                if (var38.field2505 != var37) {
                    var38.field2505 = var37;
                    method1793(var38, 0);
                }
            } else if (var21 == 7) {
                class137 var31 = class146.method1167(1169843632, var22);
                boolean var32 = var20.field438 == 1;
                if (var32 != var31.field2421) {
                    var31.field2421 = var32;
                    method1793(var31, 0);
                }
            } else if (var21 == 8) {
                class137 var24 = class146.method1167(1169843632, var22);
                if (var20.field438 != var24.field2367 || var20.field441 != var24.field2430 || var20.field425 != var24.field2502) {
                    var24.field2367 = var20.field438;
                    var24.field2430 = var20.field441;
                    var24.field2502 = var20.field425;
                    if (var24.field2463 != -1) {
                        if (var24.field2437 > 0) {
                            var24.field2502 = var24.field2502 * 32 / var24.field2437;
                        } else if (var24.field2435 > 0) {
                            var24.field2502 = var24.field2502 * 32 / var24.field2435;
                        }
                    }
                    method1793(var24, 0);
                }
            } else if (var21 == 9) {
                class137 var30 = class146.method1167(arg0 ^ 0x45BA2BDD, var22);
                if (var20.field438 != var30.field2463 || var20.field441 != var30.field2535) {
                    var30.field2463 = var20.field438;
                    var30.field2535 = var20.field441;
                    method1793(var30, 0);
                }
            } else if (var21 == 10) {
                class137 var25 = class146.method1167(1169843632, var22);
                if (var20.field438 != var25.field2454 || var20.field441 != var25.field2500 || var20.field425 != var25.field2420) {
                    var25.field2500 = var20.field441;
                    var25.field2420 = var20.field425;
                    var25.field2454 = var20.field438;
                    method1793(var25, 0);
                }
            } else if (var21 == 11) {
                class137 var26 = class146.method1167(1169843632, var22);
                var26.field2427 = 0;
                var26.field2444 = var26.field2371 = var20.field441;
                var26.field2495 = 0;
                var26.field2456 = var26.field2373 = var20.field438;
                method1793(var26, 0);
            } else if (var21 == 12) {
                class137 var27 = class146.method1167(1169843632, var22);
                int var28 = var20.field438;
                if (var27 != null && var27.field2490 == 0) {
                    if (var27.field2497 - var27.field2515 < var28) {
                        var28 = var27.field2497 - var27.field2515;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                    if (var27.field2531 != var28) {
                        var27.field2531 = var28;
                        method1793(var27, arg0 - 20077);
                    }
                }
            } else if (var21 == 13) {
                class137 var29 = class146.method1167(1169843632, var22);
                var29.field2526 = var20.field438;
            }
        }
        if (class215.field3612 != 0) {
            class20.field304 += 20;
            if (class20.field304 >= 400) {
                class215.field3612 = 0;
            }
        }
        class31.field446++;
        if (class119.field2070 != null) {
            class100.field1615++;
            if (class100.field1615 >= 15) {
                method1793(class119.field2070, 0);
                class119.field2070 = null;
            }
        }
        if (class329.field5242 != null) {
            method1793(class329.field5242, 0);
            if ((class261.field4217 + 5) < class284.field4508 || (class261.field4217 - 5) > class284.field4508 || field4182 > (class225.field3785 + 5) || field4182 < class225.field3785 - 5) {
                class58.field897 = true;
            }
            class265.field4277++;
            if (class204.field3467 == 0) {
                if (class58.field897 && class265.field4277 >= 5) {
                    if (class329.field5242 == class166.field2902 && class91.field1437 != class74.field1211) {
                        class279.field4427++;
                        class137 var44 = class329.field5242;
                        byte var45 = 0;
                        if (class130.field2237 == 1 && var44.field2386 == 206) {
                            var45 = 1;
                        }
                        if (var44.field2379[class91.field1437] <= 0) {
                            var45 = 0;
                        }
                        if (client.method1894(var44).method518((byte) 73)) {
                            int var46 = class91.field1437;
                            int var47 = class74.field1211;
                            var44.field2379[var46] = var44.field2379[var47];
                            var44.field2461[var46] = var44.field2461[var47];
                            var44.field2379[var47] = -1;
                            var44.field2461[var47] = 0;
                        } else if (var45 == 1) {
                            int var48 = class91.field1437;
                            int var49 = class74.field1211;
                            while (var48 != var49) {
                                if (var49 > var48) {
                                    var44.method1119(var49 - 1, var49, 19557);
                                    var49--;
                                } else if (var49 < var48) {
                                    var44.method1119(var49 + 1, var49, arg0 - 520);
                                    var49++;
                                }
                            }
                        } else {
                            var44.method1119(class91.field1437, class74.field1211, 19557);
                        }
                        class341.field5443.method26(81, 7);
                        class341.field5443.method2318(class74.field1211, 122);
                        class341.field5443.method2318(class91.field1437, 119);
                        class341.field5443.method2336(var45, 15459);
                        class341.field5443.method2320(-6128, class329.field5242.field2462);
                    }
                } else if ((class38.field554 == 1 || class316.method2172(-2001, class293.field4708 - 1)) && class293.field4708 > 2) {
                    class64.method607(arg0 - 20138);
                } else if (class293.field4708 > 0) {
                    class79.method728(1);
                }
                class100.field1615 = 10;
                class284.field4509 = 0;
                class329.field5242 = null;
            }
        }
        class240.field3920 = null;
        class116.field2028 = 0;
        class332.field5288 = false;
        class137 var50 = class144.field2627;
        class137 var51 = class85.field1364;
        class212.field3576 = false;
        class144.field2627 = null;
        class85.field1364 = null;
        while (class283.method1929(-101) && class116.field2028 < 128) {
            class210.field3555[class116.field2028] = class81.field1328;
            field4170[class116.field2028] = class141.field2583;
            class116.field2028++;
        }
        class138.field2552 = null;
        if (class311.field4933 != -1) {
            class293.method2009(0, 0, 0, class188.field3152, (byte) 124, 0, class313.field4973, class311.field4933);
        }
        class99.field1606++;
        while (true) {
            class258 var52;
            class137 var53;
            class137 var54;
            do {
                var52 = (class258) class71.field1195.method2301((byte) 109);
                if (var52 == null) {
                    while (true) {
                        class258 var55;
                        class137 var56;
                        class137 var57;
                        do {
                            var55 = (class258) class253.field4076.method2301((byte) 113);
                            if (var55 == null) {
                                while (true) {
                                    class258 var58;
                                    class137 var59;
                                    class137 var60;
                                    do {
                                        var58 = (class258) class311.field4920.method2301((byte) 114);
                                        if (var58 == null) {
                                            if (class138.field2552 == null) {
                                                class153.field2719 = 0;
                                            }
                                            if (class204.field3473 != null) {
                                                class57.method511(16);
                                            }
                                            if (class158.field2787 > 0 && class97.field1572[82] && class97.field1572[81] && class99.field1612 != 0) {
                                                int var61 = class205.field3497 - class99.field1612;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class320.method2196(var61, class24.field345 + class218.field3632.field1975[0], arg0 + -20077, class218.field3632.field2034[0] + class34.field484);
                                            }
                                            if (class158.field2787 > 0 && class97.field1572[82] && class97.field1572[81]) {
                                                if (class97.field1565 != -1) {
                                                    class320.method2196(class205.field3497, class97.field1565 + class24.field345, 0, class34.field484 + class290.field4628);
                                                }
                                                class272.field4336 = 0;
                                                class203.field3454 = 0;
                                            } else if (class203.field3454 == 2) {
                                                if (class97.field1565 != -1) {
                                                    class341.field5443.method26(118, 7);
                                                    class341.field5443.method2324(class230.field3839, true);
                                                    class94.field1476++;
                                                    class341.field5443.method2334((byte) 2, class17.field281);
                                                    class341.field5443.method2334((byte) 2, class24.field345 + class97.field1565);
                                                    class341.field5443.method2334((byte) 2, class34.field484 + class290.field4628);
                                                    class98.field1603 = class226.field3812;
                                                    class207.field3513 = class218.field3635;
                                                    class215.field3612 = 1;
                                                    class20.field304 = 0;
                                                }
                                                class203.field3454 = 0;
                                            } else if (class272.field4336 == 2) {
                                                if (class97.field1565 != -1) {
                                                    class341.field5443.method26(10, arg0 - 20070);
                                                    class179.field3031++;
                                                    class341.field5443.method2318(class34.field484 + class290.field4628, arg0 + -19950);
                                                    class341.field5443.method2334((byte) 2, class97.field1565 + class24.field345);
                                                    class20.field304 = 0;
                                                    class215.field3612 = 1;
                                                    class98.field1603 = class226.field3812;
                                                    class207.field3513 = class218.field3635;
                                                }
                                                class272.field4336 = 0;
                                            } else if (class97.field1565 != -1 && class203.field3454 == 0 && class272.field4336 == 0) {
                                                class277.method1902((class290.field4628 << 1) + 1 - class218.field3632.method987(3047) >> 1, -2, (class97.field1565 << 1) + 1 - class218.field3632.method987(3047) >> 1, 0);
                                                class20.field304 = 0;
                                                class215.field3612 = 1;
                                                class98.field1603 = class226.field3812;
                                                class207.field3513 = class218.field3635;
                                            }
                                            class97.field1565 = -1;
                                            class125.method1046((byte) -76);
                                            if (class144.field2627 != var50) {
                                                if (var50 != null) {
                                                    method1793(var50, arg0 - 20077);
                                                }
                                                if (class144.field2627 != null) {
                                                    method1793(class144.field2627, 0);
                                                }
                                            }
                                            if (class85.field1364 != var51 && class205.field3489 == class105.field1758) {
                                                if (var51 != null) {
                                                    method1793(var51, 0);
                                                }
                                                if (class85.field1364 != null) {
                                                    method1793(class85.field1364, 0);
                                                }
                                            }
                                            if (class85.field1364 == null) {
                                                if (class205.field3489 > 0) {
                                                    class205.field3489--;
                                                }
                                            } else if (class105.field1758 > class205.field3489) {
                                                class205.field3489++;
                                                if (class205.field3489 == class105.field1758) {
                                                    method1793(class85.field1364, 0);
                                                }
                                            }
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class48.field734[var62]++;
                                            }
                                            int var63 = class272.method1854((byte) -93);
                                            int var64 = class36.method317(3);
                                            if (var63 > 15000 && var64 > 15000) {
                                                class330.field5249++;
                                                class101.field1633 = 250;
                                                class305.method2100(-38, 14500);
                                                class341.field5443.method26(57, 7);
                                            }
                                            if (class328.field5226 != null && class328.field5226.field709 == 1) {
                                                if (class328.field5226.field712 != null) {
                                                    class128.method1068(class53.field824, class37.field542, false);
                                                }
                                                class37.field542 = null;
                                                class53.field824 = false;
                                                class328.field5226 = null;
                                            }
                                            class325.field5178++;
                                            class98.field1598++;
                                            if (class98.field1598 > 500) {
                                                class98.field1598 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x4) == 4) {
                                                    class263.field4257 += class113.field1891;
                                                }
                                                if ((var65 & 0x1) == 1) {
                                                    class159.field2814 += class104.field1749;
                                                }
                                                if ((var65 & 0x2) == 2) {
                                                    class249.field4043 += class77.field1249;
                                                }
                                            }
                                            if (class249.field4043 < -55) {
                                                class77.field1249 = 2;
                                            }
                                            if (class249.field4043 > 55) {
                                                class77.field1249 = -2;
                                            }
                                            if (class325.field5178 > 500) {
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x2) == 2) {
                                                    class4.field59 += class220.field3684;
                                                }
                                                class325.field5178 = 0;
                                                if ((var66 & 0x1) == 1) {
                                                    class243.field3962 += class296.field4725;
                                                }
                                            }
                                            if (class4.field59 < -20) {
                                                class220.field3684 = 1;
                                            }
                                            if (class243.field3962 < -60) {
                                                class296.field4725 = 2;
                                            }
                                            if (class263.field4257 < -40) {
                                                class113.field1891 = 1;
                                            }
                                            if (class4.field59 > 10) {
                                                class220.field3684 = -1;
                                            }
                                            if (class263.field4257 > 40) {
                                                class113.field1891 = -1;
                                            }
                                            class83.field1345++;
                                            if (class243.field3962 > 60) {
                                                class296.field4725 = -2;
                                            }
                                            if (class159.field2814 < -50) {
                                                class104.field1749 = 2;
                                            }
                                            if (class159.field2814 > 50) {
                                                class104.field1749 = -2;
                                            }
                                            if (class83.field1345 > 50) {
                                                class341.field5443.method26(188, 7);
                                                class52.field812++;
                                            }
                                            if (class305.field4841) {
                                                class228.method1657(144);
                                                class305.field4841 = false;
                                            }
                                            try {
                                                if (class279.field4426 != null && class341.field5443.field5353 > 0) {
                                                    class279.field4426.method178(0, class341.field5443.field5353, class341.field5443.field5342, false);
                                                    class341.field5443.field5353 = 0;
                                                    class83.field1345 = 0;
                                                }
                                            } catch (IOException var68) {
                                                class327.method2272(-113);
                                            }
                                            return;
                                        }
                                        var59 = var58.field4168;
                                        if (var59.field2434 < 0) {
                                            break;
                                        }
                                        var60 = class146.method1167(1169843632, var59.field2465);
                                    } while (var60 == null || var60.field2453 == null || var60.field2453.length <= var59.field2434 || var60.field2453[var59.field2434] != var59);
                                    class179.method1376(var58, false);
                                }
                            }
                            var56 = var55.field4168;
                            if (var56.field2434 < 0) {
                                break;
                            }
                            var57 = class146.method1167(1169843632, var56.field2465);
                        } while (var57 == null || var57.field2453 == null || var56.field2434 >= var57.field2453.length || var57.field2453[var56.field2434] != var56);
                        class179.method1376(var55, false);
                    }
                }
                var53 = var52.field4168;
                if (var53.field2434 < 0) {
                    break;
                }
                var54 = class146.method1167(1169843632, var53.field2465);
            } while (var54 == null || var54.field2453 == null || var53.field2434 >= var54.field2453.length || var54.field2453[var53.field2434] != var53);
            class179.method1376(var52, false);
        }
    }
}
