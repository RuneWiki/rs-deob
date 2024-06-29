import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class585 {

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    private int field8242;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    private int field8240;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    private int field8237;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Z")
    private boolean field8241;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    private int field8235;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    private int field8229;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    private int field8236;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    private int field8243;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "[I")
    private static int[] field8226 = new int[4];

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    private int field8227;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    private int field8228;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    private int field8233;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public int field8234;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    private int field8238;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Lka;")
    private static class471 field8239;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Loia;")
    private class88 field8230;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Loia;")
    private static class88 field8231;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Loia;")
    private static class88 field8232;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()V", line = 3)
    public final void method3314() {
        this.field8230 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)Z", line = 9)
    public final boolean method3315(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field8241) {
            this.field8234 = 1073741823;
            var8 = this.field8242;
            var9 = this.field8240;
            var10 = this.field8237;
        } else {
            int var5 = this.field8242 - arg0;
            int var6 = this.field8240 - arg1;
            int var7 = this.field8237 - arg2;
            this.field8234 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field8234 == 0) {
                this.field8234 = 1;
            }
            var8 = (var5 << 8) / this.field8234;
            var9 = (var6 << 8) / this.field8234;
            var10 = (var7 << 8) / this.field8234;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field8228 = this.field8236 * arg3 / (this.field8241 ? 1024 : this.field8234);
        } else {
            this.field8228 = 0;
        }
        if (this.field8228 < 8) {
            this.field8230 = null;
            return false;
        }
        int var12 = class123.method837(108, this.field8228);
        if (var12 > arg3) {
            var12 = class42.method282(-1350259935, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field8227 != var12) {
            this.field8227 = var12;
        }
        this.field8238 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field8233 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field8230 = null;
        return true;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lha;IIIIII)V", line = 69)
    public final void method3316(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field8230 == null) {
            return;
        }
        int var8 = this.field8238 - arg5 & 0x3FFF;
        int var9 = this.field8233 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field8228) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field8228) / 2;
        if (var10 < arg4 && this.field8228 + var10 > 0 && var11 < arg3 && this.field8228 + var11 > 0) {
            this.field8230.method668(arg1 + var11, arg2 + var10, this.field8228, this.field8228);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lha;)V", line = 97)
    private static final void method3317(class58 arg0) {
        if (field8239 != null) {
            return;
        }
        class6 var1 = new class6(580, 1104, 1);
        var1.method37((byte) 0, (short) 0, (short) 1024, 126, (short) 1024, (short) 0, (byte) 0, (short) 32767, (short) 1024, (byte) 0);
        var1.method31(true, 0, 0, 128);
        var1.method31(true, 0, 0, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class164.field2258[var3];
            int var5 = class164.field2252[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class164.field2252[var12] >> 7;
                int var14 = class164.field2258[var12] * var4 >> 21;
                int var15 = class164.field2258[var12] * var5 >> 21;
                var1.method31(true, -var14, var15, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method40(var7, (byte) 0, (short) 0, (short) 127, (byte) 0, (byte) 0, 0, var8, -10373);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method40(var7, (byte) 0, (short) 0, (short) 127, (byte) 0, (byte) 0, var8, var10, -10373);
                    var1.method40(var7, (byte) 0, (short) 0, (short) 127, (byte) 0, (byte) 0, var10, var11, -10373);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method40(1, (byte) 0, (short) 0, (short) 127, (byte) 0, (byte) 0, var7, var8, -10373);
            }
        }
        var1.field96 = var1.field63;
        var1.field78 = null;
        var1.field102 = null;
        var1.field90 = null;
        field8239 = arg0.method397(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Lha;)V", line = 179)
    private static final void method3318(class58 arg0) {
        if (field8231 != null) {
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
        field8231 = arg0.method426(128, 128, var2, -1, 128, 0);
        field8232 = arg0.method426(128, 128, var1, -1, 128, 0);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lha;Lid;)Z", line = 241)
    public final boolean method3319(class58 arg0, class585 arg1) {
        return this.field8230 != null || this.method3323(arg0, arg1);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "()V", line = 244)
    public static final void method3320() {
        field8239 = null;
        field8231 = null;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "()V", line = 254)
    public static void method3321() {
        field8239 = null;
        field8232 = null;
        field8231 = null;
        field8226 = null;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Lha;Lid;)V", line = 264)
    private final void method3322(class58 arg0, class585 arg1) {
        class6 var3 = class393.method2470(0, class559.field7844, this.field8235, 0);
        if (var3 == null) {
            return;
        }
        arg0.method398(field8226);
        arg0.method469(0, 0, this.field8227, this.field8227);
        arg0.method431(0, 0, this.field8227, this.field8227, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field8241) {
                var4 = -arg1.field8242;
                var5 = -arg1.field8240;
                var6 = -arg1.field8237;
            } else {
                var4 = this.field8242 - arg1.field8242;
                var5 = this.field8240 - arg1.field8240;
                var6 = this.field8237 - arg1.field8237;
            }
        }
        if (this.field8238 != 0) {
            int var7 = -this.field8238 & 0x3FFF;
            int var8 = class164.field2258[var7];
            int var9 = class164.field2252[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field8233 != 0) {
            int var11 = -this.field8233 & 0x3FFF;
            int var12 = class164.field2258[var11];
            int var13 = class164.field2252[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method406(1.0F);
        arg0.method390(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class471 var15 = arg0.method397(var3, 2048, 0, 64, 768);
        int var16 = var15.method259() - var15.method234();
        int var17 = var15.method222() - var15.method253();
        int var18 = var15.method234() + var16 / 2;
        int var19 = var15.method253() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method391(var18, var19, var20, var20);
        arg0.method483(arg0.method427());
        class513 var21 = arg0.method439();
        var21.method339(0, 0, arg0.method387() - var15.method260());
        var15.method262(var21, null, arg0.method387(), 1);
        this.field8230 = arg0.method386(0, 0, this.field8227, this.field8227, true);
        this.field8230.method661(0, 0, 3);
        arg0.method469(field8226[0], field8226[1], field8226[2], field8226[3]);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(Lha;Lid;)Z", line = 349)
    private final boolean method3323(class58 arg0, class585 arg1) {
        if (this.field8230 == null) {
            if (this.field8243 == 0) {
                if (class487.field6844.method531(this.field8235, -121)) {
                    int[] var3 = class487.field6844.method530(this.field8227, -102, false, 0.7F, this.field8227, this.field8235);
                    this.field8230 = arg0.method426(this.field8227, this.field8227, var3, -1, this.field8227, 0);
                }
            } else if (this.field8243 == 2) {
                this.method3322(arg0, arg1);
            } else if (this.field8243 == 1) {
                this.method3324(arg0, arg1);
            }
        }
        return this.field8230 != null;
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(Lha;Lid;)V", line = 383)
    private final void method3324(class58 arg0, class585 arg1) {
        method3317(arg0);
        method3318(arg0);
        arg0.method398(field8226);
        arg0.method469(0, 0, this.field8227, this.field8227);
        arg0.method440();
        arg0.method431(0, 0, this.field8227, this.field8227, this.field8229 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field8241) {
                var3 = -arg1.field8242;
                var4 = -arg1.field8240;
                var5 = -arg1.field8237;
            } else {
                var3 = arg1.field8242 - this.field8242;
                var4 = arg1.field8240 - this.field8240;
                var5 = arg1.field8237 - this.field8237;
            }
        }
        if (this.field8238 != 0) {
            int var6 = class164.field2258[this.field8238];
            int var7 = class164.field2252[this.field8238];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field8233 != 0) {
            int var9 = class164.field2258[this.field8233];
            int var10 = class164.field2252[this.field8233];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class471 var12 = field8239.method226((byte) 0, 51200, true);
        var12.method255((short) 0, (short) this.field8235);
        arg0.method406(1.0F);
        arg0.method390(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field8227 * 1024 / (var12.method259() - var12.method234());
        if (this.field8229 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method391(this.field8227 / 2, this.field8227 / 2, var13, var13);
        arg0.method483(arg0.method427());
        class513 var14 = arg0.method427();
        var14.method339(0, 0, arg0.method387() - var12.method260());
        var12.method262(var14, null, 1024, 1);
        int var15 = this.field8227 * 13 / 16;
        int var16 = (this.field8227 - var15) / 2;
        field8232.method654(var16, var16, var15, var15, 0, this.field8229 | 0xFF000000, 1);
        this.field8230 = arg0.method386(0, 0, this.field8227, this.field8227, true);
        arg0.method440();
        arg0.method431(0, 0, this.field8227, this.field8227, 0, 0);
        field8231.method654(0, 0, this.field8227, this.field8227, 1, 0, 0);
        this.field8230.method661(0, 0, 0);
        arg0.method469(field8226[0], field8226[1], field8226[2], field8226[3]);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 470)
    public class585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field8242 = arg2;
        this.field8240 = arg3;
        this.field8237 = arg4;
        this.field8241 = arg7;
        this.field8235 = arg1;
        this.field8229 = arg6;
        this.field8236 = arg5;
        this.field8243 = arg0;
    }
}
