import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class344 {

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    private int field4831;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    private int field4845;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    private int field4838;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Z")
    private boolean field4835;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    private int field4833;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    private int field4832;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    private int field4842;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    private int field4830;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "[I")
    private static int[] field4828 = new int[4];

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    private int field4829;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    private int field4834;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public int field4840;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    private int field4841;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    private int field4844;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lhu;")
    private static class133 field4836;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Lhu;")
    private static class133 field4837;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Lhu;")
    private class133 field4843;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lka;")
    private static class475 field4839;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "()V", line = 9)
    public static void method2052() {
        field4839 = null;
        field4836 = null;
        field4837 = null;
        field4828 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lha;Lgd;)Z", line = 16)
    public final boolean method2053(class59 arg0, class344 arg1) {
        return this.field4843 != null || this.method2054(arg0, arg1);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lha;Lgd;)Z", line = 21)
    private final boolean method2054(class59 arg0, class344 arg1) {
        if (this.field4843 == null) {
            if (this.field4830 == 0) {
                if (class513.field6801.method85(this.field4833, -32345)) {
                    int[] var3 = class513.field6801.method92(false, (byte) 94, this.field4834, this.field4834, 0.7F, this.field4833);
                    this.field4843 = arg0.method450(this.field4834, (byte) 99, this.field4834, var3, 0, this.field4834);
                }
            } else if (this.field4830 == 2) {
                this.method2057(arg0, arg1);
            } else if (this.field4830 == 1) {
                this.method2056(arg0, arg1);
            }
        }
        return this.field4843 != null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lha;)V", line = 56)
    private static final void method2055(class59 arg0) {
        if (field4837 != null) {
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
        field4837 = arg0.method450(128, (byte) 99, 128, var2, 0, 128);
        field4836 = arg0.method450(128, (byte) 99, 128, var1, 0, 128);
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lha;Lgd;)V", line = 124)
    private final void method2056(class59 arg0, class344 arg1) {
        method2061(arg0);
        method2055(arg0);
        arg0.method393(field4828);
        arg0.method419(0, 0, this.field4834, this.field4834);
        arg0.method454();
        arg0.method504(0, 0, this.field4834, this.field4834, this.field4832 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field4835) {
                var3 = -arg1.field4831;
                var4 = -arg1.field4845;
                var5 = -arg1.field4838;
            } else {
                var3 = arg1.field4831 - this.field4831;
                var4 = arg1.field4845 - this.field4845;
                var5 = arg1.field4838 - this.field4838;
            }
        }
        if (this.field4844 != 0) {
            int var6 = class451.field6174[this.field4844];
            int var7 = class451.field6177[this.field4844];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field4829 != 0) {
            int var9 = class451.field6174[this.field4829];
            int var10 = class451.field6177[this.field4829];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class475 var12 = field4839.method171((byte) 0, 51200, true);
        var12.method152((short) 0, (short) this.field4833);
        arg0.method486(1.0F);
        arg0.method423(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field4834 * 1024 / (var12.method175() - var12.method211());
        if (this.field4832 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method445(this.field4834 / 2, this.field4834 / 2, var13, var13);
        arg0.method481(arg0.method421());
        class333 var14 = arg0.method421();
        var14.method1727(0, 0, arg0.method424() - var12.method217());
        var12.method160(var14, null, 1024, 1);
        int var15 = this.field4834 * 13 / 16;
        int var16 = (this.field4834 - var15) / 2;
        field4836.method1033(var16, var16, var15, var15, 0, this.field4832 | 0xFF000000, 1);
        this.field4843 = arg0.method409(0, 0, this.field4834, this.field4834, true);
        arg0.method454();
        arg0.method504(0, 0, this.field4834, this.field4834, 0, 0);
        field4837.method1033(0, 0, this.field4834, this.field4834, 1, 0, 0);
        this.field4843.method1044(0, 0, 0);
        arg0.method419(field4828[0], field4828[1], field4828[2], field4828[3]);
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(Lha;Lgd;)V", line = 207)
    private final void method2057(class59 arg0, class344 arg1) {
        class538 var3 = class47.method333(0, class170.field2616, -106, this.field4833);
        if (var3 == null) {
            return;
        }
        arg0.method393(field4828);
        arg0.method419(0, 0, this.field4834, this.field4834);
        arg0.method504(0, 0, this.field4834, this.field4834, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field4835) {
                var4 = -arg1.field4831;
                var5 = -arg1.field4845;
                var6 = -arg1.field4838;
            } else {
                var4 = this.field4831 - arg1.field4831;
                var5 = this.field4845 - arg1.field4845;
                var6 = this.field4838 - arg1.field4838;
            }
        }
        if (this.field4844 != 0) {
            int var7 = -this.field4844 & 0x3FFF;
            int var8 = class451.field6174[var7];
            int var9 = class451.field6177[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field4829 != 0) {
            int var11 = -this.field4829 & 0x3FFF;
            int var12 = class451.field6174[var11];
            int var13 = class451.field6177[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method486(1.0F);
        arg0.method423(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class475 var15 = arg0.method401(var3, 2048, 0, 64, 768);
        int var16 = var15.method175() - var15.method211();
        int var17 = var15.method148() - var15.method180();
        int var18 = var15.method211() + var16 / 2;
        int var19 = var15.method180() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method445(var18, var19, var20, var20);
        arg0.method481(arg0.method421());
        class333 var21 = arg0.method451();
        var21.method1727(0, 0, arg0.method424() - var15.method217());
        var15.method160(var21, null, arg0.method424(), 1);
        this.field4843 = arg0.method409(0, 0, this.field4834, this.field4834, true);
        this.field4843.method1044(0, 0, 3);
        arg0.method419(field4828[0], field4828[1], field4828[2], field4828[3]);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)Z", line = 293)
    public final boolean method2058(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field4835) {
            this.field4840 = 1073741823;
            var8 = this.field4831;
            var9 = this.field4845;
            var10 = this.field4838;
        } else {
            int var5 = this.field4831 - arg0;
            int var6 = this.field4845 - arg1;
            int var7 = this.field4838 - arg2;
            this.field4840 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field4840 == 0) {
                this.field4840 = 1;
            }
            var8 = (var5 << 8) / this.field4840;
            var9 = (var6 << 8) / this.field4840;
            var10 = (var7 << 8) / this.field4840;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field4841 = this.field4842 * arg3 / (this.field4835 ? 1024 : this.field4840);
        } else {
            this.field4841 = 0;
        }
        if (this.field4841 < 8) {
            this.field4843 = null;
            return false;
        }
        int var12 = class737.method4119(this.field4841, (byte) -128);
        if (var12 > arg3) {
            var12 = class658.method3571(27690, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field4834 != var12) {
            this.field4834 = var12;
        }
        this.field4844 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field4829 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field4843 = null;
        return true;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "()V", line = 349)
    public final void method2059() {
        this.field4843 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lha;IIIIII)V", line = 353)
    public final void method2060(class59 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4843 == null) {
            return;
        }
        int var8 = this.field4844 - arg5 & 0x3FFF;
        int var9 = this.field4829 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field4841) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field4841) / 2;
        if (var10 < arg4 && this.field4841 + var10 > 0 && var11 < arg3 && this.field4841 + var11 > 0) {
            this.field4843.method1052(arg1 + var11, arg2 + var10, this.field4841, this.field4841);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lha;)V", line = 377)
    private static final void method2061(class59 arg0) {
        if (field4839 != null) {
            return;
        }
        class538 var1 = new class538(580, 1104, 1);
        var1.method2988((short) 1024, (short) 32767, true, (byte) 0, (short) 1024, (short) 0, (short) 1024, (short) 0, (byte) 0, (byte) 0);
        var1.method2984(1, 0, 0, 128);
        var1.method2984(1, 0, 0, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class451.field6174[var3];
            int var5 = class451.field6177[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class451.field6177[var12] >> 7;
                int var14 = class451.field6174[var12] * var4 >> 21;
                int var15 = class451.field6174[var12] * var5 >> 21;
                var1.method2984(1, var15, -var14, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2980((byte) -85, (byte) 0, (byte) 0, (byte) 0, (short) 0, var8, (short) 127, var7, 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2980((byte) -85, (byte) 0, (byte) 0, (byte) 0, (short) 0, var10, (short) 127, var7, var8);
                    var1.method2980((byte) -85, (byte) 0, (byte) 0, (byte) 0, (short) 0, var11, (short) 127, var7, var10);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2980((byte) -85, (byte) 0, (byte) 0, (byte) 0, (short) 0, var8, (short) 127, 1, var7);
            }
        }
        var1.field7131 = var1.field7119;
        var1.field7086 = null;
        var1.field7113 = null;
        var1.field7128 = null;
        field4839 = arg0.method401(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "()V", line = 459)
    public static final void method2062() {
        field4839 = null;
        field4837 = null;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 472)
    public class344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field4831 = arg2;
        this.field4845 = arg3;
        this.field4838 = arg4;
        this.field4835 = arg7;
        this.field4833 = arg1;
        this.field4832 = arg6;
        this.field4842 = arg5;
        this.field4830 = arg0;
    }
}
