import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class31 extends class217 {

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "Lta;")
    public static class197 field397 = new class197(500);

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
    public static int field400 = 0;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "[I")
    public static int[] field399 = new int[128];

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "[I")
    public static int[] field401 = new int[2];

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZIZ)V", line = 6)
    public static final void method216(int arg0, boolean arg1, int arg2, boolean arg3) {
        int var4 = 0;
        if (arg0 != 15198) {
            method217((byte) 76, (class211) null);
        }
        int var10002;
        while (class122.field1923 > var4) {
            class45 var5 = class161.field2394[class126.field1995[var4]];
            if (var5 != null && var5.method409(1) && var5.field698.method1325(0)) {
                label268: {
                    int var6 = var5.method929(12);
                    if (arg3) {
                        if (!var5.field698.field2786) {
                            break label268;
                        }
                    } else if (var5.field698.field2788 != arg1 || arg2 != 0 && arg2 != var6) {
                        break label268;
                    }
                    if (var6 == 1) {
                        if ((var5.field4507 & 0x7F) == 64 && (var5.field4496 & 0x7F) == 64) {
                            int var13 = var5.field4496 >> 7;
                            int var14 = var5.field4507 >> 7;
                            if (var14 >= 0 && var14 < 104 && var13 >= 0 && var13 < 104) {
                                var10002 = class96.field1410[var14][var13]++;
                            }
                        }
                    } else if (((var6 & 0x1) != 0 || (var5.field4507 & 0x7F) == 0 && (var5.field4496 & 0x7F) == 0) && ((var6 & 0x1) != 1 || (var5.field4507 & 0x7F) == 64 && (var5.field4496 & 0x7F) == 64)) {
                        int var7 = var5.field4507 - (var6 * 64) >> 7;
                        int var8 = var5.field4496 - (var6 * 64) >> 7;
                        int var9 = var5.method929(12) + var7;
                        int var10 = var8 + var5.method929(arg0 - 15186);
                        if (var7 < 0) {
                            var7 = 0;
                        }
                        if (var9 > 104) {
                            var9 = 104;
                        }
                        if (var10 > 104) {
                            var10 = 104;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        for (int var11 = var7; var11 < var9; var11++) {
                            for (int var12 = var8; var12 < var10; var12++) {
                                var10002 = class96.field1410[var11][var12]++;
                            }
                        }
                    }
                }
            }
            var4++;
        }
        field393++;
        label208: for (int var15 = 0; var15 < class122.field1923; var15++) {
            class45 var16 = class161.field2394[class126.field1995[var15]];
            long var17 = (long) class126.field1995[var15] << 32 | 0x20000000L;
            if (var16 != null && var16.method409(1) && var16.field698.method1325(0)) {
                int var19 = var16.method929(arg0 - 15186);
                if (arg3) {
                    if (!var16.field698.field2786) {
                        continue;
                    }
                } else if (arg1 != var16.field698.field2788 || arg2 != 0 && arg2 != var19) {
                    continue;
                }
                var16.field4500 = true;
                if (var19 == 1) {
                    if ((var16.field4507 & 0x7F) == 64 && (var16.field4496 & 0x7F) == 64) {
                        int var20 = var16.field4507 >> 7;
                        int var21 = var16.field4496 >> 7;
                        if (var20 < 0 || var20 >= 104 || var21 < 0 || var21 >= 104) {
                            continue;
                        }
                        if (class96.field1410[var20][var21] > 1) {
                            var10002 = class96.field1410[var20][var21]--;
                            continue;
                        }
                    }
                } else if ((var19 & 0x1) == 0 && (var16.field4507 & 0x7F) == 0 && (var16.field4496 & 0x7F) == 0 || (var19 & 0x1) == 1 && (var16.field4507 & 0x7F) == 64 && (var16.field4496 & 0x7F) == 64) {
                    int var22 = var16.field4507 - (var19 * 64) >> 7;
                    int var23 = var19 + var22;
                    if (var23 > 104) {
                        var23 = 104;
                    }
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    boolean var24 = true;
                    int var25 = var16.field4496 - var19 * 64 >> 7;
                    int var26 = var19 + var25;
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (var26 > 104) {
                        var26 = 104;
                    }
                    for (int var27 = var22; var27 < var23; var27++) {
                        for (int var28 = var25; var28 < var26; var28++) {
                            if (class96.field1410[var27][var28] <= 1) {
                                var24 = false;
                                break;
                            }
                        }
                    }
                    if (var24) {
                        int var29 = var22;
                        while (true) {
                            if (var23 <= var29) {
                                continue label208;
                            }
                            for (int var30 = var25; var30 < var26; var30++) {
                                var10002 = class96.field1410[var29][var30]--;
                            }
                            var29++;
                        }
                    }
                }
                var16.field4500 = false;
                if (!var16.field698.field2785) {
                    var17 |= Long.MIN_VALUE;
                }
                var16.field4510 = class294.method2080(arg0 - 14299, var16.field4496, var16.field4507, class50.field775);
                class141.method1063(class50.field775, var16.field4507, var16.field4496, var16.field4510, (var19 - 1) * 64 + 60, var16, var16.field4438, var17, var16.field4459);
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLlb;)V", line = 257)
    public static final void method217(byte arg0, class211 arg1) {
        if (arg0 > -3) {
            field398 = -88;
        }
        field391++;
        class58.field861 = arg1;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(II)V", line = 275)
    public class31(int arg0, int arg1) {
        this.field392 = arg1;
        this.field395 = arg0;
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(B)Z", line = 285)
    public static final boolean method218(byte arg0) {
        if (arg0 != 49) {
            method220(35, 53, 6, -102, 95, 20, 72, -71);
        }
        field390++;
        try {
            return class211.method1510(true);
        } catch (IOException var5) {
            class198.method1440((byte) 22);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class138.field2146 + "," + class320.field4983 + "," + class270.field4083 + " - " + class79.field1112 + "," + (class235.field3602.field4477[0] + class302.field4735) + "," + (class235.field3602.field4470[0] + class110.field1744) + " - ";
            for (int var4 = 0; var4 < class79.field1112 && var4 < 50; var4++) {
                var3 = var3 + class88.field1293.field437[var4] + ",";
            }
            class50.method464((byte) 45, var3, var6);
            class205.method1471((byte) 59);
            return true;
        }
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(B)V", line = 315)
    public static void method219(byte arg0) {
        field399 = null;
        field397 = null;
        if (arg0 != 94) {
            method218((byte) -57);
        }
        field401 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIIII)V", line = 327)
    public static final void method220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field394++;
        if (arg0 >= class298.field4667 && arg6 <= class327.field5072 && class34.field432 <= arg7 && class75.field1064 >= arg2) {
            class98.method772(arg0, arg2, -126, arg7, arg6, arg1, arg5, arg4);
        } else {
            class211.method1503(arg7, arg1, arg4, arg0, 0, arg5, arg2, arg6);
        }
        if (arg3 <= 4) {
            method219((byte) -24);
        }
    }

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "(B)I", line = 345)
    public static final int method221(byte arg0) {
        if (arg0 != 118) {
            return -7;
        }
        field396++;
        if ((double) class175.field2588 == 3.0D) {
            return 37;
        } else if ((double) class175.field2588 == 4.0D) {
            return 50;
        } else if ((double) class175.field2588 == 6.0D) {
            return 75;
        } else if ((double) class175.field2588 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }
}
