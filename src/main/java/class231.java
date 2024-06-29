import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class231 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "[[I")
    public static int[][] field3822 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lkh;")
    public static class13 field3816 = new class13(128);

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "[[B")
    public static byte[][] field3830 = new byte[50][];

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public static int field3837 = 0;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "Lve;")
    public static class255 field3834 = class87.method607(76, "<col=c0ff00>");

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "F")
    public static float field3835;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "Llj;")
    public static class45 field3836;

    @OriginalMember(owner = "client!fe", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 8)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3817++;
        if (class107.field1810 != null) {
            class265.field4491 = 0;
            class221.field3727 = arg0.getX();
            class82.field1343 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!fe", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 26)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3828++;
        if (class107.field1810 != null) {
            class265.field4491 = 0;
            class77.field1258 = arg0.getX();
            class266.field4513 = arg0.getY();
            class93.field1594 = class218.method1541(88);
            if (arg0.isMetaDown()) {
                class181.field2937 = 2;
                class43.field672 = 2;
            } else {
                class181.field2937 = 1;
                class43.field672 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)V", line = 74)
    public static final void method1599(int arg0, byte arg1) {
        class53 var2 = class303.method2112(-1155040160, arg0, 2);
        field3827++;
        var2.method326(-123);
        if (arg1 <= 72) {
            method1604(58, 30, -109, 63, false, -128, 127, -95, -127);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 86)
    public static void method1600(int arg0) {
        field3830 = (byte[][]) null;
        field3822 = (int[][]) null;
        field3834 = null;
        field3836 = null;
        if (arg0 > -123) {
            field3822 = (int[][]) ((int[][]) null);
        }
        field3816 = null;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(IB)V", line = 100)
    public static final void method1601(int arg0, byte arg1) {
        field3820++;
        class83 var2;
        if (class281.field4827 || class304.field5201 == null) {
            var2 = new class83(512, 512);
        } else {
            var2 = (class83) class304.field5201;
        }
        int[] var3 = var2.field1344;
        int var4 = var3.length;
        int var5 = 0;
        if (arg1 <= 40) {
            field3836 = (class45) null;
        }
        while (var4 > var5) {
            var3[var5] = 1;
            var5++;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var7 = (52736 - (var6 * 512)) * 4 + 24628;
            for (int var8 = 1; var8 < 103; var8++) {
                if ((class166.field2800[arg0][var8][var6] & 0x18) == 0) {
                    class260.method1814(var3, var7, 512, arg0, var8, var6);
                }
                if (arg0 < 3 && (class166.field2800[arg0 + 1][var8][var6] & 0x8) != 0) {
                    class260.method1814(var3, var7, 512, arg0 + 1, var8, var6);
                }
                var7 += 4;
            }
        }
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((((int) (Math.random() * 20.0D)) + 238 - 10 << 8) - (10 - ((int) (Math.random() * 20.0D)) - 238));
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        var2.method582();
        for (int var11 = 1; var11 < 103; var11++) {
            for (int var12 = 1; var12 < 103; var12++) {
                if ((class166.field2800[arg0][var12][var11] & 0x18) == 0) {
                    class22.method123(var9, (byte) -105, var11, var10, var12, arg0);
                }
                if (arg0 < 3 && (class166.field2800[arg0 + 1][var12][var11] & 0x8) != 0) {
                    class22.method123(var9, (byte) -105, var11, var10, var12, arg0 + 1);
                }
            }
        }
        class191.field3051 = 0;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                long var15 = class56.method347(client.field4039, var13, var14);
                if (var15 != 0L) {
                    class145 var17 = class289.method2046(-12453, Integer.MAX_VALUE & (int) (var15 >>> 32));
                    int var18 = var17.field2464;
                    if (var17.field2454 != null) {
                        for (int var19 = 0; var19 < var17.field2454.length; var19++) {
                            if (var17.field2454[var19] != -1) {
                                class145 var20 = class289.method2046(-12453, var17.field2454[var19]);
                                if (var20.field2464 >= 0) {
                                    var18 = var20.field2464;
                                    break;
                                }
                            }
                        }
                    }
                    if (var18 >= 0) {
                        int var21 = var13;
                        int var22 = var14;
                        if (var18 != 22 && var18 != 29 && var18 != 34 && var18 != 36 && var18 != 46 && var18 != 47 && var18 != 48) {
                            int[][] var23 = class310.field5292[client.field4039].field2743;
                            for (int var24 = 0; var24 < 10; var24++) {
                                int var25 = (int) (Math.random() * 4.0D);
                                if (var25 == 0 && var21 > 0 && var13 - 3 < var21 && (var23[var21 - 1][var22] & 0x12C0108) == 0) {
                                    var21--;
                                }
                                if (var25 == 1 && var21 < 103 && var13 + 3 > var21 && (var23[var21 + 1][var22] & 0x12C0180) == 0) {
                                    var21++;
                                }
                                if (var25 == 2 && var22 > 0 && var22 > (var14 - 3) && (var23[var21][var22 - 1] & 0x12C0102) == 0) {
                                    var22--;
                                }
                                if (var25 == 3 && var22 < 103 && var22 < var14 + 3 && (var23[var21][var22 + 1] & 0x12C0120) == 0) {
                                    var22++;
                                }
                            }
                        }
                        class201.field3488[class191.field3051] = var17.field2458;
                        class177.field2898[class191.field3051] = var21;
                        class111.field1870[class191.field3051] = var22;
                        class191.field3051++;
                    }
                }
            }
        }
        if (class281.field4827) {
            for (int var26 = 0; var26 < var4; var26++) {
                if (var3[var26] == 0) {
                    var3[var26] = 1;
                }
            }
            class304.field5201 = new class98(var2);
        } else {
            class304.field5201 = var2;
        }
        if (class281.field4827) {
            class175.field2891 = null;
        } else {
            class69.field1033.method1657(25);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IJ[II)Lve;", line = 308)
    public static final class255 method1602(int arg0, long arg1, int[] arg2, int arg3) {
        field3832++;
        if (class266.field4499 != null) {
            class255 var5 = class266.field4499.method925(arg2, arg1, arg3, (byte) 76);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg3 == 5) {
            return class147.method1091(arg1, arg0 - 128).method1787(true);
        } else {
            if (arg0 != 0) {
                method1600(-22);
            }
            return class264.method1843(arg1, (byte) 82);
        }
    }

    @OriginalMember(owner = "client!fe", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 334)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3818++;
        if (class107.field1810 != null) {
            class265.field4491 = 0;
            class221.field3727 = -1;
            class82.field1343 = -1;
        }
    }

    @OriginalMember(owner = "client!fe", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 351)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class107.field1810 != null) {
            class265.field4491 = 0;
            class221.field3727 = arg0.getX();
            class82.field1343 = arg0.getY();
        }
        field3833++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lpb;B)V", line = 370)
    public static final void method1603(class70 arg0, byte arg1) {
        field3829++;
        if (arg1 != -47) {
            method1604(-124, -50, 24, -54, false, -35, -13, 121, 77);
        }
        int var2 = class244.field4117 >> 2 << 10;
        int var3 = class289.field4964 >> 1;
        byte[][] var4 = new byte[class282.field4846][class41.field636];
        while (arg0.field1068 < arg0.field1066.length) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg0.method481(arg1 ^ 0xFFFFFFD1) == 1) {
                var5 = true;
                var6 = arg0.method481(0);
                var7 = arg0.method481(0);
            }
            int var8 = arg0.method481(arg1 ^ 0xFFFFFFD1);
            int var9 = arg0.method481(0);
            int var10 = var8 * 64 - class225.field3768;
            int var11 = class297.field5084 + class41.field636 - var9 * 64 - 1;
            if (var10 >= 0 && var11 - 63 >= 0 && class282.field4846 > var10 + 63 && var11 < class41.field636) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var12 >= var6 * 8 && (var6 * 8 + 8) > var12 && var7 * 8 <= var14 && (var7 * 8 + 8) > var14) {
                            var13[var11 - var14] = arg0.method466((byte) -70);
                        }
                    }
                }
            } else if (var5) {
                arg0.field1068 += 64;
            } else {
                arg0.field1068 += 4096;
            }
        }
        int var15 = class282.field4846;
        int var16 = class41.field636;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var15) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class277 var26 = class58.method356((byte) 79, var25 - 1);
                        var18[var23] += var26.field4755;
                        var19[var23] += var26.field4759;
                        var17[var23] += var26.field4762;
                        var20[var23] += var26.field4747;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class277 var29 = class58.method356((byte) 77, var28 - 1);
                        var18[var23] -= var29.field4755;
                        var19[var23] -= var29.field4759;
                        var17[var23] -= var29.field4762;
                        var20[var23] -= var29.field4747;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int var30 = 0;
                int[][] var31 = class203.field3503[var22 >> 6];
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 + 5;
                    if (var37 < var16) {
                        var33 += var17[var37];
                        var35 += var21[var37];
                        var34 += var20[var37];
                        var32 += var19[var37];
                        var30 += var18[var37];
                    }
                    int var38 = var36 - 5;
                    if (var38 >= 0) {
                        var33 -= var17[var38];
                        var30 -= var18[var38];
                        var32 -= var19[var38];
                        var35 -= var21[var38];
                        var34 -= var20[var38];
                    }
                    if (var36 >= 0 && var35 > 0) {
                        int[] var39 = var31[var36 >> 6];
                        int var40 = var34 == 0 ? 0 : class279.method1944(var33 / var35, var30 * 256 / var34, var32 / var35, 4);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var31[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var3;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var40 + var2 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[(class154.method1134(var36, 63) << 6) + class154.method1134(63, var22)] = class283.field4865[class143.method1065(96, false, var42)];
                        } else if (var39 != null) {
                            var39[(class154.method1134(63, var36) << 6) + class154.method1134(63, var22)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 605)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class107.field1810 != null) {
            class265.field4491 = 0;
            class43.field672 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
        }
        field3831++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fe", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 640)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class107.field1810 != null) {
            class265.field4491 = 0;
            class221.field3727 = arg0.getX();
            class82.field1343 = arg0.getY();
        }
        field3824++;
    }

    @OriginalMember(owner = "client!fe", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 660)
    public final synchronized void focusLost(FocusEvent arg0) {
        field3819++;
        if (class107.field1810 != null) {
            class43.field672 = 0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 680)
    public final void mouseClicked(MouseEvent arg0) {
        field3815++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIZIIII)V", line = 695)
    public static final void method1604(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field3825++;
        if (arg4) {
            field3830 = (byte[][]) ((byte[][]) null);
        }
        int var9 = arg3 - arg0;
        int var10 = arg2 - arg8;
        int var11 = (arg5 - arg1 << 16) / var10;
        int var12 = (arg7 - arg6 << 16) / var9;
        class85.method596(arg0, 0, var12, var11, arg3, 87, 0, arg8, arg6, arg1, arg2);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V", line = 726)
    public static final void method1605(boolean arg0) {
        class291.field5003 = (int[][][]) null;
        class122.field2037 = (byte[][][]) null;
        class125.field2079 = null;
        if (arg0) {
            method1602(72, 113L, (int[]) null, -73);
        }
        class168.field2827 = null;
        class210.field3579 = null;
        class190.field3043 = null;
        class159.field2685 = (byte[][][]) null;
        class282.field4847 = (byte[][][]) null;
        class220.field3704 = (byte[][][]) null;
        class248.field4156 = (byte[][][]) null;
        class143.field2391 = null;
        field3826++;
    }

    @OriginalMember(owner = "client!fe", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 747)
    public final void focusGained(FocusEvent arg0) {
        field3838++;
    }
}
