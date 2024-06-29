import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class259 extends class232 {

    @OriginalMember(owner = "client!le", name = "B", descriptor = "Z")
    private boolean field4103 = false;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public int field4090 = 0;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "I")
    public int field4124 = 0;

    @OriginalMember(owner = "client!le", name = "fb", descriptor = "I")
    public int field4133 = 0;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "B")
    public byte field4113 = 0;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "[I")
    public int[] field4107;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "[I")
    public int[] field4094;

    @OriginalMember(owner = "client!le", name = "db", descriptor = "[I")
    public int[] field4131;

    @OriginalMember(owner = "client!le", name = "kb", descriptor = "[I")
    public int[] field4138;

    @OriginalMember(owner = "client!le", name = "ib", descriptor = "[I")
    public int[] field4136;

    @OriginalMember(owner = "client!le", name = "cb", descriptor = "[I")
    public int[] field4130;

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "[I")
    public int[] field4126;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "[B")
    public byte[] field4089;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "[B")
    public byte[] field4095;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "[B")
    public byte[] field4096;

    @OriginalMember(owner = "client!le", name = "gb", descriptor = "[S")
    public short[] field4134;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "[S")
    public short[] field4121;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "[B")
    public byte[] field4100;

    @OriginalMember(owner = "client!le", name = "hb", descriptor = "[I")
    public int[] field4135;

    @OriginalMember(owner = "client!le", name = "jb", descriptor = "[B")
    public byte[] field4137;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "[S")
    public short[] field4119;

    @OriginalMember(owner = "client!le", name = "ab", descriptor = "[S")
    public short[] field4128;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "[S")
    public short[] field4118;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "[S")
    public short[] field4091;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "[S")
    public short[] field4110;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "[S")
    public short[] field4093;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "[B")
    public byte[] field4092;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "[B")
    public byte[] field4102;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "[B")
    public byte[] field4112;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "[B")
    public byte[] field4108;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "[B")
    public byte[] field4098;

    @OriginalMember(owner = "client!le", name = "S", descriptor = "I")
    public int field4120;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "[S")
    public short[] field4106;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "[S")
    public short[] field4114;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "[[I")
    public int[][] field4101;

    @OriginalMember(owner = "client!le", name = "Z", descriptor = "[[I")
    public int[][] field4127;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "[Lng;")
    public class172[] field4105;

    @OriginalMember(owner = "client!le", name = "eb", descriptor = "[Lnn;")
    public class44[] field4132;

    @OriginalMember(owner = "client!le", name = "bb", descriptor = "[Lng;")
    public class172[] field4129;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "S")
    public short field4109;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "S")
    public short field4123;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "[I")
    private static int[] field4116 = new int[10000];

    @OriginalMember(owner = "client!le", name = "X", descriptor = "[I")
    private static int[] field4125 = class25.field355;

    @OriginalMember(owner = "client!le", name = "lb", descriptor = "[I")
    private static int[] field4139 = class25.field359;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "[I")
    private static int[] field4117 = new int[10000];

    @OriginalMember(owner = "client!le", name = "U", descriptor = "I")
    private static int field4122 = 0;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "S")
    private short field4097;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "S")
    private short field4099;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "S")
    private short field4104;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "S")
    private short field4111;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "S")
    private short field4115;

    @OriginalMember(owner = "client!le", name = "mb", descriptor = "S")
    private short field4140;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "()V", line = 6)
    public final void method1831() {
        for (int var1 = 0; var1 < this.field4090; var1++) {
            this.field4131[var1] = -this.field4131[var1];
        }
        for (int var2 = 0; var2 < this.field4133; var2++) {
            int var3 = this.field4136[var2];
            this.field4136[var2] = this.field4126[var2];
            this.field4126[var2] = var3;
        }
        this.method1848();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(SS)V", line = 29)
    public final void method1832(short arg0, short arg1) {
        if (this.field4121 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field4133; var3++) {
            if (this.field4121[var3] == arg0) {
                this.field4121[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "()V", line = 45)
    public static void method1833() {
        field4116 = null;
        field4117 = null;
        field4125 = null;
        field4139 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lle;IS)I", line = 61)
    private final int method1834(class259 arg0, int arg1, short arg2) {
        int var4 = arg0.field4107[arg1];
        int var5 = arg0.field4094[arg1];
        int var6 = arg0.field4131[arg1];
        for (int var7 = 0; var7 < this.field4090; var7++) {
            if (this.field4107[var7] == var4 && this.field4094[var7] == var5 && this.field4131[var7] == var6) {
                this.field4106[var7] |= arg2;
                return var7;
            }
        }
        this.field4107[this.field4090] = var4;
        this.field4094[this.field4090] = var5;
        this.field4131[this.field4090] = var6;
        this.field4106[this.field4090] = arg2;
        if (arg0.field4138 != null) {
            this.field4138[this.field4090] = arg0.field4138[arg1];
        }
        return this.field4090++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lkb;II)Lle;", line = 92)
    public static final class259 method1835(class39 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method250(true, arg1, arg2);
        return var3 == null ? null : new class259(var3);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIBSB)I", line = 106)
    public final int method1836(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field4136[this.field4133] = arg0;
        this.field4130[this.field4133] = arg1;
        this.field4126[this.field4133] = arg2;
        this.field4089[this.field4133] = arg3;
        this.field4100[this.field4133] = -1;
        this.field4134[this.field4133] = arg4;
        this.field4121[this.field4133] = -1;
        this.field4096[this.field4133] = arg5;
        return this.field4133++;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(III)I", line = 122)
    public final int method1837(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4090; var4++) {
            if (this.field4107[var4] == arg0 && this.field4094[var4] == arg1 && this.field4131[var4] == arg2) {
                return var4;
            }
        }
        this.field4107[this.field4090] = arg0;
        this.field4094[this.field4090] = arg1;
        this.field4131[this.field4090] = arg2;
        this.field4124 = ++this.field4090;
        return this.field4090 - 1;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([[III)I", line = 137)
    private static final int method1838(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(III)V", line = 154)
    public final void method1839(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field4125[arg2];
            int var5 = field4139[arg2];
            for (int var6 = 0; var6 < this.field4090; var6++) {
                int var7 = this.field4107[var6] * var5 + this.field4094[var6] * var4 >> 16;
                this.field4094[var6] = this.field4094[var6] * var5 - this.field4107[var6] * var4 >> 16;
                this.field4107[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field4125[arg0];
            int var9 = field4139[arg0];
            for (int var10 = 0; var10 < this.field4090; var10++) {
                int var11 = this.field4094[var10] * var9 - this.field4131[var10] * var8 >> 16;
                this.field4131[var10] = this.field4131[var10] * var9 + this.field4094[var10] * var8 >> 16;
                this.field4094[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field4125[arg1];
        int var13 = field4139[arg1];
        for (int var14 = 0; var14 < this.field4090; var14++) {
            int var15 = this.field4131[var14] * var12 + this.field4107[var14] * var13 >> 16;
            this.field4131[var14] = this.field4131[var14] * var13 - this.field4107[var14] * var12 >> 16;
            this.field4107[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)Lh;", line = 217)
    public final class232 method494(int arg0, int arg1, int arg2) {
        return this.method1855(this.field4109, this.field4123, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "()Lle;", line = 223)
    public final class259 method1840() {
        class259 var1 = new class259();
        if (this.field4089 != null) {
            var1.field4089 = new byte[this.field4133];
            for (int var2 = 0; var2 < this.field4133; var2++) {
                var1.field4089[var2] = this.field4089[var2];
            }
        }
        var1.field4090 = this.field4090;
        var1.field4124 = this.field4124;
        var1.field4133 = this.field4133;
        var1.field4120 = this.field4120;
        var1.field4107 = this.field4107;
        var1.field4094 = this.field4094;
        var1.field4131 = this.field4131;
        var1.field4136 = this.field4136;
        var1.field4130 = this.field4130;
        var1.field4126 = this.field4126;
        var1.field4095 = this.field4095;
        var1.field4096 = this.field4096;
        var1.field4100 = this.field4100;
        var1.field4134 = this.field4134;
        var1.field4121 = this.field4121;
        var1.field4113 = this.field4113;
        var1.field4137 = this.field4137;
        var1.field4119 = this.field4119;
        var1.field4128 = this.field4128;
        var1.field4118 = this.field4118;
        var1.field4091 = this.field4091;
        var1.field4110 = this.field4110;
        var1.field4093 = this.field4093;
        var1.field4092 = this.field4092;
        var1.field4102 = this.field4102;
        var1.field4112 = this.field4112;
        var1.field4108 = this.field4108;
        var1.field4098 = this.field4098;
        var1.field4138 = this.field4138;
        var1.field4135 = this.field4135;
        var1.field4101 = this.field4101;
        var1.field4127 = this.field4127;
        var1.field4105 = this.field4105;
        var1.field4132 = this.field4132;
        var1.field4109 = this.field4109;
        var1.field4123 = this.field4123;
        return var1;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIIJILll;)V", line = 279)
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class167 arg10) {
    }

    @OriginalMember(owner = "client!le", name = "f", descriptor = "()V", line = 288)
    public final void method1841() {
        for (int var1 = 0; var1 < this.field4090; var1++) {
            this.field4107[var1] = -this.field4107[var1];
            this.field4131[var1] = -this.field4131[var1];
        }
        this.method1848();
    }

    @OriginalMember(owner = "client!le", name = "g", descriptor = "()V", line = 300)
    public final void method1842() {
        this.field4138 = null;
        this.field4135 = null;
        this.field4101 = (int[][]) null;
        this.field4127 = (int[][]) null;
    }

    @OriginalMember(owner = "client!le", name = "h", descriptor = "()V", line = 306)
    public final void method1843() {
        if (this.field4105 != null) {
            return;
        }
        this.field4105 = new class172[this.field4124];
        for (int var1 = 0; var1 < this.field4124; var1++) {
            this.field4105[var1] = new class172();
        }
        for (int var2 = 0; var2 < this.field4133; var2++) {
            int var3 = this.field4136[var2];
            int var4 = this.field4130[var2];
            int var5 = this.field4126[var2];
            int var6 = this.field4107[var4] - this.field4107[var3];
            int var7 = this.field4094[var4] - this.field4094[var3];
            int var8 = this.field4131[var4] - this.field4131[var3];
            int var9 = this.field4107[var5] - this.field4107[var3];
            int var10 = this.field4094[var5] - this.field4094[var3];
            int var11 = this.field4131[var5] - this.field4131[var3];
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
            if (this.field4089 == null) {
                var19 = 0;
            } else {
                var19 = this.field4089[var2];
            }
            if (var19 == 0) {
                class172 var20 = this.field4105[var3];
                var20.field2740 += var16;
                var20.field2742 += var17;
                var20.field2734 += var18;
                var20.field2738++;
                class172 var21 = this.field4105[var4];
                var21.field2740 += var16;
                var21.field2742 += var17;
                var21.field2734 += var18;
                var21.field2738++;
                class172 var22 = this.field4105[var5];
                var22.field2740 += var16;
                var22.field2742 += var17;
                var22.field2734 += var18;
                var22.field2738++;
            } else if (var19 == 1) {
                if (this.field4132 == null) {
                    this.field4132 = new class44[this.field4133];
                }
                class44 var23 = this.field4132[var2] = new class44();
                var23.field596 = var16;
                var23.field597 = var17;
                var23.field599 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(IIIII)Lom;", line = 405)
    public final class76 method1844(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class76(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()Z", line = 408)
    public final boolean method509() {
        return true;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II[[I[[IIIIZZ)Lle;", line = 411)
    public final class259 method1845(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1849();
        int var10 = this.field4140 + arg4;
        int var11 = this.field4097 + arg4;
        int var12 = this.field4111 + arg6;
        int var13 = this.field4104 + arg6;
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
        class259 var18;
        if (arg7) {
            var18 = new class259();
            var18.field4090 = this.field4090;
            var18.field4124 = this.field4124;
            var18.field4133 = this.field4133;
            var18.field4120 = this.field4120;
            var18.field4136 = this.field4136;
            var18.field4130 = this.field4130;
            var18.field4126 = this.field4126;
            var18.field4089 = this.field4089;
            var18.field4095 = this.field4095;
            var18.field4096 = this.field4096;
            var18.field4100 = this.field4100;
            var18.field4134 = this.field4134;
            var18.field4121 = this.field4121;
            var18.field4113 = this.field4113;
            var18.field4137 = this.field4137;
            var18.field4119 = this.field4119;
            var18.field4128 = this.field4128;
            var18.field4118 = this.field4118;
            var18.field4091 = this.field4091;
            var18.field4110 = this.field4110;
            var18.field4093 = this.field4093;
            var18.field4092 = this.field4092;
            var18.field4102 = this.field4102;
            var18.field4112 = this.field4112;
            var18.field4108 = this.field4108;
            var18.field4098 = this.field4098;
            var18.field4138 = this.field4138;
            var18.field4135 = this.field4135;
            var18.field4101 = this.field4101;
            var18.field4127 = this.field4127;
            var18.field4109 = this.field4109;
            var18.field4123 = this.field4123;
            var18.field4105 = this.field4105;
            var18.field4132 = this.field4132;
            var18.field4129 = this.field4129;
            if (arg0 == 3) {
                var18.field4107 = class97.method692(this.field4107, (byte) -94);
                var18.field4094 = class97.method692(this.field4094, (byte) -94);
                var18.field4131 = class97.method692(this.field4131, (byte) -94);
            } else {
                var18.field4107 = this.field4107;
                var18.field4094 = new int[var18.field4090];
                var18.field4131 = this.field4131;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field4124; var19++) {
                int var20 = this.field4107[var19] + arg4;
                int var21 = this.field4131[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field4094[var19] = this.field4094[var19] + var28 - arg5;
            }
            for (int var29 = var18.field4124; var29 < var18.field4090; var29++) {
                int var30 = this.field4107[var29] + arg4;
                int var31 = this.field4131[var29] + arg6;
                int var32 = var30 & 0x7F;
                int var33 = var31 & 0x7F;
                int var34 = var30 >> 7;
                int var35 = var31 >> 7;
                if (var34 >= 0 && var34 < arg2.length - 1 && var35 >= 0 && var35 < arg2[0].length - 1) {
                    int var36 = (128 - var32) * arg2[var34][var35] + arg2[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg2[var34][var35 + 1] + arg2[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    var18.field4094[var29] = this.field4094[var29] + var38 - arg5;
                }
            }
        } else if (arg0 == 2) {
            for (int var39 = 0; var39 < var18.field4124; var39++) {
                int var40 = (this.field4094[var39] << 16) / this.field4099;
                if (var40 < arg1) {
                    int var41 = this.field4107[var39] + arg4;
                    int var42 = this.field4131[var39] + arg6;
                    int var43 = var41 & 0x7F;
                    int var44 = var42 & 0x7F;
                    int var45 = var41 >> 7;
                    int var46 = var42 >> 7;
                    int var47 = (128 - var43) * arg2[var45][var46] + arg2[var45 + 1][var46] * var43 >> 7;
                    int var48 = (128 - var43) * arg2[var45][var46 + 1] + arg2[var45 + 1][var46 + 1] * var43 >> 7;
                    int var49 = (128 - var44) * var47 + var44 * var48 >> 7;
                    var18.field4094[var39] = (arg1 - var40) * (var49 - arg5) / arg1 + this.field4094[var39];
                } else {
                    var18.field4094[var39] = this.field4094[var39];
                }
            }
            for (int var50 = var18.field4124; var50 < var18.field4090; var50++) {
                int var51 = (this.field4094[var50] << 16) / this.field4099;
                if (var51 < arg1) {
                    int var52 = this.field4107[var50] + arg4;
                    int var53 = this.field4131[var50] + arg6;
                    int var54 = var52 & 0x7F;
                    int var55 = var53 & 0x7F;
                    int var56 = var52 >> 7;
                    int var57 = var53 >> 7;
                    if (var56 >= 0 && var56 < arg2.length - 1 && var57 >= 0 && var57 < arg2[0].length - 1) {
                        int var58 = (128 - var54) * arg2[var56][var57] + arg2[var56 + 1][var57] * var54 >> 7;
                        int var59 = (128 - var54) * arg2[var56][var57 + 1] + arg2[var56 + 1][var57 + 1] * var54 >> 7;
                        int var60 = (128 - var55) * var58 + var55 * var59 >> 7;
                        var18.field4094[var50] = (arg1 - var51) * (var60 - arg5) / arg1 + this.field4094[var50];
                    }
                } else {
                    var18.field4094[var50] = this.field4094[var50];
                }
            }
        } else if (arg0 == 3) {
            int var61 = (arg1 & 0xFF) * 4;
            int var62 = (arg1 >> 8 & 0xFF) * 4;
            var18.method1852(arg2, arg4, arg5, arg6, var61, var62);
        } else if (arg0 == 4) {
            int var63 = this.field4115 - this.field4099;
            for (int var64 = 0; var64 < this.field4124; var64++) {
                int var65 = this.field4107[var64] + arg4;
                int var66 = this.field4131[var64] + arg6;
                int var67 = var65 & 0x7F;
                int var68 = var66 & 0x7F;
                int var69 = var65 >> 7;
                int var70 = var66 >> 7;
                int var71 = (128 - var67) * arg3[var69][var70] + arg3[var69 + 1][var70] * var67 >> 7;
                int var72 = (128 - var67) * arg3[var69][var70 + 1] + arg3[var69 + 1][var70 + 1] * var67 >> 7;
                int var73 = (128 - var68) * var71 + var68 * var72 >> 7;
                var18.field4094[var64] = var73 + this.field4094[var64] + var63 - arg5;
            }
            for (int var74 = var18.field4124; var74 < var18.field4090; var74++) {
                int var75 = this.field4107[var74] + arg4;
                int var76 = this.field4131[var74] + arg6;
                int var77 = var75 & 0x7F;
                int var78 = var76 & 0x7F;
                int var79 = var75 >> 7;
                int var80 = var76 >> 7;
                if (var79 >= 0 && var79 < arg3.length - 1 && var80 >= 0 && var80 < arg3[0].length - 1) {
                    int var81 = (128 - var77) * arg3[var79][var80] + arg3[var79 + 1][var80] * var77 >> 7;
                    int var82 = (128 - var77) * arg3[var79][var80 + 1] + arg3[var79 + 1][var80 + 1] * var77 >> 7;
                    int var83 = (128 - var78) * var81 + var78 * var82 >> 7;
                    var18.field4094[var74] = var83 + this.field4094[var74] + var63 - arg5;
                }
            }
        } else if (arg0 == 5) {
            int var84 = this.field4115 - this.field4099;
            for (int var85 = 0; var85 < this.field4124; var85++) {
                int var86 = this.field4107[var85] + arg4;
                int var87 = this.field4131[var85] + arg6;
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
                var18.field4094[var85] = ((this.field4094[var85] << 8) / var84 * var98 >> 8) - (arg5 - var94);
            }
            for (int var99 = var18.field4124; var99 < var18.field4090; var99++) {
                int var100 = this.field4107[var99] + arg4;
                int var101 = this.field4131[var99] + arg6;
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
                    var18.field4094[var99] = ((this.field4094[var99] << 8) / var84 * var112 >> 8) - (arg5 - var108);
                }
            }
        }
        if (arg8) {
            var18.method1848();
        } else {
            this.field4103 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!le", name = "i", descriptor = "()V", line = 807)
    public final void method1846() {
        int var10002;
        if (this.field4138 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field4090; var3++) {
                int var4 = this.field4138[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field4101 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field4101[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field4090) {
                int var7 = this.field4138[var6];
                this.field4101[var7][var1[var7]++] = var6++;
            }
            this.field4138 = null;
        }
        if (this.field4135 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field4133; var10++) {
            int var11 = this.field4135[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field4127 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field4127[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field4133) {
            int var14 = this.field4135[var13];
            this.field4127[var14][var8[var14]++] = var13++;
        }
        this.field4135 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 901)
    private final void method1847(int arg0) {
        int var2 = field4125[arg0];
        int var3 = field4139[arg0];
        for (int var4 = 0; var4 < this.field4090; var4++) {
            int var5 = this.field4107[var4] * var3 + this.field4094[var4] * var2 >> 16;
            this.field4094[var4] = this.field4094[var4] * var3 - this.field4107[var4] * var2 >> 16;
            this.field4107[var4] = var5;
        }
        this.method1848();
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V", line = 2193)
    private class259() {
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "([B)V", line = 2195)
    private class259(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1858(arg0);
        } else {
            this.method1856(arg0);
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(III)V", line = 2202)
    public class259(int arg0, int arg1, int arg2) {
        this.field4107 = new int[arg0];
        this.field4094 = new int[arg0];
        this.field4131 = new int[arg0];
        this.field4138 = new int[arg0];
        this.field4136 = new int[arg1];
        this.field4130 = new int[arg1];
        this.field4126 = new int[arg1];
        this.field4089 = new byte[arg1];
        this.field4095 = new byte[arg1];
        this.field4096 = new byte[arg1];
        this.field4134 = new short[arg1];
        this.field4121 = new short[arg1];
        this.field4100 = new byte[arg1];
        this.field4135 = new int[arg1];
        if (arg2 > 0) {
            this.field4137 = new byte[arg2];
            this.field4119 = new short[arg2];
            this.field4128 = new short[arg2];
            this.field4118 = new short[arg2];
            this.field4091 = new short[arg2];
            this.field4110 = new short[arg2];
            this.field4093 = new short[arg2];
            this.field4092 = new byte[arg2];
            this.field4102 = new byte[arg2];
            this.field4112 = new byte[arg2];
            this.field4108 = new byte[arg2];
            this.field4098 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "([Lle;I)V", line = 2235)
    public class259(class259[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field4090 = 0;
        this.field4133 = 0;
        this.field4120 = 0;
        byte var9 = 0;
        byte var10 = 0;
        this.field4113 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class259 var12 = arg0[var11];
            if (var12 != null) {
                this.field4090 += var12.field4090;
                this.field4133 += var12.field4133;
                this.field4120 += var12.field4120;
                if (var12.field4095 == null) {
                    if (this.field4113 == -1) {
                        this.field4113 = var12.field4113;
                    }
                    if (this.field4113 != var12.field4113) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var12.field4089 != null;
                var5 |= var12.field4096 != null;
                var6 |= var12.field4135 != null;
                var7 |= var12.field4121 != null;
                var8 |= var12.field4100 != null;
            }
        }
        this.field4107 = new int[this.field4090];
        this.field4094 = new int[this.field4090];
        this.field4131 = new int[this.field4090];
        this.field4138 = new int[this.field4090];
        this.field4106 = new short[this.field4090];
        this.field4136 = new int[this.field4133];
        this.field4130 = new int[this.field4133];
        this.field4126 = new int[this.field4133];
        if (var3) {
            this.field4089 = new byte[this.field4133];
        }
        if (var4) {
            this.field4095 = new byte[this.field4133];
        }
        if (var5) {
            this.field4096 = new byte[this.field4133];
        }
        if (var6) {
            this.field4135 = new int[this.field4133];
        }
        if (var7) {
            this.field4121 = new short[this.field4133];
        }
        if (var8) {
            this.field4100 = new byte[this.field4133];
        }
        if (var9 > 0) {
        }
        if (var10 > 0) {
        }
        this.field4134 = new short[this.field4133];
        this.field4114 = new short[this.field4133];
        if (this.field4120 > 0) {
            this.field4137 = new byte[this.field4120];
            this.field4119 = new short[this.field4120];
            this.field4128 = new short[this.field4120];
            this.field4118 = new short[this.field4120];
            this.field4091 = new short[this.field4120];
            this.field4110 = new short[this.field4120];
            this.field4093 = new short[this.field4120];
            this.field4092 = new byte[this.field4120];
            this.field4102 = new byte[this.field4120];
            this.field4112 = new byte[this.field4120];
            this.field4108 = new byte[this.field4120];
            this.field4098 = new byte[this.field4120];
        }
        this.field4090 = 0;
        this.field4133 = 0;
        this.field4120 = 0;
        boolean var13 = false;
        boolean var14 = false;
        for (int var15 = 0; var15 < arg1; var15++) {
            short var16 = (short) (0x1 << var15);
            class259 var17 = arg0[var15];
            if (var17 != null) {
                for (int var18 = 0; var18 < var17.field4133; var18++) {
                    if (var3 && var17.field4089 != null) {
                        this.field4089[this.field4133] = var17.field4089[var18];
                    }
                    if (var4) {
                        if (var17.field4095 == null) {
                            this.field4095[this.field4133] = var17.field4113;
                        } else {
                            this.field4095[this.field4133] = var17.field4095[var18];
                        }
                    }
                    if (var5 && var17.field4096 != null) {
                        this.field4096[this.field4133] = var17.field4096[var18];
                    }
                    if (var6 && var17.field4135 != null) {
                        this.field4135[this.field4133] = var17.field4135[var18];
                    }
                    if (var7) {
                        if (var17.field4121 == null) {
                            this.field4121[this.field4133] = -1;
                        } else {
                            this.field4121[this.field4133] = var17.field4121[var18];
                        }
                    }
                    this.field4134[this.field4133] = var17.field4134[var18];
                    this.field4114[this.field4133] = var16;
                    this.field4136[this.field4133] = this.method1834(var17, var17.field4136[var18], var16);
                    this.field4130[this.field4133] = this.method1834(var17, var17.field4130[var18], var16);
                    this.field4126[this.field4133] = this.method1834(var17, var17.field4126[var18], var16);
                    this.field4133++;
                }
            }
        }
        int var19 = 0;
        this.field4124 = this.field4090;
        for (int var20 = 0; var20 < arg1; var20++) {
            class259 var21 = arg0[var20];
            short var22 = (short) (0x1 << var20);
            if (var21 != null) {
                for (int var23 = 0; var23 < var21.field4133; var23++) {
                    if (var8) {
                        this.field4100[var19++] = (byte) (var21.field4100 == null || var21.field4100[var23] == -1 ? -1 : var21.field4100[var23] + this.field4120);
                    }
                }
                for (int var24 = 0; var24 < var21.field4120; var24++) {
                    byte var25 = this.field4137[this.field4120] = var21.field4137[var24];
                    if (var25 == 0) {
                        this.field4119[this.field4120] = (short) this.method1834(var21, var21.field4119[var24], var22);
                        this.field4128[this.field4120] = (short) this.method1834(var21, var21.field4128[var24], var22);
                        this.field4118[this.field4120] = (short) this.method1834(var21, var21.field4118[var24], var22);
                    }
                    if (var25 >= 1 && var25 <= 3) {
                        this.field4119[this.field4120] = var21.field4119[var24];
                        this.field4128[this.field4120] = var21.field4128[var24];
                        this.field4118[this.field4120] = var21.field4118[var24];
                        this.field4091[this.field4120] = var21.field4091[var24];
                        this.field4110[this.field4120] = var21.field4110[var24];
                        this.field4093[this.field4120] = var21.field4093[var24];
                        this.field4092[this.field4120] = var21.field4092[var24];
                        this.field4102[this.field4120] = var21.field4102[var24];
                        this.field4112[this.field4120] = var21.field4112[var24];
                    }
                    if (var25 == 2) {
                        this.field4108[this.field4120] = var21.field4108[var24];
                        this.field4098[this.field4120] = var21.field4098[var24];
                    }
                    this.field4120++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lle;ZZZZ)V", line = 2490)
    public class259(class259 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field4090 = arg0.field4090;
        this.field4124 = arg0.field4124;
        this.field4133 = arg0.field4133;
        this.field4120 = arg0.field4120;
        if (arg1) {
            this.field4107 = arg0.field4107;
            this.field4094 = arg0.field4094;
            this.field4131 = arg0.field4131;
        } else {
            this.field4107 = new int[this.field4090];
            this.field4094 = new int[this.field4090];
            this.field4131 = new int[this.field4090];
            for (int var6 = 0; var6 < this.field4090; var6++) {
                this.field4107[var6] = arg0.field4107[var6];
                this.field4094[var6] = arg0.field4094[var6];
                this.field4131[var6] = arg0.field4131[var6];
            }
        }
        if (arg2) {
            this.field4134 = arg0.field4134;
        } else {
            this.field4134 = new short[this.field4133];
            for (int var7 = 0; var7 < this.field4133; var7++) {
                this.field4134[var7] = arg0.field4134[var7];
            }
        }
        if (arg3 || arg0.field4121 == null) {
            this.field4121 = arg0.field4121;
        } else {
            this.field4121 = new short[this.field4133];
            for (int var8 = 0; var8 < this.field4133; var8++) {
                this.field4121[var8] = arg0.field4121[var8];
            }
        }
        if (arg4) {
            this.field4096 = arg0.field4096;
        } else {
            this.field4096 = new byte[this.field4133];
            if (arg0.field4096 == null) {
                for (int var9 = 0; var9 < this.field4133; var9++) {
                    this.field4096[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field4133; var10++) {
                    this.field4096[var10] = arg0.field4096[var10];
                }
            }
        }
        this.field4136 = arg0.field4136;
        this.field4130 = arg0.field4130;
        this.field4126 = arg0.field4126;
        this.field4089 = arg0.field4089;
        this.field4095 = arg0.field4095;
        this.field4100 = arg0.field4100;
        this.field4113 = arg0.field4113;
        this.field4137 = arg0.field4137;
        this.field4119 = arg0.field4119;
        this.field4128 = arg0.field4128;
        this.field4118 = arg0.field4118;
        this.field4091 = arg0.field4091;
        this.field4110 = arg0.field4110;
        this.field4093 = arg0.field4093;
        this.field4092 = arg0.field4092;
        this.field4102 = arg0.field4102;
        this.field4112 = arg0.field4112;
        this.field4108 = arg0.field4108;
        this.field4098 = arg0.field4098;
        this.field4138 = arg0.field4138;
        this.field4135 = arg0.field4135;
        this.field4101 = arg0.field4101;
        this.field4127 = arg0.field4127;
        this.field4105 = arg0.field4105;
        this.field4132 = arg0.field4132;
        this.field4129 = arg0.field4129;
        this.field4109 = arg0.field4109;
        this.field4123 = arg0.field4123;
    }

    @OriginalMember(owner = "client!le", name = "j", descriptor = "()V", line = 927)
    private final void method1848() {
        this.field4105 = null;
        this.field4129 = null;
        this.field4132 = null;
        this.field4103 = false;
    }

    @OriginalMember(owner = "client!le", name = "k", descriptor = "()V", line = 940)
    private final void method1849() {
        if (this.field4103) {
            return;
        }
        this.field4103 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field4124; var7++) {
            int var8 = this.field4107[var7];
            int var9 = this.field4094[var7];
            int var10 = this.field4131[var7];
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
        this.field4140 = (short) var1;
        this.field4097 = (short) var4;
        this.field4099 = (short) var2;
        this.field4115 = (short) var5;
        this.field4111 = (short) var3;
        this.field4104 = (short) var6;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "()I", line = 997)
    public final int method152() {
        if (!this.field4103) {
            this.method1849();
        }
        return this.field4099;
    }

    @OriginalMember(owner = "client!le", name = "l", descriptor = "()V", line = 1005)
    public final void method1850() {
        for (int var1 = 0; var1 < this.field4090; var1++) {
            int var2 = this.field4131[var1];
            this.field4131[var1] = this.field4107[var1];
            this.field4107[var1] = -var2;
        }
        this.method1848();
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(III)V", line = 1020)
    public final void method1851(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4090; var4++) {
            this.field4107[var4] = this.field4107[var4] * arg0 / 128;
            this.field4094[var4] = this.field4094[var4] * arg1 / 128;
            this.field4131[var4] = this.field4131[var4] * arg2 / 128;
        }
        this.method1848();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([[IIIIII)V", line = 1035)
    private final void method1852(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1838(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1838(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1838(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1838(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1854(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1847(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1857(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!le", name = "m", descriptor = "()V", line = 1105)
    public final void method1853() {
        for (int var1 = 0; var1 < this.field4090; var1++) {
            int var2 = this.field4107[var1];
            this.field4107[var1] = this.field4131[var1];
            this.field4131[var1] = -var2;
        }
        this.method1848();
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 1120)
    private final void method1854(int arg0) {
        int var2 = field4125[arg0];
        int var3 = field4139[arg0];
        for (int var4 = 0; var4 < this.field4090; var4++) {
            int var5 = this.field4094[var4] * var3 - this.field4131[var4] * var2 >> 16;
            this.field4131[var4] = this.field4131[var4] * var3 + this.field4094[var4] * var2 >> 16;
            this.field4094[var4] = var5;
        }
        this.method1848();
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(IIIII)Llf;", line = 1144)
    public final class134 method1855(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class186.field2991) {
            class75 var6 = new class75(this, arg0, arg1, true);
            var6.method508();
            return var6;
        } else {
            return new class76(this, arg0, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lh;IIIZ)V", line = 1163)
    public final void method550(class232 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class259 var6 = (class259) arg0;
        var6.method1849();
        var6.method1843();
        field4122++;
        int var7 = 0;
        int[] var8 = var6.field4107;
        int var9 = var6.field4124;
        for (int var10 = 0; var10 < this.field4124; var10++) {
            class172 var11 = this.field4105[var10];
            if (var11.field2738 != 0) {
                int var12 = this.field4094[var10] - arg2;
                if (var12 >= var6.field4099 && var12 <= var6.field4115) {
                    int var13 = this.field4107[var10] - arg1;
                    if (var13 >= var6.field4140 && var13 <= var6.field4097) {
                        int var14 = this.field4131[var10] - arg3;
                        if (var14 >= var6.field4111 && var14 <= var6.field4104) {
                            for (int var15 = 0; var15 < var9; var15++) {
                                class172 var16 = var6.field4105[var15];
                                if (var8[var15] == var13 && var6.field4131[var15] == var14 && var6.field4094[var15] == var12 && var16.field2738 != 0) {
                                    if (this.field4129 == null) {
                                        this.field4129 = new class172[this.field4124];
                                    }
                                    if (var6.field4129 == null) {
                                        var6.field4129 = new class172[var9];
                                    }
                                    class172 var17 = this.field4129[var10];
                                    if (var17 == null) {
                                        var17 = this.field4129[var10] = new class172(var11);
                                    }
                                    class172 var18 = var6.field4129[var15];
                                    if (var18 == null) {
                                        var18 = var6.field4129[var15] = new class172(var16);
                                    }
                                    var17.field2740 += var16.field2740;
                                    var17.field2742 += var16.field2742;
                                    var17.field2734 += var16.field2734;
                                    var17.field2738 += var16.field2738;
                                    var18.field2740 += var11.field2740;
                                    var18.field2742 += var11.field2742;
                                    var18.field2734 += var11.field2734;
                                    var18.field2738 += var11.field2738;
                                    var7++;
                                    field4116[var10] = field4122;
                                    field4117[var15] = field4122;
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
        for (int var19 = 0; var19 < this.field4133; var19++) {
            if (field4116[this.field4136[var19]] == field4122 && field4116[this.field4130[var19]] == field4122 && field4116[this.field4126[var19]] == field4122) {
                if (this.field4089 == null) {
                    this.field4089 = new byte[this.field4133];
                }
                this.field4089[var19] = 2;
            }
        }
        for (int var20 = 0; var20 < var6.field4133; var20++) {
            if (field4117[var6.field4136[var20]] == field4122 && field4117[var6.field4130[var20]] == field4122 && field4117[var6.field4126[var20]] == field4122) {
                if (var6.field4089 == null) {
                    var6.field4089 = new byte[var6.field4133];
                }
                var6.field4089[var20] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([B)V", line = 1282)
    private final void method1856(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class192 var4 = new class192(arg0);
        class192 var5 = new class192(arg0);
        class192 var6 = new class192(arg0);
        class192 var7 = new class192(arg0);
        class192 var8 = new class192(arg0);
        var4.field3129 = arg0.length - 18;
        int var9 = var4.method1396(-36);
        int var10 = var4.method1396(-40);
        int var11 = var4.method1399(-1172389784);
        int var12 = var4.method1399(-1172389784);
        int var13 = var4.method1399(-1172389784);
        int var14 = var4.method1399(-1172389784);
        int var15 = var4.method1399(-1172389784);
        int var16 = var4.method1399(-1172389784);
        int var17 = var4.method1396(-46);
        int var18 = var4.method1396(-45);
        int var19 = var4.method1396(-48);
        int var20 = var4.method1396(-80);
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
        this.field4090 = var9;
        this.field4133 = var10;
        this.field4120 = var11;
        this.field4107 = new int[var9];
        this.field4094 = new int[var9];
        this.field4131 = new int[var9];
        this.field4136 = new int[var10];
        this.field4130 = new int[var10];
        this.field4126 = new int[var10];
        if (var11 > 0) {
            this.field4137 = new byte[var11];
            this.field4119 = new short[var11];
            this.field4128 = new short[var11];
            this.field4118 = new short[var11];
        }
        if (var16 == 1) {
            this.field4138 = new int[var9];
        }
        if (var12 == 1) {
            this.field4089 = new byte[var10];
            this.field4100 = new byte[var10];
            this.field4121 = new short[var10];
        }
        if (var13 == 255) {
            this.field4095 = new byte[var10];
        } else {
            this.field4113 = (byte) var13;
        }
        if (var14 == 1) {
            this.field4096 = new byte[var10];
        }
        if (var15 == 1) {
            this.field4135 = new int[var10];
        }
        this.field4134 = new short[var10];
        var4.field3129 = var21;
        var5.field3129 = var36;
        var6.field3129 = var38;
        var7.field3129 = var40;
        var8.field3129 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method1399(-1172389784);
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method1402(-21420);
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method1402(-21420);
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method1402(-21420);
            }
            this.field4107[var46] = var43 + var48;
            this.field4094[var46] = var44 + var49;
            this.field4131[var46] = var45 + var50;
            var43 = this.field4107[var46];
            var44 = this.field4094[var46];
            var45 = this.field4131[var46];
            if (var16 == 1) {
                this.field4138[var46] = var8.method1399(-1172389784);
            }
        }
        var4.field3129 = var32;
        var5.field3129 = var28;
        var6.field3129 = var26;
        var7.field3129 = var30;
        var8.field3129 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field4134[var51] = (short) var4.method1396(-59);
            if (var12 == 1) {
                int var52 = var5.method1399(-1172389784);
                if ((var52 & 0x1) == 1) {
                    this.field4089[var51] = 1;
                    var2 = true;
                } else {
                    this.field4089[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field4100[var51] = (byte) (var52 >> 2);
                    this.field4121[var51] = this.field4134[var51];
                    this.field4134[var51] = 127;
                    if (this.field4121[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field4100[var51] = -1;
                    this.field4121[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field4095[var51] = var6.method1377(true);
            }
            if (var14 == 1) {
                this.field4096[var51] = var7.method1377(true);
            }
            if (var15 == 1) {
                this.field4135[var51] = var8.method1399(-1172389784);
            }
        }
        this.field4124 = -1;
        var4.field3129 = var25;
        var5.field3129 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method1399(-1172389784);
            if (var58 == 1) {
                var53 = var4.method1402(-21420) + var56;
                var54 = var4.method1402(-21420) + var53;
                var55 = var4.method1402(-21420) + var54;
                var56 = var55;
                this.field4136[var57] = var53;
                this.field4130[var57] = var54;
                this.field4126[var57] = var55;
                if (var53 > this.field4124) {
                    this.field4124 = var53;
                }
                if (var54 > this.field4124) {
                    this.field4124 = var54;
                }
                if (var55 > this.field4124) {
                    this.field4124 = var55;
                }
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method1402(-21420) + var56;
                var56 = var55;
                this.field4136[var57] = var53;
                this.field4130[var57] = var54;
                this.field4126[var57] = var55;
                if (var55 > this.field4124) {
                    this.field4124 = var55;
                }
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method1402(-21420) + var56;
                var56 = var55;
                this.field4136[var57] = var53;
                this.field4130[var57] = var54;
                this.field4126[var57] = var55;
                if (var55 > this.field4124) {
                    this.field4124 = var55;
                }
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method1402(-21420) + var56;
                var56 = var55;
                this.field4136[var57] = var53;
                this.field4130[var57] = var61;
                this.field4126[var57] = var55;
                if (var55 > this.field4124) {
                    this.field4124 = var55;
                }
            }
        }
        this.field4124++;
        var4.field3129 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field4137[var62] = 0;
            this.field4119[var62] = (short) var4.method1396(-24);
            this.field4128[var62] = (short) var4.method1396(-24);
            this.field4118[var62] = (short) var4.method1396(-46);
        }
        if (this.field4100 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field4100[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field4119[var65] & 0xFFFF) == this.field4136[var64] && (this.field4128[var65] & 0xFFFF) == this.field4130[var64] && (this.field4118[var65] & 0xFFFF) == this.field4126[var64]) {
                        this.field4100[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field4100 = null;
            }
        }
        if (!var3) {
            this.field4121 = null;
        }
        if (!var2) {
            this.field4089 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(III)V", line = 1644)
    public final void method1857(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4090; var4++) {
            this.field4107[var4] += arg0;
            this.field4094[var4] += arg1;
            this.field4131[var4] += arg2;
        }
        this.method1848();
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "([B)V", line = 1658)
    private final void method1858(byte[] arg0) {
        class192 var2 = new class192(arg0);
        class192 var3 = new class192(arg0);
        class192 var4 = new class192(arg0);
        class192 var5 = new class192(arg0);
        class192 var6 = new class192(arg0);
        class192 var7 = new class192(arg0);
        class192 var8 = new class192(arg0);
        var2.field3129 = arg0.length - 23;
        int var9 = var2.method1396(-127);
        int var10 = var2.method1396(-102);
        int var11 = var2.method1399(-1172389784);
        int var12 = var2.method1399(-1172389784);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method1399(-1172389784);
        int var16 = var2.method1399(-1172389784);
        int var17 = var2.method1399(-1172389784);
        int var18 = var2.method1399(-1172389784);
        int var19 = var2.method1399(-1172389784);
        int var20 = var2.method1396(-118);
        int var21 = var2.method1396(-110);
        int var22 = var2.method1396(-75);
        int var23 = var2.method1396(-121);
        int var24 = var2.method1396(-16);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field4137 = new byte[var11];
            var2.field3129 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field4137[var28] = var2.method1377(true);
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
        this.field4090 = var9;
        this.field4133 = var10;
        this.field4120 = var11;
        this.field4107 = new int[var9];
        this.field4094 = new int[var9];
        this.field4131 = new int[var9];
        this.field4136 = new int[var10];
        this.field4130 = new int[var10];
        this.field4126 = new int[var10];
        if (var19 == 1) {
            this.field4138 = new int[var9];
        }
        if (var13) {
            this.field4089 = new byte[var10];
        }
        if (var15 == 255) {
            this.field4095 = new byte[var10];
        } else {
            this.field4113 = (byte) var15;
        }
        if (var16 == 1) {
            this.field4096 = new byte[var10];
        }
        if (var17 == 1) {
            this.field4135 = new int[var10];
        }
        if (var18 == 1) {
            this.field4121 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field4100 = new byte[var10];
        }
        this.field4134 = new short[var10];
        if (var11 > 0) {
            this.field4119 = new short[var11];
            this.field4128 = new short[var11];
            this.field4118 = new short[var11];
            if (var26 > 0) {
                this.field4091 = new short[var26];
                this.field4110 = new short[var26];
                this.field4093 = new short[var26];
                this.field4092 = new byte[var26];
                this.field4102 = new byte[var26];
                this.field4112 = new byte[var26];
            }
            if (var27 > 0) {
                this.field4108 = new byte[var27];
                this.field4098 = new byte[var27];
            }
        }
        var2.field3129 = var11;
        var3.field3129 = var46;
        var4.field3129 = var48;
        var5.field3129 = var50;
        var6.field3129 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var70 = var2.method1399(-1172389784);
            int var71 = 0;
            if ((var70 & 0x1) != 0) {
                var71 = var3.method1402(-21420);
            }
            int var72 = 0;
            if ((var70 & 0x2) != 0) {
                var72 = var4.method1402(-21420);
            }
            int var73 = 0;
            if ((var70 & 0x4) != 0) {
                var73 = var5.method1402(-21420);
            }
            this.field4107[var69] = var66 + var71;
            this.field4094[var69] = var67 + var72;
            this.field4131[var69] = var68 + var73;
            var66 = this.field4107[var69];
            var67 = this.field4094[var69];
            var68 = this.field4131[var69];
            if (var19 == 1) {
                this.field4138[var69] = var6.method1399(-1172389784);
            }
        }
        var2.field3129 = var44;
        var3.field3129 = var33;
        var4.field3129 = var36;
        var5.field3129 = var39;
        var6.field3129 = var37;
        var7.field3129 = var42;
        var8.field3129 = var41;
        for (int var74 = 0; var74 < var10; var74++) {
            this.field4134[var74] = (short) var2.method1396(-56);
            if (var13) {
                this.field4089[var74] = var3.method1377(true);
            }
            if (var15 == 255) {
                this.field4095[var74] = var4.method1377(true);
            }
            if (var16 == 1) {
                this.field4096[var74] = var5.method1377(true);
            }
            if (var17 == 1) {
                this.field4135[var74] = var6.method1399(-1172389784);
            }
            if (var18 == 1) {
                this.field4121[var74] = (short) (var7.method1396(-128) - 1);
            }
            if (this.field4100 != null) {
                if (this.field4121[var74] == -1) {
                    this.field4100[var74] = -1;
                } else {
                    this.field4100[var74] = (byte) (var8.method1399(-1172389784) - 1);
                }
            }
        }
        this.field4124 = -1;
        var2.field3129 = var35;
        var3.field3129 = var32;
        int var75 = 0;
        int var76 = 0;
        int var77 = 0;
        int var78 = 0;
        for (int var79 = 0; var79 < var10; var79++) {
            int var80 = var3.method1399(-1172389784);
            if (var80 == 1) {
                var75 = var2.method1402(-21420) + var78;
                var76 = var2.method1402(-21420) + var75;
                var77 = var2.method1402(-21420) + var76;
                var78 = var77;
                this.field4136[var79] = var75;
                this.field4130[var79] = var76;
                this.field4126[var79] = var77;
                if (var75 > this.field4124) {
                    this.field4124 = var75;
                }
                if (var76 > this.field4124) {
                    this.field4124 = var76;
                }
                if (var77 > this.field4124) {
                    this.field4124 = var77;
                }
            }
            if (var80 == 2) {
                var76 = var77;
                var77 = var2.method1402(-21420) + var78;
                var78 = var77;
                this.field4136[var79] = var75;
                this.field4130[var79] = var76;
                this.field4126[var79] = var77;
                if (var77 > this.field4124) {
                    this.field4124 = var77;
                }
            }
            if (var80 == 3) {
                var75 = var77;
                var77 = var2.method1402(-21420) + var78;
                var78 = var77;
                this.field4136[var79] = var75;
                this.field4130[var79] = var76;
                this.field4126[var79] = var77;
                if (var77 > this.field4124) {
                    this.field4124 = var77;
                }
            }
            if (var80 == 4) {
                int var83 = var75;
                var75 = var76;
                var76 = var83;
                var77 = var2.method1402(-21420) + var78;
                var78 = var77;
                this.field4136[var79] = var75;
                this.field4130[var79] = var83;
                this.field4126[var79] = var77;
                if (var77 > this.field4124) {
                    this.field4124 = var77;
                }
            }
        }
        this.field4124++;
        var2.field3129 = var52;
        var3.field3129 = var54;
        var4.field3129 = var56;
        var5.field3129 = var58;
        var6.field3129 = var60;
        var7.field3129 = var62;
        for (int var84 = 0; var84 < var11; var84++) {
            int var85 = this.field4137[var84] & 0xFF;
            if (var85 == 0) {
                this.field4119[var84] = (short) var2.method1396(-68);
                this.field4128[var84] = (short) var2.method1396(-46);
                this.field4118[var84] = (short) var2.method1396(-75);
            }
            if (var85 == 1) {
                this.field4119[var84] = (short) var3.method1396(-47);
                this.field4128[var84] = (short) var3.method1396(-32);
                this.field4118[var84] = (short) var3.method1396(-69);
                this.field4091[var84] = (short) var4.method1396(-87);
                this.field4110[var84] = (short) var4.method1396(-54);
                this.field4093[var84] = (short) var4.method1396(-16);
                this.field4092[var84] = var5.method1377(true);
                this.field4102[var84] = var6.method1377(true);
                this.field4112[var84] = var7.method1377(true);
            }
            if (var85 == 2) {
                this.field4119[var84] = (short) var3.method1396(-26);
                this.field4128[var84] = (short) var3.method1396(-100);
                this.field4118[var84] = (short) var3.method1396(-95);
                this.field4091[var84] = (short) var4.method1396(-74);
                this.field4110[var84] = (short) var4.method1396(-25);
                this.field4093[var84] = (short) var4.method1396(-26);
                this.field4092[var84] = var5.method1377(true);
                this.field4102[var84] = var6.method1377(true);
                this.field4112[var84] = var7.method1377(true);
                this.field4108[var84] = var7.method1377(true);
                this.field4098[var84] = var7.method1377(true);
            }
            if (var85 == 3) {
                this.field4119[var84] = (short) var3.method1396(-107);
                this.field4128[var84] = (short) var3.method1396(-33);
                this.field4118[var84] = (short) var3.method1396(-113);
                this.field4091[var84] = (short) var4.method1396(-112);
                this.field4110[var84] = (short) var4.method1396(-32);
                this.field4093[var84] = (short) var4.method1396(-19);
                this.field4092[var84] = var5.method1377(true);
                this.field4102[var84] = var6.method1377(true);
                this.field4112[var84] = var7.method1377(true);
            }
        }
        if (!var14) {
            return;
        }
        var2.field3129 = var64;
        int var86 = var2.method1399(-1172389784);
        if (var86 > 0) {
            var2.field3129 += var86 * 4;
        }
        int var87 = var2.method1399(-1172389784);
        if (var87 > 0) {
            var2.field3129 += var87 * 4;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V", line = 2137)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V", line = 2148)
    public final void method1859(int arg0) {
        int var2 = field4125[arg0];
        int var3 = field4139[arg0];
        for (int var4 = 0; var4 < this.field4090; var4++) {
            int var5 = this.field4131[var4] * var2 + this.field4107[var4] * var3 >> 16;
            this.field4131[var4] = this.field4131[var4] * var3 - this.field4107[var4] * var2 >> 16;
            this.field4107[var4] = var5;
        }
        this.method1848();
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(SS)V", line = 2180)
    public final void method1860(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field4133; var3++) {
            if (this.field4134[var3] == arg0) {
                this.field4134[var3] = arg1;
            }
        }
    }
}
