import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class70 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Lkc;")
    private static class67 field1656 = class19.method144("wishes to duel with you)3", 75);

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static volatile int field1661 = 0;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Lkc;")
    public static class67 field1668 = field1656;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Lkc;")
    public static class67 field1671 = class19.method144("Ihre Nachricht an: ", 118);

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Lkc;")
    public static class67 field1669 = class19.method144(")1", 96);

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Lkc;")
    public static class67 field1672 = class19.method144("Regelversto-8 melden", 93);

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field1667 = 1;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "[[B")
    public static byte[][] field1673 = new byte[50][];

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Z")
    public static boolean field1674 = false;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Lgd;")
    public static class44 field1663 = new class44(64);

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Lkc;")
    public static class67 field1676 = class19.method144("l", 97);

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Lre;")
    public static class111 field1666;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Lab;")
    public static class3 field1657;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IILsa;IIIZIILad;)V", line = 3)
    public static final void method574(int arg0, int arg1, class113 arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, class5 arg9) {
        field1665++;
        int var10 = class34.field823[arg5][arg8][arg3];
        int var11 = class34.field823[arg5][arg8 + 1][arg3];
        int var12 = class34.field823[arg5][arg8][arg3 + 1];
        int var13 = class34.field823[arg5][arg8 + 1][arg3 + 1];
        if (arg6) {
            method575(-124, 90, 25, 102);
        }
        int var14 = (arg7 << 14) + arg8 + (arg3 << 7) + 1073741824;
        class106 var15 = class2.method12(arg7, 21876);
        if (var15.field2389 == 0) {
            var14 += Integer.MIN_VALUE;
        }
        int var16 = (arg0 << 6) + arg1;
        int var17 = var12 + var13 + var11 + var10 >> 2;
        if (var15.field2408 == 1) {
            var16 += 256;
        }
        if (arg1 == 22) {
            class24 var18;
            if (var15.field2385 == -1 && var15.field2433 == null) {
                var18 = var15.method813(true, var13, arg0, var11, var10, 22, var12);
            } else {
                var18 = new class134(arg7, 22, arg0, var10, var11, var13, var12, var15.field2385, true, null);
            }
            arg2.method875(arg4, arg8, arg3, var17, var18, var14, var16);
            if (var15.field2390 && var15.field2389 == 1) {
                arg9.method61(arg8, arg3, (byte) -98);
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class24 var38;
            if (var15.field2385 == -1 && var15.field2433 == null) {
                var38 = var15.method813(true, var13, arg0, var11, var10, 10, var12);
            } else {
                var38 = new class134(arg7, 10, arg0, var10, var11, var13, var12, var15.field2385, true, null);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg1 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg0 == 1 || arg0 == 3) {
                    var41 = var15.field2369;
                    var40 = var15.field2432;
                } else {
                    var40 = var15.field2369;
                    var41 = var15.field2432;
                }
                arg2.method900(arg4, arg8, arg3, var17, var41, var40, var38, var39, var14, var16);
            }
            if (var15.field2390) {
                arg9.method60(var15.field2369, (byte) -45, arg0, var15.field2429, var15.field2432, arg8, arg3);
            }
        } else if (arg1 >= 12) {
            class24 var19;
            if (var15.field2385 == -1 && var15.field2433 == null) {
                var19 = var15.method813(!arg6, var13, arg0, var11, var10, arg1, var12);
            } else {
                var19 = new class134(arg7, arg1, arg0, var10, var11, var13, var12, var15.field2385, true, null);
            }
            arg2.method900(arg4, arg8, arg3, var17, 1, 1, var19, 0, var14, var16);
            if (var15.field2390) {
                arg9.method60(var15.field2369, (byte) -103, arg0, var15.field2429, var15.field2432, arg8, arg3);
            }
        } else if (arg1 == 0) {
            class24 var20;
            if (var15.field2385 == -1 && var15.field2433 == null) {
                var20 = var15.method813(true, var13, arg0, var11, var10, 0, var12);
            } else {
                var20 = new class134(arg7, 0, arg0, var10, var11, var13, var12, var15.field2385, true, null);
            }
            arg2.method861(arg4, arg8, arg3, var17, var20, null, class106.field2372[arg0], 0, var14, var16);
            if (var15.field2390) {
                arg9.method50(var15.field2429, 123, arg8, arg1, arg3, arg0);
            }
        } else if (arg1 == 1) {
            class24 var21;
            if (var15.field2385 == -1 && var15.field2433 == null) {
                var21 = var15.method813(true, var13, arg0, var11, var10, 1, var12);
            } else {
                var21 = new class134(arg7, 1, arg0, var10, var11, var13, var12, var15.field2385, true, null);
            }
            arg2.method861(arg4, arg8, arg3, var17, var21, null, class117.field2783[arg0], 0, var14, var16);
            if (var15.field2390) {
                arg9.method50(var15.field2429, 106, arg8, arg1, arg3, arg0);
            }
        } else if (arg1 == 2) {
            int var22 = arg0 + 1 & 0x3;
            class24 var23;
            class24 var24;
            if (var15.field2385 == -1 && var15.field2433 == null) {
                var23 = var15.method813(!arg6, var13, arg0 + 4, var11, var10, 2, var12);
                var24 = var15.method813(true, var13, var22, var11, var10, 2, var12);
            } else {
                var23 = new class134(arg7, 2, arg0 + 4, var10, var11, var13, var12, var15.field2385, true, null);
                var24 = new class134(arg7, 2, var22, var10, var11, var13, var12, var15.field2385, true, null);
            }
            arg2.method861(arg4, arg8, arg3, var17, var23, var24, class106.field2372[arg0], class106.field2372[var22], var14, var16);
            if (var15.field2390) {
                arg9.method50(var15.field2429, 31, arg8, arg1, arg3, arg0);
            }
        } else if (arg1 == 3) {
            class24 var25;
            if (var15.field2385 == -1 && var15.field2433 == null) {
                var25 = var15.method813(true, var13, arg0, var11, var10, 3, var12);
            } else {
                var25 = new class134(arg7, 3, arg0, var10, var11, var13, var12, var15.field2385, true, null);
            }
            arg2.method861(arg4, arg8, arg3, var17, var25, null, class117.field2783[arg0], 0, var14, var16);
            if (var15.field2390) {
                arg9.method50(var15.field2429, 34, arg8, arg1, arg3, arg0);
            }
        } else if (arg1 == 9) {
            class24 var26;
            if (var15.field2385 == -1 && var15.field2433 == null) {
                var26 = var15.method813(true, var13, arg0, var11, var10, arg1, var12);
            } else {
                var26 = new class134(arg7, arg1, arg0, var10, var11, var13, var12, var15.field2385, true, null);
            }
            arg2.method900(arg4, arg8, arg3, var17, 1, 1, var26, 0, var14, var16);
            if (var15.field2390) {
                arg9.method60(var15.field2369, (byte) -70, arg0, var15.field2429, var15.field2432, arg8, arg3);
            }
        } else {
            if (var15.field2424) {
                if (arg0 == 1) {
                    int var27 = var12;
                    var12 = var13;
                    var13 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg0 == 2) {
                    int var28 = var12;
                    var12 = var11;
                    var11 = var28;
                    int var29 = var13;
                    var13 = var10;
                    var10 = var29;
                } else if (arg0 == 3) {
                    int var30 = var12;
                    var12 = var10;
                    var10 = var11;
                    var11 = var13;
                    var13 = var30;
                }
            }
            if (arg1 == 4) {
                class24 var31;
                if (var15.field2385 == -1 && var15.field2433 == null) {
                    var31 = var15.method813(!arg6, var13, 0, var11, var10, 4, var12);
                } else {
                    var31 = new class134(arg7, 4, 0, var10, var11, var13, var12, var15.field2385, true, null);
                }
                arg2.method870(arg4, arg8, arg3, var17, var31, class106.field2372[arg0], arg0 * 512, 0, 0, var14, var16);
            } else if (arg1 == 5) {
                int var32 = 16;
                int var33 = arg2.method879(arg4, arg8, arg3);
                if (var33 > 0) {
                    var32 = class2.method12(var33 >> 14 & 0x7FFF, 21876).field2387;
                }
                class24 var34;
                if (var15.field2385 == -1 && var15.field2433 == null) {
                    var34 = var15.method813(true, var13, 0, var11, var10, 4, var12);
                } else {
                    var34 = new class134(arg7, 4, 0, var10, var11, var13, var12, var15.field2385, true, null);
                }
                arg2.method870(arg4, arg8, arg3, var17, var34, class106.field2372[arg0], arg0 * 512, class48.field1162[arg0] * var32, class112.field2559[arg0] * var32, var14, var16);
            } else if (arg1 == 6) {
                class24 var35;
                if (var15.field2385 == -1 && var15.field2433 == null) {
                    var35 = var15.method813(true, var13, 0, var11, var10, 4, var12);
                } else {
                    var35 = new class134(arg7, 4, 0, var10, var11, var13, var12, var15.field2385, true, null);
                }
                arg2.method870(arg4, arg8, arg3, var17, var35, 256, arg0, 0, 0, var14, var16);
            } else if (arg1 == 7) {
                class24 var36;
                if (var15.field2385 == -1 && var15.field2433 == null) {
                    var36 = var15.method813(true, var13, 0, var11, var10, 4, var12);
                } else {
                    var36 = new class134(arg7, 4, 0, var10, var11, var13, var12, var15.field2385, true, null);
                }
                arg2.method870(arg4, arg8, arg3, var17, var36, 512, arg0, 0, 0, var14, var16);
            } else if (arg1 == 8) {
                class24 var37;
                if (var15.field2385 == -1 && var15.field2433 == null) {
                    var37 = var15.method813(true, var13, 0, var11, var10, 4, var12);
                } else {
                    var37 = new class134(arg7, 4, 0, var10, var11, var13, var12, var15.field2385, true, null);
                }
                arg2.method870(arg4, arg8, arg3, var17, var37, 768, arg0, 0, 0, var14, var16);
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)I", line = 342)
    public static final int method575(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 >> 7;
        field1670++;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2 & 0x7F;
        int var7 = arg3;
        if (arg3 < 3 && (class21.field443[1][var4][var5] & 0x2) == 2) {
            var7 = arg3 + 1;
        }
        int var8 = arg0 & 0x7F;
        int var9 = (128 - var6) * class34.field823[var7][var4][var5] + class34.field823[var7][var4 + 1][var5] * var6 >> 7;
        int var10 = (128 - var6) * class34.field823[var7][var4][var5 - -1] + class34.field823[var7][arg1 + var4][var5 + 1] * var6 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Ls;", line = 386)
    public static final class112 method576(int arg0, int arg1) {
        if (arg0 != 12) {
            return null;
        }
        field1662++;
        class112 var2 = (class112) field1663.method373((byte) 116, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class55.field1344.method27(arg1, true, 12);
        class112 var4 = new class112();
        if (var3 != null) {
            var4.method855(new class140(var3), -92);
        }
        var4.method846((byte) -87);
        field1663.method374(0, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 429)
    public static void method577(int arg0) {
        field1657 = null;
        field1673 = null;
        field1663 = null;
        field1656 = null;
        field1666 = null;
        field1668 = null;
        field1671 = null;
        field1669 = null;
        if (arg0 != 0) {
            field1676 = null;
        }
        field1672 = null;
        field1676 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lac;Lac;ILac;)V", line = 453)
    public static final void method578(class4 arg0, class4 arg1, int arg2, class4 arg3) {
        if (arg2 == 768) {
            field1658++;
            class109.field2513 = arg0;
            class55.field1344 = arg1;
            class83.field1968 = arg3;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 474)
    public static final void method579(int arg0) {
        field1659++;
        if (class55.field1323 < 2 && class25.field535 == 0 && !field1674) {
            return;
        }
        class67 var1;
        if (class25.field535 == 1 && class55.field1323 < 2) {
            var1 = class63.method479(new class67[] { class34.field832, class108.field2447, class96.field2168, class91.field2106 }, 0);
        } else if (field1674 && class55.field1323 < 2) {
            var1 = class63.method479(new class67[] { class69.field1652, class108.field2447, class90.field2068, class91.field2106 }, 0);
        } else {
            var1 = class109.field2471[class55.field1323 - 1];
        }
        if (arg0 < class55.field1323) {
            var1 = class63.method479(new class67[] { var1, class125.field2914, class71.method586(arg0 ^ 0x65, class55.field1323 - 2), class94.field2148 }, 0);
        }
        class117.field2789.method226(var1, 4, 15, 16777215, true, class135.field3243 / 1000);
    }
}
