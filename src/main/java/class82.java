import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class82 extends class64 {

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "[B")
    public byte[] field1501;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "Z")
    public static boolean field1504 = false;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    public static int field1500 = 0;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "Lid;")
    public static class149 field1503 = class60.method382("Votre liste noire est pleine (X100 noms maximum(Y)3", (byte) 116);

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "Leg;")
    public static class225 field1508;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "[Lid;")
    public static class149[] field1498;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "[[B")
    public static byte[][] field1502;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)I")
    public static final int method609(int arg0, int arg1, int arg2) {
        field1507++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg0 != -24637) {
            return 82;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method610(int arg0) {
        field1502 = null;
        field1498 = null;
        field1503 = null;
        field1508 = null;
        if (arg0 <= 29) {
            field1508 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "([B)V")
    public class82(byte[] arg0) {
        this.field1501 = arg0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIII)V")
    public static final void method611(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 8) {
            field1502 = null;
        }
        if (arg1 > arg0) {
            for (int var5 = arg0; var5 < arg1; var5++) {
                class15.field220[var5][arg3] = arg4;
            }
        } else {
            for (int var6 = arg1; var6 < arg0; var6++) {
                class15.field220[var6][arg3] = arg4;
            }
        }
        field1497++;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIII[BI[Lke;IIZI)V")
    public static final void method612(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, class108[] arg6, int arg7, int arg8, boolean arg9, int arg10) {
        if (arg8 <= 30) {
            method614(18);
        }
        field1496++;
        byte var11;
        if (arg9) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg9) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if (arg0 + var12 > 0 && (arg0 + var12) < 103 && (arg2 + var13) > 0 && arg2 + var13 < 103) {
                        arg6[arg3].field1856[arg0 + var12][arg2 + var13] = class136.method953(arg6[arg3].field1856[arg0 + var12][arg2 + var13], -16777217);
                    }
                }
            }
        }
        class74 var14 = new class74(arg4);
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var35 = 0; var35 < 64; var35++) {
                for (int var36 = 0; var36 < 64; var36++) {
                    if (arg7 == var15 && var35 >= arg10 && var35 < (arg10 + 8) && arg1 <= var36 && var36 < (arg1 + 8)) {
                        class110.method773(false, var14, class200.method1372(arg5, var36 & 0x7, (byte) -88, var35 & 0x7) + arg2, arg5, arg3, class276.method1909(arg5, 2, var36 & 0x7, var35 & 0x7) + arg0, 0, arg9, 0);
                    } else {
                        class110.method773(false, var14, -1, 0, 0, -1, 0, arg9, 0);
                    }
                }
            }
        }
        while (var14.field1340 < var14.field1321.length) {
            int var16 = var14.method489((byte) 86);
            if (var16 != 129) {
                var14.field1340--;
                break;
            }
            for (int var22 = 0; var22 < 4; var22++) {
                byte var23 = var14.method514((byte) 1);
                if (var23 == 0) {
                    if (arg7 >= var22) {
                        int var24 = arg0;
                        if (arg0 < 0) {
                            var24 = 0;
                        } else if (arg0 >= 104) {
                            var24 = 104;
                        }
                        int var25 = arg0 + 7;
                        int var26 = arg2;
                        if (arg2 < 0) {
                            var26 = 0;
                        } else if (arg2 >= 104) {
                            var26 = 104;
                        }
                        int var27 = arg2 + 7;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 >= 104) {
                            var27 = 104;
                        }
                        if (var25 < 0) {
                            var25 = 0;
                        } else if (var25 >= 104) {
                            var25 = 104;
                        }
                        while (var24 < var25) {
                            while (var26 < var27) {
                                class60.field1080[arg3][var24][var26] = 0;
                                var26++;
                            }
                            var24++;
                        }
                    }
                } else if (var23 == 1) {
                    for (int var28 = 0; var28 < 64; var28 += 4) {
                        for (int var29 = 0; var29 < 64; var29 += 4) {
                            byte var30 = var14.method514((byte) 1);
                            if (arg7 >= var22) {
                                for (int var31 = var28; var31 < var28 + 4; var31++) {
                                    for (int var32 = var29; var32 < (var29 + 4); var32++) {
                                        if (var31 >= arg10 && var31 < (arg10 + 8) && arg1 <= var32 && arg1 < (arg1 + 8)) {
                                            int var33 = arg0 + class276.method1909(arg5, 2, var32 & 0x7, var31 & 0x7);
                                            int var34 = class200.method1372(arg5, var32 & 0x7, (byte) -88, var31 & 0x7) + arg2;
                                            if (var33 >= 0 && var33 < 104 && var34 >= 0 && var34 < 104) {
                                                class60.field1080[arg3][var33][var34] = var30;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var17 = false;
        if (var17) {
            return;
        }
        int var18 = arg0 + 7;
        int var19 = arg2 + 7;
        for (int var20 = arg0; var20 < var18; var20++) {
            for (int var21 = arg2; var21 < var19; var21++) {
                class60.field1080[arg3][var20][var21] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
    public static final void method613(int arg0) {
        int var1 = 44 / ((7 - arg0) / 35);
        field1506++;
        class76.method571();
        for (int var2 = 0; var2 < 4; var2++) {
            class228.field3989[var2].method753(20);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
    public static final void method614(int arg0) {
        class197.field3585 = null;
        class13.field166 = null;
        if (arg0 != 8428) {
            method609(22, -16, 113);
        }
        class5.field66 = null;
        class288.field5147 = null;
        class84.field1538 = null;
        field1505++;
        class35.field501 = null;
        class154.field2830 = null;
        class256.field4480 = null;
        class108.field1883 = null;
        class107.field1846 = null;
        class97.field1716 = null;
    }
}
