import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class348 extends class306 {

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    private int field5513 = 4;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    private int field5516 = 4;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "Lvh;")
    public static class62 field5519 = new class62(64);

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 20)
    public class348() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V", line = 11)
    public static void method2410(int arg0) {
        field5519 = null;
        if (arg0 != -159174072) {
            field5519 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(IIII)I", line = 24)
    public static final int method2411(int arg0, int arg1, int arg2, int arg3) {
        field5517++;
        if (arg3 != -2108503000) {
            method2411(19, -83, -25, 21);
        }
        int var4 = class104.field1440[class133.method915(arg1, arg2)];
        if (arg0 > 0) {
            int var5 = class104.field1438.method879(-7796, arg0 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) + ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class104.field1438.method885(arg0 & 0xFFFF, (byte) 120);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 >> 16 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                int var12 = (var4 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var11 & 0xFF00) + ((var10 & 0x5700FF00) << 8) + (var12 >> 8);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)Loe;", line = 94)
    public static final class146 method2412(boolean arg0, int arg1) {
        field5521++;
        class146 var2 = (class146) class49.field557.method380(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (!arg0) {
            field5519 = (class62) null;
        }
        byte[] var3 = class84.field1090.method100(4, arg1, (byte) -107);
        class146 var4 = new class146();
        if (var3 != null) {
            var4.method1078(new class143(var3), arg1, (byte) 118);
        }
        class49.field557.method377((long) arg1, var4, -1);
        return var4;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)[I", line = 120)
    public final int[] method47(int arg0, int arg1) {
        field5514++;
        int[] var3 = this.field4757.method903(arg0, -43);
        if (arg1 != -1546337535) {
            this.field5513 = 68;
        }
        if (this.field4757.field1898) {
            int var4 = class31.field367 / this.field5513;
            int var5 = class99.field1344 / this.field5516;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method2161(0, (byte) 121, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method2161(class99.field1344 * var7 / var5, (byte) 126, 0);
            }
            for (int var8 = 0; var8 < class31.field367; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class31.field367 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILlf;I)V", line = 173)
    public final void method45(int arg0, class143 arg1, int arg2) {
        field5518++;
        if (arg2 == 0) {
            this.field5513 = arg1.method1043(true);
        } else if (arg2 == 1) {
            this.field5516 = arg1.method1043(true);
        }
        if (arg0 != -15334) {
            field5519 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)[[I", line = 214)
    public final int[][] method681(int arg0, byte arg1) {
        int[][] var3 = this.field4752.method1866(arg0, 0);
        if (arg1 != -119) {
            this.field5516 = -57;
        }
        if (this.field4752.field4179) {
            int var4 = class31.field367 / this.field5513;
            int var5 = class99.field1344 / this.field5516;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method2160(0, (byte) 126, class99.field1344 * var6 / var5);
            } else {
                var7 = this.method2160(0, (byte) -76, 0);
            }
            int[] var8 = var7[1];
            int[] var9 = var7[0];
            int[] var10 = var7[2];
            int[] var11 = var3[1];
            int[] var12 = var3[0];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class31.field367; var14++) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class31.field367 * var16 / var4;
                }
                var12[var14] = var9[var15];
                var11[var14] = var8[var15];
                var13[var14] = var10[var15];
            }
        }
        field5515++;
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V", line = 286)
    public static final void method2413(int arg0) {
        field5520++;
        Container var1;
        if (class80.field1065 != null) {
            var1 = class80.field1065;
        } else if (class231.field3498 == null) {
            var1 = class156.field2451.field254;
        } else {
            var1 = class231.field3498;
        }
        class56.field670 = var1.getSize().width;
        class168.field2580 = var1.getSize().height;
        if (class231.field3498 == var1) {
            Insets var2 = class231.field3498.getInsets();
            class56.field670 -= var2.right + var2.left;
            class168.field2580 -= var2.top + var2.bottom;
        }
        if (class117.method768(-120) >= 2) {
            class107.field1473 = 0;
            class95.field1307 = class168.field2580;
            class165.field2546 = class56.field670;
            class258.field4076 = 0;
        } else {
            class107.field1473 = (class56.field670 - 765) / 2;
            class165.field2546 = 765;
            class258.field4076 = 0;
            class95.field1307 = 503;
        }
        if (class272.field4317) {
            class272.method1929(class165.field2546, class95.field1307);
        }
        class328.field5287.setSize(class165.field2546, class95.field1307);
        if (class231.field3498 == var1) {
            Insets var3 = class231.field3498.getInsets();
            class328.field5287.setLocation(var3.left + class107.field1473, class258.field4076 + var3.top);
        } else {
            class328.field5287.setLocation(class107.field1473, class258.field4076);
        }
        if (class345.field5482 != arg0) {
            class241.method1707(arg0 + 536870912, true);
        }
        class282.method2044((byte) -123);
    }
}
