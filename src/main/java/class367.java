import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class367 extends class118 {

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
    private int field5382 = 409;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    private int field5384 = 4096;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "I")
    private int field5387 = 4096;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "[I")
    private int[] field5385 = new int[3];

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "I")
    private int field5390 = 4096;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    public static int field5379 = 0;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZBZLtd;)V")
    public static final void method2204(boolean arg0, byte arg1, boolean arg2, class333 arg3) {
        ++field5381;
        int var4 = arg3.field4965;
        int var5 = (int) arg3.field1339;
        arg3.method625((byte) -50);
        if (arg1 >= -11) {
            field5379 = -97;
        }
        if (arg0) {
            class161.method972(125, var4);
        }
        class154.method949(65535, var4);
        class170 var6 = class168.method1020(var5, (byte) 93);
        if (var6 != null) {
            class405.method2543(var6, 127);
        }
        class198.method1185(-2);
        if (!arg2 && ~class6.field69 != 0) {
            class250.method1526((byte) -63, 1, class6.field69);
        }
        class247 var7 = new class247(class308.field4647);
        for (class333 var8 = (class333) var7.method1506(0); var8 != null; var8 = (class333) var7.method1509((byte) -98)) {
            if (!var8.method624(18651)) {
                var8 = (class333) var7.method1506(0);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field4962 == 3) {
                int var9 = (int) var8.field1339;
                if (var9 >>> 16 == var4) {
                    method2204(true, (byte) -122, arg2, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIBI)V")
    public static final void method2205(int arg0, int arg1, byte arg2, int arg3) {
        ++field5378;
        if (arg2 == -62) {
            String var4 = "tele " + arg1 + "," + (arg3 >> 6) + "," + (arg0 >> 6) + "," + (arg3 & 63) + "," + (arg0 & 63);
            System.out.println(var4);
            class176.method1077(true, true, var4);
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
    public static final void method2206(byte arg0) {
        ++field5380;
        if (arg0 >= -56) {
            method2207(40, (byte) -45);
        }
        if (class239.field3584 != 3) {
            class414.field6149 = -1;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method195(boolean arg0, int arg1) {
        ++field5391;
        if (arg0) {
            method2204(false, (byte) 107, true, (class333) null);
        }
        int[][] var3 = super.field1549.method2013(arg1, true);
        if (super.field1549.field4903) {
            int[][] var4 = this.method708(arg1, (byte) 69, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class440.field6474; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field5385[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~this.field5382 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field5385[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field5382) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field5385[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (this.field5382 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field5387 * var12 >> 12;
                            var9[var11] = this.field5384 * var14 >> 12;
                            var10[var11] = this.field5390 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public class367() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)Lle;")
    public static final class287 method2207(int arg0, byte arg1) {
        ++field5389;
        if (arg1 <= 95) {
            field5379 = 49;
        }
        class287 var2 = (class287) class38.field462.method1491((long) arg0, 0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class201.field3034.method823(31, -20334, arg0);
            class287 var4 = new class287();
            if (var3 != null) {
                var4.method1777(new class385(var3), (byte) 122, arg0);
            }
            class38.field462.method1488(128, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method2208(int arg0, String arg1) {
        if (arg0 != 2) {
            method2208(-98, (String) null);
        }
        ++field5386;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; ~var5 > ~var2; ++var5) {
            var3 = (long) arg1.charAt(var5) + (var3 << 5) + -var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        ++field5383;
        if (arg1 == 1) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 != -3) {
                        if (~arg0 != -4) {
                            if (~arg0 == -5) {
                                int var5 = arg2.method2382((byte) -78);
                                this.field5385[2] = class406.method2552(var5 >> 12, 0);
                                this.field5385[0] = class406.method2552(var5 << 4, 267386880);
                                this.field5385[1] = class406.method2552(var5 >> 4, 4080);
                            }
                        } else {
                            this.field5387 = arg2.method2323(-26);
                        }
                    } else {
                        this.field5384 = arg2.method2323(-32);
                    }
                } else {
                    this.field5390 = arg2.method2323(-124);
                }
            } else {
                this.field5382 = arg2.method2323(-32);
            }
        }
    }
}
