import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class620 {

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "I")
    public static int field8763 = 0;

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "Lcq;")
    public static class110 field8761 = new class110(95, -1);

    @OriginalMember(owner = "client!lga", name = "e", descriptor = "Lsb;")
    public static class305 field8764 = new class305(80, 5);

    @OriginalMember(owner = "client!lga", name = "f", descriptor = "[[I")
    public static int[][] field8765 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!lga", name = "g", descriptor = "Lnb;")
    public static class314 field8766 = new class314(0, -1);

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "I")
    public static int field8762;

    @OriginalMember(owner = "client!lga", name = "h", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)V", line = 6)
    public static void method3456(int arg0) {
        field8766 = null;
        if (arg0 != 0) {
            method3459(3, 98, -78);
        }
        field8765 = null;
        field8761 = null;
        field8764 = null;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lrn;III)V", line = 20)
    public static final void method3457(class336 arg0, int arg1, int arg2, int arg3) {
        field8760++;
        if (arg0 == null || class694.field9730.field8677 == arg0) {
            return;
        }
        int var4 = arg0.field4230;
        int var5 = arg0.field4228;
        int var6 = arg0.field4231;
        int var7 = (int) arg0.field4226;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg0.field4226;
        if (var6 == 48) {
            class214 var10 = (class214) class274.field3433.method3669((long) var7, -1);
            if (var10 != null) {
                class566.field8070++;
                class600 var11 = var10.field2601;
                class331.field4170 = 2;
                class388.field5242 = 0;
                class557.field7955 = arg2;
                class569.field8097 = arg1;
                class653 var12 = class699.method3845((byte) 45, class39.field395, class203.field2402);
                var12.field9158.method612(false, var7);
                var12.field9158.method622(-99, class140.field1549.method1945(82, false) ? 1 : 0);
                class568.method3220(var12, (byte) 87);
                class285.method1662(0, 0, -2, var11.method1414(arg3 - 31790), var11.method1414(-31789), (byte) -104, var11.field9517[0], true, var11.field9513[0]);
            }
        }
        if (var6 == 1003) {
            class331.field4170 = 2;
            class557.field7955 = arg2;
            class388.field5242 = 0;
            class56.field561++;
            class569.field8097 = arg1;
            class653 var13 = class699.method3845((byte) 45, class39.field395, class693.field9723);
            var13.field9158.method645(-672168216, var7);
            class568.method3220(var13, (byte) 26);
        }
        if (var6 == 15) {
            if (class296.field3704 > 0 && class140.field1549.method1945(82, false) && class140.field1549.method1945(81, false)) {
                class26.method143(class26.field245 + var4, class231.field2860 + var5, -127, class362.field4859.field5166);
            } else {
                class388.field5242 = 0;
                class331.field4170 = 1;
                class303.field3753++;
                class569.field8097 = arg1;
                class557.field7955 = arg2;
                class653 var14 = class699.method3845((byte) 45, class39.field395, class14.field119);
                var14.field9158.method645(arg3 ^ 0xD7EF86E9, class231.field2860 + var5);
                var14.field9158.method646(true, class26.field245 + var4);
                class568.method3220(var14, (byte) 86);
            }
        }
        if (var6 == 1011) {
            class557.field7955 = arg2;
            class331.field4170 = 2;
            class421.field5613++;
            class569.field8097 = arg1;
            class388.field5242 = 0;
            class653 var15 = class699.method3845((byte) 45, class39.field395, class169.field1885);
            var15.field9158.method645(-672168216, var7);
            class568.method3220(var15, (byte) 29);
        }
        if (var6 == 19) {
            if (class296.field3704 > 0 && class140.field1549.method1945(82, false) && class140.field1549.method1945(81, false)) {
                class26.method143(class26.field245 + var4, class231.field2860 + var5, arg3 - 120, class362.field4859.field5166);
            } else {
                class653 var16 = class197.method1190(4, var4, var7, var5);
                if (var7 == 1) {
                    var16.field9158.method658(-1, (byte) 102);
                    var16.field9158.method658(-1, (byte) 76);
                    var16.field9158.method645(-672168216, (int) class508.field7300);
                    var16.field9158.method658(57, (byte) 83);
                    var16.field9158.method658(class302.field3748, (byte) 107);
                    var16.field9158.method658(class373.field5085, (byte) 53);
                    var16.field9158.method658(89, (byte) 104);
                    var16.field9158.method645(-672168216, class362.field4859.field5179);
                    var16.field9158.method645(arg3 - 672168217, class362.field4859.field5176);
                    var16.field9158.method658(63, (byte) 65);
                } else {
                    class388.field5242 = 0;
                    class557.field7955 = arg2;
                    class331.field4170 = 1;
                    class569.field8097 = arg1;
                }
                class568.method3220(var16, (byte) 32);
                class285.method1662(0, 0, -4, 1, 1, (byte) -105, var4, true, var5);
            }
        }
        if (var6 == 2) {
            class569.field8097 = arg1;
            class474.field6831++;
            class557.field7955 = arg2;
            class388.field5242 = 0;
            class331.field4170 = 2;
            class653 var17 = class699.method3845((byte) 45, class39.field395, class126.field1431);
            var17.field9158.method612(false, class231.field2860 + var5);
            var17.field9158.method645(arg3 - 672168217, class26.field245 + var4);
            var17.field9158.method658(class140.field1549.method1945(82, false) ? 1 : 0, (byte) 105);
            var17.field9158.method612(false, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class568.method3220(var17, (byte) 89);
            class149.method816(var4, -30373, var5, var8);
        }
        if (var6 == 23) {
            class236 var18 = class139.field1540[var7];
            if (var18 != null) {
                class557.field7955 = arg2;
                client.field9544++;
                class388.field5242 = 0;
                class331.field4170 = 2;
                class569.field8097 = arg1;
                class653 var19 = class699.method3845((byte) 45, class39.field395, class559.field7987);
                var19.field9158.method621(true, var7);
                var19.field9158.method645(-672168216, class672.field9355);
                var19.field9158.method622(-120, class140.field1549.method1945(82, false) ? 1 : 0);
                var19.field9158.method645(arg3 - 672168217, class465.field6641);
                var19.field9158.method668(class128.field1439, (byte) 58);
                class568.method3220(var19, (byte) 50);
                class285.method1662(0, 0, -2, var18.method1414(-31789), var18.method1414(-31789), (byte) -121, var18.field9517[0], true, var18.field9513[0]);
            }
        }
        if (var6 == 17) {
            class331.field4170 = 2;
            class569.field8097 = arg1;
            class557.field7955 = arg2;
            class443.field6253++;
            class388.field5242 = 0;
            class653 var20 = class699.method3845((byte) 45, class39.field395, class125.field1419);
            var20.field9158.method612(false, class231.field2860 + var5);
            var20.field9158.method621(true, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var20.field9158.method646(true, class26.field245 + var4);
            var20.field9158.method633((byte) -79, class140.field1549.method1945(82, false) ? 1 : 0);
            class568.method3220(var20, (byte) 105);
            class149.method816(var4, -30373, var5, var8);
        }
        if (var6 == 5) {
            class236 var21 = class139.field1540[var7];
            if (var21 != null) {
                class388.field5242 = 0;
                class569.field8097 = arg1;
                class557.field7955 = arg2;
                class331.field4170 = 2;
                class44.field431++;
                class653 var22 = class699.method3845((byte) 45, class39.field395, class320.field3942);
                var22.field9158.method622(-104, class140.field1549.method1945(82, false) ? 1 : 0);
                var22.field9158.method646(true, var7);
                class568.method3220(var22, (byte) 17);
                class285.method1662(0, 0, -2, var21.method1414(-31789), var21.method1414(arg3 - 31790), (byte) 109, var21.field9517[0], true, var21.field9513[0]);
            }
        }
        if (var6 == 60) {
            class388.field5242 = 0;
            class569.field8097 = arg1;
            class331.field4170 = 2;
            class557.field7955 = arg2;
            class485.field6989++;
            class653 var23 = class699.method3845((byte) 45, class39.field395, class189.field2176);
            var23.field9158.method622(-102, class140.field1549.method1945(82, false) ? 1 : 0);
            var23.field9158.method621(true, class231.field2860 + var5);
            var23.field9158.method612(false, var7);
            var23.field9158.method621(true, class26.field245 + var4);
            class568.method3220(var23, (byte) 36);
            class488.method2832(var4, var5, 0);
        }
        if (var6 == 3) {
            class452 var24 = class633.method3558(var5, -1, var4);
            if (var24 != null) {
                class518.method2944(var24, 1);
            }
        }
        if (var6 == 21) {
            class236 var25 = class139.field1540[var7];
            if (var25 != null) {
                class331.field4170 = 2;
                class569.field8097 = arg1;
                class557.field7955 = arg2;
                class388.field5242 = 0;
                class392.field5315++;
                class653 var26 = class699.method3845((byte) 45, class39.field395, client.field9554);
                var26.field9158.method645(arg3 ^ 0xD7EF86E9, var7);
                var26.field9158.method633((byte) -79, class140.field1549.method1945(82, false) ? 1 : 0);
                class568.method3220(var26, (byte) 118);
                class285.method1662(0, 0, -2, var25.method1414(-31789), var25.method1414(-31789), (byte) 120, var25.field9517[0], true, var25.field9513[0]);
            }
        }
        if (var6 == 12) {
            class557.field7955 = arg2;
            class331.field4170 = 2;
            class569.field8097 = arg1;
            class388.field5242 = 0;
            class453.field6486++;
            class653 var27 = class699.method3845((byte) 45, class39.field395, class652.field9151);
            var27.field9158.method645(-672168216, class26.field245 + var4);
            var27.field9158.method646(true, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var27.field9158.method622(-110, class140.field1549.method1945(82, false) ? 1 : 0);
            var27.field9158.method612(false, class231.field2860 + var5);
            class568.method3220(var27, (byte) 35);
            class149.method816(var4, arg3 - 30374, var5, var8);
        }
        if (var6 == 51) {
            class236 var28 = class139.field1540[var7];
            if (var28 != null) {
                class282.field3528++;
                class331.field4170 = 2;
                class569.field8097 = arg1;
                class388.field5242 = 0;
                class557.field7955 = arg2;
                class653 var29 = class699.method3845((byte) 45, class39.field395, class123.field1381);
                var29.field9158.method646(true, var7);
                var29.field9158.method615(class140.field1549.method1945(82, false) ? 1 : 0, (byte) -86);
                class568.method3220(var29, (byte) 93);
                class285.method1662(0, 0, -2, var28.method1414(-31789), var28.method1414(-31789), (byte) -124, var28.field9517[0], true, var28.field9513[0]);
            }
        }
        if (var6 == 11) {
            class286.field3577++;
            class557.field7955 = arg2;
            class569.field8097 = arg1;
            class331.field4170 = 1;
            class388.field5242 = 0;
            class653 var30 = class699.method3845((byte) 45, class39.field395, class436.field6151);
            var30.field9158.method646(true, class231.field2860 + var5);
            var30.field9158.method621(true, class465.field6641);
            var30.field9158.method645(arg3 - 672168217, class26.field245 + var4);
            var30.field9158.method669(false, class128.field1439);
            var30.field9158.method621(true, class672.field9355);
            class568.method3220(var30, (byte) 15);
            class285.method1662(0, 0, -4, 1, 1, (byte) 9, var4, true, var5);
        }
        if (arg3 != 1) {
            method3458(-55);
        }
        if (var6 == 25) {
            class331.field4170 = 2;
            class388.field5242 = 0;
            client.field9544++;
            class557.field7955 = arg2;
            class569.field8097 = arg1;
            class653 var31 = class699.method3845((byte) 45, class39.field395, class559.field7987);
            var31.field9158.method621(true, class362.field4859.field9434);
            var31.field9158.method645(-672168216, class672.field9355);
            var31.field9158.method622(-116, class140.field1549.method1945(82, false) ? 1 : 0);
            var31.field9158.method645(-672168216, class465.field6641);
            var31.field9158.method668(class128.field1439, (byte) -99);
            class568.method3220(var31, (byte) 21);
        }
        if (var6 == 18) {
            class214 var32 = (class214) class274.field3433.method3669((long) var7, -1);
            if (var32 != null) {
                class331.field4170 = 2;
                class600 var33 = var32.field2601;
                class569.field8097 = arg1;
                class388.field5242 = 0;
                class454.field6492++;
                class557.field7955 = arg2;
                class653 var34 = class699.method3845((byte) 45, class39.field395, class573.field8137);
                var34.field9158.method646(true, var7);
                var34.field9158.method633((byte) -79, class140.field1549.method1945(82, false) ? 1 : 0);
                class568.method3220(var34, (byte) 12);
                class285.method1662(0, 0, -2, var33.method1414(arg3 ^ -31790), var33.method1414(-31789), (byte) 125, var33.field9517[0], true, var33.field9513[0]);
            }
        }
        if (var6 == 50) {
            class569.field8097 = arg1;
            class557.field7955 = arg2;
            class388.field5242 = 0;
            class628.field8853++;
            class331.field4170 = 2;
            class653 var35 = class699.method3845((byte) 45, class39.field395, class331.field4166);
            var35.field9158.method669(false, class128.field1439);
            var35.field9158.method646(true, class465.field6641);
            var35.field9158.method612(false, class672.field9355);
            var35.field9158.method645(-672168216, var7);
            var35.field9158.method633((byte) -79, class140.field1549.method1945(82, false) ? 1 : 0);
            var35.field9158.method621(true, class231.field2860 + var5);
            var35.field9158.method612(false, var4 + class26.field245);
            class568.method3220(var35, (byte) 104);
            class488.method2832(var4, var5, 0);
        }
        if (var6 == 59 && class250.field3132 == null) {
            class618.method3446((byte) 73, var4, var5);
            class250.field3132 = class633.method3558(var5, -1, var4);
            class130.method741(class250.field3132, 26034);
        }
        if (var6 == 1004) {
            class361.field4838++;
            class557.field7955 = arg2;
            class331.field4170 = 2;
            class388.field5242 = 0;
            class569.field8097 = arg1;
            class653 var36 = class699.method3845((byte) 45, class39.field395, class77.field791);
            var36.field9158.method621(true, class231.field2860 + var5);
            var36.field9158.method645(arg3 - 672168217, class26.field245 + var4);
            var36.field9158.method633((byte) -79, class140.field1549.method1945(82, false) ? 1 : 0);
            var36.field9158.method645(arg3 - 672168217, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class568.method3220(var36, (byte) 10);
            class149.method816(var4, -30373, var5, var8);
        }
        if (var6 == 46) {
            class388.field5242 = 0;
            class569.field8097 = arg1;
            class557.field7955 = arg2;
            class331.field4170 = 2;
            class604.field8492++;
            class653 var37 = class699.method3845((byte) 45, class39.field395, class501.field7240);
            var37.field9158.method612(false, var7);
            var37.field9158.method633((byte) -79, class140.field1549.method1945(82, false) ? 1 : 0);
            var37.field9158.method645(arg3 - 672168217, class231.field2860 + var5);
            var37.field9158.method646(true, class26.field245 + var4);
            class568.method3220(var37, (byte) 72);
            class488.method2832(var4, var5, 0);
        }
        if (var6 == 45) {
            class388.field5242 = 0;
            class569.field8097 = arg1;
            class557.field7955 = arg2;
            class331.field4170 = 2;
            class681.field9618++;
            class653 var38 = class699.method3845((byte) 45, class39.field395, class171.field1912);
            var38.field9158.method645(-672168216, var7);
            var38.field9158.method645(arg3 - 672168217, class26.field245 + var4);
            var38.field9158.method658(class140.field1549.method1945(82, false) ? 1 : 0, (byte) 64);
            var38.field9158.method621(true, class231.field2860 + var5);
            class568.method3220(var38, (byte) 65);
            class488.method2832(var4, var5, 0);
        }
        if (var6 == 1006) {
            class388.field5242 = 0;
            class569.field8097 = arg1;
            class331.field4170 = 2;
            class557.field7955 = arg2;
            class214 var39 = (class214) class274.field3433.method3669((long) var7, arg3 ^ 0xFFFFFFFE);
            if (var39 != null) {
                class600 var40 = var39.field2601;
                class210 var41 = var40.field8461;
                if (var41.field2492 != null) {
                    var41 = var41.method1247((byte) 93, class628.field8859);
                }
                if (var41 != null) {
                    class142.field1568++;
                    class653 var42 = class699.method3845((byte) 45, class39.field395, class330.field4047);
                    var42.field9158.method645(-672168216, var41.field2501);
                    class568.method3220(var42, (byte) 99);
                }
            }
        }
        if (var6 == 16) {
            class214 var43 = (class214) class274.field3433.method3669((long) var7, -1);
            if (var43 != null) {
                class569.field8097 = arg1;
                class50.field507++;
                class600 var44 = var43.field2601;
                class331.field4170 = 2;
                class388.field5242 = 0;
                class557.field7955 = arg2;
                class653 var45 = class699.method3845((byte) 45, class39.field395, class316.field3927);
                var45.field9158.method660((byte) 51, class128.field1439);
                var45.field9158.method612(false, var7);
                var45.field9158.method621(true, class672.field9355);
                var45.field9158.method646(true, class465.field6641);
                var45.field9158.method633((byte) -79, class140.field1549.method1945(82, false) ? 1 : 0);
                class568.method3220(var45, (byte) 97);
                class285.method1662(0, 0, -2, var44.method1414(-31789), var44.method1414(-31789), (byte) -91, var44.field9517[0], true, var44.field9513[0]);
            }
        }
        if (var6 == 4) {
            class236 var46 = class139.field1540[var7];
            if (var46 != null) {
                class271.field3373++;
                class331.field4170 = 2;
                class388.field5242 = 0;
                class569.field8097 = arg1;
                class557.field7955 = arg2;
                class653 var47 = class699.method3845((byte) 45, class39.field395, class386.field5203);
                var47.field9158.method622(-124, class140.field1549.method1945(82, false) ? 1 : 0);
                var47.field9158.method612(false, var7);
                class568.method3220(var47, (byte) 88);
                class285.method1662(0, 0, -2, var46.method1414(-31789), var46.method1414(arg3 ^ 0xFFFF83D2), (byte) 111, var46.field9517[0], true, var46.field9513[0]);
            }
        }
        if (var6 == 13) {
            class214 var48 = (class214) class274.field3433.method3669((long) var7, -1);
            if (var48 != null) {
                class70.field694++;
                class569.field8097 = arg1;
                class331.field4170 = 2;
                class388.field5242 = 0;
                class557.field7955 = arg2;
                class600 var49 = var48.field2601;
                class653 var50 = class699.method3845((byte) 45, class39.field395, class207.field2457);
                var50.field9158.method621(true, var7);
                var50.field9158.method615(class140.field1549.method1945(82, false) ? 1 : 0, (byte) 126);
                class568.method3220(var50, (byte) 30);
                class285.method1662(0, 0, -2, var49.method1414(arg3 - 31790), var49.method1414(arg3 ^ 0xFFFF83D2), (byte) 127, var49.field9517[0], true, var49.field9513[0]);
            }
        }
        if (var6 == 58) {
            class236 var51 = class139.field1540[var7];
            if (var51 != null) {
                class331.field4170 = 2;
                class204.field2406++;
                class388.field5242 = 0;
                class569.field8097 = arg1;
                class557.field7955 = arg2;
                class653 var52 = class699.method3845((byte) 45, class39.field395, class420.field5597);
                var52.field9158.method622(-97, class140.field1549.method1945(82, false) ? 1 : 0);
                var52.field9158.method645(arg3 ^ 0xD7EF86E9, var7);
                class568.method3220(var52, (byte) 109);
                class285.method1662(0, 0, -2, var51.method1414(-31789), var51.method1414(-31789), (byte) 17, var51.field9517[0], true, var51.field9513[0]);
            }
        }
        if (var6 == 44) {
            class236 var53 = class139.field1540[var7];
            if (var53 != null) {
                class571.field8110++;
                class557.field7955 = arg2;
                class569.field8097 = arg1;
                class388.field5242 = 0;
                class331.field4170 = 2;
                class653 var54 = class699.method3845((byte) 45, class39.field395, class631.field8874);
                var54.field9158.method615(class140.field1549.method1945(82, false) ? 1 : 0, (byte) 104);
                var54.field9158.method645(-672168216, var7);
                class568.method3220(var54, (byte) 33);
                class285.method1662(0, 0, -2, var53.method1414(arg3 ^ -31790), var53.method1414(-31789), (byte) -63, var53.field9517[0], true, var53.field9513[0]);
            }
        }
        if (var6 == 6) {
            class214 var55 = (class214) class274.field3433.method3669((long) var7, -1);
            if (var55 != null) {
                class557.field7955 = arg2;
                class388.field5242 = 0;
                class569.field8097 = arg1;
                class600 var56 = var55.field2601;
                class549.field7861++;
                class331.field4170 = 2;
                class653 var57 = class699.method3845((byte) 45, class39.field395, class122.field1366);
                var57.field9158.method615(class140.field1549.method1945(82, false) ? 1 : 0, (byte) -39);
                var57.field9158.method646(true, var7);
                class568.method3220(var57, (byte) 36);
                class285.method1662(0, 0, -2, var56.method1414(arg3 ^ -31790), var56.method1414(-31789), (byte) 122, var56.field9517[0], true, var56.field9513[0]);
            }
        }
        if (var6 == 49) {
            class236 var58 = class139.field1540[var7];
            if (var58 != null) {
                class388.field5242 = 0;
                class331.field4170 = 2;
                class569.field8097 = arg1;
                class557.field7955 = arg2;
                class15.field123++;
                class653 var59 = class699.method3845((byte) 45, class39.field395, class255.field3199);
                var59.field9158.method615(class140.field1549.method1945(82, false) ? 1 : 0, (byte) -39);
                var59.field9158.method645(-672168216, var7);
                class568.method3220(var59, (byte) 123);
                class285.method1662(0, 0, -2, var58.method1414(arg3 - 31790), var58.method1414(-31789), (byte) -68, var58.field9517[0], true, var58.field9513[0]);
            }
        }
        if (var6 == 1008 || var6 == 1001 || var6 == 1012 || var6 == 1010 || var6 == 1002) {
            class566.method3209(var6, true, var7, var4);
        }
        if (var6 == 30) {
            class236 var60 = class139.field1540[var7];
            if (var60 != null) {
                class388.field5242 = 0;
                class331.field4170 = 2;
                class631.field8869++;
                class569.field8097 = arg1;
                class557.field7955 = arg2;
                class653 var61 = class699.method3845((byte) 45, class39.field395, class381.field5157);
                var61.field9158.method658(class140.field1549.method1945(82, false) ? 1 : 0, (byte) 120);
                var61.field9158.method612(false, var7);
                class568.method3220(var61, (byte) 26);
                class285.method1662(0, 0, -2, var60.method1414(-31789), var60.method1414(arg3 ^ 0xFFFF83D2), (byte) 123, var60.field9517[0], true, var60.field9513[0]);
            }
        }
        if (var6 == 22) {
            class331.field4170 = 2;
            class557.field7955 = arg2;
            class388.field5242 = 0;
            class569.field8097 = arg1;
            class497.field7197++;
            class653 var62 = class699.method3845((byte) 45, class39.field395, class309.field3828);
            var62.field9158.method658(class140.field1549.method1945(82, false) ? 1 : 0, (byte) 120);
            var62.field9158.method612(false, class465.field6641);
            var62.field9158.method616(class128.field1439, true);
            var62.field9158.method646(true, class672.field9355);
            var62.field9158.method645(-672168216, class231.field2860 + var5);
            var62.field9158.method645(-672168216, class26.field245 + var4);
            var62.field9158.method621(true, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class568.method3220(var62, (byte) 67);
            class149.method816(var4, -30373, var5, var8);
        }
        if (var6 == 10 || var6 == 1007) {
            class301.method1748(var5, var7, 8, arg0.field4221, var4);
        }
        if (var6 == 57) {
            class331.field4170 = 2;
            class569.field8097 = arg1;
            class388.field5242 = 0;
            class668.field9320++;
            class557.field7955 = arg2;
            class653 var63 = class699.method3845((byte) 45, class39.field395, class182.field2047);
            var63.field9158.method633((byte) -79, class140.field1549.method1945(82, false) ? 1 : 0);
            var63.field9158.method645(-672168216, var5 + class231.field2860);
            var63.field9158.method621(true, class26.field245 + var4);
            var63.field9158.method612(false, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class568.method3220(var63, (byte) 16);
            class149.method816(var4, -30373, var5, var8);
        }
        if (var6 == 47) {
            class569.field8097 = arg1;
            class388.field5242 = 0;
            class557.field7955 = arg2;
            class489.field7105++;
            class331.field4170 = 2;
            class653 var64 = class699.method3845((byte) 45, class39.field395, class673.field9370);
            var64.field9158.method622(-103, class140.field1549.method1945(82, false) ? 1 : 0);
            var64.field9158.method621(true, var7);
            var64.field9158.method612(false, var5 + class231.field2860);
            var64.field9158.method646(true, var4 + class26.field245);
            class568.method3220(var64, (byte) 95);
            class488.method2832(var4, var5, arg3 ^ 0x1);
        }
        if (var6 == 20) {
            class214 var65 = (class214) class274.field3433.method3669((long) var7, -1);
            if (var65 != null) {
                class557.field7955 = arg2;
                class388.field5242 = 0;
                class331.field4170 = 2;
                class598.field8427++;
                class569.field8097 = arg1;
                class600 var66 = var65.field2601;
                class653 var67 = class699.method3845((byte) 45, class39.field395, class11.field109);
                var67.field9158.method622(-106, class140.field1549.method1945(82, false) ? 1 : 0);
                var67.field9158.method612(false, var7);
                class568.method3220(var67, (byte) 45);
                class285.method1662(0, 0, -2, var66.method1414(arg3 - 31790), var66.method1414(-31789), (byte) 123, var66.field9517[0], true, var66.field9513[0]);
            }
        }
        if (var6 == 9) {
            class557.field7955 = arg2;
            class331.field4170 = 2;
            class569.field8097 = arg1;
            class676.field9396++;
            class388.field5242 = 0;
            class653 var68 = class699.method3845((byte) 45, class39.field395, class213.field2589);
            var68.field9158.method658(class140.field1549.method1945(82, false) ? 1 : 0, (byte) 121);
            var68.field9158.method646(true, class231.field2860 + var5);
            var68.field9158.method646(true, var7);
            var68.field9158.method621(true, class26.field245 + var4);
            class568.method3220(var68, (byte) 79);
            class488.method2832(var4, var5, 0);
        }
        if (var6 != 8) {
            if (class348.field4665) {
                class204.method1218(arg3 - 99);
            }
            if (class112.field1183 != null && class632.field8888 == 0) {
                class130.method741(class112.field1183, arg3 ^ 0x65B3);
            }
            return;
        }
        class452 var69 = class633.method3558(var5, -1, var4);
        if (var69 == null) {
            return;
        }
        class204.method1218(112);
        class314 var70 = client.method3750(var69);
        class646.method3618(var69, 0, var70.method1802(1), var70.field3897);
        class286.field3580 = class166.method913(var69, 100);
        if (class286.field3580 == null) {
            class286.field3580 = "Null";
        }
        class679.field9566 = var69.field6428 + "<col=ffffff>";
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)V", line = 821)
    public static final void method3458(int arg0) {
        class661.field9266 = 0;
        field8762++;
        class694.field9730.method3438(16);
        class694.field9730.method3425(class698.field9800, false);
        if (arg0 <= -39) {
            class661.field9266++;
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(III)Z", line = 836)
    public static final boolean method3459(int arg0, int arg1, int arg2) {
        field8767++;
        int var3 = -70 % ((arg0 + 15) / 54);
        return false;
    }
}
