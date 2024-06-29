import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class619 extends class585 {

    @OriginalMember(owner = "client!et", name = "G", descriptor = "J")
    public static long field8647 = 0L;

    @OriginalMember(owner = "client!et", name = "O", descriptor = "Lhfa;")
    public static class329 field8655 = new class329();

    @OriginalMember(owner = "client!et", name = "F", descriptor = "I")
    public static int field8646;

    @OriginalMember(owner = "client!et", name = "H", descriptor = "I")
    public static int field8648;

    @OriginalMember(owner = "client!et", name = "I", descriptor = "I")
    public static int field8649;

    @OriginalMember(owner = "client!et", name = "J", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!et", name = "K", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!et", name = "L", descriptor = "I")
    public static int field8652;

    @OriginalMember(owner = "client!et", name = "N", descriptor = "I")
    public static int field8654;

    @OriginalMember(owner = "client!et", name = "P", descriptor = "I")
    public static int field8656;

    @OriginalMember(owner = "client!et", name = "M", descriptor = "Ljava/lang/Object;")
    public static Object field8653;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(III)V")
    public static final void method3573(int arg0, int arg1, int arg2) {
        int var3 = 88 % ((arg2 - -20) / 46);
        ++field8651;
        if (class60.field734 != class588.field8297) {
            if (!class394.method2436(1, -3, 1, arg1, false, arg0, 0, 0, 0)) {
                class394.method2436(1, -2, 1, arg1, false, arg0, 0, 0, 0);
            }
        } else if (!class394.method2436(1, -2, 1, arg1, false, arg0, 0, 0, 0)) {
            class394.method2436(1, -3, 1, arg1, false, arg0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V")
    public static void method3574(int arg0) {
        field8653 = null;
        field8655 = null;
        if (arg0 != 0) {
            method3574(-75);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method58(boolean arg0, int arg1) {
        ++field8656;
        if (arg0) {
            this.method58(false, 8);
        }
        int[][] var3 = super.field8265.method1576((byte) 100, arg1);
        if (super.field8265.field3546) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class293.field4278 < ~var7; ++var7) {
                this.method3577(var7, true, arg1);
                int[][] var8 = this.method3417(0, class442.field6029, (byte) 113);
                var4[var7] = var8[0][class637.field8946];
                var5[var7] = var8[1][class637.field8946];
                var6[var7] = var8[2][class637.field8946];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field8649;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (super.field8255.field3677) {
            for (int var4 = 0; ~var4 > ~class293.field4278; ++var4) {
                this.method3577(var4, true, arg0);
                int[] var5 = this.method3415(-127, 0, class442.field6029);
                var3[var4] = var5[class637.field8946];
            }
        }
        return arg1 <= 123 ? null : var3;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lqe;ILbr;ILha;I)Z")
    public static final boolean method3575(class492 arg0, int arg1, class413 arg2, int arg3, class65 arg4, int arg5) {
        ++field8648;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg2.field5629 != null) {
            var8 = -((arg2.field5640 - (-arg0.field6969 + class117.field1813)) * (-class117.field1823 + class117.field1822) / (-class117.field1813 + class117.field1811)) + class117.field1822;
            var6 = class117.field1819 - -((arg2.field5661 - class117.field1814 + arg0.field6970) * (-class117.field1819 + class117.field1820) / (-class117.field1814 + class117.field1808));
            var7 = class117.field1819 - -((-class117.field1814 + arg2.field5635 - -arg0.field6970) * (class117.field1820 - class117.field1819) / (-class117.field1814 + class117.field1808));
            var9 = -((-class117.field1813 + arg0.field6969 + arg2.field5650) * (-class117.field1823 + class117.field1822) / (-class117.field1813 + class117.field1811)) + class117.field1822;
        }
        class241 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg2.field5625 != -1) {
            if (arg0.field6974 && ~arg2.field5654 != 0) {
                var10 = arg2.method2506(true, 105, arg4);
            } else {
                var10 = arg2.method2506(false, arg3 + 116, arg4);
            }
            if (var10 != null) {
                var11 = arg0.field6972 - (1 + var10.method1507() >> 1);
                var12 = arg0.field6972 - -(var10.method1507() - -1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                if (var12 > var7) {
                    var7 = var12;
                }
                var13 = arg0.field6976 + -(var10.method1505() + 1 >> 1);
                if (~var8 < ~var13) {
                    var8 = var13;
                }
                var14 = arg0.field6976 - -(var10.method1505() - -1 >> 1);
                if (~var9 > ~var14) {
                    var9 = var14;
                }
            }
        }
        class660 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg2.field5646 != null) {
            var15 = class20.method218(arg2.field5623, arg3 ^ -97);
            if (var15 != null) {
                var16 = class460.field6446.method36((int[]) null, class132.field1988, (class241[]) null, arg2.field5646, (byte) -52);
                int var24 = -((class117.field1822 - class117.field1823) * arg2.field5615 / (-class117.field1813 + class117.field1811)) + arg0.field6976;
                var17 = (-class117.field1819 + class117.field1820) * arg2.field5632 / (-class117.field1814 + class117.field1808) + arg0.field6972;
                if (var10 == null) {
                    var18 = var24 - var16 * var15.method3768() / 2;
                } else {
                    var18 = var24 - ((var10.method1505() >> 1) + var16 * var15.method3767());
                }
                for (int var25 = 0; var25 < var16; ++var25) {
                    String var26 = class132.field1988[var25];
                    if (var16 - 1 > var25) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var15.method3770(var26);
                    if (~var27 < ~var19) {
                        var19 = var27;
                    }
                }
                var20 = var17 - var19 / 2 + arg1;
                if (var6 > var20) {
                    var6 = var20;
                }
                var21 = arg1 + var17 - -(var19 / 2);
                if (var7 < var21) {
                    var7 = var21;
                }
                var22 = arg5 + var18;
                if (~var22 > ~var8) {
                    var8 = var22;
                }
                var23 = arg5 + var15.method3767() * var16 + var18;
                if (~var9 > ~var23) {
                    var9 = var23;
                }
            }
        }
        if (arg3 != 1) {
            return true;
        } else if (var7 >= class117.field1819 && class117.field1820 >= var6 && class117.field1823 <= var9 && ~class117.field1822 <= ~var8) {
            class117.method894(arg4, arg0, arg2);
            if (var10 != null) {
                if (class503.field7134 > 0 && (~class735.field10154 != 0 && class735.field10154 == arg0.field6971 || class399.field5481 != -1 && class399.field5481 == arg2.field5656)) {
                    int var28;
                    if (~class788.field10817 < -51) {
                        var28 = (100 - class788.field10817) * 2;
                    } else {
                        var28 = class788.field10817 * 2;
                    }
                    int var29 = 16776960 | var28 << 24;
                    arg4.method445(arg0.field6976, arg0.field6972, (byte) -17, var10.method1508() / 2 + 7, var29);
                    arg4.method445(arg0.field6976, arg0.field6972, (byte) -17, var10.method1508() / 2 + 5, var29);
                    arg4.method445(arg0.field6976, arg0.field6972, (byte) -17, 3 + var10.method1508() / 2, var29);
                    arg4.method445(arg0.field6976, arg0.field6972, (byte) -17, 1 + var10.method1508() / 2, var29);
                    arg4.method445(arg0.field6976, arg0.field6972, (byte) -17, var10.method1508() / 2, var29);
                }
                var10.method1604(arg0.field6972 + -(var10.method1507() >> 1), arg0.field6976 + -(var10.method1505() >> 1));
            }
            if (arg2.field5646 != null && var15 != null) {
                class291.method1865(var19, var17, arg0, arg2, var15, arg4, var18, arg3 + -20008, var16);
            }
            if (arg2.field5625 != -1 || arg2.field5646 != null) {
                class348 var30 = new class348(arg0);
                var30.field4864 = var14;
                var30.field4865 = var12;
                var30.field4862 = var21;
                var30.field4873 = var13;
                var30.field4871 = var23;
                var30.field4875 = var22;
                var30.field4872 = var20;
                var30.field4876 = var11;
                class776.field10670.method1727(var30, (byte) 124);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
    public class619() {
        super(1, false);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lso;II)V")
    public final void method54(class494 arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            field8650 = 79;
        }
        if (~arg2 == -1) {
            super.field8266 = ~arg0.method2964((byte) 36) == -2;
        }
        ++field8652;
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(I)V")
    public static final void method3576(int arg0) {
        if (arg0 <= 8) {
            method3576(-126);
        }
        class119.field1835 = false;
        ++field8646;
        class351.method2224((byte) 119);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IZI)V")
    private final void method3577(int arg0, boolean arg1, int arg2) {
        ++field8654;
        int var4 = class581.field8200[arg0];
        int var5 = class633.field8892[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if (!arg1) {
            this.method54((class494) null, 81, -112);
        }
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class442.field6029 = arg2;
            class637.field8946 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class637.field8946 = arg2;
            class442.field6029 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class637.field8946 = -arg2 + class293.field4278;
            class442.field6029 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class637.field8946 = arg0;
            class442.field6029 = -arg2 + class270.field3923;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class442.field6029 = -arg2 + class270.field3923;
            class637.field8946 = -arg0 + class293.field4278;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class442.field6029 = -arg0 + class270.field3923;
            class637.field8946 = -arg2 + class293.field4278;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class637.field8946 = arg2;
            class442.field6029 = -arg0 + class270.field3923;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class442.field6029 = arg2;
            class637.field8946 = class293.field4278 - arg0;
        }
        class637.field8946 &= class625.field8759;
        class442.field6029 &= class305.field4391;
    }
}
