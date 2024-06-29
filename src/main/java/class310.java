import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class310 extends class112 {

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
    private int field5308 = 32768;

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "[I")
    public static int[] field5305 = new int[100];

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "[[I")
    public static int[][] field5306 = new int[104][104];

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!bl", name = "W", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!bl", name = "X", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "[I")
    public static int[] field5300;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)Lej;", line = 4)
    public static final class158 method2149(int arg0, int arg1) {
        field5299++;
        class158 var2 = (class158) class162.field2563.method1620(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -7919) {
            method2151((int[]) null, (byte) -17);
        }
        byte[] var3 = class164.field2600.method1381(arg0, 0, arg1 + 7919);
        class158 var4 = new class158(var3);
        var4.method1144(class49.field772, (int[]) null);
        class162.field2563.method1614(var4, (long) arg0, (byte) 78);
        return var4;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)[I", line = 29)
    public final int[] method53(byte arg0, int arg1) {
        field5302++;
        if (arg0 != -3) {
            field5307 = -100;
        }
        int[] var3 = this.field1585.method1952(arg1, (byte) 81);
        if (this.field1585.field4935) {
            int[] var4 = this.method751(arg1, (byte) 107, 1);
            int[] var5 = this.method751(arg1, (byte) 120, 2);
            for (int var6 = 0; var6 < class58.field889; var6++) {
                int var7 = var4[var6] >> 4 & 0xFF;
                int var8 = var5[var6] * this.field5308 >> 12;
                int var9 = class268.field4522[var7] * var8 >> 12;
                int var10 = class203.field3286[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class251.field4304;
                int var12 = (var10 >> 12) + arg1 & class275.field4712;
                int[] var13 = this.method751(var12, (byte) 124, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V", line = 77)
    public class310() {
        super(3, false);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILhi;)V", line = 101)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg1 == 0) {
            this.field5308 = arg2.method2021((byte) 74) << 4;
        } else if (arg1 == 1) {
            this.field1591 = arg2.method2011(-26) == 1;
        }
        field5303++;
        if (arg0 != 31164) {
            this.method55(-22, false);
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)V", line = 131)
    public static void method2150(byte arg0) {
        field5306 = (int[][]) null;
        if (arg0 != -23) {
            field5306 = (int[][]) ((int[][]) null);
        }
        field5305 = null;
        field5300 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "([IB)[I", line = 151)
    public static final int[] method2151(int[] arg0, byte arg1) {
        field5304++;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            int var3 = -113 % ((arg1 - 57) / 45);
            class187.method1247(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)V", line = 174)
    public final void method673(int arg0) {
        field5310++;
        class243.method1667(14);
        if (arg0 != 8) {
            method2151((int[]) null, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZ)[[I", line = 187)
    public final int[][] method55(int arg0, boolean arg1) {
        if (arg1) {
            this.method55(-9, true);
        }
        field5312++;
        int[][] var3 = this.field1594.method656((byte) -44, arg0);
        if (this.field1594.field1402) {
            int[] var4 = this.method751(arg0, (byte) 117, 1);
            int[] var5 = this.method751(arg0, (byte) 118, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class58.field889; var9++) {
                int var10 = (var4[var9] * 255 & 0xFFC9F) >> 12;
                int var11 = var5[var9] * this.field5308 >> 12;
                int var12 = class203.field3286[var10] * var11 >> 12;
                int var13 = class268.field4522[var10] * var11 >> 12;
                int var14 = (var13 >> 12) + var9 & class251.field4304;
                int var15 = (var12 >> 12) + arg0 & class275.field4712;
                int[][] var16 = this.method750(0, (byte) -17, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }
}
