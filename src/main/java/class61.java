import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class61 extends class46 {

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "[I")
    public static int[] field981 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field986 = 0;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "Ljava/util/Calendar;")
    public static Calendar field987 = Calendar.getInstance();

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public int field982;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "[[[I")
    public static int[][][] field989;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([[[Lff;IIZII)Z", line = 10)
    public static final boolean method478(class142[][][] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var6 = 60 % ((arg4 - 2) / 36);
        byte var7 = arg3 ? 1 : (byte) (class294.field4556 & 0xFF);
        field984++;
        if (class294.field4555[class205.field3101][arg2][arg1] == var7) {
            return false;
        } else if ((class92.field1468[class205.field3101][arg2][arg1] & 0x4) == 0) {
            return false;
        } else {
            byte var8 = 0;
            int var9 = 0;
            class141.field2189[var8] = arg2;
            int var32 = var8 + 1;
            class136.field2150[var8] = arg1;
            class294.field4555[class205.field3101][arg2][arg1] = var7;
            while (var32 != var9) {
                int var10 = class141.field2189[var9] >> 16 & 0xFF;
                int var11 = class141.field2189[var9] & 0xFFFF;
                int var12 = class141.field2189[var9] >> 24 & 0xFF;
                int var13 = class136.field2150[var9] & 0xFFFF;
                int var14 = class136.field2150[var9] >> 16 & 0xFF;
                var9 = var9 + 1 & 0xFFF;
                boolean var15 = false;
                boolean var16 = false;
                if ((class92.field1468[class205.field3101][var11][var13] & 0x4) == 0) {
                    var15 = true;
                }
                label235: for (int var17 = class205.field3101 + 1; var17 <= 3; var17++) {
                    if ((class92.field1468[var17][var11][var13] & 0x8) == 0) {
                        if (var15 && arg0[var17][var11][var13] != null) {
                            if (arg0[var17][var11][var13].field2213 != null) {
                                int var18 = class232.method1635(var10, false);
                                if (arg0[var17][var11][var13].field2213.field1595 == var18 || arg0[var17][var11][var13].field2213.field1605 == var18) {
                                    continue;
                                }
                                if (var12 != 0) {
                                    int var19 = class232.method1635(var12, false);
                                    if (arg0[var17][var11][var13].field2213.field1595 == var19 || arg0[var17][var11][var13].field2213.field1605 == var19) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var20 = class232.method1635(var14, false);
                                    if (arg0[var17][var11][var13].field2213.field1595 == var20 || arg0[var17][var11][var13].field2213.field1605 == var20) {
                                        continue;
                                    }
                                }
                            }
                            if (arg0[var17][var11][var13].field2197 != null) {
                                for (int var21 = 0; var21 < arg0[var17][var11][var13].field2204; var21++) {
                                    int var22 = (int) (arg0[var17][var11][var13].field2197[var21].field402 >> 14 & 0x3FL);
                                    int var23 = (int) (arg0[var17][var11][var13].field2197[var21].field402 >> 20 & 0x3L);
                                    if (var22 == 21) {
                                        var22 = 19;
                                    }
                                    int var24 = var22 | var23 << 6;
                                    if (var10 == var24 || var12 != 0 && var12 == var24 || var14 != 0 && var14 == var24) {
                                        continue label235;
                                    }
                                }
                            }
                        }
                        var16 = true;
                        class142 var25 = arg0[var17][var11][var13];
                        if (var25 != null && var25.field2204 > 0) {
                            for (int var26 = 0; var26 < var25.field2204; var26++) {
                                class26 var27 = var25.field2197[var26];
                                if (var27.field411 != var27.field405 || var27.field410 != var27.field396) {
                                    for (int var28 = var27.field411; var28 <= var27.field405; var28++) {
                                        for (int var29 = var27.field410; var29 <= var27.field396; var29++) {
                                            class294.field4555[var17][var28][var29] = var7;
                                        }
                                    }
                                }
                            }
                        }
                        class294.field4555[var17][var11][var13] = var7;
                    }
                }
                if (var16) {
                    if (class218.field3321[class205.field3101 + 1][var11][var13] > class299.field4660[arg5]) {
                        class299.field4660[arg5] = class218.field3321[class205.field3101 + 1][var11][var13];
                    }
                    int var30 = var13 << 7;
                    int var31 = var11 << 7;
                    if (class85.field1382[arg5] > var31) {
                        class85.field1382[arg5] = var31;
                    } else if (class73.field1204[arg5] < var31) {
                        class73.field1204[arg5] = var31;
                    }
                    if (var30 < class257.field4028[arg5]) {
                        class257.field4028[arg5] = var30;
                    } else if (var30 > class270.field4199[arg5]) {
                        class270.field4199[arg5] = var30;
                    }
                }
                if (!var15) {
                    if (var11 >= 1 && class294.field4555[class205.field3101][var11 - 1][var13] != var7) {
                        class141.field2189[var32] = class222.method1577(-754974720, class222.method1577(1179648, var11 - 1));
                        class136.field2150[var32] = class222.method1577(1245184, var13);
                        class294.field4555[class205.field3101][var11 - 1][var13] = var7;
                        var32 = var32 + 1 & 0xFFF;
                    }
                    var13++;
                    if (var13 < 104) {
                        if ((var11 - 1) >= 0 && class294.field4555[class205.field3101][var11 - 1][var13] != var7 && (class92.field1468[class205.field3101][var11][var13] & 0x4) == 0 && (class92.field1468[class205.field3101][var11 - 1][var13 - 1] & 0x4) == 0) {
                            class141.field2189[var32] = class222.method1577(1375731712, class222.method1577(1179648, var11 - 1));
                            class136.field2150[var32] = class222.method1577(1245184, var13);
                            class294.field4555[class205.field3101][var11 - 1][var13] = var7;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if (class294.field4555[class205.field3101][var11][var13] != var7) {
                            class141.field2189[var32] = class222.method1577(318767104, class222.method1577(var11, 5373952));
                            class136.field2150[var32] = class222.method1577(var13, 5439488);
                            class294.field4555[class205.field3101][var11][var13] = var7;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if ((var11 + 1) < 104 && class294.field4555[class205.field3101][var11 + 1][var13] != var7 && (class92.field1468[class205.field3101][var11][var13] & 0x4) == 0 && (class92.field1468[class205.field3101][var11 + 1][var13 - 1] & 0x4) == 0) {
                            class141.field2189[var32] = class222.method1577(-1845493760, class222.method1577(var11 + 1, 5373952));
                            class136.field2150[var32] = class222.method1577(var13, 5439488);
                            class294.field4555[class205.field3101][var11 + 1][var13] = var7;
                            var32 = var32 + 1 & 0xFFF;
                        }
                    }
                    var13--;
                    if ((var11 + 1) < 104 && class294.field4555[class205.field3101][var11 + 1][var13] != var7) {
                        class141.field2189[var32] = class222.method1577(1392508928, class222.method1577(9568256, var11 + 1));
                        class136.field2150[var32] = class222.method1577(var13, 9633792);
                        var32 = var32 + 1 & 0xFFF;
                        class294.field4555[class205.field3101][var11 + 1][var13] = var7;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if ((var11 - 1) >= 0 && class294.field4555[class205.field3101][var11 - 1][var13] != var7 && (class92.field1468[class205.field3101][var11][var13] & 0x4) == 0 && (class92.field1468[class205.field3101][var11 - 1][var13 + 1] & 0x4) == 0) {
                            class141.field2189[var32] = class222.method1577(301989888, class222.method1577(13762560, var11 - 1));
                            class136.field2150[var32] = class222.method1577(var13, 13828096);
                            class294.field4555[class205.field3101][var11 - 1][var13] = var7;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if (class294.field4555[class205.field3101][var11][var13] != var7) {
                            class141.field2189[var32] = class222.method1577(-1828716544, class222.method1577(13762560, var11));
                            class136.field2150[var32] = class222.method1577(13828096, var13);
                            class294.field4555[class205.field3101][var11][var13] = var7;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if ((var11 + 1) < 104 && class294.field4555[class205.field3101][var11 + 1][var13] != var7 && (class92.field1468[class205.field3101][var11][var13] & 0x4) == 0 && (class92.field1468[class205.field3101][var11 + 1][var13 + 1] & 0x4) == 0) {
                            class141.field2189[var32] = class222.method1577(class222.method1577(9568256, var11 + 1), -771751936);
                            class136.field2150[var32] = class222.method1577(var13, 9633792);
                            var32 = var32 + 1 & 0xFFF;
                            class294.field4555[class205.field3101][var11 + 1][var13] = var7;
                        }
                    }
                }
            }
            if (class299.field4660[arg5] != -1000000) {
                class299.field4660[arg5] += 10;
                class85.field1382[arg5] -= 50;
                class73.field1204[arg5] += 50;
                class270.field4199[arg5] += 50;
                class257.field4028[arg5] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V", line = 314)
    public static void method479(int arg0) {
        field989 = (int[][][]) null;
        if (arg0 == -1) {
            field981 = null;
            field987 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILl;II)Lgm;", line = 326)
    public static final class249 method480(int arg0, class133 arg1, int arg2, int arg3) {
        if (arg2 != -10353) {
            method478((class142[][][]) ((class142[][][]) null), -96, -3, true, 85, 121);
        }
        field988++;
        return class181.method1296(false, arg1, arg3, arg0) ? class313.method2125(-11032) : null;
    }
}
