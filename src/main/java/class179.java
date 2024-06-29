import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class179 extends class272 {

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public int field2559 = -1;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public int field2560 = 0;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    public int field2570 = 12800;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public int field2561 = 0;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "Z")
    public boolean field2563 = true;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public int field2564 = -1;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public int field2562 = 12800;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "Ljava/lang/String;")
    public String field2571;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
    public int field2578;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public int field2566;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "Ljava/lang/String;")
    public String field2569;

    @OriginalMember(owner = "client!w", name = "V", descriptor = "Lkr;")
    public class486 field2582;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "Ldk;")
    public static class326 field2577 = new class326("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!w", name = "S", descriptor = "Ldk;")
    public static class326 field2579 = new class326("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "Lus;")
    public static class1 field2585;

    @OriginalMember(owner = "client!w", name = "Z", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!w", name = "W", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!w", name = "X", descriptor = "Las;")
    public static class95 field2584;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IB)I")
    public static final int method1090(int arg0, byte arg1) {
        field2565++;
        if (arg1 < 44) {
            field2584 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I[III)Z")
    public final boolean method1091(int arg0, int[] arg1, int arg2, int arg3) {
        field2567++;
        if (arg3 > -43) {
            this.method1097((int[]) null, -93, -14, 107);
        }
        for (class218 var5 = (class218) this.field2582.method2843(1123227612); var5 != null; var5 = (class218) this.field2582.method2842(1673506446)) {
            if (var5.method1397(48, arg0, arg2)) {
                var5.method1395(arg2, arg0, arg1, -916);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
    public static void method1092(boolean arg0) {
        if (!arg0) {
            field2584 = null;
            field2577 = null;
            field2579 = null;
            field2585 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLcj;)Ljava/lang/String;")
    public static final String method1093(byte arg0, class451 arg1) {
        field2576++;
        int var2 = -36 / ((-arg0 - 36) / 45);
        return arg1.field6246 == null || arg1.field6246.length() <= 0 ? arg1.field6229 : arg1.field6229 + class251.field3703.method2065(61, class326.field4711) + arg1.field6246;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
    public final void method1094(int arg0) {
        field2573++;
        this.field2561 = 0;
        this.field2562 = 12800;
        this.field2560 = 0;
        if (arg0 < 118) {
            return;
        }
        this.field2570 = 12800;
        for (class218 var2 = (class218) this.field2582.method2843(1123227612); var2 != null; var2 = (class218) this.field2582.method2842(1673506446)) {
            if (var2.field3255 < this.field2562) {
                this.field2562 = var2.field3255;
            }
            if (var2.field3259 > this.field2560) {
                this.field2560 = var2.field3259;
            }
            if (var2.field3272 > this.field2561) {
                this.field2561 = var2.field3272;
            }
            if (this.field2570 > var2.field3266) {
                this.field2570 = var2.field3266;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V")
    public static final void method1095(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2575++;
        if (arg0 == arg2) {
            class348.method2177(arg3, arg2, arg1, arg5, (byte) 121);
            return;
        }
        if (class168.field2449 <= (arg1 - arg2) && arg1 + arg2 <= class94.field1209 && class345.field5011 <= arg3 - arg0 && (arg0 + arg3) <= class485.field6827) {
            class268.method1645((byte) -78, arg2, arg0, arg3, arg1, arg5);
        } else {
            class5.method20(arg1, arg3, (byte) -35, arg2, arg5, arg0);
        }
        if (arg4 != -65536) {
            method1093((byte) -5, (class451) null);
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)Z")
    public static final boolean method1096(int arg0) throws IOException {
        field2568++;
        if (class58.field761 == null) {
            return false;
        }
        int var1 = class58.field761.method2121(true);
        if (var1 == 0) {
            return false;
        }
        if (class393.field5568 == null) {
            if (class154.field2294) {
                var1--;
                class58.field761.method2123(89, 0, class345.field5016.field4064, 1);
                class154.field2294 = false;
                class107.field1344++;
            }
            class345.field5016.field4021 = 0;
            if (class345.field5016.method2458(-107)) {
                if (var1 == 0) {
                    return false;
                }
                class58.field761.method2123(63, 1, class345.field5016.field4064, 1);
                var1--;
                class107.field1344++;
            }
            class154.field2294 = true;
            class1[] var2 = class34.method230(true);
            int var3 = class345.field5016.method2460(255);
            if (var3 < 0 || var3 >= var2.length) {
                throw new IOException("invo:" + var3);
            }
            class393.field5568 = var2[var3];
            class382.field5447 = class393.field5568.field1;
        }
        if (class382.field5447 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class58.field761.method2123(89, 0, class345.field5016.field4064, 1);
            class382.field5447 = class345.field5016.field4064[0] & 0xFF;
            class107.field1344++;
            var1--;
        }
        if (class382.field5447 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class58.field761.method2123(105, 0, class345.field5016.field4064, 2);
            class345.field5016.field4021 = 0;
            var1 -= 2;
            class382.field5447 = class345.field5016.method1729(65280);
            class107.field1344 += 2;
        }
        if (class382.field5447 > var1) {
            return false;
        }
        class345.field5016.field4021 = 0;
        class58.field761.method2123(120, 0, class345.field5016.field4064, class382.field5447);
        class107.field1344 += class382.field5447;
        class58.field757 = class226.field3424;
        class7.field65 = 0;
        class226.field3424 = class71.field889;
        class71.field889 = class393.field5568;
        if (class393.field5568 == class34.field439) {
            class63.method394(class113.field1429, -1);
            class393.field5568 = null;
            return true;
        } else if (class50.field676 == class393.field5568) {
            int var4 = class345.field5016.method1729(65280);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class345.field5016.method1701(-23121);
            int var6 = class345.field5016.method1729(65280);
            int var7 = class345.field5016.method1701(-23121);
            class58.method354(var4, var5, 8, var6, var7);
            class393.field5568 = null;
            return true;
        } else if (class492.field6933 == class393.field5568) {
            int var8 = class345.field5016.method1746(17037);
            int var9 = class345.field5016.method1729(65280);
            int var10 = class345.field5016.method1710(65536);
            if (class213.method1378(var9, false)) {
                class330.method2094(var8, var10, 84);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class132.field1742) {
            int var11 = class345.field5016.method1735(116);
            int var12 = class345.field5016.method1701(-23121);
            if (var11 == 255) {
                var11 = -1;
                var12 = -1;
            }
            class364.method2251(var11, 104, var12);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class33.field426) {
            String var13 = class345.field5016.method1750(1);
            String var14 = class113.method717(true, class61.method384(class345.field5016, 32767));
            class42.method284(var13, (byte) 97, var14, var13, 0, 6);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class209.field3184) {
            class63.method394(class138.field1821, -1);
            class393.field5568 = null;
            return true;
        } else if (class93.field1179 == class393.field5568) {
            if (class86.field1045 != null) {
                class327.method2075(class314.field4438.field5800, -1, 0, false, -1);
            }
            byte[] var15 = new byte[class382.field5447];
            class345.field5016.method2462(class382.field5447, 0, 0, var15);
            String var16 = class128.method806(class382.field5447, var15, -17364, 0);
            class314.method1945(126, true, class437.field6083 == 1, class252.field3718, var16);
            class393.field5568 = null;
            return true;
        } else if (class428.field6006 == class393.field5568) {
            for (int var17 = 0; var17 < class124.field1559.length; var17++) {
                if (class124.field1559[var17] != null) {
                    class124.field1559[var17].field2080 = -1;
                }
            }
            for (int var18 = 0; var18 < class139.field1851.length; var18++) {
                if (class139.field1851[var18] != null) {
                    class139.field1851[var18].field2080 = -1;
                }
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class172.field2505) {
            String var19 = class345.field5016.method1750(-97);
            int var20 = class345.field5016.method1697((byte) 12);
            int var21 = class345.field5016.method1746(17037);
            int var22 = class345.field5016.method1709(255);
            if (var22 == 65535) {
                var22 = -1;
            }
            if (var20 >= 1 && var20 <= 8) {
                if (var19.equalsIgnoreCase("null")) {
                    var19 = null;
                }
                class306.field4358[var20 - 1] = var19;
                class262.field3843[var20 - 1] = var22;
                class79.field974[var20 - 1] = var21 == 0;
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class225.field3412) {
            boolean var23 = class345.field5016.method1701(-23121) == 1;
            String var24 = class345.field5016.method1750(94);
            String var25 = var24;
            if (var23) {
                var25 = class345.field5016.method1750(-128);
            }
            long var26 = class345.field5016.method1703(121);
            long var28 = (long) class345.field5016.method1729(65280);
            long var30 = (long) class345.field5016.method1748(false);
            int var32 = class345.field5016.method1701(-23121);
            long var33 = (var28 << 32) + var30;
            boolean var35 = false;
            int var36 = 0;
            while (true) {
                if (var36 >= 100) {
                    if (var32 <= 1) {
                        if (!(!class479.field6717 || class23.field308) || class363.field5221) {
                            var35 = true;
                        } else if (class114.method722(var25, -25288)) {
                            var35 = true;
                        }
                    }
                    break;
                }
                if (class62.field821[var36] == var33) {
                    var35 = true;
                    break;
                }
                var36++;
            }
            if (!var35 && class479.field6716 == 0) {
                class62.field821[class467.field6593] = var33;
                class467.field6593 = (class467.field6593 + 1) % 100;
                String var37 = class113.method717(true, class61.method384(class345.field5016, 32767));
                if (var32 == 2 || var32 == 3) {
                    class190.method1178("<img=1>" + var25, 9, class420.method2471(6, var26), -26824, "<img=1>" + var24, 0, -1, var37);
                } else if (var32 == 1) {
                    class190.method1178("<img=0>" + var25, 9, class420.method2471(6, var26), -26824, "<img=0>" + var24, 0, -1, var37);
                } else {
                    class190.method1178(var25, 9, class420.method2471(6, var26), -26824, var24, 0, -1, var37);
                }
            }
            class393.field5568 = null;
            return true;
        } else if (class90.field1125 == class393.field5568) {
            int var38 = class345.field5016.method1749((byte) -75);
            if (var38 == 65535) {
                var38 = -1;
            }
            int var39 = class345.field5016.method1717(-91);
            int var40 = class345.field5016.method1740((byte) -54);
            if (class213.method1378(var40, false)) {
                class99.method565(var39, 0, -1, var38, 1);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class250.field3690) {
            class140.field1859.method2696((byte) 84);
            class393.field5568 = null;
            class368.field5318 += 32;
            return true;
        } else if (class94.field1207 == class393.field5568) {
            int var41 = class345.field5016.method1729(65280);
            int var42 = class345.field5016.method1729(65280);
            int var43 = class345.field5016.method1729(65280);
            int var44 = class345.field5016.method1729(65280);
            if (class213.method1378(var41, false) && class112.field1421[var42] != null) {
                for (int var45 = var43; var45 < var44; var45++) {
                    int var46 = class345.field5016.method1748(false);
                    if (var45 < class112.field1421[var42].length && class112.field1421[var42][var45] != null) {
                        class112.field1421[var42][var45].field2054 = var46;
                    }
                }
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class191.field2836) {
            class347.field5024 = class27.field367;
            if (class382.field5447 == 0) {
                class446.field6176 = null;
                class58.field755 = 0;
                class293.field4254 = null;
                class88.field1073 = null;
                class393.field5568 = null;
                return true;
            }
            class446.field6176 = class345.field5016.method1750(65);
            boolean var47 = class345.field5016.method1701(-23121) == 1;
            if (var47) {
                class345.field5016.method1750(-107);
            }
            long var48 = class345.field5016.method1703(96);
            class293.field4254 = class8.method32(var48, (byte) -104);
            class33.field427 = class345.field5016.method1715((byte) 74);
            int var50 = class345.field5016.method1701(-23121);
            if (var50 == 255) {
                class393.field5568 = null;
                return true;
            }
            class58.field755 = var50;
            class281[] var51 = new class281[100];
            for (int var52 = 0; var52 < class58.field755; var52++) {
                var51[var52] = new class281();
                var51[var52].field4142 = class345.field5016.method1750(-98);
                boolean var58 = class345.field5016.method1701(-23121) == 1;
                if (var58) {
                    var51[var52].field4141 = class345.field5016.method1750(4);
                } else {
                    var51[var52].field4141 = var51[var52].field4142;
                }
                var51[var52].field4145 = class191.method1180((byte) -104, var51[var52].field4141);
                var51[var52].field4143 = class345.field5016.method1729(65280);
                var51[var52].field4138 = class345.field5016.method1715((byte) 39);
                var51[var52].field4144 = class345.field5016.method1750(-120);
                if (var51[var52].field4141.equals(class492.field6935.field6277)) {
                    class287.field4187 = var51[var52].field4138;
                }
            }
            boolean var53 = false;
            int var54 = class58.field755;
            while (var54 > 0) {
                var54--;
                boolean var55 = true;
                for (int var56 = 0; var56 < var54; var56++) {
                    if (var51[var56].field4145.compareTo(var51[var56 + 1].field4145) > 0) {
                        class281 var57 = var51[var56];
                        var51[var56] = var51[var56 + 1];
                        var51[var56 + 1] = var57;
                        var55 = false;
                    }
                }
                if (var55) {
                    break;
                }
            }
            class88.field1073 = var51;
            class393.field5568 = null;
            return true;
        } else if (class393.field5569 == class393.field5568) {
            int var59 = class345.field5016.method1688(20402);
            int var60 = var59 >> 28 & 0x3;
            int var61 = var59 >> 14 & 0x3FFF;
            int var62 = var59 & 0x3FFF;
            int var63 = class345.field5016.method1701(-23121);
            int var64 = var63 >> 2;
            int var65 = var63 & 0x3;
            int var66 = class339.field4951[var64];
            int var67 = class345.field5016.method1729(65280);
            int var68 = var61 - class240.field3602;
            if (var67 == 65535) {
                var67 = -1;
            }
            int var69 = var62 - class360.field5180;
            class29.method211(var67, var60, var65, var66, 5, var68, var64, var69);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class306.field4355) {
            int var70 = class345.field5016.method1723(255);
            int var71 = class345.field5016.method1709(255);
            int var72 = class345.field5016.method1749((byte) -75);
            if (class213.method1378(var71, false)) {
                class124.method748((byte) -119, var72, var70);
            }
            class393.field5568 = null;
            return true;
        } else if (class8.field77 == class393.field5568) {
            int var73 = class345.field5016.method1688(20402);
            int var74 = class345.field5016.method1709(255);
            int var75 = class345.field5016.method1688(20402);
            int var76 = class345.field5016.method1749((byte) -75);
            if (class213.method1378(var76, false)) {
                class99.method565(var75, 0, var73, var74, 5);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == field2585) {
            int var77 = class345.field5016.method1701(-23121);
            int var78 = class345.field5016.method1749((byte) -75);
            boolean var79 = (var77 & 0x1) == 1;
            class312.method1926(var78, (byte) -53, var79);
            class220.field3281[class367.method2256(class451.field6238++, 31)] = var78;
            class393.field5568 = null;
            return true;
        } else if (class481.field6742 == class393.field5568) {
            class63.method394(class329.field4764, -1);
            class393.field5568 = null;
            return true;
        } else if (class55.field743 == class393.field5568) {
            int var80 = class345.field5016.method1741((byte) 61);
            int var81 = class345.field5016.method1688(20402);
            int var82 = class345.field5016.method1729(65280);
            if (class213.method1378(var82, false)) {
                class326.method2068((byte) -107, var80, var81);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class361.field5192) {
            class63.method394(class469.field6604, -1);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class333.field4845) {
            int var83 = class345.field5016.method1729(65280);
            int var84 = class345.field5016.method1688(20402);
            if (class213.method1378(var83, false)) {
                class465 var85 = (class465) class146.field2146.method2761((long) var84, (byte) -112);
                if (var85 != null) {
                    class207.method1354(var85, false, -127, true);
                }
                if (class207.field3166 != null) {
                    class22.method148((byte) -78, class207.field3166);
                    class207.field3166 = null;
                }
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class343.field4995) {
            int var86 = class345.field5016.method1729(65280);
            if (class213.method1378(var86, false)) {
                class475.method2785(-12231);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class30.field403) {
            int var87 = class345.field5016.method1710(65536);
            int var88 = class345.field5016.method1709(255);
            if (var88 == 65535) {
                var88 = -1;
            }
            int var89 = class345.field5016.method1709(255);
            int var90 = class345.field5016.method1710(65536);
            if (class213.method1378(var89, false)) {
                class38.method256(74, var88, var90, var87);
                class41 var91 = class64.field834.method2129(var88, false);
                class405.method2406(var91.field576, 8, var91.field591, var91.field582, var87);
                class75.method440(var91.field535, var91.field580, var87, -89, var91.field550);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class37.field486) {
            class350.field5065 = class345.field5016.method1701(-23121);
            for (int var92 = 0; var92 < class350.field5065; var92++) {
                class7.field70[var92] = class345.field5016.method1750(1);
                class143.field1897[var92] = class345.field5016.method1750(58);
                if (class143.field1897[var92].equals("")) {
                    class143.field1897[var92] = class7.field70[var92];
                }
                class204.field3025[var92] = class345.field5016.method1750(2);
                class404.field5693[var92] = class345.field5016.method1750(-106);
                if (class404.field5693[var92].equals("")) {
                    class404.field5693[var92] = class204.field3025[var92];
                }
                class328.field4751[var92] = false;
            }
            class393.field5568 = null;
            class99.field1271 = class27.field367;
            return true;
        } else if (class393.field5568 == class145.field2017) {
            int var93 = class345.field5016.method1749((byte) -75);
            int var94 = class345.field5016.method1709(255);
            int var95 = class345.field5016.method1735(112);
            class216 var96 = class139.field1851[var93];
            if (var96 != null) {
                class41.method283(var95, (byte) -104, var94, var96);
            }
            class393.field5568 = null;
            return true;
        } else if (class405.field5700 == class393.field5568) {
            class345.field5016.field4021 += 28;
            if (class345.field5016.method1705(-21)) {
                class180.method1108((byte) 78, class345.field5016.field4021 - 28, class345.field5016);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class225.field3414) {
            class306.field4357 = class345.field5016.method1697((byte) 12);
            class338.field4928 = class345.field5016.method1746(17037);
            client.field2622 = class345.field5016.method1735(124);
            while (class345.field5016.field4021 < class382.field5447) {
                class311 var97 = class252.method1575(false)[class345.field5016.method1701(-23121)];
                class63.method394(var97, -1);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class206.field3150) {
            class403.field5688 = class345.field5016.method1735(100);
            class220.field3283 = class345.field5016.method1697((byte) 12);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class182.field2639) {
            String var98 = class345.field5016.method1750(-113);
            int var99 = class345.field5016.method1729(65280);
            String var100 = class226.method1452(-32769, var99).method976(0, class345.field5016);
            class190.method1178(var98, 19, (String) null, -26824, var98, 0, var99, var100);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class142.field1884) {
            class63.method394(class94.field1216, -1);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class224.field3395) {
            class148.method935(50, false);
            class393.field5568 = null;
            return false;
        } else if (class393.field5568 == class349.field5054) {
            class467.field6588 = class345.field5016.method1729(65280) * 30;
            class304.field4327 = class27.field367;
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class362.field5203) {
            int var101 = class345.field5016.method1729(65280);
            int var102 = class345.field5016.method1701(-23121);
            boolean var103 = (var102 & 0x1) == 1;
            while (class345.field5016.field4021 < class382.field5447) {
                int var104 = class345.field5016.method1712(-1);
                int var105 = class345.field5016.method1729(65280);
                int var106 = 0;
                if (var105 != 0) {
                    var106 = class345.field5016.method1701(-23121);
                    if (var106 == 255) {
                        var106 = class345.field5016.method1688(20402);
                    }
                }
                class267.method1644(var103, var104, var106, var105 - 1, 255, var101);
            }
            class220.field3281[class367.method2256(31, class451.field6238++)] = var101;
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class167.field2445) {
            class63.method394(class361.field5196, -1);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class339.field4949) {
            int var107 = class345.field5016.method1712(-1);
            int var108 = class345.field5016.method1688(20402);
            int var109 = class345.field5016.method1701(-23121);
            String var110 = "";
            String var111 = var110;
            if ((var109 & 0x1) != 0) {
                var110 = class345.field5016.method1750(-117);
                if ((var109 & 0x2) == 0) {
                    var111 = var110;
                } else {
                    var111 = class345.field5016.method1750(24);
                }
            }
            String var112 = class345.field5016.method1750(5);
            if (var107 == 99) {
                class414.method2443(false, var112);
            } else if (var111.equals("") || !class114.method722(var111, -25288)) {
                class42.method284(var110, (byte) 97, var112, var111, var108, var107);
            } else {
                class393.field5568 = null;
                return true;
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class184.field2712) {
            int var113 = class345.field5016.method1740((byte) 82);
            byte var114 = class345.field5016.method1700(32767);
            class140.field1859.method2698(var114, (byte) 115, var113);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class180.field2595) {
            int var115 = class345.field5016.method1709(255);
            int var116 = class345.field5016.method1728(6534);
            int var117 = class345.field5016.method1702(-104);
            int var118 = class345.field5016.method1710(65536);
            if (class213.method1378(var115, false)) {
                class172.method1064(320, var116, var117, var118);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class142.field1891) {
            int var119 = class345.field5016.method1701(-23121);
            int var120 = var119 >> 5;
            int var121 = var119 & 0x1F;
            if (var121 == 0) {
                class273.field3974[var120] = null;
                class393.field5568 = null;
                return true;
            }
            class141 var122 = new class141();
            var122.field1877 = var121;
            var122.field1876 = class345.field5016.method1701(-23121);
            if (var122.field1876 >= 0 && var122.field1876 < class375.field5397.length) {
                if (var122.field1877 == 1 || var122.field1877 == 10) {
                    var122.field1872 = class345.field5016.method1729(65280);
                    class345.field5016.field4021 += 6;
                } else if (var122.field1877 >= 2 && var122.field1877 <= 6) {
                    if (var122.field1877 == 2) {
                        var122.field1863 = 64;
                        var122.field1865 = 64;
                    }
                    if (var122.field1877 == 3) {
                        var122.field1865 = 0;
                        var122.field1863 = 64;
                    }
                    if (var122.field1877 == 4) {
                        var122.field1863 = 64;
                        var122.field1865 = 128;
                    }
                    if (var122.field1877 == 5) {
                        var122.field1865 = 64;
                        var122.field1863 = 0;
                    }
                    if (var122.field1877 == 6) {
                        var122.field1863 = 128;
                        var122.field1865 = 64;
                    }
                    var122.field1877 = 2;
                    var122.field1864 = class345.field5016.method1701(-23121);
                    var122.field1871 = class345.field5016.method1729(65280);
                    var122.field1866 = class345.field5016.method1729(65280);
                    var122.field1868 = class345.field5016.method1701(-23121);
                    var122.field1873 = class345.field5016.method1729(65280);
                }
                var122.field1862 = class345.field5016.method1729(65280);
                if (var122.field1862 == 65535) {
                    var122.field1862 = -1;
                }
                class273.field3974[var120] = var122;
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class132.field1737) {
            String var123 = class345.field5016.method1750(54);
            int var124 = class345.field5016.method1709(255);
            int var125 = class345.field5016.method1740((byte) 78);
            if (class213.method1378(var125, false)) {
                class271.method1657(true, var124, var123);
            }
            class393.field5568 = null;
            return true;
        } else if (class7.field68 == class393.field5568) {
            class63.method394(class185.field2743, -1);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class306.field4354) {
            int var126 = class345.field5016.method1729(65280);
            int var127 = class345.field5016.method1710(65536);
            int var128 = class345.field5016.method1709(255);
            if (class213.method1378(var126, false)) {
                class208.method1360(var127, var128, (byte) 45);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class305.field4339) {
            class63.method394(class359.field5168, -1);
            class393.field5568 = null;
            return true;
        } else if (class492.field6937 == class393.field5568) {
            while (class345.field5016.field4021 < class382.field5447) {
                boolean var139 = class345.field5016.method1701(-23121) == 1;
                String var140 = class345.field5016.method1750(-123);
                String var141 = class345.field5016.method1750(24);
                int var142 = class345.field5016.method1729(65280);
                int var143 = class345.field5016.method1701(-23121);
                String var144 = "";
                boolean var145 = false;
                if (var142 > 0) {
                    var144 = class345.field5016.method1750(-117);
                    var145 = class345.field5016.method1701(-23121) == 1;
                }
                for (int var146 = 0; var146 < class237.field3564; var146++) {
                    if (var139) {
                        if (var141.equals(class24.field310[var146])) {
                            class24.field310[var146] = var140;
                            var140 = null;
                            class116.field1477[var146] = var141;
                            break;
                        }
                    } else if (var140.equals(class24.field310[var146])) {
                        if (class243.field3624[var146] != var142) {
                            class243.field3624[var146] = var142;
                            if (var142 > 0) {
                                class42.method284("", (byte) 97, var140 + class160.field2376.method2065(52, class326.field4711), "", 0, 5);
                            }
                            if (var142 == 0) {
                                class42.method284("", (byte) 97, var140 + class242.field3619.method2065(107, class326.field4711), "", 0, 5);
                            }
                        }
                        class116.field1477[var146] = var141;
                        class26.field334[var146] = var144;
                        class237.field3558[var146] = var143;
                        var140 = null;
                        class225.field3416[var146] = var145;
                        break;
                    }
                }
                if (var140 != null && class237.field3564 < 200) {
                    class24.field310[class237.field3564] = var140;
                    class116.field1477[class237.field3564] = var141;
                    class243.field3624[class237.field3564] = var142;
                    class26.field334[class237.field3564] = var144;
                    class237.field3558[class237.field3564] = var143;
                    class225.field3416[class237.field3564] = var145;
                    class237.field3564++;
                }
            }
            class140.field1856 = 2;
            class99.field1271 = class27.field367;
            boolean var129 = false;
            int var130 = class237.field3564;
            while (var130 > 0) {
                boolean var131 = true;
                var130--;
                for (int var132 = 0; var132 < var130; var132++) {
                    if (class243.field3624[var132] != class185.field2746 && class243.field3624[var132 + 1] == class185.field2746 || class243.field3624[var132] == 0 && class243.field3624[var132 + 1] != 0) {
                        int var133 = class243.field3624[var132];
                        class243.field3624[var132] = class243.field3624[var132 + 1];
                        class243.field3624[var132 + 1] = var133;
                        String var134 = class26.field334[var132];
                        class26.field334[var132] = class26.field334[var132 + 1];
                        class26.field334[var132 + 1] = var134;
                        String var135 = class24.field310[var132];
                        class24.field310[var132] = class24.field310[var132 + 1];
                        class24.field310[var132 + 1] = var135;
                        String var136 = class116.field1477[var132];
                        class116.field1477[var132] = class116.field1477[var132 + 1];
                        class116.field1477[var132 + 1] = var136;
                        int var137 = class237.field3558[var132];
                        class237.field3558[var132] = class237.field3558[var132 + 1];
                        class237.field3558[var132 + 1] = var137;
                        boolean var138 = class225.field3416[var132];
                        class225.field3416[var132] = class225.field3416[var132 + 1];
                        var131 = false;
                        class225.field3416[var132 + 1] = var138;
                    }
                }
                if (var131) {
                    break;
                }
            }
            class393.field5568 = null;
            return true;
        } else if (class412.field5803 == class393.field5568) {
            int var147 = class345.field5016.method1729(65280);
            int var148 = class345.field5016.method1740((byte) 59);
            int var149 = class345.field5016.method1729(65280);
            if (class213.method1378(var147, false)) {
                class206.method1349(0, 3, var148, var149);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class275.field3988) {
            int var150 = class345.field5016.method1740((byte) -58);
            int var151 = class345.field5016.method1717(-91);
            if (class213.method1378(var150, false)) {
                class99.method565(var151, 0, 0, class295.field4273, 5);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class351.field5084) {
            class63.method394(class353.field5099, -1);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class38.field509) {
            int var152 = class345.field5016.method1717(-91);
            int var153 = class345.field5016.method1740((byte) -108);
            int var154 = class345.field5016.method1749((byte) -75);
            if (class213.method1378(var153, false)) {
                class476.method2791((byte) -91, var152, var154);
            }
            class393.field5568 = null;
            return true;
        } else if (class424.field5950 == class393.field5568) {
            class63.method394(class111.field1408, -1);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class327.field4734) {
            int var155 = class345.field5016.method1701(-23121);
            boolean var156 = (var155 & 0x1) == 1;
            String var157 = class345.field5016.method1750(88);
            String var158 = class345.field5016.method1750(46);
            if (var158.equals("")) {
                var158 = var157;
            }
            String var159 = class345.field5016.method1750(-102);
            String var160 = class345.field5016.method1750(62);
            if (var160.equals("")) {
                var160 = var159;
            }
            if (var156) {
                for (int var161 = 0; var161 < class350.field5065; var161++) {
                    if (class143.field1897[var161].equals(var160)) {
                        class7.field70[var161] = var157;
                        class143.field1897[var161] = var158;
                        class204.field3025[var161] = var159;
                        class404.field5693[var161] = var160;
                        break;
                    }
                }
            } else {
                class7.field70[class350.field5065] = var157;
                class143.field1897[class350.field5065] = var158;
                class204.field3025[class350.field5065] = var159;
                class404.field5693[class350.field5065] = var160;
                class328.field4751[class350.field5065] = class367.method2256(2, var155) == 2;
                class350.field5065++;
            }
            class99.field1271 = class27.field367;
            class393.field5568 = null;
            return true;
        } else if (class61.field803 == class393.field5568) {
            int var162 = class345.field5016.method1710(65536);
            int var163 = class345.field5016.method1729(65280);
            int var164 = class345.field5016.method1749((byte) -75);
            int var165 = class345.field5016.method1701(-23121);
            if (class213.method1378(var163, false)) {
                class465 var166 = (class465) class146.field2146.method2761((long) var162, (byte) -112);
                if (var166 != null) {
                    class207.method1354(var166, false, -126, var166.field6502 != var164);
                }
                class411.method2435(var164, false, var162, var165, false);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class138.field1829) {
            int var167 = class345.field5016.method1735(115);
            int var168 = class345.field5016.method1709(255);
            if (class213.method1378(var168, false)) {
                class282.field4152 = var167;
            }
            class393.field5568 = null;
            return true;
        } else if (class466.field6510 == class393.field5568) {
            class220.field3285 = class38.method252(class345.field5016.method1701(-23121), (byte) -128);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class261.field3826) {
            byte var169 = class345.field5016.method1715((byte) -87);
            int var170 = class345.field5016.method1740((byte) -60);
            int var171 = class345.field5016.method1740((byte) 119);
            if (class213.method1378(var170, false)) {
                class124.method748((byte) -126, var171, var169);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class111.field1416) {
            class63.method394(class247.field3655, -1);
            class393.field5568 = null;
            return true;
        } else if (class412.field5805 == class393.field5568) {
            int var172 = class345.field5016.method1701(-23121);
            if (class345.field5016.method1701(-23121) == 0) {
                class238.field3569[var172] = new class241();
            } else {
                class345.field5016.field4021--;
                class238.field3569[var172] = new class241(class345.field5016);
            }
            class345.field5014 = class27.field367;
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class339.field4950) {
            int var173 = class345.field5016.method1709(255);
            int var174 = class345.field5016.method1709(255);
            int var175 = class345.field5016.method1717(-91);
            int var176 = class345.field5016.method1749((byte) -75);
            int var177 = class345.field5016.method1709(255);
            if (class213.method1378(var176, false)) {
                class405.method2406(var174, 8, var173, var177, var175);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class267.field3904) {
            int var178 = class345.field5016.method1749((byte) -75);
            String var179 = class345.field5016.method1750(109);
            int var180 = class345.field5016.method1688(20402);
            if (class213.method1378(var178, false)) {
                class362.method2235(var180, var179, (byte) 124);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class265.field3884) {
            int var181 = class345.field5016.method1688(20402);
            int var182 = class345.field5016.method1709(255);
            int var183 = class345.field5016.method1729(65280);
            int var184 = class345.field5016.method1749((byte) -75);
            if ((var181 >> 30) != 0) {
                int var185 = (var181 & 0x3F49C933) >> 28;
                int var186 = ((var181 & 0xFFFF232) >> 14) - class240.field3602;
                int var187 = (var181 & 0x3FFF) - class360.field5180;
                if (var186 >= 0 && var187 >= 0 && var186 < class58.field758 && var187 < class287.field4181) {
                    int var188 = var186 * 128 + 64;
                    int var189 = var187 * 128 + 64;
                    class428 var190 = new class428(var183, 0, class353.field5090, var185, var188, class132.method835(var189, var185, var188, 2002) - var182, var189, var186, var186, var187, var187);
                    class387.field5504.method2845(new class273(var190), (byte) 37);
                }
            } else if ((var181 >> 29) != 0) {
                int var191 = var181 & 0xFFFF;
                class216 var192 = class139.field1851[var191];
                if (var192 != null) {
                    if (var183 == 65535) {
                        var183 = -1;
                    }
                    boolean var193 = true;
                    if (var183 != -1 && var192.field2147 != -1) {
                        if (var192.field2147 == var183) {
                            class327 var198 = class324.field4674.method1279(var183, -2);
                            if (var198.field4728 && var198.field4714 != -1) {
                                class153 var199 = class64.field836.method2081(var198.field4714, 0);
                                int var200 = var199.field2260;
                                if (var200 == 0 || var200 == 2) {
                                    var193 = false;
                                } else if (var200 == 1) {
                                    var193 = true;
                                }
                            }
                        } else {
                            class327 var194 = class324.field4674.method1279(var183, -2);
                            class327 var195 = class324.field4674.method1279(var192.field2147, -2);
                            if (var194.field4714 != -1 && var195.field4714 != -1) {
                                class153 var196 = class64.field836.method2081(var194.field4714, 0);
                                class153 var197 = class64.field836.method2081(var195.field4714, 0);
                                if (var197.field2289 > var196.field2289) {
                                    var193 = false;
                                }
                            }
                        }
                    }
                    if (var193) {
                        var192.field2101 = var182;
                        var192.field2139 = 0;
                        var192.field2147 = var183;
                        var192.field2129 = 0;
                        var192.field2115 = 1;
                        var192.field2096 = class353.field5090 + var184;
                        if (class353.field5090 < var192.field2096) {
                            var192.field2129 = -1;
                        }
                        if (var192.field2147 != -1 && class353.field5090 == var192.field2096) {
                            int var201 = class324.field4674.method1279(var192.field2147, -2).field4714;
                            if (var201 != -1) {
                                class153 var202 = class64.field836.method2081(var201, 0);
                                if (var202 != null && var202.field2254 != null) {
                                    class237.method1508(var192.field4319, (byte) 127, var192.field4331, 0, var202, var192.field4317, false);
                                }
                            }
                        }
                    }
                }
            } else if ((var181 >> 28) != 0) {
                int var203 = var181 & 0xFFFF;
                class452 var204;
                if (class295.field4273 == var203) {
                    var204 = class492.field6935;
                } else {
                    var204 = class124.field1559[var203];
                }
                if (var204 != null) {
                    if (var183 == 65535) {
                        var183 = -1;
                    }
                    boolean var205 = true;
                    if (var183 != -1 && var204.field2147 != -1) {
                        if (var204.field2147 == var183) {
                            class327 var210 = class324.field4674.method1279(var183, -2);
                            if (var210.field4728 && var210.field4714 != -1) {
                                class153 var211 = class64.field836.method2081(var210.field4714, 0);
                                int var212 = var211.field2260;
                                if (var212 == 0 || var212 == 2) {
                                    var205 = false;
                                } else if (var212 == 1) {
                                    var205 = true;
                                }
                            }
                        } else {
                            class327 var206 = class324.field4674.method1279(var183, -2);
                            class327 var207 = class324.field4674.method1279(var204.field2147, -2);
                            if (var206.field4714 != -1 && var207.field4714 != -1) {
                                class153 var208 = class64.field836.method2081(var206.field4714, 0);
                                class153 var209 = class64.field836.method2081(var207.field4714, 0);
                                if (var209.field2289 > var208.field2289) {
                                    var205 = false;
                                }
                            }
                        }
                    }
                    if (var205) {
                        var204.field2129 = 0;
                        var204.field2101 = var182;
                        var204.field2147 = var183;
                        var204.field2096 = class353.field5090 + var184;
                        var204.field2115 = 1;
                        var204.field2139 = 0;
                        if (var204.field2147 == 65535) {
                            var204.field2147 = -1;
                        }
                        if (class353.field5090 < var204.field2096) {
                            var204.field2129 = -1;
                        }
                        if (var204.field2147 != -1 && class353.field5090 == var204.field2096) {
                            int var213 = class324.field4674.method1279(var204.field2147, -2).field4714;
                            if (var213 != -1) {
                                class153 var214 = class64.field836.method2081(var213, 0);
                                if (var214 != null && var214.field2254 != null) {
                                    class237.method1508(var204.field4319, (byte) -118, var204.field4331, 0, var214, var204.field4317, class492.field6935 == var204);
                                }
                            }
                        }
                    }
                }
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class206.field3160) {
            int var215 = class345.field5016.method1717(-91);
            int var216 = class345.field5016.method1729(65280);
            class140.field1859.method2698(var215, (byte) 115, var216);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class125.field1634) {
            class202.field2980 = class345.field5016.method1701(-23121);
            class304.field4327 = class27.field367;
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class125.field1633) {
            int var217 = class345.field5016.method1729(65280);
            int var218 = class345.field5016.method1701(-23121);
            int var219 = class345.field5016.method1701(-23121);
            int var220 = class345.field5016.method1701(-23121);
            int var221 = class345.field5016.method1701(-23121);
            int var222 = class345.field5016.method1729(65280);
            if (class213.method1378(var217, false)) {
                class238.field3570[var218] = true;
                class407.field5713[var218] = var219;
                class23.field306[var218] = var220;
                class326.field4709[var218] = var221;
                class422.field5885[var218] = var222;
            }
            class393.field5568 = null;
            return true;
        } else if (class431.field6037 == class393.field5568) {
            int var223 = class345.field5016.method1749((byte) -75);
            int var224 = class345.field5016.method1688(20402);
            class140.field1859.method2691(false, var223, var224);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class303.field4312) {
            if (class382.field5447 == 0) {
                class66.field846 = class434.field6055.method2065(52, class326.field4711);
            } else {
                class66.field846 = class345.field5016.method1750(-108);
            }
            class393.field5568 = null;
            return true;
        } else if (class63.field829 == class393.field5568) {
            client.field2622 = class345.field5016.method1697((byte) 12);
            class338.field4928 = class345.field5016.method1746(17037);
            class306.field4357 = class345.field5016.method1746(17037);
            for (class442 var225 = (class442) class269.field3928.method2769((byte) 59); var225 != null; var225 = (class442) class269.field3928.method2768((byte) -88)) {
                int var227 = (int) (var225.field3568 & 0x3FFFL);
                int var228 = (int) (var225.field3568 >> 14 & 0x3FFFL);
                int var229 = (int) (var225.field3568 >> 28 & 0x3L);
                if (class338.field4928 == var229 && client.field2622 <= var227 && (client.field2622 + 8) > var227 && class306.field4357 <= var228 && (class306.field4357 + 8) > var228) {
                    var225.method1510((byte) -13);
                    class486.method2848(var227, class338.field4928, -25665, var228);
                }
            }
            for (class393 var226 = (class393) class34.field445.method2843(1123227612); var226 != null; var226 = (class393) class34.field445.method2842(1673506446)) {
                if (var226.field5573 >= client.field2622 && client.field2622 + 8 > var226.field5573 && class306.field4357 <= var226.field5579 && (class306.field4357 + 8) > var226.field5579 && class338.field4928 == var226.field5581) {
                    var226.field5570 = 0;
                }
            }
            class393.field5568 = null;
            return true;
        } else if (class491.field6918 == class393.field5568) {
            int var230 = class345.field5016.method1688(20402);
            int var231 = class345.field5016.method1729(65280);
            if (class213.method1378(var231, false)) {
                class99.method565(var230, 0, -1, -1, 3);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class170.field2484) {
            int var232 = class345.field5016.method1709(255);
            int var233 = class345.field5016.method1710(65536);
            int var234 = class345.field5016.method1723(255);
            if (class213.method1378(var232, false)) {
                class465 var235 = (class465) class146.field2146.method2761((long) var234, (byte) -112);
                class465 var236 = (class465) class146.field2146.method2761((long) var233, (byte) -112);
                if (var236 != null) {
                    class207.method1354(var236, false, -128, var235 == null || var235.field6502 != var236.field6502);
                }
                if (var235 != null) {
                    var235.method1510((byte) -13);
                    class146.field2146.method2767(-1, (long) var233, var235);
                }
                class145 var237 = class166.method1028(var234, 108);
                if (var237 != null) {
                    class22.method148((byte) -78, var237);
                }
                class145 var238 = class166.method1028(var233, 109);
                if (var238 != null) {
                    class22.method148((byte) -78, var238);
                    class88.method495(true, var238, (byte) 92);
                }
                if (class36.field472 != -1) {
                    class24.method169((byte) -6, class36.field472, 1);
                }
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class332.field4837) {
            class393.field5568 = null;
            class99.field1271 = class27.field367;
            class140.field1856 = 1;
            return true;
        } else if (class393.field5568 == class160.field2362) {
            int var239 = class345.field5016.method1729(65280);
            if (var239 == 65535) {
                var239 = -1;
            }
            int var240 = class345.field5016.method1697((byte) 12);
            int var241 = class345.field5016.method1697((byte) 12);
            class302.method1881(var239, var240, (byte) -96, var241);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class157.field2342) {
            int var242 = class345.field5016.method1701(-23121);
            int var243 = class345.field5016.method1693(-1);
            int var244 = class345.field5016.method1749((byte) -75);
            if (var244 == 65535) {
                var244 = -1;
            }
            class314.method1942(var244, var242, 100, var243);
            class393.field5568 = null;
            return true;
        } else if (class483.field6804 == class393.field5568) {
            boolean var245 = class345.field5016.method1701(-23121) == 1;
            String var246 = class345.field5016.method1750(-110);
            String var247 = var246;
            if (var245) {
                var247 = class345.field5016.method1750(-109);
            }
            long var248 = (long) class345.field5016.method1729(65280);
            long var250 = (long) class345.field5016.method1748(false);
            int var252 = class345.field5016.method1701(-23121);
            long var253 = (var248 << 32) + var250;
            boolean var255 = false;
            int var256 = 0;
            while (true) {
                if (var256 >= 100) {
                    if (var252 <= 1) {
                        if (!(!class479.field6717 || class23.field308) || class363.field5221) {
                            var255 = true;
                        } else if (class114.method722(var247, -25288)) {
                            var255 = true;
                        }
                    }
                    break;
                }
                if (class62.field821[var256] == var253) {
                    var255 = true;
                    break;
                }
                var256++;
            }
            if (!var255 && class479.field6716 == 0) {
                class62.field821[class467.field6593] = var253;
                class467.field6593 = (class467.field6593 + 1) % 100;
                String var257 = class113.method717(true, class61.method384(class345.field5016, 32767));
                if (var252 == 2) {
                    class190.method1178("<img=1>" + var247, 7, (String) null, -26824, "<img=1>" + var246, 0, -1, var257);
                } else if (var252 == 1) {
                    class190.method1178("<img=0>" + var247, 7, (String) null, -26824, "<img=0>" + var246, 0, -1, var257);
                } else {
                    class190.method1178(var247, 3, (String) null, -26824, var246, 0, -1, var257);
                }
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class177.field2535) {
            String var258 = class345.field5016.method1750(-93);
            boolean var259 = class345.field5016.method1701(-23121) == 1;
            String var260;
            if (var259) {
                var260 = class345.field5016.method1750(-14);
            } else {
                var260 = var258;
            }
            int var261 = class345.field5016.method1729(65280);
            byte var262 = class345.field5016.method1715((byte) 113);
            boolean var263 = false;
            if (var262 == -128) {
                var263 = true;
            }
            if (var263) {
                if (class58.field755 == 0) {
                    class393.field5568 = null;
                    return true;
                }
                boolean var269 = false;
                int var270;
                for (var270 = 0; var270 < class58.field755 && (!class88.field1073[var270].field4141.equals(var260) || class88.field1073[var270].field4143 != var261); var270++) {
                }
                if (var270 < class58.field755) {
                    while (var270 < (class58.field755 - 1)) {
                        class88.field1073[var270] = class88.field1073[var270 + 1];
                        var270++;
                    }
                    class58.field755--;
                    class88.field1073[class58.field755] = null;
                }
            } else {
                String var264 = class345.field5016.method1750(-123);
                class281 var265 = new class281();
                var265.field4142 = var258;
                var265.field4141 = var260;
                var265.field4145 = class191.method1180((byte) -94, var265.field4141);
                var265.field4144 = var264;
                var265.field4138 = var262;
                var265.field4143 = var261;
                int var266;
                for (var266 = class58.field755 - 1; var266 >= 0; var266--) {
                    int var267 = class88.field1073[var266].field4145.compareTo(var265.field4145);
                    if (var267 == 0) {
                        class88.field1073[var266].field4143 = var261;
                        class88.field1073[var266].field4138 = var262;
                        class88.field1073[var266].field4144 = var264;
                        if (var260.equals(class492.field6935.field6277)) {
                            class287.field4187 = var262;
                        }
                        class393.field5568 = null;
                        class347.field5024 = class27.field367;
                        return true;
                    }
                    if (var267 < 0) {
                        break;
                    }
                }
                if (class88.field1073.length <= class58.field755) {
                    class393.field5568 = null;
                    return true;
                }
                for (int var268 = class58.field755 - 1; var268 > var266; var268--) {
                    class88.field1073[var268 + 1] = class88.field1073[var268];
                }
                if (class58.field755 == 0) {
                    class88.field1073 = new class281[100];
                }
                class88.field1073[var266 + 1] = var265;
                class58.field755++;
                if (var260.equals(class492.field6935.field6277)) {
                    class287.field4187 = var262;
                }
            }
            class347.field5024 = class27.field367;
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class222.field3379) {
            int var271 = class345.field5016.method1723(255);
            int var272 = class345.field5016.method1740((byte) 77);
            int var273 = class345.field5016.method1709(255);
            int var274 = class345.field5016.method1740((byte) -110);
            int var275 = class345.field5016.method1729(65280);
            if (class213.method1378(var275, false)) {
                class99.method565(var271, 0, var274, var272 | var273 << 16, 7);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class388.field5505) {
            class474.method2779(class345.field5016, class382.field5447, (byte) -65);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class266.field3889) {
            boolean var276 = class345.field5016.method1701(-23121) == 1;
            String var277 = class345.field5016.method1750(-22);
            String var278 = var277;
            if (var276) {
                var278 = class345.field5016.method1750(42);
            }
            long var279 = (long) class345.field5016.method1729(65280);
            long var281 = (long) class345.field5016.method1748(false);
            int var283 = class345.field5016.method1701(-23121);
            int var284 = class345.field5016.method1729(65280);
            long var285 = (var279 << 32) + var281;
            boolean var287 = false;
            int var288 = 0;
            while (true) {
                if (var288 >= 100) {
                    if (var283 <= 1 && class114.method722(var278, -25288)) {
                        var287 = true;
                    }
                    break;
                }
                if (class62.field821[var288] == var285) {
                    var287 = true;
                    break;
                }
                var288++;
            }
            if (!var287 && class479.field6716 == 0) {
                class62.field821[class467.field6593] = var285;
                class467.field6593 = (class467.field6593 + 1) % 100;
                String var289 = class226.method1452(-32769, var284).method976(0, class345.field5016);
                if (var283 == 2) {
                    class190.method1178("<img=1>" + var278, 18, (String) null, -26824, "<img=1>" + var277, 0, var284, var289);
                } else if (var283 == 1) {
                    class190.method1178("<img=0>" + var278, 18, (String) null, -26824, "<img=0>" + var277, 0, var284, var289);
                } else {
                    class190.method1178(var278, 18, (String) null, -26824, var277, 0, var284, var289);
                }
            }
            class393.field5568 = null;
            return true;
        } else if (class58.field759 == class393.field5568) {
            class63.method394(class311.field4398, -1);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class327.field4715) {
            boolean var290 = class345.field5016.method1701(-23121) == 1;
            String var291 = class345.field5016.method1750(-118);
            String var292 = var291;
            if (var290) {
                var292 = class345.field5016.method1750(-116);
            }
            long var293 = class345.field5016.method1703(-81);
            long var295 = (long) class345.field5016.method1729(65280);
            long var297 = (long) class345.field5016.method1748(false);
            int var299 = class345.field5016.method1701(-23121);
            int var300 = class345.field5016.method1729(65280);
            long var301 = (var295 << 32) + var297;
            boolean var303 = false;
            int var304 = 0;
            while (true) {
                if (var304 >= 100) {
                    if (var299 <= 1 && class114.method722(var292, -25288)) {
                        var303 = true;
                    }
                    break;
                }
                if (class62.field821[var304] == var301) {
                    var303 = true;
                    break;
                }
                var304++;
            }
            if (!var303 && class479.field6716 == 0) {
                class62.field821[class467.field6593] = var301;
                class467.field6593 = (class467.field6593 + 1) % 100;
                String var305 = class226.method1452(-32769, var300).method976(0, class345.field5016);
                if (var299 == 2) {
                    class190.method1178("<img=1>" + var292, 20, class420.method2471(6, var293), -26824, "<img=1>" + var291, 0, var300, var305);
                } else if (var299 == 1) {
                    class190.method1178("<img=0>" + var292, 20, class420.method2471(6, var293), -26824, "<img=0>" + var291, 0, var300, var305);
                } else {
                    class190.method1178(var292, 20, class420.method2471(6, var293), -26824, var291, 0, var300, var305);
                }
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class305.field4341) {
            int var306 = class345.field5016.method1709(255);
            int var307 = class345.field5016.method1729(65280);
            int var308 = class345.field5016.method1723(255);
            int var309 = class345.field5016.method1709(255);
            if (class213.method1378(var306, false)) {
                class349.method2181(var308, 75, (var309 << 16) + var307);
            }
            class393.field5568 = null;
            return true;
        } else if (class446.field6180 == class393.field5568) {
            int var310 = class345.field5016.method1735(110);
            int var311 = class345.field5016.method1749((byte) -75);
            class140.field1859.method2691(false, var311, var310);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class125.field1618) {
            int var312 = class345.field5016.method1729(65280);
            String var313 = class345.field5016.method1750(-127);
            Object[] var314 = new Object[var313.length() + 1];
            for (int var315 = var313.length() - 1; var315 >= 0; var315--) {
                if (var313.charAt(var315) == 's') {
                    var314[var315 + 1] = class345.field5016.method1750(-115);
                } else {
                    var314[var315 + 1] = Integer.valueOf(class345.field5016.method1688(20402));
                }
            }
            var314[0] = Integer.valueOf(class345.field5016.method1688(20402));
            if (class213.method1378(var312, false)) {
                class202 var316 = new class202();
                var316.field2971 = var314;
                class290.method1818(var316);
            }
            class393.field5568 = null;
            return true;
        } else if (class431.field6042 == class393.field5568) {
            class338.field4928 = class345.field5016.method1697((byte) 12);
            class306.field4357 = class345.field5016.method1735(92);
            client.field2622 = class345.field5016.method1735(100);
            class393.field5568 = null;
            return true;
        } else if (class441.field6120 == class393.field5568) {
            class148.method935(50, true);
            class393.field5568 = null;
            return false;
        } else if (class393.field5568 == class286.field4171) {
            int var317 = class345.field5016.method1749((byte) -75);
            int var318 = class345.field5016.method1749((byte) -75);
            if (var318 == 65535) {
                var318 = -1;
            }
            int var319 = class345.field5016.method1740((byte) -63);
            int var320 = class345.field5016.method1688(20402);
            int var321 = class345.field5016.method1749((byte) -75);
            if (var321 == 65535) {
                var321 = -1;
            }
            if (class213.method1378(var317, false)) {
                for (int var322 = var318; var322 <= var321; var322++) {
                    long var323 = ((long) var320 << 32) + (long) var322;
                    class385 var325 = (class385) class34.field443.method2761(var323, (byte) -112);
                    class385 var326;
                    if (var325 != null) {
                        var326 = new class385(var325.field5472, var319);
                        var325.method1510((byte) -13);
                    } else if (var322 == -1) {
                        var326 = new class385(class166.method1028(var320, 110).field2070.field5472, var319);
                    } else {
                        var326 = new class385(0, var319);
                    }
                    class34.field443.method2767(-1, var323, var326);
                }
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class216.field3229) {
            int var327 = class345.field5016.method1735(80);
            int var328 = class345.field5016.method1749((byte) -75);
            int var329 = class345.field5016.method1729(65280);
            if (class213.method1378(var328, false)) {
                if (var327 == 2) {
                    class28.method201(25);
                }
                class36.field472 = var329;
                class148.method937(-2, var329);
                class451.method2632(false, (byte) 101);
                class290.method1820(class36.field472);
                for (int var330 = 0; var330 < 100; var330++) {
                    class359.field5166[var330] = true;
                }
            }
            class393.field5568 = null;
            return true;
        } else if (class401.field5674 == class393.field5568) {
            int var331 = class345.field5016.method1729(65280);
            int var332 = class345.field5016.method1701(-23121);
            boolean var333 = (var332 & 0x1) == 1;
            class38.method251(var333, var331, (byte) 93);
            int var334 = class345.field5016.method1729(65280);
            for (int var335 = 0; var335 < var334; var335++) {
                int var336 = class345.field5016.method1729(65280);
                int var337 = class345.field5016.method1697((byte) 12);
                if (var337 == 255) {
                    var337 = class345.field5016.method1710(65536);
                }
                class267.method1644(var333, var335, var337, var336 - 1, 255, var331);
            }
            class220.field3281[class367.method2256(31, class451.field6238++)] = var331;
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class20.field273) {
            int var338 = class345.field5016.method1709(255);
            String var339 = class345.field5016.method1750(-105);
            int var340 = class345.field5016.method1729(65280);
            if (class213.method1378(var340, false)) {
                class271.method1657(true, var338, var339);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class124.field1555) {
            class350.method2184(-1004525076, true);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class170.field2482) {
            int var341 = class345.field5016.method1709(255);
            if (var341 == 65535) {
                var341 = -1;
            }
            int var342 = class345.field5016.method1723(255);
            int var343 = class345.field5016.method1749((byte) -75);
            if (class213.method1378(var343, false)) {
                class34.method231(-67, var342, var341);
            }
            class393.field5568 = null;
            return true;
        } else if (class407.field5714 == class393.field5568) {
            int var344 = class345.field5016.method1723(255);
            int var345 = class345.field5016.method1701(-23121);
            int var346 = class345.field5016.method1746(17037);
            class473.field6653[var346] = var344;
            class29.field393[var346] = var345;
            class7.field69[var346] = 1;
            int var347 = class191.field2845[var346] - 1;
            for (int var348 = 0; var348 < var347; var348++) {
                if (class149.field2232[var348] <= var344) {
                    class7.field69[var346] = var348 + 2;
                }
            }
            class160.field2375[class367.method2256(31, class243.field3625++)] = var346;
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class370.field5338) {
            class63.method394(class460.field6442, -1);
            class393.field5568 = null;
            return true;
        } else if (class480.field6732 == class393.field5568) {
            class349.method2179(class345.field5016, class382.field5447, -24585, class252.field3718);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class249.field3677) {
            int var349 = class345.field5016.method1729(65280);
            int var350 = class345.field5016.method1701(-23121);
            int var351 = class345.field5016.method1701(-23121);
            int var352 = class345.field5016.method1729(65280);
            int var353 = class345.field5016.method1701(-23121);
            int var354 = class345.field5016.method1701(-23121);
            if (class213.method1378(var349, false)) {
                class408.method2417(var352, var354, var351, var353, var350, true);
            }
            class393.field5568 = null;
            return true;
        } else if (class427.field5981 == class393.field5568) {
            class78.field965 = class345.field5016.method1702(-97);
            class304.field4327 = class27.field367;
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class326.field4706) {
            int var355 = class345.field5016.method1709(255);
            if (var355 == 65535) {
                var355 = -1;
            }
            int var356 = class345.field5016.method1729(65280);
            int var357 = class345.field5016.method1688(20402);
            if (class213.method1378(var356, false)) {
                class99.method565(var357, 0, -1, var355, 2);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class240.field3601) {
            class63.method394(class394.field5587, -1);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class268.field3919) {
            int var358 = class345.field5016.method1749((byte) -75);
            int var359 = class345.field5016.method1709(255);
            int var360 = class345.field5016.method1717(-91);
            if (class213.method1378(var359, false)) {
                class173.method1067(var360, var358, false);
            }
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class289.field4204) {
            class63.method394(client.field2608, -1);
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class252.field3713) {
            class418.method2455((byte) -128, class345.field5016.method1750(98));
            class393.field5568 = null;
            return true;
        } else if (class393.field5568 == class373.field5385) {
            if (class36.field472 != -1) {
                class24.method169((byte) -6, class36.field472, 0);
            }
            class393.field5568 = null;
            return true;
        } else {
            int var361 = 6 % ((arg0 - 35) / 63);
            if (class393.field5568 == class306.field4345) {
                class54.field729 = class345.field5016.method1701(-23121);
                class393.field5568 = null;
                return true;
            } else if (class459.field6435 == class393.field5568) {
                int var362 = class345.field5016.method1688(20402);
                class407.field5712 = class252.field3718.method2537(0, var362);
                class393.field5568 = null;
                return true;
            } else if (class393.field5568 == class368.field5323) {
                class207.method1357((byte) -94);
                class393.field5568 = null;
                return false;
            } else if (class393.field5568 == class252.field3719) {
                int var363 = class345.field5016.method1688(20402);
                int var364 = class345.field5016.method1717(-91);
                int var365 = class345.field5016.method1740((byte) -20);
                if (var365 == 65535) {
                    var365 = -1;
                }
                int var366 = class345.field5016.method1740((byte) -60);
                int var367 = class345.field5016.method1709(255);
                if (var367 == 65535) {
                    var367 = -1;
                }
                if (class213.method1378(var366, false)) {
                    for (int var368 = var367; var368 <= var365; var368++) {
                        long var369 = ((long) var364 << 32) + ((long) var368);
                        class385 var371 = (class385) class34.field443.method2761(var369, (byte) -112);
                        class385 var372;
                        if (var371 != null) {
                            var372 = new class385(var363, var371.field5469);
                            var371.method1510((byte) -13);
                        } else if (var368 == -1) {
                            var372 = new class385(var363, class166.method1028(var364, 121).field2070.field5469);
                        } else {
                            var372 = new class385(var363, -1);
                        }
                        class34.field443.method2767(-1, var369, var372);
                    }
                }
                class393.field5568 = null;
                return true;
            } else if (class393.field5568 == class325.field4683) {
                int var373 = class345.field5016.method1729(65280);
                if (class213.method1378(var373, false)) {
                    class1.method1(12580);
                }
                class393.field5568 = null;
                return true;
            } else if (class393.field5568 == class231.field3497) {
                int var374 = class345.field5016.method1729(65280);
                int var375 = class345.field5016.method1701(-23121);
                int var376 = class345.field5016.method1701(-23121);
                int var377 = class345.field5016.method1729(65280);
                int var378 = class345.field5016.method1701(-23121);
                int var379 = class345.field5016.method1701(-23121);
                if (class213.method1378(var374, false)) {
                    class125.method751(var377, -101, var378, var375, true, var376, var379);
                }
                class393.field5568 = null;
                return true;
            } else if (class393.field5568 == class229.field3455) {
                class350.method2184(-1004525076, false);
                class393.field5568 = null;
                return true;
            } else {
                class267.method1641("T1 - " + (class393.field5568 == null ? -1 : class393.field5568.method7(32069)) + "," + (class226.field3424 == null ? -1 : class226.field3424.method7(32069)) + "," + (class58.field757 == null ? -1 : class58.field757.method7(32069)) + " - " + class382.field5447, (Throwable) null, (byte) -87);
                class207.method1357((byte) -125);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([IIII)Z")
    public final boolean method1097(int[] arg0, int arg1, int arg2, int arg3) {
        field2572++;
        int var5 = -28 % ((arg2 + 72) / 32);
        for (class218 var6 = (class218) this.field2582.method2843(1123227612); var6 != null; var6 = (class218) this.field2582.method2842(1673506446)) {
            if (var6.method1393(arg1, (byte) -69, arg3)) {
                var6.method1398((byte) 104, arg0, arg3, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIII)Z")
    public final boolean method1098(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 5) {
            return false;
        }
        field2574++;
        for (class218 var6 = (class218) this.field2582.method2843(1123227612); var6 != null; var6 = (class218) this.field2582.method2842(1673506446)) {
            if (var6.method1394((byte) 126, arg2, arg1, arg3)) {
                var6.method1395(arg2, arg1, arg0, -916);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method1099(boolean arg0, int arg1, String arg2) {
        field2580++;
        class359.field5162.field2925 = 1;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = arg1;
        for (int var6 = 0; var6 < class64.field834.field4918; var6++) {
            class41 var9 = class64.field834.method2129(var6, false);
            if ((!arg0 || var9.field549) && var9.field605 == -1 && var9.field564 == -1 && var9.field562 == 0 && var9.field538.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class40.field531 = null;
                    class321.field4652 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class40.field531 = var4;
        class45.field643 = 0;
        class321.field4652 = var5;
        String[] var7 = new String[class321.field4652];
        for (int var8 = 0; var8 < class321.field4652; var8++) {
            var7[var8] = class64.field834.method2129(var4[var8], false).field538;
        }
        class116.method729(0, var7, class40.field531);
        class359.field5162.method1231(arg1 - 110);
        class359.field5162.field2925 = 2;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)Z")
    public final boolean method1100(int arg0, int arg1, int arg2) {
        field2581++;
        if (arg1 != 0) {
            return true;
        }
        for (class218 var4 = (class218) this.field2582.method2843(1123227612); var4 != null; var4 = (class218) this.field2582.method2842(1673506446)) {
            if (var4.method1397(48, arg2, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class179(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field2571 = arg1;
        this.field2563 = arg5;
        this.field2578 = arg0;
        this.field2559 = arg4;
        this.field2566 = arg3;
        this.field2564 = arg6;
        this.field2569 = arg2;
        if (this.field2564 == 255) {
            this.field2564 = 0;
        }
        this.field2582 = new class486();
    }

    static {
        new class326("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field2585 = new class1(39, 3);
        field2586 = -60;
    }
}
