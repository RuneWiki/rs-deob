import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class546 {

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "Lej;")
    private class111 field7283;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "Lan;")
    private class22 field7273;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public int field7282;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    private int field7270;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "[B")
    public byte[] field7272;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    private int field7269;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    private int field7274;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    private int field7280;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "I")
    public static int field7285 = -2;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public static int field7281;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "[I")
    public static int[] field7271;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "[[Lgd;")
    private class315[][] field7279;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([BI)[B", line = 5)
    public static final byte[] method3034(byte[] arg0, int arg1) {
        field7284++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        if (arg1 != -1) {
            method3034(null, 117);
        }
        class83.method686(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lw;III)V", line = 23)
    public final void method3035(class276 arg0, int arg1, int arg2, int arg3) {
        field7277++;
        if (arg1 != -10373) {
            this.method3041(44, null, (byte) 120, true, 104, -125);
        }
        class372 var5 = (class372) arg0;
        int var6 = var5.field5022 + arg2 + 1;
        int var7 = var5.field5019 + arg3 + 1;
        int var8 = this.field7282 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field5028;
        int var11 = var5.field5023;
        int var12 = this.field7282 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var10 -= var13;
            var9 += var11 * var13;
            var8 += this.field7282 * var13;
            var6 = 1;
        }
        int var14 = 0;
        if (var6 + var10 >= this.field7270) {
            int var15 = var6 + 1 - (this.field7270 - var10);
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var9 += var16;
            var14 += var16;
            var7 = 1;
            var11 -= var16;
            var8 += var16;
            var12 += var16;
        }
        if ((var7 + var11) >= this.field7282) {
            int var17 = var7 - this.field7282 - (-var11 - 1);
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class26.method226(var8, var12, 0, var9, var14, var11, var10, var5.field5024, this.field7272);
            this.method3039(var10, var6, 117, var11, var7);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lw;BII)Z", line = 100)
    public final boolean method3036(class276 arg0, byte arg1, int arg2, int arg3) {
        field7275++;
        if (arg1 > -24) {
            method3034(null, 43);
        }
        class372 var5 = (class372) arg0;
        int var6 = var5.field5019 + arg2 + 1;
        int var7 = var5.field5022 + arg3 + 1;
        int var8 = this.field7282 * var7 + var6;
        int var9 = var5.field5028;
        int var10 = var5.field5023;
        int var11 = this.field7282 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var9 -= var12;
            var7 = 1;
            var8 += this.field7282 * var12;
        }
        if (this.field7270 <= var7 + var9) {
            int var13 = var7 + var9 + 1 - this.field7270;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var11 += var14;
            var8 += var14;
            var6 = 1;
        }
        if (this.field7282 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field7282;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field7282 + var11;
            return class608.method3342(var9, var10, this.field7272, -1, var8, var16, var17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 174)
    public final void method3037(int arg0) {
        field7276++;
        if (arg0 != 1) {
            this.method3036(null, (byte) -24, 114, -43);
        }
        this.field7279 = new class315[this.field7274][this.field7280];
        for (int var2 = 0; var2 < this.field7280; var2++) {
            for (int var3 = 0; var3 < this.field7274; var3++) {
                this.field7279[var3][var2] = new class315(this.field7283, this, this.field7273, var3, var2, this.field7269, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field7279[var3][var2].field4320 == 0) {
                    this.field7279[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 206)
    public static void method3038(int arg0) {
        if (arg0 != 2424) {
            method3038(108);
        }
        field7271 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIII)V", line = 219)
    private final void method3039(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7286++;
        if (this.field7279 == null) {
            return;
        }
        int var6 = arg4 - 1 >> 7;
        int var7 = arg3 + arg4 - 1 - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg0 + arg1 - 1 - 1 >> 7;
        int var10 = var6;
        int var11 = 124 % ((52 - arg2) / 45);
        while (var7 >= var10) {
            class315[] var12 = this.field7279[var10];
            for (int var13 = var8; var13 <= var9; var13++) {
                if (var12[var13] != null) {
                    var12[var13].field4337 = true;
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILw;BI)V", line = 261)
    public final void method3040(int arg0, class276 arg1, byte arg2, int arg3) {
        field7281++;
        class372 var5 = (class372) arg1;
        int var6 = var5.field5019 + arg3 + 1;
        int var7 = var5.field5022 + arg0 + 1;
        int var8 = this.field7282 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field5028;
        int var11 = var5.field5023;
        int var12 = this.field7282 - var11;
        if (arg2 != 14) {
            this.method3041(48, null, (byte) -72, false, -39, -80);
        }
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += this.field7282 * var14;
            var7 = 1;
            var10 -= var14;
            var9 += var11 * var14;
        }
        if (var7 + var10 >= this.field7270) {
            int var15 = var7 + var10 + 1 - this.field7270;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var13 += var16;
            var6 = 1;
            var11 -= var16;
            var9 += var16;
            var8 += var16;
        }
        if (var6 + var11 >= this.field7282) {
            int var17 = var6 - (this.field7282 - var11 - 1);
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class470.method2647(var12, var9, this.field7272, var10, var11, var13, var8, arg2 ^ 0x1830442C, var5.field5024);
            this.method3039(var10, var7, -1, var11, var6);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[[ZBZII)V", line = 333)
    public final void method3041(int arg0, boolean[][] arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        field7278++;
        this.field7283.method903(false, false);
        this.field7283.method826(false, arg2 + 78);
        this.field7283.method902(true, 1);
        if (arg2 != -2) {
            this.field7283 = null;
        }
        this.field7283.method858(1, 25681);
        this.field7283.method846(false, -2, false, (byte) 54);
        float var7 = 1.0F / (float) (this.field7283.field1819 * 128);
        if (arg3) {
            for (int var8 = 0; var8 < this.field7280; var8++) {
                int var9 = var8 << this.field7269;
                int var10 = var8 + 1 << this.field7269;
                label145: for (int var11 = 0; var11 < this.field7274; var11++) {
                    if (this.field7279[var11][var8] != null) {
                        int var12 = var11 << this.field7269;
                        int var13 = var11 + 1 << this.field7269;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if (var14 - arg4 >= -arg0 && arg0 >= (var14 - arg4)) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if ((var15 - arg5) >= (-arg0) && arg0 >= (var15 - arg5) && arg1[arg0 + var14 - arg4][var15 + arg0 - arg5]) {
                                        class74 var16 = this.field7283.method879(arg2 + 2);
                                        var16.method585(1.0F, var7, var7, (byte) 78);
                                        var16.method571(-var11, -var8, 0);
                                        this.field7283.method866(arg2 + 5760, class19.field313);
                                        this.field7279[var11][var8].method1875(-1);
                                        continue label145;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field7280; var17++) {
                int var18 = var17 << this.field7269;
                int var19 = var17 + 1 << this.field7269;
                for (int var20 = 0; var20 < this.field7274; var20++) {
                    class315 var21 = this.field7279[var20][var17];
                    if (var21 != null) {
                        class4 var22 = this.field7283.method839(var21.field4320 * 3, arg2 + 98);
                        Buffer var23 = var22.method27((byte) -64, true);
                        if (var23 != null) {
                            Stream var24 = this.field7283.method896(var23, (byte) -126);
                            int var25 = 0;
                            int var26 = var20 << this.field7269;
                            int var27 = var20 + 1 << this.field7269;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if (var28 - arg5 >= -arg0 && arg0 >= var28 - arg5) {
                                    int var30 = this.field7273.field2247 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if ((-arg0) <= (var31 - arg4) && var31 - arg4 <= arg0 && arg1[arg0 + var31 - arg4][var28 + arg0 - arg5]) {
                                            short[] var32 = this.field7273.field327[var30];
                                            if (var32 != null) {
                                                if (Stream.method3473()) {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var25++;
                                                        var24.method3474(var32[var33] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var25++;
                                                        var24.method3478(var32[var34] & 0xFFFF);
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method3479();
                            if (var22.method28(11390) && var25 > 0) {
                                class74 var29 = this.field7283.method879(0);
                                var29.method585(1.0F, var7, var7, (byte) 33);
                                var29.method571(-var20, -var17, 0);
                                this.field7283.method866(5758, class19.field313);
                                var21.method1876(false, var25 / 3, var22);
                            }
                        }
                    }
                }
            }
        }
        this.field7283.method842(-116);
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lej;Lan;)V", line = 539)
    public class546(class111 arg0, class22 arg1) {
        this.field7283 = arg0;
        this.field7273 = arg1;
        this.field7282 = (this.field7273.field2250 * this.field7273.field2247 >> this.field7283.field1892) + 2;
        this.field7270 = (this.field7273.field2250 * this.field7273.field2248 >> this.field7283.field1892) + 2;
        this.field7272 = new byte[this.field7282 * this.field7270];
        this.field7269 = this.field7283.field1892 + 7 - this.field7273.field2245;
        this.field7274 = this.field7273.field2247 >> this.field7269;
        this.field7280 = this.field7273.field2248 >> this.field7269;
    }
}
