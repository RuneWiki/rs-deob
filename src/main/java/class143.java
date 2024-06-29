import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class143 {

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Z")
    public boolean field2481 = false;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Ljf;")
    private static class229 field2484 = class212.method1457((byte) 107, "green:");

    @OriginalMember(owner = "client!d", name = "j", descriptor = "Ljf;")
    public static class229 field2486 = class212.method1457((byte) 69, "blaugr-Un:");

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Ljf;")
    public static class229 field2483 = class212.method1457((byte) 101, "K");

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field2497 = 0;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "[[I")
    public static int[][] field2488 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!d", name = "w", descriptor = "[I")
    public static int[] field2499 = new int[100];

    @OriginalMember(owner = "client!d", name = "v", descriptor = "[Ljf;")
    public static class229[] field2498 = new class229[500];

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Ljf;")
    public static class229 field2482 = field2484;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Ljf;")
    public static class229 field2494 = field2484;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public int field2477;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public int field2491;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    public int field2495;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "J")
    public long field2493;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Lhg;")
    public class174 field2480;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Lek;")
    public static class185 field2487;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Lek;")
    public static class185 field2490;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V", line = 4)
    public static void method995(byte arg0) {
        field2486 = null;
        field2488 = (int[][]) null;
        field2483 = null;
        field2487 = null;
        field2499 = null;
        field2482 = null;
        field2484 = null;
        if (arg0 != -58) {
            field2497 = -82;
        }
        field2494 = null;
        field2490 = null;
        field2498 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljf;IB)V", line = 25)
    public static final void method996(class229 arg0, int arg1, byte arg2) {
        field2485++;
        class122 var3 = class323.method2175(2, arg1, -25873);
        if (arg2 != -17) {
            field2490 = (class185) null;
        }
        var3.method862(-29044);
        var3.field2145 = arg0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([[FBBIILkc;II[[IZIIB[[FI[[F)V", line = 47)
    public static final void method997(float[][] arg0, byte arg1, byte arg2, int arg3, int arg4, class37 arg5, int arg6, int arg7, int[][] arg8, boolean arg9, int arg10, int arg11, byte arg12, float[][] arg13, int arg14, float[][] arg15) {
        field2478++;
        int var16 = (arg3 << 8) + 255;
        int var17 = (arg4 << 8) + 255;
        int var18 = (arg11 << 8) + 255;
        int var19 = (arg7 << 8) + 255;
        if (arg1 >= -3) {
            field2494 = (class229) null;
        }
        int[] var20 = class169.field2948[arg2];
        int[] var21 = null;
        int[] var22 = new int[var20.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, var20[var23 + var23 + 1], arg8, arg14, false, arg0, arg12, arg5, var20[var23 + var23], var16, 0.0F, var18);
        }
        if (arg9) {
            if (arg2 == 1) {
                var21 = new int[6];
                int var42 = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, 128, arg8, arg14, true, arg0, arg12, arg5, 64, var16, 0.0F, var18);
                int var43 = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, 64, arg8, arg14, true, arg0, arg12, arg5, 128, var16, 0.0F, var18);
                var21[0] = var43;
                var21[3] = var42;
                var21[4] = var22[0];
                var21[1] = var42;
                var21[2] = var22[2];
                var21[5] = var22[2];
            } else if (arg2 == 2) {
                int var25 = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, 128, arg8, arg14, true, arg0, arg12, arg5, 128, var16, 0.0F, var18);
                int var26 = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, 0, arg8, arg14, true, arg0, arg12, arg5, 64, var16, 0.0F, var18);
                var21 = new int[] { var22[0], var26, var25, var25, var22[1], var22[0] };
            } else if (arg2 == 3) {
                var21 = new int[6];
                int var40 = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, 128, arg8, arg14, true, arg0, arg12, arg5, 0, var16, 0.0F, var18);
                int var41 = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, 0, arg8, arg14, true, arg0, arg12, arg5, 64, var16, 0.0F, var18);
                var21[3] = var40;
                var21[0] = var22[2];
                var21[2] = var40;
                var21[1] = var22[1];
                var21[5] = var22[2];
                var21[4] = var41;
            } else if (arg2 == 4) {
                var21 = new int[3];
                int var39 = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, 128, arg8, arg14, true, arg0, arg12, arg5, 0, var16, 0.0F, var18);
                var21[0] = var22[3];
                var21[1] = var39;
                var21[2] = var22[0];
            } else if (arg2 == 5) {
                var21 = new int[3];
                int var27 = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, 128, arg8, arg14, true, arg0, arg12, arg5, 128, var16, 0.0F, var18);
                var21[1] = var27;
                var21[0] = var22[2];
                var21[2] = var22[3];
            } else if (arg2 == 6) {
                var21 = new int[6];
                int var28 = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, 0, arg8, arg14, true, arg0, arg12, arg5, 128, var16, 0.0F, var18);
                int var29 = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, 128, arg8, arg14, true, arg0, arg12, arg5, 128, var16, 0.0F, var18);
                var21[0] = var22[3];
                var21[1] = var28;
                var21[3] = var29;
                var21[2] = var29;
                var21[5] = var22[3];
                var21[4] = var22[0];
            } else if (arg2 == 7) {
                var21 = new int[6];
                int var37 = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, 128, arg8, arg14, true, arg0, arg12, arg5, 0, var16, 0.0F, var18);
                int var38 = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, 0, arg8, arg14, true, arg0, arg12, arg5, 128, var16, 0.0F, var18);
                var21[2] = var37;
                var21[3] = var37;
                var21[0] = var22[1];
                var21[4] = var22[2];
                var21[1] = var38;
                var21[5] = var22[1];
            } else if (arg2 == 8) {
                var21 = new int[3];
                int var30 = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, 0, arg8, arg14, true, arg0, arg12, arg5, 0, var16, 0.0F, var18);
                var21[0] = var22[3];
                var21[2] = var22[4];
                var21[1] = var30;
            } else if (arg2 == 9) {
                var21 = new int[15];
                int var31 = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, 64, arg8, arg14, true, arg0, arg12, arg5, 128, var16, 0.0F, var18);
                int var32 = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, 32, arg8, arg14, true, arg0, arg12, arg5, 96, var16, 0.0F, var18);
                int var33 = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, 0, arg8, arg14, true, arg0, arg12, arg5, 64, var16, 0.0F, var18);
                var21[0] = var32;
                var21[12] = var32;
                var21[2] = var22[4];
                var21[10] = var22[2];
                var21[4] = var22[4];
                var21[9] = var32;
                var21[1] = var31;
                var21[6] = var32;
                var21[14] = var33;
                var21[13] = var22[1];
                var21[3] = var32;
                var21[8] = var22[2];
                var21[7] = var22[3];
                var21[11] = var22[1];
                var21[5] = var22[3];
            } else if (arg2 == 10) {
                int var34 = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, 128, arg8, arg14, true, arg0, arg12, arg5, 0, var16, 0.0F, var18);
                var21 = new int[] { var22[2], var34, var22[3], var22[3], var34, var22[4], var22[4], var34, var22[0] };
            } else if (arg2 == 11) {
                var21 = new int[12];
                int var35 = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, 64, arg8, arg14, true, arg0, arg12, arg5, 0, var16, 0.0F, var18);
                int var36 = class45.method389(var19, var17, (int[][]) null, arg13, true, arg10, arg15, 64, arg8, arg14, true, arg0, arg12, arg5, 128, var16, 0.0F, var18);
                var21[5] = var35;
                var21[11] = var36;
                var21[1] = var35;
                var21[0] = var22[3];
                var21[10] = var22[1];
                var21[8] = var35;
                var21[2] = var22[0];
                var21[9] = var22[2];
                var21[4] = var22[2];
                var21[3] = var22[3];
                var21[6] = var22[2];
                var21[7] = var36;
            }
        }
        arg5.method331(arg6, arg10, arg14, var22, var21, false);
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V", line = 328)
    public static final void method998(byte arg0) {
        field2496++;
        int var1 = class126.field2246;
        int var2 = class189.field3301 - class78.field1429 - var1;
        int var3 = class10.field113;
        int var4 = 100 % ((-arg0 - 25) / 57);
        int var5 = class115.field2067 - var3 - class175.field3046;
        if (var3 <= 0 && var5 <= 0 && var1 <= 0 && var2 <= 0) {
            return;
        }
        try {
            int var6 = 0;
            int var7 = 0;
            Container var8;
            if (class155.field2641 != null) {
                var8 = class155.field2641;
            } else if (class112.field2031 == null) {
                var8 = class215.field3689.field3461;
            } else {
                var8 = class112.field2031;
            }
            if (class112.field2031 == var8) {
                Insets var9 = class112.field2031.getInsets();
                var7 = var9.left;
                var6 = var9.top;
            }
            Graphics var10 = var8.getGraphics();
            var10.setColor(Color.black);
            if (var3 > 0) {
                var10.fillRect(var7, var6, var3, class189.field3301);
            }
            if (var1 > 0) {
                var10.fillRect(var7, var6, class115.field2067, var1);
            }
            if (var5 > 0) {
                var10.fillRect(class115.field2067 + var7 - var5, var6, var5, class189.field3301);
            }
            if (var2 > 0) {
                var10.fillRect(var7, class189.field3301 + var6 - var2, class115.field2067, var2);
            }
        } catch (Exception var12) {
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lkh;Z)V", line = 418)
    public static final void method999(class14 arg0, boolean arg1) {
        int var2 = arg0.method104(-35);
        class226.field3880 = new class140[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class226.field3880[var3] = new class140();
            class226.field3880[var3].field2443 = arg0.method104(-80);
            class226.field3880[var3].field2440 = arg0.method121(true);
        }
        field2479++;
        class24.field452 = arg0.method104(-104);
        class312.field5242 = arg0.method104(-102);
        class173.field3025 = arg0.method104(97);
        class282.field4835 = new class222[class312.field5242 + 1 - class24.field452];
        for (int var4 = 0; var4 < class173.field3025; var4++) {
            int var5 = arg0.method104(-107);
            class222 var6 = class282.field4835[var5] = new class222();
            var6.field4855 = arg0.method93(!arg1);
            var6.field4863 = arg0.method128((byte) 4);
            var6.field3798 = var5 + class24.field452;
            var6.field3794 = arg0.method121(arg1);
            var6.field3785 = arg0.method121(true);
        }
        class221.field3778 = arg0.method128((byte) 4);
        class183.field3165 = arg1;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V", line = 461)
    public static final void method1000(byte arg0) {
        field2489++;
        if (class64.field1111 > 0) {
            class64.field1111--;
        }
        if (class208.field3612 > 1) {
            class238.field4156 = class6.field70;
            class208.field3612--;
        }
        if (class244.field4338) {
            class244.field4338 = false;
            class323.method2179((byte) 109);
            return;
        }
        for (int var1 = 0; var1 < 100 && class191.method1313(-66); var1++) {
        }
        if (class325.field5482 != 30) {
            return;
        }
        class24.method228(class84.field1608, 70, -15);
        Object var2 = class157.field2692.field2549;
        synchronized (class157.field2692.field2549) {
            if (!class315.field5347) {
                class157.field2692.field2556 = 0;
            } else if (class55.field969 != 0 || class157.field2692.field2556 >= 40) {
                class84.field1608.method1397(54, 0);
                class84.field1608.method140(0, (byte) 75);
                int var3 = class84.field1608.field195;
                int var4 = 0;
                for (int var5 = 0; var5 < class157.field2692.field2556 && (class84.field1608.field195 - var3) < 240; var5++) {
                    int var6 = class157.field2692.field2554[var5];
                    boolean var7 = false;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    var4++;
                    int var8 = class157.field2692.field2555[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class157.field2692.field2554[var5] == -1 && class157.field2692.field2555[var5] == -1) {
                        var7 = true;
                        var6 = -1;
                        var8 = -1;
                    }
                    if (class172.field3006 != var8 || class155.field2648 != var6) {
                        int var9 = var8 - class172.field3006;
                        int var10 = var6 - class155.field2648;
                        class155.field2648 = var6;
                        class172.field3006 = var8;
                        if (class296.field5059 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class84.field1608.method125(-25369, (class296.field5059 << 12) + ((var9 << 6) + var10));
                            class296.field5059 = 0;
                        } else if (class296.field5059 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class84.field1608.method140(class296.field5059 + 128, (byte) 75);
                            var10 += 128;
                            var9 += 128;
                            class84.field1608.method125(-25369, (var9 << 8) + var10);
                            class296.field5059 = 0;
                        } else if (class296.field5059 < 32) {
                            class84.field1608.method140(class296.field5059 + 192, (byte) 75);
                            if (var7) {
                                class84.field1608.method100(Integer.MIN_VALUE, 65280);
                            } else {
                                class84.field1608.method100(var8 | var6 << 16, 65280);
                            }
                            class296.field5059 = 0;
                        } else {
                            class84.field1608.method125(-25369, class296.field5059 + 57344);
                            if (var7) {
                                class84.field1608.method100(Integer.MIN_VALUE, 65280);
                            } else {
                                class84.field1608.method100(var6 << 16 | var8, 65280);
                            }
                            class296.field5059 = 0;
                        }
                    } else if (class296.field5059 < 2047) {
                        class296.field5059++;
                    }
                }
                class84.field1608.method110(class84.field1608.field195 - var3, (byte) 0);
                class228.field3913++;
                if (class157.field2692.field2556 <= var4) {
                    class157.field2692.field2556 = 0;
                } else {
                    class157.field2692.field2556 -= var4;
                    for (int var11 = 0; var11 < class157.field2692.field2556; var11++) {
                        class157.field2692.field2555[var11] = class157.field2692.field2555[var11 + var4];
                        class157.field2692.field2554[var11] = class157.field2692.field2554[var4 + var11];
                    }
                }
            }
        }
        if (class55.field969 != 0) {
            class257.field4484++;
            int var13 = class60.field1033;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            long var14 = (class298.field5084 - class93.field1676) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            int var16 = class222.field3791;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            class93.field1676 = class298.field5084;
            byte var17 = 0;
            if (class55.field969 == 2) {
                var17 = 1;
            }
            class84.field1608.method1397(2, 0);
            int var18 = (int) var14;
            class84.field1608.method133((byte) 99, var17 << 15 | var18);
            class84.field1608.method87(-1649217712, var16 | var13 << 16);
        }
        if (class269.field4621 > 0) {
            class269.field4621--;
        }
        if (class282.field4836) {
            for (int var19 = 0; var19 < class78.field1436; var19++) {
                int var20 = class249.field4388[var19];
                if (var20 == 98 || var20 == 99 || var20 == 96 || var20 == 97) {
                    class68.field1298 = true;
                    break;
                }
            }
        } else if (class84.field1613[96] || class84.field1613[97] || class84.field1613[98] || class84.field1613[99]) {
            class68.field1298 = true;
        }
        if (class68.field1298 && class269.field4621 <= 0) {
            class68.field1298 = false;
            class269.field4621 = 20;
            class84.field1608.method1397(245, 0);
            class125.field2207++;
            class84.field1608.method125(-25369, class229.field3939);
            class84.field1608.method133((byte) -68, class293.field5021);
        }
        if (class51.field896 && !class173.field3024) {
            class173.field3024 = true;
            class315.field5338++;
            class84.field1608.method1397(36, 0);
            class84.field1608.method140(1, (byte) 75);
        }
        if (!class51.field896 && class173.field3024) {
            class315.field5338++;
            class173.field3024 = false;
            class84.field1608.method1397(36, 0);
            class84.field1608.method140(0, (byte) 75);
        }
        if (!class16.field241) {
            class84.field1608.method1397(207, 0);
            class281.field4811++;
            class84.field1608.method87(-1649217712, class91.method642((byte) 78));
            class16.field241 = true;
        }
        class161.method1088((byte) -125);
        if (class325.field5482 != 30) {
            return;
        }
        class314.method2135(6573);
        class287.method2004((byte) -31);
        class15.field221++;
        if (class15.field221 > 750) {
            class323.method2179((byte) 109);
            return;
        }
        class315.method2136(-111);
        class120.method849((byte) -116);
        class236.method1687(18);
        if (class329.field5589 != null) {
            class10.method51((byte) 73);
        }
        for (int var21 = class211.method1451(true, -89); var21 != -1; var21 = class211.method1451(false, -106)) {
            class329.method2241((byte) -40, var21);
            class234.field4050[class305.method2086(31, class279.field4780++)] = var21;
        }
        for (class122 var22 = class301.method2068((byte) 76); var22 != null; var22 = class301.method2068((byte) 98)) {
            int var23 = var22.method870(-126);
            int var24 = var22.method869(-2195);
            if (var23 == 1) {
                class230.field4004[var24] = var22.field2144;
                class180.field3117[class305.method2086(31, class44.field794++)] = var24;
            } else if (var23 == 2) {
                class66.field1128[var24] = var22.field2145;
                class96.field1713[class305.method2086(31, class307.field5189++)] = var24;
            } else if (var23 == 3) {
                class67 var44 = class96.method662(var24, true);
                if (!var22.field2145.method1641((byte) -64, var44.field1235)) {
                    var44.field1235 = var22.field2145;
                    class194.method1328((byte) -97, var44);
                }
            } else if (var23 == 4) {
                class67 var25 = class96.method662(var24, true);
                int var26 = var22.field2143;
                int var27 = var22.field2144;
                if (var25.field1134 != var27 || var25.field1288 != var26) {
                    var25.field1288 = var26;
                    var25.field1134 = var27;
                    class194.method1328((byte) -111, var25);
                }
            } else if (var23 == 5) {
                class67 var43 = class96.method662(var24, true);
                if (var22.field2144 != var43.field1276 || var22.field2144 == -1) {
                    var43.field1252 = 0;
                    var43.field1293 = 0;
                    var43.field1276 = var22.field2144;
                    class194.method1328((byte) -99, var43);
                }
            } else if (var23 == 6) {
                int var28 = var22.field2144;
                int var29 = (var28 & 0x7CD8) >> 10;
                int var30 = (var28 & 0x3F8) >> 5;
                class67 var31 = class96.method662(var24, true);
                int var32 = var28 & 0x1F;
                int var33 = (var29 << 19) + (var30 << 11) + (var32 << 3);
                if (var31.field1292 != var33) {
                    var31.field1292 = var33;
                    class194.method1328((byte) -85, var31);
                }
            } else if (var23 == 7) {
                class67 var41 = class96.method662(var24, true);
                boolean var42 = var22.field2144 == 1;
                if (var41.field1210 != var42) {
                    var41.field1210 = var42;
                    class194.method1328((byte) -60, var41);
                }
            } else if (var23 == 8) {
                class67 var34 = class96.method662(var24, true);
                if (var22.field2144 != var34.field1231 || var22.field2143 != var34.field1209 || var22.field2154 != var34.field1171) {
                    var34.field1209 = var22.field2143;
                    var34.field1171 = var22.field2154;
                    if (var34.field1165 != -1) {
                        if (var34.field1234 > 0) {
                            var34.field1171 = var34.field1171 * 32 / var34.field1234;
                        } else if (var34.field1176 > 0) {
                            var34.field1171 = var34.field1171 * 32 / var34.field1176;
                        }
                    }
                    var34.field1231 = var22.field2144;
                    class194.method1328((byte) -79, var34);
                }
            } else if (var23 == 9) {
                class67 var35 = class96.method662(var24, true);
                if (var22.field2144 != var35.field1165 || var22.field2143 != var35.field1273) {
                    var35.field1273 = var22.field2143;
                    var35.field1165 = var22.field2144;
                    class194.method1328((byte) -104, var35);
                }
            } else if (var23 == 10) {
                class67 var40 = class96.method662(var24, true);
                if (var22.field2144 != var40.field1179 || var22.field2143 != var40.field1143 || var22.field2154 != var40.field1285) {
                    var40.field1179 = var22.field2144;
                    var40.field1143 = var22.field2143;
                    var40.field1285 = var22.field2154;
                    class194.method1328((byte) -75, var40);
                }
            } else if (var23 == 11) {
                class67 var39 = class96.method662(var24, true);
                var39.field1154 = 0;
                var39.field1195 = var39.field1238 = var22.field2144;
                var39.field1207 = var39.field1294 = var22.field2143;
                var39.field1188 = 0;
                class194.method1328((byte) -102, var39);
            } else if (var23 == 12) {
                class67 var37 = class96.method662(var24, true);
                int var38 = var22.field2144;
                if (var37 != null && var37.field1267 == 0) {
                    if ((var37.field1200 - var37.field1295) < var38) {
                        var38 = var37.field1200 - var37.field1295;
                    }
                    if (var38 < 0) {
                        var38 = 0;
                    }
                    if (var37.field1167 != var38) {
                        var37.field1167 = var38;
                        class194.method1328((byte) -74, var37);
                    }
                }
            } else if (var23 == 13) {
                class67 var36 = class96.method662(var24, true);
                var36.field1287 = var22.field2144;
            }
        }
        if (client.field4465 != 0) {
            class215.field3697 += 20;
            if (class215.field3697 >= 400) {
                client.field4465 = 0;
            }
        }
        class146.field2540++;
        if (class3.field19 != null) {
            class168.field2885++;
            if (class168.field2885 >= 15) {
                class194.method1328((byte) -118, class3.field19);
                class3.field19 = null;
            }
        }
        if (class140.field2438 != null) {
            class194.method1328((byte) -75, class140.field2438);
            class260.field4516++;
            if (class287.field4914 > (class60.field1036 + 5) || class60.field1036 - 5 > class287.field4914 || class82.field1511 > class217.field3731 + 5 || class217.field3731 - 5 > class82.field1511) {
                class98.field1746 = true;
            }
            if (class235.field4062 == 0) {
                if (class98.field1746 && class260.field4516 >= 5) {
                    if (class8.field80 == class140.field2438 && class71.field1351 != class308.field5209) {
                        class243.field4305++;
                        class67 var45 = class140.field2438;
                        byte var46 = 0;
                        if (class12.field147 == 1 && var45.field1296 == 206) {
                            var46 = 1;
                        }
                        if (var45.field1227[class71.field1351] <= 0) {
                            var46 = 0;
                        }
                        if (class245.method1778(client.method1820(var45), (byte) -14)) {
                            int var47 = class308.field5209;
                            int var48 = class71.field1351;
                            var45.field1227[var48] = var45.field1227[var47];
                            var45.field1153[var48] = var45.field1153[var47];
                            var45.field1227[var47] = -1;
                            var45.field1153[var47] = 0;
                        } else if (var46 == 1) {
                            int var49 = class308.field5209;
                            int var50 = class71.field1351;
                            while (var49 != var50) {
                                if (var49 > var50) {
                                    var45.method502(var49, var49 - 1, 312);
                                    var49--;
                                } else if (var49 < var50) {
                                    var45.method502(var49, var49 + 1, 312);
                                    var49++;
                                }
                            }
                        } else {
                            var45.method502(class308.field5209, class71.field1351, 312);
                        }
                        class84.field1608.method1397(93, 0);
                        class84.field1608.method92(255, var46);
                        class84.field1608.method119((byte) -122, class140.field2438.field1247);
                        class84.field1608.method106(class71.field1351, (byte) -117);
                        class84.field1608.method106(class308.field5209, (byte) -126);
                    }
                } else if ((class189.field3292 == 1 || class70.method516(class124.field2176 - 1, (byte) -88)) && class124.field2176 > 2) {
                    class14.method96(10754);
                } else if (class124.field2176 > 0) {
                    class109.method774(8608);
                }
                class55.field969 = 0;
                class140.field2438 = null;
                class168.field2885 = 10;
            }
        }
        class155.field2650 = false;
        class67 var51 = class312.field5244;
        class312.field5244 = null;
        class22.field384 = null;
        class290.field4961 = false;
        class67 var52 = class273.field4673;
        class78.field1436 = 0;
        class273.field4673 = null;
        while (class301.method2063((byte) 106) && class78.field1436 < 128) {
            class249.field4388[class78.field1436] = class162.field2755;
            class28.field492[class78.field1436] = class215.field3691;
            class78.field1436++;
        }
        class329.field5589 = null;
        if (class16.field263 != -1) {
            class223.method1532(0, 0, class16.field263, class78.field1429, class175.field3046, 0, 48000, 0);
        }
        class6.field70++;
        while (true) {
            class192 var53;
            class67 var54;
            class67 var55;
            do {
                var53 = (class192) class148.field2564.method2076((byte) -120);
                if (var53 == null) {
                    while (true) {
                        class192 var56;
                        class67 var57;
                        class67 var58;
                        do {
                            var56 = (class192) class319.field5387.method2076((byte) -119);
                            if (var56 == null) {
                                while (true) {
                                    class192 var59;
                                    class67 var60;
                                    class67 var61;
                                    do {
                                        var59 = (class192) class224.field3831.method2076((byte) -97);
                                        if (var59 == null) {
                                            if (class162.field2766 && class329.field5589 == null) {
                                                class162.field2766 = false;
                                            }
                                            if (class317.field5356 != null) {
                                                class142.method994(174);
                                            }
                                            if (class200.field3500 > 0 && class84.field1613[82] && class84.field1613[81] && class34.field654 != 0) {
                                                int var62 = class16.field254 - class34.field654;
                                                if (var62 < 0) {
                                                    var62 = 0;
                                                } else if (var62 > 3) {
                                                    var62 = 3;
                                                }
                                                class93.method648(var62, class301.field5124.field2017[0] + class213.field3649, class301.field5124.field2018[0] + class258.field4503, false);
                                            }
                                            if (class270.field4630 != -1) {
                                                int var63 = class270.field4630;
                                                int var64 = class273.field4678;
                                                if (class200.field3500 > 0 && class84.field1613[82] && class84.field1613[81]) {
                                                    class93.method648(class16.field254, class213.field3649 + var64, class258.field4503 + var63, false);
                                                } else if (class156.field2666) {
                                                    class134.field2335++;
                                                    class84.field1608.method1397(240, 0);
                                                    class84.field1608.method125(-25369, class157.field2693);
                                                    class84.field1608.method125(-25369, class213.field3649 + var64);
                                                    class84.field1608.method144(class258.field4503 + var63, 0);
                                                    class84.field1608.method87(-1649217712, class232.field4035);
                                                    client.field4465 = 1;
                                                    class215.field3697 = 0;
                                                    class141.field2445 = class222.field3791;
                                                    class52.field904 = class60.field1033;
                                                } else if (class320.field5424) {
                                                    class84.field1608.method1397(186, 0);
                                                    class84.field1608.method144(class213.field3649 + var64, 0);
                                                    class272.field4658++;
                                                    class84.field1608.method144(class258.field4503 + var63, 0);
                                                    class52.field904 = class60.field1033;
                                                    client.field4465 = 1;
                                                    class141.field2445 = class222.field3791;
                                                    class215.field3697 = 0;
                                                } else {
                                                    boolean var65 = class329.method2247(0, true, 0, var63, 0, (byte) -37, 0, class301.field5124.field2018[0], 0, 0, var64, class301.field5124.field2017[0]);
                                                    if (var65) {
                                                        class52.field904 = class60.field1033;
                                                        client.field4465 = 1;
                                                        class141.field2445 = class222.field3791;
                                                        class215.field3697 = 0;
                                                    }
                                                }
                                                class156.field2666 = false;
                                                class270.field4630 = -1;
                                                class320.field5424 = false;
                                            }
                                            class28.method244(0);
                                            if (class312.field5244 != var51) {
                                                if (var51 != null) {
                                                    class194.method1328((byte) -109, var51);
                                                }
                                                if (class312.field5244 != null) {
                                                    class194.method1328((byte) -71, class312.field5244);
                                                }
                                            }
                                            if (class273.field4673 != var52 && class3.field15 == class107.field1867) {
                                                if (var52 != null) {
                                                    class194.method1328((byte) -103, var52);
                                                }
                                                if (class273.field4673 != null) {
                                                    class194.method1328((byte) -103, class273.field4673);
                                                }
                                            }
                                            if (class273.field4673 == null) {
                                                if (class3.field15 > 0) {
                                                    class3.field15--;
                                                }
                                            } else if (class107.field1867 > class3.field15) {
                                                class3.field15++;
                                                if (class3.field15 == class107.field1867) {
                                                    class194.method1328((byte) -119, class273.field4673);
                                                }
                                            }
                                            if (class74.field1405 == 1) {
                                                class324.method2182((byte) -92);
                                            } else if (class74.field1405 == 2) {
                                                class226.method1572((byte) 107);
                                            } else {
                                                class261.method1857((byte) -10);
                                            }
                                            for (int var66 = 0; var66 < 5; var66++) {
                                                int var10002 = class7.field74[var66]++;
                                            }
                                            if (arg0 <= 45) {
                                                field2490 = (class185) null;
                                            }
                                            int var67 = class122.method873((byte) 87);
                                            int var68 = class76.method546(-125);
                                            if (var67 > 4500 && var68 > 4500) {
                                                class64.field1111 = 250;
                                                class64.method477(1, 4000);
                                                class84.field1608.method1397(0, 0);
                                                class45.field823++;
                                            }
                                            if (class57.field1014 != null && class57.field1014.field4011 == 1) {
                                                if (class57.field1014.field4009 != null) {
                                                    class98.method673(1, class173.field3009, class168.field2880);
                                                }
                                                class168.field2880 = false;
                                                class57.field1014 = null;
                                                class173.field3009 = null;
                                            }
                                            class182.field3149++;
                                            class307.field5187++;
                                            class170.field2961++;
                                            if (class307.field5187 > 500) {
                                                int var69 = (int) (Math.random() * 8.0D);
                                                if ((var69 & 0x4) == 4) {
                                                    class200.field3505 += class217.field3729;
                                                }
                                                if ((var69 & 0x1) == 1) {
                                                    class243.field4284 += class270.field4637;
                                                }
                                                if ((var69 & 0x2) == 2) {
                                                    class63.field1072 += class168.field2878;
                                                }
                                                class307.field5187 = 0;
                                            }
                                            if (class63.field1072 < -55) {
                                                class168.field2878 = 2;
                                            }
                                            if (class200.field3505 < -40) {
                                                class217.field3729 = 1;
                                            }
                                            if (class243.field4284 < -50) {
                                                class270.field4637 = 2;
                                            }
                                            if (class63.field1072 > 55) {
                                                class168.field2878 = -2;
                                            }
                                            if (class243.field4284 > 50) {
                                                class270.field4637 = -2;
                                            }
                                            if (class200.field3505 > 40) {
                                                class217.field3729 = -1;
                                            }
                                            if (class170.field2961 > 500) {
                                                int var70 = (int) (Math.random() * 8.0D);
                                                class170.field2961 = 0;
                                                if ((var70 & 0x1) == 1) {
                                                    class213.field3653 += class76.field1421;
                                                }
                                                if ((var70 & 0x2) == 2) {
                                                    class102.field1778 += class308.field5210;
                                                }
                                            }
                                            if (class213.field3653 < -60) {
                                                class76.field1421 = 2;
                                            }
                                            if (class213.field3653 > 60) {
                                                class76.field1421 = -2;
                                            }
                                            if (class102.field1778 < -20) {
                                                class308.field5210 = 1;
                                            }
                                            if (class102.field1778 > 10) {
                                                class308.field5210 = -1;
                                            }
                                            if (class182.field3149 > 50) {
                                                class307.field5193++;
                                                class84.field1608.method1397(106, 0);
                                            }
                                            if (class84.field1616) {
                                                class25.method235(-120);
                                                class84.field1616 = false;
                                            }
                                            try {
                                                if (class160.field2720 != null && class84.field1608.field195 > 0) {
                                                    class160.field2720.method1428(22974, class84.field1608.field195, class84.field1608.field174, 0);
                                                    class182.field3149 = 0;
                                                    class84.field1608.field195 = 0;
                                                }
                                            } catch (IOException var72) {
                                                class323.method2179((byte) 109);
                                            }
                                            return;
                                        }
                                        var60 = var59.field3327;
                                        if (var60.field1193 < 0) {
                                            break;
                                        }
                                        var61 = class96.method662(var60.field1211, true);
                                    } while (var61 == null || var61.field1243 == null || var60.field1193 >= var61.field1243.length || var61.field1243[var60.field1193] != var60);
                                    class215.method1477(-19319, var59);
                                }
                            }
                            var57 = var56.field3327;
                            if (var57.field1193 < 0) {
                                break;
                            }
                            var58 = class96.method662(var57.field1211, true);
                        } while (var58 == null || var58.field1243 == null || var57.field1193 >= var58.field1243.length || var58.field1243[var57.field1193] != var57);
                        class215.method1477(-19319, var56);
                    }
                }
                var54 = var53.field3327;
                if (var54.field1193 < 0) {
                    break;
                }
                var55 = class96.method662(var54.field1211, true);
            } while (var55 == null || var55.field1243 == null || var55.field1243.length <= var54.field1193 || var55.field1243[var54.field1193] != var54);
            class215.method1477(-19319, var53);
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(B)V", line = 1480)
    public static final void method1001(byte arg0) {
        if (arg0 >= -116) {
            field2487 = (class185) null;
        }
        class308.field5196.method230(true);
        field2492++;
        class235.field4056.method230(true);
    }
}
