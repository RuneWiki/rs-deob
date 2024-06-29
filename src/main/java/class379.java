import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class379 {

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public int field5519 = -1;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "I")
    public int field5527 = -1;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "Z")
    public boolean field5526 = false;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
    public int field5524 = -1;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "Z")
    public boolean field5522 = false;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "I")
    public int field5531 = 2;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "Z")
    public boolean field5520 = false;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public int field5514 = -1;

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
    public int field5536 = 5;

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "Z")
    public boolean field5532 = false;

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
    public int field5543 = -1;

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
    public int field5541 = 99;

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
    public static int field5525 = 0;

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
    public static int field5538 = 0;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "[[I")
    public static int[][] field5542 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
    public int field5521;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "[I")
    private int[] field5515;

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "[I")
    public int[] field5539;

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "[I")
    public int[] field5540;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "[Z")
    public boolean[] field5513;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "[[I")
    public int[][] field5534;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lef;I)V")
    public final void method2278(class385 arg0, int arg1) {
        if (arg1 != 0) {
            this.field5515 = null;
        }
        field5518++;
        while (true) {
            int var3 = arg0.method2343(255);
            if (var3 == 0) {
                return;
            }
            this.method2280(arg0, (byte) -57, var3);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lwp;IIIBI)Lwp;")
    public final class292 method2279(class292 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field5530++;
        int var7 = this.field5540[arg1];
        int var8 = this.field5539[arg1];
        class265 var9 = class374.method2243(false, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method1264((byte) 1, arg3, true);
        }
        class265 var11 = null;
        if ((this.field5532 || class440.field6479) && arg2 != -1 && this.field5539.length > arg2) {
            int var12 = this.field5539[arg2];
            var11 = class374.method2243(false, var12 >> 16);
            arg2 = var12 & 0xFFFF;
        }
        class265 var13 = null;
        int var14 = -105 % ((arg4 + 38) / 38);
        class265 var15 = null;
        int var16 = 0;
        int var17 = 0;
        if (this.field5515 != null) {
            if (arg1 < this.field5515.length) {
                var16 = this.field5515[arg1];
                if (var16 != 65535) {
                    var13 = class374.method2243(false, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
            if ((this.field5532 || class440.field6479) && arg2 != -1 && this.field5515.length > arg2) {
                var17 = this.field5515[arg2];
                if (var17 != 65535) {
                    var15 = class374.method2243(false, var17 >> 16);
                    var17 &= 0xFFFF;
                }
            }
        }
        if (this.field5522) {
            arg3 |= 0x200;
        }
        if (var9.method1640(var10, (byte) 11)) {
            arg3 |= 0x80;
        }
        if (var9.method1639(-1, var10)) {
            arg3 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method1640(var16, (byte) 11)) {
                arg3 |= 0x80;
            }
            if (var13.method1639(-1, var16)) {
                arg3 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method1640(arg2, (byte) 11)) {
                arg3 |= 0x80;
            }
            if (var11.method1639(-1, arg2)) {
                arg3 |= 0x100;
            }
        }
        if (var15 != null) {
            if (var15.method1640(var17, (byte) 11)) {
                arg3 |= 0x80;
            }
            if (var15.method1639(-1, var17)) {
                arg3 |= 0x100;
            }
        }
        int var18 = arg3 | 0x20;
        class292 var19 = arg0.method1264((byte) 1, var18, true);
        var19.method1817(var7, arg2, 0, (byte) 124, var11, arg5 - 1, var9, this.field5522, var10);
        if (var13 != null) {
            var19.method1817(var7, var17, 0, (byte) 85, var15, arg5 - 1, var13, this.field5522, var16);
        }
        return var19;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lef;BI)V")
    private final void method2280(class385 arg0, byte arg1, int arg2) {
        if (arg1 != -57) {
            this.field5515 = null;
        }
        field5537++;
        if (arg2 == 1) {
            int var13 = arg0.method2323(-39);
            this.field5540 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field5540[var14] = arg0.method2323(-89);
            }
            this.field5539 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field5539[var15] = arg0.method2323(-102);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field5539[var16] = (arg0.method2323(-112) << 16) + this.field5539[var16];
            }
        } else if (arg2 == 2) {
            this.field5527 = arg0.method2323(-49);
        } else if (arg2 == 3) {
            this.field5513 = new boolean[256];
            int var11 = arg0.method2343(255);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field5513[arg0.method2343(255)] = true;
            }
        } else if (arg2 == 4) {
            this.field5520 = true;
        } else if (arg2 == 5) {
            this.field5536 = arg0.method2343(arg1 + 312);
        } else if (arg2 == 6) {
            this.field5519 = arg0.method2323(-43);
        } else if (arg2 == 7) {
            this.field5524 = arg0.method2323(-115);
        } else if (arg2 == 8) {
            this.field5541 = arg0.method2343(255);
        } else if (arg2 == 9) {
            this.field5514 = arg0.method2343(arg1 ^ 0xFFFFFF38);
        } else if (arg2 == 10) {
            this.field5543 = arg0.method2343(255);
        } else if (arg2 == 11) {
            this.field5531 = arg0.method2343(arg1 ^ 0xFFFFFF38);
        } else if (arg2 == 12) {
            int var4 = arg0.method2343(255);
            this.field5515 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5515[var5] = arg0.method2323(-76);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field5515[var6] = (arg0.method2323(-70) << 16) + this.field5515[var6];
            }
        } else if (arg2 == 13) {
            int var7 = arg0.method2323(-11);
            this.field5534 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg0.method2343(255);
                if (var9 > 0) {
                    this.field5534[var8] = new int[var9];
                    this.field5534[var8][0] = arg0.method2382((byte) -68);
                    for (int var10 = 1; var10 < var9; var10++) {
                        this.field5534[var8][var10] = arg0.method2323(-3);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field5522 = true;
        } else if (arg2 == 15) {
            this.field5532 = true;
        } else if (arg2 == 16) {
            this.field5526 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public static void method2281(int arg0) {
        if (arg0 != 99) {
            method2281(97);
        }
        field5542 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
    public final void method2282(byte arg0) {
        if (this.field5543 == -1) {
            if (this.field5513 == null) {
                this.field5543 = 0;
            } else {
                this.field5543 = 2;
            }
        }
        field5528++;
        if (this.field5514 == -1) {
            if (this.field5513 == null) {
                this.field5514 = 0;
            } else {
                this.field5514 = 2;
            }
        }
        if (arg0 > -75) {
            this.method2280((class385) null, (byte) 17, 98);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIZI)I")
    public final int method2283(int arg0, int arg1, boolean arg2, int arg3) {
        field5523++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field5539[arg3];
        class265 var8 = null;
        class265 var9 = class374.method2243(false, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        } else if (arg0 == 28432) {
            if ((this.field5532 || class440.field6479) && arg1 != -1 && arg1 < this.field5539.length) {
                int var11 = this.field5539[arg1];
                var8 = class374.method2243(false, var11 >> 16);
                var6 = var11 & 0xFFFF;
            }
            if (this.field5522) {
                var5 |= 0x200;
            }
            if (var9.method1640(var10, (byte) 11)) {
                var5 |= 0x80;
            }
            if (var9.method1639(-1, var10)) {
                var5 |= 0x100;
            }
            if (var8 != null) {
                if (var8.method1640(var6, (byte) 11)) {
                    var5 |= 0x80;
                }
                if (var8.method1639(arg0 ^ 0xFFFF90EF, var6)) {
                    var5 |= 0x100;
                }
            }
            if (this.field5515 != null && arg2) {
                if (arg3 < this.field5515.length) {
                    int var12 = this.field5515[arg3];
                    if (var12 != 65535) {
                        class265 var13 = class374.method2243(false, var12 >> 16);
                        int var14 = var12 & 0xFFFF;
                        if (var13 != null) {
                            if (var13.method1640(var14, (byte) 11)) {
                                var5 |= 0x80;
                            }
                            if (var13.method1639(-1, var14)) {
                                var5 |= 0x100;
                            }
                        }
                    }
                }
                if ((this.field5532 || class440.field6479) && arg1 != -1 && this.field5515.length > arg1) {
                    int var15 = this.field5515[arg1];
                    if (var15 != 65535) {
                        class265 var16 = class374.method2243(false, var15 >> 16);
                        int var17 = var15 & 0xFFFF;
                        if (var16 != null) {
                            if (var16.method1640(var17, (byte) 11)) {
                                var5 |= 0x80;
                            }
                            if (var16.method1639(-1, var17)) {
                                var5 |= 0x100;
                            }
                        }
                    }
                }
            }
            return var5 | 0x20;
        } else {
            return -116;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5533++;
        class343 var10 = null;
        if (arg0 != 0) {
            method2284(-27, 117, -23, -76, 39, -66, 103, 1, -66, -37);
        }
        for (class343 var11 = (class343) class192.field2875.method2514((byte) 61); var11 != null; var11 = (class343) class192.field2875.method2511(42)) {
            if (var11.field5137 == arg6 && var11.field5129 == arg1 && var11.field5135 == arg3 && var11.field5124 == arg7) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class343();
            var10.field5137 = arg6;
            var10.field5135 = arg3;
            var10.field5129 = arg1;
            var10.field5124 = arg7;
            class91.method595(var10, 0);
            class192.field2875.method2504(42, var10);
        }
        var10.field5133 = arg5;
        var10.field5127 = arg2;
        var10.field5131 = arg4;
        var10.field5125 = arg8;
        var10.field5130 = arg9;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I[IIII)V")
    public static final void method2285(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field5517++;
        arg4--;
        int var6 = arg2 - 1;
        int var5 = var6 - 7;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg1[var7] = arg3;
            int var8 = var7 + 1;
            arg1[var8] = arg3;
            int var9 = var8 + 1;
            arg1[var9] = arg3;
            int var10 = var9 + 1;
            arg1[var10] = arg3;
            int var11 = var10 + 1;
            arg1[var11] = arg3;
            int var12 = var11 + 1;
            arg1[var12] = arg3;
            int var13 = var12 + 1;
            arg1[var13] = arg3;
            arg4 = var13 + 1;
            arg1[arg4] = arg3;
        }
        if (arg0 < 123) {
            method2285(125, (int[]) null, -126, 73, 28);
        }
        while (var6 > arg4) {
            arg4++;
            arg1[arg4] = arg3;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BLwp;IBIIII)Lwp;")
    public final class292 method2286(byte arg0, class292 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field5535++;
        int var9 = this.field5540[arg4];
        int var10 = this.field5539[arg4];
        class265 var11 = class374.method2243(false, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg1.method1264(arg0, arg7, true);
        } else if (arg3 == 16) {
            class265 var13 = null;
            if ((this.field5532 || class440.field6479) && arg2 != -1 && this.field5539.length > arg2) {
                int var14 = this.field5539[arg2];
                var13 = class374.method2243(false, var14 >> 16);
                arg2 = var14 & 0xFFFF;
            }
            if (this.field5522) {
                arg7 |= 0x200;
            }
            if (var11.method1640(var12, (byte) 11)) {
                arg7 |= 0x80;
            }
            if (var11.method1639(-1, var12)) {
                arg7 |= 0x100;
            }
            if (var13 != null) {
                if (var13.method1640(arg2, (byte) 11)) {
                    arg7 |= 0x80;
                }
                if (var13.method1639(-1, arg2)) {
                    arg7 |= 0x100;
                }
            }
            int var15 = arg7 | 0x20;
            class292 var16 = arg1.method1264(arg0, var15, true);
            var16.method1817(var9, arg2, arg6, (byte) 121, var13, arg5 - 1, var11, this.field5522, var12);
            return var16;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BI)V")
    public static final void method2287(byte arg0, int arg1) {
        if (arg0 != 123) {
            return;
        }
        if (class360.field5320 == 0) {
            class311.field4685.method1597(true, arg1);
        } else {
            class314.field4765 = arg1;
        }
        field5516++;
    }
}
