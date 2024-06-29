import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class117 extends class424 {

    @OriginalMember(owner = "client!ao", name = "Z", descriptor = "I")
    private int field1784 = 1;

    @OriginalMember(owner = "client!ao", name = "Y", descriptor = "I")
    private int field1783 = 2048;

    @OriginalMember(owner = "client!ao", name = "ab", descriptor = "I")
    private int field1785 = 2;

    @OriginalMember(owner = "client!ao", name = "bb", descriptor = "[B")
    private byte[] field1786 = new byte[512];

    @OriginalMember(owner = "client!ao", name = "cb", descriptor = "I")
    private int field1787 = 5;

    @OriginalMember(owner = "client!ao", name = "ib", descriptor = "I")
    private int field1793 = 0;

    @OriginalMember(owner = "client!ao", name = "R", descriptor = "I")
    private int field1776 = 5;

    @OriginalMember(owner = "client!ao", name = "eb", descriptor = "[S")
    private short[] field1789 = new short[512];

    @OriginalMember(owner = "client!ao", name = "X", descriptor = "Lvg;")
    public static class108 field1782 = null;

    @OriginalMember(owner = "client!ao", name = "S", descriptor = "[I")
    public static int[] field1777 = new int[14];

    @OriginalMember(owner = "client!ao", name = "fb", descriptor = "Z")
    public static boolean field1790 = false;

    @OriginalMember(owner = "client!ao", name = "L", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!ao", name = "M", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!ao", name = "N", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!ao", name = "P", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!ao", name = "Q", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!ao", name = "T", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ao", name = "V", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!ao", name = "W", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!ao", name = "db", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!ao", name = "gb", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ao", name = "hb", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!ao", name = "jb", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!ao", name = "U", descriptor = "Lne;")
    public static class76 field1779;

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
    public class117() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "(I)V")
    public static final void method911(int arg0) {
        ++field1778;
        for (class352 var1 = (class352) class155.field2207.method1173(arg0); var1 != null; var1 = (class352) class155.field2207.method1165(true)) {
            if (~var1.field4725 == 0) {
                var1.field4732 = 0;
                class301.method1831(false, var1);
            } else {
                var1.method1884(false);
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BI)V")
    public static final void method912(byte arg0, int arg1) {
        ++field1791;
        class26 var2 = class217.method1445(true, arg1, 1);
        int var3 = -31 % ((7 - arg0) / 44);
        var2.method164(12);
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(III)Z")
    public static final boolean method913(int arg0, int arg1, int arg2) {
        int var3 = class134.field1997[arg0][arg1][arg2];
        if (-class410.field5724 == var3) {
            return false;
        } else if (class410.field5724 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class120.method932(var4 + 1, class436.field6160[arg0].method329(arg1, arg2), var5 + 1) && class120.method932(var4 + 128 - 1, class436.field6160[arg0].method329(arg1 + 1, arg2), var5 + 1) && class120.method932(var4 + 128 - 1, class436.field6160[arg0].method329(arg1 + 1, arg2 + 1), var5 + 128 - 1) && class120.method932(var4 + 1, class436.field6160[arg0].method329(arg1, arg2 + 1), var5 + 128 - 1)) {
                class134.field1997[arg0][arg1][arg2] = class410.field5724;
                return true;
            } else {
                class134.field1997[arg0][arg1][arg2] = -class410.field5724;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V")
    public static final void method914(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1773;
        int var7 = -arg3 + arg5;
        int var8 = arg3 + arg4;
        for (int var9 = arg4; ~var8 < ~var9; ++var9) {
            class149.method1112(arg1, arg0, arg2 ^ 24428, arg6, class83.field1157[var9]);
        }
        for (int var10 = arg5; var7 < var10; --var10) {
            class149.method1112(arg1, arg0, 8, arg6, class83.field1157[var10]);
        }
        int var11 = -arg3 + arg0;
        int var12 = arg6 - -arg3;
        for (int var13 = var8; var13 <= var7; ++var13) {
            int[] var14 = class83.field1157[var13];
            class149.method1112(arg1, var12, 8, arg6, var14);
            class149.method1112(arg1, arg0, 8, var11, var14);
        }
        if (arg2 != 24420) {
            field1782 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "(I)V")
    public static final void method915(int arg0) {
        if (arg0 == 128) {
            ++field1794;
            if (class76.field1085 != 3) {
                class399.field5517 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "(I)V")
    private final void method916(int arg0) {
        ++field1780;
        Random var2 = new Random((long) this.field1793);
        if (arg0 >= 42) {
            this.field1789 = new short[512];
            if (~this.field1783 < -1) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field1789[var3] = (short) class92.method724(var2, this.field1783, 99);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(B)V")
    public static final void method917(byte arg0) {
        ++field1771;
        int[] var1 = new int[class104.field1436];
        int var2 = 0;
        for (int var3 = 0; class104.field1436 > var3; ++var3) {
            class14 var5 = class367.method2308(false, var3);
            if (~var5.field152 <= -1 || ~var5.field149 <= -1) {
                var1[var2++] = var3;
            }
        }
        class194.field2811 = new int[var2];
        if (arg0 == 83) {
            for (int var4 = 0; var4 < var2; ++var4) {
                class194.field2811[var4] = var1[var4];
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "(I)V")
    public static final void method918(int arg0) {
        ++field1774;
        class144.field2108.method249(class128.field1941, class277.field3774, class116.field1762);
        int var1 = 124 % ((arg0 - 51) / 44);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (arg1 == -48) {
            ++field1781;
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (arg2 != 2) {
                        if (arg2 != 3) {
                            if (arg2 != 4) {
                                if (arg2 != 5) {
                                    if (~arg2 == -7) {
                                        this.field1787 = arg0.method2306((byte) 103);
                                    }
                                } else {
                                    this.field1776 = arg0.method2306((byte) 52);
                                }
                            } else {
                                this.field1784 = arg0.method2306((byte) 40);
                            }
                        } else {
                            this.field1785 = arg0.method2306((byte) 63);
                        }
                    } else {
                        this.field1783 = arg0.method2297(13352);
                    }
                } else {
                    this.field1793 = arg0.method2306((byte) 90);
                }
            } else {
                this.field1776 = this.field1787 = arg0.method2306((byte) 76);
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILij;)V")
    public static final void method919(int arg0, class316 arg1) {
        ++field1772;
        class392.field5445 = arg1;
        if (arg0 == -7044) {
            class392.field5445.method1934((byte) 28, 35);
        }
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
    public final void method113(int arg0) {
        this.field1786 = class367.method2311(0, this.field1793);
        ++field1792;
        this.method916(111);
        if (arg0 != 3) {
            field1777 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(Z)V")
    public static void method920(boolean arg0) {
        field1782 = null;
        field1777 = null;
        if (!arg0) {
            field1779 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)Lae;")
    public static final class277 method921(int arg0, int arg1) {
        ++field1788;
        if (class112.field1734 && ~class193.field2799 >= ~arg1 && ~arg1 >= ~class200.field2874) {
            return arg0 > -98 ? null : class72.field1045[-class193.field2799 + arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        if (arg1 != -10) {
            method921(-97, -30);
        }
        ++field1775;
        int[] var3 = super.field5892.method783(arg0, (byte) -45);
        if (super.field5892.field1427) {
            int var4 = class409.field5711[arg0] * this.field1787 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; ~class303.field4135 < ~var7; ++var7) {
                class381.field5250 = Integer.MAX_VALUE;
                class49.field632 = Integer.MAX_VALUE;
                class11.field101 = Integer.MAX_VALUE;
                class75.field1071 = Integer.MAX_VALUE;
                int var8 = class332.field4478[var7] * this.field1776 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = this.field1786[255 & (this.field1787 > var11 ? var11 : -this.field1787 + var11)] & 255;
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = (this.field1786[(~this.field1776 < ~var14 ? var14 : var14 - this.field1776) + var13 & 255] & 255) * 2;
                        int var27 = var15 + 1;
                        int var16 = -this.field1789[var15] + -(var14 << 12) + var8;
                        int var17 = -this.field1789[var27] - (var11 << 12) + var4;
                        int var18 = this.field1784;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (var16 < 0 ? -var16 : var16) - -(var17 >= 0 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 - -var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 > -1 ? -var17 : var17;
                                int var26 = ~var16 > -1 ? -var16 : var16;
                                var19 = var25 < var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~class75.field1071 < ~var19) {
                            class381.field5250 = class49.field632;
                            class49.field632 = class11.field101;
                            class11.field101 = class75.field1071;
                            class75.field1071 = var19;
                        } else if (~var19 > ~class11.field101) {
                            class381.field5250 = class49.field632;
                            class49.field632 = class11.field101;
                            class11.field101 = var19;
                        } else if (var19 < class49.field632) {
                            class381.field5250 = class49.field632;
                            class49.field632 = var19;
                        } else if (class381.field5250 > var19) {
                            class381.field5250 = var19;
                        }
                    }
                }
                int var12 = this.field1785;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class75.field1071 + class11.field101;
                                }
                            } else {
                                var3[var7] = class381.field5250;
                            }
                        } else {
                            var3[var7] = class49.field632;
                        }
                    } else {
                        var3[var7] = class11.field101;
                    }
                } else {
                    var3[var7] = class75.field1071;
                }
            }
        }
        return var3;
    }
}
