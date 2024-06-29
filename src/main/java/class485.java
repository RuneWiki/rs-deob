import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class485 extends class456 {

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "[I")
    public static int[] field6813 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "Z")
    public static boolean field6817 = false;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "Lo;")
    public static class332 field6808 = new class332("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!rl", name = "V", descriptor = "Lct;")
    public static class285 field6819 = new class285(45, -1);

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!rl", name = "U", descriptor = "I")
    public static int field6818;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rl", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field6822;

    @OriginalMember(owner = "client!rl", name = "X", descriptor = "[I")
    public static int[] field6821;

    @OriginalMember(owner = "client!rl", name = "W", descriptor = "[[B")
    public static byte[][] field6820;

    // $FF: synthetic method
    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2842(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)[I", line = 3)
    public final int[] method33(int arg0, int arg1) {
        ++field6818;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (arg0 != -1) {
            return null;
        } else {
            if (super.field6466.field6153) {
                for (int var4 = 0; ~var4 > ~class156.field2169; ++var4) {
                    this.method2837((byte) 1, arg1, var4);
                    int[] var5 = this.method2707(class50.field726, -31797, 0);
                    var3[var4] = var5[class238.field3471];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILjava/lang/String;II)V", line = 36)
    public static final void method2834(int arg0, int arg1, String arg2, int arg3, int arg4) {
        ++field6816;
        class178 var5 = class331.method2032(arg4, arg3, -1);
        if (var5 != null) {
            if (var5.field2574 != null) {
                class415 var6 = new class415();
                var6.field5982 = arg1;
                var6.field5990 = var5;
                var6.field5989 = var5.field2574;
                var6.field5991 = arg2;
                class477.method2797(var6);
            }
            boolean var7 = true;
            if (var5.field2577 != 0) {
                var7 = class116.method835(-958, var5);
            }
            if (var7) {
                if (client.method2777(var5).method1208(-197495039, arg1 + -1)) {
                    if (~arg1 == -2) {
                        class378.method2320(class251.field3618, (byte) 119);
                        ++class298.field4459;
                        class446.method2595(arg4, var5.field2605, arg3, 6325);
                    }
                    if (arg0 != 18776) {
                        field6819 = null;
                    }
                    if (arg1 == 2) {
                        class378.method2320(class286.field4372, (byte) 119);
                        ++class419.field6022;
                        class446.method2595(arg4, var5.field2605, arg3, 6325);
                    }
                    if (~arg1 == -4) {
                        ++class412.field5954;
                        class378.method2320(class450.field6351, (byte) 119);
                        class446.method2595(arg4, var5.field2605, arg3, 6325);
                    }
                    if (arg1 == 4) {
                        class378.method2320(class198.field2975, (byte) 119);
                        ++class400.field5839;
                        class446.method2595(arg4, var5.field2605, arg3, 6325);
                    }
                    if (arg1 == 5) {
                        ++class391.field5753;
                        class378.method2320(class63.field861, (byte) 119);
                        class446.method2595(arg4, var5.field2605, arg3, arg0 + -12451);
                    }
                    if (~arg1 == -7) {
                        class378.method2320(class431.field6128, (byte) 119);
                        ++class318.field4776;
                        class446.method2595(arg4, var5.field2605, arg3, arg0 ^ 20973);
                    }
                    if (arg1 == 7) {
                        ++class183.field2704;
                        class378.method2320(class103.field1444, (byte) 119);
                        class446.method2595(arg4, var5.field2605, arg3, 6325);
                    }
                    if (~arg1 == -9) {
                        ++class44.field599;
                        class378.method2320(class4.field84, (byte) 119);
                        class446.method2595(arg4, var5.field2605, arg3, 6325);
                    }
                    if (arg1 == 9) {
                        class378.method2320(class247.field3586, (byte) 119);
                        ++class406.field5901;
                        class446.method2595(arg4, var5.field2605, arg3, 6325);
                    }
                    if (arg1 == 10) {
                        class378.method2320(class33.field426, (byte) 119);
                        ++class439.field6196;
                        class446.method2595(arg4, var5.field2605, arg3, arg0 ^ 20973);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIBIII)V", line = 155)
    public static final void method2835(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (~arg1 <= ~class293.field4420 && ~class119.field1643 <= ~arg7 && ~class176.field2503 >= ~arg6 && class296.field4443 >= arg5) {
            class431.method2525(arg2, -41, arg3, arg7, arg1, arg0, arg6, arg5);
        } else {
            class247.method1585(-121, arg3, arg6, arg7, arg2, arg5, arg0, arg1);
        }
        int var8 = -3 % ((arg4 - -76) / 45);
        ++field6812;
    }

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "(I)V", line = 174)
    public static void method2836(int arg0) {
        if (arg0 == -2) {
            field6808 = null;
            field6819 = null;
            field6813 = null;
            field6820 = null;
            field6821 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBLre;)V", line = 188)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        ++field6810;
        if (~arg0 == -1) {
            super.field6486 = ~arg2.method2628(49152) == -2;
        }
        if (arg1 != 55) {
            field6820 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)[[I", line = 202)
    public final int[][] method212(int arg0, int arg1) {
        ++field6807;
        if (arg0 != 0) {
            return null;
        } else {
            int[][] var3 = super.field6468.method1090(-2, arg1);
            if (super.field6468.field2227) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~var7 > ~class156.field2169; ++var7) {
                    this.method2837((byte) 1, arg1, var7);
                    int[][] var8 = this.method2709(false, class50.field726, 0);
                    var4[var7] = var8[0][class238.field3471];
                    var5[var7] = var8[1][class238.field3471];
                    var6[var7] = var8[2][class238.field3471];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(BII)V", line = 246)
    private final void method2837(byte arg0, int arg1, int arg2) {
        ++field6806;
        int var4 = class288.field4397[arg2];
        int var5 = class14.field206[arg1];
        if (arg0 == 1) {
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class50.field726 = arg1;
                class238.field3471 = arg2;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class238.field3471 = arg1;
                class50.field726 = arg2;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class238.field3471 = -arg1 + class156.field2169;
                class50.field726 = arg2;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class50.field726 = class487.field6842 - arg1;
                class238.field3471 = arg2;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class50.field726 = -arg1 + class487.field6842;
                class238.field3471 = -arg2 + class156.field2169;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class238.field3471 = -arg1 + class156.field2169;
                class50.field726 = -arg2 + class487.field6842;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class238.field3471 = arg1;
                class50.field726 = -arg2 + class487.field6842;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class238.field3471 = -arg2 + class156.field2169;
                class50.field726 = arg1;
            }
            class238.field3471 &= class428.field6112;
            class50.field726 &= class493.field6947;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([BI)Lbu;", line = 319)
    public static final class99 method2838(byte[] arg0, int arg1) {
        ++field6811;
        class99 var2 = new class99();
        class446 var3 = new class446(arg0);
        var3.field6315 = var3.field6316.length + -2;
        int var4 = var3.method2631(2530);
        int var5 = var3.field6316.length + arg1 + -12 + -var4;
        var3.field6315 = var5;
        int var6 = var3.method2604(53);
        var2.field1402 = var3.method2631(2530);
        var2.field1401 = var3.method2631(2530);
        var2.field1413 = var3.method2631(2530);
        var2.field1407 = var3.method2631(arg1 ^ -2532);
        int var7 = var3.method2628(49152);
        if (~var7 < -1) {
            var2.field1416 = new class371[var7];
            for (int var8 = 0; ~var8 > ~var7; ++var8) {
                int var9 = var3.method2631(2530);
                class371 var10 = new class371(class158.method1078((byte) -112, var9));
                var2.field1416[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method2604(arg1 ^ -82);
                    int var12 = var3.method2604(122);
                    var10.method2307((long) var11, new class145(var12), (byte) 126);
                }
            }
        }
        var3.field6315 = 0;
        var2.field1410 = var3.method2605((byte) -57);
        var2.field1415 = new int[var6];
        var2.field1408 = new String[var6];
        var2.field1411 = new int[var6];
        int var13 = 0;
        while (~var5 < ~var3.field6315) {
            int var14 = var3.method2631(2530);
            if (~var14 != -4) {
                if (~var14 > -101 && var14 != 21 && var14 != 38 && var14 != 39) {
                    var2.field1415[var13] = var3.method2604(73);
                } else {
                    var2.field1415[var13] = var3.method2628(class76.method648(arg1, -49154));
                }
            } else {
                var2.field1408[var13] = var3.method2582((byte) -36).intern();
            }
            var2.field1411[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZ)I", line = 396)
    public static final int method2839(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method2836(-28);
        }
        ++field6815;
        return arg0 != 4 && arg0 != 5 ? 256 : class37.field479[arg1 & 3];
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILjava/lang/String;Ltr;Lje;Lis;ILus;IIII)V", line = 412)
    public static final void method2840(int arg0, int arg1, String arg2, class229 arg3, class178 arg4, class1 arg5, int arg6, class401 arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field6809;
        if (arg8 <= 37) {
            field6819 = null;
        }
        int var12;
        if (~class469.field6596 == -5) {
            var12 = (int) class384.field5682 & 16383;
        } else {
            var12 = (int) class384.field5682 + class347.field5291 & 16383;
        }
        int var13 = 10 + Math.max(arg4.field2595 / 2, arg4.field2589 / 2);
        int var14 = arg1 * arg1 + arg6 * arg6;
        if (var13 * var13 >= var14) {
            int var15 = class172.field2450[var12];
            int var16 = class172.field2456[var12];
            if (class469.field6596 != 4) {
                var16 = var16 * 256 / (class358.field5437 + 256);
                var15 = var15 * 256 / (class358.field5437 - -256);
            }
            int var17 = arg1 * var16 + arg6 * var15 >> 15;
            int var18 = arg6 * var16 - arg1 * var15 >> 15;
            int var19 = arg5.method1(arg2, 100, (class319[]) null, 0);
            int var20 = var17 - var19 / 2;
            int var21 = arg5.method7(arg2, 1, (class319[]) null, 100, 0);
            if (var20 >= -arg4.field2595 && arg4.field2595 >= var20 && -arg4.field2589 <= var18 && var18 <= arg4.field2589) {
                arg3.method1492(50, var19, arg0, arg2, arg10, 0, arg7, (int[]) null, arg4.field2595 / 2 + var20 + arg0, 1, 0, -108, (class319[]) null, 0, arg9, -var21 + arg10 - -(arg4.field2589 / 2) - (var18 - -arg11));
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V", line = 459)
    public class485() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIII)V", line = 478)
    public static final void method2841(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6814;
        if (~arg7 <= -1 && ~arg6 <= -1 && ~arg7 > ~(class379.field5642 + -1) && class456.field6477 + -1 > arg6) {
            if (class170.field2427 == null) {
                return;
            }
            if (~arg0 == -1) {
                class218 var8 = (class218) class147.method1006(arg3, arg7, arg6);
                class218 var9 = (class218) class123.method863(arg3, arg7, arg6);
                if (var8 != null && arg1 != 2) {
                    if (var8 instanceof class37) {
                        ((class37) var8).field491.method1365(arg4 ^ -126, arg2);
                    } else {
                        class2.method12(arg6, var8.method257(false), arg5, arg7, arg3, arg0, arg4 ^ 20581, arg2, arg1);
                    }
                }
                if (var9 != null) {
                    if (var9 instanceof class37) {
                        ((class37) var9).field491.method1365(-55, arg2);
                    } else {
                        class2.method12(arg6, var9.method257(false), arg5, arg7, arg3, arg0, 20576, arg2, arg1);
                    }
                }
            } else if (arg0 != 1) {
                if (arg0 == 2) {
                    class218 var10 = (class218) class390.method2350(arg3, arg7, arg6, field6822 != null ? field6822 : (field6822 = method2842("ki")));
                    if (var10 != null) {
                        if (~arg1 == -12) {
                            arg1 = 10;
                        }
                        if (!(var10 instanceof class129)) {
                            class2.method12(arg6, var10.method257(false), arg5, arg7, arg3, arg0, 20576, arg2, arg1);
                        } else {
                            ((class129) var10).field1798.method1365(arg4 + -103, arg2);
                        }
                    }
                } else if (~arg0 == -4) {
                    class218 var11 = (class218) class487.method2848(arg3, arg7, arg6);
                    if (var11 != null) {
                        if (!(var11 instanceof class29)) {
                            class2.method12(arg6, var11.method257(false), arg5, arg7, arg3, arg0, arg4 ^ 20581, arg2, arg1);
                        } else {
                            ((class29) var11).field379.method1365(-124, arg2);
                        }
                    }
                }
            } else {
                class218 var12 = (class218) class115.method826(arg3, arg7, arg6);
                if (var12 != null) {
                    if (!(var12 instanceof class228)) {
                        int var13 = var12.method257(false);
                        if (~arg1 != -5 && arg1 != 5) {
                            if (arg1 == 6) {
                                class2.method12(arg6, var13, arg5 + 4, arg7, arg3, arg0, 20576, arg2, 4);
                            } else if (arg1 != 7) {
                                if (arg1 == 8) {
                                    class2.method12(arg6, var13, arg5 + 4, arg7, arg3, arg0, 20576, arg2, 4);
                                    class2.method12(arg6, var13, (arg5 + 2 & 3) + 4, arg7, arg3, arg0, 20576, arg2, 4);
                                }
                            } else {
                                class2.method12(arg6, var13, (arg5 + 2 & 3) - -4, arg7, arg3, arg0, 20576, arg2, 4);
                            }
                        } else {
                            class2.method12(arg6, var13, arg5, arg7, arg3, arg0, 20576, arg2, 4);
                        }
                    } else {
                        ((class228) var12).field3330.method1365(-119, arg2);
                    }
                }
            }
        }
        if (arg4 != 5) {
            field6813 = null;
        }
    }
}
