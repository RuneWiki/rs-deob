import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public abstract class class50 extends class421 {

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public int field1004;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public int field1007;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field1000 = 0;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "Ls;")
    public static class186 field998 = new class186(40, 7);

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "Lbj;")
    public static class162 field1006 = new class162(30, 7);

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "[I")
    public static int[] field1008 = new int[2];

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "Lwm;")
    public static class399 field1009 = new class399(50);

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "(I)V")
    public static void method469(int arg0) {
        field998 = null;
        field1009 = null;
        field1006 = null;
        if (arg0 > -52) {
            method470(73L, 23);
        }
        field1008 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(JI)V")
    public static final void method470(long arg0, int arg1) {
        field1003++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg1 != -5) {
            method470(-122L, 21);
        }
        if (arg0 % 10L == 0L) {
            class33.method226(-6351, arg0 - 1L);
            class33.method226(arg1 ^ 0x18CA, 1L);
        } else {
            class33.method226(-6351, arg0);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBI)I")
    public static final int method471(int arg0, byte arg1, int arg2) {
        field1001++;
        int var3 = 35 % ((-arg1 - 5) / 32);
        int var4 = arg2 >>> 31;
        return (arg2 + var4) / arg0 - var4;
    }

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "(I)V")
    public static final void method472(int arg0) {
        class525.method3105((byte) 103, false);
        field999++;
        class429.field6411 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class533.field7730.length; var2++) {
            if (class77.field1551[var2] != -1 && class533.field7730[var2] == null) {
                class533.field7730[var2] = class361.field5290.method2757(class77.field1551[var2], 0, (byte) -125);
                if (class533.field7730[var2] == null) {
                    var1 = false;
                    class429.field6411++;
                }
            }
            if (class236.field3639[var2] != -1 && class96.field1883[var2] == null) {
                class96.field1883[var2] = class361.field5290.method2758(class236.field3639[var2], 0, class509.method3048(arg0, -1924904678), class321.field4905[var2]);
                if (class96.field1883[var2] == null) {
                    var1 = false;
                    class429.field6411++;
                }
            }
            if (class204.field3272[var2] != -1 && class386.field5634[var2] == null) {
                class386.field5634[var2] = class361.field5290.method2757(class204.field3272[var2], 0, (byte) -127);
                if (class386.field5634[var2] == null) {
                    class429.field6411++;
                    var1 = false;
                }
            }
            if (class383.field5600[var2] != -1 && class299.field4526[var2] == null) {
                class299.field4526[var2] = class361.field5290.method2757(class383.field5600[var2], 0, (byte) -123);
                if (class299.field4526[var2] == null) {
                    var1 = false;
                    class429.field6411++;
                }
            }
            if (class110.field2006 != null && class87.field1782[var2] == null && class110.field2006[var2] != -1) {
                class87.field1782[var2] = class361.field5290.method2758(class110.field2006[var2], 0, -2, class321.field4905[var2]);
                if (class87.field1782[var2] == null) {
                    var1 = false;
                    class429.field6411++;
                }
            }
        }
        if (class256.field3933 == null) {
            if (class434.field6468 == null || !class449.field6678.method2737(class434.field6468.field3092 + "_staticelements", arg0 - 1924904676)) {
                class256.field3933 = new class344(0);
            } else if (class449.field6678.method2732(2, class434.field6468.field3092 + "_staticelements")) {
                class256.field3933 = class493.method2976(class434.field6468.field3092 + "_staticelements", class449.field6678, 0, class7.field110);
            } else {
                class429.field6411++;
                var1 = false;
            }
        }
        if (!var1) {
            class105.field1967 = 1;
            return;
        }
        class299.field4527 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class533.field7730.length; var4++) {
            byte[] var19 = class96.field1883[var4];
            if (var19 != null) {
                int var20 = (class58.field1227[var4] >> 8) * 64 - class496.field7292;
                int var21 = (class58.field1227[var4] & 0xFF) * 64 - class212.field3378;
                if (class506.field7382 != 0) {
                    var21 = 10;
                    var20 = 10;
                }
                var3 &= class238.method1552(var19, var21, var20, class484.field7129, 117, class339.field5099);
            }
            byte[] var22 = class299.field4526[var4];
            if (var22 != null) {
                int var23 = (class58.field1227[var4] >> 8) * 64 - class496.field7292;
                int var24 = (class58.field1227[var4] & 0xFF) * 64 - class212.field3378;
                if (class506.field7382 != 0) {
                    var24 = 10;
                    var23 = 10;
                }
                var3 &= class238.method1552(var22, var24, var23, class484.field7129, 116, class339.field5099);
            }
        }
        if (!var3) {
            class105.field1967 = 2;
            return;
        }
        if (class105.field1967 != 0) {
            class361.method2216((byte) -59, true, class470.field6980, class166.field2685.method1977(class146.field2452, -64) + "<br>(100%)");
        }
        class42.method255(-68);
        class170.method1191(arg0 ^ 0x72BBC84F);
        boolean var5 = false;
        if (class262.field4006.method329() && class186.field2990.field2538) {
            for (int var6 = 0; var6 < class533.field7730.length; var6++) {
                if (class299.field4526[var6] != null || class386.field5634[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class186.field2990.field2533) {
            var7 = class144.field2436[class132.field2213];
        } else {
            var7 = class479.field7062[class132.field2213];
        }
        if (class262.field4006.method270()) {
            var7++;
        }
        class484.method2903(7, 4, class339.field5099, class484.field7129, var7, var5, class262.field4006.method403() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class67.field1367[var8].method555((byte) -101);
        }
        class520.method3083(0);
        class48.method463(false, true);
        class144.method1071((byte) -124);
        class299.field4519 = null;
        class42.method255(arg0 ^ 0x72BBB6A4);
        System.gc();
        class525.method3105((byte) -116, true);
        class446.method2667(15130);
        class230.field3567 = class186.field2990.method1130(class133.field2236, 88);
        class446.field6644 = class186.field2990.field2538;
        class27.field443 = class370.field5418 >= 96;
        if (arg0 != 1924904676) {
            method471(92, (byte) 59, 120);
        }
        class521.field7571 = class186.field2990.method1129(0, class133.field2236);
        class309.field4692 = !class186.field2990.field2541;
        class179.field2882 = class186.field2990.method1783(-1, class133.field2236) ? -1 : class419.field6303;
        class218.field3421 = class133.field2236 == 1 || class186.field2990.field2557;
        class107.field1984 = class186.field2990.field2531;
        class235.field3626 = new class474(4, class339.field5099, class484.field7129, false);
        if (class506.field7382 == 0) {
            class150.method1103(class533.field7730, class235.field3626, 64);
        } else {
            class113.method943(class533.field7730, class235.field3626, arg0 ^ 0x72BBB6DB);
        }
        class398.method2466(class339.field5099 >> 4, class484.field7129 >> 4, true);
        class119.method965(3443);
        if (var5) {
            class124.method985(true);
            class314.field4723 = new class474(1, class339.field5099, class484.field7129, true);
            if (class506.field7382 == 0) {
                class150.method1103(class386.field5634, class314.field4723, arg0 - 1924904612);
                class525.method3105((byte) -103, true);
            } else {
                class113.method943(class386.field5634, class314.field4723, 114);
                class525.method3105((byte) 63, true);
            }
            class314.field4723.method582(class235.field3626.field1355[0], (byte) -46, 0);
            class314.field4723.method579(class262.field4006, null, null, (byte) -84);
            class124.method985(false);
        }
        class235.field3626.method579(class262.field4006, class67.field1367, var5 ? class314.field4723.field1355 : null, (byte) 48);
        if (class506.field7382 == 0) {
            class525.method3105((byte) 86, true);
            class78.method700(class235.field3626, class96.field1883, arg0 ^ 0x72BBB61B);
            if (class87.field1782 != null) {
                class358.method2205(71);
            }
        } else {
            class525.method3105((byte) 71, true);
            class36.method247(class96.field1883, 279141032, class235.field3626);
        }
        class170.method1191(32427);
        class525.method3105((byte) 118, true);
        class235.field3626.method584(null, class262.field4006, var5 ? class293.field4481[0] : null, (byte) -45);
        class235.field3626.method2838((byte) -104, class262.field4006);
        class525.method3105((byte) -55, true);
        if (var5) {
            class124.method985(true);
            class525.method3105((byte) 124, true);
            if (class506.field7382 == 0) {
                class78.method700(class314.field4723, class299.field4526, arg0 - 1924904421);
            } else {
                class36.method247(class299.field4526, 279141032, class314.field4723);
            }
            class170.method1191(32427);
            class525.method3105((byte) -64, true);
            class314.field4723.method584(class531.field7727[0], class262.field4006, null, (byte) -45);
            class314.field4723.method2838((byte) -104, class262.field4006);
            class525.method3105((byte) -65, true);
            class124.method985(false);
        }
        class84.method786((byte) -62);
        int var9 = class235.field3626.field7025;
        if (class211.field3371 < var9) {
            var9 = class211.field3371;
        }
        if ((class211.field3371 - 1) > var9) {
            var9 = class211.field3371 - 1;
        }
        if (class186.field2990.method1783(-1, class133.field2236)) {
            class205.method1404(0);
        } else {
            class205.method1404(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class339.field5099; var17++) {
                for (int var18 = 0; var18 < class484.field7129; var18++) {
                    class502.method3023(var10, var18, var17, -29969);
                }
            }
        }
        class4.method32((byte) -119);
        class42.method255(-76);
        class105.method904(24);
        class170.method1191(32427);
        class237.field3652 = false;
        class491.method2965(14968);
        if (class97.field1889 != null && class216.field3417 != null && class466.field6932 == 10) {
            class475.field7040++;
            class459.method2765(class391.field5879, (byte) 87);
            class335.field5062.method1862((byte) -115, 1057001181);
        }
        if (class506.field7382 == 0) {
            int var11 = (class49.field995 - (class339.field5099 >> 4)) / 8;
            int var12 = (class49.field995 + (class339.field5099 >> 4)) / 8;
            int var13 = (class266.field4039 - (class484.field7129 >> 4)) / 8;
            int var14 = ((class484.field7129 >> 4) + class266.field4039) / 8;
            for (int var15 = var11 - 1; var15 <= var12 + 1; var15++) {
                for (int var16 = var13 - 1; var16 <= var14 + 1; var16++) {
                    if (var11 > var15 || var12 < var15 || var13 > var16 || var16 > var14) {
                        class361.field5290.method2747((byte) 20, "m" + var15 + "_" + var16);
                        class361.field5290.method2747((byte) 20, "l" + var15 + "_" + var16);
                    }
                }
            }
        }
        if (class466.field6932 == 3) {
            class253.method1639(2, arg0 - 1924921322);
        } else if (class466.field6932 == 7) {
            class253.method1639(6, -16646);
        } else {
            class253.method1639(9, -16646);
            if (class216.field3417 != null) {
                class459.method2765(class492.field7208, (byte) 87);
            }
        }
        class496.method2999(false);
        class42.method255(76);
        class175.method1208((byte) 36);
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(IIII)V")
    public class50(int arg0, int arg1, int arg2, int arg3) {
        this.field1005 = arg2;
        this.field1004 = arg1;
        this.field1002 = arg0;
        this.field1007 = arg3;
    }
}
