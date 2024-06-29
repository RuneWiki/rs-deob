import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class3 extends class165 {

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Lrh;")
    private class242 field49 = null;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    private int field57 = -1;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    private int field69 = -1;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    private int field63 = -32768;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    private int field64;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    private int field53;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    private int field54;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    private int field70;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    private int field65;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    private int field68;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "Ltc;")
    private class18 field60;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    private int field51;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    private int field67;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "Lhh;")
    public static class163 field62 = class137.method1065("Hidden)2use", 17);

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "[I")
    public static int[] field66 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "[I")
    public static int[] field71;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "()I")
    public final int method21() {
        field58++;
        return this.field63;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class165 var11 = this.method31(22601);
        field52++;
        if (var11 != null) {
            var11.method20(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field63 = var11.method21();
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)I")
    public static int method27(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V")
    public final void method28(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field59++;
        if (arg3 != 0) {
            this.field69 = 100;
        }
        this.method32((arg0 + (arg2 - arg0 >> 1)) * 128 + 64, (arg4 - -(-arg4 + arg1 >> 1)) * 128 + 64, arg3 ^ 0x59);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILpa;)V")
    public static final void method29(int arg0, class123 arg1) {
        class49.field833 = arg1;
        class28.field427 = class49.field833.method971(16, 0);
        if (arg0 >= 58) {
            field56++;
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
    public static void method30(int arg0) {
        field66 = null;
        field62 = null;
        field71 = null;
        if (arg0 != -1277866879) {
            field62 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)Lta;")
    private final class165 method31(int arg0) {
        field55++;
        return arg0 == 22601 ? this.method33(127, false) : null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)V")
    private final void method32(int arg0, int arg1, int arg2) {
        field61++;
        int var4 = 89 / ((-arg2 - 29) / 49);
        if (this.field60 == null) {
            return;
        }
        int var5 = class227.field4092 - this.field67;
        if (var5 > 100 && this.field60.field271 > 0) {
            int var6 = this.field60.field265.length - this.field60.field271;
            while (this.field51 < var6 && this.field60.field268[this.field51] < var5) {
                var5 -= this.field60.field268[this.field51];
                this.field51++;
            }
            if (var6 <= this.field51) {
                int var7 = 0;
                for (int var8 = var6; var8 < this.field60.field265.length; var8++) {
                    var7 += this.field60.field268[var8];
                }
                var5 %= var7;
            }
        }
        while (var5 > this.field60.field268[this.field51]) {
            class222.method1571(this.field51, arg0, arg1, (byte) 107, false, this.field60);
            var5 -= this.field60.field268[this.field51];
            this.field51++;
            if (this.field60.field265.length <= this.field51) {
                this.field51 -= this.field60.field271;
                if (this.field51 < 0 || this.field51 >= this.field60.field265.length) {
                    this.field60 = null;
                    break;
                }
            }
        }
        this.field67 = class227.field4092 - var5;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)Lta;")
    private final class165 method33(int arg0, boolean arg1) {
        field50++;
        int var3 = 36 % ((77 - arg0) / 42);
        boolean var4 = class228.field4107 != class161.field2958;
        class35 var5 = class9.method64(false, this.field68);
        if (var5.field577 != null) {
            var5 = var5.method252(-33);
        }
        if (var5 == null) {
            return null;
        }
        int var6 = this.field64 & 0x3;
        int var7;
        int var8;
        if (var6 == 1 || var6 == 3) {
            var8 = var5.field591;
            var7 = var5.field574;
        } else {
            var7 = var5.field591;
            var8 = var5.field574;
        }
        int var9 = this.field70 + (var8 >> 1);
        int var10 = this.field53 + (var7 >> 1);
        int var11 = (var8 + 1 >> 1) + this.field70;
        int var12 = this.field53 + (var7 + 1 >> 1);
        this.method32(var10 * 128, var9 * 128, 61);
        boolean var13 = !var4 && var5.field539 && (this.field57 != var5.field538 || this.field69 != this.field51 && class22.field353 >= 2);
        if (arg1 && !var13) {
            return null;
        }
        int[][] var14 = class228.field4107[this.field65];
        int var15 = (this.field70 << 7) + (var8 << 6);
        int var16 = (this.field53 << 7) + (var7 << 6);
        int[][] var17 = null;
        boolean var18 = this.field49 == null;
        int var19 = var14[var9][var12] + var14[var11][var12] + var14[var11][var10] + var14[var9][var10] >> 2;
        if (var4) {
            var17 = class161.field2958[0];
        } else if (this.field65 < 3) {
            var17 = class228.field4107[this.field65 + 1];
        }
        class208 var20;
        if (this.field60 == null) {
            var20 = var5.method258(var16, false, var14, var18 ? class43.field731 : this.field49, var15, var19, var17, var13, 44, this.field54, this.field64);
        } else {
            var20 = var5.method245(var15, this.field54, var14, var16, this.field51, var19, this.field64, this.field60, (byte) -127, var17, var18 ? class43.field731 : this.field49, var13);
        }
        return var20 == null ? null : var20.field3777;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIIIIZLta;)V")
    public class3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class165 arg8) {
        this.field64 = arg2;
        this.field53 = arg5;
        this.field54 = arg1;
        this.field70 = arg4;
        this.field65 = arg3;
        this.field68 = arg0;
        if (arg6 != -1) {
            this.field60 = class212.method1511(arg6, -1);
            this.field51 = 0;
            this.field67 = class227.field4092 - 1;
            if (this.field60.field277 == 0 && arg8 != null && arg8 instanceof class3) {
                class3 var10 = (class3) arg8;
                if (this.field60 == var10.field60) {
                    this.field51 = var10.field51;
                    this.field67 = var10.field67;
                    return;
                }
            }
            if (arg7 && this.field60.field271 != -1) {
                this.field51 = (int) (Math.random() * (double) this.field60.field265.length);
                this.field67 -= (int) ((double) this.field60.field268[this.field51] * Math.random());
                return;
            }
        }
    }
}
