import jagex3.jagmisc.jagmisc;
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class564 extends class518 {

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
    public static int field8022;

    @OriginalMember(owner = "client!pu", name = "u", descriptor = "I")
    public static int field8023;

    @OriginalMember(owner = "client!pu", name = "v", descriptor = "I")
    public static int field8024;

    @OriginalMember(owner = "client!pu", name = "w", descriptor = "I")
    public static int field8025;

    @OriginalMember(owner = "client!pu", name = "x", descriptor = "I")
    public static int field8026;

    @OriginalMember(owner = "client!pu", name = "y", descriptor = "Lvd;")
    public static class39 field8027;

    @OriginalMember(owner = "client!pu", name = "z", descriptor = "[I")
    public static int[] field8028;

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class564(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V")
    public static void method3287(byte arg0) {
        field8028 = null;
        field8027 = null;
        if (arg0 != 121) {
            field8025 = 0;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public final void method1164(OggPacket arg0, int arg1) {
        field8022++;
        if (arg1 != 0) {
            field8028 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
    public final void method1165(int arg0) {
        field8024++;
        int var2 = -22 % ((63 - arg0) / 49);
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)I")
    public static final int method3288(int arg0) {
        field8023++;
        if (class63.field916.field10186.method725(17503) == 0) {
            for (int var1 = 0; var1 < class730.field10232; var1++) {
                if (class516.field7374[var1].method712((byte) -92) == 's' || class516.field7374[var1].method712((byte) -92) == 'S') {
                    class63.field916.method4111(arg0 ^ 0x2A, 1, class63.field916.field10186);
                    class163.field2583 = true;
                    break;
                }
            }
        }
        if (class647.field9127 == class59.field809) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class524.method3075(arg0 - 82);
            if (class166.field2630 == 0L) {
                class166.field2630 = var4;
            }
            if (var3 > 16384 && (var4 - class166.field2630) < 5000L) {
                if (var4 - class112.field1556 > 1000L) {
                    System.gc();
                    class112.field1556 = var4;
                }
                return 0;
            }
        }
        if (class647.field9127 == class59.field815) {
            if (class176.field2726 == null) {
                class176.field2726 = new class419(class115.field1594, class376.field5694, class277.field3936, class296.field4211);
            }
            if (!class176.field2726.method2645(true)) {
                return 0;
            }
            class706.method4015((byte) 115, 0, true, null);
            class410.field6174 = !class459.method2801(-120);
            class453.field6687 = class615.method3557(false, 1, arg0 ^ 0xF4224, class410.field6174 ? 34 : 32);
            class494.field7034 = class615.method3557(false, 1, arg0 ^ 0xF4224, 33);
            class338.field4915 = class615.method3557(false, 1, 1000000, 13);
        }
        if (class647.field9127 == class59.field818) {
            boolean var6 = class494.field7034.method220(-15563);
            int var7 = class573.field8096[33].method4210((byte) -68);
            int var8 = var7 + class573.field8096[class410.field6174 ? 34 : 32].method4210((byte) -59);
            int var9 = var8 + class573.field8096[13].method4210((byte) -87);
            int var10 = var9 + (var6 ? 100 : class494.field7034.method216((byte) -113));
            if (var10 != 400) {
                return var10 / 4;
            }
            class547.field7816 = class453.field6687.method202((byte) -86);
            class10.field148 = class494.field7034.method202((byte) -86);
            class165.method1208(class453.field6687, arg0 ^ 0x4B47);
            int var11 = class63.field916.field10171.method1226(17503);
            class672.field9370 = new class500(class199.field2993, class650.field9160, class494.field7034);
            int[] var12 = class672.field9370.method2972(var11, 13867);
            if (var12.length == 0) {
                var12 = class672.field9370.method2972(0, arg0 ^ 0x364F);
            }
            class43 var13 = new class43(class453.field6687, class338.field4915);
            if (var12.length > 0) {
                class612.field8653 = new class722[var12.length];
                for (int var14 = 0; var14 < class612.field8653.length; var14++) {
                    class612.field8653[var14] = new class325(class672.field9370.method2976(var12[var14], (byte) 57), var13);
                }
            }
        }
        if (class647.field9127 == class59.field820) {
            class640.method3675(class453.field6687, 108, class639.method3673((byte) -105), class338.field4915);
        }
        if (class647.field9127 == class59.field821) {
            int var15 = class509.method3017(arg0 + 668);
            int var16 = class362.method2252(1);
            if (var16 > var15) {
                return var15 * 100 / var16;
            }
        }
        if (class647.field9127 == class59.field822) {
            if (class612.field8653 != null && class612.field8653.length > 0) {
                if (class612.field8653[0].method2064(82) < 100) {
                    return 0;
                }
                if (class612.field8653.length > 1 && class672.field9370.method2971((byte) 114) && class612.field8653[1].method2064(arg0 - 52) < 100) {
                    return 0;
                }
            }
            class148.method1084(class736.field10316, arg0 - 100);
            class442.method2742((byte) -109, class736.field10316);
            class49.method363(1, 100);
        }
        if (class647.field9127 == class59.field823) {
            for (int var17 = 0; var17 < 4; var17++) {
                class326.field4655[var17] = class244.method1628(false, class255.field3656, class194.field2946);
            }
        }
        if (class647.field9127 == class59.field824) {
            class640.field8990 = class615.method3557(false, 1, 1000000, 8);
            class603.field8537 = class615.method3557(false, 1, arg0 + 999900, 0);
            class373.field5544 = class615.method3557(false, 1, 1000000, 1);
            class734.field10278 = class615.method3557(false, 1, 1000000, 2);
            class326.field4658 = class615.method3557(false, 1, 1000000, 3);
            class756.field10584 = class615.method3557(false, 1, arg0 ^ 0xF4224, 4);
            class111.field1553 = class615.method3557(true, 1, 1000000, 5);
            class299.field4244 = class615.method3557(true, 1, 1000000, 6);
            class169.field2651 = class615.method3557(false, 1, 1000000, 7);
            class457.field6748 = class615.method3557(false, 1, arg0 + 999900, 9);
            class201.field3014 = class615.method3557(false, 1, arg0 + 999900, 10);
            class79.field1115 = class615.method3557(false, 1, arg0 ^ 0xF4224, 11);
            class248.field3606 = class615.method3557(false, 1, 1000000, 12);
            class555.field7932 = class615.method3557(false, 1, arg0 ^ 0xF4224, 14);
            class69.field977 = class615.method3557(false, 1, 1000000, 15);
            class588.field8343 = class615.method3557(false, 1, 1000000, 16);
            class421.field6286 = class615.method3557(false, 1, 1000000, 17);
            class411.field6187 = class615.method3557(false, 1, 1000000, 18);
            class259.field3698 = class615.method3557(false, 1, arg0 + 999900, 19);
            class134.field1791 = class615.method3557(false, 1, 1000000, 20);
            class565.field8034 = class615.method3557(false, 1, arg0 ^ 0xF4224, 21);
            class574.field8114 = class615.method3557(false, 1, arg0 ^ 0xF4224, 22);
            field8027 = class615.method3557(true, 1, arg0 ^ 0xF4224, 23);
            class87.field1245 = class615.method3557(false, 1, arg0 ^ 0xF4224, 24);
            class636.field8936 = class615.method3557(false, 1, 1000000, 25);
            class538.field7687 = class615.method3557(true, 1, arg0 + 999900, 26);
            class596.field8446 = class615.method3557(false, 1, 1000000, 27);
            class597.field8455 = class615.method3557(true, 1, arg0 ^ 0xF4224, 28);
            class265.field3796 = class615.method3557(false, 1, 1000000, 29);
            class135.field1809 = class615.method3557(true, 1, 1000000, 30);
            class492.field7019 = class615.method3557(true, 1, 1000000, 31);
            class661.field9246 = class615.method3557(true, 2, 1000000, 36);
        }
        if (arg0 != 100) {
            return -5;
        }
        if (class647.field9127 == class59.field825) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; var19++) {
                if (class573.field8096[var19] != null) {
                    var18 += class573.field8096[var19].method4210((byte) -125) * class408.field6162[var19] / 100;
                }
            }
            if (var18 != 100) {
                if (class130.field1748 < 0) {
                    class130.field1748 = var18;
                }
                return (var18 - class130.field1748) * 100 / (100 - class130.field1748);
            }
            class257.method1680(class640.field8990, -126);
            class640.method3675(class640.field8990, 96, class639.method3673((byte) -63), class338.field4915);
        }
        if (class647.field9127 == class59.field826) {
            if (class444.field6604 == -1) {
                class444.field6604 = class299.field4244.method217("scape main", (byte) -93);
            }
            class476.method2867(arg0 + 4112);
            class49.method363(2, 95);
        }
        if (class647.field9127 == class59.field827) {
            class712.method4063(class135.field1809, (byte) -52, class179.field2759);
        }
        if (class647.field9127 == class59.field828) {
            int var20 = class707.method4018(true);
            if (var20 < 100) {
                return var20;
            }
            class64.method569((byte) 71, class597.field8455.method226(arg0 - 55, 1));
            class753.method4196((byte) -19, class597.field8455.method226(64, 3));
        }
        if (class647.field9127 == class59.field829) {
            if (class649.field9150 != -1 && !class169.field2651.method214(0, class649.field9150, 0)) {
                return 99;
            }
            class409.field6166 = new class732(class538.field7687, class457.field6748, class640.field8990);
            class153.field2479 = new class251(class199.field2993, class650.field9160, class734.field10278);
            class95.field1354 = new class466(class199.field2993, class650.field9160, class734.field10278);
            class123.field1667 = new class236(class199.field2993, class650.field9160, class734.field10278, class640.field8990);
            class448.field6624 = new class94(class199.field2993, class650.field9160, class421.field6286);
            class276.field3915 = new class530(class199.field2993, class650.field9160, class734.field10278);
            class257.field3690 = new class34(class199.field2993, class650.field9160, class734.field10278);
            class280.field3967 = new class74(class199.field2993, class650.field9160, class734.field10278, class640.field8990);
            class582.field8291 = new class11(class199.field2993, class650.field9160, class734.field10278, class169.field2651);
            class603.field8536 = new class27(class199.field2993, class650.field9160, class734.field10278);
            class196.field2977 = new class85(class199.field2993, class650.field9160, class734.field10278);
            class239.field3470 = new class56(class199.field2993, class650.field9160, true, class588.field8343, class169.field2651);
            class637.field8949 = new class118(class199.field2993, class650.field9160, class734.field10278, class640.field8990);
            class581.field8249 = new class730(class199.field2993, class650.field9160, class734.field10278, class640.field8990);
            class74.field1032 = new class574(class199.field2993, class650.field9160, true, class411.field6187, class169.field2651);
            class336.field4876 = new class329(class199.field2993, class650.field9160, true, class153.field2479, class259.field3698, class169.field2651);
            class28.field273 = new class376(class199.field2993, class650.field9160, class734.field10278);
            class742.field10404 = new class427(class199.field2993, class650.field9160, class134.field1791, class603.field8537, class373.field5544);
            class684.field9464 = new class275(class199.field2993, class650.field9160, class734.field10278);
            class288.field4108 = new class505(class199.field2993, class650.field9160, class734.field10278);
            class499.field7100 = new class33(class199.field2993, class650.field9160, class565.field8034, class169.field2651);
            class209.field3066 = new class598(class199.field2993, class650.field9160, class734.field10278);
            class250.field3616 = new class752(class199.field2993, class650.field9160, class734.field10278);
            class128.field1729 = new class476(class199.field2993, class650.field9160, class734.field10278);
            class665.field9346 = new class508(class199.field2993, class650.field9160, class574.field8114);
            class538.field7691 = new class190(class199.field2993, class650.field9160, class734.field10278);
            class467.method2835(class338.field4915, arg0 ^ 0x3A, class326.field4658, class169.field2651, class640.field8990);
            class385.method2478(class265.field3796, 2048);
            class33.field334 = new class124(class650.field9160, class87.field1245, class636.field8936);
            class31.field325 = new class269(class650.field9160, class87.field1245, class636.field8936, new class163());
            class636.method3659((byte) -31);
            class239.field3470.method394((byte) -54, class63.field916.field10204.method368(17503) == 0);
            class83.field1160 = new class411();
            class438.method2708(false);
            class763.method4234(class596.field8446, (byte) -54);
            class255.method1673(class169.field2651, class409.field6166, 0);
            class692 var21 = new class692(class201.field3014.method233(-112, "huffman", ""));
            class359.method2242(var21, arg0 + 5060);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class184.field2813 = class676.method3887(arg0 - 1101);
            class259.field3702 = new class528(true, class179.field2759);
        }
        if (class647.field9127 == class59.field831) {
            int var22 = class336.method2140((byte) -88, class640.field8990) + class361.method2251(true, 2);
            int var23 = class469.method2842(true) + class362.method2252(1);
            if (var22 < var23) {
                return var22 * 100 / var23;
            }
        }
        if (class647.field9127 == class59.field832) {
            class84.method673(field8027, class276.field3915, class257.field3690, class239.field3470, class637.field8949, class581.field8249, class83.field1160);
        }
        if (class647.field9127 == class59.field833) {
            class461.field6799 = new int[class128.field1729.field6913];
            class521.field7460 = new boolean[class128.field1729.field6913];
            class413.field6210 = new String[class250.field3616.field10512];
            for (int var24 = 0; var24 < class128.field1729.field6913; var24++) {
                if (class128.field1729.method2868(var24, (byte) -108).field8503 == 0) {
                    class521.field7460[var24] = true;
                    class348.field5083++;
                }
                class461.field6799[var24] = -1;
            }
            class164.method1204(0);
            class574.field8116 = class326.field4658.method217("loginscreen", (byte) -93);
            class382.field5763 = class326.field4658.method217("lobbyscreen", (byte) -93);
            class111.field1553.method200((byte) -79, true, false);
            class299.field4244.method200((byte) -79, true, true);
            class640.field8990.method200((byte) -79, true, true);
            class338.field4915.method200((byte) -79, true, true);
            class201.field3014.method200((byte) -79, true, true);
            class326.field4658.method200((byte) -79, true, true);
            class734.field10278.field400 = 2;
            class54.field759 = true;
            class421.field6286.field400 = 2;
            class588.field8343.field400 = 2;
            class411.field6187.field400 = 2;
            class259.field3698.field400 = 2;
            class134.field1791.field400 = 2;
            class565.field8034.field400 = 2;
        }
        if (class647.field9127 == class59.field834) {
            if (!class245.method1632(816183856, class574.field8116)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; var26 < class86.field1229[class574.field8116].length; var26++) {
                class46 var27 = class86.field1229[class574.field8116][var26];
                if (var27.field577 == 5 && var27.field633 != -1 && !class640.field8990.method214(0, var27.field633, 0)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (class647.field9127 == class59.field835) {
            class370.method2273((byte) 116, true);
        }
        if (class647.field9127 == class59.field836) {
            class311.field4401.method3375(6814);
            try {
                class597.field8459.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class453.field6687 = null;
            class494.field7034 = null;
            class597.field8459 = null;
            class311.field4401 = null;
            class672.field9370 = null;
            class612.field8653 = null;
            class150.method1120(21484);
            class691.field9556 = class63.field916.field10186.method725(17503) == 1;
            class63.field916.method4111(98, 1, class63.field916.field10186);
            if (class691.field9556) {
                class63.field916.method4111(118, 0, class63.field916.field10177);
            } else if (class63.field916.field10177.field9377 && class259.field3702.field7533 < 512 && class259.field3702.field7533 != 0) {
                class63.field916.method4111(79, 0, class63.field916.field10177);
            }
            class585.method3384(-127);
            if (class691.field9556) {
                class134.method950(0, 0, false);
            } else {
                class134.method950(0, class63.field916.field10177.method3848(17503), false);
            }
            class417.method2633(false, -1, class63.field916.field10172.method953(17503), -1, 4);
            class148.method1084(class736.field10316, 0);
            class442.method2742((byte) -61, class736.field10316);
            class514.method3039(class736.field10316, true, class640.field8990);
            class632.method3646((byte) 121, class391.field5894);
        }
        return class235.method1561(true);
    }
}
