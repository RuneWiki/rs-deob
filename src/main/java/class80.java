import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class80 {

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1117 = "Members object";

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field1122 = new String[100];

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "[I")
    public static int[] field1114;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(JB)V", line = 4)
    public static final void method543(long arg0, byte arg1) {
        field1115++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class207.field3412; var3++) {
            if (class54.field769[var3] == arg0) {
                class231.field3671++;
                class207.field3412--;
                for (int var4 = var3; var4 < class207.field3412; var4++) {
                    class54.field769[var4] = class54.field769[var4 + 1];
                    class210.field3450[var4] = class210.field3450[var4 + 1];
                    class181.field2993[var4] = class181.field2993[var4 + 1];
                }
                class133.field2092 = class186.field3074;
                class194.field3175.method2375(87, 0);
                class194.field3175.method255(false, arg0);
                break;
            }
        }
        if (arg1 > -32) {
            field1114 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V", line = 49)
    public static void method544(byte arg0) {
        if (arg0 != 0) {
            method549((class263) null, -24);
        }
        field1122 = null;
        field1117 = null;
        field1114 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII[I)V", line = 66)
    public static final void method545(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        if (arg1 > -43) {
            field1122 = (String[]) null;
        }
        arg3--;
        int var6 = arg2 - 1;
        int var5 = var6 - 7;
        while (var5 > arg3) {
            int var7 = arg3 + 1;
            arg4[var7] = arg0;
            int var8 = var7 + 1;
            arg4[var8] = arg0;
            int var9 = var8 + 1;
            arg4[var9] = arg0;
            int var10 = var9 + 1;
            arg4[var10] = arg0;
            int var11 = var10 + 1;
            arg4[var11] = arg0;
            int var12 = var11 + 1;
            arg4[var12] = arg0;
            int var13 = var12 + 1;
            arg4[var13] = arg0;
            arg3 = var13 + 1;
            arg4[arg3] = arg0;
        }
        while (var6 > arg3) {
            arg3++;
            arg4[arg3] = arg0;
        }
        field1118++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZIZI)V", line = 97)
    public static final void method546(boolean arg0, int arg1, boolean arg2, int arg3) {
        int var10002;
        for (int var4 = 0; var4 < class233.field3736; var4++) {
            class234 var5 = class99.field1445[class142.field2225[var4]];
            if (var5 != null && var5.method1695(29082) && var5.field3752.method1830(-114)) {
                int var6 = var5.method1881(-20395);
                if (arg0) {
                    if (!var5.field3752.field4102) {
                        continue;
                    }
                } else if (var5.field3752.field4126 != arg2 || arg1 != 0 && arg1 != var6) {
                    continue;
                }
                if (var6 == 1) {
                    if ((var5.field4255 & 0x7F) == 64 && (var5.field4264 & 0x7F) == 64) {
                        int var13 = var5.field4255 >> 7;
                        int var14 = var5.field4264 >> 7;
                        if (var13 >= 0 && var13 < 104 && var14 >= 0 && var14 < 104) {
                            var10002 = class277.field4466[var13][var14]++;
                        }
                    }
                } else if (((var6 & 0x1) != 0 || (var5.field4255 & 0x7F) == 0 && (var5.field4264 & 0x7F) == 0) && ((var6 & 0x1) != 1 || (var5.field4255 & 0x7F) == 64 && (var5.field4264 & 0x7F) == 64)) {
                    int var7 = var5.field4264 - var6 * 64 >> 7;
                    int var8 = var5.field4255 - (var6 * 64) >> 7;
                    int var9 = var8 + var5.method1881(-20395);
                    int var10 = var5.method1881(-20395) + var7;
                    if (var9 > 104) {
                        var9 = 104;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    if (var10 > 104) {
                        var10 = 104;
                    }
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    for (int var11 = var8; var11 < var9; var11++) {
                        for (int var12 = var7; var12 < var10; var12++) {
                            var10002 = class277.field4466[var11][var12]++;
                        }
                    }
                }
            }
        }
        field1121++;
        label216: for (int var15 = 0; var15 < class233.field3736; var15++) {
            class234 var16 = class99.field1445[class142.field2225[var15]];
            long var17 = (long) class142.field2225[var15] << 32 | 0x20000000L;
            if (var16 != null && var16.method1695(29082) && var16.field3752.method1830(-112)) {
                int var19 = var16.method1881(-20395);
                if (arg0) {
                    if (!var16.field3752.field4102) {
                        continue;
                    }
                } else if (arg2 != var16.field3752.field4126 || arg1 != 0 && arg1 != var19) {
                    continue;
                }
                var16.field4229 = true;
                if (var19 == 1) {
                    if ((var16.field4255 & 0x7F) == 64 && (var16.field4264 & 0x7F) == 64) {
                        int var29 = var16.field4255 >> 7;
                        int var30 = var16.field4264 >> 7;
                        if (var29 < 0 || var29 >= 104 || var30 < 0 || var30 >= 104) {
                            continue;
                        }
                        if (class277.field4466[var29][var30] > 1) {
                            var10002 = class277.field4466[var29][var30]--;
                            continue;
                        }
                    }
                } else if ((var19 & 0x1) == 0 && (var16.field4255 & 0x7F) == 0 && (var16.field4264 & 0x7F) == 0 || (var19 & 0x1) == 1 && (var16.field4255 & 0x7F) == 64 && (var16.field4264 & 0x7F) == 64) {
                    int var20 = var16.field4255 - (var19 * 64) >> 7;
                    int var21 = var16.field4264 - (var19 * 64) >> 7;
                    int var22 = var20 + var19;
                    if (var22 > 104) {
                        var22 = 104;
                    }
                    if (var20 < 0) {
                        var20 = 0;
                    }
                    boolean var23 = true;
                    int var24 = var19 + var21;
                    if (var24 > 104) {
                        var24 = 104;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var25 = var20; var25 < var22; var25++) {
                        for (int var26 = var21; var26 < var24; var26++) {
                            if (class277.field4466[var25][var26] <= 1) {
                                var23 = false;
                                break;
                            }
                        }
                    }
                    if (var23) {
                        int var27 = var20;
                        while (true) {
                            if (var27 >= var22) {
                                continue label216;
                            }
                            for (int var28 = var21; var28 < var24; var28++) {
                                var10002 = class277.field4466[var27][var28]--;
                            }
                            var27++;
                        }
                    }
                }
                var16.field4229 = false;
                if (!var16.field3752.field4073) {
                    var17 |= Long.MIN_VALUE;
                }
                var16.field4219 = class123.method889(1, class49.field698, var16.field4255, var16.field4264);
                class67.method448(class49.field698, var16.field4255, var16.field4264, var16.field4219, var19 * 64 + 60 - 64, var16, var16.field4196, var17, var16.field4247);
            }
        }
        int var31 = -14 / ((arg3 + 18) / 39);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Lo;", line = 337)
    public static final class285 method547(int arg0, int arg1) {
        field1120++;
        if (arg0 <= 67) {
            method543(-127L, (byte) 101);
        }
        if (arg1 == 0) {
            return new class311();
        } else if (arg1 == 1) {
            return new class189();
        } else if (arg1 == 2) {
            return new class73();
        } else if (arg1 == 3) {
            return new class197();
        } else if (arg1 == 4) {
            return new class236();
        } else if (arg1 == 5) {
            return new class11();
        } else if (arg1 == 6) {
            return new class209();
        } else if (arg1 == 7) {
            return new class213();
        } else if (arg1 == 8) {
            return new class83();
        } else if (arg1 == 9) {
            return new class120();
        } else if (arg1 == 10) {
            return new class246();
        } else if (arg1 == 11) {
            return new class307();
        } else if (arg1 == 12) {
            return new class341();
        } else if (arg1 == 13) {
            return new class13();
        } else if (arg1 == 14) {
            return new class282();
        } else if (arg1 == 15) {
            return new class98();
        } else if (arg1 == 16) {
            return new class141();
        } else if (arg1 == 17) {
            return new class224();
        } else if (arg1 == 18) {
            return new class295();
        } else if (arg1 == 19) {
            return new class66();
        } else if (arg1 == 20) {
            return new class64();
        } else if (arg1 == 21) {
            return new class318();
        } else if (arg1 == 22) {
            return new class199();
        } else if (arg1 == 23) {
            return new class321();
        } else if (arg1 == 24) {
            return new class274();
        } else if (arg1 == 25) {
            return new class310();
        } else if (arg1 == 26) {
            return new class222();
        } else if (arg1 == 27) {
            return new class284();
        } else if (arg1 == 28) {
            return new class74();
        } else if (arg1 == 29) {
            return new class53();
        } else if (arg1 == 30) {
            return new class88();
        } else if (arg1 == 31) {
            return new class26();
        } else if (arg1 == 32) {
            return new class177();
        } else if (arg1 == 33) {
            return new class227();
        } else if (arg1 == 34) {
            return new class288();
        } else if (arg1 == 35) {
            return new class93();
        } else if (arg1 == 36) {
            return new class214();
        } else if (arg1 == 37) {
            return new class57();
        } else if (arg1 == 38) {
            return new class243();
        } else if (arg1 == 39) {
            return new class139();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIII)V", line = 659)
    public static final void method548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class336.field5249 <= arg7 && arg5 <= class191.field3131 && class98.field1410 <= arg2 && class279.field4497 >= arg6) {
            class331.method2320(arg3, arg4, -9509, arg2, arg1, arg7, arg6, arg5);
        } else {
            class256.method1829(arg4, arg5, arg7, arg6, arg3, 107, arg1, arg2);
        }
        field1116++;
        if (arg0 <= 46) {
            method543(27L, (byte) -96);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lrf;I)V", line = 681)
    public static final void method549(class263 arg0, int arg1) {
        if (class240.field3818 == arg0.field4252 || arg0.field4268 == -1 || arg0.field4190 != 0 || (arg0.field4201 + 1) > class325.method2274(arg0.field4268, -78).field3290[arg0.field4265]) {
            int var2 = arg0.field4252 - arg0.field4200;
            int var3 = class240.field3818 - arg0.field4200;
            int var4 = arg0.field4242 * 128 + (arg0.method1881(-20395) * 64);
            int var5 = arg0.field4224 * 128 + (arg0.method1881(arg1 - 20523) * 64);
            int var6 = arg0.field4261 * 128 + arg0.method1881(-20395) * 64;
            int var7 = arg0.field4181 * 128 + (arg0.method1881(-20395) * 64);
            arg0.field4264 = ((var2 - var3) * var5 + var3 * var7) / var2;
            arg0.field4255 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        arg0.field4239 = 0;
        if (arg1 != 128) {
            return;
        }
        field1119++;
        if (arg0.field4210 == 0) {
            arg0.field4277 = 1024;
        }
        if (arg0.field4210 == 1) {
            arg0.field4277 = 1536;
        }
        if (arg0.field4210 == 2) {
            arg0.field4277 = 0;
        }
        if (arg0.field4210 == 3) {
            arg0.field4277 = 512;
        }
        arg0.field4196 = arg0.field4277;
    }
}
