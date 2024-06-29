import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class625 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Lko;")
    private class529 field8751;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "J")
    public long field8755;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "[S")
    public static short[] field8753 = new short[256];

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field8754 = 0;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "[I")
    public static int[] field8757 = new int[8];

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static void method3595(int arg0) {
        if (arg0 != 10286) {
            method3596(9, -96, -2, null);
        }
        field8757 = null;
        field8753 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIILjga;)V")
    public static final void method3596(int arg0, int arg1, int arg2, class746 arg3) {
        field8756++;
        if (arg3 == null || class239.field3583.field3876 == arg3) {
            return;
        }
        int var4 = arg3.field10342;
        int var5 = arg3.field10331;
        int var6 = arg3.field10340;
        int var7 = (int) arg3.field10333;
        long var8 = arg3.field10333;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 58) {
            class205 var10 = (class205) class645.field9014.method2242((long) var7, arg0 - 2);
            if (var10 != null) {
                class549.field7888 = arg1;
                class749.field10366 = 0;
                class665 var11 = var10.field3181;
                class82.field905 = arg2;
                class548.field7880 = 2;
                class730.field10107++;
                class312 var12 = class353.method2245(class87.field971, class495.field7065, (byte) 123);
                var12.field4445.method2990(255, var7);
                var12.field4445.method2952(0, class629.field8820.method2138(82, -6759) ? 1 : 0);
                class208.method1440(var12, 105);
                class394.method2436(var11.method2102(true), -2, var11.method2102(true), var11.field4670[0], true, var11.field4672[0], 0, 0, 0);
            }
        }
        if (var6 == 49) {
            class549.field7888 = arg1;
            class548.field7880 = 2;
            class82.field905 = arg2;
            class182.field2819++;
            class749.field10366 = 0;
            class312 var13 = class353.method2245(class87.field971, class432.field5845, (byte) 46);
            var13.field4445.method2969(class629.field8818, -414819352);
            var13.field4445.method2992((byte) 127, class714.field9898);
            var13.field4445.method2969(class210.field3250.field4640, -414819352);
            var13.field4445.method2947(-108, class497.field7084);
            var13.field4445.method2994(class629.field8820.method2138(82, arg0 ^ 0xFFFFE598) ? 1 : 0, (byte) -72);
            class208.method1440(var13, 98);
        }
        if (var6 == 47) {
            class702 var14 = class767.field10560[var7];
            if (var14 != null) {
                class548.field7880 = 2;
                class653.field9118++;
                class749.field10366 = 0;
                class82.field905 = arg2;
                class549.field7888 = arg1;
                class312 var15 = class353.method2245(class87.field971, class565.field8017, (byte) 95);
                var15.field4445.method2997(class629.field8820.method2138(82, -6759) ? 1 : 0, 13855);
                var15.field4445.method2992((byte) 127, var7);
                class208.method1440(var15, 101);
                class394.method2436(var14.method2102(true), -2, var14.method2102(true), var14.field4670[0], true, var14.field4672[0], 0, 0, 0);
            }
        }
        if (var6 == 2) {
            class82.field905 = arg2;
            class549.field7888 = arg1;
            class548.field7880 = 2;
            class485.field6842++;
            class749.field10366 = 0;
            class312 var16 = class353.method2245(class87.field971, class576.field8119, (byte) 120);
            var16.field4445.method2990(255, var4 + class124.field1922);
            var16.field4445.method2957(var5 + class88.field999, 1267307848);
            var16.field4445.method2992((byte) 127, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var16.field4445.method2994(class629.field8820.method2138(82, -6759) ? 1 : 0, (byte) -72);
            class208.method1440(var16, 110);
            class680.method3852(var4, var5, (byte) 106, var8);
        }
        if (var6 == 6) {
            class451 var17 = class63.method422(var4, 17492, var5);
            if (var17 != null) {
                class741.method4125(var17, arg0 + 1617802689);
            }
        }
        if (var6 == 3 && class274.field3954 == null) {
            class490.method2923((byte) 24, var5, var4);
            class274.field3954 = class63.method422(var4, arg0 + 17491, var5);
            class564.method3329(class274.field3954, 8195);
        }
        if (var6 == 23) {
            if (class745.field10317 > 0 && class629.field8820.method2138(82, arg0 - 6760) && class629.field8820.method2138(81, arg0 - 6760)) {
                class678.method3845(arg0 ^ 0x1, class124.field1922 + var4, class88.field999 + var5, class210.field3250.field5755);
            } else {
                class312 var18 = class268.method1740(104, var4, var7, var5);
                if (var7 == 1) {
                    var18.field4445.method2952(arg0 - 1, -1);
                    var18.field4445.method2952(arg0 ^ 0x1, -1);
                    var18.field4445.method2957((int) class758.field10460, 1267307848);
                    var18.field4445.method2952(0, 57);
                    var18.field4445.method2952(0, class29.field416);
                    var18.field4445.method2952(0, class347.field4853);
                    var18.field4445.method2952(0, 89);
                    var18.field4445.method2957(class210.field3250.field5742, arg0 + 1267307847);
                    var18.field4445.method2957(class210.field3250.field5746, 1267307848);
                    var18.field4445.method2952(0, 63);
                } else {
                    class548.field7880 = 1;
                    class549.field7888 = arg1;
                    class749.field10366 = 0;
                    class82.field905 = arg2;
                }
                class208.method1440(var18, 67);
                class394.method2436(1, -4, 1, var4, true, var5, 0, 0, 0);
            }
        }
        if (var6 == 50) {
            class463.field6528++;
            class549.field7888 = arg1;
            class82.field905 = arg2;
            class749.field10366 = 0;
            class548.field7880 = 2;
            class312 var19 = class353.method2245(class87.field971, class784.field10771, (byte) 93);
            var19.field4445.method2990(arg0 + 254, var7);
            var19.field4445.method2952(0, class629.field8820.method2138(82, -6759) ? 1 : 0);
            var19.field4445.method2969(var4 + class124.field1922, -414819352);
            var19.field4445.method2957(var5 + class88.field999, 1267307848);
            class208.method1440(var19, arg0 ^ 0x21);
            class619.method3573(var5, var4, -120);
        }
        if (var6 == 16) {
            class205 var20 = (class205) class645.field9014.method2242((long) var7, -1);
            if (var20 != null) {
                class82.field905 = arg2;
                class549.field7888 = arg1;
                class665 var21 = var20.field3181;
                class351.field4916++;
                class548.field7880 = 2;
                class749.field10366 = 0;
                class312 var22 = class353.method2245(class87.field971, class258.field3795, (byte) 115);
                var22.field4445.method2997(class629.field8820.method2138(82, -6759) ? 1 : 0, arg0 ^ 0x361E);
                var22.field4445.method2990(arg0 + 254, var7);
                class208.method1440(var22, 81);
                class394.method2436(var21.method2102(true), -2, var21.method2102(true), var21.field4670[0], true, var21.field4672[0], 0, 0, 0);
            }
        }
        if (var6 == 57) {
            class82.field905 = arg2;
            class549.field7888 = arg1;
            class548.field7880 = 2;
            class749.field10366 = 0;
            class125.field1938++;
            class312 var23 = class353.method2245(class87.field971, class792.field10889, (byte) 115);
            var23.field4445.method2952(0, class629.field8820.method2138(82, -6759) ? 1 : 0);
            var23.field4445.method2957(class88.field999 + var5, arg0 + 1267307847);
            var23.field4445.method2957(Integer.MAX_VALUE & (int) (var8 >>> 32), arg0 ^ 0x4B899549);
            var23.field4445.method2969(class124.field1922 + var4, arg0 ^ 0xE7465BE9);
            class208.method1440(var23, arg0 ^ 0x70);
            class680.method3852(var4, var5, (byte) 120, var8);
        }
        if (var6 == 22) {
            class82.field905 = arg2;
            class583.field8238++;
            class548.field7880 = 2;
            class749.field10366 = 0;
            class549.field7888 = arg1;
            class312 var24 = class353.method2245(class87.field971, class621.field8735, (byte) 72);
            var24.field4445.method2952(0, class629.field8820.method2138(82, arg0 - 6760) ? 1 : 0);
            var24.field4445.method2990(255, var7);
            var24.field4445.method2969(class88.field999 + var5, -414819352);
            var24.field4445.method2957(class124.field1922 + var4, 1267307848);
            class208.method1440(var24, 120);
            class619.method3573(var5, var4, arg0 ^ 0xFFFFFF9E);
        }
        if (arg0 != 1) {
            method3595(62);
        }
        if (var6 == 52) {
            class702 var25 = class767.field10560[var7];
            if (var25 != null) {
                class82.field905 = arg2;
                class548.field7880 = 2;
                class309.field4417++;
                class549.field7888 = arg1;
                class749.field10366 = 0;
                class312 var26 = class353.method2245(class87.field971, class726.field10035, (byte) 70);
                var26.field4445.method2969(var7, -414819352);
                var26.field4445.method2981((byte) -27, class629.field8820.method2138(82, -6759) ? 1 : 0);
                class208.method1440(var26, arg0 ^ 0x55);
                class394.method2436(var25.method2102(true), -2, var25.method2102(true), var25.field4670[0], true, var25.field4672[0], 0, 0, 0);
            }
        }
        if (var6 == 1006 || var6 == 1003 || var6 == 1007 || var6 == 1008 || var6 == 1002) {
            class114.method859(var4, var7, (byte) -111, var6);
        }
        if (var6 == 30 || var6 == 1004) {
            class179.method1287(var4, false, var5, var7, arg3.field10339);
        }
        if (var6 == 10) {
            class205 var27 = (class205) class645.field9014.method2242((long) var7, -1);
            if (var27 != null) {
                class749.field10366 = 0;
                class665 var28 = var27.field3181;
                class549.field7888 = arg1;
                class82.field905 = arg2;
                class132.field1986++;
                class548.field7880 = 2;
                class312 var29 = class353.method2245(class87.field971, class357.field5021, (byte) 36);
                var29.field4445.method2990(255, var7);
                var29.field4445.method2994(class629.field8820.method2138(82, -6759) ? 1 : 0, (byte) -72);
                class208.method1440(var29, 71);
                class394.method2436(var28.method2102(true), -2, var28.method2102(true), var28.field4670[0], true, var28.field4672[0], 0, 0, 0);
            }
        }
        if (var6 == 12) {
            class702 var30 = class767.field10560[var7];
            if (var30 != null) {
                class82.field905 = arg2;
                class548.field7880 = 2;
                class749.field10366 = 0;
                class580.field8196++;
                class549.field7888 = arg1;
                class312 var31 = class353.method2245(class87.field971, class156.field2305, (byte) 76);
                var31.field4445.method2994(class629.field8820.method2138(82, -6759) ? 1 : 0, (byte) -72);
                var31.field4445.method2990(arg0 + 254, var7);
                class208.method1440(var31, arg0 + 100);
                class394.method2436(var30.method2102(true), -2, var30.method2102(true), var30.field4670[0], true, var30.field4672[0], 0, arg0 ^ 0x1, 0);
            }
        }
        if (var6 == 17) {
            class702 var32 = class767.field10560[var7];
            if (var32 != null) {
                class82.field905 = arg2;
                class749.field10366 = 0;
                class321.field4539++;
                class549.field7888 = arg1;
                class548.field7880 = 2;
                class312 var33 = class353.method2245(class87.field971, class66.field800, (byte) 101);
                var33.field4445.method2981((byte) -26, class629.field8820.method2138(82, -6759) ? 1 : 0);
                var33.field4445.method2969(var7, -414819352);
                class208.method1440(var33, 120);
                class394.method2436(var32.method2102(true), -2, var32.method2102(true), var32.field4670[0], true, var32.field4672[0], 0, arg0 - 1, 0);
            }
        }
        if (var6 == 19) {
            class549.field7888 = arg1;
            class547.field7864++;
            class82.field905 = arg2;
            class548.field7880 = 2;
            class749.field10366 = 0;
            class312 var34 = class353.method2245(class87.field971, class588.field8291, (byte) 63);
            var34.field4445.method2957(class88.field999 + var5, 1267307848);
            var34.field4445.method2990(255, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var34.field4445.method2952(arg0 - 1, class629.field8820.method2138(82, -6759) ? 1 : 0);
            var34.field4445.method2957(class124.field1922 + var4, arg0 + 1267307847);
            class208.method1440(var34, 71);
            class680.method3852(var4, var5, (byte) 121, var8);
        }
        if (var6 == 60) {
            class82.field905 = arg2;
            class548.field7880 = 2;
            class749.field10366 = 0;
            class431.field5841++;
            class549.field7888 = arg1;
            class312 var35 = class353.method2245(class87.field971, class123.field1919, (byte) 18);
            var35.field4445.method2952(0, class629.field8820.method2138(82, arg0 ^ 0xFFFFE598) ? 1 : 0);
            var35.field4445.method2992((byte) 127, class88.field999 + var5);
            var35.field4445.method2992((byte) 127, var7);
            var35.field4445.method2990(255, class124.field1922 + var4);
            class208.method1440(var35, arg0 + 90);
            class619.method3573(var5, var4, arg0 ^ 0x4D);
        }
        if (var6 == 59) {
            class548.field7880 = 2;
            class565.field8019++;
            class549.field7888 = arg1;
            class749.field10366 = 0;
            class82.field905 = arg2;
            class312 var36 = class353.method2245(class87.field971, class618.field8640, (byte) 33);
            var36.field4445.method2969(Integer.MAX_VALUE & (int) (var8 >>> 32), -414819352);
            var36.field4445.method2957(class124.field1922 + var4, 1267307848);
            var36.field4445.method2969(class88.field999 + var5, -414819352);
            var36.field4445.method2994(class629.field8820.method2138(82, -6759) ? 1 : 0, (byte) -72);
            class208.method1440(var36, 35);
            class680.method3852(var4, var5, (byte) 109, var8);
        }
        if (var6 == 1001) {
            class159.field2540++;
            class548.field7880 = 2;
            class749.field10366 = 0;
            class82.field905 = arg2;
            class549.field7888 = arg1;
            class312 var37 = class353.method2245(class87.field971, class737.field10161, (byte) 36);
            var37.field4445.method2957(var7, arg0 + 1267307847);
            class208.method1440(var37, 113);
        }
        if (var6 == 1011) {
            class610.field8577++;
            class82.field905 = arg2;
            class548.field7880 = 2;
            class749.field10366 = 0;
            class549.field7888 = arg1;
            class312 var38 = class353.method2245(class87.field971, class384.field5292, (byte) 115);
            var38.field4445.method2990(255, class88.field999 + var5);
            var38.field4445.method2992((byte) 127, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var38.field4445.method2992((byte) 127, class124.field1922 + var4);
            var38.field4445.method2981((byte) -98, class629.field8820.method2138(82, -6759) ? 1 : 0);
            class208.method1440(var38, 29);
            class680.method3852(var4, var5, (byte) 107, var8);
        }
        if (var6 == 48) {
            class82.field905 = arg2;
            class28.field411++;
            class548.field7880 = 2;
            class749.field10366 = 0;
            class549.field7888 = arg1;
            class312 var39 = class353.method2245(class87.field971, class590.field8320, (byte) 22);
            var39.field4445.method2992((byte) 127, class88.field999 + var5);
            var39.field4445.method2959(class497.field7084, (byte) -88);
            var39.field4445.method2981((byte) -44, class629.field8820.method2138(82, arg0 - 6760) ? 1 : 0);
            var39.field4445.method2969(class629.field8818, -414819352);
            var39.field4445.method2969(var4 + class124.field1922, -414819352);
            var39.field4445.method2990(arg0 + 254, class714.field9898);
            var39.field4445.method2957(var7, 1267307848);
            class208.method1440(var39, 62);
            class619.method3573(var5, var4, arg0 + 103);
        }
        if (var6 == 11) {
            class702 var40 = class767.field10560[var7];
            if (var40 != null) {
                class371.field5138++;
                class549.field7888 = arg1;
                class548.field7880 = 2;
                class749.field10366 = 0;
                class82.field905 = arg2;
                class312 var41 = class353.method2245(class87.field971, class116.field1771, (byte) 25);
                var41.field4445.method2990(255, var7);
                var41.field4445.method2994(class629.field8820.method2138(82, -6759) ? 1 : 0, (byte) -72);
                class208.method1440(var41, 56);
                class394.method2436(var40.method2102(true), -2, var40.method2102(true), var40.field4670[0], true, var40.field4672[0], 0, arg0 - 1, 0);
            }
        }
        if (var6 == 5) {
            class451 var42 = class63.method422(var4, 17492, var5);
            if (var42 != null) {
                class337.method2136(-161);
                class33 var43 = client.method2046(var42);
                class262.method1701(0, var43.method267((byte) 113), var43.field442, var42);
                class572.field8070 = class198.method1365(var42, 6858);
                class714.field9904 = var42.field6211 + "<col=ffffff>";
                if (class572.field8070 == null) {
                    class572.field8070 = "Null";
                }
            }
            return;
        }
        if (var6 == 18) {
            class702 var44 = class767.field10560[var7];
            if (var44 != null) {
                class548.field7880 = 2;
                class82.field905 = arg2;
                class549.field7888 = arg1;
                class182.field2819++;
                class749.field10366 = 0;
                class312 var45 = class353.method2245(class87.field971, class432.field5845, (byte) 103);
                var45.field4445.method2969(class629.field8818, -414819352);
                var45.field4445.method2992((byte) 127, class714.field9898);
                var45.field4445.method2969(var7, -414819352);
                var45.field4445.method2947(-117, class497.field7084);
                var45.field4445.method2994(class629.field8820.method2138(82, -6759) ? 1 : 0, (byte) -72);
                class208.method1440(var45, 101);
                class394.method2436(var44.method2102(true), -2, var44.method2102(true), var44.field4670[0], true, var44.field4672[0], 0, 0, 0);
            }
        }
        if (var6 == 4) {
            class702 var46 = class767.field10560[var7];
            if (var46 != null) {
                class548.field7880 = 2;
                class549.field7888 = arg1;
                class598.field8403++;
                class749.field10366 = 0;
                class82.field905 = arg2;
                class312 var47 = class353.method2245(class87.field971, class357.field5020, (byte) 39);
                var47.field4445.method2997(class629.field8820.method2138(82, -6759) ? 1 : 0, 13855);
                var47.field4445.method2992((byte) 127, var7);
                class208.method1440(var47, 66);
                class394.method2436(var46.method2102(true), -2, var46.method2102(true), var46.field4670[0], true, var46.field4672[0], 0, 0, 0);
            }
        }
        if (var6 == 20) {
            if (class745.field10317 > 0 && class629.field8820.method2138(82, -6759) && class629.field8820.method2138(81, -6759)) {
                class678.method3845(0, class124.field1922 + var4, class88.field999 + var5, class210.field3250.field5755);
            } else {
                class749.field10366 = 0;
                class82.field905 = arg2;
                class549.field7888 = arg1;
                class589.field8308++;
                class548.field7880 = 1;
                class312 var48 = class353.method2245(class87.field971, class578.field8146, (byte) 51);
                var48.field4445.method2990(arg0 + 254, class88.field999 + var5);
                var48.field4445.method2969(class124.field1922 + var4, arg0 ^ 0xE7465BE9);
                class208.method1440(var48, 26);
            }
        }
        if (var6 == 1010) {
            class82.field905 = arg2;
            class549.field7888 = arg1;
            class548.field7880 = 2;
            class410.field5569++;
            class749.field10366 = 0;
            class312 var49 = class353.method2245(class87.field971, class88.field997, (byte) 16);
            var49.field4445.method2957(var7, 1267307848);
            class208.method1440(var49, 67);
        }
        if (var6 == 46) {
            class82.field905 = arg2;
            class749.field10366 = 0;
            class548.field7880 = 2;
            class118.field1828++;
            class549.field7888 = arg1;
            class312 var50 = class353.method2245(class87.field971, class180.field2791, (byte) 74);
            var50.field4445.method2990(arg0 + 254, var7);
            var50.field4445.method2997(class629.field8820.method2138(82, -6759) ? 1 : 0, 13855);
            var50.field4445.method2957(class88.field999 + var5, 1267307848);
            var50.field4445.method2957(class124.field1922 + var4, 1267307848);
            class208.method1440(var50, 118);
            class619.method3573(var5, var4, 100);
        }
        if (var6 == 53) {
            class82.field905 = arg2;
            class548.field7880 = 2;
            class749.field10366 = 0;
            class549.field7888 = arg1;
            class710.field9863++;
            class312 var51 = class353.method2245(class87.field971, class88.field996, (byte) 113);
            var51.field4445.method2969(var7, -414819352);
            var51.field4445.method2992((byte) 127, var5 + class88.field999);
            var51.field4445.method2990(255, var4 + class124.field1922);
            var51.field4445.method2997(class629.field8820.method2138(82, -6759) ? 1 : 0, 13855);
            class208.method1440(var51, 31);
            class619.method3573(var5, var4, -92);
        }
        if (var6 == 51) {
            class82.field905 = arg2;
            class549.field7888 = arg1;
            class749.field10366 = 0;
            class285.field4202++;
            class548.field7880 = 1;
            class312 var52 = class353.method2245(class87.field971, class17.field311, (byte) 67);
            var52.field4445.method2957(class124.field1922 + var4, arg0 + 1267307847);
            var52.field4445.method2969(class629.field8818, -414819352);
            var52.field4445.method2992((byte) 127, class88.field999 + var5);
            var52.field4445.method2957(class714.field9898, 1267307848);
            var52.field4445.method2959(class497.field7084, (byte) 115);
            class208.method1440(var52, 95);
            class394.method2436(1, -4, 1, var4, true, var5, 0, arg0 - 1, 0);
        }
        if (var6 == 15) {
            class702 var53 = class767.field10560[var7];
            if (var53 != null) {
                class749.field10366 = 0;
                class549.field7888 = arg1;
                class321.field4539++;
                class548.field7880 = 2;
                class82.field905 = arg2;
                class312 var54 = class353.method2245(class87.field971, class781.field10718, (byte) 68);
                var54.field4445.method2990(255, var7);
                var54.field4445.method2997(class629.field8820.method2138(82, -6759) ? 1 : 0, arg0 + 13854);
                class208.method1440(var54, 54);
                class394.method2436(var53.method2102(true), -2, var53.method2102(true), var53.field4670[0], true, var53.field4672[0], 0, 0, 0);
            }
        }
        if (var6 == 13) {
            class702 var55 = class767.field10560[var7];
            if (var55 != null) {
                class82.field905 = arg2;
                class749.field10366 = 0;
                class505.field7174++;
                class548.field7880 = 2;
                class549.field7888 = arg1;
                class312 var56 = class353.method2245(class87.field971, class300.field4327, (byte) 63);
                var56.field4445.method2992((byte) 127, var7);
                var56.field4445.method2994(class629.field8820.method2138(82, arg0 - 6760) ? 1 : 0, (byte) -72);
                class208.method1440(var56, 46);
                class394.method2436(var55.method2102(true), -2, var55.method2102(true), var55.field4670[0], true, var55.field4672[0], 0, 0, 0);
            }
        }
        if (var6 == 1009) {
            class749.field10366 = 0;
            class548.field7880 = 2;
            class82.field905 = arg2;
            class549.field7888 = arg1;
            class205 var57 = (class205) class645.field9014.method2242((long) var7, -1);
            if (var57 != null) {
                class665 var58 = var57.field3181;
                class110 var59 = var58.field9240;
                if (var59.field1657 != null) {
                    var59 = var59.method840(class537.field7727, 127);
                }
                if (var59 != null) {
                    class465.field6547++;
                    class312 var60 = class353.method2245(class87.field971, class22.field363, (byte) 61);
                    var60.field4445.method2957(var59.field1690, arg0 ^ 0x4B899549);
                    class208.method1440(var60, arg0 + 96);
                }
            }
        }
        if (var6 == 8) {
            class702 var61 = class767.field10560[var7];
            if (var61 != null) {
                class548.field7880 = 2;
                class82.field905 = arg2;
                class680.field9445++;
                class549.field7888 = arg1;
                class749.field10366 = 0;
                class312 var62 = class353.method2245(class87.field971, class190.field2926, (byte) 43);
                var62.field4445.method2994(class629.field8820.method2138(82, arg0 ^ 0xFFFFE598) ? 1 : 0, (byte) -72);
                var62.field4445.method2990(255, var7);
                class208.method1440(var62, arg0 ^ 0x32);
                class394.method2436(var61.method2102(true), -2, var61.method2102(true), var61.field4670[0], true, var61.field4672[0], 0, 0, 0);
            }
        }
        if (var6 == 25) {
            class205 var63 = (class205) class645.field9014.method2242((long) var7, -1);
            if (var63 != null) {
                class549.field7888 = arg1;
                class82.field905 = arg2;
                class367.field5106++;
                class665 var64 = var63.field3181;
                class749.field10366 = 0;
                class548.field7880 = 2;
                class312 var65 = class353.method2245(class87.field971, class57.field715, (byte) 123);
                var65.field4445.method2952(0, class629.field8820.method2138(82, arg0 ^ 0xFFFFE598) ? 1 : 0);
                var65.field4445.method2957(var7, 1267307848);
                class208.method1440(var65, 124);
                class394.method2436(var64.method2102(true), -2, var64.method2102(true), var64.field4670[0], true, var64.field4672[0], 0, 0, 0);
            }
        }
        if (var6 == 45) {
            class205 var66 = (class205) class645.field9014.method2242((long) var7, arg0 ^ 0xFFFFFFFE);
            if (var66 != null) {
                class654.field9130++;
                class82.field905 = arg2;
                class549.field7888 = arg1;
                class665 var67 = var66.field3181;
                class548.field7880 = 2;
                class749.field10366 = 0;
                class312 var68 = class353.method2245(class87.field971, class515.field7286, (byte) 38);
                var68.field4445.method2973(class497.field7084, arg0 ^ 0x4CB8);
                var68.field4445.method2969(class629.field8818, -414819352);
                var68.field4445.method2969(class714.field9898, -414819352);
                var68.field4445.method2952(arg0 - 1, class629.field8820.method2138(82, arg0 + -6760) ? 1 : 0);
                var68.field4445.method2969(var7, -414819352);
                class208.method1440(var68, arg0 ^ 0x71);
                class394.method2436(var67.method2102(true), -2, var67.method2102(true), var67.field4670[0], true, var67.field4672[0], 0, 0, 0);
            }
        }
        if (var6 == 9) {
            class549.field7888 = arg1;
            class749.field10366 = 0;
            class82.field905 = arg2;
            class548.field7880 = 2;
            class92.field1030++;
            class312 var69 = class353.method2245(class87.field971, class614.field8618, (byte) 126);
            var69.field4445.method2957(class629.field8818, 1267307848);
            var69.field4445.method2969(Integer.MAX_VALUE & (int) (var8 >>> 32), arg0 - 414819353);
            var69.field4445.method2957(class714.field9898, 1267307848);
            var69.field4445.method2992((byte) 127, var4 + class124.field1922);
            var69.field4445.method2952(0, class629.field8820.method2138(82, -6759) ? 1 : 0);
            var69.field4445.method2973(class497.field7084, 19641);
            var69.field4445.method2992((byte) 127, class88.field999 + var5);
            class208.method1440(var69, 27);
            class680.method3852(var4, var5, (byte) 125, var8);
        }
        if (var6 == 44) {
            class205 var70 = (class205) class645.field9014.method2242((long) var7, -1);
            if (var70 != null) {
                class548.field7880 = 2;
                class337.field4731++;
                class549.field7888 = arg1;
                class82.field905 = arg2;
                class665 var71 = var70.field3181;
                class749.field10366 = 0;
                class312 var72 = class353.method2245(class87.field971, class111.field1699, (byte) 80);
                var72.field4445.method2957(var7, 1267307848);
                var72.field4445.method2952(0, class629.field8820.method2138(82, -6759) ? 1 : 0);
                class208.method1440(var72, arg0 ^ 0x77);
                class394.method2436(var71.method2102(true), -2, var71.method2102(true), var71.field4670[0], true, var71.field4672[0], 0, 0, 0);
            }
        }
        if (var6 == 21) {
            class702 var73 = class767.field10560[var7];
            if (var73 != null) {
                class549.field7888 = arg1;
                class749.field10366 = 0;
                class321.field4539++;
                class82.field905 = arg2;
                class548.field7880 = 2;
                class312 var74 = class353.method2245(class87.field971, class788.field10822, (byte) 46);
                var74.field4445.method2981((byte) -34, class629.field8820.method2138(82, -6759) ? 1 : 0);
                var74.field4445.method2990(255, var7);
                class208.method1440(var74, 67);
                class394.method2436(var73.method2102(true), -2, var73.method2102(true), var73.field4670[0], true, var73.field4672[0], 0, 0, 0);
            }
        }
        if (class691.field9660) {
            class337.method2136(-161);
        }
        if (class532.field7688 != null && class191.field2945 == 0) {
            class564.method3329(class532.field7688, 8195);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public static final void method3597(byte arg0) {
        field8760++;
        if (arg0 < 23) {
            field8757 = null;
        }
        class110.field1640.method2212(1163641539);
        int var1 = class110.field1640.method2216(-102, 8);
        if (var1 < class235.field3545) {
            for (int var2 = var1; var2 < class235.field3545; var2++) {
                class318.field4521[class591.field8330++] = class216.field3356[var2];
            }
        }
        if (class235.field3545 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class235.field3545 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class216.field3356[var3];
            class665 var5 = ((class205) class645.field9014.method2242((long) var4, -1)).field3181;
            int var6 = class110.field1640.method2216(-99, 1);
            if (var6 == 0) {
                class216.field3356[class235.field3545++] = var4;
                var5.field4633 = class704.field9812;
            } else {
                int var7 = class110.field1640.method2216(-120, 2);
                if (var7 == 0) {
                    class216.field3356[class235.field3545++] = var4;
                    var5.field4633 = class704.field9812;
                    class304.field4388[class45.field566++] = var4;
                } else if (var7 == 1) {
                    class216.field3356[class235.field3545++] = var4;
                    var5.field4633 = class704.field9812;
                    int var8 = class110.field1640.method2216(-108, 3);
                    var5.method3792((byte) -120, 1, var8);
                    int var9 = class110.field1640.method2216(-109, 1);
                    if (var9 == 1) {
                        class304.field4388[class45.field566++] = var4;
                    }
                } else if (var7 == 2) {
                    class216.field3356[class235.field3545++] = var4;
                    var5.field4633 = class704.field9812;
                    if (class110.field1640.method2216(-97, 1) == 1) {
                        int var11 = class110.field1640.method2216(-97, 3);
                        var5.method3792((byte) -91, 2, var11);
                        int var12 = class110.field1640.method2216(-122, 3);
                        var5.method3792((byte) -88, 2, var12);
                    } else {
                        int var10 = class110.field1640.method2216(-111, 3);
                        var5.method3792((byte) -96, 0, var10);
                    }
                    int var13 = class110.field1640.method2216(-123, 1);
                    if (var13 == 1) {
                        class304.field4388[class45.field566++] = var4;
                    }
                } else if (var7 == 3) {
                    class318.field4521[class591.field8330++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field8751.method3197((byte) -116, this.field8755);
        field8752++;
        super.finalize();
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lko;J[Lec;)V")
    public class625(class529 arg0, long arg1, class246[] arg2) {
        this.field8751 = arg0;
        this.field8755 = arg1;
    }
}
