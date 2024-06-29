import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class580 {

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "Lmj;")
    private class344 field8195;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "Lbh;")
    private class547 field8197;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
    public int field8202;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "I")
    private int field8212;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "[B")
    public byte[] field8194;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    private int field8201;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    private int field8198;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
    private int field8199;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    public static int field8205 = 0;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "Z")
    public static boolean field8207 = false;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "[S")
    private static short[] field8206 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
    public static int field8211 = -1;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "[S")
    private static short[] field8209 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "[S")
    private static short[] field8215 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "[[S")
    public static short[][] field8208 = new short[][] { field8215, field8206, field8209 };

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    public static int field8193;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
    public static int field8196;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
    public static int field8200;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
    public static int field8203;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    public static int field8210;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
    public static int field8213;

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "I")
    public static int field8214;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "[[Ltm;")
    private class527[][] field8204;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILha;II)V", line = 3)
    public final void method3278(int arg0, class120 arg1, int arg2, int arg3) {
        field8214++;
        class634 var5 = (class634) arg1;
        int var6 = var5.field8938 + arg0 + 1;
        int var7 = var5.field8928 + arg3 + 1;
        int var8 = var6 + (this.field8202 * var7);
        int var9 = 0;
        int var10 = var5.field8934;
        int var11 = var5.field8932;
        int var12 = this.field8202 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var8 += this.field8202 * var14;
            var10 -= var14;
            var9 += var11 * var14;
        }
        if ((var7 + var10) >= this.field8212) {
            int var15 = var7 + var10 + 1 - this.field8212;
            var10 -= var15;
        }
        int var16 = -119 / ((-arg2 - 56) / 51);
        if (var6 <= 0) {
            int var17 = 1 - var6;
            var6 = 1;
            var11 -= var17;
            var9 += var17;
            var8 += var17;
            var13 += var17;
            var12 += var17;
        }
        if (var6 + var11 >= this.field8202) {
            int var18 = var6 + var11 + 1 - this.field8202;
            var12 += var18;
            var11 -= var18;
            var13 += var18;
        }
        if (var11 > 0 && var10 > 0) {
            class223.method1350(var11, this.field8194, -125, var9, var8, var13, var10, var5.field8933, var12);
            this.method3279(var6, var11, -1, var10, var7);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIII)V", line = 75)
    private final void method3279(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8203++;
        if (this.field8204 == null) {
            return;
        }
        int var6 = arg0 + arg2 >> 7;
        int var7 = arg0 + arg1 - 2 >> 7;
        int var8 = arg4 - 1 >> 7;
        int var9 = arg3 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class527[] var11 = this.field8204[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field7435 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIILha;)V", line = 120)
    public final void method3280(int arg0, int arg1, int arg2, class120 arg3) {
        field8213++;
        class634 var5 = (class634) arg3;
        int var6 = var5.field8928 + arg2 + 1;
        int var7 = var5.field8938 + arg1 + 1;
        int var8 = this.field8202 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field8934;
        int var11 = var5.field8932;
        int var12 = this.field8202 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var9 += var11 * var13;
            var10 -= var13;
            var8 += this.field8202 * var13;
        }
        int var14 = 0;
        if (this.field8212 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field8212;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var14 += var16;
            var9 += var16;
            var7 = 1;
            var8 += var16;
            var12 += var16;
        }
        if (this.field8202 <= (var7 + var11)) {
            int var17 = var11 + var7 + 1 - this.field8202;
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 <= 0 || var10 <= 0) {
            return;
        }
        class22.method101(var9, var8, var11, var10, var12, 0, this.field8194, var5.field8933, var14);
        this.method3279(var7, var11, -1, var10, var6);
        if (arg0 >= -75) {
            field8215 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIZII[[Z)V", line = 193)
    public final void method3281(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean[][] arg5) {
        field8193++;
        this.field8195.method1984(false, (byte) -22);
        this.field8195.method2029(7, false);
        this.field8195.method2051(1, (byte) 112);
        this.field8195.method2004(1, arg1 + 177);
        if (arg1 != -175) {
            return;
        }
        this.field8195.method2008(false, 121, -2, false);
        float var7 = 1.0F / (float) (this.field8195.field4537 * 128);
        if (arg2) {
            for (int var8 = 0; var8 < this.field8199; var8++) {
                int var9 = var8 << this.field8201;
                int var10 = var8 + 1 << this.field8201;
                label145: for (int var11 = 0; var11 < this.field8198; var11++) {
                    if (this.field8204[var11][var8] != null) {
                        int var12 = var11 << this.field8201;
                        int var13 = var11 + 1 << this.field8201;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if ((var14 - arg0) >= (-arg3) && var14 - arg0 <= arg3) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if (var15 - arg4 >= -arg3 && arg3 >= (var15 - arg4) && arg5[arg3 + var14 - arg0][arg3 + var15 - arg4]) {
                                        class537 var16 = this.field8195.method2044(110);
                                        var16.method3030(var7, (byte) -51, var7, 1.0F);
                                        var16.method30(-var11, -var8, 0);
                                        this.field8195.method1999(class103.field1120, false);
                                        this.field8204[var11][var8].method2971(-1);
                                        continue label145;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field8199; var17++) {
                int var18 = var17 << this.field8201;
                int var19 = var17 + 1 << this.field8201;
                for (int var20 = 0; var20 < this.field8198; var20++) {
                    class527 var21 = this.field8204[var20][var17];
                    if (var21 != null) {
                        class17 var22 = this.field8195.method1989(var21.field7425 * 3, 105);
                        Buffer var23 = var22.method75(true, 21281);
                        if (var23 != null) {
                            Stream var24 = this.field8195.method1980((byte) -74, var23);
                            int var25 = 0;
                            int var26 = var20 << this.field8201;
                            int var27 = var20 + 1 << this.field8201;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if (var28 - arg4 >= -arg3 && (var28 - arg4) <= arg3) {
                                    int var30 = this.field8197.field3428 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if (var31 - arg0 >= -arg3 && var31 - arg0 <= arg3 && arg5[arg3 + var31 - arg0][arg3 + var28 - arg4]) {
                                            short[] var32 = this.field8197.field7809[var30];
                                            if (var32 != null) {
                                                if (Stream.method3480()) {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var24.method3468(var32[var34] & 0xFFFF);
                                                        var25++;
                                                    }
                                                } else {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var24.method3478(var32[var33] & 0xFFFF);
                                                        var25++;
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method3472();
                            if (var22.method71(-26305) && var25 > 0) {
                                class537 var29 = this.field8195.method2044(40);
                                var29.method3030(var7, (byte) -51, var7, 1.0F);
                                var29.method30(-var20, -var17, 0);
                                this.field8195.method1999(class103.field1120, false);
                                var21.method2967(var22, (byte) 75, var25 / 3);
                            }
                        }
                    }
                }
            }
        }
        this.field8195.method2010(114);
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(ILha;II)Z", line = 398)
    public final boolean method3282(int arg0, class120 arg1, int arg2, int arg3) {
        field8210++;
        class634 var5 = (class634) arg1;
        int var6 = var5.field8938 + arg0 + 1;
        if (arg2 != 24613) {
            field8215 = null;
        }
        int var7 = var5.field8928 + arg3 + 1;
        int var8 = this.field8202 * var7 + var6;
        int var9 = var5.field8934;
        int var10 = var5.field8932;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var9 -= var11;
            var8 += this.field8202 * var11;
            var7 = 1;
        }
        int var12 = this.field8202 - var10;
        if (this.field8212 <= (var7 + var9)) {
            int var13 = var7 + 1 - (-var9 + this.field8212);
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var12 += var14;
            var6 = 1;
            var10 -= var14;
            var8 += var14;
        }
        if ((var6 + var10) >= this.field8202) {
            int var15 = var6 + var10 + 1 - this.field8202;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field8202 + var12;
            return class648.method3624(var9, var16, var17, (byte) -110, this.field8194, var8, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 471)
    public static final void method3283(int arg0, String arg1, int arg2) {
        field8200++;
        if (arg2 >= -52) {
            field8215 = null;
        }
        class76 var3 = class3.method28(2, (byte) 42, arg0);
        var3.method403((byte) 126);
        var3.field790 = arg1;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V", line = 489)
    public final void method3284(int arg0) {
        field8196++;
        this.field8204 = new class527[this.field8198][this.field8199];
        int var2 = 0;
        if (arg0 != 1) {
            return;
        }
        while (var2 < this.field8199) {
            for (int var3 = 0; var3 < this.field8198; var3++) {
                this.field8204[var3][var2] = new class527(this.field8195, this, this.field8197, var3, var2, this.field8201, var3 * 128 + 1, var2 * 128 - -1);
                if (this.field8204[var3][var2].field7425 == 0) {
                    this.field8204[var3][var2] = null;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V", line = 545)
    public static void method3285(int arg0) {
        field8215 = null;
        field8208 = null;
        field8209 = null;
        field8206 = null;
        if (arg0 != 8178) {
            method3283(111, null, -78);
        }
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lmj;Lbh;)V", line = 558)
    public class580(class344 arg0, class547 arg1) {
        this.field8195 = arg0;
        this.field8197 = arg1;
        this.field8202 = (this.field8197.field3428 * this.field8197.field3424 >> this.field8195.field4594) + 2;
        this.field8212 = (this.field8197.field3426 * this.field8197.field3424 >> this.field8195.field4594) + 2;
        this.field8194 = new byte[this.field8212 * this.field8202];
        this.field8201 = this.field8195.field4594 + 7 - this.field8197.field3430;
        this.field8198 = this.field8197.field3428 >> this.field8201;
        this.field8199 = this.field8197.field3426 >> this.field8201;
    }
}
