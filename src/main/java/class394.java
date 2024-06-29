import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class394 {

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Lcq;")
    public static class72 field5364 = new class72("M", "M", "M", "M");

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "[I")
    public static int[] field5370 = new int[14];

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field5368 = 0;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)Lpd;")
    public static final class278 method2441(int arg0) {
        field5367++;
        if (class224.field2806 == null || class346.field4696 == null) {
            return null;
        }
        int var1 = -14 / ((-arg0 - 25) / 43);
        for (class278 var2 = (class278) class346.field4696.method224(-1354376344); var2 != null; var2 = (class278) class346.field4696.method224(-1354376344)) {
            class222 var3 = class339.method2178(false, var2.field3596);
            if (var3 != null && var3.field2771 && var3.method1345((byte) 55)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static final void method2442(int arg0) {
        class261.field3359.method625(1);
        field5372++;
        class358.field4866.method1857(arg0 ^ 0x8);
        if (class97.field1143 != null) {
            class97.field1143.method375(false, class357.field4845);
        }
        class346.field4701.method1761((byte) 127);
        class357.field4845.setBackground(Color.black);
        class96.field1126 = -1;
        class261.field3359 = class139.method893((byte) -119, class357.field4845);
        class358.field4866 = class101.method612(class357.field4845, true, arg0);
        if (class97.field1143 != null) {
            class97.field1143.method372((byte) -96, class357.field4845);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
    public static final void method2443(int arg0, int arg1, int arg2, int arg3) {
        field5363++;
        class12 var4 = class390.method2422(341555040, arg0, 9);
        var4.method66(-47);
        if (arg2 <= 40) {
            method2445(126, (byte[]) null, (class366[]) null, -96, -57, -47, -22, (class118) null, false, -115);
        }
        var4.field152 = arg1;
        var4.field144 = arg3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)V")
    public static final void method2444(int arg0, boolean arg1) {
        field5371++;
        if (class6.field49 == arg0) {
            return;
        }
        class22.field232 = class196.field2329 = class241.field3165[arg0];
        class267.field3454.method750(50, (int) ((double) class22.field232 * 34.46D));
        class225.field2848 = new int[4][class22.field232 >> 3][class196.field2329 >> 3];
        if (!arg1) {
            method2442(18);
        }
        class15.field180 = new int[class22.field232][class196.field2329];
        class330.field4498 = new int[class22.field232][class196.field2329];
        for (int var2 = 0; var2 < 4; var2++) {
            class156.field1815[var2] = class15.method85(class196.field2329, -1, class22.field232);
        }
        class183.field2126 = new byte[4][class22.field232][class196.field2329];
        class180.method1128(class22.field232, 4, class196.field2329, (byte) -95);
        class244.method1601(class196.field2329 >> 3, class22.field232 >> 3, (byte) 108, class267.field3454);
        class6.field49 = arg0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[B[Lg;IIIILuo;ZI)[I")
    public static final int[] method2445(int arg0, byte[] arg1, class366[] arg2, int arg3, int arg4, int arg5, int arg6, class118 arg7, boolean arg8, int arg9) {
        if (arg9 != 744) {
            method2443(-53, 14, -97, 18);
        }
        if (!arg8) {
            for (int var10 = 0; var10 < 4; var10++) {
                class366 var11 = arg2[var10];
                for (int var12 = 0; var12 < 64; var12++) {
                    for (int var13 = 0; var13 < 64; var13++) {
                        int var14 = arg5 + var12;
                        int var15 = arg4 + var13;
                        if (var14 >= 0 && var14 < class22.field232 && var15 >= 0 && class196.field2329 > var15) {
                            var11.method2314(var14, var15, (byte) 105);
                        }
                    }
                }
            }
        }
        field5362++;
        class242 var16 = new class242(arg1);
        int var17 = arg0 + arg5;
        int var18 = arg4 + arg6;
        for (int var19 = 0; var19 < arg3; var19++) {
            for (int var55 = 0; var55 < 64; var55++) {
                for (int var56 = 0; var56 < 64; var56++) {
                    class96.method594(0, var55 + arg5, arg8, var19, false, var17 + var55, 0, var16, var18 + var56, arg4 + var56, (byte) 0, 0);
                }
            }
        }
        boolean var20 = false;
        boolean var21 = false;
        while (var16.field3211 < var16.field3188.length) {
            int var22 = var16.method1563(arg9 ^ 0xFFFFFD68);
            if (var22 == 128) {
                class202.field2379[0] = var16.method1587((byte) -102);
                class202.field2379[1] = var16.method1582(false);
                class202.field2379[2] = var16.method1582(false);
                class202.field2379[3] = var16.method1582(false);
                var20 = true;
                class202.field2379[4] = var16.method1587((byte) -102);
            } else {
                if (var22 != 129) {
                    var16.field3211--;
                    break;
                }
                if (class284.field3710 == null) {
                    class284.field3710 = new byte[4][][];
                }
                for (int var40 = 0; var40 < 4; var40++) {
                    byte var41 = var16.method1589(false);
                    if (var41 == 0 && class284.field3710[var40] != null) {
                        int var42 = arg5;
                        int var43 = arg5 + 64;
                        int var44 = arg4;
                        if (var43 < 0) {
                            var43 = 0;
                        } else if (var43 >= class22.field232) {
                            var43 = class22.field232;
                        }
                        if (arg5 < 0) {
                            var42 = 0;
                        } else if (arg5 >= class22.field232) {
                            var42 = class22.field232;
                        }
                        int var45 = arg4 + 64;
                        if (arg4 < 0) {
                            var44 = 0;
                        } else if (arg4 >= class196.field2329) {
                            var44 = class196.field2329;
                        }
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 >= class196.field2329) {
                            var45 = class196.field2329;
                        }
                        while (var42 < var43) {
                            while (var44 < var45) {
                                class284.field3710[var40][var42][var44] = 0;
                                var44++;
                            }
                            var42++;
                        }
                    } else if (var41 == 1) {
                        if (class284.field3710[var40] == null) {
                            class284.field3710[var40] = new byte[class22.field232 + 1][class196.field2329 + 1];
                        }
                        for (int var50 = 0; var50 < 64; var50 += 4) {
                            for (int var51 = 0; var51 < 64; var51 += 4) {
                                byte var52 = var16.method1589(false);
                                for (int var53 = var50 + arg5; var53 < (var50 + arg5 + 4); var53++) {
                                    for (int var54 = var51 + arg4; var54 < (arg4 + var51 + 4); var54++) {
                                        if (var53 >= 0 && var53 < class22.field232 && var54 >= 0 && var54 < class196.field2329) {
                                            class284.field3710[var40][var53][var54] = var52;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var41 == 2) {
                        if (class284.field3710[var40] == null) {
                            class284.field3710[var40] = new byte[class22.field232 + 1][class196.field2329 + 1];
                        }
                        if (var40 > 0) {
                            int var46 = arg5;
                            int var47 = arg5 + 64;
                            int var48 = arg4;
                            if (arg4 < 0) {
                                var48 = 0;
                            } else if (arg4 >= class196.field2329) {
                                var48 = class196.field2329;
                            }
                            int var49 = arg4 + 64;
                            if (var47 < 0) {
                                var47 = 0;
                            } else if (class22.field232 <= var47) {
                                var47 = class22.field232;
                            }
                            if (arg5 < 0) {
                                var46 = 0;
                            } else if (arg5 >= class22.field232) {
                                var46 = class22.field232;
                            }
                            if (var49 < 0) {
                                var49 = 0;
                            } else if (class196.field2329 <= var49) {
                                var49 = class196.field2329;
                            }
                            while (var46 < var47) {
                                while (var49 > var48) {
                                    class284.field3710[var40][var46][var48] = class284.field3710[var40 - 1][var46][var48];
                                    var48++;
                                }
                                var46++;
                            }
                        }
                    }
                }
                var21 = true;
            }
        }
        if (!arg8) {
            class342 var23 = null;
            label289: while (true) {
                int var29;
                label282: do {
                    while (true) {
                        while (var16.field3211 < var16.field3188.length) {
                            int var28 = var16.method1563(-128);
                            if (var28 == 0) {
                                var23 = new class342(var16);
                            } else {
                                if (var28 == 1) {
                                    var29 = var16.method1563(-128);
                                    continue label282;
                                }
                                if (var28 != 2) {
                                    throw new IllegalStateException();
                                }
                                if (var23 == null) {
                                    var23 = new class342();
                                }
                                var23.method2186(8, var16);
                            }
                        }
                        if (var23 != null) {
                            for (int var24 = 0; var24 < 8; var24++) {
                                for (int var25 = 0; var25 < 8; var25++) {
                                    int var26 = (arg5 >> 3) + var24;
                                    int var27 = (arg4 >> 3) + var25;
                                    if (var26 >= 0 && (class22.field232 >> 3) > var26 && var27 >= 0 && (class196.field2329 >> 3) > var27) {
                                        class118.method780(var27, var26, var23, arg9 - 744);
                                    }
                                }
                            }
                        }
                        break label289;
                    }
                } while (var29 <= 0);
                for (int var30 = 0; var30 < var29; var30++) {
                    class6 var31 = new class6(var16);
                    if (var31.field47 == 31) {
                        class276 var32 = class451.method2795(var16.method1587((byte) -102), (byte) -31);
                        var31.method27(var32.field3572, var32.field3577, var32.field3576, var32.field3569, -82);
                    }
                    var31.field1071 += arg4 << 7;
                    var31.field1073 += arg5 << 7;
                    int var33 = var31.field1073 >> 7;
                    int var34 = var31.field1071 >> 7;
                    if (var33 >= 0 && var34 >= 0 && var33 < class22.field232 && var34 < class196.field2329) {
                        var31.field1072 = class226.field2868[var31.field52][var33][var34] - var31.field1072;
                        if (arg7.method788() > 0) {
                            class269.method1686(var31);
                        }
                    }
                }
            }
        }
        if (!var21 && class284.field3710 != null) {
            for (int var35 = 0; var35 < 4; var35++) {
                if (class284.field3710[var35] != null) {
                    for (int var36 = 0; var36 < 16; var36++) {
                        for (int var37 = 0; var37 < 16; var37++) {
                            int var38 = (arg5 >> 2) + var36;
                            int var39 = (arg4 >> 2) + var37;
                            if (var38 >= 0 && var38 < 26 && var39 >= 0 && var39 < 26) {
                                class284.field3710[var35][var38][var39] = 0;
                            }
                        }
                    }
                }
            }
        }
        if (var20) {
            return class202.field2379;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "()V")
    public static final void method2446() {
        for (int var0 = 0; var0 < class125.field1398; var0++) {
            class133 var1 = class46.field526[var0];
            class70.method421(var1);
            class46.field526[var0] = null;
        }
        class125.field1398 = 0;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
    public static void method2447(int arg0) {
        field5364 = null;
        field5370 = null;
        if (arg0 != 50) {
            method2443(23, 62, 110, -27);
        }
    }
}
