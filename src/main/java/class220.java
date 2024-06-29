import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class220 extends class73 {

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "Z")
    private boolean field3571 = false;

    @OriginalMember(owner = "client!rb", name = "fb", descriptor = "B")
    public byte field3608 = 0;

    @OriginalMember(owner = "client!rb", name = "lb", descriptor = "I")
    public int field3614 = 0;

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "I")
    public int field3606 = 0;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "[I")
    public int[] field3589;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "[I")
    public int[] field3579;

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "[I")
    public int[] field3603;

    @OriginalMember(owner = "client!rb", name = "qb", descriptor = "[I")
    public int[] field3619;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "[I")
    public int[] field3588;

    @OriginalMember(owner = "client!rb", name = "pb", descriptor = "[I")
    public int[] field3618;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "[I")
    public int[] field3575;

    @OriginalMember(owner = "client!rb", name = "ob", descriptor = "[B")
    public byte[] field3617;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "[B")
    public byte[] field3580;

    @OriginalMember(owner = "client!rb", name = "nb", descriptor = "[B")
    public byte[] field3616;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "[S")
    public short[] field3577;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "[S")
    public short[] field3604;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "[B")
    public byte[] field3590;

    @OriginalMember(owner = "client!rb", name = "gb", descriptor = "[I")
    public int[] field3609;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "[B")
    public byte[] field3594;

    @OriginalMember(owner = "client!rb", name = "hb", descriptor = "[S")
    public short[] field3610;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "[S")
    public short[] field3596;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "[S")
    public short[] field3586;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "[S")
    public short[] field3587;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "[S")
    public short[] field3597;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "[S")
    public short[] field3582;

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "[B")
    public byte[] field3600;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "[B")
    public byte[] field3585;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "[B")
    public byte[] field3598;

    @OriginalMember(owner = "client!rb", name = "ib", descriptor = "[B")
    public byte[] field3611;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "[B")
    public byte[] field3592;

    @OriginalMember(owner = "client!rb", name = "kb", descriptor = "I")
    public int field3613;

    @OriginalMember(owner = "client!rb", name = "mb", descriptor = "[S")
    public short[] field3615;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "[S")
    public short[] field3574;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "[[I")
    public int[][] field3569;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "[[I")
    public int[][] field3591;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "[Lll;")
    public class156[] field3595;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "[Lod;")
    public class25[] field3583;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "[Lll;")
    public class156[] field3593;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "S")
    public short field3573;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "S")
    public short field3570;

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "I")
    private static int field3601 = 0;

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "[I")
    private static int[] field3607 = class181.field2884;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "[I")
    private static int[] field3599 = class181.field2886;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "[I")
    private static int[] field3578 = new int[10000];

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "[I")
    private static int[] field3581 = new int[10000];

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "S")
    private short field3572;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "S")
    private short field3576;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "S")
    private short field3584;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "S")
    private short field3602;

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "S")
    private short field3605;

    @OriginalMember(owner = "client!rb", name = "jb", descriptor = "S")
    private short field3612;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "()V", line = 4)
    private final void method1501() {
        if (this.field3571) {
            return;
        }
        this.field3571 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field3606; var7++) {
            int var8 = this.field3589[var7];
            int var9 = this.field3579[var7];
            int var10 = this.field3603[var7];
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
        this.field3605 = (short) var1;
        this.field3612 = (short) var4;
        this.field3584 = (short) var2;
        this.field3572 = (short) var5;
        this.field3576 = (short) var3;
        this.field3602 = (short) var6;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([[III)I", line = 63)
    private static final int method1502(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lv;IIIZ)V", line = 86)
    public final void method494(class73 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class220 var6 = (class220) arg0;
        var6.method1501();
        var6.method1524();
        field3601++;
        int var7 = 0;
        int[] var8 = var6.field3589;
        int var9 = var6.field3606;
        for (int var10 = 0; var10 < this.field3606; var10++) {
            class156 var11 = this.field3595[var10];
            if (var11.field2485 != 0) {
                int var12 = this.field3579[var10] - arg2;
                if (var12 >= var6.field3584 && var12 <= var6.field3572) {
                    int var13 = this.field3589[var10] - arg1;
                    if (var13 >= var6.field3605 && var13 <= var6.field3612) {
                        int var14 = this.field3603[var10] - arg3;
                        if (var14 >= var6.field3576 && var14 <= var6.field3602) {
                            for (int var15 = 0; var15 < var9; var15++) {
                                class156 var16 = var6.field3595[var15];
                                if (var8[var15] == var13 && var6.field3603[var15] == var14 && var6.field3579[var15] == var12 && var16.field2485 != 0) {
                                    if (this.field3593 == null) {
                                        this.field3593 = new class156[this.field3606];
                                    }
                                    if (var6.field3593 == null) {
                                        var6.field3593 = new class156[var9];
                                    }
                                    class156 var17 = this.field3593[var10];
                                    if (var17 == null) {
                                        var17 = this.field3593[var10] = new class156(var11);
                                    }
                                    class156 var18 = var6.field3593[var15];
                                    if (var18 == null) {
                                        var18 = var6.field3593[var15] = new class156(var16);
                                    }
                                    var17.field2481 += var16.field2481;
                                    var17.field2477 += var16.field2477;
                                    var17.field2479 += var16.field2479;
                                    var17.field2485 += var16.field2485;
                                    var18.field2481 += var11.field2481;
                                    var18.field2477 += var11.field2477;
                                    var18.field2479 += var11.field2479;
                                    var18.field2485 += var11.field2485;
                                    var7++;
                                    field3578[var10] = field3601;
                                    field3581[var15] = field3601;
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
        for (int var19 = 0; var19 < this.field3614; var19++) {
            if (field3578[this.field3588[var19]] == field3601 && field3578[this.field3618[var19]] == field3601 && field3578[this.field3575[var19]] == field3601) {
                if (this.field3617 == null) {
                    this.field3617 = new byte[this.field3614];
                }
                this.field3617[var19] = 2;
            }
        }
        for (int var20 = 0; var20 < var6.field3614; var20++) {
            if (field3581[var6.field3588[var20]] == field3601 && field3581[var6.field3618[var20]] == field3601 && field3581[var6.field3575[var20]] == field3601) {
                if (var6.field3617 == null) {
                    var6.field3617 = new byte[var6.field3614];
                }
                var6.field3617[var20] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "()V", line = 205)
    public final void method1503() {
        for (int var1 = 0; var1 < this.field3606; var1++) {
            this.field3603[var1] = -this.field3603[var1];
        }
        for (int var2 = 0; var2 < this.field3614; var2++) {
            int var3 = this.field3588[var2];
            this.field3588[var2] = this.field3575[var2];
            this.field3575[var2] = var3;
        }
        this.method1519();
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(III)V", line = 227)
    public final void method1504(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3606; var4++) {
            this.field3589[var4] += arg0;
            this.field3579[var4] += arg1;
            this.field3603[var4] += arg2;
        }
        this.method1519();
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()Z", line = 240)
    public final boolean method497() {
        return true;
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "()V", line = 245)
    public final void method1505() {
        for (int var1 = 0; var1 < this.field3606; var1++) {
            this.field3589[var1] = -this.field3589[var1];
            this.field3603[var1] = -this.field3603[var1];
        }
        this.method1519();
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 259)
    public final void method1506(int arg0) {
        int var2 = field3607[arg0];
        int var3 = field3599[arg0];
        for (int var4 = 0; var4 < this.field3606; var4++) {
            int var5 = this.field3603[var4] * var2 + this.field3589[var4] * var3 >> 16;
            this.field3603[var4] = this.field3603[var4] * var3 - this.field3589[var4] * var2 >> 16;
            this.field3589[var4] = var5;
        }
        this.method1519();
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(III)V", line = 277)
    public final void method1507(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field3607[arg2];
            int var5 = field3599[arg2];
            for (int var6 = 0; var6 < this.field3606; var6++) {
                int var7 = this.field3589[var6] * var5 + this.field3579[var6] * var4 >> 16;
                this.field3579[var6] = this.field3579[var6] * var5 - this.field3589[var6] * var4 >> 16;
                this.field3589[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field3607[arg0];
            int var9 = field3599[arg0];
            for (int var10 = 0; var10 < this.field3606; var10++) {
                int var11 = this.field3579[var10] * var9 - this.field3603[var10] * var8 >> 16;
                this.field3603[var10] = this.field3603[var10] * var9 + this.field3579[var10] * var8 >> 16;
                this.field3579[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field3607[arg1];
        int var13 = field3599[arg1];
        for (int var14 = 0; var14 < this.field3606; var14++) {
            int var15 = this.field3603[var14] * var12 + this.field3589[var14] * var13 >> 16;
            this.field3603[var14] = this.field3603[var14] * var13 - this.field3589[var14] * var12 >> 16;
            this.field3589[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(III)V", line = 342)
    public final void method1508(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3606; var4++) {
            this.field3589[var4] = this.field3589[var4] * arg0 / 128;
            this.field3579[var4] = this.field3579[var4] * arg1 / 128;
            this.field3603[var4] = this.field3603[var4] * arg2 / 128;
        }
        this.method1519();
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIIIJILmf;)V", line = 362)
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class47 arg10) {
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V", line = 2012)
    private class220() {
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([B)V", line = 2014)
    private class220(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1525(arg0);
        } else {
            this.method1528(arg0);
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(III)V", line = 2021)
    public class220(int arg0, int arg1, int arg2) {
        this.field3589 = new int[arg0];
        this.field3579 = new int[arg0];
        this.field3603 = new int[arg0];
        this.field3619 = new int[arg0];
        this.field3588 = new int[arg1];
        this.field3618 = new int[arg1];
        this.field3575 = new int[arg1];
        this.field3617 = new byte[arg1];
        this.field3580 = new byte[arg1];
        this.field3616 = new byte[arg1];
        this.field3577 = new short[arg1];
        this.field3604 = new short[arg1];
        this.field3590 = new byte[arg1];
        this.field3609 = new int[arg1];
        if (arg2 > 0) {
            this.field3594 = new byte[arg2];
            this.field3610 = new short[arg2];
            this.field3596 = new short[arg2];
            this.field3586 = new short[arg2];
            this.field3587 = new short[arg2];
            this.field3597 = new short[arg2];
            this.field3582 = new short[arg2];
            this.field3600 = new byte[arg2];
            this.field3585 = new byte[arg2];
            this.field3598 = new byte[arg2];
            this.field3611 = new byte[arg2];
            this.field3592 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([Lrb;I)V", line = 2054)
    public class220(class220[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field3606 = 0;
        this.field3614 = 0;
        this.field3613 = 0;
        byte var9 = 0;
        byte var10 = 0;
        this.field3608 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class220 var12 = arg0[var11];
            if (var12 != null) {
                this.field3606 += var12.field3606;
                this.field3614 += var12.field3614;
                this.field3613 += var12.field3613;
                if (var12.field3580 == null) {
                    if (this.field3608 == -1) {
                        this.field3608 = var12.field3608;
                    }
                    if (this.field3608 != var12.field3608) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var12.field3617 != null;
                var5 |= var12.field3616 != null;
                var6 |= var12.field3609 != null;
                var7 |= var12.field3604 != null;
                var8 |= var12.field3590 != null;
            }
        }
        this.field3589 = new int[this.field3606];
        this.field3579 = new int[this.field3606];
        this.field3603 = new int[this.field3606];
        this.field3619 = new int[this.field3606];
        this.field3615 = new short[this.field3606];
        this.field3588 = new int[this.field3614];
        this.field3618 = new int[this.field3614];
        this.field3575 = new int[this.field3614];
        if (var3) {
            this.field3617 = new byte[this.field3614];
        }
        if (var4) {
            this.field3580 = new byte[this.field3614];
        }
        if (var5) {
            this.field3616 = new byte[this.field3614];
        }
        if (var6) {
            this.field3609 = new int[this.field3614];
        }
        if (var7) {
            this.field3604 = new short[this.field3614];
        }
        if (var8) {
            this.field3590 = new byte[this.field3614];
        }
        if (var9 > 0) {
        }
        if (var10 > 0) {
        }
        this.field3577 = new short[this.field3614];
        this.field3574 = new short[this.field3614];
        if (this.field3613 > 0) {
            this.field3594 = new byte[this.field3613];
            this.field3610 = new short[this.field3613];
            this.field3596 = new short[this.field3613];
            this.field3586 = new short[this.field3613];
            this.field3587 = new short[this.field3613];
            this.field3597 = new short[this.field3613];
            this.field3582 = new short[this.field3613];
            this.field3600 = new byte[this.field3613];
            this.field3585 = new byte[this.field3613];
            this.field3598 = new byte[this.field3613];
            this.field3611 = new byte[this.field3613];
            this.field3592 = new byte[this.field3613];
        }
        this.field3606 = 0;
        this.field3614 = 0;
        this.field3613 = 0;
        boolean var13 = false;
        boolean var14 = false;
        for (int var15 = 0; var15 < arg1; var15++) {
            short var16 = (short) (0x1 << var15);
            class220 var17 = arg0[var15];
            if (var17 != null) {
                for (int var18 = 0; var18 < var17.field3614; var18++) {
                    if (var3 && var17.field3617 != null) {
                        this.field3617[this.field3614] = var17.field3617[var18];
                    }
                    if (var4) {
                        if (var17.field3580 == null) {
                            this.field3580[this.field3614] = var17.field3608;
                        } else {
                            this.field3580[this.field3614] = var17.field3580[var18];
                        }
                    }
                    if (var5 && var17.field3616 != null) {
                        this.field3616[this.field3614] = var17.field3616[var18];
                    }
                    if (var6 && var17.field3609 != null) {
                        this.field3609[this.field3614] = var17.field3609[var18];
                    }
                    if (var7) {
                        if (var17.field3604 == null) {
                            this.field3604[this.field3614] = -1;
                        } else {
                            this.field3604[this.field3614] = var17.field3604[var18];
                        }
                    }
                    if (var8) {
                        if (var17.field3590 == null || var17.field3590[var18] == -1) {
                            this.field3590[this.field3614] = -1;
                        } else {
                            this.field3590[this.field3614] = (byte) (var17.field3590[var18] + this.field3613);
                        }
                    }
                    this.field3577[this.field3614] = var17.field3577[var18];
                    this.field3574[this.field3614] = var16;
                    this.field3588[this.field3614] = this.method1529(var17, var17.field3588[var18], var16);
                    this.field3618[this.field3614] = this.method1529(var17, var17.field3618[var18], var16);
                    this.field3575[this.field3614] = this.method1529(var17, var17.field3575[var18], var16);
                    this.field3614++;
                }
                for (int var19 = 0; var19 < var17.field3613; var19++) {
                    byte var20 = this.field3594[this.field3613] = var17.field3594[var19];
                    if (var20 == 0) {
                        this.field3610[this.field3613] = (short) this.method1529(var17, var17.field3610[var19], var16);
                        this.field3596[this.field3613] = (short) this.method1529(var17, var17.field3596[var19], var16);
                        this.field3586[this.field3613] = (short) this.method1529(var17, var17.field3586[var19], var16);
                    }
                    if (var20 >= 1 && var20 <= 3) {
                        this.field3610[this.field3613] = var17.field3610[var19];
                        this.field3596[this.field3613] = var17.field3596[var19];
                        this.field3586[this.field3613] = var17.field3586[var19];
                        this.field3587[this.field3613] = var17.field3587[var19];
                        this.field3597[this.field3613] = var17.field3597[var19];
                        this.field3582[this.field3613] = var17.field3582[var19];
                        this.field3600[this.field3613] = var17.field3600[var19];
                        this.field3585[this.field3613] = var17.field3585[var19];
                        this.field3598[this.field3613] = var17.field3598[var19];
                    }
                    if (var20 == 2) {
                        this.field3611[this.field3613] = var17.field3611[var19];
                        this.field3592[this.field3613] = var17.field3592[var19];
                    }
                    this.field3613++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lrb;ZZZZ)V", line = 2286)
    public class220(class220 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field3606 = arg0.field3606;
        this.field3614 = arg0.field3614;
        this.field3613 = arg0.field3613;
        if (arg1) {
            this.field3589 = arg0.field3589;
            this.field3579 = arg0.field3579;
            this.field3603 = arg0.field3603;
        } else {
            this.field3589 = new int[this.field3606];
            this.field3579 = new int[this.field3606];
            this.field3603 = new int[this.field3606];
            for (int var6 = 0; var6 < this.field3606; var6++) {
                this.field3589[var6] = arg0.field3589[var6];
                this.field3579[var6] = arg0.field3579[var6];
                this.field3603[var6] = arg0.field3603[var6];
            }
        }
        if (arg2) {
            this.field3577 = arg0.field3577;
        } else {
            this.field3577 = new short[this.field3614];
            for (int var7 = 0; var7 < this.field3614; var7++) {
                this.field3577[var7] = arg0.field3577[var7];
            }
        }
        if (arg3 || arg0.field3604 == null) {
            this.field3604 = arg0.field3604;
        } else {
            this.field3604 = new short[this.field3614];
            for (int var8 = 0; var8 < this.field3614; var8++) {
                this.field3604[var8] = arg0.field3604[var8];
            }
        }
        if (arg4) {
            this.field3616 = arg0.field3616;
        } else {
            this.field3616 = new byte[this.field3614];
            if (arg0.field3616 == null) {
                for (int var9 = 0; var9 < this.field3614; var9++) {
                    this.field3616[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field3614; var10++) {
                    this.field3616[var10] = arg0.field3616[var10];
                }
            }
        }
        this.field3588 = arg0.field3588;
        this.field3618 = arg0.field3618;
        this.field3575 = arg0.field3575;
        this.field3617 = arg0.field3617;
        this.field3580 = arg0.field3580;
        this.field3590 = arg0.field3590;
        this.field3608 = arg0.field3608;
        this.field3594 = arg0.field3594;
        this.field3610 = arg0.field3610;
        this.field3596 = arg0.field3596;
        this.field3586 = arg0.field3586;
        this.field3587 = arg0.field3587;
        this.field3597 = arg0.field3597;
        this.field3582 = arg0.field3582;
        this.field3600 = arg0.field3600;
        this.field3585 = arg0.field3585;
        this.field3598 = arg0.field3598;
        this.field3611 = arg0.field3611;
        this.field3592 = arg0.field3592;
        this.field3619 = arg0.field3619;
        this.field3609 = arg0.field3609;
        this.field3569 = arg0.field3569;
        this.field3591 = arg0.field3591;
        this.field3595 = arg0.field3595;
        this.field3583 = arg0.field3583;
        this.field3593 = arg0.field3593;
        this.field3573 = arg0.field3573;
        this.field3570 = arg0.field3570;
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "()V", line = 370)
    public final void method1509() {
        for (int var1 = 0; var1 < this.field3606; var1++) {
            int var2 = this.field3603[var1];
            this.field3603[var1] = this.field3589[var1];
            this.field3589[var1] = -var2;
        }
        this.method1519();
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(SS)V", line = 387)
    public final void method1510(short arg0, short arg1) {
        if (this.field3604 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3614; var3++) {
            if (this.field3604[var3] == arg0) {
                this.field3604[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(SS)V", line = 405)
    public final void method1511(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3614; var3++) {
            if (this.field3577[var3] == arg0) {
                this.field3577[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V", line = 418)
    private final void method1512(int arg0) {
        int var2 = field3607[arg0];
        int var3 = field3599[arg0];
        for (int var4 = 0; var4 < this.field3606; var4++) {
            int var5 = this.field3589[var4] * var3 + this.field3579[var4] * var2 >> 16;
            this.field3579[var4] = this.field3579[var4] * var3 - this.field3589[var4] * var2 >> 16;
            this.field3589[var4] = var5;
        }
        this.method1519();
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(IIIII)Lub;", line = 439)
    public final class21 method1513(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class21(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lah;II)Lrb;", line = 449)
    public static final class220 method1514(class205 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1381(arg1, arg2, 0);
        return var3 == null ? null : new class220(var3);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIBSB)I", line = 457)
    public final int method1515(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field3588[this.field3614] = arg0;
        this.field3618[this.field3614] = arg1;
        this.field3575[this.field3614] = arg2;
        this.field3617[this.field3614] = arg3;
        this.field3590[this.field3614] = -1;
        this.field3577[this.field3614] = arg4;
        this.field3604[this.field3614] = -1;
        this.field3616[this.field3614] = arg5;
        return this.field3614++;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V", line = 469)
    private final void method1516(int arg0) {
        int var2 = field3607[arg0];
        int var3 = field3599[arg0];
        for (int var4 = 0; var4 < this.field3606; var4++) {
            int var5 = this.field3579[var4] * var3 - this.field3603[var4] * var2 >> 16;
            this.field3603[var4] = this.field3603[var4] * var3 + this.field3579[var4] * var2 >> 16;
            this.field3579[var4] = var5;
        }
        this.method1519();
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)Lv;", line = 488)
    public final class73 method495(int arg0, int arg1, int arg2) {
        return this.method1521(this.field3573, this.field3570, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "()Lrb;", line = 507)
    public final class220 method1517() {
        class220 var1 = new class220();
        if (this.field3617 != null) {
            var1.field3617 = new byte[this.field3614];
            for (int var2 = 0; var2 < this.field3614; var2++) {
                var1.field3617[var2] = this.field3617[var2];
            }
        }
        var1.field3606 = this.field3606;
        var1.field3614 = this.field3614;
        var1.field3613 = this.field3613;
        var1.field3589 = this.field3589;
        var1.field3579 = this.field3579;
        var1.field3603 = this.field3603;
        var1.field3588 = this.field3588;
        var1.field3618 = this.field3618;
        var1.field3575 = this.field3575;
        var1.field3580 = this.field3580;
        var1.field3616 = this.field3616;
        var1.field3590 = this.field3590;
        var1.field3577 = this.field3577;
        var1.field3604 = this.field3604;
        var1.field3608 = this.field3608;
        var1.field3594 = this.field3594;
        var1.field3610 = this.field3610;
        var1.field3596 = this.field3596;
        var1.field3586 = this.field3586;
        var1.field3587 = this.field3587;
        var1.field3597 = this.field3597;
        var1.field3582 = this.field3582;
        var1.field3600 = this.field3600;
        var1.field3585 = this.field3585;
        var1.field3598 = this.field3598;
        var1.field3611 = this.field3611;
        var1.field3592 = this.field3592;
        var1.field3619 = this.field3619;
        var1.field3609 = this.field3609;
        var1.field3569 = this.field3569;
        var1.field3591 = this.field3591;
        var1.field3595 = this.field3595;
        var1.field3583 = this.field3583;
        var1.field3573 = this.field3573;
        var1.field3570 = this.field3570;
        return var1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([[IIIIII)V", line = 566)
    private final void method1518(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1502(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1502(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1502(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1502(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1516(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1512(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1504(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "()V", line = 629)
    private final void method1519() {
        this.field3595 = null;
        this.field3593 = null;
        this.field3583 = null;
        this.field3571 = false;
    }

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "()V", line = 636)
    public final void method1520() {
        this.field3619 = null;
        this.field3609 = null;
        this.field3569 = (int[][]) null;
        this.field3591 = (int[][]) null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII)V", line = 646)
    public final void method20(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(IIIII)Lw;", line = 651)
    public final class271 method1521(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class217.field3516) {
            class319 var6 = new class319(this, arg0, arg1, true);
            var6.method2235();
            return var6;
        } else {
            return new class21(this, arg0, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "()V", line = 666)
    public static void method1522() {
        field3578 = null;
        field3581 = null;
        field3607 = null;
        field3599 = null;
    }

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "()V", line = 683)
    public final void method1523() {
        int var10002;
        if (this.field3619 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3606; var3++) {
                int var4 = this.field3619[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field3569 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field3569[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field3606) {
                int var7 = this.field3619[var6];
                this.field3569[var7][var1[var7]++] = var6++;
            }
            this.field3619 = null;
        }
        if (this.field3609 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3614; var10++) {
            int var11 = this.field3609[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field3591 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field3591[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field3614) {
            int var14 = this.field3609[var13];
            this.field3591[var14][var8[var14]++] = var13++;
        }
        this.field3609 = null;
    }

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "()V", line = 775)
    public final void method1524() {
        if (this.field3595 != null) {
            return;
        }
        this.field3595 = new class156[this.field3606];
        for (int var1 = 0; var1 < this.field3606; var1++) {
            this.field3595[var1] = new class156();
        }
        for (int var2 = 0; var2 < this.field3614; var2++) {
            int var3 = this.field3588[var2];
            int var4 = this.field3618[var2];
            int var5 = this.field3575[var2];
            int var6 = this.field3589[var4] - this.field3589[var3];
            int var7 = this.field3579[var4] - this.field3579[var3];
            int var8 = this.field3603[var4] - this.field3603[var3];
            int var9 = this.field3589[var5] - this.field3589[var3];
            int var10 = this.field3579[var5] - this.field3579[var3];
            int var11 = this.field3603[var5] - this.field3603[var3];
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
            if (this.field3617 == null) {
                var19 = 0;
            } else {
                var19 = this.field3617[var2];
            }
            if (var19 == 0) {
                class156 var20 = this.field3595[var3];
                var20.field2481 += var16;
                var20.field2477 += var17;
                var20.field2479 += var18;
                var20.field2485++;
                class156 var21 = this.field3595[var4];
                var21.field2481 += var16;
                var21.field2477 += var17;
                var21.field2479 += var18;
                var21.field2485++;
                class156 var22 = this.field3595[var5];
                var22.field2481 += var16;
                var22.field2477 += var17;
                var22.field2479 += var18;
                var22.field2485++;
            } else if (var19 == 1) {
                if (this.field3583 == null) {
                    this.field3583 = new class25[this.field3614];
                }
                class25 var23 = this.field3583[var2] = new class25();
                var23.field428 = var16;
                var23.field431 = var17;
                var23.field429 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([B)V", line = 880)
    private final void method1525(byte[] arg0) {
        class291 var2 = new class291(arg0);
        class291 var3 = new class291(arg0);
        class291 var4 = new class291(arg0);
        class291 var5 = new class291(arg0);
        class291 var6 = new class291(arg0);
        class291 var7 = new class291(arg0);
        class291 var8 = new class291(arg0);
        var2.field4946 = arg0.length - 23;
        int var9 = var2.method2021((byte) 74);
        int var10 = var2.method2021((byte) 74);
        int var11 = var2.method2011(-93);
        int var12 = var2.method2011(-26);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method2011(-16);
        int var16 = var2.method2011(-95);
        int var17 = var2.method2011(-91);
        int var18 = var2.method2011(-67);
        int var19 = var2.method2011(-48);
        int var20 = var2.method2021((byte) 74);
        int var21 = var2.method2021((byte) 74);
        int var22 = var2.method2021((byte) 74);
        int var23 = var2.method2021((byte) 74);
        int var24 = var2.method2021((byte) 74);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field3594 = new byte[var11];
            var2.field4946 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field3594[var28] = var2.method1962(false);
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 2) {
                    var27++;
                }
            }
        }
        int var32 = var9 + var11;
        int var33 = var32;
        if (var13) {
            var32 += var10;
        }
        int var35 = var10 + var32;
        int var36 = var35;
        if (var15 == 255) {
            var35 += var10;
        }
        int var37 = var35;
        if (var17 == 1) {
            var35 += var10;
        }
        int var38 = var35;
        if (var19 == 1) {
            var35 += var9;
        }
        int var39 = var35;
        if (var16 == 1) {
            var35 += var10;
        }
        int var41 = var23 + var35;
        int var42 = var41;
        if (var18 == 1) {
            var41 += var10 * 2;
        }
        int var44 = var24 + var41;
        int var46 = var10 * 2 + var44;
        int var48 = var20 + var46;
        int var50 = var21 + var48;
        int var52 = var22 + var50;
        int var54 = var25 * 6 + var52;
        int var56 = var26 * 6 + var54;
        int var58 = var26 * 6 + var56;
        int var60 = var26 + var58;
        int var62 = var26 + var60;
        int var64 = var27 * 2 + var26 + var62;
        this.field3606 = var9;
        this.field3614 = var10;
        this.field3613 = var11;
        this.field3589 = new int[var9];
        this.field3579 = new int[var9];
        this.field3603 = new int[var9];
        this.field3588 = new int[var10];
        this.field3618 = new int[var10];
        this.field3575 = new int[var10];
        if (var19 == 1) {
            this.field3619 = new int[var9];
        }
        if (var13) {
            this.field3617 = new byte[var10];
        }
        if (var15 == 255) {
            this.field3580 = new byte[var10];
        } else {
            this.field3608 = (byte) var15;
        }
        if (var16 == 1) {
            this.field3616 = new byte[var10];
        }
        if (var17 == 1) {
            this.field3609 = new int[var10];
        }
        if (var18 == 1) {
            this.field3604 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field3590 = new byte[var10];
        }
        this.field3577 = new short[var10];
        if (var11 > 0) {
            this.field3610 = new short[var11];
            this.field3596 = new short[var11];
            this.field3586 = new short[var11];
            if (var26 > 0) {
                this.field3587 = new short[var26];
                this.field3597 = new short[var26];
                this.field3582 = new short[var26];
                this.field3600 = new byte[var26];
                this.field3585 = new byte[var26];
                this.field3598 = new byte[var26];
            }
            if (var27 > 0) {
                this.field3611 = new byte[var27];
                this.field3592 = new byte[var27];
            }
        }
        var2.field4946 = var11;
        var3.field4946 = var46;
        var4.field4946 = var48;
        var5.field4946 = var50;
        var6.field4946 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var70 = var2.method2011(-100);
            int var71 = 0;
            if ((var70 & 0x1) != 0) {
                var71 = var3.method1961((byte) -111);
            }
            int var72 = 0;
            if ((var70 & 0x2) != 0) {
                var72 = var4.method1961((byte) 78);
            }
            int var73 = 0;
            if ((var70 & 0x4) != 0) {
                var73 = var5.method1961((byte) 80);
            }
            this.field3589[var69] = var66 + var71;
            this.field3579[var69] = var67 + var72;
            this.field3603[var69] = var68 + var73;
            var66 = this.field3589[var69];
            var67 = this.field3579[var69];
            var68 = this.field3603[var69];
            if (var19 == 1) {
                this.field3619[var69] = var6.method2011(-54);
            }
        }
        var2.field4946 = var44;
        var3.field4946 = var33;
        var4.field4946 = var36;
        var5.field4946 = var39;
        var6.field4946 = var37;
        var7.field4946 = var42;
        var8.field4946 = var41;
        for (int var74 = 0; var74 < var10; var74++) {
            this.field3577[var74] = (short) var2.method2021((byte) 74);
            if (var13) {
                this.field3617[var74] = var3.method1962(false);
            }
            if (var15 == 255) {
                this.field3580[var74] = var4.method1962(false);
            }
            if (var16 == 1) {
                this.field3616[var74] = var5.method1962(false);
            }
            if (var17 == 1) {
                this.field3609[var74] = var6.method2011(-96);
            }
            if (var18 == 1) {
                this.field3604[var74] = (short) (var7.method2021((byte) 74) - 1);
            }
            if (this.field3590 != null) {
                if (this.field3604[var74] == -1) {
                    this.field3590[var74] = -1;
                } else {
                    this.field3590[var74] = (byte) (var8.method2011(-79) - 1);
                }
            }
        }
        var2.field4946 = var35;
        var3.field4946 = var32;
        int var75 = 0;
        int var76 = 0;
        int var77 = 0;
        int var78 = 0;
        for (int var79 = 0; var79 < var10; var79++) {
            int var80 = var3.method2011(-124);
            if (var80 == 1) {
                var75 = var2.method1961((byte) -121) + var78;
                var76 = var2.method1961((byte) -78) + var75;
                var77 = var2.method1961((byte) 114) + var76;
                var78 = var77;
                this.field3588[var79] = var75;
                this.field3618[var79] = var76;
                this.field3575[var79] = var77;
            }
            if (var80 == 2) {
                var76 = var77;
                var77 = var2.method1961((byte) 99) + var78;
                var78 = var77;
                this.field3588[var79] = var75;
                this.field3618[var79] = var76;
                this.field3575[var79] = var77;
            }
            if (var80 == 3) {
                var75 = var77;
                var77 = var2.method1961((byte) -123) + var78;
                var78 = var77;
                this.field3588[var79] = var75;
                this.field3618[var79] = var76;
                this.field3575[var79] = var77;
            }
            if (var80 == 4) {
                int var83 = var75;
                var75 = var76;
                var76 = var83;
                var77 = var2.method1961((byte) 79) + var78;
                var78 = var77;
                this.field3588[var79] = var75;
                this.field3618[var79] = var83;
                this.field3575[var79] = var77;
            }
        }
        var2.field4946 = var52;
        var3.field4946 = var54;
        var4.field4946 = var56;
        var5.field4946 = var58;
        var6.field4946 = var60;
        var7.field4946 = var62;
        for (int var84 = 0; var84 < var11; var84++) {
            int var85 = this.field3594[var84] & 0xFF;
            if (var85 == 0) {
                this.field3610[var84] = (short) var2.method2021((byte) 74);
                this.field3596[var84] = (short) var2.method2021((byte) 74);
                this.field3586[var84] = (short) var2.method2021((byte) 74);
            }
            if (var85 == 1) {
                this.field3610[var84] = (short) var3.method2021((byte) 74);
                this.field3596[var84] = (short) var3.method2021((byte) 74);
                this.field3586[var84] = (short) var3.method2021((byte) 74);
                this.field3587[var84] = (short) var4.method2021((byte) 74);
                this.field3597[var84] = (short) var4.method2021((byte) 74);
                this.field3582[var84] = (short) var4.method2021((byte) 74);
                this.field3600[var84] = var5.method1962(false);
                this.field3585[var84] = var6.method1962(false);
                this.field3598[var84] = var7.method1962(false);
            }
            if (var85 == 2) {
                this.field3610[var84] = (short) var3.method2021((byte) 74);
                this.field3596[var84] = (short) var3.method2021((byte) 74);
                this.field3586[var84] = (short) var3.method2021((byte) 74);
                this.field3587[var84] = (short) var4.method2021((byte) 74);
                this.field3597[var84] = (short) var4.method2021((byte) 74);
                this.field3582[var84] = (short) var4.method2021((byte) 74);
                this.field3600[var84] = var5.method1962(false);
                this.field3585[var84] = var6.method1962(false);
                this.field3598[var84] = var7.method1962(false);
                this.field3611[var84] = var7.method1962(false);
                this.field3592[var84] = var7.method1962(false);
            }
            if (var85 == 3) {
                this.field3610[var84] = (short) var3.method2021((byte) 74);
                this.field3596[var84] = (short) var3.method2021((byte) 74);
                this.field3586[var84] = (short) var3.method2021((byte) 74);
                this.field3587[var84] = (short) var4.method2021((byte) 74);
                this.field3597[var84] = (short) var4.method2021((byte) 74);
                this.field3582[var84] = (short) var4.method2021((byte) 74);
                this.field3600[var84] = var5.method1962(false);
                this.field3585[var84] = var6.method1962(false);
                this.field3598[var84] = var7.method1962(false);
            }
        }
        if (!var14) {
            return;
        }
        var2.field4946 = var64;
        int var86 = var2.method2011(-96);
        if (var86 > 0) {
            var2.field4946 += var86 * 4;
        }
        int var87 = var2.method2011(-96);
        if (var87 > 0) {
            var2.field4946 += var87 * 4;
        }
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(III)I", line = 1332)
    public final int method1526(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3606; var4++) {
            if (this.field3589[var4] == arg0 && this.field3579[var4] == arg1 && this.field3603[var4] == arg2) {
                return var4;
            }
        }
        this.field3589[this.field3606] = arg0;
        this.field3579[this.field3606] = arg1;
        this.field3603[this.field3606] = arg2;
        return this.field3606++;
    }

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "()V", line = 1351)
    public final void method1527() {
        for (int var1 = 0; var1 < this.field3606; var1++) {
            int var2 = this.field3589[var1];
            this.field3589[var1] = this.field3603[var1];
            this.field3603[var1] = -var2;
        }
        this.method1519();
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "([B)V", line = 1365)
    private final void method1528(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class291 var4 = new class291(arg0);
        class291 var5 = new class291(arg0);
        class291 var6 = new class291(arg0);
        class291 var7 = new class291(arg0);
        class291 var8 = new class291(arg0);
        var4.field4946 = arg0.length - 18;
        int var9 = var4.method2021((byte) 74);
        int var10 = var4.method2021((byte) 74);
        int var11 = var4.method2011(-44);
        int var12 = var4.method2011(-127);
        int var13 = var4.method2011(-84);
        int var14 = var4.method2011(-97);
        int var15 = var4.method2011(-33);
        int var16 = var4.method2011(-128);
        int var17 = var4.method2021((byte) 74);
        int var18 = var4.method2021((byte) 74);
        int var19 = var4.method2021((byte) 74);
        int var20 = var4.method2021((byte) 74);
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
        this.field3606 = var9;
        this.field3614 = var10;
        this.field3613 = var11;
        this.field3589 = new int[var9];
        this.field3579 = new int[var9];
        this.field3603 = new int[var9];
        this.field3588 = new int[var10];
        this.field3618 = new int[var10];
        this.field3575 = new int[var10];
        if (var11 > 0) {
            this.field3594 = new byte[var11];
            this.field3610 = new short[var11];
            this.field3596 = new short[var11];
            this.field3586 = new short[var11];
        }
        if (var16 == 1) {
            this.field3619 = new int[var9];
        }
        if (var12 == 1) {
            this.field3617 = new byte[var10];
            this.field3590 = new byte[var10];
            this.field3604 = new short[var10];
        }
        if (var13 == 255) {
            this.field3580 = new byte[var10];
        } else {
            this.field3608 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3616 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3609 = new int[var10];
        }
        this.field3577 = new short[var10];
        var4.field4946 = var21;
        var5.field4946 = var36;
        var6.field4946 = var38;
        var7.field4946 = var40;
        var8.field4946 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2011(-107);
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method1961((byte) 81);
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method1961((byte) -96);
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method1961((byte) -123);
            }
            this.field3589[var46] = var43 + var48;
            this.field3579[var46] = var44 + var49;
            this.field3603[var46] = var45 + var50;
            var43 = this.field3589[var46];
            var44 = this.field3579[var46];
            var45 = this.field3603[var46];
            if (var16 == 1) {
                this.field3619[var46] = var8.method2011(-90);
            }
        }
        var4.field4946 = var32;
        var5.field4946 = var28;
        var6.field4946 = var26;
        var7.field4946 = var30;
        var8.field4946 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field3577[var51] = (short) var4.method2021((byte) 74);
            if (var12 == 1) {
                int var52 = var5.method2011(-54);
                if ((var52 & 0x1) == 1) {
                    this.field3617[var51] = 1;
                    var2 = true;
                } else {
                    this.field3617[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field3590[var51] = (byte) (var52 >> 2);
                    this.field3604[var51] = this.field3577[var51];
                    this.field3577[var51] = 127;
                    if (this.field3604[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field3590[var51] = -1;
                    this.field3604[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field3580[var51] = var6.method1962(false);
            }
            if (var14 == 1) {
                this.field3616[var51] = var7.method1962(false);
            }
            if (var15 == 1) {
                this.field3609[var51] = var8.method2011(-94);
            }
        }
        var4.field4946 = var25;
        var5.field4946 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2011(-18);
            if (var58 == 1) {
                var53 = var4.method1961((byte) -83) + var56;
                var54 = var4.method1961((byte) -77) + var53;
                var55 = var4.method1961((byte) -118) + var54;
                var56 = var55;
                this.field3588[var57] = var53;
                this.field3618[var57] = var54;
                this.field3575[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method1961((byte) -103) + var56;
                var56 = var55;
                this.field3588[var57] = var53;
                this.field3618[var57] = var54;
                this.field3575[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method1961((byte) -94) + var56;
                var56 = var55;
                this.field3588[var57] = var53;
                this.field3618[var57] = var54;
                this.field3575[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method1961((byte) -117) + var56;
                var56 = var55;
                this.field3588[var57] = var53;
                this.field3618[var57] = var61;
                this.field3575[var57] = var55;
            }
        }
        var4.field4946 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field3594[var62] = 0;
            this.field3610[var62] = (short) var4.method2021((byte) 74);
            this.field3596[var62] = (short) var4.method2021((byte) 74);
            this.field3586[var62] = (short) var4.method2021((byte) 74);
        }
        if (this.field3590 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field3590[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field3610[var65] & 0xFFFF) == this.field3588[var64] && (this.field3596[var65] & 0xFFFF) == this.field3618[var64] && (this.field3586[var65] & 0xFFFF) == this.field3575[var64]) {
                        this.field3590[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field3590 = null;
            }
        }
        if (!var3) {
            this.field3604 = null;
        }
        if (!var2) {
            this.field3617 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lrb;IS)I", line = 1708)
    private final int method1529(class220 arg0, int arg1, short arg2) {
        int var4 = arg0.field3589[arg1];
        int var5 = arg0.field3579[arg1];
        int var6 = arg0.field3603[arg1];
        for (int var7 = 0; var7 < this.field3606; var7++) {
            if (this.field3589[var7] == var4 && this.field3579[var7] == var5 && this.field3603[var7] == var6) {
                this.field3615[var7] |= arg2;
                return var7;
            }
        }
        this.field3589[this.field3606] = var4;
        this.field3579[this.field3606] = var5;
        this.field3603[this.field3606] = var6;
        this.field3615[this.field3606] = arg2;
        if (arg0.field3619 != null) {
            this.field3619[this.field3606] = arg0.field3619[arg1];
        }
        return this.field3606++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[[I[[IIIIZZ)Lrb;", line = 1737)
    public final class220 method1530(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1501();
        int var10 = this.field3605 + arg4;
        int var11 = this.field3612 + arg4;
        int var12 = this.field3576 + arg6;
        int var13 = this.field3602 + arg6;
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
        class220 var18;
        if (arg7) {
            var18 = new class220();
            var18.field3606 = this.field3606;
            var18.field3614 = this.field3614;
            var18.field3613 = this.field3613;
            var18.field3588 = this.field3588;
            var18.field3618 = this.field3618;
            var18.field3575 = this.field3575;
            var18.field3617 = this.field3617;
            var18.field3580 = this.field3580;
            var18.field3616 = this.field3616;
            var18.field3590 = this.field3590;
            var18.field3577 = this.field3577;
            var18.field3604 = this.field3604;
            var18.field3608 = this.field3608;
            var18.field3594 = this.field3594;
            var18.field3610 = this.field3610;
            var18.field3596 = this.field3596;
            var18.field3586 = this.field3586;
            var18.field3587 = this.field3587;
            var18.field3597 = this.field3597;
            var18.field3582 = this.field3582;
            var18.field3600 = this.field3600;
            var18.field3585 = this.field3585;
            var18.field3598 = this.field3598;
            var18.field3611 = this.field3611;
            var18.field3592 = this.field3592;
            var18.field3619 = this.field3619;
            var18.field3609 = this.field3609;
            var18.field3569 = this.field3569;
            var18.field3591 = this.field3591;
            var18.field3573 = this.field3573;
            var18.field3570 = this.field3570;
            var18.field3595 = this.field3595;
            var18.field3583 = this.field3583;
            var18.field3593 = this.field3593;
            if (arg0 == 3) {
                var18.field3589 = class310.method2151(this.field3589, (byte) 122);
                var18.field3579 = class310.method2151(this.field3579, (byte) 104);
                var18.field3603 = class310.method2151(this.field3603, (byte) -2);
            } else {
                var18.field3589 = this.field3589;
                var18.field3579 = new int[var18.field3606];
                var18.field3603 = this.field3603;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field3606; var19++) {
                int var20 = this.field3589[var19] + arg4;
                int var21 = this.field3603[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field3579[var19] = this.field3579[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field3606; var29++) {
                int var30 = (this.field3579[var29] << 16) / this.field3584;
                if (var30 < arg1) {
                    int var31 = this.field3589[var29] + arg4;
                    int var32 = this.field3603[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field3579[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field3579[var29];
                } else {
                    var18.field3579[var29] = this.field3579[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1518(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field3572 - this.field3584;
            for (int var43 = 0; var43 < this.field3606; var43++) {
                int var44 = this.field3589[var43] + arg4;
                int var45 = this.field3603[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field3579[var43] = var52 + this.field3579[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field3572 - this.field3584;
            for (int var54 = 0; var54 < this.field3606; var54++) {
                int var55 = this.field3589[var54] + arg4;
                int var56 = this.field3603[var54] + arg6;
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
                var18.field3579[var54] = ((this.field3579[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1519();
        } else {
            this.field3571 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "()I", line = 2000)
    public final int method22() {
        if (!this.field3571) {
            this.method1501();
        }
        return this.field3584;
    }
}
