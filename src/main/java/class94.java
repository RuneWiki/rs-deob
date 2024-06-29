import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class94 {

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Lqf;")
    public static class117 field2279 = class72.method514(114, ": ");

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Lqf;")
    private static class117 field2281 = class72.method514(119, "FULL");

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "Lqf;")
    public static class117 field2280 = field2281;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Leb;")
    public static class31 field2277 = new class31(64);

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Lqf;")
    private static class117 field2282 = class72.method514(109, "Sorry invited players only)3");

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "[Lqf;")
    public static class117[] field2285 = new class117[20];

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Lqf;")
    public static class117 field2286 = field2282;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "Leb;")
    public static class31 field2283 = new class31(64);

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field2287 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBILla;IIII)V")
    public static final void method741(int arg0, byte arg1, int arg2, class77 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 <= 124) {
            field2287 = 118;
        }
        if (arg6 >= 0 && arg6 < 104 && arg5 >= 0 && arg5 < 104) {
            class73.field1606[arg4][arg6][arg5] = 0;
            while (true) {
                int var8 = arg3.method570((byte) 123);
                if (var8 == 0) {
                    if (arg4 == 0) {
                        class64.field1306[0][arg6][arg5] = -class20.method158(79, arg5 + arg2 + 556238, arg6 + 932731 + arg7) * 8;
                    } else {
                        class64.field1306[arg4][arg6][arg5] = class64.field1306[arg4 - 1][arg6][arg5] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg3.method570((byte) 123);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg4 == 0) {
                        class64.field1306[0][arg6][arg5] = -var9 * 8;
                    } else {
                        class64.field1306[arg4][arg6][arg5] = class64.field1306[arg4 - 1][arg6][arg5] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class147.field3598[arg4][arg6][arg5] = arg3.method592((byte) -108);
                    class121.field2884[arg4][arg6][arg5] = (byte) ((var8 - 2) / 4);
                    class45.field883[arg4][arg6][arg5] = (byte) class16.method135(3, arg0 + var8 - 2);
                } else if (var8 <= 81) {
                    class73.field1606[arg4][arg6][arg5] = (byte) (var8 - 49);
                } else {
                    class68.field1419[arg4][arg6][arg5] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg3.method570((byte) 123);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg3.method570((byte) 123);
                    break;
                }
                if (var10 <= 49) {
                    arg3.method570((byte) 123);
                }
            }
        }
        field2274++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lgd;ILgd;)V")
    public static final void method742(class46 arg0, int arg1, class46 arg2) {
        if (arg1 < 74) {
            field2287 = -30;
        }
        field2276++;
        if (class26.field507) {
            class140.method1089(arg2, 23, arg0);
            return;
        }
        if (class48.field1022 == 0 || class48.field1022 == 5) {
            byte var3 = 20;
            int var4 = 253 - var3;
            arg0.method325(class55.field1131, 382, 245 - var3, 16777215, -1);
            class49.method351(230, var4, 304, 34, 9179409);
            class49.method351(231, var4 + 1, 302, 32, 0);
            class49.method360(232, var4 + 2, class95.field2299 * 3, 30, 9179409);
            class49.method360(class95.field2299 * 3 + 232, var4 - -2, 300 - class95.field2299 * 3, 30, 0);
            arg0.method325(class126.field2980, 382, 276 - var3, 16777215, -1);
        }
        if (class48.field1022 == 20) {
            class115.field2728.method951(382 - class115.field2728.field2835 / 2, -(class115.field2728.field2832 / 2) + 271);
            short var5 = 211;
            arg0.method325(class126.field2984, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg0.method325(class126.field2975, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg0.method325(class126.field2997, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg0.method330(class73.method530((byte) -83, new class117[] { class146.field3566, class46.method317(class126.field2991) }), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg0.method330(class73.method530((byte) -83, new class117[] { class31.field657, class126.field2982.method913(false) }), 274, var28, 16777215, 0);
            int var29 = var28 + 15;
        }
        if (class48.field1022 == 10) {
            class115.field2728.method951(202, 171);
            if (class66.field1386 == 0) {
                short var6 = 251;
                arg0.method325(class76.field1672, 382, var6, 16776960, 0);
                int var27 = var6 + 30;
                short var7 = 302;
                short var8 = 291;
                class93.field2254.method951(var7 - 73, var8 + -20);
                arg0.method319(class122.field2908, var7 - 73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var9 = 462;
                class93.field2254.method951(var9 - 73, var8 + -20);
                arg0.method319(class72.field1573, var9 - 73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class66.field1386 == 2) {
                short var13 = 211;
                arg0.method325(class126.field2984, 382, var13, 16776960, 0);
                short var14 = 321;
                int var34 = var13 + 15;
                short var15 = 302;
                arg0.method325(class126.field2975, 382, var34, 16776960, 0);
                int var35 = var34 + 15;
                arg0.method325(class126.field2997, 382, var35, 16776960, 0);
                int var36 = var35 + 15;
                int var37 = var36 + 10;
                arg0.method330(class73.method530((byte) -83, new class117[] { class146.field3566, class46.method317(class126.field2991), class43.field856 % 40 < 20 & class66.field1391 == 0 ? class138.field3277 : class126.field2987 }), 272, var37, 16777215, 0);
                int var38 = var37 + 15;
                arg0.method330(class73.method530((byte) -83, new class117[] { class31.field657, class126.field2982.method913(false), class43.field856 % 40 < 20 & class66.field1391 == 1 ? class138.field3277 : class126.field2987 }), 274, var38, 16777215, 0);
                class93.field2254.method951(var15 - 73, var14 + -20);
                arg0.method325(class122.field2910, var15, var14 + 5, 16777215, 0);
                short var16 = 462;
                int var39 = var38 + 15;
                class93.field2254.method951(var16 - 73, var14 - 20);
                arg0.method325(class153.field3781, var16, var14 + 5, 16777215, 0);
            } else if (class66.field1386 == 3) {
                arg0.method325(class99.field2402, 382, 211, 16776960, 0);
                short var10 = 236;
                arg0.method325(class89.field2037, 382, var10, 16777215, 0);
                int var30 = var10 + 15;
                short var11 = 382;
                arg0.method325(class115.field2732, 382, var30, 16777215, 0);
                short var12 = 321;
                int var31 = var30 + 15;
                arg0.method325(class69.field1463, 382, var31, 16777215, 0);
                int var32 = var31 + 15;
                arg0.method325(class69.field1465, 382, var32, 16777215, 0);
                class93.field2254.method951(var11 - 73, var12 + -20);
                int var33 = var32 + 15;
                arg0.method325(class153.field3781, var11, var12 + 5, 16777215, 0);
            }
        }
        if (class27.field542 > 0) {
            class115.method895(class27.field542, (byte) -115);
            class27.field542 = 0;
        }
        class77.method552((byte) 22);
        class133.field3154[class89.field2065 ? 1 : 0].method951(725, 463);
        if (class48.field1022 > 5 && class19.field299 != 2 && class144.field3539 == 0) {
            if (class122.field2895 == null) {
                class122.field2895 = class67.method475(class126.field2987, -4236, class71.field1516, class134.field3184);
            } else {
                short var17 = 463;
                byte var18 = 35;
                byte var19 = 100;
                byte var20 = 5;
                class122.field2895.method951(var20, var17);
                arg0.method325(class73.method530((byte) -83, new class117[] { class91.field2234, class4.field77, class79.method614(15591, class56.field1152) }), var19 / 2 + var20, var17 - -(var18 / 2) + -2, 16777215, 0);
                if (class65.field1363 == null) {
                    arg2.method325(class77.field1712, var19 / 2 + var20, var18 / 2 + (var17 - -12), 16777215, 0);
                } else {
                    arg2.method325(class21.field369, var19 / 2 + var20, var18 / 2 + var17 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var21 = class3.field64.getGraphics();
            class68.field1426.method210(0, 0, (byte) 78, var21);
        } catch (Exception var22) {
            class3.field64.repaint();
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIB)Z")
    public static final boolean method743(int arg0, int arg1, byte arg2) {
        field2278++;
        if (arg2 != -112) {
            field2280 = null;
        }
        return (arg1 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method744(int arg0) {
        if (arg0 != 16777215) {
            field2277 = null;
        }
        field2281 = null;
        field2282 = null;
        field2277 = null;
        field2280 = null;
        field2279 = null;
        field2283 = null;
        field2286 = null;
        field2285 = null;
    }
}
