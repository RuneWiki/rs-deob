import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class262 extends class329 {

    @OriginalMember(owner = "client!hda", name = "k", descriptor = "I")
    public int field3229;

    @OriginalMember(owner = "client!hda", name = "m", descriptor = "Lbaa;")
    public static class593 field3231 = new class593(13, 0, 1, 0);

    @OriginalMember(owner = "client!hda", name = "n", descriptor = "[I")
    public static int[] field3232 = new int[4];

    @OriginalMember(owner = "client!hda", name = "l", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!hda", name = "o", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)Z", line = 3)
    public static final boolean method1517(int arg0) throws IOException {
        field3230++;
        if (class446.field5686 == null) {
            return false;
        }
        if (class11.field192 == null) {
            if (class592.field8317) {
                if (!class446.field5686.method1232(1, (byte) 115)) {
                    return false;
                }
                class446.field5686.method1228((byte) 120, 0, class298.field3671.field8804, 1);
                class325.field4172 = 0;
                class334.field4255++;
                class592.field8317 = false;
            }
            class298.field3671.field8812 = 0;
            if (class298.field3671.method204((byte) 17)) {
                if (!class446.field5686.method1232(1, (byte) 115)) {
                    return false;
                }
                class446.field5686.method1228((byte) 72, 1, class298.field3671.field8804, 1);
                class325.field4172 = 0;
                class334.field4255++;
            }
            class592.field8317 = true;
            class453[] var1 = class385.method2075((byte) -117);
            int var2 = class298.field3671.method199(false);
            if (var2 < 0 || var2 >= var1.length) {
                throw new IOException("invo:" + var2 + " ip:" + class298.field3671.field8812);
            }
            class11.field192 = var1[var2];
            class8.field162 = class11.field192.field5804;
        }
        if (class8.field162 == -1) {
            if (!class446.field5686.method1232(1, (byte) 113)) {
                return false;
            }
            class446.field5686.method1228((byte) 92, 0, class298.field3671.field8804, 1);
            class325.field4172 = 0;
            class8.field162 = class298.field3671.field8804[0] & 0xFF;
            class334.field4255++;
        }
        if (class8.field162 == -2) {
            if (!class446.field5686.method1232(2, (byte) -108)) {
                return false;
            }
            class446.field5686.method1228((byte) 113, 0, class298.field3671.field8804, 2);
            class298.field3671.field8812 = 0;
            class8.field162 = class298.field3671.method3470(13111);
            class334.field4255 += 2;
            class325.field4172 = 0;
        }
        if (class8.field162 > 0) {
            if (!class446.field5686.method1232(class8.field162, (byte) 114)) {
                return false;
            }
            class298.field3671.field8812 = 0;
            class446.field5686.method1228((byte) 94, 0, class298.field3671.field8804, class8.field162);
            class325.field4172 = 0;
            class334.field4255 += class8.field162;
        }
        class533.field7187 = class71.field965;
        class71.field965 = class221.field2713;
        class221.field2713 = class11.field192;
        if (class494.field6534 == class11.field192) {
            class346.field4436 = class298.field3671.method3510(41);
            class16.field266 = class450.field5767;
            class11.field192 = null;
            return true;
        } else if (class429.field5379 == class11.field192) {
            class413.method2189((byte) 33, false);
            class11.field192 = null;
            return false;
        } else if (class465.field5922 == class11.field192) {
            int var3 = class298.field3671.method3467((byte) -80);
            int var4 = class298.field3671.method3501(-9268);
            int var5 = class298.field3671.method3482(true);
            int var6 = class298.field3671.method3482(true);
            int var7 = class298.field3671.method3483(104);
            boolean var8 = (var4 & 0x80) != 0;
            if ((var7 >> 30) != 0) {
                int var40 = (var7 & 0x3BCF0558) >> 28;
                int var41 = (var7 >> 14 & 0x3FFF) - class145.field1879;
                int var42 = (var7 & 0x3FFF) - class630.field8817;
                if (var41 >= 0 && var42 >= 0 && class431.field5395 > var41 && class452.field5802 > var42) {
                    int var43 = var41 * 512 + 256;
                    int var44 = var42 * 512 + 256;
                    int var45 = var40;
                    if (var40 < 3 && class3.method22(var42, var41, 5706)) {
                        var45 = var40 + 1;
                    }
                    class622 var46 = new class622(var3, 0, class133.field1735, var40, var45, var43, class467.method2469(var43, var40, -20214, var44) - var6, var44, var41, var41, var42, var42, var4 & 0x7);
                    class310.field3952.method239(new class122(var46), (byte) 93);
                }
            } else if (var7 >> 29 != 0) {
                int var24 = var7 & 0xFFFF;
                class206 var25 = (class206) class180.field2318.method399(-32748, (long) var24);
                if (var25 != null) {
                    if (var3 == 65535) {
                        var3 = -1;
                    }
                    class307 var26 = var25.field2618;
                    boolean var27 = true;
                    int var28 = var8 ? var26.field9669 : var26.field9687;
                    if (var3 != -1 && var28 != -1) {
                        if (var3 == var28) {
                            class388 var33 = class370.field4686.method3943((byte) 12, var3);
                            if (var33.field4876 && var33.field4895 != -1) {
                                class395 var34 = class583.field8149.method1844(64, var33.field4895);
                                int var35 = var34.field4970;
                                if (var35 == 0 || var35 == 2) {
                                    var27 = false;
                                } else if (var35 == 1) {
                                    var27 = true;
                                }
                            }
                        } else {
                            class388 var29 = class370.field4686.method3943((byte) 12, var3);
                            class388 var30 = class370.field4686.method3943((byte) 12, var28);
                            if (var29.field4895 != -1 && var30.field4895 != -1) {
                                class395 var31 = class583.field8149.method1844(64, var29.field4895);
                                class395 var32 = class583.field8149.method1844(64, var30.field4895);
                                if (var31.field4983 < var32.field4983) {
                                    var27 = false;
                                }
                            }
                        }
                    }
                    if (var27) {
                        if (var8) {
                            var26.field9677 = 0;
                            var26.field9652 = var6;
                            var26.field9657 = class133.field1735 + var5;
                            var26.field9718 = var4 & 0x7;
                            var26.field9669 = var3;
                            var26.field9732 = 0;
                            var26.field9654 = 1;
                            if (var26.field9657 > class133.field1735) {
                                var26.field9677 = -1;
                            }
                            if (var26.field9669 != -1 && class133.field1735 == var26.field9657) {
                                int var36 = class370.field4686.method3943((byte) 12, var26.field9669).field4895;
                                if (var36 != -1) {
                                    class395 var37 = class583.field8149.method1844(64, var36);
                                    if (var37 != null && var37.field4979 != null) {
                                        class192.method1159(var26.field6470, var37, var26.field6461, var26.field6464, 117, 0, false);
                                    }
                                }
                            }
                        } else {
                            var26.field9727 = 0;
                            var26.field9666 = var4 & 0x7;
                            var26.field9706 = var6;
                            var26.field9687 = var3;
                            var26.field9681 = 0;
                            var26.field9705 = 1;
                            var26.field9696 = class133.field1735 + var5;
                            if (var26.field9696 > class133.field1735) {
                                var26.field9727 = -1;
                            }
                            if (var26.field9687 != -1 && class133.field1735 == var26.field9696) {
                                int var38 = class370.field4686.method3943((byte) 12, var26.field9687).field4895;
                                if (var38 != -1) {
                                    class395 var39 = class583.field8149.method1844(64, var38);
                                    if (var39 != null && var39.field4979 != null) {
                                        class192.method1159(var26.field6470, var39, var26.field6461, var26.field6464, 115, 0, false);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (var7 >> 28 != 0) {
                int var9 = var7 & 0xFFFF;
                class514 var10;
                if (class167.field2200 == var9) {
                    var10 = class376.field4748;
                } else {
                    var10 = class351.field4490[var9];
                }
                if (var10 != null) {
                    if (var3 == 65535) {
                        var3 = -1;
                    }
                    boolean var11 = true;
                    int var12 = var8 ? var10.field9669 : var10.field9687;
                    if (var3 != -1 && var12 != -1) {
                        if (var3 == var12) {
                            class388 var17 = class370.field4686.method3943((byte) 12, var3);
                            if (var17.field4876 && var17.field4895 != -1) {
                                class395 var18 = class583.field8149.method1844(64, var17.field4895);
                                int var19 = var18.field4970;
                                if (var19 == 0 || var19 == 2) {
                                    var11 = false;
                                } else if (var19 == 1) {
                                    var11 = true;
                                }
                            }
                        } else {
                            class388 var13 = class370.field4686.method3943((byte) 12, var3);
                            class388 var14 = class370.field4686.method3943((byte) 12, var12);
                            if (var13.field4895 != -1 && var14.field4895 != -1) {
                                class395 var15 = class583.field8149.method1844(arg0 + 65, var13.field4895);
                                class395 var16 = class583.field8149.method1844(64, var14.field4895);
                                if (var16.field4983 > var15.field4983) {
                                    var11 = false;
                                }
                            }
                        }
                    }
                    if (var11) {
                        if (var8) {
                            var10.field9718 = var4 & 0x7;
                            var10.field9657 = class133.field1735 + var5;
                            var10.field9677 = 0;
                            var10.field9669 = var3;
                            var10.field9654 = 1;
                            var10.field9652 = var6;
                            var10.field9732 = 0;
                            if (var10.field9657 > class133.field1735) {
                                var10.field9677 = -1;
                            }
                            if (var10.field9669 == 65535) {
                                var10.field9669 = -1;
                            }
                            if (var10.field9669 != -1 && class133.field1735 == var10.field9657) {
                                int var22 = class370.field4686.method3943((byte) 12, var10.field9669).field4895;
                                if (var22 != -1) {
                                    class395 var23 = class583.field8149.method1844(64, var22);
                                    if (var23 != null && var23.field4979 != null) {
                                        class192.method1159(var10.field6470, var23, var10.field6461, var10.field6464, 124, 0, class376.field4748 == var10);
                                    }
                                }
                            }
                        } else {
                            var10.field9681 = 0;
                            var10.field9666 = var4 & 0x7;
                            var10.field9705 = 1;
                            var10.field9687 = var3;
                            var10.field9696 = class133.field1735 + var5;
                            var10.field9706 = var6;
                            var10.field9727 = 0;
                            if (var10.field9696 > class133.field1735) {
                                var10.field9727 = -1;
                            }
                            if (var10.field9687 == 65535) {
                                var10.field9687 = -1;
                            }
                            if (var10.field9687 != -1 && class133.field1735 == var10.field9696) {
                                int var20 = class370.field4686.method3943((byte) 12, var10.field9687).field4895;
                                if (var20 != -1) {
                                    class395 var21 = class583.field8149.method1844(64, var20);
                                    if (var21 != null && var21.field4979 != null) {
                                        class192.method1159(var10.field6470, var21, var10.field6461, var10.field6464, 107, 0, class376.field4748 == var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class11.field192 = null;
            return true;
        } else if (class64.field869 == class11.field192) {
            class684.field9606.method1184(10542);
            class11.field192 = null;
            class88.field1236 += 32;
            return true;
        } else if (class551.field7665 == class11.field192) {
            class55.method352(class237.field2966, (byte) 31);
            class11.field192 = null;
            return true;
        } else if (class127.field1594 == class11.field192) {
            class297.method1653(false, (byte) -125);
            class11.field192 = null;
            return true;
        } else if (class220.field2691 == class11.field192) {
            class265.method1545((byte) 58);
            class11.field192 = null;
            return true;
        } else if (class668.field9422 == class11.field192) {
            class298.field3671.field8812 += 28;
            if (class298.field3671.method3521(arg0 ^ 0xFFFFDC21)) {
                class311.method1802(class298.field3671, true, class298.field3671.field8812 - 28);
            }
            class11.field192 = null;
            return true;
        } else if (class280.field3515 == class11.field192) {
            class55.method352(class325.field4176, (byte) 89);
            class11.field192 = null;
            return true;
        } else if (class72.field969 == class11.field192) {
            int var47 = class298.field3671.method3470(arg0 ^ 0xFFFFCCC8);
            if (class80.method467(var47, 65535)) {
                class479.method2608((byte) -110);
            }
            class11.field192 = null;
            return true;
        } else if (class52.field779 == class11.field192) {
            int var48 = class298.field3671.method3519((byte) 104);
            int var49 = class298.field3671.method3467((byte) -80);
            int var50 = class298.field3671.method3483(125);
            if (class80.method467(var48, 65535)) {
                class203.method1222(var49, 107, var50);
            }
            class11.field192 = null;
            return true;
        } else if (class582.field8132 == class11.field192) {
            int var51 = class298.field3671.method3467((byte) -80);
            int var52 = class298.field3671.method3486(-81);
            int var53 = class298.field3671.method3474(arg0 - 123);
            if (class80.method467(var51, 65535)) {
                class340 var54 = (class340) class138.field1797.method399(-32748, (long) var52);
                class340 var55 = (class340) class138.field1797.method399(-32748, (long) var53);
                if (var55 != null) {
                    class426.method2260(false, var54 == null || var54.field4392 != var55.field4392, false, var55);
                }
                if (var54 != null) {
                    var54.method1871(-64);
                    class138.field1797.method402(var54, (byte) -123, (long) var53);
                }
                class507 var56 = class156.method894(arg0 - 1018745487, var52);
                if (var56 != null) {
                    class572.method3158(var56, arg0 ^ 0xFFFFFC00);
                }
                class507 var57 = class156.method894(-1018745488, var53);
                if (var57 != null) {
                    class572.method3158(var57, arg0 + 1024);
                    class285.method1605(var57, false, true);
                }
                if (class316.field4063 != -1) {
                    class106.method603(arg0 ^ 0x6129EBBA, class316.field4063, 1);
                }
            }
            class11.field192 = null;
            return true;
        } else if (class195.field2451 == class11.field192) {
            boolean var58 = class298.field3671.method3501(-9268) == 1;
            String var59 = class298.field3671.method3500((byte) 119);
            String var60 = var59;
            if (var58) {
                var60 = class298.field3671.method3500((byte) 126);
            }
            int var61 = class298.field3671.method3501(arg0 ^ 0x2433);
            int var62 = class298.field3671.method3470(arg0 + 13112);
            boolean var63 = false;
            if (var61 <= 1 && class194.method1172(var60, -111)) {
                var63 = true;
            }
            if (!var63 && class650.field9179 == 0) {
                String var64 = class428.field5360.method3781(var62, (byte) 95).method3453(1772, class298.field3671);
                if (var61 == 2) {
                    class587.method3232(var59, var64, 25, 0, var62, "<img=1>" + var60, null, (byte) 121, "<img=1>" + var59);
                } else if (var61 == 1) {
                    class587.method3232(var59, var64, 25, 0, var62, "<img=0>" + var60, null, (byte) 101, "<img=0>" + var59);
                } else {
                    class587.method3232(var59, var64, 25, 0, var62, var60, null, (byte) 123, var59);
                }
            }
            class11.field192 = null;
            return true;
        } else if (class511.field6944 == class11.field192) {
            int var65 = class298.field3671.method3498(255);
            int var66 = class298.field3671.method3499(-118);
            int var67 = class298.field3671.method3467((byte) -80);
            if (var67 == 65535) {
                var67 = -1;
            }
            class405.method2156(var67, var66, var65, (byte) -123);
            class11.field192 = null;
            return true;
        } else if (class683.field9597 == class11.field192) {
            int var68 = class298.field3671.method3479(false);
            int var69 = class298.field3671.method3519((byte) 109);
            if (var69 == 65535) {
                var69 = -1;
            }
            int var70 = class298.field3671.method3514((byte) -18);
            class554.method3055(6567, var70, var68, var69);
            class11.field192 = null;
            return true;
        } else if (class538.field7222 == class11.field192) {
            class344.method1915(-510117917);
            class11.field192 = null;
            return false;
        } else if (class668.field9419 == class11.field192) {
            int var71 = class298.field3671.method3467((byte) -80);
            int var72 = class298.field3671.method3470(13111);
            int var73 = class298.field3671.method3470(13111);
            if (class80.method467(var73, 65535)) {
                class256.method1496(0, var72, var71, -127);
            }
            class11.field192 = null;
            return true;
        } else if (class528.field7146 == class11.field192) {
            class356.field4558 = class298.field3671.method3499(arg0 ^ 0x5A);
            class605.field8511 = class298.field3671.method3520(arg0 + 16437) << 3;
            class517.field7053 = class298.field3671.method3485((byte) -51) << 3;
            while (class298.field3671.field8812 < class8.field162) {
                class266 var74 = class204.method1234(0)[class298.field3671.method3501(-9268)];
                class55.method352(var74, (byte) 106);
            }
            class11.field192 = null;
            return true;
        } else if (class30.field430 == class11.field192) {
            int var75 = class298.field3671.method3501(-9268);
            boolean var76 = (var75 & 0x1) == 1;
            String var77 = class298.field3671.method3500((byte) 121);
            String var78 = class298.field3671.method3500((byte) 124);
            if (var78.equals("")) {
                var78 = var77;
            }
            String var79 = class298.field3671.method3500((byte) 124);
            String var80 = class298.field3671.method3500((byte) 127);
            if (var80.equals("")) {
                var80 = var79;
            }
            if (var76) {
                for (int var81 = 0; var81 < class238.field2980; var81++) {
                    if (class280.field3509[var81].equals(var80)) {
                        class680.field9564[var81] = var77;
                        class280.field3509[var81] = var78;
                        class215.field2669[var81] = var79;
                        class465.field5927[var81] = var80;
                        break;
                    }
                }
            } else {
                class680.field9564[class238.field2980] = var77;
                class280.field3509[class238.field2980] = var78;
                class215.field2669[class238.field2980] = var79;
                class465.field5927[class238.field2980] = var80;
                class670.field9442[class238.field2980] = class695.method3921(2, var75) == 2;
                class238.field2980++;
            }
            class95.field1312 = class450.field5767;
            class11.field192 = null;
            return true;
        } else if (class11.field192 == class102.field1380) {
            if (class581.method3205(-66, class504.field6675)) {
                class196.field2458 = (int) ((float) class298.field3671.method3470(arg0 ^ 0xFFFFCCC8) * 2.5F);
            } else {
                class196.field2458 = class298.field3671.method3470(arg0 ^ 0xFFFFCCC8) * 30;
            }
            class11.field192 = null;
            class16.field266 = class450.field5767;
            return true;
        } else if (class177.field2293 == class11.field192) {
            int var82 = class298.field3671.method3470(13111);
            int var83 = class298.field3671.method3501(arg0 ^ 0x2433);
            int var84 = class298.field3671.method3501(-9268);
            int var85 = class298.field3671.method3501(-9268);
            int var86 = class298.field3671.method3501(-9268);
            int var87 = class298.field3671.method3470(13111);
            if (class80.method467(var82, 65535)) {
                class451.field5788[var83] = true;
                class335.field4265[var83] = var84;
                class98.field1333[var83] = var85;
                class428.field5368[var83] = var86;
                class129.field1611[var83] = var87;
            }
            class11.field192 = null;
            return true;
        } else if (class662.field9369 == class11.field192) {
            int var88 = class298.field3671.method3498(255);
            int var89 = class298.field3671.method3499(-120);
            if (var89 == 255) {
                var88 = -1;
                var89 = -1;
            }
            class644.method3598(0, var89, var88);
            class11.field192 = null;
            return true;
        } else if (class280.field3520 == class11.field192) {
            int var90 = class298.field3671.method3470(arg0 + 13112);
            int var91 = class298.field3671.method3501(-9268);
            int var92 = class298.field3671.method3501(arg0 - 9267);
            int var93 = class298.field3671.method3470(13111) << 2;
            int var94 = class298.field3671.method3501(-9268);
            int var95 = class298.field3671.method3501(-9268);
            if (class80.method467(var90, 65535)) {
                class517.method2799((byte) 76, var94, var91, var92, var93, var95);
            }
            class11.field192 = null;
            return true;
        } else if (class174.field2261 == class11.field192) {
            class83.field1172 = class298.field3671.method3524((byte) -102);
            class242.field3012 = class298.field3671.method3501(arg0 - 9267) == 1;
            class11.field192 = null;
            return true;
        } else {
            if (arg0 != -1) {
                field3232 = null;
            }
            if (class235.field2938 == class11.field192) {
                String var96 = class298.field3671.method3500((byte) 121);
                String var97 = class447.method2388(arg0 ^ 0xFFFFB48A, class425.method2257(class298.field3671, (byte) -13));
                class1.method3(var96, var97, 6, -1, var96, 0, var96);
                class11.field192 = null;
                return true;
            } else if (class245.field3047 == class11.field192) {
                int var98 = class298.field3671.method3467((byte) -80);
                int var99 = class298.field3671.method3519((byte) 110);
                int var100 = class298.field3671.method3483(81);
                int var101 = class298.field3671.method3501(-9268);
                if (class80.method467(var99, 65535)) {
                    class340 var102 = (class340) class138.field1797.method399(-32748, (long) var100);
                    if (var102 != null) {
                        class426.method2260(false, var102.field4392 != var98, false, var102);
                    }
                    class484.method2629(false, var101, var100, (byte) 127, var98);
                }
                class11.field192 = null;
                return true;
            } else if (class344.field4420 == class11.field192) {
                int var103 = class298.field3671.method3501(arg0 ^ 0x2433);
                String var104 = class298.field3671.method3500((byte) 126);
                int var105 = class298.field3671.method3519((byte) 103);
                if (var105 == 65535) {
                    var105 = -1;
                }
                int var106 = class298.field3671.method3514((byte) -18);
                if (var103 >= 1 && var103 <= 8) {
                    if (var104.equalsIgnoreCase("null")) {
                        var104 = null;
                    }
                    class280.field3518[var103 - 1] = var104;
                    class512.field6956[var103 - 1] = var105;
                    class491.field6487[var103 - 1] = var106 == 0;
                }
                class11.field192 = null;
                return true;
            } else if (class591.field8309 == class11.field192) {
                String var107 = class298.field3671.method3500((byte) 118);
                boolean var108 = class298.field3671.method3501(-9268) == 1;
                String var109;
                if (var108) {
                    var109 = class298.field3671.method3500((byte) 127);
                } else {
                    var109 = var107;
                }
                int var110 = class298.field3671.method3470(13111);
                byte var111 = class298.field3671.method3480(-20933);
                boolean var112 = false;
                if (var111 == -128) {
                    var112 = true;
                }
                if (var112) {
                    if (class313.field4023 == 0) {
                        class11.field192 = null;
                        return true;
                    }
                    boolean var118 = false;
                    int var119;
                    for (var119 = 0; class313.field4023 > var119 && (!class516.field7046[var119].field6965.equals(var109) || class516.field7046[var119].field6971 != var110); var119++) {
                    }
                    if (class313.field4023 > var119) {
                        while ((class313.field4023 - 1) > var119) {
                            class516.field7046[var119] = class516.field7046[var119 + 1];
                            var119++;
                        }
                        class313.field4023--;
                        class516.field7046[class313.field4023] = null;
                    }
                } else {
                    String var113 = class298.field3671.method3500((byte) 127);
                    class513 var114 = new class513();
                    var114.field6965 = var109;
                    var114.field6958 = var107;
                    var114.field6959 = class158.method900(var114.field6965, true);
                    var114.field6971 = var110;
                    var114.field6961 = var113;
                    var114.field6964 = var111;
                    int var115;
                    for (var115 = class313.field4023 - 1; var115 >= 0; var115--) {
                        int var116 = class516.field7046[var115].field6959.compareTo(var114.field6959);
                        if (var116 == 0) {
                            class516.field7046[var115].field6971 = var110;
                            class516.field7046[var115].field6964 = var111;
                            class516.field7046[var115].field6961 = var113;
                            if (var109.equals(class376.field4748.field7017)) {
                                class649.field9167 = var111;
                            }
                            class403.field5060 = class450.field5767;
                            class11.field192 = null;
                            return true;
                        }
                        if (var116 < 0) {
                            break;
                        }
                    }
                    if (class313.field4023 >= class516.field7046.length) {
                        class11.field192 = null;
                        return true;
                    }
                    for (int var117 = class313.field4023 - 1; var117 > var115; var117--) {
                        class516.field7046[var117 + 1] = class516.field7046[var117];
                    }
                    if (class313.field4023 == 0) {
                        class516.field7046 = new class513[100];
                    }
                    class516.field7046[var115 + 1] = var114;
                    class313.field4023++;
                    if (var109.equals(class376.field4748.field7017)) {
                        class649.field9167 = var111;
                    }
                }
                class11.field192 = null;
                class403.field5060 = class450.field5767;
                return true;
            } else if (class551.field7681 == class11.field192) {
                int var120 = class298.field3671.method3482(true);
                int var121 = class298.field3671.method3501(-9268);
                boolean var122 = (var121 & 0x1) == 1;
                class683.method3843(52, var122, var120);
                class138.field1799[class695.method3921(31, class598.field8403++)] = var120;
                class11.field192 = null;
                return true;
            } else if (class156.field2037 == class11.field192) {
                class55.method352(class386.field4848, (byte) 44);
                class11.field192 = null;
                return true;
            } else if (class58.field817 == class11.field192) {
                class673.method3779(class298.field3671, 32767, class8.field162);
                class11.field192 = null;
                return true;
            } else if (class370.field4692 == class11.field192) {
                class55.method352(class646.field9088, (byte) 123);
                class11.field192 = null;
                return true;
            } else if (class429.field5380 == class11.field192) {
                class11.field192 = null;
                return false;
            } else if (class92.field1283 == class11.field192) {
                int var123 = class298.field3671.method3501(-9268);
                if (class298.field3671.method3501(arg0 - 9267) == 0) {
                    class507.field6863[var123] = new class611();
                } else {
                    class298.field3671.field8812--;
                    class507.field6863[var123] = new class611(class298.field3671);
                }
                class433.field5414 = class450.field5767;
                class11.field192 = null;
                return true;
            } else if (class468.field5951 == class11.field192) {
                int var124 = class298.field3671.method3467((byte) -80);
                int var125 = class298.field3671.method3463(4087);
                class684.field9606.method1181(var124, var125, -120);
                class11.field192 = null;
                return true;
            } else if (class11.field192 == class102.field1372) {
                class55.method352(class494.field6537, (byte) 115);
                class11.field192 = null;
                return true;
            } else if (class551.field7672 == class11.field192) {
                int var126 = class298.field3671.method3501(-9268);
                int var127 = var126 >> 5;
                int var128 = var126 & 0x1F;
                if (var128 == 0) {
                    class52.field784[var127] = null;
                    class11.field192 = null;
                    return true;
                }
                class651 var129 = new class651();
                var129.field9181 = var128;
                var129.field9182 = class298.field3671.method3501(-9268);
                if (var129.field9182 >= 0 && var129.field9182 < class475.field6026.length) {
                    if (var129.field9181 == 1 || var129.field9181 == 10) {
                        var129.field9185 = class298.field3671.method3470(13111);
                        class298.field3671.field8812 += 6;
                    } else if (var129.field9181 >= 2 && var129.field9181 <= 6) {
                        if (var129.field9181 == 2) {
                            var129.field9194 = 256;
                            var129.field9189 = 256;
                        }
                        if (var129.field9181 == 3) {
                            var129.field9189 = 256;
                            var129.field9194 = 0;
                        }
                        if (var129.field9181 == 4) {
                            var129.field9189 = 256;
                            var129.field9194 = 512;
                        }
                        if (var129.field9181 == 5) {
                            var129.field9194 = 256;
                            var129.field9189 = 0;
                        }
                        if (var129.field9181 == 6) {
                            var129.field9194 = 256;
                            var129.field9189 = 512;
                        }
                        var129.field9181 = 2;
                        var129.field9196 = class298.field3671.method3501(-9268);
                        var129.field9194 += class298.field3671.method3470(arg0 + 13112) - class145.field1879 << 9;
                        var129.field9189 += class298.field3671.method3470(13111) - class630.field8817 << 9;
                        var129.field9184 = class298.field3671.method3501(-9268) << 2;
                        var129.field9186 = class298.field3671.method3470(13111);
                    }
                    var129.field9188 = class298.field3671.method3470(13111);
                    if (var129.field9188 == 65535) {
                        var129.field9188 = -1;
                    }
                    class52.field784[var127] = var129;
                }
                class11.field192 = null;
                return true;
            } else if (class432.field5404 == class11.field192) {
                int var130 = class298.field3671.method3519((byte) 122);
                int var131 = class298.field3671.method3493(-49);
                int var132 = class298.field3671.method3483(90);
                if (class80.method467(var130, 65535)) {
                    class650.method3652(var131, 74, var132);
                }
                class11.field192 = null;
                return true;
            } else if (class676.field9499 == class11.field192) {
                class148.field1917 = 1;
                class11.field192 = null;
                class95.field1312 = class450.field5767;
                return true;
            } else if (class600.field8415 == class11.field192) {
                int var133 = class298.field3671.method3493(arg0 - 48);
                int var134 = class298.field3671.method3519((byte) 107);
                int var135 = class298.field3671.method3486(-91);
                int var136 = class298.field3671.method3510(arg0 + 91);
                if (class80.method467(var134, arg0 + 65536)) {
                    class259.method1509(var136, var135, var133, (byte) -111);
                }
                class11.field192 = null;
                return true;
            } else if (class266.field3380 == class11.field192) {
                int var137 = class298.field3671.method3470(13111);
                if (var137 == 65535) {
                    var137 = -1;
                }
                int var138 = class298.field3671.method3501(-9268);
                int var139 = class298.field3671.method3470(13111);
                int var140 = class298.field3671.method3501(arg0 - 9267);
                class602.method3306(var137, var138, var139, false, var140, true);
                class11.field192 = null;
                return true;
            } else if (class685.field9619 == class11.field192) {
                int var141 = class298.field3671.method3470(arg0 ^ 0xFFFFCCC8);
                int var142 = class298.field3671.method3470(13111);
                int var143 = class298.field3671.method3470(13111);
                int var144 = class298.field3671.method3470(arg0 + 13112);
                if (class80.method467(var141, arg0 ^ 0xFFFF0000) && class103.field1390[var142] != null) {
                    for (int var145 = var143; var145 < var144; var145++) {
                        int var146 = class298.field3671.method3517(-1);
                        if (class103.field1390[var142].length > var145 && class103.field1390[var142][var145] != null) {
                            class103.field1390[var142][var145].field6804 = var146;
                        }
                    }
                }
                class11.field192 = null;
                return true;
            } else if (class16.field265 == class11.field192) {
                class650.method3648(arg0 ^ 0x4E, class590.field8289, class8.field162, class298.field3671);
                class11.field192 = null;
                return true;
            } else if (class487.field6451 == class11.field192) {
                int var147 = class298.field3671.method3519((byte) 105);
                int var148 = class298.field3671.method3486(-104);
                int var149 = class298.field3671.method3470(13111);
                if (class80.method467(var149, arg0 ^ 0xFFFF0000)) {
                    class309.method1789(var147, var148, 0);
                }
                class11.field192 = null;
                return true;
            } else if (class551.field7688 == class11.field192) {
                class238.field2980 = class298.field3671.method3501(-9268);
                for (int var150 = 0; var150 < class238.field2980; var150++) {
                    class680.field9564[var150] = class298.field3671.method3500((byte) 122);
                    class280.field3509[var150] = class298.field3671.method3500((byte) 116);
                    if (class280.field3509[var150].equals("")) {
                        class280.field3509[var150] = class680.field9564[var150];
                    }
                    class215.field2669[var150] = class298.field3671.method3500((byte) 115);
                    class465.field5927[var150] = class298.field3671.method3500((byte) 119);
                    if (class465.field5927[var150].equals("")) {
                        class465.field5927[var150] = class215.field2669[var150];
                    }
                    class670.field9442[var150] = false;
                }
                class95.field1312 = class450.field5767;
                class11.field192 = null;
                return true;
            } else if (class317.field4066 == class11.field192) {
                int var151 = class298.field3671.method3467((byte) -80);
                byte var152 = class298.field3671.method3520(16436);
                int var153 = class298.field3671.method3519((byte) 114);
                if (class80.method467(var153, 65535)) {
                    class263.method1523(var151, var152, 1);
                }
                class11.field192 = null;
                return true;
            } else if (class257.field3132 == class11.field192) {
                int var154 = class298.field3671.method3483(63);
                int var155 = class298.field3671.method3482(true);
                if (class80.method467(var155, 65535)) {
                    class331.method1879(5, class167.field2200, var154, 0, 0);
                }
                class11.field192 = null;
                return true;
            } else if (class245.field3037 == class11.field192) {
                int var156 = class298.field3671.method3474(-117);
                int var157 = class298.field3671.method3519((byte) 107);
                if (var157 == 65535) {
                    var157 = -1;
                }
                int var158 = class298.field3671.method3482(true);
                if (class80.method467(var158, arg0 + 65536)) {
                    class242.method1450(true, var156, var157);
                }
                class11.field192 = null;
                return true;
            } else if (class503.field6654 == class11.field192) {
                class222.method1309(class298.field3671.method3500((byte) 122), 7628);
                class11.field192 = null;
                return true;
            } else if (class164.field2161 == class11.field192) {
                int var159 = class298.field3671.method3470(13111);
                int var160 = class298.field3671.method3482(true);
                int var161 = class298.field3671.method3486(-68);
                int var162 = class298.field3671.method3482(true);
                if (class80.method467(var160, 65535)) {
                    class504.method2712((byte) 2, var161, (var159 << 16) + var162);
                }
                class11.field192 = null;
                return true;
            } else if (class248.field3063 == class11.field192) {
                int var163 = class298.field3671.method3486(arg0 - 82);
                int var164 = class298.field3671.method3499(-128);
                int var165 = class298.field3671.method3501(-9268);
                class576.field8048[var164] = var163;
                class564.field7838[var164] = var165;
                class15.field257[var164] = 1;
                int var166 = class630.field8839[var164] - 1;
                for (int var167 = 0; var167 < var166; var167++) {
                    if (class25.field377[var167] <= var163) {
                        class15.field257[var164] = var167 + 2;
                    }
                }
                class608.field8545[class695.method3921(31, class350.field4467++)] = var164;
                class11.field192 = null;
                return true;
            } else if (class230.field2882 == class11.field192) {
                class55.method352(class400.field5009, (byte) 21);
                class11.field192 = null;
                return true;
            } else if (class476.field6041 == class11.field192) {
                int var168 = class298.field3671.method3498(255);
                int var169 = class298.field3671.method3482(true);
                class684.field9606.method1181(var169, var168, arg0 ^ 0x65);
                class11.field192 = null;
                return true;
            } else if (class378.field4787 == class11.field192) {
                int var170 = class298.field3671.method3470(arg0 + 13112);
                if (class80.method467(var170, 65535)) {
                    class205.method1236(5);
                }
                class11.field192 = null;
                return true;
            } else if (class577.field8063 == class11.field192) {
                class590.method3244(2072317608);
                class11.field192 = null;
                return false;
            } else if (class214.field2666 == class11.field192) {
                boolean var171 = class298.field3671.method3501(-9268) == 1;
                String var172 = class298.field3671.method3500((byte) 122);
                String var173 = var172;
                if (var171) {
                    var173 = class298.field3671.method3500((byte) 123);
                }
                long var174 = (long) class298.field3671.method3470(13111);
                long var176 = (long) class298.field3671.method3517(-1);
                int var178 = class298.field3671.method3501(-9268);
                int var179 = class298.field3671.method3470(13111);
                long var180 = (var174 << 32) + var176;
                boolean var182 = false;
                int var183 = 0;
                while (true) {
                    if (var183 >= 100) {
                        if (var178 <= 1 && class194.method1172(var173, -113)) {
                            var182 = true;
                        }
                        break;
                    }
                    if (class332.field4233[var183] == var180) {
                        var182 = true;
                        break;
                    }
                    var183++;
                }
                if (!var182 && class650.field9179 == 0) {
                    class332.field4233[class373.field4709] = var180;
                    class373.field4709 = (class373.field4709 + 1) % 100;
                    String var184 = class428.field5360.method3781(var179, (byte) 115).method3453(1772, class298.field3671);
                    if (var178 == 2) {
                        class587.method3232(var172, var184, 18, 0, var179, "<img=1>" + var173, null, (byte) 110, "<img=1>" + var172);
                    } else if (var178 == 1) {
                        class587.method3232(var172, var184, 18, 0, var179, "<img=0>" + var173, null, (byte) 104, "<img=0>" + var172);
                    } else {
                        class587.method3232(var172, var184, 18, 0, var179, var173, null, (byte) 100, var172);
                    }
                }
                class11.field192 = null;
                return true;
            } else if (class403.field5057 == class11.field192) {
                int var185 = class298.field3671.method3482(true);
                if (var185 == 65535) {
                    var185 = -1;
                }
                int var186 = class298.field3671.method3467((byte) -80);
                if (var186 == 65535) {
                    var186 = -1;
                }
                int var187 = class298.field3671.method3482(true);
                int var188 = class298.field3671.method3474(-123);
                int var189 = class298.field3671.method3467((byte) -80);
                if (class80.method467(var187, 65535)) {
                    for (int var190 = var185; var190 <= var186; var190++) {
                        long var191 = ((long) var188 << 32) + (long) var190;
                        class369 var193 = (class369) class39.field523.method399(-32748, var191);
                        class369 var194;
                        if (var193 != null) {
                            var194 = new class369(var193.field4678, var189);
                            var193.method1871(arg0 - 38);
                        } else if (var190 == -1) {
                            var194 = new class369(class156.method894(-1018745488, var188).field6871.field4678, var189);
                        } else {
                            var194 = new class369(0, var189);
                        }
                        class39.field523.method402(var194, (byte) -87, var191);
                    }
                }
                class11.field192 = null;
                return true;
            } else if (class517.field7062 == class11.field192) {
                class55.method352(class199.field2529, (byte) 35);
                class11.field192 = null;
                return true;
            } else if (class269.field3399 == class11.field192) {
                class102.field1365 = class298.field3671.method3514((byte) -18);
                class148.field1900 = class298.field3671.method3498(255);
                class11.field192 = null;
                return true;
            } else if (class680.field9559 == class11.field192) {
                int var195 = class298.field3671.method3519((byte) 113);
                int var196 = class298.field3671.method3463(4087);
                if (class80.method467(var195, arg0 + 65536)) {
                    class331.method1879(3, -1, var196, 0, -1);
                }
                class11.field192 = null;
                return true;
            } else if (class318.field4072 == class11.field192) {
                while (class298.field3671.field8812 < class8.field162) {
                    boolean var207 = class298.field3671.method3501(-9268) == 1;
                    String var208 = class298.field3671.method3500((byte) 118);
                    String var209 = class298.field3671.method3500((byte) 125);
                    int var210 = class298.field3671.method3470(13111);
                    int var211 = class298.field3671.method3501(-9268);
                    String var212 = "";
                    boolean var213 = false;
                    if (var210 > 0) {
                        var212 = class298.field3671.method3500((byte) 118);
                        var213 = class298.field3671.method3501(-9268) == 1;
                    }
                    for (int var214 = 0; var214 < class66.field904; var214++) {
                        if (var207) {
                            if (var209.equals(class50.field708[var214])) {
                                class50.field708[var214] = var208;
                                class531.field7172[var214] = var209;
                                var208 = null;
                                break;
                            }
                        } else if (var208.equals(class50.field708[var214])) {
                            if (class223.field2796[var214] != var210) {
                                boolean var215 = true;
                                for (class460 var216 = (class460) class594.field8339.method802((byte) 92); var216 != null; var216 = (class460) class594.field8339.method800((byte) -106)) {
                                    if (var216.field5847.equals(var208)) {
                                        if (var210 != 0 && var216.field5844 == 0) {
                                            var215 = false;
                                            var216.method3146(arg0 + 3);
                                        } else if (var210 == 0 && var216.field5844 != 0) {
                                            var216.method3146(2);
                                            var215 = false;
                                        }
                                    }
                                }
                                if (var215) {
                                    class594.field8339.method801(new class460(var208, var210), 88);
                                }
                                class223.field2796[var214] = var210;
                            }
                            class531.field7172[var214] = var209;
                            class241.field3010[var214] = var212;
                            class441.field5568[var214] = var211;
                            var208 = null;
                            class599.field8411[var214] = var213;
                            break;
                        }
                    }
                    if (var208 != null && class66.field904 < 200) {
                        class50.field708[class66.field904] = var208;
                        class531.field7172[class66.field904] = var209;
                        class223.field2796[class66.field904] = var210;
                        class241.field3010[class66.field904] = var212;
                        class441.field5568[class66.field904] = var211;
                        class599.field8411[class66.field904] = var213;
                        class66.field904++;
                    }
                }
                class95.field1312 = class450.field5767;
                class148.field1917 = 2;
                boolean var197 = false;
                int var198 = class66.field904;
                while (var198 > 0) {
                    boolean var199 = true;
                    var198--;
                    for (int var200 = 0; var200 < var198; var200++) {
                        if (class223.field2796[var200] != class131.field1628.field3685 && class223.field2796[var200 + 1] == class131.field1628.field3685 || class223.field2796[var200] == 0 && class223.field2796[var200 + 1] != 0) {
                            int var201 = class223.field2796[var200];
                            class223.field2796[var200] = class223.field2796[var200 + 1];
                            class223.field2796[var200 + 1] = var201;
                            String var202 = class241.field3010[var200];
                            class241.field3010[var200] = class241.field3010[var200 + 1];
                            class241.field3010[var200 + 1] = var202;
                            String var203 = class50.field708[var200];
                            class50.field708[var200] = class50.field708[var200 + 1];
                            class50.field708[var200 + 1] = var203;
                            String var204 = class531.field7172[var200];
                            class531.field7172[var200] = class531.field7172[var200 + 1];
                            class531.field7172[var200 + 1] = var204;
                            int var205 = class441.field5568[var200];
                            class441.field5568[var200] = class441.field5568[var200 + 1];
                            class441.field5568[var200 + 1] = var205;
                            boolean var206 = class599.field8411[var200];
                            class599.field8411[var200] = class599.field8411[var200 + 1];
                            var199 = false;
                            class599.field8411[var200 + 1] = var206;
                        }
                    }
                    if (var199) {
                        break;
                    }
                }
                class11.field192 = null;
                return true;
            } else if (class138.field1787 == class11.field192) {
                int var217 = class298.field3671.method3483(66);
                class595.field8377 = class590.field8289.method3628(var217, (byte) 116);
                class11.field192 = null;
                return true;
            } else if (class49.field698 == class11.field192) {
                class55.method352(class549.field7640, (byte) 109);
                class11.field192 = null;
                return true;
            } else if (class659.field9341 == class11.field192) {
                int var218 = class298.field3671.method3470(13111);
                String var219 = class298.field3671.method3500((byte) 125);
                int var220 = class298.field3671.method3482(true);
                if (class80.method467(var220, 65535)) {
                    class534.method2895(arg0 + 11333, var219, var218);
                }
                class11.field192 = null;
                return true;
            } else if (class39.field519 == class11.field192) {
                int var221 = class298.field3671.method3499(-113);
                int var222 = var221 >> 2;
                int var223 = var221 & 0x3;
                int var224 = class147.field1889[var222];
                int var225 = class298.field3671.method3482(true);
                if (var225 == 65535) {
                    var225 = -1;
                }
                int var226 = class298.field3671.method3486(-87);
                int var227 = var226 >> 28 & 0x3;
                int var228 = (var226 & 0xFFFDFB4) >> 14;
                int var229 = var228 - class145.field1879;
                int var230 = var226 & 0x3FFF;
                int var231 = var230 - class630.field8817;
                class313.method1817(-1, var222, var225, var224, var227, var231, var223, var229);
                class11.field192 = null;
                return true;
            } else if (class323.field4155 == class11.field192) {
                int var232 = class298.field3671.method3470(13111);
                int var233 = class298.field3671.method3483(67);
                if (class80.method467(var232, 65535)) {
                    class340 var234 = (class340) class138.field1797.method399(arg0 ^ 0x7FEB, (long) var233);
                    if (var234 != null) {
                        class426.method2260(false, true, false, var234);
                    }
                    if (class461.field5873 != null) {
                        class572.method3158(class461.field5873, 1023);
                        class461.field5873 = null;
                    }
                }
                class11.field192 = null;
                return true;
            } else if (class68.field920 == class11.field192) {
                int var235 = class298.field3671.method3504(-13829);
                int var236 = class298.field3671.method3483(89);
                int var237 = class298.field3671.method3501(arg0 ^ 0x2433);
                String var238 = "";
                String var239 = var238;
                if ((var237 & 0x1) != 0) {
                    var238 = class298.field3671.method3500((byte) 123);
                    if ((var237 & 0x2) == 0) {
                        var239 = var238;
                    } else {
                        var239 = class298.field3671.method3500((byte) 117);
                    }
                }
                String var240 = class298.field3671.method3500((byte) 123);
                if (var235 == 99) {
                    class193.method1171(4, var240);
                } else if (var239.equals("") || !class194.method1172(var239, -117)) {
                    class1.method3(var238, var240, var235, -1, var239, var236, var238);
                } else {
                    class11.field192 = null;
                    return true;
                }
                class11.field192 = null;
                return true;
            } else if (class85.field1196 == class11.field192) {
                int var241 = class298.field3671.method3470(13111);
                if (var241 == 65535) {
                    var241 = -1;
                }
                int var242 = class298.field3671.method3483(61);
                int var243 = class298.field3671.method3467((byte) -80);
                if (var243 == 65535) {
                    var243 = -1;
                }
                int var244 = class298.field3671.method3470(13111);
                int var245 = class298.field3671.method3474(-106);
                if (class80.method467(var244, 65535)) {
                    for (int var246 = var243; var246 <= var241; var246++) {
                        long var247 = ((long) var242 << 32) + ((long) var246);
                        class369 var249 = (class369) class39.field523.method399(arg0 - 32747, var247);
                        class369 var250;
                        if (var249 != null) {
                            var250 = new class369(var245, var249.field4683);
                            var249.method1871(-123);
                        } else if (var246 == -1) {
                            var250 = new class369(var245, class156.method894(-1018745488, var242).field6871.field4683);
                        } else {
                            var250 = new class369(var245, -1);
                        }
                        class39.field523.method402(var250, (byte) -56, var247);
                    }
                }
                class11.field192 = null;
                return true;
            } else if (class66.field893 == class11.field192) {
                byte var251 = class298.field3671.method3480(-20933);
                int var252 = class298.field3671.method3470(13111);
                class684.field9606.method1182(var252, 0, var251);
                class11.field192 = null;
                return true;
            } else if (class152.field1944 == class11.field192) {
                boolean var253 = class298.field3671.method3501(-9268) == 1;
                String var254 = class298.field3671.method3500((byte) 124);
                String var255 = var254;
                if (var253) {
                    var255 = class298.field3671.method3500((byte) 119);
                }
                long var256 = (long) class298.field3671.method3470(13111);
                long var258 = (long) class298.field3671.method3517(arg0);
                int var260 = class298.field3671.method3501(arg0 - 9267);
                long var261 = (var256 << 32) + var258;
                boolean var263 = false;
                int var264 = 0;
                while (true) {
                    if (var264 >= 100) {
                        if (var260 <= 1) {
                            if (!(!class242.field3012 || class450.field5747) || class553.field7703) {
                                var263 = true;
                            } else if (class194.method1172(var255, -124)) {
                                var263 = true;
                            }
                        }
                        break;
                    }
                    if (class332.field4233[var264] == var261) {
                        var263 = true;
                        break;
                    }
                    var264++;
                }
                if (!var263 && class650.field9179 == 0) {
                    class332.field4233[class373.field4709] = var261;
                    class373.field4709 = (class373.field4709 + 1) % 100;
                    String var265 = class447.method2388(19317, class425.method2257(class298.field3671, (byte) 77));
                    if (var260 == 2) {
                        class587.method3232(var254, var265, 7, 0, -1, "<img=1>" + var255, null, (byte) 120, "<img=1>" + var254);
                    } else if (var260 == 1) {
                        class587.method3232(var254, var265, 7, 0, -1, "<img=0>" + var255, null, (byte) 106, "<img=0>" + var254);
                    } else {
                        class587.method3232(var254, var265, 3, 0, -1, var255, null, (byte) 106, var254);
                    }
                }
                class11.field192 = null;
                return true;
            } else if (class203.field2590 == class11.field192) {
                class55.method352(class511.field6943, (byte) 34);
                class11.field192 = null;
                return true;
            } else if (class595.field8373 == class11.field192) {
                int var266 = class298.field3671.method3470(arg0 ^ 0xFFFFCCC8);
                int var267 = class298.field3671.method3501(-9268);
                int var268 = class298.field3671.method3501(-9268);
                int var269 = class298.field3671.method3470(arg0 ^ 0xFFFFCCC8) << 2;
                int var270 = class298.field3671.method3501(-9268);
                int var271 = class298.field3671.method3501(arg0 - 9267);
                if (class80.method467(var266, 65535)) {
                    class407.method2165(false, var267, var270, var271, true, var268, var269);
                }
                class11.field192 = null;
                return true;
            } else if (class454.field5815 == class11.field192) {
                boolean var272 = class298.field3671.method3501(-9268) == 1;
                byte[] var273 = new byte[class8.field162 - 1];
                class298.field3671.method3522(var273, true, class8.field162 - 1, 0);
                class481.method2622(13736, var273, var272);
                class11.field192 = null;
                return true;
            } else if (class564.field7832 == class11.field192) {
                int var274 = class298.field3671.method3467((byte) -80);
                int var275 = class298.field3671.method3467((byte) -80);
                int var276 = class298.field3671.method3498(arg0 + 256);
                if (class80.method467(var274, 65535)) {
                    if (var276 == 2) {
                        class496.method2669(-122);
                    }
                    class316.field4063 = var275;
                    class206.method1243(-93, var275);
                    class635.method3557(false, (byte) -120);
                    class197.method1189(class316.field4063);
                    for (int var277 = 0; var277 < 100; var277++) {
                        class413.field5168[var277] = true;
                    }
                }
                class11.field192 = null;
                return true;
            } else if (class250.field3076 == class11.field192) {
                int var278 = class298.field3671.method3519((byte) 119);
                int var279 = class298.field3671.method3486(-91);
                int var280 = class298.field3671.method3519((byte) 120);
                if (class80.method467(var280, arg0 + 65536)) {
                    class231.method1394(12, var278, var279);
                }
                class11.field192 = null;
                return true;
            } else if (class531.field7175 == class11.field192) {
                class55.method352(class104.field1393, (byte) 26);
                class11.field192 = null;
                return true;
            } else if (class514.field7022 == class11.field192) {
                class674.field9482 = class8.field162 <= 2 ? class83.field1134.method476((byte) -58, class250.field3068) : class298.field3671.method3500((byte) 127);
                class517.field7068 = class8.field162 <= 0 ? -1 : class298.field3671.method3470(13111);
                class11.field192 = null;
                if (class517.field7068 == 65535) {
                    class517.field7068 = -1;
                }
                return true;
            } else if (class11.field192 == class103.field1387) {
                class135.field1758 = class298.field3671.method3501(-9268);
                class11.field192 = null;
                return true;
            } else if (class170.field2217 == class11.field192) {
                boolean var281 = class298.field3671.method3501(-9268) == 1;
                String var282 = class298.field3671.method3500((byte) 118);
                String var283 = var282;
                if (var281) {
                    var283 = class298.field3671.method3500((byte) 120);
                }
                int var284 = class298.field3671.method3501(-9268);
                boolean var285 = false;
                if (var284 <= 1) {
                    if (!(!class242.field3012 || class450.field5747) || class553.field7703) {
                        var285 = true;
                    } else if (var284 <= 1 && class194.method1172(var283, -127)) {
                        var285 = true;
                    }
                }
                if (!var285 && class650.field9179 == 0) {
                    String var286 = class447.method2388(19317, class425.method2257(class298.field3671, (byte) -6));
                    if (var284 == 2) {
                        class587.method3232(var282, var286, 24, 0, -1, "<img=1>" + var283, null, (byte) 101, "<img=1>" + var282);
                    } else if (var284 == 1) {
                        class587.method3232(var282, var286, 24, 0, -1, "<img=0>" + var283, null, (byte) 102, "<img=0>" + var282);
                    } else {
                        class587.method3232(var282, var286, 24, 0, -1, var283, null, (byte) 101, var282);
                    }
                }
                class11.field192 = null;
                return true;
            } else if (class2.field20 == class11.field192) {
                class297.method1653(true, (byte) -125);
                class11.field192 = null;
                return true;
            } else if (class298.field3669 == class11.field192) {
                int var287 = class298.field3671.method3470(13111);
                class514 var288;
                if (class167.field2200 == var287) {
                    var288 = class376.field4748;
                } else {
                    var288 = class351.field4490[var287];
                }
                if (var288 == null) {
                    class11.field192 = null;
                    return true;
                }
                int var289 = class298.field3671.method3470(arg0 + 13112);
                int var290 = class298.field3671.method3501(-9268);
                boolean var291 = (var289 & 0x8000) != 0;
                if (var288.field7017 != null && var288.field7008 != null) {
                    boolean var292 = false;
                    if (var290 <= 1) {
                        if (!var291 && (class242.field3012 && !class450.field5747 || class553.field7703)) {
                            var292 = true;
                        } else if (class194.method1172(var288.field7017, arg0 - 116)) {
                            var292 = true;
                        }
                    }
                    if (!var292 && class650.field9179 == 0) {
                        int var293 = -1;
                        String var294;
                        if (var291) {
                            var289 &= 0x7FFF;
                            class127 var295 = class662.method3730(class298.field3671, (byte) -47);
                            var293 = var295.field1589;
                            var294 = var295.field1592.method3453(1772, class298.field3671);
                        } else {
                            var294 = class447.method2388(19317, class425.method2257(class298.field3671, (byte) -124));
                        }
                        var288.field9667 = var294.trim();
                        var288.field9674 = var289 >> 8;
                        var288.field9738 = var289 & 0xFF;
                        var288.field9655 = 150;
                        int var296;
                        if (var290 == 1 || var290 == 2) {
                            var296 = var291 ? 17 : 1;
                        } else {
                            var296 = var291 ? 17 : 2;
                        }
                        if (var290 == 2) {
                            class587.method3232(var288.field6990, var294, var296, 0, var293, "<img=1>" + var288.method2781(false, (byte) -7), null, (byte) 107, "<img=1>" + var288.method2777((byte) -127, true));
                        } else if (var290 == 1) {
                            class587.method3232(var288.field6990, var294, var296, 0, var293, "<img=0>" + var288.method2781(false, (byte) -7), null, (byte) 110, "<img=0>" + var288.method2777((byte) -124, true));
                        } else {
                            class587.method3232(var288.field6990, var294, var296, 0, var293, var288.method2781(false, (byte) -7), null, (byte) 109, var288.method2777((byte) -128, true));
                        }
                    }
                }
                class11.field192 = null;
                return true;
            } else if (class534.field7200 == class11.field192) {
                String var297 = class298.field3671.method3500((byte) 121);
                int var298 = class298.field3671.method3470(13111);
                int var299 = class298.field3671.method3482(true);
                if (class80.method467(var298, 65535)) {
                    class534.method2895(arg0 ^ 0xFFFFD3BB, var297, var299);
                }
                class11.field192 = null;
                return true;
            } else if (class241.field3009 == class11.field192) {
                class55.method352(class665.field9378, (byte) 64);
                class11.field192 = null;
                return true;
            } else if (class583.field8146 == class11.field192) {
                int var300 = class298.field3671.method3483(127);
                int var301 = class298.field3671.method3482(true);
                if (class80.method467(var301, 65535)) {
                    if (var300 == -1) {
                        class196.field2471 = -1;
                        class306.field3890 = -1;
                    } else {
                        int var302 = var300 >> 14 & 0x3FFF;
                        int var303 = var302 - class145.field1879;
                        int var304 = var300 & 0x3FFF;
                        if (var303 < 0) {
                            var303 = 0;
                        } else if (var303 >= class431.field5395) {
                            var303 = class431.field5395;
                        }
                        int var305 = var304 - class630.field8817;
                        if (var305 < 0) {
                            var305 = 0;
                        } else if (var305 >= class452.field5802) {
                            var305 = class452.field5802;
                        }
                        class306.field3890 = (var303 << 9) + 256;
                        class196.field2471 = (var305 << 9) + 256;
                    }
                }
                class11.field192 = null;
                return true;
            } else if (class128.field1602 == class11.field192) {
                int var306 = class298.field3671.method3519((byte) 107);
                int var307 = class298.field3671.method3486(-111);
                int var308 = class298.field3671.method3482(true);
                int var309 = class298.field3671.method3467((byte) -80);
                int var310 = class298.field3671.method3482(true);
                if (class80.method467(var309, 65535)) {
                    class331.method1879(7, var306 | var308 << 16, var307, 0, var310);
                }
                class11.field192 = null;
                return true;
            } else if (class405.field5077 == class11.field192) {
                boolean var311 = class298.field3671.method3501(-9268) == 1;
                String var312 = class298.field3671.method3500((byte) 126);
                String var313 = var312;
                if (var311) {
                    var313 = class298.field3671.method3500((byte) 123);
                }
                long var314 = class298.field3671.method3527(false);
                long var316 = (long) class298.field3671.method3470(13111);
                long var318 = (long) class298.field3671.method3517(-1);
                int var320 = class298.field3671.method3501(-9268);
                int var321 = class298.field3671.method3470(13111);
                long var322 = (var316 << 32) + var318;
                boolean var324 = false;
                int var325 = 0;
                while (true) {
                    if (var325 >= 100) {
                        if (var320 <= 1 && class194.method1172(var313, -121)) {
                            var324 = true;
                        }
                        break;
                    }
                    if (class332.field4233[var325] == var322) {
                        var324 = true;
                        break;
                    }
                    var325++;
                }
                if (!var324 && class650.field9179 == 0) {
                    class332.field4233[class373.field4709] = var322;
                    class373.field4709 = (class373.field4709 + 1) % 100;
                    String var326 = class428.field5360.method3781(var321, (byte) 118).method3453(1772, class298.field3671);
                    if (var320 == 2) {
                        class587.method3232(var312, var326, 20, 0, var321, "<img=1>" + var313, class85.method490(var314, 72), (byte) 115, "<img=1>" + var312);
                    } else if (var320 == 1) {
                        class587.method3232(var312, var326, 20, 0, var321, "<img=0>" + var313, class85.method490(var314, 88), (byte) 127, "<img=0>" + var312);
                    } else {
                        class587.method3232(var312, var326, 20, 0, var321, var313, class85.method490(var314, 79), (byte) 102, var312);
                    }
                }
                class11.field192 = null;
                return true;
            } else if (class209.field2636 == class11.field192) {
                boolean var327 = class298.field3671.method3501(arg0 ^ 0x2433) == 1;
                String var328 = class298.field3671.method3500((byte) 117);
                String var329 = var328;
                if (var327) {
                    var329 = class298.field3671.method3500((byte) 115);
                }
                long var330 = class298.field3671.method3527(false);
                long var332 = (long) class298.field3671.method3470(13111);
                long var334 = (long) class298.field3671.method3517(-1);
                int var336 = class298.field3671.method3501(-9268);
                long var337 = (var332 << 32) + var334;
                boolean var339 = false;
                int var340 = 0;
                while (true) {
                    if (var340 >= 100) {
                        if (var336 <= 1) {
                            if (!(!class242.field3012 || class450.field5747) || class553.field7703) {
                                var339 = true;
                            } else if (class194.method1172(var329, -97)) {
                                var339 = true;
                            }
                        }
                        break;
                    }
                    if (class332.field4233[var340] == var337) {
                        var339 = true;
                        break;
                    }
                    var340++;
                }
                if (!var339 && class650.field9179 == 0) {
                    class332.field4233[class373.field4709] = var337;
                    class373.field4709 = (class373.field4709 + 1) % 100;
                    String var341 = class447.method2388(arg0 + 19318, class425.method2257(class298.field3671, (byte) -123));
                    if (var336 == 2 || var336 == 3) {
                        class587.method3232(var328, var341, 9, 0, -1, "<img=1>" + var329, class85.method490(var330, 63), (byte) 117, "<img=1>" + var328);
                    } else if (var336 == 1) {
                        class587.method3232(var328, var341, 9, 0, -1, "<img=0>" + var329, class85.method490(var330, 59), (byte) 114, "<img=0>" + var328);
                    } else {
                        class587.method3232(var328, var341, 9, 0, -1, var329, class85.method490(var330, 43), (byte) 107, var328);
                    }
                }
                class11.field192 = null;
                return true;
            } else if (class389.field4902 == class11.field192) {
                if (class316.field4063 != -1) {
                    class106.method603(arg0 - 1630137274, class316.field4063, 0);
                }
                class11.field192 = null;
                return true;
            } else if (class391.field4926 == class11.field192) {
                class55.method352(class689.field9767, (byte) 48);
                class11.field192 = null;
                return true;
            } else if (class135.field1759 == class11.field192) {
                class287.field3575 = class298.field3671.method3501(-9268);
                class16.field266 = class450.field5767;
                class11.field192 = null;
                return true;
            } else if (class290.field3605 == class11.field192) {
                int var342 = class298.field3671.method3499(-122);
                int var343 = class298.field3671.method3463(4087);
                int var344 = class298.field3671.method3467((byte) -80);
                if (class80.method467(var344, 65535)) {
                    class603.method3308(var343, (byte) 15, var342);
                }
                class11.field192 = null;
                return true;
            } else if (class224.field2803 == class11.field192) {
                class55.method352(class472.field5985, (byte) 100);
                class11.field192 = null;
                return true;
            } else if (class149.field1921 == class11.field192) {
                for (int var345 = 0; var345 < class351.field4490.length; var345++) {
                    if (class351.field4490[var345] != null) {
                        class351.field4490[var345].field9691 = null;
                        class351.field4490[var345].field9689 = -1;
                    }
                }
                for (int var346 = 0; var346 < class441.field5585; var346++) {
                    class518.field7076[var346].field2618.field9691 = null;
                    class518.field7076[var346].field2618.field9689 = -1;
                }
                class11.field192 = null;
                return true;
            } else if (class280.field3506 == class11.field192) {
                int var347 = class298.field3671.method3483(86);
                int var348 = class298.field3671.method3470(13111);
                int var349 = class298.field3671.method3467((byte) -80);
                if (var349 == 65535) {
                    var349 = -1;
                }
                int var350 = class298.field3671.method3486(arg0 - 71);
                if (class80.method467(var348, 65535)) {
                    class674.method3786(var350, arg0 ^ 0xFFFFFFF6, var349, var347);
                    class3 var351 = class633.field8881.method434(arg0 ^ 0xFFFFCF9B, var349);
                    class412.method2181(var351.field91, var351.field103, -26287, var351.field49, var347);
                    class512.method2765((byte) -119, var351.field89, var351.field102, var347, var351.field68);
                }
                class11.field192 = null;
                return true;
            } else if (class622.field8691 == class11.field192) {
                int[] var352 = new int[4];
                for (int var353 = 0; var353 < 4; var353++) {
                    var352[var353] = class298.field3671.method3519((byte) 116);
                }
                int var354 = class298.field3671.method3470(13111);
                int var355 = class298.field3671.method3498(255);
                class206 var356 = (class206) class180.field2318.method399(arg0 ^ 0x7FEB, (long) var354);
                if (var356 != null) {
                    class373.method2033(var352, (byte) -124, var356.field2618, var355);
                }
                class11.field192 = null;
                return true;
            } else if (class490.field6481 == class11.field192) {
                class55.method352(class89.field1249, (byte) 29);
                class11.field192 = null;
                return true;
            } else if (class337.field4331 == class11.field192) {
                int var357 = class298.field3671.method3474(41);
                int var358 = class298.field3671.method3474(arg0 ^ 0xFFFFFF8E);
                int var359 = class298.field3671.method3519((byte) 115);
                int var360 = class298.field3671.method3519((byte) 102);
                if (class80.method467(var360, 65535)) {
                    class331.method1879(5, var359, var358, 0, var357);
                }
                class11.field192 = null;
                return true;
            } else if (class507.field6756 == class11.field192) {
                int var361 = class298.field3671.method3483(117);
                int var362 = class298.field3671.method3470(13111);
                if (var362 == 65535) {
                    var362 = -1;
                }
                int var363 = class298.field3671.method3470(13111);
                if (class80.method467(var363, 65535)) {
                    class331.method1879(1, var362, var361, 0, -1);
                }
                class11.field192 = null;
                return true;
            } else if (class566.field7889 == class11.field192) {
                int var364 = class298.field3671.method3486(arg0 ^ 0x45);
                int var365 = class298.field3671.method3470(13111);
                int var366 = class298.field3671.method3467((byte) -80);
                if (class80.method467(var365, arg0 ^ 0xFFFF0000)) {
                    class263.method1523(var366, var364, 1);
                }
                class11.field192 = null;
                return true;
            } else if (class237.field2964 == class11.field192) {
                if (class655.field9229 != null) {
                    class220.method1301(false, (byte) 126, -1, -1, class301.field3698.field6616);
                }
                byte[] var367 = new byte[class8.field162];
                class298.field3671.method205(0, class8.field162, var367, -122);
                String var368 = class106.method604(26144, class8.field162, var367, 0);
                class313.method1818(125, var368, class590.field8289, class651.field9191 == 1, true);
                class11.field192 = null;
                return true;
            } else if (class279.field3499 == class11.field192) {
                int var369 = class298.field3671.method3470(13111);
                if (var369 == 65535) {
                    var369 = -1;
                }
                int var370 = class298.field3671.method3501(arg0 - 9267);
                int var371 = class298.field3671.method3470(13111);
                int var372 = class298.field3671.method3501(arg0 - 9267);
                class602.method3306(var369, var370, var371, false, var372, false);
                class11.field192 = null;
                return true;
            } else if (class40.field528 == class11.field192) {
                class403.field5060 = class450.field5767;
                if (class8.field162 == 0) {
                    class425.field5337 = null;
                    class516.field7046 = null;
                    class11.field192 = null;
                    class29.field416 = null;
                    class313.field4023 = 0;
                    return true;
                }
                class425.field5337 = class298.field3671.method3500((byte) 124);
                boolean var373 = class298.field3671.method3501(-9268) == 1;
                if (var373) {
                    class298.field3671.method3500((byte) 119);
                }
                long var374 = class298.field3671.method3527(false);
                class29.field416 = class577.method3181((byte) -84, var374);
                class608.field8531 = class298.field3671.method3480(arg0 - 20932);
                int var376 = class298.field3671.method3501(-9268);
                if (var376 == 255) {
                    class11.field192 = null;
                    return true;
                }
                class313.field4023 = var376;
                class513[] var377 = new class513[100];
                for (int var378 = 0; var378 < class313.field4023; var378++) {
                    var377[var378] = new class513();
                    var377[var378].field6958 = class298.field3671.method3500((byte) 121);
                    boolean var384 = class298.field3671.method3501(arg0 ^ 0x2433) == 1;
                    if (var384) {
                        var377[var378].field6965 = class298.field3671.method3500((byte) 117);
                    } else {
                        var377[var378].field6965 = var377[var378].field6958;
                    }
                    var377[var378].field6959 = class158.method900(var377[var378].field6965, true);
                    var377[var378].field6971 = class298.field3671.method3470(13111);
                    var377[var378].field6964 = class298.field3671.method3480(-20933);
                    var377[var378].field6961 = class298.field3671.method3500((byte) 115);
                    if (var377[var378].field6965.equals(class376.field4748.field7017)) {
                        class649.field9167 = var377[var378].field6964;
                    }
                }
                boolean var379 = false;
                int var380 = class313.field4023;
                while (var380 > 0) {
                    boolean var381 = true;
                    var380--;
                    for (int var382 = 0; var382 < var380; var382++) {
                        if (var377[var382].field6959.compareTo(var377[var382 + 1].field6959) > 0) {
                            class513 var383 = var377[var382];
                            var377[var382] = var377[var382 + 1];
                            var381 = false;
                            var377[var382 + 1] = var383;
                        }
                    }
                    if (var381) {
                        break;
                    }
                }
                class11.field192 = null;
                class516.field7046 = var377;
                return true;
            } else if (class549.field7637 == class11.field192) {
                int var385 = class298.field3671.method3470(arg0 ^ 0xFFFFCCC8);
                if (var385 == 65535) {
                    var385 = -1;
                }
                int var386 = class298.field3671.method3501(-9268);
                int var387 = class298.field3671.method3470(arg0 ^ 0xFFFFCCC8);
                int var388 = class298.field3671.method3501(-9268);
                class160.method925(var388, var385, var386, var387, 29830);
                class11.field192 = null;
                return true;
            } else if (class680.field9561 == class11.field192) {
                int var389 = class298.field3671.method3470(13111);
                int var390 = class298.field3671.method3501(-9268);
                boolean var391 = (var390 & 0x1) == 1;
                while (class298.field3671.field8812 < class8.field162) {
                    int var392 = class298.field3671.method3504(arg0 ^ 0x3604);
                    int var393 = class298.field3671.method3470(arg0 + 13112);
                    int var394 = 0;
                    if (var393 != 0) {
                        var394 = class298.field3671.method3501(-9268);
                        if (var394 == 255) {
                            var394 = class298.field3671.method3483(113);
                        }
                    }
                    class406.method2160(-84, var391, var393 - 1, var392, var394, var389);
                }
                class138.field1799[class695.method3921(class598.field8403++, 31)] = var389;
                class11.field192 = null;
                return true;
            } else if (class568.field7959 == class11.field192) {
                int var395 = class298.field3671.method3470(arg0 + 13112);
                String var396 = class298.field3671.method3500((byte) 118);
                Object[] var397 = new Object[var396.length() + 1];
                for (int var398 = var396.length() - 1; var398 >= 0; var398--) {
                    if (var396.charAt(var398) == 's') {
                        var397[var398 + 1] = class298.field3671.method3500((byte) 119);
                    } else {
                        var397[var398 + 1] = Integer.valueOf(class298.field3671.method3483(97));
                    }
                }
                var397[0] = Integer.valueOf(class298.field3671.method3483(91));
                if (class80.method467(var395, arg0 ^ 0xFFFF0000)) {
                    class71 var399 = new class71();
                    var399.field963 = var397;
                    class197.method1191(var399);
                }
                class11.field192 = null;
                return true;
            } else if (class248.field3066 == class11.field192) {
                class239.field2987 = class18.method119(34067, class298.field3671.method3501(-9268));
                class11.field192 = null;
                return true;
            } else if (class64.field874 == class11.field192) {
                int var400 = class298.field3671.method3514((byte) -18);
                int var401 = class298.field3671.method3470(arg0 + 13112);
                if (class80.method467(var401, 65535)) {
                    class620.field8658 = var400;
                }
                class11.field192 = null;
                return true;
            } else if (class330.field4208 == class11.field192) {
                int var402 = class298.field3671.method3463(arg0 ^ 0xFFFFF008);
                int var403 = class298.field3671.method3467((byte) -80);
                int var404 = class298.field3671.method3519((byte) 123);
                if (var404 == 65535) {
                    var404 = -1;
                }
                if (class80.method467(var403, 65535)) {
                    class331.method1879(2, var404, var402, 0, -1);
                }
                class11.field192 = null;
                return true;
            } else if (class237.field2967 == class11.field192) {
                String var405 = class298.field3671.method3500((byte) 126);
                int var406 = class298.field3671.method3470(13111);
                String var407 = class428.field5360.method3781(var406, (byte) 78).method3453(arg0 + 1773, class298.field3671);
                class587.method3232(var405, var407, 19, 0, var406, var405, null, (byte) 103, var405);
                class11.field192 = null;
                return true;
            } else if (class561.field7791 == class11.field192) {
                class356.field4558 = class298.field3671.method3501(-9268);
                class605.field8511 = class298.field3671.method3485((byte) -51) << 3;
                class517.field7053 = class298.field3671.method3485((byte) -51) << 3;
                for (class650 var408 = (class650) class533.field7185.method407((byte) 124); var408 != null; var408 = (class650) class533.field7185.method403(arg0 + 12562)) {
                    int var410 = (int) (var408.field4199 >> 28 & 0x3L);
                    int var411 = (int) (var408.field4199 & 0x3FFFL);
                    int var412 = var411 - class145.field1879;
                    int var413 = (int) (var408.field4199 >> 14 & 0x3FFFL);
                    int var414 = var413 - class630.field8817;
                    if (class356.field4558 == var410 && var412 >= class605.field8511 && var412 < (class605.field8511 + 8) && var414 >= class517.field7053 && (class517.field7053 + 8) > var414) {
                        var408.method1871(-65);
                        if (var412 >= 0 && var414 >= 0 && class431.field5395 > var412 && var414 < class452.field5802) {
                            class195.method1179(1736, var414, class356.field4558, var412);
                        }
                    }
                }
                for (class62 var409 = (class62) class467.field5934.method237(102); var409 != null; var409 = (class62) class467.field5934.method245((byte) 116)) {
                    if (var409.field845 >= class605.field8511 && var409.field845 < (class605.field8511 + 8) && var409.field835 >= class517.field7053 && var409.field835 < (class517.field7053 + 8) && class356.field4558 == var409.field844) {
                        var409.field838 = 0;
                    }
                }
                class11.field192 = null;
                return true;
            } else if (class198.field2503 == class11.field192) {
                class413.method2189((byte) -93, class407.field5096);
                class11.field192 = null;
                return false;
            } else if (class329.field4202 == class11.field192) {
                int var415 = class298.field3671.method3474(arg0 ^ 0x78);
                int var416 = class298.field3671.method3482(true);
                class684.field9606.method1182(var416, 0, var415);
                class11.field192 = null;
                return true;
            } else if (class514.field7026 == class11.field192) {
                int var417 = class298.field3671.method3470(13111);
                int var418 = class298.field3671.method3501(-9268);
                boolean var419 = (var418 & 0x1) == 1;
                class591.method3248(var417, (byte) -34, var419);
                int var420 = class298.field3671.method3470(13111);
                for (int var421 = 0; var421 < var420; var421++) {
                    int var422 = class298.field3671.method3501(-9268);
                    if (var422 == 255) {
                        var422 = class298.field3671.method3463(4087);
                    }
                    int var423 = class298.field3671.method3470(arg0 + 13112);
                    class406.method2160(-103, var419, var423 - 1, var421, var422, var417);
                }
                class138.field1799[class695.method3921(31, class598.field8403++)] = var417;
                class11.field192 = null;
                return true;
            } else if (class603.field8492 == class11.field192) {
                class356.field4558 = class298.field3671.method3514((byte) -18);
                class605.field8511 = class298.field3671.method3520(arg0 ^ 0xFFFFBFCB) << 3;
                class517.field7053 = class298.field3671.method3520(16436) << 3;
                class11.field192 = null;
                return true;
            } else if (class549.field7642 == class11.field192) {
                int var424 = class298.field3671.method3474(112);
                int var425 = class298.field3671.method3482(true);
                String var426 = class298.field3671.method3500((byte) 115);
                if (class80.method467(var425, arg0 ^ 0xFFFF0000)) {
                    class477.method2519(3, var426, var424);
                }
                class11.field192 = null;
                return true;
            } else if (class452.field5796 == class11.field192) {
                int var427 = class298.field3671.method3519((byte) 125);
                int var428 = class298.field3671.method3519((byte) 125);
                int var429 = class298.field3671.method3519((byte) 124);
                int var430 = class298.field3671.method3482(true);
                int var431 = class298.field3671.method3463(4087);
                if (class80.method467(var427, arg0 + 65536)) {
                    class412.method2181(var428, var430, -26287, var429, var431);
                }
                class11.field192 = null;
                return true;
            } else if (class260.field3195 == class11.field192) {
                class55.method352(class97.field1320, (byte) 13);
                class11.field192 = null;
                return true;
            } else {
                class106.method597("T1 - " + (class11.field192 == null ? -1 : class11.field192.method2424(25569)) + "," + (class71.field965 == null ? -1 : class71.field965.method2424(25569)) + "," + (class533.field7187 == null ? -1 : class533.field7187.method2424(25569)) + " - " + class8.field162, -2, null);
                class413.method2189((byte) -125, false);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V", line = 3352)
    public class262() {
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Z)V", line = 3355)
    public static void method1518(boolean arg0) {
        if (arg0) {
            method1518(true);
        }
        field3231 = null;
        field3232 = null;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(BC)Z", line = 3367)
    public static final boolean method1519(byte arg0, char arg1) {
        field3233++;
        if (arg0 != 24) {
            field3232 = null;
        }
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class286.field3555;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(I)V", line = 3404)
    public class262(int arg0) {
        this.field3229 = arg0;
    }
}
