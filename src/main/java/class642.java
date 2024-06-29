import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class642 {

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    private int field9094;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    private int field9102;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    private int field9103;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "Z")
    private boolean field9098;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    private int field9091;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    private int field9095;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    private int field9099;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    private int field9106;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "[I")
    private static int[] field9104 = new int[4];

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    private int field9089;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    private int field9090;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public int field9093;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    private int field9097;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    private int field9105;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "Lxa;")
    private static class424 field9092;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "Lxa;")
    private static class424 field9100;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "Lxa;")
    private class424 field9101;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Lba;")
    private static class629 field9096;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()V")
    public static void method3570() {
        field9096 = null;
        field9100 = null;
        field9092 = null;
        field9104 = null;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "()V")
    public static final void method3571() {
        field9096 = null;
        field9092 = null;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "()V")
    public final void method3572() {
        this.field9101 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Loa;Lel;)Z")
    public final boolean method3573(class689 arg0, class642 arg1) {
        return this.field9101 != null || this.method3577(arg0, arg1);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIII)Z")
    public final boolean method3574(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field9098) {
            this.field9093 = 1073741823;
            var8 = this.field9094;
            var9 = this.field9102;
            var10 = this.field9103;
        } else {
            int var5 = this.field9094 - arg0;
            int var6 = this.field9102 - arg1;
            int var7 = this.field9103 - arg2;
            this.field9093 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field9093 == 0) {
                this.field9093 = 1;
            }
            var8 = (var5 << 8) / this.field9093;
            var9 = (var6 << 8) / this.field9093;
            var10 = (var7 << 8) / this.field9093;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field9105 = this.field9099 * arg3 / (this.field9098 ? 1024 : this.field9093);
        } else {
            this.field9105 = 0;
        }
        if (this.field9105 < 8) {
            this.field9101 = null;
            return false;
        }
        int var12 = class306.method1837((byte) -114, this.field9105);
        if (var12 > arg3) {
            var12 = class20.method114(arg3, (byte) 109);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field9089 != var12) {
            this.field9089 = var12;
        }
        this.field9090 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field9097 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field9101 = null;
        return true;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(Loa;Lel;)V")
    private final void method3575(class689 arg0, class642 arg1) {
        class238 var3 = class646.method3591(class19.field168, this.field9091, 0, 0);
        if (var3 == null) {
            return;
        }
        arg0.method1910(field9104);
        arg0.method1908(0, 0, this.field9089, this.field9089);
        arg0.method1926(0, 0, this.field9089, this.field9089, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field9098) {
                var4 = -arg1.field9094;
                var5 = -arg1.field9102;
                var6 = -arg1.field9103;
            } else {
                var4 = this.field9094 - arg1.field9094;
                var5 = this.field9102 - arg1.field9102;
                var6 = this.field9103 - arg1.field9103;
            }
        }
        if (this.field9090 != 0) {
            int var7 = -this.field9090 & 0x3FFF;
            int var8 = class654.field9259[var7];
            int var9 = class654.field9260[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field9097 != 0) {
            int var11 = -this.field9097 & 0x3FFF;
            int var12 = class654.field9259[var11];
            int var13 = class654.field9260[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method1986(1.0F);
        arg0.method1991(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class629 var15 = arg0.method1784(var3, 2048, 0, 64, 768);
        int var16 = var15.method662() - var15.method641();
        int var17 = var15.method660() - var15.method686();
        int var18 = var15.method641() + var16 / 2;
        int var19 = var15.method686() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method1875(var18, var19, var20, var20);
        arg0.method1887(arg0.method1922());
        class111 var21 = arg0.method1972();
        var21.method609(0, 0, arg0.method1990() - var15.method679());
        var15.method672(var21, null, arg0.method1990(), 1);
        this.field9101 = arg0.method1939(0, 0, this.field9089, this.field9089, true);
        this.field9101.method66(0, 0, 3);
        arg0.method1908(field9104[0], field9104[1], field9104[2], field9104[3]);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Loa;IIIIII)V")
    public final void method3576(class689 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field9101 == null) {
            return;
        }
        int var8 = this.field9090 - arg5 & 0x3FFF;
        int var9 = this.field9097 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field9105) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field9105) / 2;
        if (var10 < arg4 && this.field9105 + var10 > 0 && var11 < arg3 && this.field9105 + var11 > 0) {
            this.field9101.method2446(arg1 + var11, arg2 + var10, this.field9105, this.field9105);
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(Loa;Lel;)Z")
    private final boolean method3577(class689 arg0, class642 arg1) {
        if (this.field9101 == null) {
            if (this.field9106 == 0) {
                if (class511.field6895.method1732(this.field9091, 111)) {
                    int[] var3 = class511.field6895.method1734(true, this.field9089, 0.7F, this.field9089, this.field9091, false);
                    this.field9101 = arg0.method1894(var3, 0, this.field9089, this.field9089, this.field9089);
                }
            } else if (this.field9106 == 2) {
                this.method3575(arg0, arg1);
            } else if (this.field9106 == 1) {
                this.method3579(arg0, arg1);
            }
        }
        return this.field9101 != null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Loa;)V")
    private static final void method3578(class689 arg0) {
        if (field9096 != null) {
            return;
        }
        class238 var1 = new class238(580, 1104, 1);
        var1.method1473((byte) 0, (short) 0, -8290, (short) 1024, (short) 32767, (byte) 0, (short) 0, (byte) 0, (short) 1024, (short) 1024);
        var1.method1475(128, (byte) -102, 0, 0);
        var1.method1475(-128, (byte) -81, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class654.field9259[var3];
            int var5 = class654.field9260[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class654.field9260[var12] >> 7;
                int var14 = class654.field9259[var12] * var4 >> 21;
                int var15 = class654.field9259[var12] * var5 >> 21;
                var1.method1475(var13, (byte) -101, -var14, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1478((byte) 0, (short) 127, var8, (byte) -71, (short) 0, 0, (byte) 0, (byte) 0, var7);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1478((byte) 0, (short) 127, var10, (byte) -103, (short) 0, var8, (byte) 0, (byte) 0, var7);
                    var1.method1478((byte) 0, (short) 127, var11, (byte) -93, (short) 0, var10, (byte) 0, (byte) 0, var7);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1478((byte) 0, (short) 127, var8, (byte) -20, (short) 0, var7, (byte) 0, (byte) 0, 1);
            }
        }
        var1.field3117 = var1.field3140;
        var1.field3113 = null;
        var1.field3110 = null;
        var1.field3100 = null;
        field9096 = arg0.method1784(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(Loa;Lel;)V")
    private final void method3579(class689 arg0, class642 arg1) {
        method3578(arg0);
        method3580(arg0);
        arg0.method1910(field9104);
        arg0.method1908(0, 0, this.field9089, this.field9089);
        arg0.method821();
        arg0.method1926(0, 0, this.field9089, this.field9089, this.field9095 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field9098) {
                var3 = -arg1.field9094;
                var4 = -arg1.field9102;
                var5 = -arg1.field9103;
            } else {
                var3 = arg1.field9094 - this.field9094;
                var4 = arg1.field9102 - this.field9102;
                var5 = arg1.field9103 - this.field9103;
            }
        }
        if (this.field9090 != 0) {
            int var6 = class654.field9259[this.field9090];
            int var7 = class654.field9260[this.field9090];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field9097 != 0) {
            int var9 = class654.field9259[this.field9097];
            int var10 = class654.field9260[this.field9097];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class629 var12 = field9096.method659((byte) 0, 51200, true);
        if (arg0.method1945()) {
            var12.method657((short) 0, (short) this.field9091);
        } else {
            var12.method668((short) 127, class511.field6895.method1728(-128, this.field9091).field7858);
            var12.method657((short) 0, (short) -1);
        }
        arg0.method1986(1.0F);
        arg0.method1991(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field9089 * 1024 / (var12.method662() - var12.method641());
        if (this.field9095 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method1875(this.field9089 / 2, this.field9089 / 2, var13, var13);
        arg0.method1887(arg0.method1922());
        class111 var14 = arg0.method1922();
        var14.method609(0, 0, arg0.method1990() - var12.method679());
        var12.method672(var14, null, 1024, 1);
        int var15 = this.field9089 * 13 / 16;
        int var16 = (this.field9089 - var15) / 2;
        field9100.method65(var16, var16, var15, var15, 0, this.field9095 | 0xFF000000, 1);
        this.field9101 = arg0.method1939(0, 0, this.field9089, this.field9089, true);
        arg0.method821();
        arg0.method1926(0, 0, this.field9089, this.field9089, 0, 0);
        field9092.method65(0, 0, this.field9089, this.field9089, 1, 0, 0);
        this.field9101.method66(0, 0, 0);
        arg0.method1908(field9104[0], field9104[1], field9104[2], field9104[3]);
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field9094 = arg2;
        this.field9102 = arg3;
        this.field9103 = arg4;
        this.field9098 = arg7;
        this.field9091 = arg1;
        this.field9095 = arg6;
        this.field9099 = arg5;
        this.field9106 = arg0;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(Loa;)V")
    private static final void method3580(class689 arg0) {
        if (field9092 != null) {
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
        field9092 = arg0.method1894(var2, 0, 128, 128, 128);
        field9100 = arg0.method1894(var1, 0, 128, 128, 128);
    }
}
