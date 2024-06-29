import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class172 extends class144 {

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "I")
    private int field2450 = 4096;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "I")
    private int field2457 = 0;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "[I")
    public static int[] field2454 = new int[99];

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "[[B")
    public static byte[][] field2459;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "Z")
    public static boolean field2461;

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILbc;IIZ)V")
    public static final void method1121(int arg0, int arg1, class282 arg2, int arg3, int arg4, boolean arg5) {
        class177.field2517 = arg5;
        if (arg3 >= 56) {
            class117.field1645 = arg2;
            class226.field3176 = 10000;
            class296.field4676 = 1;
            class110.field1475 = arg4;
            class99.field1331 = arg1;
            class188.field2692 = arg0;
            ++field2453;
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class172() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "(I)V")
    public static void method1122(int arg0) {
        field2454 = null;
        field2459 = null;
        if (arg0 != 50) {
            field2461 = false;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILbc;II)Lpg;")
    public static final class187 method1123(int arg0, class282 arg1, int arg2, int arg3) {
        ++field2458;
        int var4 = -46 % ((arg2 - 59) / 61);
        return !class282.method1875(arg1, arg0, 0, arg3) ? null : class96.method576((byte) 112);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        ++field2451;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field2450 = arg1.method1380(true);
            }
        } else {
            this.field2457 = arg1.method1380(true);
        }
        if (arg2 != 20630) {
            field2459 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        if (arg1 != 255) {
            this.field2457 = 24;
        }
        ++field2452;
        int[] var3 = super.field2069.method425(true, arg0);
        if (super.field2069.field820) {
            int[] var4 = this.method934(arg1 ^ -18756, 0, arg0);
            for (int var5 = 0; ~var5 > ~class104.field1411; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field2457 && ~this.field2450 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(CI)Z")
    public static final boolean method1124(char arg0, int arg1) {
        ++field2455;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg1 != -339) {
            return false;
        } else if (~arg0 <= -161 && ~arg0 >= -256) {
            return true;
        } else {
            return ~arg0 == -8365 || ~arg0 == -339 || ~arg0 == -8213 || ~arg0 == -340 || arg0 == 376;
        }
    }

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "(I)V")
    public static final void method1125(int arg0) {
        ++field2456;
        if (class209.field2948 == null) {
            if (class131.field1886 == null) {
                int var1 = class52.field599;
                if (class177.field2518) {
                    if (~var1 != -2) {
                        int var2 = class104.field1417;
                        int var3 = class37.field431;
                        if (class263.field3814 - 10 > var2 || ~(class263.field3814 + 10 + class267.field3901) > ~var2 || class221.field3134 + -10 > var3 || ~(class76.field911 + class221.field3134 + 10) > ~var3) {
                            class177.field2518 = false;
                            class9.method66(class267.field3901, class76.field911, class263.field3814, arg0 + 6100, class221.field3134);
                        }
                    }
                    if (var1 == 1) {
                        int var4 = class221.field3134;
                        int var5 = class263.field3814;
                        int var6 = class267.field3901;
                        int var7 = class190.field2736;
                        int var8 = class76.field905;
                        int var9 = -1;
                        for (int var10 = 0; ~class112.field1496 < ~var10; ++var10) {
                            if (!class154.field2226) {
                                int var11 = (-var10 + class112.field1496 + -1) * 15 + var4 + 31;
                                if (~var8 < ~var5 && var8 < var5 - -var6 && var11 - 13 < var7 && var7 < var11 - -3) {
                                    var9 = var10;
                                }
                            } else {
                                int var12 = (-var10 + class112.field1496 - 1) * 15 + (var4 - -33);
                                if (var5 < var8 && var8 < var5 + var6 && ~var7 < ~(var12 - 13) && ~(var12 - -3) < ~var7) {
                                    var9 = var10;
                                }
                            }
                        }
                        if (~var9 != 0) {
                            class119.method773(0, var9);
                        }
                        class177.field2518 = false;
                        class9.method66(class267.field3901, class76.field911, class263.field3814, -35, class221.field3134);
                    }
                } else {
                    if (var1 == 1 && ~class112.field1496 < -1) {
                        short var13 = class190.field2749[class112.field1496 - 1];
                        if (var13 == 34 || var13 == 43 || var13 == 30 || var13 == 15 || ~var13 == -46 || var13 == 12 || var13 == 50 || ~var13 == -3 || ~var13 == -59 || var13 == 39 || ~var13 == -34 || var13 == 1004) {
                            int var14 = class271.field3978[class112.field1496 + -1];
                            int var15 = class240.field3485[class112.field1496 + -1];
                            class82 var16 = class182.method1187((byte) -41, var14);
                            class178 var17 = client.method1920(var16);
                            if (var17.method1153(true) || var17.method1149((byte) 83)) {
                                class97.field1287 = false;
                                class205.field2910 = 0;
                                if (class209.field2948 != null) {
                                    class255.method1632(arg0 ^ -16717815, class209.field2948);
                                }
                                class209.field2948 = class182.method1187((byte) -41, var14);
                                class173.field2482 = class76.field905;
                                class40.field476 = class190.field2736;
                                class287.field4474 = var15;
                                class255.method1632(16711680, class209.field2948);
                                return;
                            }
                        }
                    }
                    if (~var1 == -2 && (~class59.field704 == -2 && ~class112.field1496 < -3 || class5.method29(class112.field1496 + -1, (byte) -37))) {
                        var1 = 2;
                    }
                    if (~var1 == -3 && class112.field1496 > 0 || ~class253.field3661 == -2) {
                        class255.method1631(256);
                    }
                    if (~var1 == -2 && ~class112.field1496 < -1 || class253.field3661 == 2) {
                        class292.method1957(-28);
                    }
                }
                if (arg0 != -6135) {
                    field2460 = 86;
                }
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) (300.0D * Math.pow(2.0D, (double) var2 / 7.0D) + (double) var2);
            var0 += var3;
            field2454[var1] = var0 / 4;
        }
        field2459 = new byte[250][];
        field2460 = 0;
        field2461 = true;
    }
}
