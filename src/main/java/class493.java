import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class493 {

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field7048;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pt", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field7049;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pt", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field7050;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Z)V")
    public static final synchronized void method2955(boolean arg0) {
        field7046++;
        if (class634.field9112 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var3 = var2.invoke(null, (Object[]) null);
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field7049 == null ? (field7049 = method2957("java.lang.String")) : field7049, field7050 == null ? (field7050 = method2957("java.lang.Class")) : field7050);
            class634.field9112 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
            if (!arg0) {
                method2955(false);
            }
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)Z")
    public static final boolean method2956(int arg0) throws IOException {
        field7047++;
        if (class165.field2755 == null) {
            return false;
        }
        if (class25.field911 == null) {
            if (class301.field4500) {
                if (!class165.field2755.method479(116, 1)) {
                    return false;
                }
                class165.field2755.method480(class126.field2299.field1397, (byte) 70, 1, 0);
                class445.field6405 = 0;
                class301.field4500 = false;
                class528.field7440++;
            }
            class126.field2299.field1393 = 0;
            if (class126.field2299.method3653((byte) -81)) {
                if (!class165.field2755.method479(116, 1)) {
                    return false;
                }
                class165.field2755.method480(class126.field2299.field1397, (byte) 120, 1, 1);
                class445.field6405 = 0;
                class528.field7440++;
            }
            class301.field4500 = true;
            class85[] var1 = class57.method669(25);
            int var2 = class126.field2299.method3658((byte) -10);
            if (var2 < 0 || var1.length <= var2) {
                throw new IOException("invo:" + var2 + " ip:" + class126.field2299.field1393);
            }
            class25.field911 = var1[var2];
            class478.field6872 = class25.field911.field1614;
        }
        if (class478.field6872 == -1) {
            if (!class165.field2755.method479(126, 1)) {
                return false;
            }
            class165.field2755.method480(class126.field2299.field1397, (byte) 87, 1, 0);
            class445.field6405 = 0;
            class528.field7440++;
            class478.field6872 = class126.field2299.field1397[0] & 0xFF;
        }
        if (class478.field6872 == -2) {
            if (!class165.field2755.method479(115, 2)) {
                return false;
            }
            class165.field2755.method480(class126.field2299.field1397, (byte) 87, 2, 0);
            class126.field2299.field1393 = 0;
            class478.field6872 = class126.field2299.method723((byte) -25);
            class528.field7440 += 2;
            class445.field6405 = 0;
        }
        if (class478.field6872 > 0) {
            if (!class165.field2755.method479(121, class478.field6872)) {
                return false;
            }
            class126.field2299.field1393 = 0;
            class165.field2755.method480(class126.field2299.field1397, (byte) 76, class478.field6872, 0);
            class445.field6405 = 0;
            class528.field7440 += class478.field6872;
        }
        class158.field2698 = class635.field9123;
        class635.field9123 = class547.field7769;
        class547.field7769 = class25.field911;
        if (class8.field524 == class25.field911) {
            class502.method2992(class532.field7457, 100);
            class25.field911 = null;
            return true;
        } else if (class637.field9181 == class25.field911) {
            boolean var3 = class126.field2299.method732(-559537960) == 1;
            String var4 = class126.field2299.method747(14598);
            String var5 = var4;
            if (var3) {
                var5 = class126.field2299.method747(14598);
            }
            long var6 = (long) class126.field2299.method723((byte) -25);
            long var8 = (long) class126.field2299.method740((byte) 73);
            int var10 = class126.field2299.method732(-559537960);
            int var11 = class126.field2299.method723((byte) -25);
            long var12 = (var6 << 32) + var8;
            boolean var14 = false;
            int var15 = 0;
            while (true) {
                if (var15 >= 100) {
                    if (var10 <= 1 && class350.method2268(var5, true)) {
                        var14 = true;
                    }
                    break;
                }
                if (class335.field5018[var15] == var12) {
                    var14 = true;
                    break;
                }
                var15++;
            }
            if (!var14 && class368.field5459 == 0) {
                class335.field5018[class295.field4415] = var12;
                class295.field4415 = (class295.field4415 + 1) % 100;
                String var16 = class379.field5606.method2369(var11, (byte) -62).method614((byte) -41, class126.field2299);
                if (var10 == 2) {
                    class569.method3285(false, "<img=1>" + var5, var11, "<img=1>" + var4, var4, 0, var16, 18, null);
                } else if (var10 == 1) {
                    class569.method3285(false, "<img=0>" + var5, var11, "<img=0>" + var4, var4, 0, var16, 18, null);
                } else {
                    class569.method3285(false, var5, var11, var4, var4, 0, var16, 18, null);
                }
            }
            class25.field911 = null;
            return true;
        } else if (class629.field9069 == class25.field911) {
            int var17 = class126.field2299.method734((byte) -23);
            int var18 = class126.field2299.method753(true);
            if (class629.method3600(var18, (byte) 92)) {
                class611.field8893 = var17;
            }
            class25.field911 = null;
            return true;
        } else if (class704.field9894 == class25.field911) {
            int var19 = class126.field2299.method723((byte) -25);
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = class126.field2299.method732(-559537960);
            int var21 = class126.field2299.method723((byte) -25);
            int var22 = class126.field2299.method732(-559537960);
            class56.method651(var22, -7529, var21, var20, var19);
            class25.field911 = null;
            return true;
        } else if (class266.field3943 == class25.field911) {
            class362.field5376 = class126.field2299.method737(128) << 3;
            class326.field4777 = class126.field2299.method734((byte) -23);
            class639.field9195 = class126.field2299.method692(-107) << 3;
            while (class478.field6872 > class126.field2299.field1393) {
                class527 var23 = class306.method2009(0)[class126.field2299.method732(-559537960)];
                class502.method2992(var23, 96);
            }
            class25.field911 = null;
            return true;
        } else if (class25.field911 == class168.field2799) {
            String var24 = class126.field2299.method747(14598);
            String var25 = class11.method289(class357.method2290(class126.field2299, 32767), (byte) -14);
            class428.method2605(var24, var24, var24, 6, 0, 4096, var25);
            class25.field911 = null;
            return true;
        } else if (class25.field911 == class248.field3728) {
            String var26 = class126.field2299.method747(14598);
            boolean var27 = class126.field2299.method732(-559537960) == 1;
            String var28;
            if (var27) {
                var28 = class126.field2299.method747(14598);
            } else {
                var28 = var26;
            }
            int var29 = class126.field2299.method723((byte) -25);
            byte var30 = class126.field2299.method710((byte) 43);
            boolean var31 = false;
            if (var30 == -128) {
                var31 = true;
            }
            if (var31) {
                if (class394.field5756 == 0) {
                    class25.field911 = null;
                    return true;
                }
                boolean var32 = false;
                int var33;
                for (var33 = 0; var33 < class394.field5756 && (!class396.field5780[var33].field7088.equals(var28) || class396.field5780[var33].field7097 != var29); var33++) {
                }
                if (var33 < class394.field5756) {
                    while ((class394.field5756 - 1) > var33) {
                        class396.field5780[var33] = class396.field5780[var33 + 1];
                        var33++;
                    }
                    class394.field5756--;
                    class396.field5780[class394.field5756] = null;
                }
            } else {
                String var34 = class126.field2299.method747(14598);
                class498 var35 = new class498();
                var35.field7088 = var28;
                var35.field7096 = var26;
                var35.field7092 = class655.method3728(var35.field7088, true);
                var35.field7091 = var30;
                var35.field7100 = var34;
                var35.field7097 = var29;
                int var36;
                for (var36 = class394.field5756 - 1; var36 >= 0; var36--) {
                    int var37 = class396.field5780[var36].field7092.compareTo(var35.field7092);
                    if (var37 == 0) {
                        class396.field5780[var36].field7097 = var29;
                        class396.field5780[var36].field7091 = var30;
                        class396.field5780[var36].field7100 = var34;
                        if (var28.equals(class532.field7456.field8631)) {
                            class248.field3730 = var30;
                        }
                        class25.field911 = null;
                        class165.field2751 = class104.field1844;
                        return true;
                    }
                    if (var37 < 0) {
                        break;
                    }
                }
                if (class394.field5756 >= class396.field5780.length) {
                    class25.field911 = null;
                    return true;
                }
                for (int var38 = class394.field5756 - 1; var38 > var36; var38--) {
                    class396.field5780[var38 + 1] = class396.field5780[var38];
                }
                if (class394.field5756 == 0) {
                    class396.field5780 = new class498[100];
                }
                class396.field5780[var36 + 1] = var35;
                class394.field5756++;
                if (var28.equals(class532.field7456.field8631)) {
                    class248.field3730 = var30;
                }
            }
            class165.field2751 = class104.field1844;
            class25.field911 = null;
            return true;
        } else if (class395.field5773 == class25.field911) {
            int var39 = class126.field2299.method752(-27278);
            int var40 = class126.field2299.method730(-76);
            int var41 = class126.field2299.method732(-559537960);
            String var42 = "";
            String var43 = var42;
            if ((var41 & 0x1) != 0) {
                var42 = class126.field2299.method747(14598);
                if ((var41 & 0x2) == 0) {
                    var43 = var42;
                } else {
                    var43 = class126.field2299.method747(14598);
                }
            }
            String var44 = class126.field2299.method747(14598);
            if (var39 == 99) {
                class686.method3857(var44, 60);
            } else if (var43.equals("") || !class350.method2268(var43, true)) {
                class428.method2605(var43, var42, var42, var39, var40, 4096, var44);
            } else {
                class25.field911 = null;
                return true;
            }
            class25.field911 = null;
            return true;
        } else if (class694.field9766 == class25.field911) {
            class502.method2992(class35.field1006, 80);
            class25.field911 = null;
            return true;
        } else if (class25.field911 == class145.field2520) {
            int var45 = class126.field2299.method723((byte) -25);
            int var46 = class126.field2299.method730(118);
            if (class629.method3600(var45, (byte) 111)) {
                class601 var47 = (class601) class78.field1572.method2596((long) var46, 57);
                if (var47 != null) {
                    class101.method937((byte) -71, false, true, var47);
                }
                if (class265.field3940 != null) {
                    class531.method3088(class265.field3940, (byte) 62);
                    class265.field3940 = null;
                }
            }
            class25.field911 = null;
            return true;
        } else if (class334.field4950 == class25.field911) {
            class502.method2992(class70.field1473, 51);
            class25.field911 = null;
            return true;
        } else if (class9.field544 == class25.field911) {
            int var48 = class126.field2299.method723((byte) -25);
            class602 var49;
            if (class422.field6096 == var48) {
                var49 = class532.field7456;
            } else {
                var49 = class59.field1341[var48];
            }
            if (var49 == null) {
                class25.field911 = null;
                return true;
            }
            int var50 = class126.field2299.method723((byte) -25);
            int var51 = class126.field2299.method732(-559537960);
            boolean var52 = (var50 & 0x8000) != 0;
            if (var49.field8631 != null && var49.field8621 != null) {
                boolean var53 = false;
                if (var51 <= 1) {
                    if (!var52 && (class301.field4474 && !class231.field3466 || class436.field6299)) {
                        var53 = true;
                    } else if (class350.method2268(var49.field8631, true)) {
                        var53 = true;
                    }
                }
                if (!var53 && class368.field5459 == 0) {
                    int var54 = -1;
                    String var55;
                    if (var52) {
                        var50 &= 0x7FFF;
                        class691 var56 = class391.method2411(-32605, class126.field2299);
                        var54 = var56.field9753;
                        var55 = var56.field9755.method614((byte) -41, class126.field2299);
                    } else {
                        var55 = class11.method289(class357.method2290(class126.field2299, 32767), (byte) -14);
                    }
                    var49.field8756 = var55.trim();
                    var49.field8732 = var50 >> 8;
                    var49.field8709 = 150;
                    var49.field8754 = var50 & 0xFF;
                    int var57;
                    if (var51 == 1 || var51 == 2) {
                        var57 = var52 ? 17 : 1;
                    } else {
                        var57 = var52 ? 17 : 2;
                    }
                    if (var51 == 2) {
                        class569.method3285(false, "<img=1>" + var49.method3441(false, -29971), var54, "<img=1>" + var49.method3437(true, true), var49.field8657, 0, var55, var57, null);
                    } else if (var51 == 1) {
                        class569.method3285(false, "<img=0>" + var49.method3441(false, -29971), var54, "<img=0>" + var49.method3437(true, true), var49.field8657, 0, var55, var57, null);
                    } else {
                        class569.method3285(false, var49.method3441(false, -29971), var54, var49.method3437(true, true), var49.field8657, 0, var55, var57, null);
                    }
                }
            }
            class25.field911 = null;
            return true;
        } else if (class400.field5810 == class25.field911) {
            class199.method1426(false, 0);
            class25.field911 = null;
            return true;
        } else if (class50.field1174 == class25.field911) {
            int var58 = class126.field2299.method724(51);
            int var59 = class126.field2299.method753(true);
            int var60 = class126.field2299.method723((byte) -25);
            if (class629.method3600(var60, (byte) 109)) {
                if (var58 == 2) {
                    class696.method3895((byte) 24);
                }
                class361.field5368 = var59;
                class295.method1965(-6, var59);
                class268.method1751(false, false);
                class683.method3845(class361.field5368);
                for (int var61 = 0; var61 < 100; var61++) {
                    class248.field3731[var61] = true;
                }
            }
            class25.field911 = null;
            return true;
        } else if (class439.field6326 == class25.field911) {
            boolean var62 = class126.field2299.method732(-559537960) == 1;
            byte[] var63 = new byte[class478.field6872 - 1];
            class126.field2299.method704(0, class478.field6872 - 1, var63, 0);
            class304.method1996(var62, var63, 0);
            class25.field911 = null;
            return true;
        } else if (class612.field8914 == class25.field911) {
            int var64 = class126.field2299.method730(-88);
            class432.field6237 = class604.field8775.method405(var64, (byte) -76);
            class25.field911 = null;
            return true;
        } else if (class387.field5666 == class25.field911) {
            int var65 = class126.field2299.method730(-77);
            int var66 = class126.field2299.method731(26585);
            if (class629.method3600(var66, (byte) 92)) {
                class514.method3031((byte) 64, class422.field6096, 5, var65, 0);
            }
            class25.field911 = null;
            return true;
        } else if (class25.field911 == class118.field2119) {
            class156.field2672 = class126.field2299.method751(255);
            class301.field4474 = class126.field2299.method732(-559537960) == 1;
            class25.field911 = null;
            return true;
        } else if (class487.field6981 == class25.field911) {
            int var67 = class126.field2299.method730(118);
            int var68 = class126.field2299.method734((byte) -23);
            int var69 = class126.field2299.method732(-559537960);
            class519.field7342[var68] = var67;
            class57.field1327[var68] = var69;
            class157.field2686[var68] = 1;
            int var70 = class8.field530[var68] - 1;
            for (int var71 = 0; var71 < var70; var71++) {
                if (var67 >= class578.field8402[var71]) {
                    class157.field2686[var68] = var71 + 2;
                }
            }
            class29.field937[class481.method2919(class219.field3324++, 31)] = var68;
            class25.field911 = null;
            return true;
        } else if (class507.field7184 == class25.field911) {
            if (class361.field5368 != -1) {
                class467.method2786(class361.field5368, 32768, 0);
            }
            class25.field911 = null;
            return true;
        } else if (class25.field911 == class161.field2719) {
            int var72 = class126.field2299.method713(127);
            int var73 = class126.field2299.method719((byte) -109);
            int var74 = class126.field2299.method731(26585);
            int var75 = class126.field2299.method723((byte) -25);
            int var76 = class126.field2299.method723((byte) -25);
            boolean var77 = (var72 & 0x80) != 0;
            if (var73 >> 30 != 0) {
                int var109 = var73 >> 28 & 0x3;
                int var110 = ((var73 & 0xFFFC38B) >> 14) - class33.field967;
                int var111 = (var73 & 0x3FFF) - class323.field4749;
                if (var110 >= 0 && var111 >= 0 && var110 < class675.field9604 && class218.field3316 > var111) {
                    int var112 = var110 * 512 + 256;
                    int var113 = var111 * 512 + 256;
                    int var114 = var109;
                    if (var109 < 3 && class89.method868(5125, var110, var111)) {
                        var114 = var109 + 1;
                    }
                    class515 var115 = new class515(var74, 0, class336.field5031, var109, var114, var112, class460.method2757(0, var113, var109, var112) - var76, var113, var110, var110, var111, var111, var72 & 0x7);
                    class140.field2467.method1229(new class434(var115), (byte) 120);
                }
            } else if (var73 >> 29 != 0) {
                int var93 = var73 & 0xFFFF;
                class436 var94 = (class436) class208.field3179.method2596((long) var93, 58);
                if (var94 != null) {
                    if (var74 == 65535) {
                        var74 = -1;
                    }
                    class22 var95 = var94.field6298;
                    boolean var96 = true;
                    int var97 = var77 ? var95.field8676 : var95.field8723;
                    if (var74 != -1 && var97 != -1) {
                        if (var74 == var97) {
                            class526 var102 = class261.field3825.method1313((byte) -119, var74);
                            if (var102.field7423 && var102.field7427 != -1) {
                                class138 var103 = class357.field5338.method2099(var102.field7427, true);
                                int var104 = var103.field2434;
                                if (var104 == 0 || var104 == 2) {
                                    var96 = false;
                                } else if (var104 == 1) {
                                    var96 = true;
                                }
                            }
                        } else {
                            class526 var98 = class261.field3825.method1313((byte) -128, var74);
                            class526 var99 = class261.field3825.method1313((byte) -109, var97);
                            if (var98.field7427 != -1 && var99.field7427 != -1) {
                                class138 var100 = class357.field5338.method2099(var98.field7427, true);
                                class138 var101 = class357.field5338.method2099(var99.field7427, true);
                                if (var100.field2441 < var101.field2441) {
                                    var96 = false;
                                }
                            }
                        }
                    }
                    if (var96) {
                        if (var77) {
                            var95.field8717 = 1;
                            var95.field8693 = 0;
                            var95.field8713 = var76;
                            var95.field8676 = var74;
                            var95.field8744 = 0;
                            var95.field8704 = var72 & 0x7;
                            var95.field8731 = class336.field5031 + var75;
                            if (var95.field8731 > class336.field5031) {
                                var95.field8744 = -1;
                            }
                            if (var95.field8676 != -1 && class336.field5031 == var95.field8731) {
                                int var107 = class261.field3825.method1313((byte) -119, var95.field8676).field7427;
                                if (var107 != -1) {
                                    class138 var108 = class357.field5338.method2099(var107, true);
                                    if (var108 != null && var108.field2440 != null) {
                                        class536.method3101(0, (byte) 126, var108, var95.field9815, var95.field9806, var95.field9814, false);
                                    }
                                }
                            }
                        } else {
                            var95.field8700 = 0;
                            var95.field8678 = 0;
                            var95.field8707 = 1;
                            var95.field8723 = var74;
                            var95.field8682 = var72 & 0x7;
                            var95.field8771 = class336.field5031 + var75;
                            var95.field8743 = var76;
                            if (var95.field8771 > class336.field5031) {
                                var95.field8700 = -1;
                            }
                            if (var95.field8723 != -1 && class336.field5031 == var95.field8771) {
                                int var105 = class261.field3825.method1313((byte) -117, var95.field8723).field7427;
                                if (var105 != -1) {
                                    class138 var106 = class357.field5338.method2099(var105, true);
                                    if (var106 != null && var106.field2440 != null) {
                                        class536.method3101(0, (byte) 127, var106, var95.field9815, var95.field9806, var95.field9814, false);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if ((var73 >> 28) != 0) {
                int var78 = var73 & 0xFFFF;
                class602 var79;
                if (class422.field6096 == var78) {
                    var79 = class532.field7456;
                } else {
                    var79 = class59.field1341[var78];
                }
                if (var79 != null) {
                    if (var74 == 65535) {
                        var74 = -1;
                    }
                    boolean var80 = true;
                    int var81 = var77 ? var79.field8676 : var79.field8723;
                    if (var74 != -1 && var81 != -1) {
                        if (var74 == var81) {
                            class526 var82 = class261.field3825.method1313((byte) -117, var74);
                            if (var82.field7423 && var82.field7427 != -1) {
                                class138 var83 = class357.field5338.method2099(var82.field7427, true);
                                int var84 = var83.field2434;
                                if (var84 == 0 || var84 == 2) {
                                    var80 = false;
                                } else if (var84 == 1) {
                                    var80 = true;
                                }
                            }
                        } else {
                            class526 var85 = class261.field3825.method1313((byte) -119, var74);
                            class526 var86 = class261.field3825.method1313((byte) -121, var81);
                            if (var85.field7427 != -1 && var86.field7427 != -1) {
                                class138 var87 = class357.field5338.method2099(var85.field7427, true);
                                class138 var88 = class357.field5338.method2099(var86.field7427, true);
                                if (var88.field2441 > var87.field2441) {
                                    var80 = false;
                                }
                            }
                        }
                    }
                    if (var80) {
                        if (var77) {
                            var79.field8731 = class336.field5031 + var75;
                            var79.field8693 = 0;
                            var79.field8744 = 0;
                            var79.field8717 = 1;
                            var79.field8713 = var76;
                            var79.field8704 = var72 & 0x7;
                            var79.field8676 = var74;
                            if (class336.field5031 < var79.field8731) {
                                var79.field8744 = -1;
                            }
                            if (var79.field8676 == 65535) {
                                var79.field8676 = -1;
                            }
                            if (var79.field8676 != -1 && class336.field5031 == var79.field8731) {
                                int var91 = class261.field3825.method1313((byte) -108, var79.field8676).field7427;
                                if (var91 != -1) {
                                    class138 var92 = class357.field5338.method2099(var91, true);
                                    if (var92 != null && var92.field2440 != null) {
                                        class536.method3101(0, (byte) 125, var92, var79.field9815, var79.field9806, var79.field9814, class532.field7456 == var79);
                                    }
                                }
                            }
                        } else {
                            var79.field8707 = 1;
                            var79.field8682 = var72 & 0x7;
                            var79.field8723 = var74;
                            var79.field8678 = 0;
                            var79.field8743 = var76;
                            var79.field8771 = class336.field5031 + var75;
                            var79.field8700 = 0;
                            if (class336.field5031 < var79.field8771) {
                                var79.field8700 = -1;
                            }
                            if (var79.field8723 == 65535) {
                                var79.field8723 = -1;
                            }
                            if (var79.field8723 != -1 && class336.field5031 == var79.field8771) {
                                int var89 = class261.field3825.method1313((byte) -125, var79.field8723).field7427;
                                if (var89 != -1) {
                                    class138 var90 = class357.field5338.method2099(var89, true);
                                    if (var90 != null && var90.field2440 != null) {
                                        class536.method3101(0, (byte) 123, var90, var79.field9815, var79.field9806, var79.field9814, class532.field7456 == var79);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class25.field911 = null;
            return true;
        } else if (class49.field1163 == class25.field911) {
            boolean var116 = class126.field2299.method732(-559537960) == 1;
            String var117 = class126.field2299.method747(14598);
            String var118 = var117;
            if (var116) {
                var118 = class126.field2299.method747(14598);
            }
            int var119 = class126.field2299.method732(-559537960);
            boolean var120 = false;
            if (var119 <= 1) {
                if (!(!class301.field4474 || class231.field3466) || class436.field6299) {
                    var120 = true;
                } else if (var119 <= 1 && class350.method2268(var118, true)) {
                    var120 = true;
                }
            }
            if (!var120 && class368.field5459 == 0) {
                String var121 = class11.method289(class357.method2290(class126.field2299, 32767), (byte) -14);
                if (var119 == 2) {
                    class569.method3285(false, "<img=1>" + var118, -1, "<img=1>" + var117, var117, 0, var121, 24, null);
                } else if (var119 == 1) {
                    class569.method3285(false, "<img=0>" + var118, -1, "<img=0>" + var117, var117, 0, var121, 24, null);
                } else {
                    class569.method3285(false, var118, -1, var117, var117, 0, var121, 24, null);
                }
            }
            class25.field911 = null;
            return true;
        } else if (class467.field6617 == class25.field911) {
            class639.field9195 = class126.field2299.method692(-116) << 3;
            class326.field4777 = class126.field2299.method734((byte) -23);
            class362.field5376 = class126.field2299.method737(128) << 3;
            for (class38 var122 = (class38) class409.field5924.method2597((byte) -115); var122 != null; var122 = (class38) class409.field5924.method2594((byte) -122)) {
                int var124 = (int) (var122.field6132 >> 28 & 0x3L);
                int var125 = (int) (var122.field6132 & 0x3FFFL);
                int var126 = var125 - class33.field967;
                int var127 = (int) (var122.field6132 >> 14 & 0x3FFFL);
                int var128 = var127 - class323.field4749;
                if (class326.field4777 == var124 && class639.field9195 <= var126 && var126 < class639.field9195 + 8 && class362.field5376 <= var128 && class362.field5376 + 8 > var128) {
                    var122.method2588(300);
                    if (var126 >= 0 && var128 >= 0 && class675.field9604 > var126 && class218.field3316 > var128) {
                        class631.method3606(var128, (byte) 0, var126, class326.field4777);
                    }
                }
            }
            for (class616 var123 = (class616) class81.field1588.method1224(-2); var123 != null; var123 = (class616) class81.field1588.method1232(-2)) {
                if (var123.field8953 >= class639.field9195 && var123.field8953 < (class639.field9195 + 8) && var123.field8949 >= class362.field5376 && var123.field8949 < class362.field5376 + 8 && class326.field4777 == var123.field8952) {
                    var123.field8951 = 0;
                }
            }
            class25.field911 = null;
            return true;
        } else if (class607.field8835 == class25.field911) {
            class126.field2299.field1393 += 28;
            if (class126.field2299.method694(false)) {
                class462.method2768(class126.field2299, 81, class126.field2299.field1393 - 28);
            }
            class25.field911 = null;
            return true;
        } else if (class605.field8795 == class25.field911) {
            class502.method2992(class5.field475, 28);
            class25.field911 = null;
            return true;
        } else if (class423.field6121 == class25.field911) {
            class113.field2038.method1123(-3451);
            class679.field9636 += 32;
            class25.field911 = null;
            return true;
        } else if (class264.field3866 == class25.field911) {
            int var129 = class126.field2299.method732(-559537960);
            boolean var130 = (var129 & 0x1) == 1;
            String var131 = class126.field2299.method747(14598);
            String var132 = class126.field2299.method747(14598);
            if (var132.equals("")) {
                var132 = var131;
            }
            String var133 = class126.field2299.method747(14598);
            String var134 = class126.field2299.method747(14598);
            if (var134.equals("")) {
                var134 = var133;
            }
            if (var130) {
                for (int var135 = 0; var135 < class296.field4436; var135++) {
                    if (class38.field1057[var135].equals(var134)) {
                        class518.field7306[var135] = var131;
                        class38.field1057[var135] = var132;
                        class291.field4370[var135] = var133;
                        class34.field974[var135] = var134;
                        break;
                    }
                }
            } else {
                class518.field7306[class296.field4436] = var131;
                class38.field1057[class296.field4436] = var132;
                class291.field4370[class296.field4436] = var133;
                class34.field974[class296.field4436] = var134;
                class234.field3488[class296.field4436] = class481.method2919(2, var129) == 2;
                class296.field4436++;
            }
            class25.field911 = null;
            class63.field1431 = class104.field1844;
            return true;
        } else if (class25.field911 == class217.field3301) {
            class85.method852(-119, class75.field1520);
            class25.field911 = null;
            return false;
        } else if (class25.field911 == class108.field1860) {
            int var136 = class126.field2299.method732(-559537960);
            int var137 = var136 >> 5;
            int var138 = var136 & 0x1F;
            if (var138 == 0) {
                class565.field8254[var137] = null;
                class25.field911 = null;
                return true;
            }
            class539 var139 = new class539();
            var139.field7539 = var138;
            var139.field7528 = class126.field2299.method732(-559537960);
            if (var139.field7528 >= 0 && class513.field7239.length > var139.field7528) {
                if (var139.field7539 == 1 || var139.field7539 == 10) {
                    var139.field7536 = class126.field2299.method723((byte) -25);
                    class126.field2299.field1393 += 6;
                } else if (var139.field7539 >= 2 && var139.field7539 <= 6) {
                    if (var139.field7539 == 2) {
                        var139.field7535 = 256;
                        var139.field7537 = 256;
                    }
                    if (var139.field7539 == 3) {
                        var139.field7535 = 256;
                        var139.field7537 = 0;
                    }
                    if (var139.field7539 == 4) {
                        var139.field7535 = 256;
                        var139.field7537 = 512;
                    }
                    if (var139.field7539 == 5) {
                        var139.field7537 = 256;
                        var139.field7535 = 0;
                    }
                    if (var139.field7539 == 6) {
                        var139.field7537 = 256;
                        var139.field7535 = 512;
                    }
                    var139.field7539 = 2;
                    var139.field7534 = class126.field2299.method732(-559537960);
                    var139.field7537 += class126.field2299.method723((byte) -25) - class33.field967 << 9;
                    var139.field7535 += class126.field2299.method723((byte) -25) - class323.field4749 << 9;
                    var139.field7533 = class126.field2299.method732(-559537960) << 2;
                    var139.field7529 = class126.field2299.method723((byte) -25);
                }
                var139.field7530 = class126.field2299.method723((byte) -25);
                if (var139.field7530 == 65535) {
                    var139.field7530 = -1;
                }
                class565.field8254[var137] = var139;
            }
            class25.field911 = null;
            return true;
        } else if (class25.field911 == class225.field3372) {
            int var140 = class126.field2299.method729((byte) -28);
            int var141 = class126.field2299.method688((byte) -122);
            int var142 = class126.field2299.method731(26585);
            int var143 = class126.field2299.method732(-559537960);
            if (class629.method3600(var140, (byte) 103)) {
                class601 var144 = (class601) class78.field1572.method2596((long) var141, 93);
                if (var144 != null) {
                    class101.method937((byte) -71, false, var144.field8614 != var142, var144);
                }
                class605.method3481(var143, -1, var141, false, var142);
            }
            class25.field911 = null;
            return true;
        } else if (class25.field911 == class167.field2774) {
            class502.method2992(class11.field577, 90);
            class25.field911 = null;
            return true;
        } else if (class609.field8866 == class25.field911) {
            class25.field911 = null;
            return false;
        } else if (class666.field9549 == class25.field911) {
            int var145 = class126.field2299.method719((byte) -108);
            String var146 = class126.field2299.method747(14598);
            int var147 = class126.field2299.method729((byte) -80);
            if (class629.method3600(var147, (byte) 103)) {
                class290.method1938(var146, 1, var145);
            }
            class25.field911 = null;
            return true;
        } else if (class290.field4366 == class25.field911) {
            int var148 = class126.field2299.method690((byte) 14);
            int var149 = class126.field2299.method753(true);
            class113.field2038.method1120(var148, 115, var149);
            class25.field911 = null;
            return true;
        } else if (class25.field911 == class243.field3673) {
            class367.field5442 = class163.method1245(class126.field2299.method732(-559537960), 0);
            class25.field911 = null;
            return true;
        } else if (class78.field1568 == class25.field911) {
            int var150 = class126.field2299.method729((byte) -23);
            int var151 = class126.field2299.method723((byte) -25);
            int var152 = class126.field2299.method729((byte) -94);
            if (class629.method3600(var152, (byte) 102)) {
                class685.method3855(0, var150, var151, -72);
            }
            class25.field911 = null;
            return true;
        } else if (class66.field1443 == class25.field911) {
            int var153 = class126.field2299.method753(true);
            int var154 = class126.field2299.method688((byte) -82);
            int var155 = class126.field2299.method753(true);
            if (class629.method3600(var153, (byte) 104)) {
                class427.method2601(var155, var154, -5136);
            }
            class25.field911 = null;
            return true;
        } else if (class25.field911 == class211.field3232) {
            if (class413.field5977 != null) {
                class485.method2931(-1, class527.field7429.field2653, -1, false, (byte) -63);
            }
            byte[] var156 = new byte[class478.field6872];
            class126.field2299.method3651(0, -18797, class478.field6872, var156);
            String var157 = class255.method1692(0, var156, class478.field6872, -125);
            class566.method3276(var157, class90.field1654 == 1, 11574, class604.field8775, true);
            class25.field911 = null;
            return true;
        } else if (class703.field9888 == class25.field911) {
            class502.method2992(class373.field5550, 108);
            class25.field911 = null;
            return true;
        } else if (class25.field911 == class164.field2748) {
            int var158 = class126.field2299.method719((byte) -73);
            int var159 = class126.field2299.method729((byte) -36);
            if (var159 == 65535) {
                var159 = -1;
            }
            int var160 = class126.field2299.method729((byte) -24);
            if (class629.method3600(var160, (byte) 120)) {
                class514.method3031((byte) 64, var159, 2, var158, -1);
            }
            class25.field911 = null;
            return true;
        } else if (class25.field911 == class158.field2699) {
            class199.method1426(true, 0);
            class25.field911 = null;
            return true;
        } else if (class680.field9647 == class25.field911) {
            class85.method852(-122, false);
            class25.field911 = null;
            return false;
        } else if (class27.field918 == class25.field911) {
            class502.method2992(class14.field740, 43);
            class25.field911 = null;
            return true;
        } else if (class272.field4072 == class25.field911) {
            int var161 = class126.field2299.method753(true);
            int var162 = class126.field2299.method734((byte) -23);
            class113.field2038.method1126(var162, -257, var161);
            class25.field911 = null;
            return true;
        } else if (class342.field5083 == class25.field911) {
            int var163 = class126.field2299.method731(26585);
            int var164 = class126.field2299.method731(26585);
            int var165 = class126.field2299.method730(108);
            int var166 = class126.field2299.method723((byte) -25);
            if (class629.method3600(var164, (byte) 108)) {
                class220.method1523((byte) -121, (var163 << 16) + var166, var165);
            }
            class25.field911 = null;
            return true;
        } else if (class25.field911 == class177.field2891) {
            class326.field4777 = class126.field2299.method713(127);
            class639.field9195 = class126.field2299.method710((byte) 43) << 3;
            class362.field5376 = class126.field2299.method710((byte) 43) << 3;
            class25.field911 = null;
            return true;
        } else if (class25.field911 == class228.field3395) {
            boolean var167 = class126.field2299.method732(-559537960) == 1;
            String var168 = class126.field2299.method747(14598);
            String var169 = var168;
            if (var167) {
                var169 = class126.field2299.method747(14598);
            }
            int var170 = class126.field2299.method732(-559537960);
            int var171 = class126.field2299.method723((byte) -25);
            boolean var172 = false;
            if (var170 <= 1 && class350.method2268(var169, true)) {
                var172 = true;
            }
            if (!var172 && class368.field5459 == 0) {
                String var173 = class379.field5606.method2369(var171, (byte) -62).method614((byte) -41, class126.field2299);
                if (var170 == 2) {
                    class569.method3285(false, "<img=1>" + var169, var171, "<img=1>" + var168, var168, 0, var173, 25, null);
                } else if (var170 == 1) {
                    class569.method3285(false, "<img=0>" + var169, var171, "<img=0>" + var168, var168, 0, var173, 25, null);
                } else {
                    class569.method3285(false, var169, var171, var168, var168, 0, var173, 25, null);
                }
            }
            class25.field911 = null;
            return true;
        } else if (class454.field6481 == class25.field911) {
            int var174 = class126.field2299.method732(-559537960);
            if (class126.field2299.method732(-559537960) == 0) {
                class105.field1846[var174] = new class497();
            } else {
                class126.field2299.field1393--;
                class105.field1846[var174] = new class497(class126.field2299);
            }
            class25.field911 = null;
            class48.field1146 = class104.field1844;
            return true;
        } else if (class30.field950 == class25.field911) {
            class502.method2992(class519.field7341, 50);
            class25.field911 = null;
            return true;
        } else if (class485.field6946 == class25.field911) {
            class315.method2040((byte) 83);
            class25.field911 = null;
            return false;
        } else if (class518.field7308 == class25.field911) {
            class418.field6034 = class126.field2299.method732(-559537960);
            class25.field911 = null;
            class264.field3867 = class104.field1844;
            return true;
        } else if (class435.field6292 == class25.field911) {
            int var175 = class126.field2299.method723((byte) -25);
            int var176 = class126.field2299.method732(-559537960);
            int var177 = class126.field2299.method732(-559537960);
            int var178 = class126.field2299.method723((byte) -25) << 2;
            int var179 = class126.field2299.method732(-559537960);
            int var180 = class126.field2299.method732(-559537960);
            if (class629.method3600(var175, (byte) 90)) {
                class11.method293(var179, (byte) -67, var176, var178, var177, var180);
            }
            class25.field911 = null;
            return true;
        } else if (class672.field9571 == class25.field911) {
            String var181 = class126.field2299.method747(14598);
            int var182 = class126.field2299.method723((byte) -25);
            String var183 = class379.field5606.method2369(var182, (byte) -62).method614((byte) -41, class126.field2299);
            class569.method3285(false, var181, var182, var181, var181, 0, var183, 19, null);
            class25.field911 = null;
            return true;
        } else if (class515.field7290 == class25.field911) {
            int var184 = class126.field2299.method753(true);
            int var185 = class126.field2299.method731(26585);
            String var186 = class126.field2299.method747(14598);
            if (class629.method3600(var184, (byte) 102)) {
                class5.method245(false, var185, var186);
            }
            class25.field911 = null;
            return true;
        } else if (class77.field1563 == class25.field911) {
            int var187 = class126.field2299.method724(56);
            int var188 = class126.field2299.method723((byte) -25);
            int var189 = class126.field2299.method730(-59);
            if (class629.method3600(var188, (byte) 111)) {
                class614.method3524(-605, var187, var189);
            }
            class25.field911 = null;
            return true;
        } else if (class25.field911 == class127.field2311) {
            class502.method2992(class5.field482, 106);
            class25.field911 = null;
            return true;
        } else if (class550.field7801 == class25.field911) {
            int var190 = class126.field2299.method690((byte) 14);
            int var191 = class126.field2299.method729((byte) -99);
            int var192 = class126.field2299.method723((byte) -25);
            int var193 = class126.field2299.method729((byte) -49);
            int var194 = class126.field2299.method753(true);
            if (class629.method3600(var193, (byte) 121)) {
                class514.method3031((byte) 64, var192 << 16 | var191, 7, var190, var194);
            }
            class25.field911 = null;
            return true;
        } else if (class25.field911 == class2.field377) {
            class502.method2992(class502.field7144, 54);
            class25.field911 = null;
            return true;
        } else if (class70.field1478 == class25.field911) {
            int var195 = class126.field2299.method723((byte) -25);
            int var196 = class126.field2299.method723((byte) -25);
            int var197 = class126.field2299.method723((byte) -25);
            int var198 = class126.field2299.method723((byte) -25);
            if (class629.method3600(var195, (byte) 117) && class156.field2667[var196] != null) {
                for (int var199 = var197; var199 < var198; var199++) {
                    int var200 = class126.field2299.method740((byte) 98);
                    if (var199 < class156.field2667[var196].length && class156.field2667[var196][var199] != null) {
                        class156.field2667[var196][var199].field7679 = var200;
                    }
                }
            }
            class25.field911 = null;
            return true;
        } else if (class607.field8841 == class25.field911) {
            int var201 = class126.field2299.method690((byte) 14);
            int var202 = class126.field2299.method729((byte) -109);
            class113.field2038.method1126(var201, -257, var202);
            class25.field911 = null;
            return true;
        } else if (class84.field1605 == class25.field911) {
            if (class396.method2443(-10, class199.field3098)) {
                class482.field6915 = (int) ((float) class126.field2299.method723((byte) -25) * 2.5F);
            } else {
                class482.field6915 = class126.field2299.method723((byte) -25) * 30;
            }
            class25.field911 = null;
            class264.field3867 = class104.field1844;
            return true;
        } else if (class646.field9310 == class25.field911) {
            int var203 = class126.field2299.method753(true);
            if (var203 == 65535) {
                var203 = -1;
            }
            int var204 = class126.field2299.method753(true);
            int var205 = class126.field2299.method719((byte) -89);
            int var206 = class126.field2299.method719((byte) -99);
            if (class629.method3600(var204, (byte) 92)) {
                class239.method1588((byte) -75, var205, var206, var203);
                class110 var207 = class268.field3985.method258(var203, (byte) -67);
                class634.method3615(var207.field1992, var207.field1995, var207.field1942, (byte) -97, var206);
                class543.method3128(103, var207.field2001, var207.field1949, var206, var207.field1983);
            }
            class25.field911 = null;
            return true;
        } else if (class696.field9797 == class25.field911) {
            int var208 = class126.field2299.method729((byte) -119);
            if (var208 == 65535) {
                var208 = -1;
            }
            int var209 = class126.field2299.method753(true);
            int var210 = class126.field2299.method723((byte) -25);
            if (var210 == 65535) {
                var210 = -1;
            }
            int var211 = class126.field2299.method729((byte) -99);
            int var212 = class126.field2299.method690((byte) 14);
            if (class629.method3600(var211, (byte) 86)) {
                for (int var213 = var208; var213 <= var210; var213++) {
                    long var214 = ((long) var212 << 32) + (long) var213;
                    class615 var216 = (class615) class526.field7412.method2596(var214, 47);
                    class615 var217;
                    if (var216 != null) {
                        var217 = new class615(var216.field8941, var209);
                        var216.method2588(300);
                    } else if (var213 == -1) {
                        var217 = new class615(class415.method2533((byte) 97, var212).field7749.field8941, var209);
                    } else {
                        var217 = new class615(0, var209);
                    }
                    class526.field7412.method2598(var217, var214, (byte) 8);
                }
            }
            class25.field911 = null;
            return true;
        } else if (class25.field911 == class136.field2404) {
            class502.method2992(class666.field9548, 51);
            class25.field911 = null;
            return true;
        } else if (class614.field8930 == class25.field911) {
            boolean var218 = class126.field2299.method732(-559537960) == 1;
            String var219 = class126.field2299.method747(14598);
            String var220 = var219;
            if (var218) {
                var220 = class126.field2299.method747(14598);
            }
            long var221 = class126.field2299.method742(23386);
            long var223 = (long) class126.field2299.method723((byte) -25);
            long var225 = (long) class126.field2299.method740((byte) 110);
            int var227 = class126.field2299.method732(-559537960);
            int var228 = class126.field2299.method723((byte) -25);
            long var229 = (var223 << 32) + var225;
            boolean var231 = false;
            int var232 = 0;
            while (true) {
                if (var232 >= 100) {
                    if (var227 <= 1 && class350.method2268(var220, true)) {
                        var231 = true;
                    }
                    break;
                }
                if (class335.field5018[var232] == var229) {
                    var231 = true;
                    break;
                }
                var232++;
            }
            if (!var231 && class368.field5459 == 0) {
                class335.field5018[class295.field4415] = var229;
                class295.field4415 = (class295.field4415 + 1) % 100;
                String var233 = class379.field5606.method2369(var228, (byte) -62).method614((byte) -41, class126.field2299);
                if (var227 == 2) {
                    class569.method3285(false, "<img=1>" + var220, var228, "<img=1>" + var219, var219, 0, var233, 20, class220.method1524(var221, -6898));
                } else if (var227 == 1) {
                    class569.method3285(false, "<img=0>" + var220, var228, "<img=0>" + var219, var219, 0, var233, 20, class220.method1524(var221, -6898));
                } else {
                    class569.method3285(false, var220, var228, var219, var219, 0, var233, 20, class220.method1524(var221, -6898));
                }
            }
            class25.field911 = null;
            return true;
        } else if (class324.field4756 == class25.field911) {
            int var234 = class126.field2299.method730(86);
            int var235 = class126.field2299.method723((byte) -25);
            if (class629.method3600(var235, (byte) 99)) {
                if (var234 == -1) {
                    class266.field3950 = -1;
                    class488.field6995 = -1;
                } else {
                    int var236 = (var234 & 0xFFFF424) >> 14;
                    int var237 = var234 & 0x3FFF;
                    int var238 = var236 - class33.field967;
                    if (var238 < 0) {
                        var238 = 0;
                    } else if (var238 >= class675.field9604) {
                        var238 = class675.field9604;
                    }
                    int var239 = var237 - class323.field4749;
                    class266.field3950 = (var238 << 9) + 256;
                    if (var239 < 0) {
                        var239 = 0;
                    } else if (var239 >= class218.field3316) {
                        var239 = class218.field3316;
                    }
                    class488.field6995 = (var239 << 9) + 256;
                }
            }
            class25.field911 = null;
            return true;
        } else if (class32.field953 == class25.field911) {
            int var240 = class126.field2299.method730(-43);
            int var241 = class126.field2299.method723((byte) -25);
            int var242 = class126.field2299.method723((byte) -25);
            if (class629.method3600(var241, (byte) 107)) {
                class39.method555((byte) -116, var242, var240);
            }
            class25.field911 = null;
            return true;
        } else {
            if (arg0 > -35) {
                method2955(true);
            }
            if (class328.field4815 == class25.field911) {
                class502.method2992(class103.field1837, 93);
                class25.field911 = null;
                return true;
            } else if (class315.field4651 == class25.field911) {
                int var243 = class126.field2299.method729((byte) -110);
                int var244 = class126.field2299.method753(true);
                int var245 = class126.field2299.method690((byte) 14);
                int var246 = class126.field2299.method730(-50);
                if (class629.method3600(var244, (byte) 85)) {
                    class514.method3031((byte) 64, var243, 5, var246, var245);
                }
                class25.field911 = null;
                return true;
            } else if (class600.field8599 == class25.field911) {
                int var247 = class126.field2299.method753(true);
                int var248 = class126.field2299.method731(26585);
                int var249 = class126.field2299.method731(26585);
                int var250 = class126.field2299.method719((byte) -120);
                int var251 = class126.field2299.method729((byte) -85);
                if (class629.method3600(var251, (byte) 115)) {
                    class634.method3615(var249, var248, var247, (byte) -97, var250);
                }
                class25.field911 = null;
                return true;
            } else if (class323.field4738 == class25.field911) {
                int var252 = class126.field2299.method723((byte) -25);
                if (var252 == 65535) {
                    var252 = -1;
                }
                int var253 = class126.field2299.method732(-559537960);
                int var254 = class126.field2299.method723((byte) -25);
                int var255 = class126.field2299.method732(-559537960);
                class500.method2982(var255, 0, var254, false, var253, var252);
                class25.field911 = null;
                return true;
            } else if (class25.field911 == class175.field2882) {
                int var256 = class126.field2299.method723((byte) -25);
                if (class629.method3600(var256, (byte) 88)) {
                    class157.method1219((byte) 103);
                }
                class25.field911 = null;
                return true;
            } else if (class25.field911 == class222.field3348) {
                class362.method2308(class126.field2299, class604.field8775, 126, class478.field6872);
                class25.field911 = null;
                return true;
            } else if (class25.field911 == class185.field2975) {
                class144.method1152(class126.field2299, 72, class478.field6872);
                class25.field911 = null;
                return true;
            } else if (class301.field4479 == class25.field911) {
                int var257 = class126.field2299.method723((byte) -25);
                int var258 = class126.field2299.method732(-559537960);
                boolean var259 = (var258 & 0x1) == 1;
                class479.method2908(var259, true, var257);
                int var260 = class126.field2299.method723((byte) -25);
                for (int var261 = 0; var261 < var260; var261++) {
                    int var262 = class126.field2299.method723((byte) -25);
                    int var263 = class126.field2299.method732(-559537960);
                    if (var263 == 255) {
                        var263 = class126.field2299.method690((byte) 14);
                    }
                    class545.method3142(var262 - 1, var261, var263, var257, 0, var259);
                }
                class306.field4542[class481.method2919(31, class418.field6031++)] = var257;
                class25.field911 = null;
                return true;
            } else if (class44.field1101 == class25.field911) {
                class469.field6631 = class126.field2299.method721(-461515024);
                class264.field3867 = class104.field1844;
                class25.field911 = null;
                return true;
            } else if (class25.field911 == class102.field1811) {
                int var264 = class126.field2299.method731(26585);
                int var265 = class126.field2299.method723((byte) -25);
                String var266 = class126.field2299.method747(14598);
                if (class629.method3600(var265, (byte) 96)) {
                    class5.method245(false, var264, var266);
                }
                class25.field911 = null;
                return true;
            } else if (class39.field1061 == class25.field911) {
                int var267 = class126.field2299.method723((byte) -25);
                String var268 = class126.field2299.method747(14598);
                Object[] var269 = new Object[var268.length() + 1];
                for (int var270 = var268.length() - 1; var270 >= 0; var270--) {
                    if (var268.charAt(var270) == 's') {
                        var269[var270 + 1] = class126.field2299.method747(14598);
                    } else {
                        var269[var270 + 1] = Integer.valueOf(class126.field2299.method730(126));
                    }
                }
                var269[0] = Integer.valueOf(class126.field2299.method730(103));
                if (class629.method3600(var267, (byte) 91)) {
                    class476 var271 = new class476();
                    var271.field6842 = var269;
                    class683.method3847(var271);
                }
                class25.field911 = null;
                return true;
            } else if (class636.field9174 == class25.field911) {
                class165.field2751 = class104.field1844;
                if (class478.field6872 == 0) {
                    class25.field911 = null;
                    class150.field2577 = null;
                    class335.field5017 = null;
                    class394.field5756 = 0;
                    class396.field5780 = null;
                    return true;
                }
                class150.field2577 = class126.field2299.method747(14598);
                boolean var272 = class126.field2299.method732(-559537960) == 1;
                if (var272) {
                    class126.field2299.method747(14598);
                }
                long var273 = class126.field2299.method742(23386);
                class335.field5017 = class424.method2586(var273, (byte) -42);
                class611.field8894 = class126.field2299.method710((byte) 43);
                int var275 = class126.field2299.method732(-559537960);
                if (var275 == 255) {
                    class25.field911 = null;
                    return true;
                }
                class394.field5756 = var275;
                class498[] var276 = new class498[100];
                for (int var277 = 0; var277 < class394.field5756; var277++) {
                    var276[var277] = new class498();
                    var276[var277].field7096 = class126.field2299.method747(14598);
                    boolean var283 = class126.field2299.method732(-559537960) == 1;
                    if (var283) {
                        var276[var277].field7088 = class126.field2299.method747(14598);
                    } else {
                        var276[var277].field7088 = var276[var277].field7096;
                    }
                    var276[var277].field7092 = class655.method3728(var276[var277].field7088, true);
                    var276[var277].field7097 = class126.field2299.method723((byte) -25);
                    var276[var277].field7091 = class126.field2299.method710((byte) 43);
                    var276[var277].field7100 = class126.field2299.method747(14598);
                    if (var276[var277].field7088.equals(class532.field7456.field8631)) {
                        class248.field3730 = var276[var277].field7091;
                    }
                }
                boolean var278 = false;
                int var279 = class394.field5756;
                while (var279 > 0) {
                    boolean var280 = true;
                    var279--;
                    for (int var281 = 0; var281 < var279; var281++) {
                        if (var276[var281].field7092.compareTo(var276[var281 + 1].field7092) > 0) {
                            class498 var282 = var276[var281];
                            var276[var281] = var276[var281 + 1];
                            var280 = false;
                            var276[var281 + 1] = var282;
                        }
                    }
                    if (var280) {
                        break;
                    }
                }
                class396.field5780 = var276;
                class25.field911 = null;
                return true;
            } else if (class25.field911 == class112.field2015) {
                class24.method476(class126.field2299.method747(14598), (byte) -40);
                class25.field911 = null;
                return true;
            } else if (class438.field6319 == class25.field911) {
                int var284 = class126.field2299.method711(-120);
                int var285 = class126.field2299.method753(true);
                int var286 = class126.field2299.method688((byte) -117);
                if (class629.method3600(var285, (byte) 87)) {
                    class619.method3540(var284, (byte) -112, var286);
                }
                class25.field911 = null;
                return true;
            } else if (class25.field911 == class198.field3078) {
                String var287 = class126.field2299.method747(14598);
                int var288 = class126.field2299.method753(true);
                if (var288 == 65535) {
                    var288 = -1;
                }
                int var289 = class126.field2299.method734((byte) -23);
                int var290 = class126.field2299.method732(-559537960);
                if (var289 >= 1 && var289 <= 8) {
                    if (var287.equalsIgnoreCase("null")) {
                        var287 = null;
                    }
                    class61.field1388[var289 - 1] = var287;
                    class159.field2710[var289 - 1] = var288;
                    class230.field3461[var289 - 1] = var290 == 0;
                }
                class25.field911 = null;
                return true;
            } else if (class547.field7775 == class25.field911) {
                int var291 = class126.field2299.method731(26585);
                int var292 = class126.field2299.method713(122);
                int[] var293 = new int[4];
                for (int var294 = 0; var294 < 4; var294++) {
                    var293[var294] = class126.field2299.method753(true);
                }
                class436 var295 = (class436) class208.field3179.method2596((long) var291, 69);
                if (var295 != null) {
                    class686.method3859(var295.field6298, var293, false, var292);
                }
                class25.field911 = null;
                return true;
            } else if (class459.field6550 == class25.field911) {
                for (int var296 = 0; var296 < class59.field1341.length; var296++) {
                    if (class59.field1341[var296] != null) {
                        class59.field1341[var296].field8760 = null;
                        class59.field1341[var296].field8755 = -1;
                    }
                }
                for (int var297 = 0; var297 < class39.field1062; var297++) {
                    class459.field6542[var297].field6298.field8760 = null;
                    class459.field6542[var297].field6298.field8755 = -1;
                }
                class25.field911 = null;
                return true;
            } else if (class25.field911 == class137.field2425) {
                int var298 = class126.field2299.method753(true);
                int var299 = class126.field2299.method731(26585);
                if (var299 == 65535) {
                    var299 = -1;
                }
                int var300 = class126.field2299.method731(26585);
                if (var300 == 65535) {
                    var300 = -1;
                }
                int var301 = class126.field2299.method688((byte) -62);
                int var302 = class126.field2299.method719((byte) -85);
                if (class629.method3600(var298, (byte) 126)) {
                    for (int var303 = var300; var303 <= var299; var303++) {
                        long var304 = ((long) var302 << 32) + (long) var303;
                        class615 var306 = (class615) class526.field7412.method2596(var304, 45);
                        class615 var307;
                        if (var306 != null) {
                            var307 = new class615(var301, var306.field8934);
                            var306.method2588(300);
                        } else if (var303 == -1) {
                            var307 = new class615(var301, class415.method2533((byte) 127, var302).field7749.field8934);
                        } else {
                            var307 = new class615(var301, -1);
                        }
                        class526.field7412.method2598(var307, var304, (byte) 8);
                    }
                }
                class25.field911 = null;
                return true;
            } else if (class343.field5106 == class25.field911) {
                int var308 = class126.field2299.method723((byte) -25);
                if (class629.method3600(var308, (byte) 108)) {
                    class335.method2163((byte) 113);
                }
                class25.field911 = null;
                return true;
            } else if (class25.field911 == class156.field2663) {
                byte var309 = class126.field2299.method692(-116);
                int var310 = class126.field2299.method729((byte) -124);
                int var311 = class126.field2299.method723((byte) -25);
                if (class629.method3600(var310, (byte) 126)) {
                    class39.method555((byte) 123, var311, var309);
                }
                class25.field911 = null;
                return true;
            } else if (class5.field480 == class25.field911) {
                byte var312 = class126.field2299.method692(-127);
                int var313 = class126.field2299.method729((byte) -54);
                class113.field2038.method1120(var312, 22, var313);
                class25.field911 = null;
                return true;
            } else if (class37.field1049 == class25.field911) {
                int var314 = class126.field2299.method753(true);
                int var315 = class126.field2299.method729((byte) -60);
                int var316 = class126.field2299.method688((byte) -121);
                if (class629.method3600(var314, (byte) 125)) {
                    class646.method3683(var316, (byte) -3, var315);
                }
                class25.field911 = null;
                return true;
            } else if (class319.field4697 == class25.field911) {
                int var317 = class126.field2299.method688((byte) -75);
                int var318 = class126.field2299.method729((byte) -110);
                int var319 = class126.field2299.method690((byte) 14);
                if (class629.method3600(var318, (byte) 127)) {
                    class601 var320 = (class601) class78.field1572.method2596((long) var319, 103);
                    class601 var321 = (class601) class78.field1572.method2596((long) var317, 112);
                    if (var321 != null) {
                        class101.method937((byte) -71, false, var320 == null || var320.field8614 != var321.field8614, var321);
                    }
                    if (var320 != null) {
                        var320.method2588(300);
                        class78.field1572.method2598(var320, (long) var317, (byte) 8);
                    }
                    class545 var322 = class415.method2533((byte) 103, var319);
                    if (var322 != null) {
                        class531.method3088(var322, (byte) 69);
                    }
                    class545 var323 = class415.method2533((byte) -122, var317);
                    if (var323 != null) {
                        class531.method3088(var323, (byte) 93);
                        class367.method2321(true, (byte) -41, var323);
                    }
                    if (class361.field5368 != -1) {
                        class467.method2786(class361.field5368, 32768, 1);
                    }
                }
                class25.field911 = null;
                return true;
            } else if (class268.field3975 == class25.field911) {
                int var324 = class126.field2299.method690((byte) 14);
                int var325 = class126.field2299.method753(true);
                int var326 = class126.field2299.method723((byte) -25);
                if (class629.method3600(var325, (byte) 87)) {
                    class432.method2630(true, var324, var326);
                }
                class25.field911 = null;
                return true;
            } else if (class98.field1749 == class25.field911) {
                class676.field9609 = class478.field6872 <= 2 ? class265.field3901.method1733(255, class140.field2466) : class126.field2299.method747(14598);
                class338.field5049 = class478.field6872 > 0 ? class126.field2299.method723((byte) -25) : -1;
                if (class338.field5049 == 65535) {
                    class338.field5049 = -1;
                }
                class25.field911 = null;
                return true;
            } else if (class417.field6024 == class25.field911) {
                int var327 = class126.field2299.method723((byte) -25);
                int var328 = class126.field2299.method732(-559537960);
                int var329 = class126.field2299.method732(-559537960);
                int var330 = class126.field2299.method723((byte) -25) << 2;
                int var331 = class126.field2299.method732(-559537960);
                int var332 = class126.field2299.method732(-559537960);
                if (class629.method3600(var327, (byte) 86)) {
                    class146.method1166(var330, (byte) -99, var331, var332, var328, true, var329);
                }
                class25.field911 = null;
                return true;
            } else if (class350.field5257 == class25.field911) {
                class296.field4436 = class126.field2299.method732(-559537960);
                for (int var333 = 0; var333 < class296.field4436; var333++) {
                    class518.field7306[var333] = class126.field2299.method747(14598);
                    class38.field1057[var333] = class126.field2299.method747(14598);
                    if (class38.field1057[var333].equals("")) {
                        class38.field1057[var333] = class518.field7306[var333];
                    }
                    class291.field4370[var333] = class126.field2299.method747(14598);
                    class34.field974[var333] = class126.field2299.method747(14598);
                    if (class34.field974[var333].equals("")) {
                        class34.field974[var333] = class291.field4370[var333];
                    }
                    class234.field3488[var333] = false;
                }
                class63.field1431 = class104.field1844;
                class25.field911 = null;
                return true;
            } else if (class441.field6344 == class25.field911) {
                while (class126.field2299.field1393 < class478.field6872) {
                    boolean var344 = class126.field2299.method732(-559537960) == 1;
                    String var345 = class126.field2299.method747(14598);
                    String var346 = class126.field2299.method747(14598);
                    int var347 = class126.field2299.method723((byte) -25);
                    int var348 = class126.field2299.method732(-559537960);
                    String var349 = "";
                    boolean var350 = false;
                    if (var347 > 0) {
                        var349 = class126.field2299.method747(14598);
                        var350 = class126.field2299.method732(-559537960) == 1;
                    }
                    for (int var351 = 0; var351 < class164.field2749; var351++) {
                        if (var344) {
                            if (var346.equals(class343.field5109[var351])) {
                                class343.field5109[var351] = var345;
                                class673.field9579[var351] = var346;
                                var345 = null;
                                break;
                            }
                        } else if (var345.equals(class343.field5109[var351])) {
                            if (class706.field9939[var351] != var347) {
                                boolean var352 = true;
                                for (class208 var353 = (class208) class195.field3065.method3317(-121); var353 != null; var353 = (class208) class195.field3065.method3321(-121)) {
                                    if (var353.field3181.equals(var345)) {
                                        if (var347 != 0 && var353.field3180 == 0) {
                                            var352 = false;
                                            var353.method1318(8);
                                        } else if (var347 == 0 && var353.field3180 != 0) {
                                            var353.method1318(8);
                                            var352 = false;
                                        }
                                    }
                                }
                                if (var352) {
                                    class195.field3065.method3322(new class208(var345, var347), -81);
                                }
                                class706.field9939[var351] = var347;
                            }
                            class673.field9579[var351] = var346;
                            class275.field4105[var351] = var349;
                            class305.field4519[var351] = var348;
                            class44.field1098[var351] = var350;
                            var345 = null;
                            break;
                        }
                    }
                    if (var345 != null && class164.field2749 < 200) {
                        class343.field5109[class164.field2749] = var345;
                        class673.field9579[class164.field2749] = var346;
                        class706.field9939[class164.field2749] = var347;
                        class275.field4105[class164.field2749] = var349;
                        class305.field4519[class164.field2749] = var348;
                        class44.field1098[class164.field2749] = var350;
                        class164.field2749++;
                    }
                }
                class63.field1431 = class104.field1844;
                class694.field9773 = 2;
                boolean var334 = false;
                int var335 = class164.field2749;
                while (var335 > 0) {
                    var335--;
                    boolean var336 = true;
                    for (int var337 = 0; var337 < var335; var337++) {
                        if (class706.field9939[var337] != class394.field5757.field4419 && class706.field9939[var337 + 1] == class394.field5757.field4419 || class706.field9939[var337] == 0 && class706.field9939[var337 + 1] != 0) {
                            int var338 = class706.field9939[var337];
                            class706.field9939[var337] = class706.field9939[var337 + 1];
                            class706.field9939[var337 + 1] = var338;
                            String var339 = class275.field4105[var337];
                            class275.field4105[var337] = class275.field4105[var337 + 1];
                            class275.field4105[var337 + 1] = var339;
                            String var340 = class343.field5109[var337];
                            class343.field5109[var337] = class343.field5109[var337 + 1];
                            class343.field5109[var337 + 1] = var340;
                            String var341 = class673.field9579[var337];
                            class673.field9579[var337] = class673.field9579[var337 + 1];
                            class673.field9579[var337 + 1] = var341;
                            int var342 = class305.field4519[var337];
                            class305.field4519[var337] = class305.field4519[var337 + 1];
                            class305.field4519[var337 + 1] = var342;
                            boolean var343 = class44.field1098[var337];
                            class44.field1098[var337] = class44.field1098[var337 + 1];
                            class44.field1098[var337 + 1] = var343;
                            var336 = false;
                        }
                    }
                    if (var336) {
                        break;
                    }
                }
                class25.field911 = null;
                return true;
            } else if (class479.field6877 == class25.field911) {
                int var354 = class126.field2299.method723((byte) -25);
                int var355 = class126.field2299.method732(-559537960);
                boolean var356 = (var355 & 0x1) == 1;
                while (class478.field6872 > class126.field2299.field1393) {
                    int var357 = class126.field2299.method752(-27278);
                    int var358 = class126.field2299.method723((byte) -25);
                    int var359 = 0;
                    if (var358 != 0) {
                        var359 = class126.field2299.method732(-559537960);
                        if (var359 == 255) {
                            var359 = class126.field2299.method730(-77);
                        }
                    }
                    class545.method3142(var358 - 1, var357, var359, var354, 0, var356);
                }
                class306.field4542[class481.method2919(31, class418.field6031++)] = var354;
                class25.field911 = null;
                return true;
            } else if (class457.field6508 == class25.field911) {
                int var360 = class126.field2299.method722(113);
                int var361 = class126.field2299.method711(-127);
                int var362 = class126.field2299.method688((byte) -105);
                int var363 = class126.field2299.method753(true);
                if (class629.method3600(var363, (byte) 86)) {
                    class343.method2209(5665, var361, var360, var362);
                }
                class25.field911 = null;
                return true;
            } else if (class25.field911 == class178.field2897) {
                boolean var364 = class126.field2299.method732(-559537960) == 1;
                String var365 = class126.field2299.method747(14598);
                String var366 = var365;
                if (var364) {
                    var366 = class126.field2299.method747(14598);
                }
                long var367 = class126.field2299.method742(23386);
                long var369 = (long) class126.field2299.method723((byte) -25);
                long var371 = (long) class126.field2299.method740((byte) 91);
                int var373 = class126.field2299.method732(-559537960);
                long var374 = (var369 << 32) + var371;
                boolean var376 = false;
                int var377 = 0;
                while (true) {
                    if (var377 >= 100) {
                        if (var373 <= 1) {
                            if (!(!class301.field4474 || class231.field3466) || class436.field6299) {
                                var376 = true;
                            } else if (class350.method2268(var366, true)) {
                                var376 = true;
                            }
                        }
                        break;
                    }
                    if (class335.field5018[var377] == var374) {
                        var376 = true;
                        break;
                    }
                    var377++;
                }
                if (!var376 && class368.field5459 == 0) {
                    class335.field5018[class295.field4415] = var374;
                    class295.field4415 = (class295.field4415 + 1) % 100;
                    String var378 = class11.method289(class357.method2290(class126.field2299, 32767), (byte) -14);
                    if (var373 == 2 || var373 == 3) {
                        class569.method3285(false, "<img=1>" + var366, -1, "<img=1>" + var365, var365, 0, var378, 9, class220.method1524(var367, -6898));
                    } else if (var373 == 1) {
                        class569.method3285(false, "<img=0>" + var366, -1, "<img=0>" + var365, var365, 0, var378, 9, class220.method1524(var367, -6898));
                    } else {
                        class569.method3285(false, var366, -1, var365, var365, 0, var378, 9, class220.method1524(var367, -6898));
                    }
                }
                class25.field911 = null;
                return true;
            } else if (class292.field4384 == class25.field911) {
                boolean var379 = class126.field2299.method732(-559537960) == 1;
                String var380 = class126.field2299.method747(14598);
                String var381 = var380;
                if (var379) {
                    var381 = class126.field2299.method747(14598);
                }
                long var382 = (long) class126.field2299.method723((byte) -25);
                long var384 = (long) class126.field2299.method740((byte) 124);
                int var386 = class126.field2299.method732(-559537960);
                long var387 = (var382 << 32) + var384;
                boolean var389 = false;
                int var390 = 0;
                while (true) {
                    if (var390 >= 100) {
                        if (var386 <= 1) {
                            if (!(!class301.field4474 || class231.field3466) || class436.field6299) {
                                var389 = true;
                            } else if (class350.method2268(var381, true)) {
                                var389 = true;
                            }
                        }
                        break;
                    }
                    if (class335.field5018[var390] == var387) {
                        var389 = true;
                        break;
                    }
                    var390++;
                }
                if (!var389 && class368.field5459 == 0) {
                    class335.field5018[class295.field4415] = var387;
                    class295.field4415 = (class295.field4415 + 1) % 100;
                    String var391 = class11.method289(class357.method2290(class126.field2299, 32767), (byte) -14);
                    if (var386 == 2) {
                        class569.method3285(false, "<img=1>" + var381, -1, "<img=1>" + var380, var380, 0, var391, 7, null);
                    } else if (var386 == 1) {
                        class569.method3285(false, "<img=0>" + var381, -1, "<img=0>" + var380, var380, 0, var391, 7, null);
                    } else {
                        class569.method3285(false, var381, -1, var380, var380, 0, var391, 3, null);
                    }
                }
                class25.field911 = null;
                return true;
            } else if (class573.field8338 == class25.field911) {
                class694.field9774 = class126.field2299.method732(-559537960);
                class25.field911 = null;
                return true;
            } else if (class698.field9824 == class25.field911) {
                class699.field9855 = class126.field2299.method724(61);
                class646.field9300 = class126.field2299.method734((byte) -23);
                class25.field911 = null;
                return true;
            } else if (class583.field8435 == class25.field911) {
                int var392 = class126.field2299.method730(-50);
                int var393 = class126.field2299.method731(26585);
                int var394 = class126.field2299.method731(26585);
                if (var394 == 65535) {
                    var394 = -1;
                }
                if (class629.method3600(var393, (byte) 101)) {
                    class485.method2930(var394, var392, (byte) -86);
                }
                class25.field911 = null;
                return true;
            } else if (class577.field8395 == class25.field911) {
                int var395 = class126.field2299.method729((byte) -75);
                int var396 = class126.field2299.method688((byte) -128);
                int var397 = class126.field2299.method731(26585);
                if (var397 == 65535) {
                    var397 = -1;
                }
                if (class629.method3600(var395, (byte) 108)) {
                    class514.method3031((byte) 64, var397, 1, var396, -1);
                }
                class25.field911 = null;
                return true;
            } else if (class25.field911 == class219.field3325) {
                int var398 = class126.field2299.method734((byte) -23);
                int var399 = class126.field2299.method731(26585);
                boolean var400 = (var398 & 0x1) == 1;
                class146.method1169(var399, var400, -127);
                class306.field4542[class481.method2919(class418.field6031++, 31)] = var399;
                class25.field911 = null;
                return true;
            } else if (class475.field6784 == class25.field911) {
                int var401 = class126.field2299.method730(102);
                int var402 = class126.field2299.method753(true);
                if (class629.method3600(var402, (byte) 93)) {
                    class514.method3031((byte) 64, -1, 3, var401, -1);
                }
                class25.field911 = null;
                return true;
            } else if (class603.field8670 == class25.field911) {
                int var403 = class126.field2299.method713(124);
                int var404 = class126.field2299.method732(-559537960);
                if (var404 == 255) {
                    var403 = -1;
                    var404 = -1;
                }
                class577.method3313(100, var403, var404);
                class25.field911 = null;
                return true;
            } else if (class631.field9087 == class25.field911) {
                int var405 = class126.field2299.method723((byte) -25);
                if (var405 == 65535) {
                    var405 = -1;
                }
                int var406 = class126.field2299.method734((byte) -23);
                int var407 = class126.field2299.method734((byte) -23);
                class108.method973(var407, true, var406, var405);
                class25.field911 = null;
                return true;
            } else if (class388.field5673 == class25.field911) {
                int var408 = class126.field2299.method729((byte) -97);
                if (var408 == 65535) {
                    var408 = -1;
                }
                int var409 = class126.field2299.method713(127);
                int var410 = class126.field2299.method743(-126);
                class112.method1009((byte) -81, var409, var408, var410);
                class25.field911 = null;
                return true;
            } else if (class645.field9296 == class25.field911) {
                class25.field911 = null;
                class694.field9773 = 1;
                class63.field1431 = class104.field1844;
                return true;
            } else if (class514.field7255 == class25.field911) {
                class454.method2735(124);
                class25.field911 = null;
                return false;
            } else if (class580.field8418 == class25.field911) {
                class502.method2992(class305.field4520, 21);
                class25.field911 = null;
                return true;
            } else if (class317.field4662 == class25.field911) {
                int var411 = class126.field2299.method731(26585);
                if (var411 == 65535) {
                    var411 = -1;
                }
                int var412 = class126.field2299.method732(-559537960);
                int var413 = var412 >> 2;
                int var414 = var412 & 0x3;
                int var415 = class572.field8312[var413];
                int var416 = class126.field2299.method719((byte) -76);
                int var417 = var416 >> 28 & 0x3;
                int var418 = var416 >> 14 & 0x3FFF;
                int var419 = var418 - class33.field967;
                int var420 = var416 & 0x3FFF;
                int var421 = var420 - class323.field4749;
                class660.method3756(var415, var421, var411, var419, var417, (byte) -81, var413, var414);
                class25.field911 = null;
                return true;
            } else if (class25.field911 == class155.field2615) {
                class479.method2911((byte) -74);
                class25.field911 = null;
                return true;
            } else if (class25.field911 == class177.field2886) {
                int var422 = class126.field2299.method723((byte) -25);
                int var423 = class126.field2299.method732(-559537960);
                int var424 = class126.field2299.method732(-559537960);
                int var425 = class126.field2299.method732(-559537960);
                int var426 = class126.field2299.method732(-559537960);
                int var427 = class126.field2299.method723((byte) -25);
                if (class629.method3600(var422, (byte) 93)) {
                    class409.field5926[var423] = true;
                    class371.field5509[var423] = var424;
                    class679.field9631[var423] = var425;
                    class470.field6650[var423] = var426;
                    class2.field379[var423] = var427;
                }
                class25.field911 = null;
                return true;
            } else if (class341.field5068 == class25.field911) {
                class502.method2992(class43.field1089, 13);
                class25.field911 = null;
                return true;
            } else if (class25.field911 == class127.field2325) {
                class502.method2992(class393.field5753, 100);
                class25.field911 = null;
                return true;
            } else if (class291.field4372 == class25.field911) {
                int var428 = class126.field2299.method723((byte) -25);
                if (var428 == 65535) {
                    var428 = -1;
                }
                int var429 = class126.field2299.method732(-559537960);
                int var430 = class126.field2299.method723((byte) -25);
                int var431 = class126.field2299.method732(-559537960);
                class500.method2982(var431, 0, var430, true, var429, var428);
                class25.field911 = null;
                return true;
            } else {
                class374.method2357("T1 - " + (class25.field911 == null ? -1 : class25.field911.method851((byte) -124)) + "," + (class635.field9123 == null ? -1 : class635.field9123.method851((byte) 100)) + "," + (class158.field2698 == null ? -1 : class158.field2698.method851((byte) -24)) + " - " + class478.field6872, 98, null);
                class85.method852(-125, false);
                return true;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2957(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
