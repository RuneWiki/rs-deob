import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class143 {

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    private int field2123;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    private int field2121;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    private int field2131;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "Z")
    private boolean field2125;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    private int field2135;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    private int field2124;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    private int field2122;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    private int field2133;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "[I")
    private static int[] field2127 = new int[4];

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    private int field2119;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public int field2128;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    private int field2130;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    private int field2132;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    private int field2134;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "Ljj;")
    private static class141 field2129;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Lff;")
    private class48 field2126;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "[B")
    private static byte[] field2120;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ldi;)Z")
    private final boolean method930(class143 arg0) {
        if (this.field2126 == null) {
            if (this.field2133 == 0) {
                this.field2126 = class221.field3464.method576(this.field2132, 102, this.field2135, true, class221.field3469);
            } else if (this.field2133 == 2) {
                this.method937(arg0);
            } else if (this.field2133 == 1) {
                this.method942(arg0);
            }
        }
        return this.field2126 != null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([IIIIIIIIIIII)V")
    private final void method931(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field2120[(arg3 >> 16) + var15] & 0xFF) + 64;
                    if (var18 > 255) {
                        var18 = 255;
                    }
                    int var19 = 256 - var18;
                    arg0[arg5] = ((arg2 & 0xFF00FF) * var19 + (var17 & 0xFF00FF) * var18 & -16711936) + ((arg2 & 0xFF00) * var19 + (var17 & 0xFF00) * var18 & 0xFF0000) >> 8 | 0xFF000000;
                }
                arg5++;
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "()V")
    private static final void method932() {
        if (field2120 != null) {
            return;
        }
        field2120 = new byte[16384];
        for (int var0 = 0; var0 < 64; var0++) {
            int var1 = 64 - var0;
            int var2 = var1 * var1;
            int var3 = 128 - var0 - 1;
            int var4 = var0 * 128;
            int var5 = var3 * 128;
            for (int var6 = 0; var6 < 64; var6++) {
                int var7 = 64 - var6;
                int var8 = var7 * var7;
                int var9 = 128 - var6 - 1;
                int var10 = 256 - (var2 + var8 << 8) / 4096;
                int var11 = var10 * 16 * 192 / 1536;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                field2120[var4 + var6] = field2120[var4 + var9] = field2120[var5 + var6] = field2120[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "()V")
    private final void method933() {
        int var1 = this.field2132 * 3 / 32;
        int var3 = this.field2132 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class151.field2225 * var1 + var1;
        int var8 = class151.field2225 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class151.field2229) {
            var4 = var3 - (var1 + var3 - class151.field2229);
        }
        if (var1 < class151.field2230) {
            int var11 = class151.field2230 - var1;
            var4 -= var11;
            var7 += class151.field2225 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class151.field2228) {
            int var12 = var1 + var3 - class151.field2228;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class151.field2227) {
            int var13 = class151.field2227 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method931(class151.field2226, 0, this.field2124, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "()V")
    public static void method934() {
        field2129 = null;
        field2120 = null;
        field2127 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIILdi;)V")
    public final void method935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class143 arg6) {
        int var8 = this.field2134 - arg4 & 0x7FF;
        int var9 = this.field2119 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field2130) / 2 + var10;
        int var13 = (arg2 - this.field2130) / 2 + var11;
        if (var12 < arg3 && this.field2130 + var12 > 0 && var13 < arg2 && this.field2130 + var13 > 0 && this.method930(arg6)) {
            this.field2126.method292(arg0 + var13, arg1 + var12, this.field2130, this.field2130);
        }
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "()V")
    private static final void method936() {
        if (field2129 != null) {
            return;
        }
        class141 var0 = field2129 = new class141(260, 480, 0);
        int[] var1 = var0.field2043;
        int[] var2 = var0.field2048;
        int[] var3 = var0.field2027;
        int[] var4 = var0.field2036;
        int[] var5 = var0.field2029;
        int[] var6 = var0.field2037;
        var0.field2065 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class221.field3468[var8] >> 1;
            int var10 = class221.field3465[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var17 = var11 * 1024 / 16;
                int var18 = class221.field3465[var17] >> 9;
                int var19 = (class221.field3468[var17] >> 1) * var9 >> 23;
                int var20 = (class221.field3468[var17] >> 1) * var10 >> 23;
                var1[var0.field2065] = var20;
                var2[var0.field2065] = var18;
                var3[var0.field2065] = -var19;
                var0.field2065++;
            }
            if (var7 > 0) {
                int var12 = var7 * 15 + 2;
                int var13 = var12 - 15;
                var4[var0.field2054] = 0;
                var5[var0.field2054] = var13;
                var6[var0.field2054] = var12;
                var0.field2054++;
                for (int var14 = 1; var14 < 15; var14++) {
                    int var15 = var13 + 1;
                    int var16 = var12 + 1;
                    var4[var0.field2054] = var13;
                    var5[var0.field2054] = var15;
                    var6[var0.field2054] = var12;
                    var0.field2054++;
                    var4[var0.field2054] = var15;
                    var5[var0.field2054] = var16;
                    var6[var0.field2054] = var12;
                    var0.field2054++;
                    var13 = var15;
                    var12 = var16;
                }
                var4[var0.field2054] = var12;
                var5[var0.field2054] = var13;
                var6[var0.field2054] = 1;
                var0.field2054++;
            }
        }
        var0.field2028 = var0.field2065;
        var0.field2025 = null;
        var0.field2042 = null;
        var0.field2046 = null;
        var0.field2032 = null;
        var0.field2071 = null;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(Ldi;)V")
    private final void method937(class143 arg0) {
        class141 var2 = class141.method909(class157.field2341, this.field2135, 0);
        if (var2 == null) {
            return;
        }
        this.field2126 = new class48(this.field2132, this.field2132);
        class151.method1043(field2127);
        this.field2126.method290();
        class221.method1569();
        class151.method1026(0, 0, this.field2132, this.field2132, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field2125) {
                var3 = -arg0.field2123;
                var4 = -arg0.field2121;
                var5 = -arg0.field2131;
            } else {
                var3 = this.field2123 - arg0.field2123;
                var4 = this.field2121 - arg0.field2121;
                var5 = this.field2131 - arg0.field2131;
            }
        }
        if (this.field2134 != 0) {
            int var6 = class221.field3468[this.field2134];
            int var7 = class221.field3465[this.field2134];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field2119 != 0) {
            int var9 = this.field2119 - 1024 & 0x7FF;
            int var10 = class221.field3468[var9];
            int var11 = class221.field3465[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class51 var13 = var2.method891(64, 768, -var3, -var4, -var5);
        int var14 = var13.method326() - var13.method343();
        int var15 = var13.method340() - var13.method4();
        int var16 = var13.method343() + var14 / 2;
        int var17 = var13.method4() + var15 / 2;
        if (var14 > var15) {
            var13.method335(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field2132);
        } else {
            var13.method335(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field2132);
        }
        class187.field2935.method1849(false);
        class151.method1039(field2127);
        class221.method1569();
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "()V")
    private final void method938() {
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([IIIIIIIIIII)V")
    private final void method939(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field2120[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
                } else {
                    arg0[arg4] |= 0xFF000000;
                }
                arg4++;
                arg2 += arg8;
            }
            arg3 += arg9;
            arg2 = var12;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "()V")
    private final void method940() {
        int var1 = this.field2132;
        int var2 = this.field2132;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class151.field2225 - var1;
        if (var2 > class151.field2229) {
            var2 -= var2 - class151.field2229;
        }
        if (class151.field2230 > 0) {
            int var9 = class151.field2230;
            var2 -= var9;
            var7 += class151.field2225 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class151.field2228) {
            int var10 = var1 - class151.field2228;
            var1 -= var10;
            var8 += var10;
        }
        if (class151.field2227 > 0) {
            int var11 = class151.field2227;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method939(class151.field2226, this.field2124, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII)Z")
    public final boolean method941(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2125) {
            this.field2128 = 1073741823;
            var8 = this.field2123;
            var9 = this.field2121;
            var10 = this.field2131;
        } else {
            int var5 = this.field2123 - arg0;
            int var6 = this.field2121 - arg1;
            int var7 = this.field2131 - arg2;
            this.field2128 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2128 == 0) {
                this.field2128 = 1;
            }
            var8 = (var5 << 8) / this.field2128;
            var9 = (var6 << 8) / this.field2128;
            var10 = (var7 << 8) / this.field2128;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2130 = this.field2122 * arg3 / (this.field2125 ? 1024 : this.field2128);
        } else {
            this.field2130 = 0;
        }
        if (this.field2130 < 8) {
            this.method938();
            this.field2126 = null;
            return false;
        }
        int var12 = class164.method1132(61, this.field2130);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2132 != var12) {
            this.field2132 = var12;
        }
        this.field2134 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field2119 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field2126 = null;
        return true;
    }

    @OriginalMember(owner = "client!di", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method938();
        super.finalize();
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(Ldi;)V")
    private final void method942(class143 arg0) {
        method936();
        method932();
        this.field2126 = new class149(this.field2132, this.field2132);
        class151.method1043(field2127);
        this.field2126.method290();
        class221.method1569();
        class151.method1026(0, 0, this.field2132, this.field2132, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field2125) {
                var2 = -arg0.field2123;
                var3 = -arg0.field2121;
                var4 = -arg0.field2131;
            } else {
                var2 = this.field2123 - arg0.field2123;
                var3 = this.field2121 - arg0.field2121;
                var4 = this.field2131 - arg0.field2131;
            }
        }
        if (this.field2134 != 0) {
            int var5 = class221.field3468[this.field2134];
            int var6 = class221.field3465[this.field2134];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field2119 != 0) {
            int var8 = this.field2119 - 1024 & 0x7FF;
            int var9 = class221.field3468[var8];
            int var10 = class221.field3465[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class103.method690(field2129.field2069, 0, field2129.field2054, (short) class221.field3464.method577((byte) 123, this.field2135));
        class51 var12 = field2129.method891(64, 512, -var2, -var3, -var4);
        int var13 = var12.method326() - var12.method343();
        int var14 = var12.method340() - var12.method4();
        if (var13 > var14) {
            int var15 = this.field2124 == 0 ? (var13 << 9) / this.field2132 : (var13 * 16 << 9) / (this.field2132 * 13);
            var12.method335(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field2124 == 0 ? (var14 << 9) / this.field2132 : (var14 * 16 << 9) / (this.field2132 * 13);
            var12.method335(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field2124 == 0) {
            for (int var17 = 0; var17 < class151.field2226.length; var17++) {
                if (class151.field2226[var17] != 0) {
                    class151.field2226[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method933();
            this.method940();
        }
        class187.field2935.method1849(false);
        class151.method1039(field2127);
        class221.method1569();
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2123 = arg2;
        this.field2121 = arg3;
        this.field2131 = arg4;
        this.field2125 = arg7;
        this.field2135 = arg1;
        this.field2124 = arg6;
        this.field2122 = arg5;
        this.field2133 = arg0;
    }
}
