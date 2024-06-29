import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class80 {

    @OriginalMember(owner = "client!v", name = "l", descriptor = "J")
    public long field1026 = 0L;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "[I")
    public static int[] field1019 = new int[100];

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field1020 = 0;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lii;")
    public static class227 field1029 = new class227(64);

    @OriginalMember(owner = "client!v", name = "v", descriptor = "F")
    public static float field1036;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public int field1015;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public int field1016;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public int field1022;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public int field1028;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public int field1030;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public int field1032;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public int field1035;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "J")
    public static long field1034;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Llc;")
    public static class175 field1018;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "Lcc;")
    public static class263 field1037;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Len;")
    public class47 field1024;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I", line = 14)
    public static final int method475(int arg0, int arg1) {
        field1017++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        if (arg0 == 1397417249) {
            int var5 = var4 | var4 >>> 4;
            int var6 = var5 | var5 >>> 8;
            int var7 = var6 | var6 >>> 16;
            return ~var7 & arg1;
        } else {
            return 62;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 36)
    public static final void method476(int arg0) {
        int var1 = 0;
        if (arg0 != 1397417249) {
            method479(26, 82, 72);
        }
        while (var1 < class127.field1735) {
            int var2 = class269.field4238[var1];
            class184 var3 = class223.field3159[var2];
            if (var3 != null) {
                class78.method464((byte) 113, var3.field2657.field4420, var3);
            }
            var1++;
        }
        field1031++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 63)
    public static void method477(byte arg0) {
        field1029 = null;
        if (arg0 != -79) {
            field1036 = -1.1981611F;
        }
        field1019 = null;
        field1037 = null;
        field1018 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZBZ)V", line = 82)
    public static final void method478(int arg0, boolean arg1, byte arg2, boolean arg3) {
        int var10002;
        for (int var4 = 0; var4 < class127.field1735; var4++) {
            class184 var5 = class223.field3159[class269.field4238[var4]];
            if (var5 != null && var5.method744(8) && var5.field2657.method2016((byte) -74)) {
                int var6 = var5.method748(false);
                if (arg3) {
                    if (!var5.field2657.field4405) {
                        continue;
                    }
                } else if (arg1 != var5.field2657.field4393 || arg0 != 0 && arg0 != var6) {
                    continue;
                }
                if (var6 == 1) {
                    if ((var5.field2392 & 0x7F) == 64 && (var5.field2357 & 0x7F) == 64) {
                        int var13 = var5.field2357 >> 7;
                        int var14 = var5.field2392 >> 7;
                        if (var14 >= 0 && var14 < 104 && var13 >= 0 && var13 < 104) {
                            var10002 = class17.field233[var14][var13]++;
                        }
                    }
                } else if (((var6 & 0x1) != 0 || (var5.field2392 & 0x7F) == 0 && (var5.field2357 & 0x7F) == 0) && ((var6 & 0x1) != 1 || (var5.field2392 & 0x7F) == 64 && (var5.field2357 & 0x7F) == 64)) {
                    int var7 = var5.field2357 - (var6 * 64) >> 7;
                    int var8 = var5.field2392 - var6 * 64 >> 7;
                    int var9 = var5.method748(false) + var8;
                    if (var9 > 104) {
                        var9 = 104;
                    }
                    int var10 = var7 + var5.method748(false);
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    if (var10 > 104) {
                        var10 = 104;
                    }
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    for (int var11 = var8; var11 < var9; var11++) {
                        for (int var12 = var7; var12 < var10; var12++) {
                            var10002 = class17.field233[var11][var12]++;
                        }
                    }
                }
            }
        }
        int var15 = 0;
        if (arg2 <= 55) {
            field1020 = 15;
        }
        while (class127.field1735 > var15) {
            long var16 = (long) class269.field4238[var15] << 32 | 0x20000000L;
            class184 var18 = class223.field3159[class269.field4238[var15]];
            if (var18 != null && var18.method744(8) && var18.field2657.method2016((byte) -123)) {
                label269: {
                    int var19 = var18.method748(false);
                    if (arg3) {
                        if (!var18.field2657.field4405) {
                            break label269;
                        }
                    } else if (var18.field2657.field4393 != arg1 || arg0 != 0 && arg0 != var19) {
                        break label269;
                    }
                    var18.field2383 = true;
                    if (var19 == 1) {
                        if ((var18.field2392 & 0x7F) == 64 && (var18.field2357 & 0x7F) == 64) {
                            int var20 = var18.field2392 >> 7;
                            int var21 = var18.field2357 >> 7;
                            if (var20 < 0 || var20 >= 104 || var21 < 0 || var21 >= 104) {
                                break label269;
                            }
                            if (class17.field233[var20][var21] > 1) {
                                var10002 = class17.field233[var20][var21]--;
                                break label269;
                            }
                        }
                    } else if ((var19 & 0x1) == 0 && (var18.field2392 & 0x7F) == 0 && (var18.field2357 & 0x7F) == 0 || (var19 & 0x1) == 1 && (var18.field2392 & 0x7F) == 64 && (var18.field2357 & 0x7F) == 64) {
                        int var22 = var18.field2357 - (var19 * 64) >> 7;
                        int var23 = var18.field2392 - (var19 * 64) >> 7;
                        int var24 = var23 + var19;
                        if (var24 > 104) {
                            var24 = 104;
                        }
                        int var25 = var22 + var19;
                        boolean var26 = true;
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        if (var23 < 0) {
                            var23 = 0;
                        }
                        if (var25 > 104) {
                            var25 = 104;
                        }
                        for (int var27 = var23; var27 < var24; var27++) {
                            for (int var28 = var22; var28 < var25; var28++) {
                                if (class17.field233[var27][var28] <= 1) {
                                    var26 = false;
                                    break;
                                }
                            }
                        }
                        if (var26) {
                            int var29 = var23;
                            while (true) {
                                if (var29 >= var24) {
                                    break label269;
                                }
                                for (int var30 = var22; var30 < var25; var30++) {
                                    var10002 = class17.field233[var29][var30]--;
                                }
                                var29++;
                            }
                        }
                    }
                    var18.field2383 = false;
                    if (!var18.field2657.field4435) {
                        var16 |= Long.MIN_VALUE;
                    }
                    var18.field2386 = class184.method1278(class138.field1940, -13660, var18.field2357, var18.field2392);
                    class93.method554(class138.field1940, var18.field2392, var18.field2357, var18.field2386, (var19 - 1) * 64 + 60, var18, var18.field2368, var16, var18.field2441);
                }
            }
            var15++;
        }
        field1023++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)Lej;", line = 340)
    public static final class168 method479(int arg0, int arg1, int arg2) {
        class225 var3 = class158.field2184[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class168 var4 = var3.field3196;
            var3.field3196 = null;
            return var4;
        }
    }
}
