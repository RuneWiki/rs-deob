import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class161 extends class3 {

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    private int field2566 = 32768;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2570 = "scroll:";

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
    public static int field2569 = 0;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "Ljava/lang/String;")
    public static String field2573 = "Loaded world list data";

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)[I", line = 7)
    public final int[] method25(byte arg0, int arg1) {
        field2568++;
        if (arg0 < 57) {
            method1138(-30, 2);
        }
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            int[] var4 = this.method24(arg1, 1, 1);
            int[] var5 = this.method24(arg1, 1, 2);
            for (int var6 = 0; var6 < class326.field5342; var6++) {
                int var7 = var5[var6] * this.field2566 >> 12;
                int var8 = (var4[var6] & 0xFFE) >> 4;
                int var9 = class248.field3943[var8] * var7 >> 12;
                int var10 = class18.field225[var8] * var7 >> 12;
                int var11 = (var10 >> 12) + var6 & class5.field70;
                int var12 = arg1 + (var9 >> 12) & class129.field1970;
                int[] var13 = this.method24(var12, 1, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V", line = 59)
    public class161() {
        super(3, false);
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)V", line = 64)
    public final void method20(byte arg0) {
        class291.method2061(0);
        int var2 = 107 / ((-arg0 - 20) / 58);
        field2567++;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)Laf;", line = 79)
    public static final class201 method1138(int arg0, int arg1) {
        if (arg1 != 2) {
            field2570 = (String) null;
        }
        field2574++;
        return class25.field379 && arg0 >= class198.field3043 && arg0 <= class270.field4451 ? class266.field4377[arg0 - class198.field3043] : null;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(III)Lel;", line = 98)
    public static final class258 method1139(int arg0, int arg1, int arg2) {
        class50 var3 = class264.field4230[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field735; var4++) {
            class258 var5 = var3.field752[var4];
            if ((var5.field4076 >> 29 & 0x3L) == 2L && var5.field4082 == arg1 && var5.field4081 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)[[I", line = 124)
    public final int[][] method22(int arg0, int arg1) {
        field2571++;
        int[][] var3 = this.field20.method2435(arg1, false);
        if (arg0 != -21194) {
            field2573 = (String) null;
        }
        if (this.field20.field5556) {
            int[] var4 = this.method24(arg1, 1, 1);
            int[] var5 = this.method24(arg1, 1, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            for (int var9 = 0; var9 < class326.field5342; var9++) {
                int var10 = (var4[var9] * 255 & 0xFF0D3) >> 12;
                int var11 = var5[var9] * this.field2566 >> 12;
                int var12 = class18.field225[var10] * var11 >> 12;
                int var13 = class248.field3943[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class5.field70;
                int var15 = (var13 >> 12) + arg1 & class129.field1970;
                int[][] var16 = this.method16(var15, 0, (byte) -28);
                var6[var9] = var16[0][var14];
                var8[var9] = var16[1][var14];
                var7[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V", line = 181)
    public static final void method1140(int arg0) {
        class223.field3439 = 0;
        field2576++;
        class203.field3112 = 0;
        class183.field2854 = arg0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lfh;IZ)V", line = 191)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        field2572++;
        if (arg2) {
            this.method14((class313) null, 84, true);
        }
        if (arg1 == 0) {
            this.field2566 = arg0.method2250(-1613178296) << 4;
        } else if (arg1 == 1) {
            this.field34 = arg0.method2224(-123) == 1;
        }
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(B)V", line = 227)
    public static void method1141(byte arg0) {
        field2570 = null;
        field2573 = null;
        if (arg0 < 56) {
            field2573 = (String) null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(B)V", line = 238)
    public static final void method1142(byte arg0) {
        field2575++;
        if (arg0 == 47) {
            class261.field4115.method651(arg0 ^ 0x2F);
            class346.field5540.method651(0);
        }
    }
}
