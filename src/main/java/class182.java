import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class182 extends class199 {

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public static int field3222 = 0;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public static int field3229 = 0;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "Lrd;")
    public static class135 field3230;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "Lke;")
    public class256 field3223;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "Lke;")
    public class256 field3225;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "[I")
    public static int[] field3227;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "[Lwa;")
    public static class264[] field3220;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIZ)Lke;", line = 4)
    public static final class256 method1330(int arg0, int arg1, boolean arg2) {
        field3224++;
        if (arg0 != 0) {
            method1335((byte) 121, 4);
        }
        return class7.method52((byte) -59, 10, arg2, arg1);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lla;IZII)V", line = 19)
    public static final void method1331(class188 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3231++;
        class65.method506(true);
        if (class253.field4323) {
            class60.method470(arg4, arg3, arg0.field3391 + arg4, arg0.field3343 + arg3);
        } else {
            class178.method1302(arg4, arg3, arg0.field3391 + arg4, arg0.field3343 + arg3);
        }
        if (class321.field5495 != 2 && class321.field5495 != 5 && class96.field1707 != null) {
            int var5 = class289.field5001 + class215.field3839 & 0x7FF;
            int var6 = 464 - (class121.field2124.field1197 / 32);
            int var7 = class121.field2124.field1192 / 32 + 48;
            if (class253.field4323) {
                ((class87) class96.field1707).method635(arg4, arg3, arg0.field3391, arg0.field3343, var7, var6, var5, class162.field2880 + 256, (class87) arg0.method1359(false, (byte) -116));
            } else {
                ((class227) class96.field1707).method1490(arg4, arg3, arg0.field3391, arg0.field3343, var7, var6, var5, class162.field2880 + 256, arg0.field3359, arg0.field3386);
            }
            if (class80.field1490 != null) {
                for (int var8 = 0; var8 < class80.field1490.field4113; var8++) {
                    if (class80.field1490.method1618(var8, (byte) -127)) {
                        int var9 = (class80.field1490.field4119[var8] - class134.field2336) * 4 + 2 - (class121.field2124.field1192 / 32);
                        int var10 = class136.field2366[var5];
                        int var11 = class136.field2372[var5];
                        int var12 = var10 * 256 / (class162.field2880 + 256);
                        int var13 = (class80.field1490.field4122[var8] - class10.field147) * 4 + 2 - (class121.field2124.field1197 / 32);
                        class293 var14 = class159.field2838;
                        int var15 = var11 * 256 / (class162.field2880 + 256);
                        int var16 = var13 * var15 - var9 * var12 >> 16;
                        int var17 = var12 * var13 + (var9 * var15) >> 16;
                        if (class80.field1490.method1622((byte) -112, var8) == 1) {
                            var14 = class280.field4875;
                        }
                        if (class80.field1490.method1622((byte) -112, var8) == 2) {
                            var14 = class17.field215;
                        }
                        int var18 = var14.method2038(class80.field1490.field4124[var8], 100);
                        int var19 = var17 - var18 / 2;
                        if (-arg0.field3391 <= var19 && arg0.field3391 >= var19 && (-arg0.field3343) <= var16 && var16 <= arg0.field3343) {
                            int var20 = 16777215;
                            if (class80.field1490.field4117[var8] != -1) {
                                var20 = class80.field1490.field4117[var8];
                            }
                            if (class253.field4323) {
                                class60.method477((class87) arg0.method1359(false, (byte) -122));
                            } else {
                                class178.method1303(arg0.field3359, arg0.field3386);
                            }
                            var14.method2050(class80.field1490.field4124[var8], var19 + (arg0.field3391 / 2) + arg4, arg0.field3343 / 2 + arg3 + -var16, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class253.field4323) {
                                class60.method469();
                            } else {
                                class178.method1309();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class124.field2202; var21++) {
                int var22 = class308.field5307[var21] * 4 + 2 - (class121.field2124.field1192 / 32);
                int var23 = class273.field4698[var21] * 4 + 2 - (class121.field2124.field1197 / 32);
                class273 var24 = class271.method1871(124, class140.field2462[var21]);
                if (var24.field4664 != null) {
                    var24 = var24.method1887(-73);
                    if (var24 == null || var24.field4692 == -1) {
                        continue;
                    }
                }
                class300.method2097(-904, arg3, var23, arg4, class141.field2475[var24.field4692], arg0, var22);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class175 var27 = class230.field3934[class255.field4377][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - (class121.field2124.field1192 / 32);
                        int var29 = var26 * 4 + 2 - (class121.field2124.field1197 / 32);
                        class300.method2097(-904, arg3, var29, arg4, class13.field179[0], arg0, var28);
                    }
                }
            }
            for (int var30 = 0; var30 < class311.field5357; var30++) {
                class279 var31 = class187.field3281[class141.field2480[var30]];
                if (var31 != null && var31.method519(126)) {
                    class74 var32 = var31.field4860;
                    if (var32 != null && var32.field1381 != null) {
                        var32 = var32.method553(4175);
                    }
                    if (var32 != null && var32.field1412 && var32.field1419) {
                        int var33 = var31.field1192 / 32 - (class121.field2124.field1192 / 32);
                        int var34 = var31.field1197 / 32 - class121.field2124.field1197 / 32;
                        if (var32.field1390 == -1) {
                            class300.method2097(-904, arg3, var34, arg4, class13.field179[1], arg0, var33);
                        } else {
                            class300.method2097(-904, arg3, var34, arg4, class141.field2475[var32.field1390], arg0, var33);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class67.field1206; var35++) {
                class144 var36 = class300.field5172[class140.field2463[var35]];
                if (var36 != null && var36.method519(103)) {
                    int var37 = var36.field1192 / 32 - (class121.field2124.field1192 / 32);
                    int var38 = var36.field1197 / 32 - class121.field2124.field1197 / 32;
                    boolean var39 = false;
                    long var40 = var36.field2532.method1780(true);
                    for (int var42 = 0; var42 < class311.field5358; var42++) {
                        if (class108.field1924[var42] == var40 && class68.field1261[var42] != 0) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class206.field3733; var44++) {
                        if (class284.field4914[var44].field2895 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class121.field2124.field2531 != 0 && var36.field2531 != 0 && class121.field2124.field2531 == var36.field2531) {
                        var45 = true;
                    }
                    if (var39) {
                        class300.method2097(-904, arg3, var38, arg4, class13.field179[3], arg0, var37);
                    } else if (var43) {
                        class300.method2097(-904, arg3, var38, arg4, class13.field179[5], arg0, var37);
                    } else if (var45) {
                        class300.method2097(-904, arg3, var38, arg4, class13.field179[4], arg0, var37);
                    } else {
                        class300.method2097(-904, arg3, var38, arg4, class13.field179[2], arg0, var37);
                    }
                }
            }
            class96[] var46 = class38.field690;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class96 var48 = var46[var47];
                if (var48 != null && var48.field1733 != 0 && class45.field840 % 20 < 10) {
                    if (var48.field1733 == 1 && var48.field1720 >= 0 && var48.field1720 < class187.field3281.length) {
                        class279 var49 = class187.field3281[var48.field1720];
                        if (var49 != null) {
                            int var50 = var49.field1192 / 32 - (class121.field2124.field1192 / 32);
                            int var51 = var49.field1197 / 32 - (class121.field2124.field1197 / 32);
                            class10.method65(arg0, arg3, var48.field1725, arg4, var50, !arg2, var51);
                        }
                    }
                    if (var48.field1733 == 2) {
                        int var52 = (var48.field1730 - class10.field147) * 4 + 2 - (class121.field2124.field1197 / 32);
                        int var53 = (var48.field1709 - class134.field2336) * 4 + 2 - (class121.field2124.field1192 / 32);
                        class10.method65(arg0, arg3, var48.field1725, arg4, var53, false, var52);
                    }
                    if (var48.field1733 == 10 && var48.field1720 >= 0 && var48.field1720 < class300.field5172.length) {
                        class144 var54 = class300.field5172[var48.field1720];
                        if (var54 != null) {
                            int var55 = var54.field1197 / 32 - class121.field2124.field1197 / 32;
                            int var56 = var54.field1192 / 32 - (class121.field2124.field1192 / 32);
                            class10.method65(arg0, arg3, var48.field1725, arg4, var56, !arg2, var55);
                        }
                    }
                }
            }
            if (class241.field4102 != 0) {
                int var57 = class241.field4102 * 4 + 2 - (class121.field2124.field1192 / 32);
                int var58 = class269.field4588 * 4 + 2 - (class121.field2124.field1197 / 32);
                class300.method2097(-904, arg3, var58, arg4, class50.field911, arg0, var57);
            }
            if (class253.field4323) {
                class60.method482(arg0.field3391 / 2 + arg4 - 1, arg0.field3343 / 2 + (arg3 - 1), 3, 3, 16777215);
            } else {
                class178.method1299(arg4 + (arg0.field3391 / 2) - 1, arg0.field3343 / 2 + arg3 - 1, 3, 3, 16777215);
            }
        } else if (class253.field4323) {
            class135 var59 = arg0.method1359(false, (byte) -121);
            if (var59 != null) {
                var59.method637(arg4, arg3);
            }
        } else {
            class178.method1298(arg4, arg3, 0, arg0.field3359, arg0.field3386);
        }
        class302.field5220[arg1] = arg2;
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)Lwa;", line = 362)
    public final class264 method1332(byte arg0) {
        int var2 = -124 % ((arg0 - 77) / 35);
        field3219++;
        return field3220[this.field3637];
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)V", line = 372)
    public static void method1333(int arg0) {
        field3220 = null;
        field3227 = null;
        int var1 = -25 / ((arg0 - 25) / 41);
        field3230 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILng;I)Lj;", line = 388)
    public static final class227 method1334(int arg0, class138 arg1, int arg2) {
        field3228++;
        if (arg0 == 23814) {
            return class278.method1954(arg2, arg1, 44) ? class223.method1535(0) : null;
        } else {
            return (class227) null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)Lla;", line = 422)
    public static final class188 method1335(byte arg0, int arg1) {
        field3221++;
        if (arg0 < 85) {
            field3222 = 106;
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class50.field921[var2] == null || class50.field921[var2][var3] == null) {
            boolean var4 = class298.method2087(var2, 20330);
            if (!var4) {
                return null;
            }
        }
        return class50.field921[var2][var3];
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([IIIIII)V", line = 448)
    public static final void method1336(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class271 var6 = class41.field790[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class198 var7 = var6.field4631;
        if (var7 != null) {
            int var8 = var7.field3624;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class3 var10 = var6.field4625;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field38;
        int var12 = var10.field33;
        int var13 = var10.field51;
        int var14 = var10.field31;
        int[] var15 = class68.field1272[var11];
        int[] var16 = class177.field3134[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }
}
