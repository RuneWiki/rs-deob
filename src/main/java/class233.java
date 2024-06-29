import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class233 extends class126 {

    @OriginalMember(owner = "client!n", name = "I", descriptor = "Z")
    private boolean field3698 = false;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    public int field3692 = 0;

    @OriginalMember(owner = "client!n", name = "fb", descriptor = "B")
    public byte field3721 = 0;

    @OriginalMember(owner = "client!n", name = "jb", descriptor = "I")
    public int field3725 = 0;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "[I")
    public int[] field3695;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "[I")
    public int[] field3701;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "[I")
    public int[] field3709;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "[I")
    public int[] field3690;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "[I")
    public int[] field3687;

    @OriginalMember(owner = "client!n", name = "eb", descriptor = "[I")
    public int[] field3720;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "[I")
    public int[] field3697;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "[B")
    public byte[] field3706;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "[B")
    public byte[] field3677;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "[B")
    public byte[] field3679;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "[S")
    public short[] field3684;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "[S")
    public short[] field3693;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "[B")
    public byte[] field3696;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "[I")
    public int[] field3689;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "[B")
    public byte[] field3699;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "[S")
    public short[] field3700;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "[S")
    public short[] field3685;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "[S")
    public short[] field3694;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "[S")
    public short[] field3686;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "[S")
    public short[] field3708;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "[S")
    public short[] field3688;

    @OriginalMember(owner = "client!n", name = "hb", descriptor = "[B")
    public byte[] field3723;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "[B")
    public byte[] field3681;

    @OriginalMember(owner = "client!n", name = "Z", descriptor = "[B")
    public byte[] field3715;

    @OriginalMember(owner = "client!n", name = "ab", descriptor = "[B")
    public byte[] field3716;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "[B")
    public byte[] field3683;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "I")
    public int field3704;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "[[I")
    public int[][] field3707;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "[[I")
    public int[][] field3680;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "[Llc;")
    public class310[] field3711;

    @OriginalMember(owner = "client!n", name = "bb", descriptor = "[Lkc;")
    public class97[] field3717;

    @OriginalMember(owner = "client!n", name = "W", descriptor = "[Llc;")
    public class310[] field3712;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "S")
    public short field3710;

    @OriginalMember(owner = "client!n", name = "X", descriptor = "S")
    public short field3713;

    @OriginalMember(owner = "client!n", name = "cb", descriptor = "[I")
    private static int[] field3718 = new int[10000];

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "[I")
    private static int[] field3714 = class31.field450;

    @OriginalMember(owner = "client!n", name = "ib", descriptor = "I")
    private static int field3724 = 0;

    @OriginalMember(owner = "client!n", name = "db", descriptor = "[I")
    private static int[] field3719 = new int[10000];

    @OriginalMember(owner = "client!n", name = "o", descriptor = "[I")
    private static int[] field3678 = class31.field455;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "S")
    private short field3682;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "S")
    private short field3691;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "S")
    private short field3702;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "S")
    private short field3703;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "S")
    private short field3705;

    @OriginalMember(owner = "client!n", name = "gb", descriptor = "S")
    private short field3722;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(III)V", line = 5)
    public final void method1654(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3725; var4++) {
            this.field3695[var4] = this.field3695[var4] * arg0 / 128;
            this.field3701[var4] = this.field3701[var4] * arg1 / 128;
            this.field3709[var4] = this.field3709[var4] * arg2 / 128;
        }
        this.method1677();
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "()V", line = 23)
    public final void method1655() {
        for (int var1 = 0; var1 < this.field3725; var1++) {
            this.field3695[var1] = -this.field3695[var1];
            this.field3709[var1] = -this.field3709[var1];
        }
        this.method1677();
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "()V", line = 35)
    public final void method1656() {
        this.field3690 = null;
        this.field3689 = null;
        this.field3707 = (int[][]) null;
        this.field3680 = (int[][]) null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ln;I)I", line = 42)
    private final int method1657(class233 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field3695[arg1];
        int var5 = arg0.field3701[arg1];
        int var6 = arg0.field3709[arg1];
        for (int var7 = 0; var7 < this.field3725; var7++) {
            if (this.field3695[var7] == var4 && this.field3701[var7] == var5 && this.field3709[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field3695[this.field3725] = var4;
            this.field3701[this.field3725] = var5;
            this.field3709[this.field3725] = var6;
            if (arg0.field3690 != null) {
                this.field3690[this.field3725] = arg0.field3690[arg1];
            }
            var3 = this.field3725++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "()V", line = 81)
    public final void method1658() {
        if (this.field3711 != null) {
            return;
        }
        this.field3711 = new class310[this.field3725];
        for (int var1 = 0; var1 < this.field3725; var1++) {
            this.field3711[var1] = new class310();
        }
        for (int var2 = 0; var2 < this.field3692; var2++) {
            int var3 = this.field3687[var2];
            int var4 = this.field3720[var2];
            int var5 = this.field3697[var2];
            int var6 = this.field3695[var4] - this.field3695[var3];
            int var7 = this.field3701[var4] - this.field3701[var3];
            int var8 = this.field3709[var4] - this.field3709[var3];
            int var9 = this.field3695[var5] - this.field3695[var3];
            int var10 = this.field3701[var5] - this.field3701[var3];
            int var11 = this.field3709[var5] - this.field3709[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field3706 == null) {
                var19 = 0;
            } else {
                var19 = this.field3706[var2];
            }
            if (var19 == 0) {
                class310 var20 = this.field3711[var3];
                var20.field5219 += var16;
                var20.field5223 += var17;
                var20.field5214 += var18;
                var20.field5222++;
                class310 var21 = this.field3711[var4];
                var21.field5219 += var16;
                var21.field5223 += var17;
                var21.field5214 += var18;
                var21.field5222++;
                class310 var22 = this.field3711[var5];
                var22.field5219 += var16;
                var22.field5223 += var17;
                var22.field5214 += var18;
                var22.field5222++;
            } else if (var19 == 1) {
                if (this.field3717 == null) {
                    this.field3717 = new class97[this.field3692];
                }
                class97 var23 = this.field3717[var2] = new class97();
                var23.field1421 = var16;
                var23.field1429 = var17;
                var23.field1422 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([[IIIIII)V", line = 183)
    private final void method1659(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1660(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1660(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1660(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1660(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1668(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1673(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1683(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)Lth;", line = 249)
    public final class126 method888(int arg0, int arg1, int arg2) {
        return this.method1664(this.field3710, this.field3713, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([[III)I", line = 254)
    private static final int method1660(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()Z", line = 271)
    public final boolean method889() {
        return true;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lmh;II)Ln;", line = 277)
    public static final class233 method1661(class65 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method454(arg1, 0, arg2);
        return var3 == null ? null : new class233(var3);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lth;IIIZ)V", line = 286)
    public final void method885(class126 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class233 var6 = (class233) arg0;
        var6.method1663();
        var6.method1658();
        field3724++;
        int var7 = 0;
        int[] var8 = var6.field3695;
        int var9 = var6.field3725;
        for (int var10 = 0; var10 < this.field3725; var10++) {
            class310 var11 = this.field3711[var10];
            if (var11.field5222 != 0) {
                int var12 = this.field3701[var10] - arg2;
                if (var12 >= var6.field3691 && var12 <= var6.field3705) {
                    int var13 = this.field3695[var10] - arg1;
                    if (var13 >= var6.field3703 && var13 <= var6.field3722) {
                        int var14 = this.field3709[var10] - arg3;
                        if (var14 >= var6.field3682 && var14 <= var6.field3702) {
                            for (int var15 = 0; var15 < var9; var15++) {
                                class310 var16 = var6.field3711[var15];
                                if (var8[var15] == var13 && var6.field3709[var15] == var14 && var6.field3701[var15] == var12 && var16.field5222 != 0) {
                                    if (this.field3712 == null) {
                                        this.field3712 = new class310[this.field3725];
                                    }
                                    if (var6.field3712 == null) {
                                        var6.field3712 = new class310[var9];
                                    }
                                    class310 var17 = this.field3712[var10];
                                    if (var17 == null) {
                                        var17 = this.field3712[var10] = new class310(var11);
                                    }
                                    class310 var18 = var6.field3712[var15];
                                    if (var18 == null) {
                                        var18 = var6.field3712[var15] = new class310(var16);
                                    }
                                    var17.field5219 += var16.field5219;
                                    var17.field5223 += var16.field5223;
                                    var17.field5214 += var16.field5214;
                                    var17.field5222 += var16.field5222;
                                    var18.field5219 += var11.field5219;
                                    var18.field5223 += var11.field5223;
                                    var18.field5214 += var11.field5214;
                                    var18.field5222 += var11.field5222;
                                    var7++;
                                    field3719[var10] = field3724;
                                    field3718[var15] = field3724;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var19 = 0; var19 < this.field3692; var19++) {
            if (field3719[this.field3687[var19]] == field3724 && field3719[this.field3720[var19]] == field3724 && field3719[this.field3697[var19]] == field3724) {
                if (this.field3706 == null) {
                    this.field3706 = new byte[this.field3692];
                }
                this.field3706[var19] = 2;
            }
        }
        for (int var20 = 0; var20 < var6.field3692; var20++) {
            if (field3718[var6.field3687[var20]] == field3724 && field3718[var6.field3720[var20]] == field3724 && field3718[var6.field3697[var20]] == field3724) {
                if (var6.field3706 == null) {
                    var6.field3706 = new byte[var6.field3692];
                }
                var6.field3706[var20] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(SS)V", line = 406)
    public final void method1662(short arg0, short arg1) {
        if (this.field3693 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3692; var3++) {
            if (this.field3693[var3] == arg0) {
                this.field3693[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "()V", line = 429)
    private final void method1663() {
        if (this.field3698) {
            return;
        }
        this.field3698 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field3725; var7++) {
            int var8 = this.field3695[var7];
            int var9 = this.field3701[var7];
            int var10 = this.field3709[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field3703 = (short) var1;
        this.field3722 = (short) var4;
        this.field3691 = (short) var2;
        this.field3705 = (short) var5;
        this.field3682 = (short) var3;
        this.field3702 = (short) var6;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIIIIJ)V", line = 487)
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)Ljc;", line = 490)
    public final class287 method1664(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class166.field2625) {
            class183 var6 = new class183(this, arg0, arg1, true);
            var6.method1331();
            return var6;
        } else {
            return new class19(this, arg0, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(IIIII)Leg;", line = 504)
    public final class19 method1665(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class19(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([B)V", line = 510)
    private final void method1666(byte[] arg0) {
        class112 var2 = new class112(arg0);
        class112 var3 = new class112(arg0);
        class112 var4 = new class112(arg0);
        class112 var5 = new class112(arg0);
        class112 var6 = new class112(arg0);
        class112 var7 = new class112(arg0);
        class112 var8 = new class112(arg0);
        var2.field1640 = arg0.length - 23;
        int var9 = var2.method759((byte) -67);
        int var10 = var2.method759((byte) -86);
        int var11 = var2.method792(2);
        int var12 = var2.method792(2);
        int var13 = var2.method792(2);
        int var14 = var2.method792(2);
        int var15 = var2.method792(2);
        int var16 = var2.method792(2);
        int var17 = var2.method792(2);
        int var18 = var2.method759((byte) -83);
        int var19 = var2.method759((byte) -102);
        int var20 = var2.method759((byte) -65);
        int var21 = var2.method759((byte) -123);
        int var22 = var2.method759((byte) -41);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field3699 = new byte[var11];
            var2.field1640 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field3699[var26] = var2.method785((byte) -100);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field3725 = var9;
        this.field3692 = var10;
        this.field3704 = var11;
        this.field3695 = new int[var9];
        this.field3701 = new int[var9];
        this.field3709 = new int[var9];
        this.field3687 = new int[var10];
        this.field3720 = new int[var10];
        this.field3697 = new int[var10];
        if (var17 == 1) {
            this.field3690 = new int[var9];
        }
        if (var12 == 1) {
            this.field3706 = new byte[var10];
        }
        if (var13 == 255) {
            this.field3677 = new byte[var10];
        } else {
            this.field3721 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3679 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3689 = new int[var10];
        }
        if (var16 == 1) {
            this.field3693 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field3696 = new byte[var10];
        }
        this.field3684 = new short[var10];
        if (var11 > 0) {
            this.field3700 = new short[var11];
            this.field3685 = new short[var11];
            this.field3694 = new short[var11];
            if (var24 > 0) {
                this.field3686 = new short[var24];
                this.field3708 = new short[var24];
                this.field3688 = new short[var24];
                this.field3723 = new byte[var24];
                this.field3681 = new byte[var24];
                this.field3715 = new byte[var24];
            }
            if (var25 > 0) {
                this.field3716 = new byte[var25];
                this.field3683 = new byte[var25];
            }
        }
        var2.field1640 = var11;
        var3.field1640 = var44;
        var4.field1640 = var46;
        var5.field1640 = var48;
        var6.field1640 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var67 = var2.method792(2);
            int var68 = 0;
            if ((var67 & 0x1) != 0) {
                var68 = var3.method765(255);
            }
            int var69 = 0;
            if ((var67 & 0x2) != 0) {
                var69 = var4.method765(255);
            }
            int var70 = 0;
            if ((var67 & 0x4) != 0) {
                var70 = var5.method765(255);
            }
            this.field3695[var66] = var63 + var68;
            this.field3701[var66] = var64 + var69;
            this.field3709[var66] = var65 + var70;
            var63 = this.field3695[var66];
            var64 = this.field3701[var66];
            var65 = this.field3709[var66];
            if (var17 == 1) {
                this.field3690[var66] = var6.method792(2);
            }
        }
        var2.field1640 = var42;
        var3.field1640 = var31;
        var4.field1640 = var34;
        var5.field1640 = var37;
        var6.field1640 = var35;
        var7.field1640 = var40;
        var8.field1640 = var39;
        for (int var71 = 0; var71 < var10; var71++) {
            this.field3684[var71] = (short) var2.method759((byte) -119);
            if (var12 == 1) {
                this.field3706[var71] = var3.method785((byte) -117);
            }
            if (var13 == 255) {
                this.field3677[var71] = var4.method785((byte) -117);
            }
            if (var14 == 1) {
                this.field3679[var71] = var5.method785((byte) -90);
            }
            if (var15 == 1) {
                this.field3689[var71] = var6.method792(2);
            }
            if (var16 == 1) {
                this.field3693[var71] = (short) (var7.method759((byte) -93) - 1);
            }
            if (this.field3696 != null) {
                if (this.field3693[var71] == -1) {
                    this.field3696[var71] = -1;
                } else {
                    this.field3696[var71] = (byte) (var8.method792(2) - 1);
                }
            }
        }
        var2.field1640 = var33;
        var3.field1640 = var30;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        for (int var76 = 0; var76 < var10; var76++) {
            int var77 = var3.method792(2);
            if (var77 == 1) {
                var72 = var2.method765(255) + var75;
                var73 = var2.method765(255) + var72;
                var74 = var2.method765(255) + var73;
                var75 = var74;
                this.field3687[var76] = var72;
                this.field3720[var76] = var73;
                this.field3697[var76] = var74;
            }
            if (var77 == 2) {
                var73 = var74;
                var74 = var2.method765(255) + var75;
                var75 = var74;
                this.field3687[var76] = var72;
                this.field3720[var76] = var73;
                this.field3697[var76] = var74;
            }
            if (var77 == 3) {
                var72 = var74;
                var74 = var2.method765(255) + var75;
                var75 = var74;
                this.field3687[var76] = var72;
                this.field3720[var76] = var73;
                this.field3697[var76] = var74;
            }
            if (var77 == 4) {
                int var80 = var72;
                var72 = var73;
                var73 = var80;
                var74 = var2.method765(255) + var75;
                var75 = var74;
                this.field3687[var76] = var72;
                this.field3720[var76] = var80;
                this.field3697[var76] = var74;
            }
        }
        var2.field1640 = var50;
        var3.field1640 = var52;
        var4.field1640 = var54;
        var5.field1640 = var56;
        var6.field1640 = var58;
        var7.field1640 = var60;
        for (int var81 = 0; var81 < var11; var81++) {
            int var82 = this.field3699[var81] & 0xFF;
            if (var82 == 0) {
                this.field3700[var81] = (short) var2.method759((byte) -117);
                this.field3685[var81] = (short) var2.method759((byte) -125);
                this.field3694[var81] = (short) var2.method759((byte) -76);
            }
            if (var82 == 1) {
                this.field3700[var81] = (short) var3.method759((byte) -72);
                this.field3685[var81] = (short) var3.method759((byte) -98);
                this.field3694[var81] = (short) var3.method759((byte) -54);
                this.field3686[var81] = (short) var4.method759((byte) -59);
                this.field3708[var81] = (short) var4.method759((byte) -89);
                this.field3688[var81] = (short) var4.method759((byte) -57);
                this.field3723[var81] = var5.method785((byte) -104);
                this.field3681[var81] = var6.method785((byte) -100);
                this.field3715[var81] = var7.method785((byte) -108);
            }
            if (var82 == 2) {
                this.field3700[var81] = (short) var3.method759((byte) -74);
                this.field3685[var81] = (short) var3.method759((byte) -36);
                this.field3694[var81] = (short) var3.method759((byte) -89);
                this.field3686[var81] = (short) var4.method759((byte) -108);
                this.field3708[var81] = (short) var4.method759((byte) -74);
                this.field3688[var81] = (short) var4.method759((byte) -64);
                this.field3723[var81] = var5.method785((byte) -93);
                this.field3681[var81] = var6.method785((byte) -123);
                this.field3715[var81] = var7.method785((byte) -104);
                this.field3716[var81] = var7.method785((byte) -116);
                this.field3683[var81] = var7.method785((byte) -123);
            }
            if (var82 == 3) {
                this.field3700[var81] = (short) var3.method759((byte) -70);
                this.field3685[var81] = (short) var3.method759((byte) -48);
                this.field3694[var81] = (short) var3.method759((byte) -128);
                this.field3686[var81] = (short) var4.method759((byte) -92);
                this.field3708[var81] = (short) var4.method759((byte) -96);
                this.field3688[var81] = (short) var4.method759((byte) -110);
                this.field3723[var81] = var5.method785((byte) -122);
                this.field3681[var81] = var6.method785((byte) -128);
                this.field3715[var81] = var7.method785((byte) -105);
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "g", descriptor = "()Ln;", line = 932)
    public final class233 method1667() {
        class233 var1 = new class233();
        if (this.field3706 != null) {
            var1.field3706 = new byte[this.field3692];
            for (int var2 = 0; var2 < this.field3692; var2++) {
                var1.field3706[var2] = this.field3706[var2];
            }
        }
        var1.field3725 = this.field3725;
        var1.field3692 = this.field3692;
        var1.field3704 = this.field3704;
        var1.field3695 = this.field3695;
        var1.field3701 = this.field3701;
        var1.field3709 = this.field3709;
        var1.field3687 = this.field3687;
        var1.field3720 = this.field3720;
        var1.field3697 = this.field3697;
        var1.field3677 = this.field3677;
        var1.field3679 = this.field3679;
        var1.field3696 = this.field3696;
        var1.field3684 = this.field3684;
        var1.field3693 = this.field3693;
        var1.field3721 = this.field3721;
        var1.field3699 = this.field3699;
        var1.field3700 = this.field3700;
        var1.field3685 = this.field3685;
        var1.field3694 = this.field3694;
        var1.field3686 = this.field3686;
        var1.field3708 = this.field3708;
        var1.field3688 = this.field3688;
        var1.field3723 = this.field3723;
        var1.field3681 = this.field3681;
        var1.field3715 = this.field3715;
        var1.field3716 = this.field3716;
        var1.field3683 = this.field3683;
        var1.field3690 = this.field3690;
        var1.field3689 = this.field3689;
        var1.field3707 = this.field3707;
        var1.field3680 = this.field3680;
        var1.field3711 = this.field3711;
        var1.field3717 = this.field3717;
        var1.field3710 = this.field3710;
        var1.field3713 = this.field3713;
        return var1;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 987)
    private final void method1668(int arg0) {
        int var2 = field3714[arg0];
        int var3 = field3678[arg0];
        for (int var4 = 0; var4 < this.field3725; var4++) {
            int var5 = this.field3701[var4] * var3 - this.field3709[var4] * var2 >> 16;
            this.field3709[var4] = this.field3709[var4] * var3 + this.field3701[var4] * var2 >> 16;
            this.field3701[var4] = var5;
        }
        this.method1677();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()I", line = 1008)
    public final int method125() {
        if (!this.field3698) {
            this.method1663();
        }
        return this.field3691;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIBSB)I", line = 1018)
    public final int method1669(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field3687[this.field3692] = arg0;
        this.field3720[this.field3692] = arg1;
        this.field3697[this.field3692] = arg2;
        this.field3706[this.field3692] = arg3;
        this.field3696[this.field3692] = -1;
        this.field3684[this.field3692] = arg4;
        this.field3693[this.field3692] = -1;
        this.field3679[this.field3692] = arg5;
        return this.field3692++;
    }

    @OriginalMember(owner = "client!n", name = "h", descriptor = "()V", line = 1029)
    public static void method1670() {
        field3719 = null;
        field3718 = null;
        field3714 = null;
        field3678 = null;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(III)I", line = 1039)
    public final int method1671(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3725; var4++) {
            if (this.field3695[var4] == arg0 && this.field3701[var4] == arg1 && this.field3709[var4] == arg2) {
                return var4;
            }
        }
        this.field3695[this.field3725] = arg0;
        this.field3701[this.field3725] = arg1;
        this.field3709[this.field3725] = arg2;
        return this.field3725++;
    }

    @OriginalMember(owner = "client!n", name = "i", descriptor = "()V", line = 1060)
    public final void method1672() {
        for (int var1 = 0; var1 < this.field3725; var1++) {
            int var2 = this.field3709[var1];
            this.field3709[var1] = this.field3695[var1];
            this.field3695[var1] = -var2;
        }
        this.method1677();
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V", line = 1977)
    private class233() {
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "([B)V", line = 1979)
    private class233(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1666(arg0);
        } else {
            this.method1682(arg0);
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(III)V", line = 1986)
    public class233(int arg0, int arg1, int arg2) {
        this.field3695 = new int[arg0];
        this.field3701 = new int[arg0];
        this.field3709 = new int[arg0];
        this.field3690 = new int[arg0];
        this.field3687 = new int[arg1];
        this.field3720 = new int[arg1];
        this.field3697 = new int[arg1];
        this.field3706 = new byte[arg1];
        this.field3677 = new byte[arg1];
        this.field3679 = new byte[arg1];
        this.field3684 = new short[arg1];
        this.field3693 = new short[arg1];
        this.field3696 = new byte[arg1];
        this.field3689 = new int[arg1];
        if (arg2 > 0) {
            this.field3699 = new byte[arg2];
            this.field3700 = new short[arg2];
            this.field3685 = new short[arg2];
            this.field3694 = new short[arg2];
            this.field3686 = new short[arg2];
            this.field3708 = new short[arg2];
            this.field3688 = new short[arg2];
            this.field3723 = new byte[arg2];
            this.field3681 = new byte[arg2];
            this.field3715 = new byte[arg2];
            this.field3716 = new byte[arg2];
            this.field3683 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "([Ln;I)V", line = 2018)
    public class233(class233[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field3725 = 0;
        this.field3692 = 0;
        this.field3704 = 0;
        this.field3721 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class233 var10 = arg0[var9];
            if (var10 != null) {
                this.field3725 += var10.field3725;
                this.field3692 += var10.field3692;
                this.field3704 += var10.field3704;
                if (var10.field3677 == null) {
                    if (this.field3721 == -1) {
                        this.field3721 = var10.field3721;
                    }
                    if (this.field3721 != var10.field3721) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field3706 != null;
                var5 |= var10.field3679 != null;
                var6 |= var10.field3689 != null;
                var7 |= var10.field3693 != null;
                var8 |= var10.field3696 != null;
            }
        }
        this.field3695 = new int[this.field3725];
        this.field3701 = new int[this.field3725];
        this.field3709 = new int[this.field3725];
        this.field3690 = new int[this.field3725];
        this.field3687 = new int[this.field3692];
        this.field3720 = new int[this.field3692];
        this.field3697 = new int[this.field3692];
        if (var3) {
            this.field3706 = new byte[this.field3692];
        }
        if (var4) {
            this.field3677 = new byte[this.field3692];
        }
        if (var5) {
            this.field3679 = new byte[this.field3692];
        }
        if (var6) {
            this.field3689 = new int[this.field3692];
        }
        if (var7) {
            this.field3693 = new short[this.field3692];
        }
        if (var8) {
            this.field3696 = new byte[this.field3692];
        }
        this.field3684 = new short[this.field3692];
        if (this.field3704 > 0) {
            this.field3699 = new byte[this.field3704];
            this.field3700 = new short[this.field3704];
            this.field3685 = new short[this.field3704];
            this.field3694 = new short[this.field3704];
            this.field3686 = new short[this.field3704];
            this.field3708 = new short[this.field3704];
            this.field3688 = new short[this.field3704];
            this.field3723 = new byte[this.field3704];
            this.field3681 = new byte[this.field3704];
            this.field3715 = new byte[this.field3704];
            this.field3716 = new byte[this.field3704];
            this.field3683 = new byte[this.field3704];
        }
        this.field3725 = 0;
        this.field3692 = 0;
        this.field3704 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class233 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field3692; var13++) {
                    if (var3 && var12.field3706 != null) {
                        this.field3706[this.field3692] = var12.field3706[var13];
                    }
                    if (var4) {
                        if (var12.field3677 == null) {
                            this.field3677[this.field3692] = var12.field3721;
                        } else {
                            this.field3677[this.field3692] = var12.field3677[var13];
                        }
                    }
                    if (var5 && var12.field3679 != null) {
                        this.field3679[this.field3692] = var12.field3679[var13];
                    }
                    if (var6 && var12.field3689 != null) {
                        this.field3689[this.field3692] = var12.field3689[var13];
                    }
                    if (var7) {
                        if (var12.field3693 == null) {
                            this.field3693[this.field3692] = -1;
                        } else {
                            this.field3693[this.field3692] = var12.field3693[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field3696 == null || var12.field3696[var13] == -1) {
                            this.field3696[this.field3692] = -1;
                        } else {
                            this.field3696[this.field3692] = (byte) (var12.field3696[var13] + this.field3704);
                        }
                    }
                    this.field3684[this.field3692] = var12.field3684[var13];
                    this.field3687[this.field3692] = this.method1657(var12, var12.field3687[var13]);
                    this.field3720[this.field3692] = this.method1657(var12, var12.field3720[var13]);
                    this.field3697[this.field3692] = this.method1657(var12, var12.field3697[var13]);
                    this.field3692++;
                }
                for (int var14 = 0; var14 < var12.field3704; var14++) {
                    byte var15 = this.field3699[this.field3704] = var12.field3699[var14];
                    if (var15 == 0) {
                        this.field3700[this.field3704] = (short) this.method1657(var12, var12.field3700[var14]);
                        this.field3685[this.field3704] = (short) this.method1657(var12, var12.field3685[var14]);
                        this.field3694[this.field3704] = (short) this.method1657(var12, var12.field3694[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field3700[this.field3704] = var12.field3700[var14];
                        this.field3685[this.field3704] = var12.field3685[var14];
                        this.field3694[this.field3704] = var12.field3694[var14];
                        this.field3686[this.field3704] = var12.field3686[var14];
                        this.field3708[this.field3704] = var12.field3708[var14];
                        this.field3688[this.field3704] = var12.field3688[var14];
                        this.field3723[this.field3704] = var12.field3723[var14];
                        this.field3681[this.field3704] = var12.field3681[var14];
                        this.field3715[this.field3704] = var12.field3715[var14];
                    }
                    if (var15 == 2) {
                        this.field3716[this.field3704] = var12.field3716[var14];
                        this.field3683[this.field3704] = var12.field3683[var14];
                    }
                    this.field3704++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Ln;ZZZZ)V", line = 2227)
    public class233(class233 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field3725 = arg0.field3725;
        this.field3692 = arg0.field3692;
        this.field3704 = arg0.field3704;
        if (arg1) {
            this.field3695 = arg0.field3695;
            this.field3701 = arg0.field3701;
            this.field3709 = arg0.field3709;
        } else {
            this.field3695 = new int[this.field3725];
            this.field3701 = new int[this.field3725];
            this.field3709 = new int[this.field3725];
            for (int var6 = 0; var6 < this.field3725; var6++) {
                this.field3695[var6] = arg0.field3695[var6];
                this.field3701[var6] = arg0.field3701[var6];
                this.field3709[var6] = arg0.field3709[var6];
            }
        }
        if (arg2) {
            this.field3684 = arg0.field3684;
        } else {
            this.field3684 = new short[this.field3692];
            for (int var7 = 0; var7 < this.field3692; var7++) {
                this.field3684[var7] = arg0.field3684[var7];
            }
        }
        if (arg3 || arg0.field3693 == null) {
            this.field3693 = arg0.field3693;
        } else {
            this.field3693 = new short[this.field3692];
            for (int var8 = 0; var8 < this.field3692; var8++) {
                this.field3693[var8] = arg0.field3693[var8];
            }
        }
        if (arg4) {
            this.field3679 = arg0.field3679;
        } else {
            this.field3679 = new byte[this.field3692];
            if (arg0.field3679 == null) {
                for (int var9 = 0; var9 < this.field3692; var9++) {
                    this.field3679[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field3692; var10++) {
                    this.field3679[var10] = arg0.field3679[var10];
                }
            }
        }
        this.field3687 = arg0.field3687;
        this.field3720 = arg0.field3720;
        this.field3697 = arg0.field3697;
        this.field3706 = arg0.field3706;
        this.field3677 = arg0.field3677;
        this.field3696 = arg0.field3696;
        this.field3721 = arg0.field3721;
        this.field3699 = arg0.field3699;
        this.field3700 = arg0.field3700;
        this.field3685 = arg0.field3685;
        this.field3694 = arg0.field3694;
        this.field3686 = arg0.field3686;
        this.field3708 = arg0.field3708;
        this.field3688 = arg0.field3688;
        this.field3723 = arg0.field3723;
        this.field3681 = arg0.field3681;
        this.field3715 = arg0.field3715;
        this.field3716 = arg0.field3716;
        this.field3683 = arg0.field3683;
        this.field3690 = arg0.field3690;
        this.field3689 = arg0.field3689;
        this.field3707 = arg0.field3707;
        this.field3680 = arg0.field3680;
        this.field3711 = arg0.field3711;
        this.field3717 = arg0.field3717;
        this.field3712 = arg0.field3712;
        this.field3710 = arg0.field3710;
        this.field3713 = arg0.field3713;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V", line = 1078)
    private final void method1673(int arg0) {
        int var2 = field3714[arg0];
        int var3 = field3678[arg0];
        for (int var4 = 0; var4 < this.field3725; var4++) {
            int var5 = this.field3701[var4] * var2 + this.field3695[var4] * var3 >> 16;
            this.field3701[var4] = this.field3701[var4] * var3 - this.field3695[var4] * var2 >> 16;
            this.field3695[var4] = var5;
        }
        this.method1677();
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(III)V", line = 1098)
    public final void method1674(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field3714[arg2];
            int var5 = field3678[arg2];
            for (int var6 = 0; var6 < this.field3725; var6++) {
                int var7 = this.field3701[var6] * var4 + this.field3695[var6] * var5 >> 16;
                this.field3701[var6] = this.field3701[var6] * var5 - this.field3695[var6] * var4 >> 16;
                this.field3695[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field3714[arg0];
            int var9 = field3678[arg0];
            for (int var10 = 0; var10 < this.field3725; var10++) {
                int var11 = this.field3701[var10] * var9 - this.field3709[var10] * var8 >> 16;
                this.field3709[var10] = this.field3709[var10] * var9 + this.field3701[var10] * var8 >> 16;
                this.field3701[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field3714[arg1];
        int var13 = field3678[arg1];
        for (int var14 = 0; var14 < this.field3725; var14++) {
            int var15 = this.field3709[var14] * var12 + this.field3695[var14] * var13 >> 16;
            this.field3709[var14] = this.field3709[var14] * var13 - this.field3695[var14] * var12 >> 16;
            this.field3695[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!n", name = "j", descriptor = "()V", line = 1162)
    public final void method1675() {
        for (int var1 = 0; var1 < this.field3725; var1++) {
            int var2 = this.field3695[var1];
            this.field3695[var1] = this.field3709[var1];
            this.field3709[var1] = -var2;
        }
        this.method1677();
    }

    @OriginalMember(owner = "client!n", name = "k", descriptor = "()V", line = 1177)
    public final void method1676() {
        int var10002;
        if (this.field3690 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3725; var3++) {
                int var4 = this.field3690[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field3707 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field3707[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field3725) {
                int var7 = this.field3690[var6];
                this.field3707[var7][var1[var7]++] = var6++;
            }
            this.field3690 = null;
        }
        if (this.field3689 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3692; var10++) {
            int var11 = this.field3689[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field3680 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field3680[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field3692) {
            int var14 = this.field3689[var13];
            this.field3680[var14][var8[var14]++] = var13++;
        }
        this.field3689 = null;
    }

    @OriginalMember(owner = "client!n", name = "l", descriptor = "()V", line = 1269)
    private final void method1677() {
        this.field3711 = null;
        this.field3712 = null;
        this.field3717 = null;
        this.field3698 = false;
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V", line = 1276)
    public final void method1678(int arg0) {
        int var2 = field3714[arg0];
        int var3 = field3678[arg0];
        for (int var4 = 0; var4 < this.field3725; var4++) {
            int var5 = this.field3709[var4] * var2 + this.field3695[var4] * var3 >> 16;
            this.field3709[var4] = this.field3709[var4] * var3 - this.field3695[var4] * var2 >> 16;
            this.field3695[var4] = var5;
        }
        this.method1677();
    }

    @OriginalMember(owner = "client!n", name = "m", descriptor = "()V", line = 1309)
    public final void method1679() {
        for (int var1 = 0; var1 < this.field3725; var1++) {
            this.field3709[var1] = -this.field3709[var1];
        }
        for (int var2 = 0; var2 < this.field3692; var2++) {
            int var3 = this.field3687[var2];
            this.field3687[var2] = this.field3697[var2];
            this.field3697[var2] = var3;
        }
        this.method1677();
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(SS)V", line = 1334)
    public final void method1680(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3692; var3++) {
            if (this.field3684[var3] == arg0) {
                this.field3684[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II[[I[[IIIIZZ)Ln;", line = 1346)
    public final class233 method1681(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1663();
        int var10 = this.field3703 + arg4;
        int var11 = this.field3722 + arg4;
        int var12 = this.field3682 + arg6;
        int var13 = this.field3702 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class233 var18;
        if (arg7) {
            var18 = new class233();
            var18.field3725 = this.field3725;
            var18.field3692 = this.field3692;
            var18.field3704 = this.field3704;
            var18.field3687 = this.field3687;
            var18.field3720 = this.field3720;
            var18.field3697 = this.field3697;
            var18.field3706 = this.field3706;
            var18.field3677 = this.field3677;
            var18.field3679 = this.field3679;
            var18.field3696 = this.field3696;
            var18.field3684 = this.field3684;
            var18.field3693 = this.field3693;
            var18.field3721 = this.field3721;
            var18.field3699 = this.field3699;
            var18.field3700 = this.field3700;
            var18.field3685 = this.field3685;
            var18.field3694 = this.field3694;
            var18.field3686 = this.field3686;
            var18.field3708 = this.field3708;
            var18.field3688 = this.field3688;
            var18.field3723 = this.field3723;
            var18.field3681 = this.field3681;
            var18.field3715 = this.field3715;
            var18.field3716 = this.field3716;
            var18.field3683 = this.field3683;
            var18.field3690 = this.field3690;
            var18.field3689 = this.field3689;
            var18.field3707 = this.field3707;
            var18.field3680 = this.field3680;
            var18.field3710 = this.field3710;
            var18.field3713 = this.field3713;
            var18.field3711 = this.field3711;
            var18.field3717 = this.field3717;
            var18.field3712 = this.field3712;
            if (arg0 == 3) {
                var18.field3695 = class289.method2014(this.field3695, 2669);
                var18.field3701 = class289.method2014(this.field3701, 2669);
                var18.field3709 = class289.method2014(this.field3709, 2669);
            } else {
                var18.field3695 = this.field3695;
                var18.field3701 = new int[var18.field3725];
                var18.field3709 = this.field3709;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field3725; var19++) {
                int var20 = this.field3695[var19] + arg4;
                int var21 = this.field3709[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field3701[var19] = this.field3701[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field3725; var29++) {
                int var30 = (this.field3701[var29] << 16) / this.field3691;
                if (var30 < arg1) {
                    int var31 = this.field3695[var29] + arg4;
                    int var32 = this.field3709[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field3701[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field3701[var29];
                } else {
                    var18.field3701[var29] = this.field3701[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1659(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field3705 - this.field3691;
            for (int var43 = 0; var43 < this.field3725; var43++) {
                int var44 = this.field3695[var43] + arg4;
                int var45 = this.field3709[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field3701[var43] = var52 + this.field3701[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field3705 - this.field3691;
            for (int var54 = 0; var54 < this.field3725; var54++) {
                int var55 = this.field3695[var54] + arg4;
                int var56 = this.field3709[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field3701[var54] = ((this.field3701[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1677();
        } else {
            this.field3698 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "([B)V", line = 1609)
    private final void method1682(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class112 var4 = new class112(arg0);
        class112 var5 = new class112(arg0);
        class112 var6 = new class112(arg0);
        class112 var7 = new class112(arg0);
        class112 var8 = new class112(arg0);
        var4.field1640 = arg0.length - 18;
        int var9 = var4.method759((byte) -109);
        int var10 = var4.method759((byte) -68);
        int var11 = var4.method792(2);
        int var12 = var4.method792(2);
        int var13 = var4.method792(2);
        int var14 = var4.method792(2);
        int var15 = var4.method792(2);
        int var16 = var4.method792(2);
        int var17 = var4.method759((byte) -73);
        int var18 = var4.method759((byte) -54);
        int var19 = var4.method759((byte) -30);
        int var20 = var4.method759((byte) -82);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field3725 = var9;
        this.field3692 = var10;
        this.field3704 = var11;
        this.field3695 = new int[var9];
        this.field3701 = new int[var9];
        this.field3709 = new int[var9];
        this.field3687 = new int[var10];
        this.field3720 = new int[var10];
        this.field3697 = new int[var10];
        if (var11 > 0) {
            this.field3699 = new byte[var11];
            this.field3700 = new short[var11];
            this.field3685 = new short[var11];
            this.field3694 = new short[var11];
        }
        if (var16 == 1) {
            this.field3690 = new int[var9];
        }
        if (var12 == 1) {
            this.field3706 = new byte[var10];
            this.field3696 = new byte[var10];
            this.field3693 = new short[var10];
        }
        if (var13 == 255) {
            this.field3677 = new byte[var10];
        } else {
            this.field3721 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3679 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3689 = new int[var10];
        }
        this.field3684 = new short[var10];
        var4.field1640 = var21;
        var5.field1640 = var36;
        var6.field1640 = var38;
        var7.field1640 = var40;
        var8.field1640 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method792(2);
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method765(255);
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method765(255);
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method765(255);
            }
            this.field3695[var46] = var43 + var48;
            this.field3701[var46] = var44 + var49;
            this.field3709[var46] = var45 + var50;
            var43 = this.field3695[var46];
            var44 = this.field3701[var46];
            var45 = this.field3709[var46];
            if (var16 == 1) {
                this.field3690[var46] = var8.method792(2);
            }
        }
        var4.field1640 = var32;
        var5.field1640 = var28;
        var6.field1640 = var26;
        var7.field1640 = var30;
        var8.field1640 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field3684[var51] = (short) var4.method759((byte) -68);
            if (var12 == 1) {
                int var52 = var5.method792(2);
                if ((var52 & 0x1) == 1) {
                    this.field3706[var51] = 1;
                    var2 = true;
                } else {
                    this.field3706[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field3696[var51] = (byte) (var52 >> 2);
                    this.field3693[var51] = this.field3684[var51];
                    this.field3684[var51] = 127;
                    if (this.field3693[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field3696[var51] = -1;
                    this.field3693[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field3677[var51] = var6.method785((byte) -93);
            }
            if (var14 == 1) {
                this.field3679[var51] = var7.method785((byte) -95);
            }
            if (var15 == 1) {
                this.field3689[var51] = var8.method792(2);
            }
        }
        var4.field1640 = var25;
        var5.field1640 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method792(2);
            if (var58 == 1) {
                var53 = var4.method765(255) + var56;
                var54 = var4.method765(255) + var53;
                var55 = var4.method765(255) + var54;
                var56 = var55;
                this.field3687[var57] = var53;
                this.field3720[var57] = var54;
                this.field3697[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method765(255) + var56;
                var56 = var55;
                this.field3687[var57] = var53;
                this.field3720[var57] = var54;
                this.field3697[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method765(255) + var56;
                var56 = var55;
                this.field3687[var57] = var53;
                this.field3720[var57] = var54;
                this.field3697[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method765(255) + var56;
                var56 = var55;
                this.field3687[var57] = var53;
                this.field3720[var57] = var61;
                this.field3697[var57] = var55;
            }
        }
        var4.field1640 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field3699[var62] = 0;
            this.field3700[var62] = (short) var4.method759((byte) -124);
            this.field3685[var62] = (short) var4.method759((byte) -76);
            this.field3694[var62] = (short) var4.method759((byte) -82);
        }
        if (this.field3696 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field3696[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field3700[var65] & 0xFFFF) == this.field3687[var64] && (this.field3685[var65] & 0xFFFF) == this.field3720[var64] && (this.field3694[var65] & 0xFFFF) == this.field3697[var64]) {
                        this.field3696[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field3696 = null;
            }
        }
        if (!var3) {
            this.field3693 = null;
        }
        if (!var2) {
            this.field3706 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(III)V", line = 1955)
    public final void method1683(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3725; var4++) {
            this.field3695[var4] += arg0;
            this.field3701[var4] += arg1;
            this.field3709[var4] += arg2;
        }
        this.method1677();
    }
}
