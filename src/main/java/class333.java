import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class333 {

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    private int field4902;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    private int field4892;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    private int field4898;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "Z")
    private boolean field4895;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    private int field4886;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    private int field4887;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    private int field4891;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    private int field4893;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "[I")
    private static int[] field4885 = new int[4];

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public int field4888;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    private int field4894;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    private int field4897;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    private int field4899;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    private int field4900;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Lkh;")
    private static class11 field4889;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Lkh;")
    private class11 field4890;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "Lkh;")
    private static class11 field4901;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "Lmj;")
    private static class393 field4896;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "()V", line = 4)
    public static final void method2133() {
        field4896 = null;
        field4889 = null;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "()V", line = 10)
    public final void method2134() {
        this.field4890 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Len;IIIIII)V", line = 13)
    public final void method2135(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4890 == null) {
            return;
        }
        int var8 = this.field4897 - arg5 & 0x3FFF;
        int var9 = this.field4900 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field4894) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field4894) / 2;
        if (var10 < arg4 && this.field4894 + var10 > 0 && var11 < arg3 && this.field4894 + var11 > 0) {
            this.field4890.method93(arg1 + var11, arg2 + var10, this.field4894, this.field4894);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Len;)V", line = 39)
    private static final void method2136(class174 arg0) {
        if (field4889 != null) {
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
        field4889 = arg0.method1008(var2, 0, 128, 128, 128);
        field4901 = arg0.method1008(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "()V", line = 100)
    public static void method2137() {
        field4896 = null;
        field4901 = null;
        field4889 = null;
        field4885 = null;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(Len;)V", line = 110)
    private static final void method2138(class174 arg0) {
        if (field4896 != null) {
            return;
        }
        class200 var1 = new class200(580, 1104, 1);
        var1.method1276((byte) 0, (short) 1024, (short) 1024, (byte) -55, (short) 32767, (short) 0, (short) 0, (short) 1024, (byte) 0, (byte) 0);
        var1.method1285(0, 128, 0, 0);
        var1.method1285(0, -128, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class286.field4025[var3];
            int var5 = class286.field4035[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class286.field4035[var12] >> 8;
                int var14 = class286.field4025[var12] * var4 >> 23;
                int var15 = class286.field4025[var12] * var5 >> 23;
                var1.method1285(0, var13, -var14, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1279((byte) 0, var7, (byte) -61, (short) 127, 0, (byte) 0, (short) 0, (byte) 0, var8);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1279((byte) 0, var7, (byte) -61, (short) 127, var8, (byte) 0, (short) 0, (byte) 0, var10);
                    var1.method1279((byte) 0, var7, (byte) -61, (short) 127, var10, (byte) 0, (short) 0, (byte) 0, var11);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1279((byte) 0, 1, (byte) -61, (short) 127, var7, (byte) 0, (short) 0, (byte) 0, var8);
            }
        }
        var1.field2753 = var1.field2749;
        var1.field2763 = null;
        var1.field2729 = null;
        var1.field2726 = null;
        field4896 = arg0.method991(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Len;Lsi;)Z", line = 191)
    private final boolean method2139(class174 arg0, class333 arg1) {
        if (this.field4890 == null) {
            if (this.field4893 == 0) {
                if (class3.field46.method369(this.field4886, (byte) -100)) {
                    int[] var3 = class3.field46.method372(this.field4899, 60, false, this.field4886, 0.7F, this.field4899);
                    this.field4890 = arg0.method1008(var3, 0, this.field4899, this.field4899, this.field4899);
                }
            } else if (this.field4893 == 2) {
                this.method2142(arg0, arg1);
            } else if (this.field4893 == 1) {
                this.method2143(arg0, arg1);
            }
        }
        return this.field4890 != null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIII)Z", line = 246)
    public final boolean method2140(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field4895) {
            this.field4888 = 1073741823;
            var8 = this.field4902;
            var9 = this.field4892;
            var10 = this.field4898;
        } else {
            int var5 = this.field4902 - arg0;
            int var6 = this.field4892 - arg1;
            int var7 = this.field4898 - arg2;
            this.field4888 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field4888 == 0) {
                this.field4888 = 1;
            }
            var8 = (var5 << 8) / this.field4888;
            var9 = (var6 << 8) / this.field4888;
            var10 = (var7 << 8) / this.field4888;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field4894 = this.field4891 * arg3 / (this.field4895 ? 1024 : this.field4888);
        } else {
            this.field4894 = 0;
        }
        if (this.field4894 < 8) {
            this.field4890 = null;
            return false;
        }
        int var12 = class279.method1761(false, this.field4894);
        if (var12 > arg3) {
            var12 = class406.method2564(115, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field4899 != var12) {
            this.field4899 = var12;
        }
        this.field4897 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field4900 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field4890 = null;
        return true;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(Len;Lsi;)Z", line = 302)
    public final boolean method2141(class174 arg0, class333 arg1) {
        return this.field4890 != null || this.method2139(arg0, arg1);
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(Len;Lsi;)V", line = 306)
    private final void method2142(class174 arg0, class333 arg1) {
        class200 var3 = class38.method227(this.field4886, class247.field3361, 0, false);
        if (var3 == null) {
            return;
        }
        arg0.method1004(field4885);
        arg0.method968(0, 0, this.field4899, this.field4899);
        arg0.method995(0, 0, this.field4899, this.field4899, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field4895) {
                var4 = -arg1.field4902;
                var5 = -arg1.field4892;
                var6 = -arg1.field4898;
            } else {
                var4 = this.field4902 - arg1.field4902;
                var5 = this.field4892 - arg1.field4892;
                var6 = this.field4898 - arg1.field4898;
            }
        }
        if (this.field4897 != 0) {
            int var7 = -this.field4897 & 0x3FFF;
            int var8 = class286.field4025[var7];
            int var9 = class286.field4035[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field4900 != 0) {
            int var11 = -this.field4900 & 0x3FFF;
            int var12 = class286.field4025[var11];
            int var13 = class286.field4035[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method999(1.0F);
        arg0.method1018(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class393 var15 = arg0.method991(var3, 1024, 0, 64, 768);
        int var16 = var15.method764() - var15.method749();
        int var17 = var15.method763() - var15.method731();
        int var18 = var15.method749() + var16 / 2;
        int var19 = var15.method731() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method971(var18, var19, var20, var20);
        arg0.method949(arg0.method922());
        class71 var21 = arg0.method1015();
        var21.method123(0, 0, arg0.method992() - var15.method735());
        var15.method718(var21, (class127) null, arg0.method992(), 1);
        this.field4890 = arg0.method983(0, 0, this.field4899, this.field4899, true);
        this.field4890.method41(0, 0, 3);
        arg0.method968(field4885[0], field4885[1], field4885[2], field4885[3]);
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(Len;Lsi;)V", line = 389)
    private final void method2143(class174 arg0, class333 arg1) {
        method2138(arg0);
        method2136(arg0);
        arg0.method1004(field4885);
        arg0.method968(0, 0, this.field4899, this.field4899);
        arg0.method934();
        arg0.method995(0, 0, this.field4899, this.field4899, this.field4887 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field4895) {
                var3 = -arg1.field4902;
                var4 = -arg1.field4892;
                var5 = -arg1.field4898;
            } else {
                var3 = arg1.field4902 - this.field4902;
                var4 = arg1.field4892 - this.field4892;
                var5 = arg1.field4898 - this.field4898;
            }
        }
        if (this.field4897 != 0) {
            int var6 = class286.field4025[this.field4897];
            int var7 = class286.field4035[this.field4897];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field4900 != 0) {
            int var9 = class286.field4025[this.field4900];
            int var10 = class286.field4035[this.field4900];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class393 var12 = field4896.method717((byte) 0, 25600, true);
        if (arg0.method937()) {
            var12.method721((short) 0, (short) this.field4886);
        } else {
            var12.method751((short) 127, class3.field46.method371(this.field4886, (byte) 96).field4451);
            var12.method721((short) 0, (short) -1);
        }
        arg0.method999(1.0F);
        arg0.method1018(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field4899 * 1024 / (var12.method764() - var12.method749());
        if (this.field4887 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method971(this.field4899 / 2, this.field4899 / 2, var13, var13);
        arg0.method949(arg0.method922());
        class71 var14 = arg0.method922();
        var14.method123(0, 0, arg0.method992() - var12.method735());
        var12.method718(var14, (class127) null, 1024, 1);
        int var15 = this.field4899 * 13 / 16;
        int var16 = (this.field4899 - var15) / 2;
        field4901.method46(var16, var16, var15, var15, 1, this.field4887 | 0xFF000000, 1);
        this.field4890 = arg0.method983(0, 0, this.field4899, this.field4899, true);
        arg0.method934();
        arg0.method995(0, 0, this.field4899, this.field4899, 0, 0);
        field4889.method46(0, 0, this.field4899, this.field4899, 0, 0, 0);
        this.field4890.method41(0, 0, 0);
        arg0.method968(field4885[0], field4885[1], field4885[2], field4885[3]);
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 479)
    public class333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field4902 = arg2;
        this.field4892 = arg3;
        this.field4898 = arg4;
        this.field4895 = arg7;
        this.field4886 = arg1;
        this.field4887 = arg6;
        this.field4891 = arg5;
        this.field4893 = arg0;
    }
}
