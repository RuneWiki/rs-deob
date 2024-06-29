import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class194 {

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public int field3364 = 99;

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "I")
    public int field3379 = 2;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "Z")
    public boolean field3382 = false;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public int field3359 = -1;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "Z")
    private boolean field3358 = false;

    @OriginalMember(owner = "client!cm", name = "E", descriptor = "I")
    public int field3387 = 5;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "I")
    public int field3378 = -1;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public int field3363 = -1;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public int field3370 = -1;

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "I")
    public int field3390 = -1;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field3365 = 0;

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "Ljf;")
    public static class229 field3383 = class212.method1457((byte) 127, "rect_debug=");

    @OriginalMember(owner = "client!cm", name = "G", descriptor = "Ljf;")
    public static class229 field3389 = class212.method1457((byte) 72, "::noclip");

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "Ljf;")
    public static class229 field3386 = class212.method1457((byte) 84, "1");

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "Ldd;")
    public static class252 field3367;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "[I")
    public int[] field3366;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "[I")
    private int[] field3369;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "[I")
    private int[] field3373;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "[I")
    public int[] field3384;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "[[I")
    public int[][] field3357;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIILrl;)Lrl;", line = 4)
    public final class196 method1323(int arg0, int arg1, int arg2, class196 arg3) {
        field3372++;
        int var5 = this.field3366[arg0];
        class158 var6 = class5.method33(var5 >> 16, arg1 + 34);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method283(true, true);
        }
        int var8 = arg2 & 0x3;
        if (arg1 != 2) {
            return (class196) null;
        }
        class196 var9 = arg3.method283(!var6.method1058(var7, (byte) 107), !this.field3358);
        if (var8 == 1) {
            var9.method267();
        } else if (var8 == 2) {
            var9.method270();
        } else if (var8 == 3) {
            var9.method281();
        }
        var9.method280(var6, var7, this.field3358);
        if (var8 == 1) {
            var9.method281();
        } else if (var8 == 2) {
            var9.method270();
        } else if (var8 == 3) {
            var9.method267();
        }
        return var9;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lrl;II)Lrl;", line = 52)
    public final class196 method1324(class196 arg0, int arg1, int arg2) {
        int var4 = -88 / ((arg1 - 65) / 40);
        int var5 = this.field3366[arg2];
        class158 var6 = class5.method33(var5 >> 16, -113);
        field3388++;
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method279(true, true);
        } else {
            class196 var8 = arg0.method279(!var6.method1058(var7, (byte) 107), !this.field3358);
            var8.method280(var6, var7, this.field3358);
            return var8;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 80)
    public final void method1325(int arg0) {
        field3376++;
        int var2 = 77 % ((67 - arg0) / 35);
        if (this.field3370 == -1) {
            if (this.field3373 == null) {
                this.field3370 = 0;
            } else {
                this.field3370 = 2;
            }
        }
        if (this.field3359 != -1) {
            return;
        }
        if (this.field3373 == null) {
            this.field3359 = 0;
        } else {
            this.field3359 = 2;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lkh;I)V", line = 125)
    public final void method1326(class14 arg0, int arg1) {
        if (arg1 > -14) {
            method1328((byte) -84, (class67) null);
        }
        while (true) {
            int var3 = arg0.method93(false);
            if (var3 == 0) {
                field3374++;
                return;
            }
            this.method1331(arg0, var3, (byte) 13);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lih;III)V", line = 155)
    public static final void method1327(class33 arg0, int arg1, int arg2, int arg3) {
        if ((arg2 & 0x200) != 0) {
            arg0.field1999 = class171.field2972.method116(-1);
            int var4 = class171.field2972.method135(arg3 ^ 0x4);
            arg0.field1991 = var4 >> 16;
            if (arg0.field1999 == 65535) {
                arg0.field1999 = -1;
            }
            arg0.field2012 = (var4 & 0xFFFF) + class199.field3475;
            arg0.field2014 = 0;
            arg0.field1968 = 0;
            if (class199.field3475 < arg0.field2012) {
                arg0.field1968 = -1;
            }
            if (arg0.field1999 != -1 && class199.field3475 == arg0.field2012) {
                int var5 = class66.method492(8, arg0.field1999).field3829;
                if (var5 != -1) {
                    class194 var6 = class280.method1965(var5, 119);
                    if (var6 != null && var6.field3366 != null) {
                        class305.method2083(var6, arg0.field2028, class301.field5124 == arg0, arg0.field1983, 0, -64);
                    }
                }
            }
        }
        field3385++;
        if ((arg2 & 0x1) != 0) {
            int var7 = class171.field2972.method131(-128);
            byte[] var8 = new byte[var7];
            class14 var9 = new class14(var8);
            class171.field2972.method95(0, 9679, var7, var8);
            class69.field1320[arg1] = var9;
            arg0.method305(var9, 32);
        }
        if ((arg2 & 0x80) != 0) {
            arg0.field2009 = class171.field2972.method145(32);
            arg0.field1978 = class171.field2972.method142((byte) 35);
        }
        if ((arg2 & 0x10) != 0) {
            arg0.field1966 = class171.field2972.method142((byte) 35);
            if (arg0.field1966 == 65535) {
                arg0.field1966 = -1;
            }
        }
        if ((arg2 & 0x2) != 0) {
            arg0.field1967 = class171.field2972.method105((byte) -42);
            if (arg0.field1967.method1642(92, 0) == 126) {
                arg0.field1967 = arg0.field1967.method1625(true, 1);
                class28.method245((byte) -75, 2, arg0.method304(24930), arg0.field1967);
            } else if (class301.field5124 == arg0) {
                class28.method245((byte) -75, 2, arg0.method304(24930), arg0.field1967);
            }
            arg0.field1989 = 0;
            arg0.field2021 = 0;
            arg0.field1977 = 150;
        }
        if ((arg2 & 0x8) != 0) {
            int var10 = class171.field2972.method104(102);
            int var11 = class171.field2972.method143(arg3 ^ 0x0);
            arg0.method797(class199.field3475, var10, var11, true);
            arg0.field1984 = class199.field3475 + 300;
            arg0.field1975 = class171.field2972.method131(-128);
        }
        if ((arg2 & 0x20) != arg3) {
            int var12 = class171.field2972.method145(37);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = class171.field2972.method139((byte) -113);
            class95.method658(arg0, -1, var13, var12);
        }
        if ((arg2 & 0x4) != 0) {
            int var14 = class171.field2972.method116(-1);
            int var15 = class171.field2972.method93(false);
            int var16 = class171.field2972.method139((byte) -116);
            int var17 = class171.field2972.field195;
            boolean var18 = (var14 & 0x8000) != 0;
            if (arg0.field621 != null && arg0.field613 != null) {
                long var19 = arg0.field621.method1617(123);
                boolean var21 = false;
                if (var15 <= 1) {
                    if (var18 || (!class283.field4852 || class281.field4808) && !class252.field4402) {
                        for (int var22 = 0; var22 < class162.field2753; var22++) {
                            if (class212.field3643[var22] == var19) {
                                var21 = true;
                                break;
                            }
                        }
                    } else {
                        var21 = true;
                    }
                }
                if (!var21 && class59.field1029 == 0) {
                    class42.field759.field195 = 0;
                    class171.field2972.method120(0, var16, class42.field759.field174, true);
                    class42.field759.field195 = 0;
                    int var23 = -1;
                    class229 var24;
                    if (var18) {
                        var14 &= 0x7FFF;
                        class252 var25 = class296.method2047(class42.field759, (byte) 81);
                        var23 = var25.field4410;
                        var24 = var25.field4403.method361(false, class42.field759);
                    } else {
                        var24 = class138.method946(class278.method1956((byte) -70, class42.field759).method1615(24818));
                    }
                    arg0.field1967 = var24.method1644(true);
                    arg0.field2021 = var14 >> 8;
                    arg0.field1977 = 150;
                    arg0.field1989 = var14 & 0xFF;
                    if (var15 == 2) {
                        class274.method1917((class229) null, var23, class142.method989(new class229[] { class242.field4268, arg0.method304(24930) }, -39), var24, var18 ? 17 : 1, -109);
                    } else if (var15 == 1) {
                        class274.method1917((class229) null, var23, class142.method989(new class229[] { class325.field5480, arg0.method304(arg3 ^ 0x6162) }, -80), var24, var18 ? 17 : 1, -120);
                    } else {
                        class274.method1917((class229) null, var23, arg0.method304(arg3 ^ 0x6162), var24, var18 ? 17 : 2, -120);
                    }
                }
            }
            class171.field2972.field195 = var16 + var17;
        }
        if ((arg2 & 0x100) != 0) {
            arg0.field1970 = class171.field2972.method131(-128);
            arg0.field1979 = class171.field2972.method139((byte) -101);
            arg0.field1974 = class171.field2972.method131(-128);
            arg0.field1995 = class171.field2972.method143(0);
            arg0.field1998 = class171.field2972.method145(31) + class199.field3475;
            arg0.field1982 = class171.field2972.method145(27) + class199.field3475;
            arg0.field1988 = class171.field2972.method93(false);
            arg0.field1985 = 0;
            arg0.field2006 = 1;
        }
        if ((arg2 & 0x400) != 0) {
            int var26 = class171.field2972.method104(arg3 - 121);
            int var27 = class171.field2972.method93(false);
            arg0.method797(class199.field3475, var26, var27, true);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BLnf;)V", line = 383)
    public static final void method1328(byte arg0, class67 arg1) {
        if (arg0 >= -53) {
            field3367 = (class252) null;
        }
        field3380++;
        if (class211.field3628 == arg1.field1201) {
            class244.field4341[arg1.field1170] = true;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZLrl;I)Lrl;", line = 400)
    public final class196 method1329(boolean arg0, class196 arg1, int arg2) {
        int var4 = this.field3366[arg2];
        field3368++;
        class158 var5 = class5.method33(var4 >> 16, 77);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method283(true, true);
        }
        int var7 = 0;
        class158 var8 = null;
        if (this.field3369 != null && this.field3369.length > arg2) {
            int var9 = this.field3369[arg2];
            var8 = class5.method33(var9 >> 16, 39);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class196 var11 = arg1.method283(!var5.method1058(var6, (byte) 107), !this.field3358);
            var11.method280(var5, var6, this.field3358);
            return var11;
        }
        class196 var10 = arg1.method283(!var5.method1058(var6, (byte) 107) & !var8.method1058(var7, (byte) 107), !this.field3358);
        var10.method280(var5, var6, this.field3358);
        if (arg0) {
            var10.method280(var8, var7, this.field3358);
            return var10;
        } else {
            return (class196) null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILrl;I)Lrl;", line = 446)
    public final class196 method1330(int arg0, class196 arg1, int arg2) {
        int var4 = this.field3366[arg0];
        field3362++;
        if (arg2 != 769030352) {
            return (class196) null;
        }
        class158 var5 = class5.method33(var4 >> 16, 125);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method283(true, true);
        } else {
            class196 var7 = arg1.method283(!var5.method1058(var6, (byte) 107), !this.field3358);
            var7.method280(var5, var6, this.field3358);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lkh;IB)V", line = 474)
    private final void method1331(class14 arg0, int arg1, byte arg2) {
        if (arg2 != 13) {
            return;
        }
        if (arg1 == 1) {
            int var4 = arg0.method116(-1);
            this.field3384 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3384[var5] = arg0.method116(-1);
            }
            this.field3366 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3366[var6] = arg0.method116(arg2 - 14);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3366[var7] += arg0.method116(-1) << 16;
            }
        } else if (arg1 == 2) {
            this.field3378 = arg0.method116(-1);
        } else if (arg1 == 3) {
            int var8 = arg0.method93(false);
            this.field3373 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3373[var9] = arg0.method93(false);
            }
            this.field3373[var8] = 9999999;
        } else if (arg1 == 4) {
            this.field3382 = true;
        } else if (arg1 == 5) {
            this.field3387 = arg0.method93(false);
        } else if (arg1 == 6) {
            this.field3390 = arg0.method116(arg2 ^ 0xFFFFFFF2);
        } else if (arg1 == 7) {
            this.field3363 = arg0.method116(-1);
        } else if (arg1 == 8) {
            this.field3364 = arg0.method93(false);
        } else if (arg1 == 9) {
            this.field3359 = arg0.method93(false);
        } else if (arg1 == 10) {
            this.field3370 = arg0.method93(false);
        } else if (arg1 == 11) {
            this.field3379 = arg0.method93(false);
        } else if (arg1 == 12) {
            int var10 = arg0.method93(false);
            this.field3369 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field3369[var11] = arg0.method116(-1);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field3369[var12] = (arg0.method116(-1) << 16) + this.field3369[var12];
            }
        } else if (arg1 == 13) {
            int var13 = arg0.method116(-1);
            this.field3357 = new int[var13][];
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = arg0.method93(false);
                if (var15 > 0) {
                    this.field3357[var14] = new int[var15];
                    this.field3357[var14][0] = arg0.method114(0);
                    for (int var16 = 1; var16 < var15; var16++) {
                        this.field3357[var14][var16] = arg0.method116(-1);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field3358 = true;
        }
        field3381++;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILek;)V", line = 633)
    public static final void method1332(int arg0, class185 arg1) {
        class128.field2291 = arg1;
        field3377++;
        if (arg0 > -26) {
            method1332(79, (class185) null);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILcm;ILrl;I)Lrl;", line = 659)
    public final class196 method1333(int arg0, class194 arg1, int arg2, class196 arg3, int arg4) {
        field3360++;
        int var6 = this.field3366[arg0];
        if (arg4 != 1007160272) {
            this.field3390 = -88;
        }
        class158 var7 = class5.method33(var6 >> 16, -115);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method1330(arg2, arg3, arg4 - 238129920);
        }
        int var9 = arg1.field3366[arg2];
        class158 var10 = class5.method33(var9 >> 16, arg4 - 1007160386);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class196 var13 = arg3.method283(!var7.method1058(var8, (byte) 107), !this.field3358);
            var13.method280(var7, var8, this.field3358);
            return var13;
        } else {
            class196 var12 = arg3.method283(!var7.method1058(var8, (byte) 107) & !var10.method1058(var11, (byte) 107), !this.field3358 & !arg1.field3358);
            var12.method297(var7, var8, var10, var11, this.field3373, arg1.field3358 | this.field3358);
            return var12;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(JIIISLjf;Ljf;)V", line = 695)
    public static final void method1334(long arg0, int arg1, int arg2, int arg3, short arg4, class229 arg5, class229 arg6) {
        if (arg3 != -12158) {
            return;
        }
        field3375++;
        if (class61.field1044 || class124.field2176 >= 500) {
            return;
        }
        class150.field2584[class124.field2176] = arg5;
        class143.field2498[class124.field2176] = arg6;
        class115.field2063[class124.field2176] = arg4;
        class267.field4579[class124.field2176] = arg0;
        class229.field3952[class124.field2176] = arg1;
        class18.field282[class124.field2176] = arg2;
        class124.field2176++;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V", line = 728)
    public static void method1335(int arg0) {
        field3367 = null;
        if (arg0 <= 26) {
            method1332(32, (class185) null);
        }
        field3386 = null;
        field3389 = null;
        field3383 = null;
    }
}
