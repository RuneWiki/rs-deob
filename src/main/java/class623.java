import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public abstract class class623 extends class66 {

    @OriginalMember(owner = "client!vfa", name = "q", descriptor = "Lrl;")
    public static class672 field8791 = new class672(21, -1);

    @OriginalMember(owner = "client!vfa", name = "s", descriptor = "Lhga;")
    public static class158 field8793 = new class158(1, -1);

    @OriginalMember(owner = "client!vfa", name = "v", descriptor = "Z")
    public static boolean field8796 = false;

    @OriginalMember(owner = "client!vfa", name = "w", descriptor = "F")
    public static float field8797;

    @OriginalMember(owner = "client!vfa", name = "r", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!vfa", name = "u", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!vfa", name = "t", descriptor = "Lmq;")
    public static class470 field8794;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)I", line = 3)
    public static final int method3611(byte arg0) {
        field8795++;
        if (!class17.field282.field4897) {
            for (int var1 = 0; var1 < class345.field5560; var1++) {
                if (class365.field5738[var1].method2051((byte) 104) == 's' || class365.field5738[var1].method2051((byte) 104) == 'S') {
                    class17.field282.field4897 = true;
                    break;
                }
            }
        }
        if (class687.field9632 == class255.field4056) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class112.method1033(-11752);
            if (class71.field893 == 0L) {
                class71.field893 = var4;
            }
            if (var3 > 16384 && var4 - class71.field893 < 5000L) {
                if (var4 - class192.field3184 > 1000L) {
                    System.gc();
                    class192.field3184 = var4;
                }
                return 0;
            }
        }
        if (class687.field9633 == class255.field4056) {
            if (class654.field9147 == null) {
                class654.field9147 = new class611(class683.field9586, class474.field7025, class180.field3033, class483.field7091);
            }
            if (!class654.field9147.method3557(101)) {
                return 0;
            }
            class224.method1649(0, null, 79);
            class629.field8876 = !class260.method1850(31099);
            class218.field3570 = class324.method2188((byte) 8, false, class629.field8876 ? 34 : 32, 1);
            class318.field4986 = class324.method2188((byte) 8, false, 33, 1);
            class51.field682 = class324.method2188((byte) 8, false, 13, 1);
        }
        if (class687.field9636 == class255.field4056) {
            class318.field4986.method916(72);
            int var6 = class564.field8100[33].method2990(100);
            int var7 = var6 + class564.field8100[class629.field8876 ? 34 : 32].method2990(100);
            int var8 = var7 + class564.field8100[13].method2990(100);
            int var9 = var8 + class318.field4986.method945((byte) 119);
            if (var9 != 400) {
                return var9 / 4;
            }
            class389.field6017 = class218.field3570.method927(false);
            class158.field2702 = class318.field4986.method927(false);
            class471.method2923(true, class218.field3570);
            int var10 = class17.field282.field4886;
            class310.field4883 = new class685(class99.field1647, class135.field2206, class318.field4986);
            int[] var11 = class310.field4883.method3890(false, var10);
            class216 var12 = new class216(class218.field3570, class51.field682);
            if (var11.length > 0) {
                class341.field5519 = new class298[var11.length];
                for (int var13 = 0; var13 < class341.field5519.length; var13++) {
                    class341.field5519[var13] = new class341(class310.field4883.method3892(10065, var11[var13]), var12);
                }
            }
        }
        if (class687.field9638 == class255.field4056) {
            class198.method1552(class51.field682, class81.method771((byte) -106), class218.field3570, (byte) 74);
        }
        if (class687.field9639 == class255.field4056) {
            int var14 = class155.method1283((byte) -52);
            int var15 = class92.method827((byte) -99);
            if (var15 > var14) {
                return var14 * 100 / var15;
            }
        }
        if (class687.field9640 == class255.field4056) {
            if (class341.field5519 != null && class341.field5519.length > 0) {
                if (class341.field5519[0].method2064(-92) < 100) {
                    return 0;
                }
                if (class341.field5519.length > 1 && class310.field4883.method3896(12288) && class341.field5519[1].method2064(75) < 100) {
                    return 0;
                }
            }
            class81.method768((byte) 118, class627.field8857);
            class491.method3003(class627.field8857, -11799);
            class68.method715(1, (byte) -116);
        }
        if (class687.field9641 == class255.field4056) {
            for (int var16 = 0; var16 < 4; var16++) {
                class10.field172[var16] = class147.method1237(class417.field6374, (byte) -120, class275.field4426);
            }
        }
        if (class687.field9642 == class255.field4056) {
            class158.field2699 = class324.method2188((byte) 8, false, 8, 1);
            class1.field1 = class324.method2188((byte) 8, false, 0, 1);
            class320.field5013 = class324.method2188((byte) 8, false, 1, 1);
            class456.field6845 = class324.method2188((byte) 8, false, 2, 1);
            class193.field3196 = class324.method2188((byte) 8, false, 3, 1);
            class452.field6799 = class324.method2188((byte) 8, false, 4, 1);
            class247.field3943 = class324.method2188((byte) 8, true, 5, 1);
            class663.field9232 = class324.method2188((byte) 8, true, 6, 1);
            class547.field7970 = class324.method2188((byte) 8, false, 7, 1);
            class105.field1707 = class324.method2188((byte) 8, false, 9, 1);
            class258.field4122 = class324.method2188((byte) 8, false, 10, 1);
            class641.field8988 = class324.method2188((byte) 8, false, 11, 1);
            class321.field5030 = class324.method2188((byte) 8, false, 12, 1);
            class290.field4598 = class324.method2188((byte) 8, false, 14, 1);
            class553.field8017 = class324.method2188((byte) 8, false, 15, 1);
            class422.field6434 = class324.method2188((byte) 8, false, 16, 1);
            class216.field3561 = class324.method2188((byte) 8, false, 17, 1);
            class132.field2157 = class324.method2188((byte) 8, false, 18, 1);
            class304.field4755 = class324.method2188((byte) 8, false, 19, 1);
            class286.field4546 = class324.method2188((byte) 8, false, 20, 1);
            class28.field434 = class324.method2188((byte) 8, false, 21, 1);
            class469.field6958 = class324.method2188((byte) 8, false, 22, 1);
            class660.field9199 = class324.method2188((byte) 8, true, 23, 1);
            class292.field4604 = class324.method2188((byte) 8, false, 24, 1);
            class287.field4566 = class324.method2188((byte) 8, false, 25, 1);
            class51.field688 = class324.method2188((byte) 8, true, 26, 1);
            class275.field4424 = class324.method2188((byte) 8, false, 27, 1);
            class95.field1491 = class324.method2188((byte) 8, true, 28, 1);
            class85.field1045 = class324.method2188((byte) 8, false, 29, 1);
            class357.field5695 = class324.method2188((byte) 8, true, 30, 1);
            class28.field436 = class324.method2188((byte) 8, true, 31, 1);
        }
        if (class687.field9643 == class255.field4056) {
            int var17 = 0;
            for (int var18 = 0; var18 < 35; var18++) {
                if (class564.field8100[var18] != null) {
                    var17 += class564.field8100[var18].method2990(100) * class621.field8772[var18] / 100;
                }
            }
            if (var17 != 100) {
                if (class250.field3996 < 0) {
                    class250.field3996 = var17;
                }
                return (var17 - class250.field3996) * 100 / (100 - class250.field3996);
            }
            class700.method3948(3, class158.field2699);
            class198.method1552(class51.field682, class81.method771((byte) -114), class158.field2699, (byte) -107);
        }
        if (class687.field9644 == class255.field4056) {
            class86.method797(61);
            class68.method715(2, (byte) -54);
        }
        if (class687.field9645 == class255.field4056) {
            class682.method3881((byte) 127, class402.field6207, class357.field5695);
        }
        if (class687.field9646 == class255.field4056) {
            int var19 = class636.method3702(98);
            if (var19 < 100) {
                return var19;
            }
            class484.method2975(-75, class95.field1491.method952(94, 1));
            class27.method426((byte) -119, class95.field1491.method952(110, 3));
        }
        int var20 = -17 % ((53 - arg0) / 53);
        if (class687.field9647 == class255.field4056) {
            if (class484.field7102 != -1 && !class547.field7970.method931(-1, class484.field7102, 0)) {
                return 99;
            }
            class48.field645 = new class496(class51.field688, class105.field1707, class158.field2699);
            class610.field8680 = new class613(class99.field1647, class135.field2206, class456.field6845);
            class472.field6988 = new class419(class99.field1647, class135.field2206, class456.field6845);
            class489.field7154 = new class255(class99.field1647, class135.field2206, class456.field6845, class158.field2699);
            class7.field113 = new class500(class99.field1647, class135.field2206, class216.field3561);
            class472.field6984 = new class74(class99.field1647, class135.field2206, class456.field6845);
            class61.field789 = new class3(class99.field1647, class135.field2206, class456.field6845);
            class385.field5985 = new class374(class99.field1647, class135.field2206, class456.field6845, class547.field7970);
            class522.field7578 = new class474(class99.field1647, class135.field2206, class456.field6845);
            class357.field5693 = new class412(class99.field1647, class135.field2206, class456.field6845);
            class213.field3537 = new class7(class99.field1647, class135.field2206, true, class422.field6434, class547.field7970);
            class498.field7303 = new class544(class99.field1647, class135.field2206, class456.field6845, class158.field2699);
            class584.field8299 = new class266(class99.field1647, class135.field2206, class456.field6845, class158.field2699);
            class538.field7860 = new class533(class99.field1647, class135.field2206, true, class132.field2157, class547.field7970);
            class91.field1083 = new class454(class99.field1647, class135.field2206, true, class610.field8680, class304.field4755, class547.field7970);
            class690.field9681 = new class115(class99.field1647, class135.field2206, class456.field6845);
            class636.field8942 = new class458(class99.field1647, class135.field2206, class286.field4546, class1.field1, class320.field5013);
            class275.field4412 = new class170(class99.field1647, class135.field2206, class456.field6845);
            class254.field4046 = new class618(class99.field1647, class135.field2206, class456.field6845);
            class65.field826 = new class634(class99.field1647, class135.field2206, class28.field434, class547.field7970);
            class243.field3854 = new class390(class99.field1647, class135.field2206, class456.field6845);
            class581.field8277 = new class343(class99.field1647, class135.field2206, class456.field6845);
            class301.field4710 = new class347(class99.field1647, class135.field2206, class456.field6845);
            class585.field8317 = new class70(class99.field1647, class135.field2206, class469.field6958);
            class566.field8134 = new class514(class99.field1647, class135.field2206, class456.field6845);
            class289.method2044(class51.field682, (byte) -86, class547.field7970, class158.field2699, class193.field3196);
            class520.method3136(class85.field1045, 0);
            class502.field7351 = new class437(class135.field2206, class292.field4604, class287.field4566);
            class139.field2340 = new class703(class135.field2206, class292.field4604, class287.field4566, new class35());
            class481.method2968(-32484);
            class213.field3537.method95(!class17.field282.method2089(class497.field7259, -1), (byte) 113);
            class539.field7869 = new class650();
            class49.method574(99);
            class386.method2514((byte) 116, class275.field4424);
            class563.method3341(class48.field645, 99, class547.field7970);
            class668 var21 = new class668(class258.field4122.method923("huffman", -25124, ""));
            class639.method3710(var21, (byte) -113);
            try {
                jagmisc.init();
            } catch (Throwable var30) {
            }
            class11.field183 = class238.method1715((byte) -40);
            class359.field5698 = new class606(true, class402.field6207);
        }
        if (class687.field9649 == class255.field4056) {
            int var22 = class433.method2756(-81, class158.field2699) + class181.method1479(true, 128);
            int var23 = class669.method3834(20756) + class92.method827((byte) -106);
            if (var22 < var23) {
                return var22 * 100 / var23;
            }
        }
        if (class687.field9650 == class255.field4056) {
            class378.method2494(class660.field9199, class472.field6984, class61.field789, class213.field3537, class498.field7303, class584.field8299, class539.field7869);
        }
        if (class687.field9651 == class255.field4056) {
            class691.field9687 = new boolean[class301.field4710.field5567];
            class248.field3955 = new String[class581.field8277.field5538];
            class52.field702 = new int[class301.field4710.field5567];
            for (int var24 = 0; var24 < class301.field4710.field5567; var24++) {
                if (class301.field4710.method2349(var24, 2146).field414 == 0) {
                    class691.field9687[var24] = true;
                    class123.field2046++;
                }
                class52.field702[var24] = -1;
            }
            class314.method2146(true);
            class379.field5912 = class193.field3196.method928(false, "loginscreen");
            class177.field2914 = class193.field3196.method928(false, "lobbyscreen");
            class247.field3943.method930(-1, true, false);
            class663.field9232.method930(-1, true, true);
            class158.field2699.method930(-1, true, true);
            class51.field682.method930(-1, true, true);
            class258.field4122.method930(-1, true, true);
            class193.field3196.method930(-1, true, true);
            class6.field75 = true;
            class456.field6845.field1555 = 2;
            class216.field3561.field1555 = 2;
            class422.field6434.field1555 = 2;
            class132.field2157.field1555 = 2;
            class304.field4755.field1555 = 2;
            class286.field4546.field1555 = 2;
            class28.field434.field1555 = 2;
        }
        if (class687.field9652 == class255.field4056) {
            if (!class107.method1016(class379.field5912, (byte) 118)) {
                return 0;
            }
            for (int var25 = 0; var25 < class564.field8105[class379.field5912].length; var25++) {
                class665 var26 = class564.field8105[class379.field5912][var25];
                if (var26.field9309 == 5 && var26.field9278 != -1) {
                    var26.method3816((byte) 62, class627.field8857);
                }
            }
        }
        if (class687.field9653 == class255.field4056) {
            for (int var27 = 0; var27 < class564.field8105[class379.field5912].length; var27++) {
                class665 var28 = class564.field8105[class379.field5912][var27];
                if (var28.field9309 == 5 && var28.field9278 != -1 && var28.method3816((byte) 28, class627.field8857) == null && class549.field7990) {
                    return 0;
                }
            }
        }
        if (class687.field9654 == class255.field4056) {
            class546.method3298((byte) 91, true);
        }
        if (class687.field9655 == class255.field4056) {
            class204.field3327.method2937((byte) -128);
            try {
                class89.field1078.join();
            } catch (InterruptedException var29) {
                return 0;
            }
            class341.field5519 = null;
            class204.field3327 = null;
            class310.field4883 = null;
            class318.field4986 = null;
            class218.field3570 = null;
            class89.field1078 = null;
            class16.method245(7498);
            class1.field5 = class17.field282.field4897;
            class17.field282.field4897 = true;
            class17.field282.method2094(false, class402.field6207);
            if (class1.field5) {
                class265.method1878(0, -14473);
            } else {
                class265.method1878(class17.field282.field4868, -14473);
            }
            class356.method2392(false, -90, -1, class17.field282.field4865, -1);
            class81.method768((byte) 124, class627.field8857);
            class491.method3003(class627.field8857, -11799);
            class160.method1318(class158.field2699, class627.field8857, (byte) -66);
            class395.method2554(class220.field3579, 10);
        }
        return class160.method1319((byte) -25);
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(B)V", line = 448)
    public static void method3612(byte arg0) {
        field8793 = null;
        field8791 = null;
        field8794 = null;
        if (arg0 > -37) {
            field8793 = null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Z)I")
    public abstract int method2596(boolean arg0);

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)I")
    public abstract int method2600(int arg0);

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)J")
    public abstract long method2598(int arg0);

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(Z)I")
    public abstract int method2599(boolean arg0);

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "(B)I")
    public abstract int method2594(byte arg0);
}
