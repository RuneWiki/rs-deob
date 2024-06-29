import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class61 {

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
    private int field796;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
    private int field803;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "I")
    private int field797;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "Z")
    private boolean field794;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    private int field791;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    private int field790;

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "I")
    private int field800;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
    private int field793;

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "[I")
    private static int[] field805 = new int[4];

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    private int field792;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
    private int field795;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "I")
    private int field798;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
    private int field802;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "Ll;")
    private static class16 field789;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "Ll;")
    private static class16 field801;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "Ll;")
    private class16 field806;

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "Lt;")
    private static class474 field799;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lya;Ltt;)V", line = 6)
    private final void method558(class38 arg0, class61 arg1) {
        class173 var3 = class457.method2711(false, this.field791, 0, class340.field4267);
        if (var3 == null) {
            return;
        }
        arg0.method267(field805);
        arg0.method330(0, 0, this.field792, this.field792);
        arg0.method308(0, 0, this.field792, this.field792, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field794) {
                var4 = -arg1.field796;
                var5 = -arg1.field803;
                var6 = -arg1.field797;
            } else {
                var4 = this.field796 - arg1.field796;
                var5 = this.field803 - arg1.field803;
                var6 = this.field797 - arg1.field797;
            }
        }
        if (this.field802 != 0) {
            int var7 = -this.field802 & 0x3FFF;
            int var8 = class36.field443[var7];
            int var9 = class36.field478[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field795 != 0) {
            int var11 = -this.field795 & 0x3FFF;
            int var12 = class36.field443[var11];
            int var13 = class36.field478[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method282(1.0F);
        arg0.method328(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class474 var15 = arg0.method361(var3, 2048, 0, 64, 768);
        int var16 = var15.method434() - var15.method431();
        int var17 = var15.method426() - var15.method418();
        int var18 = var15.method431() + var16 / 2;
        int var19 = var15.method418() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method355(var18, var19, var20, var20);
        arg0.method287(arg0.method371());
        class123 var21 = arg0.method369();
        var21.method229(0, 0, arg0.method268() - var15.method409());
        var15.method413(var21, null, arg0.method268(), 1);
        this.field806 = arg0.method296(0, 0, this.field792, this.field792, true);
        this.field806.method146(0, 0, 3);
        arg0.method330(field805[0], field805[1], field805[2], field805[3]);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lya;)V", line = 89)
    private static final void method559(class38 arg0) {
        if (field799 != null) {
            return;
        }
        class173 var1 = new class173(580, 1104, 1);
        var1.method1107((short) 1024, (short) 1024, (byte) 0, (short) 0, (byte) 0, (short) 32767, (byte) 0, (short) 0, 94, (short) 1024);
        var1.method1106(128, 0, 0, 0);
        var1.method1106(-128, 0, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class36.field443[var3];
            int var5 = class36.field478[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class36.field478[var12] >> 8;
                int var14 = class36.field443[var12] * var4 >> 23;
                int var15 = class36.field443[var12] * var5 >> 23;
                var1.method1106(var13, 0, -var14, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1109(var8, 0, (byte) 0, (byte) 0, 1306358511, (short) 127, (short) 0, (byte) 0, var7);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1109(var10, var8, (byte) 0, (byte) 0, 1306358511, (short) 127, (short) 0, (byte) 0, var7);
                    var1.method1109(var11, var10, (byte) 0, (byte) 0, 1306358511, (short) 127, (short) 0, (byte) 0, var7);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1109(var8, var7, (byte) 0, (byte) 0, 1306358511, (short) 127, (short) 0, (byte) 0, 1);
            }
        }
        var1.field2208 = var1.field2203;
        var1.field2219 = null;
        var1.field2227 = null;
        var1.field2240 = null;
        field799 = arg0.method361(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lya;IIIIII)V", line = 168)
    public final void method560(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field806 == null) {
            return;
        }
        int var8 = this.field802 - arg5 & 0x3FFF;
        int var9 = this.field795 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field798) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field798) / 2;
        if (var10 < arg4 && this.field798 + var10 > 0 && var11 < arg3 && this.field798 + var11 > 0) {
            this.field806.method128(arg1 + var11, arg2 + var10, this.field798, this.field798);
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(Lya;Ltt;)Z", line = 195)
    public final boolean method561(class38 arg0, class61 arg1) {
        return this.field806 != null || this.method566(arg0, arg1);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIII)Z", line = 212)
    public final boolean method562(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field794) {
            this.field804 = 1073741823;
            var8 = this.field796;
            var9 = this.field803;
            var10 = this.field797;
        } else {
            int var5 = this.field796 - arg0;
            int var6 = this.field803 - arg1;
            int var7 = this.field797 - arg2;
            this.field804 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field804 == 0) {
                this.field804 = 1;
            }
            var8 = (var5 << 8) / this.field804;
            var9 = (var6 << 8) / this.field804;
            var10 = (var7 << 8) / this.field804;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field798 = this.field800 * arg3 / (this.field794 ? 1024 : this.field804);
        } else {
            this.field798 = 0;
        }
        if (this.field798 < 8) {
            this.field806 = null;
            return false;
        }
        int var12 = class60.method550(97, this.field798);
        if (var12 > arg3) {
            var12 = class231.method1404(arg3, 1);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field792 != var12) {
            this.field792 = var12;
        }
        this.field802 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field795 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field806 = null;
        return true;
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(Lya;)V", line = 272)
    private static final void method563(class38 arg0) {
        if (field801 != null) {
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
        field801 = arg0.method299(var2, 0, 128, 128, 128);
        field789 = arg0.method299(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "()V", line = 333)
    public static final void method564() {
        field799 = null;
        field801 = null;
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "()V", line = 338)
    public static void method565() {
        field799 = null;
        field789 = null;
        field801 = null;
        field805 = null;
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(Lya;Ltt;)Z", line = 345)
    private final boolean method566(class38 arg0, class61 arg1) {
        if (this.field806 == null) {
            if (this.field793 == 0) {
                if (class227.field2915.method1638(-47, this.field791)) {
                    int[] var3 = class227.field2915.method1640(this.field792, 0.7F, this.field792, (byte) -24, false, this.field791);
                    this.field806 = arg0.method299(var3, 0, this.field792, this.field792, this.field792);
                }
            } else if (this.field793 == 2) {
                this.method558(arg0, arg1);
            } else if (this.field793 == 1) {
                this.method567(arg0, arg1);
            }
        }
        return this.field806 != null;
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(Lya;Ltt;)V", line = 379)
    private final void method567(class38 arg0, class61 arg1) {
        method559(arg0);
        method563(arg0);
        arg0.method267(field805);
        arg0.method330(0, 0, this.field792, this.field792);
        arg0.method365();
        arg0.method308(0, 0, this.field792, this.field792, this.field790 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field794) {
                var3 = -arg1.field796;
                var4 = -arg1.field803;
                var5 = -arg1.field797;
            } else {
                var3 = arg1.field796 - this.field796;
                var4 = arg1.field803 - this.field803;
                var5 = arg1.field797 - this.field797;
            }
        }
        if (this.field802 != 0) {
            int var6 = class36.field443[this.field802];
            int var7 = class36.field478[this.field802];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field795 != 0) {
            int var9 = class36.field443[this.field795];
            int var10 = class36.field478[this.field795];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class474 var12 = field799.method416((byte) 0, 51200, true);
        if (arg0.method360()) {
            var12.method423((short) 0, (short) this.field791);
        } else {
            var12.method425((short) 127, class227.field2915.method1642(this.field791, 120).field1795);
            var12.method423((short) 0, (short) -1);
        }
        arg0.method282(1.0F);
        arg0.method328(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field792 * 1024 / (var12.method434() - var12.method431());
        if (this.field790 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method355(this.field792 / 2, this.field792 / 2, var13, var13);
        arg0.method287(arg0.method371());
        class123 var14 = arg0.method371();
        var14.method229(0, 0, arg0.method268() - var12.method409());
        var12.method413(var14, null, 1024, 1);
        int var15 = this.field792 * 13 / 16;
        int var16 = (this.field792 - var15) / 2;
        field789.method135(var16, var16, var15, var15, 0, this.field790 | 0xFF000000, 1);
        this.field806 = arg0.method296(0, 0, this.field792, this.field792, true);
        arg0.method365();
        arg0.method308(0, 0, this.field792, this.field792, 0, 0);
        field801.method135(0, 0, this.field792, this.field792, 1, 0, 0);
        this.field806.method146(0, 0, 0);
        arg0.method330(field805[0], field805[1], field805[2], field805[3]);
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "()V", line = 473)
    public final void method568() {
        this.field806 = null;
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 476)
    public class61(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field796 = arg2;
        this.field803 = arg3;
        this.field797 = arg4;
        this.field794 = arg7;
        this.field791 = arg1;
        this.field790 = arg6;
        this.field800 = arg5;
        this.field793 = arg0;
    }
}
