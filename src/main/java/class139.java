import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class139 {

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public int field2123 = 0;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2126 = null;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2125 = "Loading - please wait.";

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2131 = "Walk here";

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field2132 = -1;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "[I")
    public static int[] field2130;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII[[[Lwj;Z)Z")
    public static final boolean method936(int arg0, int arg1, int arg2, int arg3, class6[][][] arg4, boolean arg5) {
        field2129++;
        if (arg3 <= 19) {
            return true;
        }
        byte var6 = arg5 ? 1 : (byte) (class121.field1938 & 0xFF);
        if (class30.field441[class240.field3892][arg0][arg1] == var6) {
            return false;
        } else if ((class181.field2827[class240.field3892][arg0][arg1] & 0x4) == 0) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            class6.field128[var8] = arg0;
            int var31 = var8 + 1;
            class193.field3034[var8] = arg1;
            class30.field441[class240.field3892][arg0][arg1] = var6;
            while (var7 != var31) {
                int var9 = class6.field128[var7] & 0xFFFF;
                int var10 = class6.field128[var7] >> 16 & 0xFF;
                int var11 = class193.field3034[var7] & 0xFFFF;
                int var12 = class6.field128[var7] >> 24 & 0xFF;
                int var13 = class193.field3034[var7] >> 16 & 0xFF;
                boolean var14 = false;
                var7 = var7 + 1 & 0xFFF;
                boolean var15 = false;
                if ((class181.field2827[class240.field3892][var9][var11] & 0x4) == 0) {
                    var15 = true;
                }
                label229: for (int var16 = class240.field3892 + 1; var16 <= 3; var16++) {
                    if ((class181.field2827[var16][var9][var11] & 0x8) == 0) {
                        if (var15 && arg4[var16][var9][var11] != null) {
                            if (arg4[var16][var9][var11].field147 != null) {
                                int var19 = class147.method991(var10, -2);
                                if (arg4[var16][var9][var11].field147.field157 == var19 || arg4[var16][var9][var11].field147.field162 == var19) {
                                    continue;
                                }
                                if (var12 != 0) {
                                    int var20 = class147.method991(var12, -2);
                                    if (arg4[var16][var9][var11].field147.field157 == var20 || arg4[var16][var9][var11].field147.field162 == var20) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var21 = class147.method991(var13, -2);
                                    if (arg4[var16][var9][var11].field147.field157 == var21 || arg4[var16][var9][var11].field147.field162 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var16][var9][var11].field134 != null) {
                                for (int var22 = 0; var22 < arg4[var16][var9][var11].field125; var22++) {
                                    int var23 = (int) (arg4[var16][var9][var11].field134[var22].field4618 >> 20 & 0x3L);
                                    int var24 = (int) (arg4[var16][var9][var11].field134[var22].field4618 >> 14 & 0x3FL);
                                    if (var24 == 21) {
                                        var24 = 19;
                                    }
                                    int var25 = var23 << 6 | var24;
                                    if (var10 == var25 || var12 != 0 && var12 == var25 || var13 != 0 && var13 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var14 = true;
                        class6 var26 = arg4[var16][var9][var11];
                        if (var26 != null && var26.field125 > 0) {
                            for (int var27 = 0; var27 < var26.field125; var27++) {
                                class293 var28 = var26.field134[var27];
                                if (var28.field4623 != var28.field4616 || var28.field4615 != var28.field4612) {
                                    for (int var29 = var28.field4616; var29 <= var28.field4623; var29++) {
                                        for (int var30 = var28.field4612; var30 <= var28.field4615; var30++) {
                                            class30.field441[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class30.field441[var16][var9][var11] = var6;
                    }
                }
                if (var14) {
                    if (class206.field3227[arg2] < class66.field1107[class240.field3892 + 1][var9][var11]) {
                        class206.field3227[arg2] = class66.field1107[class240.field3892 + 1][var9][var11];
                    }
                    int var17 = var9 << 7;
                    int var18 = var11 << 7;
                    if (var17 < class190.field2949[arg2]) {
                        class190.field2949[arg2] = var17;
                    } else if (var17 > class161.field2531[arg2]) {
                        class161.field2531[arg2] = var17;
                    }
                    if (class240.field3894[arg2] > var18) {
                        class240.field3894[arg2] = var18;
                    } else if (var18 > class27.field363[arg2]) {
                        class27.field363[arg2] = var18;
                    }
                }
                if (!var15) {
                    if (var9 >= 1 && class30.field441[class240.field3892][var9 - 1][var11] != var6) {
                        class6.field128[var31] = class45.method330(class45.method330(var9 - 1, 1179648), -754974720);
                        class193.field3034[var31] = class45.method330(1245184, var11);
                        class30.field441[class240.field3892][var9 - 1][var11] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var11++;
                    if (var11 < 104) {
                        if ((var9 - 1) >= 0 && class30.field441[class240.field3892][var9 - 1][var11] != var6 && (class181.field2827[class240.field3892][var9][var11] & 0x4) == 0 && (class181.field2827[class240.field3892][var9 - 1][var11 - 1] & 0x4) == 0) {
                            class6.field128[var31] = class45.method330(1375731712, class45.method330(var9 - 1, 1179648));
                            class193.field3034[var31] = class45.method330(1245184, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class30.field441[class240.field3892][var9 - 1][var11] = var6;
                        }
                        if (class30.field441[class240.field3892][var9][var11] != var6) {
                            class6.field128[var31] = class45.method330(318767104, class45.method330(var9, 5373952));
                            class193.field3034[var31] = class45.method330(var11, 5439488);
                            class30.field441[class240.field3892][var9][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class30.field441[class240.field3892][var9 + 1][var11] != var6 && (class181.field2827[class240.field3892][var9][var11] & 0x4) == 0 && (class181.field2827[class240.field3892][var9 + 1][var11 - 1] & 0x4) == 0) {
                            class6.field128[var31] = class45.method330(-1845493760, class45.method330(5373952, var9 + 1));
                            class193.field3034[var31] = class45.method330(var11, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class30.field441[class240.field3892][var9 + 1][var11] = var6;
                        }
                    }
                    var11--;
                    if ((var9 + 1) < 104 && class30.field441[class240.field3892][var9 + 1][var11] != var6) {
                        class6.field128[var31] = class45.method330(1392508928, class45.method330(var9 + 1, 9568256));
                        class193.field3034[var31] = class45.method330(9633792, var11);
                        var31 = var31 + 1 & 0xFFF;
                        class30.field441[class240.field3892][var9 + 1][var11] = var6;
                    }
                    var11--;
                    if (var11 >= 0) {
                        if ((var9 - 1) >= 0 && class30.field441[class240.field3892][var9 - 1][var11] != var6 && (class181.field2827[class240.field3892][var9][var11] & 0x4) == 0 && (class181.field2827[class240.field3892][var9 - 1][var11 + 1] & 0x4) == 0) {
                            class6.field128[var31] = class45.method330(301989888, class45.method330(13762560, var9 - 1));
                            class193.field3034[var31] = class45.method330(var11, 13828096);
                            class30.field441[class240.field3892][var9 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class30.field441[class240.field3892][var9][var11] != var6) {
                            class6.field128[var31] = class45.method330(class45.method330(13762560, var9), -1828716544);
                            class193.field3034[var31] = class45.method330(13828096, var11);
                            class30.field441[class240.field3892][var9][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class30.field441[class240.field3892][var9 + 1][var11] != var6 && (class181.field2827[class240.field3892][var9][var11] & 0x4) == 0 && (class181.field2827[class240.field3892][var9 + 1][var11 + 1] & 0x4) == 0) {
                            class6.field128[var31] = class45.method330(-771751936, class45.method330(var9 + 1, 9568256));
                            class193.field3034[var31] = class45.method330(9633792, var11);
                            class30.field441[class240.field3892][var9 + 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class206.field3227[arg2] != -1000000) {
                class206.field3227[arg2] += 10;
                class190.field2949[arg2] -= 50;
                class161.field2531[arg2] += 50;
                class27.field363[arg2] += 50;
                class240.field3894[arg2] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZII)V")
    public static final void method937(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method937(false, 27, 87);
        }
        class41 var3 = class221.method1492((byte) -42, arg2, 12);
        var3.method301(8792);
        field2122++;
        var3.field584 = arg1;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method938(int arg0) {
        field2126 = null;
        field2125 = null;
        field2131 = null;
        field2130 = null;
        if (arg0 > -60) {
            method939((short[]) null, -62, -88, 28, (String[]) null);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([SIII[Ljava/lang/String;)V")
    public static final void method939(short[] arg0, int arg1, int arg2, int arg3, String[] arg4) {
        if (arg3 != 7300) {
            field2125 = null;
        }
        if (arg1 > arg2) {
            int var5 = arg2;
            int var6 = (arg2 + arg1) / 2;
            String var7 = arg4[var6];
            arg4[var6] = arg4[arg1];
            arg4[arg1] = var7;
            short var8 = arg0[var6];
            arg0[var6] = arg0[arg1];
            arg0[arg1] = var8;
            for (int var9 = arg2; var9 < arg1; var9++) {
                if (var7 == null || arg4[var9] != null && (var9 & 0x1) > arg4[var9].compareTo(var7)) {
                    String var10 = arg4[var9];
                    arg4[var9] = arg4[var5];
                    arg4[var5] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5++] = var11;
                }
            }
            arg4[arg1] = arg4[var5];
            arg4[var5] = var7;
            arg0[arg1] = arg0[var5];
            arg0[var5] = var8;
            method939(arg0, var5 - 1, arg2, 7300, arg4);
            method939(arg0, arg1, var5 + 1, 7300, arg4);
        }
        field2128++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIBI)V")
    public static final void method940(int arg0, int arg1, byte arg2, int arg3) {
        field2127++;
        String var4 = "::tele " + arg0 + "," + (arg1 >> 6) + "," + (arg3 >> 6) + "," + (arg1 & 0x3F) + "," + (arg3 & 0x3F);
        int var5 = -101 / ((arg2 + 46) / 48);
        System.out.println(var4);
        class277.method1875(true, var4);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lai;B)V")
    public final void method941(class88 arg0, byte arg1) {
        field2120++;
        if (arg1 != -67) {
            method940(104, -10, (byte) 119, -103);
        }
        while (true) {
            int var3 = arg0.method633(arg1 + 139);
            if (var3 == 0) {
                return;
            }
            this.method942(var3, false, arg0);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZLai;)V")
    private final void method942(int arg0, boolean arg1, class88 arg2) {
        if (arg1) {
            field2131 = null;
        }
        if (arg0 == 5) {
            this.field2123 = arg2.method645(11596);
        }
        field2121++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(III[B)Z")
    public static final boolean method943(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 >= -35) {
            field2119 = -119;
        }
        field2124++;
        int var4 = -1;
        class88 var5 = new class88(arg3);
        boolean var6 = true;
        label72: while (true) {
            int var7 = var5.method629(-125);
            if (var7 == 0) {
                return var6;
            }
            int var8 = 0;
            var4 += var7;
            boolean var9 = false;
            while (true) {
                int var13;
                class193 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method666(false);
                                        if (var17 == 0) {
                                            continue label72;
                                        }
                                        var5.method633(49);
                                    }
                                    int var10 = var5.method666(false);
                                    if (var10 == 0) {
                                        continue label72;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = var8 >> 6 & 0x3F;
                                    var13 = var5.method633(76) >> 2;
                                    var14 = arg0 + var12;
                                    var15 = var11 + arg2;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class69.method501(0, var4);
                } while (var13 == 22 && !class132.field2072 && var16.field3020 == 0 && var16.field3057 != 1 && !var16.field3037);
                var9 = true;
                if (!var16.method1312((byte) -58)) {
                    class173.field2728++;
                    var6 = false;
                }
            }
        }
    }
}
