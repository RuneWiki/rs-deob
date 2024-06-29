import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class255 extends class61 {

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "[I")
    public static int[] field4542 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "Leb;")
    private static class230 field4546 = class68.method589(0, " loggt sich aus)3");

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "J")
    public long field4534;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "Lrb;")
    public class255 field4539;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "Lrb;")
    public class255 field4549;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public final void method1785(int arg0) {
        field4544++;
        if (this.field4549 == null) {
            return;
        }
        this.field4549.field4539 = this.field4539;
        this.field4539.field4549 = this.field4549;
        this.field4549 = null;
        this.field4539 = null;
        if (arg0 > -64) {
            method1790((byte) -88);
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
    public static void method1786(int arg0) {
        int var1 = 103 % ((arg0 + 91) / 34);
        field4542 = null;
        field4546 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[B[Lhh;IBZI)V")
    public static final void method1787(int arg0, int arg1, byte[] arg2, class116[] arg3, int arg4, byte arg5, boolean arg6, int arg7) {
        byte var8;
        if (arg6) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        field4547++;
        if (!arg6) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg7 + var10 > 0 && arg7 + var10 < 103 && arg0 + var11 > 0 && arg0 + var11 < 103) {
                            arg3[var9].field2085[arg7 + var10][arg0 + var11] = class189.method1350(arg3[var9].field2085[arg7 + var10][arg0 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class14 var12 = new class14(arg2);
        int var13 = 0;
        int var14 = -91 / ((arg5 + 11) / 50);
        while (var8 > var13) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    class114.method914(arg4, arg1, var12, var13, arg0 + var16, (byte) -41, arg6, 0, arg7 + var15);
                }
            }
            var13++;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lkk;III)[Lge;")
    public static final class69[] method1788(class223 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            field4546 = null;
        }
        field4543++;
        return class205.method1440(arg2, arg1, 2, arg0) ? class194.method1381(22868) : null;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(II)Leb;")
    public static final class230 method1789(int arg0, int arg1) {
        field4545++;
        return arg0 == 255 ? class173.method1267((byte) 59, new class230[] { class37.method340(arg1 >> 24 & 0xFF, (byte) -26), class128.field2234, class37.method340((arg1 & 0xFFAF6C) >> 16, (byte) -26), class128.field2234, class37.method340(arg1 >> 8 & 0xFF, (byte) -26), class128.field2234, class37.method340(arg1 & 0xFF, (byte) -26) }) : null;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)V")
    public static final void method1790(byte arg0) {
        class14.field306 = class223.field3837;
        class168.field2959 = class139.field2477;
        class110.field1974 = class1.field11;
        class147.field2658 = class267.field4732;
        class68.field1271 = class238.field4124;
        class258.field4567 = class176.field3098;
        class170.field3006 = class164.field2922;
        class99.field1841 = class23.field439;
        class14.field326 = class7.field101;
        class54.field927 = class247.field4393;
        class98.field1811 = class29.field523;
        class264.field4687 = class113.field2027;
        class213.field3691 = class214.field3701;
        class240.field4145 = class157.field2808;
        class100.field1855 = field4546;
        class252.field4508 = class28.field509;
        class52.field901 = class45.field799;
        class270.field4776 = class162.field2881;
        class161.field2876 = class265.field4709;
        class248.field4394 = class183.field3218;
        class18.field407 = class183.field3222;
        class42.field763 = class29.field539;
        class203.field3582 = class232.field4041;
        class98.field1814 = class29.field523;
        class157.field2801 = class40.field738;
        class234.field4075 = class251.field4498;
        class130.field2338 = class110.field1981;
        class38.field710 = class70.field1292;
        class147.field2649 = class106.field1921;
        class138.field2471 = class44.field781;
        class7.field123 = class265.field4705;
        class183.field3219 = class222.field3804;
        class51.field884 = class120.field2115;
        class109.field1958 = class42.field762;
        client.field2721 = class60.field1152;
        class225.field3880 = class173.field3057;
        class58.field1099 = class221.field3799;
        class168.field2964 = class38.field714;
        class55.field986 = class141.field2537;
        class201.field3567 = class28.field520;
        class160.field2857 = class34.field643;
        class60.field1159 = class263.field4673;
        class259.field4579 = class216.field3728;
        class55.field1006 = class141.field2537;
        class106.field1915 = class18.field399;
        class169.field2991 = class271.field4785;
        class275.field4832 = class144.field2589;
        class12.field236 = class54.field943;
        class168.field2966 = class132.field2374;
        class82.field1481 = class213.field3696;
        class9.field158 = class132.field2385;
        class59.field1127 = class99.field1832;
        class177.field3117 = class261.field4657;
        class204.field3589 = class75.field1370;
        class263.field4670 = class58.field1110;
        class54.field942 = class97.field1739;
        class60.field1155 = class183.field3205;
        class142.field2567 = class88.field1538;
        field4535++;
        class192.field3389 = class175.field3074;
        class169.field2995 = class7.field100;
        class155.field2756 = class72.field1311;
        class25.field480 = class185.field3256;
        class88.field1535 = class65.field1223;
        class156.field2787 = class102.field1872;
        class169.field2989 = class120.field2118;
        class70.field1295 = class162.field2891;
        class216.field3733 = class172.field3044;
        class219.field3768 = class272.field4798;
        class6.field86 = class7.field90;
        class252.field4515 = class28.field509;
        class243.field4184 = class170.field3020;
        class190.field3353 = class77.field1400;
        class245.field4327 = class36.field675;
        class60.field1151 = class80.field1452;
        class16.field362 = class166.field2939;
        class134.field2417 = class77.field1390;
        class92.field1661 = class173.field3055;
        class191.field3374 = class156.field2795;
        class183.field3211 = class13.field263;
        class149.field2670 = class9.field157;
        int var1 = -58 / ((arg0 + 64) / 50);
        class53.field911 = class34.field645;
        class132.field2365 = class14.field299;
        class88.field1539 = class91.field1650;
        class47.field829 = class270.field4772;
        class28.field510 = class131.field2349;
        class58.field1089 = class166.field2934;
        class110.field1973 = class183.field3213;
        class34.field633 = class223.field3814;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lkk;B)V")
    public static final void method1791(class223 arg0, byte arg1) {
        if (arg1 == 46) {
            field4538++;
            class205.field3628 = arg0;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
    public static final void method1792(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        class99.field1838[arg0] = arg1;
        class247 var3 = (class247) class138.field2464.method394((long) arg0, -21083);
        if (var3 == null) {
            class247 var4 = new class247(class201.method1419(5) + 500L);
            class138.field2464.method388(-1, (long) arg0, var4);
        } else {
            var3.field4383 = class201.method1419(5) + 500L;
        }
        field4536++;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
    public static final void method1793(int arg0) {
        field4548++;
        class183.field3182.method970(arg0 ^ arg0);
        int var1 = class183.field3182.method971(-94, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class183.field3182.method971(-104, 2);
        if (var2 == 0) {
            class121.field2132[class105.field1911++] = 2047;
        } else if (var2 == 1) {
            int var3 = class183.field3182.method971(-109, 3);
            class56.field1033.method1011(false, (byte) -123, var3);
            int var4 = class183.field3182.method971(arg0 + 16632, 1);
            if (var4 == 1) {
                class121.field2132[class105.field1911++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class183.field3182.method971(arg0 ^ 0x415A, 3);
            class56.field1033.method1011(true, (byte) -51, var5);
            int var6 = class183.field3182.method971(-95, 3);
            class56.field1033.method1011(true, (byte) -81, var6);
            int var7 = class183.field3182.method971(-85, 1);
            if (var7 == 1) {
                class121.field2132[class105.field1911++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class183.field3182.method971(-85, 1);
            int var9 = class183.field3182.method971(arg0 + 16594, 7);
            int var10 = class183.field3182.method971(-123, 7);
            int var11 = class183.field3182.method971(arg0 ^ 0x416D, 1);
            if (var11 == 1) {
                class121.field2132[class105.field1911++] = 2047;
            }
            class124.field2174 = class183.field3182.method971(arg0 + 16621, 2);
            class56.field1033.method1810(var10, var9, var8 == 1, 240);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III[B)I")
    public static final int method1794(int arg0, int arg1, int arg2, byte[] arg3) {
        field4541++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class190.field3336[(arg3[var5] ^ var4) & 0xFF];
        }
        if (arg1 != 1) {
            method1789(35, -127);
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIBI)Lni;")
    public static final class150 method1795(int arg0, int arg1, byte arg2, int arg3) {
        field4537++;
        class150 var4 = new class150();
        var4.field2681 = arg1;
        var4.field2678 = arg3;
        client.field2708.method388(-1, (long) arg0, var4);
        class178.method1292(arg1, (byte) 119);
        class245 var5 = class155.method1183(arg0, 17);
        if (var5 != null) {
            class92.method777((byte) -65, var5);
        }
        if (class265.field4706 != null) {
            class92.method777((byte) -65, class265.field4706);
            class265.field4706 = null;
        }
        int var6 = class186.field3266;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class212.method1474(-106, class225.field3890[var7])) {
                class89.method734(var7, false);
            }
        }
        if (class186.field3266 == 1) {
            class243.field4188 = false;
            class14.method149(class218.field3759, class30.field555, class275.field4826, -14160, class53.field920);
        } else {
            class14.method149(class218.field3759, class30.field555, class275.field4826, -14160, class53.field920);
            int var8 = class76.field1382.method783(class155.field2756);
            for (int var9 = 0; var9 < class186.field3266; var9++) {
                int var10 = class76.field1382.method783(class158.method1201(false, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class218.field3759 = class186.field3266 * 15 + 22;
            class53.field920 = var8 + 8;
        }
        if (var5 != null) {
            class8.method84(var5, false, -72);
        }
        class219.method1504(arg1, -92);
        if (arg2 <= 122) {
            method1789(-11, -121);
        }
        if (class263.field4679 != -1) {
            class37.method339(class263.field4679, 1, 3);
        }
        return var4;
    }
}
