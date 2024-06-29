import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public abstract class class391 {

    @OriginalMember(owner = "client!un", name = "d", descriptor = "[I")
    public static int[] field5004 = new int[3];

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field5007 = 0;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "Lcga;")
    public static class449 field5002 = new class449(6, 2);

    @OriginalMember(owner = "client!un", name = "i", descriptor = "[[I")
    public static int[][] field5009 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!un", name = "j", descriptor = "[I")
    public static int[] field5010 = null;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "Lpfa;")
    public static class275 field5005;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BIII)V")
    public static final void method2224(byte arg0, int arg1, int arg2, int arg3) {
        field5001++;
        int var4 = class227.field2938 + arg2;
        int var5 = class522.field6612 + arg1;
        if (class407.field5237 == null || arg2 < 0 || arg1 < 0 || class85.field1090 <= arg2 || arg1 >= class656.field8932) {
            return;
        }
        long var6 = (long) (var4 | var5 << 14 | arg3 << 28);
        class62 var8 = (class62) class370.field4774.method3828(var6, (byte) -91);
        int var9 = 123 % ((-arg0 - 76) / 42);
        if (var8 == null) {
            class303.method1798(arg3, arg2, arg1);
            return;
        }
        class40 var10 = (class40) var8.field766.method1909(true);
        if (var10 == null) {
            class303.method1798(arg3, arg2, arg1);
            return;
        }
        class3 var11 = (class3) class303.method1798(arg3, arg2, arg1);
        if (var11 == null) {
            var11 = new class3();
        } else {
            var11.field16 = var11.field24 = -1;
        }
        var11.field14 = var10.field580;
        var11.field13 = var10.field578;
        label47: while (true) {
            class40 var12 = (class40) var8.field766.method1916((byte) 101);
            if (var12 == null) {
                break;
            }
            if (var11.field14 != var12.field580) {
                var11.field16 = var12.field580;
                var11.field26 = var12.field578;
                while (true) {
                    class40 var13 = (class40) var8.field766.method1916((byte) 95);
                    if (var13 == null) {
                        break label47;
                    }
                    if (var11.field14 != var13.field580 && var11.field16 != var13.field580) {
                        var11.field17 = var13.field578;
                        var11.field24 = var13.field580;
                    }
                }
            }
        }
        int var14 = class514.method2798((arg1 << 9) + 256, (arg2 << 9) + 256, arg3, (byte) 45);
        class115.method786(arg3, arg2, arg1, var14, var11);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V")
    public abstract void method799(byte arg0);

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)J")
    public abstract long method798(int arg0);

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(JI)I")
    public abstract int method802(long arg0, int arg1);

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)V")
    public static final void method2225(int arg0, int arg1) {
        field5006++;
        if (arg1 > -92) {
            method2224((byte) -51, 48, 27, -54);
        }
        class113.field1419 = 1000000000L / (long) arg0;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(B)V")
    public static void method2226(byte arg0) {
        field5009 = null;
        field5004 = null;
        field5010 = null;
        field5002 = null;
        if (arg0 == 15) {
            field5005 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)J")
    public abstract long method800(boolean arg0);

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(JI)I")
    public final int method2227(long arg0, int arg1) {
        field5008++;
        long var4 = this.method800(false);
        if ((long) arg1 < var4) {
            class700.method3867(29279, var4);
        }
        return this.method802(arg0, -92);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lts;ZII)V")
    public static final void method2228(class501 arg0, boolean arg1, int arg2, int arg3) {
        field5003++;
        if (arg0 == null || class345.field4438.field4121 == arg0) {
            return;
        }
        int var4 = arg0.field6248;
        int var5 = arg0.field6251;
        int var6 = arg0.field6242;
        int var7 = (int) arg0.field6247;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg0.field6247;
        if (var6 == 1009) {
            class161.field1900 = arg2;
            class315.field3949 = 2;
            class182.field2141 = arg3;
            class459.field5724++;
            class406.field5235 = 0;
            class124 var10 = class336.method1924(class253.field3269, class636.field8620, (byte) 88);
            var10.field1516.method3080((byte) -48, var7);
            class197.method1156((byte) 124, var10);
        }
        if (var6 == 4) {
            class365 var11 = class132.field1601[var7];
            if (var11 != null) {
                class315.field3949 = 2;
                class243.field3134++;
                class406.field5235 = 0;
                class182.field2141 = arg3;
                class161.field1900 = arg2;
                class124 var12 = class336.method1924(class146.field1752, class636.field8620, (byte) -90);
                var12.field1516.method3090(class307.field3884.method1592((byte) -120, 82) ? 1 : 0, 3);
                var12.field1516.method3051(true, var7);
                class197.method1156((byte) 88, var12);
                class472.method2565(-2, true, var11.method210(arg1), var11.field508[0], false, 0, 0, var11.method210(arg1), var11.field511[0]);
            }
        }
        if (var6 == 5) {
            class161.field1900 = arg2;
            class182.field2141 = arg3;
            class24.field272++;
            class315.field3949 = 2;
            class406.field5235 = 0;
            class124 var13 = class336.method1924(class564.field7045, class636.field8620, (byte) -91);
            var13.field1516.method3080((byte) -76, class194.field2290);
            var13.field1516.method3073(1520, class168.field1978);
            var13.field1516.method3053(true, class307.field3884.method1592((byte) -120, 82) ? 1 : 0);
            var13.field1516.method3051(true, class67.field815.field495);
            var13.field1516.method3067(1370571624, class112.field1383);
            class197.method1156((byte) 84, var13);
        }
        if (var6 == 50) {
            class406.field5235 = 0;
            class182.field2141 = arg3;
            class315.field3949 = 2;
            class22.field254++;
            class161.field1900 = arg2;
            class124 var14 = class336.method1924(class688.field9486, class636.field8620, (byte) 108);
            var14.field1516.method3051(!arg1, class112.field1383);
            var14.field1516.method3051(true, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var14.field1516.method3065(-1, var5 + class522.field6612);
            var14.field1516.method3065(-1, class227.field2938 + var4);
            var14.field1516.method3061(class168.field1978, (byte) 115);
            var14.field1516.method3080((byte) -125, class194.field2290);
            var14.field1516.method3053(true, class307.field3884.method1592((byte) -120, 82) ? 1 : 0);
            class197.method1156((byte) 115, var14);
            class64.method514(28356, var8, var4, var5);
        }
        if (arg1) {
            field5002 = null;
        }
        if (var6 == 11) {
            class182.field2141 = arg3;
            class388.field4985++;
            class406.field5235 = 0;
            class161.field1900 = arg2;
            class315.field3949 = 2;
            class124 var15 = class336.method1924(class220.field2561, class636.field8620, (byte) -5);
            var15.field1516.method3080((byte) -51, var4 + class227.field2938);
            var15.field1516.method3065(-1, class522.field6612 + var5);
            var15.field1516.method3043(class307.field3884.method1592((byte) -120, 82) ? 1 : 0, 126);
            var15.field1516.method3051(true, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class197.method1156((byte) 116, var15);
            class64.method514(28356, var8, var4, var5);
        }
        if (var6 == 30) {
            class704 var16 = (class704) class168.field1973.method3828((long) var7, (byte) -91);
            if (var16 != null) {
                class182.field2141 = arg3;
                class434.field5474++;
                class161.field1900 = arg2;
                class406.field5235 = 0;
                class506 var17 = var16.field9854;
                class315.field3949 = 2;
                class124 var18 = class336.method1924(class373.field4812, class636.field8620, (byte) -24);
                var18.field1516.method3043(class307.field3884.method1592((byte) -120, 82) ? 1 : 0, 61);
                var18.field1516.method3067(1370571624, var7);
                class197.method1156((byte) 114, var18);
                class472.method2565(-2, true, var17.method210(false), var17.field508[0], false, 0, 0, var17.method210(false), var17.field511[0]);
            }
        }
        if (var6 == 25) {
            class365 var19 = class132.field1601[var7];
            if (var19 != null) {
                class161.field1900 = arg2;
                class315.field3949 = 2;
                class182.field2141 = arg3;
                class406.field5235 = 0;
                class122.field1484++;
                class124 var20 = class336.method1924(class98.field1263, class636.field8620, (byte) 100);
                var20.field1516.method3080((byte) -125, var7);
                var20.field1516.method3090(class307.field3884.method1592((byte) -120, 82) ? 1 : 0, 3);
                class197.method1156((byte) 99, var20);
                class472.method2565(-2, true, var19.method210(arg1), var19.field508[0], arg1, 0, 0, var19.method210(arg1), var19.field511[0]);
            }
        }
        if (var6 == 13) {
            class704 var21 = (class704) class168.field1973.method3828((long) var7, (byte) -91);
            if (var21 != null) {
                class339.field4328++;
                class161.field1900 = arg2;
                class182.field2141 = arg3;
                class506 var22 = var21.field9854;
                class315.field3949 = 2;
                class406.field5235 = 0;
                class124 var23 = class336.method1924(class210.field2484, class636.field8620, (byte) -50);
                var23.field1516.method3053(true, class307.field3884.method1592((byte) -120, 82) ? 1 : 0);
                var23.field1516.method3051(!arg1, var7);
                class197.method1156((byte) 83, var23);
                class472.method2565(-2, true, var22.method210(arg1), var22.field508[0], arg1, 0, 0, var22.method210(arg1), var22.field511[0]);
            }
        }
        if (var6 == 3) {
            class337 var24 = class680.method3758(true, var5, var4);
            if (var24 != null) {
                class167.method1012(108);
                class357 var25 = client.method1693(var24);
                class136.method872(var24, 0, var25.method2042(-120), var25.field4602);
                class467.field5794 = class687.method3798(var24, 0);
                class351.field4540 = var24.field4272 + "<col=ffffff>";
                if (class467.field5794 == null) {
                    class467.field5794 = "Null";
                }
            }
            return;
        }
        if (var6 == 1001) {
            class161.field1900 = arg2;
            class406.field5235 = 0;
            class182.field2141 = arg3;
            class315.field3949 = 2;
            class704 var26 = (class704) class168.field1973.method3828((long) var7, (byte) -91);
            if (var26 != null) {
                class506 var27 = var26.field9854;
                class689 var28 = var27.field6326;
                if (var28.field9546 != null) {
                    var28 = var28.method3812(class327.field4084, -118);
                }
                if (var28 != null) {
                    class461.field5750++;
                    class124 var29 = class336.method1924(class413.field5285, class636.field8620, (byte) -56);
                    var29.field1516.method3080((byte) -66, var28.field9536);
                    class197.method1156((byte) 98, var29);
                }
            }
        }
        if (var6 == 1011) {
            class406.field5235 = 0;
            class182.field2141 = arg3;
            class161.field1900 = arg2;
            class315.field3949 = 2;
            class17.field167++;
            class124 var30 = class336.method1924(class222.field2571, class636.field8620, (byte) -84);
            var30.field1516.method3080((byte) -98, var7);
            class197.method1156((byte) 87, var30);
        }
        if (var6 == 20) {
            class616.field8349++;
            class161.field1900 = arg2;
            class182.field2141 = arg3;
            class315.field3949 = 2;
            class406.field5235 = 0;
            class124 var31 = class336.method1924(class245.field3163, class636.field8620, (byte) -125);
            var31.field1516.method3065(-1, class522.field6612 + var5);
            var31.field1516.method3052(!arg1, class307.field3884.method1592((byte) -120, 82) ? 1 : 0);
            var31.field1516.method3051(!arg1, class227.field2938 + var4);
            var31.field1516.method3065(-1, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class197.method1156((byte) 92, var31);
            class64.method514(28356, var8, var4, var5);
        }
        if (var6 == 60) {
            class337 var32 = class680.method3758(!arg1, var5, var4);
            if (var32 != null) {
                class647.method3613((byte) 127, var32);
            }
        }
        if (var6 == 21) {
            class406.field5235 = 0;
            class315.field3949 = 2;
            class394.field5021++;
            class161.field1900 = arg2;
            class182.field2141 = arg3;
            class124 var33 = class336.method1924(class662.field8972, class636.field8620, (byte) 107);
            var33.field1516.method3051(true, var7);
            var33.field1516.method3065(-1, class522.field6612 + var5);
            var33.field1516.method3052(true, class307.field3884.method1592((byte) -120, 82) ? 1 : 0);
            var33.field1516.method3080((byte) -81, class227.field2938 + var4);
            class197.method1156((byte) 100, var33);
            class168.method1018(-111, var5, var4);
        }
        if (var6 == 46) {
            class182.field2141 = arg3;
            class161.field1900 = arg2;
            class406.field5235 = 0;
            class315.field3949 = 2;
            class22.field255++;
            class124 var34 = class336.method1924(class587.field7888, class636.field8620, (byte) 100);
            var34.field1516.method3067(1370571624, var7);
            var34.field1516.method3051(true, class522.field6612 + var5);
            var34.field1516.method3052(true, class307.field3884.method1592((byte) -120, 82) ? 1 : 0);
            var34.field1516.method3065(-1, class194.field2290);
            var34.field1516.method3080((byte) -73, class112.field1383);
            var34.field1516.method3061(class168.field1978, (byte) 115);
            var34.field1516.method3051(!arg1, class227.field2938 + var4);
            class197.method1156((byte) 89, var34);
            class168.method1018(-106, var5, var4);
        }
        if (var6 == 44 && class83.field1066 == null) {
            class197.method1154((byte) 1, var4, var5);
            class83.field1066 = class680.method3758(true, var5, var4);
            class99.method721((byte) -76, class83.field1066);
        }
        if (var6 == 15) {
            class693.field9601++;
            class406.field5235 = 0;
            class182.field2141 = arg3;
            class161.field1900 = arg2;
            class315.field3949 = 2;
            class124 var35 = class336.method1924(class455.field5685, class636.field8620, (byte) -127);
            var35.field1516.method3051(!arg1, class227.field2938 + var4);
            var35.field1516.method3080((byte) -116, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var35.field1516.method3052(true, class307.field3884.method1592((byte) -120, 82) ? 1 : 0);
            var35.field1516.method3067(1370571624, class522.field6612 + var5);
            class197.method1156((byte) 112, var35);
            class64.method514(28356, var8, var4, var5);
        }
        if (var6 == 19) {
            class365 var36 = class132.field1601[var7];
            if (var36 != null) {
                class406.field5235 = 0;
                class182.field2141 = arg3;
                class3.field19++;
                class161.field1900 = arg2;
                class315.field3949 = 2;
                class124 var37 = class336.method1924(class647.field8752, class636.field8620, (byte) -18);
                var37.field1516.method3090(class307.field3884.method1592((byte) -120, 82) ? 1 : 0, 3);
                var37.field1516.method3080((byte) -104, var7);
                class197.method1156((byte) 122, var37);
                class472.method2565(-2, true, var36.method210(arg1), var36.field508[0], false, 0, 0, var36.method210(false), var36.field511[0]);
            }
        }
        if (var6 == 17) {
            class365 var38 = class132.field1601[var7];
            if (var38 != null) {
                class406.field5235 = 0;
                class226.field2916++;
                class182.field2141 = arg3;
                class315.field3949 = 2;
                class161.field1900 = arg2;
                class124 var39 = class336.method1924(class351.field4539, class636.field8620, (byte) -6);
                var39.field1516.method3043(class307.field3884.method1592((byte) -120, 82) ? 1 : 0, 98);
                var39.field1516.method3065(-1, var7);
                class197.method1156((byte) 110, var39);
                class472.method2565(-2, true, var38.method210(false), var38.field508[0], false, 0, 0, var38.method210(arg1), var38.field511[0]);
            }
        }
        if (var6 == 22 || var6 == 1002) {
            class345.method1991(var4, arg0.field6243, 31281, var7, var5);
        }
        if (var6 == 47) {
            class704 var40 = (class704) class168.field1973.method3828((long) var7, (byte) -91);
            if (var40 != null) {
                class182.field2141 = arg3;
                class315.field3949 = 2;
                class406.field5235 = 0;
                class506 var41 = var40.field9854;
                class381.field4881++;
                class161.field1900 = arg2;
                class124 var42 = class336.method1924(class288.field3648, class636.field8620, (byte) -123);
                var42.field1516.method3080((byte) -50, var7);
                var42.field1516.method3090(class307.field3884.method1592((byte) -120, 82) ? 1 : 0, 3);
                class197.method1156((byte) 104, var42);
                class472.method2565(-2, true, var41.method210(false), var41.field508[0], false, 0, 0, var41.method210(false), var41.field511[0]);
            }
        }
        if (var6 == 57) {
            class365 var43 = class132.field1601[var7];
            if (var43 != null) {
                class24.field272++;
                class182.field2141 = arg3;
                class315.field3949 = 2;
                class161.field1900 = arg2;
                class406.field5235 = 0;
                class124 var44 = class336.method1924(class564.field7045, class636.field8620, (byte) 95);
                var44.field1516.method3080((byte) -74, class194.field2290);
                var44.field1516.method3073(1520, class168.field1978);
                var44.field1516.method3053(true, class307.field3884.method1592((byte) -120, 82) ? 1 : 0);
                var44.field1516.method3051(true, var7);
                var44.field1516.method3067(1370571624, class112.field1383);
                class197.method1156((byte) 99, var44);
                class472.method2565(-2, true, var43.method210(false), var43.field508[0], arg1, 0, 0, var43.method210(false), var43.field511[0]);
            }
        }
        if (var6 == 23) {
            class161.field1900 = arg2;
            class406.field5235 = 0;
            class540.field6814++;
            class182.field2141 = arg3;
            class315.field3949 = 2;
            class124 var45 = class336.method1924(class438.field5519, class636.field8620, (byte) 108);
            var45.field1516.method3065(-1, class227.field2938 + var4);
            var45.field1516.method3090(class307.field3884.method1592((byte) -120, 82) ? 1 : 0, 3);
            var45.field1516.method3067(1370571624, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var45.field1516.method3065(-1, class522.field6612 + var5);
            class197.method1156((byte) 109, var45);
            class64.method514(28356, var8, var4, var5);
        }
        if (var6 == 2) {
            class704 var46 = (class704) class168.field1973.method3828((long) var7, (byte) -91);
            if (var46 != null) {
                class315.field3949 = 2;
                class506 var47 = var46.field9854;
                class182.field2141 = arg3;
                class406.field5235 = 0;
                class161.field1900 = arg2;
                class445.field5593++;
                class124 var48 = class336.method1924(class243.field3146, class636.field8620, (byte) -50);
                var48.field1516.method3052(true, class307.field3884.method1592((byte) -120, 82) ? 1 : 0);
                var48.field1516.method3080((byte) -88, var7);
                class197.method1156((byte) 108, var48);
                class472.method2565(-2, true, var47.method210(false), var47.field508[0], false, 0, 0, var47.method210(false), var47.field511[0]);
            }
        }
        if (var6 == 48) {
            class365 var49 = class132.field1601[var7];
            if (var49 != null) {
                class671.field9110++;
                class182.field2141 = arg3;
                class406.field5235 = 0;
                class161.field1900 = arg2;
                class315.field3949 = 2;
                class124 var50 = class336.method1924(class96.field1250, class636.field8620, (byte) -80);
                var50.field1516.method3080((byte) -83, var7);
                var50.field1516.method3052(true, class307.field3884.method1592((byte) -120, 82) ? 1 : 0);
                class197.method1156((byte) 108, var50);
                class472.method2565(-2, true, var49.method210(arg1), var49.field508[0], false, 0, 0, var49.method210(false), var49.field511[0]);
            }
        }
        if (var6 == 1012 || var6 == 1010 || var6 == 1003 || var6 == 1008 || var6 == 1007) {
            class556.method2961(var4, var7, var6, 27112);
        }
        if (var6 == 49) {
            class406.field5235 = 0;
            class361.field4629++;
            class315.field3949 = 2;
            class182.field2141 = arg3;
            class161.field1900 = arg2;
            class124 var51 = class336.method1924(class432.field5449, class636.field8620, (byte) 88);
            var51.field1516.method3043(class307.field3884.method1592((byte) -120, 82) ? 1 : 0, 54);
            var51.field1516.method3065(-1, var5 + class522.field6612);
            var51.field1516.method3051(!arg1, class227.field2938 + var4);
            var51.field1516.method3051(true, var7);
            class197.method1156((byte) 115, var51);
            class168.method1018(-121, var5, var4);
        }
        if (var6 == 8) {
            if (class146.field1745 > 0 && class307.field3884.method1592((byte) -120, 82) && class307.field3884.method1592((byte) -120, 81)) {
                class667.method3709(63, class67.field815.field8010, class522.field6612 + var5, class227.field2938 + var4);
            } else {
                class406.field5235 = 0;
                class315.field3949 = 1;
                class161.field1900 = arg2;
                class239.field3098++;
                class182.field2141 = arg3;
                class124 var52 = class336.method1924(class227.field2922, class636.field8620, (byte) 118);
                var52.field1516.method3080((byte) -84, class522.field6612 + var5);
                var52.field1516.method3051(true, class227.field2938 + var4);
                class197.method1156((byte) 110, var52);
            }
        }
        if (var6 == 9) {
            if (class146.field1745 > 0 && class307.field3884.method1592((byte) -120, 82) && class307.field3884.method1592((byte) -120, 81)) {
                class667.method3709(63, class67.field815.field8010, class522.field6612 + var5, class227.field2938 + var4);
            } else {
                class124 var53 = class443.method2435(var7, var4, -128, var5);
                if (var7 == 1) {
                    var53.field1516.method3090(-1, 3);
                    var53.field1516.method3090(-1, 3);
                    var53.field1516.method3080((byte) -72, (int) class689.field9561);
                    var53.field1516.method3090(57, 3);
                    var53.field1516.method3090(class290.field3661, 3);
                    var53.field1516.method3090(class352.field4559, 3);
                    var53.field1516.method3090(89, 3);
                    var53.field1516.method3080((byte) -99, class67.field815.field8018);
                    var53.field1516.method3080((byte) -113, class67.field815.field8011);
                    var53.field1516.method3090(63, 3);
                } else {
                    class182.field2141 = arg3;
                    class406.field5235 = 0;
                    class161.field1900 = arg2;
                    class315.field3949 = 1;
                }
                class197.method1156((byte) 111, var53);
                class472.method2565(-4, true, 1, var4, arg1, 0, 0, 1, var5);
            }
        }
        if (var6 == 58) {
            class704 var54 = (class704) class168.field1973.method3828((long) var7, (byte) -91);
            if (var54 != null) {
                class484.field6009++;
                class406.field5235 = 0;
                class182.field2141 = arg3;
                class506 var55 = var54.field9854;
                class315.field3949 = 2;
                class161.field1900 = arg2;
                class124 var56 = class336.method1924(class38.field558, class636.field8620, (byte) -44);
                var56.field1516.method3065(-1, var7);
                var56.field1516.method3051(!arg1, class194.field2290);
                var56.field1516.method3073(1520, class168.field1978);
                var56.field1516.method3090(class307.field3884.method1592((byte) -120, 82) ? 1 : 0, 3);
                var56.field1516.method3051(true, class112.field1383);
                class197.method1156((byte) 87, var56);
                class472.method2565(-2, true, var55.method210(false), var55.field508[0], false, 0, 0, var55.method210(false), var55.field511[0]);
            }
        }
        if (var6 == 16) {
            class161.field1900 = arg2;
            class406.field5235 = 0;
            class338.field4323++;
            class315.field3949 = 2;
            class182.field2141 = arg3;
            class124 var57 = class336.method1924(class465.field5773, class636.field8620, (byte) 88);
            var57.field1516.method3067(1370571624, var7);
            var57.field1516.method3080((byte) -125, class227.field2938 + var4);
            var57.field1516.method3080((byte) -90, class522.field6612 + var5);
            var57.field1516.method3090(class307.field3884.method1592((byte) -120, 82) ? 1 : 0, 3);
            class197.method1156((byte) 88, var57);
            class168.method1018(-111, var5, var4);
        }
        if (var6 == 45) {
            class462.field5752++;
            class315.field3949 = 1;
            class406.field5235 = 0;
            class182.field2141 = arg3;
            class161.field1900 = arg2;
            class124 var58 = class336.method1924(class183.field2156, class636.field8620, (byte) 92);
            var58.field1516.method3067(1370571624, class112.field1383);
            var58.field1516.method3051(true, class522.field6612 + var5);
            var58.field1516.method3065(-1, class194.field2290);
            var58.field1516.method3061(class168.field1978, (byte) 115);
            var58.field1516.method3067(1370571624, class227.field2938 + var4);
            class197.method1156((byte) 87, var58);
            class472.method2565(-4, true, 1, var4, false, 0, 0, 1, var5);
        }
        if (var6 == 1004) {
            class161.field1900 = arg2;
            class107.field1354++;
            class406.field5235 = 0;
            class182.field2141 = arg3;
            class315.field3949 = 2;
            class124 var59 = class336.method1924(class83.field1065, class636.field8620, (byte) 117);
            var59.field1516.method3051(true, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var59.field1516.method3067(1370571624, class522.field6612 + var5);
            var59.field1516.method3090(class307.field3884.method1592((byte) -120, 82) ? 1 : 0, 3);
            var59.field1516.method3080((byte) -109, class227.field2938 + var4);
            class197.method1156((byte) 100, var59);
            class64.method514(28356, var8, var4, var5);
        }
        if (var6 == 51) {
            class704 var60 = (class704) class168.field1973.method3828((long) var7, (byte) -91);
            if (var60 != null) {
                class506 var61 = var60.field9854;
                class86.field1101++;
                class406.field5235 = 0;
                class182.field2141 = arg3;
                class315.field3949 = 2;
                class161.field1900 = arg2;
                class124 var62 = class336.method1924(class334.field4133, class636.field8620, (byte) 94);
                var62.field1516.method3067(1370571624, var7);
                var62.field1516.method3053(true, class307.field3884.method1592((byte) -120, 82) ? 1 : 0);
                class197.method1156((byte) 106, var62);
                class472.method2565(-2, true, var61.method210(false), var61.field508[0], false, 0, 0, var61.method210(arg1), var61.field511[0]);
            }
        }
        if (var6 == 12) {
            class315.field3949 = 2;
            class632.field8566++;
            class182.field2141 = arg3;
            class161.field1900 = arg2;
            class406.field5235 = 0;
            class124 var63 = class336.method1924(class420.field5349, class636.field8620, (byte) 109);
            var63.field1516.method3080((byte) -99, var7);
            var63.field1516.method3080((byte) -78, var5 + class522.field6612);
            var63.field1516.method3043(class307.field3884.method1592((byte) -120, 82) ? 1 : 0, 65);
            var63.field1516.method3065(-1, class227.field2938 + var4);
            class197.method1156((byte) 82, var63);
            class168.method1018(-120, var5, var4);
        }
        if (var6 == 18) {
            class315.field3949 = 2;
            class182.field2141 = arg3;
            class161.field1900 = arg2;
            class406.field5235 = 0;
            class296.field3778++;
            class124 var64 = class336.method1924(class537.field6756, class636.field8620, (byte) -63);
            var64.field1516.method3080((byte) -62, var5 + class522.field6612);
            var64.field1516.method3065(-1, class227.field2938 + var4);
            var64.field1516.method3053(!arg1, class307.field3884.method1592((byte) -120, 82) ? 1 : 0);
            var64.field1516.method3067(1370571624, var7);
            class197.method1156((byte) 81, var64);
            class168.method1018(-116, var5, var4);
        }
        if (var6 == 6) {
            class365 var65 = class132.field1601[var7];
            if (var65 != null) {
                class161.field1900 = arg2;
                class654.field8911++;
                class406.field5235 = 0;
                class182.field2141 = arg3;
                class315.field3949 = 2;
                class124 var66 = class336.method1924(class482.field5993, class636.field8620, (byte) 98);
                var66.field1516.method3051(!arg1, var7);
                var66.field1516.method3090(class307.field3884.method1592((byte) -120, 82) ? 1 : 0, 3);
                class197.method1156((byte) 110, var66);
                class472.method2565(-2, true, var65.method210(false), var65.field508[0], false, 0, 0, var65.method210(false), var65.field511[0]);
            }
        }
        if (var6 == 10) {
            class365 var67 = class132.field1601[var7];
            if (var67 != null) {
                class161.field1900 = arg2;
                class182.field2141 = arg3;
                class178.field2080++;
                class315.field3949 = 2;
                class406.field5235 = 0;
                class124 var68 = class336.method1924(class684.field9353, class636.field8620, (byte) 101);
                var68.field1516.method3065(-1, var7);
                var68.field1516.method3043(class307.field3884.method1592((byte) -120, 82) ? 1 : 0, 52);
                class197.method1156((byte) 97, var68);
                class472.method2565(-2, true, var67.method210(false), var67.field508[0], arg1, 0, 0, var67.method210(false), var67.field511[0]);
            }
        }
        if (var6 == 59) {
            class365 var69 = class132.field1601[var7];
            if (var69 != null) {
                class182.field2141 = arg3;
                class161.field1900 = arg2;
                class406.field5235 = 0;
                class315.field3949 = 2;
                class106.field1332++;
                class124 var70 = class336.method1924(class325.field4052, class636.field8620, (byte) -92);
                var70.field1516.method3090(class307.field3884.method1592((byte) -120, 82) ? 1 : 0, 3);
                var70.field1516.method3080((byte) -107, var7);
                class197.method1156((byte) 90, var70);
                class472.method2565(-2, true, var69.method210(false), var69.field508[0], arg1, 0, 0, var69.method210(false), var69.field511[0]);
            }
        }
        if (class37.field542) {
            class167.method1012(100);
        }
        if (class71.field922 != null && class51.field656 == 0) {
            class99.method721((byte) -71, class71.field922);
        }
    }
}
