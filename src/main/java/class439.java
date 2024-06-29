import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class439 extends class180 {

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Ljava/lang/String;")
    public String field6018;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "[I")
    public static int[] field6023 = new int[200];

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "[I")
    public static int[] field6019 = new int[4096];

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "Lcq;")
    public static class121 field6022;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Lfl;")
    public static class345 field6020;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "[[I")
    public static int[][] field6014;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method2548(int arg0, int arg1, int arg2, Class arg3) {
        class406 var4 = class455.field6293[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class146 var5 = var4.field5613; var5 != null; var5 = var5.field2066) {
            class478 var6 = var5.field2062;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6753 == arg1 && var6.field6747 == arg2) {
                class139.method850(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIBLvp;I)V")
    public static final void method2549(int arg0, int arg1, int arg2, byte arg3, class462 arg4, int arg5) {
        field6016++;
        if (arg4.field6510 == -1 && arg4.field6498 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class491.field6932 * arg4.field6504 >> 8;
        if (arg4.field6506 < arg1) {
            var6 += arg1 - arg4.field6506;
        } else if (arg4.field6509 > arg1) {
            var6 += arg4.field6509 - arg1;
        }
        if (arg4.field6514 < arg2) {
            var6 += arg2 - arg4.field6514;
        } else if (arg2 < arg4.field6500) {
            var6 += arg4.field6500 - arg2;
        }
        if (arg4.field6497 == 0 || var6 - 64 > arg4.field6497 || class491.field6932 == 0 || arg4.field6496 != arg0) {
            if (arg4.field6507 != null) {
                class386.field5445.method1313(arg4.field6507);
                arg4.field6507 = null;
            }
            if (arg4.field6508 != null) {
                class386.field5445.method1313(arg4.field6508);
                arg4.field6508 = null;
            }
            return;
        }
        if (arg3 != -69) {
            field6022 = null;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg4.field6497 - var6) * var7 / arg4.field6497;
        if (arg4.field6507 != null) {
            arg4.field6507.method1635(var8);
        } else if (arg4.field6510 >= 0) {
            class89 var9 = class89.method607(class464.field6523, arg4.field6510, 0);
            if (var9 != null) {
                class144 var10 = var9.method609().method884(class240.field3383);
                class263 var11 = class263.method1631(var10, 100, var8);
                var11.method1640(-1);
                class386.field5445.method1315(var11);
                arg4.field6507 = var11;
            }
        }
        if (arg4.field6508 != null) {
            arg4.field6508.method1635(var8);
            if (!arg4.field6508.method1181(100)) {
                arg4.field6508 = null;
            }
        } else if (arg4.field6498 != null && (arg4.field6511 -= arg5) <= 0) {
            int var12 = (int) ((double) arg4.field6498.length * Math.random());
            class89 var13 = class89.method607(class464.field6523, arg4.field6498[var12], 0);
            if (var13 != null) {
                class144 var14 = var13.method609().method884(class240.field3383);
                class263 var15 = class263.method1631(var14, 100, var8);
                var15.method1640(0);
                class386.field5445.method1315(var15);
                arg4.field6511 = arg4.field6501 + ((int) (Math.random() * (double) (arg4.field6515 - arg4.field6501)));
                arg4.field6508 = var15;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
    public static final void method2550(int arg0, int arg1) {
        field6021++;
        int var2 = class356.field4972 - class332.field4554;
        if (var2 >= 100) {
            class375.field5312 = 1;
            return;
        }
        int var3 = -82 / ((arg0 + 38) / 35);
        int var4 = (int) class356.field4959;
        if (class272.field3752 >> 8 > var4) {
            var4 = class272.field3752 >> 8;
        }
        if (class269.field3730[4] && class417.field5741[4] + 128 > var4) {
            var4 = class417.field5741[4] + 128;
        }
        int var5 = (int) class418.field5750 + class480.field6795 & 0x3FFF;
        class229.method1444(class222.field3133, arg1, -78, class146.field2068, var4, var5, class418.method2441(class2.field21.field6746, class76.field1161, class2.field21.field6765, -16778) - 50, 600 - -((var4 >> 3) * 3));
        float var6 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class436.field5982 = (int) ((float) (class436.field5982 - class375.field5307) * var6 + (float) class375.field5307);
        class183.field2665 = (int) ((float) (class183.field2665 - class157.field2258) * var6 + (float) class157.field2258);
        class160.field2306 = (int) ((float) (class160.field2306 - class152.field2145) * var6 + (float) class152.field2145);
        class106.field1525 = (int) ((float) (class106.field1525 - class416.field5730) * var6 + (float) class416.field5730);
        int var7 = class200.field2873 - class108.field1539;
        if (var7 > 8192) {
            var7 -= 16384;
        } else if (var7 < -8192) {
            var7 += 16384;
        }
        class200.field2873 = (int) ((float) var7 * var6 + (float) class108.field1539);
        class200.field2873 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V")
    public static void method2551(byte arg0) {
        field6019 = null;
        int var1 = -34 / ((arg0 - 12) / 51);
        field6022 = null;
        field6020 = null;
        field6023 = null;
        field6014 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)Llk;")
    public static final class425 method2552(boolean arg0) {
        field6015++;
        class425 var1 = new class425(38);
        var1.method2470((byte) -74, 15);
        var1.method2470((byte) -74, class400.field5591);
        var1.method2470((byte) -74, class67.field1000 ? 1 : 0);
        var1.method2470((byte) -74, class460.field6481 ? 1 : 0);
        var1.method2470((byte) -74, class216.field3068 ? 1 : 0);
        var1.method2470((byte) -74, class80.field1205 ? 1 : 0);
        var1.method2470((byte) -74, 0);
        var1.method2470((byte) -74, class216.field3069 ? 1 : 0);
        var1.method2470((byte) -74, class164.field2424 ? 1 : 0);
        var1.method2470((byte) -74, class191.field2723 ? 1 : 0);
        var1.method2470((byte) -74, class47.field761);
        var1.method2470((byte) -74, class312.field4249 ? 1 : 0);
        var1.method2470((byte) -74, class327.field4526 ? 1 : 0);
        var1.method2470((byte) -74, class301.field4127 ? 1 : 0);
        var1.method2470((byte) -74, class13.field210);
        var1.method2470((byte) -74, class255.field3578 ? 1 : 0);
        var1.method2470((byte) -74, class256.field3582);
        var1.method2470((byte) -74, class47.field766);
        var1.method2470((byte) -74, class491.field6932);
        var1.method2462(class221.field3111, (byte) -123);
        var1.method2462(class304.field4157, (byte) -123);
        var1.method2470((byte) -74, class344.method2059(-22511));
        var1.method2481(class312.field4253, true);
        var1.method2470((byte) -74, class411.field5693);
        var1.method2470((byte) -74, class447.field6170 ? 1 : 0);
        var1.method2470((byte) -74, class104.field1498 ? 1 : 0);
        if (!arg0) {
            return null;
        }
        var1.method2470((byte) -74, class222.field3135);
        var1.method2470((byte) -74, class163.field2336 ? 1 : 0);
        var1.method2470((byte) -74, class122.field1699 ? 1 : 0);
        var1.method2470((byte) -74, class181.field2629);
        var1.method2470((byte) -74, class255.field3580 ? 1 : 0);
        var1.method2470((byte) -74, class47.field768);
        var1.method2470((byte) -74, class205.field2933);
        return var1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method2553(String arg0, boolean arg1, int arg2) {
        field6017++;
        class47.field763.field4693 = 1;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class58.field918.field692; var6++) {
            class164 var9 = class58.field918.method344(var6, 31757);
            if ((!arg1 || var9.field2365) && var9.field2419 == -1 && var9.field2349 == -1 && var9.field2397 == 0 && var9.field2374.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class445.field6146 = -1;
                    class292.field4011 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class292.field4011 = var4;
        class445.field6146 = var5;
        class330.field4545 = 0;
        String[] var7 = new String[class445.field6146];
        int var8 = 0;
        if (arg2 != -1) {
            method2549(-11, 84, 87, (byte) 101, (class462) null, 66);
        }
        while (class445.field6146 > var8) {
            var7[var8] = class58.field918.method344(var4[var8], class382.method2292(arg2, -31758)).field2374;
            var8++;
        }
        class30.method239(class292.field4011, 15883, var7);
        class47.field763.method2041(-3);
        class47.field763.field4693 = 2;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
    public class439() {
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class439(String arg0, int arg1) {
        this.field6018 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field6019[var0] = class250.method1556(24429, var0);
        }
        field6024 = 0;
    }
}
