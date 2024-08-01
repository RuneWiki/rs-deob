import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ae")
public class class6 extends class85 {

    @OriginalMember(owner = "ae", name = "Q", descriptor = "I")
    private int field84 = 4096;

    @OriginalMember(owner = "ae", name = "R", descriptor = "I")
    private int field85 = 409;

    @OriginalMember(owner = "ae", name = "cb", descriptor = "I")
    private int field96 = 4096;

    @OriginalMember(owner = "ae", name = "W", descriptor = "[I")
    private int[] field90 = new int[3];

    @OriginalMember(owner = "ae", name = "bb", descriptor = "I")
    private int field95 = 4096;

    @OriginalMember(owner = "ae", name = "V", descriptor = "Z")
    public static boolean field89 = false;

    @OriginalMember(owner = "ae", name = "Y", descriptor = "Llf;")
    public static class109 field92 = class35.method275("Sichtbare Karte vorbereitet)3", 2);

    @OriginalMember(owner = "ae", name = "Z", descriptor = "Llf;")
    public static class109 field93 = class35.method275("Mem:", 2);

    @OriginalMember(owner = "ae", name = "S", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "ae", name = "T", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "ae", name = "X", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "ae", name = "ab", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "ae", name = "db", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "ae", name = "U", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field88;

    @OriginalMember(owner = "ae", name = "e", descriptor = "(I)V")
    public static final void method26(int arg0) {
        ++field91;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; ~(class149.field2882 + -1) < ~var2; ++var2) {
                if (class31.field726[var2] < 1000 && class31.field726[var2 + 1] > 1000) {
                    var1 = false;
                    class109 var3 = class183.field3438[var2];
                    class183.field3438[var2] = class183.field3438[var2 + 1];
                    class183.field3438[var2 - -1] = var3;
                    class109 var4 = class115.field2282[var2];
                    class115.field2282[var2] = class115.field2282[var2 + 1];
                    class115.field2282[var2 + 1] = var4;
                    int var5 = class146.field2823[var2];
                    class146.field2823[var2] = class146.field2823[var2 + 1];
                    class146.field2823[var2 + 1] = var5;
                    int var6 = class201.field3966[var2];
                    class201.field3966[var2] = class201.field3966[var2 + 1];
                    class201.field3966[var2 + 1] = var6;
                    short var7 = class31.field726[var2];
                    class31.field726[var2] = class31.field726[var2 + 1];
                    class31.field726[var2 + 1] = var7;
                    long var8 = class72.field1392[var2];
                    class72.field1392[var2] = class72.field1392[var2 + 1];
                    class72.field1392[var2 - -1] = var8;
                }
            }
        }
        if (arg0 != 22491) {
            field88 = null;
        }
    }

    @OriginalMember(owner = "ae", name = "a", descriptor = "(IB)Z")
    public static final boolean method27(int arg0, byte arg1) {
        if (arg1 < 3) {
            return true;
        } else {
            ++field87;
            return (-arg0 & arg0) == arg0;
        }
    }

    @OriginalMember(owner = "ae", name = "a", descriptor = "(B[B)V")
    public static final void method28(byte arg0, byte[] arg1) {
        ++field97;
        class86 var2 = new class86(arg1);
        var2.field1773 = arg1.length + -2;
        class131.field2540 = var2.method569(true);
        class202.field3976 = new int[class131.field2540];
        class69.field1345 = new int[class131.field2540];
        class10.field166 = new byte[class131.field2540][];
        class160.field2992 = new int[class131.field2540];
        class21.field481 = new int[class131.field2540];
        var2.field1773 = arg1.length + -7 + -(class131.field2540 * 8);
        class116.field2298 = var2.method569(true);
        class168.field3114 = var2.method569(true);
        int var3 = 1 + (255 & var2.method598((byte) 120));
        for (int var4 = 0; ~class131.field2540 < ~var4; ++var4) {
            class160.field2992[var4] = var2.method569(true);
        }
        int var5 = 0;
        if (arg0 != -55) {
            field92 = null;
        }
        while (~class131.field2540 < ~var5) {
            class202.field3976[var5] = var2.method569(true);
            ++var5;
        }
        for (int var6 = 0; ~class131.field2540 < ~var6; ++var6) {
            class21.field481[var6] = var2.method569(true);
        }
        for (int var7 = 0; ~class131.field2540 < ~var7; ++var7) {
            class69.field1345[var7] = var2.method569(true);
        }
        var2.field1773 = arg1.length + -7 + -((var3 - 1) * 3) + -(class131.field2540 * 8);
        class51.field1036 = new int[var3];
        for (int var8 = 1; ~var3 < ~var8; ++var8) {
            class51.field1036[var8] = var2.method578((byte) 59);
            if (class51.field1036[var8] == 0) {
                class51.field1036[var8] = 1;
            }
        }
        var2.field1773 = 0;
        for (int var9 = 0; ~class131.field2540 < ~var9; ++var9) {
            int var10 = class69.field1345[var9];
            int var11 = class21.field481[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class10.field166[var9] = var13;
            int var14 = var2.method598((byte) 122);
            if (~var14 == -1) {
                for (int var15 = 0; var15 < var12; ++var15) {
                    var13[var15] = var2.method584(3);
                }
            } else if (~var14 == -2) {
                for (int var16 = 0; var16 < var11; ++var16) {
                    for (int var17 = 0; ~var17 > ~var10; ++var17) {
                        var13[var16 - -(var11 * var17)] = var2.method584(class24.method217(arg0, -54));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ae", name = "b", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field86;
        if (arg1 != 2177) {
            method28((byte) -107, (byte[]) null);
        }
        int[][] var3 = super.field1719.method673((byte) -127, arg0);
        if (super.field1719.field1926) {
            int[][] var4 = this.method544(false, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; class57.field1152 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field90[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field85 < var13) {
                    var8[var11] = var12;
                    var10[var11] = var6[var11];
                    var9[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field90[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field85) {
                        var8[var11] = var12;
                        var10[var11] = var14;
                        var9[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field90[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field85 < var17) {
                            var8[var11] = var12;
                            var10[var11] = var14;
                            var9[var11] = var16;
                        } else {
                            var8[var11] = this.field95 * var12 >> 12;
                            var10[var11] = this.field96 * var14 >> 12;
                            var9[var11] = this.field84 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "ae", name = "d", descriptor = "(B)V")
    public static void method30(byte arg0) {
        field88 = null;
        field93 = null;
        field92 = null;
        int var1 = -81 % ((arg0 - -46) / 57);
    }

    @OriginalMember(owner = "ae", name = "<init>", descriptor = "()V")
    public class6() {
        super(1, false);
    }

    @OriginalMember(owner = "ae", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            int var5 = arg2.method578((byte) 59);
                            this.field90[0] = class170.method1140(var5, 16711680) << 4;
                            this.field90[1] = class170.method1140(4080, var5 >> 4);
                            this.field90[2] = class170.method1140(var5 >> 12, 0);
                        }
                    } else {
                        this.field95 = arg2.method569(true);
                    }
                } else {
                    this.field96 = arg2.method569(true);
                }
            } else {
                this.field84 = arg2.method569(true);
            }
        } else {
            this.field85 = arg2.method569(true);
        }
        ++field94;
        if (arg0 > -120) {
            method27(50, (byte) -124);
        }
    }
}
