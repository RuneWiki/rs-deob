import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class268 implements class515 {

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "I")
    public int field3388;

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "I")
    public int field3386;

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "Lpd;")
    public class241 field3383;

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "Ltl;")
    public class580 field3385;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
    public int field3381;

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "Lcga;")
    public static class449 field3387 = new class449(1, 2);

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "Z")
    public static volatile boolean field3389 = false;

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "I")
    public static int field3390 = -1;

    @OriginalMember(owner = "client!oaa", name = "l", descriptor = "Ldr;")
    public static class675 field3391 = new class675(94, 10);

    @OriginalMember(owner = "client!oaa", name = "m", descriptor = "[I")
    public static int[] field3392 = new int[8];

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)I", line = 8)
    public static final int method1588(int arg0) {
        if (!class611.field8310.field8713) {
            for (int var1 = 0; var1 < class142.field1725; var1++) {
                if (class184.field2162[var1].method730(13610) == 's' || class184.field2162[var1].method730(13610) == 'S') {
                    class611.field8310.field8713 = true;
                    break;
                }
            }
        }
        field3382++;
        if (class179.field2086 == class113.field1422) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class321.method1854(-56);
            if (class46.field619 == 0L) {
                class46.field619 = var4;
            }
            if (var3 > 16384 && var4 - class46.field619 < 5000L) {
                if (var4 - class322.field4015 > 1000L) {
                    System.gc();
                    class322.field4015 = var4;
                }
                return 0;
            }
        }
        if (class179.field2092 == class113.field1422) {
            if (class186.field2195 == null) {
                class186.field2195 = new class90(class167.field1965, class688.field9477, class525.field6632, class465.field5769);
            }
            if (!class186.field2195.method674(-1)) {
                return 0;
            }
            class431.method2371(0, 101, null);
            class62.field767 = !class475.method2581(80);
            class177.field2074 = class47.method286(true, class62.field767 ? 34 : 32, 1, false, (byte) 53);
            class317.field3967 = class47.method286(true, 33, 1, false, (byte) 75);
            class329.field4095 = class47.method286(true, 13, 1, false, (byte) 126);
        }
        if (class179.field2095 == class113.field1422) {
            class317.field3967.method1645((byte) -121);
            int var6 = class304.field3854[33].method3306(-19291);
            int var7 = var6 + class304.field3854[class62.field767 ? 34 : 32].method3306(-19291);
            int var8 = var7 + class304.field3854[13].method3306(-19291);
            int var9 = var8 + class317.field3967.method1658(21286);
            if (var9 != 400) {
                return var9 / 4;
            }
            class213.field2501 = class177.field2074.method1666((byte) 124);
            class193.field2286 = class317.field3967.method1666((byte) 113);
            class688.method3804(class177.field2074, (byte) -123);
            int var10 = class611.field8310.field8694;
            class680.field9258 = new class488(class341.field4353, class71.field912, class317.field3967);
            int[] var11 = class680.field9258.method2652(-124, var10);
            class705 var12 = new class705(class177.field2074, class329.field4095);
            if (var11.length > 0) {
                class518.field6555 = new class143[var11.length];
                for (int var13 = 0; var13 < class518.field6555.length; var13++) {
                    class518.field6555[var13] = new class443(class680.field9258.method2655(var11[var13], (byte) 30), var12);
                }
            }
        }
        if (class179.field2096 == class113.field1422) {
            class253.method1527((byte) -128, class177.field2074, class329.field4095, class435.method2395((byte) -86));
        }
        if (class179.field2099 == class113.field1422) {
            int var14 = class534.method2879((byte) 32);
            int var15 = class485.method2638(0);
            if (var15 > var14) {
                return var14 * 100 / var15;
            }
        }
        if (class179.field2100 == class113.field1422) {
            if (class518.field6555 != null && class518.field6555.length > 0) {
                if (class518.field6555[0].method905(-15038) < 100) {
                    return 0;
                }
                if (class518.field6555.length > 1 && class680.field9258.method2656(2359) && class518.field6555[1].method905(-15038) < 100) {
                    return 0;
                }
            }
            class588.method3268(-14646, class309.field3898);
            class362.method2104(class309.field3898, 13);
            class78.method609(10503, 1);
        }
        if (class179.field2101 == class113.field1422) {
            for (int var16 = 0; var16 < 4; var16++) {
                class634.field8601[var16] = class613.method3430(5, class85.field1090, class656.field8932);
            }
        }
        if (class179.field2102 == class113.field1422) {
            class136.field1656 = class47.method286(true, 8, 1, false, (byte) 92);
            class38.field567 = class47.method286(true, 0, 1, false, (byte) 79);
            class67.field802 = class47.method286(true, 1, 1, false, (byte) 121);
            class634.field8594 = class47.method286(true, 2, 1, false, (byte) 113);
            class667.field9049 = class47.method286(true, 3, 1, false, (byte) 108);
            class202.field2352 = class47.method286(true, 4, 1, false, (byte) 61);
            class109.field1364 = class47.method286(true, 5, 1, true, (byte) 83);
            class353.field4567 = class47.method286(false, 6, 1, true, (byte) 115);
            class190.field2267 = class47.method286(true, 7, 1, false, (byte) 75);
            class226.field2920 = class47.method286(true, 9, 1, false, (byte) 94);
            class261.field3310 = class47.method286(true, 10, 1, false, (byte) 71);
            class391.field5005 = class47.method286(true, 11, 1, false, (byte) 71);
            class261.field3309 = class47.method286(true, 12, 1, false, (byte) 72);
            class431.field5439 = class47.method286(false, 14, 1, false, (byte) 64);
            class292.field3712 = class47.method286(true, 15, 1, false, (byte) 106);
            class487.field6090 = class47.method286(true, 16, 1, false, (byte) 119);
            class72.field939 = class47.method286(true, 17, 1, false, (byte) 52);
            class19.field203 = class47.method286(true, 18, 1, false, (byte) 111);
            class336.field4147 = class47.method286(true, 19, 1, false, (byte) 60);
            class563.field7035 = class47.method286(true, 20, 1, false, (byte) 101);
            class405.field5224 = class47.method286(true, 21, 1, false, (byte) 62);
            class664.field9025 = class47.method286(true, 22, 1, false, (byte) 107);
            class682.field9284 = class47.method286(true, 23, 1, true, (byte) 111);
            class590.field7924 = class47.method286(true, 24, 1, false, (byte) 124);
            class527.field6658 = class47.method286(true, 25, 1, false, (byte) 100);
            class677.field9227 = class47.method286(true, 26, 1, true, (byte) 96);
            class489.field6112 = class47.method286(true, 27, 1, false, (byte) 82);
            class195.field2300 = class47.method286(true, 28, 1, true, (byte) 111);
            class493.field6150 = class47.method286(true, 29, 1, false, (byte) 98);
            class376.field4837 = class47.method286(true, 30, 1, true, (byte) 115);
            class292.field3706 = class47.method286(true, 31, 1, true, (byte) 114);
        }
        if (class179.field2103 == class113.field1422) {
            int var17 = 0;
            for (int var18 = 0; var18 < 35; var18++) {
                if (class304.field3854[var18] != null) {
                    var17 += class304.field3854[var18].method3306(-19291) * class657.field8941[var18] / 100;
                }
            }
            if (var17 != 100) {
                if (class226.field2918 < 0) {
                    class226.field2918 = var17;
                }
                return (var17 - class226.field2918) * 100 / (100 - class226.field2918);
            }
            class586.method3253((byte) -79, class136.field1656);
            class253.method1527((byte) -121, class136.field1656, class329.field4095, class435.method2395((byte) -124));
        }
        if (class179.field2104 == class113.field1422) {
            class397.method2246((byte) -48);
            class78.method609(10503, 2);
        }
        if (class179.field2105 == class113.field1422) {
            class594.method3286(class386.field4955, class376.field4837, true);
        }
        if (class179.field2106 == class113.field1422) {
            int var19 = class112.method775(99);
            if (var19 < 100) {
                return var19;
            }
            class435.method2396((byte) 120, class195.field2300.method1648(-128, 1));
            class400.method2257((byte) -70, class195.field2300.method1648(122, 3));
        }
        if (class179.field2107 == class113.field1422) {
            if (class343.field4375 != -1 && !class190.field2267.method1667(0, class343.field4375, 75)) {
                return 99;
            }
            class594.field7964 = new class520(class677.field9227, class226.field2920, class136.field1656);
            class46.field617 = new class233(class341.field4353, class71.field912, class634.field8594);
            class510.field6389 = new class541(class341.field4353, class71.field912, class634.field8594);
            class151.field1801 = new class635(class341.field4353, class71.field912, class634.field8594, class136.field1656);
            class156.field1837 = new class640(class341.field4353, class71.field912, class72.field939);
            class55.field707 = new class665(class341.field4353, class71.field912, class634.field8594);
            class329.field4092 = new class10(class341.field4353, class71.field912, class634.field8594);
            class124.field1510 = new class637(class341.field4353, class71.field912, class634.field8594, class190.field2267);
            class131.field1587 = new class95(class341.field4353, class71.field912, class634.field8594);
            class558.field6987 = new class466(class341.field4353, class71.field912, class634.field8594);
            class232.field3017 = new class428(class341.field4353, class71.field912, true, class487.field6090, class190.field2267);
            class530.field6699 = new class17(class341.field4353, class71.field912, class634.field8594, class136.field1656);
            class93.field1189 = new class164(class341.field4353, class71.field912, class634.field8594, class136.field1656);
            class46.field620 = new class681(class341.field4353, class71.field912, true, class19.field203, class190.field2267);
            class504.field6287 = new class273(class341.field4353, class71.field912, true, class46.field617, class336.field4147, class190.field2267);
            class434.field5475 = new class24(class341.field4353, class71.field912, class634.field8594);
            class11.field110 = new class193(class341.field4353, class71.field912, class563.field7035, class38.field567, class67.field802);
            class7.field77 = new class173(class341.field4353, class71.field912, class634.field8594);
            class671.field9178 = new class525(class341.field4353, class71.field912, class634.field8594);
            class339.field4336 = new class372(class341.field4353, class71.field912, class405.field5224, class190.field2267);
            class96.field1247 = new class128(class341.field4353, class71.field912, class634.field8594);
            class466.field5780 = new class118(class341.field4353, class71.field912, class634.field8594);
            class46.field618 = new class97(class341.field4353, class71.field912, class634.field8594);
            class392.field5013 = new class224(class341.field4353, class71.field912, class664.field9025);
            class185.field2186 = new class360(class341.field4353, class71.field912, class634.field8594);
            class52.method301(class136.field1656, 16, class190.field2267, class329.field4095, class667.field9049);
            class673.method3733(class493.field6150, false);
            class206.field2392 = new class636(class71.field912, class590.field7924, class527.field6658);
            class471.field5810 = new class588(class71.field912, class590.field7924, class527.field6658, new class667());
            class339.method1947((byte) -49);
            class232.field3017.method2353(120, !class611.field8310.method2744(class628.field8526, 4));
            class327.field4084 = new class53();
            class305.method1816((byte) 2);
            class587.method3260(class489.field6112, (byte) -38);
            class269.method1603(class190.field2267, (byte) -75, class594.field7964);
            class678 var20 = new class678(class261.field3310.method1649(-1, "", "huffman"));
            class110.method766(-29814, var20);
            try {
                jagmisc.init();
            } catch (Throwable var30) {
            }
            class71.field914 = class566.method3008(0);
        }
        int var21 = 32 / ((-arg0 - 73) / 47);
        if (class179.field2109 == class113.field1422) {
            int var22 = class536.method2888(0, class136.field1656) + class281.method1709(2, true);
            int var23 = class371.method2152(16) + class485.method2638(0);
            if (var22 < var23) {
                return var22 * 100 / var23;
            }
        }
        if (class179.field2110 == class113.field1422) {
            class604.method3333(class682.field9284, class55.field707, class329.field4092, class232.field3017, class530.field6699, class93.field1189, class327.field4084);
        }
        if (class179.field2111 == class113.field1422) {
            class523.field6615 = new String[class466.field5780.field1469];
            class500.field6238 = new int[class46.field618.field1252];
            class656.field8925 = new boolean[class46.field618.field1252];
            for (int var24 = 0; var24 < class46.field618.field1252; var24++) {
                if (class46.field618.method716(19, var24).field6616 == 0) {
                    class656.field8925[var24] = true;
                    class383.field4924++;
                }
                class500.field6238[var24] = -1;
            }
            class446.method2442(99);
            class637.field8625 = class667.field9049.method1651("loginscreen", (byte) 77);
            class97.field1251 = class667.field9049.method1651("lobbyscreen", (byte) 77);
            class109.field1364.method1646(true, (byte) 109, false);
            class353.field4567.method1646(true, (byte) 109, true);
            class136.field1656.method1646(true, (byte) 109, true);
            class329.field4095.method1646(true, (byte) 109, true);
            class261.field3310.method1646(true, (byte) 109, true);
            class667.field9049.method1646(true, (byte) 109, true);
            class634.field8594.field3500 = 2;
            class117.field1452 = true;
            class72.field939.field3500 = 2;
            class487.field6090.field3500 = 2;
            class19.field203.field3500 = 2;
            class336.field4147.field3500 = 2;
            class563.field7035.field3500 = 2;
            class405.field5224.field3500 = 2;
        }
        if (class179.field2112 == class113.field1422) {
            if (!class409.method2299((byte) -40, class637.field8625)) {
                return 0;
            }
            for (int var25 = 0; var25 < class325.field4062[class637.field8625].length; var25++) {
                class337 var26 = class325.field4062[class637.field8625][var25];
                if (var26.field4212 == 5 && var26.field4275 != -1) {
                    var26.method1932(class309.field3898, true);
                }
            }
        }
        if (class179.field2113 == class113.field1422) {
            for (int var27 = 0; var27 < class325.field4062[class637.field8625].length; var27++) {
                class337 var28 = class325.field4062[class637.field8625][var27];
                if (var28.field4212 == 5 && var28.field4275 != -1 && var28.method1932(class309.field3898, true) == null && class436.field5484) {
                    return 0;
                }
            }
        }
        if (class179.field2114 == class113.field1422) {
            class164.method1008(true, -29249);
        }
        if (class179.field2115 == class113.field1422) {
            class185.field2182.method2427(-15766);
            try {
                class455.field5683.join();
            } catch (InterruptedException var29) {
                return 0;
            }
            class277.field3528 = class611.field8310.field8713;
            class611.field8310.field8713 = true;
            class611.field8310.method2749(class386.field4955, -127);
            if (class277.field3528) {
                class364.method2114(0, 108);
            } else {
                class364.method2114(class611.field8310.field8688, 104);
            }
            class645.method3607(false, class611.field8310.field8697, -1, -1, (byte) -127);
            class588.method3268(-14646, class309.field3898);
            class362.method2104(class309.field3898, 123);
            class671.method3723(class136.field1656, (byte) 126, class309.field3898);
            class374.method2165(-30020, class94.field1201);
            class317.field3967 = null;
            class177.field2074 = null;
            class518.field6555 = null;
            class680.field9258 = null;
        }
        return class418.method2328(12251);
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)V", line = 449)
    public static void method1589(int arg0) {
        field3391 = null;
        int var1 = -90 % ((arg0 - 55) / 48);
        field3392 = null;
        field3387 = null;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZII)I", line = 460)
    public static final int method1590(int arg0, boolean arg1, int arg2, int arg3) {
        field3380++;
        int var4 = arg0 / arg2;
        int var5 = arg2 - 1 & arg0;
        int var6 = arg3 / arg2;
        int var7 = arg2 - 1 & arg3;
        if (!arg1) {
            field3390 = 52;
        }
        int var8 = class14.method75(-8216, var4, var6);
        int var9 = class14.method75(-8216, var4 + 1, var6);
        int var10 = class14.method75(-8216, var4, var6 + 1);
        int var11 = class14.method75(-8216, var4 + 1, var6 + 1);
        int var12 = class444.method2437(arg2, var8, (byte) 61, var9, var5);
        int var13 = class444.method2437(arg2, var10, (byte) 99, var11, var5);
        return class444.method2437(arg2, var12, (byte) 68, var13, var7);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)Ljd;", line = 498)
    public class216 method20(byte arg0) {
        int var2 = -92 % ((-arg0 - 27) / 42);
        field3384++;
        return class45.field613;
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(ILtl;Lpd;II)V", line = 515)
    public class268(int arg0, class580 arg1, class241 arg2, int arg3, int arg4) {
        this.field3388 = arg0;
        this.field3386 = arg3;
        this.field3383 = arg2;
        this.field3385 = arg1;
        this.field3381 = arg4;
    }
}
