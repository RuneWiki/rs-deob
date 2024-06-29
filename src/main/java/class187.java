import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class187 extends class115 {

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    public static int field2663 = 0;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "Ljl;")
    public static class231 field2659 = new class231(128);

    @OriginalMember(owner = "client!i", name = "T", descriptor = "J")
    public static volatile long field2666 = 0L;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "[I")
    public static int[] field2665 = new int[500];

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "Lac;")
    public static class141 field2661;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "[I")
    public static int[] field2658;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "[I")
    public static int[] field2664;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V")
    public static final void method1207(int arg0) {
        ++field2662;
        int var1 = class247.field3706 + class55.field847.field94;
        int var2 = class170.field2448 + class55.field847.field45;
        if (-var2 + class104.field1544 < -500 || ~(class104.field1544 - var2) < -501 || -var1 + class25.field332 < -500 || -var1 + class25.field332 > 500) {
            class104.field1544 = var2;
            class25.field332 = var1;
        }
        if (~class25.field332 != ~var1) {
            class25.field332 += (-class25.field332 + var1) / 16;
        }
        if (arg0 != 31253) {
            field2664 = null;
        }
        if (~class104.field1544 != ~var2) {
            class104.field1544 += (-class104.field1544 + var2) / 16;
        }
        if (!class107.field1555) {
            if (class19.field267[98]) {
                class43.field618 += (12 - class43.field618) / 2;
            } else if (class19.field267[99]) {
                class43.field618 += (-12 - class43.field618) / 2;
            } else {
                class43.field618 /= 2;
            }
            if (class19.field267[96]) {
                class212.field3043 += (-class212.field3043 + -24) / 2;
            } else if (!class19.field267[97]) {
                class212.field3043 /= 2;
            } else {
                class212.field3043 += (-class212.field3043 + 24) / 2;
            }
            class245.field3667 += class212.field3043 / 2;
            class103.field1535 += class43.field618 / 2;
        } else {
            for (int var3 = 0; ~class277.field4444 < ~var3; ++var3) {
                int var4 = class185.field2637[var3];
                if (var4 != 98) {
                    if (var4 != 99) {
                        if (var4 != 96) {
                            if (~var4 == -98) {
                                class245.field3667 = class245.field3667 + 191 & -128;
                            }
                        } else {
                            class245.field3667 = -128 & class245.field3667 + -65;
                        }
                    } else {
                        class103.field1535 = -16 & class103.field1535 + -17;
                    }
                } else {
                    class103.field1535 = class103.field1535 + 47 & -16;
                }
            }
        }
        class100.method671(-116);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (~arg2 == arg0) {
            super.field1713 = arg1.method760(false) == 1;
        }
        ++field2660;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(II)[[I")
    public final int[][] method235(int arg0, int arg1) {
        ++field2656;
        if (arg0 >= -33) {
            this.method235(-43, -8);
        }
        int[][] var3 = super.field1716.method6(arg1, (byte) 76);
        if (super.field1716.field23) {
            int[] var4 = this.method797(2, arg1, 123);
            int[][] var5 = this.method798(0, 0, arg1);
            int[][] var6 = this.method798(0, 1, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var6[0];
            int[] var10 = var5[0];
            int[] var11 = var5[2];
            int[] var12 = var5[1];
            int[] var13 = var6[1];
            int[] var14 = var3[2];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class77.field1178 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var12[var16];
                    var14[var16] = var11[var16];
                } else if (var17 == 0) {
                    var7[var16] = var9[var16];
                    var8[var16] = var13[var16];
                    var14[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var9[var16] * var18 + var10[var16] * var17 >> 12;
                    var8[var16] = var12[var16] * var17 + var13[var16] * var18 >> 12;
                    var14[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class187() {
        super(3, false);
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field2657;
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            int[] var4 = this.method797(0, arg1, -24);
            int[] var5 = this.method797(1, arg1, arg0 ^ 242153060);
            int[] var6 = this.method797(2, arg1, -92);
            for (int var7 = 0; ~var7 > ~class77.field1178; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return arg0 != 242152972 ? null : var3;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(B)V")
    public static void method1208(byte arg0) {
        field2661 = null;
        if (arg0 >= -61) {
            field2659 = null;
        }
        field2659 = null;
        field2665 = null;
        field2658 = null;
        field2664 = null;
    }
}
