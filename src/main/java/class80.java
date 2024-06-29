import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class80 {

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "[I")
    public static int[] field1292 = new int[32];

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field1294 = 0;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field1298 = 0;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Lsc;")
    public static class181 field1296 = class149.method967(255, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Ldg;")
    public static class90 field1293;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "[I")
    public static int[] field1291;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static void method556(int arg0) {
        field1296 = null;
        if (arg0 != 12669) {
            field1288 = -21;
        }
        field1291 = null;
        field1292 = null;
        field1293 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BIIIII)V")
    public static final void method557(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1295++;
        int var8 = arg1 + 1;
        class171.method1133(class149.field2507[arg1], arg2, arg4, arg3, (byte) 126);
        int var9 = arg5 - 1;
        class171.method1133(class149.field2507[arg5], arg2, arg4, arg3, (byte) 125);
        if (arg0 >= 66) {
            for (int var6 = var8; var6 <= var9; var6++) {
                int[] var7 = class149.field2507[var6];
                var7[arg2] = var7[arg3] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)I")
    public static final int method558(boolean arg0) {
        if (arg0) {
            return -16;
        } else {
            field1297++;
            return 6;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB[Lo;)V")
    public static final void method559(int arg0, byte arg1, class175[] arg2) {
        int var3 = 0;
        if (arg1 != -113) {
            field1289 = -95;
        }
        while (var3 < arg2.length) {
            class175 var4 = arg2[var3];
            if (var4 != null && var4.field2958 == arg0 && (!var4.field2972 || !client.method1059(var4))) {
                label99: {
                    if (var4.field3069 == 0) {
                        if (!var4.field2972 && client.method1059(var4) && class151.field2517 != var4) {
                            break label99;
                        }
                        method559(var4.field2987, (byte) -113, arg2);
                        if (var4.field3066 != null) {
                            method559(var4.field2987, (byte) -113, var4.field3066);
                        }
                        class228 var5 = (class228) class165.field2807.method1424(true, (long) var4.field2987);
                        if (var5 != null) {
                            class61.method441(var5.field3913, (byte) 93);
                        }
                    }
                    if (var4.field3069 == 6) {
                        if (var4.field3063 != -1 || var4.field3049 != -1) {
                            boolean var6 = class237.method1621((byte) -103, var4);
                            int var7;
                            if (var6) {
                                var7 = var4.field3049;
                            } else {
                                var7 = var4.field3063;
                            }
                            if (var7 != -1) {
                                class254 var8 = class128.method827(var7, 95);
                                if (var8 != null) {
                                    var4.field2998 += class258.field4504;
                                    while (var8.field4456[var4.field3038] < var4.field2998) {
                                        var4.field2998 -= var8.field4456[var4.field3038];
                                        var4.field3038++;
                                        if (var8.field4431.length <= var4.field3038) {
                                            var4.field3038 -= var8.field4424;
                                            if (var4.field3038 < 0 || var4.field3038 >= var8.field4431.length) {
                                                var4.field3038 = 0;
                                            }
                                        }
                                        class218.method1453((byte) -81, var4);
                                    }
                                }
                            }
                        }
                        if (var4.field3000 != 0 && !var4.field2972) {
                            int var9 = var4.field3000 << 16 >> 16;
                            int var10 = var4.field3000 >> 16;
                            int var11 = class258.field4504 * var10;
                            var4.field2967 = var4.field2967 + var11 & 0x7FF;
                            int var12 = class258.field4504 * var9;
                            var4.field3048 = var4.field3048 + var12 & 0x7FF;
                            class218.method1453((byte) -95, var4);
                        }
                    }
                }
            }
            var3++;
        }
        field1290++;
    }
}
