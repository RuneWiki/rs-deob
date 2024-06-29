import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class496 {

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "Ljia;")
    public static class645 field6786 = new class645();

    @OriginalMember(owner = "client!vaa", name = "g", descriptor = "Lvl;")
    public static class15 field6791 = new class15(79, -1);

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!vaa", name = "h", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "Lgj;")
    public static class662 field6788;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILdg;IIIII)Z", line = 3)
    public static final boolean method2843(int arg0, class435 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6789++;
        if (!class378.field5160 || !class633.field8766) {
            return false;
        } else if (class22.field461 < arg4) {
            return false;
        } else if (arg3 != arg6 || arg0 != arg5) {
            for (int var7 = arg3; var7 <= arg6; var7++) {
                for (int var8 = arg0; var8 <= arg5; var8++) {
                    if (class168.field2704[arg2][var7][var8] == (-class497.field6804)) {
                        return false;
                    }
                }
            }
            if (class112.method1016(arg1, (byte) -19)) {
                class608.field8485++;
                return true;
            } else {
                return false;
            }
        } else if (!class757.method4186(arg2, (byte) -49, arg3, arg0)) {
            return false;
        } else if (class112.method1016(arg1, (byte) -19)) {
            class608.field8485++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZIIB)Lji;", line = 62)
    public static final class637 method2844(int arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field6785++;
        class637 var5 = new class637();
        var5.field8790 = arg2;
        var5.field8789 = arg0;
        class186.field2881.method341((long) arg3, var5, (byte) 43);
        class16.method94(arg0, true);
        class17 var6 = class379.method2309(arg3, 192);
        if (var6 != null) {
            class410.method2433(var6, 14049);
        }
        if (class652.field9033 != null) {
            class410.method2433(class652.field9033, 14049);
            class652.field9033 = null;
        }
        class405.method2424(true);
        if (var6 != null) {
            class358.method2206(var6, arg4 - 80, !arg1);
        }
        if (!arg1) {
            class76.method656(arg0);
        }
        if (arg4 != 118) {
            field6786 = null;
        }
        if (!arg1 && class359.field4911 != -1) {
            class478.method2739(1, false, class359.field4911);
        }
        return var5;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Ljava/lang/String;[BIIII)I", line = 101)
    public static final int method2845(String arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field6790++;
        if (arg4 != 31) {
            return -113;
        }
        int var6 = arg2 - arg5;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg0.charAt(arg5 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg3 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg3 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg3 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg3 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg3 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg3 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg3 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg3 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg3 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg3 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg3 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg3 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg3 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg3 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg3 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg3 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg3 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg3 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg3 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg3 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg3 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg3 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg3 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg3 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg3 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg3 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg3 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg3 + var7] = -97;
            } else {
                arg1[arg3 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIZII)V", line = 239)
    public static final void method2846(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field6792++;
        class281 var5 = class54.method395((byte) -53, (long) arg1 | (long) arg4 << 32, 18);
        var5.method1821((byte) -124);
        var5.field3901 = arg0;
        if (!arg2) {
            field6791 = null;
        }
        var5.field3910 = arg3;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V", line = 254)
    public static void method2847(int arg0) {
        field6791 = null;
        field6786 = null;
        field6788 = null;
        if (arg0 != -733) {
            field6786 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)V", line = 278)
    public static final void method2848(int arg0) {
        if (!class611.field8532) {
            class11.field181 = class610.field8521 != -1 && class690.field9574 >= class610.field8521 || class690.field9574 * 16 + (class608.field8486 ? 26 : 22) > class108.field1697;
        }
        field6787++;
        class656.field9089.method3590((byte) -128);
        class528.field7167.method3590((byte) -126);
        for (class534 var1 = (class534) class208.field3119.method3589((byte) -128); var1 != null; var1 = (class534) class208.field3119.method3591(0)) {
            int var38 = var1.field7229;
            if (var38 < 1000) {
                var1.method1207(103);
                if (var38 == 20 || var38 == 49 || var38 == 45 || var38 == 13 || var38 == 17 || var38 == 9 || var38 == 2) {
                    class528.field7167.method3594((byte) 118, var1);
                } else {
                    class656.field9089.method3594((byte) -84, var1);
                }
            }
        }
        class656.field9089.method3596(-43, class208.field3119);
        class528.field7167.method3596(arg0 ^ 0xFFFFC0F5, class208.field3119);
        if (arg0 != -16227) {
            field6786 = null;
        }
        if (class690.field9574 > 1) {
            if (class318.field4334 && class789.field10821.method1531(arg0 ^ 0xFFFFC0E6, 81) && class690.field9574 > 2) {
                class603.field8440 = (class534) class208.field3119.field8920.field2527.field2527;
            } else {
                class603.field8440 = (class534) class208.field3119.field8920.field2527;
            }
            class27.field516 = (class534) class208.field3119.field8920.field2527;
        } else {
            class603.field8440 = null;
            class27.field516 = null;
        }
        int var2 = -1;
        class556 var3 = (class556) class373.field5070.method3589((byte) -127);
        if (var3 != null) {
            var2 = var3.method2733(0);
        }
        if (!class611.field8532) {
            if (var2 == 0 && (class302.field4147 == 1 && class690.field9574 > 2 || class423.method2501(1001))) {
                var2 = 2;
            }
            if (var2 == 2 && class690.field9574 > 0 && var3 != null) {
                if (class84.field1157 == null && class462.field6287 == 0) {
                    class568.method3282(16, var3.method2731(125), var3.method2734(false));
                } else {
                    class586.field8293 = 2;
                }
            }
            if (var2 == 0) {
                if (class603.field8440 != null) {
                    class128.method1094(125);
                } else if (class675.field9384) {
                    class200.method1443(false);
                }
            }
            if (class84.field1157 == null && class462.field6287 == 0) {
                class586.field8293 = 0;
                class354.field4748 = null;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class420.field5727.method1326((byte) -8);
            int var5 = class420.field5727.method1319((byte) 126);
            boolean var6 = false;
            if (class426.field5815 != null) {
                if (class396.field5471 - 10 <= var4 && var4 <= class396.field5471 - (-class119.field2183 - 10) && var5 >= class429.field5856 - 10 && var5 <= (class429.field5856 + class424.field5808 + 10)) {
                    var6 = true;
                } else {
                    class597.method3398((byte) -101);
                }
            }
            if (!var6) {
                if (var4 < (class480.field6479 - 10) || var4 > class480.field6479 + class326.field4452 + 10 || var5 < class207.field3113 - 10 || class776.field10712 + class207.field3113 + 10 < var5) {
                    class388.method2360(true);
                } else if (class11.field181) {
                    int var7 = -1;
                    int var8 = -1;
                    for (int var9 = 0; var9 < class430.field5861; var9++) {
                        if (class608.field8486) {
                            int var10 = var9 * 16 + class207.field3113 + 33;
                            if ((var10 - 13) < var5 && var5 < (var10 + 4)) {
                                var8 = var10 - 13;
                                var7 = var9;
                                break;
                            }
                        } else {
                            int var11 = class207.field3113 + (var9 * 16) + 31;
                            if (var11 - 13 < var5 && (var11 + 3) > var5) {
                                var8 = var11 - 13;
                                var7 = var9;
                                break;
                            }
                        }
                    }
                    if (var7 != -1) {
                        int var12 = 0;
                        class127 var13 = new class127(class142.field2405);
                        for (class606 var14 = (class606) var13.method1088(0); var14 != null; var14 = (class606) var13.method1086(34379)) {
                            if (var7 == var12) {
                                if (var14.field8457 > 1) {
                                    class309.method1974(var5, var14, false, var8);
                                }
                                break;
                            }
                            var12++;
                        }
                    }
                }
            }
        }
        if (var2 != 0) {
            return;
        }
        int var15 = var3.method2731(125);
        int var16 = var3.method2734(false);
        if (class426.field5815 != null && var15 >= class396.field5471 && var15 <= (class396.field5471 + class119.field2183) && var16 >= class429.field5856 && var16 <= class429.field5856 + class424.field5808) {
            int var17 = -1;
            for (int var18 = 0; var18 < class426.field5815.field8457; var18++) {
                if (class608.field8486) {
                    int var23 = var18 * 16 + class429.field5856 + 33;
                    if (var16 > var23 - 13 && var16 < var23 + 4) {
                        var17 = var18;
                    }
                } else {
                    int var22 = var18 * 16 + class429.field5856 + 31;
                    if ((var22 - 13) < var16 && (var22 + 3) > var16) {
                        var17 = var18;
                    }
                }
            }
            if (var17 != -1) {
                int var19 = 0;
                class127 var20 = new class127(class426.field5815.field8460);
                for (class534 var21 = (class534) var20.method1088(0); var21 != null; var21 = (class534) var20.method1086(34379)) {
                    if (var17 == var19) {
                        class63.method436(var21, var15, 91, var16);
                        break;
                    }
                    var19++;
                }
            }
            class388.method2360(true);
            return;
        }
        if (var15 < class480.field6479 || class480.field6479 + class326.field4452 < var15 || class207.field3113 > var16 || var16 > class776.field10712 + class207.field3113) {
            return;
        }
        if (!class11.field181) {
            int var24 = -1;
            for (int var25 = 0; var25 < class690.field9574; var25++) {
                if (class608.field8486) {
                    int var30 = class207.field3113 - (-((class690.field9574 - (var25 + 1)) * 16) - 33);
                    if (var30 - 13 < var16 && var30 + 4 > var16) {
                        var24 = var25;
                    }
                } else {
                    int var29 = (class690.field9574 - var25 - 1) * 16 + class207.field3113 + 31;
                    if (var16 > (var29 - 13) && var29 + 3 > var16) {
                        var24 = var25;
                    }
                }
            }
            if (var24 != -1) {
                int var26 = 0;
                class359 var27 = new class359(class208.field3119);
                for (class534 var28 = (class534) var27.method2210((byte) 61); var28 != null; var28 = (class534) var27.method2212(-60)) {
                    if (var24 == var26) {
                        class63.method436(var28, var15, 116, var16);
                        break;
                    }
                    var26++;
                }
            }
            class388.method2360(true);
            return;
        }
        int var31 = -1;
        for (int var32 = 0; var32 < class430.field5861; var32++) {
            if (class608.field8486) {
                int var34 = class207.field3113 + (var32 * 16) + 33;
                if (var16 > var34 - 13 && var16 < var34 + 4) {
                    var31 = var32;
                    break;
                }
            } else {
                int var33 = var32 * 16 + class207.field3113 + 31;
                if (var16 > (var33 - 13) && var33 + 3 > var16) {
                    var31 = var32;
                    break;
                }
            }
        }
        if (var31 == -1) {
            return;
        }
        int var35 = 0;
        class127 var36 = new class127(class142.field2405);
        for (class606 var37 = (class606) var36.method1088(0); var37 != null; var37 = (class606) var36.method1086(34379)) {
            if (var31 == var35) {
                class63.method436((class534) var37.field8460.field4189.field7006, var15, -74, var16);
                class388.method2360(true);
                return;
            }
            var35++;
        }
        return;
    }
}
