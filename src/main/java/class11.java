import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class11 extends class112 {

    @OriginalMember(owner = "client!em", name = "N", descriptor = "I")
    private int field136 = 4;

    @OriginalMember(owner = "client!em", name = "O", descriptor = "I")
    private int field137 = 4;

    @OriginalMember(owner = "client!em", name = "K", descriptor = "[J")
    public static long[] field133 = new long[100];

    @OriginalMember(owner = "client!em", name = "Q", descriptor = "[I")
    public static int[] field139 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!em", name = "V", descriptor = "I")
    public static int field144 = 2;

    @OriginalMember(owner = "client!em", name = "L", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!em", name = "M", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!em", name = "P", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!em", name = "R", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!em", name = "S", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!em", name = "U", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!em", name = "T", descriptor = "Lka;")
    public static class188 field142;

    @OriginalMember(owner = "client!em", name = "W", descriptor = "Lah;")
    public static class205 field145;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IILhi;)V", line = 8)
    public final void method52(int arg0, int arg1, class291 arg2) {
        field141++;
        if (arg0 != 31164) {
            return;
        }
        if (arg1 == 0) {
            this.field137 = arg2.method2011(-54);
        } else if (arg1 == 1) {
            this.field136 = arg2.method2011(-124);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BI)[I", line = 48)
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -3) {
            field139 = (int[]) null;
        }
        field143++;
        int[] var3 = this.field1585.method1952(arg1, (byte) 103);
        if (this.field1585.field4935) {
            int var4 = class58.field889 / this.field137;
            int var5 = class268.field4526 / this.field136;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method751(0, (byte) 111, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method751(class268.field4526 * var7 / var5, (byte) 127, 0);
            }
            for (int var8 = 0; var8 < class58.field889; var8++) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class58.field889 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZI)Loe;", line = 100)
    public static final class127 method54(boolean arg0, int arg1) {
        int var2 = arg1 >> 16;
        field138++;
        if (arg0) {
            method57(-103, -101);
        }
        int var3 = arg1 & 0xFFFF;
        if (class215.field3501[var2] == null || class215.field3501[var2][var3] == null) {
            boolean var4 = class197.method1315(71, var2);
            if (!var4) {
                return null;
            }
        }
        return class215.field3501[var2][var3];
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)[[I", line = 127)
    public final int[][] method55(int arg0, boolean arg1) {
        field134++;
        if (arg1) {
            method54(true, 46);
        }
        int[][] var3 = this.field1594.method656((byte) -66, arg0);
        if (this.field1594.field1402) {
            int var4 = class58.field889 / this.field137;
            int var5 = class268.field4526 / this.field136;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method750(0, (byte) -17, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method750(0, (byte) -17, class268.field4526 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var3[0];
            int[] var10 = var6[1];
            int[] var11 = var6[2];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class58.field889; var14++) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class58.field889 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var9[var14] = var8[var16];
                var12[var14] = var10[var16];
                var13[var14] = var11[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V", line = 211)
    public class11() {
        super(1, false);
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(III)Lwe;", line = 201)
    public static final class51 method56(int arg0, int arg1, int arg2) {
        class34 var3 = class287.field4857[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class51 var4 = var3.field574;
            var3.field574 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(II)Z", line = 219)
    public static final boolean method57(int arg0, int arg1) {
        field140++;
        if (arg0 >= 32 && arg0 <= 126) {
            return true;
        } else if (arg0 >= 160 && arg0 <= 255) {
            return true;
        } else if (arg0 == 128 || arg0 == 140 || arg0 == 151 || arg0 == 156 || arg0 == 159) {
            return true;
        } else {
            if (arg1 != -152) {
                method56(-68, -87, 105);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!em", name = "h", descriptor = "(I)V", line = 253)
    public static void method58(int arg0) {
        field142 = null;
        if (arg0 != 15018) {
            field139 = (int[]) null;
        }
        field139 = null;
        field133 = null;
        field145 = null;
    }
}
