import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class109 extends class317 {

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
    private int field1466 = 2048;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
    private int field1479 = 3072;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
    private int field1468 = 1024;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    public static int field1477 = 2;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "Lbn;")
    public static class9 field1480;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(B)V", line = 5)
    public static void method795(byte arg0) {
        field1480 = null;
        if (arg0 != -100) {
            method799((byte) 24, 'r');
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)[I", line = 16)
    public final int[] method140(int arg0, int arg1) {
        if (arg0 != 542) {
            this.field1468 = -2;
        }
        int[] var3 = this.field4847.method1387(arg1, (byte) -119);
        field1476++;
        if (this.field4847.field2751) {
            int[] var4 = this.method2225((byte) 66, 0, arg1);
            for (int var5 = 0; var5 < class326.field4933; var5++) {
                var3[var5] = (var4[var5] * this.field1466 >> 12) + this.field1468;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V", line = 112)
    public class109() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)[[I", line = 55)
    public final int[][] method53(int arg0, int arg1) {
        int var3 = -26 % ((-arg0 - 31) / 37);
        field1474++;
        int[][] var4 = this.field4840.method1625(arg1, -13241);
        if (this.field4840.field3352) {
            int[][] var5 = this.method2227(0, 110, arg1);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var4[0];
            int[] var9 = var5[2];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class326.field4933; var12++) {
                var8[var12] = (var6[var12] * this.field1466 >> 12) + this.field1468;
                var10[var12] = (var7[var12] * this.field1466 >> 12) + this.field1468;
                var11[var12] = (var9[var12] * this.field1466 >> 12) + this.field1468;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V", line = 101)
    public final void method546(int arg0) {
        this.field1466 = this.field1479 - this.field1468;
        if (arg0 != -21522) {
            this.method546(-109);
        }
        field1472++;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(II)I", line = 120)
    public static final int method796(int arg0, int arg1) {
        field1469++;
        if (arg0 < 101) {
            return -116;
        } else {
            int var2 = arg1 * 6 - 61440;
            int var3 = (arg1 * arg1 >> 12) * arg1 >> 12;
            int var4 = (arg1 * var2 >> 12) + 40960;
            return var3 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIB)Z", line = 137)
    public static final boolean method797(int arg0, int arg1, byte arg2) {
        field1467++;
        if (arg1 == 11) {
            arg1 = 10;
        }
        int var3 = 58 / ((arg2 - 63) / 48);
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        class302 var4 = class153.method1106(arg0, (byte) -71);
        return var4.method2062(-108, arg1);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZI)I", line = 160)
    public static final int method798(boolean arg0, int arg1) {
        field1473++;
        double var2 = (double) (arg1 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var6 = var4;
        double var8 = 0.0D;
        double var10 = (double) ((arg1 & 0xFFCC) >> 8) / 256.0D;
        if (var10 > var4) {
            var6 = var10;
        }
        if (var6 < var2) {
            var6 = var2;
        }
        double var12 = var4;
        if (var4 > var10) {
            var12 = var10;
        }
        if (var12 > var2) {
            var12 = var2;
        }
        double var14 = (var6 + var12) / 2.0D;
        if (!arg0) {
            return -79;
        }
        double var16 = 0.0D;
        int var18 = (int) (var14 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        if (var6 != var12) {
            if (var4 == var6) {
                var8 = (var10 - var2) / (var6 - var12);
            } else if (var6 == var10) {
                var8 = (var2 - var4) / (var6 - var12) + 2.0D;
            } else if (var2 == var6) {
                var8 = (var4 - var10) / (var6 - var12) + 4.0D;
            }
            if (var14 < 0.5D) {
                var16 = (var6 - var12) / (var6 + var12);
            }
            if (var14 >= 0.5D) {
                var16 = (var6 - var12) / (2.0D - var6 - var12);
            }
        }
        int var19 = (int) (var16 * 256.0D);
        double var20 = var8 / 6.0D;
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        int var22 = (int) (var20 * 256.0D);
        if (var18 > 243) {
            var19 >>= 0x4;
        } else if (var18 > 217) {
            var19 >>= 0x3;
        } else if (var18 > 192) {
            var19 >>= 0x2;
        } else if (var18 > 179) {
            var19 >>= 0x1;
        }
        return (var18 >> 1) + (var19 >> 5 << 7) + (var22 >> 2 << 10);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BC)Z", line = 261)
    public static final boolean method799(byte arg0, char arg1) {
        field1475++;
        if (arg0 <= 95) {
            return true;
        } else {
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(II)V", line = 272)
    public static final void method800(int arg0, int arg1) {
        class162.field2232.method720(arg1, arg0 + 1088);
        if (arg0 == 0) {
            field1471++;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lcg;II)V", line = 290)
    public final void method60(class316 arg0, int arg1, int arg2) {
        int var4 = -90 % ((-arg1 - 17) / 40);
        if (arg2 == 0) {
            this.field1468 = arg0.method2220((byte) 91);
        } else if (arg2 == 1) {
            this.field1479 = arg0.method2220((byte) 125);
        } else if (arg2 == 2) {
            this.field4835 = arg0.method2219(16448) == 1;
        }
        field1478++;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V", line = 340)
    public static final void method801(boolean arg0) {
        for (int var1 = -1; var1 < class292.field4352; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class4.field35[var1];
            }
            class241 var3 = class169.field2306[var2];
            if (var3 != null && var3.field3677 > 0) {
                var3.field3677--;
                if (var3.field3677 == 0) {
                    var3.field3739 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class338.field5084; var4++) {
            int var5 = class257.field3807[var4];
            class329 var6 = class42.field484[var5];
            if (var6 != null && var6.field3677 > 0) {
                var6.field3677--;
                if (var6.field3677 == 0) {
                    var6.field3739 = null;
                }
            }
        }
        field1470++;
        if (!arg0) {
            method797(-64, -65, (byte) -49);
        }
    }
}
