import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class548 extends class4 {

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    private int field7973;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
    private int field7979;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
    private int field7977;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
    private int field7975;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "Z")
    public static boolean field7976 = false;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "Lrl;")
    public static class672 field7981 = new class672(57, 0);

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public static int field7972;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
    public static int field7974;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
    public static int field7978;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
    public static int field7980;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
    public static int field7982;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)V")
    public final void method19(int arg0, int arg1, int arg2) {
        ++field7980;
        if (arg1 != 1) {
            method3312((class295) null, -60, -119, (byte) 109);
        }
        int var4 = this.field7977 * arg0 >> 12;
        int var5 = this.field7979 * arg0 >> 12;
        int var6 = this.field7973 * arg2 >> 12;
        int var7 = this.field7975 * arg2 >> 12;
        class591.method3449(var6, super.field32, arg1 ^ 14381, var5, var4, var7);
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(III)V")
    public final void method21(int arg0, int arg1, int arg2) {
        ++field7982;
        int var4 = this.field7977 * arg0 >> 12;
        if (arg1 != 8746) {
            method3312((class295) null, 107, 123, (byte) -67);
        }
        int var5 = this.field7979 * arg0 >> 12;
        int var6 = this.field7973 * arg2 >> 12;
        int var7 = this.field7975 * arg2 >> 12;
        class582.method3415(super.field28, var4, super.field31, arg1 + -8745, var7, var6, var5);
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(B)V")
    public static void method3310(byte arg0) {
        field7981 = null;
        if (arg0 > -58) {
            method3310((byte) 55);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
    public static final void method3311(int arg0) {
        ++field7972;
        class335.field5482.method569(0);
        if (arg0 != 1486) {
            method3311(-52);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIB)V")
    public final void method22(int arg0, int arg1, byte arg2) {
        ++field7974;
        int var4 = this.field7977 * arg1 >> 12;
        int var5 = this.field7979 * arg1 >> 12;
        int var6 = this.field7973 * arg0 >> 12;
        if (arg2 > -124) {
            this.method21(-30, -100, 28);
        }
        int var7 = this.field7975 * arg0 >> 12;
        class267.method1892(super.field31, super.field32, (byte) -105, var5, var4, var7, super.field28, var6);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Ldh;IIB)V")
    public static final void method3312(class295 arg0, int arg1, int arg2, byte arg3) {
        ++field7978;
        if (arg0 != null && class307.field4831.field8428 != arg0) {
            int var4 = arg0.field4628;
            int var5 = arg0.field4620;
            int var6 = arg0.field4631;
            int var7 = (int) arg0.field4627;
            if (var6 >= 2000) {
                var6 -= 2000;
            }
            long var8 = arg0.field4627;
            if (var6 == 51) {
                class304 var10 = class597.field8465[var7];
                if (var10 != null) {
                    class618.field8747 = arg2;
                    class165.field2772 = 0;
                    class234.field3713 = arg1;
                    ++class240.field3794;
                    class424.field6447 = 2;
                    class165 var11 = class271.method1917(class420.field6424, (byte) -90, class530.field7729);
                    var11.field2776.method36((byte) -106, class83.field1024.method1515(82, -99) ? 1 : 0);
                    var11.field2776.method59((byte) -79, class198.field3243);
                    var11.field2776.method56(class219.field3577, true);
                    var11.field2776.method56(class517.field7498, true);
                    var11.field2776.method25(true, var7);
                    class642.method3726(arg3 ^ -684096363, var11);
                    class388.method2522(var10.field4265[0], var10.method1841(20744), var10.field4264[0], var10.method1841(20744), 0, -2, (byte) 31, 0, true);
                }
            }
            if (~var6 == -19) {
                class304 var12 = class597.field8465[var7];
                if (var12 != null) {
                    ++class316.field4975;
                    class165.field2772 = 0;
                    class234.field3713 = arg1;
                    class618.field8747 = arg2;
                    class424.field6447 = 2;
                    class165 var13 = class271.method1917(class420.field6424, (byte) -119, class436.field6655);
                    var13.field2776.method65(class83.field1024.method1515(82, -84) ? 1 : 0, -77);
                    var13.field2776.method25(true, var7);
                    class642.method3726(-684096285, var13);
                    class388.method2522(var12.field4265[0], var12.method1841(20744), var12.field4264[0], var12.method1841(20744), 0, -2, (byte) 31, 0, true);
                }
            }
            if (~var6 == -10) {
                class304 var14 = class597.field8465[var7];
                if (var14 != null) {
                    ++class443.field6739;
                    class234.field3713 = arg1;
                    class165.field2772 = 0;
                    class618.field8747 = arg2;
                    class424.field6447 = 2;
                    class165 var15 = class271.method1917(class420.field6424, (byte) -57, class565.field8121);
                    var15.field2776.method65(class83.field1024.method1515(82, arg3 ^ 59) ? 1 : 0, -77);
                    var15.field2776.method56(var7, true);
                    class642.method3726(arg3 ^ -684096363, var15);
                    class388.method2522(var14.field4265[0], var14.method1841(20744), var14.field4264[0], var14.method1841(20744), 0, -2, (byte) 31, 0, true);
                }
            }
            if (~var6 == -31) {
                class618.field8747 = arg2;
                class165.field2772 = 0;
                class424.field6447 = 2;
                ++class547.field7966;
                class234.field3713 = arg1;
                class165 var16 = class271.method1917(class420.field6424, (byte) -62, class576.field8211);
                var16.field2776.method65(class83.field1024.method1515(82, arg3 ^ -60) ? 1 : 0, -77);
                var16.field2776.method25(true, class612.field8702 + var4);
                var16.field2776.method76(false, class626.field8855 + var5);
                var16.field2776.method76(false, var7);
                class642.method3726(arg3 + -684096403, var16);
                class579.method3395(var5, -109, var4);
            }
            if (var6 == 49) {
                class424.field6447 = 2;
                class234.field3713 = arg1;
                class618.field8747 = arg2;
                ++class240.field3794;
                class165.field2772 = 0;
                class165 var17 = class271.method1917(class420.field6424, (byte) -85, class530.field7729);
                var17.field2776.method36((byte) -125, !class83.field1024.method1515(82, arg3 ^ -41) ? 0 : 1);
                var17.field2776.method59((byte) -73, class198.field3243);
                var17.field2776.method56(class219.field3577, true);
                var17.field2776.method56(class517.field7498, true);
                var17.field2776.method25(true, class567.field8141.field4197);
                class642.method3726(arg3 ^ -684096363, var17);
            }
            if (~var6 == -18) {
                class165.field2772 = 0;
                ++class98.field1587;
                class234.field3713 = arg1;
                class424.field6447 = 2;
                class618.field8747 = arg2;
                class165 var18 = class271.method1917(class420.field6424, (byte) -54, class466.field6940);
                var18.field2776.method65(class83.field1024.method1515(82, arg3 ^ 11) ? 1 : 0, -77);
                var18.field2776.method76(false, var4 - -class612.field8702);
                var18.field2776.method56(class626.field8855 + var5, true);
                var18.field2776.method25(true, Integer.MAX_VALUE & (int) (var8 >>> 32));
                class642.method3726(-684096285, var18);
                class591.method3451(var8, var5, var4, -23874);
            }
            if (~var6 == -7) {
                if (~class139.field2342 < -1 && class83.field1024.method1515(82, 116) && class83.field1024.method1515(81, arg3 ^ -7)) {
                    class432.method2747(class612.field8702 - -var4, class626.field8855 + var5, class567.field8141.field9695, arg3 + -41);
                } else {
                    class165 var19 = class146.method1235(var5, var7, 80, var4);
                    if (var7 == 1) {
                        var19.field2776.method65(-1, arg3 ^ -59);
                        var19.field2776.method65(-1, -77);
                        var19.field2776.method25(true, (int) class37.field514);
                        var19.field2776.method65(57, -77);
                        var19.field2776.method65(class44.field616, -77);
                        var19.field2776.method65(class64.field820, -77);
                        var19.field2776.method65(89, -77);
                        var19.field2776.method25(true, class567.field8141.field9696);
                        var19.field2776.method25(true, class567.field8141.field9705);
                        var19.field2776.method65(63, arg3 + -195);
                    } else {
                        class234.field3713 = arg1;
                        class165.field2772 = 0;
                        class618.field8747 = arg2;
                        class424.field6447 = 1;
                    }
                    class642.method3726(arg3 + -684096403, var19);
                    class388.method2522(var5, 1, var4, 1, 0, -4, (byte) 31, 0, true);
                }
            }
            if (var6 == 11) {
                class165.field2772 = 0;
                class234.field3713 = arg1;
                class618.field8747 = arg2;
                ++class361.field5717;
                class424.field6447 = 2;
                class165 var20 = class271.method1917(class420.field6424, (byte) -39, class282.field4514);
                var20.field2776.method65(class83.field1024.method1515(82, 104) ? 1 : 0, -77);
                var20.field2776.method76(false, class626.field8855 + var5);
                var20.field2776.method51(arg3 + 31439, var7);
                var20.field2776.method56(class612.field8702 + var4, true);
                class642.method3726(arg3 ^ -684096363, var20);
                class579.method3395(var5, arg3 ^ -13, var4);
            }
            if (~var6 == -13 || ~var6 == -1007) {
                class277.method1981(var4, var5, -23301, arg0.field4626, var7);
            }
            if (~var6 == -1003) {
                class424.field6447 = 2;
                class618.field8747 = arg2;
                ++class40.field534;
                class234.field3713 = arg1;
                class165.field2772 = 0;
                class165 var21 = class271.method1917(class420.field6424, (byte) -96, class100.field1651);
                var21.field2776.method25(true, var7);
                class642.method3726(arg3 + -684096403, var21);
            }
            if (var6 == 4) {
                class348 var22 = (class348) class592.field8395.method1558((long) var7, (byte) -93);
                if (var22 != null) {
                    class234.field3713 = arg1;
                    class165.field2772 = 0;
                    class589 var23 = var22.field5577;
                    class424.field6447 = 2;
                    ++class516.field7494;
                    class618.field8747 = arg2;
                    class165 var24 = class271.method1917(class420.field6424, (byte) -112, class320.field5007);
                    var24.field2776.method51(31557, var7);
                    var24.field2776.method34(30868, class83.field1024.method1515(82, -106) ? 1 : 0);
                    class642.method3726(-684096285, var24);
                    class388.method2522(var23.field4265[0], var23.method1841(20744), var23.field4264[0], var23.method1841(20744), 0, -2, (byte) 31, 0, true);
                }
            }
            if (~var6 == -48) {
                class304 var25 = class597.field8465[var7];
                if (var25 != null) {
                    ++class181.field3045;
                    class165.field2772 = 0;
                    class234.field3713 = arg1;
                    class618.field8747 = arg2;
                    class424.field6447 = 2;
                    class165 var26 = class271.method1917(class420.field6424, (byte) -111, class192.field3171);
                    var26.field2776.method52(!class83.field1024.method1515(82, -64) ? 0 : 1, arg3 + 16062);
                    var26.field2776.method76(false, var7);
                    class642.method3726(arg3 + -684096403, var26);
                    class388.method2522(var25.field4265[0], var25.method1841(arg3 + 20626), var25.field4264[0], var25.method1841(arg3 ^ 20862), 0, -2, (byte) 31, 0, true);
                }
            }
            if (~var6 == -60) {
                class304 var27 = class597.field8465[var7];
                if (var27 != null) {
                    ++class463.field6915;
                    class234.field3713 = arg1;
                    class618.field8747 = arg2;
                    class165.field2772 = 0;
                    class424.field6447 = 2;
                    class165 var28 = class271.method1917(class420.field6424, (byte) -101, class188.field3147);
                    var28.field2776.method56(var7, true);
                    var28.field2776.method65(class83.field1024.method1515(82, -127) ? 1 : 0, -77);
                    class642.method3726(arg3 ^ -684096363, var28);
                    class388.method2522(var27.field4265[0], var27.method1841(20744), var27.field4264[0], var27.method1841(20744), 0, -2, (byte) 31, 0, true);
                }
            }
            if (~var6 == -45) {
                class165.field2772 = 0;
                ++class344.field5548;
                class424.field6447 = 2;
                class618.field8747 = arg2;
                class234.field3713 = arg1;
                class165 var29 = class271.method1917(class420.field6424, (byte) -116, class74.field939);
                var29.field2776.method76(false, var7);
                var29.field2776.method51(31557, var5 - -class626.field8855);
                var29.field2776.method51(31557, class612.field8702 + var4);
                var29.field2776.method65(!class83.field1024.method1515(82, arg3 + -181) ? 0 : 1, -77);
                class642.method3726(-684096285, var29);
                class579.method3395(var5, -112, var4);
            }
            if (~var6 == -4) {
                if (class139.field2342 > 0 && class83.field1024.method1515(82, -94) && class83.field1024.method1515(81, arg3 + -223)) {
                    class432.method2747(class612.field8702 + var4, class626.field8855 + var5, class567.field8141.field9695, 115);
                } else {
                    ++class63.field818;
                    class424.field6447 = 1;
                    class234.field3713 = arg1;
                    class165.field2772 = 0;
                    class618.field8747 = arg2;
                    class165 var30 = class271.method1917(class420.field6424, (byte) -62, class540.field7882);
                    var30.field2776.method76(false, class612.field8702 + var4);
                    var30.field2776.method51(arg3 + 31439, class626.field8855 + var5);
                    class642.method3726(-684096285, var30);
                }
            }
            if (var6 == 19) {
                class304 var31 = class597.field8465[var7];
                if (var31 != null) {
                    class234.field3713 = arg1;
                    class165.field2772 = 0;
                    ++class403.field6214;
                    class618.field8747 = arg2;
                    class424.field6447 = 2;
                    class165 var32 = class271.method1917(class420.field6424, (byte) -111, class87.field1070);
                    var32.field2776.method65(!class83.field1024.method1515(82, 100) ? 0 : 1, arg3 ^ -59);
                    var32.field2776.method76(false, var7);
                    class642.method3726(-684096285, var32);
                    class388.method2522(var31.field4265[0], var31.method1841(20744), var31.field4264[0], var31.method1841(20744), 0, -2, (byte) 31, 0, true);
                }
            }
            if (~var6 == -3) {
                class348 var33 = (class348) class592.field8395.method1558((long) var7, (byte) -93);
                if (var33 != null) {
                    class165.field2772 = 0;
                    class618.field8747 = arg2;
                    class424.field6447 = 2;
                    class234.field3713 = arg1;
                    ++class243.field3863;
                    class589 var34 = var33.field5577;
                    class165 var35 = class271.method1917(class420.field6424, (byte) -77, class288.field4577);
                    var35.field2776.method34(30868, !class83.field1024.method1515(82, arg3 + -5) ? 0 : 1);
                    var35.field2776.method25(true, var7);
                    class642.method3726(-684096285, var35);
                    class388.method2522(var34.field4265[0], var34.method1841(20744), var34.field4264[0], var34.method1841(20744), 0, -2, (byte) 31, 0, true);
                }
            }
            if (~var6 == -23) {
                class304 var36 = class597.field8465[var7];
                if (var36 != null) {
                    class234.field3713 = arg1;
                    ++class40.field545;
                    class165.field2772 = 0;
                    class424.field6447 = 2;
                    class618.field8747 = arg2;
                    class165 var37 = class271.method1917(class420.field6424, (byte) -91, class40.field533);
                    var37.field2776.method25(true, var7);
                    var37.field2776.method65(class83.field1024.method1515(82, -95) ? 1 : 0, -77);
                    class642.method3726(-684096285, var37);
                    class388.method2522(var36.field4265[0], var36.method1841(20744), var36.field4264[0], var36.method1841(20744), 0, -2, (byte) 31, 0, true);
                }
            }
            if (~var6 == -11) {
                class165.field2772 = 0;
                ++class188.field3130;
                class234.field3713 = arg1;
                class618.field8747 = arg2;
                class424.field6447 = 2;
                class165 var38 = class271.method1917(class420.field6424, (byte) -86, class312.field4910);
                var38.field2776.method76(false, class626.field8855 + var5);
                var38.field2776.method25(true, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                var38.field2776.method51(31557, class612.field8702 + var4);
                var38.field2776.method52(class83.field1024.method1515(82, 99) ? 1 : 0, 16180);
                class642.method3726(arg3 ^ -684096363, var38);
                class591.method3451(var8, var5, var4, -23874);
            }
            if (var6 == 8) {
                class304 var39 = class597.field8465[var7];
                if (var39 != null) {
                    class424.field6447 = 2;
                    class165.field2772 = 0;
                    class234.field3713 = arg1;
                    ++class348.field5575;
                    class618.field8747 = arg2;
                    class165 var40 = class271.method1917(class420.field6424, (byte) -121, class181.field3049);
                    var40.field2776.method76(false, var7);
                    var40.field2776.method36((byte) -128, class83.field1024.method1515(82, 71) ? 1 : 0);
                    class642.method3726(-684096285, var40);
                    class388.method2522(var39.field4265[0], var39.method1841(20744), var39.field4264[0], var39.method1841(20744), 0, -2, (byte) 31, 0, true);
                }
            }
            if (~var6 == -16) {
                class165.field2772 = 0;
                class234.field3713 = arg1;
                class618.field8747 = arg2;
                class424.field6447 = 1;
                ++class472.field6986;
                class165 var41 = class271.method1917(class420.field6424, (byte) -65, class184.field3098);
                var41.field2776.method56(class517.field7498, true);
                var41.field2776.method51(arg3 ^ 31539, class626.field8855 - -var5);
                var41.field2776.method82(false, class198.field3243);
                var41.field2776.method25(true, class612.field8702 + var4);
                var41.field2776.method76(false, class219.field3577);
                class642.method3726(-684096285, var41);
                class388.method2522(var5, 1, var4, 1, 0, -4, (byte) 31, 0, true);
            }
            if (~var6 == -46) {
                class348 var42 = (class348) class592.field8395.method1558((long) var7, (byte) -93);
                if (var42 != null) {
                    ++class389.field6031;
                    class618.field8747 = arg2;
                    class234.field3713 = arg1;
                    class589 var43 = var42.field5577;
                    class424.field6447 = 2;
                    class165.field2772 = 0;
                    class165 var44 = class271.method1917(class420.field6424, (byte) -118, class472.field6981);
                    var44.field2776.method36((byte) -96, !class83.field1024.method1515(82, 55) ? 0 : 1);
                    var44.field2776.method51(31557, class219.field3577);
                    var44.field2776.method76(false, class517.field7498);
                    var44.field2776.method26((byte) -47, class198.field3243);
                    var44.field2776.method25(true, var7);
                    class642.method3726(-684096285, var44);
                    class388.method2522(var43.field4265[0], var43.method1841(arg3 + 20626), var43.field4264[0], var43.method1841(20744), 0, -2, (byte) 31, 0, true);
                }
            }
            if (~var6 == -21) {
                class234.field3713 = arg1;
                class618.field8747 = arg2;
                ++class115.field1800;
                class424.field6447 = 2;
                class165.field2772 = 0;
                class165 var45 = class271.method1917(class420.field6424, (byte) -100, class416.field6368);
                var45.field2776.method52(!class83.field1024.method1515(82, 105) ? 0 : 1, arg3 ^ 16194);
                var45.field2776.method56(class612.field8702 + var4, true);
                var45.field2776.method76(false, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                var45.field2776.method56(class626.field8855 + var5, true);
                class642.method3726(-684096285, var45);
                class591.method3451(var8, var5, var4, arg3 ^ -23864);
            }
            if (var6 == 1007) {
                class165.field2772 = 0;
                class424.field6447 = 2;
                class618.field8747 = arg2;
                ++class650.field9106;
                class234.field3713 = arg1;
                class165 var46 = class271.method1917(class420.field6424, (byte) -111, class602.field8565);
                var46.field2776.method51(31557, Integer.MAX_VALUE & (int) (var8 >>> 32));
                var46.field2776.method25(true, class612.field8702 + var4);
                var46.field2776.method25(true, class626.field8855 + var5);
                var46.field2776.method34(arg3 + 30750, class83.field1024.method1515(82, arg3 ^ -8) ? 1 : 0);
                class642.method3726(-684096285, var46);
                class591.method3451(var8, var5, var4, -23874);
            }
            if (var6 == 58) {
                class665 var47 = class626.method3656(28613, var5, var4);
                if (var47 != null) {
                    class490.method3001((byte) 51);
                    class73 var48 = client.method1955(var47);
                    class529.method3205(var47, var48.method740(-25706), arg3 + -374, var48.field921);
                    class523.field7609 = class67.method712(107, var47);
                    class289.field4586 = var47.field9342 + "<col=ffffff>";
                    if (class523.field7609 == null) {
                        class523.field7609 = "Null";
                    }
                }
            } else {
                if (var6 == 21) {
                    class165.field2772 = 0;
                    class618.field8747 = arg2;
                    class234.field3713 = arg1;
                    class424.field6447 = 2;
                    ++class226.field3641;
                    class165 var49 = class271.method1917(class420.field6424, (byte) -76, class61.field787);
                    var49.field2776.method36((byte) -115, class83.field1024.method1515(82, -104) ? 1 : 0);
                    var49.field2776.method56(var7, true);
                    var49.field2776.method25(true, var4 - -class612.field8702);
                    var49.field2776.method76(false, class626.field8855 + var5);
                    class642.method3726(-684096285, var49);
                    class579.method3395(var5, -97, var4);
                }
                if (~var6 == -1004 || ~var6 == -1009 || var6 == 1011 || var6 == 1001 || var6 == 1004) {
                    class353.method2373(var4, var7, arg3 + 130954, var6);
                }
                if (arg3 == 118) {
                    if (~var6 == -1013) {
                        class618.field8747 = arg2;
                        class234.field3713 = arg1;
                        class424.field6447 = 2;
                        class165.field2772 = 0;
                        class348 var50 = (class348) class592.field8395.method1558((long) var7, (byte) -93);
                        if (var50 != null) {
                            class589 var51 = var50.field5577;
                            class705 var52 = var51.field8354;
                            if (var52.field9912 != null) {
                                var52 = var52.method3973(true, class539.field7869);
                            }
                            if (var52 != null) {
                                ++class415.field6363;
                                class165 var53 = class271.method1917(class420.field6424, (byte) -77, class206.field3449);
                                var53.field2776.method25(true, var52.field9952);
                                class642.method3726(-684096285, var53);
                            }
                        }
                    }
                    if (var6 == 57 && class672.field9481 == null) {
                        class273.method1926(var4, var5, 119);
                        class672.field9481 = class626.method3656(28613, var5, var4);
                        class362.method2415(-119, class672.field9481);
                    }
                    if (var6 == 23) {
                        class165.field2772 = 0;
                        class618.field8747 = arg2;
                        class234.field3713 = arg1;
                        ++class262.field4279;
                        class424.field6447 = 2;
                        class165 var54 = class271.method1917(class420.field6424, (byte) -115, class665.field9424);
                        var54.field2776.method51(arg3 + 31439, class219.field3577);
                        var54.field2776.method52(class83.field1024.method1515(82, arg3 + -173) ? 1 : 0, 16180);
                        var54.field2776.method25(true, class517.field7498);
                        var54.field2776.method64(class198.field3243, -1);
                        var54.field2776.method25(true, var4 - -class612.field8702);
                        var54.field2776.method51(31557, class626.field8855 + var5);
                        var54.field2776.method51(31557, var7);
                        class642.method3726(-684096285, var54);
                        class579.method3395(var5, arg3 + -200, var4);
                    }
                    if (~var6 == -49) {
                        class618.field8747 = arg2;
                        class165.field2772 = 0;
                        class424.field6447 = 2;
                        ++class87.field1066;
                        class234.field3713 = arg1;
                        class165 var55 = class271.method1917(class420.field6424, (byte) -96, class518.field7503);
                        var55.field2776.method51(31557, class612.field8702 + var4);
                        var55.field2776.method25(true, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                        var55.field2776.method25(true, class626.field8855 + var5);
                        var55.field2776.method36((byte) -125, !class83.field1024.method1515(82, -94) ? 0 : 1);
                        class642.method3726(-684096285, var55);
                        class591.method3451(var8, var5, var4, arg3 ^ -23864);
                    }
                    if (var6 == 25) {
                        class348 var56 = (class348) class592.field8395.method1558((long) var7, (byte) -93);
                        if (var56 != null) {
                            class589 var57 = var56.field5577;
                            ++class434.field6594;
                            class165.field2772 = 0;
                            class234.field3713 = arg1;
                            class618.field8747 = arg2;
                            class424.field6447 = 2;
                            class165 var58 = class271.method1917(class420.field6424, (byte) -127, class464.field6925);
                            var58.field2776.method25(true, var7);
                            var58.field2776.method65(!class83.field1024.method1515(82, 96) ? 0 : 1, -77);
                            class642.method3726(-684096285, var58);
                            class388.method2522(var57.field4265[0], var57.method1841(20744), var57.field4264[0], var57.method1841(20744), 0, -2, (byte) 31, 0, true);
                        }
                    }
                    if (var6 == 50) {
                        class424.field6447 = 2;
                        ++class623.field8792;
                        class618.field8747 = arg2;
                        class234.field3713 = arg1;
                        class165.field2772 = 0;
                        class165 var59 = class271.method1917(class420.field6424, (byte) -50, class654.field9148);
                        var59.field2776.method76(false, Integer.MAX_VALUE & (int) (var8 >>> 32));
                        var59.field2776.method26((byte) -47, class198.field3243);
                        var59.field2776.method56(class517.field7498, true);
                        var59.field2776.method52(class83.field1024.method1515(82, -72) ? 1 : 0, 16180);
                        var59.field2776.method51(31557, var5 - -class626.field8855);
                        var59.field2776.method25(true, class612.field8702 + var4);
                        var59.field2776.method76(false, class219.field3577);
                        class642.method3726(arg3 ^ -684096363, var59);
                        class591.method3451(var8, var5, var4, -23874);
                    }
                    if (~var6 == -61) {
                        class348 var60 = (class348) class592.field8395.method1558((long) var7, (byte) -93);
                        if (var60 != null) {
                            class589 var61 = var60.field5577;
                            class165.field2772 = 0;
                            ++class108.field1763;
                            class618.field8747 = arg2;
                            class234.field3713 = arg1;
                            class424.field6447 = 2;
                            class165 var62 = class271.method1917(class420.field6424, (byte) -50, class518.field7507);
                            var62.field2776.method52(class83.field1024.method1515(82, 102) ? 1 : 0, 16180);
                            var62.field2776.method25(true, var7);
                            class642.method3726(arg3 + -684096403, var62);
                            class388.method2522(var61.field4265[0], var61.method1841(20744), var61.field4264[0], var61.method1841(20744), 0, -2, (byte) 31, 0, true);
                        }
                    }
                    if (~var6 == -1010) {
                        class618.field8747 = arg2;
                        ++class574.field8187;
                        class424.field6447 = 2;
                        class165.field2772 = 0;
                        class234.field3713 = arg1;
                        class165 var63 = class271.method1917(class420.field6424, (byte) -120, class559.field8073);
                        var63.field2776.method25(true, var7);
                        class642.method3726(-684096285, var63);
                    }
                    if (var6 == 5) {
                        class665 var64 = class626.method3656(28613, var5, var4);
                        if (var64 != null) {
                            class400.method2573(var64, 32);
                        }
                    }
                    if (var6 == 13) {
                        class618.field8747 = arg2;
                        class234.field3713 = arg1;
                        ++class58.field753;
                        class424.field6447 = 2;
                        class165.field2772 = 0;
                        class165 var65 = class271.method1917(class420.field6424, (byte) -50, class44.field604);
                        var65.field2776.method34(30868, class83.field1024.method1515(82, 126) ? 1 : 0);
                        var65.field2776.method51(31557, class612.field8702 + var4);
                        var65.field2776.method51(31557, var7);
                        var65.field2776.method25(true, class626.field8855 + var5);
                        class642.method3726(-684096285, var65);
                        class579.method3395(var5, -90, var4);
                    }
                    if (~var6 == -17) {
                        class304 var66 = class597.field8465[var7];
                        if (var66 != null) {
                            class424.field6447 = 2;
                            ++class157.field2687;
                            class618.field8747 = arg2;
                            class234.field3713 = arg1;
                            class165.field2772 = 0;
                            class165 var67 = class271.method1917(class420.field6424, (byte) -55, class150.field2486);
                            var67.field2776.method76(false, var7);
                            var67.field2776.method52(!class83.field1024.method1515(82, -105) ? 0 : 1, 16180);
                            class642.method3726(-684096285, var67);
                            class388.method2522(var66.field4265[0], var66.method1841(arg3 ^ 20862), var66.field4264[0], var66.method1841(20744), 0, -2, (byte) 31, 0, true);
                        }
                    }
                    if (var6 == 46) {
                        class348 var68 = (class348) class592.field8395.method1558((long) var7, (byte) -93);
                        if (var68 != null) {
                            ++class277.field4485;
                            class589 var69 = var68.field5577;
                            class165.field2772 = 0;
                            class618.field8747 = arg2;
                            class234.field3713 = arg1;
                            class424.field6447 = 2;
                            class165 var70 = class271.method1917(class420.field6424, (byte) -115, class294.field4615);
                            var70.field2776.method76(false, var7);
                            var70.field2776.method36((byte) -113, !class83.field1024.method1515(82, -87) ? 0 : 1);
                            class642.method3726(arg3 + -684096403, var70);
                            class388.method2522(var69.field4265[0], var69.method1841(20744), var69.field4264[0], var69.method1841(20744), 0, -2, (byte) 31, 0, true);
                        }
                    }
                    if (class145.field2450) {
                        class490.method3001((byte) 84);
                    }
                    if (class71.field892 != null && class403.field6218 == 0) {
                        class362.method2415(-123, class71.field892);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(IIIIIII)V")
    public class548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field7973 = arg1;
        this.field7979 = arg2;
        this.field7977 = arg0;
        this.field7975 = arg3;
    }
}
