import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class327 {

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public static int field4520 = -1;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public int field4515;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    public int field4521;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "I")
    public int field4522;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method2085(boolean arg0) {
        field4517++;
        int[] var1 = new int[class291.field4179.field2993];
        int var2 = 0;
        if (!arg0) {
            method2086(-69, 35);
        }
        for (int var3 = 0; var3 < class291.field4179.field2993; var3++) {
            class671 var5 = class291.field4179.method1313(var3, true);
            if (var5.field9284 >= 0 || var5.field9314 >= 0) {
                var1[var2++] = var3;
            }
        }
        class735.field10186 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class735.field10186[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II)V", line = 45)
    public static final void method2086(int arg0, int arg1) {
        field4514++;
        if (!class424.method2641(arg1, -11664)) {
            return;
        }
        class755[] var2 = class266.field3900[arg1];
        if (arg0 != 5589) {
            method2089(true, false);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class755 var4 = var2[var3];
            if (var4 != null) {
                var4.field10549 = 1;
                var4.field10425 = 0;
                var4.field10465 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)Z", line = 82)
    public static final boolean method2087(byte arg0) throws IOException {
        field4516++;
        if (class713.field9960 == null) {
            return false;
        }
        if (class400.field5735 == null) {
            if (class697.field9739) {
                if (!class713.field9960.method2223((byte) -74, 1)) {
                    return false;
                }
                class713.field9960.method2227(class352.field5071.field954, 1, 0, (byte) 23);
                class697.field9739 = false;
                class122.field1619++;
                class68.field1048 = 0;
            }
            class352.field5071.field956 = 0;
            if (class352.field5071.method2559((byte) -36)) {
                if (!class713.field9960.method2223((byte) -128, 1)) {
                    return false;
                }
                class713.field9960.method2227(class352.field5071.field954, 1, 1, (byte) 23);
                class68.field1048 = 0;
                class122.field1619++;
            }
            class697.field9739 = true;
            class602[] var1 = class22.method119(16864);
            int var2 = class352.field5071.method2569((byte) 113);
            if (var2 < 0 || var2 >= var1.length) {
                throw new IOException("invo:" + var2 + " ip:" + class352.field5071.field956);
            }
            class400.field5735 = var1[var2];
            class357.field5125 = class400.field5735.field8148;
        }
        if (class357.field5125 == -1) {
            if (!class713.field9960.method2223((byte) -94, 1)) {
                return false;
            }
            class713.field9960.method2227(class352.field5071.field954, 1, 0, (byte) 23);
            class357.field5125 = class352.field5071.field954[0] & 0xFF;
            class68.field1048 = 0;
            class122.field1619++;
        }
        if (class357.field5125 == -2) {
            if (!class713.field9960.method2223((byte) -103, 2)) {
                return false;
            }
            class713.field9960.method2227(class352.field5071.field954, 2, 0, (byte) 23);
            class352.field5071.field956 = 0;
            class357.field5125 = class352.field5071.method482(-772591672);
            class68.field1048 = 0;
            class122.field1619 += 2;
        }
        if (class357.field5125 > 0) {
            if (!class713.field9960.method2223((byte) -114, class357.field5125)) {
                return false;
            }
            class352.field5071.field956 = 0;
            class713.field9960.method2227(class352.field5071.field954, class357.field5125, 0, (byte) 23);
            class68.field1048 = 0;
            class122.field1619 += class357.field5125;
        }
        class600.field8121 = class113.field1523;
        class113.field1523 = class594.field8063;
        class594.field8063 = class400.field5735;
        if (class540.field7507 == class400.field5735) {
            int var3 = class352.field5071.method505((byte) -119);
            class623.method3515(-24);
            class616.field8280 = var3;
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class360.field5157) {
            int var4 = class352.field5071.method482(-772591672);
            String var5 = class352.field5071.method479((byte) -4);
            class623.method3515(-24);
            class319.method2062(var5, 26188, var4);
            class400.field5735 = null;
            return true;
        } else if (class61.field882 == class400.field5735) {
            int var6 = class352.field5071.method469(-4040);
            int var7 = class352.field5071.method482(-772591672);
            int var8 = class352.field5071.method482(-772591672);
            class623.method3515(-24);
            class146.method948(var6, (var7 << 16) + var8, (byte) -109);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class291.field4176) {
            for (int var9 = 0; var9 < class251.field3675.length; var9++) {
                if (class251.field3675[var9] != null) {
                    class251.field3675[var9].field7105 = null;
                    class251.field3675[var9].field7132 = -1;
                }
            }
            for (int var10 = 0; var10 < class445.field6185; var10++) {
                class757.field10568[var10].field3471.field7105 = null;
                class757.field10568[var10].field3471.field7132 = -1;
            }
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class395.field5681) {
            int var11 = class352.field5071.method500((byte) -124);
            int var12 = class352.field5071.method469(-4040);
            class623.method3515(-24);
            class612.method3472((byte) 117, var12, var11);
            class400.field5735 = null;
            return true;
        } else if (class605.field8171 == class400.field5735) {
            class195.field2633 = class357.field5125 > 2 ? class352.field5071.method479((byte) -48) : class155.field2145.method978(class120.field1576, (byte) -124);
            class549.field7635 = class357.field5125 > 0 ? class352.field5071.method482(-772591672) : -1;
            class400.field5735 = null;
            if (class549.field7635 == 65535) {
                class549.field7635 = -1;
            }
            return true;
        } else if (class460.field6378 == class400.field5735) {
            while (class357.field5125 > class352.field5071.field956) {
                boolean var23 = class352.field5071.method505((byte) -119) == 1;
                String var24 = class352.field5071.method479((byte) -125);
                String var25 = class352.field5071.method479((byte) -95);
                int var26 = class352.field5071.method482(-772591672);
                int var27 = class352.field5071.method505((byte) -119);
                String var28 = "";
                boolean var29 = false;
                if (var26 > 0) {
                    var28 = class352.field5071.method479((byte) -115);
                    var29 = class352.field5071.method505((byte) -119) == 1;
                }
                for (int var30 = 0; var30 < class239.field3558; var30++) {
                    if (var23) {
                        if (var25.equals(class193.field2627[var30])) {
                            class193.field2627[var30] = var24;
                            var24 = null;
                            class342.field4854[var30] = var25;
                            break;
                        }
                    } else if (var24.equals(class193.field2627[var30])) {
                        if (class88.field1246[var30] != var26) {
                            boolean var31 = true;
                            for (class383 var32 = (class383) class652.field8733.method1638(false); var32 != null; var32 = (class383) class652.field8733.method1645(0)) {
                                if (var32.field5497.equals(var24)) {
                                    if (var26 != 0 && var32.field5502 == 0) {
                                        var32.method3012(123);
                                        var31 = false;
                                    } else if (var26 == 0 && var32.field5502 != 0) {
                                        var31 = false;
                                        var32.method3012(123);
                                    }
                                }
                            }
                            if (var31) {
                                class652.field8733.method1643(new class383(var24, var26), -86);
                            }
                            class88.field1246[var30] = var26;
                        }
                        class342.field4854[var30] = var25;
                        class573.field7908[var30] = var28;
                        class473.field6553[var30] = var27;
                        class580.field7945[var30] = var29;
                        var24 = null;
                        break;
                    }
                }
                if (var24 != null && class239.field3558 < 200) {
                    class193.field2627[class239.field3558] = var24;
                    class342.field4854[class239.field3558] = var25;
                    class88.field1246[class239.field3558] = var26;
                    class573.field7908[class239.field3558] = var28;
                    class473.field6553[class239.field3558] = var27;
                    class580.field7945[class239.field3558] = var29;
                    class239.field3558++;
                }
            }
            class557.field7747 = class320.field4449;
            class432.field6031 = 2;
            boolean var13 = false;
            int var14 = class239.field3558;
            while (var14 > 0) {
                boolean var15 = true;
                var14--;
                for (int var16 = 0; var16 < var14; var16++) {
                    if (class88.field1246[var16] != class416.field5882.field6484 && class88.field1246[var16 + 1] == class416.field5882.field6484 || class88.field1246[var16] == 0 && class88.field1246[var16 + 1] != 0) {
                        int var17 = class88.field1246[var16];
                        class88.field1246[var16] = class88.field1246[var16 + 1];
                        class88.field1246[var16 + 1] = var17;
                        String var18 = class573.field7908[var16];
                        class573.field7908[var16] = class573.field7908[var16 + 1];
                        class573.field7908[var16 + 1] = var18;
                        String var19 = class193.field2627[var16];
                        class193.field2627[var16] = class193.field2627[var16 + 1];
                        class193.field2627[var16 + 1] = var19;
                        String var20 = class342.field4854[var16];
                        class342.field4854[var16] = class342.field4854[var16 + 1];
                        class342.field4854[var16 + 1] = var20;
                        int var21 = class473.field6553[var16];
                        class473.field6553[var16] = class473.field6553[var16 + 1];
                        class473.field6553[var16 + 1] = var21;
                        boolean var22 = class580.field7945[var16];
                        class580.field7945[var16] = class580.field7945[var16 + 1];
                        class580.field7945[var16 + 1] = var22;
                        var15 = false;
                    }
                }
                if (var15) {
                    break;
                }
            }
            class400.field5735 = null;
            return true;
        } else if (class697.field9737 == class400.field5735) {
            class11.method50(7, class3.field17);
            class400.field5735 = null;
            return true;
        } else if (class561.field7804 == class400.field5735) {
            int var33 = class352.field5071.method466(-81);
            int var34 = class352.field5071.method500((byte) 121);
            int[] var35 = new int[4];
            for (int var36 = 0; var36 < 4; var36++) {
                var35[var36] = class352.field5071.method506(-126);
            }
            class234 var37 = (class234) class372.field5245.method812(113, (long) var34);
            if (var37 != null) {
                class563.method3306(var35, var33, (byte) -94, var37.field3471);
            }
            class400.field5735 = null;
            return true;
        } else if (class463.field6433 == class400.field5735) {
            int var38 = class352.field5071.method457(-14532);
            class623.method3515(-24);
            class338.method2147(var38, 4, 5, class145.field2037, 0);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class318.field4407) {
            int var39 = class352.field5071.method458(4);
            if (class548.field7619 != var39) {
                class548.field7619 = var39;
                class546.method3226(class471.field6535, -1, -1);
            }
            class400.field5735 = null;
            return true;
        } else if (class425.field5958 == class400.field5735) {
            class709.method3992(class357.field5125, class352.field5071, class159.field2227, (byte) 7);
            class400.field5735 = null;
            return true;
        } else if (class757.field10562 == class400.field5735) {
            class329.method2114(31897);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class375.field5273) {
            int var40 = class352.field5071.method483(-30458);
            class623.method3515(-24);
            class654 var41 = (class654) class259.field3747.method812(116, (long) var40);
            if (var41 != null) {
                class39.method217((byte) 108, var41, true, false);
            }
            if (class13.field127 != null) {
                class27.method159((byte) -105, class13.field127);
                class13.field127 = null;
            }
            class400.field5735 = null;
            return true;
        } else if (class619.field8308 == class400.field5735) {
            class11.method50(7, class600.field8126);
            class400.field5735 = null;
            return true;
        } else if (class656.field8760 == class400.field5735) {
            class103.method683((byte) -114, class352.field5071, class357.field5125);
            class400.field5735 = null;
            return true;
        } else if (class429.field6010 == class400.field5735) {
            int var42 = class352.field5071.method482(-772591672);
            int var43 = class352.field5071.method466(109);
            class623.method3515(-24);
            if (var43 == 2) {
                class293.method1943(7);
            }
            class544.field7545 = var42;
            method2086(5589, var42);
            class304.method2002(false, 24615);
            class546.method3232(class544.field7545);
            for (int var44 = 0; var44 < 100; var44++) {
                class669.field9236[var44] = true;
            }
            class400.field5735 = null;
            return true;
        } else if (class476.field6631 == class400.field5735) {
            class197.field2641 = class352.field5071.method474(11212);
            class669.field9237 = class352.field5071.method474(11212);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class182.field2496) {
            class652.method3645((byte) -99);
            class400.field5735 = null;
            return false;
        } else if (class545.field7558 == class400.field5735) {
            int var45 = class352.field5071.method474(11212);
            int var46 = class352.field5071.method482(-772591672);
            class124.field1712.method3606((byte) -56, var46, var45);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class178.field2433) {
            class623.method3515(-24);
            class496.method3006((byte) -46);
            class400.field5735 = null;
            return true;
        } else if (class746.field10263 == class400.field5735) {
            class11.method50(7, class297.field4228);
            class400.field5735 = null;
            return true;
        } else if (class535.field7423 == class400.field5735) {
            int var47 = class352.field5071.method482(-772591672);
            int var48 = class352.field5071.method505((byte) -119);
            boolean var49 = (var48 & 0x1) == 1;
            while (class352.field5071.field956 < class357.field5125) {
                int var50 = class352.field5071.method478(-92);
                int var51 = class352.field5071.method482(-772591672);
                int var52 = 0;
                if (var51 != 0) {
                    var52 = class352.field5071.method505((byte) -119);
                    if (var52 == 255) {
                        var52 = class352.field5071.method457(-14532);
                    }
                }
                class420.method2604(var50, -102, var52, var49, var47, var51 - 1);
            }
            class650.field8722[class665.method3759(31, class7.field60++)] = var47;
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class30.field357) {
            String var53 = class352.field5071.method479((byte) -31);
            String var54 = class572.method3354(class697.method3933(class352.field5071, 268423370), -61);
            class476.method2904(var54, var53, var53, var53, 6, -1, 0);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class337.field4730) {
            int var55 = class352.field5071.method478(-116);
            int var56 = class352.field5071.method457(-14532);
            int var57 = class352.field5071.method505((byte) -119);
            String var58 = "";
            String var59 = var58;
            if ((var57 & 0x1) != 0) {
                var58 = class352.field5071.method479((byte) -77);
                if ((var57 & 0x2) == 0) {
                    var59 = var58;
                } else {
                    var59 = class352.field5071.method479((byte) -6);
                }
            }
            String var60 = class352.field5071.method479((byte) -29);
            if (var55 == 99) {
                class261.method1772((byte) -111, var60);
            } else if (var59.equals("") || !class113.method728(var59, true)) {
                class476.method2904(var60, var59, var58, var58, var55, -1, var56);
            } else {
                class400.field5735 = null;
                return true;
            }
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class193.field2624) {
            int var61 = class352.field5071.method483(-30458);
            int var62 = class352.field5071.method500((byte) 125);
            if (var62 == 65535) {
                var62 = -1;
            }
            int var63 = class352.field5071.method500((byte) 117);
            if (var63 == 65535) {
                var63 = -1;
            }
            int var64 = class352.field5071.method469(-4040);
            class623.method3515(-24);
            for (int var65 = var62; var65 <= var63; var65++) {
                long var66 = ((long) var64 << 32) + (long) var65;
                class274 var68 = (class274) class444.field6171.method812(125, var66);
                class274 var69;
                if (var68 != null) {
                    var69 = new class274(var61, var68.field3971);
                    var68.method549(6410);
                } else if (var65 == -1) {
                    var69 = new class274(var61, class189.method1182(var64, (byte) -101).field10499.field3971);
                } else {
                    var69 = new class274(var61, -1);
                }
                class444.field6171.method820(var66, (byte) -42, var69);
            }
            class400.field5735 = null;
            return true;
        } else if (client.field6221 == class400.field5735) {
            int var70 = class352.field5071.method498(-102);
            int var71 = class352.field5071.method457(-14532);
            int var72 = class352.field5071.method498(-66);
            class481.field6708[var72] = var71;
            class581.field7955[var72] = var70;
            class444.field6168[var72] = 1;
            int var73 = class192.field2600[var72] - 1;
            for (int var74 = 0; var74 < var73; var74++) {
                if (class636.field8546[var74] <= var71) {
                    class444.field6168[var72] = var74 + 2;
                }
            }
            class387.field5563[class665.method3759(31, class41.field513++)] = var72;
            class400.field5735 = null;
            return true;
        } else if (class601.field8140 == class400.field5735) {
            int var75 = class352.field5071.method458(4);
            int var76 = class352.field5071.method506(-101);
            class623.method3515(-24);
            if (var76 == 65535) {
                var76 = -1;
            }
            class338.method2147(var75, 4, 1, var76, -1);
            class400.field5735 = null;
            return true;
        } else if (class623.field8401 == class400.field5735) {
            int var77 = class352.field5071.method505((byte) -119);
            int var78 = class352.field5071.method482(-772591672);
            boolean var79 = (var77 & 0x1) == 1;
            class293.method1939(var78, var79, 23489);
            class650.field8722[class665.method3759(class7.field60++, 31)] = var78;
            class400.field5735 = null;
            return true;
        } else if (class677.field9385 == class400.field5735) {
            if (class544.field7545 != -1) {
                class667.method3767(class544.field7545, 0, 4626);
            }
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class390.field5618) {
            int var80 = class352.field5071.method483(-30458);
            int var81 = class352.field5071.method457(-14532);
            int var82 = class352.field5071.method482(-772591672);
            class623.method3515(-24);
            if (var82 == 65535) {
                var82 = -1;
            }
            class77.method573(var81, var80, var82, -17311);
            class671 var83 = class291.field4179.method1313(var82, true);
            class705.method3972(8, var83.field9269, var83.field9332, var80, var83.field9322);
            class521.method3106(var83.field9307, var83.field9303, var80, (byte) 111, var83.field9330);
            class400.field5735 = null;
            return true;
        } else if (class571.field7895 == class400.field5735) {
            class400.field5735 = null;
            return false;
        } else if (class548.field7628 == class400.field5735) {
            class97.field1370 = class352.field5071.method505((byte) -119);
            for (int var84 = 0; var84 < class97.field1370; var84++) {
                class438.field6108[var84] = class352.field5071.method479((byte) -106);
                class532.field7393[var84] = class352.field5071.method479((byte) -64);
                if (class532.field7393[var84].equals("")) {
                    class532.field7393[var84] = class438.field6108[var84];
                }
                class747.field10288[var84] = class352.field5071.method479((byte) -30);
                class557.field7749[var84] = class352.field5071.method479((byte) -118);
                if (class557.field7749[var84].equals("")) {
                    class557.field7749[var84] = class747.field10288[var84];
                }
                class315.field4362[var84] = false;
            }
            class557.field7747 = class320.field4449;
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class206.field2700) {
            int var85 = class352.field5071.method469(-4040);
            class623.method3515(-24);
            class338.method2147(var85, 4, 3, -1, -1);
            class400.field5735 = null;
            return true;
        } else if (class627.field8432 == class400.field5735) {
            class623.method3515(-24);
            class634.method3555(17220);
            class400.field5735 = null;
            return true;
        } else if (class457.field6329 == class400.field5735) {
            int var86 = class352.field5071.method500((byte) -11);
            if (var86 == 65535) {
                var86 = -1;
            }
            int var87 = class352.field5071.method483(-30458);
            class623.method3515(-24);
            class594.method3414(var86, var87, 16);
            class400.field5735 = null;
            return true;
        } else if (class748.field10295 == class400.field5735) {
            int var88 = class352.field5071.method482(-772591672);
            if (var88 == 65535) {
                var88 = -1;
            }
            int var89 = class352.field5071.method505((byte) -119);
            int var90 = class352.field5071.method482(-772591672);
            int var91 = class352.field5071.method505((byte) -119);
            int var92 = class352.field5071.method482(-772591672);
            class604.method3439(var88, -397, var92, var91, var89, var90);
            class400.field5735 = null;
            return true;
        } else if (class583.field7962 == class400.field5735) {
            int var93 = class352.field5071.method483(-30458);
            int var94 = class352.field5071.method455(-77);
            class623.method3515(-24);
            class363.method2303((byte) -122, var94, var93);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class133.field1877) {
            int var95 = class352.field5071.method482(-772591672);
            int var96 = class352.field5071.method458(4);
            class623.method3515(-24);
            class158.method992(var95, var96, (byte) 85);
            class400.field5735 = null;
            return true;
        } else if (class539.field7486 == class400.field5735) {
            int var97 = class352.field5071.method482(-772591672);
            if (var97 == 65535) {
                var97 = -1;
            }
            int var98 = class352.field5071.method505((byte) -119);
            int var99 = class352.field5071.method482(-772591672);
            int var100 = class352.field5071.method505((byte) -119);
            int var101 = class352.field5071.method482(-772591672);
            class545.method3220(var100, var97, var101, false, (byte) 66, var99, var98);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class233.field3468) {
            int var102 = class352.field5071.method458(4);
            int var103 = class352.field5071.method482(-772591672);
            class124.field1712.method3603(var103, var102, false);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class121.field1598) {
            int var104 = class352.field5071.method457(-14532);
            int var105 = class352.field5071.method500((byte) 34);
            class124.field1712.method3606((byte) -113, var105, var104);
            class400.field5735 = null;
            return true;
        } else if (class51.field752 == class400.field5735) {
            class11.method50(7, class11.field101);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class360.field5155) {
            class400.field5735 = null;
            class432.field6031 = 1;
            class557.field7747 = class320.field4449;
            return true;
        } else if (class602.field8146 == class400.field5735) {
            int var106 = class352.field5071.method483(-30458);
            int var107 = class352.field5071.method455(-65);
            if (var107 == 65535) {
                var107 = -1;
            }
            int var108 = class352.field5071.method455(-86);
            int var109 = class352.field5071.method482(-772591672);
            if (var109 == 65535) {
                var109 = -1;
            }
            class623.method3515(-24);
            for (int var110 = var107; var110 <= var109; var110++) {
                long var111 = ((long) var106 << 32) + (long) var110;
                class274 var113 = (class274) class444.field6171.method812(114, var111);
                class274 var114;
                if (var113 != null) {
                    var114 = new class274(var113.field3970, var108);
                    var113.method549(6410);
                } else if (var110 == -1) {
                    var114 = new class274(class189.method1182(var106, (byte) -101).field10499.field3970, var108);
                } else {
                    var114 = new class274(0, var108);
                }
                class444.field6171.method820(var111, (byte) -42, var114);
            }
            class400.field5735 = null;
            return true;
        } else if (class65.field1020 == class400.field5735) {
            if (class425.method2643(class102.field1401, -93)) {
                class84.field1188 = (int) ((float) class352.field5071.method482(-772591672) * 2.5F);
            } else {
                class84.field1188 = class352.field5071.method482(-772591672) * 30;
            }
            class400.field5735 = null;
            class526.field7303 = class320.field4449;
            return true;
        } else if (class400.field5735 == class101.field1389) {
            class11.method50(7, class67.field1043);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class179.field2456) {
            method2089(class701.field9775, false);
            class400.field5735 = null;
            return false;
        } else if (class400.field5735 == class171.field2374) {
            class11.method50(7, class84.field1198);
            class400.field5735 = null;
            return true;
        } else if (class473.field6557 == class400.field5735) {
            String var115 = class352.field5071.method479((byte) -25);
            boolean var116 = class352.field5071.method505((byte) -119) == 1;
            String var117;
            if (var116) {
                var117 = class352.field5071.method479((byte) -56);
            } else {
                var117 = var115;
            }
            int var118 = class352.field5071.method482(-772591672);
            byte var119 = class352.field5071.method491(false);
            boolean var120 = false;
            if (var119 == -128) {
                var120 = true;
            }
            if (var120) {
                if (class691.field9619 == 0) {
                    class400.field5735 = null;
                    return true;
                }
                boolean var121 = false;
                int var122;
                for (var122 = 0; var122 < class691.field9619 && (!class623.field8402[var122].field3655.equals(var117) || class623.field8402[var122].field3657 != var118); var122++) {
                }
                if (var122 < class691.field9619) {
                    while (var122 < (class691.field9619 - 1)) {
                        class623.field8402[var122] = class623.field8402[var122 + 1];
                        var122++;
                    }
                    class691.field9619--;
                    class623.field8402[class691.field9619] = null;
                }
            } else {
                String var123 = class352.field5071.method479((byte) -91);
                class249 var124 = new class249();
                var124.field3654 = var115;
                var124.field3655 = var117;
                var124.field3652 = class673.method3805(1, var124.field3655);
                var124.field3658 = var119;
                var124.field3657 = var118;
                var124.field3656 = var123;
                int var125;
                for (var125 = class691.field9619 - 1; var125 >= 0; var125--) {
                    int var126 = class623.field8402[var125].field3652.compareTo(var124.field3652);
                    if (var126 == 0) {
                        class623.field8402[var125].field3657 = var118;
                        class623.field8402[var125].field3658 = var119;
                        class623.field8402[var125].field3656 = var123;
                        if (var117.equals(class388.field5601.field1313)) {
                            class62.field894 = var119;
                        }
                        class400.field5735 = null;
                        class243.field3617 = class320.field4449;
                        return true;
                    }
                    if (var126 < 0) {
                        break;
                    }
                }
                if (class691.field9619 >= class623.field8402.length) {
                    class400.field5735 = null;
                    return true;
                }
                for (int var127 = class691.field9619 - 1; var127 > var125; var127--) {
                    class623.field8402[var127 + 1] = class623.field8402[var127];
                }
                if (class691.field9619 == 0) {
                    class623.field8402 = new class249[100];
                }
                class623.field8402[var125 + 1] = var124;
                class691.field9619++;
                if (var117.equals(class388.field5601.field1313)) {
                    class62.field894 = var119;
                }
            }
            class400.field5735 = null;
            class243.field3617 = class320.field4449;
            return true;
        } else if (class400.field5735 == class179.field2460) {
            int var128 = class352.field5071.method482(-772591672);
            int var129 = class352.field5071.method505((byte) -119);
            boolean var130 = (var129 & 0x1) == 1;
            class653.method3649(var130, (byte) -87, var128);
            int var131 = class352.field5071.method482(-772591672);
            for (int var132 = 0; var132 < var131; var132++) {
                int var133 = class352.field5071.method506(-94);
                int var134 = class352.field5071.method466(126);
                if (var134 == 255) {
                    var134 = class352.field5071.method457(-14532);
                }
                class420.method2604(var132, -106, var134, var130, var128, var133 - 1);
            }
            class650.field8722[class665.method3759(31, class7.field60++)] = var128;
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class35.field452) {
            int var135 = class352.field5071.method506(-104);
            int var136 = class352.field5071.method506(-121);
            class623.method3515(-24);
            class434.method2680(0, 3, var135, var136);
            class400.field5735 = null;
            return true;
        } else if (class665.field9170 == class400.field5735) {
            class100.method673(83);
            class400.field5735 = null;
            return false;
        } else if (class400.field5735 == class171.field2376) {
            int var137 = class352.field5071.method458(4);
            int var138 = var137 >> 28 & 0x3;
            int var139 = (var137 & 0xFFFD8BB) >> 14;
            int var140 = var137 & 0x3FFF;
            int var141 = class352.field5071.method455(-98);
            if (var141 == 65535) {
                var141 = -1;
            }
            int var142 = class352.field5071.method505((byte) -119);
            int var143 = var142 >> 2;
            int var144 = var142 & 0x3;
            int var145 = var139 - class113.field1509;
            int var146 = class211.field2787[var143];
            int var147 = var140 - class587.field7995;
            class379.method2375(var143, var138, var147, var146, var144, 17094, var145, var141);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class209.field2728) {
            int var148 = class352.field5071.method469(-4040);
            int var149 = class352.field5071.method500((byte) 123);
            int var150 = class352.field5071.method482(-772591672);
            int var151 = class352.field5071.method455(-111);
            class623.method3515(-24);
            class705.method3972(8, var149, var150, var148, var151);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class388.field5582) {
            class11.method50(7, class261.field3785);
            class400.field5735 = null;
            return true;
        } else if (class601.field8134 == class400.field5735) {
            boolean var152 = class352.field5071.method505((byte) -119) == 1;
            String var153 = class352.field5071.method479((byte) -71);
            String var154 = var153;
            if (var152) {
                var154 = class352.field5071.method479((byte) -77);
            }
            long var155 = class352.field5071.method475(880459872);
            long var157 = (long) class352.field5071.method482(-772591672);
            long var159 = (long) class352.field5071.method476((byte) 111);
            int var161 = class352.field5071.method505((byte) -119);
            long var162 = (var157 << 32) + var159;
            boolean var164 = false;
            int var165 = 0;
            while (true) {
                if (var165 >= 100) {
                    if (var161 <= 1) {
                        if (!(!class214.field2807 || class571.field7897) || class464.field6463) {
                            var164 = true;
                        } else if (class113.method728(var154, true)) {
                            var164 = true;
                        }
                    }
                    break;
                }
                if (class204.field2697[var165] == var162) {
                    var164 = true;
                    break;
                }
                var165++;
            }
            if (!var164 && class158.field2218 == 0) {
                class204.field2697[class8.field83] = var162;
                class8.field83 = (class8.field83 + 1) % 100;
                String var166 = class572.method3354(class697.method3933(class352.field5071, 268423370), -61);
                if (var161 == 2 || var161 == 3) {
                    class192.method1196("<img=1>" + var154, 9, 0, 99, -1, var166, "<img=1>" + var153, var153, class331.method2123(0, var155));
                } else if (var161 == 1) {
                    class192.method1196("<img=0>" + var154, 9, 0, 99, -1, var166, "<img=0>" + var153, var153, class331.method2123(0, var155));
                } else {
                    class192.method1196(var154, 9, 0, 99, -1, var166, var153, var153, class331.method2123(0, var155));
                }
            }
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class349.field4959) {
            class11.method50(7, class697.field9733);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class374.field5271) {
            class573.method3359(19654);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class376.field5282) {
            boolean var167 = class352.field5071.method505((byte) -119) == 1;
            String var168 = class352.field5071.method479((byte) -5);
            String var169 = var168;
            if (var167) {
                var169 = class352.field5071.method479((byte) -60);
            }
            long var170 = (long) class352.field5071.method482(-772591672);
            long var172 = (long) class352.field5071.method476((byte) -65);
            int var174 = class352.field5071.method505((byte) -119);
            int var175 = class352.field5071.method482(-772591672);
            long var176 = (var170 << 32) + var172;
            boolean var178 = false;
            int var179 = 0;
            while (true) {
                if (var179 >= 100) {
                    if (var174 <= 1 && class113.method728(var169, true)) {
                        var178 = true;
                    }
                    break;
                }
                if (class204.field2697[var179] == var176) {
                    var178 = true;
                    break;
                }
                var179++;
            }
            if (!var178 && class158.field2218 == 0) {
                class204.field2697[class8.field83] = var176;
                class8.field83 = (class8.field83 + 1) % 100;
                String var180 = class145.field2038.method1107(true, var175).method1199(class352.field5071, (byte) -125);
                if (var174 == 2) {
                    class192.method1196("<img=1>" + var169, 18, 0, 99, var175, var180, "<img=1>" + var168, var168, null);
                } else if (var174 == 1) {
                    class192.method1196("<img=0>" + var169, 18, 0, 99, var175, var180, "<img=0>" + var168, var168, null);
                } else {
                    class192.method1196(var169, 18, 0, 99, var175, var180, var168, var168, null);
                }
            }
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class15.field146) {
            class538.field7448 = class352.field5071.method504((byte) 112) << 3;
            class121.field1602 = class352.field5071.method452(1475501192) << 3;
            class499.field6972 = class352.field5071.method505((byte) -119);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class347.field4930) {
            int var181 = class352.field5071.method474(11212);
            int var182 = class352.field5071.method474(11212);
            int var183 = class352.field5071.method474(11212);
            int var184 = class352.field5071.method474(11212);
            int var185 = class352.field5071.method482(-772591672) << 2;
            class623.method3515(-24);
            class243.method1632(true, var181, -63, var185, var182, var184, var183);
            class400.field5735 = null;
            return true;
        } else if (class99.field1377 == class400.field5735) {
            int var186 = class352.field5071.method494((byte) -79);
            int var187 = class352.field5071.method469(-4040);
            class623.method3515(-24);
            class416.method2589((byte) 90, var186, var187);
            class400.field5735 = null;
            return true;
        } else if (class472.field6540 == class400.field5735) {
            class11.method50(7, class555.field7739);
            class400.field5735 = null;
            return true;
        } else if (class652.field8735 == class400.field5735) {
            int var188 = class352.field5071.method500((byte) -107);
            class623.method3515(-24);
            class431.method2666(-1, var188);
            class400.field5735 = null;
            return true;
        } else if (class594.field8072 == class400.field5735) {
            class600.field8129 = class47.method334(class352.field5071.method505((byte) -119), (byte) -58);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class152.field2095) {
            class728.field10131 = class352.field5071.method505((byte) -119);
            class400.field5735 = null;
            return true;
        } else if (class553.field7712 == class400.field5735) {
            int var189 = class352.field5071.method483(-30458);
            int var190 = class352.field5071.method506(-90);
            int var191 = class352.field5071.method466(78);
            int var192 = class352.field5071.method466(124);
            int var193 = class352.field5071.method506(-111);
            int var194 = class352.field5071.method482(-772591672);
            int var195 = var192 & 0x7;
            int var196 = (var192 & 0x7F) >> 3;
            if (var196 == 15) {
                var196 = -1;
            }
            if (var189 >> 30 != 0) {
                int var197 = (var189 & 0x3C16A048) >> 28;
                int var198 = (var189 >> 14 & 0x3FFF) - class113.field1509;
                int var199 = (var189 & 0x3FFF) - class587.field7995;
                if (var198 >= 0 && var199 >= 0 && class277.field4036 > var198 && var199 < class667.field9202) {
                    int var200 = var198 * 512 + 256;
                    int var201 = var199 * 512 + 256;
                    int var202 = var197;
                    if (var197 < 3 && class479.method2918(var199, true, var198)) {
                        var202 = var197 + 1;
                    }
                    class711 var203 = new class711(var190, var194, class483.field6741, var197, var202, var200, class737.method4102((byte) 19, var200, var201, var197) - var193, var201, var198, var198, var199, var199, var195);
                    class76.field1112.method3610(9289, new class379(var203));
                }
            } else if ((var189 >> 29) != 0) {
                int var204 = var189 & 0xFFFF;
                class234 var205 = (class234) class372.field5245.method812(124, (long) var204);
                if (var205 != null) {
                    class679 var206 = var205.field3471;
                    class530 var207 = var206.field7190[var191];
                    if (var190 == 65535) {
                        var190 = -1;
                    }
                    boolean var208 = true;
                    int var209 = var207.field7339;
                    if (var190 != -1 && var209 != -1) {
                        if (var190 == var209) {
                            class46 var214 = class129.field1776.method4073(-7428, var190);
                            if (var214.field592 && var214.field596 != -1) {
                                class57 var215 = class607.field8188.method3001(-12575, var214.field596);
                                int var216 = var215.field818;
                                if (var216 == 0 || var216 == 2) {
                                    var208 = false;
                                } else if (var216 == 1) {
                                    var208 = true;
                                }
                            }
                        } else {
                            class46 var210 = class129.field1776.method4073(-7428, var190);
                            class46 var211 = class129.field1776.method4073(-7428, var209);
                            if (var210.field596 != -1 && var211.field596 != -1) {
                                class57 var212 = class607.field8188.method3001(-12575, var210.field596);
                                class57 var213 = class607.field8188.method3001(-12575, var211.field596);
                                if (var212.field815 < var213.field815) {
                                    var208 = false;
                                }
                            }
                        }
                    }
                    if (var208) {
                        var207.field7351 = var195;
                        var207.field7341 = var193;
                        var207.field7346 = var196;
                        var207.field7348 = 0;
                        var207.field7349 = class483.field6741 + var194;
                        var207.field7347 = 1;
                        var207.field7342 = 0;
                        var207.field7339 = var190;
                        if (class483.field6741 < var207.field7349) {
                            var207.field7342 = -1;
                        }
                        if (var207.field7339 == 65535) {
                            var207.field7339 = -1;
                        }
                        if (var207.field7339 != -1 && class483.field6741 == var207.field7349) {
                            int var217 = class129.field1776.method4073(-7428, var207.field7339).field596;
                            if (var217 != -1) {
                                class57 var218 = class607.field8188.method3001(-12575, var217);
                                if (var218 != null && var218.field821 != null && !var206.field7134) {
                                    class123.method765(0, var206, var218, false);
                                }
                            }
                        }
                    }
                }
            } else if (var189 >> 28 != 0) {
                int var219 = var189 & 0xFFFF;
                class96 var220;
                if (class145.field2037 == var219) {
                    var220 = class388.field5601;
                } else {
                    var220 = class251.field3675[var219];
                }
                if (var220 != null) {
                    if (var190 == 65535) {
                        var190 = -1;
                    }
                    class530 var221 = var220.field7190[var191];
                    boolean var222 = true;
                    int var223 = var221.field7339;
                    if (var190 != -1 && var223 != -1) {
                        if (var190 == var223) {
                            class46 var224 = class129.field1776.method4073(-7428, var190);
                            if (var224.field592 && var224.field596 != -1) {
                                class57 var225 = class607.field8188.method3001(-12575, var224.field596);
                                int var226 = var225.field818;
                                if (var226 == 0 || var226 == 2) {
                                    var222 = false;
                                } else if (var226 == 1) {
                                    var222 = true;
                                }
                            }
                        } else {
                            class46 var227 = class129.field1776.method4073(-7428, var190);
                            class46 var228 = class129.field1776.method4073(-7428, var223);
                            if (var227.field596 != -1 && var228.field596 != -1) {
                                class57 var229 = class607.field8188.method3001(-12575, var227.field596);
                                class57 var230 = class607.field8188.method3001(-12575, var228.field596);
                                if (var229.field815 < var230.field815) {
                                    var222 = false;
                                }
                            }
                        }
                    }
                    if (var222) {
                        var221.field7349 = class483.field6741 + var194;
                        var221.field7351 = var195;
                        var221.field7342 = 0;
                        var221.field7347 = 1;
                        var221.field7339 = var190;
                        var221.field7346 = var196;
                        var221.field7348 = 0;
                        var221.field7341 = var193;
                        if (class483.field6741 < var221.field7349) {
                            var221.field7342 = -1;
                        }
                        if (var221.field7339 == 65535) {
                            var221.field7339 = -1;
                        }
                        if (var221.field7339 != -1 && class483.field6741 == var221.field7349) {
                            int var231 = class129.field1776.method4073(-7428, var221.field7339).field596;
                            if (var231 != -1) {
                                class57 var232 = class607.field8188.method3001(-12575, var231);
                                if (var232 != null && var232.field821 != null && !var220.field7134) {
                                    class123.method765(0, var220, var232, false);
                                }
                            }
                        }
                    }
                }
            }
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class175.field2403) {
            int var233 = class352.field5071.method469(-4040);
            String var234 = class352.field5071.method479((byte) -123);
            class623.method3515(-24);
            class22.method126(var233, var234, (byte) 77);
            class400.field5735 = null;
            return true;
        } else if (class711.field9928 == class400.field5735) {
            class11.method50(7, class282.field4089);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class156.field2188) {
            class471.method2865((byte) 109, class352.field5071.method479((byte) -67));
            class400.field5735 = null;
            return true;
        } else if (class478.field6646 == class400.field5735) {
            boolean var235 = class352.field5071.method505((byte) -119) == 1;
            String var236 = class352.field5071.method479((byte) -53);
            String var237 = var236;
            if (var235) {
                var237 = class352.field5071.method479((byte) -121);
            }
            long var238 = (long) class352.field5071.method482(-772591672);
            long var240 = (long) class352.field5071.method476((byte) -7);
            int var242 = class352.field5071.method505((byte) -119);
            long var243 = (var238 << 32) + var240;
            boolean var245 = false;
            int var246 = 0;
            while (true) {
                if (var246 >= 100) {
                    if (var242 <= 1) {
                        if (!(!class214.field2807 || class571.field7897) || class464.field6463) {
                            var245 = true;
                        } else if (class113.method728(var237, true)) {
                            var245 = true;
                        }
                    }
                    break;
                }
                if (class204.field2697[var246] == var243) {
                    var245 = true;
                    break;
                }
                var246++;
            }
            if (!var245 && class158.field2218 == 0) {
                class204.field2697[class8.field83] = var243;
                class8.field83 = (class8.field83 + 1) % 100;
                String var247 = class572.method3354(class697.method3933(class352.field5071, 268423370), -61);
                if (var242 == 2) {
                    class192.method1196("<img=1>" + var237, 7, 0, 99, -1, var247, "<img=1>" + var236, var236, null);
                } else if (var242 == 1) {
                    class192.method1196("<img=0>" + var237, 7, 0, 99, -1, var247, "<img=0>" + var236, var236, null);
                } else {
                    class192.method1196(var237, 3, 0, 99, -1, var247, var236, var236, null);
                }
            }
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class25.field319) {
            boolean var248 = class352.field5071.method474(11212) == 1;
            class623.method3515(-24);
            class400.field5735 = null;
            class349.field4960 = var248;
            return true;
        } else if (class606.field8179 == class400.field5735) {
            int var249 = class352.field5071.method482(-772591672);
            int var250 = class352.field5071.method482(-772591672);
            int var251 = class352.field5071.method482(-772591672);
            class623.method3515(-24);
            if (class266.field3900[var249] != null) {
                for (int var252 = var250; var252 < var251; var252++) {
                    int var253 = class352.field5071.method476((byte) -113);
                    if (var252 < class266.field3900[var249].length && class266.field3900[var249][var252] != null) {
                        class266.field3900[var249][var252].field10491 = var253;
                    }
                }
            }
            class400.field5735 = null;
            return true;
        } else if (class750.field10310 == class400.field5735) {
            class124.field1712.method3604((byte) 70);
            class400.field5735 = null;
            class424.field5947 += 32;
            return true;
        } else if (class400.field5735 == class292.field4189) {
            class11.method50(7, class193.field2625);
            class400.field5735 = null;
            return true;
        } else if (class662.field8786 == class400.field5735) {
            String var254 = class352.field5071.method479((byte) -17);
            int var255 = class352.field5071.method498(-110);
            int var256 = class352.field5071.method482(-772591672);
            if (var256 == 65535) {
                var256 = -1;
            }
            int var257 = class352.field5071.method466(94);
            if (var255 >= 1 && var255 <= 8) {
                if (var254.equalsIgnoreCase("null")) {
                    var254 = null;
                }
                class414.field5868[var255 - 1] = var254;
                class613.field8249[var255 - 1] = var256;
                class445.field6183[var255 - 1] = var257 == 0;
            }
            class400.field5735 = null;
            return true;
        } else if (class675.field9368 == class400.field5735) {
            boolean var258 = class352.field5071.method505((byte) -119) == 1;
            String var259 = class352.field5071.method479((byte) -116);
            String var260 = var259;
            if (var258) {
                var260 = class352.field5071.method479((byte) -116);
            }
            long var261 = class352.field5071.method475(880459872);
            long var263 = (long) class352.field5071.method482(-772591672);
            long var265 = (long) class352.field5071.method476((byte) 124);
            int var267 = class352.field5071.method505((byte) -119);
            int var268 = class352.field5071.method482(-772591672);
            long var269 = (var263 << 32) + var265;
            boolean var271 = false;
            int var272 = 0;
            while (true) {
                if (var272 >= 100) {
                    if (var267 <= 1 && class113.method728(var260, true)) {
                        var271 = true;
                    }
                    break;
                }
                if (class204.field2697[var272] == var269) {
                    var271 = true;
                    break;
                }
                var272++;
            }
            if (!var271 && class158.field2218 == 0) {
                class204.field2697[class8.field83] = var269;
                class8.field83 = (class8.field83 + 1) % 100;
                String var273 = class145.field2038.method1107(true, var268).method1199(class352.field5071, (byte) -125);
                if (var267 == 2) {
                    class192.method1196("<img=1>" + var260, 20, 0, 99, var268, var273, "<img=1>" + var259, var259, class331.method2123(0, var261));
                } else if (var267 == 1) {
                    class192.method1196("<img=0>" + var260, 20, 0, 99, var268, var273, "<img=0>" + var259, var259, class331.method2123(0, var261));
                } else {
                    class192.method1196(var260, 20, 0, 99, var268, var273, var259, var259, class331.method2123(0, var261));
                }
            }
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class339.field4804) {
            int var274 = class352.field5071.method498(-62);
            int var275 = class352.field5071.method482(-772591672) << 2;
            int var276 = class352.field5071.method498(-88);
            int var277 = class352.field5071.method498(-87);
            int var278 = class352.field5071.method474(11212);
            class623.method3515(-24);
            class200.method1216(50, var277, var274, var275, var278, var276);
            class400.field5735 = null;
            return true;
        } else if (class490.field6892 == class400.field5735) {
            int var279 = class352.field5071.method455(-90);
            byte var280 = class352.field5071.method504((byte) 54);
            class623.method3515(-24);
            class363.method2303((byte) -122, var279, var280);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class180.field2477) {
            int var281 = class352.field5071.method483(-30458);
            int var282 = class352.field5071.method500((byte) 116);
            class623.method3515(-24);
            if (var282 == 65535) {
                var282 = -1;
            }
            class338.method2147(var281, 4, 2, var282, -1);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class173.field2397) {
            boolean var283 = class352.field5071.method505((byte) -119) == 1;
            byte[] var284 = new byte[class357.field5125 - 1];
            class352.field5071.method449(0, class357.field5125 - 1, var284, (byte) -113);
            class248.method1706(var284, (byte) -49, var283);
            class400.field5735 = null;
            return true;
        } else if (class545.field7566 == class400.field5735) {
            int var285 = class352.field5071.method466(-57);
            int var286 = class352.field5071.method500((byte) 123);
            int var287 = class352.field5071.method469(-4040);
            class623.method3515(-24);
            class654 var288 = (class654) class259.field3747.method812(104, (long) var287);
            if (var288 != null) {
                class39.method217((byte) 96, var288, var288.field8745 != var286, false);
            }
            class549.method3256(var285, var286, false, (byte) 96, var287);
            class400.field5735 = null;
            return true;
        } else if (class713.field9958 == class400.field5735) {
            int var289 = class352.field5071.method474(11212);
            byte var290 = class352.field5071.method503(true);
            class623.method3515(-24);
            class171.method1097(var289, var290, (byte) -34);
            class400.field5735 = null;
            return true;
        } else if (class587.field7996 == class400.field5735) {
            int var291 = class352.field5071.method483(-30458);
            class623.method3515(-24);
            if (var291 == -1) {
                class388.field5597 = -1;
                class221.field2987 = -1;
            } else {
                int var292 = (var291 & 0xFFFCA3C) >> 14;
                int var293 = var291 & 0x3FFF;
                int var294 = var292 - class113.field1509;
                int var295 = var293 - class587.field7995;
                if (var294 < 0) {
                    var294 = 0;
                } else if (var294 >= class277.field4036) {
                    var294 = class277.field4036;
                }
                if (var295 < 0) {
                    var295 = 0;
                } else if (class667.field9202 <= var295) {
                    var295 = class667.field9202;
                }
                class388.field5597 = (var294 << 9) + 256;
                class221.field2987 = (var295 << 9) + 256;
            }
            class400.field5735 = null;
            return true;
        } else if (class697.field9740 == class400.field5735) {
            int var296 = class352.field5071.method482(-772591672);
            int var297 = class352.field5071.method505((byte) -119);
            class623.method3515(-24);
            class268.method1820((byte) -92, var296, var297, true);
            class400.field5735 = null;
            return true;
        } else if (class747.field10284 == class400.field5735) {
            int var298 = class352.field5071.method466(-53);
            int var299 = class352.field5071.method458(4);
            class623.method3515(-24);
            class712.method4005(7, var299, var298);
            class400.field5735 = null;
            return true;
        } else if (class455.field6306 == class400.field5735) {
            class134.field1911 = class352.field5071.method468(16711680);
            class214.field2807 = class352.field5071.method505((byte) -119) == 1;
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class384.field5506) {
            method2089(false, false);
            class400.field5735 = null;
            return false;
        } else if (class487.field6810 == class400.field5735) {
            class121.field1602 = class352.field5071.method503(true) << 3;
            class499.field6972 = class352.field5071.method505((byte) -119);
            class538.field7448 = class352.field5071.method491(false) << 3;
            for (class662 var300 = (class662) class541.field7521.method821((byte) 117); var300 != null; var300 = (class662) class541.field7521.method818(81)) {
                int var303 = (int) (var300.field1079 >> 28 & 0x3L);
                int var304 = (int) (var300.field1079 & 0x3FFFL);
                int var305 = var304 - class113.field1509;
                int var306 = (int) (var300.field1079 >> 14 & 0x3FFFL);
                int var307 = var306 - class587.field7995;
                if (class499.field6972 == var303 && class538.field7448 <= var305 && var305 < class538.field7448 + 8 && var307 >= class121.field1602 && (class121.field1602 + 8) > var307) {
                    var300.method549(6410);
                    if (var305 >= 0 && var307 >= 0 && class277.field4036 > var305 && class667.field9202 > var307) {
                        class464.method2844(class499.field6972, -106, var307, var305);
                    }
                }
            }
            for (class6 var301 = (class6) class755.field10409.method3618(-111); var301 != null; var301 = (class6) class755.field10409.method3619(0)) {
                if (var301.field53 >= class538.field7448 && var301.field53 < class538.field7448 + 8 && class121.field1602 <= var301.field41 && (class121.field1602 + 8) > var301.field41 && class499.field6972 == var301.field50) {
                    var301.field56 = true;
                }
            }
            for (class6 var302 = (class6) class159.field2226.method3618(120); var302 != null; var302 = (class6) class159.field2226.method3619(0)) {
                if (class538.field7448 <= var302.field53 && class538.field7448 + 8 > var302.field53 && class121.field1602 <= var302.field41 && class121.field1602 + 8 > var302.field41 && class499.field6972 == var302.field50) {
                    var302.field56 = true;
                }
            }
            class400.field5735 = null;
            return true;
        } else if (class473.field6559 == class400.field5735) {
            int var308 = class352.field5071.method458(4);
            int var309 = class352.field5071.method457(-14532);
            int var310 = class352.field5071.method455(-60);
            class623.method3515(-24);
            class338.method2147(var308, 4, 5, var310, var309);
            class400.field5735 = null;
            return true;
        } else if (class446.field6190 == class400.field5735) {
            int var311 = class352.field5071.method506(-122);
            class623.method3515(-24);
            class480.method2923(var311, 0);
            class400.field5735 = null;
            return true;
        } else if (class542.field7534 == class400.field5735) {
            int var312 = class352.field5071.method482(-772591672);
            class96 var313;
            if (class145.field2037 == var312) {
                var313 = class388.field5601;
            } else {
                var313 = class251.field3675[var312];
            }
            if (var313 == null) {
                class400.field5735 = null;
                return true;
            }
            int var314 = class352.field5071.method482(-772591672);
            int var315 = class352.field5071.method505((byte) -119);
            boolean var316 = (var314 & 0x8000) != 0;
            if (var313.field1313 != null && var313.field1366 != null) {
                boolean var317 = false;
                if (var315 <= 1) {
                    if (!var316 && (class214.field2807 && !class571.field7897 || class464.field6463)) {
                        var317 = true;
                    } else if (class113.method728(var313.field1313, true)) {
                        var317 = true;
                    }
                }
                if (!var317 && class158.field2218 == 0) {
                    int var318 = -1;
                    String var319;
                    if (var316) {
                        var314 &= 0x7FFF;
                        class493 var320 = class260.method1757(19594, class352.field5071);
                        var318 = var320.field6915;
                        var319 = var320.field6914.method1199(class352.field5071, (byte) -125);
                    } else {
                        var319 = class572.method3354(class697.method3933(class352.field5071, 268423370), -61);
                    }
                    var313.field7162 = var319.trim();
                    var313.field7110 = var314 & 0xFF;
                    var313.field7106 = var314 >> 8;
                    var313.field7124 = 150;
                    int var321;
                    if (var315 == 1 || var315 == 2) {
                        var321 = var316 ? 17 : 1;
                    } else {
                        var321 = var316 ? 17 : 2;
                    }
                    if (var315 == 2) {
                        class192.method1196("<img=1>" + var313.method658(-128, false), var321, 0, 99, var318, var319, "<img=1>" + var313.method661(true, (byte) -124), var313.field1347, null);
                    } else if (var315 == 1) {
                        class192.method1196("<img=0>" + var313.method658(72, false), var321, 0, 99, var318, var319, "<img=0>" + var313.method661(true, (byte) -96), var313.field1347, null);
                    } else {
                        class192.method1196(var313.method658(-119, false), var321, 0, 99, var318, var319, var313.method661(true, (byte) -41), var313.field1347, null);
                    }
                }
            }
            class400.field5735 = null;
            return true;
        } else if (class601.field8139 == class400.field5735) {
            int var322 = class352.field5071.method505((byte) -119);
            int var323 = var322 >> 5;
            int var324 = var322 & 0x1F;
            if (var324 == 0) {
                class653.field8740[var323] = null;
                class400.field5735 = null;
                return true;
            }
            class596 var325 = new class596();
            var325.field8081 = var324;
            var325.field8077 = class352.field5071.method505((byte) -119);
            if (var325.field8077 >= 0 && class577.field7930.length > var325.field8077) {
                if (var325.field8081 == 1 || var325.field8081 == 10) {
                    var325.field8082 = class352.field5071.method482(-772591672);
                    class352.field5071.field956 += 6;
                } else if (var325.field8081 >= 2 && var325.field8081 <= 6) {
                    if (var325.field8081 == 2) {
                        var325.field8086 = 256;
                        var325.field8080 = 256;
                    }
                    if (var325.field8081 == 3) {
                        var325.field8086 = 0;
                        var325.field8080 = 256;
                    }
                    if (var325.field8081 == 4) {
                        var325.field8086 = 512;
                        var325.field8080 = 256;
                    }
                    if (var325.field8081 == 5) {
                        var325.field8080 = 0;
                        var325.field8086 = 256;
                    }
                    if (var325.field8081 == 6) {
                        var325.field8080 = 512;
                        var325.field8086 = 256;
                    }
                    var325.field8081 = 2;
                    var325.field8090 = class352.field5071.method505((byte) -119);
                    var325.field8086 += class352.field5071.method482(-772591672) - class113.field1509 << 9;
                    var325.field8080 += class352.field5071.method482(-772591672) - class587.field7995 << 9;
                    var325.field8083 = class352.field5071.method505((byte) -119) << 2;
                    var325.field8088 = class352.field5071.method482(-772591672);
                }
                var325.field8085 = class352.field5071.method482(-772591672);
                if (var325.field8085 == 65535) {
                    var325.field8085 = -1;
                }
                class653.field8740[var323] = var325;
            }
            class400.field5735 = null;
            return true;
        } else if (class505.field7026 == class400.field5735) {
            int var326 = class352.field5071.method506(-104);
            int var327 = class352.field5071.method483(-30458);
            class623.method3515(-24);
            class214.method1264(var326, var327, 125);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class129.field1787) {
            int var328 = class352.field5071.method482(-772591672);
            if (var328 == 65535) {
                var328 = -1;
            }
            int var329 = class352.field5071.method505((byte) -119);
            int var330 = class352.field5071.method482(-772591672);
            int var331 = class352.field5071.method505((byte) -119);
            class545.method3220(var331, var328, 256, true, (byte) 85, var330, var329);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class139.field1980) {
            boolean var332 = class352.field5071.method505((byte) -119) == 1;
            String var333 = class352.field5071.method479((byte) -84);
            String var334 = var333;
            if (var332) {
                var334 = class352.field5071.method479((byte) -117);
            }
            int var335 = class352.field5071.method505((byte) -119);
            int var336 = class352.field5071.method482(-772591672);
            boolean var337 = false;
            if (var335 <= 1 && class113.method728(var334, true)) {
                var337 = true;
            }
            if (!var337 && class158.field2218 == 0) {
                String var338 = class145.field2038.method1107(true, var336).method1199(class352.field5071, (byte) -125);
                if (var335 == 2) {
                    class192.method1196("<img=1>" + var334, 25, 0, 99, var336, var338, "<img=1>" + var333, var333, null);
                } else if (var335 == 1) {
                    class192.method1196("<img=0>" + var334, 25, 0, 99, var336, var338, "<img=0>" + var333, var333, null);
                } else {
                    class192.method1196(var334, 25, 0, 99, var336, var338, var333, var333, null);
                }
            }
            class400.field5735 = null;
            return true;
        } else if (class465.field6467 == class400.field5735) {
            int var339 = class352.field5071.method505((byte) -119);
            if (class352.field5071.method505((byte) -119) == 0) {
                class109.field1467[var339] = new class252();
            } else {
                class352.field5071.field956--;
                class109.field1467[var339] = new class252(class352.field5071);
            }
            class400.field5735 = null;
            class550.field7643 = class320.field4449;
            return true;
        } else if (class400.field5735 == class38.field477) {
            class121.field1602 = class352.field5071.method491(false) << 3;
            class499.field6972 = class352.field5071.method498(-85);
            class538.field7448 = class352.field5071.method503(true) << 3;
            while (class357.field5125 > class352.field5071.field956) {
                class508 var340 = class729.method4066(-17469)[class352.field5071.method505((byte) -119)];
                class11.method50(7, var340);
            }
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class339.field4805) {
            class505.field7023 = class352.field5071.method496(-77);
            class526.field7303 = class320.field4449;
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class184.field2526) {
            class445.field6186 = class352.field5071.method491(false);
            class400.field5735 = null;
            if (class445.field6186 == 0 || class445.field6186 == 1) {
                class142.field2018 = true;
            }
            return true;
        } else if (class571.field7880 == class400.field5735) {
            class195.field2631 = class352.field5071.method505((byte) -119);
            class526.field7303 = class320.field4449;
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class216.field2813) {
            boolean var341 = class352.field5071.method505((byte) -119) == 1;
            String var342 = class352.field5071.method479((byte) -29);
            String var343 = var342;
            if (var341) {
                var343 = class352.field5071.method479((byte) -4);
            }
            int var344 = class352.field5071.method505((byte) -119);
            boolean var345 = false;
            if (var344 <= 1) {
                if (!(!class214.field2807 || class571.field7897) || class464.field6463) {
                    var345 = true;
                } else if (var344 <= 1 && class113.method728(var343, true)) {
                    var345 = true;
                }
            }
            if (!var345 && class158.field2218 == 0) {
                String var346 = class572.method3354(class697.method3933(class352.field5071, 268423370), -61);
                if (var344 == 2) {
                    class192.method1196("<img=1>" + var343, 24, 0, 99, -1, var346, "<img=1>" + var342, var342, null);
                } else if (var344 == 1) {
                    class192.method1196("<img=0>" + var343, 24, 0, 99, -1, var346, "<img=0>" + var342, var342, null);
                } else {
                    class192.method1196(var343, 24, 0, 99, -1, var346, var342, var342, null);
                }
            }
            class400.field5735 = null;
            return true;
        } else if (class720.field10019 == class400.field5735) {
            int var347 = class352.field5071.method505((byte) -119);
            int var348 = class352.field5071.method505((byte) -119);
            if (var348 == 255) {
                var348 = -1;
                var347 = -1;
            }
            class694.method3916(var347, 16383, var348);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class144.field2028) {
            class11.method50(7, class596.field8091);
            class400.field5735 = null;
            return true;
        } else if (class691.field9616 == class400.field5735) {
            String var349 = class352.field5071.method479((byte) -45);
            Object[] var350 = new Object[var349.length() + 1];
            for (int var351 = var349.length() - 1; var351 >= 0; var351--) {
                if (var349.charAt(var351) == 's') {
                    var350[var351 + 1] = class352.field5071.method479((byte) -42);
                } else {
                    var350[var351 + 1] = Integer.valueOf(class352.field5071.method457(-14532));
                }
            }
            var350[0] = Integer.valueOf(class352.field5071.method457(-14532));
            class623.method3515(-24);
            class142 var352 = new class142();
            var352.field2024 = var350;
            class546.method3233(var352);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class105.field1432) {
            if (class178.field2452 != null) {
                class372.method2330(-1, class332.field4707.field4801.method2799(0), -1, false, 3);
            }
            byte[] var353 = new byte[class357.field5125];
            class352.field5071.method2566(var353, 0, 1277595144, class357.field5125);
            String var354 = class62.method438(class357.field5125, var353, 0, (byte) 73);
            class610.method3462(class332.field4707.field4789.method963(0) == 1, true, var354, (byte) -92, class159.field2227);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class220.field2974) {
            int var355 = class352.field5071.method457(-14532);
            int var356 = class352.field5071.method458(4);
            class623.method3515(-24);
            class654 var357 = (class654) class259.field3747.method812(114, (long) var355);
            class654 var358 = (class654) class259.field3747.method812(111, (long) var356);
            if (var358 != null) {
                class39.method217((byte) 103, var358, var357 == null || var357.field8745 != var358.field8745, false);
            }
            if (var357 != null) {
                var357.method549(6410);
                class259.field3747.method820((long) var356, (byte) -42, var357);
            }
            class755 var359 = class189.method1182(var355, (byte) -101);
            if (var359 != null) {
                class27.method159((byte) -105, var359);
            }
            class755 var360 = class189.method1182(var356, (byte) -101);
            if (var360 != null) {
                class27.method159((byte) -105, var360);
                class194.method1202(105, true, var360);
            }
            if (class544.field7545 != -1) {
                class667.method3767(class544.field7545, 1, 4626);
            }
            class400.field5735 = null;
            return true;
        } else if (class84.field1201 == class400.field5735) {
            class11.method50(7, class507.field7044);
            class400.field5735 = null;
            return true;
        } else if (class400.field5735 == class345.field4908) {
            byte var361 = class352.field5071.method452(1475501192);
            int var362 = class352.field5071.method455(-78);
            class124.field1712.method3603(var362, var361, false);
            class400.field5735 = null;
            return true;
        } else if (class54.field782 == class400.field5735) {
            int var363 = class352.field5071.method506(-119);
            int var364 = class352.field5071.method506(-96);
            int var365 = class352.field5071.method469(-4040);
            int var366 = class352.field5071.method455(-58);
            class623.method3515(-24);
            class338.method2147(var365, 4, 7, var366 | var364 << 16, var363);
            class400.field5735 = null;
            return true;
        } else {
            int var367 = 46 % ((arg0 + 52) / 44);
            if (class400.field5735 == class367.field5204) {
                int var368 = class352.field5071.method494((byte) -79);
                int var369 = class352.field5071.method471((byte) -55);
                int var370 = class352.field5071.method469(-4040);
                class623.method3515(-24);
                class552.method3269(var369, var368, -1, var370);
                class400.field5735 = null;
                return true;
            } else if (class400.field5735 == class332.field4705) {
                int var371 = class352.field5071.method483(-30458);
                int var372 = class352.field5071.method455(-51);
                class623.method3515(-24);
                class345.method2206(var372, -108, var371);
                class400.field5735 = null;
                return true;
            } else if (class610.field8216 == class400.field5735) {
                class243.field3617 = class320.field4449;
                if (class357.field5125 == 0) {
                    class513.field7088 = null;
                    class13.field126 = null;
                    class623.field8402 = null;
                    class400.field5735 = null;
                    class691.field9619 = 0;
                    return true;
                }
                class513.field7088 = class352.field5071.method479((byte) -47);
                boolean var373 = class352.field5071.method505((byte) -119) == 1;
                if (var373) {
                    class352.field5071.method479((byte) -46);
                }
                long var374 = class352.field5071.method475(880459872);
                class13.field126 = class312.method2046(37, var374);
                class723.field10043 = class352.field5071.method491(false);
                int var376 = class352.field5071.method505((byte) -119);
                if (var376 == 255) {
                    class400.field5735 = null;
                    return true;
                }
                class691.field9619 = var376;
                class249[] var377 = new class249[100];
                for (int var378 = 0; var378 < class691.field9619; var378++) {
                    var377[var378] = new class249();
                    var377[var378].field3654 = class352.field5071.method479((byte) -118);
                    boolean var384 = class352.field5071.method505((byte) -119) == 1;
                    if (var384) {
                        var377[var378].field3655 = class352.field5071.method479((byte) -52);
                    } else {
                        var377[var378].field3655 = var377[var378].field3654;
                    }
                    var377[var378].field3652 = class673.method3805(1, var377[var378].field3655);
                    var377[var378].field3657 = class352.field5071.method482(-772591672);
                    var377[var378].field3658 = class352.field5071.method491(false);
                    var377[var378].field3656 = class352.field5071.method479((byte) -28);
                    if (var377[var378].field3655.equals(class388.field5601.field1313)) {
                        class62.field894 = var377[var378].field3658;
                    }
                }
                boolean var379 = false;
                int var380 = class691.field9619;
                while (var380 > 0) {
                    var380--;
                    boolean var381 = true;
                    for (int var382 = 0; var382 < var380; var382++) {
                        if (var377[var382].field3652.compareTo(var377[var382 + 1].field3652) > 0) {
                            class249 var383 = var377[var382];
                            var377[var382] = var377[var382 + 1];
                            var377[var382 + 1] = var383;
                            var381 = false;
                        }
                    }
                    if (var381) {
                        break;
                    }
                }
                class400.field5735 = null;
                class623.field8402 = var377;
                return true;
            } else if (class400.field5735 == class275.field3983) {
                class11.method50(7, class563.field7815);
                class400.field5735 = null;
                return true;
            } else if (class400.field5735 == class319.field4429) {
                int var385 = class352.field5071.method505((byte) -119);
                boolean var386 = (var385 & 0x1) == 1;
                String var387 = class352.field5071.method479((byte) -24);
                String var388 = class352.field5071.method479((byte) -88);
                if (var388.equals("")) {
                    var388 = var387;
                }
                String var389 = class352.field5071.method479((byte) -127);
                String var390 = class352.field5071.method479((byte) -42);
                if (var390.equals("")) {
                    var390 = var389;
                }
                if (var386) {
                    for (int var391 = 0; var391 < class97.field1370; var391++) {
                        if (class532.field7393[var391].equals(var390)) {
                            class438.field6108[var391] = var387;
                            class532.field7393[var391] = var388;
                            class747.field10288[var391] = var389;
                            class557.field7749[var391] = var390;
                            break;
                        }
                    }
                } else {
                    class438.field6108[class97.field1370] = var387;
                    class532.field7393[class97.field1370] = var388;
                    class747.field10288[class97.field1370] = var389;
                    class557.field7749[class97.field1370] = var390;
                    class315.field4362[class97.field1370] = class665.method3759(2, var385) == 2;
                    class97.field1370++;
                }
                class557.field7747 = class320.field4449;
                class400.field5735 = null;
                return true;
            } else if (class65.field1011 == class400.field5735) {
                int var392 = class352.field5071.method466(-93);
                int var393 = class352.field5071.method482(-772591672);
                if (var393 == 65535) {
                    var393 = -1;
                }
                int var394 = class352.field5071.method498(-54);
                class301.method1982(var393, var392, 0, var394);
                class400.field5735 = null;
                return true;
            } else if (class436.field6090 == class400.field5735) {
                int var395 = class352.field5071.method500((byte) -2);
                if (var395 == 65535) {
                    var395 = -1;
                }
                int var396 = class352.field5071.method485(-1);
                int var397 = class352.field5071.method505((byte) -119);
                class302.method1992(var396, var397, -1, var395);
                class400.field5735 = null;
                return true;
            } else if (class400.field5735 == class210.field2747) {
                String var398 = class352.field5071.method479((byte) -80);
                int var399 = class352.field5071.method482(-772591672);
                String var400 = class145.field2038.method1107(true, var399).method1199(class352.field5071, (byte) -125);
                class192.method1196(var398, 19, 0, 99, var399, var400, var398, var398, null);
                class400.field5735 = null;
                return true;
            } else if (class748.field10297 == class400.field5735) {
                int var401 = class352.field5071.method457(-14532);
                class596.field8095 = class159.field2227.method856(3, var401);
                class400.field5735 = null;
                return true;
            } else if (class667.field9214 == class400.field5735) {
                class352.field5071.field956 += 28;
                if (class352.field5071.method490((byte) 123)) {
                    class253.method1726(24, class352.field5071.field956 - 28, class352.field5071);
                }
                class400.field5735 = null;
                return true;
            } else if (class749.field10307 == class400.field5735) {
                class11.method50(7, class612.field8231);
                class400.field5735 = null;
                return true;
            } else if (class400.field5735 == class236.field3495) {
                int var402 = class352.field5071.method498(-62);
                int var403 = class352.field5071.method498(-46);
                int var404 = class352.field5071.method505((byte) -119);
                int var405 = class352.field5071.method505((byte) -119);
                int var406 = class352.field5071.method506(-100);
                class623.method3515(-24);
                class396.field5692[var403] = true;
                class559.field7784[var403] = var402;
                class548.field7627[var403] = var405;
                class134.field1905[var403] = var404;
                class257.field3726[var403] = var406;
                class400.field5735 = null;
                return true;
            } else if (class400.field5735 == class312.field4330) {
                String var407 = class352.field5071.method479((byte) -50);
                int var408 = class352.field5071.method506(-91);
                class623.method3515(-24);
                class319.method2062(var407, 26188, var408);
                class400.field5735 = null;
                return true;
            } else {
                class31.method172(null, "T1 - " + (class400.field5735 == null ? -1 : class400.field5735.method3433(-1)) + "," + (class113.field1523 == null ? -1 : class113.field1523.method3433(-1)) + "," + (class600.field8121 == null ? -1 : class600.field8121.method3433(-1)) + " - " + class357.field5125, 0);
                method2089(false, false);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BLdc;)V", line = 3247)
    public final void method2088(byte arg0, class63 arg1) {
        if (arg0 >= -85) {
            this.field4515 = -109;
        }
        while (true) {
            int var3 = arg1.method505((byte) -119);
            if (var3 == 0) {
                field4519++;
                return;
            }
            this.method2090(120, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZZ)V", line = 3267)
    public static final void method2089(boolean arg0, boolean arg1) {
        field4523++;
        if (class713.field9960 != null) {
            class713.field9960.method2226((byte) 69);
            class713.field9960 = null;
        }
        class538.field7453 = 0;
        class4.method20(0);
        class612.method3471();
        for (int var2 = 0; var2 < 4; var2++) {
            class209.field2735[var2].method1354((byte) 75);
        }
        class507.method3048(false, 64);
        System.gc();
        class721.method4040(2, (byte) -31);
        class350.field4966 = arg1;
        class61.field883 = -1;
        class512.method3059(-1);
        class680.method3836(true, false);
        class338.field4749 = 0;
        class113.field1509 = 0;
        class587.field7995 = 0;
        class48.field727 = 0;
        class119.field1570 = 0;
        class81.field1170 = 0;
        for (int var3 = 0; var3 < class653.field8740.length; var3++) {
            class653.field8740[var3] = null;
        }
        class72.method558(30373);
        for (int var4 = 0; var4 < 2048; var4++) {
            class251.field3675[var4] = null;
        }
        class262.field3837 = 0;
        class372.field5245.method819(23738);
        class445.field6185 = 0;
        class541.field7521.method819(23738);
        class634.method3555(17220);
        class728.field10110 = 0;
        class124.field1712.method3604((byte) 47);
        class273.method1835((byte) 33);
        class24.method139(85);
        class60.field874 = 0L;
        class726.field10075 = null;
        if (arg0) {
            class647.method3624(12, true);
            return;
        }
        class647.method3624(3, true);
        try {
            class69.method540("loggedout", class320.field4445, -123);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILdc;I)V", line = 3342)
    private final void method2090(int arg0, class63 arg1, int arg2) {
        if (arg2 == 1) {
            this.field4521 = arg1.method482(-772591672);
            this.field4522 = arg1.method505((byte) -119);
            this.field4515 = arg1.method505((byte) -119);
        }
        int var4 = -93 / ((45 - arg0) / 52);
        field4513++;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZIILvi;Lvi;ZI)I", line = 3368)
    public static final int method2091(boolean arg0, int arg1, int arg2, class370 arg3, class370 arg4, boolean arg5, int arg6) {
        field4518++;
        int var7 = class348.method2225(arg5, arg3, arg4, 36, arg1);
        if (arg6 != var7) {
            return arg5 ? -var7 : var7;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var8 = class348.method2225(arg0, arg3, arg4, 4, arg2);
            return arg0 ? -var8 : var8;
        }
    }
}
