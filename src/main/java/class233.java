import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class233 extends class168 {

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    private final int field4294;

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "I")
    private final int field4311;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    private final int field4295;

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
    private final int field4308;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "Lqe;")
    private static class179 field4293 = class206.method1380("Create a free account", (byte) -7);

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "Lqe;")
    public static class179 field4298 = class206.method1380(" )2>", (byte) -126);

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "[I")
    public static int[] field4297 = new int[32768];

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    public static int field4307 = 0;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "[I")
    public static int[] field4300 = new int[2000];

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "Lqe;")
    public static class179 field4306 = field4293;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "Z")
    public static boolean field4303;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
    public static void method1517(int arg0) {
        field4298 = null;
        field4297 = null;
        field4306 = null;
        field4293 = null;
        if (arg0 != -13810) {
            field4304 = -65;
        }
        field4300 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIB)V")
    public final void method471(int arg0, int arg1, byte arg2) {
        ++field4310;
        int var4 = 61 % ((-55 - arg2) / 63);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([BB)V")
    public static final void method1518(byte[] arg0, byte arg1) {
        ++field4309;
        class185 var2 = new class185(arg0);
        var2.field3432 = arg0.length - 2;
        class226.field4186 = var2.method1252(2);
        class187.field3493 = new int[class226.field4186];
        class143.field2611 = new int[class226.field4186];
        if (arg1 >= 58) {
            class173.field3102 = new byte[class226.field4186][];
            class150.field2703 = new int[class226.field4186];
            class31.field674 = new int[class226.field4186];
            var2.field3432 = arg0.length + -7 - class226.field4186 * 8;
            class22.field544 = var2.method1252(2);
            class9.field257 = var2.method1252(2);
            int var3 = 1 + (var2.method1243(3) & 255);
            for (int var4 = 0; ~var4 > ~class226.field4186; ++var4) {
                class31.field674[var4] = var2.method1252(2);
            }
            for (int var5 = 0; ~class226.field4186 < ~var5; ++var5) {
                class143.field2611[var5] = var2.method1252(2);
            }
            for (int var6 = 0; var6 < class226.field4186; ++var6) {
                class187.field3493[var6] = var2.method1252(2);
            }
            for (int var7 = 0; var7 < class226.field4186; ++var7) {
                class150.field2703[var7] = var2.method1252(2);
            }
            var2.field3432 = arg0.length + -(class226.field4186 * 8) - (7 - -((var3 - 1) * 3));
            class175.field3185 = new int[var3];
            for (int var8 = 1; ~var8 > ~var3; ++var8) {
                class175.field3185[var8] = var2.method1244(-27523);
                if (class175.field3185[var8] == 0) {
                    class175.field3185[var8] = 1;
                }
            }
            var2.field3432 = 0;
            for (int var9 = 0; var9 < class226.field4186; ++var9) {
                int var10 = class187.field3493[var9];
                int var11 = class150.field2703[var9];
                int var12 = var10 * var11;
                byte[] var13 = new byte[var12];
                class173.field3102[var9] = var13;
                int var14 = var2.method1243(3);
                if (~var14 == -1) {
                    for (int var15 = 0; var12 > var15; ++var15) {
                        var13[var15] = var2.method1204(false);
                    }
                } else if (var14 == 1) {
                    for (int var16 = 0; var10 > var16; ++var16) {
                        for (int var17 = 0; ~var11 < ~var17; ++var17) {
                            var13[var10 * var17 + var16] = var2.method1204(false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
    public static final void method1519(byte arg0) {
        class14.field342 = null;
        if (arg0 <= -92) {
            class143.field2605 = null;
            class66.field1340 = null;
            class119.field2238 = null;
            class70.field1408 = null;
            class28.field619 = null;
            class175.field3135 = null;
            class195.field3628 = null;
            class78.field1510 = null;
            class128.field2344 = null;
            ++field4301;
            class10.field286 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(IIIIIII)V")
    public class233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4294 = arg1;
        this.field4311 = arg0;
        this.field4295 = arg3;
        this.field4308 = arg2;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II[Lae;)V")
    public static final void method1520(int arg0, int arg1, class6[] arg2) {
        for (int var3 = arg1; arg2.length > var3; ++var3) {
            class6 var4 = arg2[var3];
            if (var4 != null && var4.field131 == arg0 && (!var4.field108 || !class32.method204(var4, -70))) {
                if (var4.field128 == 0) {
                    if (!var4.field108 && class32.method204(var4, -108) && class155.field2790 != var4) {
                        continue;
                    }
                    method1520(var4.field173, 0, arg2);
                    if (var4.field206 != null) {
                        method1520(var4.field173, 0, var4.field206);
                    }
                    class98 var5 = (class98) class36.field797.method909(-1, (long) var4.field173);
                    if (var5 != null) {
                        class239.method1552(var5.field1831, (byte) -92);
                    }
                }
                if (~var4.field128 == -7) {
                    if (var4.field184 != -1 || ~var4.field105 != 0) {
                        boolean var6 = class69.method443(var4, 27948);
                        int var7;
                        if (!var6) {
                            var7 = var4.field184;
                        } else {
                            var7 = var4.field105;
                        }
                        if (var7 != -1) {
                            class117 var8 = class239.method1550(var7, (byte) 107);
                            if (var8 != null) {
                                var4.field139 += class66.field1342;
                                while (~var8.field2199[var4.field195] > ~var4.field139) {
                                    var4.field139 -= var8.field2199[var4.field195];
                                    ++var4.field195;
                                    if (~var8.field2217.length >= ~var4.field195) {
                                        var4.field195 -= var8.field2208;
                                        if (var4.field195 < 0 || ~var8.field2217.length >= ~var4.field195) {
                                            var4.field195 = 0;
                                        }
                                    }
                                    class139.method880(var4, arg1 + 114);
                                }
                            }
                        }
                    }
                    if (var4.field78 != 0 && !var4.field108) {
                        int var9 = var4.field78 >> 16;
                        int var10 = class66.field1342 * var9;
                        var4.field163 = var4.field163 + var10 & 2047;
                        int var11 = var4.field78 << 16 >> 16;
                        int var12 = class66.field1342 * var11;
                        var4.field199 = 2047 & var4.field199 + var12;
                        class139.method880(var4, 110);
                    }
                }
            }
        }
        ++field4305;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)V")
    public final void method474(int arg0, int arg1, int arg2) {
        ++field4302;
        int var4 = this.field4308 * arg1 >> 12;
        if (arg0 != 24730) {
            this.method473(true, 3, 6);
        }
        int var5 = this.field4311 * arg1 >> 12;
        int var6 = this.field4294 * arg2 >> 12;
        int var7 = this.field4295 * arg2 >> 12;
        class185.method1209(var5, super.field3027, var6, var4, super.field3033, super.field3026, (byte) 56, var7);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZII)V")
    public final void method473(boolean arg0, int arg1, int arg2) {
        ++field4292;
        int var4 = this.field4311 * arg1 >> 12;
        int var5 = this.field4294 * arg2 >> 12;
        if (!arg0) {
            int var6 = this.field4308 * arg1 >> 12;
            int var7 = this.field4295 * arg2 >> 12;
            class150.method958(var5, var4, var6, super.field3026, var7, 1);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)V")
    public static final void method1521(boolean arg0, int arg1) {
        class146.field2649 = arg1;
        ++field4299;
        if (!arg0) {
            field4304 = -8;
        }
        class232.field4282 = 50;
    }
}
