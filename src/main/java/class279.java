import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class279 {

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field4790 = 0;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "Lok;")
    public static class146 field4787 = class235.method1724(-12908, "loc");

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "[Lk;")
    public static class228[] field4783;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "[Z")
    public static boolean[] field4786;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)V", line = 39)
    public static final void method2024(int arg0, byte arg1) {
        field4789++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class93.field1493[arg0];
        int var3 = (int) class37.field675[arg0];
        int var4 = class224.field3739[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var5 = class37.field675[arg0];
        int var7 = class259.field4308[arg0];
        if (var4 == 40) {
            class217.field3575++;
            class47.field820.method1656(53, 16);
            class47.field820.method387(var7, 87);
            class264 var8 = class98.method680(var7, false);
            if (var8.field4427 != null && var8.field4427[0][0] == 5) {
                int var9 = var8.field4427[0][1];
                if (class75.field1221[var9] != var8.field4486[0]) {
                    class75.field1221[var9] = var8.field4486[0];
                    class58.method457(var9, -11917);
                }
            }
        }
        if (var4 == 8) {
            class71.field1165++;
            if (class95.field1530 == 1) {
                class305.method2148(false, 1, 2, class102.field1639.field5432[0], var2, 0, var7, 0, 1, class102.field1639.field5419[0], true, 0);
            } else {
                boolean var10 = class305.method2148(false, 0, 2, class102.field1639.field5432[0], var2, 0, var7, 0, 0, class102.field1639.field5419[0], true, 0);
                if (!var10) {
                    class305.method2148(false, 1, 2, class102.field1639.field5432[0], var2, 0, var7, 0, 1, class102.field1639.field5419[0], true, 0);
                }
            }
            class74.field1207 = 0;
            class161.field2737 = class120.field1974;
            class260.field4328 = class215.field3542;
            class63.field1093 = 2;
            class47.field820.method1656(166, 16);
            class47.field820.method365(var3, (byte) -117);
            class47.field820.method330(class201.field3357 + var7, 128);
            class47.field820.method361(class15.field300 + var2, 1635554120);
        }
        if (var4 == 15) {
            class14.field282++;
            class47.field820.method1656(68, 16);
            class47.field820.method342((byte) -127, var3);
            class47.field820.method387(var7, 82);
            class47.field820.method342((byte) -125, var2);
            class152.field2578 = 0;
            class280.field4804 = class98.method680(var7, false);
            class152.field2583 = var2;
        }
        if (var4 == 24) {
            class254.field4233++;
            class57.method454(var2, var5, var7, (byte) 85);
            class47.field820.method1656(241, 16);
            class47.field820.method361(Integer.MAX_VALUE & (int) (var5 >>> 32), 1635554120);
            class47.field820.method330(class15.field300 + var2, 128);
            class47.field820.method365(var7 + class201.field3357, (byte) 76);
        }
        if (var4 == 14) {
            class47.field820.method1656(82, 16);
            class110.field1765++;
            class47.field820.method388(var7, (byte) 123);
            class47.field820.method365(class80.field1292, (byte) -91);
            class47.field820.method330(class281.field4827, 128);
            class47.field820.method330(var2, 128);
            class47.field820.method330(var3, 128);
            class47.field820.method388(class283.field4849, (byte) 125);
            class152.field2578 = 0;
            class280.field4804 = class98.method680(var7, false);
            class152.field2583 = var2;
        }
        if (var4 == 6) {
            class234 var12 = class75.field1215[var3];
            if (var12 != null) {
                class305.method2148(false, 1, 2, class102.field1639.field5432[0], var12.field5419[0], 0, var12.field5432[0], 0, 1, class102.field1639.field5419[0], true, 0);
                class63.field1093 = 2;
                class260.field4328 = class215.field3542;
                class161.field2737 = class120.field1974;
                class140.field2321++;
                class74.field1207 = 0;
                class47.field820.method1656(146, 16);
                class47.field820.method330(var3, 128);
            }
        }
        if (var4 == 5) {
            if (var3 == 0) {
                class192.field3193 = 1;
                class13.method79(class203.field3387, var2, var7);
            } else if (class191.field3164 > 0 && class113.field1813[82] && class113.field1813[81]) {
                class87.method602(class203.field3387, class15.field300 + var2, -83, class201.field3357 + var7);
            } else {
                class47.field820.method1656(36, 16);
                class17.field341++;
                class47.field820.method342((byte) -124, class15.field300 + var2);
                class47.field820.method330(class201.field3357 + var7, 128);
            }
        }
        if (var4 == 7) {
            class282 var13 = class173.field2906[var3];
            if (var13 != null) {
                class242.field4015++;
                class305.method2148(false, 1, 2, class102.field1639.field5432[0], var13.field5419[0], 0, var13.field5432[0], 0, 1, class102.field1639.field5419[0], true, 0);
                class63.field1093 = 2;
                class260.field4328 = class215.field3542;
                class74.field1207 = 0;
                class161.field2737 = class120.field1974;
                class47.field820.method1656(141, 16);
                class47.field820.method361(var3, 1635554120);
            }
        }
        if (var4 == 33) {
            if (class95.field1530 == 1) {
                class305.method2148(false, 1, 2, class102.field1639.field5432[0], var2, 0, var7, 0, 1, class102.field1639.field5419[0], true, 0);
            } else {
                boolean var14 = class305.method2148(false, 0, 2, class102.field1639.field5432[0], var2, 0, var7, 0, 0, class102.field1639.field5419[0], true, 0);
                if (!var14) {
                    class305.method2148(false, 1, 2, class102.field1639.field5432[0], var2, 0, var7, 0, 1, class102.field1639.field5419[0], true, 0);
                }
            }
            class161.field2737 = class120.field1974;
            class138.field2300++;
            class260.field4328 = class215.field3542;
            class63.field1093 = 2;
            class74.field1207 = 0;
            class47.field820.method1656(171, 16);
            class47.field820.method361(class201.field3357 + var7, 1635554120);
            class47.field820.method361(var3, 1635554120);
            class47.field820.method365(var2 + class15.field300, (byte) -110);
        }
        if (var4 == 26) {
            class234 var16 = class75.field1215[var3];
            if (var16 != null) {
                class305.method2148(false, 1, 2, class102.field1639.field5432[0], var16.field5419[0], 0, var16.field5432[0], 0, 1, class102.field1639.field5419[0], true, 0);
                class260.field4328 = class215.field3542;
                class146.field2438++;
                class74.field1207 = 0;
                class63.field1093 = 2;
                class161.field2737 = class120.field1974;
                class47.field820.method1656(64, 16);
                class47.field820.method342((byte) -128, var3);
            }
        }
        if (var4 == 1003) {
            class264 var17 = class98.method680(var7, false);
            if (var17 == null || var17.field4492[var2] < 100000) {
                class258.field4292++;
                class47.field820.method1656(128, 16);
                class47.field820.method330(var3, 128);
            } else {
                class316.method2209(false, class112.method758(-76, new class146[] { class82.method585(14744, var17.field4492[var2]), class94.field1515, class84.method589(false, var3).field4149 }), 0, class161.field2740);
            }
            class152.field2578 = 0;
            class280.field4804 = class98.method680(var7, false);
            class152.field2583 = var2;
        }
        if (var4 == 28) {
            class239.field3991++;
            class57.method454(var2, var5, var7, (byte) 69);
            class47.field820.method1656(221, 16);
            class47.field820.method365(class201.field3357 + var7, (byte) 95);
            class47.field820.method342((byte) -125, class15.field300 + var2);
            class47.field820.method342((byte) -125, (int) (var5 >>> 32) & Integer.MAX_VALUE);
        }
        if (var4 == 32) {
            class264 var18 = class165.method1289(var7, true, var2);
            if (var18 != null) {
                class126.method864(123);
                class92.method638(var7, 22, var2, class268.method1947(115, client.method1789(var18)));
                class161.field2736 = 0;
                class135.field2257 = class206.method1563((byte) 0, var18);
                if (class135.field2257 == null) {
                    class135.field2257 = class45.field766;
                }
                if (var18.field4462) {
                    class238.field3968 = class112.method758(126, new class146[] { var18.field4466, class93.field1506 });
                } else {
                    class238.field3968 = class112.method758(-60, new class146[] { class113.field1826, var18.field4484, class93.field1506 });
                }
            }
        } else if (var4 == 48) {
            class126.method864(112);
            class264 var19 = class98.method680(var7, false);
            class161.field2736 = 1;
            class80.field1292 = var3;
            class281.field4827 = var2;
            class283.field4849 = var7;
            class164.method1280(false, var19);
            class281.field4825 = class112.method758(123, new class146[] { class145.field2420, class84.method589(false, var3).field4149, class93.field1506 });
            if (class281.field4825 == null) {
                class281.field4825 = class254.field4236;
            }
        } else {
            if (var4 == 16) {
                class47.field820.method1656(108, 16);
                class47.field820.method338(var7, -76);
                class44.field761++;
                class47.field820.method342((byte) -124, var3);
                class47.field820.method330(var2, 128);
                class152.field2578 = 0;
                class280.field4804 = class98.method680(var7, false);
                class152.field2583 = var2;
            }
            if (var4 == 34) {
                class282 var20 = class173.field2906[var3];
                if (var20 != null) {
                    class305.method2148(false, 1, 2, class102.field1639.field5432[0], var20.field5419[0], 0, var20.field5432[0], 0, 1, class102.field1639.field5419[0], true, 0);
                    class63.field1093 = 2;
                    class260.field4328 = class215.field3542;
                    class161.field2737 = class120.field1974;
                    class170.field2868++;
                    class74.field1207 = 0;
                    class47.field820.method1656(59, 16);
                    class47.field820.method342((byte) -127, class214.field3535);
                    class47.field820.method342((byte) -127, var3);
                    class47.field820.method338(client.field4081, -92);
                }
            }
            if (var4 == 13 && class57.method454(var2, var5, var7, (byte) -107)) {
                class322.field5497++;
                class47.field820.method1656(230, 16);
                class47.field820.method330(class201.field3357 + var7, 128);
                class47.field820.method365(class15.field300 + var2, (byte) 114);
                class47.field820.method330(class214.field3535, 128);
                class47.field820.method365(Integer.MAX_VALUE & (int) (var5 >>> 32), (byte) 76);
                class47.field820.method338(client.field4081, -111);
            }
            if (var4 == 1007) {
                class74.field1207 = 0;
                class123.field2015++;
                class161.field2737 = class120.field1974;
                class260.field4328 = class215.field3542;
                class63.field1093 = 2;
                class47.field820.method1656(20, 16);
                class47.field820.method330(var3, 128);
            }
            if (var4 == 19) {
                if (var3 == 0) {
                    class85.field1351 = 1;
                    class13.method79(class203.field3387, var2, var7);
                } else if (var3 == 1) {
                    class87.field1392++;
                    class47.field820.method1656(7, 16);
                    class47.field820.method342((byte) -125, class15.field300 + var2);
                    class47.field820.method388(client.field4081, (byte) 125);
                    class47.field820.method330(class214.field3535, 128);
                    class47.field820.method361(class201.field3357 + var7, 1635554120);
                }
            }
            if (var4 == 35) {
                class201.field3351++;
                class47.field820.method1656(160, 16);
                class47.field820.method330(var2, 128);
                class47.field820.method338(var7, -25);
                class47.field820.method330(var3, 128);
                class152.field2578 = 0;
                class280.field4804 = class98.method680(var7, false);
                class152.field2583 = var2;
            }
            if (var4 == 11 && class31.field575 == null) {
                class70.method520(var7, var2, true);
                class31.field575 = class165.method1289(var7, true, var2);
                class164.method1280(false, class31.field575);
            }
            if (var4 == 44) {
                class19.field367++;
                class47.field820.method1656(13, 16);
                class47.field820.method338(var7, -31);
                class47.field820.method342((byte) -127, var2);
                class47.field820.method342((byte) -128, var3);
                class152.field2578 = 0;
                class280.field4804 = class98.method680(var7, false);
                class152.field2583 = var2;
            }
            if (var4 == 22) {
                if (var3 == 0) {
                    class13.method79(class203.field3387, var2, var7);
                } else if (var3 == 1) {
                    if (class191.field3164 > 0 && class113.field1813[82] && class113.field1813[81]) {
                        class87.method602(class203.field3387, class15.field300 + var2, 56, class201.field3357 + var7);
                    } else if (class305.method2148(true, 0, 1, class102.field1639.field5432[0], var2, 0, var7, 0, 0, class102.field1639.field5419[0], true, 0)) {
                        class47.field820.method332(class97.field1578, 70);
                        class47.field820.method332(class100.field1619, 69);
                        class47.field820.method361(class158.field2668, 1635554120);
                        class47.field820.method332(57, 107);
                        class47.field820.method332(class87.field1378, 102);
                        class47.field820.method332(class238.field3976, 77);
                        class47.field820.method332(89, 78);
                        class47.field820.method361(class102.field1639.field5409, 1635554120);
                        class47.field820.method361(class102.field1639.field5380, 1635554120);
                        class47.field820.method332(class201.field3352, 102);
                        class47.field820.method332(63, 93);
                    }
                }
            }
            if (var4 == 31) {
                class225.field3752++;
                class47.field820.method1656(198, 16);
                class47.field820.method361(var3, 1635554120);
                class47.field820.method342((byte) -126, var2);
                class47.field820.method387(var7, 90);
                class152.field2578 = 0;
                class280.field4804 = class98.method680(var7, false);
                class152.field2583 = var2;
            }
            if (var4 == 21) {
                class47.field874++;
                class47.field820.method1656(243, 16);
                class47.field820.method388(var7, (byte) 119);
                class47.field820.method388(client.field4081, (byte) 122);
                class47.field820.method365(var2, (byte) 26);
                class47.field820.method342((byte) -125, var3);
                class47.field820.method365(class214.field3535, (byte) 15);
                class152.field2578 = 0;
                class280.field4804 = class98.method680(var7, false);
                class152.field2583 = var2;
            }
            if (var4 == 18) {
                class282 var21 = class173.field2906[var3];
                if (var21 != null) {
                    class305.method2148(false, 1, 2, class102.field1639.field5432[0], var21.field5419[0], 0, var21.field5432[0], 0, 1, class102.field1639.field5419[0], true, 0);
                    class260.field4328 = class215.field3542;
                    class306.field5238++;
                    class161.field2737 = class120.field1974;
                    class63.field1093 = 2;
                    class74.field1207 = 0;
                    class47.field820.method1656(117, 16);
                    class47.field820.method330(var3, 128);
                }
            }
            if (arg1 < -105) {
                if (var4 == 2) {
                    class282 var22 = class173.field2906[var3];
                    if (var22 != null) {
                        class305.method2148(false, 1, 2, class102.field1639.field5432[0], var22.field5419[0], 0, var22.field5432[0], 0, 1, class102.field1639.field5419[0], true, 0);
                        class161.field2737 = class120.field1974;
                        class63.field1093 = 2;
                        class148.field2513++;
                        class74.field1207 = 0;
                        class260.field4328 = class215.field3542;
                        class47.field820.method1656(250, 16);
                        class47.field820.method330(var3, 128);
                    }
                }
                if (var4 == 17) {
                    class47.field820.method1656(156, 16);
                    class135.field2258++;
                    class47.field820.method365(var3, (byte) -83);
                    class47.field820.method388(var7, (byte) 121);
                    class47.field820.method361(var2, 1635554120);
                    class152.field2578 = 0;
                    class280.field4804 = class98.method680(var7, false);
                    class152.field2583 = var2;
                }
                if (var4 == 9) {
                    class234 var23 = class75.field1215[var3];
                    if (var23 != null) {
                        class165.field2793++;
                        class305.method2148(false, 1, 2, class102.field1639.field5432[0], var23.field5419[0], 0, var23.field5432[0], 0, 1, class102.field1639.field5419[0], true, 0);
                        class63.field1093 = 2;
                        class260.field4328 = class215.field3542;
                        class74.field1207 = 0;
                        class161.field2737 = class120.field1974;
                        class47.field820.method1656(124, 16);
                        class47.field820.method342((byte) -127, var3);
                    }
                }
                if (var4 == 41) {
                    class52.method425((byte) 53);
                }
                if (var4 == 49) {
                    class264 var24 = class98.method680(var7, false);
                    boolean var25 = true;
                    if (var24.field4470 > 0) {
                        var25 = class184.method1448(var24, 16237);
                    }
                    if (var25) {
                        class47.field820.method1656(53, 16);
                        class217.field3575++;
                        class47.field820.method387(var7, 90);
                    }
                }
                if (var4 == 50) {
                    class46.field796++;
                    class57.method454(var2, var5, var7, (byte) -74);
                    class47.field820.method1656(253, 16);
                    class47.field820.method342((byte) -127, class15.field300 + var2);
                    class47.field820.method330((int) (var5 >>> 32) & Integer.MAX_VALUE, 128);
                    class47.field820.method365(class201.field3357 + var7, (byte) -88);
                }
                if (var4 == 23) {
                    class126.field2051++;
                    if (class95.field1530 == 1) {
                        class305.method2148(false, 1, 2, class102.field1639.field5432[0], var2, 0, var7, 0, 1, class102.field1639.field5419[0], true, 0);
                    } else {
                        boolean var26 = class305.method2148(false, 0, 2, class102.field1639.field5432[0], var2, 0, var7, 0, 0, class102.field1639.field5419[0], true, 0);
                        if (!var26) {
                            class305.method2148(false, 1, 2, class102.field1639.field5432[0], var2, 0, var7, 0, 1, class102.field1639.field5419[0], true, 0);
                        }
                    }
                    class161.field2737 = class120.field1974;
                    class63.field1093 = 2;
                    class260.field4328 = class215.field3542;
                    class74.field1207 = 0;
                    class47.field820.method1656(0, 16);
                    class47.field820.method361(var3, 1635554120);
                    class47.field820.method365(class15.field300 + var2, (byte) 44);
                    class47.field820.method330(class201.field3357 + var7, 128);
                }
                if (var4 == 39) {
                    class282 var28 = class173.field2906[var3];
                    if (var28 != null) {
                        class321.field5489++;
                        class305.method2148(false, 1, 2, class102.field1639.field5432[0], var28.field5419[0], 0, var28.field5432[0], 0, 1, class102.field1639.field5419[0], true, 0);
                        class161.field2737 = class120.field1974;
                        class63.field1093 = 2;
                        class260.field4328 = class215.field3542;
                        class74.field1207 = 0;
                        class47.field820.method1656(145, 16);
                        class47.field820.method365(class80.field1292, (byte) 88);
                        class47.field820.method361(class281.field4827, 1635554120);
                        class47.field820.method388(class283.field4849, (byte) 124);
                        class47.field820.method330(var3, 128);
                    }
                }
                if (var4 == 3) {
                    class234 var29 = class75.field1215[var3];
                    if (var29 != null) {
                        class305.method2148(false, 1, 2, class102.field1639.field5432[0], var29.field5419[0], 0, var29.field5432[0], 0, 1, class102.field1639.field5419[0], true, 0);
                        class74.field1207 = 0;
                        class63.field1093 = 2;
                        class272.field4664++;
                        class260.field4328 = class215.field3542;
                        class161.field2737 = class120.field1974;
                        class47.field820.method1656(47, 16);
                        class47.field820.method342((byte) -125, var3);
                    }
                }
                if (var4 == 10) {
                    class207.field3458++;
                    boolean var30 = class305.method2148(false, 0, 2, class102.field1639.field5432[0], var2, 0, var7, 0, 0, class102.field1639.field5419[0], true, 0);
                    if (!var30) {
                        class305.method2148(false, 1, 2, class102.field1639.field5432[0], var2, 0, var7, 0, 1, class102.field1639.field5419[0], true, 0);
                    }
                    class63.field1093 = 2;
                    class161.field2737 = class120.field1974;
                    class74.field1207 = 0;
                    class260.field4328 = class215.field3542;
                    class47.field820.method1656(87, 16);
                    class47.field820.method365(class201.field3357 + var7, (byte) -100);
                    class47.field820.method342((byte) -124, var3);
                    class47.field820.method361(class80.field1292, 1635554120);
                    class47.field820.method330(class15.field300 + var2, 128);
                    class47.field820.method338(class283.field4849, -114);
                    class47.field820.method330(class281.field4827, 128);
                }
                if (var4 == 57) {
                    class55.field987++;
                    class47.field820.method1656(89, 16);
                    class47.field820.method330(var2, 128);
                    class47.field820.method387(var7, 87);
                    class47.field820.method361(class214.field3535, 1635554120);
                    class47.field820.method353(client.field4081, (byte) -32);
                }
                if (var4 == 1 && class57.method454(var2, var5, var7, (byte) -54)) {
                    class47.field820.method1656(210, 16);
                    class47.field820.method361(class80.field1292, 1635554120);
                    class41.field728++;
                    class47.field820.method365(class201.field3357 + var7, (byte) -126);
                    class47.field820.method361(class15.field300 + var2, 1635554120);
                    class47.field820.method365(class281.field4827, (byte) -123);
                    class47.field820.method361((int) (var5 >>> 32) & Integer.MAX_VALUE, 1635554120);
                    class47.field820.method387(class283.field4849, 88);
                }
                if (var4 == 20) {
                    class234 var32 = class75.field1215[var3];
                    if (var32 != null) {
                        class223.field3715++;
                        class305.method2148(false, 1, 2, class102.field1639.field5432[0], var32.field5419[0], 0, var32.field5432[0], 0, 1, class102.field1639.field5419[0], true, 0);
                        class260.field4328 = class215.field3542;
                        class161.field2737 = class120.field1974;
                        class74.field1207 = 0;
                        class63.field1093 = 2;
                        class47.field820.method1656(254, 16);
                        class47.field820.method353(class283.field4849, (byte) -32);
                        class47.field820.method342((byte) -126, var3);
                        class47.field820.method330(class281.field4827, 128);
                        class47.field820.method361(class80.field1292, 1635554120);
                    }
                }
                if (var4 == 38) {
                    class296.field5032++;
                    if (class95.field1530 == 1) {
                        class305.method2148(false, 1, 2, class102.field1639.field5432[0], var2, 0, var7, 0, 1, class102.field1639.field5419[0], true, 0);
                    } else {
                        boolean var33 = class305.method2148(false, 0, 2, class102.field1639.field5432[0], var2, 0, var7, 0, 0, class102.field1639.field5419[0], true, 0);
                        if (!var33) {
                            class305.method2148(false, 1, 2, class102.field1639.field5432[0], var2, 0, var7, 0, 1, class102.field1639.field5419[0], true, 0);
                        }
                    }
                    class63.field1093 = 2;
                    class74.field1207 = 0;
                    class161.field2737 = class120.field1974;
                    class260.field4328 = class215.field3542;
                    class47.field820.method1656(248, 16);
                    class47.field820.method330(class15.field300 + var2, 128);
                    class47.field820.method330(var3, 128);
                    class47.field820.method365(class201.field3357 + var7, (byte) -127);
                }
                if (var4 == 25) {
                    class201.field3349++;
                    if (class95.field1530 == 1) {
                        class305.method2148(false, 1, 2, class102.field1639.field5432[0], var2, 0, var7, 0, 1, class102.field1639.field5419[0], true, 0);
                    } else {
                        boolean var35 = class305.method2148(false, 0, 2, class102.field1639.field5432[0], var2, 0, var7, 0, 0, class102.field1639.field5419[0], true, 0);
                        if (!var35) {
                            class305.method2148(false, 1, 2, class102.field1639.field5432[0], var2, 0, var7, 0, 1, class102.field1639.field5419[0], true, 0);
                        }
                    }
                    class63.field1093 = 2;
                    class260.field4328 = class215.field3542;
                    class161.field2737 = class120.field1974;
                    class74.field1207 = 0;
                    class47.field820.method1656(252, 16);
                    class47.field820.method330(var3, 128);
                    class47.field820.method361(var2 + class15.field300, 1635554120);
                    class47.field820.method365(class201.field3357 + var7, (byte) 16);
                }
                if (var4 == 1005) {
                    class260.field4328 = class215.field3542;
                    class63.field1093 = 2;
                    class74.field1207 = 0;
                    class161.field2737 = class120.field1974;
                    class47.field820.method1656(128, 16);
                    class258.field4292++;
                    class47.field820.method330(var3, 128);
                }
                if (var4 == 36) {
                    class152.field2579++;
                    class47.field820.method1656(94, 16);
                    class47.field820.method353(var7, (byte) -32);
                    class47.field820.method330(var2, 128);
                    class47.field820.method330(var3, 128);
                    class152.field2578 = 0;
                    class280.field4804 = class98.method680(var7, false);
                    class152.field2583 = var2;
                }
                if (var4 == 29) {
                    class282 var37 = class173.field2906[var3];
                    if (var37 != null) {
                        class305.method2148(false, 1, 2, class102.field1639.field5432[0], var37.field5419[0], 0, var37.field5432[0], 0, 1, class102.field1639.field5419[0], true, 0);
                        class20.field390++;
                        class161.field2737 = class120.field1974;
                        class74.field1207 = 0;
                        class260.field4328 = class215.field3542;
                        class63.field1093 = 2;
                        class47.field820.method1656(11, 16);
                        class47.field820.method342((byte) -127, var3);
                    }
                }
                if (var4 == 4) {
                    class179.field3016++;
                    class47.field820.method1656(75, 16);
                    class47.field820.method365(var3, (byte) -88);
                    class47.field820.method338(var7, -118);
                    class47.field820.method342((byte) -127, var2);
                    class152.field2578 = 0;
                    class280.field4804 = class98.method680(var7, false);
                    class152.field2583 = var2;
                }
                if (var4 == 37) {
                    class234 var38 = class75.field1215[var3];
                    if (var38 != null) {
                        class202.field3365++;
                        class305.method2148(false, 1, 2, class102.field1639.field5432[0], var38.field5419[0], 0, var38.field5432[0], 0, 1, class102.field1639.field5419[0], true, 0);
                        class161.field2737 = class120.field1974;
                        class260.field4328 = class215.field3542;
                        class63.field1093 = 2;
                        class74.field1207 = 0;
                        class47.field820.method1656(226, 16);
                        class47.field820.method365(var3, (byte) 51);
                    }
                }
                if (var4 == 51) {
                    class282 var39 = class173.field2906[var3];
                    if (var39 != null) {
                        class157.field2647++;
                        class305.method2148(false, 1, 2, class102.field1639.field5432[0], var39.field5419[0], 0, var39.field5432[0], 0, 1, class102.field1639.field5419[0], true, 0);
                        class260.field4328 = class215.field3542;
                        class74.field1207 = 0;
                        class161.field2737 = class120.field1974;
                        class63.field1093 = 2;
                        class47.field820.method1656(109, 16);
                        class47.field820.method365(var3, (byte) 39);
                    }
                }
                if (var4 == 12) {
                    class89.field1418++;
                    boolean var40 = class305.method2148(false, 0, 2, class102.field1639.field5432[0], var2, 0, var7, 0, 0, class102.field1639.field5419[0], true, 0);
                    if (!var40) {
                        class305.method2148(false, 1, 2, class102.field1639.field5432[0], var2, 0, var7, 0, 1, class102.field1639.field5419[0], true, 0);
                    }
                    class74.field1207 = 0;
                    class161.field2737 = class120.field1974;
                    class63.field1093 = 2;
                    class260.field4328 = class215.field3542;
                    class47.field820.method1656(249, 16);
                    class47.field820.method342((byte) -128, class214.field3535);
                    class47.field820.method361(class201.field3357 + var7, 1635554120);
                    class47.field820.method342((byte) -128, class15.field300 + var2);
                    class47.field820.method353(client.field4081, (byte) -32);
                    class47.field820.method330(var3, 128);
                }
                if (var4 == 1004) {
                    class57.method454(var2, var5, var7, (byte) -115);
                    class47.field820.method1656(185, 16);
                    class66.field1116++;
                    class47.field820.method342((byte) -127, class15.field300 + var2);
                    class47.field820.method361(class201.field3357 + var7, 1635554120);
                    class47.field820.method342((byte) -124, Integer.MAX_VALUE & (int) (var5 >>> 32));
                }
                if (var4 == 59) {
                    class234 var42 = class75.field1215[var3];
                    if (var42 != null) {
                        class91.field1436++;
                        class305.method2148(false, 1, 2, class102.field1639.field5432[0], var42.field5419[0], 0, var42.field5432[0], 0, 1, class102.field1639.field5419[0], true, 0);
                        class63.field1093 = 2;
                        class260.field4328 = class215.field3542;
                        class74.field1207 = 0;
                        class161.field2737 = class120.field1974;
                        class47.field820.method1656(50, 16);
                        class47.field820.method361(var3, 1635554120);
                    }
                }
                if (var4 == 45) {
                    class234 var43 = class75.field1215[var3];
                    if (var43 != null) {
                        class215.field3557++;
                        class305.method2148(false, 1, 2, class102.field1639.field5432[0], var43.field5419[0], 0, var43.field5432[0], 0, 1, class102.field1639.field5419[0], true, 0);
                        class63.field1093 = 2;
                        class161.field2737 = class120.field1974;
                        class260.field4328 = class215.field3542;
                        class74.field1207 = 0;
                        class47.field820.method1656(103, 16);
                        class47.field820.method342((byte) -124, var3);
                    }
                }
                if (var4 == 42) {
                    class234 var44 = class75.field1215[var3];
                    if (var44 != null) {
                        class201.field3353++;
                        class305.method2148(false, 1, 2, class102.field1639.field5432[0], var44.field5419[0], 0, var44.field5432[0], 0, 1, class102.field1639.field5419[0], true, 0);
                        class260.field4328 = class215.field3542;
                        class161.field2737 = class120.field1974;
                        class74.field1207 = 0;
                        class63.field1093 = 2;
                        class47.field820.method1656(209, 16);
                        class47.field820.method361(var3, 1635554120);
                        class47.field820.method342((byte) -124, class214.field3535);
                        class47.field820.method353(client.field4081, (byte) -32);
                    }
                }
                if (var4 == 60) {
                    class47.field820.method1656(218, 16);
                    class47.field820.method342((byte) -128, var2);
                    class22.field413++;
                    class47.field820.method388(var7, (byte) 116);
                    class47.field820.method342((byte) -127, var3);
                    class152.field2578 = 0;
                    class280.field4804 = class98.method680(var7, false);
                    class152.field2583 = var2;
                }
                if (var4 == 46) {
                    class47.field820.method1656(148, 16);
                    class47.field820.method330(var2, 128);
                    class175.field2936++;
                    class47.field820.method338(var7, -30);
                    class47.field820.method361(var3, 1635554120);
                    class152.field2578 = 0;
                    class280.field4804 = class98.method680(var7, false);
                    class152.field2583 = var2;
                }
                if (var4 == 1002) {
                    class260.field4328 = class215.field3542;
                    class74.field1207 = 0;
                    class63.field1093 = 2;
                    class161.field2737 = class120.field1974;
                    class282 var45 = class173.field2906[var3];
                    if (var45 != null) {
                        class301 var46 = var45.field4838;
                        if (var46.field5092 != null) {
                            var46 = var46.method2135(-1);
                        }
                        if (var46 != null) {
                            class47.field820.method1656(212, 16);
                            class166.field2809++;
                            class47.field820.method342((byte) -128, var46.field5126);
                        }
                    }
                }
                if (var4 == 47) {
                    class217.field3575++;
                    class47.field820.method1656(53, 16);
                    class47.field820.method387(var7, 95);
                    class264 var47 = class98.method680(var7, false);
                    if (var47.field4427 != null && var47.field4427[0][0] == 5) {
                        int var48 = var47.field4427[0][1];
                        class75.field1221[var48] = 1 - class75.field1221[var48];
                        class58.method457(var48, -11917);
                    }
                }
                if (var4 == 43) {
                    class234 var49 = class75.field1215[var3];
                    if (var49 != null) {
                        class305.method2148(false, 1, 2, class102.field1639.field5432[0], var49.field5419[0], 0, var49.field5432[0], 0, 1, class102.field1639.field5419[0], true, 0);
                        class260.field4328 = class215.field3542;
                        class63.field1093 = 2;
                        class72.field1179++;
                        class74.field1207 = 0;
                        class161.field2737 = class120.field1974;
                        class47.field820.method1656(233, 16);
                        class47.field820.method330(var3, 128);
                    }
                }
                if (var4 == 30 || var4 == 1006) {
                    class241.method1748(class214.field3525[arg0], (byte) 124, var2, var7, var3);
                }
                if (var4 == 58) {
                    class57.method454(var2, var5, var7, (byte) -63);
                    class260.field4319++;
                    class47.field820.method1656(98, 16);
                    class47.field820.method361(class201.field3357 + var7, 1635554120);
                    class47.field820.method361((int) (var5 >>> 32) & Integer.MAX_VALUE, 1635554120);
                    class47.field820.method330(class15.field300 + var2, 128);
                }
                if (class161.field2736 != 0) {
                    class161.field2736 = 0;
                    class164.method1280(false, class98.method680(class283.field4849, false));
                }
                if (class272.field4668) {
                    class126.method864(126);
                }
                if (class280.field4804 != null && class152.field2578 == 0) {
                    class164.method1280(false, class280.field4804);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V", line = 1118)
    public static final void method2025(boolean arg0) {
        if (arg0) {
            class203.field3382 = class89.field1426;
            class174.field2914 = class297.field5051;
            class281.field4823 = class261.field4338;
        } else {
            class203.field3382 = class58.field1018;
            class174.field2914 = class300.field5082;
            class281.field4823 = class278.field4781;
        }
        class161.field2732 = class203.field3382.length;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V", line = 1152)
    public static void method2026(byte arg0) {
        if (arg0 >= -21) {
            field4786 = (boolean[]) null;
        }
        field4787 = null;
        field4783 = null;
        field4786 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLok;Z)V", line = 1165)
    public static final void method2027(byte arg0, class146 arg1, boolean arg2) {
        class146 var3 = arg1.method1108(true);
        field4785++;
        short[] var4 = new short[16];
        if (arg0 < 91) {
            return;
        }
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = (arg2 ? class292.field4968 : class86.field1361) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class250 var9 = class40.method287(var8, (byte) -60);
            if (var9.field4189 && var9.method1831(0).method1108(true).method1081(var3, -1) != -1) {
                if (var5 >= 50) {
                    class148.field2520 = -1;
                    class146.field2476 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var8;
            }
        }
        class148.field2520 = var5;
        class146.field2476 = var4;
        class84.field1334 = 0;
        class146[] var12 = new class146[class148.field2520];
        for (int var13 = 0; var13 < class148.field2520; var13++) {
            var12[var13] = class40.method287(var4[var13], (byte) 94).method1831(0);
        }
        class55.method444(class146.field2476, true, var12);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)Z", line = 1238)
    public static final boolean method2028(int arg0, int arg1) {
        field4784++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class224.field3739[arg0];
        if (var2 >= arg1) {
            var2 -= 2000;
        }
        return var2 == 1006;
    }
}
