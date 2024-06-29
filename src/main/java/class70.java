import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class70 extends class157 {

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    private int field1331 = 32768;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "Z")
    public static boolean field1332 = false;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "Lji;")
    public static class42 field1330 = null;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
    public static int field1338 = 0;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    public static int field1337 = 0;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "Lsj;")
    public static class49 field1328;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "[Lij;")
    public static class194[] field1333;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)V")
    public static final void method513(boolean arg0, int arg1) {
        ++field1334;
        int var2 = 0;
        if (arg1 != -2) {
            method515(58);
        }
        while (~class219.field3996 < ~var2) {
            class163 var3 = class60.field1207[class249.field4492[var2]];
            long var4 = (long) class249.field4492[var2] << 32 | 536870912L;
            if (var3 != null && var3.method576(false) && !var3.field2969.field4292 == !arg0 && var3.field2969.method1635((byte) 112)) {
                int var6 = var3.field1534 >> 7;
                int var7 = var3.field1571 >> 7;
                if (var7 >= 0 && ~var7 > -105 && ~var6 <= -1 && var6 < 104) {
                    label79: {
                        if (var3.method577((byte) 106) == 1 && ~(var3.field1571 & 127) == -65 && (var3.field1534 & 127) == 64) {
                            if (~class185.field3325[var7][var6] == ~class5.field73) {
                                break label79;
                            }
                            class185.field3325[var7][var6] = class5.field73;
                        }
                        if (!var3.field2969.field4245) {
                            var4 |= Long.MIN_VALUE;
                        }
                        var3.field1558 = class94.method661(var3.field1534, 19452, class99.field1937, var3.field1571);
                        class117.method830(class99.field1937, var3.field1571, var3.field1534, var3.field1558, -64 + var3.method577((byte) -81) * 64 + 60, var3, var3.field1504, var4, var3.field1503);
                    }
                }
            }
            ++var2;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)[[I")
    public final int[][] method250(int arg0, int arg1) {
        ++field1327;
        int[][] var3 = super.field2872.method533(arg1, 3);
        if (arg0 != 1) {
            return null;
        } else {
            if (super.field2872.field1434) {
                int[] var4 = this.method1097((byte) 75, 1, arg1);
                int[] var5 = this.method1097((byte) 75, 2, arg1);
                int[] var6 = var3[1];
                int[] var7 = var3[0];
                int[] var8 = var3[2];
                for (int var9 = 0; ~var9 > ~class226.field4124; ++var9) {
                    int var10 = (1046418 & var4[var9] * 255) >> 12;
                    int var11 = var5[var9] * this.field1331 >> 12;
                    int var12 = class223.field4073[var10] * var11 >> 12;
                    int var13 = class209.field3785[var10] * var11 >> 12;
                    int var14 = class249.field4490 & (var13 >> 12) + var9;
                    int var15 = class42.field859 & arg1 - -(var12 >> 12);
                    int[][] var16 = this.method1093(var15, 0, 64);
                    var7[var9] = var16[0][var14];
                    var6[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class70() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        if (arg0 != -98) {
            return null;
        } else {
            ++field1336;
            int[] var3 = super.field2879.method1269(arg1, 17885);
            if (super.field2879.field3363) {
                int[] var4 = this.method1097((byte) 75, 1, arg1);
                int[] var5 = this.method1097((byte) 75, 2, arg1);
                for (int var6 = 0; var6 < class226.field4124; ++var6) {
                    int var7 = var4[var6] >> 4 & 255;
                    int var8 = var5[var6] * this.field1331 >> 12;
                    int var9 = class209.field3785[var7] * var8 >> 12;
                    int var10 = class249.field4490 & var6 - -(var9 >> 12);
                    int var11 = class223.field4073[var7] * var8 >> 12;
                    int var12 = class42.field859 & (var11 >> 12) + arg1;
                    int[] var13 = this.method1097((byte) 75, 0, var12);
                    var3[var6] = var13[var10];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
    public static final void method514(byte arg0) {
        ++field1335;
        if (class260.field4689) {
            if (arg0 == 110) {
                class42 var1 = class116.method827(class172.field3147, (byte) 80, class222.field4053);
                if (var1 != null && var1.field736 != null) {
                    class227 var2 = new class227();
                    var2.field4134 = var1.field736;
                    var2.field4143 = var1;
                    class147.method1021(var2, 200000);
                }
                class260.field4689 = false;
                class126.method907(var1, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        ++field1339;
        if (arg1 >= -29) {
            this.field1331 = 41;
        }
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field2877 = ~arg2.method774((byte) 124) == -2;
            }
        } else {
            this.field1331 = arg2.method736(123) << 4;
        }
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)V")
    public static void method515(int arg0) {
        field1333 = null;
        if (arg0 < 52) {
            field1338 = 86;
        }
        field1330 = null;
        field1328 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        int var2 = -59 / ((-51 - arg0) / 52);
        class257.method1773(0);
        ++field1329;
    }
}
