import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class673 {

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field9359;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field9360;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field9361;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3803(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method3805(117, null);
        }
        field9362++;
        return class352.method2272(arg1, -71, arg2) | (arg2 & 0x70000) != 0 || class639.method3568((byte) -115, arg1, arg2);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lsba;IIZ)V")
    public static final void method3804(class558 arg0, int arg1, int arg2, boolean arg3) {
        field9361++;
        if (arg0 == null || class290.field4161.field8670 == arg0) {
            return;
        }
        int var4 = arg0.field7756;
        int var5 = arg0.field7752;
        int var6 = arg0.field7754;
        int var7 = (int) arg0.field7762;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg0.field7762;
        if (!arg3) {
            method3803(true, 58, 5);
        }
        if (var6 == 10) {
            class234 var10 = (class234) class372.field5245.method812(109, (long) var7);
            if (var10 != null) {
                class679 var11 = var10.field3471;
                class424.field5954 = 2;
                class180.field2480 = 0;
                class614.field8262 = arg1;
                class40.field492++;
                class236.field3494 = arg2;
                class583 var12 = class54.method400(class213.field2800, (byte) 102, class652.field8736);
                var12.field7963.method507(class224.field3014.method129(82, 117) ? 1 : 0, 105);
                var12.field7963.method488(-128, var7);
                class463.method2838(var12, (byte) 120);
                class21.method112(var11.field7197[0], true, 1, var11.field7198[0], 0, var11.method662((byte) 15), var11.method662((byte) 15), 0, -2);
            }
        }
        if (var6 == 22) {
            class234 var13 = (class234) class372.field5245.method812(104, (long) var7);
            if (var13 != null) {
                class424.field5954 = 2;
                class236.field3494 = arg2;
                class614.field8262 = arg1;
                class180.field2480 = 0;
                class679 var14 = var13.field3471;
                class281.field4079++;
                class583 var15 = class54.method400(class213.field2800, (byte) 105, class27.field344);
                var15.field7963.method444(class224.field3014.method129(82, 81) ? 1 : 0, 128);
                var15.field7963.method509(class401.field5748, 1470420840);
                var15.field7963.method492(-2, class442.field6137);
                var15.field7963.method488(-128, var7);
                var15.field7963.method492(-2, class209.field2732);
                class463.method2838(var15, (byte) 125);
                class21.method112(var14.field7197[0], true, 1, var14.field7198[0], 0, var14.method662((byte) 15), var14.method662((byte) 15), 0, -2);
            }
        }
        if (var6 == 57) {
            class614.field8262 = arg1;
            class549.field7636++;
            class236.field3494 = arg2;
            class180.field2480 = 0;
            class424.field5954 = 2;
            class583 var16 = class54.method400(class213.field2800, (byte) -55, class547.field7603);
            var16.field7963.method467(2714, class113.field1509 + var4);
            var16.field7963.method453(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) -88);
            var16.field7963.method492(-2, var5 + class587.field7995);
            var16.field7963.method484(class224.field3014.method129(82, 103) ? 1 : 0, 115);
            class463.method2838(var16, (byte) 126);
            class665.method3760(var4, 11, var5, var8);
        }
        if (var6 == 46) {
            class614.field8262 = arg1;
            class180.field2480 = 0;
            class236.field3494 = arg2;
            class424.field5954 = 2;
            class253.field3703++;
            class583 var17 = class54.method400(class213.field2800, (byte) 121, class684.field9514);
            var17.field7963.method492(-2, class442.field6137);
            var17.field7963.method492(-2, var5 + class587.field7995);
            var17.field7963.method463((byte) -64, class401.field5748);
            var17.field7963.method488(-128, class113.field1509 + var4);
            var17.field7963.method465(class224.field3014.method129(82, 82) ? 1 : 0, (byte) -53);
            var17.field7963.method453(var7, (byte) 68);
            var17.field7963.method453(class209.field2732, (byte) -89);
            class463.method2838(var17, (byte) 119);
            class253.method1729(var5, var4, -87);
        }
        if (var6 == 16) {
            class180.field2480 = 0;
            class424.field5954 = 2;
            class614.field8262 = arg1;
            class236.field3494 = arg2;
            class83.field1181++;
            class583 var18 = class54.method400(class213.field2800, (byte) -62, class692.field9624);
            var18.field7963.method444(class224.field3014.method129(82, 122) ? 1 : 0, 128);
            var18.field7963.method467(2714, class113.field1509 + var4);
            var18.field7963.method488(-128, class587.field7995 + var5);
            var18.field7963.method453((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) 88);
            class463.method2838(var18, (byte) 122);
            class665.method3760(var4, 11, var5, var8);
        }
        if (var6 == 1007) {
            class180.field2480 = 0;
            class424.field5954 = 2;
            class614.field8262 = arg1;
            class236.field3494 = arg2;
            class234 var19 = (class234) class372.field5245.method812(113, (long) var7);
            if (var19 != null) {
                class679 var20 = var19.field3471;
                class123 var21 = var20.field9436;
                if (var21.field1700 != null) {
                    var21 = var21.method773(class124.field1712, false);
                }
                if (var21 != null) {
                    class647.field8681++;
                    class583 var22 = class54.method400(class213.field2800, (byte) -101, class572.field7901);
                    var22.field7963.method492(-2, var21.field1662);
                    class463.method2838(var22, (byte) 122);
                }
            }
        }
        if (var6 == 48) {
            class96 var23 = class251.field3675[var7];
            if (var23 != null) {
                class424.field5954 = 2;
                class180.field2480 = 0;
                class462.field6424++;
                class614.field8262 = arg1;
                class236.field3494 = arg2;
                class583 var24 = class54.method400(class213.field2800, (byte) -101, class519.field7240);
                var24.field7963.method484(class224.field3014.method129(82, 118) ? 1 : 0, 87);
                var24.field7963.method453(var7, (byte) 104);
                class463.method2838(var24, (byte) 118);
                class21.method112(var23.field7197[0], true, 1, var23.field7198[0], 0, var23.method662((byte) 15), var23.method662((byte) 15), 0, -2);
            }
        }
        if (var6 == 6) {
            class614.field8262 = arg1;
            class424.field5954 = 2;
            class127.field1752++;
            class236.field3494 = arg2;
            class180.field2480 = 0;
            class583 var25 = class54.method400(class213.field2800, (byte) -32, class252.field3697);
            var25.field7963.method492(-2, var7);
            var25.field7963.method453(var5 + class587.field7995, (byte) -106);
            var25.field7963.method484(class224.field3014.method129(82, 113) ? 1 : 0, 81);
            var25.field7963.method492(-2, var4 + class113.field1509);
            class463.method2838(var25, (byte) 120);
            class253.method1729(var5, var4, -87);
        }
        if (var6 == 9) {
            class234 var26 = (class234) class372.field5245.method812(126, (long) var7);
            if (var26 != null) {
                class614.field8262 = arg1;
                class424.field5954 = 2;
                class236.field3494 = arg2;
                class343.field4887++;
                class180.field2480 = 0;
                class679 var27 = var26.field3471;
                class583 var28 = class54.method400(class213.field2800, (byte) 95, class608.field8190);
                var28.field7963.method492(-2, var7);
                var28.field7963.method484(class224.field3014.method129(82, 74) ? 1 : 0, 47);
                class463.method2838(var28, (byte) 121);
                class21.method112(var27.field7197[0], true, 1, var27.field7198[0], 0, var27.method662((byte) 15), var27.method662((byte) 15), 0, -2);
            }
        }
        if (var6 == 17) {
            class234 var29 = (class234) class372.field5245.method812(112, (long) var7);
            if (var29 != null) {
                class180.field2480 = 0;
                class614.field8262 = arg1;
                class424.field5954 = 2;
                class679 var30 = var29.field3471;
                class236.field3494 = arg2;
                class113.field1515++;
                class583 var31 = class54.method400(class213.field2800, (byte) 97, class250.field3668);
                var31.field7963.method453(var7, (byte) -127);
                var31.field7963.method444(class224.field3014.method129(82, 98) ? 1 : 0, 128);
                class463.method2838(var31, (byte) 119);
                class21.method112(var30.field7197[0], true, 1, var30.field7198[0], 0, var30.method662((byte) 15), var30.method662((byte) 15), 0, -2);
            }
        }
        if (var6 == 20) {
            class614.field8262 = arg1;
            class424.field5954 = 2;
            class321.field4461++;
            class180.field2480 = 0;
            class236.field3494 = arg2;
            class583 var32 = class54.method400(class213.field2800, (byte) 110, class729.field10156);
            var32.field7963.method484(class224.field3014.method129(82, 94) ? 1 : 0, 84);
            var32.field7963.method492(-2, class209.field2732);
            var32.field7963.method467(2714, class587.field7995 + var5);
            var32.field7963.method492(-2, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var32.field7963.method467(2714, class113.field1509 + var4);
            var32.field7963.method462(-105, class401.field5748);
            var32.field7963.method467(2714, class442.field6137);
            class463.method2838(var32, (byte) 123);
            class665.method3760(var4, 11, var5, var8);
        }
        if (var6 == 18) {
            class96 var33 = class251.field3675[var7];
            if (var33 != null) {
                class614.field8262 = arg1;
                class236.field3494 = arg2;
                class180.field2480 = 0;
                class424.field5954 = 2;
                class756.field10557++;
                class583 var34 = class54.method400(class213.field2800, (byte) -107, class674.field9363);
                var34.field7963.method465(class224.field3014.method129(82, 126) ? 1 : 0, (byte) -88);
                var34.field7963.method467(2714, var7);
                class463.method2838(var34, (byte) 121);
                class21.method112(var33.field7197[0], true, 1, var33.field7198[0], 0, var33.method662((byte) 15), var33.method662((byte) 15), 0, -2);
            }
        }
        if (var6 == 4) {
            class96 var35 = class251.field3675[var7];
            if (var35 != null) {
                class614.field8262 = arg1;
                class236.field3494 = arg2;
                class180.field2480 = 0;
                class708.field9891++;
                class424.field5954 = 2;
                class583 var36 = class54.method400(class213.field2800, (byte) -91, class23.field278);
                var36.field7963.method467(2714, var7);
                var36.field7963.method444(class224.field3014.method129(82, 107) ? 1 : 0, 128);
                class463.method2838(var36, (byte) 120);
                class21.method112(var35.field7197[0], true, 1, var35.field7198[0], 0, var35.method662((byte) 15), var35.method662((byte) 15), 0, -2);
            }
        }
        if (var6 == 47) {
            class236.field3494 = arg2;
            class424.field5954 = 2;
            class614.field8262 = arg1;
            class522.field7269++;
            class180.field2480 = 0;
            class583 var37 = class54.method400(class213.field2800, (byte) -56, class254.field3714);
            var37.field7963.method492(-2, class113.field1509 + var4);
            var37.field7963.method488(-128, var7);
            var37.field7963.method492(-2, class587.field7995 + var5);
            var37.field7963.method484(class224.field3014.method129(82, 104) ? 1 : 0, 34);
            class463.method2838(var37, (byte) 125);
            class253.method1729(var5, var4, -32);
        }
        if (var6 == 1003) {
            class424.field5954 = 2;
            class614.field8262 = arg1;
            class236.field3494 = arg2;
            class180.field2480 = 0;
            class723.field10038++;
            class583 var38 = class54.method400(class213.field2800, (byte) 101, class646.field8659);
            var38.field7963.method492(-2, var7);
            class463.method2838(var38, (byte) 119);
        }
        if (var6 == 15) {
            class96 var39 = class251.field3675[var7];
            if (var39 != null) {
                class180.field2480 = 0;
                class614.field8262 = arg1;
                class424.field5954 = 2;
                class236.field3494 = arg2;
                class713.field9961++;
                class583 var40 = class54.method400(class213.field2800, (byte) -5, class449.field6211);
                var40.field7963.method465(class224.field3014.method129(82, 93) ? 1 : 0, (byte) 87);
                var40.field7963.method453(var7, (byte) 115);
                var40.field7963.method492(-2, class209.field2732);
                var40.field7963.method453(class442.field6137, (byte) 97);
                var40.field7963.method509(class401.field5748, 1470420840);
                class463.method2838(var40, (byte) 120);
                class21.method112(var39.field7197[0], true, 1, var39.field7198[0], 0, var39.method662((byte) 15), var39.method662((byte) 15), 0, -2);
            }
        }
        if (var6 == 8) {
            if (class290.field4163 > 0 && class224.field3014.method129(82, 75) && class224.field3014.method129(81, 93)) {
                class735.method4096(class388.field5601.field4408, class587.field7995 + var5, 109, class113.field1509 + var4);
            } else {
                class583 var41 = class544.method3215(var5, var4, 1, var7);
                if (var7 == 1) {
                    var41.field7963.method444(-1, 128);
                    var41.field7963.method444(-1, 128);
                    var41.field7963.method492(-2, (int) class596.field8093);
                    var41.field7963.method444(57, 128);
                    var41.field7963.method444(class439.field6126, 128);
                    var41.field7963.method444(class31.field372, 128);
                    var41.field7963.method444(89, 128);
                    var41.field7963.method492(-2, class388.field5601.field4410);
                    var41.field7963.method492(-2, class388.field5601.field4418);
                    var41.field7963.method444(63, 128);
                } else {
                    class614.field8262 = arg1;
                    class180.field2480 = 0;
                    class424.field5954 = 1;
                    class236.field3494 = arg2;
                }
                class463.method2838(var41, (byte) 122);
                class21.method112(var4, true, 1, var5, 0, 1, 1, 0, -4);
            }
        }
        if (var6 == 12) {
            class424.field5954 = 2;
            class122.field1617++;
            class236.field3494 = arg2;
            class180.field2480 = 0;
            class614.field8262 = arg1;
            class583 var42 = class54.method400(class213.field2800, (byte) 123, class159.field2222);
            var42.field7963.method467(2714, class113.field1509 + var4);
            var42.field7963.method492(-2, var7);
            var42.field7963.method492(-2, class587.field7995 + var5);
            var42.field7963.method444(class224.field3014.method129(82, 73) ? 1 : 0, 128);
            class463.method2838(var42, (byte) 123);
            class253.method1729(var5, var4, 125);
        }
        if (var6 == 2 && class13.field127 == null) {
            class91.method625(var4, 1, var5);
            class13.field127 = class171.method1093((byte) 118, var5, var4);
            class27.method159((byte) -105, class13.field127);
        }
        if (var6 == 13) {
            class96 var43 = class251.field3675[var7];
            if (var43 != null) {
                class180.field2480 = 0;
                class424.field5954 = 2;
                class237.field3528++;
                class614.field8262 = arg1;
                class236.field3494 = arg2;
                class583 var44 = class54.method400(class213.field2800, (byte) -46, class87.field1233);
                var44.field7963.method453(var7, (byte) -98);
                var44.field7963.method444(class224.field3014.method129(82, 116) ? 1 : 0, 128);
                class463.method2838(var44, (byte) 121);
                class21.method112(var43.field7197[0], true, 1, var43.field7198[0], 0, var43.method662((byte) 15), var43.method662((byte) 15), 0, -2);
            }
        }
        if (var6 == 25) {
            class180.field2480 = 0;
            class506.field7035++;
            class236.field3494 = arg2;
            class424.field5954 = 2;
            class614.field8262 = arg1;
            class583 var45 = class54.method400(class213.field2800, (byte) 109, class99.field1379);
            var45.field7963.method492(-2, class587.field7995 + var5);
            var45.field7963.method467(2714, class113.field1509 + var4);
            var45.field7963.method492(-2, var7);
            var45.field7963.method484(class224.field3014.method129(82, 111) ? 1 : 0, 58);
            class463.method2838(var45, (byte) 127);
            class253.method1729(var5, var4, -24);
        }
        if (var6 == 1012 || var6 == 1010 || var6 == 1008 || var6 == 1004 || var6 == 1011) {
            class684.method3855(var4, var7, var6, (byte) 76);
        }
        if (var6 == 1001) {
            class236.field3494 = arg2;
            class424.field5954 = 2;
            class180.field2480 = 0;
            class352.field5076++;
            class614.field8262 = arg1;
            class583 var46 = class54.method400(class213.field2800, (byte) -7, class534.field7412);
            var46.field7963.method453(class113.field1509 + var4, (byte) -83);
            var46.field7963.method444(class224.field3014.method129(82, 110) ? 1 : 0, 128);
            var46.field7963.method467(2714, class587.field7995 + var5);
            var46.field7963.method492(-2, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class463.method2838(var46, (byte) 119);
            class665.method3760(var4, 11, var5, var8);
        }
        if (var6 == 5) {
            class755 var47 = class171.method1093((byte) 108, var5, var4);
            if (var47 != null) {
                class367.method2316((byte) -61, var47);
            }
        }
        if (var6 == 19) {
            class424.field5954 = 2;
            class180.field2480 = 0;
            class236.field3494 = arg2;
            class600.field8127++;
            class614.field8262 = arg1;
            class583 var48 = class54.method400(class213.field2800, (byte) 101, class451.field6253);
            var48.field7963.method484(class224.field3014.method129(82, 93) ? 1 : 0, 26);
            var48.field7963.method453((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) -128);
            var48.field7963.method467(2714, class113.field1509 + var4);
            var48.field7963.method492(-2, var5 + class587.field7995);
            class463.method2838(var48, (byte) 122);
            class665.method3760(var4, 11, var5, var8);
        }
        if (var6 == 11) {
            class96 var49 = class251.field3675[var7];
            if (var49 != null) {
                class236.field3494 = arg2;
                class49.field737++;
                class614.field8262 = arg1;
                class424.field5954 = 2;
                class180.field2480 = 0;
                class583 var50 = class54.method400(class213.field2800, (byte) -96, class318.field4424);
                var50.field7963.method507(class224.field3014.method129(82, 78) ? 1 : 0, 95);
                var50.field7963.method492(-2, var7);
                class463.method2838(var50, (byte) 125);
                class21.method112(var49.field7197[0], true, 1, var49.field7198[0], 0, var49.method662((byte) 15), var49.method662((byte) 15), 0, -2);
            }
        }
        if (var6 == 58) {
            class424.field5954 = 1;
            class614.field8262 = arg1;
            class236.field3494 = arg2;
            class180.field2480 = 0;
            class68.field1046++;
            class583 var51 = class54.method400(class213.field2800, (byte) -71, class178.field2451);
            var51.field7963.method467(2714, class209.field2732);
            var51.field7963.method488(-128, class587.field7995 + var5);
            var51.field7963.method473(-125, class401.field5748);
            var51.field7963.method467(2714, class113.field1509 + var4);
            var51.field7963.method467(2714, class442.field6137);
            class463.method2838(var51, (byte) 123);
            class21.method112(var4, true, 1, var5, 0, 1, 1, 0, -4);
        }
        if (var6 == 3) {
            class234 var52 = (class234) class372.field5245.method812(104, (long) var7);
            if (var52 != null) {
                class180.field2480 = 0;
                class424.field5954 = 2;
                class236.field3494 = arg2;
                class679 var53 = var52.field3471;
                class614.field8262 = arg1;
                class243.field3615++;
                class583 var54 = class54.method400(class213.field2800, (byte) -90, class202.field2676);
                var54.field7963.method453(var7, (byte) -66);
                var54.field7963.method484(class224.field3014.method129(82, 81) ? 1 : 0, 25);
                class463.method2838(var54, (byte) 124);
                class21.method112(var53.field7197[0], true, 1, var53.field7198[0], 0, var53.method662((byte) 15), var53.method662((byte) 15), 0, -2);
            }
        }
        if (var6 == 44 || var6 == 1002) {
            class516.method3088(var4, arg0.field7759, var7, var5, (byte) -44);
        }
        if (var6 == 59) {
            if (class290.field4163 > 0 && class224.field3014.method129(82, 100) && class224.field3014.method129(81, 78)) {
                class735.method4096(class388.field5601.field4408, class587.field7995 + var5, -21, class113.field1509 + var4);
            } else {
                class329.field4654++;
                class180.field2480 = 0;
                class614.field8262 = arg1;
                class424.field5954 = 1;
                class236.field3494 = arg2;
                class583 var55 = class54.method400(class213.field2800, (byte) 92, class335.field4720);
                var55.field7963.method492(-2, class587.field7995 + var5);
                var55.field7963.method467(2714, class113.field1509 + var4);
                class463.method2838(var55, (byte) 124);
            }
        }
        if (var6 == 49) {
            class180.field2480 = 0;
            class424.field5954 = 2;
            class614.field8262 = arg1;
            class236.field3494 = arg2;
            class718.field9993++;
            class583 var56 = class54.method400(class213.field2800, (byte) 94, class293.field4202);
            var56.field7963.method444(class224.field3014.method129(82, 127) ? 1 : 0, 128);
            var56.field7963.method453(var4 + class113.field1509, (byte) -97);
            var56.field7963.method453(class587.field7995 + var5, (byte) 94);
            var56.field7963.method488(-128, var7);
            class463.method2838(var56, (byte) 127);
            class253.method1729(var5, var4, 111);
        }
        if (var6 == 1009) {
            class756.field10556++;
            class424.field5954 = 2;
            class180.field2480 = 0;
            class614.field8262 = arg1;
            class236.field3494 = arg2;
            class583 var57 = class54.method400(class213.field2800, (byte) -107, class630.field8465);
            var57.field7963.method492(-2, var7);
            class463.method2838(var57, (byte) 126);
        }
        if (var6 == 60) {
            class614.field8262 = arg1;
            class713.field9961++;
            class236.field3494 = arg2;
            class424.field5954 = 2;
            class180.field2480 = 0;
            class583 var58 = class54.method400(class213.field2800, (byte) -18, class449.field6211);
            var58.field7963.method465(class224.field3014.method129(82, 97) ? 1 : 0, (byte) -69);
            var58.field7963.method453(class388.field5601.field7148, (byte) 74);
            var58.field7963.method492(-2, class209.field2732);
            var58.field7963.method453(class442.field6137, (byte) 68);
            var58.field7963.method509(class401.field5748, 1470420840);
            class463.method2838(var58, (byte) 125);
        }
        if (var6 == 50) {
            class96 var59 = class251.field3675[var7];
            if (var59 != null) {
                class614.field8262 = arg1;
                class228.field3065++;
                class236.field3494 = arg2;
                class424.field5954 = 2;
                class180.field2480 = 0;
                class583 var60 = class54.method400(class213.field2800, (byte) 91, class248.field3648);
                var60.field7963.method488(-128, var7);
                var60.field7963.method465(class224.field3014.method129(82, 77) ? 1 : 0, (byte) 63);
                class463.method2838(var60, (byte) 122);
                class21.method112(var59.field7197[0], true, 1, var59.field7198[0], 0, var59.method662((byte) 15), var59.method662((byte) 15), 0, -2);
            }
        }
        if (var6 == 30) {
            class96 var61 = class251.field3675[var7];
            if (var61 != null) {
                class194.field2629++;
                class424.field5954 = 2;
                class180.field2480 = 0;
                class236.field3494 = arg2;
                class614.field8262 = arg1;
                class583 var62 = class54.method400(class213.field2800, (byte) 96, class172.field2382);
                var62.field7963.method465(class224.field3014.method129(82, 119) ? 1 : 0, (byte) 68);
                var62.field7963.method453(var7, (byte) -122);
                class463.method2838(var62, (byte) 127);
                class21.method112(var61.field7197[0], true, 1, var61.field7198[0], 0, var61.method662((byte) 15), var61.method662((byte) 15), 0, -2);
            }
        }
        if (var6 == 51) {
            class96 var63 = class251.field3675[var7];
            if (var63 != null) {
                class180.field2480 = 0;
                class424.field5954 = 2;
                class236.field3494 = arg2;
                class614.field8262 = arg1;
                class263.field3856++;
                class583 var64 = class54.method400(class213.field2800, (byte) -43, class252.field3696);
                var64.field7963.method467(2714, var7);
                var64.field7963.method444(class224.field3014.method129(82, 122) ? 1 : 0, 128);
                class463.method2838(var64, (byte) 126);
                class21.method112(var63.field7197[0], true, 1, var63.field7198[0], 0, var63.method662((byte) 15), var63.method662((byte) 15), 0, -2);
            }
        }
        if (var6 == 23) {
            class424.field5954 = 2;
            class372.field5243++;
            class180.field2480 = 0;
            class614.field8262 = arg1;
            class236.field3494 = arg2;
            class583 var65 = class54.method400(class213.field2800, (byte) -82, class419.field5906);
            var65.field7963.method488(-128, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var65.field7963.method507(class224.field3014.method129(82, 78) ? 1 : 0, 104);
            var65.field7963.method453(class587.field7995 + var5, (byte) -122);
            var65.field7963.method453(class113.field1509 + var4, (byte) -61);
            class463.method2838(var65, (byte) 124);
            class665.method3760(var4, 11, var5, var8);
        }
        if (var6 == 21) {
            class755 var66 = class171.method1093((byte) 97, var5, var4);
            if (var66 != null) {
                class594.method3413((byte) 87);
                class274 var67 = client.method2738(var66);
                class470.method2862((byte) 90, var66, var67.field3971, var67.method1838((byte) 101));
                class488.field6817 = class758.method4207(var66, false);
                class468.field6500 = var66.field10448 + "<col=ffffff>";
                if (class488.field6817 == null) {
                    class488.field6817 = "Null";
                }
            }
            return;
        }
        if (var6 == 45) {
            class234 var68 = (class234) class372.field5245.method812(121, (long) var7);
            if (var68 != null) {
                class457.field6345++;
                class180.field2480 = 0;
                class236.field3494 = arg2;
                class424.field5954 = 2;
                class679 var69 = var68.field3471;
                class614.field8262 = arg1;
                class583 var70 = class54.method400(class213.field2800, (byte) 115, class376.field5288);
                var70.field7963.method465(class224.field3014.method129(82, 94) ? 1 : 0, (byte) -34);
                var70.field7963.method453(var7, (byte) -67);
                class463.method2838(var70, (byte) 125);
                class21.method112(var69.field7197[0], true, 1, var69.field7198[0], 0, var69.method662((byte) 15), var69.method662((byte) 15), 0, -2);
            }
        }
        if (class160.field2235) {
            class594.method3413((byte) 103);
        }
        if (class754.field10385 != null && class176.field2418 == 0) {
            class27.method159((byte) -105, class754.field10385);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method3805(int arg0, String arg1) {
        field9360++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var3 > var2 && class380.method2383(true, arg1.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && class380.method2383(true, arg1.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (arg0 != 1) {
            method3805(-103, null);
        }
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class77.method574(arg0 ^ 0xEDC, var7)) {
                char var8 = class195.method1204(true, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }
}
