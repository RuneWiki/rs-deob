import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class351 {

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "B")
    public byte field5117;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public int field5119;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "Ljava/lang/String;")
    public String field5116;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Ljava/lang/String;")
    public String field5120;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Ljava/lang/String;")
    public String field5121;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "Ljava/lang/String;")
    public String field5123;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILrg;)Lvga;", line = 9)
    public static final class86 method2211(int arg0, class645 arg1) {
        field5118++;
        class86 var2 = new class86();
        var2.field1227 = arg1.method3712((byte) -127);
        if (arg0 == -3764) {
            var2.field1230 = class31.field325.method1720(var2.field1227, 1);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBLcs;I)V", line = 25)
    public static final void method2212(int arg0, byte arg1, class342 arg2, int arg3) {
        field5122++;
        if (arg2 == null || class748.field10459.field2590 == arg2 || arg1 != -18) {
            return;
        }
        int var4 = arg2.field4962;
        int var5 = arg2.field4967;
        int var6 = arg2.field4972;
        int var7 = (int) arg2.field4971;
        long var8 = arg2.field4971;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 47) {
            class46 var10 = class700.method3972(var5, var4, true);
            if (var10 != null) {
                class148.method1087(-34848);
                class233 var11 = client.method1886(var10);
                class754.method4204(var11.method1555(10061), var10, arg1 ^ 0xFFFFEBE5, var11.field3396);
                class298.field4229 = class227.method1527(true, var10);
                class29.field278 = var10.field612 + "<col=ffffff>";
                if (class298.field4229 == null) {
                    class298.field4229 = "Null";
                }
            }
            return;
        }
        if (var6 == 50) {
            if (class245.field3569 > 0 && class35.field371.method2474(82, (byte) 123) && class35.field371.method2474(81, (byte) 123)) {
                class343.method2178(class130.field1749.field8429, class582.field8288 + var5, class361.field5224 + var4, false);
            } else {
                class166.field2619 = arg3;
                class177.field2750 = 0;
                class417.field6251++;
                class199.field2994 = 1;
                class133.field1789 = arg0;
                class468 var12 = class93.method734(class29.field284, class437.field6478, arg1 ^ 0xFFFFE000);
                var12.field6839.method3734(class582.field8288 + var5, arg1 ^ 0xE2153006);
                var12.field6839.method3750(class361.field5224 + var4, (byte) -69);
                class120.method872((byte) -44, var12);
            }
        }
        if (var6 == 48) {
            class689 var13 = class314.field4456[var7];
            if (var13 != null) {
                class166.field2619 = arg3;
                class133.field1789 = arg0;
                class199.field2994 = 2;
                class177.field2750 = 0;
                class634.field8877++;
                class468 var14 = class93.method734(class29.field284, class634.field8894, 8174);
                var14.field6839.method3727(class35.field371.method2474(82, (byte) 121) ? 1 : 0, 10061);
                var14.field6839.method3734(var7, 501927912);
                class120.method872((byte) -109, var14);
                class461.method2815(0, true, 0, -2, var13.field6139[0], var13.method2579(false), var13.field6133[0], 120, var13.method2579(false));
            }
        }
        if (var6 == 44 || var6 == 1003) {
            class607.method3525(var5, arg2.field4969, var4, (byte) -58, var7);
        }
        if (var6 == 1012 || var6 == 1007 || var6 == 1002 || var6 == 1006 || var6 == 1010) {
            class291.method1862(var4, var7, var6, -83);
        }
        if (var6 == 16) {
            class46 var15 = class700.method3972(var5, var4, true);
            if (var15 != null) {
                class281.method1796((byte) 102, var15);
            }
        }
        if (var6 == 1011) {
            class166.field2619 = arg3;
            class177.field2750 = 0;
            class133.field1789 = arg0;
            class199.field2994 = 2;
            class325.field4641++;
            class468 var16 = class93.method734(class29.field284, class466.field6826, 8174);
            var16.field6839.method3750(var5 + class582.field8288, (byte) -69);
            var16.field6839.method3697(class35.field371.method2474(82, (byte) 119) ? 1 : 0, 116);
            var16.field6839.method3702(class361.field5224 + var4, (byte) -126);
            var16.field6839.method3706((byte) 82, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class120.method872((byte) -107, var16);
            class127.method890(var5, var8, (byte) 118, var4);
        }
        if (var6 == 19) {
            class432 var17 = (class432) class497.field7067.method2287((long) var7, (byte) -117);
            if (var17 != null) {
                class177.field2750 = 0;
                class282 var18 = var17.field6439;
                class199.field2994 = 2;
                class291.field4166++;
                class166.field2619 = arg3;
                class133.field1789 = arg0;
                class468 var19 = class93.method734(class29.field284, class86.field1223, 8174);
                var19.field6839.method3702(var7, (byte) -120);
                var19.field6839.method3727(class35.field371.method2474(82, (byte) 120) ? 1 : 0, 10061);
                class120.method872((byte) 88, var19);
                class461.method2815(0, true, 0, -2, var18.field6139[0], var18.method2579(false), var18.field6133[0], 122, var18.method2579(false));
            }
        }
        if (var6 == 3) {
            class166.field2619 = arg3;
            class177.field2750 = 0;
            class199.field2994 = 2;
            class410.field6175++;
            class133.field1789 = arg0;
            class468 var20 = class93.method734(class29.field284, class100.field1423, 8174);
            var20.field6839.method3727(class35.field371.method2474(82, (byte) 115) ? 1 : 0, arg1 + 10079);
            var20.field6839.method3702(class361.field5224 + var4, (byte) -114);
            var20.field6839.method3702(var5 + class582.field8288, (byte) -120);
            var20.field6839.method3734(Integer.MAX_VALUE & (int) (var8 >>> 32), 501927912);
            class120.method872((byte) 47, var20);
            class127.method890(var5, var8, (byte) 120, var4);
        }
        if (var6 == 15 && class625.field8742 == null) {
            class359.method2240(var4, (byte) -124, var5);
            class625.field8742 = class700.method3972(var5, var4, true);
            class673.method3850(class625.field8742, (byte) -60);
        }
        if (var6 == 59) {
            class432 var21 = (class432) class497.field7067.method2287((long) var7, (byte) -117);
            if (var21 != null) {
                class282 var22 = var21.field6439;
                class133.field1789 = arg0;
                class166.field2619 = arg3;
                class177.field2750 = 0;
                class228.field3360++;
                class199.field2994 = 2;
                class468 var23 = class93.method734(class29.field284, class293.field4183, arg1 + 8192);
                var23.field6839.method3704(true, class35.field371.method2474(82, (byte) 116) ? 1 : 0);
                var23.field6839.method3706((byte) 82, var7);
                class120.method872((byte) 125, var23);
                class461.method2815(0, true, 0, -2, var22.field6139[0], var22.method2579(false), var22.field6133[0], 117, var22.method2579(false));
            }
        }
        if (var6 == 20) {
            class432 var24 = (class432) class497.field7067.method2287((long) var7, (byte) -117);
            if (var24 != null) {
                class177.field2750 = 0;
                class603.field8525++;
                class166.field2619 = arg3;
                class282 var25 = var24.field6439;
                class133.field1789 = arg0;
                class199.field2994 = 2;
                class468 var26 = class93.method734(class29.field284, class337.field4910, 8174);
                var26.field6839.method3734(var7, 501927912);
                var26.field6839.method3704(true, class35.field371.method2474(82, (byte) 119) ? 1 : 0);
                class120.method872((byte) 66, var26);
                class461.method2815(0, true, 0, -2, var25.field6139[0], var25.method2579(false), var25.field6133[0], arg1 ^ 0xFFFFFF94, var25.method2579(false));
            }
        }
        if (var6 == 51) {
            class166.field2619 = arg3;
            class133.field1789 = arg0;
            class199.field2994 = 2;
            class177.field2750 = 0;
            class604.field8546++;
            class468 var27 = class93.method734(class29.field284, class309.field4387, arg1 + 8192);
            var27.field6839.method3706((byte) 82, class582.field8288 + var5);
            var27.field6839.method3704(true, class35.field371.method2474(82, (byte) 115) ? 1 : 0);
            var27.field6839.method3734(class361.field5224 + var4, arg1 + 501927930);
            var27.field6839.method3734(var7, 501927912);
            class120.method872((byte) -82, var27);
            class224.method1512(var4, var5, 126);
        }
        if (var6 == 1001) {
            class177.field2750 = 0;
            class87.field1239++;
            class199.field2994 = 2;
            class133.field1789 = arg0;
            class166.field2619 = arg3;
            class468 var28 = class93.method734(class29.field284, class661.field9244, 8174);
            var28.field6839.method3702(var7, (byte) -121);
            class120.method872((byte) -46, var28);
        }
        if (var6 == 25) {
            class432 var29 = (class432) class497.field7067.method2287((long) var7, (byte) -117);
            if (var29 != null) {
                class133.field1789 = arg0;
                class199.field2994 = 2;
                class226.field3317++;
                class282 var30 = var29.field6439;
                class177.field2750 = 0;
                class166.field2619 = arg3;
                class468 var31 = class93.method734(class29.field284, class277.field3944, 8174);
                var31.field6839.method3734(var7, arg1 + 501927930);
                var31.field6839.method3730(arg1 + 126, class35.field371.method2474(82, (byte) 127) ? 1 : 0);
                class120.method872((byte) -56, var31);
                class461.method2815(0, true, 0, -2, var30.field6139[0], var30.method2579(false), var30.field6133[0], 124, var30.method2579(false));
            }
        }
        if (var6 == 49) {
            class133.field1789 = arg0;
            class449.field6640++;
            class199.field2994 = 2;
            class166.field2619 = arg3;
            class177.field2750 = 0;
            class468 var32 = class93.method734(class29.field284, class640.field8988, 8174);
            var32.field6839.method3734(class361.field5224 + var4, 501927912);
            var32.field6839.method3734(class582.field8288 + var5, 501927912);
            var32.field6839.method3706((byte) 82, var7);
            var32.field6839.method3730(119, class35.field371.method2474(82, (byte) 127) ? 1 : 0);
            class120.method872((byte) -65, var32);
            class224.method1512(var4, var5, -33);
        }
        if (var6 == 21) {
            class689 var33 = class314.field4456[var7];
            if (var33 != null) {
                class199.field2994 = 2;
                class38.field393++;
                class177.field2750 = 0;
                class166.field2619 = arg3;
                class133.field1789 = arg0;
                class468 var34 = class93.method734(class29.field284, client.field4263, 8174);
                var34.field6839.method3750(var7, (byte) -69);
                var34.field6839.method3704(true, class35.field371.method2474(82, (byte) 127) ? 1 : 0);
                class120.method872((byte) 46, var34);
                class461.method2815(0, true, 0, -2, var33.field6139[0], var33.method2579(false), var33.field6133[0], 116, var33.method2579(false));
            }
        }
        if (var6 == 12) {
            class689 var35 = class314.field4456[var7];
            if (var35 != null) {
                class199.field2994 = 2;
                class166.field2619 = arg3;
                class133.field1789 = arg0;
                class177.field2750 = 0;
                class320.field4522++;
                class468 var36 = class93.method734(class29.field284, class11.field155, arg1 + 8192);
                var36.field6839.method3697(class35.field371.method2474(82, (byte) 116) ? 1 : 0, arg1 ^ 0xFFFFFF99);
                var36.field6839.method3706((byte) 82, var7);
                class120.method872((byte) 126, var36);
                class461.method2815(0, true, 0, -2, var35.field6139[0], var35.method2579(false), var35.field6133[0], arg1 ^ 0xFFFFFF93, var35.method2579(false));
            }
        }
        if (var6 == 2) {
            class177.field2750 = 0;
            class199.field2994 = 2;
            class46.field575++;
            class166.field2619 = arg3;
            class133.field1789 = arg0;
            class468 var37 = class93.method734(class29.field284, class582.field8273, 8174);
            var37.field6839.method3734(var4 + class361.field5224, arg1 + 501927930);
            var37.field6839.method3734(class745.field10436, 501927912);
            var37.field6839.method3697(class35.field371.method2474(82, (byte) 122) ? 1 : 0, arg1 ^ 0xFFFFFF97);
            var37.field6839.method3698(126, class76.field1062);
            var37.field6839.method3750(var7, (byte) -69);
            var37.field6839.method3750(var5 + class582.field8288, (byte) -69);
            var37.field6839.method3702(class226.field3314, (byte) -106);
            class120.method872((byte) -108, var37);
            class224.method1512(var4, var5, 127);
        }
        if (var6 == 6) {
            class166.field2619 = arg3;
            class133.field1789 = arg0;
            class199.field2994 = 1;
            class177.field2750 = 0;
            class634.field8887++;
            class468 var38 = class93.method734(class29.field284, class704.field9810, 8174);
            var38.field6839.method3705(-21138, class76.field1062);
            var38.field6839.method3706((byte) 82, class361.field5224 + var4);
            var38.field6839.method3734(class582.field8288 + var5, 501927912);
            var38.field6839.method3734(class226.field3314, 501927912);
            var38.field6839.method3702(class745.field10436, (byte) -117);
            class120.method872((byte) 87, var38);
            class461.method2815(0, true, 0, -4, var5, 1, var4, 119, 1);
        }
        if (var6 == 57) {
            class133.field1789 = arg0;
            class166.field2619 = arg3;
            class199.field2994 = 2;
            class177.field2750 = 0;
            class657.field9198++;
            class468 var39 = class93.method734(class29.field284, class728.field10187, arg1 + 8192);
            var39.field6839.method3750(class361.field5224 + var4, (byte) -69);
            var39.field6839.method3750(class582.field8288 + var5, (byte) -69);
            var39.field6839.method3750(var7, (byte) -69);
            var39.field6839.method3704(true, class35.field371.method2474(82, (byte) 119) ? 1 : 0);
            class120.method872((byte) 80, var39);
            class224.method1512(var4, var5, arg1 ^ 0xFFFFFF91);
        }
        if (var6 == 45) {
            class166.field2619 = arg3;
            class542.field7726++;
            class133.field1789 = arg0;
            class177.field2750 = 0;
            class199.field2994 = 2;
            class468 var40 = class93.method734(class29.field284, class152.field2349, 8174);
            var40.field6839.method3702(class361.field5224 + var4, (byte) -118);
            var40.field6839.method3727(class35.field371.method2474(82, (byte) 117) ? 1 : 0, 10061);
            var40.field6839.method3750(class582.field8288 + var5, (byte) -69);
            var40.field6839.method3706((byte) 82, var7);
            class120.method872((byte) -116, var40);
            class224.method1512(var4, var5, arg1 + 145);
        }
        if (var6 == 23) {
            class199.field2994 = 2;
            class166.field2619 = arg3;
            class177.field2750 = 0;
            class601.field8501++;
            class133.field1789 = arg0;
            class468 var41 = class93.method734(class29.field284, class343.field4975, 8174);
            var41.field6839.method3734(class361.field5224 + var4, 501927912);
            var41.field6839.method3750(class582.field8288 + var5, (byte) -69);
            var41.field6839.method3750(var7, (byte) -69);
            var41.field6839.method3730(101, class35.field371.method2474(82, (byte) 126) ? 1 : 0);
            class120.method872((byte) -42, var41);
            class224.method1512(var4, var5, arg1 + 145);
        }
        if (var6 == 13) {
            class432 var42 = (class432) class497.field7067.method2287((long) var7, (byte) -117);
            if (var42 != null) {
                class353.field5130++;
                class282 var43 = var42.field6439;
                class133.field1789 = arg0;
                class177.field2750 = 0;
                class166.field2619 = arg3;
                class199.field2994 = 2;
                class468 var44 = class93.method734(class29.field284, class120.field1638, 8174);
                var44.field6839.method3697(class35.field371.method2474(82, (byte) 126) ? 1 : 0, -28);
                var44.field6839.method3706((byte) 82, var7);
                class120.method872((byte) -82, var44);
                class461.method2815(0, true, 0, -2, var43.field6139[0], var43.method2579(false), var43.field6133[0], 115, var43.method2579(false));
            }
        }
        if (var6 == 8) {
            class177.field2750 = 0;
            class535.field7672++;
            class133.field1789 = arg0;
            class199.field2994 = 2;
            class166.field2619 = arg3;
            class468 var45 = class93.method734(class29.field284, class160.field2552, arg1 + 8192);
            var45.field6839.method3706((byte) 82, class582.field8288 + var5);
            var45.field6839.method3730(arg1 ^ 0xFFFFFF85, class35.field371.method2474(82, (byte) 124) ? 1 : 0);
            var45.field6839.method3706((byte) 82, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var45.field6839.method3706((byte) 82, class361.field5224 + var4);
            class120.method872((byte) -118, var45);
            class127.method890(var5, var8, (byte) 121, var4);
        }
        if (var6 == 46) {
            class177.field2750 = 0;
            class716.field10071++;
            class166.field2619 = arg3;
            class199.field2994 = 2;
            class133.field1789 = arg0;
            class468 var46 = class93.method734(class29.field284, class368.field5298, arg1 ^ 0xFFFFE000);
            var46.field6839.method3734(class226.field3314, 501927912);
            var46.field6839.method3727(class35.field371.method2474(82, (byte) 117) ? 1 : 0, 10061);
            var46.field6839.method3734(class745.field10436, 501927912);
            var46.field6839.method3695(class76.field1062, 255);
            var46.field6839.method3706((byte) 82, class130.field1749.field6118);
            class120.method872((byte) -89, var46);
        }
        if (var6 == 9) {
            class689 var47 = class314.field4456[var7];
            if (var47 != null) {
                class177.field2750 = 0;
                class199.field2994 = 2;
                class133.field1789 = arg0;
                class400.field5969++;
                class166.field2619 = arg3;
                class468 var48 = class93.method734(class29.field284, class432.field6443, arg1 ^ 0xFFFFE000);
                var48.field6839.method3704(true, class35.field371.method2474(82, (byte) 124) ? 1 : 0);
                var48.field6839.method3702(var7, (byte) -122);
                class120.method872((byte) 50, var48);
                class461.method2815(0, true, 0, -2, var47.field6139[0], var47.method2579(false), var47.field6133[0], 122, var47.method2579(false));
            }
        }
        if (var6 == 30) {
            class689 var49 = class314.field4456[var7];
            if (var49 != null) {
                class409.field6168++;
                class133.field1789 = arg0;
                class199.field2994 = 2;
                class166.field2619 = arg3;
                class177.field2750 = 0;
                class468 var50 = class93.method734(class29.field284, class452.field6679, 8174);
                var50.field6839.method3750(var7, (byte) -69);
                var50.field6839.method3727(class35.field371.method2474(82, (byte) 123) ? 1 : 0, arg1 + 10079);
                class120.method872((byte) 121, var50);
                class461.method2815(0, true, 0, -2, var49.field6139[0], var49.method2579(false), var49.field6133[0], arg1 + 136, var49.method2579(false));
            }
        }
        if (var6 == 1008) {
            class632.field8843++;
            class133.field1789 = arg0;
            class177.field2750 = 0;
            class166.field2619 = arg3;
            class199.field2994 = 2;
            class468 var51 = class93.method734(class29.field284, class239.field3471, 8174);
            var51.field6839.method3702(var7, (byte) -122);
            class120.method872((byte) -59, var51);
        }
        if (var6 == 11) {
            class689 var52 = class314.field4456[var7];
            if (var52 != null) {
                class177.field2750 = 0;
                class716.field10071++;
                class166.field2619 = arg3;
                class199.field2994 = 2;
                class133.field1789 = arg0;
                class468 var53 = class93.method734(class29.field284, class368.field5298, 8174);
                var53.field6839.method3734(class226.field3314, arg1 + 501927930);
                var53.field6839.method3727(class35.field371.method2474(82, (byte) 120) ? 1 : 0, arg1 ^ 0xFFFFD8A3);
                var53.field6839.method3734(class745.field10436, 501927912);
                var53.field6839.method3695(class76.field1062, 255);
                var53.field6839.method3706((byte) 82, var7);
                class120.method872((byte) -55, var53);
                class461.method2815(0, true, 0, -2, var52.field6139[0], var52.method2579(false), var52.field6133[0], 123, var52.method2579(false));
            }
        }
        if (var6 == 4) {
            class177.field2750 = 0;
            class199.field2994 = 2;
            class11.field161++;
            class166.field2619 = arg3;
            class133.field1789 = arg0;
            class468 var54 = class93.method734(class29.field284, class579.field8241, 8174);
            var54.field6839.method3750((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) -69);
            var54.field6839.method3706((byte) 82, class226.field3314);
            var54.field6839.method3706((byte) 82, class745.field10436);
            var54.field6839.method3698(arg1 + 142, class76.field1062);
            var54.field6839.method3706((byte) 82, class582.field8288 + var5);
            var54.field6839.method3734(class361.field5224 + var4, 501927912);
            var54.field6839.method3730(112, class35.field371.method2474(82, (byte) 124) ? 1 : 0);
            class120.method872((byte) 65, var54);
            class127.method890(var5, var8, (byte) 105, var4);
        }
        if (var6 == 5) {
            class689 var55 = class314.field4456[var7];
            if (var55 != null) {
                class199.field2994 = 2;
                class177.field2750 = 0;
                class133.field1789 = arg0;
                class640.field8987++;
                class166.field2619 = arg3;
                class468 var56 = class93.method734(class29.field284, class154.field2492, 8174);
                var56.field6839.method3704(true, class35.field371.method2474(82, (byte) 115) ? 1 : 0);
                var56.field6839.method3734(var7, 501927912);
                class120.method872((byte) -63, var56);
                class461.method2815(0, true, 0, -2, var55.field6139[0], var55.method2579(false), var55.field6133[0], arg1 + 136, var55.method2579(false));
            }
        }
        if (var6 == 60) {
            class689 var57 = class314.field4456[var7];
            if (var57 != null) {
                class166.field2619 = arg3;
                class177.field2750 = 0;
                class133.field1789 = arg0;
                class758.field10595++;
                class199.field2994 = 2;
                class468 var58 = class93.method734(class29.field284, class287.field4074, 8174);
                var58.field6839.method3750(var7, (byte) -69);
                var58.field6839.method3704(true, class35.field371.method2474(82, (byte) 116) ? 1 : 0);
                class120.method872((byte) 55, var58);
                class461.method2815(0, true, 0, -2, var57.field6139[0], var57.method2579(false), var57.field6133[0], 116, var57.method2579(false));
            }
        }
        if (var6 == 17) {
            class689 var59 = class314.field4456[var7];
            if (var59 != null) {
                class177.field2750 = 0;
                class133.field1789 = arg0;
                class139.field1855++;
                class199.field2994 = 2;
                class166.field2619 = arg3;
                class468 var60 = class93.method734(class29.field284, class164.field2602, 8174);
                var60.field6839.method3704(true, class35.field371.method2474(82, (byte) 116) ? 1 : 0);
                var60.field6839.method3750(var7, (byte) -69);
                class120.method872((byte) 42, var60);
                class461.method2815(0, true, 0, -2, var59.field6139[0], var59.method2579(false), var59.field6133[0], arg1 ^ 0xFFFFFF94, var59.method2579(false));
            }
        }
        if (var6 == 1004) {
            class166.field2619 = arg3;
            class199.field2994 = 2;
            class133.field1789 = arg0;
            class177.field2750 = 0;
            class432 var61 = (class432) class497.field7067.method2287((long) var7, (byte) -117);
            if (var61 != null) {
                class282 var62 = var61.field6439;
                class348 var63 = var62.field4008;
                if (var63.field5076 != null) {
                    var63 = var63.method2207(arg1 + 104, class83.field1160);
                }
                if (var63 != null) {
                    class268.field3843++;
                    class468 var64 = class93.method734(class29.field284, class221.field3232, arg1 ^ 0xFFFFE000);
                    var64.field6839.method3702(var63.field5064, (byte) -116);
                    class120.method872((byte) 57, var64);
                }
            }
        }
        if (var6 == 10) {
            class177.field2750 = 0;
            class166.field2619 = arg3;
            class182.field2795++;
            class199.field2994 = 2;
            class133.field1789 = arg0;
            class468 var65 = class93.method734(class29.field284, class168.field2643, arg1 ^ 0xFFFFE000);
            var65.field6839.method3734(class361.field5224 + var4, 501927912);
            var65.field6839.method3697(class35.field371.method2474(82, (byte) 121) ? 1 : 0, arg1 - 1);
            var65.field6839.method3702(class582.field8288 + var5, (byte) -123);
            var65.field6839.method3734((int) (var8 >>> 32) & Integer.MAX_VALUE, 501927912);
            class120.method872((byte) 42, var65);
            class127.method890(var5, var8, (byte) 91, var4);
        }
        if (var6 == 58) {
            if (class245.field3569 > 0 && class35.field371.method2474(82, (byte) 127) && class35.field371.method2474(81, (byte) 125)) {
                class343.method2178(class130.field1749.field8429, class582.field8288 + var5, class361.field5224 - -var4, false);
            } else {
                class468 var66 = class718.method4078(var4, var5, var7, (byte) 55);
                if (var7 == 1) {
                    var66.field6839.method3730(117, -1);
                    var66.field6839.method3730(arg1 + 136, -1);
                    var66.field6839.method3702((int) class255.field3659, (byte) -115);
                    var66.field6839.method3730(110, 57);
                    var66.field6839.method3730(arg1 ^ 0xFFFFFF9D, class748.field10464);
                    var66.field6839.method3730(123, class305.field4322);
                    var66.field6839.method3730(115, 89);
                    var66.field6839.method3702(class130.field1749.field8423, (byte) -108);
                    var66.field6839.method3702(class130.field1749.field8428, (byte) -128);
                    var66.field6839.method3730(101, 63);
                } else {
                    class199.field2994 = 1;
                    class177.field2750 = 0;
                    class166.field2619 = arg3;
                    class133.field1789 = arg0;
                }
                class120.method872((byte) -82, var66);
                class461.method2815(0, true, 0, -4, var5, 1, var4, 121, 1);
            }
        }
        if (var6 == 22) {
            class432 var67 = (class432) class497.field7067.method2287((long) var7, (byte) -117);
            if (var67 != null) {
                class177.field2750 = 0;
                class282 var68 = var67.field6439;
                class523.field7477++;
                class166.field2619 = arg3;
                class199.field2994 = 2;
                class133.field1789 = arg0;
                class468 var69 = class93.method734(class29.field284, class264.field3780, 8174);
                var69.field6839.method3750(class745.field10436, (byte) -69);
                var69.field6839.method3697(class35.field371.method2474(82, (byte) 117) ? 1 : 0, 116);
                var69.field6839.method3750(var7, (byte) -69);
                var69.field6839.method3698(arg1 + 135, class76.field1062);
                var69.field6839.method3702(class226.field3314, (byte) -123);
                class120.method872((byte) -45, var69);
                class461.method2815(0, true, 0, -2, var68.field6139[0], var68.method2579(false), var68.field6133[0], arg1 + 142, var68.method2579(false));
            }
        }
        if (var6 == 18) {
            class177.field2750 = 0;
            class166.field2619 = arg3;
            class133.field1789 = arg0;
            class199.field2994 = 2;
            class4.field51++;
            class468 var70 = class93.method734(class29.field284, class610.field8625, 8174);
            var70.field6839.method3750(var4 + class361.field5224, (byte) -69);
            var70.field6839.method3727(class35.field371.method2474(82, (byte) 122) ? 1 : 0, 10061);
            var70.field6839.method3750(var5 + class582.field8288, (byte) -69);
            var70.field6839.method3702((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) -106);
            class120.method872((byte) -102, var70);
            class127.method890(var5, var8, (byte) 106, var4);
        }
        if (class282.field3986) {
            class148.method1087(-34848);
        }
        if (class239.field3477 != null && class361.field5231 == 0) {
            class673.method3850(class239.field3477, (byte) -54);
        }
    }
}
