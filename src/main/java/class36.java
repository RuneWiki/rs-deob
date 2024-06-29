import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class36 {

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public int field528 = -1;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field519 = -1;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "Z")
    public static boolean field523 = false;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "[I")
    public static int[] field526 = new int[2048];

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "Lfm;")
    public class336 field522;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "Ljava/awt/Image;")
    public static Image field517;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "[I")
    public int[] field521;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "[Ljava/lang/String;")
    public String[] field524;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V", line = 5)
    public static void method311(byte arg0) {
        field517 = null;
        field526 = null;
        if (arg0 != 56) {
            field526 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BZLjava/lang/String;)V", line = 17)
    public static final void method312(byte arg0, boolean arg1, String arg2) {
        field527++;
        byte var3 = 4;
        int var4 = 20 % ((-arg0 - 52) / 32);
        int var5 = var3 + 6;
        int var6 = var3 + 6;
        int var7 = class102.field1355.method2270(arg2, 250);
        int var8 = class102.field1355.method2249(arg2, 250) * 13;
        if (class109.field1458) {
            class122.method897(var5 - var3, -var3 + var6, var3 + var3 + var7, var3 + var8 - -var3, 0);
            class122.method888(var5 - var3, var6 - var3, var3 + var7 + var3, var3 + var8 + var3, 16777215);
        } else {
            class280.method1971(var5 - var3, var6 - var3, var3 + var7 + var3, var3 + var8 - -var3, 0);
            class280.method1979(var5 - var3, var6 - var3, var3 + var7 + var3, var3 + var8 + var3, 16777215);
        }
        class102.field1355.method2265(arg2, var5, var6, var7, var8, 16777215, -1, 1, 1, 0);
        class319.method2240(var3 + var7 + var3, -var3 + var5, true, var3 + var8 + var3, -var3 + var6);
        if (!arg1) {
            class96.method683(var6, var7, var8, var5, -22156);
        } else if (class109.field1458) {
            class109.method775();
        } else {
            try {
                Graphics var9 = class116.field1615.getGraphics();
                class42.field583.method515(var9, 0, 0, -121);
            } catch (Exception var11) {
                class116.field1615.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 85)
    public static final void method313(int arg0) {
        int var1 = -1;
        if (arg0 != 3658) {
            field525 = -111;
        }
        while (var1 < class232.field3631) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class81.field1116[var1];
            }
            class337 var3 = class284.field4403[var2];
            if (var3 != null) {
                class224.method1639((byte) 115, var3.method2099((byte) 123), var3);
            }
            var1++;
        }
        field516++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([[B[[BI[[F[[IIB[Lvb;[[F[[B[[B[[F)V", line = 125)
    public static final void method314(byte[][] arg0, byte[][] arg1, int arg2, float[][] arg3, int[][] arg4, int arg5, byte arg6, class79[] arg7, float[][] arg8, byte[][] arg9, byte[][] arg10, float[][] arg11) {
        field520++;
        int var12 = 0;
        if (arg6 != 37) {
            field517 = (Image) null;
        }
        while (arg2 > var12) {
            class79 var13 = arg7[var12];
            if (var13.field1061 == arg5) {
                class155 var14 = new class155();
                int var15 = 0;
                int var16 = (var13.field1068 >> 7) - var13.field1056;
                int var17 = (var13.field1072 >> 7) + var13.field1056;
                int var18 = (var13.field1072 >> 7) - var13.field1056;
                if (var17 > 103) {
                    var17 = 103;
                }
                if (var18 < 0) {
                    var15 -= var18;
                    var18 = 0;
                }
                int var19 = var18;
                while (true) {
                    if (var19 > var17) {
                        var14.method1122();
                        int var56 = 0;
                        if (((var13.field1072 >> 7) - var13.field1056) < 0) {
                            var56 -= (var13.field1072 >> 7) - var13.field1056;
                        }
                        for (int var57 = var18; var57 <= var17; var57++) {
                            short var58 = var13.field1077[var56];
                            int var59 = (var58 >> 8) + var16;
                            int var60 = (var58 & 0xFF) + var59 - 1;
                            if (var59 < 0) {
                                var59 = 0;
                            }
                            if (var60 > 103) {
                                var60 = 103;
                            }
                            for (int var61 = var59; var61 <= var60; var61++) {
                                byte var62 = arg10[var61][var57];
                                int var63 = arg9[var61][var57] & 0xFF;
                                boolean var64 = false;
                                int var65 = arg1[var61][var57] & 0xFF;
                                if (var63 == 0) {
                                    if (var65 == 0) {
                                        continue;
                                    }
                                    class10 var68 = class238.method1703(29555, var65 - 1);
                                    if (var68.field180 == -1) {
                                        continue;
                                    }
                                    if (arg0[var61][var57] != 0) {
                                        class233.method1678(arg10[var61][var57], arg11, arg3, var14, arg8, arg4, var57, var61, var13, class171.field2822[arg0[var61][var57]], (byte) 99);
                                        continue;
                                    }
                                } else if (var65 != 0) {
                                    class10 var66 = class238.method1703(29555, var65 - 1);
                                    if (var66.field180 == -1) {
                                        class233.method1678(arg10[var61][var57], arg11, arg3, var14, arg8, arg4, var57, var61, var13, class42.field573[arg0[var61][var57]], (byte) 72);
                                        continue;
                                    }
                                    byte var67 = arg0[var61][var57];
                                    if (var67 != 0) {
                                        var64 = true;
                                    }
                                }
                                class263 var69 = class117.method826(arg5, var61, var57);
                                if (var69 != null) {
                                    int var70 = (int) (var69.field4122 >> 14) & 0x3F;
                                    if (var70 == 9) {
                                        int var71 = (int) (var69.field4122 >> 20) & 0x3;
                                        int[] var72 = null;
                                        if ((var71 & 0x1) == 0) {
                                            boolean var81 = (var61 - 1) >= var59;
                                            if (!var81 && var17 >= var57 + 1) {
                                                short var82 = var13.field1077[var56 + 1];
                                                int var83 = var16 + (var82 >> 8);
                                                int var84 = (var82 & 0xFF) + var83;
                                                var81 = var83 < var61 && var84 > var61;
                                            }
                                            boolean var85 = var60 >= (var61 + 1);
                                            if (!var85 && var18 <= var57 - 1) {
                                                short var86 = var13.field1077[var56 - 1];
                                                int var87 = (var86 >> 8) + var16;
                                                int var88 = (var86 & 0xFF) + var87;
                                                var85 = var87 < var61 && var61 < var88;
                                            }
                                            if (var81 && var85) {
                                                var72 = class171.field2822[0];
                                            } else if (var81) {
                                                var62 = 1;
                                                var72 = class171.field2822[1];
                                            } else if (var85) {
                                                var62 = 3;
                                                var72 = class171.field2822[1];
                                            }
                                        } else {
                                            boolean var73 = (var61 - 1) >= var59;
                                            if (!var73 && var57 - 1 >= var18) {
                                                short var74 = var13.field1077[var56 - 1];
                                                int var75 = (var74 >> 8) + var16;
                                                int var76 = var75 + (var74 & 0xFF);
                                                var73 = var75 < var61 && var61 < var76;
                                            }
                                            boolean var77 = (var61 + 1) <= var60;
                                            if (!var77 && var17 >= var57 + 1) {
                                                short var78 = var13.field1077[var56 + 1];
                                                int var79 = (var78 >> 8) + var16;
                                                int var80 = (var78 & 0xFF) + var79;
                                                var77 = var79 < var61 && var80 > var61;
                                            }
                                            if (var73 && var77) {
                                                var72 = class171.field2822[0];
                                            } else if (var73) {
                                                var72 = class171.field2822[1];
                                                var62 = 0;
                                            } else if (var77) {
                                                var62 = 2;
                                                var72 = class171.field2822[1];
                                            }
                                        }
                                        if (var72 != null) {
                                            class233.method1678(var62, arg11, arg3, var14, arg8, arg4, var57, var61, var13, var72, (byte) 74);
                                        }
                                        continue;
                                    }
                                }
                                if (var64) {
                                    class233.method1678(arg10[var61][var57], arg11, arg3, var14, arg8, arg4, var57, var61, var13, class42.field573[arg0[var61][var57]], (byte) 106);
                                    class233.method1678(arg10[var61][var57], arg11, arg3, var14, arg8, arg4, var57, var61, var13, class171.field2822[arg0[var61][var57]], (byte) 108);
                                } else {
                                    class233.method1678(var62, arg11, arg3, var14, arg8, arg4, var57, var61, var13, class171.field2822[0], (byte) 68);
                                }
                            }
                            var56++;
                        }
                        if (var14.field2394 > 0 && var14.field2397 > 0) {
                            var14.method1125();
                            var13.field1069 = var14;
                        }
                        break;
                    }
                    short var20 = var13.field1077[var15];
                    int var21 = (var20 >> 8) + var16;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg9[var23][var19] & 0xFF;
                        boolean var25 = false;
                        int var26 = arg1[var23][var19] & 0xFF;
                        if (var24 == 0) {
                            if (var26 == 0) {
                                continue;
                            }
                            class10 var27 = class238.method1703(29555, var26 - 1);
                            if (var27.field180 == -1) {
                                continue;
                            }
                            if (arg0[var23][var19] != 0) {
                                int[] var28 = class171.field2822[arg0[var23][var19]];
                                var14.field2409 += ((var28.length >> 1) - 2) * 3;
                                var14.field2407 += var28.length >> 1;
                                continue;
                            }
                        } else if (var26 != 0) {
                            class10 var29 = class238.method1703(29555, var26 - 1);
                            if (var29.field180 == -1) {
                                byte var30 = arg0[var23][var19];
                                if (var30 != 0) {
                                    int[] var31 = class42.field573[var30];
                                    var14.field2409 += ((var31.length >> 1) - 2) * 3;
                                    var14.field2407 += var31.length >> 1;
                                }
                                continue;
                            }
                            byte var32 = arg0[var23][var19];
                            if (var32 != 0) {
                                var25 = true;
                            }
                        }
                        class263 var33 = class117.method826(arg5, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field4122 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int var35 = (int) (var33.field4122 >> 20) & 0x3;
                                int[] var36 = null;
                                if ((var35 & 0x1) == 0) {
                                    boolean var45 = var23 + 1 <= var22;
                                    boolean var46 = var23 - 1 >= var21;
                                    if (!var46 && var19 + 1 <= var17) {
                                        short var47 = var13.field1077[var15 + 1];
                                        int var48 = (var47 >> 8) + var16;
                                        int var49 = (var47 & 0xFF) + var48;
                                        var46 = var23 > var48 && var23 < var49;
                                    }
                                    if (!var45 && var18 <= (var19 - 1)) {
                                        short var50 = var13.field1077[var15 - 1];
                                        int var51 = (var50 >> 8) + var16;
                                        int var52 = var51 + (var50 & 0xFF);
                                        var45 = var23 > var51 && var52 > var23;
                                    }
                                    if (var46 && var45) {
                                        var36 = class171.field2822[0];
                                    } else if (var46) {
                                        var36 = class171.field2822[1];
                                    } else if (var45) {
                                        var36 = class171.field2822[1];
                                    }
                                } else {
                                    boolean var37 = var21 <= (var23 - 1);
                                    if (!var37 && var19 - 1 >= var18) {
                                        short var38 = var13.field1077[var15 - 1];
                                        int var39 = var16 + (var38 >> 8);
                                        int var40 = (var38 & 0xFF) + var39;
                                        var37 = var23 > var39 && var40 > var23;
                                    }
                                    boolean var41 = var23 + 1 <= var22;
                                    if (!var41 && (var19 + 1) <= var17) {
                                        short var42 = var13.field1077[var15 + 1];
                                        int var43 = (var42 >> 8) + var16;
                                        int var44 = var43 + (var42 & 0xFF);
                                        var41 = var43 < var23 && var23 < var44;
                                    }
                                    if (var37 && var41) {
                                        var36 = class171.field2822[0];
                                    } else if (var37) {
                                        var36 = class171.field2822[1];
                                    } else if (var41) {
                                        var36 = class171.field2822[1];
                                    }
                                }
                                if (var36 != null) {
                                    var14.field2409 += ((var36.length >> 1) - 2) * 3;
                                    var14.field2407 += var36.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var25) {
                            int[] var53 = class171.field2822[arg0[var23][var19]];
                            int[] var54 = class42.field573[arg0[var23][var19]];
                            var14.field2409 += (var53.length >> 1) * 3 - 6;
                            var14.field2409 += (var54.length >> 1) * 3 - 6;
                            var14.field2407 += var53.length >> 1;
                            var14.field2407 += var54.length >> 1;
                        } else {
                            int[] var55 = class171.field2822[0];
                            var14.field2409 += (var55.length >> 1) * 3 - 6;
                            var14.field2407 += var55.length >> 1;
                        }
                    }
                    var15++;
                    var19++;
                }
            }
            var12++;
        }
    }
}
