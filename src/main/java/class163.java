import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class163 {

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Leg;")
    public static class188 field2515 = new class188(260);

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "[I")
    public static int[] field2520 = new int[100];

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "[I")
    public static int[] field2521 = new int[] { 8, 0, 0, 0, 10, 0, 12, 15, 0, 1, 12, 6, 0, 0, 0, 0, -2, 8, 4, 3, 0, 0, 0, 0, 7, 0, 0, 0, 8, 14, -1, -2, 0, 0, 7, 0, 0, 0, 5, 0, 0, 0, -1, 0, -2, 0, 3, 7, -2, 0, 0, 0, 2, 4, 5, 0, 0, 15, 0, 6, 0, 12, 0, 0, -2, 8, -1, 0, 0, 0, 6, 6, 2, 0, 0, 0, 0, 0, 9, 0, 0, 0, 2, 0, 3, 0, 6, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 11, 0, 17, 0, 0, 0, 0, 8, 0, 3, 0, 0, 8, 4, 2, 0, 0, 0, 10, 0, 0, -2, 28, 0, 1, -1, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, -2, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 2, 0, 5, 6, -2, 0, -1, 0, 0, 6, -1, 0, 0, 0, 3, 0, 0, 0, -2, 0, 0, 6, 0, 0, -2, 2, 0, 0, 0, 20, 0, 3, 0, 3, 0, -1, 0, -2, 1, 0, -1, 0, 0, 0, -1, -1, 0, 1, 0, 0, 0, 0, 2, 0, 0, 6, 8, 0, 0, 0, 0, 0, 1, 0, 12, 0, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 7, 0, 2, 3, 0, 0, 0, 14, 0, 10, 10, 0, -2, -2, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "[[[I")
    public static int[][][] field2519;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLgn;Ljava/lang/String;)I", line = 17)
    public static final int method1113(byte arg0, class303 arg1, String arg2) {
        if (arg0 != -5) {
            field2515 = (class188) null;
        }
        int var3 = arg1.field4679;
        field2513++;
        byte[] var4 = class24.method180(true, arg2);
        arg1.method2049(arg0 + 99, var4.length);
        arg1.field4679 += class235.field3784.method2324((byte) -64, arg1.field4679, var4.length, arg1.field4716, 0, var4);
        return arg1.field4679 - var3;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)Loj;", line = 34)
    public static final class23 method1114(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1375[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class23 var4 = var3.field2667;
            var3.field2667 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V", line = 46)
    public static void method1115(boolean arg0) {
        field2519 = (int[][][]) null;
        field2515 = null;
        field2520 = null;
        field2521 = null;
        if (!arg0) {
            method1116(-9);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 61)
    public static final void method1116(int arg0) {
        field2512++;
        if (arg0 != -16366) {
            method1114(-88, -20, 85);
        }
        if (!class148.method1042((byte) 54) && class77.field1154 != class230.field3720) {
            class227.method1556(false, class240.field3815, arg0 ^ 0x3546, false, class79.field1173.field505[0], class77.field1154, class79.field1173.field476[0], class144.field2288);
        } else if (class77.field1154 != class34.field445 && class226.method1544(class77.field1154, arg0 ^ 0x4A31)) {
            class34.field445 = class77.field1154;
            class143.method1004(-75);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZZIB)V", line = 85)
    public static final void method1117(boolean arg0, boolean arg1, int arg2, byte arg3) {
        if (arg3 >= -40) {
            method1119(-122, 41, 1, -119);
        }
        field2517++;
        int var10002;
        for (int var4 = 0; var4 < class155.field2439; var4++) {
            class80 var5 = class208.field3313[class144.field2286[var4]];
            if (var5 != null && var5.method281(0) && var5.field1178.method1954(6849)) {
                int var6 = var5.method271((byte) 69);
                if (arg1) {
                    if (!var5.field1178.field4570) {
                        continue;
                    }
                } else if (arg0 != var5.field1178.field4564 || arg2 != 0 && arg2 != var6) {
                    continue;
                }
                if (var6 == 1) {
                    if ((var5.field537 & 0x7F) == 64 && (var5.field519 & 0x7F) == 64) {
                        int var13 = var5.field537 >> 7;
                        int var14 = var5.field519 >> 7;
                        if (var13 >= 0 && var13 < 104 && var14 >= 0 && var14 < 104) {
                            var10002 = class200.field3011[var13][var14]++;
                        }
                    }
                } else if (((var6 & 0x1) != 0 || (var5.field537 & 0x7F) == 0 && (var5.field519 & 0x7F) == 0) && ((var6 & 0x1) != 1 || (var5.field537 & 0x7F) == 64 && (var5.field519 & 0x7F) == 64)) {
                    int var7 = var5.field537 - var6 * 64 >> 7;
                    int var8 = var5.field519 - var6 * 64 >> 7;
                    int var9 = var7 + var5.method271((byte) 87);
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    if (var9 > 104) {
                        var9 = 104;
                    }
                    int var10 = var5.method271((byte) 116) + var8;
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    if (var10 > 104) {
                        var10 = 104;
                    }
                    for (int var11 = var7; var11 < var9; var11++) {
                        for (int var12 = var8; var12 < var10; var12++) {
                            var10002 = class200.field3011[var11][var12]++;
                        }
                    }
                }
            }
        }
        label217: for (int var15 = 0; var15 < class155.field2439; var15++) {
            class80 var16 = class208.field3313[class144.field2286[var15]];
            long var17 = (long) class144.field2286[var15] << 32 | 0x20000000L;
            if (var16 != null && var16.method281(0) && var16.field1178.method1954(6849)) {
                int var19 = var16.method271((byte) 66);
                if (arg1) {
                    if (!var16.field1178.field4570) {
                        continue;
                    }
                } else if (arg0 != var16.field1178.field4564 || arg2 != 0 && arg2 != var19) {
                    continue;
                }
                var16.field563 = true;
                if (var19 == 1) {
                    if ((var16.field537 & 0x7F) == 64 && (var16.field519 & 0x7F) == 64) {
                        int var20 = var16.field537 >> 7;
                        int var21 = var16.field519 >> 7;
                        if (var20 < 0 || var20 >= 104 || var21 < 0 || var21 >= 104) {
                            continue;
                        }
                        if (class200.field3011[var20][var21] > 1) {
                            var10002 = class200.field3011[var20][var21]--;
                            continue;
                        }
                    }
                } else if ((var19 & 0x1) == 0 && (var16.field537 & 0x7F) == 0 && (var16.field519 & 0x7F) == 0 || (var19 & 0x1) == 1 && (var16.field537 & 0x7F) == 64 && (var16.field519 & 0x7F) == 64) {
                    int var22 = var16.field537 - (var19 * 64) >> 7;
                    int var23 = var16.field519 - (var19 * 64) >> 7;
                    int var24 = var19 + var22;
                    if (var24 > 104) {
                        var24 = 104;
                    }
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    int var25 = var19 + var23;
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    if (var25 > 104) {
                        var25 = 104;
                    }
                    boolean var26 = true;
                    for (int var27 = var22; var27 < var24; var27++) {
                        for (int var28 = var23; var28 < var25; var28++) {
                            if (class200.field3011[var27][var28] <= 1) {
                                var26 = false;
                                break;
                            }
                        }
                    }
                    if (var26) {
                        int var29 = var22;
                        while (true) {
                            if (var29 >= var24) {
                                continue label217;
                            }
                            for (int var30 = var23; var30 < var25; var30++) {
                                var10002 = class200.field3011[var29][var30]--;
                            }
                            var29++;
                        }
                    }
                }
                var16.field563 = false;
                if (!var16.field1178.field4583) {
                    var17 |= Long.MIN_VALUE;
                }
                var16.field493 = class39.method286(class77.field1154, (byte) 82, var16.field537, var16.field519);
                class226.method1543(class77.field1154, var16.field537, var16.field519, var16.field493, (var19 - 1) * 64 + 60, var16, var16.field564, var17, var16.field542);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZLbk;I)V", line = 334)
    public static final void method1118(boolean arg0, class180 arg1, int arg2) {
        if (class333.field5166 || arg0) {
            int var3 = class174.field2644;
            int var4 = var3 * 956 / 503;
            class208.field3317.method919((class334.field5203 - var4) / 2, 0, var4, var3);
            class59.field839.method159(class334.field5203 / 2 - class59.field839.field1166 / 2, 18);
        }
        arg1.method1245(class259.field4028, class334.field5203 / 2, class174.field2644 / 2 - 26, 16777215, -1);
        int var5 = class174.field2644 / 2 - 18;
        field2516++;
        if (arg2 != 34) {
            field2521 = (int[]) null;
        }
        if (class333.field5166) {
            class238.method1621(class334.field5203 / 2 - 152, var5, 304, 34, 9179409);
            class238.method1621(class334.field5203 / 2 - 151, var5 + 1, 302, 32, 0);
            class238.method1636(class334.field5203 / 2 - 150, var5 - -2, class187.field2841 * 3, 30, 9179409);
            class238.method1636(class334.field5203 / 2 + (class187.field2841 * 3) - 150, var5 - -2, 300 - (class187.field2841 * 3), 30, 0);
        } else {
            class57.method388(class334.field5203 / 2 - 152, var5, 304, 34, 9179409);
            class57.method388(class334.field5203 / 2 - 151, var5 + 1, 302, 32, 0);
            class57.method375(class334.field5203 / 2 - 150, var5 - -2, class187.field2841 * 3, 30, 9179409);
            class57.method375(class334.field5203 / 2 + (class187.field2841 * 3) - 150, var5 - -2, 300 - (class187.field2841 * 3), 30, 0);
        }
        arg1.method1245(class71.field1058, class334.field5203 / 2, class174.field2644 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)I", line = 377)
    public static final int method1119(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field2514++;
        if (var4 == 0) {
            return arg0;
        } else if (arg1 == var4) {
            return arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return 1023 - arg2;
        }
    }
}
