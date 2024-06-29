import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class195 {

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    private int field2812;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    private int field2816;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
    private int field2828;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "Z")
    private boolean field2815;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
    private int field2825;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    private int field2814;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
    private int field2823;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    private int field2827;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "[I")
    private static int[] field2824 = new int[4];

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    private int field2813;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    private int field2817;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
    private int field2820;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
    private int field2821;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    public int field2826;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "Lts;")
    private static class116 field2818;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "Lwn;")
    private class77 field2819;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "Lwn;")
    private static class77 field2822;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "Lwn;")
    private static class77 field2829;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "()V")
    public static final void method1347() {
        field2818 = null;
        field2829 = null;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "()V")
    public static void method1348() {
        field2818 = null;
        field2822 = null;
        field2829 = null;
        field2824 = null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lea;)V")
    private static final void method1349(class58 arg0) {
        if (field2829 != null) {
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
        field2829 = arg0.method232(var2, 0, 128, 128, 128);
        field2822 = arg0.method232(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lea;Lvp;)V")
    private final void method1350(class58 arg0, class195 arg1) {
        method1353(arg0);
        method1349(arg0);
        arg0.method173(field2824);
        arg0.method227(0, 0, this.field2821, this.field2821);
        arg0.method202();
        arg0.method245(0, 0, this.field2821, this.field2821, this.field2814 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field2815) {
                var3 = -arg1.field2812;
                var4 = -arg1.field2816;
                var5 = -arg1.field2828;
            } else {
                var3 = arg1.field2812 - this.field2812;
                var4 = arg1.field2816 - this.field2816;
                var5 = arg1.field2828 - this.field2828;
            }
        }
        if (this.field2813 != 0) {
            int var6 = class136.field2021[this.field2813];
            int var7 = class136.field2020[this.field2813];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field2817 != 0) {
            int var9 = class136.field2021[this.field2817];
            int var10 = class136.field2020[this.field2817];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class116 var12 = field2818.method907((byte) 0, 25600, true);
        if (arg0.method197()) {
            var12.method877((short) 0, (short) this.field2825);
        } else {
            var12.method909((short) 127, class325.field4404.method1366(this.field2825, -11039).field723);
            var12.method877((short) 0, (short) -1);
        }
        arg0.method248(1.0F);
        arg0.method171(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field2821 * 1024 / (var12.method884() - var12.method868());
        if (this.field2814 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method194(this.field2821 / 2, this.field2821 / 2, var13, var13);
        arg0.method168(arg0.method220());
        class309 var14 = arg0.method220();
        var14.method1866(0, 0, arg0.method258() - var12.method863());
        var12.method881(var14, (class153) null, 1024, 1);
        int var15 = this.field2821 * 13 / 16;
        int var16 = (this.field2821 - var15) / 2;
        field2822.method618(var16, var16, var15, var15, 1, this.field2814 | 0xFF000000, 1);
        this.field2819 = arg0.method177(0, 0, this.field2821, this.field2821, true);
        arg0.method202();
        arg0.method245(0, 0, this.field2821, this.field2821, 0, 0);
        field2829.method618(0, 0, this.field2821, this.field2821, 0, 0, 0);
        this.field2819.method624(0, 0, 0);
        arg0.method227(field2824[0], field2824[1], field2824[2], field2824[3]);
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "()V")
    public final void method1351() {
        this.field2819 = null;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(Lea;Lvp;)Z")
    public final boolean method1352(class58 arg0, class195 arg1) {
        return this.field2819 != null || this.method1355(arg0, arg1);
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(Lea;)V")
    private static final void method1353(class58 arg0) {
        if (field2818 != null) {
            return;
        }
        class98 var1 = new class98(580, 1104, 1);
        var1.method764((short) 32767, -29572, (short) 1024, (short) 0, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (short) 0, (byte) 0);
        var1.method757(128, 0, 99, 0);
        var1.method757(-128, 0, 76, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class136.field2021[var3];
            int var5 = class136.field2020[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class136.field2020[var12] >> 8;
                int var14 = class136.field2021[var12] * var4 >> 23;
                int var15 = class136.field2021[var12] * var5 >> 23;
                var1.method757(var13, -var14, 77, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method761(var7, (byte) 0, 0, (byte) 0, (byte) 0, (short) 0, var8, (short) 127, false);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method761(var7, (byte) 0, var8, (byte) 0, (byte) 0, (short) 0, var10, (short) 127, false);
                    var1.method761(var7, (byte) 0, var10, (byte) 0, (byte) 0, (short) 0, var11, (short) 127, false);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method761(1, (byte) 0, var7, (byte) 0, (byte) 0, (short) 0, var8, (short) 127, false);
            }
        }
        var1.field1378 = var1.field1348;
        var1.field1341 = null;
        var1.field1365 = null;
        var1.field1373 = null;
        field2818 = arg0.method254(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lea;IIIIII)V")
    public final void method1354(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2819 == null) {
            return;
        }
        int var8 = this.field2813 - arg5 & 0x3FFF;
        int var9 = this.field2817 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field2820) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field2820) / 2;
        if (var10 < arg4 && this.field2820 + var10 > 0 && var11 < arg3 && this.field2820 + var11 > 0) {
            this.field2819.method615(arg1 + var11, arg2 + var10, this.field2820, this.field2820);
        }
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2812 = arg2;
        this.field2816 = arg3;
        this.field2828 = arg4;
        this.field2815 = arg7;
        this.field2825 = arg1;
        this.field2814 = arg6;
        this.field2823 = arg5;
        this.field2827 = arg0;
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(Lea;Lvp;)Z")
    private final boolean method1355(class58 arg0, class195 arg1) {
        if (this.field2819 == null) {
            if (this.field2827 == 0) {
                if (class325.field4404.method1360((byte) -106, this.field2825)) {
                    int[] var3 = class325.field4404.method1368(false, 0.7F, this.field2821, this.field2821, (byte) -74, this.field2825);
                    this.field2819 = arg0.method232(var3, 0, this.field2821, this.field2821, this.field2821);
                }
            } else if (this.field2827 == 2) {
                this.method1357(arg0, arg1);
            } else if (this.field2827 == 1) {
                this.method1350(arg0, arg1);
            }
        }
        return this.field2819 != null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIII)Z")
    public final boolean method1356(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2815) {
            this.field2826 = 1073741823;
            var8 = this.field2812;
            var9 = this.field2816;
            var10 = this.field2828;
        } else {
            int var5 = this.field2812 - arg0;
            int var6 = this.field2816 - arg1;
            int var7 = this.field2828 - arg2;
            this.field2826 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2826 == 0) {
                this.field2826 = 1;
            }
            var8 = (var5 << 8) / this.field2826;
            var9 = (var6 << 8) / this.field2826;
            var10 = (var7 << 8) / this.field2826;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2820 = this.field2823 * arg3 / (this.field2815 ? 1024 : this.field2826);
        } else {
            this.field2820 = 0;
        }
        if (this.field2820 < 8) {
            this.field2819 = null;
            return false;
        }
        int var12 = class177.method1249((byte) -122, this.field2820);
        if (var12 > arg3) {
            var12 = class268.method1705(arg3, false);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2821 != var12) {
            this.field2821 = var12;
        }
        this.field2813 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field2817 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field2819 = null;
        return true;
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(Lea;Lvp;)V")
    private final void method1357(class58 arg0, class195 arg1) {
        class98 var3 = class267.method1702((byte) -106, this.field2825, 0, class91.field1278);
        if (var3 == null) {
            return;
        }
        arg0.method173(field2824);
        arg0.method227(0, 0, this.field2821, this.field2821);
        arg0.method245(0, 0, this.field2821, this.field2821, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field2815) {
                var4 = -arg1.field2812;
                var5 = -arg1.field2816;
                var6 = -arg1.field2828;
            } else {
                var4 = this.field2812 - arg1.field2812;
                var5 = this.field2816 - arg1.field2816;
                var6 = this.field2828 - arg1.field2828;
            }
        }
        if (this.field2813 != 0) {
            int var7 = -this.field2813 & 0x3FFF;
            int var8 = class136.field2021[var7];
            int var9 = class136.field2020[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field2817 != 0) {
            int var11 = -this.field2817 & 0x3FFF;
            int var12 = class136.field2021[var11];
            int var13 = class136.field2020[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method248(1.0F);
        arg0.method171(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class116 var15 = arg0.method254(var3, 1024, 0, 64, 768);
        int var16 = var15.method884() - var15.method868();
        int var17 = var15.method893() - var15.method889();
        int var18 = var15.method868() + var16 / 2;
        int var19 = var15.method889() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method194(var18, var19, var20, var20);
        arg0.method168(arg0.method220());
        class309 var21 = arg0.method210();
        var21.method1866(0, 0, arg0.method258() - var15.method863());
        var15.method881(var21, (class153) null, arg0.method258(), 1);
        this.field2819 = arg0.method177(0, 0, this.field2821, this.field2821, true);
        this.field2819.method624(0, 0, 3);
        arg0.method227(field2824[0], field2824[1], field2824[2], field2824[3]);
    }
}
