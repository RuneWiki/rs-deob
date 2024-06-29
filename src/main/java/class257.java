import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class257 {

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    private int field4192;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    private int field4188;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    private int field4196;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "Z")
    private boolean field4199;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    private int field4193;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    private int field4194;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    private int field4197;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    private int field4202;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "[I")
    private static int[] field4191 = new int[4];

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    private int field4189;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    private int field4190;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    private int field4195;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public int field4200;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    private int field4201;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "Lda;")
    private class197 field4198;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Lkh;")
    private static class221 field4187;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "[B")
    private static byte[] field4186;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lrg;)Z")
    private final boolean method1694(class257 arg0) {
        if (this.field4198 == null) {
            if (this.field4202 == 0) {
                this.field4198 = class287.field4555.method237(true, this.field4201, (byte) -75, class287.field4571, this.field4193);
            } else if (this.field4202 == 2) {
                this.method1695(arg0);
            } else if (this.field4202 == 1) {
                this.method1696(arg0);
            }
        }
        return this.field4198 != null;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Lrg;)V")
    private final void method1695(class257 arg0) {
        class221 var2 = class221.method1487(class13.field186, this.field4193, 0);
        if (var2 == null) {
            return;
        }
        this.field4198 = new class197(this.field4201, this.field4201);
        class283.method1837(field4191);
        this.field4198.method1309();
        class287.method1936();
        class283.method1855(0, 0, this.field4201, this.field4201, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field4199) {
                var3 = -arg0.field4192;
                var4 = -arg0.field4188;
                var5 = -arg0.field4196;
            } else {
                var3 = this.field4192 - arg0.field4192;
                var4 = this.field4188 - arg0.field4188;
                var5 = this.field4196 - arg0.field4196;
            }
        }
        if (this.field4190 != 0) {
            int var6 = class287.field4567[this.field4190];
            int var7 = class287.field4562[this.field4190];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field4189 != 0) {
            int var9 = this.field4189 - 1024 & 0x7FF;
            int var10 = class287.field4567[var9];
            int var11 = class287.field4562[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class18 var13 = var2.method1470(64, 768, -var3, -var4, -var5);
        int var14 = var13.method113() - var13.method114();
        int var15 = var13.method108() - var13.method110();
        int var16 = var13.method114() + var14 / 2;
        int var17 = var13.method110() + var15 / 2;
        if (var14 > var15) {
            var13.method124(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field4201);
        } else {
            var13.method124(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field4201);
        }
        class240.field3944.method186(55);
        class283.method1847(field4191);
        class287.method1936();
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(Lrg;)V")
    private final void method1696(class257 arg0) {
        method1697();
        method1702();
        this.field4198 = new class271(this.field4201, this.field4201);
        class283.method1837(field4191);
        this.field4198.method1309();
        class287.method1936();
        class283.method1855(0, 0, this.field4201, this.field4201, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field4199) {
                var2 = -arg0.field4192;
                var3 = -arg0.field4188;
                var4 = -arg0.field4196;
            } else {
                var2 = this.field4192 - arg0.field4192;
                var3 = this.field4188 - arg0.field4188;
                var4 = this.field4196 - arg0.field4196;
            }
        }
        if (this.field4190 != 0) {
            int var5 = class287.field4567[this.field4190];
            int var6 = class287.field4562[this.field4190];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field4189 != 0) {
            int var8 = this.field4189 - 1024 & 0x7FF;
            int var9 = class287.field4567[var8];
            int var10 = class287.field4562[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class235.method1555(field4187.field3701, 0, field4187.field3696, (short) class287.field4555.method234((byte) -68, this.field4193));
        class18 var12 = field4187.method1470(64, 512, -var2, -var3, -var4);
        int var13 = var12.method113() - var12.method114();
        int var14 = var12.method108() - var12.method110();
        if (var13 > var14) {
            int var15 = this.field4194 == 0 ? (var13 << 9) / this.field4201 : (var13 * 16 << 9) / (this.field4201 * 13);
            var12.method124(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field4194 == 0 ? (var14 << 9) / this.field4201 : (var14 * 16 << 9) / (this.field4201 * 13);
            var12.method124(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field4194 == 0) {
            for (int var17 = 0; var17 < class283.field4490.length; var17++) {
                if (class283.field4490[var17] != 0) {
                    class283.field4490[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method1701();
            this.method1700();
        }
        class240.field3944.method186(109);
        class283.method1847(field4191);
        class287.method1936();
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "()V")
    private static final void method1697() {
        if (field4187 != null) {
            return;
        }
        class221 var0 = field4187 = new class221(260, 480, 0);
        int[] var1 = var0.field3736;
        int[] var2 = var0.field3731;
        int[] var3 = var0.field3737;
        int[] var4 = var0.field3699;
        int[] var5 = var0.field3738;
        int[] var6 = var0.field3690;
        var0.field3739 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class287.field4567[var8] >> 1;
            int var10 = class287.field4562[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var17 = var11 * 1024 / 16;
                int var18 = class287.field4562[var17] >> 9;
                int var19 = (class287.field4567[var17] >> 1) * var9 >> 23;
                int var20 = (class287.field4567[var17] >> 1) * var10 >> 23;
                var1[var0.field3739] = var20;
                var2[var0.field3739] = var18;
                var3[var0.field3739] = -var19;
                var0.field3739++;
            }
            if (var7 > 0) {
                int var12 = var7 * 15 + 2;
                int var13 = var12 - 15;
                var4[var0.field3696] = 0;
                var5[var0.field3696] = var13;
                var6[var0.field3696] = var12;
                var0.field3696++;
                for (int var14 = 1; var14 < 15; var14++) {
                    int var15 = var13 + 1;
                    int var16 = var12 + 1;
                    var4[var0.field3696] = var13;
                    var5[var0.field3696] = var15;
                    var6[var0.field3696] = var12;
                    var0.field3696++;
                    var4[var0.field3696] = var15;
                    var5[var0.field3696] = var16;
                    var6[var0.field3696] = var12;
                    var0.field3696++;
                    var13 = var15;
                    var12 = var16;
                }
                var4[var0.field3696] = var12;
                var5[var0.field3696] = var13;
                var6[var0.field3696] = 1;
                var0.field3696++;
            }
        }
        var0.field3718 = var0.field3739;
        var0.field3710 = null;
        var0.field3716 = null;
        var0.field3712 = null;
        var0.field3733 = null;
        var0.field3697 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([IIIIIIIIIII)V")
    private final void method1698(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field4186[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
                } else {
                    arg0[arg4] |= 0xFF000000;
                }
                arg4++;
                arg2 += arg8;
            }
            arg3 += arg9;
            arg2 = var12;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "()V")
    private final void method1699() {
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "()V")
    private final void method1700() {
        int var1 = this.field4201;
        int var2 = this.field4201;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class283.field4491 - var1;
        if (var2 > class283.field4489) {
            var2 -= var2 - class283.field4489;
        }
        if (class283.field4486 > 0) {
            int var9 = class283.field4486;
            var2 -= var9;
            var7 += class283.field4491 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class283.field4484) {
            int var10 = var1 - class283.field4484;
            var1 -= var10;
            var8 += var10;
        }
        if (class283.field4487 > 0) {
            int var11 = class283.field4487;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method1698(class283.field4490, this.field4194, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "()V")
    private final void method1701() {
        int var1 = this.field4201 * 3 / 32;
        int var3 = this.field4201 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class283.field4491 * var1 + var1;
        int var8 = class283.field4491 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class283.field4489) {
            var4 = var3 - (var1 + var3 - class283.field4489);
        }
        if (var1 < class283.field4486) {
            int var11 = class283.field4486 - var1;
            var4 -= var11;
            var7 += class283.field4491 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class283.field4484) {
            int var12 = var1 + var3 - class283.field4484;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class283.field4487) {
            int var13 = class283.field4487 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method1703(class283.field4490, 0, this.field4194, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "()V")
    private static final void method1702() {
        if (field4186 != null) {
            return;
        }
        field4186 = new byte[16384];
        for (int var0 = 0; var0 < 64; var0++) {
            int var1 = 64 - var0;
            int var2 = var1 * var1;
            int var3 = 128 - var0 - 1;
            int var4 = var0 * 128;
            int var5 = var3 * 128;
            for (int var6 = 0; var6 < 64; var6++) {
                int var7 = 64 - var6;
                int var8 = var7 * var7;
                int var9 = 128 - var6 - 1;
                int var10 = 256 - (var2 + var8 << 8) / 4096;
                int var11 = var10 * 16 * 192 / 1536;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                field4186[var4 + var6] = field4186[var4 + var9] = field4186[var5 + var6] = field4186[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([IIIIIIIIIIII)V")
    private final void method1703(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field4186[(arg3 >> 16) + var15] & 0xFF) + 64;
                    if (var18 > 255) {
                        var18 = 255;
                    }
                    int var19 = 256 - var18;
                    arg0[arg5] = ((arg2 & 0xFF00FF) * var19 + (var17 & 0xFF00FF) * var18 & -16711936) + ((arg2 & 0xFF00) * var19 + (var17 & 0xFF00) * var18 & 0xFF0000) >> 8 | 0xFF000000;
                }
                arg5++;
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)Z")
    public final boolean method1704(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field4199) {
            this.field4200 = 1073741823;
            var8 = this.field4192;
            var9 = this.field4188;
            var10 = this.field4196;
        } else {
            int var5 = this.field4192 - arg0;
            int var6 = this.field4188 - arg1;
            int var7 = this.field4196 - arg2;
            this.field4200 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field4200 == 0) {
                this.field4200 = 1;
            }
            var8 = (var5 << 8) / this.field4200;
            var9 = (var6 << 8) / this.field4200;
            var10 = (var7 << 8) / this.field4200;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field4195 = this.field4197 * arg3 / (this.field4199 ? 1024 : this.field4200);
        } else {
            this.field4195 = 0;
        }
        if (this.field4195 < 8) {
            this.method1699();
            this.field4198 = null;
            return false;
        }
        int var12 = class116.method809((byte) 110, this.field4195);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field4201 != var12) {
            this.field4201 = var12;
        }
        this.field4190 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field4189 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field4198 = null;
        return true;
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "()V")
    public static void method1705() {
        field4187 = null;
        field4186 = null;
        field4191 = null;
    }

    @OriginalMember(owner = "client!rg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1699();
        super.finalize();
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field4192 = arg2;
        this.field4188 = arg3;
        this.field4196 = arg4;
        this.field4199 = arg7;
        this.field4193 = arg1;
        this.field4194 = arg6;
        this.field4197 = arg5;
        this.field4202 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIILrg;)V")
    public final void method1706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class257 arg6) {
        int var8 = this.field4190 - arg4 & 0x7FF;
        int var9 = this.field4189 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field4195) / 2 + var10;
        int var13 = (arg2 - this.field4195) / 2 + var11;
        if (var12 < arg3 && this.field4195 + var12 > 0 && var13 < arg2 && this.field4195 + var13 > 0 && this.method1694(arg6)) {
            this.field4198.method455(arg0 + var13, arg1 + var12, this.field4195, this.field4195);
        }
    }
}
