import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class337 {

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    private int field4965;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    private int field4972;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    private int field4976;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Z")
    private boolean field4973;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    private int field4978;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    private int field4982;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    private int field4967;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    private int field4968;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "[I")
    private static int[] field4980 = new int[4];

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public int field4966;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    private int field4969;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    private int field4971;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    private int field4974;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    private int field4979;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lda;")
    private static class55 field4970;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lf;")
    private static class702 field4975;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "Lf;")
    private class702 field4977;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Lf;")
    private static class702 field4981;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lr;Lhe;)Z", line = 3)
    public final boolean method2117(class166 arg0, class337 arg1) {
        return this.field4977 != null || this.method2125(arg0, arg1);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lr;IIIIII)V", line = 7)
    public final void method2118(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4977 == null) {
            return;
        }
        int var8 = this.field4969 - arg5 & 0x3FFF;
        int var9 = this.field4979 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field4971) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field4971) / 2;
        if (var10 < arg4 && this.field4971 + var10 > 0 && var11 < arg3 && this.field4971 + var11 > 0) {
            this.field4977.method3908(arg1 + var11, arg2 + var10, this.field4971, this.field4971);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V", line = 33)
    public static final void method2119() {
        field4970 = null;
        field4975 = null;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()V", line = 37)
    public static void method2120() {
        field4970 = null;
        field4981 = null;
        field4975 = null;
        field4980 = null;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Lr;Lhe;)V", line = 43)
    private final void method2121(class166 arg0, class337 arg1) {
        method2127(arg0);
        method2126(arg0);
        arg0.method204(field4980);
        arg0.method168(0, 0, this.field4974, this.field4974);
        arg0.method194();
        arg0.method114(0, 0, this.field4974, this.field4974, this.field4982 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field4973) {
                var3 = -arg1.field4965;
                var4 = -arg1.field4972;
                var5 = -arg1.field4976;
            } else {
                var3 = arg1.field4965 - this.field4965;
                var4 = arg1.field4972 - this.field4972;
                var5 = arg1.field4976 - this.field4976;
            }
        }
        if (this.field4969 != 0) {
            int var6 = class189.field2719[this.field4969];
            int var7 = class189.field2721[this.field4969];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field4979 != 0) {
            int var9 = class189.field2719[this.field4979];
            int var10 = class189.field2721[this.field4979];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class55 var12 = field4970.method532((byte) 0, 51200, true);
        if (arg0.method148()) {
            var12.method527((short) 0, (short) this.field4978);
        } else {
            var12.method500((short) 127, class199.field2809.method1386(this.field4978, -6514).field2283);
            var12.method527((short) 0, (short) -1);
        }
        arg0.method132(1.0F);
        arg0.method185(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field4974 * 1024 / (var12.method544() - var12.method512());
        if (this.field4982 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method184(this.field4974 / 2, this.field4974 / 2, var13, var13);
        arg0.method155(arg0.method100());
        class391 var14 = arg0.method100();
        var14.method252(0, 0, arg0.method110() - var12.method531());
        var12.method495(var14, null, 1024, 1);
        int var15 = this.field4974 * 13 / 16;
        int var16 = (this.field4974 - var15) / 2;
        field4981.method3909(var16, var16, var15, var15, 0, this.field4982 | 0xFF000000, 1);
        this.field4977 = arg0.method136(0, 0, this.field4974, this.field4974, true);
        arg0.method194();
        arg0.method114(0, 0, this.field4974, this.field4974, 0, 0);
        field4975.method3909(0, 0, this.field4974, this.field4974, 1, 0, 0);
        this.field4977.method934(0, 0, 0);
        arg0.method168(field4980[0], field4980[1], field4980[2], field4980[3]);
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(Lr;Lhe;)V", line = 144)
    private final void method2122(class166 arg0, class337 arg1) {
        class461 var3 = class24.method284(this.field4978, (byte) 65, 0, class207.field2914);
        if (var3 == null) {
            return;
        }
        arg0.method204(field4980);
        arg0.method168(0, 0, this.field4974, this.field4974);
        arg0.method114(0, 0, this.field4974, this.field4974, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field4973) {
                var4 = -arg1.field4965;
                var5 = -arg1.field4972;
                var6 = -arg1.field4976;
            } else {
                var4 = this.field4965 - arg1.field4965;
                var5 = this.field4972 - arg1.field4972;
                var6 = this.field4976 - arg1.field4976;
            }
        }
        if (this.field4969 != 0) {
            int var7 = -this.field4969 & 0x3FFF;
            int var8 = class189.field2719[var7];
            int var9 = class189.field2721[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field4979 != 0) {
            int var11 = -this.field4979 & 0x3FFF;
            int var12 = class189.field2719[var11];
            int var13 = class189.field2721[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method132(1.0F);
        arg0.method185(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class55 var15 = arg0.method171(var3, 2048, 0, 64, 768);
        int var16 = var15.method544() - var15.method512();
        int var17 = var15.method534() - var15.method488();
        int var18 = var15.method512() + var16 / 2;
        int var19 = var15.method488() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method184(var18, var19, var20, var20);
        arg0.method155(arg0.method100());
        class391 var21 = arg0.method130();
        var21.method252(0, 0, arg0.method110() - var15.method531());
        var15.method495(var21, null, arg0.method110(), 1);
        this.field4977 = arg0.method136(0, 0, this.field4974, this.field4974, true);
        this.field4977.method934(0, 0, 3);
        arg0.method168(field4980[0], field4980[1], field4980[2], field4980[3]);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)Z", line = 231)
    public final boolean method2123(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field4973) {
            this.field4966 = 1073741823;
            var8 = this.field4965;
            var9 = this.field4972;
            var10 = this.field4976;
        } else {
            int var5 = this.field4965 - arg0;
            int var6 = this.field4972 - arg1;
            int var7 = this.field4976 - arg2;
            this.field4966 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field4966 == 0) {
                this.field4966 = 1;
            }
            var8 = (var5 << 8) / this.field4966;
            var9 = (var6 << 8) / this.field4966;
            var10 = (var7 << 8) / this.field4966;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field4971 = this.field4967 * arg3 / (this.field4973 ? 1024 : this.field4966);
        } else {
            this.field4971 = 0;
        }
        if (this.field4971 < 8) {
            this.field4977 = null;
            return false;
        }
        int var12 = class2.method9(this.field4971, -110);
        if (var12 > arg3) {
            var12 = class405.method2458(arg3, -619912415);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field4974 != var12) {
            this.field4974 = var12;
        }
        this.field4969 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field4979 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field4977 = null;
        return true;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()V", line = 287)
    public final void method2124() {
        this.field4977 = null;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(Lr;Lhe;)Z", line = 300)
    private final boolean method2125(class166 arg0, class337 arg1) {
        if (this.field4977 == null) {
            if (this.field4968 == 0) {
                if (class199.field2809.method1383(this.field4978, -61)) {
                    int[] var3 = class199.field2809.method1384(false, this.field4974, this.field4974, this.field4978, 0.7F, (byte) 125);
                    this.field4977 = arg0.method209(var3, 0, this.field4974, this.field4974, this.field4974);
                }
            } else if (this.field4968 == 2) {
                this.method2122(arg0, arg1);
            } else if (this.field4968 == 1) {
                this.method2121(arg0, arg1);
            }
        }
        return this.field4977 != null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lr;)V", line = 334)
    private static final void method2126(class166 arg0) {
        if (field4975 != null) {
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
        field4975 = arg0.method209(var2, 0, 128, 128, 128);
        field4981 = arg0.method209(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Lr;)V", line = 396)
    private static final void method2127(class166 arg0) {
        if (field4970 != null) {
            return;
        }
        class461 var1 = new class461(580, 1104, 1);
        var1.method2716((short) 1024, (short) 32767, 1, (short) 1024, (byte) 0, (short) 0, (byte) 0, (short) 0, (byte) 0, (short) 1024);
        var1.method2719((byte) 109, 0, 128, 0);
        var1.method2719((byte) 60, 0, -128, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class189.field2719[var3];
            int var5 = class189.field2721[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class189.field2721[var12] >> 7;
                int var14 = class189.field2719[var12] * var4 >> 21;
                int var15 = class189.field2719[var12] * var5 >> 21;
                var1.method2719((byte) 52, var15, var13, -var14);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2713((short) 0, var8, (byte) 0, var7, (byte) 82, (short) 127, (byte) 0, 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2713((short) 0, var10, (byte) 0, var7, (byte) 74, (short) 127, (byte) 0, var8, (byte) 0);
                    var1.method2713((short) 0, var11, (byte) 0, var7, (byte) 76, (short) 127, (byte) 0, var10, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2713((short) 0, var8, (byte) 0, 1, (byte) 99, (short) 127, (byte) 0, var7, (byte) 0);
            }
        }
        var1.field6592 = var1.field6598;
        var1.field6625 = null;
        var1.field6619 = null;
        var1.field6601 = null;
        field4970 = arg0.method171(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 476)
    public class337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field4965 = arg2;
        this.field4972 = arg3;
        this.field4976 = arg4;
        this.field4973 = arg7;
        this.field4978 = arg1;
        this.field4982 = arg6;
        this.field4967 = arg5;
        this.field4968 = arg0;
    }
}
