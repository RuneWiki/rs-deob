import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class24 extends class80 {

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "[B")
    public byte[] field308;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public static int field310 = -1;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public static int field305 = -1;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "[J")
    public static long[] field313 = new long[32];

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "F")
    public static float field307;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "[Lki;")
    public static class152[] field312;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[[[Lkk;ZIII)Z", line = 7)
    public static final boolean method150(int arg0, class72[][][] arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field314++;
        byte var6 = arg2 ? 1 : (byte) (class188.field3055 & 0xFF);
        if (class142.field2301[class298.field4849][arg5][arg4] == var6) {
            return false;
        } else if ((class245.field4050[class298.field4849][arg5][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class1.field33[var7] = arg5;
            if (arg3 != 10807) {
                method151(6, 82);
            }
            int var31 = var7 + 1;
            class311.field5215[var7] = arg4;
            int var8 = 0;
            class142.field2301[class298.field4849][arg5][arg4] = var6;
            while (var31 != var8) {
                int var9 = class1.field33[var8] >> 16 & 0xFF;
                int var10 = class1.field33[var8] & 0xFFFF;
                int var11 = class1.field33[var8] >> 24 & 0xFF;
                int var12 = class311.field5215[var8] & 0xFFFF;
                int var13 = (class311.field5215[var8] & 0xFF0524) >> 16;
                boolean var14 = false;
                boolean var15 = false;
                var8 = var8 + 1 & 0xFFF;
                if ((class245.field4050[class298.field4849][var10][var12] & 0x4) == 0) {
                    var14 = true;
                }
                label244: for (int var16 = class298.field4849 + 1; var16 <= 3; var16++) {
                    if ((class245.field4050[var16][var10][var12] & 0x8) == 0) {
                        if (var14 && arg1[var16][var10][var12] != null) {
                            if (arg1[var16][var10][var12].field1224 != null) {
                                int var17 = class329.method2257(4197, var9);
                                if (arg1[var16][var10][var12].field1224.field3417 == var17 || arg1[var16][var10][var12].field1224.field3410 == var17) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var18 = class329.method2257(arg3 - 6610, var11);
                                    if (arg1[var16][var10][var12].field1224.field3417 == var18 || arg1[var16][var10][var12].field1224.field3410 == var18) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var19 = class329.method2257(4197, var13);
                                    if (arg1[var16][var10][var12].field1224.field3417 == var19 || arg1[var16][var10][var12].field1224.field3410 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var16][var10][var12].field1216 != null) {
                                for (int var20 = 0; var20 < arg1[var16][var10][var12].field1211; var20++) {
                                    int var21 = (int) (arg1[var16][var10][var12].field1216[var20].field2479 >> 14 & 0x3FL);
                                    int var22 = (int) (arg1[var16][var10][var12].field1216[var20].field2479 >> 20 & 0x3L);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var23 = var22 << 6 | var21;
                                    if (var9 == var23 || var11 != 0 && var11 == var23 || var13 != 0 && var13 == var23) {
                                        continue label244;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class72 var24 = arg1[var16][var10][var12];
                        if (var24 != null && var24.field1211 > 0) {
                            for (int var25 = 0; var25 < var24.field1211; var25++) {
                                class152 var26 = var24.field1216[var25];
                                if (var26.field2478 != var26.field2464 || var26.field2468 != var26.field2463) {
                                    for (int var27 = var26.field2464; var27 <= var26.field2478; var27++) {
                                        for (int var28 = var26.field2468; var28 <= var26.field2463; var28++) {
                                            class142.field2301[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class142.field2301[var16][var10][var12] = var6;
                    }
                }
                if (var15) {
                    if (class136.field2206[arg0] < class192.field3174[class298.field4849 + 1][var10][var12]) {
                        class136.field2206[arg0] = class192.field3174[class298.field4849 + 1][var10][var12];
                    }
                    int var29 = var10 << 7;
                    if (var29 < class331.field5632[arg0]) {
                        class331.field5632[arg0] = var29;
                    } else if (var29 > class148.field2389[arg0]) {
                        class148.field2389[arg0] = var29;
                    }
                    int var30 = var12 << 7;
                    if (class15.field187[arg0] > var30) {
                        class15.field187[arg0] = var30;
                    } else if (var30 > class222.field3659[arg0]) {
                        class222.field3659[arg0] = var30;
                    }
                }
                if (!var14) {
                    if (var10 >= 1 && class142.field2301[class298.field4849][var10 - 1][var12] != var6) {
                        class1.field33[var31] = class201.method1410(-754974720, class201.method1410(1179648, var10 - 1));
                        class311.field5215[var31] = class201.method1410(1245184, var12);
                        class142.field2301[class298.field4849][var10 - 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < 104) {
                        if (var10 - 1 >= 0 && class142.field2301[class298.field4849][var10 - 1][var12] != var6 && (class245.field4050[class298.field4849][var10][var12] & 0x4) == 0 && (class245.field4050[class298.field4849][var10 - 1][var12 - 1] & 0x4) == 0) {
                            class1.field33[var31] = class201.method1410(class201.method1410(var10 - 1, 1179648), 1375731712);
                            class311.field5215[var31] = class201.method1410(1245184, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class142.field2301[class298.field4849][var10 - 1][var12] = var6;
                        }
                        if (class142.field2301[class298.field4849][var10][var12] != var6) {
                            class1.field33[var31] = class201.method1410(class201.method1410(var10, 5373952), 318767104);
                            class311.field5215[var31] = class201.method1410(var12, 5439488);
                            class142.field2301[class298.field4849][var10][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var10 + 1 < 104 && class142.field2301[class298.field4849][var10 + 1][var12] != var6 && (class245.field4050[class298.field4849][var10][var12] & 0x4) == 0 && (class245.field4050[class298.field4849][var10 + 1][var12 - 1] & 0x4) == 0) {
                            class1.field33[var31] = class201.method1410(-1845493760, class201.method1410(var10 + 1, 5373952));
                            class311.field5215[var31] = class201.method1410(5439488, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class142.field2301[class298.field4849][var10 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if ((var10 + 1) < 104 && class142.field2301[class298.field4849][var10 + 1][var12] != var6) {
                        class1.field33[var31] = class201.method1410(1392508928, class201.method1410(var10 + 1, 9568256));
                        class311.field5215[var31] = class201.method1410(var12, 9633792);
                        class142.field2301[class298.field4849][var10 + 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var10 - 1 >= 0 && class142.field2301[class298.field4849][var10 - 1][var12] != var6 && (class245.field4050[class298.field4849][var10][var12] & 0x4) == 0 && (class245.field4050[class298.field4849][var10 - 1][var12 + 1] & 0x4) == 0) {
                            class1.field33[var31] = class201.method1410(301989888, class201.method1410(var10 - 1, 13762560));
                            class311.field5215[var31] = class201.method1410(13828096, var12);
                            class142.field2301[class298.field4849][var10 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class142.field2301[class298.field4849][var10][var12] != var6) {
                            class1.field33[var31] = class201.method1410(class201.method1410(13762560, var10), -1828716544);
                            class311.field5215[var31] = class201.method1410(13828096, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class142.field2301[class298.field4849][var10][var12] = var6;
                        }
                        if ((var10 + 1) < 104 && class142.field2301[class298.field4849][var10 + 1][var12] != var6 && (class245.field4050[class298.field4849][var10][var12] & 0x4) == 0 && (class245.field4050[class298.field4849][var10 + 1][var12 + 1] & 0x4) == 0) {
                            class1.field33[var31] = class201.method1410(-771751936, class201.method1410(9568256, var10 + 1));
                            class311.field5215[var31] = class201.method1410(9633792, var12);
                            class142.field2301[class298.field4849][var10 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class136.field2206[arg0] != -1000000) {
                class136.field2206[arg0] += 10;
                class331.field5632[arg0] -= 50;
                class148.field2389[arg0] += 50;
                class222.field3659[arg0] += 50;
                class15.field187[arg0] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)Z", line = 314)
    public static final boolean method151(int arg0, int arg1) {
        field311++;
        if (arg1 < 0) {
            return false;
        }
        if (arg0 > -110) {
            field306 = -101;
        }
        int var2 = class53.field748[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1004;
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)V", line = 342)
    public static void method152(int arg0) {
        field313 = null;
        if (arg0 != 1) {
            field312 = (class152[]) null;
        }
        field312 = null;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "([B)V", line = 357)
    public class24(byte[] arg0) {
        this.field308 = arg0;
    }
}
