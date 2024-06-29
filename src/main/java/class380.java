import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class380 extends class330 {

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "Laf;")
    public static class39 field5447 = new class39(4);

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "I")
    public static int field5448 = 0;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "[[B")
    public static byte[][] field5444;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(B)V", line = 7)
    public static final void method2371(byte arg0) {
        ++field5445;
        if (class664.field9331 == 7) {
            class570.method3355((byte) 6, false);
        } else {
            class750.field10360 = class679.field9490;
            class679.field9490 = null;
            class285.method1884(true, 13);
            if (arg0 <= 98) {
                field5448 = -28;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)I", line = 27)
    public static final int method2372(boolean arg0) {
        if (class688.field9602.field8520.method1929((byte) -98) == 0) {
            for (int var1 = 0; var1 < class94.field1099; ++var1) {
                if (~class462.field6462[var1].method733((byte) -43) == -116 || ~class462.field6462[var1].method733((byte) -50) == -84) {
                    class688.field9602.method3503(class688.field9602.field8520, -127, 1);
                    class45.field475 = true;
                    break;
                }
            }
        }
        ++field5446;
        if (class602.field8420 == class570.field8022) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class683.method3903((byte) 4);
            if (class18.field121 == 0L) {
                class18.field121 = var4;
            }
            if (var3 > 16384 && -class18.field121 + var4 < 5000L) {
                if (~(-class735.field10133 + var4) < -1001L) {
                    System.gc();
                    class735.field10133 = var4;
                }
                return 0;
            }
        }
        if (class602.field8424 == class570.field8022) {
            if (class203.field2847 == null) {
                class203.field2847 = new class23(class68.field750, class710.field9835, class771.field10609, class582.field8246);
            }
            if (!class203.field2847.method95(true)) {
                return 0;
            }
            class418.method2527((String) null, -2, true, 0);
            class352.field5104 = !class138.method922(!arg0);
            class693.field9679 = class536.method3187(!class352.field5104 ? 32 : 34, false, 1, 1000000);
            class423.field5876 = class536.method3187(33, false, 1, 1000000);
            class170.field2160 = class536.method3187(13, false, 1, 1000000);
        }
        if (class602.field8425 == class570.field8022) {
            boolean var6 = class423.field5876.method1851(106);
            int var7 = class570.field8021[33].method1655(-106);
            int var8 = var7 + class570.field8021[!class352.field5104 ? 32 : 34].method1655(-73);
            int var9 = var8 + class570.field8021[13].method1655(-106);
            int var10 = var9 + (!var6 ? class423.field5876.method1853(-11168) : 100);
            if (~var10 != -401) {
                return var10 / 4;
            }
            class500.field6848 = class693.field9679.method1852(12613);
            class467.field6492 = class423.field5876.method1852(12613);
            class672.method3832(true, class693.field9679);
            int var11 = class688.field9602.field8537.method1330((byte) -98);
            class793.field10874 = new class528(class327.field4603, class553.field7667, class423.field5876);
            int[] var12 = class793.field10874.method3133((byte) -123, var11);
            if (~var12.length == -1) {
                var12 = class793.field10874.method3133((byte) -97, 0);
            }
            class482 var13 = new class482(class693.field9679, class170.field2160);
            if (~var12.length < -1) {
                class381.field5458 = new class26[var12.length];
                for (int var14 = 0; ~class381.field5458.length < ~var14; ++var14) {
                    class381.field5458[var14] = new class333(class793.field10874.method3136(var12[var14], 1), var13);
                }
            }
        }
        if (class602.field8426 == class570.field8022) {
            class102.method721(class538.method3198(23540), class170.field2160, class693.field9679, 55);
        }
        if (class602.field8427 == class570.field8022) {
            int var15 = class8.method19(458752);
            int var16 = class100.method718((byte) -72);
            if (~var16 < ~var15) {
                return var15 * 100 / var16;
            }
        }
        if (class602.field8428 == class570.field8022) {
            if (class381.field5458 != null && ~class381.field5458.length < -1) {
                if (~class381.field5458[0].method113(-7350) > -101) {
                    return 0;
                }
                if (~class381.field5458.length < -2 && class793.field10874.method3138(0) && ~class381.field5458[1].method113(-7350) > -101) {
                    return 0;
                }
            }
            class715.method4006(class111.field1332, 0);
            class669.method3822(class111.field1332, (byte) 116);
            class285.method1884(true, 1);
        }
        if (class602.field8429 == class570.field8022) {
            for (int var17 = 0; ~var17 > -5; ++var17) {
                client.field1305[var17] = class545.method3224(class741.field10208, (byte) -47, class525.field7224);
            }
        }
        if (class602.field8430 == class570.field8022) {
            class149.field1968 = class536.method3187(8, false, 1, 1000000);
            class564.field7978 = class536.method3187(0, false, 1, 1000000);
            class685.field9574 = class536.method3187(1, false, 1, 1000000);
            class403.field5684 = class536.method3187(2, false, 1, 1000000);
            class132.field1695 = class536.method3187(3, false, 1, 1000000);
            class406.field5726 = class536.method3187(4, false, 1, 1000000);
            class604.field8480 = class536.method3187(5, true, 1, 1000000);
            class456.field6372 = class536.method3187(6, true, 1, 1000000);
            class384.field5496 = class536.method3187(7, false, 1, 1000000);
            class115.field1473 = class536.method3187(9, false, 1, 1000000);
            class392.field5585 = class536.method3187(10, false, 1, 1000000);
            class456.field6376 = class536.method3187(11, false, 1, 1000000);
            class540.field7466 = class536.method3187(12, false, 1, 1000000);
            class102.field1184 = class536.method3187(14, false, 1, 1000000);
            class269.field3901 = class536.method3187(15, false, 1, 1000000);
            class99.field1155 = class536.method3187(16, false, 1, 1000000);
            class122.field1617 = class536.method3187(17, false, 1, 1000000);
            class605.field8484 = class536.method3187(18, false, 1, 1000000);
            class75.field841 = class536.method3187(19, false, 1, 1000000);
            class16.field95 = class536.method3187(20, false, 1, 1000000);
            class448.field6272 = class536.method3187(21, false, 1, 1000000);
            class274.field3962 = class536.method3187(22, false, 1, 1000000);
            class539.field7458 = class536.method3187(23, true, 1, 1000000);
            class85.field1026 = class536.method3187(24, false, 1, 1000000);
            class368.field5290 = class536.method3187(25, false, 1, 1000000);
            class35.field359 = class536.method3187(26, true, 1, 1000000);
            class679.field9499 = class536.method3187(27, false, 1, 1000000);
            class516.field7087 = class536.method3187(28, true, 1, 1000000);
            class212.field2925 = class536.method3187(29, false, 1, 1000000);
            class356.field5136 = class536.method3187(30, true, 1, 1000000);
            class100.field1175 = class536.method3187(31, true, 1, 1000000);
            class278.field4003 = class536.method3187(36, true, 2, 1000000);
        }
        if (class602.field8431 == class570.field8022) {
            int var18 = 0;
            for (int var19 = 0; ~var19 > -38; ++var19) {
                if (class570.field8021[var19] != null) {
                    var18 += class570.field8021[var19].method1655(-120) * class402.field5672[var19] / 100;
                }
            }
            if (var18 != 100) {
                if (~class113.field1365 > -1) {
                    class113.field1365 = var18;
                }
                return (var18 - class113.field1365) * 100 / (100 - class113.field1365);
            }
            class54.method461(class149.field1968, -2851);
            class102.method721(class538.method3198(23540), class170.field2160, class149.field1968, 55);
        }
        if (class602.field8432 == class570.field8022) {
            if (class442.field6102 == -1) {
                class442.field6102 = class456.field6372.method1839(-1, "scape main");
            }
            class517.method3095(true);
            class285.method1884(true, 2);
        }
        if (class602.field8433 == class570.field8022) {
            class174.method1109(class356.field5136, class129.field1674, 82);
        }
        if (!arg0) {
            return 94;
        } else {
            if (class602.field8434 == class570.field8022) {
                int var20 = class163.method1030(false);
                if (~var20 > -101) {
                    return var20;
                }
                class734.method4075(class516.field7087.method1854(0, 1), (byte) 93);
                class695.method3931((byte) -8, class516.field7087.method1854(0, 3));
                class516.field7084 = new class450(class516.field7087);
            }
            if (class602.field8435 == class570.field8022) {
                if (class424.field5898 != -1 && !class384.field5496.method1862(93, 0, class424.field5898)) {
                    return 99;
                }
                class753.field10382 = new class81(class35.field359, class115.field1473, class149.field1968);
                class734.field10126 = new class99(class327.field4603, class553.field7667, class403.field5684);
                class671.field9419 = new class484(class327.field4603, class553.field7667, class403.field5684, class516.field7084);
                class315.field4514 = new class284(class327.field4603, class553.field7667, class403.field5684, class149.field1968);
                class281.field4027 = new class611(class327.field4603, class553.field7667, class122.field1617);
                class231.field3485 = new class446(class327.field4603, class553.field7667, class403.field5684);
                class632.field8833 = new class573(class327.field4603, class553.field7667, class403.field5684);
                class10.field67 = new class349(class327.field4603, class553.field7667, class403.field5684, class149.field1968);
                class15.field91 = new class436(class327.field4603, class553.field7667, class403.field5684, class384.field5496);
                class532.field7331 = new class631(class327.field4603, class553.field7667, class403.field5684);
                class444.field6154 = new class536(class327.field4603, class553.field7667, class403.field5684);
                class390.field5558 = new class514(class327.field4603, class553.field7667, true, class99.field1155, class384.field5496);
                class657.field9274 = new class67(class327.field4603, class553.field7667, class403.field5684, class149.field1968);
                class35.field354 = new class495(class327.field4603, class553.field7667, class403.field5684, class149.field1968);
                class104.field1201 = new class787(class327.field4603, class553.field7667, true, class605.field8484, class384.field5496);
                class35.field367 = new class512(class327.field4603, class553.field7667, true, class734.field10126, class75.field841, class384.field5496);
                class545.field7585 = new class467(class327.field4603, class553.field7667, class403.field5684);
                class571.field8029 = new class645(class327.field4603, class553.field7667, class16.field95, class564.field7978, class685.field9574);
                class72.field790 = new class93(class327.field4603, class553.field7667, class403.field5684);
                class651.field9101 = new class76(class327.field4603, class553.field7667, class403.field5684);
                class576.field8094 = new class747(class327.field4603, class553.field7667, class448.field6272, class384.field5496);
                class616.field8649 = new class394(class327.field4603, class553.field7667, class403.field5684);
                class477.field6620 = new class729(class327.field4603, class553.field7667, class403.field5684);
                class661.field9301 = new class7(class327.field4603, class553.field7667, class403.field5684);
                class650.field9089 = new class301(class327.field4603, class553.field7667, class274.field3962);
                class206.field2895 = new class290(class327.field4603, class553.field7667, class403.field5684);
                class326.field4583 = new class217(class327.field4603, class553.field7667, class403.field5684);
                class559.method3288(class132.field1695, class149.field1968, class384.field5496, (byte) -37, class170.field2160);
                class336.method2126(27271, class212.field2925);
                class353.field5116 = new class587(class553.field7667, class85.field1026, class368.field5290);
                class475.field6591 = new class381(class553.field7667, class85.field1026, class368.field5290, new class661());
                class573.method3361(arg0);
                class390.field5558.method3058(~class688.field9602.field8542.method1756((byte) -98) == -1, true);
                class173.field2192 = new class579();
                class511.method3009(-14603);
                class230.method1528(-37, class679.field9499);
                class540.method3209((byte) -117, class753.field10382, class384.field5496);
                class66 var21 = new class66(class392.field5585.method1861(arg0, "huffman", ""));
                class141.method932(var21, (byte) -112);
                try {
                    jagmisc.init();
                } catch (Throwable var29) {
                }
                class731.field10109 = class597.method3473(true);
                class495.field6813 = new class490(true, class129.field1674);
            }
            if (class602.field8437 == class570.field8022) {
                int var22 = class678.method3859(-3764, class149.field1968) + class724.method4033(1, true);
                int var23 = class69.method526(-1) + class100.method718((byte) -79);
                if (var22 < var23) {
                    return var22 * 100 / var23;
                }
            }
            if (class602.field8438 == class570.field8022) {
                class46.method384(class539.field7458, class231.field3485, class632.field8833, class390.field5558, class657.field9274, class35.field354, class173.field2192);
            }
            if (class602.field8439 == class570.field8022) {
                class170.field2162 = new int[class661.field9301.field44];
                class616.field8646 = new String[class477.field6620.field10071];
                class583.field8250 = new boolean[class661.field9301.field44];
                for (int var24 = 0; ~var24 > ~class661.field9301.field44; ++var24) {
                    if (~class661.field9301.method18(64, var24).field5685 == -1) {
                        class583.field8250[var24] = true;
                        ++class350.field5086;
                    }
                    class170.field2162[var24] = -1;
                }
                class593.method3463((byte) -72);
                class353.field5118 = class132.field1695.method1839(-1, "loginscreen");
                class296.field4323 = class132.field1695.method1839(-1, "lobbyscreen");
                class604.field8480.method1864(true, false, -29799);
                class456.field6372.method1864(true, true, -29799);
                class149.field1968.method1864(true, true, -29799);
                class170.field2160.method1864(true, true, -29799);
                class392.field5585.method1864(true, true, -29799);
                class132.field1695.method1864(true, true, -29799);
                class403.field5684.field4076 = 2;
                class743.field10240 = true;
                class122.field1617.field4076 = 2;
                class99.field1155.field4076 = 2;
                class605.field8484.field4076 = 2;
                class75.field841.field4076 = 2;
                class16.field95.field4076 = 2;
                class448.field6272.field4076 = 2;
            }
            if (class602.field8440 == class570.field8022) {
                if (!class718.method4015(class353.field5118, 51)) {
                    return 0;
                }
                boolean var25 = true;
                for (int var26 = 0; ~var26 > ~class609.field8594[class353.field5118].length; ++var26) {
                    class115 var27 = class609.field8594[class353.field5118][var26];
                    if (var27.field1564 == 5 && var27.field1410 != -1 && !class149.field1968.method1862(125, 0, var27.field1410)) {
                        var25 = false;
                    }
                }
                if (!var25) {
                    return 0;
                }
            }
            if (class602.field8441 == class570.field8022) {
                class360.method2265(true, (byte) 100);
            }
            if (class602.field8442 == class570.field8022) {
                class409.field5750.method962(false);
                try {
                    class308.field4451.join();
                } catch (InterruptedException var28) {
                    return 0;
                }
                class409.field5750 = null;
                class381.field5458 = null;
                class793.field10874 = null;
                class308.field4451 = null;
                class423.field5876 = null;
                class693.field9679 = null;
                class626.method3607(25);
                class6.field38 = class688.field9602.field8520.method1929((byte) -98) == 1;
                class688.field9602.method3503(class688.field9602.field8520, -122, 1);
                if (class6.field38) {
                    class688.field9602.method3503(class688.field9602.field8510, -126, 0);
                } else if (class688.field9602.field8510.field6020 && class495.field6813.field6744 < 512 && ~class495.field6813.field6744 != -1) {
                    class688.field9602.method3503(class688.field9602.field8510, -123, 0);
                }
                class266.method1738(109);
                if (!class6.field38) {
                    class532.method3154(class688.field9602.field8510.method2604((byte) -98), false, 1);
                } else {
                    class532.method3154(0, false, 1);
                }
                class234.method1602(class688.field9602.field8518.method3732((byte) -98), false, -1, 16367, -1);
                class715.method4006(class111.field1332, 0);
                class669.method3822(class111.field1332, (byte) 124);
                class60.method482(class111.field1332, class149.field1968, -501);
                class68.method521(94, class475.field6585);
            }
            return class48.method404(-55);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V", line = 476)
    public static void method2373(int arg0) {
        if (arg0 != 25632) {
            field5447 = null;
        }
        field5444 = null;
        field5447 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIII)V", line = 488)
    public static final void method2374(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 18) {
            method2372(true);
        }
        ++field5443;
        if (~class474.field6576 <= ~arg2 && ~class727.field10060 >= ~arg1) {
            boolean var6;
            if (class177.field2236 > arg4) {
                arg4 = class177.field2236;
                var6 = false;
            } else if (arg4 <= class627.field8783) {
                var6 = true;
            } else {
                arg4 = class627.field8783;
                var6 = false;
            }
            boolean var7;
            if (arg3 >= class177.field2236) {
                if (~arg3 >= ~class627.field8783) {
                    var7 = true;
                } else {
                    arg3 = class627.field8783;
                    var7 = false;
                }
            } else {
                arg3 = class177.field2236;
                var7 = false;
            }
            if (~class727.field10060 >= ~arg2) {
                class128.method883(arg5, arg4, arg3, class705.field9804[arg2++], 7);
            } else {
                arg2 = class727.field10060;
            }
            if (~class474.field6576 > ~arg1) {
                arg1 = class474.field6576;
            } else {
                class128.method883(arg5, arg4, arg3, class705.field9804[arg1--], 7);
            }
            if (var6 && var7) {
                for (int var8 = arg2; arg1 >= var8; ++var8) {
                    int[] var9 = class705.field9804[var8];
                    var9[arg4] = var9[arg3] = arg5;
                }
            } else {
                if (!var6) {
                    if (var7) {
                        for (int var10 = arg2; var10 <= arg1; ++var10) {
                            class705.field9804[var10][arg3] = arg5;
                        }
                        return;
                    }
                } else {
                    for (int var11 = arg2; arg1 >= var11; ++var11) {
                        class705.field9804[var11][arg4] = arg5;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V", line = 593)
    public class380() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)[I", line = 600)
    public final int[] method464(int arg0, boolean arg1) {
        ++field5449;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (arg1) {
            field5444 = null;
        }
        if (super.field4630.field5704) {
            class335.method2121(var3, 0, class80.field901, class300.field4352[arg0]);
        }
        return var3;
    }
}
