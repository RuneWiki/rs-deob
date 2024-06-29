import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class741 extends class450 {

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field10209;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field10210;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field10211;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field10212;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field10213;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field10214;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field10215;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field10216;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field10217;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field10218;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field10219;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(II)I", line = 3)
    public static final int method4124(int arg0, int arg1) {
        ++field10209;
        int var2 = ((arg0 & -1431655766) >>> 1) + (arg0 & 1431655765);
        int var3 = (var2 & 858993459) - -(var2 >>> 2 & -214748365);
        int var4 = var3 - -(var3 >>> 4) & 252645135;
        int var5 = (var4 >>> 8) + var4;
        if (arg1 > -41) {
            return -44;
        } else {
            int var6 = (var5 >>> 16) + var5;
            return 255 & var6;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)I", line = 19)
    public final int method75(int arg0, int arg1) {
        ++field10219;
        return arg0 != 0 ? -75 : 1;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLjava/lang/String;)I", line = 32)
    public static final int method4125(byte arg0, String arg1) {
        ++field10214;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; ++var4) {
            var3 = (var3 << 5) + -var3 - -arg1.charAt(var4);
        }
        if (arg0 != 85) {
            method4130(-98);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(Z)I", line = 54)
    public final int method4126(boolean arg0) {
        ++field10213;
        return !arg0 ? -84 : super.field6170;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)I", line = 67)
    public static final int method4127(byte arg0) {
        ++field10215;
        if (arg0 > -53) {
            method4130(-105);
        }
        return class757.field10532++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLee;)Loh;", line = 78)
    public static final class409 method4128(byte arg0, class677 arg1) {
        ++field10216;
        if (arg0 <= 25) {
            return null;
        } else {
            class476 var2 = class446.method2555(99, arg1);
            int var3 = arg1.method3799(false);
            int var4 = arg1.method3799(false);
            return new class409(var2.field6522, var2.field6523, var2.field6521, var2.field6528, var2.field6529, var2.field6531, var2.field6526, var2.field6530, var2.field6524, var3, var4);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILwu;)I", line = 95)
    private static final int method4129(int arg0, class376 arg1) {
        ++field10210;
        int var2 = 0;
        if (arg1.method2216(class307.field4425, -61)) {
            ++var2;
        }
        if (arg1.method2216(class620.field8267, -98)) {
            ++var2;
        }
        if (arg1.method2216(class177.field2671, -63)) {
            ++var2;
        }
        if (arg1.method2216(class262.field3643, -106)) {
            ++var2;
        }
        if (arg1.method2216(class734.field10155, 65)) {
            ++var2;
        }
        if (arg0 != 1) {
            return -4;
        } else {
            if (arg1.method2216(class726.field10093, 92)) {
                ++var2;
            }
            if (arg1.method2216(class595.field7733, arg0 + 109)) {
                ++var2;
            }
            if (arg1.method2216(class425.field5856, -75)) {
                ++var2;
            }
            if (arg1.method2216(class374.field5193, 96)) {
                ++var2;
            }
            if (arg1.method2216(class760.field10574, arg0 + 117)) {
                ++var2;
            }
            if (arg1.method2216(class447.field6135, arg0 ^ 89)) {
                ++var2;
            }
            if (arg1.method2216(class143.field2291, -84)) {
                ++var2;
            }
            if (arg1.method2216(class282.field3994, 60)) {
                ++var2;
            }
            if (arg1.method2216(class760.field10565, 76)) {
                ++var2;
            }
            if (arg1.method2216(class740.field10208, 78)) {
                ++var2;
            }
            if (arg1.method2216(class7.field140, arg0 ^ 93)) {
                ++var2;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 168)
    public final void method73(byte arg0) {
        ++field10218;
        if (arg0 == 98) {
            if (~super.field6170 != -2 && super.field6170 != 0) {
                super.field6170 = this.method68(false);
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(ILup;)V", line = 181)
    public class741(int arg0, class278 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)I", line = 184)
    public static final int method4130(int arg0) {
        ++field10211;
        if (~class411.field5711.field3885.method1399(true) == -1) {
            for (int var1 = 0; var1 < class26.field424; ++var1) {
                if (~class26.field421[var1].method2248((byte) -55) == -116 || ~class26.field421[var1].method2248((byte) -47) == -84) {
                    class411.field5711.method1677(class411.field5711.field3885, (byte) -71, 1);
                    class281.field3974 = true;
                    break;
                }
            }
        }
        if (class258.field3537 == class21.field359) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class375.method2193(arg0 ^ 28009);
            if (~class512.field6799 == -1L) {
                class512.field6799 = var4;
            }
            if (~var3 < -16385 && ~(-class512.field6799 + var4) > -5001L) {
                if (~(-class526.field6972 + var4) < -1001L) {
                    System.gc();
                    class526.field6972 = var4;
                }
                return 0;
            }
        }
        if (class258.field3537 == class21.field368) {
            if (class690.field9610 == null) {
                class690.field9610 = new class84(class448.field6137, class339.field4798, class251.field3450, class22.field399);
            }
            if (!class690.field9610.method649(-70)) {
                return 0;
            }
            class545.method3045(true, (String) null, 0, (byte) -122);
            class535.field7047 = !class208.method1391(true);
            class709.field9836 = class642.method3525(false, 1, (byte) -128, !class535.field7047 ? 32 : 34);
            class259.field3616 = class642.method3525(false, 1, (byte) -128, 33);
            class275.field3836 = class642.method3525(false, 1, (byte) -128, 13);
        }
        if (class258.field3537 == class21.field370) {
            boolean var6 = class259.field3616.method2210(arg0 + 23066888);
            int var7 = class62.field766[33].method576(9312);
            int var8 = var7 + class62.field766[class535.field7047 ? 34 : 32].method576(9312);
            int var9 = var8 + class62.field766[13].method576(9312);
            int var10 = var9 + (var6 ? 100 : class259.field3616.method2229((byte) -98));
            if (var10 != 400) {
                return var10 / 4;
            }
            class708.field9816 = class709.field9836.method2215(1010);
            class549.field7255 = class259.field3616.method2215(1010);
            class281.method1731(class709.field9836, -25);
            int var11 = class411.field5711.field3889.method3061(true);
            class258.field3599 = new class233(class683.field9532, class713.field9854, class259.field3616);
            int[] var12 = class258.field3599.method1473(var11, (byte) 116);
            if (var12.length == 0) {
                var12 = class258.field3599.method1473(0, (byte) 115);
            }
            class683 var13 = new class683(class709.field9836, class275.field3836);
            if (~var12.length < -1) {
                class381.field5297 = new class206[var12.length];
                for (int var14 = 0; ~var14 > ~class381.field5297.length; ++var14) {
                    class381.field5297[var14] = new class535(class258.field3599.method1475(-121, var12[var14]), var13);
                }
            }
        }
        if (class258.field3537 == class21.field371) {
            class179.method1236(class275.field3836, class709.field9836, class557.method3105(127), (byte) -109);
        }
        if (class258.field3537 == class21.field372) {
            int var15 = class517.method2879(true);
            int var16 = class326.method1972(91);
            if (var16 > var15) {
                return var15 * 100 / var16;
            }
        }
        if (class258.field3537 == class21.field373) {
            if (class381.field5297 != null && class381.field5297.length > 0) {
                if (~class381.field5297[0].method1374(26583) > -101) {
                    return 0;
                }
                if (class381.field5297.length > 1 && class258.field3599.method1474((byte) 70) && ~class381.field5297[1].method1374(26583) > -101) {
                    return 0;
                }
            }
            class466.method2639(0, class341.field4807);
            class286.method1772((byte) -99, class341.field4807);
            class66.method566(1, arg0 ^ -16184);
        }
        if (class258.field3537 == class21.field374) {
            for (int var17 = 0; var17 < 4; ++var17) {
                class456.field6226[var17] = class84.method647(class719.field10004, class107.field1453, 0);
            }
        }
        if (class258.field3537 == class21.field375) {
            class84.field1023 = class642.method3525(false, 1, (byte) -128, 8);
            class55.field665 = class642.method3525(false, 1, (byte) -128, 0);
            class114.field1872 = class642.method3525(false, 1, (byte) -128, 1);
            class622.field8296 = class642.method3525(false, 1, (byte) -128, 2);
            class6.field138 = class642.method3525(false, 1, (byte) -128, 3);
            class250.field3445 = class642.method3525(false, 1, (byte) -128, 4);
            class265.field3699 = class642.method3525(true, 1, (byte) -128, 5);
            class165.field2501 = class642.method3525(true, 1, (byte) -128, 6);
            class13.field205 = class642.method3525(false, 1, (byte) -128, 7);
            class287.field4058 = class642.method3525(false, 1, (byte) -128, 9);
            class469.field6433 = class642.method3525(false, 1, (byte) -128, 10);
            class680.field9504 = class642.method3525(false, 1, (byte) -128, 11);
            class606.field7972 = class642.method3525(false, 1, (byte) -128, 12);
            class11.field175 = class642.method3525(false, 1, (byte) -128, 14);
            class193.field2920 = class642.method3525(false, 1, (byte) -128, 15);
            class654.field8670 = class642.method3525(false, 1, (byte) -128, 16);
            class352.field4951 = class642.method3525(false, 1, (byte) -128, 17);
            class324.field4602 = class642.method3525(false, 1, (byte) -128, 18);
            class254.field3491 = class642.method3525(false, 1, (byte) -128, 19);
            class187.field2825 = class642.method3525(false, 1, (byte) -128, 20);
            class423.field5827 = class642.method3525(false, 1, (byte) -128, 21);
            class466.field6413 = class642.method3525(false, 1, (byte) -128, 22);
            class135.field2156 = class642.method3525(true, 1, (byte) -128, 23);
            class382.field5304 = class642.method3525(false, 1, (byte) -128, 24);
            class53.field654 = class642.method3525(false, 1, (byte) -128, 25);
            class753.field10500 = class642.method3525(true, 1, (byte) -128, 26);
            class534.field7038 = class642.method3525(false, 1, (byte) -128, 27);
            class456.field6215 = class642.method3525(true, 1, (byte) -128, 28);
            class434.field5973 = class642.method3525(false, 1, (byte) -128, 29);
            class763.field10633 = class642.method3525(true, 1, (byte) -128, 30);
            class361.field5087 = class642.method3525(true, 1, (byte) -128, 31);
            class324.field4604 = class642.method3525(true, 2, (byte) -128, 36);
        }
        if (class258.field3537 == class21.field376) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; ++var19) {
                if (class62.field766[var19] != null) {
                    var18 += class62.field766[var19].method576(arg0 ^ 18813) * class586.field7670[var19] / 100;
                }
            }
            if (~var18 != -101) {
                if (~class363.field5112 > -1) {
                    class363.field5112 = var18;
                }
                return (-class363.field5112 + var18) * 100 / (100 - class363.field5112);
            }
            class166.method1194((byte) 107, class84.field1023);
            class179.method1236(class275.field3836, class84.field1023, class557.method3105(126), (byte) -109);
        }
        if (class258.field3537 == class21.field377) {
            if (~class450.field6169 == 0) {
                class450.field6169 = class165.field2501.method2223((byte) 81, "scape main");
            }
            class420.method2434((byte) 104);
            class66.method566(2, -21035);
        }
        if (class258.field3537 == class21.field378) {
            class37.method299(class66.field828, class763.field10633, (byte) -34);
        }
        if (class258.field3537 == class21.field379) {
            int var20 = class404.method2375(arg0 ^ 27933);
            if (~var20 > -101) {
                return var20;
            }
            class269.method1619(arg0 ^ 28007, class456.field6215.method2226(-1, 1));
            class459.method2606(class456.field6215.method2226(-1, 3), 21870);
        }
        if (class258.field3537 == class21.field380) {
            if (class141.field2263 != -1 && !class13.field205.method2211(arg0 ^ 28015, 0, class141.field2263)) {
                return 99;
            }
            class252.field3474 = new class7(class753.field10500, class287.field4058, class84.field1023);
            class505.field6754 = new class743(class683.field9532, class713.field9854, class622.field8296);
            class372.field5174 = new class586(class683.field9532, class713.field9854, class622.field8296);
            class202.field3024 = new class483(class683.field9532, class713.field9854, class622.field8296, class84.field1023);
            class353.field4974 = new class531(class683.field9532, class713.field9854, class352.field4951);
            class69.field845 = new class496(class683.field9532, class713.field9854, class622.field8296);
            class708.field9822 = new class528(class683.field9532, class713.field9854, class622.field8296);
            class468.field6422 = new class254(class683.field9532, class713.field9854, class622.field8296, class84.field1023);
            class210.field3095 = new class709(class683.field9532, class713.field9854, class622.field8296, class13.field205);
            class520.field6929 = new class614(class683.field9532, class713.field9854, class622.field8296);
            class538.field7087 = new class118(class683.field9532, class713.field9854, class622.field8296);
            class462.field6333 = new class334(class683.field9532, class713.field9854, true, class654.field8670, class13.field205);
            class361.field5088 = new class585(class683.field9532, class713.field9854, class622.field8296, class84.field1023);
            class468.field6426 = new class269(class683.field9532, class713.field9854, class622.field8296, class84.field1023);
            class292.field4177 = new class400(class683.field9532, class713.field9854, true, class324.field4602, class13.field205);
            class77.field948 = new class163(class683.field9532, class713.field9854, true, class505.field6754, class254.field3491, class13.field205);
            class21.field391 = new class286(class683.field9532, class713.field9854, class622.field8296);
            class509.field6780 = new class86(class683.field9532, class713.field9854, class187.field2825, class55.field665, class114.field1872);
            class2.field26 = new class668(class683.field9532, class713.field9854, class622.field8296);
            class137.field2187 = new class480(class683.field9532, class713.field9854, class622.field8296);
            class226.field3216 = new class696(class683.field9532, class713.field9854, class423.field5827, class13.field205);
            class417.field5754 = new class172(class683.field9532, class713.field9854, class622.field8296);
            class622.field8287 = new class228(class683.field9532, class713.field9854, class622.field8296);
            class202.field3032 = new class261(class683.field9532, class713.field9854, class622.field8296);
            class224.field3172 = new class455(class683.field9532, class713.field9854, class466.field6413);
            class70.field854 = new class724(class683.field9532, class713.field9854, class622.field8296);
            class204.method1367((byte) -11, class13.field205, class275.field3836, class84.field1023, class6.field138);
            class309.method1904(101, class434.field5973);
            class114.field1871 = new class349(class713.field9854, class382.field5304, class53.field654);
            class658.field8695 = new class610(class713.field9854, class382.field5304, class53.field654, new class713());
            class197.method1339((byte) -62);
            class462.field6333.method2015((byte) -88, ~class411.field5711.field3890.method984(true) == -1);
            class74.field901 = new class723();
            class505.method2837((byte) 85);
            class448.method2567((byte) -43, class534.field7038);
            class595.method3233(class252.field3474, class13.field205, (byte) 126);
            class43 var21 = new class43(class469.field6433.method2204("", "huffman", (byte) 98));
            class295.method1828((byte) 124, var21);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class238.field3352 = class148.method1110((byte) 123);
            class136.field2170 = new class648(true, class66.field828);
        }
        if (class258.field3537 == class21.field382) {
            int var22 = method4129(1, class84.field1023) + class607.method3296(true, (byte) 99);
            int var23 = class33.method276(-117) + class326.method1972(99);
            if (var23 > var22) {
                return var22 * 100 / var23;
            }
        }
        if (class258.field3537 == class21.field383) {
            class744.method4158(class135.field2156, class69.field845, class708.field9822, class462.field6333, class361.field5088, class468.field6426, class74.field901);
        }
        if (class258.field3537 == class21.field384) {
            class92.field1119 = new String[class622.field8287.field3258];
            class540.field7160 = new int[class202.field3032.field3638];
            class763.field10629 = new boolean[class202.field3032.field3638];
            for (int var24 = 0; class202.field3032.field3638 > var24; ++var24) {
                if (class202.field3032.method1580(var24, (byte) -124).field7683 == 0) {
                    class763.field10629[var24] = true;
                    ++class679.field9481;
                }
                class540.field7160[var24] = -1;
            }
            class485.method2738(arg0 + -46359);
            class226.field3226 = class6.field138.method2223((byte) 65, "loginscreen");
            class555.field7299 = class6.field138.method2223((byte) 88, "lobbyscreen");
            class265.field3699.method2222((byte) 1, true, false);
            class165.field2501.method2222((byte) 1, true, true);
            class84.field1023.method2222((byte) 1, true, true);
            class275.field3836.method2222((byte) 1, true, true);
            class469.field6433.method2222((byte) 1, true, true);
            class6.field138.method2222((byte) 1, true, true);
            class622.field8296.field5225 = 2;
            class4.field116 = true;
            class352.field4951.field5225 = 2;
            class654.field8670.field5225 = 2;
            class324.field4602.field5225 = 2;
            class254.field3491.field5225 = 2;
            class187.field2825.field5225 = 2;
            class423.field5827.field5225 = 2;
        }
        if (class258.field3537 == class21.field385) {
            if (!class435.method2502(class226.field3226, (byte) -22)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; ~var26 > ~class747.field10393[class226.field3226].length; ++var26) {
                class672 var27 = class747.field10393[class226.field3226][var26];
                if (~var27.field9239 == -6 && var27.field9209 != -1 && !class84.field1023.method2211(64, 0, var27.field9209)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (class258.field3537 == class21.field386) {
            class702.method3951(-94, true);
        }
        if (class258.field3537 == class21.field387) {
            class549.field7251.method1275(1);
            try {
                class401.field5596.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class709.field9836 = null;
            class381.field5297 = null;
            class549.field7251 = null;
            class259.field3616 = null;
            class401.field5596 = null;
            class258.field3599 = null;
            class596.method3240(false);
            class604.field7946 = class411.field5711.field3885.method1399(true) == 1;
            class411.field5711.method1677(class411.field5711.field3885, (byte) -71, 1);
            if (!class604.field7946) {
                if (class411.field5711.field3877.field7924 && class136.field2170.field8620 < 512 && ~class136.field2170.field8620 != -1) {
                    class411.field5711.method1677(class411.field5711.field3877, (byte) -71, 0);
                }
            } else {
                class411.field5711.method1677(class411.field5711.field3877, (byte) -71, 0);
            }
            class2.method15(17458);
            if (class604.field7946) {
                class421.method2435(false, 90, 0);
            } else {
                class421.method2435(false, -53, class411.field5711.field3877.method3282(true));
            }
            class554.method3084(false, class411.field5711.field3901.method2537(true), -1, -1, -1);
            class466.method2639(0, class341.field4807);
            class286.method1772((byte) -106, class341.field4807);
            class190.method1297(9749, class84.field1023, class341.field4807);
            class431.method2486(class679.field9485, 54);
        }
        if (arg0 != 27933) {
            method4127((byte) -79);
        }
        return class609.method3323(-53);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)I", line = 634)
    public final int method68(boolean arg0) {
        ++field10217;
        return arg0 ? -118 : 1;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZI)V", line = 648)
    public final void method67(boolean arg0, int arg1) {
        super.field6170 = arg1;
        if (arg0) {
            ++field10212;
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lup;)V", line = 661)
    public class741(class278 arg0) {
        super(arg0);
    }
}
