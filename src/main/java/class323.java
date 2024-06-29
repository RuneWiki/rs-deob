import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class323 extends class30 {

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    private int field5039 = 4096;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
    private int field5042 = 409;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
    private int field5043 = 4096;

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
    private int field5045 = 4096;

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "[I")
    private int[] field5048 = new int[3];

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "Z")
    public static boolean field5044 = false;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[Lne;)V", line = 6)
    public static final void method2139(int arg0, int arg1, class172[] arg2) {
        ++field5049;
        if (arg1 > 94) {
            for (int var3 = 0; ~var3 > ~arg2.length; ++var3) {
                class172 var4 = arg2[var3];
                if (var4 != null) {
                    if (~var4.field2707 == -1) {
                        if (var4.field2866 != null) {
                            method2139(arg0, 125, var4.field2866);
                        }
                        class196 var5 = (class196) class392.field5891.method1770(-880, (long) var4.field2865);
                        if (var5 != null) {
                            class39.method266(arg0, -4174, var5.field3171);
                        }
                    }
                    if (~arg0 == -1 && var4.field2746 != null) {
                        class150 var6 = new class150();
                        var6.field2352 = var4.field2746;
                        var6.field2348 = var4;
                        class17.method135(var6);
                    }
                    if (arg0 == 1 && var4.field2841 != null) {
                        if (~var4.field2693 <= -1) {
                            class172 var7 = class196.method1375(var4.field2865, (byte) -56);
                            if (var7 == null || var7.field2866 == null || var7.field2866.length <= var4.field2693 || var7.field2866[var4.field2693] != var4) {
                                continue;
                            }
                        }
                        class150 var8 = new class150();
                        var8.field2348 = var4;
                        var8.field2352 = var4.field2841;
                        class17.method135(var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(B)Z", line = 79)
    public static final boolean method2140(byte arg0) {
        ++field5041;
        class418 var1 = (class418) class86.field1089.field459.field2536;
        if (var1 != null && class86.field1089.field459 != var1) {
            if (arg0 <= 41) {
                field5044 = false;
            }
            if (var1.field6192 >= 2000) {
                var1.field6192 -= 2000;
            }
            return var1.field6192 == 1004;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljg;II)V", line = 104)
    public final void method115(class186 arg0, int arg1, int arg2) {
        ++field5038;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            int var5 = arg0.method1275(arg1 ^ -6457);
                            this.field5048[1] = class37.method242(4080, var5 >> 4);
                            this.field5048[0] = class37.method242(var5 << 4, 267386880);
                            this.field5048[2] = class37.method242(0, var5 >> 12);
                        }
                    } else {
                        this.field5039 = arg0.method1272((byte) -49);
                    }
                } else {
                    this.field5045 = arg0.method1272((byte) -46);
                }
            } else {
                this.field5043 = arg0.method1272((byte) -110);
            }
        } else {
            this.field5042 = arg0.method1272((byte) -101);
        }
        if (arg1 != 6456) {
            method2141(117, (byte) 102, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V", line = 334)
    public class323() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB[B)I", line = 177)
    public static final int method2141(int arg0, byte arg1, byte[] arg2) {
        ++field5047;
        if (arg1 != 75) {
            field5044 = true;
        }
        return class428.method2650(-1, arg2, 0, arg0);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Lrd;", line = 202)
    public static final class185 method2142(int arg0, int arg1) {
        if (arg1 < 121) {
            return null;
        } else {
            ++field5040;
            class185 var2 = (class185) class28.field319.method1660(2, (long) arg0);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class410.field6078.method2771(5, arg0, 3);
                class185 var4 = new class185();
                if (var3 != null) {
                    var4.method1257((byte) 62, new class186(var3));
                }
                class28.field319.method1655(false, var4, (long) arg0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(BI)V", line = 225)
    public static final void method2143(byte arg0, int arg1) {
        ++field5046;
        if (arg0 < -20) {
            class211 var2 = class281.method1921(5, arg1, (byte) -101);
            var2.method1489((byte) -100);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)[[I", line = 238)
    public final int[][] method203(byte arg0, int arg1) {
        ++field5050;
        int[][] var3 = super.field360.method2803(arg1, true);
        if (super.field360.field6566) {
            int[][] var4 = this.method206(arg1, arg0 ^ -95, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class369.field5610; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field5048[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field5042) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field5048[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var15 > this.field5042) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field5048[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field5042 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field5039 * var12 >> 12;
                            var9[var11] = this.field5045 * var14 >> 12;
                            var10[var11] = this.field5043 * var16 >> 12;
                        }
                    }
                }
            }
        }
        if (arg0 != -93) {
            field5044 = false;
        }
        return var3;
    }
}
