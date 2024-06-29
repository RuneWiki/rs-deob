import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class21 extends class183 {

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "I")
    private int field356 = 32768;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
    public static int field351 = 0;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "[[B")
    public static byte[][] field357;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)Z", line = 7)
    public static final boolean method202(int arg0) {
        field354++;
        try {
            if (arg0 != 0) {
                return true;
            }
            if (class318.field5373 == 2) {
                if (class47.field861 == null) {
                    class47.field861 = class247.method1785(class240.field4230, class186.field3267, class132.field2321);
                    if (class47.field861 == null) {
                        return false;
                    }
                }
                if (class161.field2728 == null) {
                    class161.field2728 = new class217(class264.field4560, class107.field1880);
                }
                if (class184.field3186.method2204(22050, class161.field2728, class47.field861, (byte) 50, class224.field3835)) {
                    class184.field3186.method2236(-129);
                    class184.field3186.method2202(class211.field3634, 31530);
                    class184.field3186.method2228(class184.field3191, false, class47.field861);
                    class318.field5373 = 0;
                    class47.field861 = null;
                    class240.field4230 = null;
                    class161.field2728 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class184.field3186.method2223((byte) -57);
            class318.field5373 = 0;
            class47.field861 = null;
            class161.field2728 = null;
            class240.field4230 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILkh;I)V", line = 63)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg0 >= -43) {
            this.field356 = 7;
        }
        if (arg2 == 0) {
            this.field356 = arg1.method116(-1) << 4;
        } else if (arg2 == 1) {
            this.field3166 = arg1.method93(false) == 1;
        }
        field355++;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V", line = 98)
    public class21() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)V", line = 111)
    public static final void method203(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class302.field5142[var1] = false;
        }
        if (arg0 != 7) {
            method202(84);
        }
        field353++;
        class329.field5601 = -1;
        class30.field521 = -1;
        class74.field1405 = 1;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V", line = 131)
    public final void method25(int arg0) {
        field352++;
        if (arg0 != -8) {
            method203((byte) 98);
        }
        class298.method2055((byte) 103);
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V", line = 142)
    public static void method204(int arg0) {
        field357 = (byte[][]) null;
        if (arg0 != -23129) {
            method203((byte) 3);
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)[I", line = 160)
    public final int[] method10(int arg0, int arg1) {
        int[] var3 = this.field3161.method664(arg0, arg1 ^ arg1);
        if (this.field3161.field1736) {
            int[] var4 = this.method1253(1, arg0, arg1 ^ 0xFFFFFF99);
            int[] var5 = this.method1253(2, arg0, 125);
            for (int var6 = 0; var6 < class22.field393; var6++) {
                int var7 = (var4[var6] & 0xFF5) >> 4;
                int var8 = var5[var6] * this.field356 >> 12;
                int var9 = class168.field2877[var7] * var8 >> 12;
                int var10 = class281.field4824[var7] * var8 >> 12;
                int var11 = (var10 >> 12) + var6 & class52.field913;
                int var12 = class252.field4405 & (var9 >> 12) + arg0;
                int[] var13 = this.method1253(0, var12, 85);
                var3[var6] = var13[var11];
            }
        }
        field358++;
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)[[I", line = 207)
    public final int[][] method12(int arg0, int arg1) {
        int var3 = -34 / ((18 - arg0) / 61);
        field359++;
        int[][] var4 = this.field3160.method1057(-20449, arg1);
        if (this.field3160.field2689) {
            int[] var5 = this.method1253(1, arg1, 106);
            int[] var6 = this.method1253(2, arg1, 76);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            for (int var10 = 0; var10 < class22.field393; var10++) {
                int var11 = (var5[var10] * 255 & 0xFFBE1) >> 12;
                int var12 = var6[var10] * this.field356 >> 12;
                int var13 = class281.field4824[var11] * var12 >> 12;
                int var14 = class168.field2877[var11] * var12 >> 12;
                int var15 = (var13 >> 12) + var10 & class52.field913;
                int var16 = (var14 >> 12) + arg1 & class252.field4405;
                int[][] var17 = this.method1250(var16, 0, (byte) 52);
                var7[var10] = var17[0][var15];
                var8[var10] = var17[1][var15];
                var9[var10] = var17[2][var15];
            }
        }
        return var4;
    }
}
