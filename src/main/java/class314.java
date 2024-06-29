import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class314 {

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    private int field4323;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    private int field4324;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    private int field4319;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "Z")
    private boolean field4330;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    private int field4322;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    private int field4333;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    private int field4335;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    private int field4331;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "[I")
    private static int[] field4332 = new int[4];

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    private int field4320;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    private int field4321;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    private int field4325;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public int field4329;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    private int field4334;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Llf;")
    private static class130 field4326;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Llf;")
    private static class130 field4327;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Llf;")
    private class130 field4328;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "Lhc;")
    private static class75 field4336;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Laa;Lbf;)V", line = 8)
    private final void method1990(class281 arg0, class314 arg1) {
        class279 var3 = class33.method247(class362.field5085, this.field4322, 0, 81);
        if (var3 == null) {
            return;
        }
        arg0.method1796(field4332);
        arg0.method1735(0, 0, this.field4334, this.field4334);
        arg0.method1785(0, 0, this.field4334, this.field4334, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field4330) {
                var4 = -arg1.field4323;
                var5 = -arg1.field4324;
                var6 = -arg1.field4319;
            } else {
                var4 = this.field4323 - arg1.field4323;
                var5 = this.field4324 - arg1.field4324;
                var6 = this.field4319 - arg1.field4319;
            }
        }
        if (this.field4325 != 0) {
            int var7 = -this.field4325 & 0x3FFF;
            int var8 = class362.field5083[var7];
            int var9 = class362.field5082[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field4321 != 0) {
            int var11 = -this.field4321 & 0x3FFF;
            int var12 = class362.field5083[var11];
            int var13 = class362.field5082[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method1826(1.0F);
        arg0.method1814(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class75 var15 = arg0.method1736(var3, 1024, 0, 64, 768);
        int var16 = var15.method498() - var15.method522();
        int var17 = var15.method503() - var15.method523();
        int var18 = var15.method522() + var16 / 2;
        int var19 = var15.method523() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method1763(var18, var19, var20, var20);
        arg0.method1724(arg0.method1783());
        class261 var21 = arg0.method1769();
        var21.method882(0, 0, arg0.method1825() - var15.method513());
        var15.method519(var21, (class38) null, arg0.method1825(), 1);
        this.field4328 = arg0.method1751(0, 0, this.field4334, this.field4334, true);
        this.field4328.method806(0, 0, 3);
        arg0.method1735(field4332[0], field4332[1], field4332[2], field4332[3]);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Laa;Lbf;)Z", line = 97)
    private final boolean method1991(class281 arg0, class314 arg1) {
        if (this.field4328 == null) {
            if (this.field4331 == 0) {
                if (class262.field3587.method610((byte) 0, this.field4322)) {
                    int[] var3 = class262.field3587.method608(this.field4322, 0.7F, this.field4334, false, -76, this.field4334);
                    this.field4328 = arg0.method1773(var3, 0, this.field4334, this.field4334, this.field4334);
                }
            } else if (this.field4331 == 2) {
                this.method1990(arg0, arg1);
            } else if (this.field4331 == 1) {
                this.method1992(arg0, arg1);
            }
        }
        return this.field4328 != null;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(Laa;Lbf;)V", line = 132)
    private final void method1992(class281 arg0, class314 arg1) {
        method1993(arg0);
        method1998(arg0);
        arg0.method1796(field4332);
        arg0.method1735(0, 0, this.field4334, this.field4334);
        arg0.method1779();
        arg0.method1785(0, 0, this.field4334, this.field4334, this.field4333 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field4330) {
                var3 = -arg1.field4323;
                var4 = -arg1.field4324;
                var5 = -arg1.field4319;
            } else {
                var3 = arg1.field4323 - this.field4323;
                var4 = arg1.field4324 - this.field4324;
                var5 = arg1.field4319 - this.field4319;
            }
        }
        if (this.field4325 != 0) {
            int var6 = class362.field5083[this.field4325];
            int var7 = class362.field5082[this.field4325];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field4321 != 0) {
            int var9 = class362.field5083[this.field4321];
            int var10 = class362.field5082[this.field4321];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class75 var12 = field4336.method529((byte) 0, 25600, true);
        if (arg0.method1806()) {
            var12.method539((short) 0, (short) this.field4322);
        } else {
            var12.method509((short) 127, class262.field3587.method607(false, this.field4322).field2303);
            var12.method539((short) 0, (short) -1);
        }
        arg0.method1826(1.0F);
        arg0.method1814(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field4334 * 1024 / (var12.method498() - var12.method522());
        if (this.field4333 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method1763(this.field4334 / 2, this.field4334 / 2, var13, var13);
        arg0.method1724(arg0.method1783());
        class261 var14 = arg0.method1783();
        var14.method882(0, 0, arg0.method1825() - var12.method513());
        var12.method519(var14, (class38) null, 1024, 1);
        int var15 = this.field4334 * 13 / 16;
        int var16 = (this.field4334 - var15) / 2;
        field4326.method807(var16, var16, var15, var15, 1, this.field4333 | 0xFF000000, 1);
        this.field4328 = arg0.method1751(0, 0, this.field4334, this.field4334, true);
        arg0.method1779();
        arg0.method1785(0, 0, this.field4334, this.field4334, 0, 0);
        field4327.method807(0, 0, this.field4334, this.field4334, 0, 0, 0);
        this.field4328.method806(0, 0, 0);
        arg0.method1735(field4332[0], field4332[1], field4332[2], field4332[3]);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Laa;)V", line = 222)
    private static final void method1993(class281 arg0) {
        if (field4336 != null) {
            return;
        }
        class279 var1 = new class279(580, 1104, 1);
        var1.method1704((short) 0, (byte) 0, (byte) 0, (short) 0, (short) 1024, (short) 1024, (short) 1024, (short) 32767, (byte) 0, 0);
        var1.method1701(0, 1, 128, 0);
        var1.method1701(0, 1, -128, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class362.field5083[var3];
            int var5 = class362.field5082[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class362.field5082[var12] >> 8;
                int var14 = class362.field5083[var12] * var4 >> 23;
                int var15 = class362.field5083[var12] * var5 >> 23;
                var1.method1701(-var14, 1, var13, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1709(0, var7, (byte) 0, (byte) 0, (short) 0, var8, (byte) 0, 0, (short) 127);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1709(var8, var7, (byte) 0, (byte) 0, (short) 0, var10, (byte) 0, 0, (short) 127);
                    var1.method1709(var10, var7, (byte) 0, (byte) 0, (short) 0, var11, (byte) 0, 0, (short) 127);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1709(var7, 1, (byte) 0, (byte) 0, (short) 0, var8, (byte) 0, 0, (short) 127);
            }
        }
        var1.field3802 = var1.field3823;
        var1.field3783 = null;
        var1.field3793 = null;
        var1.field3821 = null;
        field4336 = arg0.method1736(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)Z", line = 310)
    public final boolean method1994(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field4330) {
            this.field4329 = 1073741823;
            var8 = this.field4323;
            var9 = this.field4324;
            var10 = this.field4319;
        } else {
            int var5 = this.field4323 - arg0;
            int var6 = this.field4324 - arg1;
            int var7 = this.field4319 - arg2;
            this.field4329 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field4329 == 0) {
                this.field4329 = 1;
            }
            var8 = (var5 << 8) / this.field4329;
            var9 = (var6 << 8) / this.field4329;
            var10 = (var7 << 8) / this.field4329;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field4320 = this.field4335 * arg3 / (this.field4330 ? 1024 : this.field4329);
        } else {
            this.field4320 = 0;
        }
        if (this.field4320 < 8) {
            this.field4328 = null;
            return false;
        }
        int var12 = class164.method1089(this.field4320, (byte) -121);
        if (var12 > arg3) {
            var12 = class105.method718(256, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field4334 != var12) {
            this.field4334 = var12;
        }
        this.field4325 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field4321 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field4328 = null;
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(Laa;Lbf;)Z", line = 367)
    public final boolean method1995(class281 arg0, class314 arg1) {
        return this.field4328 != null || this.method1991(arg0, arg1);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()V", line = 370)
    public static void method1996() {
        field4336 = null;
        field4326 = null;
        field4327 = null;
        field4332 = null;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()V", line = 377)
    public final void method1997() {
        this.field4328 = null;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Laa;)V", line = 384)
    private static final void method1998(class281 arg0) {
        if (field4327 != null) {
            return;
        }
        int[] var1 = new int[16384];
        int[] var2 = new int[16384];
        for (int var3 = 0; var3 < 64; var3++) {
            int var4 = 64 - var3;
            int var5 = var4 * var4;
            int var6 = 128 - var3 - 1;
            int var7 = var3 * 128;
            int var8 = var6 * 128;
            for (int var9 = 0; var9 < 64; var9++) {
                int var10 = 64 - var9;
                int var11 = var10 * var10;
                int var12 = 128 - var9 - 1;
                int var13 = 256 - (var5 + var11 << 8) / 4096;
                int var14 = var13 * 16 * 192 / 1536;
                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 255) {
                    var14 = 255;
                }
                int var15 = var14 / 2;
                var2[var7 + var9] = var2[var7 + var12] = var2[var8 + var9] = var2[var8 + var12] = var14 | 0xFF00 << 16;
                var1[var7 + var9] = var1[var7 + var12] = var1[var8 + var9] = var1[var8 + var12] = 127 - var15 << 24 | 0xFFFFFF;
            }
        }
        field4327 = arg0.method1773(var2, 0, 128, 128, 128);
        field4326 = arg0.method1773(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "()V", line = 446)
    public static final void method1999() {
        field4336 = null;
        field4327 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Laa;IIIIII)V", line = 450)
    public final void method2000(class281 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4328 == null) {
            return;
        }
        int var8 = this.field4325 - arg5 & 0x3FFF;
        int var9 = this.field4321 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field4320) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field4320) / 2;
        if (var10 < arg4 && this.field4320 + var10 > 0 && var11 < arg3 && this.field4320 + var11 > 0) {
            this.field4328.method872(arg1 + var11, arg2 + var10, this.field4320, this.field4320);
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 478)
    public class314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field4323 = arg2;
        this.field4324 = arg3;
        this.field4319 = arg4;
        this.field4330 = arg7;
        this.field4322 = arg1;
        this.field4333 = arg6;
        this.field4335 = arg5;
        this.field4331 = arg0;
    }
}
