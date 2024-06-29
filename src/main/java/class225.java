import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class225 extends class107 {

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "I")
    private int field3528 = 4096;

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "[I")
    private int[] field3534 = new int[3];

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
    private int field3539 = 4096;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
    private int field3535 = 4096;

    @OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
    private int field3540 = 409;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "Ljava/lang/String;")
    public static String field3529 = "Allocated memory";

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3532 = "Allocating memory";

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!ol", name = "S", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "Lgi;")
    public static class164 field3533;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "[I")
    public static int[] field3536;

    @OriginalMember(owner = "client!ol", name = "T", descriptor = "[I")
    public static int[] field3543;

    @OriginalMember(owner = "client!ol", name = "R", descriptor = "[[Z")
    public static boolean[][] field3541;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(II)I")
    public static final int method1559(int arg0, int arg1) {
        if (arg1 != 16711680) {
            return 125;
        } else {
            ++field3537;
            return arg0 & 255;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)[[I")
    public final int[][] method190(int arg0, byte arg1) {
        ++field3538;
        int[][] var3 = super.field1662.method1302(arg0, (byte) 26);
        if (arg1 != -117) {
            return null;
        } else {
            if (super.field1662.field3063) {
                int[][] var4 = this.method759(0, -128, arg0);
                int[] var5 = var3[0];
                int[] var6 = var4[0];
                int[] var7 = var4[2];
                int[] var8 = var4[1];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class24.field443; ++var11) {
                    int var12 = var6[var11];
                    int var13 = -this.field3534[0] + var12;
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (~this.field3540 > ~var13) {
                        var5[var11] = var12;
                        var9[var11] = var8[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var8[var11];
                        int var15 = -this.field3534[1] + var14;
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (this.field3540 < var15) {
                            var5[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = -this.field3534[2] + var16;
                            if (var17 < 0) {
                                var17 = -var17;
                            }
                            if (~this.field3540 > ~var17) {
                                var5[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var5[var11] = this.field3535 * var12 >> 12;
                                var9[var11] = this.field3539 * var14 >> 12;
                                var10[var11] = this.field3528 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        ++field3530;
        if (arg2 == 28) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (~arg0 != -3) {
                        if (arg0 != 3) {
                            if (~arg0 == -5) {
                                int var5 = arg1.method1812(true);
                                this.field3534[2] = class233.method1609(var5, 255) >> 12;
                                this.field3534[1] = class233.method1609(var5, 65280) >> 4;
                                this.field3534[0] = class233.method1609(var5, 16711680) << 4;
                            }
                        } else {
                            this.field3535 = arg1.method1837(252);
                        }
                    } else {
                        this.field3539 = arg1.method1837(252);
                    }
                } else {
                    this.field3528 = arg1.method1837(252);
                }
            } else {
                this.field3540 = arg1.method1837(252);
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
    public class225() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Log;ZLog;ZI)I")
    public static final int method1560(class241 arg0, boolean arg1, class241 arg2, boolean arg3, int arg4) {
        ++field3542;
        if (arg4 == 1) {
            int var5 = arg0.field3601;
            int var6 = arg2.field3601;
            if (!arg1) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return -var6 + var5;
        } else if (~arg4 == -3) {
            return class281.method1914(class84.field1339, arg2.method1636(arg3).field2946, arg0.method1636(true).field2946, 3);
        } else if (arg4 == 3) {
            if (!arg0.field3767.equals("-")) {
                if (arg2.field3767.equals("-")) {
                    return arg1 ? 1 : -1;
                } else {
                    return class281.method1914(class84.field1339, arg2.field3767, arg0.field3767, 3);
                }
            } else if (arg2.field3767.equals("-")) {
                return 0;
            } else {
                return !arg1 ? 1 : -1;
            }
        } else if (arg4 == 4) {
            if (!arg0.method1590(0)) {
                return !arg2.method1590(0) ? 0 : -1;
            } else {
                return arg2.method1590(0) ? 0 : 1;
            }
        } else if (arg4 == 5) {
            if (arg0.method1595((byte) -73)) {
                return !arg2.method1595((byte) -73) ? 1 : 0;
            } else {
                return !arg2.method1595((byte) -73) ? 0 : -1;
            }
        } else if (arg4 == 6) {
            if (!arg0.method1592(2280)) {
                return !arg2.method1592(2280) ? 0 : -1;
            } else {
                return arg2.method1592(2280) ? 0 : 1;
            }
        } else {
            if (!arg3) {
                field3529 = null;
            }
            if (~arg4 == -8) {
                if (!arg0.method1589((byte) -21)) {
                    return !arg2.method1589((byte) -21) ? 0 : -1;
                } else {
                    return !arg2.method1589((byte) -21) ? 1 : 0;
                }
            } else {
                return -arg2.field3764 + arg0.field3764;
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V")
    public static void method1561(int arg0) {
        field3541 = null;
        if (arg0 == 2001) {
            field3529 = null;
            field3533 = null;
            field3543 = null;
            field3536 = null;
            field3532 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(II)V")
    public static final void method1562(int arg0, int arg1) {
        if (arg1 != 28557) {
            field3533 = null;
        }
        ++field3531;
        for (class137 var2 = class233.field3638.method379(-21146); var2 != null; var2 = class233.field3638.method369(true)) {
            if (~((long) arg0) == ~(var2.field2209 >> 48 & 65535L)) {
                var2.method952((byte) 80);
            }
        }
    }
}
