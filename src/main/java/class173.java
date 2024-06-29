import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class173 {

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    private int field2638;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    private int field2640;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    private int field2644;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "Z")
    private boolean field2648;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    private int field2652;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    private int field2641;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    private int field2650;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    private int field2646;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "[I")
    private static int[] field2649 = new int[4];

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    private int field2637;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    private int field2642;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public int field2645;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    private int field2647;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    private int field2651;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "Lbc;")
    private class148 field2639;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Lig;")
    private static class96 field2643;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "[B")
    private static byte[] field2653;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([IIIIIIIIIIII)V")
    private final void method1231(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field2653[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIILwg;)V")
    public final void method1232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class173 arg6) {
        int var8 = this.field2642 - arg4 & 0x7FF;
        int var9 = this.field2651 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field2647) / 2 + var10;
        int var13 = (arg2 - this.field2647) / 2 + var11;
        if (var12 < arg3 && this.field2647 + var12 > 0 && var13 < arg2 && this.field2647 + var13 > 0 && this.method1242(arg6)) {
            this.field2639.method719(arg0 + var13, arg1 + var12, this.field2647, this.field2647);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "()V")
    private final void method1233() {
        int var1 = this.field2637 * 3 / 32;
        int var3 = this.field2637 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class130.field2159 * var1 + var1;
        int var8 = class130.field2159 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class130.field2161) {
            var4 = var3 - (var1 + var3 - class130.field2161);
        }
        if (var1 < class130.field2160) {
            int var11 = class130.field2160 - var1;
            var4 -= var11;
            var7 += class130.field2159 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class130.field2166) {
            int var12 = var1 + var3 - class130.field2166;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class130.field2163) {
            int var13 = class130.field2163 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method1231(class130.field2164, 0, this.field2641, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lwg;)V")
    private final void method1234(class173 arg0) {
        class96 var2 = class96.method760(class127.field2134, this.field2652, 0);
        if (var2 == null) {
            return;
        }
        this.field2639 = new class148(this.field2637, this.field2637);
        class130.method995(field2649);
        this.field2639.method1100();
        class244.method1675();
        class130.method996(0, 0, this.field2637, this.field2637, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field2648) {
                var3 = -arg0.field2638;
                var4 = -arg0.field2640;
                var5 = -arg0.field2644;
            } else {
                var3 = this.field2638 - arg0.field2638;
                var4 = this.field2640 - arg0.field2640;
                var5 = this.field2644 - arg0.field2644;
            }
        }
        if (this.field2642 != 0) {
            int var6 = class244.field3590[this.field2642];
            int var7 = class244.field3592[this.field2642];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field2651 != 0) {
            int var9 = this.field2651 - 1024 & 0x7FF;
            int var10 = class244.field3590[var9];
            int var11 = class244.field3592[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class257 var13 = var2.method737(64, 768, -var3, -var4, -var5);
        int var14 = var13.method425() - var13.method427();
        int var15 = var13.method1763() - var13.method17();
        int var16 = var13.method427() + var14 / 2;
        int var17 = var13.method17() + var15 / 2;
        if (var14 > var15) {
            var13.method1771(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field2637);
        } else {
            var13.method1771(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field2637);
        }
        class112.field1865.method299(0);
        class130.method980(field2649);
        class244.method1675();
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII)Z")
    public final boolean method1235(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2648) {
            this.field2645 = 1073741823;
            var8 = this.field2638;
            var9 = this.field2640;
            var10 = this.field2644;
        } else {
            int var5 = this.field2638 - arg0;
            int var6 = this.field2640 - arg1;
            int var7 = this.field2644 - arg2;
            this.field2645 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2645 == 0) {
                this.field2645 = 1;
            }
            var8 = (var5 << 8) / this.field2645;
            var9 = (var6 << 8) / this.field2645;
            var10 = (var7 << 8) / this.field2645;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2647 = this.field2650 * arg3 / (this.field2648 ? 1024 : this.field2645);
        } else {
            this.field2647 = 0;
        }
        if (this.field2647 < 8) {
            this.method1240();
            this.field2639 = null;
            return false;
        }
        int var12 = class277.method1925(this.field2647, true);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2637 != var12) {
            this.field2637 = var12;
        }
        this.field2642 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field2651 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field2639 = null;
        return true;
    }

    @OriginalMember(owner = "client!wg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1240();
        super.finalize();
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Lwg;)V")
    private final void method1236(class173 arg0) {
        method1243();
        method1237();
        this.field2639 = new class116(this.field2637, this.field2637);
        class130.method995(field2649);
        this.field2639.method1100();
        class244.method1675();
        class130.method996(0, 0, this.field2637, this.field2637, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field2648) {
                var2 = -arg0.field2638;
                var3 = -arg0.field2640;
                var4 = -arg0.field2644;
            } else {
                var2 = this.field2638 - arg0.field2638;
                var3 = this.field2640 - arg0.field2640;
                var4 = this.field2644 - arg0.field2644;
            }
        }
        if (this.field2642 != 0) {
            int var5 = class244.field3590[this.field2642];
            int var6 = class244.field3592[this.field2642];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field2651 != 0) {
            int var8 = this.field2651 - 1024 & 0x7FF;
            int var9 = class244.field3590[var8];
            int var10 = class244.field3592[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class117.method877(field2643.field1636, 0, field2643.field1652, (short) class244.field3600.method531(this.field2652, -8362));
        class257 var12 = field2643.method737(64, 512, -var2, -var3, -var4);
        int var13 = var12.method425() - var12.method427();
        int var14 = var12.method1763() - var12.method17();
        if (var13 > var14) {
            int var15 = this.field2641 == 0 ? (var13 << 9) / this.field2637 : (var13 * 16 << 9) / (this.field2637 * 13);
            var12.method1771(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field2641 == 0 ? (var14 << 9) / this.field2637 : (var14 * 16 << 9) / (this.field2637 * 13);
            var12.method1771(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field2641 == 0) {
            for (int var17 = 0; var17 < class130.field2164.length; var17++) {
                if (class130.field2164[var17] != 0) {
                    class130.field2164[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method1233();
            this.method1241();
        }
        class112.field1865.method299(0);
        class130.method980(field2649);
        class244.method1675();
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "()V")
    private static final void method1237() {
        if (field2653 != null) {
            return;
        }
        field2653 = new byte[16384];
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
                field2653[var4 + var6] = field2653[var4 + var9] = field2653[var5 + var6] = field2653[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([IIIIIIIIIII)V")
    private final void method1238(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field2653[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "()V")
    public static void method1239() {
        field2643 = null;
        field2653 = null;
        field2649 = null;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "()V")
    private final void method1240() {
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "()V")
    private final void method1241() {
        int var1 = this.field2637;
        int var2 = this.field2637;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class130.field2159 - var1;
        if (var2 > class130.field2161) {
            var2 -= var2 - class130.field2161;
        }
        if (class130.field2160 > 0) {
            int var9 = class130.field2160;
            var2 -= var9;
            var7 += class130.field2159 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class130.field2166) {
            int var10 = var1 - class130.field2166;
            var1 -= var10;
            var8 += var10;
        }
        if (class130.field2163 > 0) {
            int var11 = class130.field2163;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method1238(class130.field2164, this.field2641, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(Lwg;)Z")
    private final boolean method1242(class173 arg0) {
        if (this.field2639 == null) {
            if (this.field2646 == 0) {
                this.field2639 = class244.field3600.method529(123, this.field2637, class244.field3597, true, this.field2652);
            } else if (this.field2646 == 2) {
                this.method1234(arg0);
            } else if (this.field2646 == 1) {
                this.method1236(arg0);
            }
        }
        return this.field2639 != null;
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "()V")
    private static final void method1243() {
        if (field2643 != null) {
            return;
        }
        class96 var0 = field2643 = new class96(260, 480, 0);
        int[] var1 = var0.field1649;
        int[] var2 = var0.field1613;
        int[] var3 = var0.field1632;
        int[] var4 = var0.field1616;
        int[] var5 = var0.field1648;
        int[] var6 = var0.field1662;
        var0.field1633 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class244.field3590[var8] >> 1;
            int var10 = class244.field3592[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var17 = var11 * 1024 / 16;
                int var18 = class244.field3592[var17] >> 9;
                int var19 = (class244.field3590[var17] >> 1) * var9 >> 23;
                int var20 = (class244.field3590[var17] >> 1) * var10 >> 23;
                var1[var0.field1633] = var20;
                var2[var0.field1633] = var18;
                var3[var0.field1633] = -var19;
                var0.field1633++;
            }
            if (var7 > 0) {
                int var12 = var7 * 15 + 2;
                int var13 = var12 - 15;
                var4[var0.field1652] = 0;
                var5[var0.field1652] = var13;
                var6[var0.field1652] = var12;
                var0.field1652++;
                for (int var14 = 1; var14 < 15; var14++) {
                    int var15 = var13 + 1;
                    int var16 = var12 + 1;
                    var4[var0.field1652] = var13;
                    var5[var0.field1652] = var15;
                    var6[var0.field1652] = var12;
                    var0.field1652++;
                    var4[var0.field1652] = var15;
                    var5[var0.field1652] = var16;
                    var6[var0.field1652] = var12;
                    var0.field1652++;
                    var13 = var15;
                    var12 = var16;
                }
                var4[var0.field1652] = var12;
                var5[var0.field1652] = var13;
                var6[var0.field1652] = 1;
                var0.field1652++;
            }
        }
        var0.field1645 = var0.field1633;
        var0.field1640 = null;
        var0.field1666 = null;
        var0.field1644 = null;
        var0.field1631 = null;
        var0.field1650 = null;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2638 = arg2;
        this.field2640 = arg3;
        this.field2644 = arg4;
        this.field2648 = arg7;
        this.field2652 = arg1;
        this.field2641 = arg6;
        this.field2650 = arg5;
        this.field2646 = arg0;
    }
}
