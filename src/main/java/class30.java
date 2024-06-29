import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class30 extends class177 {

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    private int field475 = -32768;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
    private int field496 = 0;

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "I")
    private int field502 = 0;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "Z")
    private boolean field468 = false;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    private int field465;

    @OriginalMember(owner = "client!ih", name = "ab", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "I")
    public int field491;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
    private int field474;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
    public int field484;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "Ln;")
    private class271 field499;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public static int field473 = 100;

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "Lve;")
    public static class255 field489 = class87.method607(43, ")4");

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "Lve;")
    private static class255 field471 = class87.method607(94, "Allocated memory");

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "Ltl;")
    public static class197 field493 = null;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "I")
    public static int field494 = 0;

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "Lve;")
    public static class255 field501 = field471;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "D")
    private double field467;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "D")
    private double field472;

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "D")
    private double field483;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "D")
    private double field485;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "D")
    public double field487;

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "D")
    public double field488;

    @OriginalMember(owner = "client!ih", name = "bb", descriptor = "D")
    public double field504;

    @OriginalMember(owner = "client!ih", name = "cb", descriptor = "D")
    private double field505;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "Lfj;")
    public static class228 field479;

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "[S")
    public static short[] field492;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)V", line = 12)
    public final void method167(int arg0, int arg1) {
        this.field504 += this.field467 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field472;
        this.field468 = true;
        this.field487 += (double) arg1 * this.field483;
        this.field472 += (double) arg1 * this.field467;
        field478++;
        this.field488 += (double) arg1 * this.field485;
        if (arg0 != -18521) {
            this.method175(-56);
        }
        this.field480 = (int) (Math.atan2(this.field483, this.field485) * 325.949D) + 1024 & 0x7FF;
        this.field486 = (int) (Math.atan2(this.field472, this.field505) * 325.949D) & 0x7FF;
        if (this.field499 == null) {
            return;
        }
        this.field496 += arg1;
        while (true) {
            do {
                do {
                    if (this.field496 <= this.field499.field4680[this.field502]) {
                        return;
                    }
                    this.field496 -= this.field499.field4680[this.field502];
                    this.field502++;
                } while (this.field499.field4667.length > this.field502);
                this.field502 -= this.field499.field4648;
            } while (this.field502 >= 0 && this.field502 < this.field499.field4667.length);
            this.field502 = 0;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIIIIJ)V", line = 52)
    public final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field462++;
        class227 var11 = this.method175(-1);
        if (var11 != null) {
            var11.method168(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field475 = var11.method176();
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIIII)V", line = 67)
    public final void method169(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field498++;
        if (arg4 != -32768) {
            return;
        }
        if (!this.field468) {
            double var6 = (double) (arg0 - this.field497);
            double var8 = (double) (arg3 - this.field503);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field488 = (double) this.field474 * var6 / var10 + (double) this.field497;
            this.field487 = (double) this.field474 * var8 / var10 + (double) this.field503;
            this.field504 = (double) this.field465;
        }
        double var12 = (double) (this.field477 + 1 - arg1);
        this.field485 = ((double) arg0 - this.field488) / var12;
        this.field483 = ((double) arg3 - this.field487) / var12;
        this.field505 = Math.sqrt(this.field485 * this.field485 + this.field483 * this.field483);
        if (!this.field468) {
            this.field472 = -this.field505 * Math.tan((double) this.field476 * 0.02454369D);
        }
        this.field467 = ((double) arg2 - this.field504 - (this.field472 * var12)) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[IIII)V", line = 145)
    public static final void method170(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        arg2--;
        field481++;
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (arg2 < var5) {
            int var7 = arg2 + 1;
            arg1[var7] = arg3;
            int var8 = var7 + 1;
            arg1[var8] = arg3;
            int var9 = var8 + 1;
            arg1[var9] = arg3;
            int var10 = var9 + 1;
            arg1[var10] = arg3;
            int var11 = var10 + 1;
            arg1[var11] = arg3;
            int var12 = var11 + 1;
            arg1[var12] = arg3;
            int var13 = var12 + 1;
            arg1[var13] = arg3;
            arg2 = var13 + 1;
            arg1[arg2] = arg3;
        }
        if (arg4 != -30310) {
            method172(35);
        }
        while (arg2 < var6) {
            arg2++;
            arg1[arg2] = arg3;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(III)V", line = 182)
    public static final void method171(int arg0, int arg1, int arg2) {
        class53 var3 = class303.method2112(-1155040160, arg0, 1);
        if (arg2 != 2047) {
            field494 = 20;
        }
        var3.method325((byte) -126);
        field463++;
        var3.field824 = arg1;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)Z", line = 195)
    public static final boolean method172(int arg0) {
        field469++;
        if (arg0 != -27667) {
            field492 = (short[]) null;
        }
        if (class55.field864) {
            try {
                return !(Boolean) class127.field2094.method1773(class221.field3728.field626, arg0 ^ 0xFFFF93ED);
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 316)
    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field465 = arg4;
        this.field503 = arg2;
        this.field466 = arg5;
        this.field497 = arg3;
        this.field491 = arg1;
        this.field468 = false;
        this.field470 = arg9;
        this.field474 = arg8;
        this.field476 = arg7;
        this.field477 = arg6;
        this.field484 = arg10;
        this.field495 = arg0;
        int var12 = class232.method1611(this.field495, (byte) -115).field1420;
        if (var12 == -1) {
            this.field499 = null;
        } else {
            this.field499 = class181.method1269(113, var12);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V", line = 223)
    public static void method173(boolean arg0) {
        field492 = null;
        field493 = null;
        field471 = null;
        field501 = null;
        field479 = null;
        field489 = null;
        if (arg0) {
            field479 = (class228) null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(III)I", line = 255)
    public static final int method174(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            return 118;
        }
        class262 var3 = (class262) class68.field1008.method280((long) arg2, 29153);
        field482++;
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var3.field4440.length) {
            return var3.field4440[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)Lof;", line = 283)
    private final class227 method175(int arg0) {
        if (arg0 != -1) {
            this.method176();
        }
        field464++;
        class87 var2 = class232.method1611(this.field495, (byte) -114);
        class227 var3 = var2.method609(this.field502, arg0 ^ 0x71);
        if (var3 == null) {
            return null;
        } else {
            var3.method1334(this.field486);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "()I", line = 306)
    public final int method176() {
        field500++;
        return this.field475;
    }
}
