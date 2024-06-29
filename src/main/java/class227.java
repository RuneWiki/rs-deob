import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class227 extends class279 {

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    private int field3662 = 0;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    private int field3659 = 0;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "I")
    private int field3667 = 0;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "[I")
    public static int[] field3650 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "[I")
    public static int[] field3664 = new int[128];

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "Ltl;")
    public static class59 field3657 = class85.method639("Gegenstand f-Ur Mitglieder", 9588);

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
    public static int field3666 = 0;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    private int field3651;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    private int field3654;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    private int field3655;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    private int field3658;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "I")
    private int field3668;

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "I")
    private int field3669;

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "Lbi;")
    public static class67 field3652;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIB)V", line = 13)
    private final void method1558(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 < 104) {
            this.field3659 = 117;
        }
        field3670++;
        int var5 = arg0 <= arg1 ? arg1 : arg0;
        int var6 = arg2 <= var5 ? var5 : arg2;
        int var7 = arg0 >= arg1 ? arg1 : arg0;
        int var8 = arg2 >= var7 ? var7 : arg2;
        this.field3669 = (var6 + var8) / 2;
        int var9 = var6 - var8;
        if (this.field3669 > 0 && this.field3669 < 4096) {
            this.field3668 = (var9 << 12) / (this.field3669 <= 2048 ? this.field3669 * 2 : 8192 - this.field3669 * 2);
        } else {
            this.field3668 = 0;
        }
        if (var9 <= 0) {
            this.field3658 = 0;
            return;
        }
        int var10 = (var6 - arg0 << 12) / var9;
        int var11 = (var6 - arg1 << 12) / var9;
        int var12 = (var6 - arg2 << 12) / var9;
        if (arg0 == var6) {
            this.field3658 = arg1 == var8 ? var12 + 20480 : -var11 + 4096;
        } else if (arg1 == var6) {
            this.field3658 = arg2 == var8 ? var10 + 4096 : 12288 - var12;
        } else {
            this.field3658 = arg0 == var8 ? var11 + 12288 : -var10 + 20480;
        }
        this.field3658 /= 6;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILs;)V", line = 77)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg1 == 0) {
            this.field3659 = arg2.method1210(-115);
        } else if (arg1 == 1) {
            this.field3662 = (arg2.method1205(-1) << 12) / 100;
        } else if (arg1 == 2) {
            this.field3667 = (arg2.method1205(-1) << 12) / 100;
        }
        if (arg0 > -125) {
            field3657 = (class59) null;
        }
        field3653++;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(III)Z", line = 122)
    public static final boolean method1559(int arg0, int arg1, int arg2) {
        int var3 = class1.field2[arg0][arg1][arg2];
        if (-class59.field932 == var3) {
            return false;
        } else if (class59.field932 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class123.method913(var4 + 1, class97.field1558[arg0][arg1][arg2], var5 + 1) && class123.method913(var4 + 128 - 1, class97.field1558[arg0][arg1 + 1][arg2], var5 + 1) && class123.method913(var4 + 128 - 1, class97.field1558[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class123.method913(var4 + 1, class97.field1558[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class1.field2[arg0][arg1][arg2] = class59.field932;
                return true;
            } else {
                class1.field2[arg0][arg1][arg2] = -class59.field932;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)V", line = 147)
    private final void method1560(int arg0, int arg1, int arg2, int arg3) {
        field3661++;
        int var5 = arg3 <= 2048 ? (arg0 + 4096) * arg3 >> 12 : arg0 + arg3 - (arg0 * arg3 >> 12);
        if (arg1 != -1432520020) {
            field3665 = 108;
        }
        if (var5 <= 0) {
            this.field3655 = this.field3654 = this.field3651 = arg3;
            return;
        }
        int var6 = arg2 * 6;
        int var7 = var6 >> 12;
        int var9 = var6 - (var7 << 12);
        int var10 = arg3 + arg3 - var5;
        int var11 = (var5 - var10 << 12) / var5;
        int var12 = var5 * var11 >> 12;
        int var13 = var9 * var12 >> 12;
        int var14 = var10 + var13;
        int var15 = var5 - var13;
        if (var7 == 0) {
            this.field3654 = var14;
            this.field3651 = var10;
            this.field3655 = var5;
        } else if (var7 == 1) {
            this.field3655 = var15;
            this.field3654 = var5;
            this.field3651 = var10;
        } else if (var7 == 2) {
            this.field3651 = var14;
            this.field3655 = var10;
            this.field3654 = var5;
        } else if (var7 == 3) {
            this.field3651 = var5;
            this.field3655 = var10;
            this.field3654 = var15;
        } else if (var7 == 4) {
            this.field3655 = var14;
            this.field3654 = var10;
            this.field3651 = var5;
        } else if (var7 == 5) {
            this.field3655 = var5;
            this.field3654 = var10;
            this.field3651 = var15;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLme;)Z", line = 253)
    public static final boolean method1561(byte arg0, class295 arg1) {
        field3656++;
        int var2 = -59 / ((arg0 + 41) / 34);
        return arg1.method2034(class284.field4890, (byte) 32);
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V", line = 267)
    public class227() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(Z)V", line = 271)
    public static final void method1562(boolean arg0) {
        field3649++;
        int var1 = (class226.field3640 >> 10) + (class197.field3249 >> 3);
        int var2 = (class216.field3528 >> 10) + (class187.field3135 >> 3);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 18;
        class101.field1636 = new int[var5][4];
        class155.field2539 = new int[var5];
        class78.field1240 = new byte[var5][];
        byte var6 = 8;
        class38.field576 = new int[var5];
        class260.field4348 = new int[var5];
        class264.field4567 = new int[var5];
        class123.field2035 = new byte[var5][];
        class190.field3185 = new byte[var5][];
        class161.field2618 = new int[var5];
        class288.field4953 = new byte[var5][];
        class230.field3784 = new byte[var5][];
        class11.field137 = new int[var5];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= ((var1 + 6) / 8); var8++) {
            for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                int var10 = (var8 << 8) + var9;
                class260.field4348[var7] = var10;
                class11.field137[var7] = class269.field4664.method2064(124, class233.method1630(new class59[] { class245.field4100, class81.method619((byte) -73, var8), class113.field1822, class81.method619((byte) -98, var9) }, -2883));
                class161.field2618[var7] = class269.field4664.method2064(123, class233.method1630(new class59[] { class231.field3802, class81.method619((byte) -91, var8), class113.field1822, class81.method619((byte) -101, var9) }, -2883));
                class155.field2539[var7] = class269.field4664.method2064(126, class233.method1630(new class59[] { class179.field2933, class81.method619((byte) -124, var8), class113.field1822, class81.method619((byte) -94, var9) }, -2883));
                class38.field576[var7] = class269.field4664.method2064(121, class233.method1630(new class59[] { class65.field997, class81.method619((byte) -87, var8), class113.field1822, class81.method619((byte) -111, var9) }, -2883));
                class264.field4567[var7] = class269.field4664.method2064(124, class233.method1630(new class59[] { class13.field170, class81.method619((byte) -105, var8), class113.field1822, class81.method619((byte) -82, var9) }, -2883));
                if (class155.field2539[var7] == -1) {
                    class11.field137[var7] = -1;
                    class161.field2618[var7] = -1;
                    class38.field576[var7] = -1;
                    class264.field4567[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class155.field2539.length; var11++) {
            class155.field2539[var11] = -1;
            class11.field137[var11] = -1;
            class161.field2618[var11] = -1;
            class38.field576[var11] = -1;
            class264.field4567[var11] = -1;
        }
        class303.method2107(arg0, var6, var4, (byte) 40, var2, var3, var1);
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V", line = 369)
    public static void method1563(int arg0) {
        if (arg0 != 128) {
            field3666 = -50;
        }
        field3650 = null;
        field3657 = null;
        field3664 = null;
        field3652 = null;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)[[I", line = 393)
    public final int[][] method87(int arg0, int arg1) {
        field3663++;
        int[][] var3 = this.field4786.method1427(0, arg1);
        if (this.field4786.field3297) {
            int[][] var4 = this.method1956(0, arg1, (byte) -112);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class56.field835; var11++) {
                this.method1558(var5[var11], var7[var11], var6[var11], (byte) 105);
                this.field3658 += this.field3659;
                this.field3669 += this.field3667;
                this.field3668 += this.field3662;
                if (this.field3669 < 0) {
                    this.field3669 = 0;
                }
                while (this.field3658 < 0) {
                    this.field3658 += 4096;
                }
                while (this.field3658 > 4096) {
                    this.field3658 -= 4096;
                }
                if (this.field3668 < 0) {
                    this.field3668 = 0;
                }
                if (this.field3669 > 4096) {
                    this.field3669 = 4096;
                }
                if (this.field3668 > 4096) {
                    this.field3668 = 4096;
                }
                this.method1560(this.field3668, -1432520020, this.field3658, this.field3669);
                var9[var11] = this.field3655;
                var8[var11] = this.field3654;
                var10[var11] = this.field3651;
            }
        }
        return arg0 == -7523 ? var3 : (int[][]) ((int[][]) null);
    }
}
