import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class85 {

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "Liba;")
    public static class211 field1328 = new class211(0, 8);

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "I")
    public static int field1331 = 0;

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "F")
    public static float field1332;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!naa", name = "h", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method480(int arg0, int arg1, boolean arg2) {
        field1329++;
        if (arg2) {
            return true;
        } else {
            return (arg0 & 0x70000) != 0 | class78.method450(arg1, -23951, arg0) || class334.method2047(arg1, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)I")
    public static final int method481(byte arg0) {
        if (arg0 >= -58) {
            field1333 = 73;
        }
        field1330++;
        return class653.field9352++;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Ljw;III)V")
    public static final void method482(class426 arg0, int arg1, int arg2, int arg3) {
        field1327++;
        if (arg0 == null || class152.field2150.field4475 == arg0) {
            return;
        }
        int var4 = arg0.field6230;
        if (arg1 != 0) {
            method483(-79);
        }
        int var5 = arg0.field6226;
        int var6 = arg0.field6223;
        int var7 = (int) arg0.field6231;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg0.field6231;
        if (var6 == 46) {
            class5 var10 = class194.method1261(var5, var4, 6);
            if (var10 != null) {
                class540.method3127((byte) 118, var10);
            }
        }
        if (var6 == 48) {
            class177 var11 = (class177) class271.field3550.method2002((byte) -109, (long) var7);
            if (var11 != null) {
                class584.field8482 = arg2;
                class36.field566 = 2;
                class117.field1746++;
                class53 var12 = var11.field2476;
                class216.field2892 = 0;
                class347.field5149 = arg3;
                class654 var13 = class631.method3628(class181.field2500, (byte) -51, class357.field5280);
                var13.field9358.method3110(class18.field362.method1609(82, -27453) ? 1 : 0, 100);
                var13.field9358.method3143(var7, (byte) 72);
                class444.method2623(arg1 ^ 0x74, var13);
                class151.method1077(0, -2, var12.method422((byte) 52), (byte) -117, var12.field7429[0], var12.method422((byte) 68), true, 0, var12.field7430[0]);
            }
        }
        if (var6 == 20) {
            class71 var14 = class35.field551[var7];
            if (var14 != null) {
                class216.field2892 = 0;
                class36.field566 = 2;
                class584.field8482 = arg2;
                class584.field8488++;
                class347.field5149 = arg3;
                class654 var15 = class631.method3628(class428.field6247, (byte) -51, class357.field5280);
                var15.field9358.method3162(arg1 ^ 0x8891C548, var7);
                var15.field9358.method3110(class18.field362.method1609(82, -27453) ? 1 : 0, 96);
                class444.method2623(arg1 ^ 0x73, var15);
                class151.method1077(0, -2, var14.method422((byte) -94), (byte) -118, var14.field7429[0], var14.method422((byte) -62), true, 0, var14.field7430[0]);
            }
        }
        if (var6 == 1010) {
            class584.field8482 = arg2;
            class347.field5149 = arg3;
            class507.field7164++;
            class36.field566 = 2;
            class216.field2892 = 0;
            class654 var16 = class631.method3628(class341.field5055, (byte) -51, class357.field5280);
            var16.field9358.method3162(-2003712696, var7);
            class444.method2623(118, var16);
        }
        if (var6 == 3) {
            class36.field566 = 2;
            class347.field5149 = arg3;
            class584.field8482 = arg2;
            class340.field4950++;
            class216.field2892 = 0;
            class654 var17 = class631.method3628(class205.field2798, (byte) -51, class357.field5280);
            var17.field9358.method3124(class18.field362.method1609(82, arg1 ^ 0xFFFF94C3) ? 1 : 0, 74);
            var17.field9358.method3171(class412.field6116, (byte) -105);
            var17.field9358.method3164(var7, (byte) 109);
            var17.field9358.method3162(-2003712696, class279.field3689);
            var17.field9358.method3164(class403.field6049 + var5, (byte) 109);
            var17.field9358.method3163(arg1 ^ 0xFFFFFF80, class397.field6005 + var4);
            var17.field9358.method3143(class492.field7003, (byte) 72);
            class444.method2623(125, var17);
            class144.method1003(var4, var5, 0);
        }
        if (var6 == 12) {
            class71 var18 = class35.field551[var7];
            if (var18 != null) {
                class581.field8457++;
                class36.field566 = 2;
                class584.field8482 = arg2;
                class347.field5149 = arg3;
                class216.field2892 = 0;
                class654 var19 = class631.method3628(class321.field4676, (byte) -51, class357.field5280);
                var19.field9358.method3110(class18.field362.method1609(82, -27453) ? 1 : 0, 49);
                var19.field9358.method3164(var7, (byte) 109);
                class444.method2623(arg1 + 117, var19);
                class151.method1077(0, -2, var18.method422((byte) -60), (byte) -115, var18.field7429[0], var18.method422((byte) -98), true, 0, var18.field7430[0]);
            }
        }
        if (var6 == 49) {
            class71 var20 = class35.field551[var7];
            if (var20 != null) {
                class276.field3593++;
                class36.field566 = 2;
                class347.field5149 = arg3;
                class216.field2892 = 0;
                class584.field8482 = arg2;
                class654 var21 = class631.method3628(class109.field1621, (byte) -51, class357.field5280);
                var21.field9358.method3123((byte) -112, class18.field362.method1609(82, -27453) ? 1 : 0);
                var21.field9358.method3163(arg1 ^ 0xFFFFFF80, var7);
                class444.method2623(124, var21);
                class151.method1077(0, -2, var20.method422((byte) 78), (byte) -123, var20.field7429[0], var20.method422((byte) -48), true, 0, var20.field7430[0]);
            }
        }
        if (var6 == 18) {
            class310.field4570++;
            class36.field566 = 2;
            class584.field8482 = arg2;
            class216.field2892 = 0;
            class347.field5149 = arg3;
            class654 var22 = class631.method3628(class217.field2896, (byte) -51, class357.field5280);
            var22.field9358.method3143(class397.field6005 + var4, (byte) 72);
            var22.field9358.method3164((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) 109);
            var22.field9358.method3164(var5 + class403.field6049, (byte) 109);
            var22.field9358.method3123((byte) -121, class18.field362.method1609(82, -27453) ? 1 : 0);
            class444.method2623(arg1 ^ 0x73, var22);
            class127.method909(var5, var8, var4, arg1 + 1214441056);
        }
        if (var6 == 1003) {
            class238.field3130++;
            class216.field2892 = 0;
            class347.field5149 = arg3;
            class584.field8482 = arg2;
            class36.field566 = 2;
            class654 var23 = class631.method3628(class165.field2317, (byte) -51, class357.field5280);
            var23.field9358.method3162(-2003712696, var5 + class403.field6049);
            var23.field9358.method3110(class18.field362.method1609(82, -27453) ? 1 : 0, 60);
            var23.field9358.method3162(-2003712696, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var23.field9358.method3143(var4 + class397.field6005, (byte) 72);
            class444.method2623(122, var23);
            class127.method909(var5, var8, var4, arg1 + 1214441056);
        }
        if (var6 == 21) {
            class36.field566 = 2;
            class347.field5149 = arg3;
            class104.field1556++;
            class584.field8482 = arg2;
            class216.field2892 = 0;
            class654 var24 = class631.method3628(class14.field318, (byte) -51, class357.field5280);
            var24.field9358.method3123((byte) -120, class18.field362.method1609(82, -27453) ? 1 : 0);
            var24.field9358.method3143(var5 + class403.field6049, (byte) 72);
            var24.field9358.method3163(arg1 - 128, class397.field6005 + var4);
            var24.field9358.method3143((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) 72);
            class444.method2623(arg1 + 121, var24);
            class127.method909(var5, var8, var4, 1214441056);
        }
        if (var6 == 5) {
            class584.field8482 = arg2;
            class347.field5149 = arg3;
            class268.field3507++;
            class216.field2892 = 0;
            class36.field566 = 2;
            class654 var25 = class631.method3628(class563.field8234, (byte) -51, class357.field5280);
            var25.field9358.method3163(-128, var7);
            var25.field9358.method3162(-2003712696, class403.field6049 + var5);
            var25.field9358.method3110(class18.field362.method1609(82, -27453) ? 1 : 0, 62);
            var25.field9358.method3143(var4 + class397.field6005, (byte) 72);
            class444.method2623(arg1 + 126, var25);
            class144.method1003(var4, var5, 0);
        }
        if (var6 == 22) {
            class347.field5149 = arg3;
            class567.field8269++;
            class216.field2892 = 0;
            class36.field566 = 2;
            class584.field8482 = arg2;
            class654 var26 = class631.method3628(class464.field6679, (byte) -51, class357.field5280);
            var26.field9358.method3143(class279.field3689, (byte) 72);
            var26.field9358.method3124(class18.field362.method1609(82, arg1 ^ 0xFFFF94C3) ? 1 : 0, arg1 - 63);
            var26.field9358.method3163(-128, class492.field7003);
            var26.field9358.method3140(class412.field6116, -1);
            var26.field9358.method3143(class321.field4681.field7405, (byte) 72);
            class444.method2623(118, var26);
        }
        if (var6 == 1006) {
            class584.field8482 = arg2;
            class36.field566 = 2;
            class216.field2892 = 0;
            class347.field5149 = arg3;
            class177 var27 = (class177) class271.field3550.method2002((byte) -110, (long) var7);
            if (var27 != null) {
                class53 var28 = var27.field2476;
                class76 var29 = var28.field805;
                if (var29.field1212 != null) {
                    var29 = var29.method443(class308.field4545, (byte) 106);
                }
                if (var29 != null) {
                    class468.field6740++;
                    class654 var30 = class631.method3628(class397.field6001, (byte) -51, class357.field5280);
                    var30.field9358.method3162(-2003712696, var29.field1178);
                    class444.method2623(116, var30);
                }
            }
        }
        if (var6 == 57) {
            class36.field566 = 1;
            class347.field5149 = arg3;
            class216.field2892 = 0;
            class141.field2045++;
            class584.field8482 = arg2;
            class654 var31 = class631.method3628(class231.field3056, (byte) -51, class357.field5280);
            var31.field9358.method3164(class397.field6005 + var4, (byte) 109);
            var31.field9358.method3163(-128, class279.field3689);
            var31.field9358.method3126(2124924176, class412.field6116);
            var31.field9358.method3163(-128, class492.field7003);
            var31.field9358.method3143(class403.field6049 + var5, (byte) 72);
            class444.method2623(120, var31);
            class151.method1077(0, -4, 1, (byte) -30, var5, 1, true, 0, var4);
        }
        if (var6 == 9) {
            class36.field566 = 2;
            class347.field5149 = arg3;
            class584.field8482 = arg2;
            class111.field1639++;
            class216.field2892 = 0;
            class654 var32 = class631.method3628(class82.field1317, (byte) -51, class357.field5280);
            var32.field9358.method3143(class492.field7003, (byte) 72);
            var32.field9358.method3164((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) 109);
            var32.field9358.method3163(-128, class403.field6049 + var5);
            var32.field9358.method3123((byte) -123, class18.field362.method1609(82, -27453) ? 1 : 0);
            var32.field9358.method3163(-128, class279.field3689);
            var32.field9358.method3140(class412.field6116, arg1 - 1);
            var32.field9358.method3162(arg1 ^ 0x8891C548, class397.field6005 + var4);
            class444.method2623(arg1 ^ 0x7B, var32);
            class127.method909(var5, var8, var4, arg1 + 1214441056);
        }
        if (var6 == 17) {
            if (class248.field3272 > 0 && class18.field362.method1609(82, -27453) && class18.field362.method1609(81, -27453)) {
                class164.method1160(arg1 ^ 0x6E, class397.field6005 + var4, class321.field4681.field7905, class403.field6049 + var5);
            } else {
                class147.field2092++;
                class216.field2892 = 0;
                class36.field566 = 1;
                class347.field5149 = arg3;
                class584.field8482 = arg2;
                class654 var33 = class631.method3628(class697.field9819, (byte) -51, class357.field5280);
                var33.field9358.method3162(-2003712696, class397.field6005 + var4);
                var33.field9358.method3164(class403.field6049 + var5, (byte) 109);
                class444.method2623(126, var33);
            }
        }
        if (var6 == 11) {
            class216.field2892 = 0;
            class160.field2262++;
            class584.field8482 = arg2;
            class347.field5149 = arg3;
            class36.field566 = 2;
            class654 var34 = class631.method3628(class48.field767, (byte) -51, class357.field5280);
            var34.field9358.method3143(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) 72);
            var34.field9358.method3143(var4 + class397.field6005, (byte) 72);
            var34.field9358.method3124(class18.field362.method1609(82, arg1 ^ 0xFFFF94C3) ? 1 : 0, -52);
            var34.field9358.method3162(-2003712696, var5 + class403.field6049);
            class444.method2623(118, var34);
            class127.method909(var5, var8, var4, 1214441056);
        }
        if (var6 == 58) {
            class177 var35 = (class177) class271.field3550.method2002((byte) -109, (long) var7);
            if (var35 != null) {
                class36.field566 = 2;
                class584.field8482 = arg2;
                class53 var36 = var35.field2476;
                class216.field2892 = 0;
                class44.field663++;
                class347.field5149 = arg3;
                class654 var37 = class631.method3628(class232.field3074, (byte) -51, class357.field5280);
                var37.field9358.method3107(class18.field362.method1609(82, -27453) ? 1 : 0, (byte) -67);
                var37.field9358.method3164(var7, (byte) 109);
                class444.method2623(127, var37);
                class151.method1077(0, -2, var36.method422((byte) 101), (byte) 32, var36.field7429[0], var36.method422((byte) -43), true, 0, var36.field7430[0]);
            }
        }
        if (var6 == 8) {
            class216.field2892 = 0;
            class36.field566 = 2;
            class584.field8482 = arg2;
            class347.field5149 = arg3;
            class166.field2326++;
            class654 var38 = class631.method3628(class185.field2519, (byte) -51, class357.field5280);
            var38.field9358.method3162(-2003712696, var7);
            var38.field9358.method3124(class18.field362.method1609(82, arg1 ^ 0xFFFF94C3) ? 1 : 0, 95);
            var38.field9358.method3163(-128, class403.field6049 + var5);
            var38.field9358.method3164(class397.field6005 + var4, (byte) 109);
            class444.method2623(120, var38);
            class144.method1003(var4, var5, 0);
        }
        if (var6 == 44) {
            class71 var39 = class35.field551[var7];
            if (var39 != null) {
                class216.field2892 = 0;
                class347.field5149 = arg3;
                class584.field8482 = arg2;
                class600.field8689++;
                class36.field566 = 2;
                class654 var40 = class631.method3628(class274.field3580, (byte) -51, class357.field5280);
                var40.field9358.method3110(class18.field362.method1609(82, -27453) ? 1 : 0, 92);
                var40.field9358.method3163(arg1 ^ 0xFFFFFF80, var7);
                class444.method2623(124, var40);
                class151.method1077(0, -2, var39.method422((byte) 104), (byte) 30, var39.field7429[0], var39.method422((byte) -111), true, 0, var39.field7430[0]);
            }
        }
        if (var6 == 16) {
            class177 var41 = (class177) class271.field3550.method2002((byte) -109, (long) var7);
            if (var41 != null) {
                class345.field5105++;
                class216.field2892 = 0;
                class347.field5149 = arg3;
                class53 var42 = var41.field2476;
                class584.field8482 = arg2;
                class36.field566 = 2;
                class654 var43 = class631.method3628(class522.field7326, (byte) -51, class357.field5280);
                var43.field9358.method3123((byte) -114, class18.field362.method1609(82, arg1 - 27453) ? 1 : 0);
                var43.field9358.method3164(var7, (byte) 109);
                class444.method2623(121, var43);
                class151.method1077(0, -2, var42.method422((byte) 121), (byte) 15, var42.field7429[0], var42.method422((byte) -45), true, 0, var42.field7430[0]);
            }
        }
        if (var6 == 4) {
            class216.field2892 = 0;
            class347.field5149 = arg3;
            class36.field566 = 2;
            class38.field571++;
            class584.field8482 = arg2;
            class654 var44 = class631.method3628(class474.field6803, (byte) -51, class357.field5280);
            var44.field9358.method3163(-128, class397.field6005 + var4);
            var44.field9358.method3123((byte) -123, class18.field362.method1609(82, -27453) ? 1 : 0);
            var44.field9358.method3143((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) 72);
            var44.field9358.method3143(class403.field6049 + var5, (byte) 72);
            class444.method2623(126, var44);
            class127.method909(var5, var8, var4, arg1 + 1214441056);
        }
        if (var6 == 2) {
            class5 var45 = class194.method1261(var5, var4, arg1 + 6);
            if (var45 != null) {
                class541.method3183(arg1 + 1);
                class78 var46 = client.method564(var45);
                class446.method2638(6, var46.method452(16711680), var45, var46.field1272);
                class697.field9824 = class234.method1443(126, var45);
                if (class697.field9824 == null) {
                    class697.field9824 = "Null";
                }
                class372.field5508 = var45.field119 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 30) {
            class71 var47 = class35.field551[var7];
            if (var47 != null) {
                class571.field8298++;
                class36.field566 = 2;
                class216.field2892 = 0;
                class347.field5149 = arg3;
                class584.field8482 = arg2;
                class654 var48 = class631.method3628(class608.field8800, (byte) -51, class357.field5280);
                var48.field9358.method3164(var7, (byte) 109);
                var48.field9358.method3123((byte) -126, class18.field362.method1609(82, -27453) ? 1 : 0);
                class444.method2623(116, var48);
                class151.method1077(0, -2, var47.method422((byte) 61), (byte) -118, var47.field7429[0], var47.method422((byte) 109), true, 0, var47.field7430[0]);
            }
        }
        if (var6 == 59) {
            class71 var49 = class35.field551[var7];
            if (var49 != null) {
                class347.field5149 = arg3;
                class36.field566 = 2;
                class584.field8482 = arg2;
                class567.field8269++;
                class216.field2892 = 0;
                class654 var50 = class631.method3628(class464.field6679, (byte) -51, class357.field5280);
                var50.field9358.method3143(class279.field3689, (byte) 72);
                var50.field9358.method3124(class18.field362.method1609(82, -27453) ? 1 : 0, 100);
                var50.field9358.method3163(arg1 ^ 0xFFFFFF80, class492.field7003);
                var50.field9358.method3140(class412.field6116, arg1 - 1);
                var50.field9358.method3143(var7, (byte) 72);
                class444.method2623(121, var50);
                class151.method1077(0, -2, var49.method422((byte) -119), (byte) -119, var49.field7429[0], var49.method422((byte) -49), true, 0, var49.field7430[0]);
            }
        }
        if (var6 == 6) {
            class71 var51 = class35.field551[var7];
            if (var51 != null) {
                class347.field5149 = arg3;
                class346.field5112++;
                class36.field566 = 2;
                class584.field8482 = arg2;
                class216.field2892 = 0;
                class654 var52 = class631.method3628(class443.field6439, (byte) -51, class357.field5280);
                var52.field9358.method3110(class18.field362.method1609(82, -27453) ? 1 : 0, 111);
                var52.field9358.method3163(-128, var7);
                class444.method2623(117, var52);
                class151.method1077(0, -2, var51.method422((byte) -41), (byte) -118, var51.field7429[0], var51.method422((byte) 96), true, 0, var51.field7430[0]);
            }
        }
        if (var6 == 1002 || var6 == 1012 || var6 == 1009 || var6 == 1004 || var6 == 1011) {
            class581.method3335(1004, var7, var4, var6);
        }
        if (var6 == 13) {
            class177 var53 = (class177) class271.field3550.method2002((byte) -116, (long) var7);
            if (var53 != null) {
                class36.field566 = 2;
                class216.field2892 = 0;
                class287.field3975++;
                class347.field5149 = arg3;
                class53 var54 = var53.field2476;
                class584.field8482 = arg2;
                class654 var55 = class631.method3628(class501.field7087, (byte) -51, class357.field5280);
                var55.field9358.method3107(class18.field362.method1609(82, -27453) ? 1 : 0, (byte) -67);
                var55.field9358.method3143(var7, (byte) 72);
                class444.method2623(126, var55);
                class151.method1077(0, -2, var54.method422((byte) -108), (byte) -104, var54.field7429[0], var54.method422((byte) 90), true, 0, var54.field7430[0]);
            }
        }
        if (var6 == 10) {
            if (class248.field3272 > 0 && class18.field362.method1609(82, arg1 - 27453) && class18.field362.method1609(81, -27453)) {
                class164.method1160(60, class397.field6005 + var4, class321.field4681.field7905, class403.field6049 + var5);
            } else {
                class654 var56 = class116.method862(var5, var4, (byte) -48, var7);
                if (var7 == 1) {
                    var56.field9358.method3110(-1, 79);
                    var56.field9358.method3110(-1, 33);
                    var56.field9358.method3162(-2003712696, (int) class311.field4589);
                    var56.field9358.method3110(57, 85);
                    var56.field9358.method3110(class53.field817, 63);
                    var56.field9358.method3110(class697.field9826, arg1 + 58);
                    var56.field9358.method3110(89, 75);
                    var56.field9358.method3162(-2003712696, class321.field4681.field7895);
                    var56.field9358.method3162(-2003712696, class321.field4681.field7896);
                    var56.field9358.method3110(63, 85);
                } else {
                    class584.field8482 = arg2;
                    class216.field2892 = 0;
                    class36.field566 = 1;
                    class347.field5149 = arg3;
                }
                class444.method2623(122, var56);
                class151.method1077(0, -4, 1, (byte) -22, var5, 1, true, 0, var4);
            }
        }
        if (var6 == 60) {
            class71 var57 = class35.field551[var7];
            if (var57 != null) {
                class584.field8482 = arg2;
                class36.field566 = 2;
                class347.field5149 = arg3;
                class216.field2892 = 0;
                class540.field7918++;
                class654 var58 = class631.method3628(class527.field7483, (byte) -51, class357.field5280);
                var58.field9358.method3163(arg1 ^ 0xFFFFFF80, var7);
                var58.field9358.method3123((byte) -119, class18.field362.method1609(82, -27453) ? 1 : 0);
                class444.method2623(122, var58);
                class151.method1077(0, -2, var57.method422((byte) 107), (byte) 11, var57.field7429[0], var57.method422((byte) -37), true, 0, var57.field7430[0]);
            }
        }
        if (var6 == 45) {
            class13.field300++;
            class216.field2892 = 0;
            class36.field566 = 2;
            class347.field5149 = arg3;
            class584.field8482 = arg2;
            class654 var59 = class631.method3628(class63.field1001, (byte) -51, class357.field5280);
            var59.field9358.method3162(-2003712696, var7);
            var59.field9358.method3162(-2003712696, var5 + class403.field6049);
            var59.field9358.method3164(var4 + class397.field6005, (byte) 109);
            var59.field9358.method3124(class18.field362.method1609(82, -27453) ? 1 : 0, -49);
            class444.method2623(116, var59);
            class144.method1003(var4, var5, arg1);
        }
        if (var6 == 1007) {
            class584.field8482 = arg2;
            class699.field9834++;
            class347.field5149 = arg3;
            class36.field566 = 2;
            class216.field2892 = 0;
            class654 var60 = class631.method3628(class485.field6908, (byte) -51, class357.field5280);
            var60.field9358.method3162(-2003712696, var7);
            class444.method2623(118, var60);
        }
        if (var6 == 15 || var6 == 1008) {
            class485.method2771(var5, arg0.field6225, var7, 96, var4);
        }
        if (var6 == 25) {
            class36.field566 = 2;
            class216.field2892 = 0;
            class162.field2295++;
            class347.field5149 = arg3;
            class584.field8482 = arg2;
            class654 var61 = class631.method3628(client.field1439, (byte) -51, class357.field5280);
            var61.field9358.method3162(arg1 ^ 0x8891C548, var4 + class397.field6005);
            var61.field9358.method3164(var7, (byte) 109);
            var61.field9358.method3123((byte) -114, class18.field362.method1609(82, -27453) ? 1 : 0);
            var61.field9358.method3164(var5 + class403.field6049, (byte) 109);
            class444.method2623(arg1 + 115, var61);
            class144.method1003(var4, var5, 0);
        }
        if (var6 == 23 && class246.field3254 == null) {
            class171.method1186(var5, (byte) 16, var4);
            class246.field3254 = class194.method1261(var5, var4, 6);
            class284.method1679(class246.field3254, -95);
        }
        if (var6 == 51) {
            class36.field567++;
            class36.field566 = 2;
            class347.field5149 = arg3;
            class216.field2892 = 0;
            class584.field8482 = arg2;
            class654 var62 = class631.method3628(class280.field3707, (byte) -51, class357.field5280);
            var62.field9358.method3124(class18.field362.method1609(82, -27453) ? 1 : 0, 106);
            var62.field9358.method3162(-2003712696, var7);
            var62.field9358.method3162(arg1 ^ 0x8891C548, class403.field6049 + var5);
            var62.field9358.method3143(class397.field6005 + var4, (byte) 72);
            class444.method2623(arg1 + 121, var62);
            class144.method1003(var4, var5, 0);
        }
        if (var6 == 50) {
            class177 var63 = (class177) class271.field3550.method2002((byte) -124, (long) var7);
            if (var63 != null) {
                class347.field5149 = arg3;
                class584.field8482 = arg2;
                class36.field566 = 2;
                class53 var64 = var63.field2476;
                class506.field7158++;
                class216.field2892 = 0;
                class654 var65 = class631.method3628(class524.field7449, (byte) -51, class357.field5280);
                var65.field9358.method3163(-128, var7);
                var65.field9358.method3107(class18.field362.method1609(82, -27453) ? 1 : 0, (byte) -67);
                var65.field9358.method3171(class412.field6116, (byte) -53);
                var65.field9358.method3164(class279.field3689, (byte) 109);
                var65.field9358.method3164(class492.field7003, (byte) 109);
                class444.method2623(116, var65);
                class151.method1077(0, -2, var64.method422((byte) 63), (byte) -126, var64.field7429[0], var64.method422((byte) -68), true, 0, var64.field7430[0]);
            }
        }
        if (var6 == 47) {
            class177 var66 = (class177) class271.field3550.method2002((byte) -122, (long) var7);
            if (var66 != null) {
                class53 var67 = var66.field2476;
                class5.field186++;
                class347.field5149 = arg3;
                class216.field2892 = 0;
                class584.field8482 = arg2;
                class36.field566 = 2;
                class654 var68 = class631.method3628(class284.field3790, (byte) -51, class357.field5280);
                var68.field9358.method3124(class18.field362.method1609(82, -27453) ? 1 : 0, arg1 ^ 0xFFFFFF9A);
                var68.field9358.method3162(-2003712696, var7);
                class444.method2623(124, var68);
                class151.method1077(0, -2, var67.method422((byte) -111), (byte) -118, var67.field7429[0], var67.method422((byte) 67), true, 0, var67.field7430[0]);
            }
        }
        if (var6 == 19) {
            class71 var69 = class35.field551[var7];
            if (var69 != null) {
                class347.field5149 = arg3;
                class36.field566 = 2;
                class303.field4506++;
                class216.field2892 = 0;
                class584.field8482 = arg2;
                class654 var70 = class631.method3628(class287.field3869, (byte) -51, class357.field5280);
                var70.field9358.method3163(arg1 ^ 0xFFFFFF80, var7);
                var70.field9358.method3110(class18.field362.method1609(82, -27453) ? 1 : 0, 34);
                class444.method2623(124, var70);
                class151.method1077(0, -2, var69.method422((byte) 124), (byte) -2, var69.field7429[0], var69.method422((byte) -98), true, 0, var69.field7430[0]);
            }
        }
        if (class240.field3164) {
            class541.method3183(1);
        }
        if (class661.field9418 != null && class422.field6199 == 0) {
            class284.method1679(class661.field9418, -11);
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)V")
    public static void method483(int arg0) {
        int var1 = -1 / ((-arg0 - 72) / 42);
        field1328 = null;
    }
}
