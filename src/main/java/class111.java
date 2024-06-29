import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class111 {

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field1918 = 1;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Lid;")
    private static class149 field1920 = class60.method382("Loaded world list data", (byte) 121);

    @OriginalMember(owner = "client!th", name = "e", descriptor = "[I")
    public static int[] field1919 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Lid;")
    public static class149 field1917 = field1920;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Lid;")
    public static class149 field1916 = class60.method382(":chalreq:", (byte) 50);

    @OriginalMember(owner = "client!th", name = "k", descriptor = "Lid;")
    public static class149 field1925 = class60.method382("<col=80ff00>", (byte) 26);

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Z")
    public static boolean field1921 = true;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V")
    public static void method783(boolean arg0) {
        field1916 = null;
        field1917 = null;
        field1925 = null;
        field1920 = null;
        if (arg0) {
            field1919 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)V")
    public static final void method784(int arg0, byte arg1) {
        field1924++;
        if (arg0 >= 0 && arg0 < class210.field3745.length && arg1 == -126) {
            class210.field3745[arg0] = !class210.field3745[arg0];
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static final void method785(byte arg0) {
        class171.field3150.method1290((byte) 22);
        class210.field3746.method1290((byte) -107);
        if (arg0 >= -23) {
            method784(-53, (byte) 79);
        }
        field1915++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)V")
    public static final void method786(int arg0, boolean arg1) {
        field1923++;
        int var2 = class253.field4432;
        if (class77.field1449.field2347 >> 7 == class210.field3748 && class77.field1449.field2340 >> 7 == class141.field2598) {
            class210.field3748 = 0;
        }
        if (arg1) {
            var2 = 1;
        }
        int var3 = 0;
        if (arg0 < 47) {
            method784(106, (byte) -102);
        }
        int var10002;
        while (var3 < var2) {
            class127 var20;
            if (arg1) {
                var20 = class77.field1449;
            } else {
                var20 = class107.field1851[class251.field4407[var3]];
            }
            if (var20 != null && var20.method117((byte) 62)) {
                int var21 = var20.method885((byte) -27);
                if (var21 == 1) {
                    if ((var20.field2347 & 0x7F) == 64 && (var20.field2340 & 0x7F) == 64) {
                        int var28 = var20.field2340 >> 7;
                        int var29 = var20.field2347 >> 7;
                        if (var29 >= 0 && var29 < 104 && var28 >= 0 && var28 < 104) {
                            var10002 = class47.field785[var29][var28]++;
                        }
                    }
                } else if (((var21 & 0x1) != 0 || (var20.field2347 & 0x7F) == 0 && (var20.field2340 & 0x7F) == 0) && ((var21 & 0x1) != 1 || (var20.field2347 & 0x7F) == 64 && (var20.field2340 & 0x7F) == 64)) {
                    int var22 = var20.field2340 - (var21 * 64) >> 7;
                    int var23 = var20.field2347 - (var21 * 64) >> 7;
                    int var24 = var23 + var20.method885((byte) -72);
                    int var25 = var20.method885((byte) -60) + var22;
                    if (var24 > 104) {
                        var24 = 104;
                    }
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    if (var25 > 104) {
                        var25 = 104;
                    }
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    for (int var26 = var23; var26 < var24; var26++) {
                        for (int var27 = var22; var27 < var25; var27++) {
                            var10002 = class47.field785[var26][var27]++;
                        }
                    }
                }
            }
            var3++;
        }
        label213: for (int var4 = 0; var4 < var2; var4++) {
            class127 var5;
            long var6;
            if (arg1) {
                var5 = class77.field1449;
                var6 = 8791798054912L;
            } else {
                var5 = class107.field1851[class251.field4407[var4]];
                var6 = (long) class251.field4407[var4] << 32;
            }
            if (var5 != null && var5.method117((byte) 62)) {
                var5.field2222 = false;
                if ((class283.field5003 && class253.field4432 > 200 || class253.field4432 > 50) && !arg1 && var5.field2334 == var5.method923((byte) -41).field4718) {
                    var5.field2222 = true;
                }
                int var8 = var5.method885((byte) -68);
                if (var8 == 1) {
                    if ((var5.field2347 & 0x7F) == 64 && (var5.field2340 & 0x7F) == 64) {
                        int var18 = var5.field2347 >> 7;
                        int var19 = var5.field2340 >> 7;
                        if (var18 < 0 || var18 >= 104 || var19 < 0 || var19 >= 104) {
                            continue;
                        }
                        if (class47.field785[var18][var19] > 1) {
                            var10002 = class47.field785[var18][var19]--;
                            continue;
                        }
                    }
                } else if ((var8 & 0x1) == 0 && (var5.field2347 & 0x7F) == 0 && (var5.field2340 & 0x7F) == 0 || (var8 & 0x1) == 1 && (var5.field2347 & 0x7F) == 64 && (var5.field2340 & 0x7F) == 0) {
                    int var9 = var5.field2347 - (var8 * 64) >> 7;
                    int var10 = var8 + var9;
                    int var11 = var5.field2340 - (var8 * 64) >> 7;
                    if (var10 > 104) {
                        var10 = 104;
                    }
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    boolean var12 = true;
                    int var13 = var8 + var11;
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    if (var13 > 104) {
                        var13 = 104;
                    }
                    for (int var14 = var9; var14 < var10; var14++) {
                        for (int var17 = var11; var17 < var13; var17++) {
                            if (class47.field785[var14][var17] <= 1) {
                                var12 = false;
                                break;
                            }
                        }
                    }
                    if (var12) {
                        int var15 = var9;
                        while (true) {
                            if (var15 >= var10) {
                                continue label213;
                            }
                            for (int var16 = var11; var16 < var13; var16++) {
                                var10002 = class47.field785[var15][var16]--;
                            }
                            var15++;
                        }
                    }
                }
                if (var5.field2361 == null || class118.field2022 < var5.field2320 || var5.field2356 <= class118.field2022) {
                    var5.field2329 = class287.method1968(class277.field4948, var5.field2347, var5.field2340, (byte) 117);
                    class131.method927(class277.field4948, var5.field2347, var5.field2340, var5.field2329, var8 * 64 + 60 - 64, var5, var5.field2354, var6, var5.field2313);
                } else {
                    var5.field2222 = false;
                    var5.field2329 = class287.method1968(class277.field4948, var5.field2347, var5.field2340, (byte) -71);
                    class213.method1446(class277.field4948, var5.field2347, var5.field2340, var5.field2329, var5, var5.field2354, var6, var5.field2385, var5.field2357, var5.field2407, var5.field2367);
                }
            }
        }
    }
}
