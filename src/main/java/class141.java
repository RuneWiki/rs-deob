import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class141 {

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Z")
    public static boolean field2424 = false;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "J")
    public long field2418;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lgd;")
    public class141 field2422;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Lgd;")
    public class141 field2423;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIZIZI)V", line = 12)
    public static final void method959(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        class47.field789++;
        if (!arg4) {
            class209.method1507(true, (byte) 60);
            class29.method184(true, (byte) 72);
            class209.method1507(false, (byte) 60);
        }
        field2416++;
        class29.method184(arg2, (byte) -108);
        if (!arg4) {
            class291.method2007((byte) 18);
        }
        class187.method1295(123);
        if (class147.field2485) {
            class14.method79(arg1, arg3, true, arg5, 124, arg0);
            arg1 = class307.field5224;
            arg0 = class40.field699;
            arg5 = class15.field124;
            arg3 = class107.field1891;
        }
        class295.field4939 = arg3;
        class295.field4949 = arg0;
        if (class273.field4602 == 1) {
            int var6 = class226.field3915;
            if (var6 < class285.field4794 / 256) {
                var6 = class285.field4794 / 256;
            }
            if (class166.field2910[4] && var6 < class22.field304[4] + 128) {
                var6 = class22.field304[4] + 128;
            }
            int var7 = class219.field3804 + class200.field3444 & 0x7FF;
            class9.method54(var7, var6 * 3 + 600, -1, arg5, class142.field2434, var6, class21.method145(class168.field2932.field1685, class168.field2932.field1689, class297.field5058, (byte) 82) - 50, class114.field2046);
        }
        int var8 = class134.field2322;
        int var9 = class4.field32;
        int var10 = class197.field3380;
        int var11 = class219.field3792;
        int var12 = class224.field3887;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class166.field2910[var13]) {
                int var14 = (int) ((double) (class214.field3735[var13] * 2 + 1) * Math.random() + Math.sin((double) class242.field4197[var13] / 100.0D * (double) class133.field2309[var13]) * (double) class22.field304[var13] - (double) class214.field3735[var13]);
                if (var13 == 4) {
                    class197.field3380 += var14;
                    if (class197.field3380 < 128) {
                        class197.field3380 = 128;
                    }
                    if (class197.field3380 > 383) {
                        class197.field3380 = 383;
                    }
                }
                if (var13 == 1) {
                    class134.field2322 += var14;
                }
                if (var13 == 0) {
                    class219.field3792 += var14;
                }
                if (var13 == 2) {
                    class4.field32 += var14;
                }
                if (var13 == 3) {
                    class224.field3887 = class224.field3887 + var14 & 0x7FF;
                }
            }
        }
        class109.method749((byte) 79);
        if (class147.field2485) {
            class116.method789(arg0, arg3, arg0 + arg1, arg3 + arg5);
            float var15 = (float) class197.field3380 * 0.17578125F;
            float var16 = (float) class224.field3887 * 0.17578125F;
            if (class273.field4602 == 3) {
                var15 = class35.field567 * 360.0F / 6.2831855F;
                var16 = class71.field1096 * 360.0F / 6.2831855F;
            }
            class147.method999(arg0, arg3, arg1, arg5, arg1 / 2 + arg0, arg3 - -(arg5 / 2), var15, var16, class105.field1869, class105.field1869);
        } else {
            class320.method2220(arg0, arg3, arg0 + arg1, arg3 - -arg5);
            class102.method696();
        }
        if (class187.field3153 || arg0 > class45.field775 || class45.field775 >= arg0 + arg1 || class27.field360 < arg3 || class27.field360 >= (arg3 + arg5)) {
            class179.field3064 = 0;
            class219.field3797 = false;
        } else {
            int var17 = class109.field1951;
            class179.field3064 = 0;
            class219.field3797 = true;
            int var18 = class281.field4722;
            int var19 = class287.field4828;
            class164.field2873 = (class45.field775 - arg0) * (var19 - var17) / arg1 + var17;
            int var20 = class16.field146;
            class291.field4884 = (var20 - var18) * (class27.field360 - arg3) / arg5 + var18;
        }
        class283.method1968(107);
        byte var21 = class264.method1877(1) == 2 ? (byte) class47.field789 : 1;
        if (class147.field2485) {
            class147.method1019();
            class147.method1016(true);
            class147.method1022(true);
            boolean var22 = false;
            int var23;
            if (class61.field959 == 10) {
                var23 = class328.method2244(class112.field2032, (byte) 22, class4.field32 >> 10, class243.field4229, class219.field3792 >> 10);
            } else {
                var23 = class328.method2244(class112.field2032, (byte) 22, class168.field2932.field1720[0] >> 3, class243.field4229, class168.field2932.field1723[0] >> 3);
            }
            class2.method8(class212.field3708, !class133.field2295);
            class147.method995(var23);
            class296.method2048(19993, class224.field3887, class134.field2322, class219.field3792, class4.field32, class197.field3380);
            class147.field2481 = class212.field3708;
            class167.method1200(class219.field3792, class134.field2322, class4.field32, class197.field3380, class224.field3887, class138.field2376, class291.field4883, class44.field761, class224.field3892, class28.field388, class98.field1775, class297.field5058 + 1, var21, class168.field2932.field1685 >> 7, class168.field2932.field1689 >> 7);
            class74.field1131 = true;
            class2.method3();
            class296.method2048(19993, 0, 0, 0, 0, 0);
            class283.method1968(97);
            class315.method2163();
            class183.method1273(arg1, arg5, arg3, (byte) 49, arg0, class105.field1869, class105.field1869);
            class243.method1743(arg3, class105.field1869, class105.field1869, (byte) 62, arg0, arg5, arg1);
        } else {
            class320.method2217(arg0, arg3, arg1, arg5, 0);
            class167.method1200(class219.field3792, class134.field2322, class4.field32, class197.field3380, class224.field3887, class138.field2376, class291.field4883, class44.field761, class224.field3892, class28.field388, class98.field1775, class297.field5058 + 1, var21, class168.field2932.field1685 >> 7, class168.field2932.field1689 >> 7);
            class283.method1968(122);
            class315.method2163();
            class183.method1273(arg1, arg5, arg3, (byte) 99, arg0, 256, 256);
            class243.method1743(arg3, 256, 256, (byte) 80, arg0, arg5, arg1);
        }
        ((class89) class102.field1821).method635(0, class243.field4229);
        class229.method1629(arg3, arg1, arg5, arg0, (byte) -116);
        class219.field3792 = var11;
        class224.field3887 = var12;
        class4.field32 = var9;
        class134.field2322 = var8;
        class197.field3380 = var10;
        if (class50.field813 && class244.field4238.method1371((byte) -83) == 0) {
            class50.field813 = false;
        }
        if (class50.field813) {
            if (class147.field2485) {
                class116.method784(arg0, arg3, arg1, arg5, 0);
            } else {
                class320.method2217(arg0, arg3, arg1, arg5, 0);
            }
            class323.method2230(class289.field4847, (byte) 63, false);
        }
        if (!arg4 && !class50.field813 && !class187.field3153 && class45.field775 >= arg0 && (arg0 + arg1) > class45.field775 && arg3 <= class27.field360 && class27.field360 < arg3 + arg5) {
            class315.method2162(class45.field775, arg0, arg3, arg5, class27.field360, -9799, arg1);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Z", line = 228)
    public final boolean method960(int arg0) {
        field2415++;
        if (arg0 != 12498) {
            this.field2418 = 103L;
        }
        return this.field2422 != null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 246)
    public final void method961(byte arg0) {
        field2417++;
        if (this.field2422 == null) {
            return;
        }
        this.field2422.field2423 = this.field2423;
        this.field2423.field2422 = this.field2422;
        this.field2422 = null;
        if (arg0 < 52) {
            method962(76, -122);
        }
        this.field2423 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Z", line = 265)
    public static final boolean method962(int arg0, int arg1) {
        if (arg1 != 1) {
            field2420 = 61;
        }
        field2421++;
        return (arg0 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V", line = 278)
    public static final void method963(int arg0) {
        if (class82.field1445 < 0) {
            class82.field1445 = 0;
            class130.field2268 = -1;
            class78.field1330 = -1;
        }
        field2414++;
        if (class82.field1445 > class244.field4242) {
            class82.field1445 = class244.field4242;
            class78.field1330 = -1;
            class130.field2268 = -1;
        }
        if (arg0 > class315.field5426) {
            class315.field5426 = 0;
            class78.field1330 = -1;
            class130.field2268 = -1;
        }
        if (class157.field2719 < class315.field5426) {
            class315.field5426 = class157.field2719;
            class130.field2268 = -1;
            class78.field1330 = -1;
        }
    }
}
