import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class106 {

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Lie;")
    private class86 field1620 = new class86();

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "Ld;")
    private class142 field1633 = new class142();

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    private int field1629;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    private int field1630;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "Lhj;")
    private class29 field1635;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Z")
    public static boolean field1621 = false;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Lta;")
    public static class197 field1623 = new class197(2);

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "Z")
    public static boolean field1634 = false;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([II)[I", line = 8)
    public static final int[] method815(int[] arg0, int arg1) {
        field1618++;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class151.method1115(arg0, 0, var2, 0, arg0.length);
            return arg1 == -1786 ? var2 : (int[]) null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(JB)Lie;", line = 28)
    public final class86 method816(long arg0, byte arg1) {
        field1631++;
        class86 var4 = (class86) this.field1635.method203(1710, arg0);
        if (var4 != null) {
            this.field1633.method1076(var4, (byte) -50);
        }
        if (arg1 != 73) {
            method824(39);
        }
        return var4;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lie;JB)V", line = 51)
    public final void method817(class86 arg0, long arg1, byte arg2) {
        field1619++;
        if (this.field1629 == 0) {
            class86 var5 = this.field1633.method1070(true);
            var5.method1554((byte) -65);
            var5.method713((byte) 46);
            if (this.field1620 == var5) {
                class86 var6 = this.field1633.method1070(true);
                var6.method1554((byte) -38);
                var6.method713((byte) 56);
            }
        } else {
            this.field1629--;
        }
        if (arg2 > -94) {
            field1621 = true;
        }
        this.field1635.method208(arg0, arg1, 0);
        this.field1633.method1076(arg0, (byte) -42);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 89)
    public static final void method818(int arg0) {
        field1628++;
        if (class66.field976 != null || class152.field2290 != null) {
            return;
        }
        int var1 = 0 % ((72 - arg0) / 34);
        int var2 = class292.field4593;
        if (!class67.field982) {
            if (var2 == 1 && class6.field62 > 0) {
                short var3 = class326.field5068[class6.field62 - 1];
                if (var3 == 13 || var3 == 57 || var3 == 15 || var3 == 26 || var3 == 10 || var3 == 36 || var3 == 37 || var3 == 8 || var3 == 45 || var3 == 29 || var3 == 48 || var3 == 1007) {
                    int var4 = class207.field3264[class6.field62 - 1];
                    int var5 = class281.field4347[class6.field62 - 1];
                    class184 var6 = class100.method781((byte) 48, var5);
                    class276 var7 = client.method1764(var6);
                    if (var7.method1942(-107) || var7.method1941(0)) {
                        class196.field3108 = false;
                        class72.field1041 = 0;
                        if (class66.field976 != null) {
                            class133.method1007(class66.field976, 104);
                        }
                        class66.field976 = class100.method781((byte) 48, var5);
                        class203.field3220 = class38.field573;
                        class263.field3932 = class97.field1446;
                        class51.field784 = var4;
                        class133.method1007(class66.field976, 119);
                        return;
                    }
                }
            }
            if (var2 == 1 && (class328.field5084 == 1 && class6.field62 > 2 || class190.method1372(class6.field62 - 1, (byte) 110))) {
                var2 = 2;
            }
            if (var2 == 2 && class6.field62 > 0 || class278.field4265 == 1) {
                class266.method1845(126);
            }
            if (var2 == 1 && class6.field62 > 0 || class278.field4265 == 2) {
                class29.method201((byte) -119);
            }
            return;
        }
        if (var2 != 1) {
            int var8 = class273.field4129;
            int var9 = class295.field4646;
            if ((class253.field3776 - 10) > var8 || var8 > (class327.field5074 + class253.field3776 + 10) || class143.field2208 - 10 > var9 || var9 > class62.field936 + class143.field2208 + 10) {
                class67.field982 = false;
                class141.method1064(class327.field5074, class253.field3776, class143.field2208, class62.field936, (byte) 105);
            }
        }
        if (var2 != 1) {
            return;
        }
        int var10 = class253.field3776;
        int var11 = class143.field2208;
        int var12 = class97.field1446;
        int var13 = class327.field5074;
        int var14 = class38.field573;
        int var15 = -1;
        for (int var16 = 0; var16 < class6.field62; var16++) {
            int var17;
            if (class285.field4395) {
                var17 = var11 - (-((class6.field62 - var16 - 1) * 15) - 35);
            } else {
                var17 = (class6.field62 - var16 - 1) * 15 + var11 + 31;
            }
            if (var10 < var12 && var12 < var10 + var13 && (var17 - 13) < var14 && var14 < (var17 + 3)) {
                var15 = var16;
            }
        }
        if (var15 != -1) {
            class183.method1324(true, var15);
        }
        class67.field982 = false;
        class141.method1064(class327.field5074, class253.field3776, class143.field2208, class62.field936, (byte) 105);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)Lwj;", line = 220)
    public final class217 method819(int arg0) {
        field1632++;
        if (arg0 != 0) {
            this.method816(-50L, (byte) -71);
        }
        return this.field1635.method200(0);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lgd;III)V", line = 236)
    public static final void method820(class310 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class39.field589) {
            class99 var4 = class250.field3746[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1472 != null && var4.field1472.field2560.method386()) {
                arg0.method400(var4.field1472.field2560, 128, 0, 0, true);
            }
        }
        if (arg3 < class39.field589) {
            class99 var5 = class250.field3746[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1472 != null && var5.field1472.field2560.method386()) {
                arg0.method400(var5.field1472.field2560, 0, 0, 128, true);
            }
        }
        if (arg2 < class39.field589 && arg3 < class210.field3312) {
            class99 var6 = class250.field3746[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1472 != null && var6.field1472.field2560.method386()) {
                arg0.method400(var6.field1472.field2560, 128, 0, 128, true);
            }
        }
        if (arg2 < class39.field589 && arg3 > 0) {
            class99 var7 = class250.field3746[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1472 != null && var7.field1472.field2560.method386()) {
                arg0.method400(var7.field1472.field2560, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([BI)Z", line = 285)
    public static final boolean method821(byte[] arg0, int arg1) {
        field1627++;
        if (arg1 != -5) {
            method820((class310) null, 7, 98, -46);
        }
        class35 var2 = new class35(arg0);
        int var3 = var2.method273(65280);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method273(65280) == 1;
        if (var4) {
            class324.method2224((byte) -106, var2);
        }
        class238.method1658((byte) -41, var2);
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([BIII[Lal;IBZ)V", line = 311)
    public static final void method822(byte[] arg0, int arg1, int arg2, int arg3, class323[] arg4, int arg5, byte arg6, boolean arg7) {
        field1624++;
        byte var8;
        if (arg7) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg7) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg2 + var10 > 0 && arg2 + var10 < 103 && (arg5 + var11) > 0 && arg5 + var11 < 103) {
                            arg4[var9].field5037[arg2 + var10][arg5 + var11] = class142.method1078(arg4[var9].field5037[arg2 + var10][arg5 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class35 var12 = new class35(arg0);
        for (int var13 = 0; var13 < var8; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class128.method975(arg5 + var15, arg7, var12, arg1, arg3, var13, arg6 ^ 0x1, 0, arg2 + var14);
                }
            }
        }
        if (arg6 != 0) {
            method823((byte) 24);
        }
        boolean var16 = false;
        while (var12.field455 < var12.field437.length) {
            int var17 = var12.method273(65280);
            if (var17 != 129) {
                var12.field455--;
                break;
            }
            for (int var18 = 0; var18 < 4; var18++) {
                byte var19 = var12.method242((byte) -93);
                if (var19 == 0) {
                    int var20 = arg2;
                    if (arg2 < 0) {
                        var20 = 0;
                    } else if (arg2 >= 104) {
                        var20 = 104;
                    }
                    int var21 = arg2 + 64;
                    int var22 = arg5 + 64;
                    int var23 = arg5;
                    if (arg5 < 0) {
                        var23 = 0;
                    } else if (arg5 >= 104) {
                        var23 = 104;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    } else if (var21 >= 104) {
                        var21 = 104;
                    }
                    if (var22 < 0) {
                        var22 = 0;
                    } else if (var22 >= 104) {
                        var22 = 104;
                    }
                    while (var21 > var20) {
                        while (var23 < var22) {
                            class323.field5039[var18][var20][var23] = 0;
                            var23++;
                        }
                        var20++;
                    }
                } else if (var19 == 1) {
                    for (int var24 = 0; var24 < 64; var24 += 4) {
                        for (int var25 = 0; var25 < 64; var25 += 4) {
                            byte var26 = var12.method242((byte) -93);
                            for (int var27 = arg2 + var24; var27 < (var24 + arg2 + 4); var27++) {
                                for (int var28 = arg5 + var25; var28 < (arg5 + var25 + 4); var28++) {
                                    if (var27 >= 0 && var27 < 104 && var28 >= 0 && var28 < 104) {
                                        class323.field5039[var18][var27][var28] = var26;
                                    }
                                }
                            }
                        }
                    }
                } else if (var19 == 2 && var18 > 0) {
                    int var29 = arg2;
                    if (arg2 < 0) {
                        var29 = 0;
                    } else if (arg2 >= 104) {
                        var29 = 104;
                    }
                    int var30 = arg2 + 64;
                    if (var30 < 0) {
                        var30 = 0;
                    } else if (var30 >= 104) {
                        var30 = 104;
                    }
                    int var31 = arg5;
                    if (arg5 < 0) {
                        var31 = 0;
                    } else if (arg5 >= 104) {
                        var31 = 104;
                    }
                    int var32 = arg5 + 64;
                    if (var32 < 0) {
                        var32 = 0;
                    } else if (var32 >= 104) {
                        var32 = 104;
                    }
                    while (var30 > var29) {
                        while (var32 > var31) {
                            class323.field5039[var18][var29][var31] = class323.field5039[var18 - 1][var29][var31];
                            var31++;
                        }
                        var29++;
                    }
                }
            }
            var16 = true;
        }
        if (class36.field534 && !arg7) {
            class174 var33 = null;
            while (true) {
                while (var12.field437.length > var12.field455) {
                    int var34 = var12.method273(65280);
                    if (var34 == 0) {
                        var33 = new class174(var12);
                    } else if (var34 == 1) {
                        int var35 = var12.method273(arg6 + 65280);
                        if (var35 > 0) {
                            for (int var36 = 0; var36 < var35; var36++) {
                                class318 var37 = new class318(var12);
                                if (var37.field4948 == 31) {
                                    class138 var38 = class115.method900(var12.method300(-1394191632), true);
                                    var37.method2178(var38.field2148, var38.field2156, var38.field2150, var38.field2152, (byte) 109);
                                }
                                var37.field4931 += arg2 << 7;
                                int var39 = var37.field4931 >> 7;
                                var37.field4952 += arg5 << 7;
                                int var40 = var37.field4952 >> 7;
                                if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                                    var37.field4936 = (class208.field3272[1][var39][var40] & 0x2) != 0;
                                    var37.field4935 = class41.field612[var37.field4937][var39][var40] - var37.field4935;
                                    class286.method2015(var37);
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var33 == null) {
                    var33 = new class174();
                }
                for (int var41 = 0; var41 < 8; var41++) {
                    for (int var42 = 0; var42 < 8; var42++) {
                        int var43 = (arg5 >> 3) + var42;
                        int var44 = (arg2 >> 3) + var41;
                        if (var44 >= 0 && var44 < 13 && var43 >= 0 && var43 < 13) {
                            class170.field2537[var44][var43] = var33;
                        }
                    }
                }
                break;
            }
        }
        if (var16) {
            return;
        }
        for (int var45 = 0; var45 < 4; var45++) {
            for (int var46 = 0; var46 < 16; var46++) {
                for (int var47 = 0; var47 < 16; var47++) {
                    int var48 = (arg2 >> 2) + var46;
                    int var49 = (arg5 >> 2) + var47;
                    if (var48 >= 0 && var48 < 26 && var49 >= 0 && var49 < 26) {
                        class323.field5039[var45][var48][var49] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 703)
    public static void method823(byte arg0) {
        field1623 = null;
        if (arg0 != -47) {
            method820((class310) null, -60, 11, 0);
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V", line = 713)
    public static final void method824(int arg0) {
        if (arg0 != -105) {
            return;
        }
        class76.field1072 = null;
        class21.field229 = null;
        class260.field3857 = null;
        class305.field4776 = null;
        class323.field5028 = null;
        field1622++;
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V", line = 728)
    public final void method825(int arg0) {
        field1625++;
        this.field1633.method1074(arg0);
        this.field1635.method207(1186224976);
        this.field1620 = new class86();
        this.field1629 = this.field1630;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I)V", line = 773)
    public class106(int arg0) {
        this.field1629 = arg0;
        this.field1630 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1635 = new class29(var2);
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)Lwj;", line = 747)
    public final class217 method826(int arg0) {
        field1626++;
        if (arg0 != 0) {
            this.field1620 = (class86) null;
        }
        return this.field1635.method202((byte) -115);
    }
}
