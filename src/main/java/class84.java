import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class84 extends class279 {

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "Lgb;")
    public static class212 field1310 = new class212(4);

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "Ltl;")
    public static class59 field1314 = class85.method639("::wm0", 9588);

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "Ltl;")
    private static class59 field1318 = class85.method639("Allocated memory", 9588);

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static int field1317 = -1;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "Ltl;")
    public static class59 field1319 = field1318;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "Ltl;")
    private static class59 field1324 = class85.method639("Loaded wordpack", 9588);

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "Ltl;")
    public static class59 field1323 = field1324;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "I")
    public static int field1321 = 0;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "Lgm;")
    public static class229 field1316;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "[Lm;")
    private class223[] field1313;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)I", line = 11)
    public static final int method627(int arg0) {
        int var1 = 112 / ((26 - arg0) / 53);
        field1308++;
        return ((class228.field3686 == 0 ? 0 : 1) << 20) + ((class227.field3666 & 0x3) << 17) + ((class148.field2429 ? 1 : 0) << 16) + ((class67.field1036 ? 1 : 0) << 9) + ((class94.field1452 ? 1 : 0) << 8) + ((class300.field5124 ? 1 : 0) << 7) + ((class131.field2163 ? 1 : 0) << 6) + ((class198.field3288 ? 1 : 0) << 5) + ((class199.field3298 ? 1 : 0) << 3) + ((class128.field2092 & 0x7) - -((class228.field3683 ? 1 : 0) << 4) + (((class266.field4584 ? 1 : 0) << 10) - -((class268.field4658 & 0x3) << 11)) - -((class308.field5243 ? 1 : 0) << 13) - -((class193.field3216 ? 1 : 0) << 15) - -((class146.field2386 ? 1 : 0) << 19)) + (((class99.field1600 == 0 ? 0 : 1) << 21) - -((class191.field3198 == 0 ? 0 : 1) << 22));
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(II)V", line = 20)
    public static final void method628(int arg0, int arg1) {
        class306.field5194 = 50;
        class285.field4894 = arg1;
        field1303++;
        if (arg0 > -25) {
            field1319 = (class59) null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[[I)V", line = 37)
    private final void method629(int arg0, int[][] arg1) {
        field1306++;
        int var3 = class56.field835;
        if (arg0 != -1) {
            return;
        }
        int var4 = class284.field4887;
        class224.method1547(arg1, false);
        class264.method1826(18952, class132.field2197, 0, 0, class310.field5270);
        if (this.field1313 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field1313.length; var5++) {
            class223 var6 = this.field1313[var5];
            int var7 = var6.field3618;
            int var8 = var6.field3608;
            if (var7 >= 0) {
                if (var8 < 0) {
                    var6.method1148(var3, var4, -59);
                } else {
                    var6.method1149(var4, -5, var3);
                }
            } else if (var8 >= 0) {
                var6.method1144(var4, var3, -19486);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)V", line = 90)
    public static final void method630(int arg0) {
        field1311++;
        class278.method1953();
        class275.field4729 = new class203[7];
        class275.field4729[1] = new class112();
        class275.field4729[2] = new class241();
        if (arg0 == 0) {
            class275.field4729[3] = new class76();
            class275.field4729[4] = new class256();
            class275.field4729[5] = new class25();
            class275.field4729[6] = new class2();
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V", line = 107)
    public class84() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)[[I", line = 125)
    public final int[][] method87(int arg0, int arg1) {
        if (arg0 != -7523) {
            this.method44(true, 82);
        }
        int[][] var3 = this.field4786.method1427(0, arg1);
        field1304++;
        if (this.field4786.field3297) {
            int var4 = class284.field4887;
            int var5 = class56.field835;
            int[][][] var6 = this.field4786.method1429(-2);
            int[][] var7 = new int[var4][var5];
            this.method629(arg0 + 7522, var7);
            for (int var8 = 0; var8 < class284.field4887; var8++) {
                int[][] var9 = var6[var8];
                int[] var10 = var9[0];
                int[] var11 = var7[var8];
                int[] var12 = var9[1];
                int[] var13 = var9[2];
                for (int var14 = 0; var14 < class56.field835; var14++) {
                    int var15 = var11[var14];
                    var13[var14] = class93.method680(255, var15) << 4;
                    var12[var14] = class93.method680(4080, var15 >> 4);
                    var10[var14] = class93.method680(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILs;)V", line = 181)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg0 > -125) {
            this.method629(-108, (int[][]) ((int[][]) null));
        }
        field1309++;
        if (arg1 == 0) {
            this.field1313 = new class223[arg2.method1221(94)];
            for (int var4 = 0; var4 < this.field1313.length; var4++) {
                int var5 = arg2.method1221(98);
                if (var5 == 0) {
                    this.field1313[var4] = class102.method774(-65536, arg2);
                } else if (var5 == 1) {
                    this.field1313[var4] = class116.method872(arg2, -91);
                } else if (var5 == 2) {
                    this.field1313[var4] = class152.method1094(-76, arg2);
                } else if (var5 == 3) {
                    this.field1313[var4] = class245.method1735(arg2, 0);
                }
            }
        } else if (arg1 == 1) {
            this.field4789 = arg2.method1221(115) == 1;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)[I", line = 260)
    public final int[] method44(boolean arg0, int arg1) {
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (this.field4781.field354) {
            this.method629(-1, this.field4781.method172(-4532));
        }
        if (arg0) {
            return (int[]) null;
        } else {
            field1305++;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIB)Llb;", line = 280)
    public static final class297 method631(int arg0, int arg1, int arg2, byte arg3) {
        class297 var4 = new class297();
        field1307++;
        var4.field5084 = arg2;
        var4.field5089 = arg1;
        class190.field3181.method694(var4, (byte) -90, (long) arg0);
        class137.method999(arg1, false);
        class263 var5 = class247.method1738(false, arg0);
        if (var5 != null) {
            class140.method1019(var5, (byte) 104);
        }
        if (class65.field998 != null) {
            class140.method1019(class65.field998, (byte) -111);
            class65.field998 = null;
        }
        int var6 = class231.field3803;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class185.method1373(class27.field363[var7], 18979)) {
                class264.method1832(-44, var7);
            }
        }
        if (arg3 < 26) {
            return (class297) null;
        }
        if (class231.field3803 == 1) {
            class85.field1336 = false;
            class120.method895(class105.field1736, (byte) 1, class247.field4117, class162.field2640, class1.field4);
        } else {
            class120.method895(class105.field1736, (byte) 1, class247.field4117, class162.field2640, class1.field4);
            int var8 = class251.field4187.method705(class275.field4741);
            for (int var9 = 0; var9 < class231.field3803; var9++) {
                int var10 = class251.field4187.method705(class224.method1546(var9, (byte) 126));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class162.field2640 = class231.field3803 * 15 + 22;
            class105.field1736 = var8 + 8;
        }
        if (var5 != null) {
            class173.method1273(var5, -20833, false);
        }
        class243.method1727(arg1, 4387);
        if (class262.field4364 != -1) {
            class155.method1108((byte) -118, class262.field4364, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)V", line = 362)
    public static void method632(int arg0) {
        field1319 = null;
        field1310 = null;
        field1324 = null;
        field1316 = null;
        if (arg0 != -1) {
            field1310 = (class212) null;
        }
        field1318 = null;
        field1314 = null;
        field1323 = null;
    }
}
