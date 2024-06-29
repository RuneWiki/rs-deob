import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class320 extends class210 {

    @OriginalMember(owner = "client!so", name = "O", descriptor = "I")
    private int field4721 = 4096;

    @OriginalMember(owner = "client!so", name = "I", descriptor = "I")
    private int field4715 = 409;

    @OriginalMember(owner = "client!so", name = "K", descriptor = "I")
    private int field4717 = 4096;

    @OriginalMember(owner = "client!so", name = "M", descriptor = "I")
    private int field4719 = 4096;

    @OriginalMember(owner = "client!so", name = "S", descriptor = "[I")
    private int[] field4725 = new int[3];

    @OriginalMember(owner = "client!so", name = "L", descriptor = "[[B")
    public static byte[][] field4718 = new byte[1000][];

    @OriginalMember(owner = "client!so", name = "J", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!so", name = "N", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!so", name = "P", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!so", name = "Q", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!so", name = "R", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!so", name = "T", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 4)
    public static final Class method2106(int arg0, String arg1) throws ClassNotFoundException {
        ++field4726;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else {
            if (arg0 != -1) {
                method2107(20);
            }
            if (arg1.equals("S")) {
                return Short.TYPE;
            } else if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else {
                return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IILat;)V", line = 44)
    public final void method56(int arg0, int arg1, class256 arg2) {
        ++field4716;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            int var5 = arg2.method1725((byte) 0);
                            this.field4725[2] = class386.method2438(var5 >> 12, 0);
                            this.field4725[0] = class386.method2438(16711680, var5) << 4;
                            this.field4725[1] = class386.method2438(65280, var5) >> 4;
                        }
                    } else {
                        this.field4717 = arg2.method1767(arg1 + 1930505517);
                    }
                } else {
                    this.field4721 = arg2.method1767(1930493576);
                }
            } else {
                this.field4719 = arg2.method1767(1930493576);
            }
        } else {
            this.field4715 = arg2.method1767(1930493576);
        }
        if (arg1 != -11941) {
            method2108((byte) -28, (class104) null);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)[[I", line = 111)
    public final int[][] method58(int arg0, int arg1) {
        ++field4720;
        int[][] var3 = super.field2967.method1572(124, arg0);
        if (arg1 <= 94) {
            this.field4725 = null;
        }
        if (super.field2967.field3454) {
            int[][] var4 = this.method1444(1, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class202.field2852; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field4725[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field4715 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field4725[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field4715) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field4725[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~this.field4715 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field4717 * var12 >> 12;
                            var9[var11] = this.field4721 * var14 >> 12;
                            var10[var11] = this.field4719 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V", line = 203)
    public class320() {
        super(1, false);
    }

    @OriginalMember(owner = "client!so", name = "g", descriptor = "(I)V", line = 214)
    public static void method2107(int arg0) {
        field4718 = null;
        if (arg0 != -32195) {
            method2107(-52);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BLct;)V", line = 227)
    public static final void method2108(byte arg0, class104 arg1) {
        if (arg0 >= -96) {
            field4718 = null;
        }
        ++field4722;
        class130.field1733 = arg1;
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(IB)Ldi;", line = 245)
    public static final class294 method2109(int arg0, byte arg1) {
        ++field4724;
        if (arg1 > -92) {
            field4718 = null;
        }
        class294 var2 = (class294) class75.field958.method1933((long) arg0, 0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class404.field5853.method715(arg0, (byte) 56, 11);
            class294 var4 = new class294();
            if (var3 != null) {
                var4.method1952(-1, new class256(var3));
            }
            class75.field958.method1937(125, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!so", name = "h", descriptor = "(I)V", line = 272)
    public static final void method2110(int arg0) {
        ++field4723;
        int var1 = class208.field2933;
        int[] var2 = class88.field1085;
        int var3 = -62 / ((arg0 - 29) / 35);
        for (int var4 = 0; var1 > var4; ++var4) {
            class380 var8 = class455.field6731[var2[var4]];
            if (var8 != null && var8.field729 > 0) {
                --var8.field729;
                if (var8.field729 == 0) {
                    var8.field773 = null;
                }
            }
        }
        for (int var5 = 0; ~class14.field231 < ~var5; ++var5) {
            int var6 = class301.field4380[var5];
            class26 var7 = class364.field5260[var6];
            if (var7 != null && var7.field729 > 0) {
                --var7.field729;
                if (var7.field729 == 0) {
                    var7.field773 = null;
                }
            }
        }
    }
}
