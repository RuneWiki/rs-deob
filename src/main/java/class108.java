import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class108 {

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public int field1512;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field1505 = 0;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Lap;")
    public static class310 field1509 = new class310(54, 3);

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "[I")
    public static int[] field1516 = new int[14];

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field1517 = 0;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "[I")
    public static int[] field1518 = new int[14];

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "Lvi;")
    public static class185 field1519;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)I")
    public final int method854(int arg0) {
        if (arg0 != 20500) {
            this.method854(-121);
        }
        field1515++;
        return this.field1511;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lvc;B)V")
    public static final void method855(class89 arg0, byte arg1) {
        int var2 = 20 / ((21 - arg1) / 53);
        field1507++;
        arg0.method453(0, 0, class364.field5007, 350);
        arg0.method438(0, 0, class364.field5007, 350, class276.field3990 << 24 | 0x332277, 1);
        for (int var3 = 0; var3 < 100; var3++) {
            int var14 = class94.field1326[var3];
            int var15 = class454.field6426[var3];
            arg0.method438(var14, var15, 2, 2, class352.field4844[var3] << 24 | 0xFFFFFF, 1);
        }
        int var4 = 350 / class164.field2396;
        if (class213.field3102 > 0) {
            int var5 = 342 - class164.field2396;
            int var6 = var4 * var5 / (var4 + class213.field3102 - 1);
            int var7 = 4;
            if (class213.field3102 > 1) {
                var7 += (class213.field3102 - class75.field1079 - 1) * (var5 - var6) / (class213.field3102 - 1);
            }
            arg0.method438(class364.field5007 - 16, var7, 12, var6, class276.field3990 << 24 | 0x332277, 2);
            for (int var8 = class75.field1079; var8 < (class75.field1079 + var4) && var8 < class213.field3102; var8++) {
                String[] var9 = class237.method1645('\b', class390.field5397[var8], 0);
                int var10 = (class364.field5007 - 16 - 8) / var9.length;
                for (int var11 = 0; var11 < var9.length; var11++) {
                    int var12 = var10 * var11 + 8;
                    arg0.method453(var12, 0, var12 - (8 - var10), 350);
                    class189.field2830.method1383(-1, false, 350 - class293.field4144.field2883 - ((-class75.field1079 + var8) * class164.field2396) - (class75.field1083 + 2), var9[var11], -16777216, var12);
                }
            }
        }
        arg0.method453(0, 0, class364.field5007, 350);
        arg0.method743(class364.field5007, 350 - class75.field1083, (byte) -127, 0, -1);
        class408.field5584.method1383(-1, false, 350 - (class402.field5516.field2883 + 1), "--> " + class243.field3527, -16777216, 10);
        int var13 = -1;
        if ((class364.field5010 % 30) > 15) {
            var13 = 16777215;
        }
        arg0.method748(12, (byte) -57, var13, 350 - class402.field5516.field2883 - 11, class402.field5516.method1354((byte) -103, "--> " + class243.field3527.substring(0, class206.field3014)) + 10);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(II)V")
    public class108(int arg0, int arg1) {
        this.field1511 = arg0;
        this.field1512 = arg1;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public static void method856(int arg0) {
        field1519 = null;
        field1516 = null;
        field1518 = null;
        field1509 = null;
        if (arg0 >= -89) {
            method858(4, -39, 62);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILae;B)V")
    public static final void method857(int arg0, int arg1, class172 arg2, byte arg3) {
        if (!class450.field6405) {
            for (int var4 = 9; var4 >= 5; var4--) {
                String var8 = class202.method1404(arg2, -1, var4);
                if (var8 != null) {
                    class19.method140(false, (byte) 20, arg2.field2505, true, var8, arg2.field2527, (long) (var4 + 1), 1002, arg2.field2543, arg2.field2483, class374.method2287(var4, false, arg2));
                    class291.field4120++;
                }
            }
            String var5 = class260.method1746(-1, arg2);
            if (var5 != null) {
                class325.field4533++;
                class19.method140(false, (byte) 120, arg2.field2505, true, var5, arg2.field2527, 0L, 2, arg2.field2543, arg2.field2483, arg2.field2566);
            }
            for (int var6 = 4; var6 >= 0; var6--) {
                String var7 = class202.method1404(arg2, -1, var6);
                if (var7 != null) {
                    class19.method140(false, (byte) -59, arg2.field2505, true, var7, arg2.field2527, (long) (var6 + 1), 13, arg2.field2543, arg2.field2483, class374.method2287(var6, false, arg2));
                    class291.field4120++;
                }
            }
            if (client.method547(arg2).method869(87)) {
                if (arg2.field2549 == null) {
                    class19.method140(false, (byte) -79, "", true, class157.field2234.method1078(class66.field967, 100), arg2.field2527, 0L, 59, arg2.field2543, arg2.field2483, -1);
                } else {
                    class19.method140(false, (byte) -86, "", true, arg2.field2549, arg2.field2527, 0L, 59, arg2.field2543, arg2.field2483, -1);
                }
                class213.field3096++;
            }
        } else if (client.method547(arg2).method880(-52) && (class182.field2751 & 0x20) != 0) {
            class19.method140(false, (byte) -16, class352.field4842 + " -> " + arg2.field2505, true, class347.field4784, arg2.field2527, 0L, 47, arg2.field2543, arg2.field2483, class95.field1336);
            class172.field2517++;
        }
        if (arg3 > -125) {
            field1520 = 26;
        }
        field1508++;
    }

    @OriginalMember(owner = "client!rc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1514++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
    public static final void method858(int arg0, int arg1, int arg2) {
        if ((class330.field4574 > class330.field4577)) {
            class330.field4577 = (float) ((double) class330.field4577 / 30.0D + (double) class330.field4577);
            if (class330.field4577 > class330.field4574) {
                class330.field4577 = class330.field4574;
            }
            class57.method521((byte) 72);
            class330.field4579 = (int) class330.field4577 >> 1;
            class330.field4576 = class255.method1734(class330.field4579, arg2 ^ 0xFFFFFFFC);
        } else if (class330.field4577 > class330.field4574) {
            class330.field4577 = (float) ((double) class330.field4577 - (double) class330.field4577 / 30.0D);
            if (class330.field4574 > class330.field4577) {
                class330.field4577 = class330.field4574;
            }
            class57.method521((byte) 72);
            class330.field4579 = (int) class330.field4577 >> 1;
            class330.field4576 = class255.method1734(class330.field4579, 3);
        }
        field1506++;
        if (class430.field6008 != -1 && class466.field6571 != -1) {
            int var3 = class430.field6008 - class309.field4388;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class466.field6571 - class25.field267;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class309.field4388 += var3;
            if (var3 == 0 && var4 == 0) {
                class430.field6008 = -1;
                class466.field6571 = -1;
            }
            class25.field267 += var4;
            class57.method521((byte) 72);
        }
        if (arg2 != -1) {
            method856(-88);
        }
        if (class349.field4804 > 0) {
            class182.field2752--;
            if (class182.field2752 == 0) {
                class349.field4804--;
                class182.field2752 = 100;
            }
        } else {
            class480.field6802 = -1;
            class221.field3193 = -1;
        }
        if (!class382.field5244 || class135.field1887 == null) {
            return;
        }
        for (class88 var5 = (class88) class135.field1887.method775(1); var5 != null; var5 = (class88) class135.field1887.method763(0)) {
            class76 var6 = class330.field4569.method2321(var5.field1234.field3826, true);
            if (var5.method737(arg1, 9987, arg0)) {
                if (var6.field1118 != null) {
                    if (var6.field1118[4] != null) {
                        class19.method140(false, (byte) -44, var6.field1109, true, var6.field1118[4], var6.field1100, (long) var5.field1234.field3826, 1010, 0, -1, -1);
                    }
                    if (var6.field1118[3] != null) {
                        class19.method140(false, (byte) -120, var6.field1109, true, var6.field1118[3], var6.field1100, (long) var5.field1234.field3826, 1004, 0, -1, -1);
                    }
                    if (var6.field1118[2] != null) {
                        class19.method140(false, (byte) -86, var6.field1109, true, var6.field1118[2], var6.field1100, (long) var5.field1234.field3826, 1006, 0, -1, -1);
                    }
                    if (var6.field1118[1] != null) {
                        class19.method140(false, (byte) -123, var6.field1109, true, var6.field1118[1], var6.field1100, (long) var5.field1234.field3826, 1012, 0, -1, -1);
                    }
                    if (var6.field1118[0] != null) {
                        class19.method140(false, (byte) 1, var6.field1109, true, var6.field1118[0], var6.field1100, (long) var5.field1234.field3826, 1009, 0, -1, -1);
                    }
                }
                if (!var5.field1234.field3829) {
                    var5.field1234.field3829 = true;
                    class457.method2744(class255.field3669, var5.field1234.field3826, var6.field1100);
                }
                if (var5.field1234.field3829) {
                    class457.method2744(class373.field5139, var5.field1234.field3826, var6.field1100);
                }
            } else if (var5.field1234.field3829) {
                var5.field1234.field3829 = false;
                class457.method2744(class39.field532, var5.field1234.field3826, var6.field1100);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
    public static final void method859(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1513++;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = 30 / ((arg2 - 63) / 35);
        int var9 = -1;
        class61.method558(arg0 + arg3, -10647, class373.field5141[arg1], arg0 - arg3, arg4);
        while (var5 < var6) {
            var9 += 2;
            var7 += var9;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var10 = class373.field5141[arg1 + var6];
                int[] var11 = class373.field5141[arg1 - var6];
                int var12 = arg0 + var5;
                int var13 = arg0 - var5;
                class61.method558(var12, -10647, var10, var13, arg4);
                class61.method558(var12, -10647, var11, var13, arg4);
            }
            int var14 = arg0 + var6;
            int var15 = arg0 - var6;
            int[] var16 = class373.field5141[arg1 + var5];
            int[] var17 = class373.field5141[arg1 - var5];
            class61.method558(var14, -10647, var16, var15, arg4);
            class61.method558(var14, -10647, var17, var15, arg4);
        }
    }
}
