import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class120 {

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    private int field1841;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    private int field1828;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    private int field1836;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Z")
    private boolean field1834;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    private int field1825;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    private int field1833;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    private int field1831;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    private int field1832;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "[I")
    private static int[] field1827 = new int[4];

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public int field1826;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    private int field1829;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    private int field1835;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    private int field1837;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    private int field1840;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Le;")
    private static class289 field1830;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Lo;")
    private static class363 field1824;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "Lo;")
    private static class363 field1838;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Lo;")
    private class363 field1839;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lza;IIIIII)V", line = 4)
    public final void method892(class299 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1839 == null) {
            return;
        }
        int var8 = this.field1840 - arg5 & 0x3FFF;
        int var9 = this.field1829 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field1835) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field1835) / 2;
        if (var10 < arg4 && this.field1835 + var10 > 0 && var11 < arg3 && this.field1835 + var11 > 0) {
            this.field1839.method2320(arg1 + var11, arg2 + var10, this.field1835, this.field1835);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)Z", line = 31)
    public final boolean method893(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field1834) {
            this.field1826 = 1073741823;
            var8 = this.field1841;
            var9 = this.field1828;
            var10 = this.field1836;
        } else {
            int var5 = this.field1841 - arg0;
            int var6 = this.field1828 - arg1;
            int var7 = this.field1836 - arg2;
            this.field1826 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1826 == 0) {
                this.field1826 = 1;
            }
            var8 = (var5 << 8) / this.field1826;
            var9 = (var6 << 8) / this.field1826;
            var10 = (var7 << 8) / this.field1826;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1835 = this.field1831 * arg3 / (this.field1834 ? 1024 : this.field1826);
        } else {
            this.field1835 = 0;
        }
        if (this.field1835 < 8) {
            this.field1839 = null;
            return false;
        }
        int var12 = class46.method307((byte) 125, this.field1835);
        if (var12 > arg3) {
            var12 = class187.method1301(arg3, false);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1837 != var12) {
            this.field1837 = var12;
        }
        this.field1840 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field1829 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field1839 = null;
        return true;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()V", line = 88)
    public final void method894() {
        this.field1839 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lza;)V", line = 92)
    private static final void method895(class299 arg0) {
        if (field1830 != null) {
            return;
        }
        class153 var1 = new class153(580, 1104, 1);
        var1.method1108((short) 1024, (short) 0, (short) 1024, (byte) 0, -24167, (short) 1024, (byte) 0, (byte) 0, (short) 32767, (short) 0);
        var1.method1107(128, 0, 0, (byte) -126);
        var1.method1107(-128, 0, 0, (byte) -125);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class58.field891[var3];
            int var5 = class58.field889[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class58.field889[var12] >> 8;
                int var14 = class58.field891[var12] * var4 >> 23;
                int var15 = class58.field891[var12] * var5 >> 23;
                var1.method1107(var13, -var14, var15, (byte) -123);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1114((byte) 0, var8, var7, 0, (byte) 0, (short) 0, 0, (short) 127, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1114((byte) 0, var10, var7, 0, (byte) 0, (short) 0, var8, (short) 127, (byte) 0);
                    var1.method1114((byte) 0, var11, var7, 0, (byte) 0, (short) 0, var10, (short) 127, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1114((byte) 0, var8, 1, 0, (byte) 0, (short) 0, var7, (short) 127, (byte) 0);
            }
        }
        var1.field2340 = var1.field2310;
        var1.field2343 = null;
        var1.field2306 = null;
        var1.field2336 = null;
        field1830 = arg0.method554(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lza;Lgb;)Z", line = 172)
    public final boolean method896(class299 arg0, class120 arg1) {
        return this.field1839 != null || this.method900(arg0, arg1);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lza;)V", line = 175)
    private static final void method897(class299 arg0) {
        if (field1824 != null) {
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
        field1824 = arg0.method520(var2, 0, 128, 128, 128);
        field1838 = arg0.method520(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lza;Lgb;)V", line = 258)
    private final void method898(class299 arg0, class120 arg1) {
        method895(arg0);
        method897(arg0);
        arg0.method545(field1827);
        arg0.method571(0, 0, this.field1837, this.field1837);
        arg0.method593();
        arg0.method506(0, 0, this.field1837, this.field1837, this.field1833 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field1834) {
                var3 = -arg1.field1841;
                var4 = -arg1.field1828;
                var5 = -arg1.field1836;
            } else {
                var3 = arg1.field1841 - this.field1841;
                var4 = arg1.field1828 - this.field1828;
                var5 = arg1.field1836 - this.field1836;
            }
        }
        if (this.field1840 != 0) {
            int var6 = class58.field891[this.field1840];
            int var7 = class58.field889[this.field1840];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field1829 != 0) {
            int var9 = class58.field891[this.field1829];
            int var10 = class58.field889[this.field1829];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class289 var12 = field1830.method669((byte) 0, 51200, true);
        if (arg0.method570()) {
            var12.method647((short) 0, (short) this.field1825);
        } else {
            var12.method632((short) 127, class285.field4433.method938(28923, this.field1825).field6160);
            var12.method647((short) 0, (short) -1);
        }
        arg0.method502(1.0F);
        arg0.method596(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field1837 * 1024 / (var12.method624() - var12.method674());
        if (this.field1833 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method541(this.field1837 / 2, this.field1837 / 2, var13, var13);
        arg0.method582(arg0.method496());
        class517 var14 = arg0.method496();
        var14.method951(0, 0, arg0.method537() - var12.method630());
        var12.method656(var14, null, 1024, 1);
        int var15 = this.field1837 * 13 / 16;
        int var16 = (this.field1837 - var15) / 2;
        field1838.method395(var16, var16, var15, var15, 0, this.field1833 | 0xFF000000, 1);
        this.field1839 = arg0.method601(0, 0, this.field1837, this.field1837, true);
        arg0.method593();
        arg0.method506(0, 0, this.field1837, this.field1837, 0, 0);
        field1824.method395(0, 0, this.field1837, this.field1837, 1, 0, 0);
        this.field1839.method1214(0, 0, 0);
        arg0.method571(field1827[0], field1827[1], field1827[2], field1827[3]);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "()V", line = 348)
    public static final void method899() {
        field1830 = null;
        field1824 = null;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(Lza;Lgb;)Z", line = 353)
    private final boolean method900(class299 arg0, class120 arg1) {
        if (this.field1839 == null) {
            if (this.field1832 == 0) {
                if (class285.field4433.method936(this.field1825, (byte) -119)) {
                    int[] var3 = class285.field4433.method937(this.field1825, -15746, this.field1837, false, this.field1837, 0.7F);
                    this.field1839 = arg0.method520(var3, 0, this.field1837, this.field1837, this.field1837);
                }
            } else if (this.field1832 == 2) {
                this.method901(arg0, arg1);
            } else if (this.field1832 == 1) {
                this.method898(arg0, arg1);
            }
        }
        return this.field1839 != null;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(Lza;Lgb;)V", line = 389)
    private final void method901(class299 arg0, class120 arg1) {
        class153 var3 = class404.method2541(this.field1825, 0, (byte) 70, class510.field7418);
        if (var3 == null) {
            return;
        }
        arg0.method545(field1827);
        arg0.method571(0, 0, this.field1837, this.field1837);
        arg0.method506(0, 0, this.field1837, this.field1837, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field1834) {
                var4 = -arg1.field1841;
                var5 = -arg1.field1828;
                var6 = -arg1.field1836;
            } else {
                var4 = this.field1841 - arg1.field1841;
                var5 = this.field1828 - arg1.field1828;
                var6 = this.field1836 - arg1.field1836;
            }
        }
        if (this.field1840 != 0) {
            int var7 = -this.field1840 & 0x3FFF;
            int var8 = class58.field891[var7];
            int var9 = class58.field889[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field1829 != 0) {
            int var11 = -this.field1829 & 0x3FFF;
            int var12 = class58.field891[var11];
            int var13 = class58.field889[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method502(1.0F);
        arg0.method596(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class289 var15 = arg0.method554(var3, 2048, 0, 64, 768);
        int var16 = var15.method624() - var15.method674();
        int var17 = var15.method658() - var15.method654();
        int var18 = var15.method674() + var16 / 2;
        int var19 = var15.method654() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method541(var18, var19, var20, var20);
        arg0.method582(arg0.method496());
        class517 var21 = arg0.method538();
        var21.method951(0, 0, arg0.method537() - var15.method630());
        var15.method656(var21, null, arg0.method537(), 1);
        this.field1839 = arg0.method601(0, 0, this.field1837, this.field1837, true);
        this.field1839.method1214(0, 0, 3);
        arg0.method571(field1827[0], field1827[1], field1827[2], field1827[3]);
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 473)
    public class120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field1841 = arg2;
        this.field1828 = arg3;
        this.field1836 = arg4;
        this.field1834 = arg7;
        this.field1825 = arg1;
        this.field1833 = arg6;
        this.field1831 = arg5;
        this.field1832 = arg0;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "()V", line = 484)
    public static void method902() {
        field1830 = null;
        field1838 = null;
        field1824 = null;
        field1827 = null;
    }
}
