import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class455 {

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
    public int field6422 = 1;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "Lgda;")
    public static class53 field6421 = new class53(24, 3);

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "Llga;")
    public static class711 field6429 = new class711();

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "Lkk;")
    public static class188 field6430 = new class188(8);

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "C")
    public char field6424;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "F")
    public static float field6431;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "Lqm;")
    public static class143 field6428;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILee;)V")
    public final void method2703(int arg0, class675 arg1) {
        if (arg0 < 44) {
            field6430 = null;
        }
        while (true) {
            int var3 = arg1.method3750((byte) 35);
            if (var3 == 0) {
                field6426++;
                return;
            }
            this.method2708(false, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
    public static void method2704(byte arg0) {
        field6421 = null;
        field6430 = null;
        int var1 = 1 % ((14 - arg0) / 50);
        field6428 = null;
        field6429 = null;
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)Z")
    public static final boolean method2705(byte arg0) throws IOException {
        field6423++;
        if (class333.field4663 == null) {
            return false;
        }
        if (class294.field4138 == null) {
            if (class543.field7584) {
                if (!class333.field4663.method2846((byte) 53, 1)) {
                    return false;
                }
                class333.field4663.method2847(-1, class89.field1072.field9154, 0, 1);
                class48.field565 = 0;
                class654.field8974++;
                class543.field7584 = false;
            }
            class89.field1072.field9146 = 0;
            if (class89.field1072.method3822((byte) 113)) {
                if (!class333.field4663.method2846((byte) 53, 1)) {
                    return false;
                }
                class333.field4663.method2847(-1, class89.field1072.field9154, 1, 1);
                class654.field8974++;
                class48.field565 = 0;
            }
            class543.field7584 = true;
            class98[] var1 = class70.method587(arg0 - 4524);
            int var2 = class89.field1072.method3820((byte) -21);
            if (var2 < 0 || var2 >= var1.length) {
                throw new IOException("invo:" + var2 + " ip:" + class89.field1072.field9146);
            }
            class294.field4138 = var1[var2];
            class398.field5617 = class294.field4138.field1181;
        }
        if (class398.field5617 == -1) {
            if (!class333.field4663.method2846((byte) 53, 1)) {
                return false;
            }
            class333.field4663.method2847(-1, class89.field1072.field9154, 0, 1);
            class48.field565 = 0;
            class398.field5617 = class89.field1072.field9154[0] & 0xFF;
            class654.field8974++;
        }
        if (class398.field5617 == -2) {
            if (!class333.field4663.method2846((byte) 53, 2)) {
                return false;
            }
            class333.field4663.method2847(-1, class89.field1072.field9154, 0, 2);
            class89.field1072.field9146 = 0;
            class398.field5617 = class89.field1072.method3757((byte) -65);
            class654.field8974 += 2;
            class48.field565 = 0;
        }
        if (class398.field5617 > 0) {
            if (!class333.field4663.method2846((byte) 53, class398.field5617)) {
                return false;
            }
            class89.field1072.field9146 = 0;
            class333.field4663.method2847(-1, class89.field1072.field9154, 0, class398.field5617);
            class48.field565 = 0;
            class654.field8974 += class398.field5617;
        }
        class187.field2519 = class496.field7130;
        class496.field7130 = class383.field5465;
        class383.field5465 = class294.field4138;
        if (class294.field4138 == class138.field2000) {
            class412.field5817 = class89.field1072.method3710(-6067);
            class14.field266 = class89.field1072.method3719(arg0 + 1854307234) << 3;
            class169.field2313 = class89.field1072.method3713((byte) -14) << 3;
            while (class89.field1072.field9146 < class398.field5617) {
                class60 var3 = class242.method1549(-84)[class89.field1072.method3750((byte) 35)];
                class350.method2259(var3, arg0 + 113);
            }
            class294.field4138 = null;
            return true;
        } else if (class336.field4676 == class294.field4138) {
            int var4 = class89.field1072.method3688(7925);
            int[] var5 = new int[4];
            for (int var6 = 0; var6 < 4; var6++) {
                var5[var6] = class89.field1072.method3744(true);
            }
            int var7 = class89.field1072.method3717(25651);
            class740 var8 = (class740) class373.field5230.method1180((byte) 26, (long) var7);
            if (var8 != null) {
                class87.method652(var8.field10289, var4, var5, (byte) 120);
            }
            class294.field4138 = null;
            return true;
        } else if (class294.field4138 == class140.field2021) {
            class61.method520(29167, class89.field1072.method3697(-1));
            class294.field4138 = null;
            return true;
        } else if (class418.field5907 == class294.field4138) {
            class350.method2259(class194.field2590, arg0 + 113);
            class294.field4138 = null;
            return true;
        } else if (class612.field8587 == class294.field4138) {
            int var9 = class89.field1072.method3757((byte) -65);
            int var10 = class89.field1072.method3757((byte) -65);
            int var11 = class89.field1072.method3757((byte) -65);
            class544.method3153(false);
            if (class37.field475[var9] != null) {
                for (int var12 = var10; var12 < var11; var12++) {
                    int var13 = class89.field1072.method3756(false);
                    if (var12 < class37.field475[var9].length && class37.field475[var9][var12] != null) {
                        class37.field475[var9][var12].field6972 = var13;
                    }
                }
            }
            class294.field4138 = null;
            return true;
        } else if (class432.field6174 == class294.field4138) {
            class350.method2259(class639.field8788, arg0 + 113);
            class294.field4138 = null;
            return true;
        } else if (class294.field4138 == class158.field2194) {
            String var14 = class89.field1072.method3697(-1);
            Object[] var15 = new Object[var14.length() + 1];
            for (int var16 = var14.length() - 1; var16 >= 0; var16--) {
                if (var14.charAt(var16) == 's') {
                    var15[var16 + 1] = class89.field1072.method3697(-1);
                } else {
                    var15[var16 + 1] = Integer.valueOf(class89.field1072.method3703(arg0 + 232));
                }
            }
            var15[0] = Integer.valueOf(class89.field1072.method3703(120));
            class544.method3153(false);
            class357 var17 = new class357();
            var17.field5076 = var15;
            class241.method1543(var17);
            class294.field4138 = null;
            return true;
        } else if (class493.field7106 == class294.field4138) {
            int var18 = class89.field1072.method3700(27326);
            int var19 = class89.field1072.method3734(125);
            class544.method3153(false);
            class748.method4159(var18, 36864, var19);
            class294.field4138 = null;
            return true;
        } else if (class294.field4138 == class209.field2742) {
            int var20 = class89.field1072.method3757((byte) -65);
            class280 var21;
            if (class389.field5512 == var20) {
                var21 = class660.field9039;
            } else {
                var21 = class309.field4311[var20];
            }
            if (var21 == null) {
                class294.field4138 = null;
                return true;
            }
            int var22 = class89.field1072.method3757((byte) -65);
            int var23 = class89.field1072.method3750((byte) 35);
            boolean var24 = (var22 & 0x8000) != 0;
            if (var21.field3965 != null && var21.field3983 != null) {
                boolean var25 = false;
                if (var23 <= 1) {
                    if (!var24 && !(!class567.field8052 || class491.field6932) || class603.field8476) {
                        var25 = true;
                    } else if (class101.method730(var21.field3965, (byte) 85)) {
                        var25 = true;
                    }
                }
                if (!var25 && class592.field8338 == 0) {
                    int var26 = -1;
                    String var27;
                    if (var24) {
                        var22 &= 0x7FFF;
                        class166 var28 = class419.method2573(class89.field1072, 97);
                        var26 = var28.field2279;
                        var27 = var28.field2282.method2335(class89.field1072, (byte) 78);
                    } else {
                        var27 = class493.method2950(class740.method4133(32767, class89.field1072), 0);
                    }
                    var21.field7937 = var27.trim();
                    var21.field7918 = var22 >> 8;
                    var21.field7935 = var22 & 0xFF;
                    var21.field7924 = 150;
                    int var29;
                    if (var23 == 1 || var23 == 2) {
                        var29 = var24 ? 17 : 1;
                    } else {
                        var29 = var24 ? 17 : 2;
                    }
                    if (var23 == 2) {
                        class172.method1107(var27, var29, 0, true, null, var26, "<img=1>" + var21.method1842(-75, true), var21.field3973, "<img=1>" + var21.method1829(true, false));
                    } else if (var23 == 1) {
                        class172.method1107(var27, var29, 0, true, null, var26, "<img=0>" + var21.method1842(-108, true), var21.field3973, "<img=0>" + var21.method1829(true, false));
                    } else {
                        class172.method1107(var27, var29, 0, true, null, var26, var21.method1842(-66, true), var21.field3973, var21.method1829(true, false));
                    }
                }
            }
            class294.field4138 = null;
            return true;
        } else if (class294.field4138 == class140.field2024) {
            int var30 = class89.field1072.method3757((byte) -65);
            if (var30 == 65535) {
                var30 = -1;
            }
            int var31 = class89.field1072.method3703(127);
            class544.method3153(false);
            class277.method1807(var30, var31, (byte) -111);
            class294.field4138 = null;
            return true;
        } else if (class294.field4138 == class277.field3921) {
            int var32 = class89.field1072.method3729((byte) 66);
            int var33 = class89.field1072.method3734(124);
            class544.method3153(false);
            class728.method4091(var32, var33, false);
            class294.field4138 = null;
            return true;
        } else if (class633.field8737 == class294.field4138) {
            class350.method2259(class133.field1951, -1);
            class294.field4138 = null;
            return true;
        } else if (class294.field4138 == class162.field2212) {
            String var34 = class89.field1072.method3697(-1);
            int var35 = class89.field1072.method3744(true);
            class544.method3153(false);
            class199.method1220(-124, var34, var35);
            class294.field4138 = null;
            return true;
        } else if (class703.field9784 == class294.field4138) {
            class412.field5817 = class89.field1072.method3688(7925);
            class169.field2313 = class89.field1072.method3719(1854307120) << 3;
            class14.field266 = class89.field1072.method3713((byte) -14) << 3;
            class294.field4138 = null;
            return true;
        } else if (class577.field8155 == class294.field4138) {
            int var36 = class89.field1072.method3691((byte) -77);
            class544.method3153(false);
            class390.method2454(0, var36, class389.field5512, 5, 126);
            class294.field4138 = null;
            return true;
        } else if (class294.field4138 == class125.field1514) {
            class89.field1072.field9146 += 28;
            if (class89.field1072.method3689(-1487750560)) {
                class357.method2294(class89.field1072, 0, class89.field1072.field9146 - 28);
            }
            class294.field4138 = null;
            return true;
        } else if (class394.field5579 == class294.field4138) {
            int var37 = class89.field1072.method3734(126);
            int var38 = class89.field1072.method3736(true);
            class544.method3153(false);
            if (var38 == 2) {
                class707.method3966((byte) 110);
            }
            class457.field6447 = var37;
            class172.method1108(var37, (byte) -123);
            class364.method2320(false, arg0 - 14429);
            class241.method1536(class457.field6447);
            for (int var39 = 0; var39 < 100; var39++) {
                class583.field8210[var39] = true;
            }
            class294.field4138 = null;
            return true;
        } else if (class597.field8401 == class294.field4138) {
            boolean var40 = class89.field1072.method3750((byte) 35) == 1;
            String var41 = class89.field1072.method3697(-1);
            String var42 = var41;
            if (var40) {
                var42 = class89.field1072.method3697(-1);
            }
            long var43 = class89.field1072.method3714(8919);
            long var45 = (long) class89.field1072.method3757((byte) -65);
            long var47 = (long) class89.field1072.method3756(false);
            int var49 = class89.field1072.method3750((byte) 35);
            long var50 = (var45 << 32) + var47;
            boolean var52 = false;
            int var53 = 0;
            while (true) {
                if (var53 >= 100) {
                    if (var49 <= 1) {
                        if (!(!class567.field8052 || class491.field6932) || class603.field8476) {
                            var52 = true;
                        } else if (class101.method730(var42, (byte) -82)) {
                            var52 = true;
                        }
                    }
                    break;
                }
                if (class481.field6803[var53] == var50) {
                    var52 = true;
                    break;
                }
                var53++;
            }
            if (!var52 && class592.field8338 == 0) {
                class481.field6803[class407.field5774] = var50;
                class407.field5774 = (class407.field5774 + 1) % 100;
                String var54 = class493.method2950(class740.method4133(32767, class89.field1072), 0);
                if (var49 == 2 || var49 == 3) {
                    class172.method1107(var54, 9, 0, true, class10.method72(45, var43), -1, "<img=1>" + var41, var41, "<img=1>" + var42);
                } else if (var49 == 1) {
                    class172.method1107(var54, 9, 0, true, class10.method72(arg0 ^ 0xFFFFFFC0, var43), -1, "<img=0>" + var41, var41, "<img=0>" + var42);
                } else {
                    class172.method1107(var54, 9, 0, true, class10.method72(72, var43), -1, var41, var41, var42);
                }
            }
            class294.field4138 = null;
            return true;
        } else if (class333.field4658 == class294.field4138) {
            int var55 = class89.field1072.method3757((byte) -65);
            if (var55 == 65535) {
                var55 = -1;
            }
            int var56 = class89.field1072.method3700(27326);
            class544.method3153(false);
            class390.method2454(-1, var56, var55, 2, 124);
            class294.field4138 = null;
            return true;
        } else if (class387.field5479 == class294.field4138) {
            int var57 = class89.field1072.method3757((byte) -65);
            int var58 = class89.field1072.method3750((byte) 35);
            boolean var59 = (var58 & 0x1) == 1;
            class707.method3972(var57, var59, true);
            int var60 = class89.field1072.method3757((byte) -65);
            for (int var61 = 0; var61 < var60; var61++) {
                int var62 = class89.field1072.method3717(25651);
                int var63 = class89.field1072.method3750((byte) 35);
                if (var63 == 255) {
                    var63 = class89.field1072.method3700(27326);
                }
                class307.method2005(var59, var57, (byte) 124, var63, var61, var62 - 1);
            }
            class93.field1089[class286.method1877(31, class286.field4059++)] = var57;
            class294.field4138 = null;
            return true;
        } else if (class625.field8689 == class294.field4138) {
            class218.field2845 = class398.field5617 > 2 ? class89.field1072.method3697(-1) : class71.field922.method588((byte) 86, class549.field7669);
            class758.field10538 = class398.field5617 > 0 ? class89.field1072.method3757((byte) -65) : -1;
            class294.field4138 = null;
            if (class758.field10538 == 65535) {
                class758.field10538 = -1;
            }
            return true;
        } else if (class642.field8799 == class294.field4138) {
            int var64 = class89.field1072.method3729((byte) 63);
            class544.method3153(false);
            class390.method2454(-1, var64, -1, 3, 126);
            class294.field4138 = null;
            return true;
        } else if (class422.field5954 == class294.field4138) {
            class415.method2550(class370.field5212, -25626);
            class294.field4138 = null;
            return false;
        } else if (class523.field7406 == class294.field4138) {
            class350.method2259(class614.field8602, arg0 ^ 0x71);
            class294.field4138 = null;
            return true;
        } else if (class294.field4138 == class191.field2549) {
            class459.field6465 = class2.field13;
            class294.field4138 = null;
            class726.field10163 = 1;
            return true;
        } else if (class67.field823 == class294.field4138) {
            int var65 = class89.field1072.method3757((byte) -65);
            if (var65 == 65535) {
                var65 = -1;
            }
            int var66 = class89.field1072.method3750((byte) 35);
            int var67 = class89.field1072.method3757((byte) -65);
            int var68 = class89.field1072.method3750((byte) 35);
            int var69 = class89.field1072.method3757((byte) -65);
            class220.method1349(var65, false, var66, var69, 9400, var68, var67);
            class294.field4138 = null;
            return true;
        } else if (class294.field4138 == class240.field3197) {
            class155.method1040(26);
            class294.field4138 = null;
            return false;
        } else if (class294.field4138 == class268.field3818) {
            class350.method2259(class661.field9052, -1);
            class294.field4138 = null;
            return true;
        } else if (class355.field5064 == class294.field4138) {
            class261.field3764 = class89.field1072.method3750((byte) 35);
            for (int var70 = 0; var70 < class261.field3764; var70++) {
                class260.field3742[var70] = class89.field1072.method3697(-1);
                class608.field8561[var70] = class89.field1072.method3697(-1);
                if (class608.field8561[var70].equals("")) {
                    class608.field8561[var70] = class260.field3742[var70];
                }
                class539.field7559[var70] = class89.field1072.method3697(-1);
                class598.field8404[var70] = class89.field1072.method3697(arg0 + 113);
                if (class598.field8404[var70].equals("")) {
                    class598.field8404[var70] = class539.field7559[var70];
                }
                class69.field853[var70] = false;
            }
            class294.field4138 = null;
            class459.field6465 = class2.field13;
            return true;
        } else if (class660.field9034 == class294.field4138) {
            int var71 = class89.field1072.method3717(arg0 ^ 0xFFFF9BBD);
            if (var71 == 65535) {
                var71 = -1;
            }
            int var72 = class89.field1072.method3691((byte) 94);
            class544.method3153(false);
            class390.method2454(-1, var72, var71, 1, 105);
            class294.field4138 = null;
            return true;
        } else if (class85.field1051 == class294.field4138) {
            int var73 = class89.field1072.method3744(true);
            int var74 = class89.field1072.method3717(arg0 + 25765);
            int var75 = class89.field1072.method3700(27326);
            class544.method3153(false);
            class219.method1342((var73 << 16) + var74, 11931, var75);
            class294.field4138 = null;
            return true;
        } else if (class322.field4452 == class294.field4138) {
            int var76 = class89.field1072.method3717(arg0 + 25765);
            class544.method3153(false);
            class677.method3772((byte) 50, var76);
            class294.field4138 = null;
            return true;
        } else if (class294.field4138 == class147.field2111) {
            int var77 = class89.field1072.method3729((byte) 66);
            int var78 = class89.field1072.method3734(124);
            class101.field1201.method1996((byte) -71, var77, var78);
            class294.field4138 = null;
            return true;
        } else if (class406.field5755 == class294.field4138) {
            int var79 = class89.field1072.method3691((byte) 49);
            int var80 = var79 >> 28 & 0x3;
            int var81 = (var79 & 0xFFFF9EC) >> 14;
            int var82 = var79 & 0x3FFF;
            int var83 = class89.field1072.method3688(arg0 + 8039);
            int var84 = var83 >> 2;
            int var85 = var83 & 0x3;
            int var86 = class141.field2026[var84];
            int var87 = class89.field1072.method3744(true);
            int var88 = var81 - class228.field3063;
            if (var87 == 65535) {
                var87 = -1;
            }
            int var89 = var82 - class3.field30;
            class604.method3394(var86, var89, false, var84, var85, var80, var88, var87);
            class294.field4138 = null;
            return true;
        } else if (class294.field4138 == class133.field1950) {
            int var90 = class89.field1072.method3750((byte) 35);
            int var91 = class89.field1072.method3750((byte) 35);
            int var92 = class89.field1072.method3744(true) << 2;
            int var93 = class89.field1072.method3688(7925);
            int var94 = class89.field1072.method3750((byte) 35);
            class544.method3153(false);
            class622.method3494(var93, var90, var92, var94, var91, (byte) 66);
            class294.field4138 = null;
            return true;
        } else if (class43.field523 == class294.field4138) {
            class106.field1278 = class89.field1072.method3710(-6067);
            class332.field4619 = class89.field1072.method3688(7925);
            class294.field4138 = null;
            return true;
        } else if (class341.field4739 == class294.field4138) {
            int var95 = class89.field1072.method3757((byte) -65);
            String var96 = class89.field1072.method3697(-1);
            class544.method3153(false);
            class199.method1220(-127, var96, var95);
            class294.field4138 = null;
            return true;
        } else if (class3.field29 == class294.field4138) {
            class433.method2636(class398.field5617, 114, class89.field1072);
            class294.field4138 = null;
            return true;
        } else if (class642.field8811 == class294.field4138) {
            String var97 = class89.field1072.method3697(-1);
            String var98 = class493.method2950(class740.method4133(arg0 + 32881, class89.field1072), 0);
            class336.method2182(-75, var98, var97, 0, var97, var97, 6);
            class294.field4138 = null;
            return true;
        } else if (class84.field1044 == class294.field4138) {
            int var99 = class89.field1072.method3729((byte) 39);
            int var100 = class89.field1072.method3734(124);
            int var101 = class89.field1072.method3703(114);
            class544.method3153(false);
            class390.method2454(var101, var99, var100, 5, 111);
            class294.field4138 = null;
            return true;
        } else if (class294.field4138 == class175.field2357) {
            int var102 = class89.field1072.method3744(true);
            int var103 = class89.field1072.method3688(arg0 ^ 0xFFFFE17B);
            class101.field1201.method1996((byte) 74, var103, var102);
            class294.field4138 = null;
            return true;
        } else if (class612.field8583 == class294.field4138) {
            String var104 = class89.field1072.method3697(-1);
            int var105 = class89.field1072.method3757((byte) -65);
            if (var105 == 65535) {
                var105 = -1;
            }
            int var106 = class89.field1072.method3750((byte) 35);
            int var107 = class89.field1072.method3688(7925);
            if (var107 >= 1 && var107 <= 8) {
                if (var104.equalsIgnoreCase("null")) {
                    var104 = null;
                }
                class393.field5577[var107 - 1] = var104;
                class349.field4947[var107 - 1] = var105;
                class67.field815[var107 - 1] = var106 == 0;
            }
            class294.field4138 = null;
            return true;
        } else if (class422.field5959 == class294.field4138) {
            int var108 = class89.field1072.method3744(true);
            int var109 = class89.field1072.method3734(arg0 ^ 0xFFFFFFF3);
            int var110 = class89.field1072.method3744(true);
            int var111 = class89.field1072.method3729((byte) 81);
            int var112 = class89.field1072.method3750((byte) 35);
            boolean var113 = (var112 & 0x80) != 0;
            int var114 = var112 & 0x7;
            int var115 = (var112 & 0x7D) >> 3;
            if (var115 == 15) {
                var115 = -1;
            }
            if (var111 >> 30 != 0) {
                int var147 = (var111 & 0x374BD4E7) >> 28;
                int var148 = (var111 >> 14 & 0x3FFF) - class228.field3063;
                int var149 = (var111 & 0x3FFF) - class3.field30;
                if (var148 >= 0 && var149 >= 0 && class336.field4683 > var148 && var149 < class700.field9768) {
                    int var150 = var148 * 512 + 256;
                    int var151 = var149 * 512 + 256;
                    int var152 = var147;
                    if (var147 < 3 && class364.method2319((byte) -101, var148, var149)) {
                        var152 = var147 + 1;
                    }
                    class646 var153 = new class646(var109, var108, class740.field10285, var147, var152, var150, class469.method2798(92, var151, var147, var150) - var110, var151, var148, var148, var149, var149, var114);
                    class670.field9095.method2770((byte) -13, new class296(var153));
                }
            } else if ((var111 >> 29) != 0) {
                int var116 = var111 & 0xFFFF;
                class740 var117 = (class740) class373.field5230.method1180((byte) 26, (long) var116);
                if (var117 != null) {
                    class468 var118 = var117.field10289;
                    if (var109 == 65535) {
                        var109 = -1;
                    }
                    boolean var119 = true;
                    int var120 = var113 ? var118.field7977 : var118.field7928;
                    if (var109 != -1 && var120 != -1) {
                        if (var109 == var120) {
                            class752 var121 = class220.field2879.method977(var109, (byte) 106);
                            if (var121.field10443 && var121.field10449 != -1) {
                                class709 var122 = class343.field4785.method3525(var121.field10449, (byte) 91);
                                int var123 = var122.field9848;
                                if (var123 == 0 || var123 == 2) {
                                    var119 = false;
                                } else if (var123 == 1) {
                                    var119 = true;
                                }
                            }
                        } else {
                            class752 var124 = class220.field2879.method977(var109, (byte) 96);
                            class752 var125 = class220.field2879.method977(var120, (byte) -98);
                            if (var124.field10449 != -1 && var125.field10449 != -1) {
                                class709 var126 = class343.field4785.method3525(var124.field10449, (byte) 101);
                                class709 var127 = class343.field4785.method3525(var125.field10449, (byte) -36);
                                if (var126.field9824 < var127.field9824) {
                                    var119 = false;
                                }
                            }
                        }
                    }
                    if (var119) {
                        if (var113) {
                            var118.field7977 = var109;
                            var118.field7955 = var115;
                            var118.field7953 = 0;
                            var118.field7952 = 1;
                            var118.field7912 = 0;
                            var118.field7919 = class740.field10285 + var108;
                            var118.field7973 = var114;
                            var118.field7986 = var110;
                            if (var118.field7919 > class740.field10285) {
                                var118.field7953 = -1;
                            }
                            if (var118.field7977 != -1 && class740.field10285 == var118.field7919) {
                                int var128 = class220.field2879.method977(var118.field7977, (byte) 126).field10449;
                                if (var128 != -1) {
                                    class709 var129 = class343.field4785.method3525(var128, (byte) -68);
                                    if (var129 != null && var129.field9826 != null && !var118.field7970) {
                                        class346.method2239(-701644944, 0, var118, var129);
                                    }
                                }
                            }
                        } else {
                            var118.field7976 = var115;
                            var118.field7938 = var110;
                            var118.field7940 = class740.field10285 + var108;
                            var118.field7936 = var114;
                            var118.field7920 = 1;
                            var118.field7928 = var109;
                            var118.field7923 = 0;
                            var118.field7966 = 0;
                            if (var118.field7940 > class740.field10285) {
                                var118.field7966 = -1;
                            }
                            if (var118.field7928 != -1 && class740.field10285 == var118.field7940) {
                                int var130 = class220.field2879.method977(var118.field7928, (byte) -110).field10449;
                                if (var130 != -1) {
                                    class709 var131 = class343.field4785.method3525(var130, (byte) -63);
                                    if (var131 != null && var131.field9826 != null && !var118.field7970) {
                                        class346.method2239(arg0 ^ 0x29D240FE, 0, var118, var131);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (var111 >> 28 != 0) {
                int var132 = var111 & 0xFFFF;
                class280 var133;
                if (class389.field5512 == var132) {
                    var133 = class660.field9039;
                } else {
                    var133 = class309.field4311[var132];
                }
                if (var133 != null) {
                    if (var109 == 65535) {
                        var109 = -1;
                    }
                    boolean var134 = true;
                    int var135 = var113 ? var133.field7977 : var133.field7928;
                    if (var109 != -1 && var135 != -1) {
                        if (var109 == var135) {
                            class752 var140 = class220.field2879.method977(var109, (byte) -90);
                            if (var140.field10443 && var140.field10449 != -1) {
                                class709 var141 = class343.field4785.method3525(var140.field10449, (byte) -120);
                                int var142 = var141.field9848;
                                if (var142 == 0 || var142 == 2) {
                                    var134 = false;
                                } else if (var142 == 1) {
                                    var134 = true;
                                }
                            }
                        } else {
                            class752 var136 = class220.field2879.method977(var109, (byte) -101);
                            class752 var137 = class220.field2879.method977(var135, (byte) 108);
                            if (var136.field10449 != -1 && var137.field10449 != -1) {
                                class709 var138 = class343.field4785.method3525(var136.field10449, (byte) 100);
                                class709 var139 = class343.field4785.method3525(var137.field10449, (byte) 119);
                                if (var139.field9824 > var138.field9824) {
                                    var134 = false;
                                }
                            }
                        }
                    }
                    if (var134) {
                        if (var113) {
                            var133.field7955 = var115;
                            var133.field7973 = var114;
                            var133.field7919 = class740.field10285 + var108;
                            var133.field7977 = var109;
                            var133.field7952 = 1;
                            var133.field7912 = 0;
                            var133.field7953 = 0;
                            var133.field7986 = var110;
                            if (class740.field10285 < var133.field7919) {
                                var133.field7953 = -1;
                            }
                            if (var133.field7977 == 65535) {
                                var133.field7977 = -1;
                            }
                            if (var133.field7977 != -1 && class740.field10285 == var133.field7919) {
                                int var143 = class220.field2879.method977(var133.field7977, (byte) 61).field10449;
                                if (var143 != -1) {
                                    class709 var144 = class343.field4785.method3525(var143, (byte) 119);
                                    if (var144 != null && var144.field9826 != null && !var133.field7970) {
                                        class346.method2239(-701644944, 0, var133, var144);
                                    }
                                }
                            }
                        } else {
                            var133.field7936 = var114;
                            var133.field7928 = var109;
                            var133.field7940 = class740.field10285 + var108;
                            var133.field7920 = 1;
                            var133.field7966 = 0;
                            var133.field7938 = var110;
                            var133.field7923 = 0;
                            var133.field7976 = var115;
                            if (class740.field10285 < var133.field7940) {
                                var133.field7966 = -1;
                            }
                            if (var133.field7928 == 65535) {
                                var133.field7928 = -1;
                            }
                            if (var133.field7928 != -1 && class740.field10285 == var133.field7940) {
                                int var145 = class220.field2879.method977(var133.field7928, (byte) 127).field10449;
                                if (var145 != -1) {
                                    class709 var146 = class343.field4785.method3525(var145, (byte) 101);
                                    if (var146 != null && var146.field9826 != null && !var133.field7970) {
                                        class346.method2239(-701644944, 0, var133, var146);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class294.field4138 = null;
            return true;
        } else if (class654.field8969 == class294.field4138) {
            int var154 = class89.field1072.method3688(arg0 + 8039);
            int var155 = class89.field1072.method3688(7925);
            if (var154 == 255) {
                var154 = -1;
                var155 = -1;
            }
            class145.method1006(var154, var155, 126);
            class294.field4138 = null;
            return true;
        } else if (class44.field534 == class294.field4138) {
            boolean var156 = class89.field1072.method3750((byte) 35) == 1;
            byte[] var157 = new byte[class398.field5617 - 1];
            class89.field1072.method3723(var157, 4, class398.field5617 - 1, 0);
            class481.method2870(-51, var156, var157);
            class294.field4138 = null;
            return true;
        } else if (class294.field4138 == class202.field2645) {
            byte var158 = class89.field1072.method3719(1854307120);
            int var159 = class89.field1072.method3717(25651);
            class544.method3153(false);
            class429.method2619(var158, false, var159);
            class294.field4138 = null;
            return true;
        } else if (class661.field9044 == class294.field4138) {
            class544.method3153(false);
            class146.method1010((byte) -128);
            class294.field4138 = null;
            return true;
        } else if (class36.field449 == class294.field4138) {
            class169.field2313 = class89.field1072.method3719(1854307120) << 3;
            class412.field5817 = class89.field1072.method3750((byte) 35);
            class14.field266 = class89.field1072.method3719(arg0 ^ 0x917984BE) << 3;
            for (class338 var160 = (class338) class178.field2391.method1176(arg0 + 24604); var160 != null; var160 = (class338) class178.field2391.method1178((byte) 71)) {
                int var162 = (int) (var160.field2546 >> 28 & 0x3L);
                int var163 = (int) (var160.field2546 & 0x3FFFL);
                int var164 = var163 - class228.field3063;
                int var165 = (int) (var160.field2546 >> 14 & 0x3FFFL);
                int var166 = var165 - class3.field30;
                if (class412.field5817 == var162 && var164 >= class14.field266 && class14.field266 + 8 > var164 && class169.field2313 <= var166 && var166 < (class169.field2313 + 8)) {
                    var160.method1185(-97);
                    if (var164 >= 0 && var166 >= 0 && class336.field4683 > var164 && var166 < class700.field9768) {
                        class64.method541(var166, var164, -10615, class412.field5817);
                    }
                }
            }
            for (class639 var161 = (class639) class633.field8740.method2765(-12261); var161 != null; var161 = (class639) class633.field8740.method2759(arg0 - 15247)) {
                if (class14.field266 <= var161.field8774 && var161.field8774 < class14.field266 + 8 && class169.field2313 <= var161.field8773 && (class169.field2313 + 8) > var161.field8773 && class412.field5817 == var161.field8787) {
                    var161.field8778 = 0;
                }
            }
            class294.field4138 = null;
            return true;
        } else if (class639.field8777 == class294.field4138) {
            class350.method2259(class575.field8135, arg0 ^ 0x71);
            class294.field4138 = null;
            return true;
        } else if (class341.field4735 == class294.field4138) {
            class287.method1881(28123);
            class294.field4138 = null;
            return false;
        } else if (class704.field9800 == class294.field4138) {
            int var167 = class89.field1072.method3750((byte) 35);
            int var168 = var167 >> 5;
            int var169 = var167 & 0x1F;
            if (var169 == 0) {
                class98.field1180[var168] = null;
                class294.field4138 = null;
                return true;
            }
            class584 var170 = new class584();
            var170.field8214 = var169;
            var170.field8212 = class89.field1072.method3750((byte) 35);
            if (var170.field8212 >= 0 && var170.field8212 < class346.field4870.length) {
                if (var170.field8214 == 1 || var170.field8214 == 10) {
                    var170.field8224 = class89.field1072.method3757((byte) -65);
                    class89.field1072.field9146 += 6;
                } else if (var170.field8214 >= 2 && var170.field8214 <= 6) {
                    if (var170.field8214 == 2) {
                        var170.field8216 = 256;
                        var170.field8221 = 256;
                    }
                    if (var170.field8214 == 3) {
                        var170.field8216 = 256;
                        var170.field8221 = 0;
                    }
                    if (var170.field8214 == 4) {
                        var170.field8221 = 512;
                        var170.field8216 = 256;
                    }
                    if (var170.field8214 == 5) {
                        var170.field8221 = 256;
                        var170.field8216 = 0;
                    }
                    if (var170.field8214 == 6) {
                        var170.field8216 = 512;
                        var170.field8221 = 256;
                    }
                    var170.field8214 = 2;
                    var170.field8217 = class89.field1072.method3750((byte) 35);
                    var170.field8221 += class89.field1072.method3757((byte) -65) - class228.field3063 << 9;
                    var170.field8216 += class89.field1072.method3757((byte) -65) - class3.field30 << 9;
                    var170.field8218 = class89.field1072.method3750((byte) 35) << 2;
                    var170.field8225 = class89.field1072.method3757((byte) -65);
                }
                var170.field8215 = class89.field1072.method3757((byte) -65);
                if (var170.field8215 == 65535) {
                    var170.field8215 = -1;
                }
                class98.field1180[var168] = var170;
            }
            class294.field4138 = null;
            return true;
        } else if (class560.field7871 == class294.field4138) {
            int var171 = class89.field1072.method3750((byte) 35);
            int var172 = class89.field1072.method3710(-6067);
            int var173 = class89.field1072.method3736(true);
            int var174 = class89.field1072.method3710(-6067);
            int var175 = class89.field1072.method3757((byte) -65) << 2;
            class544.method3153(false);
            class480.method2869(var171, (byte) -59, var173, true, var172, var174, var175);
            class294.field4138 = null;
            return true;
        } else if (class355.field5061 == class294.field4138) {
            int var176 = class89.field1072.method3703(arg0 + 218);
            int var177 = class89.field1072.method3717(25651);
            class544.method3153(false);
            class305.method1993(var176, var177, arg0 ^ 0xFFFFFFF4);
            class294.field4138 = null;
            return true;
        } else if (class294.field4138 == class165.field2264) {
            int var178 = class89.field1072.method3691((byte) -108);
            int var179 = class89.field1072.method3734(126);
            int var180 = class89.field1072.method3734(126);
            if (var180 == 65535) {
                var180 = -1;
            }
            int var181 = class89.field1072.method3717(25651);
            if (var181 == 65535) {
                var181 = -1;
            }
            class544.method3153(false);
            for (int var182 = var180; var182 <= var181; var182++) {
                long var183 = ((long) var178 << 32) + ((long) var182);
                class477 var185 = (class477) class347.field4885.method1180((byte) 26, var183);
                class477 var186;
                if (var185 != null) {
                    var186 = new class477(var185.field6767, var179);
                    var185.method1185(-101);
                } else if (var182 == -1) {
                    var186 = new class477(class127.method854((byte) -97, var178).field7071.field6767, var179);
                } else {
                    var186 = new class477(0, var179);
                }
                class347.field4885.method1179(var183, var186, (byte) -26);
            }
            class294.field4138 = null;
            return true;
        } else {
            if (arg0 != -114) {
                field6430 = null;
            }
            if (class719.field9986 == class294.field4138) {
                class350.method2259(class220.field2880, arg0 + 113);
                class294.field4138 = null;
                return true;
            } else if (class589.field8301 == class294.field4138) {
                class543.field7581 = class2.field13;
                if (class398.field5617 == 0) {
                    class294.field4138 = null;
                    class741.field10299 = 0;
                    class166.field2280 = null;
                    class373.field5240 = null;
                    class332.field4625 = null;
                    return true;
                }
                class373.field5240 = class89.field1072.method3697(-1);
                boolean var187 = class89.field1072.method3750((byte) 35) == 1;
                if (var187) {
                    class89.field1072.method3697(-1);
                }
                long var188 = class89.field1072.method3714(8919);
                class166.field2280 = class456.method2711(var188, -2787);
                class418.field5908 = class89.field1072.method3719(1854307120);
                int var190 = class89.field1072.method3750((byte) 35);
                if (var190 == 255) {
                    class294.field4138 = null;
                    return true;
                }
                class741.field10299 = var190;
                class27[] var191 = new class27[100];
                for (int var192 = 0; var192 < class741.field10299; var192++) {
                    var191[var192] = new class27();
                    var191[var192].field360 = class89.field1072.method3697(arg0 ^ 0x71);
                    boolean var198 = class89.field1072.method3750((byte) 35) == 1;
                    if (var198) {
                        var191[var192].field362 = class89.field1072.method3697(arg0 + 113);
                    } else {
                        var191[var192].field362 = var191[var192].field360;
                    }
                    var191[var192].field361 = class705.method3964(0, var191[var192].field362);
                    var191[var192].field358 = class89.field1072.method3757((byte) -65);
                    var191[var192].field359 = class89.field1072.method3719(arg0 ^ 0x917984BE);
                    var191[var192].field364 = class89.field1072.method3697(-1);
                    if (var191[var192].field362.equals(class660.field9039.field3965)) {
                        class176.field2374 = var191[var192].field359;
                    }
                }
                boolean var193 = false;
                int var194 = class741.field10299;
                while (var194 > 0) {
                    var194--;
                    boolean var195 = true;
                    for (int var196 = 0; var196 < var194; var196++) {
                        if (var191[var196].field361.compareTo(var191[var196 + 1].field361) > 0) {
                            class27 var197 = var191[var196];
                            var191[var196] = var191[var196 + 1];
                            var191[var196 + 1] = var197;
                            var195 = false;
                        }
                    }
                    if (var195) {
                        break;
                    }
                }
                class294.field4138 = null;
                class332.field4625 = var191;
                return true;
            } else if (class662.field9063 == class294.field4138) {
                int var199 = class89.field1072.method3744(true);
                int var200 = class89.field1072.method3700(27326);
                int var201 = class89.field1072.method3734(arg0 ^ 0xFFFFFFF3);
                int var202 = class89.field1072.method3734(126);
                class544.method3153(false);
                class390.method2454(var199, var200, var201 | var202 << 16, 7, 116);
                class294.field4138 = null;
                return true;
            } else if (class576.field8142 == class294.field4138) {
                int var203 = class89.field1072.method3703(116);
                int var204 = class89.field1072.method3734(125);
                if (var204 == 65535) {
                    var204 = -1;
                }
                int var205 = class89.field1072.method3729((byte) 85);
                class544.method3153(false);
                class85.method646(var203, var204, var205, -4847);
                class551 var206 = class682.field9361.method3424(var204, false);
                class368.method2344(var206.field7726, var203, var206.field7705, (byte) -81, var206.field7701);
                class5.method28(-818245748, var206.field7712, var203, var206.field7697, var206.field7731);
                class294.field4138 = null;
                return true;
            } else if (class654.field8986 == class294.field4138) {
                class69.field846 = class729.method4095(121, class89.field1072.method3750((byte) 35));
                class294.field4138 = null;
                return true;
            } else if (class94.field1098 == class294.field4138) {
                class350.method2259(class578.field8163, -1);
                class294.field4138 = null;
                return true;
            } else if (class333.field4661 == class294.field4138) {
                class211.field2787 = class89.field1072.method3752(-109);
                class567.field8052 = class89.field1072.method3750((byte) 35) == 1;
                class294.field4138 = null;
                return true;
            } else if (class481.field6804 == class294.field4138) {
                int var207 = class89.field1072.method3700(arg0 + 27440);
                int var208 = class89.field1072.method3717(25651);
                if (var208 == 65535) {
                    var208 = -1;
                }
                int var209 = class89.field1072.method3734(124);
                if (var209 == 65535) {
                    var209 = -1;
                }
                int var210 = class89.field1072.method3700(27326);
                class544.method3153(false);
                for (int var211 = var208; var211 <= var209; var211++) {
                    long var212 = ((long) var207 << 32) + (long) var211;
                    class477 var214 = (class477) class347.field4885.method1180((byte) 26, var212);
                    class477 var215;
                    if (var214 != null) {
                        var215 = new class477(var210, var214.field6772);
                        var214.method1185(-60);
                    } else if (var211 == -1) {
                        var215 = new class477(var210, class127.method854((byte) -104, var207).field7071.field6772);
                    } else {
                        var215 = new class477(var210, -1);
                    }
                    class347.field4885.method1179(var212, var215, (byte) -26);
                }
                class294.field4138 = null;
                return true;
            } else if (class392.field5538 == class294.field4138) {
                int var216 = class89.field1072.method3703(112);
                class579.field8177 = class202.field2644.method2052(var216, (byte) 0);
                class294.field4138 = null;
                return true;
            } else if (class89.field1074 == class294.field4138) {
                String var217 = class89.field1072.method3697(-1);
                boolean var218 = class89.field1072.method3750((byte) 35) == 1;
                String var219;
                if (var218) {
                    var219 = class89.field1072.method3697(-1);
                } else {
                    var219 = var217;
                }
                int var220 = class89.field1072.method3757((byte) -65);
                byte var221 = class89.field1072.method3719(arg0 + 1854307234);
                boolean var222 = false;
                if (var221 == -128) {
                    var222 = true;
                }
                if (var222) {
                    if (class741.field10299 == 0) {
                        class294.field4138 = null;
                        return true;
                    }
                    boolean var228 = false;
                    int var229;
                    for (var229 = 0; var229 < class741.field10299 && (!class332.field4625[var229].field362.equals(var219) || class332.field4625[var229].field358 != var220); var229++) {
                    }
                    if (class741.field10299 > var229) {
                        while (var229 < (class741.field10299 - 1)) {
                            class332.field4625[var229] = class332.field4625[var229 + 1];
                            var229++;
                        }
                        class741.field10299--;
                        class332.field4625[class741.field10299] = null;
                    }
                } else {
                    String var223 = class89.field1072.method3697(-1);
                    class27 var224 = new class27();
                    var224.field362 = var219;
                    var224.field360 = var217;
                    var224.field361 = class705.method3964(0, var224.field362);
                    var224.field364 = var223;
                    var224.field358 = var220;
                    var224.field359 = var221;
                    int var225;
                    for (var225 = class741.field10299 - 1; var225 >= 0; var225--) {
                        int var226 = class332.field4625[var225].field361.compareTo(var224.field361);
                        if (var226 == 0) {
                            class332.field4625[var225].field358 = var220;
                            class332.field4625[var225].field359 = var221;
                            class332.field4625[var225].field364 = var223;
                            if (var219.equals(class660.field9039.field3965)) {
                                class176.field2374 = var221;
                            }
                            class294.field4138 = null;
                            class543.field7581 = class2.field13;
                            return true;
                        }
                        if (var226 < 0) {
                            break;
                        }
                    }
                    if (class741.field10299 >= class332.field4625.length) {
                        class294.field4138 = null;
                        return true;
                    }
                    for (int var227 = class741.field10299 - 1; var227 > var225; var227--) {
                        class332.field4625[var227 + 1] = class332.field4625[var227];
                    }
                    if (class741.field10299 == 0) {
                        class332.field4625 = new class27[100];
                    }
                    class332.field4625[var225 + 1] = var224;
                    class741.field10299++;
                    if (var219.equals(class660.field9039.field3965)) {
                        class176.field2374 = var221;
                    }
                }
                class543.field7581 = class2.field13;
                class294.field4138 = null;
                return true;
            } else if (class507.field7259 == class294.field4138) {
                int var230 = class89.field1072.method3693(120);
                int var231 = class89.field1072.method3703(90);
                int var232 = class89.field1072.method3750((byte) 35);
                String var233 = "";
                String var234 = var233;
                if ((var232 & 0x1) != 0) {
                    var233 = class89.field1072.method3697(arg0 + 113);
                    if ((var232 & 0x2) == 0) {
                        var234 = var233;
                    } else {
                        var234 = class89.field1072.method3697(arg0 + 113);
                    }
                }
                String var235 = class89.field1072.method3697(-1);
                if (var230 == 99) {
                    class559.method3221(var235, (byte) 41);
                } else if (var234.equals("") || !class101.method730(var234, (byte) -91)) {
                    class336.method2182(-112, var235, var234, var231, var233, var233, var230);
                } else {
                    class294.field4138 = null;
                    return true;
                }
                class294.field4138 = null;
                return true;
            } else if (class296.field4164 == class294.field4138) {
                int var236 = class89.field1072.method3717(25651);
                int var237 = class89.field1072.method3703(124);
                class544.method3153(false);
                class272.method1775((byte) 76, var237, var236);
                class294.field4138 = null;
                return true;
            } else if (class294.field4138 == class238.field3185) {
                class2.field20 = class89.field1072.method3750((byte) 35);
                class542.field7578 = class2.field13;
                class294.field4138 = null;
                return true;
            } else if (class355.field5062 == class294.field4138) {
                int var238 = class89.field1072.method3739(0);
                int var239 = class89.field1072.method3729((byte) 105);
                int var240 = class89.field1072.method3699(-8);
                class544.method3153(false);
                class8.method54(var240, var239, var238, true);
                class294.field4138 = null;
                return true;
            } else if (class554.field7785 == class294.field4138) {
                int var241 = class89.field1072.method3750((byte) 35);
                int var242 = class89.field1072.method3757((byte) -65);
                boolean var243 = (var241 & 0x1) == 1;
                class120.method828(var243, var242, (byte) 95);
                class93.field1089[class286.method1877(31, class286.field4059++)] = var242;
                class294.field4138 = null;
                return true;
            } else if (class294.field4138 == class135.field1960) {
                int var244 = class89.field1072.method3691((byte) 72);
                String var245 = class89.field1072.method3697(-1);
                class544.method3153(false);
                class288.method1883(var244, var245, arg0 + 117);
                class294.field4138 = null;
                return true;
            } else if (class294.field4138 == class176.field2373) {
                boolean var246 = class89.field1072.method3750((byte) 35) == 1;
                String var247 = class89.field1072.method3697(arg0 + 113);
                String var248 = var247;
                if (var246) {
                    var248 = class89.field1072.method3697(-1);
                }
                int var249 = class89.field1072.method3750((byte) 35);
                boolean var250 = false;
                if (var249 <= 1) {
                    if (!(!class567.field8052 || class491.field6932) || class603.field8476) {
                        var250 = true;
                    } else if (var249 <= 1 && class101.method730(var248, (byte) -88)) {
                        var250 = true;
                    }
                }
                if (!var250 && class592.field8338 == 0) {
                    String var251 = class493.method2950(class740.method4133(32767, class89.field1072), 0);
                    if (var249 == 2) {
                        class172.method1107(var251, 24, 0, true, null, -1, "<img=1>" + var247, var247, "<img=1>" + var248);
                    } else if (var249 == 1) {
                        class172.method1107(var251, 24, 0, true, null, -1, "<img=0>" + var247, var247, "<img=0>" + var248);
                    } else {
                        class172.method1107(var251, 24, 0, true, null, -1, var247, var247, var248);
                    }
                }
                class294.field4138 = null;
                return true;
            } else if (class294.field4138 == class235.field3167) {
                if (class272.field3891 != null) {
                    class342.method2214(arg0 + 117, false, class557.field7812.field6551.method290(false), -1, -1);
                }
                byte[] var252 = new byte[class398.field5617];
                class89.field1072.method3830(true, 0, class398.field5617, var252);
                String var253 = class529.method3081(var252, 0, 63, class398.field5617);
                class38.method213(true, var253, (byte) 123, class202.field2644, class557.field7812.field6521.method2556(false) == 1);
                class294.field4138 = null;
                return true;
            } else if (class335.field4671 == class294.field4138) {
                int var254 = class89.field1072.method3729((byte) 46);
                int var255 = class89.field1072.method3729((byte) 124);
                class544.method3153(false);
                class47 var256 = (class47) class475.field6744.method1180((byte) 26, (long) var254);
                class47 var257 = (class47) class475.field6744.method1180((byte) 26, (long) var255);
                if (var257 != null) {
                    class353.method2275(false, var256 == null || var256.field550 != var257.field550, var257, arg0 + 76);
                }
                if (var256 != null) {
                    var256.method1185(-105);
                    class475.field6744.method1179((long) var255, var256, (byte) -26);
                }
                class493 var258 = class127.method854((byte) -82, var254);
                if (var258 != null) {
                    class543.method3149(var258, 1);
                }
                class493 var259 = class127.method854((byte) -78, var255);
                if (var259 != null) {
                    class543.method3149(var259, arg0 + 115);
                    class107.method765(true, true, var259);
                }
                if (class457.field6447 != -1) {
                    class118.method821(1, -115, class457.field6447);
                }
                class294.field4138 = null;
                return true;
            } else if (class428.field6112 == class294.field4138) {
                class415.method2550(false, arg0 ^ 0x6468);
                class294.field4138 = null;
                return false;
            } else if (class657.field9012 == class294.field4138) {
                int var260 = class89.field1072.method3744(true);
                int var261 = class89.field1072.method3703(91);
                class544.method3153(false);
                class429.method2619(var261, false, var260);
                class294.field4138 = null;
                return true;
            } else if (class9.field131 == class294.field4138) {
                class350.method2259(class174.field2355, -1);
                class294.field4138 = null;
                return true;
            } else if (class294.field4138 == class252.field3691) {
                int var262 = class89.field1072.method3750((byte) 35);
                boolean var263 = (var262 & 0x1) == 1;
                String var264 = class89.field1072.method3697(-1);
                String var265 = class89.field1072.method3697(-1);
                if (var265.equals("")) {
                    var265 = var264;
                }
                String var266 = class89.field1072.method3697(arg0 + 113);
                String var267 = class89.field1072.method3697(arg0 ^ 0x71);
                if (var267.equals("")) {
                    var267 = var266;
                }
                if (var263) {
                    for (int var268 = 0; var268 < class261.field3764; var268++) {
                        if (class608.field8561[var268].equals(var267)) {
                            class260.field3742[var268] = var264;
                            class608.field8561[var268] = var265;
                            class539.field7559[var268] = var266;
                            class598.field8404[var268] = var267;
                            break;
                        }
                    }
                } else {
                    class260.field3742[class261.field3764] = var264;
                    class608.field8561[class261.field3764] = var265;
                    class539.field7559[class261.field3764] = var266;
                    class598.field8404[class261.field3764] = var267;
                    class69.field853[class261.field3764] = class286.method1877(2, var262) == 2;
                    class261.field3764++;
                }
                class459.field6465 = class2.field13;
                class294.field4138 = null;
                return true;
            } else if (class4.field38 == class294.field4138) {
                String var269 = class89.field1072.method3697(-1);
                int var270 = class89.field1072.method3757((byte) -65);
                String var271 = class5.field50.method3340(var270, false).method2335(class89.field1072, (byte) 78);
                class172.method1107(var271, 19, 0, true, null, var270, var269, var269, var269);
                class294.field4138 = null;
                return true;
            } else if (class318.field4411 == class294.field4138) {
                class350.method2259(class263.field3792, -1);
                class294.field4138 = null;
                return true;
            } else if (class687.field9386 == class294.field4138) {
                int var272 = class89.field1072.method3710(-6067);
                int var273 = class89.field1072.method3736(true);
                int var274 = class89.field1072.method3688(7925);
                int var275 = class89.field1072.method3744(true);
                int var276 = class89.field1072.method3688(arg0 + 8039);
                class544.method3153(false);
                class52.field596[var273] = true;
                class758.field10531[var273] = var276;
                class234.field3153[var273] = var272;
                class61.field745[var273] = var274;
                class281.field4001[var273] = var275;
                class294.field4138 = null;
                return true;
            } else if (class398.field5614 == class294.field4138) {
                for (int var277 = 0; var277 < class309.field4311.length; var277++) {
                    if (class309.field4311[var277] != null) {
                        class309.field4311[var277].field7911 = null;
                        class309.field4311[var277].field7991 = -1;
                    }
                }
                for (int var278 = 0; var278 < class438.field6239; var278++) {
                    class30.field399[var278].field10289.field7911 = null;
                    class30.field399[var278].field10289.field7991 = -1;
                }
                class294.field4138 = null;
                return true;
            } else if (class294.field4138 == class25.field346) {
                int var279 = class89.field1072.method3757((byte) -65);
                int var280 = class89.field1072.method3750((byte) 35);
                boolean var281 = (var280 & 0x1) == 1;
                while (class89.field1072.field9146 < class398.field5617) {
                    int var282 = class89.field1072.method3693(arg0 + 116);
                    int var283 = class89.field1072.method3757((byte) -65);
                    int var284 = 0;
                    if (var283 != 0) {
                        var284 = class89.field1072.method3750((byte) 35);
                        if (var284 == 255) {
                            var284 = class89.field1072.method3703(119);
                        }
                    }
                    class307.method2005(var281, var279, (byte) 111, var284, var282, var283 - 1);
                }
                class93.field1089[class286.method1877(31, class286.field4059++)] = var279;
                class294.field4138 = null;
                return true;
            } else if (class542.field7573 == class294.field4138) {
                int var285 = class89.field1072.method3688(7925);
                class544.method3153(false);
                class294.field4138 = null;
                class179.field2397 = var285;
                return true;
            } else if (class294.field4138 == class269.field3834) {
                int var286 = class89.field1072.method3703(93);
                class544.method3153(false);
                if (var286 == -1) {
                    class218.field2850 = -1;
                    class419.field5919 = -1;
                } else {
                    int var287 = var286 >> 14 & 0x3FFF;
                    int var288 = var286 & 0x3FFF;
                    int var289 = var287 - class228.field3063;
                    if (var289 < 0) {
                        var289 = 0;
                    } else if (var289 >= class336.field4683) {
                        var289 = class336.field4683;
                    }
                    int var290 = var288 - class3.field30;
                    class419.field5919 = (var289 << 9) + 256;
                    if (var290 < 0) {
                        var290 = 0;
                    } else if (var290 >= class700.field9768) {
                        var290 = class700.field9768;
                    }
                    class218.field2850 = (var290 << 9) + 256;
                }
                class294.field4138 = null;
                return true;
            } else if (class294.field4138 == class118.field1426) {
                byte var291 = class89.field1072.method3719(1854307120);
                int var292 = class89.field1072.method3710(-6067);
                class544.method3153(false);
                class182.method1151(var291, 127, var292);
                class294.field4138 = null;
                return true;
            } else if (class589.field8302 == class294.field4138) {
                int var293 = class89.field1072.method3688(7925);
                int var294 = class89.field1072.method3744(true);
                class544.method3153(false);
                class233.method1501(var294, true, var293, 4096);
                class294.field4138 = null;
                return true;
            } else if (class565.field8028 == class294.field4138) {
                int var295 = class89.field1072.method3757((byte) -65);
                if (var295 == 65535) {
                    var295 = -1;
                }
                int var296 = class89.field1072.method3750((byte) 35);
                int var297 = class89.field1072.method3757((byte) -65);
                int var298 = class89.field1072.method3750((byte) 35);
                int var299 = class89.field1072.method3757((byte) -65);
                class420.method2576(var299, var298, (byte) 85, var296, var295, var297);
                class294.field4138 = null;
                return true;
            } else if (class356.field5070 == class294.field4138) {
                boolean var300 = class89.field1072.method3750((byte) 35) == 1;
                String var301 = class89.field1072.method3697(arg0 ^ 0x71);
                String var302 = var301;
                if (var300) {
                    var302 = class89.field1072.method3697(arg0 ^ 0x71);
                }
                long var303 = (long) class89.field1072.method3757((byte) -65);
                long var305 = (long) class89.field1072.method3756(false);
                int var307 = class89.field1072.method3750((byte) 35);
                long var308 = (var303 << 32) + var305;
                boolean var310 = false;
                int var311 = 0;
                while (true) {
                    if (var311 >= 100) {
                        if (var307 <= 1) {
                            if (!(!class567.field8052 || class491.field6932) || class603.field8476) {
                                var310 = true;
                            } else if (class101.method730(var302, (byte) -127)) {
                                var310 = true;
                            }
                        }
                        break;
                    }
                    if (class481.field6803[var311] == var308) {
                        var310 = true;
                        break;
                    }
                    var311++;
                }
                if (!var310 && class592.field8338 == 0) {
                    class481.field6803[class407.field5774] = var308;
                    class407.field5774 = (class407.field5774 + 1) % 100;
                    String var312 = class493.method2950(class740.method4133(arg0 + 32881, class89.field1072), 0);
                    if (var307 == 2) {
                        class172.method1107(var312, 7, 0, true, null, -1, "<img=1>" + var301, var301, "<img=1>" + var302);
                    } else if (var307 == 1) {
                        class172.method1107(var312, 7, 0, true, null, -1, "<img=0>" + var301, var301, "<img=0>" + var302);
                    } else {
                        class172.method1107(var312, 3, 0, true, null, -1, var301, var301, var302);
                    }
                }
                class294.field4138 = null;
                return true;
            } else if (class590.field8308 == class294.field4138) {
                int var313 = class89.field1072.method3717(25651);
                byte var314 = class89.field1072.method3712(127);
                class101.field1201.method1991(var314, var313, false);
                class294.field4138 = null;
                return true;
            } else if (class364.field5160 == class294.field4138) {
                int var315 = class89.field1072.method3717(arg0 ^ 0xFFFF9BBD);
                int var316 = class89.field1072.method3734(125);
                class544.method3153(false);
                class158.method1053(0, arg0 ^ 0xFFFFFF8D, var315, var316);
                class294.field4138 = null;
                return true;
            } else if (class497.field7142 == class294.field4138) {
                int var317 = class89.field1072.method3717(25651);
                int var318 = class89.field1072.method3691((byte) -114);
                class101.field1201.method1991(var318, var317, false);
                class294.field4138 = null;
                return true;
            } else if (class573.field8109 == class294.field4138) {
                int var319 = class89.field1072.method3688(7925);
                int var320 = class89.field1072.method3757((byte) -65);
                if (var320 == 65535) {
                    var320 = -1;
                }
                int var321 = class89.field1072.method3710(-6067);
                class314.method2029(var319, 123, var320, var321);
                class294.field4138 = null;
                return true;
            } else if (class493.field7090 == class294.field4138) {
                int var322 = class89.field1072.method3757((byte) -65);
                if (var322 == 65535) {
                    var322 = -1;
                }
                int var323 = class89.field1072.method3736(true);
                int var324 = class89.field1072.method3743(arg0 + 114);
                class85.method647(var324, var322, var323, false);
                class294.field4138 = null;
                return true;
            } else if (class64.field783 == class294.field4138) {
                boolean var325 = class89.field1072.method3750((byte) 35) == 1;
                String var326 = class89.field1072.method3697(arg0 + 113);
                String var327 = var326;
                if (var325) {
                    var327 = class89.field1072.method3697(-1);
                }
                int var328 = class89.field1072.method3750((byte) 35);
                int var329 = class89.field1072.method3757((byte) -65);
                boolean var330 = false;
                if (var328 <= 1 && class101.method730(var327, (byte) -62)) {
                    var330 = true;
                }
                if (!var330 && class592.field8338 == 0) {
                    String var331 = class5.field50.method3340(var329, false).method2335(class89.field1072, (byte) 78);
                    if (var328 == 2) {
                        class172.method1107(var331, 25, 0, true, null, var329, "<img=1>" + var326, var326, "<img=1>" + var327);
                    } else if (var328 == 1) {
                        class172.method1107(var331, 25, 0, true, null, var329, "<img=0>" + var326, var326, "<img=0>" + var327);
                    } else {
                        class172.method1107(var331, 25, 0, true, null, var329, var326, var326, var327);
                    }
                }
                class294.field4138 = null;
                return true;
            } else if (class530.field7468 == class294.field4138) {
                int var332 = class89.field1072.method3757((byte) -65);
                if (var332 == 65535) {
                    var332 = -1;
                }
                int var333 = class89.field1072.method3750((byte) 35);
                int var334 = class89.field1072.method3757((byte) -65);
                int var335 = class89.field1072.method3750((byte) 35);
                class220.method1349(var332, true, var333, 256, 9400, var335, var334);
                class294.field4138 = null;
                return true;
            } else if (class611.field8581 == class294.field4138) {
                boolean var336 = class89.field1072.method3750((byte) 35) == 1;
                String var337 = class89.field1072.method3697(-1);
                String var338 = var337;
                if (var336) {
                    var338 = class89.field1072.method3697(arg0 ^ 0x71);
                }
                long var339 = class89.field1072.method3714(arg0 ^ 0xFFFFDD59);
                long var341 = (long) class89.field1072.method3757((byte) -65);
                long var343 = (long) class89.field1072.method3756(false);
                int var345 = class89.field1072.method3750((byte) 35);
                int var346 = class89.field1072.method3757((byte) -65);
                long var347 = (var341 << 32) + var343;
                boolean var349 = false;
                int var350 = 0;
                while (true) {
                    if (var350 >= 100) {
                        if (var345 <= 1 && class101.method730(var338, (byte) 95)) {
                            var349 = true;
                        }
                        break;
                    }
                    if (class481.field6803[var350] == var347) {
                        var349 = true;
                        break;
                    }
                    var350++;
                }
                if (!var349 && class592.field8338 == 0) {
                    class481.field6803[class407.field5774] = var347;
                    class407.field5774 = (class407.field5774 + 1) % 100;
                    String var351 = class5.field50.method3340(var346, false).method2335(class89.field1072, (byte) 78);
                    if (var345 == 2) {
                        class172.method1107(var351, 20, 0, true, class10.method72(39, var339), var346, "<img=1>" + var337, var337, "<img=1>" + var338);
                    } else if (var345 == 1) {
                        class172.method1107(var351, 20, 0, true, class10.method72(arg0 ^ 0xFFFFFFB6, var339), var346, "<img=0>" + var337, var337, "<img=0>" + var338);
                    } else {
                        class172.method1107(var351, 20, 0, true, class10.method72(arg0 ^ 0xFFFFFF9A, var339), var346, var337, var337, var338);
                    }
                }
                class294.field4138 = null;
                return true;
            } else if (class294.field4138 == class225.field3035) {
                while (class89.field1072.field9146 < class398.field5617) {
                    boolean var362 = class89.field1072.method3750((byte) 35) == 1;
                    String var363 = class89.field1072.method3697(-1);
                    String var364 = class89.field1072.method3697(arg0 ^ 0x71);
                    int var365 = class89.field1072.method3757((byte) -65);
                    int var366 = class89.field1072.method3750((byte) 35);
                    String var367 = "";
                    boolean var368 = false;
                    if (var365 > 0) {
                        var367 = class89.field1072.method3697(-1);
                        var368 = class89.field1072.method3750((byte) 35) == 1;
                    }
                    for (int var369 = 0; var369 < class215.field2828; var369++) {
                        if (var362) {
                            if (var364.equals(class703.field9786[var369])) {
                                class703.field9786[var369] = var363;
                                class479.field6784[var369] = var364;
                                var363 = null;
                                break;
                            }
                        } else if (var363.equals(class703.field9786[var369])) {
                            if (class533.field7498[var369] != var365) {
                                boolean var370 = true;
                                for (class742 var371 = (class742) class454.field6413.method2301(-31182); var371 != null; var371 = (class742) class454.field6413.method2310(arg0 + 221)) {
                                    if (var371.field10314.equals(var363)) {
                                        if (var365 != 0 && var371.field10313 == 0) {
                                            var371.method3646((byte) -120);
                                            var370 = false;
                                        } else if (var365 == 0 && var371.field10313 != 0) {
                                            var370 = false;
                                            var371.method3646((byte) -105);
                                        }
                                    }
                                }
                                if (var370) {
                                    class454.field6413.method2307(0, new class742(var363, var365));
                                }
                                class533.field7498[var369] = var365;
                            }
                            class479.field6784[var369] = var364;
                            class222.field2895[var369] = var367;
                            class692.field9536[var369] = var366;
                            var363 = null;
                            class596.field8384[var369] = var368;
                            break;
                        }
                    }
                    if (var363 != null && class215.field2828 < 200) {
                        class703.field9786[class215.field2828] = var363;
                        class479.field6784[class215.field2828] = var364;
                        class533.field7498[class215.field2828] = var365;
                        class222.field2895[class215.field2828] = var367;
                        class692.field9536[class215.field2828] = var366;
                        class596.field8384[class215.field2828] = var368;
                        class215.field2828++;
                    }
                }
                class726.field10163 = 2;
                class459.field6465 = class2.field13;
                boolean var352 = false;
                int var353 = class215.field2828;
                while (var353 > 0) {
                    var353--;
                    boolean var354 = true;
                    for (int var355 = 0; var355 < var353; var355++) {
                        if (class533.field7498[var355] != class584.field8222.field10399 && class533.field7498[var355 + 1] == class584.field8222.field10399 || class533.field7498[var355] == 0 && class533.field7498[var355 + 1] != 0) {
                            int var356 = class533.field7498[var355];
                            class533.field7498[var355] = class533.field7498[var355 + 1];
                            class533.field7498[var355 + 1] = var356;
                            String var357 = class222.field2895[var355];
                            class222.field2895[var355] = class222.field2895[var355 + 1];
                            class222.field2895[var355 + 1] = var357;
                            String var358 = class703.field9786[var355];
                            class703.field9786[var355] = class703.field9786[var355 + 1];
                            class703.field9786[var355 + 1] = var358;
                            String var359 = class479.field6784[var355];
                            class479.field6784[var355] = class479.field6784[var355 + 1];
                            class479.field6784[var355 + 1] = var359;
                            int var360 = class692.field9536[var355];
                            class692.field9536[var355] = class692.field9536[var355 + 1];
                            class692.field9536[var355 + 1] = var360;
                            boolean var361 = class596.field8384[var355];
                            class596.field8384[var355] = class596.field8384[var355 + 1];
                            class596.field8384[var355 + 1] = var361;
                            var354 = false;
                        }
                    }
                    if (var354) {
                        break;
                    }
                }
                class294.field4138 = null;
                return true;
            } else if (class6.field59 == class294.field4138) {
                if (class307.method2010(class222.field2897, arg0 - 8600)) {
                    class561.field7879 = (int) ((float) class89.field1072.method3757((byte) -65) * 2.5F);
                } else {
                    class561.field7879 = class89.field1072.method3757((byte) -65) * 30;
                }
                class542.field7578 = class2.field13;
                class294.field4138 = null;
                return true;
            } else if (class43.field530 == class294.field4138) {
                class50.method313(-111);
                class294.field4138 = null;
                return true;
            } else if (class376.field5284 == class294.field4138) {
                int var372 = class89.field1072.method3700(27326);
                int var373 = class89.field1072.method3688(7925);
                int var374 = class89.field1072.method3750((byte) 35);
                class601.field8435[var373] = var372;
                class485.field6811[var373] = var374;
                class377.field5296[var373] = 1;
                int var375 = class111.field1363[var373] - 1;
                for (int var376 = 0; var376 < var375; var376++) {
                    if (var372 >= class124.field1504[var376]) {
                        class377.field5296[var373] = var376 + 2;
                    }
                }
                class489.field6915[class286.method1877(31, class366.field5193++)] = var373;
                class294.field4138 = null;
                return true;
            } else if (class401.field5674 == class294.field4138) {
                class294.field4138 = null;
                return false;
            } else if (class714.field9929 == class294.field4138) {
                int var377 = class89.field1072.method3750((byte) 35);
                if (class89.field1072.method3750((byte) 35) == 0) {
                    class358.field5092[var377] = new class400();
                } else {
                    class89.field1072.field9146--;
                    class358.field5092[var377] = new class400(class89.field1072);
                }
                class294.field4138 = null;
                class185.field2503 = class2.field13;
                return true;
            } else if (class459.field6470 == class294.field4138) {
                int var378 = class89.field1072.method3744(true);
                class544.method3153(false);
                class748.method4158(var378, (byte) 109);
                class294.field4138 = null;
                return true;
            } else if (class453.field6399 == class294.field4138) {
                class350.method2259(class94.field1103, -1);
                class294.field4138 = null;
                return true;
            } else if (class547.field7628 == class294.field4138) {
                boolean var379 = class89.field1072.method3750((byte) 35) == 1;
                String var380 = class89.field1072.method3697(arg0 + 113);
                String var381 = var380;
                if (var379) {
                    var381 = class89.field1072.method3697(-1);
                }
                long var382 = (long) class89.field1072.method3757((byte) -65);
                long var384 = (long) class89.field1072.method3756(false);
                int var386 = class89.field1072.method3750((byte) 35);
                int var387 = class89.field1072.method3757((byte) -65);
                long var388 = (var382 << 32) + var384;
                boolean var390 = false;
                int var391 = 0;
                while (true) {
                    if (var391 >= 100) {
                        if (var386 <= 1 && class101.method730(var381, (byte) -86)) {
                            var390 = true;
                        }
                        break;
                    }
                    if (class481.field6803[var391] == var388) {
                        var390 = true;
                        break;
                    }
                    var391++;
                }
                if (!var390 && class592.field8338 == 0) {
                    class481.field6803[class407.field5774] = var388;
                    class407.field5774 = (class407.field5774 + 1) % 100;
                    String var392 = class5.field50.method3340(var387, false).method2335(class89.field1072, (byte) 78);
                    if (var386 == 2) {
                        class172.method1107(var392, 18, 0, true, null, var387, "<img=1>" + var380, var380, "<img=1>" + var381);
                    } else if (var386 == 1) {
                        class172.method1107(var392, 18, 0, true, null, var387, "<img=0>" + var380, var380, "<img=0>" + var381);
                    } else {
                        class172.method1107(var392, 18, 0, true, null, var387, var380, var380, var381);
                    }
                }
                class294.field4138 = null;
                return true;
            } else if (class294.field4138 == class226.field3044) {
                int var393 = class89.field1072.method3739(arg0 + 114);
                int var394 = class89.field1072.method3729((byte) 78);
                class544.method3153(false);
                class155.method1042(11, var393, var394);
                class294.field4138 = null;
                return true;
            } else if (class294.field4138 == class138.field2003) {
                class350.method2259(class84.field1047, -1);
                class294.field4138 = null;
                return true;
            } else if (class600.field8417 == class294.field4138) {
                int var395 = class89.field1072.method3757((byte) -65);
                int var396 = class89.field1072.method3703(arg0 + 214);
                int var397 = class89.field1072.method3744(true);
                int var398 = class89.field1072.method3757((byte) -65);
                class544.method3153(false);
                class368.method2344(var398, var396, var395, (byte) -81, var397);
                class294.field4138 = null;
                return true;
            } else if (class294.field4138 == class273.field3896) {
                class350.method2259(class54.field623, -1);
                class294.field4138 = null;
                return true;
            } else if (class34.field441 == class294.field4138) {
                class723.method4066(class398.field5617, class202.field2644, class89.field1072, (byte) 0);
                class294.field4138 = null;
                return true;
            } else if (class498.field7148 == class294.field4138) {
                int var399 = class89.field1072.method3710(arg0 - 5953);
                int var400 = class89.field1072.method3703(arg0 + 202);
                int var401 = class89.field1072.method3757((byte) -65);
                class544.method3153(false);
                class47 var402 = (class47) class475.field6744.method1180((byte) 26, (long) var400);
                if (var402 != null) {
                    class353.method2275(false, var402.field550 != var401, var402, -44);
                }
                class427.method2604(var400, (byte) -112, var399, var401, false);
                class294.field4138 = null;
                return true;
            } else if (class67.field812 == class294.field4138) {
                class101.field1201.method1995((byte) 126);
                class690.field9427 += 32;
                class294.field4138 = null;
                return true;
            } else if (class476.field6763 == class294.field4138) {
                boolean var403 = class89.field1072.method3750((byte) 35) == 1;
                class544.method3153(false);
                class294.field4138 = null;
                class112.field1370 = var403;
                return true;
            } else if (class439.field6252 == class294.field4138) {
                int var404 = class89.field1072.method3703(126);
                int var405 = class89.field1072.method3710(-6067);
                class544.method3153(false);
                class98.method718(7, var405, var404);
                class294.field4138 = null;
                return true;
            } else if (class422.field5961 == class294.field4138) {
                if (class457.field6447 != -1) {
                    class118.method821(0, -97, class457.field6447);
                }
                class294.field4138 = null;
                return true;
            } else if (class294.field4138 == class21.field318) {
                class478.method2859(0);
                class294.field4138 = null;
                return true;
            } else if (class294.field4138 == class287.field4065) {
                class454.field6418 = class89.field1072.method3750((byte) 35);
                class294.field4138 = null;
                return true;
            } else if (class508.field7266 == class294.field4138) {
                class544.method3153(false);
                class426.method2600((byte) 48);
                class294.field4138 = null;
                return true;
            } else if (class527.field7432 == class294.field4138) {
                int var406 = class89.field1072.method3703(106);
                class544.method3153(false);
                class47 var407 = (class47) class475.field6744.method1180((byte) 26, (long) var406);
                if (var407 != null) {
                    class353.method2275(false, true, var407, -110);
                }
                if (class486.field6819 != null) {
                    class543.method3149(class486.field6819, 1);
                    class486.field6819 = null;
                }
                class294.field4138 = null;
                return true;
            } else if (class5.field46 == class294.field4138) {
                class357.field5083 = class89.field1072.method3706((byte) 108);
                class294.field4138 = null;
                class542.field7578 = class2.field13;
                return true;
            } else if (class60.field741 == class294.field4138) {
                class350.method2259(class134.field1953, -1);
                class294.field4138 = null;
                return true;
            } else {
                class248.method1583((byte) -52, "T1 - " + (class294.field4138 == null ? -1 : class294.field4138.method719((byte) 126)) + "," + (class496.field7130 == null ? -1 : class496.field7130.method719((byte) 126)) + "," + (class187.field2519 == null ? -1 : class187.field2519.method719((byte) 125)) + " - " + class398.field5617, null);
                class415.method2550(false, -25626);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILha;)Loia;")
    public static final class88 method2706(int arg0, int arg1, class58 arg2) {
        if (arg0 != 2107742921) {
            return null;
        }
        field6427++;
        class101 var3 = (class101) class400.field5666.method1180((byte) 26, (long) arg1);
        if (var3 != null) {
            class70 var4 = var3.field1210.method1933(-2);
            var3.field1198 = true;
            if (var4 != null) {
                return var4.method583(-1, arg2);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(B)V")
    public static final void method2707(byte arg0) {
        field6425++;
        class210.field2759 = null;
        if (arg0 > -83) {
            return;
        }
        class363.field5149 = null;
        class263.field3799 = null;
        class650.field8925 = -1;
        class221.field2883 = -1;
        class407.field5772 = -1;
        class518.field7371 = null;
        class274.field3912 = null;
        class643.field8815 = null;
        class473.field6702 = -1;
        class448.field6358 = null;
        class556.field7796.method2781(-109);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZLee;I)V")
    private final void method2708(boolean arg0, class675 arg1, int arg2) {
        if (arg0) {
            field6430 = null;
        }
        field6420++;
        if (arg2 == 1) {
            this.field6424 = class174.method1114(arg1.method3719(1854307120), 0);
        } else if (arg2 == 2) {
            this.field6422 = 0;
            return;
        }
    }
}
