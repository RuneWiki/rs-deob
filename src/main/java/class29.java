import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class29 extends class220 {

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "I")
    private int field496 = 0;

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "I")
    private int field504 = 4096;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "[B")
    public static byte[] field498 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "S")
    public static short field501 = 256;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "Lwe;")
    public static class24 field500 = new class24(30);

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field506 = "Loading title screen - ";

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "[[I")
    public static int[][] field497;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)[[I", line = 9)
    public final int[][] method1(int arg0, int arg1) {
        ++field502;
        if (arg1 != 0) {
            field505 = -3;
        }
        int[][] var3 = super.field3135.method1774(arg0, -2);
        if (super.field3135.field4087) {
            int[][] var4 = this.method1369(0, (byte) 119, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class344.field5043; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field496 > var12) {
                    var8[var11] = this.field496;
                } else if (~this.field504 > ~var12) {
                    var8[var11] = this.field504;
                } else {
                    var8[var11] = var12;
                }
                if (~var13 <= ~this.field496) {
                    if (this.field504 < var13) {
                        var9[var11] = this.field504;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field496;
                }
                if (this.field496 <= var14) {
                    if (var14 > this.field504) {
                        var10[var11] = this.field504;
                    } else {
                        var10[var11] = var14;
                    }
                } else {
                    var10[var11] = this.field496;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 91)
    public static final void method252(boolean arg0, int arg1, String arg2) {
        ++field499;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = arg1;
        int var6 = arg0 ? 32768 : 0;
        int var7 = (arg0 ? class329.field4732 : class94.field1300) + var6;
        for (int var8 = var6; var7 > var8; ++var8) {
            class53 var11 = class284.method1804(var8, (byte) 97);
            if (var11.field791 && ~var11.method372(arg1 + 1).toLowerCase().indexOf(var3) != 0) {
                if (var5 >= 50) {
                    class31.field528 = -1;
                    class128.field1697 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; ~var5 < ~var13; ++var13) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class31.field528 = var5;
        class300.field4318 = 0;
        class128.field1697 = var4;
        String[] var9 = new String[class31.field528];
        for (int var10 = 0; ~class31.field528 < ~var10; ++var10) {
            var9[var10] = class284.method1804(var4[var10], (byte) 70).method372(arg1 + 1);
        }
        class80.method507(arg1 + -1, class128.field1697, var9);
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V", line = 246)
    public class29() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(II)[I", line = 167)
    public final int[] method43(int arg0, int arg1) {
        if (arg0 != -11543) {
            return null;
        } else {
            ++field503;
            int[] var3 = super.field3125.method2005(arg1, (byte) -77);
            if (super.field3125.field4676) {
                int[] var4 = this.method1366(0, (byte) -40, arg1);
                for (int var5 = 0; var5 < class344.field5043; ++var5) {
                    int var6 = var4[var5];
                    if (~var6 > ~this.field496) {
                        var3[var5] = this.field496;
                    } else if (this.field504 < var6) {
                        var3[var5] = this.field504;
                    } else {
                        var3[var5] = var6;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(II)Lgg;", line = 218)
    public static final class312 method253(int arg0, int arg1) {
        ++field508;
        class312 var2 = (class312) class232.field3271.method209(119, (long) arg1);
        if (arg0 != -1624) {
            method254(114);
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class94.field1293.method1472(arg1, 29, 0);
            class312 var4 = new class312();
            if (var3 != null) {
                var4.method1945(-59, new class265(var3), arg1);
            }
            class232.field3271.method202(true, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V", line = 250)
    public static void method254(int arg0) {
        field500 = null;
        field497 = null;
        if (arg0 == -2399) {
            field506 = null;
            field498 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBLil;)V", line = 263)
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (arg1 != -49) {
            field498 = null;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field3131 = ~arg2.method1697(-43) == -2;
                }
            } else {
                this.field504 = arg2.method1685(8104);
            }
        } else {
            this.field496 = arg2.method1685(8104);
        }
        ++field507;
    }
}
