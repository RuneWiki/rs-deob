import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class241 {

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3474 = new String[] { method1994(method1993("\f0.wi\u0005+")), method1994(method1993("\u0017&)aaD()xj")), method1994(method1993("\u00154fP,")), method1994(method1993("\u00154fS,")) };

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    public static int field3470 = -1;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "[B")
    public byte[] field3468;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "[S")
    public short[] field3469;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "[S")
    public short[] field3471;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "[S")
    public short[] field3473;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IBZIIII)V", line = 3)
    public static final void method1991(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            if ((arg2 ? class451.field6612.field9102.method2498(3) : class451.field6612.field9106.method2498(3)) != 0 && arg4 != 0 && class347.field5048 < 50 && arg3 != -1) {
                class759.field10834[class347.field5048++] = new class441((byte) (arg2 ? 3 : 2), arg3, arg4, arg0, arg6, 0, arg5, null);
            }
            if (arg1 >= -5) {
                method1991(63, (byte) 23, false, 101, 2, -72, 94);
            }
            field3467++;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3474[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)I", line = 30)
    public static final int method1992(byte arg0) {
        try {
            if (class451.field6612.field9138.method4468(arg0 ^ 0xFFFFFFCD) == 0) {
                for (int var1 = 0; var1 < class9.field104; var1++) {
                    if (class327.field4479[var1].method3488(-4705) == 's' || class327.field4479[var1].method3488(arg0 - 4655) == 'S') {
                        class451.field6612.method4681(1, class451.field6612.field9138, (byte) -111);
                        class67.field988 = true;
                        break;
                    }
                }
            }
            field3472++;
            if (class746.field10579 == class201.field2963) {
                Runtime var2 = Runtime.getRuntime();
                int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
                long var4 = class614.method4531(-42);
                if (class397.field5777 == 0L) {
                    class397.field5777 = var4;
                }
                if (var3 > 16384 && (var4 - class397.field5777) < 5000L) {
                    if ((var4 - class363.field5273) > 1000L) {
                        System.gc();
                        class363.field5273 = var4;
                    }
                    return 0;
                }
            }
            if (class746.field10588 == class201.field2963) {
                if (class722.field10274 == null) {
                    class722.field10274 = new class265(class45.field646, class308.field4252, class1.field9, class505.field7399);
                }
                if (!class722.field10274.method2187(23004)) {
                    return 0;
                }
                class581.method4309(0, null, true, (byte) -120);
                class767.field10949 = !class595.method4386((byte) 127);
                class720.field10251 = class261.method2170(false, 14772, class767.field10949 ? 34 : 32, 1);
                class546.field7995 = class261.method2170(false, 14772, 33, 1);
                class151.field1933 = class261.method2170(false, arg0 + 14822, 13, 1);
            }
            if (class746.field10589 == class201.field2963) {
                boolean var6 = class546.field7995.method518((byte) -121);
                int var7 = class301.field4192[33].method3798((byte) 28);
                int var8 = var7 + class301.field4192[class767.field10949 ? 34 : 32].method3798((byte) 28);
                int var9 = var8 + class301.field4192[13].method3798((byte) 28);
                int var10 = var9 + (var6 ? 100 : class546.field7995.method508(29668));
                if (var10 != 400) {
                    return var10 / 4;
                }
                class255.field3665 = class720.field10251.method498(65);
                class323.field4404 = class546.field7995.method498(44);
                class627.method4604(91, class720.field10251);
                int var11 = class451.field6612.field9095.method2360(arg0 + 53);
                class305.field4243 = new class322(class544.field7978, class405.field5883, class546.field7995);
                int[] var12 = class305.field4243.method2547(false, var11);
                if (var12.length == 0) {
                    var12 = class305.field4243.method2547(false, 0);
                }
                class679 var13 = new class679(class720.field10251, class151.field1933);
                if (var12.length > 0) {
                    class230.field3333 = new class515[var12.length];
                    for (int var14 = 0; var14 < class230.field3333.length; var14++) {
                        class230.field3333[var14] = new class82(class305.field4243.method2553(var12[var14], class52.method560(arg0, -11600)), var13);
                    }
                }
            }
            if (class746.field10590 == class201.field2963) {
                class789.method5685(class151.field1933, (byte) 92, class194.method1606(5), class720.field10251);
            }
            if (class746.field10591 == class201.field2963) {
                int var15 = class530.method4012(true);
                int var16 = class98.method964(2);
                if (var15 < var16) {
                    return var15 * 100 / var16;
                }
            }
            if (class746.field10592 == class201.field2963) {
                if (class230.field3333 != null && class230.field3333.length > 0) {
                    if (class230.field3333[0].method807((byte) 120) < 100) {
                        return 0;
                    }
                    if (class230.field3333.length > 1 && class305.field4243.method2549(73) && class230.field3333[1].method807((byte) 122) < 100) {
                        return 0;
                    }
                }
                class30.method331(arg0 + 8550, class236.field3418);
                class55.method588(class236.field3418, 5000);
                class699.method5035(1, 31754);
            }
            if (class746.field10593 == class201.field2963) {
                for (int var17 = 0; var17 < 4; var17++) {
                    class195.field2919[var17] = class623.method4579(class14.field187, 1, class625.field8929);
                }
            }
            if (class746.field10594 == class201.field2963) {
                class524.field7640 = class261.method2170(false, arg0 + 14822, 8, 1);
                class531.field7700 = class261.method2170(false, 14772, 0, 1);
                class45.field645 = class261.method2170(false, 14772, 1, 1);
                class217.field3180 = class261.method2170(false, 14772, 2, 1);
                class767.field10953 = class261.method2170(false, 14772, 3, 1);
                class395.field5736 = class261.method2170(false, 14772, 4, 1);
                class203.field2987 = class261.method2170(true, arg0 ^ 0xFFFFC67A, 5, 1);
                class379.field5540 = class261.method2170(true, arg0 + 14822, 6, 1);
                class378.field5529 = class261.method2170(false, arg0 + 14822, 7, 1);
                class156.field1990 = class261.method2170(false, 14772, 9, 1);
                class489.field7167 = class261.method2170(false, 14772, 10, 1);
                class98.field1330 = class261.method2170(false, 14772, 11, 1);
                class788.field11371 = class261.method2170(false, arg0 + 14822, 12, 1);
                class449.field6575 = class261.method2170(false, 14772, 14, 1);
                class654.field9281 = class261.method2170(false, 14772, 15, 1);
                class343.field4991 = class261.method2170(false, 14772, 16, 1);
                class234.field3375 = class261.method2170(false, 14772, 17, 1);
                class347.field5047 = class261.method2170(false, 14772, 18, 1);
                class691.field9674 = class261.method2170(false, 14772, 19, 1);
                class493.field7240 = class261.method2170(false, 14772, 20, 1);
                class776.field11061 = class261.method2170(false, 14772, 21, 1);
                class430.field6237 = class261.method2170(false, arg0 ^ 0xFFFFC67A, 22, 1);
                class622.field8890 = class261.method2170(true, 14772, 23, 1);
                class130.field1620 = class261.method2170(false, 14772, 24, 1);
                class151.field1929 = class261.method2170(false, 14772, 25, 1);
                class164.field2118 = class261.method2170(true, arg0 + 14822, 26, 1);
                class765.field10939 = class261.method2170(false, 14772, 27, 1);
                class551.field8050 = class261.method2170(true, 14772, 28, 1);
                class353.field5121 = class261.method2170(false, 14772, 29, 1);
                class268.field3796 = class261.method2170(true, 14772, 30, 1);
                class194.field2701 = class261.method2170(true, 14772, 31, 1);
                class135.field1751 = class261.method2170(true, arg0 ^ 0xFFFFC67A, 36, 2);
            }
            if (class746.field10595 == class201.field2963) {
                int var18 = 0;
                for (int var19 = 0; var19 < 37; var19++) {
                    if (class301.field4192[var19] != null) {
                        var18 += class301.field4192[var19].method3798((byte) 28) * class143.field1851[var19] / 100;
                    }
                }
                if (var18 != 100) {
                    if (class72.field1057 < 0) {
                        class72.field1057 = var18;
                    }
                    return (var18 - class72.field1057) * 100 / (100 - class72.field1057);
                }
                class133.method1156((byte) -111, class524.field7640);
                class789.method5685(class151.field1933, (byte) 92, class194.method1606(5), class524.field7640);
            }
            if (class746.field10596 == class201.field2963) {
                if (class694.field9703 == -1) {
                    class694.field9703 = class379.field5540.method502(field3474[1], (byte) -91);
                }
                class204.method1748(arg0 - 75);
                class699.method5035(2, arg0 + 31804);
            }
            if (arg0 != -50) {
                return -53;
            }
            if (class746.field10597 == class201.field2963) {
                class57.method609(class268.field3796, class651.field9249, (byte) 100);
            }
            if (class746.field10598 == class201.field2963) {
                int var20 = class369.method2924(8851);
                if (var20 < 100) {
                    return var20;
                }
                class440.method3422(class551.field8050.method520((byte) 108, 1), (byte) -128);
                class432.method3362(78, class551.field8050.method520((byte) 108, 3));
                class189.field2507 = new class760(class551.field8050);
            }
            if (class746.field10599 == class201.field2963) {
                if (class606.field8688 != -1 && !class378.field5529.method506(-93, class606.field8688, 0)) {
                    return 99;
                }
                class608.field8716 = new class610(class164.field2118, class156.field1990, class524.field7640);
                class202.field2972 = new class57(class544.field7978, class405.field5883, class217.field3180);
                class772.field10996 = new class350(class544.field7978, class405.field5883, class217.field3180, class189.field2507);
                class443.field6547 = new class611(class544.field7978, class405.field5883, class217.field3180, class524.field7640);
                class634.field8994 = new class743(class544.field7978, class405.field5883, class234.field3375);
                class248.field3552 = new class78(class544.field7978, class405.field5883, class217.field3180);
                class129.field1611 = new class655(class544.field7978, class405.field5883, class217.field3180);
                class561.field8158 = new class167(class544.field7978, class405.field5883, class217.field3180, class524.field7640);
                class732.field10450 = new class343(class544.field7978, class405.field5883, class217.field3180, class378.field5529);
                class261.field3709 = new class290(class544.field7978, class405.field5883, class217.field3180);
                class345.field5030 = new class590(class544.field7978, class405.field5883, class217.field3180);
                class101.field1359 = new class354(class544.field7978, class405.field5883, true, class343.field4991, class378.field5529);
                class319.field4356 = new class315(class544.field7978, class405.field5883, class217.field3180, class524.field7640);
                class123.field1553 = new class269(class544.field7978, class405.field5883, class217.field3180, class524.field7640);
                class321.field4379 = new class56(class544.field7978, class405.field5883, true, class347.field5047, class378.field5529);
                class153.field1955 = new class415(class544.field7978, class405.field5883, true, class202.field2972, class691.field9674, class378.field5529);
                class646.field9183 = new class725(class544.field7978, class405.field5883, class217.field3180);
                class10.field132 = new class226(class544.field7978, class405.field5883, class493.field7240, class531.field7700, class45.field645);
                class671.field9451 = new class149(class544.field7978, class405.field5883, class217.field3180);
                class463.field6758 = new class642(class544.field7978, class405.field5883, class217.field3180);
                class11.field153 = new class449(class544.field7978, class405.field5883, class776.field11061, class378.field5529);
                class505.field7396 = new class580(class544.field7978, class405.field5883, class217.field3180);
                class364.field5275 = new class681(class544.field7978, class405.field5883, class217.field3180);
                class44.field636 = new class486(class544.field7978, class405.field5883, class217.field3180);
                class16.field203 = new class724(class544.field7978, class405.field5883, class430.field6237);
                class640.field9099 = new class234(class544.field7978, class405.field5883, class217.field3180);
                class272.field3853 = new class85(class544.field7978, class405.field5883, class217.field3180);
                class135.field1750 = new class520(class544.field7978, class405.field5883, class217.field3180);
                class694.method4948(class378.field5529, class767.field10953, class151.field1933, class524.field7640, (byte) 92);
                class611.method4512(arg0 ^ 0xE89, class353.field5121);
                class371.field5413 = new class418(class405.field5883, class130.field1620, class151.field1929);
                class591.field8501 = new class632(class405.field5883, class130.field1620, class151.field1929, new class282());
                class346.method2773((byte) 125);
                class101.field1359.method2825(class451.field6612.field9089.method5427(3) == 0, -74);
                class734.field10459 = new class490();
                class139.method1214((byte) -88);
                class90.method890(class10.field132, 21900);
                class32.method342(class765.field10939, -1);
                class648.method4723(class378.field5529, arg0 + 176, class608.field8716);
                class606 var21 = new class606(class489.field7167.method529(field3474[0], 1, ""));
                class510.method3894(-24234, var21);
                try {
                    jagmisc.init();
                } catch (Throwable var30) {
                }
                class476.field7025 = class63.method676(-83);
                class799.field11611 = new class27(true, class651.field9249);
            }
            if (class746.field10601 == class201.field2963) {
                int var22 = client.method4962(class524.field7640, 126) + class285.method2303(true, -17827);
                int var23 = class268.method2199(-2982) + class98.method964(2);
                if (var23 > var22) {
                    return var22 * 100 / var23;
                }
            }
            if (class746.field10602 == class201.field2963) {
                class534.method4039(class622.field8890, class248.field3552, class129.field1611, class101.field1359, class319.field4356, class123.field1553, class734.field10459);
            }
            if (class746.field10603 == class201.field2963) {
                class224.field3257 = new String[class364.field5275.field9570];
                class247.field3527 = new int[class44.field636.field7124];
                class290.field4098 = new boolean[class44.field636.field7124];
                for (int var24 = 0; var24 < class44.field636.field7124; var24++) {
                    if (class44.field636.method3745(true, var24).field1564 == 0) {
                        class290.field4098[var24] = true;
                        class383.field5586++;
                    }
                    class247.field3527[var24] = -1;
                }
                class388.method3042(54);
                class203.field2987.method526(true, false, 15013);
                class379.field5540.method526(true, true, 15013);
                class524.field7640.method526(true, true, 15013);
                class151.field1933.method526(true, true, 15013);
                class489.field7167.method526(true, true, 15013);
                class514.field7560 = true;
                class217.field3180.field700 = 2;
                class234.field3375.field700 = 2;
                class343.field4991.field700 = 2;
                class347.field5047.field700 = 2;
                class691.field9674.field700 = 2;
                class493.field7240.field700 = 2;
                class776.field11061.field700 = 2;
            }
            if (class746.field10604 == class201.field2963) {
                if (!class314.method2496(class265.field3741, (byte) -31)) {
                    return 0;
                }
                boolean var25 = true;
                for (int var26 = 0; var26 < class9.field117[class265.field3741].length; var26++) {
                    class782 var27 = class9.field117[class265.field3741][var26];
                    if (var27.field11291 == 5 && var27.field11235 != -1 && !class524.field7640.method506(arg0 - 64, var27.field11235, 0)) {
                        var25 = false;
                    }
                }
                if (!var25) {
                    return 0;
                }
            }
            if (class746.field10605 == class201.field2963) {
                class315.method2505(true, (byte) 62);
            }
            if (class746.field10606 == class201.field2963) {
                class298.field4155.method2233((byte) -2);
                try {
                    class28.field356.join();
                } catch (InterruptedException var29) {
                    return 0;
                }
                class720.field10251 = null;
                class28.field356 = null;
                class298.field4155 = null;
                class305.field4243 = null;
                class230.field3333 = null;
                class546.field7995 = null;
                class408.method3209((byte) -76);
                class690.field9648 = class451.field6612.field9138.method4468(arg0 + 53) == 1;
                class451.field6612.method4681(1, class451.field6612.field9138, (byte) -111);
                if (class690.field9648) {
                    class451.field6612.method4681(0, class451.field6612.field9137, (byte) -111);
                } else if (class451.field6612.field9137.field9194 && class799.field11611.field337 < 512 && class799.field11611.field337 != 0) {
                    class451.field6612.method4681(0, class451.field6612.field9137, (byte) -111);
                }
                class536.method4064(arg0 + 60);
                if (class690.field9648) {
                    class279.method2271(7, false, 0);
                } else {
                    class279.method2271(arg0 + 57, false, class451.field6612.field9137.method4717(3));
                }
                class585.method4331(-1, -1, class451.field6612.field9129.method1595(arg0 ^ 0xFFFFFFCD), true, false);
                class30.method331(arg0 + 8550, class236.field3418);
                class55.method588(class236.field3418, 5000);
                class286.method2325(arg0 ^ 0xFFFFFFCE, class524.field7640, class236.field3418);
                class204.method1747(class147.field1892, (byte) -24);
            }
            return class513.method3917((byte) -67);
        } catch (RuntimeException var31) {
            throw class665.method4799(var31, field3474[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1993(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1994(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 100;
                    break;
                case 1:
                    var10005 = 69;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 17;
                    break;
                default:
                    var10005 = 4;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
