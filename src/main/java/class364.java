import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public class class364 {

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "I")
    private int field5072;

    @OriginalMember(owner = "client!ija", name = "f", descriptor = "I")
    private int field5077;

    @OriginalMember(owner = "client!ija", name = "b", descriptor = "I")
    private int field5073;

    @OriginalMember(owner = "client!ija", name = "k", descriptor = "Z")
    private boolean field5082;

    @OriginalMember(owner = "client!ija", name = "g", descriptor = "I")
    private int field5078;

    @OriginalMember(owner = "client!ija", name = "c", descriptor = "I")
    private int field5074;

    @OriginalMember(owner = "client!ija", name = "d", descriptor = "I")
    private int field5075;

    @OriginalMember(owner = "client!ija", name = "j", descriptor = "I")
    private int field5081;

    @OriginalMember(owner = "client!ija", name = "p", descriptor = "[I")
    private static int[] field5087 = new int[4];

    @OriginalMember(owner = "client!ija", name = "e", descriptor = "I")
    private int field5076;

    @OriginalMember(owner = "client!ija", name = "h", descriptor = "I")
    private int field5079;

    @OriginalMember(owner = "client!ija", name = "i", descriptor = "I")
    private int field5080;

    @OriginalMember(owner = "client!ija", name = "m", descriptor = "I")
    private int field5084;

    @OriginalMember(owner = "client!ija", name = "n", descriptor = "I")
    public int field5085;

    @OriginalMember(owner = "client!ija", name = "l", descriptor = "Ljd;")
    private class241 field5083;

    @OriginalMember(owner = "client!ija", name = "o", descriptor = "Ljd;")
    private static class241 field5086;

    @OriginalMember(owner = "client!ija", name = "q", descriptor = "Ljd;")
    private static class241 field5088;

    @OriginalMember(owner = "client!ija", name = "r", descriptor = "Lka;")
    private static class496 field5089;

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(Lha;Lija;)Z")
    private final boolean method2281(class65 arg0, class364 arg1) {
        if (this.field5083 == null) {
            if (this.field5081 == 0) {
                if (class96.field1096.method1212(116, this.field5078)) {
                    int[] var3 = class96.field1096.method1207((byte) 124, false, this.field5078, this.field5076, this.field5076, 0.7F);
                    this.field5083 = arg0.method458((byte) 96, this.field5076, this.field5076, var3, this.field5076, 0);
                }
            } else if (this.field5081 == 2) {
                this.method2286(arg0, arg1);
            } else if (this.field5081 == 1) {
                this.method2288(arg0, arg1);
            }
        }
        return this.field5083 != null;
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(Lha;)V")
    private static final void method2282(class65 arg0) {
        if (field5086 != null) {
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
        field5086 = arg0.method458((byte) 122, 128, 128, var2, 128, 0);
        field5088 = arg0.method458((byte) 79, 128, 128, var1, 128, 0);
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "()V")
    public final void method2283() {
        this.field5083 = null;
    }

    @OriginalMember(owner = "client!ija", name = "b", descriptor = "(Lha;Lija;)Z")
    public final boolean method2284(class65 arg0, class364 arg1) {
        return this.field5083 != null || this.method2281(arg0, arg1);
    }

    @OriginalMember(owner = "client!ija", name = "b", descriptor = "()V")
    public static final void method2285() {
        field5089 = null;
        field5086 = null;
    }

    @OriginalMember(owner = "client!ija", name = "c", descriptor = "(Lha;Lija;)V")
    private final void method2286(class65 arg0, class364 arg1) {
        class100 var3 = class488.method2912(class602.field8439, (byte) -112, this.field5078, 0);
        if (var3 == null) {
            return;
        }
        arg0.method449(field5087);
        arg0.method434(0, 0, this.field5076, this.field5076);
        arg0.method495(0, 0, this.field5076, this.field5076, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field5082) {
                var4 = -arg1.field5072;
                var5 = -arg1.field5077;
                var6 = -arg1.field5073;
            } else {
                var4 = this.field5072 - arg1.field5072;
                var5 = this.field5077 - arg1.field5077;
                var6 = this.field5073 - arg1.field5073;
            }
        }
        if (this.field5079 != 0) {
            int var7 = -this.field5079 & 0x3FFF;
            int var8 = class376.field5186[var7];
            int var9 = class376.field5188[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field5080 != 0) {
            int var11 = -this.field5080 & 0x3FFF;
            int var12 = class376.field5186[var11];
            int var13 = class376.field5188[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method515(1.0F);
        arg0.method469(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class496 var15 = arg0.method480(var3, 2048, 0, 64, 768);
        int var16 = var15.method69() - var15.method116();
        int var17 = var15.method102() - var15.method118();
        int var18 = var15.method116() + var16 / 2;
        int var19 = var15.method118() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method503(var18, var19, var20, var20);
        arg0.method550(arg0.method505());
        class326 var21 = arg0.method514();
        var21.method1869(0, 0, arg0.method457() - var15.method113());
        var15.method106(var21, null, arg0.method457(), 1);
        this.field5083 = arg0.method479(0, 0, this.field5076, this.field5076, true);
        this.field5083.method365(0, 0, 3);
        arg0.method434(field5087[0], field5087[1], field5087[2], field5087[3]);
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(Lha;IIIIII)V")
    public final void method2287(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field5083 == null) {
            return;
        }
        int var8 = this.field5079 - arg5 & 0x3FFF;
        int var9 = this.field5080 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field5084) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field5084) / 2;
        if (var10 < arg4 && this.field5084 + var10 > 0 && var11 < arg3 && this.field5084 + var11 > 0) {
            this.field5083.method1607(arg1 + var11, arg2 + var10, this.field5084, this.field5084);
        }
    }

    @OriginalMember(owner = "client!ija", name = "d", descriptor = "(Lha;Lija;)V")
    private final void method2288(class65 arg0, class364 arg1) {
        method2290(arg0);
        method2282(arg0);
        arg0.method449(field5087);
        arg0.method434(0, 0, this.field5076, this.field5076);
        arg0.method518();
        arg0.method495(0, 0, this.field5076, this.field5076, this.field5074 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field5082) {
                var3 = -arg1.field5072;
                var4 = -arg1.field5077;
                var5 = -arg1.field5073;
            } else {
                var3 = arg1.field5072 - this.field5072;
                var4 = arg1.field5077 - this.field5077;
                var5 = arg1.field5073 - this.field5073;
            }
        }
        if (this.field5079 != 0) {
            int var6 = class376.field5186[this.field5079];
            int var7 = class376.field5188[this.field5079];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field5080 != 0) {
            int var9 = class376.field5186[this.field5080];
            int var10 = class376.field5188[this.field5080];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class496 var12 = field5089.method93((byte) 0, 51200, true);
        var12.method81((short) 0, (short) this.field5078);
        arg0.method515(1.0F);
        arg0.method469(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field5076 * 1024 / (var12.method69() - var12.method116());
        if (this.field5074 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method503(this.field5076 / 2, this.field5076 / 2, var13, var13);
        arg0.method550(arg0.method505());
        class326 var14 = arg0.method505();
        var14.method1869(0, 0, arg0.method457() - var12.method113());
        var12.method106(var14, null, 1024, 1);
        int var15 = this.field5076 * 13 / 16;
        int var16 = (this.field5076 - var15) / 2;
        field5088.method1603(var16, var16, var15, var15, 0, this.field5074 | 0xFF000000, 1);
        this.field5083 = arg0.method479(0, 0, this.field5076, this.field5076, true);
        arg0.method518();
        arg0.method495(0, 0, this.field5076, this.field5076, 0, 0);
        field5086.method1603(0, 0, this.field5076, this.field5076, 1, 0, 0);
        this.field5083.method365(0, 0, 0);
        arg0.method434(field5087[0], field5087[1], field5087[2], field5087[3]);
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(IIII)Z")
    public final boolean method2289(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field5082) {
            this.field5085 = 1073741823;
            var8 = this.field5072;
            var9 = this.field5077;
            var10 = this.field5073;
        } else {
            int var5 = this.field5072 - arg0;
            int var6 = this.field5077 - arg1;
            int var7 = this.field5073 - arg2;
            this.field5085 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field5085 == 0) {
                this.field5085 = 1;
            }
            var8 = (var5 << 8) / this.field5085;
            var9 = (var6 << 8) / this.field5085;
            var10 = (var7 << 8) / this.field5085;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field5084 = this.field5075 * arg3 / (this.field5082 ? 1024 : this.field5085);
        } else {
            this.field5084 = 0;
        }
        if (this.field5084 < 8) {
            this.field5083 = null;
            return false;
        }
        int var12 = class433.method2595(this.field5084, (byte) -82);
        if (var12 > arg3) {
            var12 = class189.method1324(arg3, (byte) 16);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field5076 != var12) {
            this.field5076 = var12;
        }
        this.field5079 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field5080 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field5083 = null;
        return true;
    }

    @OriginalMember(owner = "client!ija", name = "b", descriptor = "(Lha;)V")
    private static final void method2290(class65 arg0) {
        if (field5089 != null) {
            return;
        }
        class100 var1 = new class100(580, 1104, 1);
        var1.method721((short) 1024, (short) 1024, -31995, (short) 0, (byte) 0, (short) 1024, (short) 0, (byte) 0, (byte) 0, (short) 32767);
        var1.method711((byte) 104, 128, 0, 0);
        var1.method711((byte) 52, -128, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class376.field5186[var3];
            int var5 = class376.field5188[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class376.field5188[var12] >> 7;
                int var14 = class376.field5186[var12] * var4 >> 21;
                int var15 = class376.field5186[var12] * var5 >> 21;
                var1.method711((byte) 80, var13, -var14, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method708((byte) 0, 0, (short) 127, (byte) 0, (byte) 111, var7, var8, (byte) 0, (short) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method708((byte) 0, var8, (short) 127, (byte) 0, (byte) 110, var7, var10, (byte) 0, (short) 0);
                    var1.method708((byte) 0, var10, (short) 127, (byte) 0, (byte) 96, var7, var11, (byte) 0, (short) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method708((byte) 0, var7, (short) 127, (byte) 0, (byte) 88, 1, var8, (byte) 0, (short) 0);
            }
        }
        var1.field1172 = var1.field1153;
        var1.field1138 = null;
        var1.field1173 = null;
        var1.field1135 = null;
        field5089 = arg0.method480(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field5072 = arg2;
        this.field5077 = arg3;
        this.field5073 = arg4;
        this.field5082 = arg7;
        this.field5078 = arg1;
        this.field5074 = arg6;
        this.field5075 = arg5;
        this.field5081 = arg0;
    }

    @OriginalMember(owner = "client!ija", name = "c", descriptor = "()V")
    public static void method2291() {
        field5089 = null;
        field5088 = null;
        field5086 = null;
        field5087 = null;
    }
}
