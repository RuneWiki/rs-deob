import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class29 {

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    private int field340;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    private int field339;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "Z")
    private boolean field341;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    private int field338;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "[I")
    private static int[] field330 = new int[4];

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "Lba;")
    private static class327 field342;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "Lxa;")
    private static class433 field325;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "Lxa;")
    private static class433 field327;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "Lxa;")
    private class433 field334;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Loa;Lrk;)V", line = 5)
    private final void method169(class605 arg0, class29 arg1) {
        class557 var3 = class471.method2890(0, this.field333, -56, class641.field9246);
        if (var3 == null) {
            return;
        }
        arg0.method403(field330);
        arg0.method368(0, 0, this.field335, this.field335);
        arg0.method394(0, 0, this.field335, this.field335, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field341) {
                var4 = -arg1.field331;
                var5 = -arg1.field340;
                var6 = -arg1.field339;
            } else {
                var4 = this.field331 - arg1.field331;
                var5 = this.field340 - arg1.field340;
                var6 = this.field339 - arg1.field339;
            }
        }
        if (this.field332 != 0) {
            int var7 = -this.field332 & 0x3FFF;
            int var8 = class605.field8859[var7];
            int var9 = class605.field8858[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field329 != 0) {
            int var11 = -this.field329 & 0x3FFF;
            int var12 = class605.field8859[var11];
            int var13 = class605.field8858[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method315(1.0F);
        arg0.method310(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class327 var15 = arg0.method326(var3, 2048, 0, 64, 768);
        int var16 = var15.method1402() - var15.method1349();
        int var17 = var15.method1352() - var15.method1379();
        int var18 = var15.method1349() + var16 / 2;
        int var19 = var15.method1379() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method309(var18, var19, var20, var20);
        arg0.method382(arg0.method337());
        class364 var21 = arg0.method342();
        var21.method2014(0, 0, arg0.method305() - var15.method1383());
        var15.method1365(var21, null, arg0.method305(), 1);
        this.field334 = arg0.method389(0, 0, this.field335, this.field335, true);
        this.field334.method1569(0, 0, 3);
        arg0.method368(field330[0], field330[1], field330[2], field330[3]);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(Loa;Lrk;)V", line = 96)
    private final void method170(class605 arg0, class29 arg1) {
        method173(arg0);
        method178(arg0);
        arg0.method403(field330);
        arg0.method368(0, 0, this.field335, this.field335);
        arg0.method349();
        arg0.method394(0, 0, this.field335, this.field335, this.field326 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field341) {
                var3 = -arg1.field331;
                var4 = -arg1.field340;
                var5 = -arg1.field339;
            } else {
                var3 = arg1.field331 - this.field331;
                var4 = arg1.field340 - this.field340;
                var5 = arg1.field339 - this.field339;
            }
        }
        if (this.field332 != 0) {
            int var6 = class605.field8859[this.field332];
            int var7 = class605.field8858[this.field332];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field329 != 0) {
            int var9 = class605.field8859[this.field329];
            int var10 = class605.field8858[this.field329];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class327 var12 = field342.method1382((byte) 0, 51200, true);
        if (arg0.method363()) {
            var12.method1399((short) 0, (short) this.field333);
        } else {
            var12.method1351((short) 127, class198.field2676.method438(46, this.field333).field8934);
            var12.method1399((short) 0, (short) -1);
        }
        arg0.method315(1.0F);
        arg0.method310(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field335 * 1024 / (var12.method1402() - var12.method1349());
        if (this.field326 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method309(this.field335 / 2, this.field335 / 2, var13, var13);
        arg0.method382(arg0.method337());
        class364 var14 = arg0.method337();
        var14.method2014(0, 0, arg0.method305() - var12.method1383());
        var12.method1365(var14, null, 1024, 1);
        int var15 = this.field335 * 13 / 16;
        int var16 = (this.field335 - var15) / 2;
        field325.method1582(var16, var16, var15, var15, 0, this.field326 | 0xFF000000, 1);
        this.field334 = arg0.method389(0, 0, this.field335, this.field335, true);
        arg0.method349();
        arg0.method394(0, 0, this.field335, this.field335, 0, 0);
        field327.method1582(0, 0, this.field335, this.field335, 1, 0, 0);
        this.field334.method1569(0, 0, 0);
        arg0.method368(field330[0], field330[1], field330[2], field330[3]);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIII)Z", line = 188)
    public final boolean method171(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field341) {
            this.field336 = 1073741823;
            var8 = this.field331;
            var9 = this.field340;
            var10 = this.field339;
        } else {
            int var5 = this.field331 - arg0;
            int var6 = this.field340 - arg1;
            int var7 = this.field339 - arg2;
            this.field336 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field336 == 0) {
                this.field336 = 1;
            }
            var8 = (var5 << 8) / this.field336;
            var9 = (var6 << 8) / this.field336;
            var10 = (var7 << 8) / this.field336;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field337 = this.field338 * arg3 / (this.field341 ? 1024 : this.field336);
        } else {
            this.field337 = 0;
        }
        if (this.field337 < 8) {
            this.field334 = null;
            return false;
        }
        int var12 = class367.method2354(-224121456, this.field337);
        if (var12 > arg3) {
            var12 = class309.method2052(true, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field335 != var12) {
            this.field335 = var12;
        }
        this.field332 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field329 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field334 = null;
        return true;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(Loa;Lrk;)Z", line = 244)
    public final boolean method172(class605 arg0, class29 arg1) {
        return this.field334 != null || this.method177(arg0, arg1);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Loa;)V", line = 247)
    private static final void method173(class605 arg0) {
        if (field342 != null) {
            return;
        }
        class557 var1 = new class557(580, 1104, 1);
        var1.method3232((short) 0, (short) 1024, (byte) 0, (byte) 0, (short) 1024, (byte) 0, (short) 1024, (byte) 3, (short) 0, (short) 32767);
        var1.method3214(0, 0, 1, 128);
        var1.method3214(0, 0, 1, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class605.field8859[var3];
            int var5 = class605.field8858[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class605.field8858[var12] >> 7;
                int var14 = class605.field8859[var12] * var4 >> 21;
                int var15 = class605.field8859[var12] * var5 >> 21;
                var1.method3214(var15, -var14, 1, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method3215((short) 127, 0, (byte) 0, var7, (byte) 0, (byte) 0, var8, (byte) 125, (short) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method3215((short) 127, var8, (byte) 0, var7, (byte) 0, (byte) 0, var10, (byte) 91, (short) 0);
                    var1.method3215((short) 127, var10, (byte) 0, var7, (byte) 0, (byte) 0, var11, (byte) 113, (short) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method3215((short) 127, var7, (byte) 0, 1, (byte) 0, (byte) 0, var8, (byte) 68, (short) 0);
            }
        }
        var1.field7942 = var1.field7899;
        var1.field7940 = null;
        var1.field7929 = null;
        var1.field7937 = null;
        field342 = arg0.method326(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()V", line = 332)
    public final void method174() {
        this.field334 = null;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "()V", line = 336)
    public static final void method175() {
        field342 = null;
        field327 = null;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "()V", line = 343)
    public static void method176() {
        field342 = null;
        field325 = null;
        field327 = null;
        field330 = null;
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(Loa;Lrk;)Z", line = 350)
    private final boolean method177(class605 arg0, class29 arg1) {
        if (this.field334 == null) {
            if (this.field328 == 0) {
                if (class198.field2676.method436(this.field333, -5686)) {
                    int[] var3 = class198.field2676.method433(111, false, this.field335, this.field333, this.field335, 0.7F);
                    this.field334 = arg0.method343(var3, 0, this.field335, this.field335, this.field335);
                }
            } else if (this.field328 == 2) {
                this.method169(arg0, arg1);
            } else if (this.field328 == 1) {
                this.method170(arg0, arg1);
            }
        }
        return this.field334 != null;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(Loa;)V", line = 385)
    private static final void method178(class605 arg0) {
        if (field327 != null) {
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
        field327 = arg0.method343(var2, 0, 128, 128, 128);
        field325 = arg0.method343(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Loa;IIIIII)V", line = 454)
    public final void method179(class605 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field334 == null) {
            return;
        }
        int var8 = this.field332 - arg5 & 0x3FFF;
        int var9 = this.field329 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field337) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field337) / 2;
        if (var10 < arg4 && this.field337 + var10 > 0 && var11 < arg3 && this.field337 + var11 > 0) {
            this.field334.method2700(arg1 + var11, arg2 + var10, this.field337, this.field337);
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 478)
    public class29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field331 = arg2;
        this.field340 = arg3;
        this.field339 = arg4;
        this.field341 = arg7;
        this.field333 = arg1;
        this.field326 = arg6;
        this.field338 = arg5;
        this.field328 = arg0;
    }
}
