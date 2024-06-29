import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class241 extends class199 {

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public int field4214 = 0;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public int field4208 = 0;

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "Z")
    private boolean field4232 = false;

    @OriginalMember(owner = "client!cb", name = "fb", descriptor = "B")
    public byte field4247 = 0;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "[I")
    public int[] field4202;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "[I")
    public int[] field4201;

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "[I")
    public int[] field4235;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "[I")
    private int[] field4204;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "[I")
    public int[] field4218;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "[I")
    public int[] field4229;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "[I")
    public int[] field4224;

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "[B")
    public byte[] field4236;

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "[B")
    public byte[] field4245;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "[B")
    public byte[] field4211;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "[S")
    public short[] field4205;

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "[S")
    public short[] field4223;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "[B")
    public byte[] field4227;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "[I")
    private int[] field4226;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "[B")
    public byte[] field4220;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "[S")
    public short[] field4207;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "[S")
    public short[] field4221;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "[S")
    public short[] field4217;

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "[S")
    private short[] field4246;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "[S")
    private short[] field4234;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "[S")
    private short[] field4216;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "[B")
    private byte[] field4203;

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "[B")
    private byte[] field4243;

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "[B")
    private byte[] field4242;

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "[B")
    private byte[] field4241;

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "[B")
    private byte[] field4231;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
    public int field4233;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "[S")
    public short[] field4199;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "[S")
    public short[] field4213;

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "[[I")
    public int[][] field4228;

    @OriginalMember(owner = "client!cb", name = "gb", descriptor = "[[I")
    public int[][] field4248;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "[Lfa;")
    public class249[] field4225;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "[Lha;")
    public class30[] field4210;

    @OriginalMember(owner = "client!cb", name = "hb", descriptor = "[Lfa;")
    public class249[] field4249;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "S")
    public short field4209;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "S")
    public short field4206;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "[I")
    private static int[] field4222 = new int[10000];

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "I")
    private static int field4237 = 0;

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "[I")
    private static int[] field4240 = new int[10000];

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "[I")
    private static int[] field4219 = class235.field4118;

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "[I")
    private static int[] field4244 = class235.field4123;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "S")
    private short field4200;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "S")
    private short field4212;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "S")
    private short field4215;

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "S")
    private short field4230;

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "S")
    private short field4238;

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "S")
    private short field4239;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)V")
    public final void method1657(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4208; var4++) {
            this.field4202[var4] = this.field4202[var4] * arg0 / 128;
            this.field4201[var4] = this.field4201[var4] * arg1 / 128;
            this.field4235[var4] = this.field4235[var4] * arg2 / 128;
        }
        this.method1671();
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIBSB)I")
    public final int method1658(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field4218[this.field4214] = arg0;
        this.field4229[this.field4214] = arg1;
        this.field4224[this.field4214] = arg2;
        this.field4236[this.field4214] = arg3;
        this.field4227[this.field4214] = -1;
        this.field4205[this.field4214] = arg4;
        this.field4223[this.field4214] = -1;
        this.field4211[this.field4214] = arg5;
        return this.field4214++;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "()V")
    public final void method1659() {
        for (int var1 = 0; var1 < this.field4208; var1++) {
            int var2 = this.field4202[var1];
            this.field4202[var1] = this.field4235[var1];
            this.field4235[var1] = -var2;
        }
        this.method1671();
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[[I[[IIIIZZ)Lcb;")
    public final class241 method1660(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1675();
        int var10 = this.field4230 + arg4;
        int var11 = this.field4200 + arg4;
        int var12 = this.field4215 + arg6;
        int var13 = this.field4212 + arg6;
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
        class241 var18;
        if (arg7) {
            var18 = new class241();
            var18.field4208 = this.field4208;
            var18.field4214 = this.field4214;
            var18.field4233 = this.field4233;
            var18.field4218 = this.field4218;
            var18.field4229 = this.field4229;
            var18.field4224 = this.field4224;
            var18.field4236 = this.field4236;
            var18.field4245 = this.field4245;
            var18.field4211 = this.field4211;
            var18.field4227 = this.field4227;
            var18.field4205 = this.field4205;
            var18.field4223 = this.field4223;
            var18.field4247 = this.field4247;
            var18.field4220 = this.field4220;
            var18.field4207 = this.field4207;
            var18.field4221 = this.field4221;
            var18.field4217 = this.field4217;
            var18.field4246 = this.field4246;
            var18.field4234 = this.field4234;
            var18.field4216 = this.field4216;
            var18.field4203 = this.field4203;
            var18.field4243 = this.field4243;
            var18.field4242 = this.field4242;
            var18.field4241 = this.field4241;
            var18.field4231 = this.field4231;
            var18.field4204 = this.field4204;
            var18.field4226 = this.field4226;
            var18.field4228 = this.field4228;
            var18.field4248 = this.field4248;
            var18.field4209 = this.field4209;
            var18.field4206 = this.field4206;
            var18.field4225 = this.field4225;
            var18.field4210 = this.field4210;
            var18.field4249 = this.field4249;
            if (arg0 == 3) {
                var18.field4202 = class40.method237(this.field4202, false);
                var18.field4201 = class40.method237(this.field4201, false);
                var18.field4235 = class40.method237(this.field4235, false);
            } else {
                var18.field4202 = this.field4202;
                var18.field4201 = new int[var18.field4208];
                var18.field4235 = this.field4235;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field4208; var19++) {
                int var20 = this.field4202[var19] + arg4;
                int var21 = this.field4235[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field4201[var19] = this.field4201[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field4208; var29++) {
                int var30 = (this.field4201[var29] << 16) / this.field4239;
                if (var30 < arg1) {
                    int var31 = this.field4202[var29] + arg4;
                    int var32 = this.field4235[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field4201[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field4201[var29];
                } else {
                    var18.field4201[var29] = this.field4201[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1665(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field4238 - this.field4239;
            for (int var43 = 0; var43 < this.field4208; var43++) {
                int var44 = this.field4202[var43] + arg4;
                int var45 = this.field4235[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field4201[var43] = var52 + this.field4201[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field4238 - this.field4239;
            for (int var54 = 0; var54 < this.field4208; var54++) {
                int var55 = this.field4202[var54] + arg4;
                int var56 = this.field4235[var54] + arg6;
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
                var18.field4201[var54] = ((this.field4201[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1671();
        } else {
            this.field4232 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII)V")
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Lug;")
    public final class199 method1361(int arg0, int arg1, int arg2) {
        return this.method1668(this.field4209, this.field4206, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lal;II)Lcb;")
    public static final class241 method1661(class230 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1562(-809612665, arg2, arg1);
        return var3 == null ? null : new class241(var3);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()I")
    public final int method53() {
        if (!this.field4232) {
            this.method1675();
        }
        return this.field4239;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "()V")
    public final void method1662() {
        for (int var1 = 0; var1 < this.field4208; var1++) {
            this.field4235[var1] = -this.field4235[var1];
        }
        for (int var2 = 0; var2 < this.field4214; var2++) {
            int var3 = this.field4218[var2];
            this.field4218[var2] = this.field4224[var2];
            this.field4224[var2] = var3;
        }
        this.method1671();
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "()V")
    public final void method1663() {
        if (this.field4225 != null) {
            return;
        }
        this.field4225 = new class249[this.field4208];
        for (int var1 = 0; var1 < this.field4208; var1++) {
            this.field4225[var1] = new class249();
        }
        for (int var2 = 0; var2 < this.field4214; var2++) {
            int var3 = this.field4218[var2];
            int var4 = this.field4229[var2];
            int var5 = this.field4224[var2];
            int var6 = this.field4202[var4] - this.field4202[var3];
            int var7 = this.field4201[var4] - this.field4201[var3];
            int var8 = this.field4235[var4] - this.field4235[var3];
            int var9 = this.field4202[var5] - this.field4202[var3];
            int var10 = this.field4201[var5] - this.field4201[var3];
            int var11 = this.field4235[var5] - this.field4235[var3];
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
            if (this.field4236 == null) {
                var19 = 0;
            } else {
                var19 = this.field4236[var2];
            }
            if (var19 == 0) {
                class249 var20 = this.field4225[var3];
                var20.field4364 += var16;
                var20.field4369 += var17;
                var20.field4360 += var18;
                var20.field4371++;
                class249 var21 = this.field4225[var4];
                var21.field4364 += var16;
                var21.field4369 += var17;
                var21.field4360 += var18;
                var21.field4371++;
                class249 var22 = this.field4225[var5];
                var22.field4364 += var16;
                var22.field4369 += var17;
                var22.field4360 += var18;
                var22.field4371++;
            } else if (var19 == 1) {
                if (this.field4210 == null) {
                    this.field4210 = new class30[this.field4214];
                }
                class30 var23 = this.field4210[var2] = new class30();
                var23.field453 = var16;
                var23.field455 = var17;
                var23.field451 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([[III)I")
    private static final int method1664(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lug;IIIZ)V")
    public final void method1360(class199 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class241 var6 = (class241) arg0;
        var6.method1675();
        var6.method1663();
        field4237++;
        int var7 = 0;
        int[] var8 = var6.field4202;
        int var9 = var6.field4208;
        for (int var10 = 0; var10 < this.field4208; var10++) {
            class249 var13 = this.field4225[var10];
            if (var13.field4371 != 0) {
                int var14 = this.field4201[var10] - arg2;
                if (var14 >= var6.field4239 && var14 <= var6.field4238) {
                    int var15 = this.field4202[var10] - arg1;
                    if (var15 >= var6.field4230 && var15 <= var6.field4200) {
                        int var16 = this.field4235[var10] - arg3;
                        if (var16 >= var6.field4215 && var16 <= var6.field4212) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class249 var18 = var6.field4225[var17];
                                if (var8[var17] == var15 && var6.field4235[var17] == var16 && var6.field4201[var17] == var14 && var18.field4371 != 0) {
                                    if (this.field4249 == null) {
                                        this.field4249 = new class249[this.field4208];
                                    }
                                    if (var6.field4249 == null) {
                                        var6.field4249 = new class249[var9];
                                    }
                                    class249 var19 = this.field4249[var10];
                                    if (var19 == null) {
                                        var19 = this.field4249[var10] = new class249(var13);
                                    }
                                    class249 var20 = var6.field4249[var17];
                                    if (var20 == null) {
                                        var20 = var6.field4249[var17] = new class249(var18);
                                    }
                                    var19.field4364 += var18.field4364;
                                    var19.field4369 += var18.field4369;
                                    var19.field4360 += var18.field4360;
                                    var19.field4371 += var18.field4371;
                                    var20.field4364 += var13.field4364;
                                    var20.field4369 += var13.field4369;
                                    var20.field4360 += var13.field4360;
                                    var20.field4371 += var13.field4371;
                                    var7++;
                                    field4222[var10] = field4237;
                                    field4240[var17] = field4237;
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
        for (int var11 = 0; var11 < this.field4214; var11++) {
            if (field4222[this.field4218[var11]] == field4237 && field4222[this.field4229[var11]] == field4237 && field4222[this.field4224[var11]] == field4237) {
                if (this.field4236 == null) {
                    this.field4236 = new byte[this.field4214];
                }
                this.field4236[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field4214; var12++) {
            if (field4240[var6.field4218[var12]] == field4237 && field4240[var6.field4229[var12]] == field4237 && field4240[var6.field4224[var12]] == field4237) {
                if (var6.field4236 == null) {
                    var6.field4236 = new byte[var6.field4214];
                }
                var6.field4236[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([[IIIIII)V")
    private final void method1665(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1664(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1664(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1664(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1664(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1683(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1686(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1679(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "()V")
    public final void method1666() {
        for (int var1 = 0; var1 < this.field4208; var1++) {
            this.field4202[var1] = -this.field4202[var1];
            this.field4235[var1] = -this.field4235[var1];
        }
        this.method1671();
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "()Lcb;")
    public final class241 method1667() {
        class241 var1 = new class241();
        if (this.field4236 != null) {
            var1.field4236 = new byte[this.field4214];
            for (int var2 = 0; var2 < this.field4214; var2++) {
                var1.field4236[var2] = this.field4236[var2];
            }
        }
        var1.field4208 = this.field4208;
        var1.field4214 = this.field4214;
        var1.field4233 = this.field4233;
        var1.field4202 = this.field4202;
        var1.field4201 = this.field4201;
        var1.field4235 = this.field4235;
        var1.field4218 = this.field4218;
        var1.field4229 = this.field4229;
        var1.field4224 = this.field4224;
        var1.field4245 = this.field4245;
        var1.field4211 = this.field4211;
        var1.field4227 = this.field4227;
        var1.field4205 = this.field4205;
        var1.field4223 = this.field4223;
        var1.field4247 = this.field4247;
        var1.field4220 = this.field4220;
        var1.field4207 = this.field4207;
        var1.field4221 = this.field4221;
        var1.field4217 = this.field4217;
        var1.field4246 = this.field4246;
        var1.field4234 = this.field4234;
        var1.field4216 = this.field4216;
        var1.field4203 = this.field4203;
        var1.field4243 = this.field4243;
        var1.field4242 = this.field4242;
        var1.field4241 = this.field4241;
        var1.field4231 = this.field4231;
        var1.field4204 = this.field4204;
        var1.field4226 = this.field4226;
        var1.field4228 = this.field4228;
        var1.field4248 = this.field4248;
        var1.field4225 = this.field4225;
        var1.field4210 = this.field4210;
        var1.field4209 = this.field4209;
        var1.field4206 = this.field4206;
        return var1;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIIII)Lnd;")
    public final class262 method1668(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class121(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "()V")
    public final void method1669() {
        this.field4204 = null;
        this.field4226 = null;
        this.field4228 = null;
        this.field4248 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()Z")
    public final boolean method1364() {
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "()V")
    public final void method1670() {
        for (int var1 = 0; var1 < this.field4208; var1++) {
            int var2 = this.field4235[var1];
            this.field4235[var1] = this.field4202[var1];
            this.field4202[var1] = -var2;
        }
        this.method1671();
    }

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "()V")
    private final void method1671() {
        this.field4225 = null;
        this.field4249 = null;
        this.field4210 = null;
        this.field4232 = false;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(SS)V")
    public final void method1672(short arg0, short arg1) {
        if (this.field4223 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field4214; var3++) {
            if (this.field4223[var3] == arg0) {
                this.field4223[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public final void method1673(int arg0) {
        int var2 = field4244[arg0];
        int var3 = field4219[arg0];
        for (int var4 = 0; var4 < this.field4208; var4++) {
            int var5 = this.field4235[var4] * var2 + this.field4202[var4] * var3 >> 16;
            this.field4235[var4] = this.field4235[var4] * var3 - this.field4202[var4] * var2 >> 16;
            this.field4202[var4] = var5;
        }
        this.method1671();
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([B)V")
    private final void method1674(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class74 var4 = new class74(arg0);
        class74 var5 = new class74(arg0);
        class74 var6 = new class74(arg0);
        class74 var7 = new class74(arg0);
        class74 var8 = new class74(arg0);
        var4.field1340 = arg0.length - 18;
        int var9 = var4.method485(-2386);
        int var10 = var4.method485(-2386);
        int var11 = var4.method489((byte) -32);
        int var12 = var4.method489((byte) 78);
        int var13 = var4.method489((byte) 124);
        int var14 = var4.method489((byte) 122);
        int var15 = var4.method489((byte) 123);
        int var16 = var4.method489((byte) 107);
        int var17 = var4.method485(-2386);
        int var18 = var4.method485(-2386);
        int var19 = var4.method485(-2386);
        int var20 = var4.method485(-2386);
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
        this.field4208 = var9;
        this.field4214 = var10;
        this.field4233 = var11;
        this.field4202 = new int[var9];
        this.field4201 = new int[var9];
        this.field4235 = new int[var9];
        this.field4218 = new int[var10];
        this.field4229 = new int[var10];
        this.field4224 = new int[var10];
        if (var11 > 0) {
            this.field4220 = new byte[var11];
            this.field4207 = new short[var11];
            this.field4221 = new short[var11];
            this.field4217 = new short[var11];
        }
        if (var16 == 1) {
            this.field4204 = new int[var9];
        }
        if (var12 == 1) {
            this.field4236 = new byte[var10];
            this.field4227 = new byte[var10];
            this.field4223 = new short[var10];
        }
        if (var13 == 255) {
            this.field4245 = new byte[var10];
        } else {
            this.field4247 = (byte) var13;
        }
        if (var14 == 1) {
            this.field4211 = new byte[var10];
        }
        if (var15 == 1) {
            this.field4226 = new int[var10];
        }
        this.field4205 = new short[var10];
        var4.field1340 = var21;
        var5.field1340 = var36;
        var6.field1340 = var38;
        var7.field1340 = var40;
        var8.field1340 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method489((byte) 92);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method486(-15839);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method486(-15839);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method486(-15839);
            }
            this.field4202[var46] = var43 + var63;
            this.field4201[var46] = var44 + var64;
            this.field4235[var46] = var45 + var65;
            var43 = this.field4202[var46];
            var44 = this.field4201[var46];
            var45 = this.field4235[var46];
            if (var16 == 1) {
                this.field4204[var46] = var8.method489((byte) -58);
            }
        }
        var4.field1340 = var32;
        var5.field1340 = var28;
        var6.field1340 = var26;
        var7.field1340 = var30;
        var8.field1340 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field4205[var47] = (short) var4.method485(-2386);
            if (var12 == 1) {
                int var61 = var5.method489((byte) 105);
                if ((var61 & 0x1) == 1) {
                    this.field4236[var47] = 1;
                    var2 = true;
                } else {
                    this.field4236[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field4227[var47] = (byte) (var61 >> 2);
                    this.field4223[var47] = this.field4205[var47];
                    this.field4205[var47] = 127;
                    if (this.field4223[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field4227[var47] = -1;
                    this.field4223[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field4245[var47] = var6.method514((byte) 1);
            }
            if (var14 == 1) {
                this.field4211[var47] = var7.method514((byte) 1);
            }
            if (var15 == 1) {
                this.field4226[var47] = var8.method489((byte) -15);
            }
        }
        var4.field1340 = var25;
        var5.field1340 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method489((byte) 88);
            if (var57 == 1) {
                var48 = var4.method486(-15839) + var51;
                var49 = var4.method486(-15839) + var48;
                var50 = var4.method486(-15839) + var49;
                var51 = var50;
                this.field4218[var52] = var48;
                this.field4229[var52] = var49;
                this.field4224[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method486(-15839) + var51;
                var51 = var50;
                this.field4218[var52] = var48;
                this.field4229[var52] = var49;
                this.field4224[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method486(-15839) + var51;
                var51 = var50;
                this.field4218[var52] = var48;
                this.field4229[var52] = var49;
                this.field4224[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method486(-15839) + var51;
                var51 = var50;
                this.field4218[var52] = var48;
                this.field4229[var52] = var60;
                this.field4224[var52] = var50;
            }
        }
        var4.field1340 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field4220[var53] = 0;
            this.field4207[var53] = (short) var4.method485(-2386);
            this.field4221[var53] = (short) var4.method485(-2386);
            this.field4217[var53] = (short) var4.method485(-2386);
        }
        if (this.field4227 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field4227[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field4207[var56] & 0xFFFF) == this.field4218[var55] && (this.field4221[var56] & 0xFFFF) == this.field4229[var55] && (this.field4217[var56] & 0xFFFF) == this.field4224[var55]) {
                        this.field4227[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field4227 = null;
            }
        }
        if (!var3) {
            this.field4223 = null;
        }
        if (!var2) {
            this.field4236 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "()V")
    private final void method1675() {
        if (this.field4232) {
            return;
        }
        this.field4232 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field4208; var7++) {
            int var8 = this.field4202[var7];
            int var9 = this.field4201[var7];
            int var10 = this.field4235[var7];
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
        this.field4230 = (short) var1;
        this.field4200 = (short) var4;
        this.field4239 = (short) var2;
        this.field4238 = (short) var5;
        this.field4215 = (short) var3;
        this.field4212 = (short) var6;
    }

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "()V")
    public static void method1676() {
        field4222 = null;
        field4240 = null;
        field4244 = null;
        field4219 = null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(SS)V")
    public final void method1677(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field4214; var3++) {
            if (this.field4205[var3] == arg0) {
                this.field4205[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lcb;IS)I")
    private final int method1678(class241 arg0, int arg1, short arg2) {
        int var4 = arg0.field4202[arg1];
        int var5 = arg0.field4201[arg1];
        int var6 = arg0.field4235[arg1];
        for (int var7 = 0; var7 < this.field4208; var7++) {
            if (this.field4202[var7] == var4 && this.field4201[var7] == var5 && this.field4235[var7] == var6) {
                this.field4199[var7] |= arg2;
                return var7;
            }
        }
        this.field4202[this.field4208] = var4;
        this.field4201[this.field4208] = var5;
        this.field4235[this.field4208] = var6;
        this.field4199[this.field4208] = arg2;
        if (arg0.field4204 != null) {
            this.field4204[this.field4208] = arg0.field4204[arg1];
        }
        return this.field4208++;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(III)V")
    public final void method1679(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4208; var4++) {
            this.field4202[var4] += arg0;
            this.field4201[var4] += arg1;
            this.field4235[var4] += arg2;
        }
        this.method1671();
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(III)V")
    public final void method1680(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field4244[arg2];
            int var5 = field4219[arg2];
            for (int var6 = 0; var6 < this.field4208; var6++) {
                int var7 = this.field4202[var6] * var5 + this.field4201[var6] * var4 >> 16;
                this.field4201[var6] = this.field4201[var6] * var5 - this.field4202[var6] * var4 >> 16;
                this.field4202[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field4244[arg0];
            int var9 = field4219[arg0];
            for (int var10 = 0; var10 < this.field4208; var10++) {
                int var11 = this.field4201[var10] * var9 - this.field4235[var10] * var8 >> 16;
                this.field4235[var10] = this.field4235[var10] * var9 + this.field4201[var10] * var8 >> 16;
                this.field4201[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field4244[arg1];
        int var13 = field4219[arg1];
        for (int var14 = 0; var14 < this.field4208; var14++) {
            int var15 = this.field4235[var14] * var12 + this.field4202[var14] * var13 >> 16;
            this.field4235[var14] = this.field4235[var14] * var13 - this.field4202[var14] * var12 >> 16;
            this.field4202[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(IIIII)Lfc;")
    public final class121 method1681(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class121(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "()V")
    public final void method1682() {
        int var10002;
        if (this.field4204 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field4208; var3++) {
                int var7 = this.field4204[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field4228 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field4228[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field4208) {
                int var6 = this.field4204[var5];
                this.field4228[var6][var1[var6]++] = var5++;
            }
            this.field4204 = null;
        }
        if (this.field4226 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field4214; var10++) {
            int var14 = this.field4226[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field4248 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field4248[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field4214) {
            int var13 = this.field4226[var12];
            this.field4248[var13][var8[var13]++] = var12++;
        }
        this.field4226 = null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    private final void method1683(int arg0) {
        int var2 = field4244[arg0];
        int var3 = field4219[arg0];
        for (int var4 = 0; var4 < this.field4208; var4++) {
            int var5 = this.field4201[var4] * var3 - this.field4235[var4] * var2 >> 16;
            this.field4235[var4] = this.field4235[var4] * var3 + this.field4201[var4] * var2 >> 16;
            this.field4201[var4] = var5;
        }
        this.method1671();
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIIIJILue;)V")
    public final void method54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class88 arg10) {
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(III)I")
    public final int method1684(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4208; var4++) {
            if (this.field4202[var4] == arg0 && this.field4201[var4] == arg1 && this.field4235[var4] == arg2) {
                return var4;
            }
        }
        this.field4202[this.field4208] = arg0;
        this.field4201[this.field4208] = arg1;
        this.field4235[this.field4208] = arg2;
        return this.field4208++;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "([B)V")
    private final void method1685(byte[] arg0) {
        class74 var2 = new class74(arg0);
        class74 var3 = new class74(arg0);
        class74 var4 = new class74(arg0);
        class74 var5 = new class74(arg0);
        class74 var6 = new class74(arg0);
        class74 var7 = new class74(arg0);
        class74 var8 = new class74(arg0);
        var2.field1340 = arg0.length - 23;
        int var9 = var2.method485(-2386);
        int var10 = var2.method485(-2386);
        int var11 = var2.method489((byte) 105);
        int var12 = var2.method489((byte) 112);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method489((byte) -99);
        int var16 = var2.method489((byte) -95);
        int var17 = var2.method489((byte) -68);
        int var18 = var2.method489((byte) -18);
        int var19 = var2.method489((byte) 104);
        int var20 = var2.method485(-2386);
        int var21 = var2.method485(-2386);
        int var22 = var2.method485(-2386);
        int var23 = var2.method485(-2386);
        int var24 = var2.method485(-2386);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field4220 = new byte[var11];
            var2.field1340 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field4220[var28] = var2.method514((byte) 1);
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
        this.field4208 = var9;
        this.field4214 = var10;
        this.field4233 = var11;
        this.field4202 = new int[var9];
        this.field4201 = new int[var9];
        this.field4235 = new int[var9];
        this.field4218 = new int[var10];
        this.field4229 = new int[var10];
        this.field4224 = new int[var10];
        if (var19 == 1) {
            this.field4204 = new int[var9];
        }
        if (var13) {
            this.field4236 = new byte[var10];
        }
        if (var15 == 255) {
            this.field4245 = new byte[var10];
        } else {
            this.field4247 = (byte) var15;
        }
        if (var16 == 1) {
            this.field4211 = new byte[var10];
        }
        if (var17 == 1) {
            this.field4226 = new int[var10];
        }
        if (var18 == 1) {
            this.field4223 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field4227 = new byte[var10];
        }
        this.field4205 = new short[var10];
        if (var11 > 0) {
            this.field4207 = new short[var11];
            this.field4221 = new short[var11];
            this.field4217 = new short[var11];
            if (var26 > 0) {
                this.field4246 = new short[var26];
                this.field4234 = new short[var26];
                this.field4216 = new short[var26];
                this.field4203 = new byte[var26];
                this.field4243 = new byte[var26];
                this.field4242 = new byte[var26];
            }
            if (var27 > 0) {
                this.field4241 = new byte[var27];
                this.field4231 = new byte[var27];
            }
        }
        var2.field1340 = var11;
        var3.field1340 = var46;
        var4.field1340 = var48;
        var5.field1340 = var50;
        var6.field1340 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var84 = var2.method489((byte) 79);
            int var85 = 0;
            if ((var84 & 0x1) != 0) {
                var85 = var3.method486(-15839);
            }
            int var86 = 0;
            if ((var84 & 0x2) != 0) {
                var86 = var4.method486(-15839);
            }
            int var87 = 0;
            if ((var84 & 0x4) != 0) {
                var87 = var5.method486(-15839);
            }
            this.field4202[var69] = var66 + var85;
            this.field4201[var69] = var67 + var86;
            this.field4235[var69] = var68 + var87;
            var66 = this.field4202[var69];
            var67 = this.field4201[var69];
            var68 = this.field4235[var69];
            if (var19 == 1) {
                this.field4204[var69] = var6.method489((byte) -25);
            }
        }
        var2.field1340 = var44;
        var3.field1340 = var33;
        var4.field1340 = var36;
        var5.field1340 = var39;
        var6.field1340 = var37;
        var7.field1340 = var42;
        var8.field1340 = var41;
        for (int var70 = 0; var70 < var10; var70++) {
            this.field4205[var70] = (short) var2.method485(-2386);
            if (var13) {
                this.field4236[var70] = var3.method514((byte) 1);
            }
            if (var15 == 255) {
                this.field4245[var70] = var4.method514((byte) 1);
            }
            if (var16 == 1) {
                this.field4211[var70] = var5.method514((byte) 1);
            }
            if (var17 == 1) {
                this.field4226[var70] = var6.method489((byte) -90);
            }
            if (var18 == 1) {
                this.field4223[var70] = (short) (var7.method485(-2386) - 1);
            }
            if (this.field4227 != null) {
                if (this.field4223[var70] == -1) {
                    this.field4227[var70] = -1;
                } else {
                    this.field4227[var70] = (byte) (var8.method489((byte) 98) - 1);
                }
            }
        }
        var2.field1340 = var35;
        var3.field1340 = var32;
        int var71 = 0;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        for (int var75 = 0; var75 < var10; var75++) {
            int var80 = var3.method489((byte) -26);
            if (var80 == 1) {
                var71 = var2.method486(-15839) + var74;
                var72 = var2.method486(-15839) + var71;
                var73 = var2.method486(-15839) + var72;
                var74 = var73;
                this.field4218[var75] = var71;
                this.field4229[var75] = var72;
                this.field4224[var75] = var73;
            }
            if (var80 == 2) {
                var72 = var73;
                var73 = var2.method486(-15839) + var74;
                var74 = var73;
                this.field4218[var75] = var71;
                this.field4229[var75] = var72;
                this.field4224[var75] = var73;
            }
            if (var80 == 3) {
                var71 = var73;
                var73 = var2.method486(-15839) + var74;
                var74 = var73;
                this.field4218[var75] = var71;
                this.field4229[var75] = var72;
                this.field4224[var75] = var73;
            }
            if (var80 == 4) {
                int var83 = var71;
                var71 = var72;
                var72 = var83;
                var73 = var2.method486(-15839) + var74;
                var74 = var73;
                this.field4218[var75] = var71;
                this.field4229[var75] = var83;
                this.field4224[var75] = var73;
            }
        }
        var2.field1340 = var52;
        var3.field1340 = var54;
        var4.field1340 = var56;
        var5.field1340 = var58;
        var6.field1340 = var60;
        var7.field1340 = var62;
        for (int var76 = 0; var76 < var11; var76++) {
            int var79 = this.field4220[var76] & 0xFF;
            if (var79 == 0) {
                this.field4207[var76] = (short) var2.method485(-2386);
                this.field4221[var76] = (short) var2.method485(-2386);
                this.field4217[var76] = (short) var2.method485(-2386);
            }
            if (var79 == 1) {
                this.field4207[var76] = (short) var3.method485(-2386);
                this.field4221[var76] = (short) var3.method485(-2386);
                this.field4217[var76] = (short) var3.method485(-2386);
                this.field4246[var76] = (short) var4.method485(-2386);
                this.field4234[var76] = (short) var4.method485(-2386);
                this.field4216[var76] = (short) var4.method485(-2386);
                this.field4203[var76] = var5.method514((byte) 1);
                this.field4243[var76] = var6.method514((byte) 1);
                this.field4242[var76] = var7.method514((byte) 1);
            }
            if (var79 == 2) {
                this.field4207[var76] = (short) var3.method485(-2386);
                this.field4221[var76] = (short) var3.method485(-2386);
                this.field4217[var76] = (short) var3.method485(-2386);
                this.field4246[var76] = (short) var4.method485(-2386);
                this.field4234[var76] = (short) var4.method485(-2386);
                this.field4216[var76] = (short) var4.method485(-2386);
                this.field4203[var76] = var5.method514((byte) 1);
                this.field4243[var76] = var6.method514((byte) 1);
                this.field4242[var76] = var7.method514((byte) 1);
                this.field4241[var76] = var7.method514((byte) 1);
                this.field4231[var76] = var7.method514((byte) 1);
            }
            if (var79 == 3) {
                this.field4207[var76] = (short) var3.method485(-2386);
                this.field4221[var76] = (short) var3.method485(-2386);
                this.field4217[var76] = (short) var3.method485(-2386);
                this.field4246[var76] = (short) var4.method485(-2386);
                this.field4234[var76] = (short) var4.method485(-2386);
                this.field4216[var76] = (short) var4.method485(-2386);
                this.field4203[var76] = var5.method514((byte) 1);
                this.field4243[var76] = var6.method514((byte) 1);
                this.field4242[var76] = var7.method514((byte) 1);
            }
        }
        if (!var14) {
            return;
        }
        var2.field1340 = var64;
        int var77 = var2.method489((byte) 84);
        if (var77 > 0) {
            var2.field1340 += var77 * 4;
        }
        int var78 = var2.method489((byte) -52);
        if (var78 > 0) {
            var2.field1340 += var78 * 4;
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
    private final void method1686(int arg0) {
        int var2 = field4244[arg0];
        int var3 = field4219[arg0];
        for (int var4 = 0; var4 < this.field4208; var4++) {
            int var5 = this.field4202[var4] * var3 + this.field4201[var4] * var2 >> 16;
            this.field4201[var4] = this.field4201[var4] * var3 - this.field4202[var4] * var2 >> 16;
            this.field4202[var4] = var5;
        }
        this.method1671();
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    private class241() {
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "([B)V")
    private class241(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1685(arg0);
        } else {
            this.method1674(arg0);
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(III)V")
    public class241(int arg0, int arg1, int arg2) {
        this.field4202 = new int[arg0];
        this.field4201 = new int[arg0];
        this.field4235 = new int[arg0];
        this.field4204 = new int[arg0];
        this.field4218 = new int[arg1];
        this.field4229 = new int[arg1];
        this.field4224 = new int[arg1];
        this.field4236 = new byte[arg1];
        this.field4245 = new byte[arg1];
        this.field4211 = new byte[arg1];
        this.field4205 = new short[arg1];
        this.field4223 = new short[arg1];
        this.field4227 = new byte[arg1];
        this.field4226 = new int[arg1];
        if (arg2 > 0) {
            this.field4220 = new byte[arg2];
            this.field4207 = new short[arg2];
            this.field4221 = new short[arg2];
            this.field4217 = new short[arg2];
            this.field4246 = new short[arg2];
            this.field4234 = new short[arg2];
            this.field4216 = new short[arg2];
            this.field4203 = new byte[arg2];
            this.field4243 = new byte[arg2];
            this.field4242 = new byte[arg2];
            this.field4241 = new byte[arg2];
            this.field4231 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "([Lcb;I)V")
    public class241(class241[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field4208 = 0;
        this.field4214 = 0;
        this.field4233 = 0;
        boolean var9 = false;
        boolean var10 = false;
        this.field4247 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class241 var20 = arg0[var11];
            if (var20 != null) {
                this.field4208 += var20.field4208;
                this.field4214 += var20.field4214;
                this.field4233 += var20.field4233;
                if (var20.field4245 == null) {
                    if (this.field4247 == -1) {
                        this.field4247 = var20.field4247;
                    }
                    if (this.field4247 != var20.field4247) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var20.field4236 != null;
                var5 |= var20.field4211 != null;
                var6 |= var20.field4226 != null;
                var7 |= var20.field4223 != null;
                var8 |= var20.field4227 != null;
            }
        }
        this.field4202 = new int[this.field4208];
        this.field4201 = new int[this.field4208];
        this.field4235 = new int[this.field4208];
        this.field4204 = new int[this.field4208];
        this.field4199 = new short[this.field4208];
        this.field4218 = new int[this.field4214];
        this.field4229 = new int[this.field4214];
        this.field4224 = new int[this.field4214];
        if (var3) {
            this.field4236 = new byte[this.field4214];
        }
        if (var4) {
            this.field4245 = new byte[this.field4214];
        }
        if (var5) {
            this.field4211 = new byte[this.field4214];
        }
        if (var6) {
            this.field4226 = new int[this.field4214];
        }
        if (var7) {
            this.field4223 = new short[this.field4214];
        }
        if (var8) {
            this.field4227 = new byte[this.field4214];
        }
        this.field4205 = new short[this.field4214];
        this.field4213 = new short[this.field4214];
        if (this.field4233 > 0) {
            this.field4220 = new byte[this.field4233];
            this.field4207 = new short[this.field4233];
            this.field4221 = new short[this.field4233];
            this.field4217 = new short[this.field4233];
            this.field4246 = new short[this.field4233];
            this.field4234 = new short[this.field4233];
            this.field4216 = new short[this.field4233];
            this.field4203 = new byte[this.field4233];
            this.field4243 = new byte[this.field4233];
            this.field4242 = new byte[this.field4233];
            this.field4241 = new byte[this.field4233];
            this.field4231 = new byte[this.field4233];
        }
        this.field4208 = 0;
        this.field4214 = 0;
        this.field4233 = 0;
        boolean var12 = false;
        boolean var13 = false;
        for (int var14 = 0; var14 < arg1; var14++) {
            short var15 = (short) (0x1 << var14);
            class241 var16 = arg0[var14];
            if (var16 != null) {
                for (int var17 = 0; var17 < var16.field4214; var17++) {
                    if (var3 && var16.field4236 != null) {
                        this.field4236[this.field4214] = var16.field4236[var17];
                    }
                    if (var4) {
                        if (var16.field4245 == null) {
                            this.field4245[this.field4214] = var16.field4247;
                        } else {
                            this.field4245[this.field4214] = var16.field4245[var17];
                        }
                    }
                    if (var5 && var16.field4211 != null) {
                        this.field4211[this.field4214] = var16.field4211[var17];
                    }
                    if (var6 && var16.field4226 != null) {
                        this.field4226[this.field4214] = var16.field4226[var17];
                    }
                    if (var7) {
                        if (var16.field4223 == null) {
                            this.field4223[this.field4214] = -1;
                        } else {
                            this.field4223[this.field4214] = var16.field4223[var17];
                        }
                    }
                    if (var8) {
                        if (var16.field4227 == null || var16.field4227[var17] == -1) {
                            this.field4227[this.field4214] = -1;
                        } else {
                            this.field4227[this.field4214] = (byte) (var16.field4227[var17] + this.field4233);
                        }
                    }
                    this.field4205[this.field4214] = var16.field4205[var17];
                    this.field4213[this.field4214] = var15;
                    this.field4218[this.field4214] = this.method1678(var16, var16.field4218[var17], var15);
                    this.field4229[this.field4214] = this.method1678(var16, var16.field4229[var17], var15);
                    this.field4224[this.field4214] = this.method1678(var16, var16.field4224[var17], var15);
                    this.field4214++;
                }
                for (int var18 = 0; var18 < var16.field4233; var18++) {
                    byte var19 = this.field4220[this.field4233] = var16.field4220[var18];
                    if (var19 == 0) {
                        this.field4207[this.field4233] = (short) this.method1678(var16, var16.field4207[var18], var15);
                        this.field4221[this.field4233] = (short) this.method1678(var16, var16.field4221[var18], var15);
                        this.field4217[this.field4233] = (short) this.method1678(var16, var16.field4217[var18], var15);
                    }
                    if (var19 >= 1 && var19 <= 3) {
                        this.field4207[this.field4233] = var16.field4207[var18];
                        this.field4221[this.field4233] = var16.field4221[var18];
                        this.field4217[this.field4233] = var16.field4217[var18];
                        this.field4246[this.field4233] = var16.field4246[var18];
                        this.field4234[this.field4233] = var16.field4234[var18];
                        this.field4216[this.field4233] = var16.field4216[var18];
                        this.field4203[this.field4233] = var16.field4203[var18];
                        this.field4243[this.field4233] = var16.field4243[var18];
                        this.field4242[this.field4233] = var16.field4242[var18];
                    }
                    if (var19 == 2) {
                        this.field4241[this.field4233] = var16.field4241[var18];
                        this.field4231[this.field4233] = var16.field4231[var18];
                    }
                    this.field4233++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lcb;ZZZZ)V")
    public class241(class241 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field4208 = arg0.field4208;
        this.field4214 = arg0.field4214;
        this.field4233 = arg0.field4233;
        if (arg1) {
            this.field4202 = arg0.field4202;
            this.field4201 = arg0.field4201;
            this.field4235 = arg0.field4235;
        } else {
            this.field4202 = new int[this.field4208];
            this.field4201 = new int[this.field4208];
            this.field4235 = new int[this.field4208];
            for (int var6 = 0; var6 < this.field4208; var6++) {
                this.field4202[var6] = arg0.field4202[var6];
                this.field4201[var6] = arg0.field4201[var6];
                this.field4235[var6] = arg0.field4235[var6];
            }
        }
        if (arg2) {
            this.field4205 = arg0.field4205;
        } else {
            this.field4205 = new short[this.field4214];
            for (int var7 = 0; var7 < this.field4214; var7++) {
                this.field4205[var7] = arg0.field4205[var7];
            }
        }
        if (arg3 || arg0.field4223 == null) {
            this.field4223 = arg0.field4223;
        } else {
            this.field4223 = new short[this.field4214];
            for (int var8 = 0; var8 < this.field4214; var8++) {
                this.field4223[var8] = arg0.field4223[var8];
            }
        }
        if (arg4) {
            this.field4211 = arg0.field4211;
        } else {
            this.field4211 = new byte[this.field4214];
            if (arg0.field4211 == null) {
                for (int var9 = 0; var9 < this.field4214; var9++) {
                    this.field4211[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field4214; var10++) {
                    this.field4211[var10] = arg0.field4211[var10];
                }
            }
        }
        this.field4218 = arg0.field4218;
        this.field4229 = arg0.field4229;
        this.field4224 = arg0.field4224;
        this.field4236 = arg0.field4236;
        this.field4245 = arg0.field4245;
        this.field4227 = arg0.field4227;
        this.field4247 = arg0.field4247;
        this.field4220 = arg0.field4220;
        this.field4207 = arg0.field4207;
        this.field4221 = arg0.field4221;
        this.field4217 = arg0.field4217;
        this.field4246 = arg0.field4246;
        this.field4234 = arg0.field4234;
        this.field4216 = arg0.field4216;
        this.field4203 = arg0.field4203;
        this.field4243 = arg0.field4243;
        this.field4242 = arg0.field4242;
        this.field4241 = arg0.field4241;
        this.field4231 = arg0.field4231;
        this.field4204 = arg0.field4204;
        this.field4226 = arg0.field4226;
        this.field4228 = arg0.field4228;
        this.field4248 = arg0.field4248;
        this.field4225 = arg0.field4225;
        this.field4210 = arg0.field4210;
        this.field4249 = arg0.field4249;
        this.field4209 = arg0.field4209;
        this.field4206 = arg0.field4206;
    }
}
