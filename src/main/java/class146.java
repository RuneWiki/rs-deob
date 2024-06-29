import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class146 {

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field3527 = 0;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "[I")
    public static int[] field3524 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Z")
    public static volatile boolean field3523 = false;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "[I")
    public static int[] field3532 = new int[256];

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field3529 = 78;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "[Lwd;")
    public static class150[] field3537 = new class150[200];

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lwd;")
    private static class150 field3533 = class2.method9(true, "Ok");

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Lwd;")
    public static class150 field3530 = field3533;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lwd;")
    public static class150 field3526 = class2.method9(true, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lwd;")
    public static class150 field3531 = class2.method9(true, "scape main");

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Lwd;")
    public static class150 field3542;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Lwd;")
    public static class150 field3543;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Lnc;")
    public static class93 field3541;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILff;)Lqd;")
    public static final class114 method1091(int arg0, int arg1, class42 arg2) {
        field3528++;
        if (class61.method482(arg1, arg2, true)) {
            if (arg0 <= 52) {
                method1093(true, -37, 90, null, -97);
            }
            return class46.method347(-2658);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1092(int arg0) {
        field3541 = null;
        field3543 = null;
        field3542 = null;
        field3530 = null;
        field3533 = null;
        field3526 = null;
        field3531 = null;
        field3532 = null;
        field3524 = null;
        if (arg0 <= 42) {
            method1093(false, 93, 78, null, -84);
        }
        field3537 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZIILqa;I)V")
    public static final void method1093(boolean arg0, int arg1, int arg2, class111 arg3, int arg4) {
        if (arg0) {
            field3526 = null;
        }
        field3536++;
        if (class46.field1244 == arg3 || class125.field2900 >= 400) {
            return;
        }
        class150 var5;
        if (arg3.field2552 == 0) {
            var5 = class111.method786((byte) 90, new class150[] { arg3.field2555, class66.method509(class46.field1244.field2540, 11146, arg3.field2540), class104.field2357, class127.field2933, class29.method239(1000, arg3.field2540), class47.field1275 });
        } else {
            var5 = class111.method786((byte) 40, new class150[] { arg3.field2555, class104.field2357, class65.field1649, class29.method239(1000, arg3.field2552), class47.field1275 });
        }
        if (class130.field3060 == 1) {
            class55.field1448++;
            class68.method521(arg1, 9, class9.field214, false, arg2, class111.method786((byte) -128, new class150[] { class78.field1923, class20.field530, var5 }), arg4);
        } else if (!class90.field2095) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (class76.field1865[var6] != null) {
                    class104.field2355++;
                    short var8 = 0;
                    if (class76.field1865[var6].method1181(true, class109.field2514)) {
                        if (arg3.field2540 > class46.field1244.field2540) {
                            var8 = 2000;
                        }
                        if (class46.field1244.field2556 != 0 && arg3.field2556 != 0) {
                            if (class46.field1244.field2556 == arg3.field2556) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class1.field3[var6]) {
                        var8 = 2000;
                    }
                    int var9 = 0;
                    if (var6 == 0) {
                        var9 = var8 + 37;
                    }
                    if (var6 == 1) {
                        var9 = var8 + 58;
                    }
                    if (var6 == 2) {
                        var9 = var8 + 49;
                    }
                    if (var6 == 3) {
                        var9 = var8 + 34;
                    }
                    if (var6 == 4) {
                        var9 = var8 + 36;
                    }
                    class68.method521(arg1, var9, class76.field1865[var6], arg0, arg2, class111.method786((byte) -117, new class150[] { class3.field59, var5 }), arg4);
                }
            }
        } else if ((class56.field1466 & 0x8) == 8) {
            class68.method521(arg1, 26, class80.field1937, arg0, arg2, class111.method786((byte) 28, new class150[] { class68.field1727, class20.field530, var5 }), arg4);
            class145.field3518++;
        }
        for (int var7 = 0; var7 < class125.field2900; var7++) {
            if (class66.field1687[var7] == 55) {
                class2.field50[var7] = class111.method786((byte) -108, new class150[] { class73.field1815, class50.field1369, class3.field59, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
    public static final void method1094(boolean arg0) {
        class37.field1022 = null;
        class83.field2009 = null;
        class128.field3040 = null;
        field3535++;
        class11.field281 = null;
        class118.field2738 = null;
        class94.field2189 = null;
        if (!arg0) {
            return;
        }
        class1.field6 = null;
        class43.field1195 = null;
        class145.field3521 = null;
        class111.field2559 = null;
        class58.field1495 = null;
        class21.field595 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lff;IBI)Z")
    public static final boolean method1095(class42 arg0, int arg1, byte arg2, int arg3) {
        field3525++;
        byte[] var4 = arg0.method315(arg3, true, arg1);
        if (var4 == null) {
            return false;
        }
        if (arg2 != 21) {
            field3533 = null;
        }
        class42.method307(var4, (byte) -89);
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLva;)Lva;")
    public static final class141 method1096(byte arg0, class141 arg1) {
        field3534++;
        class141 var2 = class49.method368(-5380, arg1);
        if (arg0 != -70) {
            field3531 = null;
        }
        if (var2 == null) {
            var2 = arg1.field3305;
        }
        return var2;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IZ)Lva;")
    public static final class141 method1097(int arg0, boolean arg1) {
        field3538++;
        int var2 = arg0 >> 16;
        if (!arg1) {
            field3526 = null;
        }
        int var3 = arg0 & 0xFFFF;
        if (class58.field1500[var2] == null || class58.field1500[var2][var3] == null) {
            boolean var4 = class145.method1090(-84, var2);
            if (!var4) {
                return null;
            }
        }
        return class58.field1500[var2][var3];
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3532[var0] = var1;
        }
        field3542 = class2.method9(true, "leuchten2:");
        field3543 = class2.method9(true, "headicons_prayer");
    }
}
