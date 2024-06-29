import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class106 extends class317 {

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "I")
    private int field1433 = 32768;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
    public static int field1431 = 0;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "I")
    public static volatile int field1427 = 0;

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "Lqc;")
    public static class99 field1430 = new class99(50);

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!sk", name = "R", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!sk", name = "U", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!sk", name = "W", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!sk", name = "V", descriptor = "Lo;")
    public static class285 field1436;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZI)I", line = 4)
    public static final int method781(boolean arg0, int arg1) {
        field1435++;
        if (!arg0) {
            field1430 = (class99) null;
        }
        int var2 = arg1 & 0x3F;
        int var3 = arg1 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(B)V", line = 55)
    public static void method782(byte arg0) {
        field1430 = null;
        if (arg0 < -103) {
            field1436 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lcg;II)V", line = 67)
    public final void method60(class316 arg0, int arg1, int arg2) {
        field1425++;
        if (arg2 == 0) {
            this.field1433 = arg0.method2220((byte) 49) << 4;
        } else if (arg2 == 1) {
            this.field4835 = arg0.method2219(16448) == 1;
        }
        int var5 = 10 % ((-arg1 - 17) / 40);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)[[I", line = 117)
    public final int[][] method53(int arg0, int arg1) {
        int var3 = -29 / ((arg0 + 31) / 37);
        field1426++;
        int[][] var4 = this.field4840.method1625(arg1, -13241);
        if (this.field4840.field3352) {
            int[] var5 = this.method2225((byte) 66, 1, arg1);
            int[] var6 = this.method2225((byte) 66, 2, arg1);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            for (int var10 = 0; var10 < class326.field4933; var10++) {
                int var11 = (var5[var10] * 255 & 0xFFE04) >> 12;
                int var12 = var6[var10] * this.field1433 >> 12;
                int var13 = class115.field1555[var11] * var12 >> 12;
                int var14 = class257.field3805[var11] * var12 >> 12;
                int var15 = class202.field2889 & (var13 >> 12) + arg1;
                int var16 = class246.field3548 & var10 + (var14 >> 12);
                int[][] var17 = this.method2227(0, 112, var15);
                var7[var10] = var17[0][var16];
                var8[var10] = var17[1][var16];
                var9[var10] = var17[2][var16];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V", line = 175)
    public class106() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)[I", line = 189)
    public final int[] method140(int arg0, int arg1) {
        int[] var3 = this.field4847.method1387(arg1, (byte) -72);
        if (this.field4847.field2751) {
            int[] var4 = this.method2225((byte) 66, 1, arg1);
            int[] var5 = this.method2225((byte) 66, 2, arg1);
            for (int var6 = 0; var6 < class326.field4933; var6++) {
                int var7 = var5[var6] * this.field1433 >> 12;
                int var8 = (var4[var6] & 0xFF6) >> 4;
                int var9 = class257.field3805[var8] * var7 >> 12;
                int var10 = class115.field1555[var8] * var7 >> 12;
                int var11 = (var9 >> 12) + var6 & class246.field3548;
                int var12 = class202.field2889 & (var10 >> 12) + arg1;
                int[] var13 = this.method2225((byte) 66, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        field1434++;
        if (arg0 != 542) {
            field1427 = 56;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(BII)V", line = 235)
    public static final void method783(byte arg0, int arg1, int arg2) {
        class157 var3 = class100.method729(arg2, (byte) -119);
        field1432++;
        int var4 = var3.field2163;
        int var5 = var3.field2174;
        int var6 = var3.field2166;
        int var7 = class237.field3354[var5 - var6];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        if (arg0 < 110) {
            method783((byte) -122, 8, 92);
        }
        int var8 = var7 << var6;
        class169.method1193(~var8 & class324.field4920[var4] | var8 & arg1 << var6, var4, 0);
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V", line = 262)
    public final void method546(int arg0) {
        class98.method714((byte) -127);
        if (arg0 == -21522) {
            field1429++;
        }
    }
}
