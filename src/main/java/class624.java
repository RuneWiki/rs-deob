import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class624 extends class578 implements class87 {

    @OriginalMember(owner = "client!vfa", name = "H", descriptor = "I")
    private int field8661 = -1;

    @OriginalMember(owner = "client!vfa", name = "D", descriptor = "I")
    private int field8657 = -1;

    @OriginalMember(owner = "client!vfa", name = "L", descriptor = "I")
    private int field8665;

    @OriginalMember(owner = "client!vfa", name = "C", descriptor = "I")
    public int field8656;

    @OriginalMember(owner = "client!vfa", name = "M", descriptor = "I")
    public int field8666;

    @OriginalMember(owner = "client!vfa", name = "J", descriptor = "Llj;")
    private class565 field8663;

    @OriginalMember(owner = "client!vfa", name = "y", descriptor = "I")
    private int field8653;

    @OriginalMember(owner = "client!vfa", name = "F", descriptor = "I")
    public int field8659;

    @OriginalMember(owner = "client!vfa", name = "x", descriptor = "I")
    public static int field8652 = 52;

    @OriginalMember(owner = "client!vfa", name = "G", descriptor = "I")
    public static int field8660 = 0;

    @OriginalMember(owner = "client!vfa", name = "I", descriptor = "Llga;")
    public static class663 field8662 = new class663(8);

    @OriginalMember(owner = "client!vfa", name = "z", descriptor = "I")
    public static int field8654;

    @OriginalMember(owner = "client!vfa", name = "B", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!vfa", name = "E", descriptor = "I")
    public static int field8658;

    @OriginalMember(owner = "client!vfa", name = "K", descriptor = "I")
    public static int field8664;

    @OriginalMember(owner = "client!vfa", name = "N", descriptor = "I")
    public static int field8667;

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "(I)V", line = 5)
    public static void method3466(int arg0) {
        field8662 = null;
        if (arg0 != 1) {
            field8652 = 81;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIILrc;)V", line = 16)
    public static final void method3467(int arg0, int arg1, int arg2, class499 arg3) {
        field8654++;
        if (arg3 == null || class588.field8265.field3151 == arg3) {
            return;
        }
        int var4 = arg3.field6775;
        int var5 = arg3.field6783;
        int var6 = arg3.field6780;
        int var7 = (int) arg3.field6787;
        long var8 = arg3.field6787;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 60) {
            class333.field4489 = 0;
            class220.field3079++;
            class525.field7125 = arg0;
            class107.field1494 = arg1;
            class543.field7378 = 2;
            class352 var10 = class290.method1786(98, class199.field2836, class549.field7424);
            var10.field4686.method2822(class353.field4698.method34(82, -16215) ? 1 : 0, (byte) 125);
            var10.field4686.method2837(var4 + class498.field6774, -2);
            var10.field4686.method2818(var7, -27787);
            var10.field4686.method2837(var5 + class613.field8555, -2);
            class602.method3388(var10, (byte) 28);
            class553.method3105((byte) -77, var4, var5);
        }
        if (var6 == 1003) {
            class525.field7125 = arg0;
            class333.field4489 = 0;
            class302.field4205++;
            class543.field7378 = 2;
            class107.field1494 = arg1;
            class352 var11 = class290.method1786(arg2 + 98, class199.field2836, class635.field8770);
            var11.field4686.method2817(class353.field4698.method34(82, arg2 ^ 0xFFFFC0A9) ? 1 : 0, true);
            var11.field4686.method2823(class498.field6774 + var4, 43);
            var11.field4686.method2812(101, var5 + class613.field8555);
            var11.field4686.method2818((int) (var8 >>> 32) & Integer.MAX_VALUE, -27787);
            class602.method3388(var11, (byte) 28);
            class480.method2702(var4, 10, var5, var8);
        }
        if (var6 == 19) {
            class333.field4489 = 0;
            class543.field7378 = 2;
            class525.field7125 = arg0;
            class24.field300++;
            class107.field1494 = arg1;
            class352 var12 = class290.method1786(arg2 ^ 0x62, class199.field2836, class418.field5899);
            var12.field4686.method2818(class498.field6774 + var4, -27787);
            var12.field4686.method2837(var7, -2);
            var12.field4686.method2812(20, class613.field8555 + var5);
            var12.field4686.method2817(class353.field4698.method34(82, -16215) ? 1 : 0, true);
            class602.method3388(var12, (byte) 28);
            class553.method3105((byte) -93, var4, var5);
        }
        if (var6 == 6) {
            class393 var13 = (class393) class299.field4071.method970((byte) 89, (long) var7);
            if (var13 != null) {
                class525.field7125 = arg0;
                class543.field7378 = 2;
                class13.field135++;
                class107.field1494 = arg1;
                class333.field4489 = 0;
                class61 var14 = var13.field5552;
                class352 var15 = class290.method1786(98, class199.field2836, class377.field5033);
                var15.field4686.method2822(class353.field4698.method34(82, arg2 - 16215) ? 1 : 0, (byte) 118);
                var15.field4686.method2823(var7, -113);
                class602.method3388(var15, (byte) 28);
                class151.method1091(var14.field1801[0], true, 0, 3762, -2, var14.field1807[0], 0, var14.method881(-125), var14.method881(-128));
            }
        }
        if (var6 == 23) {
            if (class296.field4060 > 0 && class353.field4698.method34(82, arg2 ^ 0xFFFFC0A9) && class353.field4698.method34(81, -16215)) {
                class570.method3265(class143.field2063.field4053, class498.field6774 + var4, 1, class613.field8555 + var5);
            } else {
                class352 var16 = class451.method2565(var5, var7, var4, 262144);
                if (var7 == 1) {
                    var16.field4686.method2817(-1, true);
                    var16.field4686.method2817(-1, true);
                    var16.field4686.method2837((int) class705.field9964, arg2 - 2);
                    var16.field4686.method2817(57, true);
                    var16.field4686.method2817(class174.field2526, true);
                    var16.field4686.method2817(class216.field3062, true);
                    var16.field4686.method2817(89, true);
                    var16.field4686.method2837(class143.field2063.field4042, -2);
                    var16.field4686.method2837(class143.field2063.field4047, arg2 ^ 0xFFFFFFFE);
                    var16.field4686.method2817(63, true);
                } else {
                    class333.field4489 = 0;
                    class107.field1494 = arg1;
                    class525.field7125 = arg0;
                    class543.field7378 = 1;
                }
                class602.method3388(var16, (byte) 28);
                class151.method1091(var5, true, 0, 3762, -4, var4, 0, 1, 1);
            }
        }
        if (var6 == 57) {
            class393 var17 = (class393) class299.field4071.method970((byte) 89, (long) var7);
            if (var17 != null) {
                class61 var18 = var17.field5552;
                class333.field4489 = 0;
                class107.field1494 = arg1;
                class525.field7125 = arg0;
                class547.field7416++;
                class543.field7378 = 2;
                class352 var19 = class290.method1786(98, class199.field2836, class705.field9967);
                var19.field4686.method2818(var7, -27787);
                var19.field4686.method2822(class353.field4698.method34(82, arg2 ^ 0xFFFFC0A9) ? 1 : 0, (byte) 120);
                class602.method3388(var19, (byte) 28);
                class151.method1091(var18.field1801[0], true, 0, 3762, -2, var18.field1807[0], 0, var18.method881(-124), var18.method881(arg2 ^ 0xFFFFFF93));
            }
        }
        if (var6 == 3) {
            class677 var20 = class671.field9407[var7];
            if (var20 != null) {
                class333.field4489 = 0;
                class525.field7125 = arg0;
                class209.field2957++;
                class543.field7378 = 2;
                class107.field1494 = arg1;
                class352 var21 = class290.method1786(98, class199.field2836, class64.field755);
                var21.field4686.method2812(49, var7);
                var21.field4686.method2822(class353.field4698.method34(82, -16215) ? 1 : 0, (byte) 113);
                class602.method3388(var21, (byte) 28);
                class151.method1091(var20.field1801[0], true, 0, 3762, -2, var20.field1807[0], 0, var20.method881(arg2 - 115), var20.method881(arg2 ^ 0xFFFFFF82));
            }
        }
        if (var6 == 8) {
            class525.field7125 = arg0;
            class543.field7378 = 2;
            class333.field4489 = 0;
            class79.field1202++;
            class107.field1494 = arg1;
            class352 var22 = class290.method1786(98, class199.field2836, class137.field1945);
            var22.field4686.method2859(-11464, class353.field4698.method34(82, -16215) ? 1 : 0);
            var22.field4686.method2823(var7, 70);
            var22.field4686.method2812(20, class613.field8555 + var5);
            var22.field4686.method2823(class498.field6774 + var4, -122);
            class602.method3388(var22, (byte) 28);
            class553.method3105((byte) 101, var4, var5);
        }
        if (var6 == 51) {
            class677 var23 = class671.field9407[var7];
            if (var23 != null) {
                class333.field4489 = 0;
                class198.field2801++;
                class525.field7125 = arg0;
                class543.field7378 = 2;
                class107.field1494 = arg1;
                class352 var24 = class290.method1786(98, class199.field2836, class622.field8637);
                var24.field4686.method2833(false, class353.field4698.method34(82, -16215) ? 1 : 0);
                var24.field4686.method2837(var7, -2);
                class602.method3388(var24, (byte) 28);
                class151.method1091(var23.field1801[0], true, 0, 3762, -2, var23.field1807[0], 0, var23.method881(-124), var23.method881(-120));
            }
        }
        if (var6 == 15) {
            class677 var25 = class671.field9407[var7];
            if (var25 != null) {
                class562.field7589++;
                class107.field1494 = arg1;
                class525.field7125 = arg0;
                class543.field7378 = 2;
                class333.field4489 = 0;
                class352 var26 = class290.method1786(arg2 + 98, class199.field2836, class558.field7531);
                var26.field4686.method2823(var7, 43);
                var26.field4686.method2817(class353.field4698.method34(82, -16215) ? 1 : 0, true);
                class602.method3388(var26, (byte) 28);
                class151.method1091(var25.field1801[0], true, 0, 3762, -2, var25.field1807[0], 0, var25.method881(-119), var25.method881(-110));
            }
        }
        if (var6 == 13) {
            class677 var27 = class671.field9407[var7];
            if (var27 != null) {
                class333.field4489 = 0;
                class543.field7378 = 2;
                class525.field7125 = arg0;
                class107.field1494 = arg1;
                class406.field5683++;
                class352 var28 = class290.method1786(98, class199.field2836, class432.field6027);
                var28.field4686.method2833(false, class353.field4698.method34(82, -16215) ? 1 : 0);
                var28.field4686.method2837(var7, -2);
                class602.method3388(var28, (byte) 28);
                class151.method1091(var27.field1801[0], true, 0, 3762, -2, var27.field1807[0], 0, var27.method881(-111), var27.method881(-121));
            }
        }
        if (var6 == 21) {
            class677 var29 = class671.field9407[var7];
            if (var29 != null) {
                class525.field7125 = arg0;
                class333.field4489 = 0;
                class519.field7063++;
                class107.field1494 = arg1;
                class543.field7378 = 2;
                class352 var30 = class290.method1786(98, class199.field2836, class124.field1785);
                var30.field4686.method2837(class301.field4099, -2);
                var30.field4686.method2823(var7, 112);
                var30.field4686.method2817(class353.field4698.method34(82, -16215) ? 1 : 0, true);
                var30.field4686.method2856(class340.field4555, (byte) 61);
                var30.field4686.method2823(class544.field7389, 18);
                class602.method3388(var30, (byte) 28);
                class151.method1091(var29.field1801[0], true, 0, 3762, -2, var29.field1807[0], 0, var29.method881(-119), var29.method881(-117));
            }
        }
        if (arg2 != 0) {
            method3466(2);
        }
        if (var6 == 1006) {
            class334.field4502++;
            class107.field1494 = arg1;
            class543.field7378 = 2;
            class525.field7125 = arg0;
            class333.field4489 = 0;
            class352 var31 = class290.method1786(98, class199.field2836, class227.field3145);
            var31.field4686.method2837(var7, -2);
            class602.method3388(var31, (byte) 28);
        }
        if (var6 == 44) {
            class107.field1494 = arg1;
            class333.field4489 = 0;
            class525.field7125 = arg0;
            class601.field8382++;
            class543.field7378 = 2;
            class352 var32 = class290.method1786(arg2 + 98, class199.field2836, class249.field3400);
            var32.field4686.method2812(81, var7);
            var32.field4686.method2869(arg2 ^ 0xFFFFFF86, class340.field4555);
            var32.field4686.method2859(-11464, class353.field4698.method34(82, -16215) ? 1 : 0);
            var32.field4686.method2818(class613.field8555 + var5, -27787);
            var32.field4686.method2818(class544.field7389, -27787);
            var32.field4686.method2823(var4 + class498.field6774, arg2 ^ 0xFFFFFF8B);
            var32.field4686.method2812(120, class301.field4099);
            class602.method3388(var32, (byte) 28);
            class553.method3105((byte) 112, var4, var5);
        }
        if (var6 == 16) {
            class333.field4489 = 0;
            class462.field6358++;
            class543.field7378 = 2;
            class107.field1494 = arg1;
            class525.field7125 = arg0;
            class352 var33 = class290.method1786(98, class199.field2836, class677.field9678);
            var33.field4686.method2833(false, class353.field4698.method34(82, -16215) ? 1 : 0);
            var33.field4686.method2812(26, class498.field6774 + var4);
            var33.field4686.method2837(var5 + class613.field8555, arg2 ^ 0xFFFFFFFE);
            var33.field4686.method2823(var7, -99);
            class602.method3388(var33, (byte) 28);
            class553.method3105((byte) -104, var4, var5);
        }
        if (var6 == 49) {
            class393 var34 = (class393) class299.field4071.method970((byte) 89, (long) var7);
            if (var34 != null) {
                class543.field7378 = 2;
                class107.field1494 = arg1;
                class333.field4489 = 0;
                class48.field562++;
                class525.field7125 = arg0;
                class61 var35 = var34.field5552;
                class352 var36 = class290.method1786(98, class199.field2836, class706.field9985);
                var36.field4686.method2822(class353.field4698.method34(82, -16215) ? 1 : 0, (byte) 126);
                var36.field4686.method2837(var7, -2);
                class602.method3388(var36, (byte) 28);
                class151.method1091(var35.field1801[0], true, 0, 3762, -2, var35.field1807[0], 0, var35.method881(-121), var35.method881(-124));
            }
        }
        if (var6 == 47) {
            class393 var37 = (class393) class299.field4071.method970((byte) 89, (long) var7);
            if (var37 != null) {
                class107.field1494 = arg1;
                class543.field7378 = 2;
                class650.field9015++;
                class525.field7125 = arg0;
                class61 var38 = var37.field5552;
                class333.field4489 = 0;
                class352 var39 = class290.method1786(arg2 + 98, class199.field2836, class274.field3800);
                var39.field4686.method2812(66, var7);
                var39.field4686.method2833(false, class353.field4698.method34(82, -16215) ? 1 : 0);
                class602.method3388(var39, (byte) 28);
                class151.method1091(var38.field1801[0], true, 0, arg2 + 3762, -2, var38.field1807[0], 0, var38.method881(-123), var38.method881(-119));
            }
        }
        if (var6 == 58) {
            class677 var40 = class671.field9407[var7];
            if (var40 != null) {
                class107.field1494 = arg1;
                class543.field7378 = 2;
                class525.field7125 = arg0;
                class333.field4489 = 0;
                class20.field234++;
                class352 var41 = class290.method1786(arg2 + 98, class199.field2836, class468.field6432);
                var41.field4686.method2818(var7, arg2 ^ 0xFFFF9375);
                var41.field4686.method2859(-11464, class353.field4698.method34(82, -16215) ? 1 : 0);
                class602.method3388(var41, (byte) 28);
                class151.method1091(var40.field1801[0], true, 0, arg2 ^ 0xEB2, -2, var40.field1807[0], 0, var40.method881(-126), var40.method881(-127));
            }
        }
        if (var6 == 50) {
            class525.field7125 = arg0;
            class107.field1494 = arg1;
            class698.field9909++;
            class333.field4489 = 0;
            class543.field7378 = 2;
            class352 var42 = class290.method1786(98, class199.field2836, class274.field3772);
            var42.field4686.method2812(84, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var42.field4686.method2823(class498.field6774 + var4, -123);
            var42.field4686.method2837(var5 + class613.field8555, arg2 + -2);
            var42.field4686.method2817(class353.field4698.method34(82, -16215) ? 1 : 0, true);
            class602.method3388(var42, (byte) 28);
            class480.method2702(var4, arg2 ^ 0xA, var5, var8);
        }
        if (var6 == 48) {
            class677 var43 = class671.field9407[var7];
            if (var43 != null) {
                class525.field7125 = arg0;
                class107.field1494 = arg1;
                class333.field4489 = 0;
                class611.field8474++;
                class543.field7378 = 2;
                class352 var44 = class290.method1786(98, class199.field2836, class169.field2460);
                var44.field4686.method2818(var7, arg2 - 27787);
                var44.field4686.method2822(class353.field4698.method34(82, -16215) ? 1 : 0, (byte) 121);
                class602.method3388(var44, (byte) 28);
                class151.method1091(var43.field1801[0], true, 0, arg2 + 3762, -2, var43.field1807[0], 0, var43.method881(arg2 - 115), var43.method881(arg2 - 109));
            }
        }
        if (var6 == 1010) {
            class543.field7378 = 2;
            class107.field1494 = arg1;
            class413.field5856++;
            class525.field7125 = arg0;
            class333.field4489 = 0;
            class352 var45 = class290.method1786(98, class199.field2836, class583.field8211);
            var45.field4686.method2837(var7, -2);
            class602.method3388(var45, (byte) 28);
        }
        if (var6 == 2) {
            class78 var46 = class89.method650(111, var5, var4);
            if (var46 != null) {
                class114.method820((byte) -126);
                class303 var47 = client.method1679(var46);
                class128.method914(var47.field4207, var46, var47.method1849((byte) 66), -101);
                class178.field2551 = class46.method381(-1, var46);
                if (class178.field2551 == null) {
                    class178.field2551 = "Null";
                }
                class185.field2679 = var46.field1101 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 30) {
            class543.field7378 = 2;
            class525.field7125 = arg0;
            class63.field715++;
            class333.field4489 = 0;
            class107.field1494 = arg1;
            class352 var48 = class290.method1786(98, class199.field2836, class525.field7122);
            var48.field4686.method2837(var4 + class498.field6774, arg2 + -2);
            var48.field4686.method2818(class613.field8555 + var5, -27787);
            var48.field4686.method2823(Integer.MAX_VALUE & (int) (var8 >>> 32), arg2 + 45);
            var48.field4686.method2817(class353.field4698.method34(82, arg2 ^ 0xFFFFC0A9) ? 1 : 0, true);
            class602.method3388(var48, (byte) 28);
            class480.method2702(var4, 10, var5, var8);
        }
        if (var6 == 45) {
            class78 var49 = class89.method650(96, var5, var4);
            if (var49 != null) {
                class341.method1998(var49, -87);
            }
        }
        if (var6 == 4) {
            if (class296.field4060 > 0 && class353.field4698.method34(82, -16215) && class353.field4698.method34(81, -16215)) {
                class570.method3265(class143.field2063.field4053, class498.field6774 + var4, 1, class613.field8555 + var5);
            } else {
                class525.field7125 = arg0;
                class333.field4489 = 0;
                class543.field7378 = 1;
                class13.field136++;
                class107.field1494 = arg1;
                class352 var50 = class290.method1786(98, class199.field2836, class693.field9874);
                var50.field4686.method2823(class498.field6774 + var4, 69);
                var50.field4686.method2818(class613.field8555 + var5, arg2 + -27787);
                class602.method3388(var50, (byte) 28);
            }
        }
        if (var6 == 17) {
            class677 var51 = class671.field9407[var7];
            if (var51 != null) {
                class525.field7125 = arg0;
                class107.field1494 = arg1;
                class32.field407++;
                class543.field7378 = 2;
                class333.field4489 = 0;
                class352 var52 = class290.method1786(98, class199.field2836, class402.field5630);
                var52.field4686.method2859(arg2 ^ 0xFFFFD338, class353.field4698.method34(82, -16215) ? 1 : 0);
                var52.field4686.method2812(arg2 + 85, var7);
                class602.method3388(var52, (byte) 28);
                class151.method1091(var51.field1801[0], true, 0, 3762, -2, var51.field1807[0], 0, var51.method881(-121), var51.method881(arg2 ^ 0xFFFFFF8E));
            }
        }
        if (var6 == 5 || var6 == 1011) {
            class99.method719(var7, var5, arg2 - 7, var4, arg3.field6786);
        }
        if (var6 == 11) {
            class688.field9809++;
            class107.field1494 = arg1;
            class333.field4489 = 0;
            class543.field7378 = 2;
            class525.field7125 = arg0;
            class352 var53 = class290.method1786(98, class199.field2836, class472.field6494);
            var53.field4686.method2822(class353.field4698.method34(82, -16215) ? 1 : 0, (byte) 115);
            var53.field4686.method2837(class498.field6774 + var4, arg2 ^ 0xFFFFFFFE);
            var53.field4686.method2837((int) (var8 >>> 32) & Integer.MAX_VALUE, -2);
            var53.field4686.method2837(class613.field8555 + var5, arg2 ^ 0xFFFFFFFE);
            class602.method3388(var53, (byte) 28);
            class480.method2702(var4, arg2 + 10, var5, var8);
        }
        if (var6 == 18) {
            class677 var54 = class671.field9407[var7];
            if (var54 != null) {
                class553.field7456++;
                class543.field7378 = 2;
                class107.field1494 = arg1;
                class333.field4489 = 0;
                class525.field7125 = arg0;
                class352 var55 = class290.method1786(arg2 + 98, class199.field2836, class524.field7114);
                var55.field4686.method2822(class353.field4698.method34(82, -16215) ? 1 : 0, (byte) 117);
                var55.field4686.method2837(var7, -2);
                class602.method3388(var55, (byte) 28);
                class151.method1091(var54.field1801[0], true, 0, arg2 ^ 0xEB2, -2, var54.field1807[0], 0, var54.method881(-110), var54.method881(-117));
            }
        }
        if (var6 == 1012) {
            class333.field4489 = 0;
            class107.field1494 = arg1;
            class543.field7378 = 2;
            class525.field7125 = arg0;
            class393 var56 = (class393) class299.field4071.method970((byte) 89, (long) var7);
            if (var56 != null) {
                class61 var57 = var56.field5552;
                class568 var58 = var57.field674;
                if (var58.field8079 != null) {
                    var58 = var58.method3259((byte) 124, class578.field8156);
                }
                if (var58 != null) {
                    class293.field4022++;
                    class352 var59 = class290.method1786(98, class199.field2836, class210.field2965);
                    var59.field4686.method2837(var58.field8021, -2);
                    class602.method3388(var59, (byte) 28);
                }
            }
        }
        if (var6 == 25) {
            class525.field7125 = arg0;
            class165.field2377++;
            class107.field1494 = arg1;
            class333.field4489 = 0;
            class543.field7378 = 2;
            class352 var60 = class290.method1786(98, class199.field2836, class653.field9091);
            var60.field4686.method2822(class353.field4698.method34(82, -16215) ? 1 : 0, (byte) 122);
            var60.field4686.method2837(class498.field6774 + var4, -2);
            var60.field4686.method2823(class613.field8555 + var5, arg2 + 25);
            var60.field4686.method2818(var7, -27787);
            class602.method3388(var60, (byte) 28);
            class553.method3105((byte) -97, var4, var5);
        }
        if (var6 == 46) {
            class333.field4489 = 0;
            class525.field7125 = arg0;
            class543.field7378 = 2;
            class613.field8519++;
            class107.field1494 = arg1;
            class352 var61 = class290.method1786(98, class199.field2836, class458.field6350);
            var61.field4686.method2823(var4 + class498.field6774, 108);
            var61.field4686.method2837(Integer.MAX_VALUE & (int) (var8 >>> 32), -2);
            var61.field4686.method2823(class613.field8555 + var5, arg2 + 66);
            var61.field4686.method2859(-11464, class353.field4698.method34(82, arg2 - 16215) ? 1 : 0);
            class602.method3388(var61, (byte) 28);
            class480.method2702(var4, 10, var5, var8);
        }
        if (var6 == 22) {
            class393 var62 = (class393) class299.field4071.method970((byte) 89, (long) var7);
            if (var62 != null) {
                class333.field4489 = 0;
                class107.field1494 = arg1;
                class525.field7125 = arg0;
                class61 var63 = var62.field5552;
                class543.field7378 = 2;
                class472.field6495++;
                class352 var64 = class290.method1786(arg2 + 98, class199.field2836, class650.field9023);
                var64.field4686.method2823(class544.field7389, 56);
                var64.field4686.method2818(class301.field4099, -27787);
                var64.field4686.method2836(class340.field4555, -22164);
                var64.field4686.method2833(false, class353.field4698.method34(82, -16215) ? 1 : 0);
                var64.field4686.method2812(76, var7);
                class602.method3388(var64, (byte) 28);
                class151.method1091(var63.field1801[0], true, 0, 3762, -2, var63.field1807[0], 0, var63.method881(-114), var63.method881(-119));
            }
        }
        if (var6 == 59) {
            class333.field4489 = 0;
            class61.field684++;
            class525.field7125 = arg0;
            class543.field7378 = 2;
            class107.field1494 = arg1;
            class352 var65 = class290.method1786(98, class199.field2836, class434.field6041);
            var65.field4686.method2837(class544.field7389, -2);
            var65.field4686.method2818(class498.field6774 + var4, -27787);
            var65.field4686.method2837((int) (var8 >>> 32) & Integer.MAX_VALUE, -2);
            var65.field4686.method2822(class353.field4698.method34(82, arg2 ^ 0xFFFFC0A9) ? 1 : 0, (byte) 127);
            var65.field4686.method2818(class301.field4099, arg2 - 27787);
            var65.field4686.method2823(var5 + class613.field8555, 53);
            var65.field4686.method2856(class340.field4555, (byte) -63);
            class602.method3388(var65, (byte) 28);
            class480.method2702(var4, 10, var5, var8);
        }
        if (var6 == 12) {
            class519.field7063++;
            class333.field4489 = 0;
            class525.field7125 = arg0;
            class543.field7378 = 2;
            class107.field1494 = arg1;
            class352 var66 = class290.method1786(98, class199.field2836, class124.field1785);
            var66.field4686.method2837(class301.field4099, arg2 ^ 0xFFFFFFFE);
            var66.field4686.method2823(class143.field2063.field1697, 25);
            var66.field4686.method2817(class353.field4698.method34(82, -16215) ? 1 : 0, true);
            var66.field4686.method2856(class340.field4555, (byte) -60);
            var66.field4686.method2823(class544.field7389, 119);
            class602.method3388(var66, (byte) 28);
        }
        if (var6 == 9) {
            class333.field4489 = 0;
            class543.field7378 = 1;
            class107.field1494 = arg1;
            class285.field3928++;
            class525.field7125 = arg0;
            class352 var67 = class290.method1786(arg2 ^ 0x62, class199.field2836, class40.field467);
            var67.field4686.method2837(class613.field8555 + var5, arg2 ^ 0xFFFFFFFE);
            var67.field4686.method2812(61, class498.field6774 + var4);
            var67.field4686.method2837(class544.field7389, -2);
            var67.field4686.method2823(class301.field4099, 124);
            var67.field4686.method2869(arg2 ^ 0xFFFFFFA6, class340.field4555);
            class602.method3388(var67, (byte) 28);
            class151.method1091(var5, true, 0, arg2 ^ 0xEB2, -4, var4, 0, 1, 1);
        }
        if (var6 == 10) {
            class393 var68 = (class393) class299.field4071.method970((byte) 89, (long) var7);
            if (var68 != null) {
                class333.field4489 = 0;
                class543.field7378 = 2;
                class61 var69 = var68.field5552;
                class250.field3404++;
                class107.field1494 = arg1;
                class525.field7125 = arg0;
                class352 var70 = class290.method1786(98, class199.field2836, class465.field6394);
                var70.field4686.method2818(var7, -27787);
                var70.field4686.method2833(false, class353.field4698.method34(82, -16215) ? 1 : 0);
                class602.method3388(var70, (byte) 28);
                class151.method1091(var69.field1801[0], true, 0, 3762, -2, var69.field1807[0], 0, var69.method881(-109), var69.method881(-109));
            }
        }
        if (var6 == 1004 || var6 == 1009 || var6 == 1001 || var6 == 1008 || var6 == 1002) {
            class620.method3447(var6, var4, var7, -1009);
        }
        if (var6 == 20 && class578.field8165 == null) {
            class380.method2177(var4, (byte) 118, var5);
            class578.field8165 = class89.method650(arg2 - 49, var5, var4);
            class26.method255(class578.field8165, -20229);
        }
        if (class426.field5971) {
            class114.method820((byte) -92);
        }
        if (class65.field853 != null && class80.field1208 == 0) {
            class26.method255(class65.field853, -20229);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)V", line = 828)
    public final void method240(byte arg0) {
        field8667++;
        OpenGL.glFramebufferRenderbufferEXT(this.field8657, this.field8661, 36161, 0);
        this.field8661 = -1;
        this.field8657 = -1;
        if (arg0 != -8) {
            field8662 = null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(III)V", line = 852)
    public final void method3468(int arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.field8653);
        if (arg2 != 0) {
            method3467(111, -62, 55, null);
        }
        field8658++;
        this.field8661 = arg0;
        this.field8657 = arg1;
    }

    @OriginalMember(owner = "client!vfa", name = "finalize", descriptor = "()V", line = 866)
    protected final void finalize() throws Throwable {
        field8664++;
        this.method3469(true);
        super.finalize();
    }

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "(Z)V", line = 880)
    public final void method3469(boolean arg0) {
        field8655++;
        if (this.field8653 > 0) {
            this.field8663.method3236(this.field8659, 106, this.field8653);
            this.field8653 = 0;
        }
        if (!arg0) {
            this.method3468(126, -52, -30);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Llj;III)V", line = 906)
    public class624(class565 arg0, int arg1, int arg2, int arg3) {
        this.field8665 = arg1;
        this.field8656 = arg2;
        this.field8666 = arg3;
        this.field8663 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class121.field1674, 0);
        this.field8653 = class121.field1674[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field8653);
        OpenGL.glRenderbufferStorageEXT(36161, this.field8665, this.field8656, this.field8666);
        this.field8659 = this.field8666 * this.field8656 * this.field8663.method3183(this.field8665, (byte) -49);
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Llj;IIII)V", line = 921)
    public class624(class565 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8665 = arg1;
        this.field8666 = arg3;
        this.field8663 = arg0;
        this.field8656 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class121.field1674, 0);
        this.field8653 = class121.field1674[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field8653);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field8665, this.field8656, this.field8666);
        this.field8659 = this.field8656 * this.field8666 * this.field8663.method3183(this.field8665, (byte) -49);
    }
}
