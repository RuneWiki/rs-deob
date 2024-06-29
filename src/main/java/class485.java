import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class485 {

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "Z")
    public boolean field6562 = true;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "[Lem;")
    public static class239[] field6557 = new class239[5];

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "Lul;")
    public static class599 field6566;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "C")
    private char field6559;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public int field6560;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "Ljava/lang/String;")
    public String field6554;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)Z")
    public static final boolean method2770(boolean arg0) throws IOException {
        field6556++;
        if (class193.field2948 == null) {
            return false;
        }
        if (class533.field7219 == null) {
            if (class12.field189) {
                if (!class193.field2948.method921(true, 1)) {
                    return false;
                }
                class193.field2948.method922(1, (byte) -65, class262.field3679.field1413, 0);
                class12.field189 = false;
                class671.field9314++;
                class445.field6126 = 0;
            }
            class262.field3679.field1442 = 0;
            if (class262.field3679.method2076(false)) {
                if (!class193.field2948.method921(arg0, 1)) {
                    return false;
                }
                class193.field2948.method922(1, (byte) -65, class262.field3679.field1413, 1);
                class671.field9314++;
                class445.field6126 = 0;
            }
            class12.field189 = true;
            class783[] var1 = class189.method1393(95);
            int var2 = class262.field3679.method2073(63);
            if (var2 < 0 || var1.length <= var2) {
                throw new IOException("invo:" + var2 + " ip:" + class262.field3679.field1442);
            }
            class533.field7219 = var1[var2];
            class11.field179 = class533.field7219.field10759;
        }
        if (class11.field179 == -1) {
            if (!class193.field2948.method921(true, 1)) {
                return false;
            }
            class193.field2948.method922(1, (byte) -65, class262.field3679.field1413, 0);
            class671.field9314++;
            class11.field179 = class262.field3679.field1413[0] & 0xFF;
            class445.field6126 = 0;
        }
        if (class11.field179 == -2) {
            if (!class193.field2948.method921(arg0, 2)) {
                return false;
            }
            class193.field2948.method922(2, (byte) -65, class262.field3679.field1413, 0);
            class262.field3679.field1442 = 0;
            class11.field179 = class262.field3679.method763(89);
            class445.field6126 = 0;
            class671.field9314 += 2;
        }
        if (class11.field179 > 0) {
            if (!class193.field2948.method921(true, class11.field179)) {
                return false;
            }
            class262.field3679.field1442 = 0;
            class193.field2948.method922(class11.field179, (byte) -65, class262.field3679.field1413, 0);
            class445.field6126 = 0;
            class671.field9314 += class11.field179;
        }
        class698.field9643 = class152.field2502;
        class152.field2502 = class757.field10441;
        class757.field10441 = class533.field7219;
        if (class619.field8620 == class533.field7219) {
            boolean var3 = class262.field3679.method793((byte) 62) == 1;
            String var4 = class262.field3679.method752(0);
            String var5 = var4;
            if (var3) {
                var5 = class262.field3679.method752(0);
            }
            int var6 = class262.field3679.method793((byte) 59);
            boolean var7 = false;
            if (var6 <= 1) {
                if (!(!class686.field9536 || class282.field3916) || class88.field1208) {
                    var7 = true;
                } else if (var6 <= 1 && class441.method2569(var5, false)) {
                    var7 = true;
                }
            }
            if (!var7 && class31.field549 == 0) {
                String var8 = class148.method1184(-128, class248.method1645(15882, class262.field3679));
                if (var6 == 2) {
                    class769.method4229(0, var8, null, -1, "<img=1>" + var4, 24, 99, var4, "<img=1>" + var5);
                } else if (var6 == 1) {
                    class769.method4229(0, var8, null, -1, "<img=0>" + var4, 24, 99, var4, "<img=0>" + var5);
                } else {
                    class769.method4229(0, var8, null, -1, var4, 24, 99, var4, var5);
                }
            }
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class241.field3431) {
            String var9 = class262.field3679.method752(0);
            boolean var10 = class262.field3679.method793((byte) 95) == 1;
            String var11;
            if (var10) {
                var11 = class262.field3679.method752(0);
            } else {
                var11 = var9;
            }
            int var12 = class262.field3679.method763(8);
            byte var13 = class262.field3679.method766((byte) 122);
            boolean var14 = false;
            if (var13 == -128) {
                var14 = true;
            }
            if (var14) {
                if (class683.field9510 == 0) {
                    class533.field7219 = null;
                    return true;
                }
                boolean var15 = false;
                int var16;
                for (var16 = 0; class683.field9510 > var16 && (!class502.field6862[var16].field3520.equals(var11) || class502.field6862[var16].field3525 != var12); var16++) {
                }
                if (class683.field9510 > var16) {
                    while ((class683.field9510 - 1) > var16) {
                        class502.field6862[var16] = class502.field6862[var16 + 1];
                        var16++;
                    }
                    class683.field9510--;
                    class502.field6862[class683.field9510] = null;
                }
            } else {
                String var17 = class262.field3679.method752(0);
                class250 var18 = new class250();
                var18.field3520 = var11;
                var18.field3523 = var9;
                var18.field3526 = class177.method1336(var18.field3520, (byte) 75);
                var18.field3525 = var12;
                var18.field3521 = var17;
                var18.field3522 = var13;
                int var19;
                for (var19 = class683.field9510 - 1; var19 >= 0; var19--) {
                    int var20 = class502.field6862[var19].field3526.compareTo(var18.field3526);
                    if (var20 == 0) {
                        class502.field6862[var19].field3525 = var12;
                        class502.field6862[var19].field3522 = var13;
                        class502.field6862[var19].field3521 = var17;
                        if (var11.equals(class235.field3379.field10641)) {
                            class228.field3328 = var13;
                        }
                        class199.field3004 = class62.field859;
                        class533.field7219 = null;
                        return true;
                    }
                    if (var20 < 0) {
                        break;
                    }
                }
                if (class683.field9510 >= class502.field6862.length) {
                    class533.field7219 = null;
                    return true;
                }
                for (int var21 = class683.field9510 - 1; var21 > var19; var21--) {
                    class502.field6862[var21 + 1] = class502.field6862[var21];
                }
                if (class683.field9510 == 0) {
                    class502.field6862 = new class250[100];
                }
                class502.field6862[var19 + 1] = var18;
                class683.field9510++;
                if (var11.equals(class235.field3379.field10641)) {
                    class228.field3328 = var13;
                }
            }
            class199.field3004 = class62.field859;
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class478.field6461) {
            boolean var22 = class262.field3679.method793((byte) 109) == 1;
            String var23 = class262.field3679.method752(0);
            long var24 = (long) class262.field3679.method763(127);
            long var26 = (long) class262.field3679.method767((byte) -120);
            int var28 = class262.field3679.method793((byte) 5);
            long var29 = (var24 << 32) + var26;
            boolean var31 = false;
            Object var32 = null;
            class265 var33 = var22 ? class402.field5525 : class55.field784;
            if (var33 == null) {
                var31 = true;
            } else {
                label2132: {
                    for (int var34 = 0; var34 < 100; var34++) {
                        if (class357.field4887[var34] == var29) {
                            var31 = true;
                            break label2132;
                        }
                    }
                    if (var28 <= 1) {
                        if (!(!class686.field9536 || class282.field3916) || class88.field1208) {
                            var31 = true;
                        } else if (class441.method2569(var23, false)) {
                            var31 = true;
                        }
                    }
                }
            }
            if (!var31 && class31.field549 == 0) {
                class357.field4887[class672.field9332] = var29;
                class672.field9332 = (class672.field9332 + 1) % 100;
                String var35 = class148.method1184(-128, class248.method1645(15882, class262.field3679));
                int var36 = var22 ? 41 : 44;
                if (var28 == 2 || var28 == 3) {
                    class769.method4229(0, var35, var33.field3728, -1, "<img=1>" + var23, var36, 99, var23, "<img=1>" + var23);
                } else if (var28 == 1) {
                    class769.method4229(0, var35, var33.field3728, -1, "<img=0>" + var23, var36, 99, var23, "<img=0>" + var23);
                } else {
                    class769.method4229(0, var35, var33.field3728, -1, var23, var36, 99, var23, var23);
                }
            }
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class236.field3388) {
            int var37 = class262.field3679.method755(arg0);
            int var38 = class262.field3679.method777((byte) 122);
            int[] var39 = new int[4];
            for (int var40 = 0; var40 < 4; var40++) {
                var39[var40] = class262.field3679.method784((byte) -114);
            }
            class755 var41 = (class755) class664.field9216.method337((long) var38, 1);
            if (var41 != null) {
                class287.method1835(var39, false, var37, var41.field10414);
            }
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class127.field2238) {
            int var42 = class262.field3679.method793((byte) 66);
            int var43 = class262.field3679.method784((byte) -124);
            class524.method2984(-68);
            class152.method1198(var42, true, (byte) -98, var43);
            class533.field7219 = null;
            return true;
        } else if (class654.field9058 == class533.field7219) {
            int var44 = class262.field3679.method773(3);
            class517.field7033 = class630.field8751.method4107(var44, -37);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class501.field6853) {
            int var45 = class262.field3679.method763(-79);
            int var46 = class262.field3679.method793((byte) 32);
            boolean var47 = (var46 & 0x1) == 1;
            class480.method2748(var45, var47, false);
            int var48 = class262.field3679.method763(78);
            for (int var49 = 0; var49 < var48; var49++) {
                int var50 = class262.field3679.method749((byte) -121);
                if (var50 == 255) {
                    var50 = class262.field3679.method756((byte) 76);
                }
                int var51 = class262.field3679.method789(-8);
                class459.method2640(86, var47, var50, var45, var49, var51 - 1);
            }
            class354.field4759[class204.method1456(class346.field4657++, 31)] = var45;
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class223.field3252) {
            int var52 = class262.field3679.method784((byte) -125);
            class524.method2984(87);
            class768.method4227(-18974, var52);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class332.field4496) {
            class556.field7853 = class62.field859;
            boolean var53 = class262.field3679.method793((byte) 59) == 1;
            class487 var54 = new class487(class262.field3679);
            class265 var55;
            if (var53) {
                var55 = class402.field5525;
            } else {
                var55 = class55.field784;
            }
            var54.method2780(var55, 107);
            class533.field7219 = null;
            return true;
        } else if (class635.field8782 == class533.field7219) {
            int var56 = class262.field3679.method772(85);
            class524.method2984(109);
            class69.method623(4, var56, -1, -1, 3);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class160.field2573) {
            class732.method4065(class411.field5617, 127);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class523.field7113) {
            int var57 = class262.field3679.method763(84);
            int var58 = class262.field3679.method772(109);
            int var59 = class262.field3679.method763(-47);
            if (var59 == 65535) {
                var59 = -1;
            }
            int var60 = class262.field3679.method789(-8);
            if (var60 == 65535) {
                var60 = -1;
            }
            class524.method2984(101);
            for (int var61 = var59; var61 <= var60; var61++) {
                long var62 = ((long) var58 << 32) + (long) var61;
                class698 var64 = (class698) class396.field5475.method337(var62, 1);
                class698 var65;
                if (var64 != null) {
                    var65 = new class698(var64.field9638, var57);
                    var64.method1207(89);
                } else if (var61 == -1) {
                    var65 = new class698(class379.method2309(var58, 192).field263.field9638, var57);
                } else {
                    var65 = new class698(0, var57);
                }
                class396.field5475.method341(var62, var65, (byte) 68);
            }
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class367.field4981) {
            class732.method4065(class736.field10166, 124);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class375.field5084) {
            class207.field3112 = class262.field3679.method779((byte) 118);
            class89.field1246 = class262.field3679.method766((byte) 122) << 3;
            class202.field3059 = class262.field3679.method771(88) << 3;
            while (class262.field3679.field1442 < class11.field179) {
                class137 var66 = class445.method2590(117)[class262.field3679.method793((byte) 23)];
                class732.method4065(var66, 124);
            }
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class524.field7119) {
            int var67 = class262.field3679.method749((byte) -66);
            int var68 = class262.field3679.method789(-8);
            int var69 = class262.field3679.method756((byte) 76);
            class524.method2984(76);
            class637 var70 = (class637) class186.field2881.method337((long) var69, 1);
            if (var70 != null) {
                class305.method1954(var70.field8789 != var68, var70, false, (byte) -24);
            }
            class496.method2844(var68, false, var67, var69, (byte) 118);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class164.field2638) {
            int var71 = class262.field3679.method777((byte) -119);
            int var72 = class262.field3679.method773(3);
            class694.field9613.method140(var72, -1, var71);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class299.field4110) {
            int var73 = class262.field3679.method793((byte) 72);
            int var74 = class262.field3679.method777((byte) -52);
            boolean var75 = (var73 & 0x1) == 1;
            class259.method1688(var75, var74, (byte) 127);
            class354.field4759[class204.method1456(class346.field4657++, 31)] = var74;
            class533.field7219 = null;
            return true;
        } else if (class620.field8630 == class533.field7219) {
            int var76 = class262.field3679.method763(-45);
            if (var76 == 65535) {
                var76 = -1;
            }
            int var77 = class262.field3679.method793((byte) 23);
            int var78 = class262.field3679.method763(-108);
            int var79 = class262.field3679.method793((byte) 6);
            int var80 = class262.field3679.method763(117);
            class47.method345(var79, var77, var76, var78, -70, var80, false);
            class533.field7219 = null;
            return true;
        } else if (class70.field1027 == class533.field7219) {
            int var81 = class262.field3679.method763(111);
            int var82 = class262.field3679.method773(3);
            class524.method2984(70);
            class101.method884(var82, var81, 221);
            class533.field7219 = null;
            return true;
        } else if (class689.field9560 == class533.field7219) {
            int var83 = class262.field3679.method779((byte) 118);
            String var84 = class262.field3679.method752(0);
            int var85 = class262.field3679.method763(78);
            if (var85 == 65535) {
                var85 = -1;
            }
            int var86 = class262.field3679.method749((byte) -85);
            if (var83 >= 1 && var83 <= 8) {
                if (var84.equalsIgnoreCase("null")) {
                    var84 = null;
                }
                class774.field10708[var83 - 1] = var84;
                class262.field3671[var83 - 1] = var85;
                class748.field10323[var83 - 1] = var86 == 0;
            }
            class533.field7219 = null;
            return true;
        } else if (class754.field10409 == class533.field7219) {
            int var87 = class262.field3679.method784((byte) -106);
            int var88 = class262.field3679.method749((byte) -58);
            int var89 = class262.field3679.method763(109);
            int var90 = class262.field3679.method796(120);
            class524.method2984(-105);
            class496.method2846(var89, var90, true, var87, var88);
            class533.field7219 = null;
            return true;
        } else if (class583.field8250 == class533.field7219) {
            int var91 = class262.field3679.method763(111);
            byte var92 = class262.field3679.method766((byte) 122);
            class524.method2984(-116);
            class390.method2364(835, var91, var92);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class415.field5680) {
            class378.method2304(-116);
            class533.field7219 = null;
            return false;
        } else if (class556.field7852 == class533.field7219) {
            boolean var93 = class262.field3679.method793((byte) 35) == 1;
            String var94 = class262.field3679.method752(0);
            String var95 = var94;
            if (var93) {
                var95 = class262.field3679.method752(0);
            }
            int var96 = class262.field3679.method793((byte) 68);
            int var97 = class262.field3679.method763(121);
            boolean var98 = false;
            if (var96 <= 1 && class441.method2569(var95, !arg0)) {
                var98 = true;
            }
            if (!var98 && class31.field549 == 0) {
                String var99 = class530.field7179.method1747(1, var97).method3025(-89, class262.field3679);
                if (var96 == 2) {
                    class769.method4229(0, var99, null, var97, "<img=1>" + var94, 25, 99, var94, "<img=1>" + var95);
                } else if (var96 == 1) {
                    class769.method4229(0, var99, null, var97, "<img=0>" + var94, 25, 99, var94, "<img=0>" + var95);
                } else {
                    class769.method4229(0, var99, null, var97, var94, 25, 99, var94, var95);
                }
            }
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class102.field1644) {
            class766.field10564 = class262.field3679.method793((byte) 84);
            for (int var100 = 0; var100 < class766.field10564; var100++) {
                class174.field2766[var100] = class262.field3679.method752(0);
                class603.field8439[var100] = class262.field3679.method752(0);
                if (class603.field8439[var100].equals("")) {
                    class603.field8439[var100] = class174.field2766[var100];
                }
                class707.field9726[var100] = class262.field3679.method752(0);
                class343.field4618[var100] = class262.field3679.method752(0);
                if (class343.field4618[var100].equals("")) {
                    class343.field4618[var100] = class707.field9726[var100];
                }
                class766.field10567[var100] = false;
            }
            class533.field7219 = null;
            class720.field9894 = class62.field859;
            return true;
        } else if (class97.field1532 == class533.field7219) {
            if (class359.field4911 != -1) {
                class478.method2739(0, !arg0, class359.field4911);
            }
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class373.field5067) {
            int var101 = class262.field3679.method746(false);
            int var102 = class262.field3679.method773(3);
            int var103 = class262.field3679.method793((byte) 39);
            String var104 = "";
            String var105 = var104;
            if ((var103 & 0x1) != 0) {
                var104 = class262.field3679.method752(0);
                if ((var103 & 0x2) == 0) {
                    var105 = var104;
                } else {
                    var105 = class262.field3679.method752(0);
                }
            }
            String var106 = class262.field3679.method752(0);
            if (var101 == 99) {
                class652.method3663(-126, var106);
            } else if (var105.equals("") || !class441.method2569(var105, false)) {
                class648.method3634(var101, var106, (byte) -13, var104, var105, var102, var104);
            } else {
                class533.field7219 = null;
                return true;
            }
            class533.field7219 = null;
            return true;
        } else if (class611.field8526 == class533.field7219) {
            int var107 = class262.field3679.method773(3);
            int var108 = (var107 & 0x350209A0) >> 28;
            int var109 = var107 >> 14 & 0x3FFF;
            int var110 = var107 & 0x3FFF;
            int var111 = class262.field3679.method779((byte) 118);
            int var112 = var111 >> 2;
            int var113 = var111 & 0x3;
            int var114 = class132.field2271[var112];
            int var115 = class262.field3679.method784((byte) -128);
            if (var115 == 65535) {
                var115 = -1;
            }
            int var116 = var109 - class217.field3198;
            int var117 = var110 - class400.field5510;
            class706.method3942(var116, var108, var114, var113, var112, var115, var117, -1);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class500.field6841) {
            int var118 = class262.field3679.method789(-8);
            int var119 = class262.field3679.method756((byte) 76);
            class524.method2984(-103);
            class272.method1760(var118, (byte) 119, var119);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class234.field3368) {
            class199.field3004 = class62.field859;
            if (class11.field179 == 0) {
                class476.field6435 = null;
                class533.field7219 = null;
                class502.field6862 = null;
                class683.field9510 = 0;
                class21.field458 = null;
                return true;
            }
            class476.field6435 = class262.field3679.method752(0);
            boolean var120 = class262.field3679.method793((byte) 66) == 1;
            if (var120) {
                class262.field3679.method752(0);
            }
            long var121 = class262.field3679.method770((byte) 103);
            class21.field458 = class313.method1985(var121, 13426);
            class709.field9743 = class262.field3679.method766((byte) 122);
            int var123 = class262.field3679.method793((byte) 10);
            if (var123 == 255) {
                class533.field7219 = null;
                return true;
            }
            class683.field9510 = var123;
            class250[] var124 = new class250[100];
            for (int var125 = 0; var125 < class683.field9510; var125++) {
                var124[var125] = new class250();
                var124[var125].field3523 = class262.field3679.method752(0);
                boolean var131 = class262.field3679.method793((byte) 57) == 1;
                if (var131) {
                    var124[var125].field3520 = class262.field3679.method752(0);
                } else {
                    var124[var125].field3520 = var124[var125].field3523;
                }
                var124[var125].field3526 = class177.method1336(var124[var125].field3520, (byte) 75);
                var124[var125].field3525 = class262.field3679.method763(74);
                var124[var125].field3522 = class262.field3679.method766((byte) 122);
                var124[var125].field3521 = class262.field3679.method752(0);
                if (var124[var125].field3520.equals(class235.field3379.field10641)) {
                    class228.field3328 = var124[var125].field3522;
                }
            }
            boolean var126 = false;
            int var127 = class683.field9510;
            while (var127 > 0) {
                boolean var128 = true;
                var127--;
                for (int var129 = 0; var129 < var127; var129++) {
                    if (var124[var129].field3526.compareTo(var124[var129 + 1].field3526) > 0) {
                        class250 var130 = var124[var129];
                        var124[var129] = var124[var129 + 1];
                        var124[var129 + 1] = var130;
                        var128 = false;
                    }
                }
                if (var128) {
                    break;
                }
            }
            class502.field6862 = var124;
            class533.field7219 = null;
            return true;
        } else if (class648.field8958 == class533.field7219) {
            boolean var132 = class262.field3679.method749((byte) -48) == 1;
            class524.method2984(80);
            class526.field7145 = var132;
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class146.field2455) {
            if (class263.method1720(class753.field10398, 0)) {
                class445.field6088 = (int) ((float) class262.field3679.method763(-107) * 2.5F);
            } else {
                class445.field6088 = class262.field3679.method763(-2) * 30;
            }
            class533.field7219 = null;
            class479.field6470 = class62.field859;
            return true;
        } else if (class533.field7219 == class413.field5658) {
            class524.method2984(-125);
            class34.method201((byte) -85);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class519.field7047) {
            class137.method1132(class11.field179, class262.field3679, 0);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class357.field4864) {
            int var133 = class262.field3679.method756((byte) 76);
            int var134 = class262.field3679.method784((byte) -103);
            int var135 = class262.field3679.method777((byte) -59);
            class524.method2984(-119);
            class375.method2271(var133, -48, (var134 << 16) + var135);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class201.field3053) {
            boolean var136 = class262.field3679.method793((byte) 117) == 1;
            String var137 = class262.field3679.method752(0);
            String var138 = var137;
            if (var136) {
                var138 = class262.field3679.method752(0);
            }
            long var139 = (long) class262.field3679.method763(-77);
            long var141 = (long) class262.field3679.method767((byte) -121);
            int var143 = class262.field3679.method793((byte) 59);
            int var144 = class262.field3679.method763(-27);
            long var145 = (var139 << 32) + var141;
            boolean var147 = false;
            int var148 = 0;
            while (true) {
                if (var148 >= 100) {
                    if (var143 <= 1 && class441.method2569(var138, !arg0)) {
                        var147 = true;
                    }
                    break;
                }
                if (class357.field4887[var148] == var145) {
                    var147 = true;
                    break;
                }
                var148++;
            }
            if (!var147 && class31.field549 == 0) {
                class357.field4887[class672.field9332] = var145;
                class672.field9332 = (class672.field9332 + 1) % 100;
                String var149 = class530.field7179.method1747(1, var144).method3025(-65, class262.field3679);
                if (var143 == 2) {
                    class769.method4229(0, var149, null, var144, "<img=1>" + var137, 18, 99, var137, "<img=1>" + var138);
                } else if (var143 == 1) {
                    class769.method4229(0, var149, null, var144, "<img=0>" + var137, 18, 99, var137, "<img=0>" + var138);
                } else {
                    class769.method4229(0, var149, null, var144, var137, 18, 99, var137, var138);
                }
            }
            class533.field7219 = null;
            return true;
        } else if (class617.field8594 == class533.field7219) {
            int var150 = class262.field3679.method763(100);
            if (var150 == 65535) {
                var150 = -1;
            }
            int var151 = class262.field3679.method772(70);
            class524.method2984(-114);
            class327.method2068(var151, var150, 16);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class37.field628) {
            class732.method4065(class641.field8882, 123);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class157.field2547) {
            class262.field3679.field1442 += 28;
            if (class262.field3679.method765(0)) {
                class644.method3581(class262.field3679.field1442 - 28, 30987, class262.field3679);
            }
            class533.field7219 = null;
            return true;
        } else if (class591.field8313 == class533.field7219) {
            for (int var152 = 0; var152 < class527.field7150.length; var152++) {
                if (class527.field7150[var152] != null) {
                    class527.field7150[var152].field5214 = null;
                    class527.field7150[var152].field5230 = -1;
                }
            }
            for (int var153 = 0; var153 < class406.field5583; var153++) {
                class491.field6712[var153].field10414.field5214 = null;
                class491.field6712[var153].field10414.field5230 = -1;
            }
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class429.field5859) {
            int var154 = class262.field3679.method779((byte) 118);
            class524.method2984(77);
            class792.field10852 = var154;
            class533.field7219 = null;
            return true;
        } else if (class93.field1451 == class533.field7219) {
            boolean var155 = class262.field3679.method793((byte) 122) == 1;
            String var156 = class262.field3679.method752(0);
            String var157 = var156;
            if (var155) {
                var157 = class262.field3679.method752(0);
            }
            long var158 = (long) class262.field3679.method763(-4);
            long var160 = (long) class262.field3679.method767((byte) -122);
            int var162 = class262.field3679.method793((byte) 14);
            long var163 = (var158 << 32) + var160;
            boolean var165 = false;
            int var166 = 0;
            while (true) {
                if (var166 >= 100) {
                    if (var162 <= 1) {
                        if (!(!class686.field9536 || class282.field3916) || class88.field1208) {
                            var165 = true;
                        } else if (class441.method2569(var157, false)) {
                            var165 = true;
                        }
                    }
                    break;
                }
                if (class357.field4887[var166] == var163) {
                    var165 = true;
                    break;
                }
                var166++;
            }
            if (!var165 && class31.field549 == 0) {
                class357.field4887[class672.field9332] = var163;
                class672.field9332 = (class672.field9332 + 1) % 100;
                String var167 = class148.method1184(-128, class248.method1645(15882, class262.field3679));
                if (var162 == 2) {
                    class769.method4229(0, var167, null, -1, "<img=1>" + var156, 7, 99, var156, "<img=1>" + var157);
                } else if (var162 == 1) {
                    class769.method4229(0, var167, null, -1, "<img=0>" + var156, 7, 99, var156, "<img=0>" + var157);
                } else {
                    class769.method4229(0, var167, null, -1, var156, 3, 99, var156, var157);
                }
            }
            class533.field7219 = null;
            return true;
        } else if (class735.field10151 == class533.field7219) {
            class732.method4065(class191.field2938, 125);
            class533.field7219 = null;
            return true;
        } else if (class733.field10108 == class533.field7219) {
            int var168 = class262.field3679.method773(3);
            int var169 = class262.field3679.method774(-4);
            int var170 = class262.field3679.method782(1924808680);
            class524.method2984(112);
            class679.method3827(var168, 11, var169, var170);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class241.field3433) {
            class732.method4065(class662.field9183, 127);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class24.field493) {
            String var171 = class262.field3679.method752(0);
            int var172 = class262.field3679.method777((byte) -64);
            class524.method2984(119);
            class289.method1847(109, var171, var172);
            class533.field7219 = null;
            return true;
        } else if (class666.field9249 == class533.field7219) {
            int var173 = class262.field3679.method784((byte) -123);
            int var174 = class262.field3679.method793((byte) 63);
            class694.field9613.method140(var174, -1, var173);
            class533.field7219 = null;
            return true;
        } else if (class616.field8575 == class533.field7219) {
            int var175 = class262.field3679.method777((byte) -26);
            int var176 = class262.field3679.method796(95);
            class694.field9613.method143(0, var175, var176);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class324.field4434) {
            int var177 = class262.field3679.method796(59);
            int var178 = class262.field3679.method789(-8);
            if (var178 == 65535) {
                var178 = -1;
            }
            class524.method2984(77);
            class69.method623(4, var177, -1, var178, 1);
            class533.field7219 = null;
            return true;
        } else if (class61.field845 == class533.field7219) {
            boolean var179 = class262.field3679.method793((byte) 80) == 1;
            String var180 = class262.field3679.method752(0);
            long var181 = (long) class262.field3679.method763(1);
            long var183 = (long) class262.field3679.method767((byte) -118);
            int var185 = class262.field3679.method793((byte) 120);
            int var186 = class262.field3679.method763(-12);
            long var187 = (var181 << 32) + var183;
            boolean var189 = false;
            Object var190 = null;
            class265 var191 = var179 ? class402.field5525 : class55.field784;
            if (var191 == null) {
                var189 = true;
            } else {
                label2158: {
                    for (int var192 = 0; var192 < 100; var192++) {
                        if (class357.field4887[var192] == var187) {
                            var189 = true;
                            break label2158;
                        }
                    }
                    if (var185 <= 1 && class441.method2569(var180, !arg0)) {
                        var189 = true;
                    }
                }
            }
            if (!var189 && class31.field549 == 0) {
                class357.field4887[class672.field9332] = var187;
                class672.field9332 = (class672.field9332 + 1) % 100;
                String var193 = class530.field7179.method1747(1, var186).method3025(-125, class262.field3679);
                int var194 = var179 ? 41 : 44;
                if (var185 == 2 || var185 == 3) {
                    class769.method4229(0, var193, var191.field3728, -1, "<img=1>" + var180, var194, 99, var180, "<img=1>" + var180);
                } else if (var185 == 1) {
                    class769.method4229(0, var193, var191.field3728, -1, "<img=0>" + var180, var194, 99, var180, "<img=0>" + var180);
                } else {
                    class769.method4229(0, var193, var191.field3728, -1, var180, var194, 99, var180, var180);
                }
            }
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class198.field2997) {
            class21.field450 = class262.field3679.method793((byte) 39);
            class533.field7219 = null;
            class479.field6470 = class62.field859;
            return true;
        } else if (class533.field7219 == class494.field6777) {
            class732.method4065(class407.field5585, 123);
            class533.field7219 = null;
            return true;
        } else if (class633.field8763 == class533.field7219) {
            class479.method2746(false, class753.field10403);
            class533.field7219 = null;
            return false;
        } else if (class533.field7219 == class206.field3107) {
            int var195 = class262.field3679.method789(-8);
            int var196 = class262.field3679.method772(63);
            int var197 = class262.field3679.method784((byte) -108);
            int var198 = class262.field3679.method749((byte) -68);
            class524.method2984(71);
            class407.method2428((byte) -13, var197, var198, var196, var195);
            class533.field7219 = null;
            return true;
        } else if (class676.field9421 == class533.field7219) {
            int var199 = class262.field3679.method755(true);
            int var200 = class262.field3679.method756((byte) 76);
            int var201 = class262.field3679.method755(true);
            class109.field1708[var201] = var200;
            class315.field4315[var201] = var199;
            class249.field3507[var201] = 1;
            int var202 = class707.field9722[var201] - 1;
            for (int var203 = 0; var203 < var202; var203++) {
                if (var200 >= class513.field7003[var203]) {
                    class249.field3507[var201] = var203 + 2;
                }
            }
            class773.field10703[class204.method1456(class366.field4972++, 31)] = var201;
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class367.field4985) {
            int var204 = class262.field3679.method773(3);
            class524.method2984(-59);
            class69.method623(4, var204, 0, class483.field6533, 5);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class422.field5785) {
            class732.method4065(class204.field3080, 125);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class522.field7074) {
            class694.field9613.method147((byte) 85);
            class533.field7219 = null;
            class583.field8258 += 32;
            return true;
        } else if (class533.field7219 == class504.field6874) {
            int var205 = class262.field3679.method756((byte) 76);
            int var206 = class262.field3679.method777((byte) -63);
            int var207 = class262.field3679.method789(-8);
            int var208 = class262.field3679.method784((byte) -120);
            class524.method2984(-13);
            class460.method2647(8, var205, var208, var206, var207);
            class533.field7219 = null;
            return true;
        } else if (class539.field7321 == class533.field7219) {
            int var209 = class262.field3679.method793((byte) 109);
            if (class262.field3679.method793((byte) 41) == 0) {
                class761.field10484[var209] = new class118();
            } else {
                class262.field3679.field1442--;
                class761.field10484[var209] = new class118(class262.field3679);
            }
            class533.field7219 = null;
            class568.field8032 = class62.field859;
            return true;
        } else if (class533.field7219 == class425.field5811) {
            class732.method4065(class451.field6175, 124);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class258.field3616) {
            class732.method4065(class54.field770, 125);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class16.field227) {
            boolean var210 = class262.field3679.method793((byte) 111) == 1;
            String var211 = class262.field3679.method752(0);
            String var212 = var211;
            if (var210) {
                var212 = class262.field3679.method752(0);
            }
            long var213 = class262.field3679.method770((byte) 72);
            long var215 = (long) class262.field3679.method763(-49);
            long var217 = (long) class262.field3679.method767((byte) -124);
            int var219 = class262.field3679.method793((byte) 106);
            long var220 = (var215 << 32) + var217;
            boolean var222 = false;
            int var223 = 0;
            while (true) {
                if (var223 >= 100) {
                    if (var219 <= 1) {
                        if (!(!class686.field9536 || class282.field3916) || class88.field1208) {
                            var222 = true;
                        } else if (class441.method2569(var212, false)) {
                            var222 = true;
                        }
                    }
                    break;
                }
                if (class357.field4887[var223] == var220) {
                    var222 = true;
                    break;
                }
                var223++;
            }
            if (!var222 && class31.field549 == 0) {
                class357.field4887[class672.field9332] = var220;
                class672.field9332 = (class672.field9332 + 1) % 100;
                String var224 = class148.method1184(-128, class248.method1645(15882, class262.field3679));
                if (var219 == 2 || var219 == 3) {
                    class769.method4229(0, var224, class774.method4257(37, var213), -1, "<img=1>" + var211, 9, 99, var211, "<img=1>" + var212);
                } else if (var219 == 1) {
                    class769.method4229(0, var224, class774.method4257(37, var213), -1, "<img=0>" + var211, 9, 99, var211, "<img=0>" + var212);
                } else {
                    class769.method4229(0, var224, class774.method4257(37, var213), -1, var211, 9, 99, var211, var212);
                }
            }
            class533.field7219 = null;
            return true;
        } else if (class586.field8292 == class533.field7219) {
            int var225 = class262.field3679.method756((byte) 76);
            int var226 = class262.field3679.method773(3);
            class524.method2984(-115);
            class637 var227 = (class637) class186.field2881.method337((long) var225, 1);
            class637 var228 = (class637) class186.field2881.method337((long) var226, 1);
            if (var228 != null) {
                class305.method1954(var227 == null || var227.field8789 != var228.field8789, var228, false, (byte) -24);
            }
            if (var227 != null) {
                var227.method1207(81);
                class186.field2881.method341((long) var226, var227, (byte) 77);
            }
            class17 var229 = class379.method2309(var225, 192);
            if (var229 != null) {
                class410.method2433(var229, 14049);
            }
            class17 var230 = class379.method2309(var226, 192);
            if (var230 != null) {
                class410.method2433(var230, 14049);
                class358.method2206(var230, 36, true);
            }
            if (class359.field4911 != -1) {
                class478.method2739(1, false, class359.field4911);
            }
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class297.field4047) {
            class142.method1152(class262.field3679, class11.field179, 4, class630.field8751);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class509.field6987) {
            String var231 = class262.field3679.method752(0);
            String var232 = class148.method1184(-128, class248.method1645(15882, class262.field3679));
            class648.method3634(6, var232, (byte) -13, var231, var231, 0, var231);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class337.field4568) {
            class202.field3059 = class262.field3679.method771(107) << 3;
            class89.field1246 = class262.field3679.method785((byte) 84) << 3;
            class207.field3112 = class262.field3679.method755(arg0);
            for (class234 var233 = (class234) class214.field3181.method335(-29067); var233 != null; var233 = (class234) class214.field3181.method336(92)) {
                int var236 = (int) (var233.field2528 >> 28 & 0x3L);
                int var237 = (int) (var233.field2528 & 0x3FFFL);
                int var238 = var237 - class217.field3198;
                int var239 = (int) (var233.field2528 >> 14 & 0x3FFFL);
                int var240 = var239 - class400.field5510;
                if (class207.field3112 == var236 && class202.field3059 <= var238 && class202.field3059 + 8 > var238 && var240 >= class89.field1246 && var240 < (class89.field1246 + 8)) {
                    var233.method1207(92);
                    if (var238 >= 0 && var240 >= 0 && class483.field6515 > var238 && var240 < class65.field926) {
                        class28.method185(var238, var240, class207.field3112, (byte) -105);
                    }
                }
            }
            for (class300 var234 = (class300) class211.field3155.method3589((byte) -128); var234 != null; var234 = (class300) class211.field3155.method3591(0)) {
                if (class202.field3059 <= var234.field4132 && var234.field4132 < class202.field3059 + 8 && var234.field4125 >= class89.field1246 && var234.field4125 < class89.field1246 + 8 && class207.field3112 == var234.field4130) {
                    var234.field4127 = true;
                }
            }
            for (class300 var235 = (class300) class488.field6589.method3589((byte) -127); var235 != null; var235 = (class300) class488.field6589.method3591(0)) {
                if (class202.field3059 <= var235.field4132 && var235.field4132 < class202.field3059 + 8 && var235.field4125 >= class89.field1246 && (class89.field1246 + 8) > var235.field4125 && class207.field3112 == var235.field4130) {
                    var235.field4127 = true;
                }
            }
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class260.field3644) {
            int var241 = class262.field3679.method763(-2);
            byte var242 = class262.field3679.method785((byte) 95);
            class694.field9613.method143(0, var241, var242);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class119.field2176) {
            class12.method71((byte) -79);
            class533.field7219 = null;
            return false;
        } else if (class773.field10702 == class533.field7219) {
            class724.field9958 = 1;
            class533.field7219 = null;
            class720.field9894 = class62.field859;
            return true;
        } else if (class592.field8324 == class533.field7219) {
            class427.field5824 = class62.field859;
            boolean var243 = class262.field3679.method793((byte) 119) == 1;
            if (class11.field179 != 1) {
                if (var243) {
                    class601.field8410 = new class280(class262.field3679);
                } else {
                    class554.field7831 = new class280(class262.field3679);
                }
                class533.field7219 = null;
                return true;
            }
            class533.field7219 = null;
            if (var243) {
                class601.field8410 = null;
            } else {
                class554.field7831 = null;
            }
            return true;
        } else if (class533.field7219 == class224.field3274) {
            int var244 = class262.field3679.method793((byte) 52);
            int var245 = class262.field3679.method793((byte) 60);
            int var246 = class262.field3679.method749((byte) -107);
            int var247 = class262.field3679.method793((byte) 28);
            int var248 = class262.field3679.method777((byte) 126) << 2;
            class524.method2984(-69);
            class523.method2974(var247, var244, var245, var248, 18202, var246, true);
            class533.field7219 = null;
            return true;
        } else if (class85.field1163 == class533.field7219) {
            boolean var249 = class262.field3679.method793((byte) 34) == 1;
            byte[] var250 = new byte[class11.field179 - 1];
            class262.field3679.method737(-32768, var250, 0, class11.field179 - 1);
            class648.method3636(var249, true, var250);
            class533.field7219 = null;
            return true;
        } else if (class60.field833 == class533.field7219) {
            int var251 = class262.field3679.method784((byte) -126);
            int var252 = class262.field3679.method784((byte) -121);
            class524.method2984(-26);
            class365.method2228(var251, 1, 0, var252);
            class533.field7219 = null;
            return true;
        } else if (class99.field1616 == class533.field7219) {
            int var253 = class262.field3679.method772(102);
            int var254 = class262.field3679.method789(-8);
            int var255 = class262.field3679.method784((byte) -106);
            int var256 = class262.field3679.method763(116);
            class524.method2984(110);
            class69.method623(4, var253, var254, var256 << 16 | var255, 7);
            class533.field7219 = null;
            return true;
        } else if (class619.field8621 == class533.field7219) {
            int var257 = class262.field3679.method763(79);
            if (var257 == 65535) {
                var257 = -1;
            }
            int var258 = class262.field3679.method793((byte) 39);
            int var259 = class262.field3679.method763(-12);
            int var260 = class262.field3679.method793((byte) 37);
            int var261 = class262.field3679.method763(117);
            class16.method95(true, var258, var257, var259, var260, var261);
            class533.field7219 = null;
            return true;
        } else if (class590.field8310 == class533.field7219) {
            class732.method4065(class336.field4532, 125);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class387.field5325) {
            class427.field5824 = class62.field859;
            boolean var262 = class262.field3679.method793((byte) 97) == 1;
            class474 var263 = new class474(class262.field3679);
            class280 var264;
            if (var262) {
                var264 = class601.field8410;
            } else {
                var264 = class554.field7831;
            }
            var263.method2724(var264, -111);
            class533.field7219 = null;
            return true;
        } else if (class680.field9460 == class533.field7219) {
            int var265 = class262.field3679.method763(-116);
            if (var265 == 65535) {
                var265 = -1;
            }
            int var266 = class262.field3679.method793((byte) 126);
            int var267 = class262.field3679.method763(-12);
            int var268 = class262.field3679.method793((byte) 59);
            class47.method345(var268, var266, var265, var267, -97, 256, true);
            class533.field7219 = null;
            return true;
        } else if (class759.field10454 == class533.field7219) {
            String var269 = class262.field3679.method752(0);
            Object[] var270 = new Object[var269.length() + 1];
            for (int var271 = var269.length() - 1; var271 >= 0; var271--) {
                if (var269.charAt(var271) == 's') {
                    var270[var271 + 1] = class262.field3679.method752(0);
                } else {
                    var270[var271 + 1] = Integer.valueOf(class262.field3679.method773(3));
                }
            }
            var270[0] = Integer.valueOf(class262.field3679.method773(3));
            class524.method2984(-46);
            class255 var272 = new class255();
            var272.field3586 = var270;
            class76.method644(var272);
            class533.field7219 = null;
            return true;
        } else if (class686.field9538 == class533.field7219) {
            int var273 = class262.field3679.method793((byte) 38);
            int var274 = var273 >> 5;
            int var275 = var273 & 0x1F;
            if (var275 == 0) {
                class13.field198[var274] = null;
                class533.field7219 = null;
                return true;
            }
            class12 var276 = new class12();
            var276.field194 = var275;
            var276.field195 = class262.field3679.method793((byte) 80);
            if (var276.field195 >= 0 && class18.field424.length > var276.field195) {
                if (var276.field194 == 1 || var276.field194 == 10) {
                    var276.field192 = class262.field3679.method763(-103);
                    class262.field3679.field1442 += 6;
                } else if (var276.field194 >= 2 && var276.field194 <= 6) {
                    if (var276.field194 == 2) {
                        var276.field188 = 256;
                        var276.field187 = 256;
                    }
                    if (var276.field194 == 3) {
                        var276.field187 = 256;
                        var276.field188 = 0;
                    }
                    if (var276.field194 == 4) {
                        var276.field188 = 512;
                        var276.field187 = 256;
                    }
                    if (var276.field194 == 5) {
                        var276.field187 = 0;
                        var276.field188 = 256;
                    }
                    if (var276.field194 == 6) {
                        var276.field188 = 256;
                        var276.field187 = 512;
                    }
                    var276.field194 = 2;
                    var276.field193 = class262.field3679.method793((byte) 17);
                    var276.field188 += class262.field3679.method763(-49) - class217.field3198 << 9;
                    var276.field187 += class262.field3679.method763(-57) - class400.field5510 << 9;
                    var276.field183 = class262.field3679.method793((byte) 29) << 2;
                    var276.field190 = class262.field3679.method763(-16);
                }
                var276.field185 = class262.field3679.method763(76);
                if (var276.field185 == 65535) {
                    var276.field185 = -1;
                }
                class13.field198[var274] = var276;
            }
            class533.field7219 = null;
            return true;
        } else if (class644.field8900 == class533.field7219) {
            class740.field10213 = class262.field3679.method769((byte) 19);
            class686.field9536 = class262.field3679.method793((byte) 19) == 1;
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class14.field212) {
            int var277 = class262.field3679.method763(7);
            int var278 = class262.field3679.method763(97);
            int var279 = class262.field3679.method763(106);
            class524.method2984(-2);
            if (class431.field5870[var277] != null) {
                for (int var280 = var278; var280 < var279; var280++) {
                    int var281 = class262.field3679.method767((byte) -122);
                    if (var280 < class431.field5870[var277].length && class431.field5870[var277][var280] != null) {
                        class431.field5870[var277][var280].field294 = var281;
                    }
                }
            }
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class248.field3497) {
            if (class703.field9674 != null) {
                class66.method513(-1, 126, class111.field1911.field6714.method2951((byte) 52), -1, false);
            }
            byte[] var282 = new byte[class11.field179];
            class262.field3679.method2077(0, var282, (byte) -49, class11.field179);
            String var283 = class784.method4279(var282, class11.field179, 0, 255);
            class714.method3973(class630.field8751, (byte) -86, true, class111.field1911.field6725.method3784((byte) 64) == 1, var283);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class143.field2419) {
            class709.field9746 = class262.field3679.method785((byte) 97);
            if (class709.field9746 == 0 || class709.field9746 == 1) {
                class442.field5991 = true;
            }
            class533.field7219 = null;
            return true;
        } else if (class730.field10078 == class533.field7219) {
            int var284 = class262.field3679.method756((byte) 76);
            int var285 = class262.field3679.method763(116);
            if (var285 == 65535) {
                var285 = -1;
            }
            class524.method2984(-97);
            class69.method623(4, var284, -1, var285, 2);
            class533.field7219 = null;
            return true;
        } else if (class533.field7219 == class422.field5786) {
            class709.field9751 = class11.field179 > 2 ? class262.field3679.method752(0) : class641.field8844.method3566((byte) 109, class464.field6309);
            class229.field3332 = class11.field179 <= 0 ? -1 : class262.field3679.method763(100);
            if (class229.field3332 == 65535) {
                class229.field3332 = -1;
            }
            class533.field7219 = null;
            return true;
        } else if (class548.field7452 == class533.field7219) {
            class565.method3268(-116);
            class533.field7219 = null;
            return true;
        } else if (class536.field7288 == class533.field7219) {
            class533.field7219 = null;
            return false;
        } else {
            if (!arg0) {
                field6566 = null;
            }
            if (class533.field7219 == class469.field6339) {
                int var286 = class262.field3679.method763(88);
                int var287 = class262.field3679.method773(3);
                class524.method2984(74);
                class37.method231((byte) -15, var286, var287);
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class410.field5611) {
                int var288 = class262.field3679.method749((byte) -83);
                int var289 = class262.field3679.method784((byte) -105);
                if (var289 == 65535) {
                    var289 = -1;
                }
                int var290 = class262.field3679.method749((byte) -98);
                class129.method1097(var290, -9274, var289, var288);
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class270.field3784) {
                int var291 = class262.field3679.method755(true);
                int var292 = class262.field3679.method758(94);
                int var293 = class262.field3679.method763(-54);
                if (var293 == 65535) {
                    var293 = -1;
                }
                class648.method3637(var292, 6862, var291, var293);
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class204.field3081) {
                class611.method3466(0);
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class443.field5994) {
                class442.field5989 = class262.field3679.method793((byte) 122);
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class343.field4614) {
                int var294 = class262.field3679.method763(-42);
                int var295 = class262.field3679.method779((byte) 118);
                class524.method2984(74);
                if (var295 == 2) {
                    class509.method2900(-119);
                }
                class359.field4911 = var294;
                class16.method94(var294, arg0);
                class386.method2349(0, false);
                class76.method656(class359.field4911);
                for (int var296 = 0; var296 < 100; var296++) {
                    class377.field5145[var296] = true;
                }
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class521.field7062) {
                int var297 = class262.field3679.method756((byte) 76);
                int var298 = class262.field3679.method779((byte) 118);
                class524.method2984(92);
                class526.method2994(-127, var297, var298);
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class450.field6165) {
                int var299 = class262.field3679.method793((byte) 117);
                boolean var300 = (var299 & 0x1) == 1;
                String var301 = class262.field3679.method752(0);
                String var302 = class262.field3679.method752(0);
                if (var302.equals("")) {
                    var302 = var301;
                }
                String var303 = class262.field3679.method752(0);
                String var304 = class262.field3679.method752(0);
                if (var304.equals("")) {
                    var304 = var303;
                }
                if (var300) {
                    for (int var305 = 0; var305 < class766.field10564; var305++) {
                        if (class603.field8439[var305].equals(var304)) {
                            class174.field2766[var305] = var301;
                            class603.field8439[var305] = var302;
                            class707.field9726[var305] = var303;
                            class343.field4618[var305] = var304;
                            break;
                        }
                    }
                } else {
                    class174.field2766[class766.field10564] = var301;
                    class603.field8439[class766.field10564] = var302;
                    class707.field9726[class766.field10564] = var303;
                    class343.field4618[class766.field10564] = var304;
                    class766.field10567[class766.field10564] = class204.method1456(var299, 2) == 2;
                    class766.field10564++;
                }
                class720.field9894 = class62.field859;
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class273.field3803) {
                int var306 = class262.field3679.method763(124);
                int var307 = class262.field3679.method793((byte) 124);
                boolean var308 = (var307 & 0x1) == 1;
                while (class262.field3679.field1442 < class11.field179) {
                    int var309 = class262.field3679.method746(false);
                    int var310 = class262.field3679.method763(-102);
                    int var311 = 0;
                    if (var310 != 0) {
                        var311 = class262.field3679.method793((byte) 49);
                        if (var311 == 255) {
                            var311 = class262.field3679.method773(3);
                        }
                    }
                    class459.method2640(114, var308, var311, var306, var309, var310 - 1);
                }
                class354.field4759[class204.method1456(class346.field4657++, 31)] = var306;
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class303.field4166) {
                int var312 = class262.field3679.method749((byte) -85);
                int var313 = class262.field3679.method749((byte) -106);
                int var314 = class262.field3679.method755(true);
                int var315 = class262.field3679.method777((byte) 114);
                int var316 = class262.field3679.method749((byte) -114);
                class524.method2984(118);
                class727.field9991[var316] = true;
                class609.field8506[var316] = var314;
                class214.field3184[var316] = var313;
                class270.field3786[var316] = var312;
                class407.field5591[var316] = var315;
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class341.field4599) {
                int var317 = class262.field3679.method756((byte) 76);
                class524.method2984(90);
                class533.field7219 = null;
                if (var317 == -1) {
                    class577.field8185 = -1;
                    class100.field1626 = -1;
                } else {
                    int var318 = var317 >> 14 & 0x3FFF;
                    int var319 = var318 - class217.field3198;
                    int var320 = var317 & 0x3FFF;
                    int var321 = var320 - class400.field5510;
                    if (var319 < 0) {
                        var319 = 0;
                    } else if (class483.field6515 <= var319) {
                        var319 = class483.field6515;
                    }
                    if (var321 < 0) {
                        var321 = 0;
                    } else if (var321 >= class65.field926) {
                        var321 = class65.field926;
                    }
                    class577.field8185 = (var319 << 9) + 256;
                    class100.field1626 = (var321 << 9) + 256;
                }
                return true;
            } else if (class533.field7219 == class388.field5338) {
                class207.field3112 = class262.field3679.method755(true);
                class89.field1246 = class262.field3679.method785((byte) 75) << 3;
                class202.field3059 = class262.field3679.method771(122) << 3;
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class431.field5876) {
                int var322 = class262.field3679.method749((byte) -102);
                int var323 = class262.field3679.method793((byte) 93);
                if (var323 == 255) {
                    var323 = -1;
                    var322 = -1;
                }
                class666.method3768(100, var322, var323);
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class249.field3515) {
                int var324 = class262.field3679.method763(118);
                class524.method2984(-124);
                class87.method691(-49, var324);
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class138.field2358) {
                int var325 = class262.field3679.method755(true);
                byte var326 = class262.field3679.method771(115);
                class524.method2984(116);
                class478.method2741(var326, var325, -1);
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class505.field6881) {
                class556.field7853 = class62.field859;
                boolean var327 = class262.field3679.method793((byte) 14) == 1;
                if (class11.field179 != 1) {
                    if (var327) {
                        class402.field5525 = new class265(class262.field3679);
                    } else {
                        class55.field784 = new class265(class262.field3679);
                    }
                    class533.field7219 = null;
                    return true;
                }
                class533.field7219 = null;
                if (var327) {
                    class402.field5525 = null;
                } else {
                    class55.field784 = null;
                }
                return true;
            } else if (class533.field7219 == class279.field3849) {
                int var328 = class262.field3679.method773(3);
                int var329 = class262.field3679.method756((byte) 76);
                int var330 = class262.field3679.method763(-47);
                class524.method2984(-63);
                class69.method623(4, var329, var328, var330, 5);
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class191.field2935) {
                int var331 = class262.field3679.method773(3);
                if (class530.field7180 != var331) {
                    class530.field7180 = var331;
                    class76.method660(class644.field8904, -1, -1);
                }
                class533.field7219 = null;
                return true;
            } else if (class90.field1365 == class533.field7219) {
                class479.method2746(false, false);
                class533.field7219 = null;
                return false;
            } else if (class533.field7219 == class10.field170) {
                int var332 = class262.field3679.method779((byte) 118);
                int var333 = class262.field3679.method755(arg0);
                int var334 = class262.field3679.method763(110) << 2;
                int var335 = class262.field3679.method779((byte) 118);
                int var336 = class262.field3679.method749((byte) -68);
                class524.method2984(68);
                class199.method1433(82, var335, var332, var336, var333, var334);
                class533.field7219 = null;
                return true;
            } else if (class601.field8409 == class533.field7219) {
                String var337 = class262.field3679.method752(0);
                int var338 = class262.field3679.method756((byte) 76);
                class524.method2984(-86);
                class740.method4096(var337, var338, false);
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class230.field3353) {
                int var339 = class262.field3679.method789(-8);
                if (var339 == 65535) {
                    var339 = -1;
                }
                int var340 = class262.field3679.method784((byte) -119);
                if (var340 == 65535) {
                    var340 = -1;
                }
                int var341 = class262.field3679.method756((byte) 76);
                int var342 = class262.field3679.method756((byte) 76);
                class524.method2984(-65);
                for (int var343 = var339; var343 <= var340; var343++) {
                    long var344 = ((long) var342 << 32) + (long) var343;
                    class698 var346 = (class698) class396.field5475.method337(var344, 1);
                    class698 var347;
                    if (var346 != null) {
                        var347 = new class698(var341, var346.field9641);
                        var346.method1207(127);
                    } else if (var343 == -1) {
                        var347 = new class698(var341, class379.method2309(var342, 192).field263.field9641);
                    } else {
                        var347 = new class698(var341, -1);
                    }
                    class396.field5475.method341(var344, var347, (byte) 112);
                }
                class533.field7219 = null;
                return true;
            } else if (class60.field831 == class533.field7219) {
                String var348 = class262.field3679.method752(0);
                int var349 = class262.field3679.method763(88);
                String var350 = class530.field7179.method1747(1, var349).method3025(-75, class262.field3679);
                class769.method4229(0, var350, null, var349, var348, 19, 99, var348, var348);
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class342.field4612) {
                int var351 = class262.field3679.method782(1924808680);
                int var352 = class262.field3679.method756((byte) 76);
                class524.method2984(88);
                class703.method3928(var351, var352, (byte) -99);
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class391.field5353) {
                class732.method4065(class579.field8197, 126);
                class533.field7219 = null;
                return true;
            } else if (class610.field8519 == class533.field7219) {
                while (class262.field3679.field1442 < class11.field179) {
                    boolean var363 = class262.field3679.method793((byte) 21) == 1;
                    String var364 = class262.field3679.method752(0);
                    String var365 = class262.field3679.method752(0);
                    int var366 = class262.field3679.method763(82);
                    int var367 = class262.field3679.method793((byte) 52);
                    String var368 = "";
                    boolean var369 = false;
                    if (var366 > 0) {
                        var368 = class262.field3679.method752(0);
                        var369 = class262.field3679.method793((byte) 125) == 1;
                    }
                    for (int var370 = 0; var370 < class749.field10345; var370++) {
                        if (var363) {
                            if (var365.equals(class463.field6303[var370])) {
                                class463.field6303[var370] = var364;
                                var364 = null;
                                class392.field5378[var370] = var365;
                                break;
                            }
                        } else if (var364.equals(class463.field6303[var370])) {
                            if (class759.field10458[var370] != var366) {
                                boolean var371 = true;
                                for (class504 var372 = (class504) class61.field849.method1597((byte) 86); var372 != null; var372 = (class504) class61.field849.method1601(104)) {
                                    if (var372.field6880.equals(var364)) {
                                        if (var366 != 0 && var372.field6878 == 0) {
                                            var371 = false;
                                            var372.method731((byte) 39);
                                        } else if (var366 == 0 && var372.field6878 != 0) {
                                            var371 = false;
                                            var372.method731((byte) 39);
                                        }
                                    }
                                }
                                if (var371) {
                                    class61.field849.method1600(new class504(var364, var366), -3);
                                }
                                class759.field10458[var370] = var366;
                            }
                            class392.field5378[var370] = var365;
                            class389.field5347[var370] = var368;
                            class164.field2650[var370] = var367;
                            class548.field7453[var370] = var369;
                            var364 = null;
                            break;
                        }
                    }
                    if (var364 != null && class749.field10345 < 200) {
                        class463.field6303[class749.field10345] = var364;
                        class392.field5378[class749.field10345] = var365;
                        class759.field10458[class749.field10345] = var366;
                        class389.field5347[class749.field10345] = var368;
                        class164.field2650[class749.field10345] = var367;
                        class548.field7453[class749.field10345] = var369;
                        class749.field10345++;
                    }
                }
                class724.field9958 = 2;
                class720.field9894 = class62.field859;
                boolean var353 = false;
                int var354 = class749.field10345;
                while (var354 > 0) {
                    boolean var355 = true;
                    var354--;
                    for (int var356 = 0; var356 < var354; var356++) {
                        if (class759.field10458[var356] != class178.field2812.field10374 && class759.field10458[var356 + 1] == class178.field2812.field10374 || class759.field10458[var356] == 0 && class759.field10458[var356 + 1] != 0) {
                            int var357 = class759.field10458[var356];
                            class759.field10458[var356] = class759.field10458[var356 + 1];
                            class759.field10458[var356 + 1] = var357;
                            String var358 = class389.field5347[var356];
                            class389.field5347[var356] = class389.field5347[var356 + 1];
                            class389.field5347[var356 + 1] = var358;
                            String var359 = class463.field6303[var356];
                            class463.field6303[var356] = class463.field6303[var356 + 1];
                            class463.field6303[var356 + 1] = var359;
                            String var360 = class392.field5378[var356];
                            class392.field5378[var356] = class392.field5378[var356 + 1];
                            class392.field5378[var356 + 1] = var360;
                            int var361 = class164.field2650[var356];
                            class164.field2650[var356] = class164.field2650[var356 + 1];
                            class164.field2650[var356 + 1] = var361;
                            boolean var362 = class548.field7453[var356];
                            class548.field7453[var356] = class548.field7453[var356 + 1];
                            class548.field7453[var356 + 1] = var362;
                            var355 = false;
                        }
                    }
                    if (var355) {
                        break;
                    }
                }
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class298.field4108) {
                int var373 = class262.field3679.method789(-8);
                String var374 = class262.field3679.method752(0);
                class524.method2984(-96);
                class289.method1847(85, var374, var373);
                class533.field7219 = null;
                return true;
            } else if (class576.field8173 == class533.field7219) {
                class712.field9802 = class478.method2737((byte) 25, class262.field3679.method793((byte) 110));
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class348.field4692) {
                class652.field9034 = class262.field3679.method774(-4);
                class479.field6470 = class62.field859;
                class533.field7219 = null;
                return true;
            } else if (class70.field1042 == class533.field7219) {
                int var375 = class262.field3679.method777((byte) 115);
                int var376 = class262.field3679.method772(116);
                class524.method2984(-60);
                class500.method2866(100, var375, var376);
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class495.field6781) {
                class732.method4065(class169.field2709, 125);
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class347.field4675) {
                int var377 = class262.field3679.method772(122);
                int var378 = class262.field3679.method777((byte) 111);
                class524.method2984(-35);
                class390.method2364(835, var378, var377);
                class533.field7219 = null;
                return true;
            } else if (class536.field7290 == class533.field7219) {
                class327.method2070((byte) 93, class262.field3679.method752(0));
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class187.field2887) {
                int var379 = class262.field3679.method756((byte) 76);
                class524.method2984(76);
                class637 var380 = (class637) class186.field2881.method337((long) var379, 1);
                if (var380 != null) {
                    class305.method1954(true, var380, false, (byte) -24);
                }
                if (class652.field9033 != null) {
                    class410.method2433(class652.field9033, 14049);
                    class652.field9033 = null;
                }
                class533.field7219 = null;
                return true;
            } else if (class791.field10836 == class533.field7219) {
                int var381 = class262.field3679.method763(93);
                int var382 = class262.field3679.method789(-8);
                int var383 = class262.field3679.method779((byte) 118);
                int var384 = class262.field3679.method772(99);
                int var385 = class262.field3679.method749((byte) -97);
                int var386 = class262.field3679.method784((byte) -122);
                int var387 = var385 & 0x7;
                int var388 = var385 >> 3 & 0xF;
                if (var388 == 15) {
                    var388 = -1;
                }
                if ((var384 >> 30) != 0) {
                    int var418 = var384 >> 28 & 0x3;
                    int var419 = (var384 >> 14 & 0x3FFF) - class217.field3198;
                    int var420 = (var384 & 0x3FFF) - class400.field5510;
                    if (var419 >= 0 && var420 >= 0 && var419 < class483.field6515 && class65.field926 > var420) {
                        int var421 = var419 * 512 + 256;
                        int var422 = var420 * 512 + 256;
                        int var423 = var418;
                        if (var418 < 3 && class61.method425(var420, 16340, var419)) {
                            var423 = var418 + 1;
                        }
                        class104 var424 = new class104(var382, var381, class440.field5977, var418, var423, var421, class309.method1973(15356, var421, var422, var418) - var386, var422, var419, var419, var420, var420, var387);
                        class280.field3893.method3594((byte) -33, new class272(var424));
                    }
                } else if ((var384 >> 29) != 0) {
                    int var389 = var384 & 0xFFFF;
                    class755 var390 = (class755) class664.field9216.method337((long) var389, 1);
                    if (var390 != null) {
                        class666 var391 = var390.field10414;
                        if (var382 == 65535) {
                            var382 = -1;
                        }
                        class467 var392 = var391.field5234[var383];
                        boolean var393 = true;
                        int var394 = var392.field6324;
                        if (var382 != -1 && var394 != -1) {
                            if (var382 == var394) {
                                class491 var399 = class707.field9727.method2143(-2, var382);
                                if (var399.field6690 && var399.field6695 != -1) {
                                    class200 var400 = class108.field1696.method1279((byte) 92, var399.field6695);
                                    int var401 = var400.field3031;
                                    if (var401 == 0 || var401 == 2) {
                                        var393 = false;
                                    } else if (var401 == 1) {
                                        var393 = true;
                                    }
                                }
                            } else {
                                class491 var395 = class707.field9727.method2143(-2, var382);
                                class491 var396 = class707.field9727.method2143(-2, var394);
                                if (var395.field6695 != -1 && var396.field6695 != -1) {
                                    class200 var397 = class108.field1696.method1279((byte) 92, var395.field6695);
                                    class200 var398 = class108.field1696.method1279((byte) 92, var396.field6695);
                                    if (var397.field3038 < var398.field3038) {
                                        var393 = false;
                                    }
                                }
                            }
                        }
                        if (var393) {
                            var392.field6327 = 0;
                            var392.field6326 = var387;
                            var392.field6325 = 1;
                            var392.field6324 = var382;
                            var392.field6320 = 0;
                            var392.field6323 = class440.field5977 + var381;
                            var392.field6328 = var386;
                            var392.field6318 = var388;
                            if (var392.field6323 > class440.field5977) {
                                var392.field6327 = -1;
                            }
                            if (var392.field6324 == 65535) {
                                var392.field6324 = -1;
                            }
                            if (var392.field6324 != -1 && class440.field5977 == var392.field6323) {
                                int var402 = class707.field9727.method2143(-2, var392.field6324).field6695;
                                if (var402 != -1) {
                                    class200 var403 = class108.field1696.method1279((byte) 92, var402);
                                    if (var403 != null && var403.field3040 != null && !var391.field5229) {
                                        class189.method1394(var391, 256, var403, 0);
                                    }
                                }
                            }
                        }
                    }
                } else if (var384 >> 28 != 0) {
                    int var404 = var384 & 0xFFFF;
                    class771 var405;
                    if (class483.field6533 == var404) {
                        var405 = class235.field3379;
                    } else {
                        var405 = class527.field7150[var404];
                    }
                    if (var405 != null) {
                        class467 var406 = var405.field5234[var383];
                        if (var382 == 65535) {
                            var382 = -1;
                        }
                        boolean var407 = true;
                        int var408 = var406.field6324;
                        if (var382 != -1 && var408 != -1) {
                            if (var382 == var408) {
                                class491 var409 = class707.field9727.method2143(-2, var382);
                                if (var409.field6690 && var409.field6695 != -1) {
                                    class200 var410 = class108.field1696.method1279((byte) 92, var409.field6695);
                                    int var411 = var410.field3031;
                                    if (var411 == 0 || var411 == 2) {
                                        var407 = false;
                                    } else if (var411 == 1) {
                                        var407 = true;
                                    }
                                }
                            } else {
                                class491 var412 = class707.field9727.method2143(-2, var382);
                                class491 var413 = class707.field9727.method2143(-2, var408);
                                if (var412.field6695 != -1 && var413.field6695 != -1) {
                                    class200 var414 = class108.field1696.method1279((byte) 92, var412.field6695);
                                    class200 var415 = class108.field1696.method1279((byte) 92, var413.field6695);
                                    if (var415.field3038 > var414.field3038) {
                                        var407 = false;
                                    }
                                }
                            }
                        }
                        if (var407) {
                            var406.field6323 = class440.field5977 + var381;
                            var406.field6326 = var387;
                            var406.field6324 = var382;
                            var406.field6320 = 0;
                            var406.field6328 = var386;
                            var406.field6325 = 1;
                            var406.field6327 = 0;
                            var406.field6318 = var388;
                            if (var406.field6324 == 65535) {
                                var406.field6324 = -1;
                            }
                            if (class440.field5977 < var406.field6323) {
                                var406.field6327 = -1;
                            }
                            if (var406.field6324 != -1 && class440.field5977 == var406.field6323) {
                                int var416 = class707.field9727.method2143(-2, var406.field6324).field6695;
                                if (var416 != -1) {
                                    class200 var417 = class108.field1696.method1279((byte) 92, var416);
                                    if (var417 != null && var417.field3040 != null && !var405.field5229) {
                                        class189.method1394(var405, 256, var417, 0);
                                    }
                                }
                            }
                        }
                    }
                }
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class342.field4608) {
                class732.method4065(class66.field956, 123);
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class28.field518) {
                int var425 = class262.field3679.method772(66);
                int var426 = class262.field3679.method763(-124);
                if (var426 == 65535) {
                    var426 = -1;
                }
                int var427 = class262.field3679.method772(65);
                class524.method2984(98);
                class689.method3869(var426, var425, var427, true);
                class730 var428 = class143.field2427.method1410((byte) 90, var426);
                class460.method2647(8, var425, var428.field10051, var428.field10075, var428.field10026);
                class465.method2682(var428.field10021, true, var428.field10057, var428.field10049, var425);
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class254.field3579) {
                int var429 = class262.field3679.method763(-97);
                class771 var430;
                if (class483.field6533 == var429) {
                    var430 = class235.field3379;
                } else {
                    var430 = class527.field7150[var429];
                }
                if (var430 == null) {
                    class533.field7219 = null;
                    return true;
                }
                int var431 = class262.field3679.method763(-12);
                int var432 = class262.field3679.method793((byte) 27);
                boolean var433 = (var431 & 0x8000) != 0;
                if (var430.field10641 != null && var430.field10630 != null) {
                    boolean var434 = false;
                    if (var432 <= 1) {
                        if (!var433 && !(!class686.field9536 || class282.field3916) || class88.field1208) {
                            var434 = true;
                        } else if (class441.method2569(var430.field10641, false)) {
                            var434 = true;
                        }
                    }
                    if (!var434 && class31.field549 == 0) {
                        int var435 = -1;
                        String var437;
                        if (var433) {
                            var431 &= 0x7FFF;
                            class521 var436 = class183.method1365(class262.field3679, 2);
                            var435 = var436.field7061;
                            var437 = var436.field7063.method3025(-98, class262.field3679);
                        } else {
                            var437 = class148.method1184(-128, class248.method1645(15882, class262.field3679));
                        }
                        var430.field5228 = var437.trim();
                        var430.field5257 = var431 >> 8;
                        var430.field5265 = var431 & 0xFF;
                        var430.field5223 = 150;
                        int var438;
                        if (var432 == 1 || var432 == 2) {
                            var438 = var433 ? 17 : 1;
                        } else {
                            var438 = var433 ? 17 : 2;
                        }
                        if (var432 == 2) {
                            class769.method4229(0, var437, null, var435, "<img=1>" + var430.method4235(arg0, true), var438, 99, var430.field10625, "<img=1>" + var430.method4234(false, true));
                        } else if (var432 == 1) {
                            class769.method4229(0, var437, null, var435, "<img=0>" + var430.method4235(true, true), var438, 99, var430.field10625, "<img=0>" + var430.method4234(false, true));
                        } else {
                            class769.method4229(0, var437, null, var435, var430.method4235(true, true), var438, 99, var430.field10625, var430.method4234(false, true));
                        }
                    }
                }
                class533.field7219 = null;
                return true;
            } else if (class764.field10546 == class533.field7219) {
                class364.field4952 = class262.field3679.method749((byte) -50);
                class160.field2571 = class262.field3679.method755(true);
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class112.field2103) {
                class524.method2984(-81);
                class113.method1026(-21651);
                class533.field7219 = null;
                return true;
            } else if (class707.field9725 == class533.field7219) {
                class728.field9997 = class262.field3679.method779((byte) 118) == 1;
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class264.field3717) {
                boolean var439 = class262.field3679.method793((byte) 106) == 1;
                String var440 = class262.field3679.method752(0);
                String var441 = var440;
                if (var439) {
                    var441 = class262.field3679.method752(0);
                }
                long var442 = class262.field3679.method770((byte) 65);
                long var444 = (long) class262.field3679.method763(-81);
                long var446 = (long) class262.field3679.method767((byte) -127);
                int var448 = class262.field3679.method793((byte) 105);
                int var449 = class262.field3679.method763(85);
                long var450 = (var444 << 32) + var446;
                boolean var452 = false;
                int var453 = 0;
                while (true) {
                    if (var453 >= 100) {
                        if (var448 <= 1 && class441.method2569(var441, false)) {
                            var452 = true;
                        }
                        break;
                    }
                    if (class357.field4887[var453] == var450) {
                        var452 = true;
                        break;
                    }
                    var453++;
                }
                if (!var452 && class31.field549 == 0) {
                    class357.field4887[class672.field9332] = var450;
                    class672.field9332 = (class672.field9332 + 1) % 100;
                    String var454 = class530.field7179.method1747(1, var449).method3025(-67, class262.field3679);
                    if (var448 == 2) {
                        class769.method4229(0, var454, class774.method4257(37, var442), var449, "<img=1>" + var440, 20, 99, var440, "<img=1>" + var441);
                    } else if (var448 == 1) {
                        class769.method4229(0, var454, class774.method4257(37, var442), var449, "<img=0>" + var440, 20, 99, var440, "<img=0>" + var441);
                    } else {
                        class769.method4229(0, var454, class774.method4257(37, var442), var449, var440, 20, 99, var440, var441);
                    }
                }
                class533.field7219 = null;
                return true;
            } else if (class562.field7963 == class533.field7219) {
                class732.method4065(class79.field1111, 125);
                class533.field7219 = null;
                return true;
            } else if (class533.field7219 == class315.field4308) {
                class732.method4065(class531.field7187, 123);
                class533.field7219 = null;
                return true;
            } else {
                class281.method1820("T1 - " + (class533.field7219 == null ? -1 : class533.field7219.method4275(-81)) + "," + (class152.field2502 == null ? -1 : class152.field2502.method4275(92)) + "," + (class698.field9643 == null ? -1 : class698.field9643.method4275(-104)) + " - " + class11.field179, 28395, null);
                class479.method2746(false, false);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Llda;ILlda;)V")
    public static final void method2771(class513 arg0, int arg1, class513 arg2) {
        if (arg0.field7004 != null) {
            arg0.method2942(false);
        }
        field6564++;
        arg0.field7004 = arg2.field7004;
        arg0.field7006 = arg2;
        arg0.field7004.field7006 = arg0;
        arg0.field7006.field7004 = arg0;
        int var3 = -111 / ((35 - arg1) / 47);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLfca;)V")
    public final void method2772(byte arg0, class93 arg1) {
        if (arg0 != -87) {
            field6557 = null;
        }
        while (true) {
            int var3 = arg1.method793((byte) 102);
            if (var3 == 0) {
                field6553++;
                return;
            }
            this.method2775(arg1, arg0 ^ 0xFFFFAF93, var3);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIFIBF[F[FIIF)V")
    public static final void method2773(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, int arg6, byte arg7, float arg8, float[] arg9, float[] arg10, int arg11, int arg12, float arg13) {
        int var14 = arg0 - arg2;
        int var15 = arg1 - arg6;
        field6561++;
        if (arg7 <= 112) {
            method2773(121, -118, -109, 23, 52, 0.89053684F, -18, (byte) 33, 0.8135627F, null, null, 87, 82, 0.7289227F);
        }
        int var16 = arg4 - arg12;
        float var17 = arg10[2] * (float) var14 + arg10[1] * (float) var16 + arg10[0] * (float) var15;
        float var18 = arg10[5] * (float) var14 + arg10[4] * (float) var16 + arg10[3] * (float) var15;
        float var19 = arg10[8] * (float) var14 + arg10[6] * (float) var15 + arg10[7] * (float) var16;
        float var20;
        float var21;
        if (arg11 == 0) {
            var20 = arg5 + 0.5F - var19;
            var21 = arg8 + var17 + 0.5F;
        } else if (arg11 == 1) {
            var21 = arg8 + var17 + 0.5F;
            var20 = arg5 + var19 + 0.5F;
        } else if (arg11 == 2) {
            var21 = arg8 + 0.5F - var17;
            var20 = arg13 + 0.5F - var18;
        } else if (arg11 == 3) {
            var21 = arg8 + var17 + 0.5F;
            var20 = arg13 + 0.5F - var18;
        } else if (arg11 == 4) {
            var21 = arg5 + var19 + 0.5F;
            var20 = arg13 + 0.5F - var18;
        } else {
            var20 = arg13 + 0.5F - var18;
            var21 = arg5 + 0.5F - var19;
        }
        if (arg3 == 1) {
            float var23 = var21;
            var21 = -var20;
            var20 = var23;
        } else if (arg3 == 2) {
            var21 = -var21;
            var20 = -var20;
        } else if (arg3 == 3) {
            float var22 = var21;
            var21 = var20;
            var20 = -var22;
        }
        arg9[0] = var21;
        arg9[1] = var20;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
    public static void method2774(byte arg0) {
        field6566 = null;
        field6557 = null;
        if (arg0 > -118) {
            method2773(23, 9, -120, -103, 117, 1.3924239F, 60, (byte) -63, -0.40511915F, null, null, -21, 48, -1.5178186F);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lfca;II)V")
    private final void method2775(class93 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field6559 = class283.method1823(-27037, arg0.method766((byte) 122));
        } else if (arg2 == 2) {
            this.field6560 = arg0.method773(arg1 - 20535);
        } else if (arg2 == 4) {
            this.field6562 = false;
        } else if (arg2 == 5) {
            this.field6554 = arg0.method752(0);
        }
        field6565++;
        if (arg1 != 20538) {
            this.field6560 = -8;
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)Z")
    public final boolean method2776(byte arg0) {
        field6567++;
        if (arg0 < 44) {
            method2771(null, -25, null);
        }
        return this.field6559 == 's';
    }

    static {
        for (int var0 = 0; var0 < field6557.length; var0++) {
            field6557[var0] = new class239();
        }
        field6563 = 0;
        field6566 = new class599(1);
    }
}
