import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class750 {

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "Laca;")
    private class726 field10417;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "Lsr;")
    private class251 field10416;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
    public int field10419;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
    private int field10413;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    private int field10403;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "[B")
    public byte[] field10405;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    private int field10410;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "I")
    private int field10418;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field10406;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public static int field10407;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public static int field10408;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    public static int field10409;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    public static int field10411;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    public static int field10415;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "I")
    public static int field10420;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "Z")
    public static boolean field10412;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "[Lur;")
    public static class537[] field10404;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "[[Lpp;")
    private class392[][] field10414;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method4164(int arg0, int arg1, int arg2) {
        field10407++;
        if (arg0 == -6794) {
            return (arg1 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lr;III)Z", line = 15)
    public final boolean method4165(class180 arg0, int arg1, int arg2, int arg3) {
        field10420++;
        class18 var5 = (class18) arg0;
        int var6 = var5.field282 + arg1 + 1;
        int var7 = var5.field271 + arg2 + 1;
        int var8 = this.field10419 * var7 + var6;
        if (arg3 != -7219) {
            method4164(-85, -102, -100);
        }
        int var9 = var5.field277;
        int var10 = var5.field275;
        int var11 = this.field10419 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var7 = 1;
            var9 -= var12;
            var8 += this.field10419 * var12;
        }
        if ((var7 + var9) >= this.field10413) {
            int var13 = var7 + var9 + 1 - this.field10413;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += var14;
            var11 += var14;
            var10 -= var14;
            var6 = 1;
        }
        if (this.field10419 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field10419;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field10419 + var11;
            return class208.method1276(var10, var9, false, var17, this.field10405, var8, var16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V", line = 91)
    public final void method4166(byte arg0) {
        field10406++;
        this.field10414 = new class392[this.field10410][this.field10418];
        if (arg0 >= -112) {
            method4164(77, 37, -97);
        }
        for (int var2 = 0; var2 < this.field10418; var2++) {
            for (int var3 = 0; var3 < this.field10410; var3++) {
                this.field10414[var3][var2] = new class392(this.field10416, this, this.field10417, var3, var2, this.field10403, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field10414[var3][var2].field5532 == 0) {
                    this.field10414[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)V", line = 128)
    public static void method4167(byte arg0) {
        field10404 = null;
        int var1 = 80 % ((arg0 + 77) / 45);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIBZ[[ZI)V", line = 137)
    public final void method4168(int arg0, int arg1, byte arg2, boolean arg3, boolean[][] arg4, int arg5) {
        if (arg2 <= 33) {
            this.method4170(null, 27, -91, -34);
        }
        this.field10416.method1645(false, -22042);
        field10409++;
        this.field10416.method1629(false, (byte) -51);
        this.field10416.method1602(-1, 1);
        this.field10416.method1628((byte) 108, 1);
        this.field10416.method1605(false, -2, 32242, false);
        float var7 = 1.0F / (float) (this.field10416.field3594 * 128);
        if (arg3) {
            for (int var8 = 0; var8 < this.field10418; var8++) {
                int var9 = var8 << this.field10403;
                int var10 = var8 + 1 << this.field10403;
                label145: for (int var11 = 0; var11 < this.field10410; var11++) {
                    if (this.field10414[var11][var8] != null) {
                        int var12 = var11 << this.field10403;
                        int var13 = var11 + 1 << this.field10403;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if (-arg1 <= var14 - arg5 && var14 - arg5 <= arg1) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if (var15 - arg0 >= -arg1 && arg1 >= (var15 - arg0) && arg4[var14 + arg1 - arg5][var15 + arg1 - arg0]) {
                                        class328 var16 = this.field10416.method1593(-57);
                                        var16.method2144(var7, 0, var7, 1.0F);
                                        var16.method360(-var11, -var8, 0);
                                        this.field10416.method1600((byte) 95, class184.field2497);
                                        this.field10414[var11][var8].method2469(0);
                                        continue label145;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field10418; var17++) {
                int var18 = var17 << this.field10403;
                int var19 = var17 + 1 << this.field10403;
                for (int var20 = 0; var20 < this.field10410; var20++) {
                    class392 var21 = this.field10414[var20][var17];
                    if (var21 != null) {
                        class749 var22 = this.field10416.method1635(-14589, var21.field5532 * 3);
                        Buffer var23 = var22.method2154(27599, true);
                        if (var23 != null) {
                            Stream var24 = this.field10416.method1666(var23, true);
                            int var25 = 0;
                            int var26 = var20 << this.field10403;
                            int var27 = var20 + 1 << this.field10403;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if ((-arg1) <= (var28 - arg0) && var28 - arg0 <= arg1) {
                                    int var30 = this.field10417.field3935 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if ((var31 - arg5) >= (-arg1) && var31 - arg5 <= arg1 && arg4[var31 - (arg5 - arg1)][var28 + arg1 - arg0]) {
                                            short[] var32 = this.field10417.field10129[var30];
                                            if (var32 != null) {
                                                if (Stream.method3662()) {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var24.method3654(var32[var33] & 0xFFFF);
                                                        var25++;
                                                    }
                                                } else {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var24.method3655(var32[var34] & 0xFFFF);
                                                        var25++;
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method3656();
                            if (var22.method2156((byte) 118) && var25 > 0) {
                                class328 var29 = this.field10416.method1593(127);
                                var29.method2144(var7, 0, var7, 1.0F);
                                var29.method360(-var20, -var17, 0);
                                this.field10416.method1600((byte) 95, class184.field2497);
                                var21.method2467(20369, var22, var25 / 3);
                            }
                        }
                    }
                }
            }
        }
        this.field10416.method1632((byte) -103);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILr;BI)V", line = 343)
    public final void method4169(int arg0, class180 arg1, byte arg2, int arg3) {
        field10408++;
        class18 var5 = (class18) arg1;
        int var6 = var5.field282 + arg3 + 1;
        int var7 = var5.field271 + arg0 + 1;
        int var8 = -91 / ((37 - arg2) / 58);
        int var9 = this.field10419 * var7 + var6;
        int var10 = 0;
        int var11 = var5.field277;
        int var12 = var5.field275;
        int var13 = this.field10419 - var12;
        int var14 = 0;
        if (var7 <= 0) {
            int var15 = 1 - var7;
            var10 += var12 * var15;
            var7 = 1;
            var9 += this.field10419 * var15;
            var11 -= var15;
        }
        if (this.field10413 <= var7 + var11) {
            int var16 = var7 + var11 + 1 - this.field10413;
            var11 -= var16;
        }
        if (var6 <= 0) {
            int var17 = 1 - var6;
            var12 -= var17;
            var9 += var17;
            var10 += var17;
            var6 = 1;
            var14 += var17;
            var13 += var17;
        }
        if (var6 + var12 >= this.field10419) {
            int var18 = var6 + var12 + 1 - this.field10419;
            var13 += var18;
            var12 -= var18;
            var14 += var18;
        }
        if (var12 > 0 && var11 > 0) {
            class295.method1919(-1, this.field10405, var10, var12, var14, var5.field273, var9, var11, var13);
            this.method4171(var11, var12, var7, -1, var6);
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lsr;Laca;)V", line = 412)
    public class750(class251 arg0, class726 arg1) {
        this.field10417 = arg1;
        this.field10416 = arg0;
        this.field10419 = (this.field10417.field3935 * this.field10417.field3925 >> this.field10416.field3625) + 2;
        this.field10413 = (this.field10417.field3930 * this.field10417.field3925 >> this.field10416.field3625) + 2;
        this.field10403 = this.field10416.field3625 + 7 - this.field10417.field3929;
        this.field10405 = new byte[this.field10419 * this.field10413];
        this.field10410 = this.field10417.field3935 >> this.field10403;
        this.field10418 = this.field10417.field3930 >> this.field10403;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(Lr;III)V", line = 427)
    public final void method4170(class180 arg0, int arg1, int arg2, int arg3) {
        field10415++;
        class18 var5 = (class18) arg0;
        int var6 = var5.field271 + arg2 + 1;
        int var7 = var5.field282 + arg3 + 1;
        int var8 = var7 + (this.field10419 * var6);
        int var9 = 0;
        int var10 = var5.field277;
        int var11 = var5.field275;
        int var12 = this.field10419 - var11;
        int var13 = 0;
        if (arg1 != 2048) {
            this.field10419 = 86;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var9 += var11 * var14;
            var8 += this.field10419 * var14;
            var10 -= var14;
            var6 = 1;
        }
        if (this.field10413 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field10413;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var7 = 1;
            var11 -= var16;
            var12 += var16;
            var9 += var16;
            var13 += var16;
            var8 += var16;
        }
        if (var7 + var11 >= this.field10419) {
            int var17 = var11 + var7 + 1 - this.field10419;
            var13 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class56.method370(var12, var11, var8, var5.field273, var10, this.field10405, var9, var13, arg1 ^ 0xFFFFF7BA);
            this.method4171(var10, var11, var6, arg1 - 2049, var7);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIII)V", line = 497)
    private final void method4171(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10411++;
        if (this.field10414 == null) {
            return;
        }
        int var6 = arg4 - 1 >> 7;
        int var7 = arg1 + arg4 - 1 - 1 >> 7;
        int var8 = arg2 - 1 >> 7;
        int var9 = arg2 + arg0 + arg3 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class392[] var11 = this.field10414[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field5544 = true;
                }
            }
        }
    }
}
