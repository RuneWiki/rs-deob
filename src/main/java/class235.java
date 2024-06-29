import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class235 extends class4 {

    @OriginalMember(owner = "client!we", name = "E", descriptor = "[J")
    private long[] field4379 = new long[10];

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    private int field4360 = 1;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    private int field4369 = 0;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    private int field4373 = 256;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "J")
    private long field4375 = class27.method193((byte) 101);

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Lvc;")
    public static class223 field4364 = null;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "Ldj;")
    private static class44 field4367 = class89.method650(255, "Error loading your profile)3");

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Ldj;")
    public static class44 field4365 = class89.method650(255, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!we", name = "v", descriptor = "Ldj;")
    public static class44 field4370 = field4367;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "Ldj;")
    public static class44 field4378 = class89.method650(255, ")4l");

    @OriginalMember(owner = "client!we", name = "C", descriptor = "Ldj;")
    public static class44 field4377 = class89.method650(255, "<col=40ff00>");

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    private int field4372;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Lwf;")
    public static class236 field4361;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Laa;")
    public static final class2 method1531(int arg0, int arg1) {
        class2 var2 = (class2) class152.field2646.method1178((long) arg1, 14176);
        field4363++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class58.field1091.method1466(class151.method975(arg1, (byte) -104), class222.method1431(-128, arg1), (byte) -127);
        class2 var4 = new class2();
        if (arg0 < 23) {
            method1533(113);
        }
        if (var3 != null) {
            var4.method9((byte) 88, new class66(var3));
        }
        class152.field2646.method1183((byte) 111, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BII)I")
    public final int method25(byte arg0, int arg1, int arg2) {
        int var4 = this.field4373;
        field4362++;
        this.field4373 = 300;
        int var5 = this.field4360;
        this.field4360 = 1;
        this.field4375 = class27.method193((byte) 88);
        if (this.field4379[this.field4372] == 0L) {
            this.field4360 = var5;
            this.field4373 = var4;
        } else if (this.field4379[this.field4372] < this.field4375) {
            this.field4373 = (int) ((long) (arg1 * 2560) / (this.field4375 - this.field4379[this.field4372]));
        }
        if (this.field4373 < 25) {
            this.field4373 = 25;
        }
        if (this.field4373 > 256) {
            this.field4373 = 256;
            this.field4360 = (int) ((long) arg1 - (this.field4375 - this.field4379[this.field4372]) / 10L);
        }
        if (this.field4360 > arg1) {
            this.field4360 = arg1;
        }
        this.field4379[this.field4372] = this.field4375;
        this.field4372 = (this.field4372 + 1) % 10;
        if (this.field4360 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field4379[var6] != 0L) {
                    this.field4379[var6] += this.field4360;
                }
            }
        }
        if (this.field4360 < arg2) {
            this.field4360 = arg2;
        }
        class82.method617((byte) 31, (long) this.field4360);
        int var7 = 0;
        while (this.field4369 < 256) {
            this.field4369 += this.field4373;
            var7++;
        }
        this.field4369 &= 0xFF;
        if (arg0 != 53) {
            field4370 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)I")
    public static final int method1532(int arg0, int arg1) {
        int var2 = -54 / ((arg0 + 35) / 45);
        int var8 = arg1 - 1;
        field4376++;
        int var3 = var8 | var8 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public final void method28(int arg0) {
        int var2 = -102 / ((2 - arg0) / 39);
        for (int var3 = 0; var3 < 10; var3++) {
            this.field4379[var3] = 0L;
        }
        field4374++;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
    public static final void method1533(int arg0) {
        field4366++;
        if (class5.field75 == null) {
            return;
        }
        if (class154.field2679 < 10) {
            if (!class146.field2576.method1455(class5.field75, (byte) -93)) {
                class154.field2679 = class146.field2576.method1454((byte) -33, class5.field75) / 10;
                return;
            }
            class154.field2679 = 10;
        }
        if (class154.field2679 == 10) {
            class66 var1 = new class66(class146.field2576.method1471(-26651, class129.field2290, class5.field75));
            int var2 = var1.method500(127);
            int var3 = var1.method500(106);
            int var4 = var1.method500(46);
            int var5 = var1.method500(65);
            int var6 = var1.method500(123);
            int var7 = var1.method500(61);
            int var8 = class192.field3331 >> 2 << 10;
            class31.field544 = new int[class170.field2939 + 1];
            class168.field2896 = (var4 + 1 - var2) * 64;
            class202.field3601 = 8.0D;
            class32.field565 = 8.0D;
            class198.field3502 = var2 * 64;
            int var9 = (class96.field1774.field2260 >> 7) + class222.field4020 - class198.field3502;
            int var10 = var9 + (int) (Math.random() * 10.0D) - 5;
            int var11 = class102.field1863 >> 1;
            class136.field2431 = var3 * 64;
            int var12 = class168.field2896 >> 6;
            int var13 = (class96.field1774.field2195 >> 7) + class143.field2550 - class136.field2431;
            class214.field3851 = (var5 - var3) * 64 + 64;
            int var14 = var13 + (int) (Math.random() * 10.0D) - 5;
            int var15 = class214.field3851 >> 6;
            class72.field1378 = new int[var12][var15][];
            class79.field1535 = new byte[var12][var15][];
            class95.field1772 = new int[var12][var15][];
            if (var10 >= 0 && class168.field2896 > var10 && var14 >= 0 && var14 < class214.field3851) {
                class2.field38 = var10;
                class3.field46 = class214.field3851 - var14;
            } else {
                class3.field46 = class136.field2431 + class214.field3851 - var7 * 64;
                class2.field38 = var6 * 64 - class198.field3502;
            }
            class170.field2968 = new byte[var12][var15][];
            class225.field4218 = new byte[var12][var15][];
            class30.field541 = new byte[var12][var15][];
            class180.field3121 = new byte[var12][var15][];
            class228.field4281 = new byte[var12][var15][];
            for (int var16 = 0; var16 < class170.field2939; var16++) {
                class172 var17 = class61.method461(false, var16);
                if (var17 != null) {
                    int var18 = var17.field3001;
                    if (var18 >= 0 && !class206.field3689.method368(20, var18)) {
                        var18 = -1;
                    }
                    int var22;
                    if (var17.field2994 >= 0) {
                        int var19 = var17.field2994;
                        int var20 = (var19 & 0x7F) + var11;
                        if (var20 < 0) {
                            var20 = 0;
                        } else if (var20 > 127) {
                            var20 = 127;
                        }
                        int var21 = (var19 & 0x380) + (var19 + var8 & 0xFC00) + var20;
                        var22 = class206.field3697[class140.method938(96, var21, -19608)];
                    } else if (var18 >= 0) {
                        var22 = class206.field3697[class140.method938(96, class206.field3689.method369(var18, (byte) -116), -19608)];
                    } else if (var17.field3005 == -1) {
                        var22 = -1;
                    } else {
                        int var23 = var17.field3005;
                        int var24 = (var23 & 0x7F) + var11;
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 > 127) {
                            var24 = 127;
                        }
                        int var25 = (var8 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                        var22 = class206.field3697[class140.method938(96, var25, -19608)];
                    }
                    class31.field544[var16 + 1] = var22;
                }
            }
            class154.field2679 = 20;
        } else if (class154.field2679 == 20) {
            class75.method585(class146.field2576.method1471(-26651, class33.field572, class5.field75), -1059288212);
            class154.field2679 = 30;
            class54.method386(-109);
        } else if (class154.field2679 == 30) {
            class224.method1450(255, class146.field2576.method1471(-26651, class162.field2797, class5.field75));
            class154.field2679 = 50;
            class54.method386(-11);
        } else if (class154.field2679 == 50) {
            class101.method751((byte) -69, class146.field2576.method1471(-26651, class173.field3009, class5.field75));
            class154.field2679 = 70;
            class54.method386(-14);
        } else if (class154.field2679 == 70) {
            class83.method628(-106, class146.field2576.method1471(-26651, class216.field3936, class5.field75));
            class154.field2679 = 90;
            class54.method386(-115);
        } else {
            class62.method469(class146.field2576.method1471(-26651, class33.field575, class5.field75), -106);
            if (class154.field2679 == 90) {
                class200.field3538 = new class233(11, true, class8.field172);
                class124.field2229 = new class233(12, true, class8.field172);
                class64.field1185 = new class233(14, true, class8.field172);
                class52.field937 = new class233(17, true, class8.field172);
                class73.field1391 = new class233(19, true, class8.field172);
                class5.field78 = new class233(22, true, class8.field172);
                class101.field1848 = new class233(26, true, class8.field172);
                class208.field3733 = new class233(30, true, class8.field172);
                class154.field2679 = 100;
            }
            class154.field2679 = 100;
            class54.field994 = -1;
            int var26 = -6 / ((arg0 - 21) / 32);
            class77.field1495 = -1;
            class54.method386(-35);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(I)V")
    public static void method1534(int arg0) {
        field4361 = null;
        field4364 = null;
        field4377 = null;
        if (arg0 != 896) {
            method1535(-100, -62, -102, -61);
        }
        field4378 = null;
        field4365 = null;
        field4367 = null;
        field4370 = null;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class235() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field4379[var1] = this.field4375;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)I")
    public static final int method1535(int arg0, int arg1, int arg2, int arg3) {
        field4371++;
        if ((arg3 & class47.field875[arg1][arg0][arg2]) == 0) {
            return arg1 <= 0 || (class47.field875[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIZZBZ)Lod;")
    public static final class155 method1536(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, byte arg6, boolean arg7) {
        field4368++;
        class214 var8 = class192.method1227(-31700, arg2);
        if (arg1 > 1 && var8.field3875 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field3862[var10] <= arg1 && var8.field3862[var10] != 0) {
                    var9 = var8.field3875[var10];
                }
            }
            if (var9 != -1) {
                var8 = class192.method1227(-31700, var9);
            }
        }
        class6 var11 = var8.method1387(true);
        if (var11 == null) {
            return null;
        }
        class155 var12 = null;
        if (var8.field3864 != -1) {
            var12 = method1536(1, 10, var8.field3832, 0, true, true, (byte) -128, false);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field3866 != -1) {
            var12 = method1536(arg0, arg1, var8.field3843, arg3, false, true, (byte) -88, false);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class99.field1823;
        int[] var14 = new int[4];
        int var15 = class99.field1818;
        int var16 = class99.field1822;
        if (arg6 > -87) {
            field4364 = null;
        }
        class99.method702(var14);
        class155 var17 = new class155(36, 32);
        class99.method705(var17.field2691, 36, 32);
        class99.method692();
        class206.method1345();
        class206.method1328(16, 16);
        class206.field3699 = false;
        if (var8.field3866 != -1) {
            var12.method1010(0, 0);
        }
        int var18 = var8.field3892;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg0 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class206.field3684[var8.field3877] * var18 >> 16;
        int var20 = class206.field3700[var8.field3877] * var18 >> 16;
        var11.method47(0, var8.field3846, var8.field3890, var8.field3877, var8.field3856, var19 + var8.field3850 - var11.method67() / 2, var8.field3850 + var20);
        if (var8.field3866 == -1) {
            if (arg0 >= 1) {
                var17.method1011(1);
            }
            if (arg0 >= 2) {
                var17.method1011(16777215);
            }
            if (arg3 != 0) {
                var17.method1019(arg3);
            }
        }
        class99.method705(var17.field2691, 36, 32);
        if (var8.field3864 != -1) {
            var12.method1010(0, 0);
        }
        if (arg7 && (var8.field3853 == 1 || arg1 != 1) && arg1 != -1) {
            class108.field1974.method428(class214.method1384(-48, arg1), 0, 9, 16776960, 1);
        }
        class99.method705(var13, var15, var16);
        class99.method691(var14);
        class206.method1345();
        class206.field3699 = true;
        return var17;
    }
}
