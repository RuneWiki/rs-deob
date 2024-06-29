import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class74 extends class273 {

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    private int field1103 = 4096;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    private int field1104 = 0;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public static int field1100 = 0;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "Lkn;")
    public static class52 field1099 = new class52(128);

    @OriginalMember(owner = "client!f", name = "S", descriptor = "[J")
    public static long[] field1105 = new long[1000];

    @OriginalMember(owner = "client!f", name = "W", descriptor = "I")
    public static int field1109 = 0;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "Ln;")
    public static class178 field1108;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "Lui;")
    public static class28 field1102;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "Z")
    public static boolean field1096;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IJ)V", line = 4)
    public static final void method521(int arg0, long arg1) {
        field1107++;
        class265.field4095.field4679 = 0;
        class265.field4095.method2034(-68, 21);
        class265.field4095.method2023(arg1, 104);
        class286.field4385 = 0;
        if (arg0 >= -12) {
            field1105 = (long[]) null;
        }
        class19.field265 = 1;
        class285.field4375 = -3;
        class109.field1693 = 0;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V", line = 20)
    public class74() {
        super(1, false);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)[[I", line = 36)
    public final int[][] method170(int arg0, byte arg1) {
        field1101++;
        if (arg1 != 68) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field4200.method539(152, arg0);
        if (this.field4200.field1147) {
            int[][] var4 = this.method1795(arg0, -128, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class27.field346; var11++) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 < this.field1104) {
                    var8[var11] = this.field1104;
                } else if (var12 > this.field1103) {
                    var8[var11] = this.field1103;
                } else {
                    var8[var11] = var12;
                }
                if (var13 < this.field1104) {
                    var10[var11] = this.field1104;
                } else if (this.field1103 < var13) {
                    var10[var11] = this.field1103;
                } else {
                    var10[var11] = var13;
                }
                if (var14 < this.field1104) {
                    var9[var11] = this.field1104;
                } else if (var14 > this.field1103) {
                    var9[var11] = this.field1103;
                } else {
                    var9[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V", line = 113)
    public static void method522(byte arg0) {
        field1108 = null;
        field1099 = null;
        if (arg0 != 56) {
            field1108 = (class178) null;
        }
        field1105 = null;
        field1102 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BILgn;)V", line = 128)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        field1097++;
        if (arg0 < 27) {
            field1099 = (class52) null;
        }
        if (arg1 == 0) {
            this.field1104 = arg2.method1994(false);
        } else if (arg1 == 1) {
            this.field1103 = arg2.method1994(false);
        } else if (arg1 == 2) {
            this.field4194 = arg2.method2043((byte) -105) == 1;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[I", line = 178)
    public final int[] method331(int arg0, int arg1) {
        if (arg1 != -14650) {
            return (int[]) null;
        }
        int[] var3 = this.field4204.method365(arg0, 0);
        if (this.field4204.field792) {
            int[] var4 = this.method1790(0, arg0, 0);
            for (int var5 = 0; var5 < class27.field346; var5++) {
                int var6 = var4[var5];
                if (var6 < this.field1104) {
                    var3[var5] = this.field1104;
                } else if (this.field1103 >= var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field1103;
                }
            }
        }
        field1098++;
        return var3;
    }
}
