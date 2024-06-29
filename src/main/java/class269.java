import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class269 {

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    private int field3889;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    private int field3888;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    private int field3892;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Z")
    private boolean field3898;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    private int field3899;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    private int field3887;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    private int field3885;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    private int field3890;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "[I")
    private static int[] field3900 = new int[4];

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public int field3891;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    private int field3893;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    private int field3895;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    private int field3896;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    private int field3897;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Ldc;")
    private static class375 field3886;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lcq;")
    private static class67 field3884;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lcq;")
    private class67 field3894;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "Lcq;")
    private static class67 field3901;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "()V", line = 6)
    public final void method1831() {
        this.field3894 = null;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "()V", line = 11)
    public static void method1832() {
        field3886 = null;
        field3901 = null;
        field3884 = null;
        field3900 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lii;Lcg;)V", line = 22)
    private final void method1833(class405 arg0, class269 arg1) {
        class245 var3 = class235.method1410(-7137, this.field3899, class213.field2854, 0);
        if (var3 == null) {
            return;
        }
        arg0.method1676(field3900);
        arg0.method1767(0, 0, this.field3897, this.field3897);
        arg0.method1632(0, 0, this.field3897, this.field3897, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field3898) {
                var4 = -arg1.field3889;
                var5 = -arg1.field3888;
                var6 = -arg1.field3892;
            } else {
                var4 = this.field3889 - arg1.field3889;
                var5 = this.field3888 - arg1.field3888;
                var6 = this.field3892 - arg1.field3892;
            }
        }
        if (this.field3895 != 0) {
            int var7 = -this.field3895 & 0x3FFF;
            int var8 = class117.field1644[var7];
            int var9 = class117.field1636[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field3893 != 0) {
            int var11 = -this.field3893 & 0x3FFF;
            int var12 = class117.field1644[var11];
            int var13 = class117.field1636[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method1756(1.0F);
        arg0.method1752(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class375 var15 = arg0.method1715(var3, 1024, 0, 64, 768);
        int var16 = var15.method1613() - var15.method1581();
        int var17 = var15.method1579() - var15.method1597();
        int var18 = var15.method1581() + var16 / 2;
        int var19 = var15.method1597() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method1723(var18, var19, var20, var20);
        arg0.method1648(arg0.method1645());
        class177 var21 = arg0.method1735();
        var21.method985(0, 0, arg0.method1771() - var15.method1603());
        var15.method1587(var21, (class330) null, arg0.method1771(), 1);
        this.field3894 = arg0.method1663(0, 0, this.field3897, this.field3897, true);
        this.field3894.method401(0, 0, 3);
        arg0.method1767(field3900[0], field3900[1], field3900[2], field3900[3]);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIII)Z", line = 111)
    public final boolean method1834(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3898) {
            this.field3891 = 1073741823;
            var8 = this.field3889;
            var9 = this.field3888;
            var10 = this.field3892;
        } else {
            int var5 = this.field3889 - arg0;
            int var6 = this.field3888 - arg1;
            int var7 = this.field3892 - arg2;
            this.field3891 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3891 == 0) {
                this.field3891 = 1;
            }
            var8 = (var5 << 8) / this.field3891;
            var9 = (var6 << 8) / this.field3891;
            var10 = (var7 << 8) / this.field3891;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3896 = this.field3885 * arg3 / (this.field3898 ? 1024 : this.field3891);
        } else {
            this.field3896 = 0;
        }
        if (this.field3896 < 8) {
            this.field3894 = null;
            return false;
        }
        int var12 = class139.method896(this.field3896, 111);
        if (var12 > arg3) {
            var12 = class298.method2043(arg3, -122);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3897 != var12) {
            this.field3897 = var12;
        }
        this.field3895 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field3893 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field3894 = null;
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Lii;Lcg;)Z", line = 167)
    public final boolean method1835(class405 arg0, class269 arg1) {
        return this.field3894 != null || this.method1840(arg0, arg1);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lii;)V", line = 176)
    private static final void method1836(class405 arg0) {
        if (field3886 != null) {
            return;
        }
        class245 var1 = new class245(580, 1104, 1);
        var1.method1475((short) 1024, (byte) 0, (short) 1024, (short) 32767, (byte) 0, (short) 1024, 103, (short) 0, (short) 0, (byte) 0);
        var1.method1477(0, 128, 0, (byte) -128);
        var1.method1477(0, -128, 0, (byte) 117);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class117.field1644[var3];
            int var5 = class117.field1636[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class117.field1636[var12] >> 8;
                int var14 = class117.field1644[var12] * var4 >> 23;
                int var15 = class117.field1644[var12] * var5 >> 23;
                var1.method1477(-var14, var13, var15, (byte) -69);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1473(var7, (byte) 0, (short) 127, (byte) 120, (byte) 0, var8, 0, (short) 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1473(var7, (byte) 0, (short) 127, (byte) 86, (byte) 0, var10, var8, (short) 0, (byte) 0);
                    var1.method1473(var7, (byte) 0, (short) 127, (byte) 118, (byte) 0, var11, var10, (short) 0, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1473(1, (byte) 0, (short) 127, (byte) 82, (byte) 0, var8, var7, (short) 0, (byte) 0);
            }
        }
        var1.field3281 = var1.field3305;
        var1.field3273 = null;
        var1.field3306 = null;
        var1.field3288 = null;
        field3886 = arg0.method1715(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lii;IIIIII)V", line = 257)
    public final void method1837(class405 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3894 == null) {
            return;
        }
        int var8 = this.field3895 - arg5 & 0x3FFF;
        int var9 = this.field3893 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field3896) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field3896) / 2;
        if (var10 < arg4 && this.field3896 + var10 > 0 && var11 < arg3 && this.field3896 + var11 > 0) {
            this.field3894.method453(arg1 + var11, arg2 + var10, this.field3896, this.field3896);
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "()V", line = 282)
    public static final void method1838() {
        field3886 = null;
        field3884 = null;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Lii;)V", line = 293)
    private static final void method1839(class405 arg0) {
        if (field3884 != null) {
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
        field3884 = arg0.method1624(var2, 0, 128, 128, 128);
        field3901 = arg0.method1624(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(Lii;Lcg;)Z", line = 355)
    private final boolean method1840(class405 arg0, class269 arg1) {
        if (this.field3894 == null) {
            if (this.field3890 == 0) {
                if (class89.field1253.method184(this.field3899, 14556)) {
                    int[] var3 = class89.field1253.method185(false, -114, this.field3897, this.field3897, 0.7F, this.field3899);
                    this.field3894 = arg0.method1624(var3, 0, this.field3897, this.field3897, this.field3897);
                }
            } else if (this.field3890 == 2) {
                this.method1833(arg0, arg1);
            } else if (this.field3890 == 1) {
                this.method1841(arg0, arg1);
            }
        }
        return this.field3894 != null;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 388)
    public class269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3889 = arg2;
        this.field3888 = arg3;
        this.field3892 = arg4;
        this.field3898 = arg7;
        this.field3899 = arg1;
        this.field3887 = arg6;
        this.field3885 = arg5;
        this.field3890 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(Lii;Lcg;)V", line = 400)
    private final void method1841(class405 arg0, class269 arg1) {
        method1836(arg0);
        method1839(arg0);
        arg0.method1676(field3900);
        arg0.method1767(0, 0, this.field3897, this.field3897);
        arg0.method1697();
        arg0.method1632(0, 0, this.field3897, this.field3897, this.field3887 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field3898) {
                var3 = -arg1.field3889;
                var4 = -arg1.field3888;
                var5 = -arg1.field3892;
            } else {
                var3 = arg1.field3889 - this.field3889;
                var4 = arg1.field3888 - this.field3888;
                var5 = arg1.field3892 - this.field3892;
            }
        }
        if (this.field3895 != 0) {
            int var6 = class117.field1644[this.field3895];
            int var7 = class117.field1636[this.field3895];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field3893 != 0) {
            int var9 = class117.field1644[this.field3893];
            int var10 = class117.field1636[this.field3893];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class375 var12 = field3886.method1568((byte) 0, 25600, true);
        if (arg0.method1736()) {
            var12.method1590((short) 0, (short) this.field3899);
        } else {
            var12.method1569((short) 127, class89.field1253.method186(this.field3899, -9590).field6504);
            var12.method1590((short) 0, (short) -1);
        }
        arg0.method1756(1.0F);
        arg0.method1752(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field3897 * 1024 / (var12.method1613() - var12.method1581());
        if (this.field3887 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method1723(this.field3897 / 2, this.field3897 / 2, var13, var13);
        arg0.method1648(arg0.method1645());
        class177 var14 = arg0.method1645();
        var14.method985(0, 0, arg0.method1771() - var12.method1603());
        var12.method1587(var14, (class330) null, 1024, 1);
        int var15 = this.field3897 * 13 / 16;
        int var16 = (this.field3897 - var15) / 2;
        field3901.method402(var16, var16, var15, var15, 1, this.field3887 | 0xFF000000, 1);
        this.field3894 = arg0.method1663(0, 0, this.field3897, this.field3897, true);
        arg0.method1697();
        arg0.method1632(0, 0, this.field3897, this.field3897, 0, 0);
        field3884.method402(0, 0, this.field3897, this.field3897, 0, 0, 0);
        this.field3894.method401(0, 0, 0);
        arg0.method1767(field3900[0], field3900[1], field3900[2], field3900[3]);
    }
}
