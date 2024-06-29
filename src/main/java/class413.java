import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class413 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Lio;")
    public static class300 field6075;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILtn;I)V", line = 10)
    public static final void method2546(int arg0, int arg1, class58 arg2, int arg3) {
        if (arg2.field916 == 0) {
            arg2.field845 = arg2.field886;
        } else if (arg2.field916 == 1) {
            arg2.field845 = (arg1 - arg2.field925) / 2 + arg2.field886;
        } else if (arg2.field916 == 2) {
            arg2.field845 = arg1 - arg2.field925 - arg2.field886;
        } else if (arg2.field916 == 3) {
            arg2.field845 = arg2.field886 * arg1 >> 14;
        } else if (arg2.field916 == 4) {
            arg2.field845 = (arg1 - arg2.field925) / 2 + (arg2.field886 * arg1 >> 14);
        } else {
            arg2.field845 = arg1 - arg2.field925 - (arg2.field886 * arg1 >> 14);
        }
        if (arg2.field933 == 0) {
            arg2.field899 = arg2.field846;
        } else if (arg2.field933 == 1) {
            arg2.field899 = (arg3 - arg2.field896) / 2 + arg2.field846;
        } else if (arg2.field933 == 2) {
            arg2.field899 = arg3 - arg2.field896 - arg2.field846;
        } else if (arg2.field933 == 3) {
            arg2.field899 = arg2.field846 * arg3 >> 14;
        } else if (arg2.field933 == 4) {
            arg2.field899 = (arg3 - arg2.field896) / 2 + (arg2.field846 * arg3 >> 14);
        } else {
            arg2.field899 = arg3 - arg2.field896 - (arg2.field846 * arg3 >> 14);
        }
        field6074++;
        if (arg0 < 30) {
            field6075 = null;
        }
        if (!class38.field578) {
            return;
        }
        if (client.method1349(arg2).field1626 == 0 && arg2.field843 != 0) {
            return;
        }
        if (arg2.field845 < 0) {
            arg2.field845 = 0;
        } else if (arg1 < (arg2.field845 + arg2.field925)) {
            arg2.field845 = arg1 - arg2.field925;
        }
        if (arg2.field899 < 0) {
            arg2.field899 = 0;
            return;
        }
        if (arg3 < (arg2.field899 + arg2.field896)) {
            arg2.field899 = arg3 - arg2.field896;
            return;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLdb;ILda;Lqa;Lvb;II)V", line = 83)
    public static final void method2547(boolean arg0, class210 arg1, int arg2, class42 arg3, class162 arg4, class130 arg5, int arg6, int arg7) {
        field6076++;
        if (arg0) {
            field6075 = null;
        }
        int var8 = arg3.field645 - (arg2 / 2) - 5;
        int var9 = arg7 + 2;
        if (arg1.field3053 != 0) {
            arg4.method1175(arg2 + 10, 8, var8, arg1.field3053, (arg7 + arg5.method960() * arg6 - var9) + 1, var9);
        }
        if (arg1.field3024 != 0) {
            arg4.method1176(arg7 + (arg5.method960() * arg6 - var9) + 1, var8, 1, arg2 + 10, arg1.field3024, var9);
        }
        int var10 = arg1.field3020;
        if (arg3.field638 && arg1.field3029 != -1) {
            var10 = arg1.field3029;
        }
        for (int var11 = 0; var11 < arg6; var11++) {
            String var12 = class283.field4111[var11];
            if (arg6 - 1 > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg5.method958(arg4, var12, arg3.field645, arg7, var10, true);
            arg7 += arg5.method960();
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 129)
    public static void method2548(int arg0) {
        field6075 = null;
        if (arg0 != 4) {
            method2546(45, 69, null, -114);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILhh;)V", line = 143)
    public static final void method2549(int arg0, class84 arg1) {
        class397.field5832 = arg1;
        if (arg0 < 117) {
            method2549(18, null);
        }
        field6077++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z[[[Lkf;IIZI)Z", line = 154)
    public static final boolean method2550(boolean arg0, class165[][][] arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0) {
            field6075 = null;
        }
        field6073++;
        byte var6 = arg4 ? 1 : (byte) (class454.field6731 & 0xFF);
        if (class275.field3993[class434.field6317][arg3][arg2] == var6) {
            return false;
        } else if ((class364.field5475[class434.field6317][arg3][arg2] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class394.field5822[var7] = arg3;
            int var35 = var7 + 1;
            class203.field2938[var7] = arg2;
            class275.field3993[class434.field6317][arg3][arg2] = var6;
            while (var35 != var8) {
                int var9 = class394.field5822[var8] & 0xFFFF;
                int var10 = class394.field5822[var8] >> 16 & 0xFF;
                int var11 = class394.field5822[var8] >> 24 & 0xFF;
                int var12 = class203.field2938[var8] & 0xFFFF;
                int var13 = class203.field2938[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class364.field5475[class434.field6317][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class434.field6317 + 1; var16 <= 3; var16++) {
                    if ((class364.field5475[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg1[var16][var9][var12] != null) {
                            if (arg1[var16][var9][var12].field2480 != null) {
                                int var20 = class319.method2002(var10, 2);
                                if (arg1[var16][var9][var12].field2480.field7701 == var20 || arg1[var16][var9][var12].field2484 != null && arg1[var16][var9][var12].field2484.field7701 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class319.method2002(var11, 2);
                                    if (arg1[var16][var9][var12].field2480.field7701 == var21 || arg1[var16][var9][var12].field2484 != null && arg1[var16][var9][var12].field2484.field7701 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class319.method2002(var13, 2);
                                    if (arg1[var16][var9][var12].field2480.field7701 == var22 || arg1[var16][var9][var12].field2484 != null && arg1[var16][var9][var12].field2484.field7701 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class165 var23 = arg1[var16][var9][var12];
                            if (var23.field2490 != null) {
                                for (class525 var24 = var23.field2490; var24 != null; var24 = var24.field7716) {
                                    class370 var25 = var24.field7711;
                                    if (var25 instanceof class232) {
                                        class232 var26 = (class232) var25;
                                        int var27 = var26.method380(true);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method375(-13015);
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class165 var30 = arg1[var16][var9][var12];
                        if (var30 != null && var30.field2490 != null) {
                            for (class525 var31 = var30.field2490; var31 != null; var31 = var31.field7716) {
                                class370 var32 = var31.field7711;
                                if (var32.field5542 != var32.field5532 || var32.field5540 != var32.field5535) {
                                    for (int var33 = var32.field5532; var33 <= var32.field5542; var33++) {
                                        for (int var34 = var32.field5535; var34 <= var32.field5540; var34++) {
                                            class275.field3993[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class275.field3993[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class529.field7807[class434.field6317 + 1].method271(var9, var12);
                    if (var17 > class490.field7156[arg5]) {
                        class490.field7156[arg5] = var17;
                    }
                    int var18 = var9 << 7;
                    if (var18 < class354.field5355[arg5]) {
                        class354.field5355[arg5] = var18;
                    } else if (var18 > class366.field5496[arg5]) {
                        class366.field5496[arg5] = var18;
                    }
                    int var19 = var12 << 7;
                    if (var19 < class348.field5281[arg5]) {
                        class348.field5281[arg5] = var19;
                    } else if (var19 > class25.field437[arg5]) {
                        class25.field437[arg5] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class275.field3993[class434.field6317][var9 - 1][var12] != var6) {
                        class394.field5822[var35] = class29.method239(-754974720, class29.method239(1179648, var9 - 1));
                        class203.field2938[var35] = class29.method239(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class275.field3993[class434.field6317][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (class83.field1366 > var12) {
                        if ((var9 - 1) >= 0 && class275.field3993[class434.field6317][var9 - 1][var12] != var6 && (class364.field5475[class434.field6317][var9][var12] & 0x4) == 0 && (class364.field5475[class434.field6317][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class394.field5822[var35] = class29.method239(1375731712, class29.method239(var9 - 1, 1179648));
                            class203.field2938[var35] = class29.method239(var12, 1245184);
                            var35 = var35 + 1 & 0xFFF;
                            class275.field3993[class434.field6317][var9 - 1][var12] = var6;
                        }
                        if (class275.field3993[class434.field6317][var9][var12] != var6) {
                            class394.field5822[var35] = class29.method239(class29.method239(var9, 5373952), 318767104);
                            class203.field2938[var35] = class29.method239(5439488, var12);
                            class275.field3993[class434.field6317][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < class237.field3436 && class275.field3993[class434.field6317][var9 + 1][var12] != var6 && (class364.field5475[class434.field6317][var9][var12] & 0x4) == 0 && (class364.field5475[class434.field6317][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class394.field5822[var35] = class29.method239(-1845493760, class29.method239(5373952, var9 + 1));
                            class203.field2938[var35] = class29.method239(var12, 5439488);
                            class275.field3993[class434.field6317][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (var9 + 1 < class237.field3436 && class275.field3993[class434.field6317][var9 + 1][var12] != var6) {
                        class394.field5822[var35] = class29.method239(1392508928, class29.method239(9568256, var9 + 1));
                        class203.field2938[var35] = class29.method239(var12, 9633792);
                        class275.field3993[class434.field6317][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class275.field3993[class434.field6317][var9 - 1][var12] != var6 && (class364.field5475[class434.field6317][var9][var12] & 0x4) == 0 && (class364.field5475[class434.field6317][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class394.field5822[var35] = class29.method239(class29.method239(13762560, var9 - 1), 301989888);
                            class203.field2938[var35] = class29.method239(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class275.field3993[class434.field6317][var9 - 1][var12] = var6;
                        }
                        if (class275.field3993[class434.field6317][var9][var12] != var6) {
                            class394.field5822[var35] = class29.method239(-1828716544, class29.method239(13762560, var9));
                            class203.field2938[var35] = class29.method239(13828096, var12);
                            class275.field3993[class434.field6317][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < class237.field3436 && class275.field3993[class434.field6317][var9 + 1][var12] != var6 && (class364.field5475[class434.field6317][var9][var12] & 0x4) == 0 && (class364.field5475[class434.field6317][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class394.field5822[var35] = class29.method239(-771751936, class29.method239(var9 + 1, 9568256));
                            class203.field2938[var35] = class29.method239(var12, 9633792);
                            var35 = var35 + 1 & 0xFFF;
                            class275.field3993[class434.field6317][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class490.field7156[arg5] != -1000000) {
                class490.field7156[arg5] += 10;
                class354.field5355[arg5] -= 50;
                class366.field5496[arg5] += 50;
                class25.field437[arg5] += 50;
                class348.field5281[arg5] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLtn;)V", line = 479)
    public static final void method2551(byte arg0, class58 arg1) {
        field6072++;
        if (arg0 != -123) {
            method2547(true, null, -62, null, null, null, -50, 26);
        }
        if (class359.field5427 != arg1.field892) {
            return;
        }
        if (class95.field1558.field1094 == null) {
            arg1.field966 = 0;
            arg1.field894 = 0;
            return;
        }
        arg1.field990 = 150;
        arg1.field872 = (int) (Math.sin((double) class180.field2734 / 40.0D) * 256.0D) & 0x7FF;
        arg1.field945 = 5;
        arg1.field966 = class64.field1128;
        arg1.field894 = class16.method148(class95.field1558.field1094, 0);
        arg1.field944 = 0;
        arg1.field901 = class95.field1558.field371;
        arg1.field866 = class95.field1558.field389;
        arg1.field909 = class95.field1558.field373;
    }

    @OriginalMember(owner = "client!ia", name = "na", descriptor = "(I)V")
    public abstract void method994(int arg0);

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public abstract void method996(int arg0);

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "(III[I)V")
    public abstract void method993(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ia", name = "ZA", descriptor = "(III)V")
    public abstract void method1004(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ia", name = "YA", descriptor = "(I)V")
    public abstract void method999(int arg0);

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "(I)V")
    public abstract void method1007(int arg0);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()Lia;")
    public abstract class413 method1002();

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "(IIIIII)V")
    public abstract void method1000(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III[I)V")
    public abstract void method997(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ia", name = "ma", descriptor = "(I)V")
    public abstract void method998(int arg0);

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "(III)V")
    public abstract void method1008(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ia", name = "ba", descriptor = "(Lia;)V")
    public abstract void method995(class413 arg0);

    @OriginalMember(owner = "client!ia", name = "HA", descriptor = "()V")
    public abstract void method1003();

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "([I)V")
    public abstract void method1005(int[] arg0);
}
