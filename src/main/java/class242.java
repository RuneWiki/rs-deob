import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class242 extends class139 {

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "B")
    public byte field4244 = 0;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public int field4263 = 0;

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "Z")
    private boolean field4274 = false;

    @OriginalMember(owner = "client!ad", name = "hb", descriptor = "I")
    public int field4285 = 0;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "[I")
    public int[] field4245;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "[I")
    public int[] field4256;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "[I")
    public int[] field4271;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "[I")
    private int[] field4270;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "[I")
    public int[] field4265;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "[I")
    public int[] field4253;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "[I")
    public int[] field4248;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "[B")
    public byte[] field4268;

    @OriginalMember(owner = "client!ad", name = "eb", descriptor = "[B")
    public byte[] field4282;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "[B")
    public byte[] field4269;

    @OriginalMember(owner = "client!ad", name = "db", descriptor = "[S")
    public short[] field4281;

    @OriginalMember(owner = "client!ad", name = "fb", descriptor = "[S")
    public short[] field4283;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "[B")
    public byte[] field4258;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "[I")
    private int[] field4260;

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "[B")
    public byte[] field4279;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "[S")
    public short[] field4261;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "[S")
    public short[] field4264;

    @OriginalMember(owner = "client!ad", name = "gb", descriptor = "[S")
    public short[] field4284;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "[S")
    private short[] field4266;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "[S")
    private short[] field4255;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "[S")
    private short[] field4257;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "[B")
    private byte[] field4251;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "[B")
    private byte[] field4252;

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "[B")
    private byte[] field4280;

    @OriginalMember(owner = "client!ad", name = "jb", descriptor = "[B")
    private byte[] field4287;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "[B")
    private byte[] field4249;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public int field4242;

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "[[I")
    public int[][] field4277;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "[[I")
    public int[][] field4262;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "[Lth;")
    public class108[] field4239;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "[Lhf;")
    public class134[] field4254;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "[Lth;")
    public class108[] field4243;

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "S")
    public short field4278;

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "S")
    public short field4276;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "[I")
    private static int[] field4241 = new int[10000];

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "[I")
    private static int[] field4240 = new int[10000];

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "[I")
    private static int[] field4246 = class270.field4762;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "[I")
    private static int[] field4273 = class270.field4769;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    private static int field4250 = 0;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "S")
    private short field4247;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "S")
    private short field4259;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "S")
    private short field4267;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "S")
    private short field4272;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "S")
    private short field4275;

    @OriginalMember(owner = "client!ad", name = "ib", descriptor = "S")
    private short field4286;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
    private final void method1618(int arg0) {
        int var2 = field4273[arg0];
        int var3 = field4246[arg0];
        for (int var4 = 0; var4 < this.field4263; var4++) {
            int var5 = this.field4256[var4] * var2 + this.field4245[var4] * var3 >> 16;
            this.field4256[var4] = this.field4256[var4] * var3 - this.field4245[var4] * var2 >> 16;
            this.field4245[var4] = var5;
        }
        this.method1625();
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(III)Lnj;")
    public final class139 method910(int arg0, int arg1, int arg2) {
        return this.method1621(this.field4278, this.field4276, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "()V")
    public final void method1619() {
        for (int var1 = 0; var1 < this.field4263; var1++) {
            this.field4245[var1] = -this.field4245[var1];
            this.field4271[var1] = -this.field4271[var1];
        }
        this.method1625();
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(III)V")
    public final void method1620(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4263; var4++) {
            this.field4245[var4] = this.field4245[var4] * arg0 / 128;
            this.field4256[var4] = this.field4256[var4] * arg1 / 128;
            this.field4271[var4] = this.field4271[var4] * arg2 / 128;
        }
        this.method1625();
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(IIIII)Lph;")
    public final class76 method1621(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class167(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(SS)V")
    public final void method1622(short arg0, short arg1) {
        if (this.field4283 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field4285; var3++) {
            if (this.field4283[var3] == arg0) {
                this.field4283[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([[IIIIII)V")
    private final void method1623(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1628(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1628(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1628(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1628(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1644(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1618(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1641(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([B)V")
    private final void method1624(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class194 var4 = new class194(arg0);
        class194 var5 = new class194(arg0);
        class194 var6 = new class194(arg0);
        class194 var7 = new class194(arg0);
        class194 var8 = new class194(arg0);
        var4.field3497 = arg0.length - 18;
        int var9 = var4.method1294((byte) 3);
        int var10 = var4.method1294((byte) 3);
        int var11 = var4.method1301(-8317);
        int var12 = var4.method1301(-8317);
        int var13 = var4.method1301(-8317);
        int var14 = var4.method1301(-8317);
        int var15 = var4.method1301(-8317);
        int var16 = var4.method1301(-8317);
        int var17 = var4.method1294((byte) 3);
        int var18 = var4.method1294((byte) 3);
        int var19 = var4.method1294((byte) 3);
        int var20 = var4.method1294((byte) 3);
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
        this.field4263 = var9;
        this.field4285 = var10;
        this.field4242 = var11;
        this.field4245 = new int[var9];
        this.field4256 = new int[var9];
        this.field4271 = new int[var9];
        this.field4265 = new int[var10];
        this.field4253 = new int[var10];
        this.field4248 = new int[var10];
        if (var11 > 0) {
            this.field4279 = new byte[var11];
            this.field4261 = new short[var11];
            this.field4264 = new short[var11];
            this.field4284 = new short[var11];
        }
        if (var16 == 1) {
            this.field4270 = new int[var9];
        }
        if (var12 == 1) {
            this.field4268 = new byte[var10];
            this.field4258 = new byte[var10];
            this.field4283 = new short[var10];
        }
        if (var13 == 255) {
            this.field4282 = new byte[var10];
        } else {
            this.field4244 = (byte) var13;
        }
        if (var14 == 1) {
            this.field4269 = new byte[var10];
        }
        if (var15 == 1) {
            this.field4260 = new int[var10];
        }
        this.field4281 = new short[var10];
        var4.field3497 = var21;
        var5.field3497 = var36;
        var6.field3497 = var38;
        var7.field3497 = var40;
        var8.field3497 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method1301(-8317);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method1307(5);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method1307(5);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method1307(5);
            }
            this.field4245[var46] = var43 + var63;
            this.field4256[var46] = var44 + var64;
            this.field4271[var46] = var45 + var65;
            var43 = this.field4245[var46];
            var44 = this.field4256[var46];
            var45 = this.field4271[var46];
            if (var16 == 1) {
                this.field4270[var46] = var8.method1301(-8317);
            }
        }
        var4.field3497 = var32;
        var5.field3497 = var28;
        var6.field3497 = var26;
        var7.field3497 = var30;
        var8.field3497 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field4281[var47] = (short) var4.method1294((byte) 3);
            if (var12 == 1) {
                int var61 = var5.method1301(-8317);
                if ((var61 & 0x1) == 1) {
                    this.field4268[var47] = 1;
                    var2 = true;
                } else {
                    this.field4268[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field4258[var47] = (byte) (var61 >> 2);
                    this.field4283[var47] = this.field4281[var47];
                    this.field4281[var47] = 127;
                    if (this.field4283[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field4258[var47] = -1;
                    this.field4283[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field4282[var47] = var6.method1281((byte) 125);
            }
            if (var14 == 1) {
                this.field4269[var47] = var7.method1281((byte) -23);
            }
            if (var15 == 1) {
                this.field4260[var47] = var8.method1301(-8317);
            }
        }
        var4.field3497 = var25;
        var5.field3497 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method1301(-8317);
            if (var57 == 1) {
                var48 = var4.method1307(5) + var51;
                var49 = var4.method1307(5) + var48;
                var50 = var4.method1307(5) + var49;
                var51 = var50;
                this.field4265[var52] = var48;
                this.field4253[var52] = var49;
                this.field4248[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1307(5) + var51;
                var51 = var50;
                this.field4265[var52] = var48;
                this.field4253[var52] = var49;
                this.field4248[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1307(5) + var51;
                var51 = var50;
                this.field4265[var52] = var48;
                this.field4253[var52] = var49;
                this.field4248[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1307(5) + var51;
                var51 = var50;
                this.field4265[var52] = var48;
                this.field4253[var52] = var60;
                this.field4248[var52] = var50;
            }
        }
        var4.field3497 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field4279[var53] = 0;
            this.field4261[var53] = (short) var4.method1294((byte) 3);
            this.field4264[var53] = (short) var4.method1294((byte) 3);
            this.field4284[var53] = (short) var4.method1294((byte) 3);
        }
        if (this.field4258 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field4258[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field4261[var56] & 0xFFFF) == this.field4265[var55] && (this.field4264[var56] & 0xFFFF) == this.field4253[var55] && (this.field4284[var56] & 0xFFFF) == this.field4248[var55]) {
                        this.field4258[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field4258 = null;
            }
        }
        if (!var3) {
            this.field4283 = null;
        }
        if (!var2) {
            this.field4268 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "()V")
    private final void method1625() {
        this.field4239 = null;
        this.field4243 = null;
        this.field4254 = null;
        this.field4274 = false;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "()V")
    private final void method1626() {
        if (this.field4274) {
            return;
        }
        this.field4274 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field4263; var7++) {
            int var8 = this.field4245[var7];
            int var9 = this.field4256[var7];
            int var10 = this.field4271[var7];
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
        this.field4267 = (short) var1;
        this.field4272 = (short) var4;
        this.field4247 = (short) var2;
        this.field4286 = (short) var5;
        this.field4275 = (short) var3;
        this.field4259 = (short) var6;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
    public final void method1627(int arg0) {
        int var2 = field4273[arg0];
        int var3 = field4246[arg0];
        for (int var4 = 0; var4 < this.field4263; var4++) {
            int var5 = this.field4271[var4] * var2 + this.field4245[var4] * var3 >> 16;
            this.field4271[var4] = this.field4271[var4] * var3 - this.field4245[var4] * var2 >> 16;
            this.field4245[var4] = var5;
        }
        this.method1625();
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([[III)I")
    private static final int method1628(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "()Lad;")
    public final class242 method1629() {
        class242 var1 = new class242();
        if (this.field4268 != null) {
            var1.field4268 = new byte[this.field4285];
            for (int var2 = 0; var2 < this.field4285; var2++) {
                var1.field4268[var2] = this.field4268[var2];
            }
        }
        var1.field4263 = this.field4263;
        var1.field4285 = this.field4285;
        var1.field4242 = this.field4242;
        var1.field4245 = this.field4245;
        var1.field4256 = this.field4256;
        var1.field4271 = this.field4271;
        var1.field4265 = this.field4265;
        var1.field4253 = this.field4253;
        var1.field4248 = this.field4248;
        var1.field4282 = this.field4282;
        var1.field4269 = this.field4269;
        var1.field4258 = this.field4258;
        var1.field4281 = this.field4281;
        var1.field4283 = this.field4283;
        var1.field4244 = this.field4244;
        var1.field4279 = this.field4279;
        var1.field4261 = this.field4261;
        var1.field4264 = this.field4264;
        var1.field4284 = this.field4284;
        var1.field4266 = this.field4266;
        var1.field4255 = this.field4255;
        var1.field4257 = this.field4257;
        var1.field4251 = this.field4251;
        var1.field4252 = this.field4252;
        var1.field4280 = this.field4280;
        var1.field4287 = this.field4287;
        var1.field4249 = this.field4249;
        var1.field4270 = this.field4270;
        var1.field4260 = this.field4260;
        var1.field4277 = this.field4277;
        var1.field4262 = this.field4262;
        var1.field4239 = this.field4239;
        var1.field4254 = this.field4254;
        var1.field4278 = this.field4278;
        var1.field4276 = this.field4276;
        return var1;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(IIIII)Lga;")
    public final class167 method1630(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class167(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(III)V")
    public final void method1631(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field4273[arg2];
            int var5 = field4246[arg2];
            for (int var6 = 0; var6 < this.field4263; var6++) {
                int var7 = this.field4256[var6] * var4 + this.field4245[var6] * var5 >> 16;
                this.field4256[var6] = this.field4256[var6] * var5 - this.field4245[var6] * var4 >> 16;
                this.field4245[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field4273[arg0];
            int var9 = field4246[arg0];
            for (int var10 = 0; var10 < this.field4263; var10++) {
                int var11 = this.field4256[var10] * var9 - this.field4271[var10] * var8 >> 16;
                this.field4271[var10] = this.field4271[var10] * var9 + this.field4256[var10] * var8 >> 16;
                this.field4256[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field4273[arg1];
        int var13 = field4246[arg1];
        for (int var14 = 0; var14 < this.field4263; var14++) {
            int var15 = this.field4271[var14] * var12 + this.field4245[var14] * var13 >> 16;
            this.field4271[var14] = this.field4271[var14] * var13 - this.field4245[var14] * var12 >> 16;
            this.field4245[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "([B)V")
    private final void method1632(byte[] arg0) {
        class194 var2 = new class194(arg0);
        class194 var3 = new class194(arg0);
        class194 var4 = new class194(arg0);
        class194 var5 = new class194(arg0);
        class194 var6 = new class194(arg0);
        class194 var7 = new class194(arg0);
        class194 var8 = new class194(arg0);
        var2.field3497 = arg0.length - 23;
        int var9 = var2.method1294((byte) 3);
        int var10 = var2.method1294((byte) 3);
        int var11 = var2.method1301(-8317);
        int var12 = var2.method1301(-8317);
        int var13 = var2.method1301(-8317);
        int var14 = var2.method1301(-8317);
        int var15 = var2.method1301(-8317);
        int var16 = var2.method1301(-8317);
        int var17 = var2.method1301(-8317);
        int var18 = var2.method1294((byte) 3);
        int var19 = var2.method1294((byte) 3);
        int var20 = var2.method1294((byte) 3);
        int var21 = var2.method1294((byte) 3);
        int var22 = var2.method1294((byte) 3);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field4279 = new byte[var11];
            var2.field3497 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field4279[var26] = var2.method1281((byte) 121);
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
        this.field4263 = var9;
        this.field4285 = var10;
        this.field4242 = var11;
        this.field4245 = new int[var9];
        this.field4256 = new int[var9];
        this.field4271 = new int[var9];
        this.field4265 = new int[var10];
        this.field4253 = new int[var10];
        this.field4248 = new int[var10];
        if (var17 == 1) {
            this.field4270 = new int[var9];
        }
        if (var12 == 1) {
            this.field4268 = new byte[var10];
        }
        if (var13 == 255) {
            this.field4282 = new byte[var10];
        } else {
            this.field4244 = (byte) var13;
        }
        if (var14 == 1) {
            this.field4269 = new byte[var10];
        }
        if (var15 == 1) {
            this.field4260 = new int[var10];
        }
        if (var16 == 1) {
            this.field4283 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field4258 = new byte[var10];
        }
        this.field4281 = new short[var10];
        if (var11 > 0) {
            this.field4261 = new short[var11];
            this.field4264 = new short[var11];
            this.field4284 = new short[var11];
            if (var24 > 0) {
                this.field4266 = new short[var24];
                this.field4255 = new short[var24];
                this.field4257 = new short[var24];
                this.field4251 = new byte[var24];
                this.field4252 = new byte[var24];
                this.field4280 = new byte[var24];
            }
            if (var25 > 0) {
                this.field4287 = new byte[var25];
                this.field4249 = new byte[var25];
            }
        }
        var2.field3497 = var11;
        var3.field3497 = var44;
        var4.field3497 = var46;
        var5.field3497 = var48;
        var6.field3497 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method1301(-8317);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method1307(5);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method1307(5);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method1307(5);
            }
            this.field4245[var66] = var63 + var80;
            this.field4256[var66] = var64 + var81;
            this.field4271[var66] = var65 + var82;
            var63 = this.field4245[var66];
            var64 = this.field4256[var66];
            var65 = this.field4271[var66];
            if (var17 == 1) {
                this.field4270[var66] = var6.method1301(-8317);
            }
        }
        var2.field3497 = var42;
        var3.field3497 = var31;
        var4.field3497 = var34;
        var5.field3497 = var37;
        var6.field3497 = var35;
        var7.field3497 = var40;
        var8.field3497 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field4281[var67] = (short) var2.method1294((byte) 3);
            if (var12 == 1) {
                this.field4268[var67] = var3.method1281((byte) 121);
            }
            if (var13 == 255) {
                this.field4282[var67] = var4.method1281((byte) -2);
            }
            if (var14 == 1) {
                this.field4269[var67] = var5.method1281((byte) 127);
            }
            if (var15 == 1) {
                this.field4260[var67] = var6.method1301(-8317);
            }
            if (var16 == 1) {
                this.field4283[var67] = (short) (var7.method1294((byte) 3) - 1);
            }
            if (this.field4258 != null) {
                if (this.field4283[var67] == -1) {
                    this.field4258[var67] = -1;
                } else {
                    this.field4258[var67] = (byte) (var8.method1301(-8317) - 1);
                }
            }
        }
        var2.field3497 = var33;
        var3.field3497 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method1301(-8317);
            if (var75 == 1) {
                var68 = var2.method1307(5) + var71;
                var69 = var2.method1307(5) + var68;
                var70 = var2.method1307(5) + var69;
                var71 = var70;
                this.field4265[var72] = var68;
                this.field4253[var72] = var69;
                this.field4248[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method1307(5) + var71;
                var71 = var70;
                this.field4265[var72] = var68;
                this.field4253[var72] = var69;
                this.field4248[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method1307(5) + var71;
                var71 = var70;
                this.field4265[var72] = var68;
                this.field4253[var72] = var69;
                this.field4248[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method1307(5) + var71;
                var71 = var70;
                this.field4265[var72] = var68;
                this.field4253[var72] = var78;
                this.field4248[var72] = var70;
            }
        }
        var2.field3497 = var50;
        var3.field3497 = var52;
        var4.field3497 = var54;
        var5.field3497 = var56;
        var6.field3497 = var58;
        var7.field3497 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field4279[var73] & 0xFF;
            if (var74 == 0) {
                this.field4261[var73] = (short) var2.method1294((byte) 3);
                this.field4264[var73] = (short) var2.method1294((byte) 3);
                this.field4284[var73] = (short) var2.method1294((byte) 3);
            }
            if (var74 == 1) {
                this.field4261[var73] = (short) var3.method1294((byte) 3);
                this.field4264[var73] = (short) var3.method1294((byte) 3);
                this.field4284[var73] = (short) var3.method1294((byte) 3);
                this.field4266[var73] = (short) var4.method1294((byte) 3);
                this.field4255[var73] = (short) var4.method1294((byte) 3);
                this.field4257[var73] = (short) var4.method1294((byte) 3);
                this.field4251[var73] = var5.method1281((byte) -104);
                this.field4252[var73] = var6.method1281((byte) -29);
                this.field4280[var73] = var7.method1281((byte) 123);
            }
            if (var74 == 2) {
                this.field4261[var73] = (short) var3.method1294((byte) 3);
                this.field4264[var73] = (short) var3.method1294((byte) 3);
                this.field4284[var73] = (short) var3.method1294((byte) 3);
                this.field4266[var73] = (short) var4.method1294((byte) 3);
                this.field4255[var73] = (short) var4.method1294((byte) 3);
                this.field4257[var73] = (short) var4.method1294((byte) 3);
                this.field4251[var73] = var5.method1281((byte) 126);
                this.field4252[var73] = var6.method1281((byte) 126);
                this.field4280[var73] = var7.method1281((byte) 123);
                this.field4287[var73] = var7.method1281((byte) -78);
                this.field4249[var73] = var7.method1281((byte) -90);
            }
            if (var74 == 3) {
                this.field4261[var73] = (short) var3.method1294((byte) 3);
                this.field4264[var73] = (short) var3.method1294((byte) 3);
                this.field4284[var73] = (short) var3.method1294((byte) 3);
                this.field4266[var73] = (short) var4.method1294((byte) 3);
                this.field4255[var73] = (short) var4.method1294((byte) 3);
                this.field4257[var73] = (short) var4.method1294((byte) 3);
                this.field4251[var73] = var5.method1281((byte) -111);
                this.field4252[var73] = var6.method1281((byte) -79);
                this.field4280[var73] = var7.method1281((byte) -34);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(SS)V")
    public final void method1633(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field4285; var3++) {
            if (this.field4281[var3] == arg0) {
                this.field4281[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "()V")
    public static void method1634() {
        field4240 = null;
        field4241 = null;
        field4273 = null;
        field4246 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lue;II)Lad;")
    public static final class242 method1635(class86 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method596(-121, arg1, arg2);
        return var3 == null ? null : new class242(var3);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II[[I[[IIIIZZ)Lad;")
    public final class242 method1636(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1626();
        int var10 = this.field4267 + arg4;
        int var11 = this.field4272 + arg4;
        int var12 = this.field4275 + arg6;
        int var13 = this.field4259 + arg6;
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
        class242 var18;
        if (arg7) {
            var18 = new class242();
            var18.field4263 = this.field4263;
            var18.field4285 = this.field4285;
            var18.field4242 = this.field4242;
            var18.field4265 = this.field4265;
            var18.field4253 = this.field4253;
            var18.field4248 = this.field4248;
            var18.field4268 = this.field4268;
            var18.field4282 = this.field4282;
            var18.field4269 = this.field4269;
            var18.field4258 = this.field4258;
            var18.field4281 = this.field4281;
            var18.field4283 = this.field4283;
            var18.field4244 = this.field4244;
            var18.field4279 = this.field4279;
            var18.field4261 = this.field4261;
            var18.field4264 = this.field4264;
            var18.field4284 = this.field4284;
            var18.field4266 = this.field4266;
            var18.field4255 = this.field4255;
            var18.field4257 = this.field4257;
            var18.field4251 = this.field4251;
            var18.field4252 = this.field4252;
            var18.field4280 = this.field4280;
            var18.field4287 = this.field4287;
            var18.field4249 = this.field4249;
            var18.field4270 = this.field4270;
            var18.field4260 = this.field4260;
            var18.field4277 = this.field4277;
            var18.field4262 = this.field4262;
            var18.field4278 = this.field4278;
            var18.field4276 = this.field4276;
            var18.field4239 = this.field4239;
            var18.field4254 = this.field4254;
            var18.field4243 = this.field4243;
            if (arg0 == 3) {
                var18.field4245 = class234.method1569(this.field4245, 58);
                var18.field4256 = class234.method1569(this.field4256, 90);
                var18.field4271 = class234.method1569(this.field4271, 95);
            } else {
                var18.field4245 = this.field4245;
                var18.field4256 = new int[var18.field4263];
                var18.field4271 = this.field4271;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field4263; var19++) {
                int var20 = this.field4245[var19] + arg4;
                int var21 = this.field4271[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field4256[var19] = this.field4256[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field4263; var29++) {
                int var30 = (this.field4256[var29] << 16) / this.field4247;
                if (var30 < arg1) {
                    int var31 = this.field4245[var29] + arg4;
                    int var32 = this.field4271[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field4256[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field4256[var29];
                } else {
                    var18.field4256[var29] = this.field4256[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1623(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field4286 - this.field4247;
            for (int var43 = 0; var43 < this.field4263; var43++) {
                int var44 = this.field4245[var43] + arg4;
                int var45 = this.field4271[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field4256[var43] = var52 + this.field4256[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field4286 - this.field4247;
            for (int var54 = 0; var54 < this.field4263; var54++) {
                int var55 = this.field4245[var54] + arg4;
                int var56 = this.field4271[var54] + arg6;
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
                var18.field4256[var54] = ((this.field4256[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1625();
        } else {
            this.field4274 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "()V")
    public final void method1637() {
        this.field4270 = null;
        this.field4260 = null;
        this.field4277 = null;
        this.field4262 = null;
    }

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "()V")
    public final void method1638() {
        for (int var1 = 0; var1 < this.field4263; var1++) {
            int var2 = this.field4245[var1];
            this.field4245[var1] = this.field4271[var1];
            this.field4271[var1] = -var2;
        }
        this.method1625();
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(III)I")
    public final int method1639(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4263; var4++) {
            if (this.field4245[var4] == arg0 && this.field4256[var4] == arg1 && this.field4271[var4] == arg2) {
                return var4;
            }
        }
        this.field4245[this.field4263] = arg0;
        this.field4256[this.field4263] = arg1;
        this.field4271[this.field4263] = arg2;
        return this.field4263++;
    }

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "()V")
    public final void method1640() {
        for (int var1 = 0; var1 < this.field4263; var1++) {
            int var2 = this.field4271[var1];
            this.field4271[var1] = this.field4245[var1];
            this.field4245[var1] = -var2;
        }
        this.method1625();
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(III)V")
    public final void method1641(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4263; var4++) {
            this.field4245[var4] += arg0;
            this.field4256[var4] += arg1;
            this.field4271[var4] += arg2;
        }
        this.method1625();
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "()I")
    public final int method106() {
        if (!this.field4274) {
            this.method1626();
        }
        return this.field4247;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "()Z")
    public final boolean method905() {
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lnj;IIIZ)V")
    public final void method909(class139 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class242 var6 = (class242) arg0;
        var6.method1626();
        var6.method1642();
        field4250++;
        int var7 = 0;
        int[] var8 = var6.field4245;
        int var9 = var6.field4263;
        for (int var10 = 0; var10 < this.field4263; var10++) {
            class108 var13 = this.field4239[var10];
            if (var13.field2034 != 0) {
                int var14 = this.field4256[var10] - arg2;
                if (var14 >= var6.field4247 && var14 <= var6.field4286) {
                    int var15 = this.field4245[var10] - arg1;
                    if (var15 >= var6.field4267 && var15 <= var6.field4272) {
                        int var16 = this.field4271[var10] - arg3;
                        if (var16 >= var6.field4275 && var16 <= var6.field4259) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class108 var18 = var6.field4239[var17];
                                if (var8[var17] == var15 && var6.field4271[var17] == var16 && var6.field4256[var17] == var14 && var18.field2034 != 0) {
                                    if (this.field4243 == null) {
                                        this.field4243 = new class108[this.field4263];
                                    }
                                    if (var6.field4243 == null) {
                                        var6.field4243 = new class108[var9];
                                    }
                                    class108 var19 = this.field4243[var10];
                                    if (var19 == null) {
                                        var19 = this.field4243[var10] = new class108(var13);
                                    }
                                    class108 var20 = var6.field4243[var17];
                                    if (var20 == null) {
                                        var20 = var6.field4243[var17] = new class108(var18);
                                    }
                                    var19.field2036 += var18.field2036;
                                    var19.field2037 += var18.field2037;
                                    var19.field2043 += var18.field2043;
                                    var19.field2034 += var18.field2034;
                                    var20.field2036 += var13.field2036;
                                    var20.field2037 += var13.field2037;
                                    var20.field2043 += var13.field2043;
                                    var20.field2034 += var13.field2034;
                                    var7++;
                                    field4240[var10] = field4250;
                                    field4241[var17] = field4250;
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
        for (int var11 = 0; var11 < this.field4285; var11++) {
            if (field4240[this.field4265[var11]] == field4250 && field4240[this.field4253[var11]] == field4250 && field4240[this.field4248[var11]] == field4250) {
                if (this.field4268 == null) {
                    this.field4268 = new byte[this.field4285];
                }
                this.field4268[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field4285; var12++) {
            if (field4241[var6.field4265[var12]] == field4250 && field4241[var6.field4253[var12]] == field4250 && field4241[var6.field4248[var12]] == field4250) {
                if (var6.field4268 == null) {
                    var6.field4268 = new byte[var6.field4285];
                }
                var6.field4268[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "()V")
    public final void method1642() {
        if (this.field4239 != null) {
            return;
        }
        this.field4239 = new class108[this.field4263];
        for (int var1 = 0; var1 < this.field4263; var1++) {
            this.field4239[var1] = new class108();
        }
        for (int var2 = 0; var2 < this.field4285; var2++) {
            int var3 = this.field4265[var2];
            int var4 = this.field4253[var2];
            int var5 = this.field4248[var2];
            int var6 = this.field4245[var4] - this.field4245[var3];
            int var7 = this.field4256[var4] - this.field4256[var3];
            int var8 = this.field4271[var4] - this.field4271[var3];
            int var9 = this.field4245[var5] - this.field4245[var3];
            int var10 = this.field4256[var5] - this.field4256[var3];
            int var11 = this.field4271[var5] - this.field4271[var3];
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
            if (this.field4268 == null) {
                var19 = 0;
            } else {
                var19 = this.field4268[var2];
            }
            if (var19 == 0) {
                class108 var20 = this.field4239[var3];
                var20.field2036 += var16;
                var20.field2037 += var17;
                var20.field2043 += var18;
                var20.field2034++;
                class108 var21 = this.field4239[var4];
                var21.field2036 += var16;
                var21.field2037 += var17;
                var21.field2043 += var18;
                var21.field2034++;
                class108 var22 = this.field4239[var5];
                var22.field2036 += var16;
                var22.field2037 += var17;
                var22.field2043 += var18;
                var22.field2034++;
            } else if (var19 == 1) {
                if (this.field4254 == null) {
                    this.field4254 = new class134[this.field4285];
                }
                class134 var23 = this.field4254[var2] = new class134();
                var23.field2463 = var16;
                var23.field2464 = var17;
                var23.field2461 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lad;I)I")
    private final int method1643(class242 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field4245[arg1];
        int var5 = arg0.field4256[arg1];
        int var6 = arg0.field4271[arg1];
        for (int var7 = 0; var7 < this.field4263; var7++) {
            if (this.field4245[var7] == var4 && this.field4256[var7] == var5 && this.field4271[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field4245[this.field4263] = var4;
            this.field4256[this.field4263] = var5;
            this.field4271[this.field4263] = var6;
            if (arg0.field4270 != null) {
                this.field4270[this.field4263] = arg0.field4270[arg1];
            }
            var3 = this.field4263++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
    private final void method1644(int arg0) {
        int var2 = field4273[arg0];
        int var3 = field4246[arg0];
        for (int var4 = 0; var4 < this.field4263; var4++) {
            int var5 = this.field4256[var4] * var3 - this.field4271[var4] * var2 >> 16;
            this.field4271[var4] = this.field4271[var4] * var3 + this.field4256[var4] * var2 >> 16;
            this.field4256[var4] = var5;
        }
        this.method1625();
    }

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "()V")
    public final void method1645() {
        int var10002;
        if (this.field4270 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field4263; var3++) {
                int var7 = this.field4270[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field4277 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field4277[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field4263) {
                int var6 = this.field4270[var5];
                this.field4277[var6][var1[var6]++] = var5++;
            }
            this.field4270 = null;
        }
        if (this.field4260 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field4285; var10++) {
            int var14 = this.field4260[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field4262 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field4262[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field4285) {
            int var13 = this.field4260[var12];
            this.field4262[var13][var8[var13]++] = var12++;
        }
        this.field4260 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIBSB)I")
    public final int method1646(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field4265[this.field4285] = arg0;
        this.field4253[this.field4285] = arg1;
        this.field4248[this.field4285] = arg2;
        this.field4268[this.field4285] = arg3;
        this.field4258[this.field4285] = -1;
        this.field4281[this.field4285] = arg4;
        this.field4283[this.field4285] = -1;
        this.field4269[this.field4285] = arg5;
        return this.field4285++;
    }

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "()V")
    public final void method1647() {
        for (int var1 = 0; var1 < this.field4263; var1++) {
            this.field4271[var1] = -this.field4271[var1];
        }
        for (int var2 = 0; var2 < this.field4285; var2++) {
            int var3 = this.field4265[var2];
            this.field4265[var2] = this.field4248[var2];
            this.field4248[var2] = var3;
        }
        this.method1625();
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    private class242() {
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([B)V")
    private class242(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1632(arg0);
        } else {
            this.method1624(arg0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(III)V")
    public class242(int arg0, int arg1, int arg2) {
        this.field4245 = new int[arg0];
        this.field4256 = new int[arg0];
        this.field4271 = new int[arg0];
        this.field4270 = new int[arg0];
        this.field4265 = new int[arg1];
        this.field4253 = new int[arg1];
        this.field4248 = new int[arg1];
        this.field4268 = new byte[arg1];
        this.field4282 = new byte[arg1];
        this.field4269 = new byte[arg1];
        this.field4281 = new short[arg1];
        this.field4283 = new short[arg1];
        this.field4258 = new byte[arg1];
        this.field4260 = new int[arg1];
        if (arg2 > 0) {
            this.field4279 = new byte[arg2];
            this.field4261 = new short[arg2];
            this.field4264 = new short[arg2];
            this.field4284 = new short[arg2];
            this.field4266 = new short[arg2];
            this.field4255 = new short[arg2];
            this.field4257 = new short[arg2];
            this.field4251 = new byte[arg2];
            this.field4252 = new byte[arg2];
            this.field4280 = new byte[arg2];
            this.field4287 = new byte[arg2];
            this.field4249 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([Lad;I)V")
    public class242(class242[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field4263 = 0;
        this.field4285 = 0;
        this.field4242 = 0;
        this.field4244 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class242 var15 = arg0[var9];
            if (var15 != null) {
                this.field4263 += var15.field4263;
                this.field4285 += var15.field4285;
                this.field4242 += var15.field4242;
                if (var15.field4282 == null) {
                    if (this.field4244 == -1) {
                        this.field4244 = var15.field4244;
                    }
                    if (this.field4244 != var15.field4244) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field4268 != null;
                var5 |= var15.field4269 != null;
                var6 |= var15.field4260 != null;
                var7 |= var15.field4283 != null;
                var8 |= var15.field4258 != null;
            }
        }
        this.field4245 = new int[this.field4263];
        this.field4256 = new int[this.field4263];
        this.field4271 = new int[this.field4263];
        this.field4270 = new int[this.field4263];
        this.field4265 = new int[this.field4285];
        this.field4253 = new int[this.field4285];
        this.field4248 = new int[this.field4285];
        if (var3) {
            this.field4268 = new byte[this.field4285];
        }
        if (var4) {
            this.field4282 = new byte[this.field4285];
        }
        if (var5) {
            this.field4269 = new byte[this.field4285];
        }
        if (var6) {
            this.field4260 = new int[this.field4285];
        }
        if (var7) {
            this.field4283 = new short[this.field4285];
        }
        if (var8) {
            this.field4258 = new byte[this.field4285];
        }
        this.field4281 = new short[this.field4285];
        if (this.field4242 > 0) {
            this.field4279 = new byte[this.field4242];
            this.field4261 = new short[this.field4242];
            this.field4264 = new short[this.field4242];
            this.field4284 = new short[this.field4242];
            this.field4266 = new short[this.field4242];
            this.field4255 = new short[this.field4242];
            this.field4257 = new short[this.field4242];
            this.field4251 = new byte[this.field4242];
            this.field4252 = new byte[this.field4242];
            this.field4280 = new byte[this.field4242];
            this.field4287 = new byte[this.field4242];
            this.field4249 = new byte[this.field4242];
        }
        this.field4263 = 0;
        this.field4285 = 0;
        this.field4242 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class242 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field4285; var12++) {
                    if (var3 && var11.field4268 != null) {
                        this.field4268[this.field4285] = var11.field4268[var12];
                    }
                    if (var4) {
                        if (var11.field4282 == null) {
                            this.field4282[this.field4285] = var11.field4244;
                        } else {
                            this.field4282[this.field4285] = var11.field4282[var12];
                        }
                    }
                    if (var5 && var11.field4269 != null) {
                        this.field4269[this.field4285] = var11.field4269[var12];
                    }
                    if (var6 && var11.field4260 != null) {
                        this.field4260[this.field4285] = var11.field4260[var12];
                    }
                    if (var7) {
                        if (var11.field4283 == null) {
                            this.field4283[this.field4285] = -1;
                        } else {
                            this.field4283[this.field4285] = var11.field4283[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field4258 == null || var11.field4258[var12] == -1) {
                            this.field4258[this.field4285] = -1;
                        } else {
                            this.field4258[this.field4285] = (byte) (var11.field4258[var12] + this.field4242);
                        }
                    }
                    this.field4281[this.field4285] = var11.field4281[var12];
                    this.field4265[this.field4285] = this.method1643(var11, var11.field4265[var12]);
                    this.field4253[this.field4285] = this.method1643(var11, var11.field4253[var12]);
                    this.field4248[this.field4285] = this.method1643(var11, var11.field4248[var12]);
                    this.field4285++;
                }
                for (int var13 = 0; var13 < var11.field4242; var13++) {
                    byte var14 = this.field4279[this.field4242] = var11.field4279[var13];
                    if (var14 == 0) {
                        this.field4261[this.field4242] = (short) this.method1643(var11, var11.field4261[var13]);
                        this.field4264[this.field4242] = (short) this.method1643(var11, var11.field4264[var13]);
                        this.field4284[this.field4242] = (short) this.method1643(var11, var11.field4284[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field4261[this.field4242] = var11.field4261[var13];
                        this.field4264[this.field4242] = var11.field4264[var13];
                        this.field4284[this.field4242] = var11.field4284[var13];
                        this.field4266[this.field4242] = var11.field4266[var13];
                        this.field4255[this.field4242] = var11.field4255[var13];
                        this.field4257[this.field4242] = var11.field4257[var13];
                        this.field4251[this.field4242] = var11.field4251[var13];
                        this.field4252[this.field4242] = var11.field4252[var13];
                        this.field4280[this.field4242] = var11.field4280[var13];
                    }
                    if (var14 == 2) {
                        this.field4287[this.field4242] = var11.field4287[var13];
                        this.field4249[this.field4242] = var11.field4249[var13];
                    }
                    this.field4242++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lad;ZZZZ)V")
    public class242(class242 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field4263 = arg0.field4263;
        this.field4285 = arg0.field4285;
        this.field4242 = arg0.field4242;
        if (arg1) {
            this.field4245 = arg0.field4245;
            this.field4256 = arg0.field4256;
            this.field4271 = arg0.field4271;
        } else {
            this.field4245 = new int[this.field4263];
            this.field4256 = new int[this.field4263];
            this.field4271 = new int[this.field4263];
            for (int var6 = 0; var6 < this.field4263; var6++) {
                this.field4245[var6] = arg0.field4245[var6];
                this.field4256[var6] = arg0.field4256[var6];
                this.field4271[var6] = arg0.field4271[var6];
            }
        }
        if (arg2) {
            this.field4281 = arg0.field4281;
        } else {
            this.field4281 = new short[this.field4285];
            for (int var7 = 0; var7 < this.field4285; var7++) {
                this.field4281[var7] = arg0.field4281[var7];
            }
        }
        if (arg3 || arg0.field4283 == null) {
            this.field4283 = arg0.field4283;
        } else {
            this.field4283 = new short[this.field4285];
            for (int var8 = 0; var8 < this.field4285; var8++) {
                this.field4283[var8] = arg0.field4283[var8];
            }
        }
        if (arg4) {
            this.field4269 = arg0.field4269;
        } else {
            this.field4269 = new byte[this.field4285];
            if (arg0.field4269 == null) {
                for (int var9 = 0; var9 < this.field4285; var9++) {
                    this.field4269[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field4285; var10++) {
                    this.field4269[var10] = arg0.field4269[var10];
                }
            }
        }
        this.field4265 = arg0.field4265;
        this.field4253 = arg0.field4253;
        this.field4248 = arg0.field4248;
        this.field4268 = arg0.field4268;
        this.field4282 = arg0.field4282;
        this.field4258 = arg0.field4258;
        this.field4244 = arg0.field4244;
        this.field4279 = arg0.field4279;
        this.field4261 = arg0.field4261;
        this.field4264 = arg0.field4264;
        this.field4284 = arg0.field4284;
        this.field4266 = arg0.field4266;
        this.field4255 = arg0.field4255;
        this.field4257 = arg0.field4257;
        this.field4251 = arg0.field4251;
        this.field4252 = arg0.field4252;
        this.field4280 = arg0.field4280;
        this.field4287 = arg0.field4287;
        this.field4249 = arg0.field4249;
        this.field4270 = arg0.field4270;
        this.field4260 = arg0.field4260;
        this.field4277 = arg0.field4277;
        this.field4262 = arg0.field4262;
        this.field4239 = arg0.field4239;
        this.field4254 = arg0.field4254;
        this.field4243 = arg0.field4243;
        this.field4278 = arg0.field4278;
        this.field4276 = arg0.field4276;
    }
}
