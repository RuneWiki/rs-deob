import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 extends class99 {

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field850 = 0;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "Lr;")
    private static class118 field851 = class153.method1136(83, "Checking for updates )2 ");

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field847 = 0;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "Lr;")
    public static class118 field857 = field851;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "Lr;")
    private static class118 field849 = class153.method1136(102, "Your account has been disabled)3");

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    public static volatile int field853 = -1;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "Lr;")
    public static class118 field855 = class153.method1136(100, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "Lr;")
    public static class118 field860 = field849;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "Lr;")
    private static class118 field846 = class153.method1136(104, "glow1:");

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "Lr;")
    public static class118 field858 = field846;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "Lr;")
    public static class118 field854 = field846;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "J")
    public static long field852;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "Ljc;")
    public class65 field865;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "Ljf;")
    public class68 field863;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "Ljava/awt/Image;")
    public static Image field856;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "[B")
    public byte[] field845;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)V")
    public static void method281(byte arg0) {
        field854 = null;
        field857 = null;
        field849 = null;
        field856 = null;
        field846 = null;
        field855 = null;
        if (arg0 != 103) {
            method285(false, null);
        }
        field858 = null;
        field851 = null;
        field860 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)V")
    public static final void method282(byte arg0, int arg1) {
        field859++;
        class153.field3458 += arg1 * 128;
        if (class153.field3458 > class43.field1041.length) {
            class153.field3458 -= class43.field1041.length;
            int var2 = (int) (Math.random() * 12.0D);
            class66.method572(class124.field2842[var2], -105);
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var3 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var28 = class158.field3647[var4 + var5] - class43.field1041[class43.field1041.length - 1 & var4 - -class153.field3458] * arg1 / 6;
            if (var28 < 0) {
                var28 = 0;
            }
            class158.field3647[var4++] = var28;
        }
        for (int var8 = var3 - arg1; var8 < var3; var8++) {
            int var25 = var8 * 128;
            for (int var26 = 0; var26 < 128; var26++) {
                int var27 = (int) (Math.random() * 100.0D);
                if (var27 < 50 && var26 > 10 && var26 < 118) {
                    class158.field3647[var26 + var25] = 255;
                } else {
                    class158.field3647[var25 + var26] = 0;
                }
            }
        }
        if (class69.field1599 > 0) {
            class69.field1599 -= arg1 * 4;
        }
        if (class42.field1006 > 0) {
            class42.field1006 -= arg1 * 4;
        }
        int var9 = 127 % (-arg0 / 50);
        if (class42.field1006 == 0 && class69.field1599 == 0) {
            int var10 = (int) ((double) (2000 / arg1) * Math.random());
            if (var10 == 0) {
                class42.field1006 = 1024;
            }
            if (var10 == 1) {
                class69.field1599 = 1024;
            }
        }
        for (int var11 = 0; var11 < var3 - arg1; var11++) {
            class45.field1080[var11] = class45.field1080[var11 + arg1];
        }
        for (int var12 = var3 - arg1; var12 < var3; var12++) {
            class45.field1080[var12] = (int) (Math.sin((double) class101.field2339 / 14.0D) * 16.0D + Math.sin((double) class101.field2339 / 15.0D) * 14.0D + Math.sin((double) class101.field2339 / 16.0D) * 12.0D);
            class101.field2339++;
        }
        class72.field1678 += arg1;
        int var13 = ((class65.field1479 & 0x1) + arg1) / 2;
        if (var13 <= 0) {
            return;
        }
        for (int var14 = 0; var14 < class72.field1678 * 100; var14++) {
            int var23 = (int) (Math.random() * 124.0D) + 2;
            int var24 = (int) (Math.random() * 128.0D) + 128;
            class158.field3647[var23 + (var24 << 7)] = 192;
        }
        class72.field1678 = 0;
        for (int var15 = 0; var15 < var3; var15++) {
            int var20 = 0;
            int var21 = var15 * 128;
            for (int var22 = -var13; var22 < 128; var22++) {
                if (var22 + var13 < 128) {
                    var20 += class158.field3647[var13 + var21 + var22];
                }
                if (var22 - var13 - 1 >= 0) {
                    var20 -= class158.field3647[var21 + var22 - var13 - 1];
                }
                if (var22 >= 0) {
                    class35.field890[var21 + var22] = var20 / (var13 * 2 + 1);
                }
            }
        }
        for (int var16 = 0; var16 < 128; var16++) {
            int var17 = 0;
            for (int var18 = -var13; var18 < var3; var18++) {
                int var19 = var18 * 128;
                if (var3 > var13 + var18) {
                    var17 += class35.field890[var16 + var19 + var13 * 128];
                }
                if (var18 - var13 - 1 >= 0) {
                    var17 -= class35.field890[var16 + var19 - (var13 + 1) * 128];
                }
                if (var18 >= 0) {
                    class158.field3647[var16 + var19] = var17 / (var13 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIILke;)V")
    public static final void method283(int arg0, int arg1, int arg2, class74 arg3) {
        field848++;
        if (arg3.field1740 == 1) {
            class105.method830(arg3.field1765, 0, -31278, class110.field2567, arg3.field1703, 0, 29);
            class24.field597++;
        }
        if (arg3.field1740 == 2 && !class35.field884) {
            class118 var4 = class60.method540(arg3, -118);
            if (var4 != null) {
                class138.field3135++;
                class105.method830(var4, 0, -31278, class144.method1066(true, new class118[] { class92.field2195, arg3.field1712 }), arg3.field1703, -1, 22);
            }
        }
        if (arg3.field1740 == 3) {
            class29.field677++;
            class105.method830(class101.field2348, 0, -31278, class110.field2567, arg3.field1703, 0, 8);
        }
        if (arg3.field1740 == 4) {
            class115.field2690++;
            class105.method830(arg3.field1765, 0, -31278, class110.field2567, arg3.field1703, 0, 35);
        }
        if (arg3.field1740 == 5) {
            class99.field2281++;
            class105.method830(arg3.field1765, 0, -31278, class110.field2567, arg3.field1703, 0, 47);
        }
        if (arg3.field1740 == 6 && class101.field2351 == null) {
            class85.field2073++;
            class105.method830(arg3.field1765, 0, -31278, class110.field2567, arg3.field1703, -1, 3);
        }
        if (arg3.field1807 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field1748; var6++) {
                for (int var7 = 0; var7 < arg3.field1779; var7++) {
                    int var8 = (arg3.field1747 + 32) * var7;
                    int var9 = (arg3.field1706 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg3.field1709[var5];
                        var9 += arg3.field1804[var5];
                    }
                    if (arg0 >= var8 && arg1 >= var9 && var8 + 32 > arg0 && arg1 < var9 + 32) {
                        class23.field563 = arg3;
                        class67.field1557 = var5;
                        if (arg3.field1816[var5] > 0) {
                            class85 var10 = class131.method1013(-12582, arg3.field1816[var5] - 1);
                            if (class144.field3245 == 1 && class84.method686(-1, class46.method384(arg3, 0))) {
                                if (class95.field2252 != arg3.field1703 || class132.field2994 != var5) {
                                    class74.field1727++;
                                    class105.method830(class33.field834, var10.field2064, -31278, class144.method1066(true, new class118[] { class95.field2241, class84.field2026, var10.field2048 }), arg3.field1703, var5, 6);
                                }
                            } else if (!class35.field884 || !class84.method686(-1, class46.method384(arg3, 0))) {
                                class42.field996++;
                                class118[] var11 = var10.field2081;
                                if (class101.field2354) {
                                    var11 = class44.method366(var11, (byte) -85);
                                }
                                if (class84.method686(-1, class46.method384(arg3, 0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class59.field1380++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 40;
                                            } else {
                                                var13 = 7;
                                            }
                                            class105.method830(var11[var12], var10.field2064, -31278, class144.method1066(true, new class118[] { class91.field2184, var10.field2048 }), arg3.field1703, var5, var13);
                                        } else if (var12 == 4) {
                                            class113.field2646++;
                                            class105.method830(class54.field1289, var10.field2064, -31278, class144.method1066(true, new class118[] { class91.field2184, var10.field2048 }), arg3.field1703, var5, 7);
                                        }
                                    }
                                }
                                if (class92.method736(class46.method384(arg3, 0), 0)) {
                                    class54.field1275++;
                                    class105.method830(class33.field834, var10.field2064, -31278, class144.method1066(true, new class118[] { class91.field2184, var10.field2048 }), arg3.field1703, var5, 18);
                                }
                                if (class84.method686(-1, class46.method384(arg3, 0)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class136.field3080++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 45;
                                            }
                                            if (var14 == 1) {
                                                var15 = 23;
                                            }
                                            if (var14 == 2) {
                                                var15 = 16;
                                            }
                                            class105.method830(var11[var14], var10.field2064, -31278, class144.method1066(true, new class118[] { class91.field2184, var10.field2048 }), arg3.field1703, var5, var15);
                                        }
                                    }
                                }
                                class118[] var16 = arg3.field1813;
                                if (class101.field2354) {
                                    var16 = class44.method366(var16, (byte) -85);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class64.field1453++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 4;
                                            }
                                            if (var17 == 1) {
                                                var18 = 44;
                                            }
                                            if (var17 == 2) {
                                                var18 = 42;
                                            }
                                            if (var17 == 3) {
                                                var18 = 58;
                                            }
                                            if (var17 == 4) {
                                                var18 = 28;
                                            }
                                            class105.method830(var16[var17], var10.field2064, -31278, class144.method1066(true, new class118[] { class91.field2184, var10.field2048 }), arg3.field1703, var5, var18);
                                        }
                                    }
                                }
                                class105.method830(class158.field3649, var10.field2064, -31278, class144.method1066(true, new class118[] { class91.field2184, var10.field2048 }), arg3.field1703, var5, 1002);
                            } else if ((class80.field1934 & 0x10) == 16) {
                                class134.field3049++;
                                class105.method830(class103.field2378, var10.field2064, -31278, class144.method1066(true, new class118[] { class56.field1334, class84.field2026, var10.field2048 }), arg3.field1703, var5, 25);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg2 > -118 || !arg3.field1805) {
            return;
        }
        if (!class35.field884) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class118 var23 = class120.method943(arg3, 0, var19);
                if (var23 != null) {
                    class59.field1372++;
                    class105.method830(var23, var19 + 1, -31278, arg3.field1797, arg3.field1703, arg3.field1764, 1004);
                }
            }
            class118 var20 = class60.method540(arg3, -128);
            if (var20 != null) {
                class105.method830(var20, 0, -31278, arg3.field1797, arg3.field1703, arg3.field1764, 22);
                class138.field3135++;
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class118 var22 = class120.method943(arg3, 0, var21);
                if (var22 != null) {
                    class105.method830(var22, var21 + 1, -31278, arg3.field1797, arg3.field1703, arg3.field1764, 24);
                    class59.field1372++;
                }
            }
            if (!class39.method325(0, class46.method384(arg3, 0))) {
                return;
            }
            class105.method830(class105.field2461, 0, -31278, class110.field2567, arg3.field1703, arg3.field1764, 3);
            class85.field2073++;
        } else if (class14.method101(0, class46.method384(arg3, 0)) && (class80.field1934 & 0x20) == 32) {
            class105.method830(class103.field2378, 0, -31278, class144.method1066(true, new class118[] { class56.field1334, class128.field2935, arg3.field1797 }), arg3.field1703, arg3.field1764, 2);
            class64.field1452++;
            return;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lke;Z)Lke;")
    public static final class74 method284(class74 arg0, boolean arg1) {
        if (arg1) {
            return null;
        }
        int var2 = class29.method241(class46.method384(arg0, 0), 48);
        field861++;
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg0 = class99.method770(-4894, arg0.field1828);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLff;)V")
    public static final void method285(boolean arg0, class42 arg1) {
        if (!arg0) {
            method285(false, null);
        }
        class113.field2652 = arg1;
        field864++;
    }
}
