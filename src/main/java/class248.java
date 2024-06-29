import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class248 {

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public int field4396 = -1;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public int field4388 = -1;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public int field4394 = -1;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public int field4405 = 5;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public int field4402 = -1;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public int field4404 = 99;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "Z")
    private boolean field4408 = false;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public int field4407 = 2;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public int field4400 = -1;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Z")
    public boolean field4389 = false;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Lwe;")
    public static class147 field4397 = new class147(30);

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "Le;")
    private static class191 field4411 = class54.method368(" from your ignore list first)3", 2047);

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "Le;")
    public static class191 field4412 = field4411;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
    public static int field4415 = 0;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    public static int field4418 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "Ltd;")
    public static class164 field4420;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "Lwk;")
    public static class46 field4416;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "[I")
    private int[] field4395;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "[I")
    public int[] field4406;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "[I")
    private int[] field4413;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "[I")
    public int[] field4419;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "[[B")
    public static byte[][] field4409;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "[[I")
    public int[][] field4390;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBLee;)Lee;")
    public final class251 method1728(int arg0, byte arg1, class251 arg2) {
        field4403++;
        int var4 = this.field4419[arg0];
        if (arg1 != -97) {
            method1738(36, (byte) 36, 107, 47, -88, -31, -18, 4);
        }
        class126 var5 = class79.method513(-17500, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method975(true, true);
        }
        class126 var7 = null;
        int var8 = 0;
        if (this.field4395 != null && arg0 < this.field4395.length) {
            int var9 = this.field4395[arg0];
            var7 = class79.method513(arg1 ^ 0x443B, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class251 var11 = arg2.method975(!var5.method855(false, var6), !this.field4408);
            var11.method971(var5, var6, this.field4408);
            return var11;
        } else {
            class251 var10 = arg2.method975(!var5.method855(false, var6) & !var7.method855(false, var8), !this.field4408);
            var10.method971(var5, var6, this.field4408);
            var10.method971(var7, var8, this.field4408);
            return var10;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILee;I)Lee;")
    public final class251 method1729(int arg0, class251 arg1, int arg2) {
        int var4 = this.field4419[arg0];
        field4417++;
        class126 var5 = class79.method513(-17500, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method975(true, true);
        } else {
            class251 var7 = arg1.method975(!var5.method855(false, var6), !this.field4408);
            var7.method971(var5, var6, this.field4408);
            return arg2 <= 77 ? null : var7;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lee;BII)Lee;")
    public final class251 method1730(class251 arg0, byte arg1, int arg2, int arg3) {
        field4387++;
        int var5 = this.field4419[arg2];
        class126 var6 = class79.method513(-17500, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method975(true, true);
        }
        class251 var8 = arg0.method975(!var6.method855(false, var7), !this.field4408);
        int var9 = arg3 & 0x3;
        if (arg1 != -128) {
            return null;
        }
        if (var9 == 1) {
            var8.method976();
        } else if (var9 == 2) {
            var8.method954();
        } else if (var9 == 3) {
            var8.method970();
        }
        var8.method971(var6, var7, this.field4408);
        if (var9 == 1) {
            var8.method970();
        } else if (var9 == 2) {
            var8.method954();
        } else if (var9 == 3) {
            var8.method976();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lji;II)V")
    private final void method1731(class225 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            int var4 = arg0.method1593(true);
            this.field4406 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4406[var5] = arg0.method1593(true);
            }
            this.field4419 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field4419[var6] = arg0.method1593(true);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field4419[var7] = (arg0.method1593(true) << 16) + this.field4419[var7];
            }
        } else if (arg2 == 2) {
            this.field4402 = arg0.method1593(true);
        } else if (arg2 == 3) {
            int var15 = arg0.method1580(-96);
            this.field4413 = new int[var15 + 1];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field4413[var16] = arg0.method1580(-2);
            }
            this.field4413[var15] = 9999999;
        } else if (arg2 == 4) {
            this.field4389 = true;
        } else if (arg2 == 5) {
            this.field4405 = arg0.method1580(-8);
        } else if (arg2 == 6) {
            this.field4400 = arg0.method1593(true);
        } else if (arg2 == 7) {
            this.field4394 = arg0.method1593(true);
        } else if (arg2 == 8) {
            this.field4404 = arg0.method1580(-58);
        } else if (arg2 == 9) {
            this.field4396 = arg0.method1580(-30);
        } else if (arg2 == 10) {
            this.field4388 = arg0.method1580(-47);
        } else if (arg2 == 11) {
            this.field4407 = arg0.method1580(-108);
        } else if (arg2 == 12) {
            int var12 = arg0.method1580(-122);
            this.field4395 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field4395[var13] = arg0.method1593(true);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field4395[var14] += arg0.method1593(true) << 16;
            }
        } else if (arg2 == 13) {
            int var8 = arg0.method1593(true);
            this.field4390 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg0.method1580(-95);
                if (var10 > 0) {
                    this.field4390[var9] = new int[var10];
                    this.field4390[var9][0] = arg0.method1591(2);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field4390[var9][var11] = arg0.method1593(true);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field4408 = true;
        }
        if (arg1 < 28) {
            this.field4406 = null;
        }
        field4391++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZLji;)V")
    public final void method1732(boolean arg0, class225 arg1) {
        while (true) {
            int var3 = arg1.method1580(-102);
            if (var3 == 0) {
                if (arg0) {
                    return;
                }
                field4399++;
                return;
            }
            this.method1731(arg1, 49, var3);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public final void method1733(byte arg0) {
        if (this.field4388 == -1) {
            if (this.field4413 == null) {
                this.field4388 = 0;
            } else {
                this.field4388 = 2;
            }
        }
        if (this.field4396 == -1) {
            if (this.field4413 == null) {
                this.field4396 = 0;
            } else {
                this.field4396 = 2;
            }
        }
        if (arg0 < 38) {
            this.method1732(false, (class225) null);
        }
        field4392++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBIII)V")
    public static final void method1734(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        for (class57 var5 = (class57) class191.field3397.method1173(86); var5 != null; var5 = (class57) class191.field3397.method1175(-1)) {
            class236.method1672(-116, var5, arg2, arg3, arg4, arg0);
        }
        if (arg1 > -115) {
            field4410 = -57;
        }
        for (class57 var6 = (class57) class269.field4750.method1173(109); var6 != null; var6 = (class57) class269.field4750.method1175(-1)) {
            byte var10 = 1;
            if (var6.field1041.field2977 == var6.field1041.field2974) {
                var10 = 0;
            } else if (var6.field1041.field2977 == var6.field1041.field2947) {
                var10 = 2;
            }
            if (var6.field1043 != var10) {
                int var11 = class242.method1699(var6.field1041, -1);
                if (var6.field1063 != var11) {
                    if (var6.field1058 != null) {
                        class270.field4764.method504(var6.field1058);
                        var6.field1058 = null;
                    }
                    var6.field1063 = var11;
                }
                var6.field1043 = var10;
            }
            var6.field1066 = var6.field1041.field3003;
            var6.field1048 = var6.field1041.field3003 + (var6.field1041.method490((byte) -4) * 64);
            var6.field1060 = var6.field1041.field2972;
            var6.field1065 = var6.field1041.field2972 + (var6.field1041.method490((byte) -4) * 64);
            class236.method1672(-110, var6, arg2, arg3, arg4, arg0);
        }
        field4414++;
        for (class57 var7 = (class57) class228.field4110.method609(false); var7 != null; var7 = (class57) class228.field4110.method610(70)) {
            byte var8 = 1;
            if (var7.field1062.field2977 == var7.field1062.field2974) {
                var8 = 0;
            } else if (var7.field1062.field2977 == var7.field1062.field2947) {
                var8 = 2;
            }
            if (var7.field1043 != var8) {
                int var9 = class1.method4((byte) -119, var7.field1062);
                if (var7.field1063 != var9) {
                    if (var7.field1058 != null) {
                        class270.field4764.method504(var7.field1058);
                        var7.field1058 = null;
                    }
                    var7.field1063 = var9;
                }
                var7.field1043 = var8;
            }
            var7.field1066 = var7.field1062.field3003;
            var7.field1048 = var7.field1062.field3003 + (var7.field1062.method490((byte) -4) * 64);
            var7.field1060 = var7.field1062.field2972;
            var7.field1065 = var7.field1062.field2972 + var7.field1062.method490((byte) -4) * 64;
            class236.method1672(-110, var7, arg2, arg3, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method1735(int arg0) {
        int var1 = 85 % ((arg0 - 54) / 53);
        field4420 = null;
        field4412 = null;
        field4397 = null;
        field4416 = null;
        field4411 = null;
        field4409 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILee;)Lee;")
    public final class251 method1736(int arg0, int arg1, class251 arg2) {
        field4393++;
        int var4 = this.field4419[arg0];
        class126 var5 = class79.method513(-17500, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (arg1 != 11403) {
            this.field4390 = null;
        }
        if (var5 == null) {
            return arg2.method945(true, true);
        } else {
            class251 var7 = arg2.method945(!var5.method855(false, var6), !this.field4408);
            var7.method971(var5, var6, this.field4408);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLab;ILee;I)Lee;")
    public final class251 method1737(byte arg0, class248 arg1, int arg2, class251 arg3, int arg4) {
        int var6 = this.field4419[arg2];
        int var7 = 31 / ((arg0 - 64) / 40);
        class126 var8 = class79.method513(-17500, var6 >> 16);
        int var9 = var6 & 0xFFFF;
        field4398++;
        if (var8 == null) {
            return arg1.method1729(arg4, arg3, 121);
        }
        int var10 = arg1.field4419[arg4];
        class126 var11 = class79.method513(-17500, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            class251 var13 = arg3.method975(!var8.method855(false, var9), !this.field4408);
            var13.method971(var8, var9, this.field4408);
            return var13;
        } else {
            class251 var14 = arg3.method975(!var8.method855(false, var9) & !var11.method855(false, var12), !arg1.field4408 & !this.field4408);
            var14.method961(var8, var9, var11, var12, this.field4413, this.field4408 | arg1.field4408);
            return var14;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method1738(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4401++;
        int var8 = class213.method1459(arg7, (byte) -12, class242.field4314, class99.field1584);
        int var9 = class213.method1459(arg4, (byte) -125, class242.field4314, class99.field1584);
        int var10 = class213.method1459(arg6, (byte) -34, class37.field678, class207.field3680);
        int var11 = class213.method1459(arg2, (byte) -103, class37.field678, class207.field3680);
        int var12 = class213.method1459(arg3 + arg7, (byte) -8, class242.field4314, class99.field1584);
        int var13 = class213.method1459(arg4 - arg3, (byte) -63, class242.field4314, class99.field1584);
        if (arg1 < 115) {
            return;
        }
        for (int var14 = var8; var14 < var12; var14++) {
            class242.method1700(7, arg5, var11, class232.field4151[var14], var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class242.method1700(7, arg5, var11, class232.field4151[var15], var10);
        }
        int var16 = class213.method1459(arg6 + arg3, (byte) -114, class37.field678, class207.field3680);
        int var17 = class213.method1459(arg2 - arg3, (byte) -82, class37.field678, class207.field3680);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class232.field4151[var18];
            class242.method1700(7, arg5, var16, var19, var10);
            class242.method1700(7, arg0, var17, var19, var16);
            class242.method1700(7, arg5, var11, var19, var17);
        }
    }
}
