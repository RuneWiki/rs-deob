import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class308 extends class17 {

    @OriginalMember(owner = "client!hk", name = "eb", descriptor = "I")
    private int field5350 = 585;

    @OriginalMember(owner = "client!hk", name = "db", descriptor = "Lsf;")
    public static class108 field5349 = class140.method973(255, "<col=00ff00>");

    @OriginalMember(owner = "client!hk", name = "ab", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!hk", name = "cb", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!hk", name = "fb", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!hk", name = "gb", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!hk", name = "hb", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!hk", name = "bb", descriptor = "Lkn;")
    public static class199 field5347;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V", line = 4)
    public static void method2156(byte arg0) {
        field5349 = null;
        field5347 = null;
        if (arg0 != 33) {
            field5349 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIJ)Z", line = 19)
    public static final boolean method2157(int arg0, int arg1, int arg2, long arg3) {
        class74 var5 = class99.field1759[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1117 != null && var5.field1117.field3184 == arg3) {
            return true;
        } else if (var5.field1140 != null && var5.field1140.field502 == arg3) {
            return true;
        } else if (var5.field1141 != null && var5.field1141.field4560 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1119; var6++) {
                if (var5.field1118[var6].field5563 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(II)[I", line = 50)
    public final int[] method120(int arg0, int arg1) {
        if (arg0 > -95) {
            method2156((byte) 123);
        }
        field5348++;
        int[] var3 = this.field217.method1698(126, arg1);
        if (this.field217.field4295) {
            int var4 = class36.field504[arg1];
            for (int var5 = 0; var5 < class116.field2008; var5++) {
                int var6 = class61.field979[var5];
                if (this.field5350 < var6 && var6 < 4096 - this.field5350 && (2048 - this.field5350) < var4 && (this.field5350 + 2048) > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field5350);
                    var3[var5] = 4096 - var10;
                } else if (var6 > (2048 - this.field5350) && var6 < (this.field5350 + 2048)) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field5350;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field5350);
                } else if (this.field5350 > var4 || (4096 - this.field5350) < var4) {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field5350;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field5350);
                } else if (this.field5350 <= var6 && var6 <= (4096 - this.field5350)) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field5350);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILsf;)V", line = 131)
    public static final void method2158(int arg0, class108 arg1) {
        field5351++;
        if (class299.field5191 >= 2) {
            if (arg1.method781(class15.field195, arg0 ^ 0xFFFF992D)) {
                class51.method364(-743903088);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class210.method1456(class117.method833(new class108[] { class60.field916, class79.method518(false, var4), class103.field1800 }, false), 0, -78, (class108) null);
            }
            if (arg1.method781(class268.field4712, -26321)) {
                class51.method364(-743903088);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class210.method1456(class117.method833(new class108[] { class27.field413, class79.method518(false, var7), class103.field1800 }, false), 0, -123, (class108) null);
                class315.method2193(arg0 ^ 0xFFFFFFB2);
                class51.method364(-743903088);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class210.method1456(class117.method833(new class108[] { class287.field5025, class79.method518(false, var9), class103.field1800 }, false), 0, arg0 - 42, (class108) null);
            }
            if (class231.field4051 && arg1.method781(class129.field2209, -26321)) {
                System.out.println("oncard_geometry:" + class124.field2100);
                System.out.println("oncard_2d:" + class124.field2101);
                System.out.println("oncard_texture:" + class124.field2103);
            }
            if (arg1.method781(class72.field1096, arg0 - 26323)) {
                class54.method377((byte) 55);
            }
            if (arg1.method781(class209.field3733, -26321)) {
                class302.field5252.method1607(arg0 ^ 0xFFFFFF84);
            }
            if (arg1.method781(class64.field1033, arg0 ^ 0xFFFF992D)) {
                class302.field5252.method1610(0);
            }
            if (arg1.method781(class222.field3942, -26321)) {
                class289.field5052.method971(31);
                class14.field161.method1485(arg0 ^ 0x6AB5);
                class302.field5252.method1613(-71);
            }
            if (arg1.method781(class116.field2018, -26321)) {
                class126.field2126 = true;
            }
            if (arg1.method781(class57.field837, -26321)) {
                class312.method2177(25, (byte) -101);
            }
            if (arg1.method781(class302.field5246, arg0 - 26323)) {
                class55.field804 = true;
            }
            if (arg1.method781(class215.field3830, -26321)) {
                class55.field804 = false;
            }
            if (arg1.method781(class219.field3902, -26321)) {
                class92.method618(-1, -1, (byte) 64, false, 0);
            }
            if (arg1.method781(class2.field43, -26321)) {
                class92.method618(-1, -1, (byte) 11, false, 1);
            }
            if (arg1.method781(class27.field414, -26321)) {
                class92.method618(-1, -1, (byte) 44, false, 2);
            }
            if (arg1.method781(class256.field4446, arg0 - 26323)) {
                class92.method618(1024, 768, (byte) 63, false, 3);
            }
            if (arg1.method781(class144.field2536, arg0 ^ 0xFFFF992D)) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class330.field5644[var10].field5605[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg1.method746(false, class140.field2475) && class220.field3910 != 0) {
                class291.method2079(arg1.method788(6, 32299).method771((byte) -128), -4514);
            }
            if (arg1.method781(class326.field5556, arg0 - 26323) && class220.field3910 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method746(false, class313.field5404)) {
                class140.field2465 = arg1.method788(12, arg0 + 32297).method769(arg0 - 8003).method771((byte) -128);
                class210.method1456(class117.method833(new class108[] { class221.field3938, class79.method518(false, class140.field2465) }, false), 0, -104, (class108) null);
            }
            if (arg1.method781(class74.field1139, -26321)) {
                class46.field673 = true;
            }
        }
        class256.field4471.method1427(37, 0);
        class256.field4471.method1759(arg0 - 32770, arg1.method776(arg0 + -2) + -1);
        class256.field4471.method1708(arg1.method788(arg0, arg0 + 32297), 7733);
        class232.field4101++;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V", line = 308)
    public class308() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLrm;I)V", line = 318)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        if (arg0 != -114) {
            field5347 = (class199) null;
        }
        field5352++;
        if (arg2 == 0) {
            this.field5350 = arg1.method1712(-1);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZIIIBIIIIIII)Z", line = 351)
    public static final boolean method2159(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class83.field1280[var12][var13] = 0;
                class324.field5523[var12][var13] = 99999999;
            }
        }
        field5353++;
        class83.field1280[arg9][arg5] = 99;
        class324.field5523[arg9][arg5] = 0;
        byte var14 = 0;
        class5.field66[var14] = arg9;
        int var15 = arg5;
        int var32 = var14 + 1;
        class26.field405[var14] = arg5;
        int var16 = 0;
        int var17 = arg9;
        boolean var18 = false;
        int[][] var19 = class330.field5644[class295.field5159].field5605;
        while (var32 != var16) {
            var15 = class26.field405[var16];
            var17 = class5.field66[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg10 == var17 && arg6 == var15) {
                var18 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && class330.field5644[class295.field5159].method2249(arg6, 2, arg10, arg11, var15, 1, var17, arg7 - 1)) {
                    var18 = true;
                    break;
                }
                if (arg7 < 10 && class330.field5644[class295.field5159].method2236(arg10, arg6, arg7 - 1, -1, arg11, var15, 2, var17)) {
                    var18 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg1 != 0 && class330.field5644[class295.field5159].method2237(arg8, var17, arg1, arg10, arg2, var15, (byte) -104, 2, arg6)) {
                var18 = true;
                break;
            }
            int var20 = class324.field5523[var17][var15] + 1;
            if (var17 > 0 && class83.field1280[var17 - 1][var15] == 0 && (var19[var17 - 1][var15] & 0x12C010E) == 0 && (var19[var17 - 1][var15 + 1] & 0x12C0138) == 0) {
                class5.field66[var32] = var17 - 1;
                class26.field405[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class83.field1280[var17 - 1][var15] = 2;
                class324.field5523[var17 - 1][var15] = var20;
            }
            if (var17 < 102 && class83.field1280[var17 + 1][var15] == 0 && (var19[var17 + 2][var15] & 0x12C0183) == 0 && (var19[var17 + 2][var15 + 1] & 0x12C01E0) == 0) {
                class5.field66[var32] = var17 + 1;
                class26.field405[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class83.field1280[var17 + 1][var15] = 8;
                class324.field5523[var17 + 1][var15] = var20;
            }
            if (var15 > 0 && class83.field1280[var17][var15 - 1] == 0 && (var19[var17][var15 - 1] & 0x12C010E) == 0 && (var19[var17 + 1][var15 - 1] & 0x12C0183) == 0) {
                class5.field66[var32] = var17;
                class26.field405[var32] = var15 - 1;
                class83.field1280[var17][var15 - 1] = 1;
                class324.field5523[var17][var15 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 102 && class83.field1280[var17][var15 + 1] == 0 && (var19[var17][var15 + 2] & 0x12C0138) == 0 && (var19[var17 + 1][var15 + 2] & 0x12C01E0) == 0) {
                class5.field66[var32] = var17;
                class26.field405[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class83.field1280[var17][var15 + 1] = 4;
                class324.field5523[var17][var15 + 1] = var20;
            }
            if (var17 > 0 && var15 > 0 && class83.field1280[var17 - 1][var15 - 1] == 0 && (var19[var17 - 1][var15] & 0x12C0138) == 0 && (var19[var17 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var17][var15 - 1] & 0x12C0183) == 0) {
                class5.field66[var32] = var17 - 1;
                class26.field405[var32] = var15 - 1;
                class83.field1280[var17 - 1][var15 - 1] = 3;
                class324.field5523[var17 - 1][var15 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var17 < 102 && var15 > 0 && class83.field1280[var17 + 1][var15 - 1] == 0 && (var19[var17 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[var17 + 2][var15 - 1] & 0x12C0183) == 0 && (var19[var17 + 2][var15] & 0x12C01E0) == 0) {
                class5.field66[var32] = var17 + 1;
                class26.field405[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class83.field1280[var17 + 1][var15 - 1] = 9;
                class324.field5523[var17 + 1][var15 - 1] = var20;
            }
            if (var17 > 0 && var15 < 102 && class83.field1280[var17 - 1][var15 + 1] == 0 && (var19[var17 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var17 - 1][var15 + 2] & 0x12C0138) == 0 && (var19[var17][var15 + 2] & 0x12C01E0) == 0) {
                class5.field66[var32] = var17 - 1;
                class26.field405[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class83.field1280[var17 - 1][var15 + 1] = 6;
                class324.field5523[var17 - 1][var15 + 1] = var20;
            }
            if (var17 < 102 && var15 < 102 && class83.field1280[var17 + 1][var15 + 1] == 0 && (var19[var17 + 1][var15 + 2] & 0x12C0138) == 0 && (var19[var17 + 2][var15 + 2] & 0x12C01E0) == 0 && (var19[var17 + 2][var15 + 1] & 0x12C0183) == 0) {
                class5.field66[var32] = var17 + 1;
                class26.field405[var32] = var15 + 1;
                class83.field1280[var17 + 1][var15 + 1] = 12;
                class324.field5523[var17 + 1][var15 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class84.field1328 = 0;
        if (!var18) {
            if (!arg0) {
                return false;
            }
            int var21 = 100;
            int var22 = 1000;
            byte var23 = 10;
            for (int var24 = arg10 - var23; var24 <= arg10 + var23; var24++) {
                for (int var25 = arg6 - var23; var25 <= arg6 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class324.field5523[var24][var25] < 100) {
                        int var26 = 0;
                        if (var25 < arg6) {
                            var26 = arg6 - var25;
                        } else if (var25 > (arg6 + arg1 - 1)) {
                            var26 = var25 + 1 - arg6 - arg1;
                        }
                        int var27 = 0;
                        if (arg10 > var24) {
                            var27 = arg10 - var24;
                        } else if (arg10 + arg8 - 1 < var24) {
                            var27 = -arg10 - (-var24 - 1) - arg8;
                        }
                        int var28 = var27 * var27 + (var26 * var26);
                        if (var22 > var28 || var22 == var28 && var21 > class324.field5523[var24][var25]) {
                            var15 = var25;
                            var21 = class324.field5523[var24][var25];
                            var22 = var28;
                            var17 = var24;
                        }
                    }
                }
            }
            if (var22 == 1000) {
                return false;
            }
            if (arg9 == var17 && arg5 == var15) {
                return false;
            }
            class84.field1328 = 1;
        }
        byte var29 = 0;
        class5.field66[var29] = var17;
        int var33 = var29 + 1;
        class26.field405[var29] = var15;
        int var30;
        int var31 = var30 = class83.field1280[var17][var15];
        if (arg4 != 48) {
            method2158(-79, (class108) null);
        }
        while (arg9 != var17 || arg5 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class5.field66[var33] = var17;
                class26.field405[var33++] = var15;
            }
            if ((var31 & 0x2) != 0) {
                var17++;
            } else if ((var31 & 0x8) != 0) {
                var17--;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            var31 = class83.field1280[var17][var15];
        }
        if (var33 > 0) {
            class255.method1798(var33, (byte) 124, arg3);
            return true;
        } else if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
