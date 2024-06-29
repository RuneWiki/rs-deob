import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class53 {

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Lce;")
    public static class126 field805 = class206.method1445(-7923, "::clientjs5drop");

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field804 = 0;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "[[I")
    public static int[][] field811 = new int[104][104];

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "[[S")
    public static short[][] field812;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 12)
    public static final void method331(int arg0) {
        field803++;
        if (arg0 > -52) {
            field805 = (class126) null;
        }
        for (int var1 = 0; var1 < class262.field4386; var1++) {
            class12 var2 = class130.method906(var1, -126);
            if (var2 != null && var2.field166 == 0) {
                class254.field4275[var1] = 0;
                class138.field2462[var1] = 0;
            }
        }
        class265.field4471 = new class237(16);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V", line = 64)
    public static void method332(int arg0) {
        if (arg0 != 128) {
            method336(-53, 89, (class89) null, (class265) null, 10, (class301) null, 32, 31);
        }
        field812 = (short[][]) null;
        field811 = (int[][]) null;
        field805 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lja;IIIII)V", line = 80)
    public static final void method333(class114 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class228.field3848 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class197.field3377) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class65.field1094 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class5 var14 = class297.field4940[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class264.field4396[var11][var12 + 1][var13] + class264.field4396[var11][var12][var13] + class264.field4396[var11][var12][var13 + 1] + class264.field4396[var11][var12 + 1][var13 + 1]) / 4 - (class264.field4396[arg1][arg2 + 1][arg3] + class264.field4396[arg1][arg2][arg3] + class264.field4396[arg1][arg2][arg3 + 1] + class264.field4396[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class130 var16 = var14.field46;
                                    if (var16 != null) {
                                        if (var16.field2234.method449()) {
                                            arg0.method437(var16.field2234, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2239 != null && var16.field2239.method449()) {
                                            arg0.method437(var16.field2239, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field61; var17++) {
                                        class240 var18 = var14.field54[var17];
                                        if (var18 != null && var18.field4043.method449() && (var18.field4041 == var12 || var7 == var12) && (var18.field4046 == var13 || var9 == var13)) {
                                            int var19 = var18.field4051 + 1 - var18.field4041;
                                            int var20 = var18.field4044 + 1 - var18.field4046;
                                            arg0.method437(var18.field4043, (var18.field4041 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4046 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V", line = 186)
    public static final void method334(int arg0) {
        if (arg0 != -29640) {
            field806 = 56;
        }
        field809++;
        if (class50.field761 != null) {
            class264 var1 = class50.field761;
            synchronized (class50.field761) {
                class50.field761 = null;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V", line = 268)
    public static final void method335(int arg0, int arg1) {
        field810++;
        if (arg1 >= -35) {
            field811 = (int[][]) ((int[][]) null);
        }
        class245 var2 = class139.method1022(6, (byte) -106, arg0);
        var2.method1682(91);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILui;Lte;ILcj;II)V", line = 290)
    public static final void method336(int arg0, int arg1, class89 arg2, class265 arg3, int arg4, class301 arg5, int arg6, int arg7) {
        field813++;
        class314 var8 = new class314();
        var8.field5400 = arg7 * 128;
        var8.field5402 = arg0 * arg4;
        var8.field5384 = arg6;
        if (arg3 != null) {
            var8.field5380 = arg3.field4438 * 128;
            var8.field5399 = arg3.field4449;
            var8.field5387 = arg3.field4485;
            var8.field5390 = arg3.field4480;
            var8.field5383 = arg3;
            var8.field5374 = arg3.field4464;
            int var10 = arg3.field4452;
            int var11 = arg3.field4474;
            if (arg1 == 1 || arg1 == 3) {
                var10 = arg3.field4474;
                var11 = arg3.field4452;
            }
            var8.field5389 = (arg4 + var11) * 128;
            var8.field5377 = (arg7 + var10) * 128;
            if (arg3.field4435 != null) {
                var8.field5391 = true;
                var8.method2194((byte) -101);
            }
            if (var8.field5374 != null) {
                var8.field5375 = var8.field5390 + ((int) ((double) (var8.field5399 - var8.field5390) * Math.random()));
            }
            class185.field3202.method899(var8, -28);
        } else if (arg2 != null) {
            class304 var9 = arg2.field1389;
            var8.field5379 = arg2;
            if (var9.field5059 != null) {
                var8.field5391 = true;
                var9 = var9.method2038((byte) 88);
            }
            if (var9 != null) {
                var8.field5377 = (var9.field5109 + arg7) * 128;
                var8.field5389 = (var9.field5109 + arg4) * 128;
                var8.field5387 = class253.method1716(true, arg2);
                var8.field5380 = var9.field5060 * 128;
            }
            class82.field1322.method899(var8, -28);
        } else if (arg5 != null) {
            var8.field5386 = arg5;
            var8.field5389 = (arg4 + arg5.method1013(false)) * 128;
            var8.field5377 = (arg5.method1013(false) + arg7) * 128;
            var8.field5387 = class260.method1761((byte) 118, arg5);
            var8.field5380 = arg5.field5023 * 128;
            class199.field3389.method1636(11311, var8, arg5.field5019.method845((byte) -125));
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BII)Lwd;", line = 395)
    public static final class112 method337(byte arg0, int arg1, int arg2) {
        field808++;
        class112 var3 = class252.method1706(5157, arg1);
        if (arg0 != -127) {
            method336(-41, -13, (class89) null, (class265) null, 92, (class301) null, -88, 119);
        }
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field1810 == null || var3.field1810.length <= arg2) {
            return null;
        } else {
            return var3.field1810[arg2];
        }
    }
}
