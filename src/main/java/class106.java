import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class106 extends class165 {

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "Z")
    public boolean field2020 = false;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    private int field2017 = 0;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    private int field2018 = 0;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    private int field2025 = -32768;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    private int field2016;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public int field2022;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    public int field2030;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public int field2015;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public int field2024;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public int field2014;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "Ltc;")
    private class18 field2027;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "[I")
    public static int[] field2013 = new int[2];

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "[Lgj;")
    public static class126[] field2029 = new class126[2048];

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    public static int field2031 = 0;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)V")
    public static final void method859(boolean arg0, int arg1) {
        if (class240.field4282 == null || class240.field4282.length < arg1) {
            class240.field4282 = new int[arg1];
        }
        if (arg0) {
            field2033 = 126;
        }
        field2028++;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "()I")
    public final int method21() {
        field2021++;
        return this.field2025;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
    public static void method860(boolean arg0) {
        field2013 = null;
        field2029 = null;
        if (!arg0) {
            field2013 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
    public final void method861(int arg0, int arg1) {
        if (arg1 < 8) {
            return;
        }
        field2019++;
        if (this.field2020) {
            return;
        }
        this.field2017 += arg0;
        while (this.field2027.field268[this.field2018] < this.field2017) {
            this.field2017 -= this.field2027.field268[this.field2018];
            this.field2018++;
            if (this.field2018 >= this.field2027.field265.length) {
                this.field2020 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2032++;
        class70 var11 = this.method862((byte) 122);
        if (var11 != null) {
            var11.method20(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2025 = var11.method21();
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)Lra;")
    private final class70 method862(byte arg0) {
        field2026++;
        if (arg0 <= 3) {
            return null;
        }
        class111 var2 = class67.method465(this.field2016, -111);
        class70 var3;
        if (this.field2020) {
            var3 = var2.method888(-26757, -1);
        } else {
            var3 = var2.method888(-26757, this.field2018);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)I")
    public static final int method863(int arg0, int arg1) {
        field2023++;
        double var2 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var4;
        double var10 = var4;
        if (var2 > var4) {
            var8 = var2;
        }
        if (var2 < var4) {
            var10 = var2;
        }
        if (var6 < var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        if (var6 > var8) {
            var8 = var6;
        }
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var4 == var8) {
                var12 = (var2 - var6) / (var8 - var10);
            } else if (var2 == var8) {
                var12 = (var6 - var4) / (var8 - var10) + 2.0D;
            } else if (var6 == var8) {
                var12 = (var4 - var2) / (var8 - var10) + 4.0D;
            }
            if (var16 < 0.5D) {
                var14 = (var8 - var10) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var8 - var10) / (2.0D - var8 - var10);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (arg0 != -193) {
            method859(false, -97);
        }
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var21 >> 5 << 7) + (var20 >> 2 << 10) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IIIIIII)V")
    public class106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2016 = arg0;
        this.field2022 = arg3;
        this.field2030 = arg6 + arg5;
        this.field2015 = arg2;
        this.field2024 = arg1;
        this.field2014 = arg4;
        int var8 = class67.method465(this.field2016, -83).field2093;
        if (var8 == -1) {
            this.field2020 = true;
        } else {
            this.field2020 = false;
            this.field2027 = class212.method1511(var8, -1);
        }
    }
}
