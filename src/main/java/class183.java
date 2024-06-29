import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class183 {

    @OriginalMember(owner = "client!im", name = "c", descriptor = "Z")
    public static boolean field2517 = true;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field2521 = -1;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2520 = "flash3:";

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "J")
    public long field2522;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "Lkm;")
    public static class133 field2525;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "Lim;")
    public class183 field2518;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "Lim;")
    public class183 field2523;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BI)I", line = 4)
    public static final int method1271(byte arg0, int arg1) {
        field2516++;
        if (arg0 != 120) {
            method1271((byte) 72, 37);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)Z", line = 15)
    public final boolean method1272(byte arg0) {
        field2519++;
        if (this.field2518 == null) {
            return false;
        } else {
            if (arg0 != -66) {
                field2517 = false;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZIIZ)V", line = 40)
    public static final void method1273(boolean arg0, int arg1, int arg2, boolean arg3) {
        int var4 = -71 / ((82 - arg2) / 35);
        int var10002;
        for (int var5 = 0; var5 < class338.field5084; var5++) {
            class329 var6 = class42.field484[class257.field3807[var5]];
            if (var6 != null && var6.method1652((byte) -50) && var6.field4961.method1265(7797)) {
                int var7 = var6.method1653(-1);
                if (arg0) {
                    if (!var6.field4961.field2445) {
                        continue;
                    }
                } else if (var6.field4961.field2483 != arg3 || arg1 != 0 && arg1 != var7) {
                    continue;
                }
                if (var7 == 1) {
                    if ((var6.field3745 & 0x7F) == 64 && (var6.field3679 & 0x7F) == 64) {
                        int var14 = var6.field3745 >> 7;
                        int var15 = var6.field3679 >> 7;
                        if (var14 >= 0 && var14 < 104 && var15 >= 0 && var15 < 104) {
                            var10002 = class203.field2908[var14][var15]++;
                        }
                    }
                } else if (((var7 & 0x1) != 0 || (var6.field3745 & 0x7F) == 0 && (var6.field3679 & 0x7F) == 0) && ((var7 & 0x1) != 1 || (var6.field3745 & 0x7F) == 64 && (var6.field3679 & 0x7F) == 64)) {
                    int var8 = var6.field3679 - (var7 * 64) >> 7;
                    int var9 = var6.field3745 - (var7 * 64) >> 7;
                    int var10 = var9 + var6.method1653(-1);
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    if (var10 > 104) {
                        var10 = 104;
                    }
                    int var11 = var6.method1653(-1) + var8;
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    if (var11 > 104) {
                        var11 = 104;
                    }
                    for (int var12 = var9; var12 < var10; var12++) {
                        for (int var13 = var8; var13 < var11; var13++) {
                            var10002 = class203.field2908[var12][var13]++;
                        }
                    }
                }
            }
        }
        field2515++;
        label209: for (int var16 = 0; var16 < class338.field5084; var16++) {
            class329 var17 = class42.field484[class257.field3807[var16]];
            long var18 = (long) class257.field3807[var16] << 32 | 0x20000000L;
            if (var17 != null && var17.method1652((byte) -50) && var17.field4961.method1265(7797)) {
                int var20 = var17.method1653(-1);
                if (arg0) {
                    if (!var17.field4961.field2445) {
                        continue;
                    }
                } else if (arg3 != var17.field4961.field2483 || arg1 != 0 && arg1 != var20) {
                    continue;
                }
                var17.field3736 = true;
                if (var20 == 1) {
                    if ((var17.field3745 & 0x7F) == 64 && (var17.field3679 & 0x7F) == 64) {
                        int var30 = var17.field3745 >> 7;
                        int var31 = var17.field3679 >> 7;
                        if (var30 < 0 || var30 >= 104 || var31 < 0 || var31 >= 104) {
                            continue;
                        }
                        if (class203.field2908[var30][var31] > 1) {
                            var10002 = class203.field2908[var30][var31]--;
                            continue;
                        }
                    }
                } else if ((var20 & 0x1) == 0 && (var17.field3745 & 0x7F) == 0 && (var17.field3679 & 0x7F) == 0 || (var20 & 0x1) == 1 && (var17.field3745 & 0x7F) == 64 && (var17.field3679 & 0x7F) == 64) {
                    int var21 = var17.field3679 - var20 * 64 >> 7;
                    int var22 = var17.field3745 - var20 * 64 >> 7;
                    int var23 = var20 + var22;
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    if (var23 > 104) {
                        var23 = 104;
                    }
                    boolean var24 = true;
                    int var25 = var21 + var20;
                    if (var25 > 104) {
                        var25 = 104;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var26 = var22; var26 < var23; var26++) {
                        for (int var27 = var21; var27 < var25; var27++) {
                            if (class203.field2908[var26][var27] <= 1) {
                                var24 = false;
                                break;
                            }
                        }
                    }
                    if (var24) {
                        int var28 = var22;
                        while (true) {
                            if (var28 >= var23) {
                                continue label209;
                            }
                            for (int var29 = var21; var29 < var25; var29++) {
                                var10002 = class203.field2908[var28][var29]--;
                            }
                            var28++;
                        }
                    }
                }
                if (!var17.field4961.field2461) {
                    var18 |= Long.MIN_VALUE;
                }
                var17.field3736 = false;
                var17.field3761 = class135.method985(var17.field3679, class251.field3603, var17.field3745, (byte) -95);
                class126.method913(class251.field3603, var17.field3745, var17.field3679, var17.field3761, (var20 - 1) * 64 + 60, var17, var17.field3746, var18, var17.field3698);
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V", line = 293)
    public final void method1274(byte arg0) {
        field2526++;
        if (this.field2518 == null) {
            return;
        }
        this.field2518.field2523 = this.field2523;
        if (arg0 == -26) {
            this.field2523.field2518 = this.field2518;
            this.field2523 = null;
            this.field2518 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(B)V", line = 327)
    public static void method1275(byte arg0) {
        field2525 = null;
        if (arg0 != -105) {
            field2520 = (String) null;
        }
        field2520 = null;
    }
}
