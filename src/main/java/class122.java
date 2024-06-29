import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class122 {

    @OriginalMember(owner = "client!t", name = "c", descriptor = "[I")
    public static int[] field2831 = new int[4000];

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lvc;")
    public static class137 field2832 = class45.method325(" hat sich ausgeloggt)3", -46);

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Lvc;")
    public static class137 field2839 = class45.method325("scrollbar", -46);

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Lvc;")
    public static class137 field2840 = class45.method325(" weitere Optionen", -46);

    @OriginalMember(owner = "client!t", name = "m", descriptor = "Lvc;")
    private static class137 field2841 = class45.method325("Create a free account", -46);

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Lvc;")
    public static class137 field2842 = field2841;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Lvc;")
    public static class137 field2833 = class45.method325("@cya@", -46);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "Lnb;")
    public static class88 field2843;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static void method914(byte arg0) {
        field2839 = null;
        field2840 = null;
        if (arg0 != 80) {
            method916(null, -20);
        }
        field2833 = null;
        field2831 = null;
        field2832 = null;
        field2842 = null;
        field2841 = null;
        field2843 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIZ[B)V")
    public static final void method915(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        field2838++;
        if (class143.field3362 == null) {
            return;
        }
        if (class142.field3352 >= 0) {
            class60.field1295 = arg2;
            if (class142.field3352 == 0) {
                class47.field1055 = 1;
            } else {
                int var5 = class28.method224(7470, class142.field3352);
                int var6 = var5 - class12.field259;
                class47.field1055 = (var6 + 3600) / arg2;
                if (class47.field1055 < 1) {
                    class47.field1055 = 1;
                }
            }
            class12.field273 = arg4;
            class127.field2999 = arg3;
            class121.field2816 = arg0;
        } else if (class47.field1055 == 0) {
            class107.method779((byte) 77, arg4, arg3, arg0);
        } else {
            class127.field2999 = arg3;
            class121.field2816 = arg0;
            class12.field273 = arg4;
        }
        if (arg1 != 0) {
            field2841 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lke;I)V")
    public static final void method916(class73 arg0, int arg1) {
        field2830++;
        int var2 = -1;
        int var3 = 0;
        if (arg0.field1546 == 0) {
            var3 = class10.field220.method524(arg0.field1545, arg0.field1548, arg0.field1558);
        }
        int var4 = 0;
        if (arg1 != 256) {
            return;
        }
        if (arg0.field1546 == 1) {
            var3 = class10.field220.method520(arg0.field1545, arg0.field1548, arg0.field1558);
        }
        int var5 = 0;
        if (arg0.field1546 == 2) {
            var3 = class10.field220.method531(arg0.field1545, arg0.field1548, arg0.field1558);
        }
        if (arg0.field1546 == 3) {
            var3 = class10.field220.method550(arg0.field1545, arg0.field1548, arg0.field1558);
        }
        if (var3 != 0) {
            var2 = var3 >> 14 & 0x7FFF;
            int var6 = class10.field220.method511(arg0.field1545, arg0.field1548, arg0.field1558, var3);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1539 = var5;
        arg0.field1552 = var4;
        arg0.field1553 = var2;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIII)V")
    public static final void method917(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2835++;
        int var7 = 2048 - arg1 & arg4;
        int var8 = 2048 - arg0 & 0x7FF;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg3;
        if (var7 != 0) {
            int var12 = class97.field2257[var7];
            int var13 = class97.field2258[var7];
            int var14 = var10 * var12 - arg3 * var13 >> 16;
            var11 = var10 * var13 + arg3 * var12 >> 16;
            var10 = var14;
        }
        if (var8 != 0) {
            int var15 = class97.field2258[var8];
            int var16 = class97.field2257[var8];
            int var17 = var9 * var16 + var11 * var15 >> 16;
            var11 = var11 * var16 - var9 * var15 >> 16;
            var9 = var17;
        }
        class1.field3 = arg2 - var11;
        class44.field947 = arg5 - var9;
        class6.field123 = arg0;
        class7.field142 = arg6 - var10;
        class37.field812 = arg1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILl;IILic;IIII)V")
    public static final void method918(int arg0, int arg1, class74 arg2, int arg3, int arg4, class59 arg5, int arg6, int arg7, int arg8, int arg9) {
        field2836++;
        int var10 = class61.field1329[arg8][arg0][arg7];
        if (arg4 != -1890) {
            field2839 = null;
        }
        int var11 = class61.field1329[arg8][arg0 + 1][arg7];
        int var12 = class61.field1329[arg8][arg0][arg7 + 1];
        int var13 = class61.field1329[arg8][arg0 + 1][arg7 + 1];
        int var14 = var10 + var11 + var13 + var12 >> 2;
        class126 var15 = class114.method886(6, arg6);
        int var16 = (arg1 << 6) + arg3;
        int var17 = (arg7 << 7) + (arg6 << 14) + arg0 + 1073741824;
        if (var15.field2977 == 0) {
            var17 += Integer.MIN_VALUE;
        }
        if (var15.field2940 == 1) {
            var16 += 256;
        }
        if (arg3 == 22) {
            class103 var18;
            if (var15.field2973 == -1 && var15.field2932 == null) {
                var18 = var15.method945(22, var10, var12, var11, arg1, (byte) 23, var13);
            } else {
                var18 = new class6(arg6, 22, arg1, var10, var11, var13, var12, var15.field2973, true, null);
            }
            arg2.method532(arg9, arg0, arg7, var14, var18, var17, var16);
            if (var15.field2919 && var15.field2977 == 1) {
                arg5.method423(arg0, -93, arg7);
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class103 var38;
            if (var15.field2973 == -1 && var15.field2932 == null) {
                var38 = var15.method945(10, var10, var12, var11, arg1, (byte) 23, var13);
            } else {
                var38 = new class6(arg6, 10, arg1, var10, var11, var13, var12, var15.field2973, true, null);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg1 == 1 || arg1 == 3) {
                    var40 = var15.field2952;
                    var39 = var15.field2971;
                } else {
                    var39 = var15.field2952;
                    var40 = var15.field2971;
                }
                int var41 = 0;
                if (arg3 == 11) {
                    var41 += 256;
                }
                arg2.method518(arg9, arg0, arg7, var14, var39, var40, var38, var41, var17, var16);
            }
            if (var15.field2919) {
                arg5.method425(false, var15.field2917, arg0, var15.field2952, arg1, arg7, var15.field2971);
            }
        } else if (arg3 >= 12) {
            class103 var19;
            if (var15.field2973 == -1 && var15.field2932 == null) {
                var19 = var15.method945(arg3, var10, var12, var11, arg1, (byte) 23, var13);
            } else {
                var19 = new class6(arg6, arg3, arg1, var10, var11, var13, var12, var15.field2973, true, null);
            }
            arg2.method518(arg9, arg0, arg7, var14, 1, 1, var19, 0, var17, var16);
            if (var15.field2919) {
                arg5.method425(false, var15.field2917, arg0, var15.field2952, arg1, arg7, var15.field2971);
            }
        } else if (arg3 == 0) {
            class103 var20;
            if (var15.field2973 == -1 && var15.field2932 == null) {
                var20 = var15.method945(0, var10, var12, var11, arg1, (byte) 23, var13);
            } else {
                var20 = new class6(arg6, 0, arg1, var10, var11, var13, var12, var15.field2973, true, null);
            }
            arg2.method538(arg9, arg0, arg7, var14, var20, null, class4.field79[arg1], 0, var17, var16);
            if (var15.field2919) {
                arg5.method419(arg3, arg1, arg7, var15.field2917, false, arg0);
            }
        } else if (arg3 == 1) {
            class103 var21;
            if (var15.field2973 == -1 && var15.field2932 == null) {
                var21 = var15.method945(1, var10, var12, var11, arg1, (byte) 23, var13);
            } else {
                var21 = new class6(arg6, 1, arg1, var10, var11, var13, var12, var15.field2973, true, null);
            }
            arg2.method538(arg9, arg0, arg7, var14, var21, null, class98.field2299[arg1], 0, var17, var16);
            if (var15.field2919) {
                arg5.method419(arg3, arg1, arg7, var15.field2917, false, arg0);
            }
        } else if (arg3 == 2) {
            int var22 = arg1 + 1 & 0x3;
            class103 var23;
            class103 var24;
            if (var15.field2973 == -1 && var15.field2932 == null) {
                var23 = var15.method945(2, var10, var12, var11, arg1 + 4, (byte) 23, var13);
                var24 = var15.method945(2, var10, var12, var11, var22, (byte) 23, var13);
            } else {
                var23 = new class6(arg6, 2, arg1 + 4, var10, var11, var13, var12, var15.field2973, true, null);
                var24 = new class6(arg6, 2, var22, var10, var11, var13, var12, var15.field2973, true, null);
            }
            arg2.method538(arg9, arg0, arg7, var14, var23, var24, class4.field79[arg1], class4.field79[var22], var17, var16);
            if (var15.field2919) {
                arg5.method419(arg3, arg1, arg7, var15.field2917, false, arg0);
            }
        } else if (arg3 == 3) {
            class103 var25;
            if (var15.field2973 == -1 && var15.field2932 == null) {
                var25 = var15.method945(3, var10, var12, var11, arg1, (byte) 23, var13);
            } else {
                var25 = new class6(arg6, 3, arg1, var10, var11, var13, var12, var15.field2973, true, null);
            }
            arg2.method538(arg9, arg0, arg7, var14, var25, null, class98.field2299[arg1], 0, var17, var16);
            if (var15.field2919) {
                arg5.method419(arg3, arg1, arg7, var15.field2917, false, arg0);
            }
        } else if (arg3 == 9) {
            class103 var26;
            if (var15.field2973 == -1 && var15.field2932 == null) {
                var26 = var15.method945(arg3, var10, var12, var11, arg1, (byte) 23, var13);
            } else {
                var26 = new class6(arg6, arg3, arg1, var10, var11, var13, var12, var15.field2973, true, null);
            }
            arg2.method518(arg9, arg0, arg7, var14, 1, 1, var26, 0, var17, var16);
            if (var15.field2919) {
                arg5.method425(false, var15.field2917, arg0, var15.field2952, arg1, arg7, var15.field2971);
            }
        } else {
            if (var15.field2959) {
                if (arg1 == 1) {
                    int var27 = var12;
                    var12 = var13;
                    var13 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg1 == 2) {
                    int var29 = var12;
                    var12 = var11;
                    var11 = var29;
                    int var30 = var13;
                    var13 = var10;
                    var10 = var30;
                } else if (arg1 == 3) {
                    int var28 = var12;
                    var12 = var10;
                    var10 = var11;
                    var11 = var13;
                    var13 = var28;
                }
            }
            if (arg3 == 4) {
                class103 var31;
                if (var15.field2973 == -1 && var15.field2932 == null) {
                    var31 = var15.method945(4, var10, var12, var11, 0, (byte) 23, var13);
                } else {
                    var31 = new class6(arg6, 4, 0, var10, var11, var13, var12, var15.field2973, true, null);
                }
                arg2.method547(arg9, arg0, arg7, var14, var31, class4.field79[arg1], arg1 * 512, 0, 0, var17, var16);
            } else if (arg3 == 5) {
                int var32 = 16;
                int var33 = arg2.method524(arg9, arg0, arg7);
                if (var33 != 0) {
                    var32 = class114.method886(arg4 + 1896, var33 >> 14 & 0x7FFF).field2925;
                }
                class103 var34;
                if (var15.field2973 == -1 && var15.field2932 == null) {
                    var34 = var15.method945(4, var10, var12, var11, 0, (byte) 23, var13);
                } else {
                    var34 = new class6(arg6, 4, 0, var10, var11, var13, var12, var15.field2973, true, null);
                }
                arg2.method547(arg9, arg0, arg7, var14, var34, class4.field79[arg1], arg1 * 512, class42.field930[arg1] * var32, class36.field799[arg1] * var32, var17, var16);
            } else if (arg3 == 6) {
                class103 var35;
                if (var15.field2973 == -1 && var15.field2932 == null) {
                    var35 = var15.method945(4, var10, var12, var11, 0, (byte) 23, var13);
                } else {
                    var35 = new class6(arg6, 4, 0, var10, var11, var13, var12, var15.field2973, true, null);
                }
                arg2.method547(arg9, arg0, arg7, var14, var35, 256, arg1, 0, 0, var17, var16);
            } else if (arg3 == 7) {
                class103 var36;
                if (var15.field2973 == -1 && var15.field2932 == null) {
                    var36 = var15.method945(4, var10, var12, var11, 0, (byte) 23, var13);
                } else {
                    var36 = new class6(arg6, 4, 0, var10, var11, var13, var12, var15.field2973, true, null);
                }
                arg2.method547(arg9, arg0, arg7, var14, var36, 512, arg1, 0, 0, var17, var16);
            } else if (arg3 == 8) {
                class103 var37;
                if (var15.field2973 == -1 && var15.field2932 == null) {
                    var37 = var15.method945(4, var10, var12, var11, 0, (byte) 23, var13);
                } else {
                    var37 = new class6(arg6, 4, 0, var10, var11, var13, var12, var15.field2973, true, null);
                }
                arg2.method547(arg9, arg0, arg7, var14, var37, 768, arg1, 0, 0, var17, var16);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static final void method919(int arg0) {
        field2837++;
        class107.method779((byte) 76, null, false, 0);
        if (arg0 != 16) {
            method919(75);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BLnb;Lnb;)V")
    public static final void method920(byte arg0, class88 arg1, class88 arg2) {
        class39.field864 = arg1;
        if (arg0 <= 77) {
            method918(1, -101, null, 5, -3, null, 73, -64, 93, -83);
        }
        class7.field155 = arg2;
        field2829++;
    }
}
