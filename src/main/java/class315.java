import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class315 extends class39 implements class147 {

    @OriginalMember(owner = "client!ow", name = "J", descriptor = "Z")
    private boolean field4680;

    @OriginalMember(owner = "client!ow", name = "V", descriptor = "B")
    private byte field4692;

    @OriginalMember(owner = "client!ow", name = "w", descriptor = "S")
    private short field4667;

    @OriginalMember(owner = "client!ow", name = "Z", descriptor = "Z")
    private boolean field4696;

    @OriginalMember(owner = "client!ow", name = "U", descriptor = "B")
    private byte field4691;

    @OriginalMember(owner = "client!ow", name = "I", descriptor = "B")
    private byte field4679;

    @OriginalMember(owner = "client!ow", name = "X", descriptor = "Z")
    private boolean field4694;

    @OriginalMember(owner = "client!ow", name = "S", descriptor = "Z")
    private boolean field4689;

    @OriginalMember(owner = "client!ow", name = "x", descriptor = "Lba;")
    public class352 field4668;

    @OriginalMember(owner = "client!ow", name = "P", descriptor = "Lw;")
    private class271 field4686;

    @OriginalMember(owner = "client!ow", name = "Q", descriptor = "[I")
    public static int[] field4687 = new int[50];

    @OriginalMember(owner = "client!ow", name = "y", descriptor = "Luj;")
    public static class349 field4669 = new class349();

    @OriginalMember(owner = "client!ow", name = "ab", descriptor = "I")
    public static int field4697 = 0;

    @OriginalMember(owner = "client!ow", name = "u", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!ow", name = "v", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!ow", name = "z", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!ow", name = "A", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!ow", name = "B", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!ow", name = "C", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!ow", name = "D", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!ow", name = "E", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!ow", name = "F", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!ow", name = "H", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!ow", name = "K", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!ow", name = "L", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!ow", name = "M", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!ow", name = "N", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!ow", name = "O", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!ow", name = "R", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!ow", name = "T", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!ow", name = "W", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!ow", name = "Y", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!ow", name = "bb", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!ow", name = "cb", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!ow", name = "G", descriptor = "Lac;")
    private class496 field4677;

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)V")
    public final void method550(int arg0) {
        if (this.field4668 != null) {
            this.field4668.method228();
        }
        ++field4676;
        if (arg0 >= -4) {
            this.field4689 = false;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IILoa;)Lba;")
    public final class352 method548(int arg0, int arg1, class638 arg2) {
        if (arg0 != -585) {
            return null;
        } else {
            ++field4682;
            return this.method1932(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(BLoa;)V")
    public final void method561(byte arg0, class638 arg1) {
        ++field4670;
        if (arg0 != 111) {
            this.field4694 = true;
        }
        Object var3 = null;
        class271 var5;
        if (this.field4686 == null && this.field4689) {
            class156 var4 = this.method1931(arg1, 262144, arg0 ^ 39, true);
            var5 = var4 == null ? null : var4.field2358;
        } else {
            var5 = this.field4686;
            this.field4686 = null;
        }
        if (var5 != null) {
            class293.method1837(var5, this.field4691, super.field509, super.field514, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "(I)I")
    public final int method549(int arg0) {
        if (arg0 != 12352) {
            return -57;
        } else {
            ++field4684;
            return this.field4679;
        }
    }

    @OriginalMember(owner = "client!ow", name = "g", descriptor = "(I)Z")
    public final boolean method140(int arg0) {
        if (arg0 != 0) {
            this.field4696 = false;
        }
        ++field4693;
        return this.field4696;
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Loa;Llt;IIIIIZIIIIIIZ)V")
    public class315(class638 arg0, class620 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field8652 == -2, class540.method2975(arg13, -112, arg12));
        this.field4680 = arg7;
        this.field4692 = (byte) arg13;
        this.field4667 = (short) arg1.field8621;
        this.field4696 = arg14;
        this.field4691 = (byte) arg3;
        this.field4679 = (byte) arg12;
        this.field4694 = arg1.field8592 != 0 && !arg7;
        this.field4689 = arg0.method423() && arg1.field8563 && !this.field4680 && class274.field3872.method543(class429.field6020, (byte) 20) != 0;
        int var16 = 2048;
        if (this.field4696) {
            var16 |= 65536;
        }
        class156 var17 = this.method1931(arg0, var16, 123, this.field4689);
        if (var17 != null) {
            this.field4668 = var17.field2355;
            this.field4686 = var17.field2358;
            if (this.field4696) {
                this.field4668 = this.field4668.method235((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILoa;)Lwc;")
    public final class60 method555(int arg0, class638 arg1) {
        ++field4672;
        if (this.field4668 == null) {
            return null;
        } else {
            class391 var3 = arg1.method401();
            var3.method1288(super.field509, super.field518, super.field514);
            class60 var4 = null;
            if (this.field4694) {
                var4 = class450.method2583(1, false);
            }
            this.field4668.method205(var3, var4 == null ? null : var4.field818[0], arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method559(int arg0, int arg1, class638 arg2, int arg3) {
        ++field4688;
        class352 var5 = this.method1932(131072, 0, arg2);
        if (var5 != null) {
            class391 var6 = arg2.method401();
            var6.method1288(super.field509, super.field518, super.field514);
            return var5.method237(arg0, arg3, var6, false);
        } else {
            if (arg1 != -8003) {
                this.field4677 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ow", name = "i", descriptor = "(I)I")
    public final int method179(int arg0) {
        if (arg0 != -1) {
            return -22;
        } else {
            ++field4678;
            return this.field4668 != null ? this.field4668.method220() : 0;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(BLoa;)V")
    public final void method556(byte arg0, class638 arg1) {
        ++field4698;
        Object var3 = null;
        class271 var5;
        if (this.field4686 == null && this.field4689) {
            class156 var4 = this.method1931(arg1, 262144, 112, true);
            var5 = var4 == null ? null : var4.field2358;
        } else {
            var5 = this.field4686;
            this.field4686 = null;
        }
        if (var5 != null) {
            class192.method1283(var5, this.field4691, super.field509, super.field514, (boolean[]) null);
        }
        if (arg0 < 5) {
            this.method179(-54);
        }
    }

    @OriginalMember(owner = "client!ow", name = "k", descriptor = "(I)V")
    public static void method1927(int arg0) {
        field4669 = null;
        field4687 = null;
        if (arg0 != 0) {
            method1927(102);
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIIII[B)Z")
    public static final boolean method1928(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        ++field4673;
        boolean var6 = true;
        class96 var7 = new class96(arg5);
        if (arg3 != -2456) {
            method1927(-11);
        }
        int var8 = -1;
        label58: while (true) {
            int var9 = var7.method702((byte) 79);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method733((byte) 110);
                    if (var13 == 0) {
                        continue label58;
                    }
                    var10 += var13 - 1;
                    int var14 = 63 & var10;
                    int var15 = (4034 & var10) >> 6;
                    int var16 = var7.method718(81) >> 2;
                    int var17 = arg1 + var15;
                    int var18 = arg2 + var14;
                    if (var17 > 0 && ~var18 < -1 && ~var17 > ~(arg4 + -1) && arg0 - 1 > var18) {
                        class620 var19 = class164.field2499.method2013(var8, false);
                        if (~var16 != -23 || class274.field3872.field916 || var19.field8592 != 0 || ~var19.field8627 == -2 || var19.field8578) {
                            var11 = true;
                            if (!var19.method3457(-7790)) {
                                var6 = false;
                                ++class336.field4907;
                            }
                        }
                    }
                }
                int var12 = var7.method733((byte) 93);
                if (var12 == 0) {
                    break;
                }
                var7.method718(-59);
            }
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Z)V")
    public final void method142(boolean arg0) {
        this.field4696 = arg0;
        ++field4674;
        if (this.field4668 != null) {
            this.field4668.method216(this.field4668.method189() & -65537);
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIII)I")
    public static final int method1929(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 3;
        ++field4699;
        if (var4 == 0) {
            return arg0;
        } else if (arg2 != 65535) {
            return 30;
        } else if (~var4 == -2) {
            return arg1;
        } else {
            return var4 == 2 ? 7 - arg0 : -arg1 + 7;
        }
    }

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "(I)I")
    public final int method560(int arg0) {
        if (arg0 != 15654) {
            return -59;
        } else {
            ++field4671;
            return this.field4692;
        }
    }

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "(I)Z")
    public final boolean method562(int arg0) {
        ++field4665;
        return arg0 != 29008 ? true : this.field4689;
    }

    @OriginalMember(owner = "client!ow", name = "l", descriptor = "(I)I")
    public final int method1930(int arg0) {
        if (arg0 >= -59) {
            return 36;
        } else {
            ++field4690;
            return this.field4668 == null ? 15 : this.field4668.method196() / 4;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IILgfa;IIZLoa;)V")
    public final void method143(int arg0, int arg1, class687 arg2, int arg3, int arg4, boolean arg5, class638 arg6) {
        ++field4695;
        if (!(arg2 instanceof class419)) {
            if (arg2 instanceof class315) {
                class315 var8 = (class315) arg2;
                if (this.field4668 != null && var8.field4668 != null) {
                    this.field4668.method230(var8.field4668, arg1, arg4, arg0, arg5);
                }
            }
        } else {
            class419 var9 = (class419) arg2;
            if (this.field4668 != null && var9.field5931 != null) {
                this.field4668.method230(var9.field5931, arg1, arg4, arg0, arg5);
            }
        }
        int var10 = 38 / (arg3 / 54);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZLoa;)V")
    public final void method552(boolean arg0, class638 arg1) {
        if (!arg0) {
            this.method549(-39);
        }
        ++field4683;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Loa;IIZ)Lcda;")
    private final class156 method1931(class638 arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 <= 62) {
            return null;
        } else {
            ++field4681;
            class620 var5 = class164.field2499.method2013(this.field4667 & 65535, false);
            class136 var6;
            class136 var7;
            if (this.field4680) {
                var6 = class31.field369[0];
                var7 = class581.field8114[this.field4691];
            } else {
                var7 = class31.field369[this.field4691];
                if (~this.field4691 <= -4) {
                    var6 = null;
                } else {
                    var6 = class31.field369[this.field4691 + 1];
                }
            }
            return var5.method3458(arg1, var6, super.field518, ~this.field4679 != -12 ? this.field4679 : 10, var7, super.field514, arg3, -115, super.field509, ~this.field4679 != -12 ? this.field4692 : this.field4692 + 4, arg0);
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Loa;B)Lac;")
    public final class496 method551(class638 arg0, byte arg1) {
        if (arg1 > -62) {
            this.field4692 = 25;
        }
        if (this.field4677 == null) {
            this.field4677 = class687.method3783(super.field509, super.field518, this.method1932(0, 0, arg0), super.field514, -103);
        }
        ++field4675;
        return this.field4677;
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(IILoa;)Lba;")
    private final class352 method1932(int arg0, int arg1, class638 arg2) {
        ++field4666;
        if (this.field4668 != null && ~arg2.method431(this.field4668.method189(), arg0) == -1) {
            return this.field4668;
        } else {
            class156 var4 = this.method1931(arg2, arg0, 95, false);
            if (arg1 != 0) {
                return null;
            } else {
                return var4 == null ? null : var4.field2355;
            }
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)I")
    public final int method554(int arg0) {
        ++field4685;
        return arg0 != -18971 ? -110 : this.field4667 & 65535;
    }
}
