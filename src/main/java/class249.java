import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class249 implements class61 {

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Lkf;")
    private class193 field3961 = new class193(256);

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Lfa;")
    private class273 field3968;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Lfa;")
    private class273 field3959;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "[La;")
    private class49[] field3969;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field3967 = 0;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field3964 = 0;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lec;")
    public static class25 field3960 = new class25(64);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Lde;")
    public static class116 field3970;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)Z")
    public final boolean method377(int arg0, boolean arg1) {
        if (!arg1) {
            field3962 = -89;
        }
        field3966++;
        class117 var3 = this.method1737((byte) -87, arg0);
        return var3 != null && var3.method758(1, this.field3968, this);
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(II)V")
    public static final void method1734(int arg0, int arg1) {
        class237.field3752 = 3;
        class203.field3279 = arg0;
        field3965++;
        class273.field4482 = 100;
        if (arg1 >= -61) {
            method1734(99, 119);
        }
        class208.field3326 = -1;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BIII[[[Lab;Z)Z")
    public static final boolean method1735(byte arg0, int arg1, int arg2, int arg3, class154[][][] arg4, boolean arg5) {
        if (arg0 > -47) {
            field3970 = null;
        }
        field3957++;
        byte var6 = arg5 ? 1 : (byte) (class80.field1274 & 0xFF);
        if (class219.field3506[class165.field2600][arg1][arg3] == var6) {
            return false;
        } else if ((class128.field1972[class165.field2600][arg1][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class11.field140[var7] = arg1;
            int var31 = var7 + 1;
            class171.field2652[var7] = arg3;
            int var8 = 0;
            class219.field3506[class165.field2600][arg1][arg3] = var6;
            while (var31 != var8) {
                int var9 = class11.field140[var8] >> 24 & 0xFF;
                int var10 = class171.field2652[var8] & 0xFFFF;
                int var11 = class11.field140[var8] & 0xFFFF;
                boolean var12 = false;
                if ((class128.field1972[class165.field2600][var11][var10] & 0x4) == 0) {
                    var12 = true;
                }
                int var13 = class11.field140[var8] >> 16 & 0xFF;
                int var14 = class171.field2652[var8] >> 16 & 0xFF;
                boolean var15 = false;
                label229: for (int var16 = class165.field2600 + 1; var16 <= 3; var16++) {
                    if ((class128.field1972[var16][var11][var10] & 0x8) == 0) {
                        if (var12 && arg4[var16][var11][var10] != null) {
                            if (arg4[var16][var11][var10].field2411 != null) {
                                int var19 = class8.method45(var13, -15361);
                                if (arg4[var16][var11][var10].field2411.field2632 == var19 || arg4[var16][var11][var10].field2411.field2633 == var19) {
                                    continue;
                                }
                                if (var9 != 0) {
                                    int var20 = class8.method45(var9, -15361);
                                    if (arg4[var16][var11][var10].field2411.field2632 == var20 || arg4[var16][var11][var10].field2411.field2633 == var20) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var21 = class8.method45(var14, -15361);
                                    if (arg4[var16][var11][var10].field2411.field2632 == var21 || arg4[var16][var11][var10].field2411.field2633 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var16][var11][var10].field2418 != null) {
                                for (int var22 = 0; var22 < arg4[var16][var11][var10].field2431; var22++) {
                                    int var23 = (int) (arg4[var16][var11][var10].field2418[var22].field1712 >> 20 & 0x3L);
                                    int var24 = (int) (arg4[var16][var11][var10].field2418[var22].field1712 >> 14 & 0x3FL);
                                    if (var24 == 21) {
                                        var24 = 19;
                                    }
                                    int var25 = var23 << 6 | var24;
                                    if (var13 == var25 || var9 != 0 && var9 == var25 || var14 != 0 && var14 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class154 var26 = arg4[var16][var11][var10];
                        if (var26 != null && var26.field2431 > 0) {
                            for (int var27 = 0; var27 < var26.field2431; var27++) {
                                class114 var28 = var26.field2418[var27];
                                if (var28.field1724 != var28.field1715 || var28.field1719 != var28.field1714) {
                                    for (int var29 = var28.field1724; var29 <= var28.field1715; var29++) {
                                        for (int var30 = var28.field1719; var30 <= var28.field1714; var30++) {
                                            class219.field3506[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class219.field3506[var16][var11][var10] = var6;
                    }
                }
                var8 = var8 + 1 & 0xFFF;
                if (var15) {
                    if (class248.field3942[arg2] < class242.field3842[class165.field2600 + 1][var11][var10]) {
                        class248.field3942[arg2] = class242.field3842[class165.field2600 + 1][var11][var10];
                    }
                    int var17 = var10 << 7;
                    int var18 = var11 << 7;
                    if (class216.field3446[arg2] > var18) {
                        class216.field3446[arg2] = var18;
                    } else if (class93.field1417[arg2] < var18) {
                        class93.field1417[arg2] = var18;
                    }
                    if (class218.field3479[arg2] > var17) {
                        class218.field3479[arg2] = var17;
                    } else if (var17 > class157.field2501[arg2]) {
                        class157.field2501[arg2] = var17;
                    }
                }
                if (!var12) {
                    if (var11 >= 1 && class219.field3506[class165.field2600][var11 - 1][var10] != var6) {
                        class11.field140[var31] = class82.method554(class82.method554(var11 - 1, 1179648), -754974720);
                        class171.field2652[var31] = class82.method554(1245184, var10);
                        var31 = var31 + 1 & 0xFFF;
                        class219.field3506[class165.field2600][var11 - 1][var10] = var6;
                    }
                    var10++;
                    if (var10 < 104) {
                        if ((var11 - 1) >= 0 && class219.field3506[class165.field2600][var11 - 1][var10] != var6 && (class128.field1972[class165.field2600][var11][var10] & 0x4) == 0 && (class128.field1972[class165.field2600][var11 - 1][var10 - 1] & 0x4) == 0) {
                            class11.field140[var31] = class82.method554(1375731712, class82.method554(var11 - 1, 1179648));
                            class171.field2652[var31] = class82.method554(1245184, var10);
                            class219.field3506[class165.field2600][var11 - 1][var10] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class219.field3506[class165.field2600][var11][var10] != var6) {
                            class11.field140[var31] = class82.method554(class82.method554(5373952, var11), 318767104);
                            class171.field2652[var31] = class82.method554(5439488, var10);
                            class219.field3506[class165.field2600][var11][var10] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var11 + 1) < 104 && class219.field3506[class165.field2600][var11 + 1][var10] != var6 && (class128.field1972[class165.field2600][var11][var10] & 0x4) == 0 && (class128.field1972[class165.field2600][var11 + 1][var10 - 1] & 0x4) == 0) {
                            class11.field140[var31] = class82.method554(class82.method554(5373952, var11 + 1), -1845493760);
                            class171.field2652[var31] = class82.method554(5439488, var10);
                            class219.field3506[class165.field2600][var11 + 1][var10] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var10--;
                    if ((var11 + 1) < 104 && class219.field3506[class165.field2600][var11 + 1][var10] != var6) {
                        class11.field140[var31] = class82.method554(class82.method554(var11 + 1, 9568256), 1392508928);
                        class171.field2652[var31] = class82.method554(var10, 9633792);
                        class219.field3506[class165.field2600][var11 + 1][var10] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var10--;
                    if (var10 >= 0) {
                        if (var11 - 1 >= 0 && class219.field3506[class165.field2600][var11 - 1][var10] != var6 && (class128.field1972[class165.field2600][var11][var10] & 0x4) == 0 && (class128.field1972[class165.field2600][var11 - 1][var10 + 1] & 0x4) == 0) {
                            class11.field140[var31] = class82.method554(class82.method554(var11 - 1, 13762560), 301989888);
                            class171.field2652[var31] = class82.method554(var10, 13828096);
                            class219.field3506[class165.field2600][var11 - 1][var10] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class219.field3506[class165.field2600][var11][var10] != var6) {
                            class11.field140[var31] = class82.method554(class82.method554(var11, 13762560), -1828716544);
                            class171.field2652[var31] = class82.method554(var10, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class219.field3506[class165.field2600][var11][var10] = var6;
                        }
                        if (var11 + 1 < 104 && class219.field3506[class165.field2600][var11 + 1][var10] != var6 && (class128.field1972[class165.field2600][var11][var10] & 0x4) == 0 && (class128.field1972[class165.field2600][var11 + 1][var10 + 1] & 0x4) == 0) {
                            class11.field140[var31] = class82.method554(-771751936, class82.method554(9568256, var11 + 1));
                            class171.field2652[var31] = class82.method554(9633792, var10);
                            class219.field3506[class165.field2600][var11 + 1][var10] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class248.field3942[arg2] != -1000000) {
                class248.field3942[arg2] += 10;
                class216.field3446[arg2] -= 50;
                class93.field1417[arg2] += 50;
                class157.field2501[arg2] += 50;
                class218.field3479[arg2] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static void method1736(byte arg0) {
        if (arg0 != 11) {
            field3964 = 69;
        }
        field3960 = null;
        field3970 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)La;")
    public final class49 method378(int arg0, byte arg1) {
        field3963++;
        return arg1 == 86 ? this.field3969[arg0] : null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZFZIII)[I")
    public final int[] method379(boolean arg0, float arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field3956++;
        return arg2 ? this.method1737((byte) -73, arg3).method757(arg0, (double) arg1, this, 28607, arg4, this.field3968, this.field3969[arg3].field676, arg5) : null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)Lfi;")
    public class117 method1737(byte arg0, int arg1) {
        field3958++;
        class162 var3 = this.field3961.method1343(115, (long) arg1);
        if (var3 != null) {
            return (class117) var3;
        }
        byte[] var4 = this.field3959.method1884(arg1, (byte) 107);
        if (var4 == null) {
            return null;
        } else if (arg0 > -65) {
            return null;
        } else {
            class117 var5 = new class117(new class202(var4));
            this.field3961.method1337(var5, (long) arg1, -1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lfa;Lfa;Lfa;)V")
    public class249(class273 arg0, class273 arg1, class273 arg2) {
        this.field3968 = arg2;
        this.field3959 = arg1;
        class202 var4 = new class202(arg0.method1877(0, 0, (byte) 113));
        int var5 = var4.method1419(121);
        this.field3969 = new class49[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1420((byte) 0) == 1) {
                this.field3969[var6] = new class49();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field3969[var7] != null) {
                this.field3969[var7].field675 = var4.method1420((byte) 0) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field3969[var8] != null) {
                this.field3969[var8].field671 = var4.method1420((byte) 0) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3969[var9] != null) {
                this.field3969[var9].field678 = var4.method1420((byte) 0) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field3969[var10] != null) {
                var4.method1420((byte) 0);
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field3969[var11] != null) {
                var4.method1457((byte) -94);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field3969[var12] != null) {
                var4.method1457((byte) -102);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field3969[var13] != null) {
                var4.method1457((byte) -89);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field3969[var14] != null) {
                var4.method1457((byte) -119);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field3969[var15] != null) {
                this.field3969[var15].field670 = (short) var4.method1419(125);
            }
        }
        if (var4.field3272 < var4.field3234.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field3969[var16] != null) {
                    var4.method1457((byte) -67);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field3969[var17] != null) {
                    var4.method1457((byte) -67);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field3969[var18] != null) {
                    var4.method1420((byte) 0);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field3969[var19] != null) {
                    this.field3969[var19].field676 = var4.method1420((byte) 0) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field3969[var20] != null) {
                    var4.method1457((byte) -60);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field3969[var21] != null) {
                    var4.method1420((byte) 0);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field3969[var22] != null) {
                    var4.method1420((byte) 0);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field3969[var23] != null) {
                    var4.method1420((byte) 0);
                }
            }
        }
    }
}
