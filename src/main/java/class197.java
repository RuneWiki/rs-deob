import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class197 extends OutputStream {

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Z")
    public static boolean field2894 = false;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "D")
    public static double field2893 = -1.0D;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2900 = "Please wait...";

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "J")
    public static long field2901 = 0L;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lnc;IZI)V")
    public static final void method1391(class12 arg0, int arg1, boolean arg2, int arg3) {
        if (arg0.field3741 == arg1 && arg1 != -1) {
            class76 var4 = class232.method1609((byte) -32, arg1);
            int var5 = var4.field1202;
            if (var5 == 1) {
                arg0.field3677 = arg3;
                arg0.field3692 = 1;
                arg0.field3740 = 0;
                arg0.field3713 = 0;
                arg0.field3747 = 0;
                class32.method208(arg0.field3660, arg0.field3747, true, false, arg0.field3753, var4);
            }
            if (var5 == 2) {
                arg0.field3713 = 0;
            }
        } else if (arg1 == -1 || arg0.field3741 == -1 || class232.method1609((byte) -32, arg1).field1214 >= class232.method1609((byte) -32, arg0.field3741).field1214) {
            arg0.field3692 = 1;
            arg0.field3713 = 0;
            arg0.field3740 = 0;
            arg0.field3741 = arg1;
            arg0.field3747 = 0;
            arg0.field3695 = arg0.field3710;
            arg0.field3677 = arg3;
            if (arg0.field3741 != -1) {
                class32.method208(arg0.field3660, arg0.field3747, true, false, arg0.field3753, class232.method1609((byte) -32, arg0.field3741));
            }
        }
        field2899++;
        if (arg2) {
            field2893 = -0.5420823539458047D;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static void method1392(int arg0) {
        field2900 = null;
        if (arg0 != 0) {
            field2894 = true;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lhc;I)V")
    public static final void method1393(class53 arg0, int arg1) {
        field2895++;
        int var2 = -10 % ((-arg1 - 59) / 34);
        byte[] var3 = new byte[24];
        if (class259.field4007 != null) {
            try {
                class259.field4007.method546(0L, (byte) 127);
                class259.field4007.method552(var3, (byte) -128);
                int var4;
                for (var4 = 0; var4 < 24 && var3[var4] == 0; var4++) {
                }
                if (var4 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var3[var5] = -1;
                }
            }
        }
        arg0.method384(24, 0, var3, 23037);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public static final void method1394(int arg0) {
        field2892++;
        if (arg0 != 4095) {
            method1396(-14);
        }
        class35.field449.method1420((byte) -108);
        class52.field712.method1420((byte) -53);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[[[Lf;ZIIB)Z")
    public static final boolean method1395(int arg0, class313[][][] arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        field2898++;
        byte var6 = arg2 ? 1 : (byte) (class62.field949 & 0xFF);
        if (class228.field3361[class37.field474][arg3][arg4] == var6) {
            return false;
        } else if ((class253.field3806[class37.field474][arg3][arg4] & 0x4) == 0) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            class158.field2460[var8] = arg3;
            int var32 = var8 + 1;
            class181.field2719[var8] = arg4;
            class228.field3361[class37.field474][arg3][arg4] = var6;
            while (var7 != var32) {
                int var10 = class158.field2460[var7] & 0xFFFF;
                int var11 = (class158.field2460[var7] & 0xFF3AB8) >> 16;
                int var12 = class158.field2460[var7] >> 24 & 0xFF;
                int var13 = class181.field2719[var7] & 0xFFFF;
                boolean var14 = false;
                int var15 = (class181.field2719[var7] & 0xFF5E61) >> 16;
                var7 = var7 + 1 & 0xFFF;
                boolean var16 = false;
                if ((class253.field3806[class37.field474][var10][var13] & 0x4) == 0) {
                    var16 = true;
                }
                label225: for (int var17 = class37.field474 + 1; var17 <= 3; var17++) {
                    if ((class253.field3806[var17][var10][var13] & 0x8) == 0) {
                        if (var16 && arg1[var17][var10][var13] != null) {
                            if (arg1[var17][var10][var13].field5012 != null) {
                                int var20 = class287.method1964((byte) 10, var11);
                                if (arg1[var17][var10][var13].field5012.field3398 == var20 || arg1[var17][var10][var13].field5012.field3389 == var20) {
                                    continue;
                                }
                                if (var12 != 0) {
                                    int var21 = class287.method1964((byte) 10, var12);
                                    if (arg1[var17][var10][var13].field5012.field3398 == var21 || arg1[var17][var10][var13].field5012.field3389 == var21) {
                                        continue;
                                    }
                                }
                                if (var15 != 0) {
                                    int var22 = class287.method1964((byte) 10, var15);
                                    if (arg1[var17][var10][var13].field5012.field3398 == var22 || arg1[var17][var10][var13].field5012.field3389 == var22) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var17][var10][var13].field5037 != null) {
                                for (int var23 = 0; var23 < arg1[var17][var10][var13].field5022; var23++) {
                                    int var24 = (int) (arg1[var17][var10][var13].field5037[var23].field2431 >> 14 & 0x3FL);
                                    if (var24 == 21) {
                                        var24 = 19;
                                    }
                                    int var25 = (int) (arg1[var17][var10][var13].field5037[var23].field2431 >> 20 & 0x3L);
                                    int var26 = var25 << 6 | var24;
                                    if (var11 == var26 || var12 != 0 && var12 == var26 || var15 != 0 && var15 == var26) {
                                        continue label225;
                                    }
                                }
                            }
                        }
                        class313 var27 = arg1[var17][var10][var13];
                        var14 = true;
                        if (var27 != null && var27.field5022 > 0) {
                            for (int var28 = 0; var28 < var27.field5022; var28++) {
                                class156 var29 = var27.field5037[var28];
                                if (var29.field2447 != var29.field2443 || var29.field2441 != var29.field2432) {
                                    for (int var30 = var29.field2443; var30 <= var29.field2447; var30++) {
                                        for (int var31 = var29.field2432; var31 <= var29.field2441; var31++) {
                                            class228.field3361[var17][var30][var31] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class228.field3361[var17][var10][var13] = var6;
                    }
                }
                if (var14) {
                    if (class209.field3088[arg0] < class103.field1792[class37.field474 + 1][var10][var13]) {
                        class209.field3088[arg0] = class103.field1792[class37.field474 + 1][var10][var13];
                    }
                    int var18 = var10 << 7;
                    if (var18 < class284.field4563[arg0]) {
                        class284.field4563[arg0] = var18;
                    } else if (class169.field2560[arg0] < var18) {
                        class169.field2560[arg0] = var18;
                    }
                    int var19 = var13 << 7;
                    if (var19 < class35.field447[arg0]) {
                        class35.field447[arg0] = var19;
                    } else if (class57.field824[arg0] < var19) {
                        class57.field824[arg0] = var19;
                    }
                }
                if (!var16) {
                    if (var10 >= 1 && class228.field3361[class37.field474][var10 - 1][var13] != var6) {
                        class158.field2460[var32] = class200.method1408(class200.method1408(1179648, var10 - 1), -754974720);
                        class181.field2719[var32] = class200.method1408(1245184, var13);
                        var32 = var32 + 1 & 0xFFF;
                        class228.field3361[class37.field474][var10 - 1][var13] = var6;
                    }
                    var13++;
                    if (var13 < 104) {
                        if (var10 - 1 >= 0 && class228.field3361[class37.field474][var10 - 1][var13] != var6 && (class253.field3806[class37.field474][var10][var13] & 0x4) == 0 && (class253.field3806[class37.field474][var10 - 1][var13 - 1] & 0x4) == 0) {
                            class158.field2460[var32] = class200.method1408(1375731712, class200.method1408(var10 - 1, 1179648));
                            class181.field2719[var32] = class200.method1408(var13, 1245184);
                            class228.field3361[class37.field474][var10 - 1][var13] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if (class228.field3361[class37.field474][var10][var13] != var6) {
                            class158.field2460[var32] = class200.method1408(318767104, class200.method1408(5373952, var10));
                            class181.field2719[var32] = class200.method1408(5439488, var13);
                            class228.field3361[class37.field474][var10][var13] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if ((var10 + 1) < 104 && class228.field3361[class37.field474][var10 + 1][var13] != var6 && (class253.field3806[class37.field474][var10][var13] & 0x4) == 0 && (class253.field3806[class37.field474][var10 + 1][var13 - 1] & 0x4) == 0) {
                            class158.field2460[var32] = class200.method1408(class200.method1408(var10 + 1, 5373952), -1845493760);
                            class181.field2719[var32] = class200.method1408(5439488, var13);
                            class228.field3361[class37.field474][var10 + 1][var13] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                    }
                    var13--;
                    if (var10 + 1 < 104 && class228.field3361[class37.field474][var10 + 1][var13] != var6) {
                        class158.field2460[var32] = class200.method1408(1392508928, class200.method1408(var10 + 1, 9568256));
                        class181.field2719[var32] = class200.method1408(var13, 9633792);
                        class228.field3361[class37.field474][var10 + 1][var13] = var6;
                        var32 = var32 + 1 & 0xFFF;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if (var10 - 1 >= 0 && class228.field3361[class37.field474][var10 - 1][var13] != var6 && (class253.field3806[class37.field474][var10][var13] & 0x4) == 0 && (class253.field3806[class37.field474][var10 - 1][var13 + 1] & 0x4) == 0) {
                            class158.field2460[var32] = class200.method1408(class200.method1408(var10 - 1, 13762560), 301989888);
                            class181.field2719[var32] = class200.method1408(13828096, var13);
                            var32 = var32 + 1 & 0xFFF;
                            class228.field3361[class37.field474][var10 - 1][var13] = var6;
                        }
                        if (class228.field3361[class37.field474][var10][var13] != var6) {
                            class158.field2460[var32] = class200.method1408(-1828716544, class200.method1408(var10, 13762560));
                            class181.field2719[var32] = class200.method1408(13828096, var13);
                            class228.field3361[class37.field474][var10][var13] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if (var10 + 1 < 104 && class228.field3361[class37.field474][var10 + 1][var13] != var6 && (class253.field3806[class37.field474][var10][var13] & 0x4) == 0 && (class253.field3806[class37.field474][var10 + 1][var13 + 1] & 0x4) == 0) {
                            class158.field2460[var32] = class200.method1408(class200.method1408(9568256, var10 + 1), -771751936);
                            class181.field2719[var32] = class200.method1408(9633792, var13);
                            var32 = var32 + 1 & 0xFFF;
                            class228.field3361[class37.field474][var10 + 1][var13] = var6;
                        }
                    }
                }
            }
            if (class209.field3088[arg0] != -1000000) {
                class209.field3088[arg0] += 10;
                class284.field4563[arg0] -= 50;
                class169.field2560[arg0] += 50;
                class57.field824[arg0] += 50;
                class35.field447[arg0] -= 50;
            }
            int var9 = 50 / ((arg5 + 13) / 55);
            return true;
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public static final void method1396(int arg0) {
        if (arg0 != 30900) {
            method1392(18);
        }
        field2903++;
        if (class74.field1172 != class37.field474 && class264.method1824((byte) 61, class37.field474)) {
            class74.field1172 = class37.field474;
        }
    }

    @OriginalMember(owner = "client!ef", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field2902++;
        throw new IOException();
    }
}
