import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class73 {

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "[B")
    private byte[] field1115;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "[I")
    private int[] field1124;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "[I")
    private int[] field1118;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "[B")
    public static byte[] field1114 = new byte[32896];

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "[[I")
    public static int[][] field1117;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lbc;B)Ltj;", line = 6)
    public static final class77 method457(class153 arg0, byte arg1) {
        int var2 = -58 % ((30 - arg1) / 61);
        field1119++;
        return new class77(arg0.method1052(31521), arg0.method1052(31521), arg0.method1052(31521), arg0.method1052(31521), arg0.method1052(31521), arg0.method1052(31521), arg0.method1052(31521), arg0.method1052(31521), arg0.method1107((byte) 82), arg0.method1082(-60));
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B[BII[BI)I", line = 16)
    public final int method458(byte arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field1123++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg2 + arg5;
        int var8 = 0;
        if (arg0 <= 72) {
            return 84;
        }
        int var9 = arg3;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var8 = this.field1118[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field1118[var8]) < 0) {
                arg4[arg2++] = (byte) (~var11);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1118[var8];
            }
            int var12;
            if ((var12 = this.field1118[var8]) < 0) {
                arg4[arg2++] = (byte) (~var12);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1118[var8];
            }
            int var13;
            if ((var13 = this.field1118[var8]) < 0) {
                arg4[arg2++] = (byte) (~var13);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1118[var8];
            }
            int var14;
            if ((var14 = this.field1118[var8]) < 0) {
                arg4[arg2++] = (byte) (~var14);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1118[var8];
            }
            int var15;
            if ((var15 = this.field1118[var8]) < 0) {
                arg4[arg2++] = (byte) (~var15);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1118[var8];
            }
            int var16;
            if ((var16 = this.field1118[var8]) < 0) {
                arg4[arg2++] = (byte) (~var16);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1118[var8];
            }
            int var17;
            if ((var17 = this.field1118[var8]) < 0) {
                arg4[arg2++] = (byte) (~var17);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1118[var8];
            }
            int var18;
            if ((var18 = this.field1118[var8]) < 0) {
                arg4[arg2++] = (byte) (~var18);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1114[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + (var2 * var2 + 65535)) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILbc;)V", line = 187)
    public static final void method459(int arg0, class153 arg1) {
        field1125++;
        while (true) {
            while (arg1.field2611 < arg1.field2598.length) {
                int var2 = 0;
                int var3 = 0;
                boolean var4 = false;
                if (arg1.method1082(-109) == 1) {
                    var4 = true;
                    var2 = arg1.method1082(-105);
                    var3 = arg1.method1082(-92);
                }
                int var5 = arg1.method1082(-74);
                int var6 = arg1.method1082(-127);
                int var7 = class17.field181 + class157.field2719 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class166.field2905;
                if (var8 >= 0 && var7 - 63 >= 0 && class244.field4242 > var8 + 63 && class157.field2719 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var4 || var2 * 8 <= var11 && (var2 * 8 + 8) > var11 && var12 >= (var3 * 8) && var12 < var3 * 8 + 8) {
                                byte var13 = arg1.method1104(-1);
                                if (var13 != 0) {
                                    if (class202.field3482[var9][var10] == null) {
                                        class202.field3482[var9][var10] = new byte[4096];
                                    }
                                    class202.field3482[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1104(-1);
                                    if (class218.field3781[var9][var10] == null) {
                                        class218.field3781[var9][var10] = new byte[4096];
                                    }
                                    class218.field3781[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var4 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1104(-1);
                        if (var16 != 0) {
                            arg1.field2611++;
                        }
                    }
                }
            }
            if (arg0 < 70) {
                method463((byte) -33);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILpa;IIIIIIIILkl;IZ)Lpa;", line = 288)
    public static final class155 method460(int arg0, int arg1, class155 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class35 arg11, int arg12, boolean arg13) {
        field1126++;
        long var14 = ((long) arg5 << 48) + ((long) arg6 << 32) + (long) ((arg8 << 24) + (arg10 << 16) + arg1);
        int var16 = 12 / ((12 - arg7) / 50);
        class155 var17 = (class155) class91.field1635.method2175(var14, 3008);
        if (var17 == null) {
            byte var18;
            if (arg1 == 1) {
                var18 = 9;
            } else if (arg1 == 2) {
                var18 = 12;
            } else if (arg1 == 3) {
                var18 = 15;
            } else if (arg1 == 4) {
                var18 = 18;
            } else {
                var18 = 21;
            }
            int[] var19 = new int[] { 64, 96, 128 };
            byte var20 = 3;
            class174 var21 = new class174(var18 * var20 + 1, var18 * 2 * var20 + -var18, 0);
            int var22 = var21.method1225(0, 0, 0);
            int[][] var23 = new int[var20][var18];
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = var19[var24];
                int var26 = var19[var24];
                for (int var27 = 0; var27 < var18; var27++) {
                    int var28 = (var27 << 11) / var18;
                    int var29 = arg4 + (class102.field1813[var28] * var25) >> 16;
                    int var30 = class102.field1819[var28] * var26 + arg12 >> 16;
                    var23[var24][var27] = var21.method1225(var29, 0, var30);
                }
            }
            for (int var31 = 0; var31 < var20; var31++) {
                int var32 = (var31 * 256 + 128) / var20;
                int var33 = 256 - var32;
                byte var34 = (byte) (arg8 * var32 + arg10 * var33 >> 8);
                short var35 = (short) (((arg5 & 0x7F) * var32 + (arg6 & 0x7F) * var33 & 0x7F00) + ((arg5 & 0xFC00) * var32 + (arg6 & 0xFC00) * var33 & 0xFC0000) + ((arg5 & 0x380) * var32 + (arg6 & 0x380) * var33 & 0x38000) >> 8);
                for (int var36 = 0; var36 < var18; var36++) {
                    if (var31 == 0) {
                        var21.method1241(var22, var23[0][(var36 + 1) % var18], var23[0][var36], (byte) 1, var35, var34);
                    } else {
                        var21.method1241(var23[var31 - 1][var36], var23[var31 - 1][(var36 + 1) % var18], var23[var31][(var36 + 1) % var18], (byte) 1, var35, var34);
                        var21.method1241(var23[var31 - 1][var36], var23[var31][(var36 + 1) % var18], var23[var31][var36], (byte) 1, var35, var34);
                    }
                }
            }
            var17 = var21.method1242(64, 768, -50, -10, -50);
            class91.field1635.method2169(var17, var14, (byte) 94);
        }
        int var37 = arg1 * 64 - 1;
        int var38 = -var37;
        int var39 = -var37;
        int var40 = var37;
        int var41 = var37;
        if (arg13) {
            if (arg9 > 640 && arg9 < 1408) {
                var41 = var37 + 128;
            }
            if (arg9 > 128 && arg9 < 896) {
                var38 -= 128;
            }
            if (arg9 > 1664 || arg9 < 384) {
                var39 -= 128;
            }
            if (arg9 > 1152 && arg9 < 1920) {
                var40 = var37 + 128;
            }
        }
        int var42 = arg2.method214();
        int var43 = arg2.method186();
        if (var42 < var38) {
            var42 = var38;
        }
        if (var43 > var40) {
            var43 = var40;
        }
        int var44 = arg2.method194();
        int var45 = arg2.method237();
        class290 var46 = null;
        if (arg11 != null) {
            int var47 = arg11.field547[arg0];
            var46 = class36.method282(-89, var47 >> 16);
            arg0 = var47 & 0xFFFF;
        }
        if (var44 < var39) {
            var44 = var39;
        }
        if (var41 < var45) {
            var45 = var41;
        }
        class155 var48;
        if (var46 == null) {
            var48 = var17.method196(true, true);
            var48.method204((var43 - var42) / 2, 128, (var45 - var44) / 2);
            var48.method224((var42 + var43) / 2, 0, (var44 + var45) / 2);
        } else {
            var48 = var17.method196(!var46.method2005(-1, arg0), true);
            var48.method204((var43 - var42) / 2, 128, (var45 - var44) / 2);
            var48.method224((var42 + var43) / 2, 0, (var44 + var45) / 2);
            var48.method225(var46, arg0);
        }
        if (arg9 != 0) {
            var48.method240(arg9);
        }
        if (class147.field2485) {
            class30 var51 = (class30) var48;
            if (arg3 != class21.method145(arg4 + var42, arg12 + var44, class297.field5058, (byte) -100) || class21.method145(arg4 + var43, arg12 + var45, class297.field5058, (byte) -100) != arg3) {
                for (int var52 = 0; var52 < var51.field407; var52++) {
                    var51.field422[var52] += class21.method145(var51.field427[var52] + arg4, var51.field418[var52] + arg12, class297.field5058, (byte) -105) - arg3;
                }
                var51.field428.field4614 = false;
                var51.field419.field4772 = false;
            }
        } else {
            class318 var49 = (class318) var48;
            if (arg3 != class21.method145(arg4 + var42, arg12 + var44, class297.field5058, (byte) 95) || arg3 != class21.method145(arg4 + var43, arg12 - -var45, class297.field5058, (byte) 76)) {
                for (int var50 = 0; var50 < var49.field5472; var50++) {
                    var49.field5474[var50] += class21.method145(var49.field5454[var50] + arg4, var49.field5452[var50] + arg12, class297.field5058, (byte) -100) - arg3;
                }
                var49.field5483 = false;
            }
        }
        return var48;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLum;)V", line = 516)
    public static final void method461(boolean arg0, class222 arg1) {
        field1120++;
        class68.field1060 = arg1.method1594(class140.field2413, -93);
        if (!arg0) {
            field1116 = 7;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V", line = 530)
    public static void method462(byte arg0) {
        field1114 = null;
        field1117 = (int[][]) null;
        if (arg0 <= 80) {
            method466(18, true);
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V", line = 541)
    public static final void method463(byte arg0) {
        field1112++;
        class263.field4493.method2172(false);
        class149.field2525.method2172(false);
        if (arg0 == -81) {
            class164.field2861.method2172(false);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BI[B[BII)I", line = 556)
    public final int method464(byte arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        field1121++;
        int var7 = arg1 + arg4;
        int var8 = 0;
        if (arg0 != 95) {
            method459(-11, (class153) null);
        }
        int var9 = arg5 << 3;
        while (arg1 < var7) {
            int var10 = arg3[arg1] & 0xFF;
            int var11 = this.field1124[var10];
            byte var12 = this.field1115[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = (var12 + var14 - 1 >> 3) + var13;
            int var16 = var8 & -var14 >> 31;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var8 = class98.method674(var16, var11 >>> var17));
            if (var13 < var15) {
                var14 = var17 - 8;
                var13++;
                arg2[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var15) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var8 = var11 >>> var14);
                    if (var15 > var13) {
                        var13++;
                        var14 -= 8;
                        arg2[var13] = (byte) (var8 = var11 >>> var14);
                        if (var13 < var15) {
                            var13++;
                            var14 -= 8;
                            arg2[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var9 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIII)V", line = 630)
    public static final void method465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1113++;
        int var7 = 0;
        class267.method1885(arg0, (byte) 100);
        int var8 = arg0 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = var8;
        int var10 = -arg0;
        int var11 = arg0;
        int var12 = -var8;
        int var13 = -1;
        int[] var14 = field1117[arg3];
        if (arg5 != 25568) {
            return;
        }
        int var15 = arg6 - var8;
        class114.method780(109, arg6 - arg0, var15, arg1, var14);
        int var16 = arg6 + var8;
        class114.method780(88, var15, var16, arg4, var14);
        int var17 = -1;
        class114.method780(96, var16, arg6 + arg0, arg1, var14);
        while (var7 < var11) {
            var13 += 2;
            var12 += var13;
            if (var12 >= 0 && var9 >= 1) {
                class197.field3375[var9] = var7;
                var9--;
                var12 -= var9 << 1;
            }
            var17 += 2;
            var7++;
            var10 += var17;
            if (var10 >= 0) {
                var11--;
                var10 -= var11 << 1;
                if (var11 >= var8) {
                    int[] var18 = field1117[arg3 - var11];
                    int[] var19 = field1117[arg3 + var11];
                    int var20 = arg6 - var7;
                    int var21 = arg6 + var7;
                    class114.method780(arg5 ^ 0x6392, var20, var21, arg1, var19);
                    class114.method780(87, var20, var21, arg1, var18);
                } else {
                    int[] var22 = field1117[arg3 + var11];
                    int[] var23 = field1117[arg3 - var11];
                    int var24 = class197.field3375[var11];
                    int var25 = arg6 + var7;
                    int var26 = arg6 - var7;
                    int var27 = arg6 + var24;
                    int var28 = arg6 - var24;
                    class114.method780(119, var26, var28, arg1, var22);
                    class114.method780(103, var28, var27, arg4, var22);
                    class114.method780(108, var27, var25, arg1, var22);
                    class114.method780(113, var26, var28, arg1, var23);
                    class114.method780(-37, var28, var27, arg4, var23);
                    class114.method780(-44, var27, var25, arg1, var23);
                }
            }
            int[] var29 = field1117[arg3 + var7];
            int[] var30 = field1117[arg3 - var7];
            int var31 = arg6 + var11;
            int var32 = arg6 - var11;
            if (var8 <= var7) {
                class114.method780(-73, var32, var31, arg1, var29);
                class114.method780(117, var32, var31, arg1, var30);
            } else {
                int var33 = var7 > var9 ? class197.field3375[var7] : var9;
                int var34 = arg6 - var33;
                int var35 = arg6 + var33;
                class114.method780(-123, var32, var34, arg1, var29);
                class114.method780(95, var34, var35, arg4, var29);
                class114.method780(110, var35, var31, arg1, var29);
                class114.method780(87, var32, var34, arg1, var30);
                class114.method780(-82, var34, var35, arg4, var30);
                class114.method780(116, var35, var31, arg1, var30);
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "([B)V", line = 755)
    public class73(byte[] arg0) {
        int var2 = arg0.length;
        int[] var3 = new int[33];
        this.field1115 = arg0;
        this.field1124 = new int[var2];
        this.field1118 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1124[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class98.method674(var12, var11);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1118[var14] == 0) {
                            this.field1118[var14] = var4;
                        }
                        var14 = this.field1118[var14];
                    }
                    if (var14 >= this.field1118.length) {
                        int[] var17 = new int[this.field1118.length * 2];
                        for (int var18 = 0; var18 < this.field1118.length; var18++) {
                            var17[var18] = this.field1118[var18];
                        }
                        this.field1118 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field1118[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)V", line = 884)
    public static final void method466(int arg0, boolean arg1) {
        field1122++;
        byte[][] var2;
        if (class147.field2485 && arg1) {
            var2 = class123.field2147;
        } else {
            var2 = class36.field590;
        }
        int var3 = class287.field4830.length;
        int var4 = 0;
        if (arg0 >= -15) {
            return;
        }
        while (var4 < var3) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class93.field1664[var4] & 0xFF) * 64 - class226.field3916;
                int var7 = (class93.field1664[var4] >> 8) * 64 - class230.field3976;
                class283.method1968(102);
                class23.method152(arg1, class180.field3071, var5, (byte) -126, var6, var7);
            }
            var4++;
        }
    }
}
