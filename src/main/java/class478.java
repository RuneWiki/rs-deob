import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class478 {

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "I")
    private int field6860;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
    private int field6852;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    private int field6853;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "Z")
    private boolean field6846;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    private int field6845;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
    private int field6847;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
    private int field6856;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    private int field6850;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "[I")
    private static int[] field6858 = new int[4];

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public int field6849;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
    private int field6851;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
    private int field6854;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
    private int field6857;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
    private int field6859;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "Lf;")
    private static class257 field6844;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "Lf;")
    private class257 field6848;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "Lf;")
    private static class257 field6855;

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "Lda;")
    private static class397 field6861;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "()V", line = 5)
    public static void method2794() {
        field6861 = null;
        field6844 = null;
        field6855 = null;
        field6858 = null;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lr;)V", line = 15)
    private static final void method2795(class98 arg0) {
        if (field6861 != null) {
            return;
        }
        class163 var1 = new class163(580, 1104, 1);
        var1.method1235((byte) 0, (short) 1024, (byte) 0, (short) 1024, (short) 1024, (short) 0, (byte) 0, (byte) -4, (short) 0, (short) 32767);
        var1.method1247((byte) 42, 128, 0, 0);
        var1.method1247((byte) 69, -128, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class302.field4241[var3];
            int var5 = class302.field4242[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class302.field4242[var12] >> 7;
                int var14 = class302.field4241[var12] * var4 >> 21;
                int var15 = class302.field4241[var12] * var5 >> 21;
                var1.method1247((byte) 107, var13, -var14, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1244(var7, -69, (byte) 0, var8, (short) 127, (byte) 0, (byte) 0, (short) 0, 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1244(var7, 111, (byte) 0, var10, (short) 127, (byte) 0, (byte) 0, (short) 0, var8);
                    var1.method1244(var7, -70, (byte) 0, var11, (short) 127, (byte) 0, (byte) 0, (short) 0, var10);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1244(1, 97, (byte) 0, var8, (short) 127, (byte) 0, (byte) 0, (short) 0, var7);
            }
        }
        var1.field2691 = var1.field2694;
        var1.field2672 = null;
        var1.field2658 = null;
        var1.field2668 = null;
        field6861 = arg0.method795(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "()V", line = 96)
    public static final void method2796() {
        field6861 = null;
        field6855 = null;
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "()V", line = 100)
    public final void method2797() {
        this.field6848 = null;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIII)Z", line = 108)
    public final boolean method2798(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field6846) {
            this.field6849 = 1073741823;
            var8 = this.field6860;
            var9 = this.field6852;
            var10 = this.field6853;
        } else {
            int var5 = this.field6860 - arg0;
            int var6 = this.field6852 - arg1;
            int var7 = this.field6853 - arg2;
            this.field6849 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field6849 == 0) {
                this.field6849 = 1;
            }
            var8 = (var5 << 8) / this.field6849;
            var9 = (var6 << 8) / this.field6849;
            var10 = (var7 << 8) / this.field6849;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field6859 = this.field6856 * arg3 / (this.field6846 ? 1024 : this.field6849);
        } else {
            this.field6859 = 0;
        }
        if (this.field6859 < 8) {
            this.field6848 = null;
            return false;
        }
        int var12 = class99.method830(this.field6859, false);
        if (var12 > arg3) {
            var12 = class270.method1702(arg3, (byte) -92);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field6857 != var12) {
            this.field6857 = var12;
        }
        this.field6851 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field6854 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field6848 = null;
        return true;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lr;Lvs;)Z", line = 168)
    public final boolean method2799(class98 arg0, class478 arg1) {
        return this.field6848 != null || this.method2800(arg0, arg1);
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(Lr;Lvs;)Z", line = 174)
    private final boolean method2800(class98 arg0, class478 arg1) {
        if (this.field6848 == null) {
            if (this.field6850 == 0) {
                if (class546.field8012.method2363((byte) -112, this.field6845)) {
                    int[] var3 = class546.field8012.method2365(this.field6857, this.field6845, false, -92, 0.7F, this.field6857);
                    this.field6848 = arg0.method806(var3, 0, this.field6857, this.field6857, this.field6857);
                }
            } else if (this.field6850 == 2) {
                this.method2804(arg0, arg1);
            } else if (this.field6850 == 1) {
                this.method2802(arg0, arg1);
            }
        }
        return this.field6848 != null;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lr;IIIIII)V", line = 210)
    public final void method2801(class98 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field6848 == null) {
            return;
        }
        int var8 = this.field6851 - arg5 & 0x3FFF;
        int var9 = this.field6854 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field6859) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field6859) / 2;
        if (var10 < arg4 && this.field6859 + var10 > 0 && var11 < arg3 && this.field6859 + var11 > 0) {
            this.field6848.method1634(arg1 + var11, arg2 + var10, this.field6859, this.field6859);
        }
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(Lr;Lvs;)V", line = 236)
    private final void method2802(class98 arg0, class478 arg1) {
        method2795(arg0);
        method2803(arg0);
        arg0.method764(field6858);
        arg0.method771(0, 0, this.field6857, this.field6857);
        arg0.method138();
        arg0.method824(0, 0, this.field6857, this.field6857, this.field6847 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field6846) {
                var3 = -arg1.field6860;
                var4 = -arg1.field6852;
                var5 = -arg1.field6853;
            } else {
                var3 = arg1.field6860 - this.field6860;
                var4 = arg1.field6852 - this.field6852;
                var5 = arg1.field6853 - this.field6853;
            }
        }
        if (this.field6851 != 0) {
            int var6 = class302.field4241[this.field6851];
            int var7 = class302.field4242[this.field6851];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field6854 != 0) {
            int var9 = class302.field4241[this.field6854];
            int var10 = class302.field4242[this.field6854];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class397 var12 = field6861.method475((byte) 0, 51200, true);
        if (arg0.method785()) {
            var12.method479((short) 0, (short) this.field6845);
        } else {
            var12.method464((short) 127, class546.field8012.method2359(-123, this.field6845).field5223);
            var12.method479((short) 0, (short) -1);
        }
        arg0.method794(1.0F);
        arg0.method756(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field6857 * 1024 / (var12.method452() - var12.method432());
        if (this.field6847 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method819(this.field6857 / 2, this.field6857 / 2, var13, var13);
        arg0.method755(arg0.method812());
        class152 var14 = arg0.method812();
        var14.method166(0, 0, arg0.method820() - var12.method450());
        var12.method448(var14, null, 1024, 1);
        int var15 = this.field6857 * 13 / 16;
        int var16 = (this.field6857 - var15) / 2;
        field6844.method1636(var16, var16, var15, var15, 0, this.field6847 | 0xFF000000, 1);
        this.field6848 = arg0.method749(0, 0, this.field6857, this.field6857, true);
        arg0.method138();
        arg0.method824(0, 0, this.field6857, this.field6857, 0, 0);
        field6855.method1636(0, 0, this.field6857, this.field6857, 1, 0, 0);
        this.field6848.method501(0, 0, 0);
        arg0.method771(field6858[0], field6858[1], field6858[2], field6858[3]);
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(Lr;)V", line = 325)
    private static final void method2803(class98 arg0) {
        if (field6855 != null) {
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
        field6855 = arg0.method806(var2, 0, 128, 128, 128);
        field6844 = arg0.method806(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "(Lr;Lvs;)V", line = 386)
    private final void method2804(class98 arg0, class478 arg1) {
        class163 var3 = class84.method639(class286.field4038, -4341, this.field6845, 0);
        if (var3 == null) {
            return;
        }
        arg0.method764(field6858);
        arg0.method771(0, 0, this.field6857, this.field6857);
        arg0.method824(0, 0, this.field6857, this.field6857, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field6846) {
                var4 = -arg1.field6860;
                var5 = -arg1.field6852;
                var6 = -arg1.field6853;
            } else {
                var4 = this.field6860 - arg1.field6860;
                var5 = this.field6852 - arg1.field6852;
                var6 = this.field6853 - arg1.field6853;
            }
        }
        if (this.field6851 != 0) {
            int var7 = -this.field6851 & 0x3FFF;
            int var8 = class302.field4241[var7];
            int var9 = class302.field4242[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field6854 != 0) {
            int var11 = -this.field6854 & 0x3FFF;
            int var12 = class302.field4241[var11];
            int var13 = class302.field4242[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method794(1.0F);
        arg0.method756(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class397 var15 = arg0.method795(var3, 2048, 0, 64, 768);
        int var16 = var15.method452() - var15.method432();
        int var17 = var15.method446() - var15.method478();
        int var18 = var15.method432() + var16 / 2;
        int var19 = var15.method478() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method819(var18, var19, var20, var20);
        arg0.method755(arg0.method812());
        class152 var21 = arg0.method777();
        var21.method166(0, 0, arg0.method820() - var15.method450());
        var15.method448(var21, null, arg0.method820(), 1);
        this.field6848 = arg0.method749(0, 0, this.field6857, this.field6857, true);
        this.field6848.method501(0, 0, 3);
        arg0.method771(field6858[0], field6858[1], field6858[2], field6858[3]);
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 476)
    public class478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field6860 = arg2;
        this.field6852 = arg3;
        this.field6853 = arg4;
        this.field6846 = arg7;
        this.field6845 = arg1;
        this.field6847 = arg6;
        this.field6856 = arg5;
        this.field6850 = arg0;
    }
}
