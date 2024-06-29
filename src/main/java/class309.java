import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class309 extends class262 {

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "D")
    public static double field5258 = -1.0D;

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "[I")
    public static int[] field5250 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "Lok;")
    public static class146 field5251 = class235.method1724(-12908, "(Udns");

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "[B")
    public static byte[] field5263 = new byte[520];

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "Lok;")
    private static class146 field5257 = class235.method1724(-12908, " has logged out)3");

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "Lok;")
    public static class146 field5261 = field5257;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "Lqj;")
    public static class246 field5253;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V", line = 4)
    public static void method2176(int arg0) {
        field5251 = null;
        field5257 = null;
        field5263 = null;
        field5253 = null;
        field5250 = null;
        if (arg0 != -31547) {
            method2176(-27);
        }
        field5261 = null;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)[[I", line = 28)
    public final int[][] method87(int arg0, int arg1) {
        int[][] var3 = this.field4347.method536(arg1, arg0 + 4089);
        if (arg0 != 7) {
            method2180(2, -54, true, -38, (class144) null, 33, -36, 108, true, -50, 63);
        }
        if (this.field4347.field1202) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class98.field1598; var7++) {
                this.method2179(arg1, 19231, var7);
                int[][] var8 = this.method1893(0, class201.field3360, 101);
                var4[var7] = var8[0][class63.field1085];
                var6[var7] = var8[1][class63.field1085];
                var5[var7] = var8[2][class63.field1085];
            }
        }
        field5254++;
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "(I)V", line = 65)
    public static final void method2177(int arg0) {
        if (arg0 != 22) {
            method2176(42);
        }
        for (int var1 = 0; var1 < class261.field4341; var1++) {
            class134 var2 = class273.method1998(var1, -125);
            if (var2 != null && var2.field2242 == 0) {
                class202.field3372[var1] = 0;
                class75.field1221[var1] = 0;
            }
        }
        class127.field2060 = new class118(16);
        field5252++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)[I", line = 97)
    public final int[] method38(int arg0, byte arg1) {
        int[] var3 = this.field4350.method1532(arg0, (byte) 109);
        if (this.field4350.field3333) {
            for (int var4 = 0; var4 < class98.field1598; var4++) {
                this.method2179(arg0, 19231, var4);
                int[] var5 = this.method1895(7, 0, class201.field3360);
                var3[var4] = var5[class63.field1085];
            }
        }
        if (arg1 > -85) {
            method2180(-72, -12, true, 44, (class144) null, -86, -59, -79, true, 11, -109);
        }
        field5260++;
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "(I)V", line = 139)
    public static final void method2178(int arg0) {
        field5249++;
        class305 var1 = class157.field2648;
        synchronized (class157.field2648) {
            if (arg0 < 102) {
                field5250 = (int[]) null;
            }
            class280.field4791++;
            class265.field4553 = class232.field3877;
            if (class185.field3093 >= 0) {
                while (class205.field3414 != class185.field3093) {
                    int var2 = class127.field2063[class205.field3414];
                    class205.field3414 = class205.field3414 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class113.field1813[var2] = true;
                    } else {
                        class113.field1813[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class113.field1813[var3] = false;
                }
                class185.field3093 = class205.field3414;
            }
            class232.field3877 = class56.field1000;
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(III)V", line = 187)
    private final void method2179(int arg0, int arg1, int arg2) {
        if (arg1 != 19231) {
            field5253 = (class246) null;
        }
        field5255++;
        int var4 = class210.field3485[arg2];
        int var5 = class312.field5326[arg0];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if (-3.141592653589793D <= (double) var6 && (double) var6 <= -2.356194490192345D) {
            class201.field3360 = arg0;
            class63.field1085 = arg2;
        } else if (-1.5707963267948966D >= (double) var6 && -2.356194490192345D <= (double) var6) {
            class63.field1085 = arg0;
            class201.field3360 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && -1.5707963267948966D <= (double) var6) {
            class201.field3360 = arg2;
            class63.field1085 = class98.field1598 - arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class201.field3360 = class104.field1676 - arg0;
            class63.field1085 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class63.field1085 = class98.field1598 - arg2;
            class201.field3360 = class104.field1676 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class63.field1085 = class98.field1598 - arg0;
            class201.field3360 = class104.field1676 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class201.field3360 = class104.field1676 - arg2;
            class63.field1085 = arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class201.field3360 = arg0;
            class63.field1085 = class98.field1598 - arg2;
        }
        class63.field1085 &= class218.field3595;
        class201.field3360 &= class259.field4297;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 260)
    public class309() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZILqf;IIIZII)V", line = 292)
    public static final void method2180(int arg0, int arg1, boolean arg2, int arg3, class144 arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field5256++;
        if (arg2 && !class322.method2236(-7750) && (class46.field775[0][arg3][arg9] & 0x2) == 0) {
            if ((class46.field775[arg7][arg3][arg9] & 0x10) != 0) {
                return;
            }
            if (class79.method567(arg3, arg9, 2, arg7) != class201.field3358) {
                return;
            }
        }
        if (arg7 < class251.field4207) {
            class251.field4207 = arg7;
        }
        class5 var11 = class112.method756((byte) 76, arg6);
        if (class271.field4640 && var11.field122) {
            return;
        }
        int var12;
        int var13;
        if (arg1 == 1 || arg1 == 3) {
            var13 = var11.field66;
            var12 = var11.field62;
        } else {
            var12 = var11.field66;
            var13 = var11.field62;
        }
        int var14;
        int var15;
        if (arg3 + var12 > 104) {
            var14 = arg3 + 1;
            var15 = arg3;
        } else {
            var15 = (var12 >> 1) + arg3;
            var14 = (var12 + 1 >> 1) + arg3;
        }
        if (arg10 != 2) {
            method2180(-101, 35, false, -85, (class144) null, -28, 117, 114, true, 37, 84);
        }
        int var16;
        int var17;
        if ((arg9 + var13) <= 104) {
            var16 = (var13 >> 1) + arg9;
            var17 = (var13 + 1 >> 1) + arg9;
        } else {
            var16 = arg9;
            var17 = arg9 + 1;
        }
        int[][] var18 = class174.field2914[arg5];
        int var19 = var18[var14][var17] + var18[var15][var17] + var18[var14][var16] + var18[var15][var16] >> 2;
        int var20 = (arg3 << 7) + (var12 << 6);
        int var21 = (arg9 << 7) + (var13 << 6);
        int var22 = 0;
        if (class271.field4640 && arg5 != 0) {
            int[][] var23 = class174.field2914[0];
            var22 = var19 - (var23[var15][var16] + var23[var14][var16] + var23[var15][var17] + var23[var14][var17] >> 2);
        }
        long var24 = (long) (arg1 | 0x400 << 20 | arg0 << 14 | arg9 << 7 | arg3);
        if (var11.field77 == 0 || arg8) {
            var24 |= Long.MIN_VALUE;
        }
        if (var11.field121 == 1) {
            var24 |= 0x400000L;
        }
        int[][] var26 = (int[][]) null;
        if (var11.field115) {
            var24 |= 0x80000000L;
        }
        long var27 = var24 | (long) arg6 << 32;
        if (arg8) {
            var26 = class300.field5082[0];
        } else if (arg5 < 3) {
            var26 = class174.field2914[arg5 + 1];
        }
        if (var11.method25(0)) {
            class62.method473((class282) null, arg7, 0, arg3, arg1, arg9, var11, (class234) null);
        }
        boolean var29 = !arg8 & var11.field128;
        if (arg0 == 22) {
            if (class76.field1230 || var11.field77 != 0 || var11.field125 == 1 || var11.field50) {
                class322 var31;
                if (var11.field54 == -1 && var11.field105 == null && !var11.field88) {
                    class50 var30 = var11.method27(var19, arg2, var20, var18, 22, var29, var21, (byte) 92, var26, arg1, (class315) null);
                    if (class271.field4640 && var29) {
                        class48.method405(var30.field904, var20, var22, var21);
                    }
                    var31 = var30.field900;
                } else {
                    var31 = new class161(arg6, 22, arg1, arg5, arg3, arg9, var11.field54, var11.field94, (class322) null);
                }
                class7.method44(arg7, arg3, arg9, var19, var31, var27, var11.field120);
                if (var11.field125 == 1 && arg4 != null) {
                    arg4.method1073((byte) 126, arg3, arg9);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class322 var73;
            if (var11.field54 == -1 && var11.field105 == null && !var11.field88) {
                class50 var72 = var11.method27(var19, arg2, var20, var18, 10, var29, var21, (byte) 92, var26, arg0 == 11 ? arg1 + 4 : arg1, (class315) null);
                if (class271.field4640 && var29) {
                    class48.method405(var72.field904, var20, var22, var21);
                }
                var73 = var72.field900;
            } else {
                var73 = new class161(arg6, 10, arg0 == 11 ? arg1 + 4 : arg1, arg5, arg3, arg9, var11.field54, var11.field94, (class322) null);
            }
            if (var73 != null) {
                boolean var74 = class158.method1242(arg7, arg3, arg9, var19, var12, var13, var73, 0, var27);
                if (var11.field116 && var74 && arg2) {
                    int var75 = 15;
                    if (var73 instanceof class208) {
                        var75 = ((class208) var73).method1392() / 4;
                        if (var75 > 30) {
                            var75 = 30;
                        }
                    }
                    for (int var76 = 0; var76 <= var12; var76++) {
                        for (int var77 = 0; var77 <= var13; var77++) {
                            if (var75 > class164.field2777[arg7][arg3 + var76][arg9 + var77]) {
                                class164.field2777[arg7][arg3 + var76][arg9 + var77] = (byte) var75;
                            }
                        }
                    }
                }
            }
            if (var11.field125 != 0 && arg4 != null) {
                arg4.method1070((byte) -110, var12, arg9, var11.field111, arg3, var13);
            }
        } else if (arg0 >= 12) {
            class322 var33;
            if (var11.field54 == -1 && var11.field105 == null && !var11.field88) {
                class50 var32 = var11.method27(var19, arg2, var20, var18, arg0, var29, var21, (byte) 92, var26, arg1, (class315) null);
                if (class271.field4640 && var29) {
                    class48.method405(var32.field904, var20, var22, var21);
                }
                var33 = var32.field900;
            } else {
                var33 = new class161(arg6, arg0, arg1, arg5, arg3, arg9, var11.field54, var11.field94, (class322) null);
            }
            class158.method1242(arg7, arg3, arg9, var19, 1, 1, var33, 0, var27);
            if (arg2 && arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg7 > 0) {
                class199.field3332[arg7][arg3][arg9] = class138.method1013(class199.field3332[arg7][arg3][arg9], 4);
            }
            if (var11.field125 != 0 && arg4 != null) {
                arg4.method1070((byte) -90, var12, arg9, var11.field111, arg3, var13);
            }
        } else if (arg0 == 0) {
            class322 var71;
            if (var11.field54 == -1 && var11.field105 == null && !var11.field88) {
                class50 var70 = var11.method27(var19, arg2, var20, var18, 0, var29, var21, (byte) 92, var26, arg1, (class315) null);
                if (class271.field4640 && var29) {
                    class48.method405(var70.field904, var20, var22, var21);
                }
                var71 = var70.field900;
            } else {
                var71 = new class161(arg6, 0, arg1, arg5, arg3, arg9, var11.field54, var11.field94, (class322) null);
            }
            class200.method1540(arg7, arg3, arg9, var19, var71, (class322) null, class293.field4981[arg1], 0, var27);
            if (arg2) {
                if (arg1 == 0) {
                    if (var11.field116) {
                        class164.field2777[arg7][arg3][arg9] = 50;
                        class164.field2777[arg7][arg3][arg9 + 1] = 50;
                    }
                    if (var11.field106) {
                        class199.field3332[arg7][arg3][arg9] = class138.method1013(class199.field3332[arg7][arg3][arg9], 1);
                    }
                } else if (arg1 == 1) {
                    if (var11.field116) {
                        class164.field2777[arg7][arg3][arg9 + 1] = 50;
                        class164.field2777[arg7][arg3 + 1][arg9 + 1] = 50;
                    }
                    if (var11.field106) {
                        class199.field3332[arg7][arg3][arg9 + 1] = class138.method1013(class199.field3332[arg7][arg3][arg9 + 1], 2);
                    }
                } else if (arg1 == 2) {
                    if (var11.field116) {
                        class164.field2777[arg7][arg3 + 1][arg9] = 50;
                        class164.field2777[arg7][arg3 + 1][arg9 + 1] = 50;
                    }
                    if (var11.field106) {
                        class199.field3332[arg7][arg3 + 1][arg9] = class138.method1013(class199.field3332[arg7][arg3 + 1][arg9], 1);
                    }
                } else if (arg1 == 3) {
                    if (var11.field116) {
                        class164.field2777[arg7][arg3][arg9] = 50;
                        class164.field2777[arg7][arg3 + 1][arg9] = 50;
                    }
                    if (var11.field106) {
                        class199.field3332[arg7][arg3][arg9] = class138.method1013(class199.field3332[arg7][arg3][arg9], 2);
                    }
                }
            }
            if (var11.field125 != 0 && arg4 != null) {
                arg4.method1065(arg0, var11.field111, (byte) -110, arg1, arg3, arg9);
            }
            if (var11.field64 != 16) {
                class155.method1209(arg7, arg3, arg9, var11.field64);
            }
        } else if (arg0 == 1) {
            class322 var69;
            if (var11.field54 == -1 && var11.field105 == null && !var11.field88) {
                class50 var68 = var11.method27(var19, arg2, var20, var18, 1, var29, var21, (byte) 92, var26, arg1, (class315) null);
                if (class271.field4640 && var29) {
                    class48.method405(var68.field904, var20, var22, var21);
                }
                var69 = var68.field900;
            } else {
                var69 = new class161(arg6, 1, arg1, arg5, arg3, arg9, var11.field54, var11.field94, (class322) null);
            }
            class200.method1540(arg7, arg3, arg9, var19, var69, (class322) null, class273.field4699[arg1], 0, var27);
            if (var11.field116 && arg2) {
                if (arg1 == 0) {
                    class164.field2777[arg7][arg3][arg9 + 1] = 50;
                } else if (arg1 == 1) {
                    class164.field2777[arg7][arg3 + 1][arg9 + 1] = 50;
                } else if (arg1 == 2) {
                    class164.field2777[arg7][arg3 + 1][arg9] = 50;
                } else if (arg1 == 3) {
                    class164.field2777[arg7][arg3][arg9] = 50;
                }
            }
            if (var11.field125 != 0 && arg4 != null) {
                arg4.method1065(arg0, var11.field111, (byte) -91, arg1, arg3, arg9);
            }
        } else if (arg0 == 2) {
            int var34 = arg1 + 1 & 0x3;
            class322 var36;
            class322 var38;
            if (var11.field54 == -1 && var11.field105 == null && !var11.field88) {
                class50 var35 = var11.method27(var19, arg2, var20, var18, 2, var29, var21, (byte) 92, var26, arg1 + 4, (class315) null);
                if (class271.field4640 && var29) {
                    class48.method405(var35.field904, var20, var22, var21);
                }
                var36 = var35.field900;
                class50 var37 = var11.method27(var19, arg2, var20, var18, 2, var29, var21, (byte) 92, var26, var34, (class315) null);
                if (class271.field4640 && var29) {
                    class48.method405(var37.field904, var20, var22, var21);
                }
                var38 = var37.field900;
            } else {
                var36 = new class161(arg6, 2, arg1 + 4, arg5, arg3, arg9, var11.field54, var11.field94, (class322) null);
                var38 = new class161(arg6, 2, var34, arg5, arg3, arg9, var11.field54, var11.field94, (class322) null);
            }
            class200.method1540(arg7, arg3, arg9, var19, var36, var38, class293.field4981[arg1], class293.field4981[var34], var27);
            if (var11.field106 && arg2) {
                if (arg1 == 0) {
                    class199.field3332[arg7][arg3][arg9] = class138.method1013(class199.field3332[arg7][arg3][arg9], 1);
                    class199.field3332[arg7][arg3][arg9 + 1] = class138.method1013(class199.field3332[arg7][arg3][arg9 + 1], 2);
                } else if (arg1 == 1) {
                    class199.field3332[arg7][arg3][arg9 + 1] = class138.method1013(class199.field3332[arg7][arg3][arg9 + 1], 2);
                    class199.field3332[arg7][arg3 + 1][arg9] = class138.method1013(class199.field3332[arg7][arg3 + 1][arg9], 1);
                } else if (arg1 == 2) {
                    class199.field3332[arg7][arg3 + 1][arg9] = class138.method1013(class199.field3332[arg7][arg3 + 1][arg9], 1);
                    class199.field3332[arg7][arg3][arg9] = class138.method1013(class199.field3332[arg7][arg3][arg9], 2);
                } else if (arg1 == 3) {
                    class199.field3332[arg7][arg3][arg9] = class138.method1013(class199.field3332[arg7][arg3][arg9], 2);
                    class199.field3332[arg7][arg3][arg9] = class138.method1013(class199.field3332[arg7][arg3][arg9], 1);
                }
            }
            if (var11.field125 != 0 && arg4 != null) {
                arg4.method1065(arg0, var11.field111, (byte) -121, arg1, arg3, arg9);
            }
            if (var11.field64 != 16) {
                class155.method1209(arg7, arg3, arg9, var11.field64);
            }
        } else if (arg0 == 3) {
            class322 var67;
            if (var11.field54 == -1 && var11.field105 == null && !var11.field88) {
                class50 var66 = var11.method27(var19, arg2, var20, var18, 3, var29, var21, (byte) 92, var26, arg1, (class315) null);
                if (class271.field4640 && var29) {
                    class48.method405(var66.field904, var20, var22, var21);
                }
                var67 = var66.field900;
            } else {
                var67 = new class161(arg6, 3, arg1, arg5, arg3, arg9, var11.field54, var11.field94, (class322) null);
            }
            class200.method1540(arg7, arg3, arg9, var19, var67, (class322) null, class273.field4699[arg1], 0, var27);
            if (var11.field116 && arg2) {
                if (arg1 == 0) {
                    class164.field2777[arg7][arg3][arg9 + 1] = 50;
                } else if (arg1 == 1) {
                    class164.field2777[arg7][arg3 + 1][arg9 + 1] = 50;
                } else if (arg1 == 2) {
                    class164.field2777[arg7][arg3 + 1][arg9] = 50;
                } else if (arg1 == 3) {
                    class164.field2777[arg7][arg3][arg9] = 50;
                }
            }
            if (var11.field125 != 0 && arg4 != null) {
                arg4.method1065(arg0, var11.field111, (byte) -108, arg1, arg3, arg9);
            }
        } else if (arg0 == 9) {
            class322 var40;
            if (var11.field54 == -1 && var11.field105 == null && !var11.field88) {
                class50 var39 = var11.method27(var19, arg2, var20, var18, arg0, var29, var21, (byte) 92, var26, arg1, (class315) null);
                if (class271.field4640 && var29) {
                    class48.method405(var39.field904, var20, var22, var21);
                }
                var40 = var39.field900;
            } else {
                var40 = new class161(arg6, arg0, arg1, arg5, arg3, arg9, var11.field54, var11.field94, (class322) null);
            }
            class158.method1242(arg7, arg3, arg9, var19, 1, 1, var40, 0, var27);
            if (var11.field125 != 0 && arg4 != null) {
                arg4.method1070((byte) -113, var12, arg9, var11.field111, arg3, var13);
            }
            if (var11.field64 != 16) {
                class155.method1209(arg7, arg3, arg9, var11.field64);
            }
        } else if (arg0 == 4) {
            class322 var42;
            if (var11.field54 == -1 && var11.field105 == null && !var11.field88) {
                class50 var41 = var11.method27(var19, arg2, var20, var18, 4, var29, var21, (byte) 92, var26, arg1, (class315) null);
                if (class271.field4640 && var29) {
                    class48.method405(var41.field904, var20, var22, var21);
                }
                var42 = var41.field900;
            } else {
                var42 = new class161(arg6, 4, arg1, arg5, arg3, arg9, var11.field54, var11.field94, (class322) null);
            }
            class164.method1279(arg7, arg3, arg9, var19, var42, (class322) null, class293.field4981[arg1], 0, 0, 0, var27);
        } else if (arg0 == 5) {
            int var43 = 16;
            long var44 = class296.method2106(arg7, arg3, arg9);
            if (var44 != 0L) {
                var43 = class112.method756((byte) 48, (int) (var44 >>> 32) & Integer.MAX_VALUE).field64;
            }
            class322 var47;
            if (var11.field54 == -1 && var11.field105 == null && !var11.field88) {
                class50 var46 = var11.method27(var19, arg2, var20, var18, 4, var29, var21, (byte) 92, var26, arg1, (class315) null);
                if (class271.field4640 && var29) {
                    class48.method405(var46.field904, var20 - (class222.field3701[arg1] * 8), var22, var21 - class259.field4314[arg1] * 8);
                }
                var47 = var46.field900;
            } else {
                var47 = new class161(arg6, 4, arg1, arg5, arg3, arg9, var11.field54, var11.field94, (class322) null);
            }
            class164.method1279(arg7, arg3, arg9, var19, var47, (class322) null, class293.field4981[arg1], 0, class222.field3701[arg1] * var43, class259.field4314[arg1] * var43, var27);
        } else if (arg0 == 6) {
            int var48 = 8;
            long var49 = class296.method2106(arg7, arg3, arg9);
            if (var49 != 0L) {
                var48 = class112.method756((byte) -112, (int) (var49 >>> 32) & Integer.MAX_VALUE).field64 / 2;
            }
            class322 var52;
            if (var11.field54 == -1 && var11.field105 == null && !var11.field88) {
                class50 var51 = var11.method27(var19, arg2, var20, var18, 4, var29, var21, (byte) 92, var26, arg1 + 4, (class315) null);
                if (class271.field4640 && var29) {
                    class48.method405(var51.field904, var20 - client.field4078[arg1] * 8, var22, var21 - (class25.field444[arg1] * 8));
                }
                var52 = var51.field900;
            } else {
                var52 = new class161(arg6, 4, arg1 + 4, arg5, arg3, arg9, var11.field54, var11.field94, (class322) null);
            }
            class164.method1279(arg7, arg3, arg9, var19, var52, (class322) null, 256, arg1, client.field4078[arg1] * var48, class25.field444[arg1] * var48, var27);
        } else if (arg0 == 7) {
            int var63 = arg1 + 2 & 0x3;
            class322 var65;
            if (var11.field54 == -1 && var11.field105 == null && !var11.field88) {
                class50 var64 = var11.method27(var19, arg2, var20, var18, 4, var29, var21, (byte) 92, var26, var63 + 4, (class315) null);
                if (class271.field4640 && var29) {
                    class48.method405(var64.field904, var20, var22, var21);
                }
                var65 = var64.field900;
            } else {
                var65 = new class161(arg6, 4, var63 + 4, arg5, arg3, arg9, var11.field54, var11.field94, (class322) null);
            }
            class164.method1279(arg7, arg3, arg9, var19, var65, (class322) null, 256, var63, 0, 0, var27);
        } else if (arg0 == 8) {
            int var53 = 8;
            long var54 = class296.method2106(arg7, arg3, arg9);
            if (var54 != 0L) {
                var53 = class112.method756((byte) -118, (int) (var54 >>> 32) & Integer.MAX_VALUE).field64 / 2;
            }
            int var56 = arg1 + 2 & 0x3;
            class322 var60;
            class322 var62;
            if (var11.field54 == -1 && var11.field105 == null && !var11.field88) {
                int var57 = client.field4078[arg1] * 8;
                int var58 = class25.field444[arg1] * 8;
                class50 var59 = var11.method27(var19, arg2, var20, var18, 4, var29, var21, (byte) 92, var26, arg1 + 4, (class315) null);
                if (class271.field4640 && var29) {
                    class48.method405(var59.field904, var20 - var57, var22, var21 - var58);
                }
                var60 = var59.field900;
                class50 var61 = var11.method27(var19, arg2, var20, var18, 4, var29, var21, (byte) 92, var26, var56 + 4, (class315) null);
                if (class271.field4640 && var29) {
                    class48.method405(var61.field904, var20 - var57, var22, var21 - var58);
                }
                var62 = var61.field900;
            } else {
                var60 = new class161(arg6, 4, arg1 + 4, arg5, arg3, arg9, var11.field54, var11.field94, (class322) null);
                var62 = new class161(arg6, 4, var56 + 4, arg5, arg3, arg9, var11.field54, var11.field94, (class322) null);
            }
            class164.method1279(arg7, arg3, arg9, var19, var60, var62, 256, arg1, client.field4078[arg1] * var53, class25.field444[arg1] * var53, var27);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lwe;II)V", line = 954)
    public final void method40(class47 arg0, int arg1, int arg2) {
        field5262++;
        if (arg2 == 0) {
            this.field4365 = arg0.method368(84) == 1;
        }
        if (arg1 != 2048) {
            field5258 = -0.24855949829852045D;
        }
    }
}
