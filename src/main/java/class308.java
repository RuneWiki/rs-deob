import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class308 extends class132 {

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public int field4606 = 0;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "Z")
    private boolean field4612 = false;

    @OriginalMember(owner = "client!dl", name = "T", descriptor = "I")
    public int field4634 = 0;

    @OriginalMember(owner = "client!dl", name = "jb", descriptor = "I")
    public int field4650 = 0;

    @OriginalMember(owner = "client!dl", name = "mb", descriptor = "B")
    public byte field4653 = 0;

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "[I")
    public int[] field4626;

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "[I")
    public int[] field4622;

    @OriginalMember(owner = "client!dl", name = "bb", descriptor = "[I")
    public int[] field4642;

    @OriginalMember(owner = "client!dl", name = "hb", descriptor = "[I")
    public int[] field4648;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "[I")
    public int[] field4607;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "[I")
    public int[] field4610;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "[I")
    public int[] field4613;

    @OriginalMember(owner = "client!dl", name = "Y", descriptor = "[B")
    public byte[] field4639;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "[B")
    public byte[] field4608;

    @OriginalMember(owner = "client!dl", name = "ib", descriptor = "[B")
    public byte[] field4649;

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "[S")
    public short[] field4627;

    @OriginalMember(owner = "client!dl", name = "fb", descriptor = "[S")
    public short[] field4646;

    @OriginalMember(owner = "client!dl", name = "ab", descriptor = "[B")
    public byte[] field4641;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "[I")
    public int[] field4620;

    @OriginalMember(owner = "client!dl", name = "eb", descriptor = "[B")
    public byte[] field4645;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "[S")
    public short[] field4624;

    @OriginalMember(owner = "client!dl", name = "nb", descriptor = "[S")
    public short[] field4654;

    @OriginalMember(owner = "client!dl", name = "ob", descriptor = "[S")
    public short[] field4655;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "[S")
    public short[] field4611;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "[S")
    public short[] field4614;

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "[S")
    public short[] field4625;

    @OriginalMember(owner = "client!dl", name = "U", descriptor = "[B")
    public byte[] field4635;

    @OriginalMember(owner = "client!dl", name = "db", descriptor = "[B")
    public byte[] field4644;

    @OriginalMember(owner = "client!dl", name = "gb", descriptor = "[B")
    public byte[] field4647;

    @OriginalMember(owner = "client!dl", name = "V", descriptor = "[B")
    public byte[] field4636;

    @OriginalMember(owner = "client!dl", name = "W", descriptor = "[B")
    public byte[] field4637;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public int field4604;

    @OriginalMember(owner = "client!dl", name = "lb", descriptor = "[S")
    public short[] field4652;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "[S")
    public short[] field4615;

    @OriginalMember(owner = "client!dl", name = "S", descriptor = "[[I")
    public int[][] field4633;

    @OriginalMember(owner = "client!dl", name = "cb", descriptor = "[[I")
    public int[][] field4643;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "[Lsg;")
    public class122[] field4605;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "[Lok;")
    public class1[] field4609;

    @OriginalMember(owner = "client!dl", name = "Z", descriptor = "[Lsg;")
    public class122[] field4640;

    @OriginalMember(owner = "client!dl", name = "kb", descriptor = "S")
    public short field4651;

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "S")
    public short field4628;

    @OriginalMember(owner = "client!dl", name = "R", descriptor = "[I")
    private static int[] field4632 = new int[10000];

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "I")
    private static int field4623 = 0;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "[I")
    private static int[] field4630 = new int[10000];

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "[I")
    private static int[] field4629 = class184.field2538;

    @OriginalMember(owner = "client!dl", name = "X", descriptor = "[I")
    private static int[] field4638 = class184.field2532;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "S")
    private short field4616;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "S")
    private short field4617;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "S")
    private short field4618;

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "S")
    private short field4619;

    @OriginalMember(owner = "client!dl", name = "G", descriptor = "S")
    private short field4621;

    @OriginalMember(owner = "client!dl", name = "Q", descriptor = "S")
    private short field4631;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "()V", line = 3)
    public final void method2088() {
        int var10002;
        if (this.field4648 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field4634; var3++) {
                int var4 = this.field4648[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field4633 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field4633[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field4634) {
                int var7 = this.field4648[var6];
                this.field4633[var7][var1[var7]++] = var6++;
            }
            this.field4648 = null;
        }
        if (this.field4620 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field4606; var10++) {
            int var11 = this.field4620[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field4643 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field4643[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field4606) {
            int var14 = this.field4620[var13];
            this.field4643[var14][var8[var14]++] = var13++;
        }
        this.field4620 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lkm;II)Ldl;", line = 97)
    public static final class308 method2089(class133 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method955(arg1, arg2, -21853);
        return var3 == null ? null : new class308(var3);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(III)V", line = 107)
    public final void method2090(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4634; var4++) {
            this.field4626[var4] = this.field4626[var4] * arg0 / 128;
            this.field4622[var4] = this.field4622[var4] * arg1 / 128;
            this.field4642[var4] = this.field4642[var4] * arg2 / 128;
        }
        this.method2093();
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "()Z", line = 127)
    public final boolean method943() {
        return true;
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "()V", line = 131)
    public final void method2091() {
        this.field4648 = null;
        this.field4620 = null;
        this.field4633 = (int[][]) null;
        this.field4643 = (int[][]) null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(SS)V", line = 138)
    public final void method2092(short arg0, short arg1) {
        if (this.field4646 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field4606; var3++) {
            if (this.field4646[var3] == arg0) {
                this.field4646[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "()V", line = 157)
    private final void method2093() {
        this.field4605 = null;
        this.field4640 = null;
        this.field4609 = null;
        this.field4612 = false;
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "()V", line = 166)
    public final void method2094() {
        for (int var1 = 0; var1 < this.field4634; var1++) {
            int var2 = this.field4642[var1];
            this.field4642[var1] = this.field4626[var1];
            this.field4626[var1] = -var2;
        }
        this.method2093();
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(SS)V", line = 181)
    public final void method2095(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field4606; var3++) {
            if (this.field4627[var3] == arg0) {
                this.field4627[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(III)I", line = 194)
    public final int method2096(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4634; var4++) {
            if (this.field4626[var4] == arg0 && this.field4622[var4] == arg1 && this.field4642[var4] == arg2) {
                return var4;
            }
        }
        this.field4626[this.field4634] = arg0;
        this.field4622[this.field4634] = arg1;
        this.field4642[this.field4634] = arg2;
        this.field4650 = ++this.field4634;
        return this.field4634 - 1;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ldn;IIIZ)V", line = 211)
    public final void method941(class132 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class308 var6 = (class308) arg0;
        var6.method2112();
        var6.method2115();
        field4623++;
        int var7 = 0;
        int[] var8 = var6.field4626;
        int var9 = var6.field4650;
        for (int var10 = 0; var10 < this.field4650; var10++) {
            class122 var11 = this.field4605[var10];
            if (var11.field1649 != 0) {
                int var12 = this.field4622[var10] - arg2;
                if (var12 >= var6.field4618 && var12 <= var6.field4619) {
                    int var13 = this.field4626[var10] - arg1;
                    if (var13 >= var6.field4631 && var13 <= var6.field4621) {
                        int var14 = this.field4642[var10] - arg3;
                        if (var14 >= var6.field4617 && var14 <= var6.field4616) {
                            for (int var15 = 0; var15 < var9; var15++) {
                                class122 var16 = var6.field4605[var15];
                                if (var8[var15] == var13 && var6.field4642[var15] == var14 && var6.field4622[var15] == var12 && var16.field1649 != 0) {
                                    if (this.field4640 == null) {
                                        this.field4640 = new class122[this.field4650];
                                    }
                                    if (var6.field4640 == null) {
                                        var6.field4640 = new class122[var9];
                                    }
                                    class122 var17 = this.field4640[var10];
                                    if (var17 == null) {
                                        var17 = this.field4640[var10] = new class122(var11);
                                    }
                                    class122 var18 = var6.field4640[var15];
                                    if (var18 == null) {
                                        var18 = var6.field4640[var15] = new class122(var16);
                                    }
                                    var17.field1650 += var16.field1650;
                                    var17.field1651 += var16.field1651;
                                    var17.field1645 += var16.field1645;
                                    var17.field1649 += var16.field1649;
                                    var18.field1650 += var11.field1650;
                                    var18.field1651 += var11.field1651;
                                    var18.field1645 += var11.field1645;
                                    var18.field1649 += var11.field1649;
                                    var7++;
                                    field4630[var10] = field4623;
                                    field4632[var15] = field4623;
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
        for (int var19 = 0; var19 < this.field4606; var19++) {
            if (field4630[this.field4607[var19]] == field4623 && field4630[this.field4610[var19]] == field4623 && field4630[this.field4613[var19]] == field4623) {
                if (this.field4639 == null) {
                    this.field4639 = new byte[this.field4606];
                }
                this.field4639[var19] = 2;
            }
        }
        for (int var20 = 0; var20 < var6.field4606; var20++) {
            if (field4632[var6.field4607[var20]] == field4623 && field4632[var6.field4610[var20]] == field4623 && field4632[var6.field4613[var20]] == field4623) {
                if (var6.field4639 == null) {
                    var6.field4639 = new byte[var6.field4606];
                }
                var6.field4639[var20] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(IIIII)Lq;", line = 327)
    public final class345 method2097(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class67.field908) {
            class267 var6 = new class267(this, arg0, arg1, true);
            var6.method1823();
            return var6;
        } else {
            return new class50(this, arg0, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "()V", line = 339)
    public static void method2098() {
        field4630 = null;
        field4632 = null;
        field4629 = null;
        field4638 = null;
    }

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "()V", line = 349)
    public final void method2099() {
        for (int var1 = 0; var1 < this.field4634; var1++) {
            this.field4642[var1] = -this.field4642[var1];
        }
        for (int var2 = 0; var2 < this.field4606; var2++) {
            int var3 = this.field4607[var2];
            this.field4607[var2] = this.field4613[var2];
            this.field4613[var2] = var3;
        }
        this.method2093();
    }

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "()V", line = 372)
    public final void method2100() {
        for (int var1 = 0; var1 < this.field4634; var1++) {
            this.field4626[var1] = -this.field4626[var1];
            this.field4642[var1] = -this.field4642[var1];
        }
        this.method2093();
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ldl;IS)I", line = 387)
    private final int method2101(class308 arg0, int arg1, short arg2) {
        int var4 = arg0.field4626[arg1];
        int var5 = arg0.field4622[arg1];
        int var6 = arg0.field4642[arg1];
        for (int var7 = 0; var7 < this.field4634; var7++) {
            if (this.field4626[var7] == var4 && this.field4622[var7] == var5 && this.field4642[var7] == var6) {
                this.field4652[var7] |= arg2;
                return var7;
            }
        }
        this.field4626[this.field4634] = var4;
        this.field4622[this.field4634] = var5;
        this.field4642[this.field4634] = var6;
        this.field4652[this.field4634] = arg2;
        if (arg0.field4648 != null) {
            this.field4648[this.field4634] = arg0.field4648[arg1];
        }
        return this.field4634++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([[III)I", line = 419)
    private static final int method2102(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIBSB)I", line = 451)
    public final int method2103(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field4607[this.field4606] = arg0;
        this.field4610[this.field4606] = arg1;
        this.field4613[this.field4606] = arg2;
        this.field4639[this.field4606] = arg3;
        this.field4641[this.field4606] = -1;
        this.field4627[this.field4606] = arg4;
        this.field4646[this.field4606] = -1;
        this.field4649[this.field4606] = arg5;
        return this.field4606++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "()I", line = 462)
    public final int method105() {
        if (!this.field4612) {
            this.method2112();
        }
        return this.field4618;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([[IIIIII)V", line = 469)
    private final void method2104(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method2102(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method2102(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method2102(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method2102(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method2106(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method2116(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method2108(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II[[I[[IIIIZZ)Ldl;", line = 545)
    public final class308 method2105(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method2112();
        int var10 = this.field4631 + arg4;
        int var11 = this.field4621 + arg4;
        int var12 = this.field4617 + arg6;
        int var13 = this.field4616 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length) {
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
        class308 var18;
        if (arg7) {
            var18 = new class308();
            var18.field4634 = this.field4634;
            var18.field4650 = this.field4650;
            var18.field4606 = this.field4606;
            var18.field4604 = this.field4604;
            var18.field4607 = this.field4607;
            var18.field4610 = this.field4610;
            var18.field4613 = this.field4613;
            var18.field4639 = this.field4639;
            var18.field4608 = this.field4608;
            var18.field4649 = this.field4649;
            var18.field4641 = this.field4641;
            var18.field4627 = this.field4627;
            var18.field4646 = this.field4646;
            var18.field4653 = this.field4653;
            var18.field4645 = this.field4645;
            var18.field4624 = this.field4624;
            var18.field4654 = this.field4654;
            var18.field4655 = this.field4655;
            var18.field4611 = this.field4611;
            var18.field4614 = this.field4614;
            var18.field4625 = this.field4625;
            var18.field4635 = this.field4635;
            var18.field4644 = this.field4644;
            var18.field4647 = this.field4647;
            var18.field4636 = this.field4636;
            var18.field4637 = this.field4637;
            var18.field4648 = this.field4648;
            var18.field4620 = this.field4620;
            var18.field4633 = this.field4633;
            var18.field4643 = this.field4643;
            var18.field4651 = this.field4651;
            var18.field4628 = this.field4628;
            var18.field4605 = this.field4605;
            var18.field4609 = this.field4609;
            var18.field4640 = this.field4640;
            if (arg0 == 3) {
                var18.field4626 = class188.method1318(this.field4626, 0);
                var18.field4622 = class188.method1318(this.field4622, 0);
                var18.field4642 = class188.method1318(this.field4642, 0);
            } else {
                var18.field4626 = this.field4626;
                var18.field4622 = new int[var18.field4634];
                var18.field4642 = this.field4642;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field4650; var19++) {
                int var20 = this.field4626[var19] + arg4;
                int var21 = this.field4642[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field4622[var19] = this.field4622[var19] + var28 - arg5;
            }
            for (int var29 = var18.field4650; var29 < var18.field4634; var29++) {
                int var30 = this.field4626[var29] + arg4;
                int var31 = this.field4642[var29] + arg6;
                int var32 = var30 & 0x7F;
                int var33 = var31 & 0x7F;
                int var34 = var30 >> 7;
                int var35 = var31 >> 7;
                if (var34 >= 0 && var34 < arg2.length - 1 && var35 >= 0 && var35 < arg2[0].length - 1) {
                    int var36 = (128 - var32) * arg2[var34][var35] + arg2[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg2[var34][var35 + 1] + arg2[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    var18.field4622[var29] = this.field4622[var29] + var38 - arg5;
                }
            }
        } else if (arg0 == 2) {
            for (int var39 = 0; var39 < var18.field4650; var39++) {
                int var40 = (this.field4622[var39] << 16) / this.field4618;
                if (var40 < arg1) {
                    int var41 = this.field4626[var39] + arg4;
                    int var42 = this.field4642[var39] + arg6;
                    int var43 = var41 & 0x7F;
                    int var44 = var42 & 0x7F;
                    int var45 = var41 >> 7;
                    int var46 = var42 >> 7;
                    int var47 = (128 - var43) * arg2[var45][var46] + arg2[var45 + 1][var46] * var43 >> 7;
                    int var48 = (128 - var43) * arg2[var45][var46 + 1] + arg2[var45 + 1][var46 + 1] * var43 >> 7;
                    int var49 = (128 - var44) * var47 + var44 * var48 >> 7;
                    var18.field4622[var39] = (arg1 - var40) * (var49 - arg5) / arg1 + this.field4622[var39];
                } else {
                    var18.field4622[var39] = this.field4622[var39];
                }
            }
            for (int var50 = var18.field4650; var50 < var18.field4634; var50++) {
                int var51 = (this.field4622[var50] << 16) / this.field4618;
                if (var51 < arg1) {
                    int var52 = this.field4626[var50] + arg4;
                    int var53 = this.field4642[var50] + arg6;
                    int var54 = var52 & 0x7F;
                    int var55 = var53 & 0x7F;
                    int var56 = var52 >> 7;
                    int var57 = var53 >> 7;
                    if (var56 >= 0 && var56 < arg2.length - 1 && var57 >= 0 && var57 < arg2[0].length - 1) {
                        int var58 = (128 - var54) * arg2[var56][var57] + arg2[var56 + 1][var57] * var54 >> 7;
                        int var59 = (128 - var54) * arg2[var56][var57 + 1] + arg2[var56 + 1][var57 + 1] * var54 >> 7;
                        int var60 = (128 - var55) * var58 + var55 * var59 >> 7;
                        var18.field4622[var50] = (arg1 - var51) * (var60 - arg5) / arg1 + this.field4622[var50];
                    }
                } else {
                    var18.field4622[var50] = this.field4622[var50];
                }
            }
        } else if (arg0 == 3) {
            int var61 = (arg1 & 0xFF) * 4;
            int var62 = (arg1 >> 8 & 0xFF) * 4;
            var18.method2104(arg2, arg4, arg5, arg6, var61, var62);
        } else if (arg0 == 4) {
            int var63 = this.field4619 - this.field4618;
            for (int var64 = 0; var64 < this.field4650; var64++) {
                int var65 = this.field4626[var64] + arg4;
                int var66 = this.field4642[var64] + arg6;
                int var67 = var65 & 0x7F;
                int var68 = var66 & 0x7F;
                int var69 = var65 >> 7;
                int var70 = var66 >> 7;
                int var71 = (128 - var67) * arg3[var69][var70] + arg3[var69 + 1][var70] * var67 >> 7;
                int var72 = (128 - var67) * arg3[var69][var70 + 1] + arg3[var69 + 1][var70 + 1] * var67 >> 7;
                int var73 = (128 - var68) * var71 + var68 * var72 >> 7;
                var18.field4622[var64] = var73 + this.field4622[var64] + var63 - arg5;
            }
            for (int var74 = var18.field4650; var74 < var18.field4634; var74++) {
                int var75 = this.field4626[var74] + arg4;
                int var76 = this.field4642[var74] + arg6;
                int var77 = var75 & 0x7F;
                int var78 = var76 & 0x7F;
                int var79 = var75 >> 7;
                int var80 = var76 >> 7;
                if (var79 >= 0 && var79 < arg3.length - 1 && var80 >= 0 && var80 < arg3[0].length - 1) {
                    int var81 = (128 - var77) * arg3[var79][var80] + arg3[var79 + 1][var80] * var77 >> 7;
                    int var82 = (128 - var77) * arg3[var79][var80 + 1] + arg3[var79 + 1][var80 + 1] * var77 >> 7;
                    int var83 = (128 - var78) * var81 + var78 * var82 >> 7;
                    var18.field4622[var74] = var83 + this.field4622[var74] + var63 - arg5;
                }
            }
        } else if (arg0 == 5) {
            int var84 = this.field4619 - this.field4618;
            for (int var85 = 0; var85 < this.field4650; var85++) {
                int var86 = this.field4626[var85] + arg4;
                int var87 = this.field4642[var85] + arg6;
                int var88 = var86 & 0x7F;
                int var89 = var87 & 0x7F;
                int var90 = var86 >> 7;
                int var91 = var87 >> 7;
                int var92 = (128 - var88) * arg2[var90][var91] + arg2[var90 + 1][var91] * var88 >> 7;
                int var93 = (128 - var88) * arg2[var90][var91 + 1] + arg2[var90 + 1][var91 + 1] * var88 >> 7;
                int var94 = (128 - var89) * var92 + var89 * var93 >> 7;
                int var95 = (128 - var88) * arg3[var90][var91] + arg3[var90 + 1][var91] * var88 >> 7;
                int var96 = (128 - var88) * arg3[var90][var91 + 1] + arg3[var90 + 1][var91 + 1] * var88 >> 7;
                int var97 = (128 - var89) * var95 + var89 * var96 >> 7;
                int var98 = var94 - var97;
                var18.field4622[var85] = ((this.field4622[var85] << 8) / var84 * var98 >> 8) - (arg5 - var94);
            }
            for (int var99 = var18.field4650; var99 < var18.field4634; var99++) {
                int var100 = this.field4626[var99] + arg4;
                int var101 = this.field4642[var99] + arg6;
                int var102 = var100 & 0x7F;
                int var103 = var101 & 0x7F;
                int var104 = var100 >> 7;
                int var105 = var101 >> 7;
                if (var104 >= 0 && var104 < arg2.length - 1 && var104 < arg3.length - 1 && var105 >= 0 && var105 < arg2[0].length - 1 && var105 < arg3[0].length - 1) {
                    int var106 = (128 - var102) * arg2[var104][var105] + arg2[var104 + 1][var105] * var102 >> 7;
                    int var107 = (128 - var102) * arg2[var104][var105 + 1] + arg2[var104 + 1][var105 + 1] * var102 >> 7;
                    int var108 = (128 - var103) * var106 + var103 * var107 >> 7;
                    int var109 = (128 - var102) * arg3[var104][var105] + arg3[var104 + 1][var105] * var102 >> 7;
                    int var110 = (128 - var102) * arg3[var104][var105 + 1] + arg3[var104 + 1][var105 + 1] * var102 >> 7;
                    int var111 = (128 - var103) * var109 + var103 * var110 >> 7;
                    int var112 = var108 - var111;
                    var18.field4622[var99] = ((this.field4622[var99] << 8) / var84 * var112 >> 8) - (arg5 - var108);
                }
            }
        }
        if (arg8) {
            var18.method2093();
        } else {
            this.field4612 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V", line = 944)
    private final void method2106(int arg0) {
        int var2 = field4629[arg0];
        int var3 = field4638[arg0];
        for (int var4 = 0; var4 < this.field4634; var4++) {
            int var5 = this.field4622[var4] * var3 - this.field4642[var4] * var2 >> 16;
            this.field4642[var4] = this.field4642[var4] * var3 + this.field4622[var4] * var2 >> 16;
            this.field4622[var4] = var5;
        }
        this.method2093();
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V", line = 2193)
    private class308() {
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "([B)V", line = 2195)
    private class308(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2114(arg0);
        } else {
            this.method2107(arg0);
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(III)V", line = 2202)
    public class308(int arg0, int arg1, int arg2) {
        this.field4626 = new int[arg0];
        this.field4622 = new int[arg0];
        this.field4642 = new int[arg0];
        this.field4648 = new int[arg0];
        this.field4607 = new int[arg1];
        this.field4610 = new int[arg1];
        this.field4613 = new int[arg1];
        this.field4639 = new byte[arg1];
        this.field4608 = new byte[arg1];
        this.field4649 = new byte[arg1];
        this.field4627 = new short[arg1];
        this.field4646 = new short[arg1];
        this.field4641 = new byte[arg1];
        this.field4620 = new int[arg1];
        if (arg2 > 0) {
            this.field4645 = new byte[arg2];
            this.field4624 = new short[arg2];
            this.field4654 = new short[arg2];
            this.field4655 = new short[arg2];
            this.field4611 = new short[arg2];
            this.field4614 = new short[arg2];
            this.field4625 = new short[arg2];
            this.field4635 = new byte[arg2];
            this.field4644 = new byte[arg2];
            this.field4647 = new byte[arg2];
            this.field4636 = new byte[arg2];
            this.field4637 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "([Ldl;I)V", line = 2235)
    public class308(class308[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field4634 = 0;
        this.field4606 = 0;
        this.field4604 = 0;
        byte var9 = 0;
        byte var10 = 0;
        this.field4653 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class308 var12 = arg0[var11];
            if (var12 != null) {
                this.field4634 += var12.field4634;
                this.field4606 += var12.field4606;
                this.field4604 += var12.field4604;
                if (var12.field4608 == null) {
                    if (this.field4653 == -1) {
                        this.field4653 = var12.field4653;
                    }
                    if (this.field4653 != var12.field4653) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var12.field4639 != null;
                var5 |= var12.field4649 != null;
                var6 |= var12.field4620 != null;
                var7 |= var12.field4646 != null;
                var8 |= var12.field4641 != null;
            }
        }
        this.field4626 = new int[this.field4634];
        this.field4622 = new int[this.field4634];
        this.field4642 = new int[this.field4634];
        this.field4648 = new int[this.field4634];
        this.field4652 = new short[this.field4634];
        this.field4607 = new int[this.field4606];
        this.field4610 = new int[this.field4606];
        this.field4613 = new int[this.field4606];
        if (var3) {
            this.field4639 = new byte[this.field4606];
        }
        if (var4) {
            this.field4608 = new byte[this.field4606];
        }
        if (var5) {
            this.field4649 = new byte[this.field4606];
        }
        if (var6) {
            this.field4620 = new int[this.field4606];
        }
        if (var7) {
            this.field4646 = new short[this.field4606];
        }
        if (var8) {
            this.field4641 = new byte[this.field4606];
        }
        if (var9 > 0) {
        }
        if (var10 > 0) {
        }
        this.field4627 = new short[this.field4606];
        this.field4615 = new short[this.field4606];
        if (this.field4604 > 0) {
            this.field4645 = new byte[this.field4604];
            this.field4624 = new short[this.field4604];
            this.field4654 = new short[this.field4604];
            this.field4655 = new short[this.field4604];
            this.field4611 = new short[this.field4604];
            this.field4614 = new short[this.field4604];
            this.field4625 = new short[this.field4604];
            this.field4635 = new byte[this.field4604];
            this.field4644 = new byte[this.field4604];
            this.field4647 = new byte[this.field4604];
            this.field4636 = new byte[this.field4604];
            this.field4637 = new byte[this.field4604];
        }
        this.field4634 = 0;
        this.field4606 = 0;
        this.field4604 = 0;
        boolean var13 = false;
        boolean var14 = false;
        for (int var15 = 0; var15 < arg1; var15++) {
            short var16 = (short) (0x1 << var15);
            class308 var17 = arg0[var15];
            if (var17 != null) {
                for (int var18 = 0; var18 < var17.field4606; var18++) {
                    if (var3 && var17.field4639 != null) {
                        this.field4639[this.field4606] = var17.field4639[var18];
                    }
                    if (var4) {
                        if (var17.field4608 == null) {
                            this.field4608[this.field4606] = var17.field4653;
                        } else {
                            this.field4608[this.field4606] = var17.field4608[var18];
                        }
                    }
                    if (var5 && var17.field4649 != null) {
                        this.field4649[this.field4606] = var17.field4649[var18];
                    }
                    if (var6 && var17.field4620 != null) {
                        this.field4620[this.field4606] = var17.field4620[var18];
                    }
                    if (var7) {
                        if (var17.field4646 == null) {
                            this.field4646[this.field4606] = -1;
                        } else {
                            this.field4646[this.field4606] = var17.field4646[var18];
                        }
                    }
                    this.field4627[this.field4606] = var17.field4627[var18];
                    this.field4615[this.field4606] = var16;
                    this.field4607[this.field4606] = this.method2101(var17, var17.field4607[var18], var16);
                    this.field4610[this.field4606] = this.method2101(var17, var17.field4610[var18], var16);
                    this.field4613[this.field4606] = this.method2101(var17, var17.field4613[var18], var16);
                    this.field4606++;
                }
            }
        }
        int var19 = 0;
        this.field4650 = this.field4634;
        for (int var20 = 0; var20 < arg1; var20++) {
            class308 var21 = arg0[var20];
            short var22 = (short) (0x1 << var20);
            if (var21 != null) {
                for (int var23 = 0; var23 < var21.field4606; var23++) {
                    if (var8) {
                        this.field4641[var19++] = (byte) (var21.field4641 == null || var21.field4641[var23] == -1 ? -1 : var21.field4641[var23] + this.field4604);
                    }
                }
                for (int var24 = 0; var24 < var21.field4604; var24++) {
                    byte var25 = this.field4645[this.field4604] = var21.field4645[var24];
                    if (var25 == 0) {
                        this.field4624[this.field4604] = (short) this.method2101(var21, var21.field4624[var24], var22);
                        this.field4654[this.field4604] = (short) this.method2101(var21, var21.field4654[var24], var22);
                        this.field4655[this.field4604] = (short) this.method2101(var21, var21.field4655[var24], var22);
                    }
                    if (var25 >= 1 && var25 <= 3) {
                        this.field4624[this.field4604] = var21.field4624[var24];
                        this.field4654[this.field4604] = var21.field4654[var24];
                        this.field4655[this.field4604] = var21.field4655[var24];
                        this.field4611[this.field4604] = var21.field4611[var24];
                        this.field4614[this.field4604] = var21.field4614[var24];
                        this.field4625[this.field4604] = var21.field4625[var24];
                        this.field4635[this.field4604] = var21.field4635[var24];
                        this.field4644[this.field4604] = var21.field4644[var24];
                        this.field4647[this.field4604] = var21.field4647[var24];
                    }
                    if (var25 == 2) {
                        this.field4636[this.field4604] = var21.field4636[var24];
                        this.field4637[this.field4604] = var21.field4637[var24];
                    }
                    this.field4604++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Ldl;ZZZZ)V", line = 2490)
    public class308(class308 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field4634 = arg0.field4634;
        this.field4650 = arg0.field4650;
        this.field4606 = arg0.field4606;
        this.field4604 = arg0.field4604;
        if (arg1) {
            this.field4626 = arg0.field4626;
            this.field4622 = arg0.field4622;
            this.field4642 = arg0.field4642;
        } else {
            this.field4626 = new int[this.field4634];
            this.field4622 = new int[this.field4634];
            this.field4642 = new int[this.field4634];
            for (int var6 = 0; var6 < this.field4634; var6++) {
                this.field4626[var6] = arg0.field4626[var6];
                this.field4622[var6] = arg0.field4622[var6];
                this.field4642[var6] = arg0.field4642[var6];
            }
        }
        if (arg2) {
            this.field4627 = arg0.field4627;
        } else {
            this.field4627 = new short[this.field4606];
            for (int var7 = 0; var7 < this.field4606; var7++) {
                this.field4627[var7] = arg0.field4627[var7];
            }
        }
        if (arg3 || arg0.field4646 == null) {
            this.field4646 = arg0.field4646;
        } else {
            this.field4646 = new short[this.field4606];
            for (int var8 = 0; var8 < this.field4606; var8++) {
                this.field4646[var8] = arg0.field4646[var8];
            }
        }
        if (arg4) {
            this.field4649 = arg0.field4649;
        } else {
            this.field4649 = new byte[this.field4606];
            if (arg0.field4649 == null) {
                for (int var9 = 0; var9 < this.field4606; var9++) {
                    this.field4649[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field4606; var10++) {
                    this.field4649[var10] = arg0.field4649[var10];
                }
            }
        }
        this.field4607 = arg0.field4607;
        this.field4610 = arg0.field4610;
        this.field4613 = arg0.field4613;
        this.field4639 = arg0.field4639;
        this.field4608 = arg0.field4608;
        this.field4641 = arg0.field4641;
        this.field4653 = arg0.field4653;
        this.field4645 = arg0.field4645;
        this.field4624 = arg0.field4624;
        this.field4654 = arg0.field4654;
        this.field4655 = arg0.field4655;
        this.field4611 = arg0.field4611;
        this.field4614 = arg0.field4614;
        this.field4625 = arg0.field4625;
        this.field4635 = arg0.field4635;
        this.field4644 = arg0.field4644;
        this.field4647 = arg0.field4647;
        this.field4636 = arg0.field4636;
        this.field4637 = arg0.field4637;
        this.field4648 = arg0.field4648;
        this.field4620 = arg0.field4620;
        this.field4633 = arg0.field4633;
        this.field4643 = arg0.field4643;
        this.field4605 = arg0.field4605;
        this.field4609 = arg0.field4609;
        this.field4640 = arg0.field4640;
        this.field4651 = arg0.field4651;
        this.field4628 = arg0.field4628;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([B)V", line = 966)
    private final void method2107(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class316 var4 = new class316(arg0);
        class316 var5 = new class316(arg0);
        class316 var6 = new class316(arg0);
        class316 var7 = new class316(arg0);
        class316 var8 = new class316(arg0);
        var4.field4777 = arg0.length - 18;
        int var9 = var4.method2220((byte) 112);
        int var10 = var4.method2220((byte) 99);
        int var11 = var4.method2219(16448);
        int var12 = var4.method2219(16448);
        int var13 = var4.method2219(16448);
        int var14 = var4.method2219(16448);
        int var15 = var4.method2219(16448);
        int var16 = var4.method2219(16448);
        int var17 = var4.method2220((byte) 57);
        int var18 = var4.method2220((byte) 67);
        int var19 = var4.method2220((byte) 86);
        int var20 = var4.method2220((byte) 125);
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
        this.field4634 = var9;
        this.field4606 = var10;
        this.field4604 = var11;
        this.field4626 = new int[var9];
        this.field4622 = new int[var9];
        this.field4642 = new int[var9];
        this.field4607 = new int[var10];
        this.field4610 = new int[var10];
        this.field4613 = new int[var10];
        if (var11 > 0) {
            this.field4645 = new byte[var11];
            this.field4624 = new short[var11];
            this.field4654 = new short[var11];
            this.field4655 = new short[var11];
        }
        if (var16 == 1) {
            this.field4648 = new int[var9];
        }
        if (var12 == 1) {
            this.field4639 = new byte[var10];
            this.field4641 = new byte[var10];
            this.field4646 = new short[var10];
        }
        if (var13 == 255) {
            this.field4608 = new byte[var10];
        } else {
            this.field4653 = (byte) var13;
        }
        if (var14 == 1) {
            this.field4649 = new byte[var10];
        }
        if (var15 == 1) {
            this.field4620 = new int[var10];
        }
        this.field4627 = new short[var10];
        var4.field4777 = var21;
        var5.field4777 = var36;
        var6.field4777 = var38;
        var7.field4777 = var40;
        var8.field4777 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2219(16448);
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2173(true);
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2173(true);
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2173(true);
            }
            this.field4626[var46] = var43 + var48;
            this.field4622[var46] = var44 + var49;
            this.field4642[var46] = var45 + var50;
            var43 = this.field4626[var46];
            var44 = this.field4622[var46];
            var45 = this.field4642[var46];
            if (var16 == 1) {
                this.field4648[var46] = var8.method2219(16448);
            }
        }
        var4.field4777 = var32;
        var5.field4777 = var28;
        var6.field4777 = var26;
        var7.field4777 = var30;
        var8.field4777 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field4627[var51] = (short) var4.method2220((byte) 116);
            if (var12 == 1) {
                int var52 = var5.method2219(16448);
                if ((var52 & 0x1) == 1) {
                    this.field4639[var51] = 1;
                    var2 = true;
                } else {
                    this.field4639[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field4641[var51] = (byte) (var52 >> 2);
                    this.field4646[var51] = this.field4627[var51];
                    this.field4627[var51] = 127;
                    if (this.field4646[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field4641[var51] = -1;
                    this.field4646[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field4608[var51] = var6.method2192(3);
            }
            if (var14 == 1) {
                this.field4649[var51] = var7.method2192(3);
            }
            if (var15 == 1) {
                this.field4620[var51] = var8.method2219(16448);
            }
        }
        this.field4650 = -1;
        var4.field4777 = var25;
        var5.field4777 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2219(16448);
            if (var58 == 1) {
                var53 = var4.method2173(true) + var56;
                var54 = var4.method2173(true) + var53;
                var55 = var4.method2173(true) + var54;
                var56 = var55;
                this.field4607[var57] = var53;
                this.field4610[var57] = var54;
                this.field4613[var57] = var55;
                if (var53 > this.field4650) {
                    this.field4650 = var53;
                }
                if (var54 > this.field4650) {
                    this.field4650 = var54;
                }
                if (var55 > this.field4650) {
                    this.field4650 = var55;
                }
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2173(true) + var56;
                var56 = var55;
                this.field4607[var57] = var53;
                this.field4610[var57] = var54;
                this.field4613[var57] = var55;
                if (var55 > this.field4650) {
                    this.field4650 = var55;
                }
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2173(true) + var56;
                var56 = var55;
                this.field4607[var57] = var53;
                this.field4610[var57] = var54;
                this.field4613[var57] = var55;
                if (var55 > this.field4650) {
                    this.field4650 = var55;
                }
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2173(true) + var56;
                var56 = var55;
                this.field4607[var57] = var53;
                this.field4610[var57] = var61;
                this.field4613[var57] = var55;
                if (var55 > this.field4650) {
                    this.field4650 = var55;
                }
            }
        }
        this.field4650++;
        var4.field4777 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field4645[var62] = 0;
            this.field4624[var62] = (short) var4.method2220((byte) 52);
            this.field4654[var62] = (short) var4.method2220((byte) 124);
            this.field4655[var62] = (short) var4.method2220((byte) 114);
        }
        if (this.field4641 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field4641[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field4624[var65] & 0xFFFF) == this.field4607[var64] && (this.field4654[var65] & 0xFFFF) == this.field4610[var64] && (this.field4655[var65] & 0xFFFF) == this.field4613[var64]) {
                        this.field4641[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field4641 = null;
            }
        }
        if (!var3) {
            this.field4646 = null;
        }
        if (!var2) {
            this.field4639 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(III)V", line = 1328)
    public final void method2108(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4634; var4++) {
            this.field4626[var4] += arg0;
            this.field4622[var4] += arg1;
            this.field4642[var4] += arg2;
        }
        this.method2093();
    }

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "()V", line = 1345)
    public final void method2109() {
        for (int var1 = 0; var1 < this.field4634; var1++) {
            int var2 = this.field4626[var1];
            this.field4626[var1] = this.field4642[var1];
            this.field4642[var1] = -var2;
        }
        this.method2093();
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(III)V", line = 1359)
    public final void method2110(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field4629[arg2];
            int var5 = field4638[arg2];
            for (int var6 = 0; var6 < this.field4634; var6++) {
                int var7 = this.field4626[var6] * var5 + this.field4622[var6] * var4 >> 16;
                this.field4622[var6] = this.field4622[var6] * var5 - this.field4626[var6] * var4 >> 16;
                this.field4626[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field4629[arg0];
            int var9 = field4638[arg0];
            for (int var10 = 0; var10 < this.field4634; var10++) {
                int var11 = this.field4622[var10] * var9 - this.field4642[var10] * var8 >> 16;
                this.field4642[var10] = this.field4642[var10] * var9 + this.field4622[var10] * var8 >> 16;
                this.field4622[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field4629[arg1];
        int var13 = field4638[arg1];
        for (int var14 = 0; var14 < this.field4634; var14++) {
            int var15 = this.field4642[var14] * var12 + this.field4626[var14] * var13 >> 16;
            this.field4642[var14] = this.field4642[var14] * var13 - this.field4626[var14] * var12 >> 16;
            this.field4626[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V", line = 1422)
    public final void method2111(int arg0) {
        int var2 = field4629[arg0];
        int var3 = field4638[arg0];
        for (int var4 = 0; var4 < this.field4634; var4++) {
            int var5 = this.field4642[var4] * var2 + this.field4626[var4] * var3 >> 16;
            this.field4642[var4] = this.field4642[var4] * var3 - this.field4626[var4] * var2 >> 16;
            this.field4626[var4] = var5;
        }
        this.method2093();
    }

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "()V", line = 1444)
    private final void method2112() {
        if (this.field4612) {
            return;
        }
        this.field4612 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field4650; var7++) {
            int var8 = this.field4626[var7];
            int var9 = this.field4622[var7];
            int var10 = this.field4642[var7];
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
        this.field4631 = (short) var1;
        this.field4621 = (short) var4;
        this.field4618 = (short) var2;
        this.field4619 = (short) var5;
        this.field4617 = (short) var3;
        this.field4616 = (short) var6;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)Ldn;", line = 1500)
    public final class132 method939(int arg0, int arg1, int arg2) {
        return this.method2097(this.field4651, this.field4628, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "()Ldl;", line = 1507)
    public final class308 method2113() {
        class308 var1 = new class308();
        if (this.field4639 != null) {
            var1.field4639 = new byte[this.field4606];
            for (int var2 = 0; var2 < this.field4606; var2++) {
                var1.field4639[var2] = this.field4639[var2];
            }
        }
        var1.field4634 = this.field4634;
        var1.field4650 = this.field4650;
        var1.field4606 = this.field4606;
        var1.field4604 = this.field4604;
        var1.field4626 = this.field4626;
        var1.field4622 = this.field4622;
        var1.field4642 = this.field4642;
        var1.field4607 = this.field4607;
        var1.field4610 = this.field4610;
        var1.field4613 = this.field4613;
        var1.field4608 = this.field4608;
        var1.field4649 = this.field4649;
        var1.field4641 = this.field4641;
        var1.field4627 = this.field4627;
        var1.field4646 = this.field4646;
        var1.field4653 = this.field4653;
        var1.field4645 = this.field4645;
        var1.field4624 = this.field4624;
        var1.field4654 = this.field4654;
        var1.field4655 = this.field4655;
        var1.field4611 = this.field4611;
        var1.field4614 = this.field4614;
        var1.field4625 = this.field4625;
        var1.field4635 = this.field4635;
        var1.field4644 = this.field4644;
        var1.field4647 = this.field4647;
        var1.field4636 = this.field4636;
        var1.field4637 = this.field4637;
        var1.field4648 = this.field4648;
        var1.field4620 = this.field4620;
        var1.field4633 = this.field4633;
        var1.field4643 = this.field4643;
        var1.field4605 = this.field4605;
        var1.field4609 = this.field4609;
        var1.field4651 = this.field4651;
        var1.field4628 = this.field4628;
        return var1;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIII)V", line = 1569)
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIIIJILsa;)V", line = 1571)
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class265 arg10) {
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "([B)V", line = 1574)
    private final void method2114(byte[] arg0) {
        class316 var2 = new class316(arg0);
        class316 var3 = new class316(arg0);
        class316 var4 = new class316(arg0);
        class316 var5 = new class316(arg0);
        class316 var6 = new class316(arg0);
        class316 var7 = new class316(arg0);
        class316 var8 = new class316(arg0);
        var2.field4777 = arg0.length - 23;
        int var9 = var2.method2220((byte) 113);
        int var10 = var2.method2220((byte) 52);
        int var11 = var2.method2219(16448);
        int var12 = var2.method2219(16448);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method2219(16448);
        int var16 = var2.method2219(16448);
        int var17 = var2.method2219(16448);
        int var18 = var2.method2219(16448);
        int var19 = var2.method2219(16448);
        int var20 = var2.method2220((byte) 93);
        int var21 = var2.method2220((byte) 120);
        int var22 = var2.method2220((byte) 60);
        int var23 = var2.method2220((byte) 39);
        int var24 = var2.method2220((byte) 66);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field4645 = new byte[var11];
            var2.field4777 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field4645[var28] = var2.method2192(3);
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
        this.field4634 = var9;
        this.field4606 = var10;
        this.field4604 = var11;
        this.field4626 = new int[var9];
        this.field4622 = new int[var9];
        this.field4642 = new int[var9];
        this.field4607 = new int[var10];
        this.field4610 = new int[var10];
        this.field4613 = new int[var10];
        if (var19 == 1) {
            this.field4648 = new int[var9];
        }
        if (var13) {
            this.field4639 = new byte[var10];
        }
        if (var15 == 255) {
            this.field4608 = new byte[var10];
        } else {
            this.field4653 = (byte) var15;
        }
        if (var16 == 1) {
            this.field4649 = new byte[var10];
        }
        if (var17 == 1) {
            this.field4620 = new int[var10];
        }
        if (var18 == 1) {
            this.field4646 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field4641 = new byte[var10];
        }
        this.field4627 = new short[var10];
        if (var11 > 0) {
            this.field4624 = new short[var11];
            this.field4654 = new short[var11];
            this.field4655 = new short[var11];
            if (var26 > 0) {
                this.field4611 = new short[var26];
                this.field4614 = new short[var26];
                this.field4625 = new short[var26];
                this.field4635 = new byte[var26];
                this.field4644 = new byte[var26];
                this.field4647 = new byte[var26];
            }
            if (var27 > 0) {
                this.field4636 = new byte[var27];
                this.field4637 = new byte[var27];
            }
        }
        var2.field4777 = var11;
        var3.field4777 = var46;
        var4.field4777 = var48;
        var5.field4777 = var50;
        var6.field4777 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var70 = var2.method2219(16448);
            int var71 = 0;
            if ((var70 & 0x1) != 0) {
                var71 = var3.method2173(true);
            }
            int var72 = 0;
            if ((var70 & 0x2) != 0) {
                var72 = var4.method2173(true);
            }
            int var73 = 0;
            if ((var70 & 0x4) != 0) {
                var73 = var5.method2173(true);
            }
            this.field4626[var69] = var66 + var71;
            this.field4622[var69] = var67 + var72;
            this.field4642[var69] = var68 + var73;
            var66 = this.field4626[var69];
            var67 = this.field4622[var69];
            var68 = this.field4642[var69];
            if (var19 == 1) {
                this.field4648[var69] = var6.method2219(16448);
            }
        }
        var2.field4777 = var44;
        var3.field4777 = var33;
        var4.field4777 = var36;
        var5.field4777 = var39;
        var6.field4777 = var37;
        var7.field4777 = var42;
        var8.field4777 = var41;
        for (int var74 = 0; var74 < var10; var74++) {
            this.field4627[var74] = (short) var2.method2220((byte) 93);
            if (var13) {
                this.field4639[var74] = var3.method2192(3);
            }
            if (var15 == 255) {
                this.field4608[var74] = var4.method2192(3);
            }
            if (var16 == 1) {
                this.field4649[var74] = var5.method2192(3);
            }
            if (var17 == 1) {
                this.field4620[var74] = var6.method2219(16448);
            }
            if (var18 == 1) {
                this.field4646[var74] = (short) (var7.method2220((byte) 120) - 1);
            }
            if (this.field4641 != null) {
                if (this.field4646[var74] == -1) {
                    this.field4641[var74] = -1;
                } else {
                    this.field4641[var74] = (byte) (var8.method2219(16448) - 1);
                }
            }
        }
        this.field4650 = -1;
        var2.field4777 = var35;
        var3.field4777 = var32;
        int var75 = 0;
        int var76 = 0;
        int var77 = 0;
        int var78 = 0;
        for (int var79 = 0; var79 < var10; var79++) {
            int var80 = var3.method2219(16448);
            if (var80 == 1) {
                var75 = var2.method2173(true) + var78;
                var76 = var2.method2173(true) + var75;
                var77 = var2.method2173(true) + var76;
                var78 = var77;
                this.field4607[var79] = var75;
                this.field4610[var79] = var76;
                this.field4613[var79] = var77;
                if (var75 > this.field4650) {
                    this.field4650 = var75;
                }
                if (var76 > this.field4650) {
                    this.field4650 = var76;
                }
                if (var77 > this.field4650) {
                    this.field4650 = var77;
                }
            }
            if (var80 == 2) {
                var76 = var77;
                var77 = var2.method2173(true) + var78;
                var78 = var77;
                this.field4607[var79] = var75;
                this.field4610[var79] = var76;
                this.field4613[var79] = var77;
                if (var77 > this.field4650) {
                    this.field4650 = var77;
                }
            }
            if (var80 == 3) {
                var75 = var77;
                var77 = var2.method2173(true) + var78;
                var78 = var77;
                this.field4607[var79] = var75;
                this.field4610[var79] = var76;
                this.field4613[var79] = var77;
                if (var77 > this.field4650) {
                    this.field4650 = var77;
                }
            }
            if (var80 == 4) {
                int var83 = var75;
                var75 = var76;
                var76 = var83;
                var77 = var2.method2173(true) + var78;
                var78 = var77;
                this.field4607[var79] = var75;
                this.field4610[var79] = var83;
                this.field4613[var79] = var77;
                if (var77 > this.field4650) {
                    this.field4650 = var77;
                }
            }
        }
        this.field4650++;
        var2.field4777 = var52;
        var3.field4777 = var54;
        var4.field4777 = var56;
        var5.field4777 = var58;
        var6.field4777 = var60;
        var7.field4777 = var62;
        for (int var84 = 0; var84 < var11; var84++) {
            int var85 = this.field4645[var84] & 0xFF;
            if (var85 == 0) {
                this.field4624[var84] = (short) var2.method2220((byte) 124);
                this.field4654[var84] = (short) var2.method2220((byte) 95);
                this.field4655[var84] = (short) var2.method2220((byte) 87);
            }
            if (var85 == 1) {
                this.field4624[var84] = (short) var3.method2220((byte) 71);
                this.field4654[var84] = (short) var3.method2220((byte) 121);
                this.field4655[var84] = (short) var3.method2220((byte) 59);
                this.field4611[var84] = (short) var4.method2220((byte) 88);
                this.field4614[var84] = (short) var4.method2220((byte) 123);
                this.field4625[var84] = (short) var4.method2220((byte) 108);
                this.field4635[var84] = var5.method2192(3);
                this.field4644[var84] = var6.method2192(3);
                this.field4647[var84] = var7.method2192(3);
            }
            if (var85 == 2) {
                this.field4624[var84] = (short) var3.method2220((byte) 83);
                this.field4654[var84] = (short) var3.method2220((byte) 64);
                this.field4655[var84] = (short) var3.method2220((byte) 61);
                this.field4611[var84] = (short) var4.method2220((byte) 116);
                this.field4614[var84] = (short) var4.method2220((byte) 39);
                this.field4625[var84] = (short) var4.method2220((byte) 43);
                this.field4635[var84] = var5.method2192(3);
                this.field4644[var84] = var6.method2192(3);
                this.field4647[var84] = var7.method2192(3);
                this.field4636[var84] = var7.method2192(3);
                this.field4637[var84] = var7.method2192(3);
            }
            if (var85 == 3) {
                this.field4624[var84] = (short) var3.method2220((byte) 61);
                this.field4654[var84] = (short) var3.method2220((byte) 122);
                this.field4655[var84] = (short) var3.method2220((byte) 54);
                this.field4611[var84] = (short) var4.method2220((byte) 119);
                this.field4614[var84] = (short) var4.method2220((byte) 58);
                this.field4625[var84] = (short) var4.method2220((byte) 91);
                this.field4635[var84] = var5.method2192(3);
                this.field4644[var84] = var6.method2192(3);
                this.field4647[var84] = var7.method2192(3);
            }
        }
        if (!var14) {
            return;
        }
        var2.field4777 = var64;
        int var86 = var2.method2219(16448);
        if (var86 > 0) {
            var2.field4777 += var86 * 4;
        }
        int var87 = var2.method2219(16448);
        if (var87 > 0) {
            var2.field4777 += var87 * 4;
        }
    }

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "()V", line = 2049)
    public final void method2115() {
        if (this.field4605 != null) {
            return;
        }
        this.field4605 = new class122[this.field4650];
        for (int var1 = 0; var1 < this.field4650; var1++) {
            this.field4605[var1] = new class122();
        }
        for (int var2 = 0; var2 < this.field4606; var2++) {
            int var3 = this.field4607[var2];
            int var4 = this.field4610[var2];
            int var5 = this.field4613[var2];
            int var6 = this.field4626[var4] - this.field4626[var3];
            int var7 = this.field4622[var4] - this.field4622[var3];
            int var8 = this.field4642[var4] - this.field4642[var3];
            int var9 = this.field4626[var5] - this.field4626[var3];
            int var10 = this.field4622[var5] - this.field4622[var3];
            int var11 = this.field4642[var5] - this.field4642[var3];
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
            if (this.field4639 == null) {
                var19 = 0;
            } else {
                var19 = this.field4639[var2];
            }
            if (var19 == 0) {
                class122 var20 = this.field4605[var3];
                var20.field1650 += var16;
                var20.field1651 += var17;
                var20.field1645 += var18;
                var20.field1649++;
                class122 var21 = this.field4605[var4];
                var21.field1650 += var16;
                var21.field1651 += var17;
                var21.field1645 += var18;
                var21.field1649++;
                class122 var22 = this.field4605[var5];
                var22.field1650 += var16;
                var22.field1651 += var17;
                var22.field1645 += var18;
                var22.field1649++;
            } else if (var19 == 1) {
                if (this.field4609 == null) {
                    this.field4609 = new class1[this.field4606];
                }
                class1 var23 = this.field4609[var2] = new class1();
                var23.field8 = var16;
                var23.field6 = var17;
                var23.field3 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V", line = 2149)
    private final void method2116(int arg0) {
        int var2 = field4629[arg0];
        int var3 = field4638[arg0];
        for (int var4 = 0; var4 < this.field4634; var4++) {
            int var5 = this.field4626[var4] * var3 + this.field4622[var4] * var2 >> 16;
            this.field4622[var4] = this.field4622[var4] * var3 - this.field4626[var4] * var2 >> 16;
            this.field4626[var4] = var5;
        }
        this.method2093();
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(IIIII)Lum;", line = 2182)
    public final class50 method2117(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class50(this, arg0, arg1, arg2, arg3, arg4);
    }
}
