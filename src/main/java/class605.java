import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class605 {

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "Lmg;")
    private class157 field8505;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "Lwk;")
    private class151 field8506;

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "I")
    public int field8514;

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
    private int field8513;

    @OriginalMember(owner = "client!ht", name = "n", descriptor = "[B")
    public byte[] field8515;

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
    private int field8511;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "I")
    private int field8508;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    private int field8502;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
    public static int field8503;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    public static int field8504;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
    public static int field8509;

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
    public static int field8512;

    @OriginalMember(owner = "client!ht", name = "o", descriptor = "I")
    public static int field8516;

    @OriginalMember(owner = "client!ht", name = "p", descriptor = "I")
    public static int field8517;

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "[[Llfa;")
    private class125[][] field8510;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method3488(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method3488(54, -81, true);
        }
        field8516++;
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZII[[ZZI)V")
    public final void method3489(boolean arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.field8506.method1054(false, -8);
        field8517++;
        this.field8506.method1171((byte) -113, arg4);
        this.field8506.method1087((byte) -32, 1);
        this.field8506.method1088((byte) -31, 1);
        this.field8506.method1078(false, false, true, -2);
        float var7 = 1.0F / (float) (this.field8506.field2185 * 128);
        if (arg0) {
            for (int var8 = 0; var8 < this.field8502; var8++) {
                int var9 = var8 << this.field8511;
                int var10 = var8 + 1 << this.field8511;
                label142: for (int var11 = 0; var11 < this.field8508; var11++) {
                    if (this.field8510[var11][var8] != null) {
                        int var12 = var11 << this.field8511;
                        int var13 = var11 + 1 << this.field8511;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if ((var14 - arg2) >= (-arg5) && var14 - arg2 <= arg5) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if ((-arg5) <= (var15 - arg1) && arg5 >= (var15 - arg1) && arg3[var14 + arg5 - arg2][var15 + arg5 - arg1]) {
                                        class468 var16 = this.field8506.method1043(false);
                                        var16.method2769(1.0F, var7, var7, 90);
                                        var16.method1952(-var11, -var8, 0);
                                        this.field8506.method1073(class505.field7237, 25216);
                                        this.field8510[var11][var8].method920(-26);
                                        continue label142;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field8502; var17++) {
                int var18 = var17 << this.field8511;
                int var19 = var17 + 1 << this.field8511;
                for (int var20 = 0; var20 < this.field8508; var20++) {
                    class125 var21 = this.field8510[var20][var17];
                    if (var21 != null) {
                        class532 var22 = this.field8506.method1153(var21.field1647 * 3, 2);
                        Buffer var23 = var22.method48((byte) -31, true);
                        if (var23 != null) {
                            Stream var24 = this.field8506.method1127(98, var23);
                            int var25 = 0;
                            int var26 = var20 << this.field8511;
                            int var27 = var20 + 1 << this.field8511;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if ((var28 - arg1) >= (-arg5) && arg5 >= (var28 - arg1)) {
                                    int var30 = this.field8505.field4420 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if ((-arg5) <= (var31 - arg2) && var31 - arg2 <= arg5 && arg3[arg5 + var31 - arg2][var28 + arg5 - arg1]) {
                                            short[] var32 = this.field8505.field2334[var30];
                                            if (var32 != null) {
                                                if (Stream.method3956()) {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var25++;
                                                        var24.method3950(var32[var34] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var24.method3962(var32[var33] & 0xFFFF);
                                                        var25++;
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method3959();
                            if (var22.method49(-11488) && var25 > 0) {
                                class468 var29 = this.field8506.method1043(arg4);
                                var29.method2769(1.0F, var7, var7, 96);
                                var29.method1952(-var20, -var17, 0);
                                this.field8506.method1073(class505.field7237, 25216);
                                var21.method917(var25 / 3, (byte) -102, var22);
                            }
                        }
                    }
                }
            }
        }
        this.field8506.method1048(true);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)V")
    public final void method3490(boolean arg0) {
        field8503++;
        this.field8510 = new class125[this.field8508][this.field8502];
        for (int var2 = 0; var2 < this.field8502; var2++) {
            for (int var3 = 0; var3 < this.field8508; var3++) {
                this.field8510[var3][var2] = new class125(this.field8506, this, this.field8505, var3, var2, this.field8511, var3 * 128 + 1, var2 * 128 - -1);
                if (this.field8510[var3][var2].field1647 == 0) {
                    this.field8510[var3][var2] = null;
                }
            }
        }
        if (arg0) {
            this.method3494(66, 123, -30, 113, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIILr;)V")
    public final void method3491(int arg0, int arg1, int arg2, class192 arg3) {
        field8512++;
        class184 var5 = (class184) arg3;
        int var6 = var5.field2780 + arg1 + arg0;
        int var7 = var5.field2779 + arg2 + 1;
        int var8 = var6 + (this.field8514 * var7);
        int var9 = 0;
        int var10 = var5.field2778;
        int var11 = var5.field2775;
        int var12 = this.field8514 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var9 += var11 * var13;
            var8 += this.field8514 * var13;
            var10 -= var13;
        }
        int var14 = 0;
        if (this.field8513 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field8513;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var8 += var16;
            var12 += var16;
            var14 += var16;
            var6 = 1;
            var11 -= var16;
            var9 += var16;
        }
        if (this.field8514 <= var6 + var11) {
            int var17 = var6 + var11 + 1 - this.field8514;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class682.method3854(var5.field2781, var8, var14, var12, var11, this.field8515, var9, var10, false);
            this.method3494(var10, var7, var6, var11, (byte) 105);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IBLr;I)Z")
    public final boolean method3492(int arg0, byte arg1, class192 arg2, int arg3) {
        field8509++;
        class184 var5 = (class184) arg2;
        int var6 = var5.field2779 + arg3 + 1;
        int var7 = var5.field2780 + arg0 + 1;
        int var8 = this.field8514 * var6 + var7;
        int var9 = var5.field2778;
        int var10 = var5.field2775;
        if (arg1 != 78) {
            method3488(-91, -118, false);
        }
        int var11 = this.field8514 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var8 += this.field8514 * var12;
            var9 -= var12;
            var6 = 1;
        }
        if ((var6 + var9) >= this.field8513) {
            int var13 = var6 + var9 + 1 - this.field8513;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += var14;
            var7 = 1;
            var10 -= var14;
            var11 += var14;
        }
        if (var7 + var10 >= this.field8514) {
            int var15 = var7 + var10 + 1 - this.field8514;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field8514 + var11;
            return class110.method747(this.field8515, var10, var8, var16, (byte) 67, var17, var9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BIILr;)V")
    public final void method3493(byte arg0, int arg1, int arg2, class192 arg3) {
        field8507++;
        class184 var5 = (class184) arg3;
        int var6 = var5.field2779 + arg1 + 1;
        int var7 = var5.field2780 + arg2 + 1;
        int var8 = this.field8514 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field2778;
        int var11 = var5.field2775;
        int var12 = this.field8514 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var10 -= var14;
            var8 += this.field8514 * var14;
            var9 += var11 * var14;
        }
        if ((var6 + var10) >= this.field8513) {
            int var15 = var6 + var10 + 1 - this.field8513;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var8 += var16;
            var7 = 1;
            var12 += var16;
            var13 += var16;
            var9 += var16;
        }
        if (arg0 != -70) {
            this.field8502 = -63;
        }
        if (this.field8514 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field8514;
            var12 += var17;
            var13 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class703.method3981(var13, var5.field2781, var11, var9, (byte) 89, var8, this.field8515, var12, var10);
            this.method3494(var10, var6, var7, var11, (byte) 115);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIB)V")
    private final void method3494(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field8504++;
        if (this.field8510 == null || arg4 < 102) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg3 - 1 - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg0 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class125[] var11 = this.field8510[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field1638 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lwk;Lmg;)V")
    public class605(class151 arg0, class157 arg1) {
        this.field8505 = arg1;
        this.field8506 = arg0;
        this.field8514 = (this.field8505.field4420 * this.field8505.field4419 >> this.field8506.field2162) + 2;
        this.field8513 = (this.field8505.field4425 * this.field8505.field4419 >> this.field8506.field2162) + 2;
        this.field8515 = new byte[this.field8514 * this.field8513];
        this.field8511 = this.field8506.field2162 + 7 - this.field8505.field4428;
        this.field8508 = this.field8505.field4420 >> this.field8511;
        this.field8502 = this.field8505.field4425 >> this.field8511;
    }
}
