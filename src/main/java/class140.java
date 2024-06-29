import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class class140 {

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Lsd;")
    private static class166 field2734 = class135.method935(" is already on your ignore list)3", 0);

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Lsd;")
    public static class166 field2732 = field2734;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field2733 = 0;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2728 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Ljf;")
    public static class87 field2735;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "[Lre;")
    public static class158[] field2736;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIBIIILi;ILpf;)V")
    public static final void method954(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class73 arg6, int arg7, class141 arg8) {
        field2731++;
        if (class97.field1858 && (class122.field2387[0][arg7][arg4] & 0x2) == 0) {
            if ((class122.field2387[arg1][arg7][arg4] & 0x10) != 0) {
                return;
            }
            if (class113.method827(arg4, 126, arg7, arg1) != class37.field682) {
                return;
            }
        }
        if (class120.field2351 > arg1) {
            class120.field2351 = arg1;
        }
        class145 var9 = class170.method1185((byte) 109, arg3);
        int var10;
        int var11;
        if (arg0 == 1 || arg0 == 3) {
            var11 = var9.field2832;
            var10 = var9.field2825;
        } else {
            var10 = var9.field2832;
            var11 = var9.field2825;
        }
        int var12;
        int var13;
        if (arg7 + var11 <= 104) {
            var12 = (var11 + 1 >> 1) + arg7;
            var13 = (var11 >> 1) + arg7;
        } else {
            var13 = arg7;
            var12 = arg7 + 1;
        }
        int var14;
        int var15;
        if (arg4 + var10 > 104) {
            var14 = arg4;
            var15 = arg4 + 1;
        } else {
            var14 = (var10 >> 1) + arg4;
            var15 = (var10 + 1 >> 1) + arg4;
        }
        int[][] var16 = class74.field1511[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg4 << 7) + (var10 << 6);
        int var19 = (arg7 << 7) + (var11 << 6);
        int var20 = arg7 + (arg3 << 14) + (arg4 << 7) + 1073741824;
        if (var9.field2839 == 0) {
            var20 += Integer.MIN_VALUE;
        }
        int var21 = (arg0 << 6) + arg5;
        if (var9.field2857 == 1) {
            var21 += 256;
        }
        if (var9.method1000((byte) 1)) {
            class2.method11(arg1, arg7, 0, arg4, var9, arg0);
        }
        if (arg5 == 22) {
            if (!class97.field1858 || var9.field2839 != 0 || var9.field2819 == 1 || var9.field2835) {
                class42 var22;
                if (var9.field2844 == -1 && var9.field2813 == null) {
                    var22 = var9.method995(var17, 22, var16, var19, (byte) 54, arg0, var18);
                } else {
                    var22 = new class119(arg3, 22, arg0, arg1, arg7, arg4, var9.field2844, true, null);
                }
                arg6.method591(arg1, arg7, arg4, var17, var22, var20, var21);
                if (var9.field2819 == 1 && arg8 != null) {
                    arg8.method960(arg4, (byte) 84, arg7);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class42 var46;
            if (var9.field2844 == -1 && var9.field2813 == null) {
                var46 = var9.method995(var17, 10, var16, var19, (byte) -91, arg0, var18);
            } else {
                var46 = new class119(arg3, 10, arg0, arg1, arg7, arg4, var9.field2844, true, null);
            }
            if (var46 != null && arg6.method607(arg1, arg7, arg4, var17, var11, var10, var46, arg5 == 11 ? 256 : 0, var20, var21) && var9.field2858) {
                int var47 = 15;
                if (var46 instanceof class126) {
                    var47 = ((class126) var46).method903() / 4;
                    if (var47 > 30) {
                        var47 = 30;
                    }
                }
                for (int var48 = 0; var48 <= var11; var48++) {
                    for (int var49 = 0; var49 <= var10; var49++) {
                        if (var47 > class74.field1538[arg1][arg7 + var48][arg4 + var49]) {
                            class74.field1538[arg1][arg7 + var48][arg4 + var49] = (byte) var47;
                        }
                    }
                }
            }
            if (var9.field2819 != 0 && arg8 != null) {
                arg8.method972(arg4, var9.field2866, var10, var11, arg7, true);
            }
        } else if (arg5 >= 12) {
            class42 var23;
            if (var9.field2844 == -1 && var9.field2813 == null) {
                var23 = var9.method995(var17, arg5, var16, var19, (byte) -67, arg0, var18);
            } else {
                var23 = new class119(arg3, arg5, arg0, arg1, arg7, arg4, var9.field2844, true, null);
            }
            arg6.method607(arg1, arg7, arg4, var17, 1, 1, var23, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg1 > 0) {
                class5.field98[arg1][arg7][arg4] = class6.method42(class5.field98[arg1][arg7][arg4], 2340);
            }
            if (var9.field2819 != 0 && arg8 != null) {
                arg8.method972(arg4, var9.field2866, var10, var11, arg7, true);
            }
        } else if (arg5 == 0) {
            class42 var24;
            if (var9.field2844 == -1 && var9.field2813 == null) {
                var24 = var9.method995(var17, 0, var16, var19, (byte) -91, arg0, var18);
            } else {
                var24 = new class119(arg3, 0, arg0, arg1, arg7, arg4, var9.field2844, true, null);
            }
            arg6.method592(arg1, arg7, arg4, var17, var24, null, class56.field1072[arg0], 0, var20, var21);
            if (arg0 == 0) {
                if (var9.field2858) {
                    class74.field1538[arg1][arg7][arg4] = 50;
                    class74.field1538[arg1][arg7][arg4 + 1] = 50;
                }
                if (var9.field2810) {
                    class5.field98[arg1][arg7][arg4] = class6.method42(class5.field98[arg1][arg7][arg4], 585);
                }
            } else if (arg0 == 1) {
                if (var9.field2858) {
                    class74.field1538[arg1][arg7][arg4 + 1] = 50;
                    class74.field1538[arg1][arg7 + 1][arg4 + 1] = 50;
                }
                if (var9.field2810) {
                    class5.field98[arg1][arg7][arg4 + 1] = class6.method42(class5.field98[arg1][arg7][arg4 + 1], 1170);
                }
            } else if (arg0 == 2) {
                if (var9.field2858) {
                    class74.field1538[arg1][arg7 + 1][arg4] = 50;
                    class74.field1538[arg1][arg7 + 1][arg4 + 1] = 50;
                }
                if (var9.field2810) {
                    class5.field98[arg1][arg7 + 1][arg4] = class6.method42(class5.field98[arg1][arg7 + 1][arg4], 585);
                }
            } else if (arg0 == 3) {
                if (var9.field2858) {
                    class74.field1538[arg1][arg7][arg4] = 50;
                    class74.field1538[arg1][arg7 + 1][arg4] = 50;
                }
                if (var9.field2810) {
                    class5.field98[arg1][arg7][arg4] = class6.method42(class5.field98[arg1][arg7][arg4], 1170);
                }
            }
            if (var9.field2819 != 0 && arg8 != null) {
                arg8.method966(1, arg5, var9.field2866, arg7, arg0, arg4);
            }
            if (var9.field2824 != 16) {
                arg6.method602(arg1, arg7, arg4, var9.field2824);
            }
        } else {
            int var25 = -90 % ((51 - arg2) / 55);
            if (arg5 == 1) {
                class42 var26;
                if (var9.field2844 == -1 && var9.field2813 == null) {
                    var26 = var9.method995(var17, 1, var16, var19, (byte) 69, arg0, var18);
                } else {
                    var26 = new class119(arg3, 1, arg0, arg1, arg7, arg4, var9.field2844, true, null);
                }
                arg6.method592(arg1, arg7, arg4, var17, var26, null, class154.field2972[arg0], 0, var20, var21);
                if (var9.field2858) {
                    if (arg0 == 0) {
                        class74.field1538[arg1][arg7][arg4 + 1] = 50;
                    } else if (arg0 == 1) {
                        class74.field1538[arg1][arg7 + 1][arg4 + 1] = 50;
                    } else if (arg0 == 2) {
                        class74.field1538[arg1][arg7 + 1][arg4] = 50;
                    } else if (arg0 == 3) {
                        class74.field1538[arg1][arg7][arg4] = 50;
                    }
                }
                if (var9.field2819 != 0 && arg8 != null) {
                    arg8.method966(1, arg5, var9.field2866, arg7, arg0, arg4);
                }
            } else if (arg5 == 2) {
                int var27 = arg0 + 1 & 0x3;
                class42 var28;
                class42 var29;
                if (var9.field2844 == -1 && var9.field2813 == null) {
                    var28 = var9.method995(var17, 2, var16, var19, (byte) -94, arg0 + 4, var18);
                    var29 = var9.method995(var17, 2, var16, var19, (byte) 97, var27, var18);
                } else {
                    var28 = new class119(arg3, 2, arg0 + 4, arg1, arg7, arg4, var9.field2844, true, null);
                    var29 = new class119(arg3, 2, var27, arg1, arg7, arg4, var9.field2844, true, null);
                }
                arg6.method592(arg1, arg7, arg4, var17, var28, var29, class56.field1072[arg0], class56.field1072[var27], var20, var21);
                if (var9.field2810) {
                    if (arg0 == 0) {
                        class5.field98[arg1][arg7][arg4] = class6.method42(class5.field98[arg1][arg7][arg4], 585);
                        class5.field98[arg1][arg7][arg4 + 1] = class6.method42(class5.field98[arg1][arg7][arg4 + 1], 1170);
                    } else if (arg0 == 1) {
                        class5.field98[arg1][arg7][arg4 + 1] = class6.method42(class5.field98[arg1][arg7][arg4 + 1], 1170);
                        class5.field98[arg1][arg7 + 1][arg4] = class6.method42(class5.field98[arg1][arg7 + 1][arg4], 585);
                    } else if (arg0 == 2) {
                        class5.field98[arg1][arg7 + 1][arg4] = class6.method42(class5.field98[arg1][arg7 + 1][arg4], 585);
                        class5.field98[arg1][arg7][arg4] = class6.method42(class5.field98[arg1][arg7][arg4], 1170);
                    } else if (arg0 == 3) {
                        class5.field98[arg1][arg7][arg4] = class6.method42(class5.field98[arg1][arg7][arg4], 1170);
                        class5.field98[arg1][arg7][arg4] = class6.method42(class5.field98[arg1][arg7][arg4], 585);
                    }
                }
                if (var9.field2819 != 0 && arg8 != null) {
                    arg8.method966(1, arg5, var9.field2866, arg7, arg0, arg4);
                }
                if (var9.field2824 != 16) {
                    arg6.method602(arg1, arg7, arg4, var9.field2824);
                }
            } else if (arg5 == 3) {
                class42 var30;
                if (var9.field2844 == -1 && var9.field2813 == null) {
                    var30 = var9.method995(var17, 3, var16, var19, (byte) -75, arg0, var18);
                } else {
                    var30 = new class119(arg3, 3, arg0, arg1, arg7, arg4, var9.field2844, true, null);
                }
                arg6.method592(arg1, arg7, arg4, var17, var30, null, class154.field2972[arg0], 0, var20, var21);
                if (var9.field2858) {
                    if (arg0 == 0) {
                        class74.field1538[arg1][arg7][arg4 + 1] = 50;
                    } else if (arg0 == 1) {
                        class74.field1538[arg1][arg7 + 1][arg4 + 1] = 50;
                    } else if (arg0 == 2) {
                        class74.field1538[arg1][arg7 + 1][arg4] = 50;
                    } else if (arg0 == 3) {
                        class74.field1538[arg1][arg7][arg4] = 50;
                    }
                }
                if (var9.field2819 != 0 && arg8 != null) {
                    arg8.method966(1, arg5, var9.field2866, arg7, arg0, arg4);
                }
            } else if (arg5 == 9) {
                class42 var31;
                if (var9.field2844 == -1 && var9.field2813 == null) {
                    var31 = var9.method995(var17, arg5, var16, var19, (byte) 80, arg0, var18);
                } else {
                    var31 = new class119(arg3, arg5, arg0, arg1, arg7, arg4, var9.field2844, true, null);
                }
                arg6.method607(arg1, arg7, arg4, var17, 1, 1, var31, 0, var20, var21);
                if (var9.field2819 != 0 && arg8 != null) {
                    arg8.method972(arg4, var9.field2866, var10, var11, arg7, true);
                }
                if (var9.field2824 != 16) {
                    arg6.method602(arg1, arg7, arg4, var9.field2824);
                }
            } else if (arg5 == 4) {
                class42 var32;
                if (var9.field2844 == -1 && var9.field2813 == null) {
                    var32 = var9.method995(var17, 4, var16, var19, (byte) 48, arg0, var18);
                } else {
                    var32 = new class119(arg3, 4, arg0, arg1, arg7, arg4, var9.field2844, true, null);
                }
                arg6.method616(arg1, arg7, arg4, var17, var32, null, class56.field1072[arg0], 0, 0, 0, var20, var21);
            } else if (arg5 == 5) {
                int var33 = arg6.method595(arg1, arg7, arg4);
                int var34 = 16;
                if (var33 != 0) {
                    var34 = class170.method1185((byte) 76, var33 >> 14 & 0x7FFF).field2824;
                }
                class42 var35;
                if (var9.field2844 == -1 && var9.field2813 == null) {
                    var35 = var9.method995(var17, 4, var16, var19, (byte) -81, arg0, var18);
                } else {
                    var35 = new class119(arg3, 4, arg0, arg1, arg7, arg4, var9.field2844, true, null);
                }
                arg6.method616(arg1, arg7, arg4, var17, var35, null, class56.field1072[arg0], 0, class123.field2408[arg0] * var34, class46.field820[arg0] * var34, var20, var21);
            } else if (arg5 == 6) {
                int var36 = arg6.method595(arg1, arg7, arg4);
                int var37 = 8;
                if (var36 != 0) {
                    var37 = class170.method1185((byte) 77, var36 >> 14 & 0x7FFF).field2824 / 2;
                }
                class42 var38;
                if (var9.field2844 == -1 && var9.field2813 == null) {
                    var38 = var9.method995(var17, 4, var16, var19, (byte) -66, arg0 + 4, var18);
                } else {
                    var38 = new class119(arg3, 4, arg0 + 4, arg1, arg7, arg4, var9.field2844, true, null);
                }
                arg6.method616(arg1, arg7, arg4, var17, var38, null, 256, arg0, class19.field328[arg0] * var37, class52.field938[arg0] * var37, var20, var21);
            } else if (arg5 == 7) {
                int var39 = arg0 + 2 & 0x3;
                class42 var40;
                if (var9.field2844 == -1 && var9.field2813 == null) {
                    var40 = var9.method995(var17, 4, var16, var19, (byte) 125, var39 + 4, var18);
                } else {
                    var40 = new class119(arg3, 4, var39 + 4, arg1, arg7, arg4, var9.field2844, true, null);
                }
                arg6.method616(arg1, arg7, arg4, var17, var40, null, 256, var39, 0, 0, var20, var21);
            } else if (arg5 == 8) {
                int var41 = 8;
                int var42 = arg6.method595(arg1, arg7, arg4);
                if (var42 != 0) {
                    var41 = class170.method1185((byte) 76, var42 >> 14 & 0x7FFF).field2824 / 2;
                }
                int var43 = arg0 + 2 & 0x3;
                class42 var44;
                class42 var45;
                if (var9.field2844 == -1 && var9.field2813 == null) {
                    var44 = var9.method995(var17, 4, var16, var19, (byte) 95, arg0 + 4, var18);
                    var45 = var9.method995(var17, 4, var16, var19, (byte) -93, var43 + 4, var18);
                } else {
                    var44 = new class119(arg3, 4, arg0 + 4, arg1, arg7, arg4, var9.field2844, true, null);
                    var45 = new class119(arg3, 4, var43 + 4, arg1, arg7, arg4, var9.field2844, true, null);
                }
                arg6.method616(arg1, arg7, arg4, var17, var44, var45, 256, arg0, class19.field328[arg0] * var41, class52.field938[arg0] * var41, var20, var21);
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILvd;)I")
    public static final int method955(int arg0, class193 arg1) {
        if (arg0 > -2) {
            method955(-6, null);
        }
        field2730++;
        class39 var2 = (class39) class164.field3120.method224(-1, ((long) arg1.field3715 << 32) + (long) arg1.field3716);
        return var2 == null ? arg1.field3729 : var2.field700;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static void method956(int arg0) {
        if (arg0 != 4) {
            return;
        }
        field2735 = null;
        field2736 = null;
        field2734 = null;
        field2728 = null;
        field2732 = null;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public static final void method957(int arg0) {
        field2729++;
        if (!class93.field1828) {
            return;
        }
        class19.field341 = null;
        class35.field657 = null;
        class53.field984 = null;
        class3.field53 = null;
        class43.field773 = null;
        class177.field3342 = null;
        class2.field23 = null;
        class76.field1547 = null;
        class95.field1836 = null;
        class193.field3795 = null;
        class180.field3403 = null;
        field2736 = null;
        class42.field746 = null;
        class161.field3082 = null;
        class59.field1215 = null;
        class43.field783 = null;
        class135.field2642 = null;
        class41.field743 = null;
        class199.field3959 = null;
        class92.field1812 = null;
        class12.field232 = null;
        class41.field740 = null;
        if (arg0 > 80) {
            class53.method418(0, 2);
            class49.method378((byte) -122, true);
            class93.field1828 = false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B[B)V")
    public abstract void method199(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)[B")
    public abstract byte[] method198(int arg0);
}
