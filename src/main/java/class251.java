import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class251 {

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "[I")
    public static int[] field3592 = new int[2048];

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)I", line = 3)
    public static final int method1707(int arg0) {
        field3591++;
        if (class471.field6781.field6707.method2484(27669) == 0) {
            for (int var1 = 0; var1 < class64.field1165; var1++) {
                if (class226.field3232[var1].method110(29932) == 's' || class226.field3232[var1].method110(29932) == 'S') {
                    class471.field6781.method2826(1, (byte) 108, class471.field6781.field6707);
                    break;
                }
            }
        }
        if (class392.field5475 == class372.field5224) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class742.method4128(1);
            if (class737.field10373 == 0L) {
                class737.field10373 = var4;
            }
            if (var3 > 16384 && (var4 - class737.field10373) < 5000L) {
                if (var4 - class2.field19 > 1000L) {
                    System.gc();
                    class2.field19 = var4;
                }
                return 0;
            }
        }
        if (class392.field5478 == class372.field5224) {
            if (class404.field5632 == null) {
                class404.field5632 = new class142(class612.field8856, class262.field3829, class232.field3301, class579.field8178);
            }
            if (!class404.field5632.method1119((byte) 120)) {
                return 0;
            }
            class150.method1156(null, true, 0, 268435456);
            class684.field9654 = !class63.method680((byte) -109);
            class559.field7950 = class30.method204(false, class684.field9654 ? 34 : 32, true, 1);
            class524.field7460 = class30.method204(false, 33, true, 1);
            class722.field10091 = class30.method204(false, 13, true, 1);
        }
        if (class392.field5481 == class372.field5224) {
            boolean var6 = class524.field7460.method1461(-22627);
            int var7 = class250.field3530[33].method1384((byte) -17);
            int var8 = var7 + class250.field3530[class684.field9654 ? 34 : 32].method1384((byte) -17);
            int var9 = var8 + class250.field3530[13].method1384((byte) -17);
            int var10 = var9 + (var6 ? 100 : class524.field7460.method1462(100));
            if (var10 != 400) {
                return var10 / 4;
            }
            class551.field7728 = class559.field7950.method1455(true);
            class131.field1954 = class524.field7460.method1455(true);
            class522.method3096(class559.field7950, (byte) -70);
            int var11 = class471.field6781.field6706.method2801(27669);
            class694.field9755 = new class345(class649.field9170, class744.field10426, class524.field7460);
            int[] var12 = class694.field9755.method2180(var11, (byte) -91);
            if (var12.length == 0) {
                var12 = class694.field9755.method2180(0, (byte) -76);
            }
            class687 var13 = new class687(class559.field7950, class722.field10091);
            if (var12.length > 0) {
                class688.field9704 = new class549[var12.length];
                for (int var14 = 0; var14 < class688.field9704.length; var14++) {
                    class688.field9704[var14] = new class402(class694.field9755.method2179(var12[var14], 24900), var13);
                }
            }
        }
        if (class392.field5483 == class372.field5224) {
            class417.method2544(class722.field10091, class559.field7950, class657.method3700((byte) 54), 0);
        }
        if (class392.field5484 == class372.field5224) {
            int var15 = class687.method3865(-98);
            int var16 = class726.method4040(-8869);
            if (var15 < var16) {
                return var15 * 100 / var16;
            }
        }
        if (class392.field5485 == class372.field5224) {
            if (class688.field9704 != null && class688.field9704.length > 0) {
                if (class688.field9704[0].method1635((byte) 30) < 100) {
                    return 0;
                }
                if (class688.field9704.length > 1 && class694.field9755.method2178((byte) -124) && class688.field9704[1].method1635((byte) 30) < 100) {
                    return 0;
                }
            }
            class570.method3329(class359.field5046, (byte) 97);
            class335.method2141(class359.field5046, 88);
            class19.method122(arg0 ^ 0x2D62, 1);
        }
        if (class392.field5486 == class372.field5224) {
            for (int var17 = 0; var17 < 4; var17++) {
                class630.field9041[var17] = class46.method421((byte) -43, class174.field2540, class716.field9999);
            }
        }
        if (class392.field5487 == class372.field5224) {
            class501.field7161 = class30.method204(false, 8, true, 1);
            class4.field66 = class30.method204(false, 0, true, 1);
            class242.field3396 = class30.method204(false, 1, true, 1);
            class14.field167 = class30.method204(false, 2, true, 1);
            class513.field7322 = class30.method204(false, 3, true, 1);
            class662.field9317 = class30.method204(false, 4, true, 1);
            class391.field5460 = class30.method204(true, 5, true, 1);
            class351.field4955 = class30.method204(true, 6, true, 1);
            class423.field5926 = class30.method204(false, 7, true, 1);
            class104.field1741 = class30.method204(false, 9, true, 1);
            class427.field5962 = class30.method204(false, 10, true, 1);
            class586.field8253 = class30.method204(false, 11, true, 1);
            class515.field7336 = class30.method204(false, 12, true, 1);
            class710.field9930 = class30.method204(false, 14, true, 1);
            class528.field7505 = class30.method204(false, 15, true, 1);
            class231.field3293 = class30.method204(false, 16, true, 1);
            class372.field5214 = class30.method204(false, 17, true, 1);
            class744.field10424 = class30.method204(false, 18, true, 1);
            class136.field2119 = class30.method204(false, 19, true, 1);
            class497.field7079 = class30.method204(false, 20, true, 1);
            class46.field673 = class30.method204(false, 21, true, 1);
            class292.field4105 = class30.method204(false, 22, true, 1);
            class588.field8272 = class30.method204(true, 23, true, 1);
            class491.field7005 = class30.method204(false, 24, true, 1);
            class86.field1559 = class30.method204(false, 25, true, 1);
            class444.field6177 = class30.method204(true, 26, true, 1);
            class711.field9935 = class30.method204(false, 27, true, 1);
            class128.field1932 = class30.method204(true, 28, true, 1);
            class411.field5688 = class30.method204(false, 29, true, 1);
            class81.field1511 = class30.method204(true, 30, true, 1);
            class345.field4863 = class30.method204(true, 31, true, 1);
            class546.field7698 = class30.method204(true, 36, true, 2);
        }
        if (class392.field5488 == class372.field5224) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; var19++) {
                if (class250.field3530[var19] != null) {
                    var18 += class250.field3530[var19].method1384((byte) -17) * class594.field8479[var19] / 100;
                }
            }
            if (var18 != 100) {
                if (class184.field2625 < 0) {
                    class184.field2625 = var18;
                }
                return (var18 - class184.field2625) * 100 / (100 - class184.field2625);
            }
            class71.method730(class501.field7161, -1);
            class417.method2544(class722.field10091, class501.field7161, class657.method3700((byte) 76), 0);
        }
        if (class392.field5489 == class372.field5224) {
            if (class11.field148 == -1) {
                class11.field148 = class351.field4955.method1482(-1, "scape main");
            }
            class495.method2980(-123);
            class19.method122(1, 2);
        }
        if (class392.field5490 == class372.field5224) {
            class462.method2810(class341.field4796, class81.field1511, (byte) -122);
        }
        if (class392.field5491 == class372.field5224) {
            int var20 = class462.method2809(0);
            if (var20 < 100) {
                return var20;
            }
            class612.method3527((byte) -83, class128.field1932.method1478((byte) -72, 1));
            class74.method746(class128.field1932.method1478((byte) -72, 3), (byte) -38);
        }
        if (class392.field5492 == class372.field5224) {
            if (class440.field6145 != -1 && !class423.field5926.method1469((byte) -99, class440.field6145, 0)) {
                return 99;
            }
            class679.field9571 = new class587(class444.field6177, class104.field1741, class501.field7161);
            class285.field4042 = new class497(class649.field9170, class744.field10426, class14.field167);
            class675.field9475 = new class169(class649.field9170, class744.field10426, class14.field167);
            class254.field3692 = new class103(class649.field9170, class744.field10426, class14.field167, class501.field7161);
            class723.field10100 = new class388(class649.field9170, class744.field10426, class372.field5214);
            class332.field4686 = new class62(class649.field9170, class744.field10426, class14.field167);
            class174.field2537 = new class382(class649.field9170, class744.field10426, class14.field167);
            class284.field4039 = new class420(class649.field9170, class744.field10426, class14.field167, class423.field5926);
            class434.field6077 = new class136(class649.field9170, class744.field10426, class14.field167);
            class341.field4798 = new class119(class649.field9170, class744.field10426, class14.field167);
            class66.field1181 = new class22(class649.field9170, class744.field10426, true, class231.field3293, class423.field5926);
            class399.field5581 = new class440(class649.field9170, class744.field10426, class14.field167, class501.field7161);
            class93.field1631 = new class81(class649.field9170, class744.field10426, class14.field167, class501.field7161);
            class134.field2102 = new class508(class649.field9170, class744.field10426, true, class744.field10424, class423.field5926);
            class558.field7942 = new class70(class649.field9170, class744.field10426, true, class285.field4042, class136.field2119, class423.field5926);
            class252.field3594 = new class121(class649.field9170, class744.field10426, class14.field167);
            class698.field9806 = new class93(class649.field9170, class744.field10426, class497.field7079, class4.field66, class242.field3396);
            class206.field2944 = new class491(class649.field9170, class744.field10426, class14.field167);
            class569.field8108 = new class521(class649.field9170, class744.field10426, class14.field167);
            class638.field9104 = new class668(class649.field9170, class744.field10426, class46.field673, class423.field5926);
            class582.field8227 = new class240(class649.field9170, class744.field10426, class14.field167);
            class72.field1280 = new class590(class649.field9170, class744.field10426, class14.field167);
            class261.field3817 = new class545(class649.field9170, class744.field10426, class14.field167);
            class679.field9567 = new class32(class649.field9170, class744.field10426, class292.field4105);
            class99.field1677 = new class377(class649.field9170, class744.field10426, class14.field167);
            class739.method4117(class423.field5926, (byte) 123, class513.field7322, class722.field10091, class501.field7161);
            class256.method1742((byte) -63, class411.field5688);
            class87.field1581 = new class509(class744.field10426, class491.field7005, class86.field1559);
            class643.field9141 = new class650(class744.field10426, class491.field7005, class86.field1559, new class526());
            class244.method1628(arg0 ^ 0x2D63);
            class66.field1181.method132(-48, ~class471.field6781.field6704.method2015(27669) == -1);
            class742.field10408 = new class539();
            class685.method3857(true);
            class512.method3060(class711.field9935, false);
            class678.method3836(class423.field5926, class679.field9571, true);
            class188 var21 = new class188(class427.field5962.method1475("", (byte) 116, "huffman"));
            class709.method3965(var21, (byte) -113);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class184.field2629 = class458.method2792(-92);
            class674.field9469 = new class4(true, class341.field4796);
        }
        if (class392.field5494 == class372.field5224) {
            int var22 = class135.method1068(0, class501.field7161) + class219.method1520(true, false);
            int var23 = class360.method2246((byte) 47) + class726.method4040(-8869);
            if (var23 > var22) {
                return var22 * 100 / var23;
            }
        }
        if (class392.field5495 == class372.field5224) {
            class542.method3204(class588.field8272, class332.field4686, class174.field2537, class66.field1181, class399.field5581, class93.field1631, class742.field10408);
        }
        if (arg0 != 11619) {
            method1709(null, -83, 90);
        }
        if (class392.field5496 == class372.field5224) {
            class41.field598 = new int[class261.field3817.field7689];
            class526.field7477 = new String[class72.field1280.field8282];
            class104.field1738 = new boolean[class261.field3817.field7689];
            for (int var24 = 0; var24 < class261.field3817.field7689; var24++) {
                if (class261.field3817.method3222(var24, arg0 ^ 0x2D70).field1767 == 0) {
                    class104.field1738[var24] = true;
                    class544.field7679++;
                }
                class41.field598[var24] = -1;
            }
            class426.method2591(1);
            class104.field1739 = class513.field7322.method1482(-1, "loginscreen");
            class197.field2834 = class513.field7322.method1482(-1, "lobbyscreen");
            class391.field5460.method1450(true, false, true);
            class351.field4955.method1450(true, true, true);
            class501.field7161.method1450(true, true, true);
            class722.field10091.method1450(true, true, true);
            class427.field5962.method1450(true, true, true);
            class513.field7322.method1450(true, true, true);
            class14.field167.field3022 = 2;
            class652.field9188 = true;
            class372.field5214.field3022 = 2;
            class231.field3293.field3022 = 2;
            class744.field10424.field3022 = 2;
            class136.field2119.field3022 = 2;
            class497.field7079.field3022 = 2;
            class46.field673.field3022 = 2;
        }
        if (class392.field5497 == class372.field5224) {
            if (!class4.method19(90, class104.field1739)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; var26 < class117.field1849[class104.field1739].length; var26++) {
                class50 var27 = class117.field1849[class104.field1739][var26];
                if (var27.field765 == 5 && var27.field823 != -1 && !class501.field7161.method1469((byte) -124, var27.field823, 0)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (class392.field5498 == class372.field5224) {
            class199.method1395(true, true);
        }
        if (class392.field5499 == class372.field5224) {
            class750.field10477.method2266(958);
            try {
                class174.field2538.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class688.field9704 = null;
            class174.field2538 = null;
            class694.field9755 = null;
            class524.field7460 = null;
            class559.field7950 = null;
            class750.field10477 = null;
            class697.method3917((byte) -123);
            class85.field1546 = class471.field6781.field6707.method2484(27669) == 1;
            class471.field6781.method2826(1, (byte) 77, class471.field6781.field6707);
            class129.method994((byte) 109);
            if (class85.field1546) {
                class54.method490((byte) -81, false, 0);
            } else {
                class54.method490((byte) 110, false, class471.field6781.field6695.method1843(arg0 ^ 0x4176));
            }
            class492.method2959(class471.field6781.field6700.method2157(27669), false, -1, -1, (byte) 116);
            class570.method3329(class359.field5046, (byte) 110);
            class335.method2141(class359.field5046, arg0 - 11531);
            class269.method1795(class501.field7161, class359.field5046, arg0 ^ 0x6365);
            class543.method3212(class237.field3358, (byte) 73);
        }
        return class487.method2924(true);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V", line = 443)
    public static void method1708(boolean arg0) {
        if (!arg0) {
            method1708(true);
        }
        field3592 = null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Leq;II)Lfp;", line = 453)
    public static final class323 method1709(class209 arg0, int arg1, int arg2) {
        field3590++;
        if (arg1 != 1) {
            method1707(22);
        }
        byte[] var3 = arg0.method1478((byte) -72, arg2);
        return var3 == null ? null : new class323(var3);
    }
}
