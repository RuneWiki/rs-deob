import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class25 extends class8 {

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "I")
    private int field410 = 1024;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    private int field407 = 2048;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    private int field405 = 3072;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "[I")
    public static int[] field409 = new int[256];

    @OriginalMember(owner = "client!lj", name = "X", descriptor = "[I")
    public static int[] field419;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "[[[I")
    public static int[][][] field418;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZLjava/lang/String;I)V")
    public static final void method226(int arg0, int arg1, boolean arg2, String arg3, int arg4) {
        ++field414;
        class36 var5 = class230.method1612(1, arg0, arg4);
        if (var5 != null) {
            if (var5.field672 != null) {
                class213 var6 = new class213();
                var6.field3480 = var5;
                var6.field3477 = var5.field672;
                var6.field3488 = arg3;
                var6.field3475 = arg1;
                class89.method645(-127, var6);
            }
            if (!arg2) {
                boolean var7 = true;
                if (var5.field570 > 0) {
                    var7 = class7.method51(887, var5);
                }
                if (var7) {
                    if (client.method1093(var5).method605(true, arg1 + -1)) {
                        if (~arg1 == -2) {
                            ++class145.field2323;
                            class68.field1113.method534((byte) 107, 117);
                            class68.field1113.method1529((byte) 123, arg4);
                            class68.field1113.method1554(arg0, (byte) 89);
                        }
                        if (~arg1 == -3) {
                            ++class16.field271;
                            class68.field1113.method534((byte) -125, 160);
                            class68.field1113.method1529((byte) 124, arg4);
                            class68.field1113.method1554(arg0, (byte) 89);
                        }
                        if (arg1 == 3) {
                            class68.field1113.method534((byte) 39, 180);
                            ++class45.field815;
                            class68.field1113.method1529((byte) 118, arg4);
                            class68.field1113.method1554(arg0, (byte) 89);
                        }
                        if (~arg1 == -5) {
                            class68.field1113.method534((byte) 20, 175);
                            ++class81.field1272;
                            class68.field1113.method1529((byte) 125, arg4);
                            class68.field1113.method1554(arg0, (byte) 89);
                        }
                        if (~arg1 == -6) {
                            ++class3.field41;
                            class68.field1113.method534((byte) 45, 227);
                            class68.field1113.method1529((byte) 118, arg4);
                            class68.field1113.method1554(arg0, (byte) 89);
                        }
                        if (~arg1 == -7) {
                            ++class235.field3838;
                            class68.field1113.method534((byte) 43, 123);
                            class68.field1113.method1529((byte) 124, arg4);
                            class68.field1113.method1554(arg0, (byte) 89);
                        }
                        if (arg1 == 7) {
                            ++class137.field2261;
                            class68.field1113.method534((byte) -98, 230);
                            class68.field1113.method1529((byte) 124, arg4);
                            class68.field1113.method1554(arg0, (byte) 89);
                        }
                        if (~arg1 == -9) {
                            ++class258.field4104;
                            class68.field1113.method534((byte) 73, 231);
                            class68.field1113.method1529((byte) 121, arg4);
                            class68.field1113.method1554(arg0, (byte) 89);
                        }
                        if (~arg1 == -10) {
                            ++class279.field4415;
                            class68.field1113.method534((byte) -109, 166);
                            class68.field1113.method1529((byte) 123, arg4);
                            class68.field1113.method1554(arg0, (byte) 89);
                        }
                        if (~arg1 == -11) {
                            class68.field1113.method534((byte) 95, 68);
                            ++class27.field425;
                            class68.field1113.method1529((byte) 125, arg4);
                            class68.field1113.method1554(arg0, (byte) 89);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (arg0 >= 62) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        super.field115 = ~arg1.method1517((byte) -96) == -2;
                    }
                } else {
                    this.field405 = arg1.method1521((byte) 113);
                }
            } else {
                this.field410 = arg1.method1521((byte) 113);
            }
            ++field408;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(IB)I")
    public static final int method227(int arg0, byte arg1) {
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 16;
        }
        ++field413;
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 2;
        }
        if (arg1 != -81) {
            method226(-14, -78, false, (String) null, -111);
        }
        if (arg0 >= 1) {
            ++var2;
            arg0 >>>= 1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(Z)V")
    public final void method66(boolean arg0) {
        this.field407 = -this.field410 + this.field405;
        if (arg0) {
            method226(-36, 116, false, (String) null, -21);
        }
        ++field406;
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V")
    public static void method228(int arg0) {
        field409 = null;
        field419 = null;
        field418 = null;
        if (arg0 != 27985) {
            field409 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method65(int arg0, byte arg1) {
        int var3 = 125 / ((-48 - arg1) / 46);
        ++field411;
        int[][] var4 = super.field93.method248(arg0, 17416);
        if (super.field93.field470) {
            int[][] var5 = this.method60(arg0, 0, 119);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var4[0];
            int[] var9 = var5[1];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~class231.field3798 < ~var12; ++var12) {
                var8[var12] = this.field410 - -(var6[var12] * this.field407 >> 12);
                var10[var12] = (var9[var12] * this.field407 >> 12) + this.field410;
                var11[var12] = (var7[var12] * this.field407 >> 12) + this.field410;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field412;
        int[] var3 = super.field110.method1585(arg0 ^ arg0, arg1);
        if (super.field110.field3734) {
            int[] var4 = this.method61(arg1, -55, 0);
            for (int var5 = 0; ~class231.field3798 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field407 >> 12) + this.field410;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)V")
    public static final void method229(int arg0) {
        ++field415;
        if (arg0 == 4) {
            class49.field867.method481(false);
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    public class25() {
        super(1, false);
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if ((1 & var1) == 1) {
                    var1 = -306674912 ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field409[var0] = var1;
        }
        field419 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
    }
}
