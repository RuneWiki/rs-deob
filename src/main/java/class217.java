import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class217 extends class77 {

    @OriginalMember(owner = "client!u", name = "D", descriptor = "Ldc;")
    public static class37 field4028 = class185.method1233((byte) 86, "0(U");

    @OriginalMember(owner = "client!u", name = "L", descriptor = "Ldc;")
    private static class37 field4036 = class185.method1233((byte) 86, "Jan");

    @OriginalMember(owner = "client!u", name = "K", descriptor = "Ldc;")
    private static class37 field4035 = class185.method1233((byte) 86, "Nov");

    @OriginalMember(owner = "client!u", name = "E", descriptor = "Ldc;")
    private static class37 field4029 = class185.method1233((byte) 86, "Feb");

    @OriginalMember(owner = "client!u", name = "ab", descriptor = "Ldc;")
    private static class37 field4051 = class185.method1233((byte) 86, "Dec");

    @OriginalMember(owner = "client!u", name = "O", descriptor = "Ldc;")
    private static class37 field4039 = class185.method1233((byte) 86, "May");

    @OriginalMember(owner = "client!u", name = "M", descriptor = "Ldc;")
    private static class37 field4037 = class185.method1233((byte) 86, "Jul");

    @OriginalMember(owner = "client!u", name = "U", descriptor = "Lfb;")
    public static class57 field4045 = null;

    @OriginalMember(owner = "client!u", name = "V", descriptor = "Ldc;")
    private static class37 field4046 = class185.method1233((byte) 86, "Apr");

    @OriginalMember(owner = "client!u", name = "W", descriptor = "Ldc;")
    private static class37 field4047 = class185.method1233((byte) 86, "Sep");

    @OriginalMember(owner = "client!u", name = "eb", descriptor = "Ldc;")
    private static class37 field4055 = class185.method1233((byte) 86, "Jun");

    @OriginalMember(owner = "client!u", name = "F", descriptor = "Ldc;")
    private static class37 field4030 = class185.method1233((byte) 86, "Aug");

    @OriginalMember(owner = "client!u", name = "bb", descriptor = "Ldc;")
    private static class37 field4052 = class185.method1233((byte) 86, "Oct");

    @OriginalMember(owner = "client!u", name = "gb", descriptor = "Ldc;")
    private static class37 field4057 = class185.method1233((byte) 86, "Mar");

    @OriginalMember(owner = "client!u", name = "fb", descriptor = "[I")
    public static int[] field4056 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "[Ldc;")
    public static class37[] field4049 = new class37[] { field4036, field4029, field4057, field4046, field4039, field4055, field4037, field4030, field4047, field4052, field4035, field4051 };

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "Lbb;")
    public static class14 field4041 = new class14(64);

    @OriginalMember(owner = "client!u", name = "ib", descriptor = "Z")
    public static boolean field4059 = false;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    public int field4031;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    public int field4038;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    public int field4043;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "I")
    public int field4044;

    @OriginalMember(owner = "client!u", name = "hb", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!u", name = "db", descriptor = "Lmf;")
    public static class136 field4054;

    @OriginalMember(owner = "client!u", name = "cb", descriptor = "Lwa;")
    public static class238 field4053;

    @OriginalMember(owner = "client!u", name = "X", descriptor = "Ldc;")
    public class37 field4048;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "[I")
    public int[] field4033;

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "[I")
    public int[] field4050;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "[Lng;")
    public static class148[] field4042;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "[Loa;")
    public class153[] field4032;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "[Ldc;")
    public class37[] field4034;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "[[B")
    public static byte[][] field4040;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lih;)V")
    public static final void method1437(class94 arg0) {
        for (int var1 = arg0.field1639; var1 <= arg0.field1651; var1++) {
            for (int var2 = arg0.field1645; var2 <= arg0.field1637; var2++) {
                class18 var3 = class180.field3354[arg0.field1636][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field290; var4++) {
                        if (var3.field289[var4] == arg0) {
                            var3.field290--;
                            for (int var5 = var4; var5 < var3.field290; var5++) {
                                var3.field289[var5] = var3.field289[var5 + 1];
                                var3.field285[var5] = var3.field285[var5 + 1];
                            }
                            var3.field289[var3.field290] = null;
                            break;
                        }
                    }
                    var3.field301 = 0;
                    for (int var6 = 0; var6 < var3.field290; var6++) {
                        var3.field301 |= var3.field285[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V")
    public static void method1438(int arg0) {
        field4037 = null;
        field4047 = null;
        field4042 = null;
        field4030 = null;
        field4046 = null;
        field4054 = null;
        field4057 = null;
        field4029 = null;
        field4049 = null;
        field4051 = null;
        field4040 = null;
        field4053 = null;
        field4028 = null;
        field4045 = null;
        field4036 = null;
        field4041 = null;
        field4055 = null;
        int var1 = 109 / ((-arg0 - 29) / 43);
        field4035 = null;
        field4039 = null;
        field4052 = null;
        field4056 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)Z")
    public static final boolean method1439(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class31.field630; var3++) {
            class127 var4 = class6.field68[var3];
            if (var4.field2361 == 1) {
                int var5 = var4.field2376 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2368 * var5 >> 8) + var4.field2373;
                    int var7 = (var4.field2350 * var5 >> 8) + var4.field2359;
                    int var8 = (var4.field2378 * var5 >> 8) + var4.field2356;
                    int var9 = (var4.field2372 * var5 >> 8) + var4.field2351;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2361 == 2) {
                int var10 = arg0 - var4.field2376;
                if (var10 > 0) {
                    int var11 = (var4.field2368 * var10 >> 8) + var4.field2373;
                    int var12 = (var4.field2350 * var10 >> 8) + var4.field2359;
                    int var13 = (var4.field2378 * var10 >> 8) + var4.field2356;
                    int var14 = (var4.field2372 * var10 >> 8) + var4.field2351;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2361 == 3) {
                int var15 = var4.field2373 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2367 * var15 >> 8) + var4.field2376;
                    int var17 = (var4.field2371 * var15 >> 8) + var4.field2358;
                    int var18 = (var4.field2378 * var15 >> 8) + var4.field2356;
                    int var19 = (var4.field2372 * var15 >> 8) + var4.field2351;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2361 == 4) {
                int var20 = arg2 - var4.field2373;
                if (var20 > 0) {
                    int var21 = (var4.field2367 * var20 >> 8) + var4.field2376;
                    int var22 = (var4.field2371 * var20 >> 8) + var4.field2358;
                    int var23 = (var4.field2378 * var20 >> 8) + var4.field2356;
                    int var24 = (var4.field2372 * var20 >> 8) + var4.field2351;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2361 == 5) {
                int var25 = arg1 - var4.field2356;
                if (var25 > 0) {
                    int var26 = (var4.field2367 * var25 >> 8) + var4.field2376;
                    int var27 = (var4.field2371 * var25 >> 8) + var4.field2358;
                    int var28 = (var4.field2368 * var25 >> 8) + var4.field2373;
                    int var29 = (var4.field2350 * var25 >> 8) + var4.field2359;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)I")
    public static final int method1440(int arg0, int arg1) {
        field4058++;
        if (arg0 >= 65 && arg0 <= 90 || !(arg0 < 192 || arg0 > 222 || arg0 == 215)) {
            return arg0 + 32;
        } else if (arg1 != 192) {
            return -10;
        } else if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else {
            return arg0;
        }
    }
}
