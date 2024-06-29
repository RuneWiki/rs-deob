import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class419 extends class86 implements class147 {

    @OriginalMember(owner = "client!gt", name = "K", descriptor = "B")
    private byte field5930;

    @OriginalMember(owner = "client!gt", name = "U", descriptor = "Z")
    private boolean field5940;

    @OriginalMember(owner = "client!gt", name = "E", descriptor = "Z")
    private boolean field5924;

    @OriginalMember(owner = "client!gt", name = "R", descriptor = "S")
    private short field5937;

    @OriginalMember(owner = "client!gt", name = "T", descriptor = "B")
    private byte field5939;

    @OriginalMember(owner = "client!gt", name = "v", descriptor = "Z")
    private boolean field5915;

    @OriginalMember(owner = "client!gt", name = "C", descriptor = "B")
    private byte field5922;

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "Z")
    private boolean field5919;

    @OriginalMember(owner = "client!gt", name = "w", descriptor = "Lw;")
    private class271 field5916;

    @OriginalMember(owner = "client!gt", name = "L", descriptor = "Lba;")
    public class352 field5931;

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "[I")
    public static int[] field5911 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!gt", name = "s", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!gt", name = "u", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!gt", name = "x", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!gt", name = "A", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!gt", name = "D", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!gt", name = "F", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!gt", name = "G", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!gt", name = "H", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!gt", name = "I", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!gt", name = "J", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!gt", name = "M", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!gt", name = "N", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!gt", name = "O", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!gt", name = "P", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!gt", name = "Q", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!gt", name = "S", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!gt", name = "B", descriptor = "Lac;")
    private class496 field5921;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILoa;)Lwc;")
    public final class60 method555(int arg0, class638 arg1) {
        ++field5917;
        if (this.field5931 == null) {
            return null;
        } else {
            class391 var3 = arg1.method401();
            var3.method1288(super.field1178, super.field1182, super.field1183);
            class60 var4 = null;
            if (this.field5940) {
                var4 = class450.method2583(1, false);
            }
            this.field5931.method205(var3, var4 == null ? null : var4.field818[0], arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(II)I")
    public static final int method2389(int arg0, int arg1) {
        int var2 = -11 % ((arg1 - 57) / 60);
        ++field5927;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)I")
    public final int method554(int arg0) {
        if (arg0 != -18971) {
            return -128;
        } else {
            ++field5938;
            return 65535 & this.field5937;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IJ)V")
    public static final void method2390(int arg0, long arg1) {
        if (arg0 <= 27) {
            field5911 = null;
        }
        ++field5934;
        if (arg1 > 0L) {
            if (arg1 % 10L != 0L) {
                class615.method3401(-1, arg1);
            } else {
                class615.method3401(-1, arg1 - 1L);
                class615.method3401(-1, 1L);
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "(I)Z")
    public final boolean method140(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field5918;
            return this.field5924;
        }
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)Z")
    public final boolean method562(int arg0) {
        if (arg0 != 29008) {
            field5911 = null;
        }
        ++field5925;
        return this.field5919;
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Loa;Llt;IIIIZIIZ)V")
    public class419(class638 arg0, class620 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class196.method1319(arg7, 106, arg8));
        super.field1183 = arg5;
        this.field5930 = (byte) arg2;
        this.field5940 = arg1.field8592 != 0 && !arg6;
        this.field5924 = arg9;
        this.field5937 = (short) arg1.field8621;
        this.field5939 = (byte) arg7;
        this.field5915 = arg6;
        this.field5922 = (byte) arg8;
        super.field1178 = arg3;
        this.field5919 = arg0.method423() && arg1.field8563 && !this.field5915 && class274.field3872.method543(class429.field6020, (byte) 20) != 0;
        int var11 = 2048;
        if (this.field5924) {
            var11 |= 65536;
        }
        class156 var12 = this.method2393(5838, var11, arg0, this.field5919);
        if (var12 != null) {
            this.field5916 = var12.field2358;
            this.field5931 = var12.field2355;
            if (this.field5924) {
                this.field5931 = this.field5931.method235((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILoa;I)Lba;")
    private final class352 method2391(int arg0, class638 arg1, int arg2) {
        if (arg0 != 0) {
            this.field5915 = true;
        }
        ++field5928;
        if (this.field5931 != null && arg1.method431(this.field5931.method189(), arg2) == 0) {
            return this.field5931;
        } else {
            class156 var4 = this.method2393(arg0 ^ 5838, arg2, arg1, false);
            return var4 == null ? null : var4.field2355;
        }
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)I")
    public final int method560(int arg0) {
        ++field5913;
        if (arg0 != 15654) {
            this.field5921 = null;
        }
        return this.field5922;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method559(int arg0, int arg1, class638 arg2, int arg3) {
        ++field5926;
        class352 var5 = this.method2391(arg1 + 8003, arg2, 131072);
        if (arg1 != -8003) {
            this.method142(false);
        }
        if (var5 != null) {
            class391 var6 = arg2.method401();
            var6.method1288(super.field1178, super.field1182, super.field1183);
            return var5.method237(arg0, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Loa;B)Lac;")
    public final class496 method551(class638 arg0, byte arg1) {
        if (this.field5921 == null) {
            this.field5921 = class687.method3783(super.field1178, super.field1182, this.method2391(0, arg0, 0), super.field1183, -128);
        }
        if (arg1 >= -62) {
            this.field5915 = true;
        }
        ++field5936;
        return this.field5921;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
    public static void method2392(byte arg0) {
        field5911 = null;
        if (arg0 != -50) {
            field5911 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZLoa;)V")
    public final void method552(boolean arg0, class638 arg1) {
        ++field5920;
        if (!arg0) {
            this.field5939 = -86;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)V")
    public final void method142(boolean arg0) {
        ++field5933;
        this.field5924 = arg0;
        if (this.field5931 != null) {
            this.field5931.method216(-65537 & this.field5931.method189());
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILgfa;IIZLoa;)V")
    public final void method143(int arg0, int arg1, class687 arg2, int arg3, int arg4, boolean arg5, class638 arg6) {
        ++field5909;
        if (arg2 instanceof class419) {
            class419 var8 = (class419) arg2;
            if (this.field5931 != null && var8.field5931 != null) {
                this.field5931.method230(var8.field5931, arg1, arg4, arg0, arg5);
            }
        } else if (arg2 instanceof class315) {
            class315 var9 = (class315) arg2;
            if (this.field5931 != null && var9.field4668 != null) {
                this.field5931.method230(var9.field4668, arg1, arg4, arg0, arg5);
            }
        }
        int var10 = 105 % (-arg3 / 54);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILoa;)Lba;")
    public final class352 method548(int arg0, int arg1, class638 arg2) {
        ++field5910;
        if (arg0 != -585) {
            this.field5931 = null;
        }
        return this.method2391(0, arg2, arg1);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILoa;Z)Lcda;")
    private final class156 method2393(int arg0, int arg1, class638 arg2, boolean arg3) {
        ++field5923;
        if (arg0 != 5838) {
            this.field5940 = true;
        }
        class620 var5 = class164.field2499.method2013(this.field5937 & 65535, false);
        class136 var6;
        class136 var7;
        if (!this.field5915) {
            if (this.field5930 >= 3) {
                var6 = null;
            } else {
                var6 = class31.field369[this.field5930 + 1];
            }
            var7 = class31.field369[this.field5930];
        } else {
            var6 = class31.field369[0];
            var7 = class581.field8114[this.field5930];
        }
        return var5.method3458(arg1, var6, super.field1182, this.field5939, var7, super.field1183, arg3, arg0 ^ -5815, super.field1178, this.field5922, arg2);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLoa;)V")
    public final void method556(byte arg0, class638 arg1) {
        ++field5932;
        if (arg0 >= 5) {
            Object var3 = null;
            class271 var5;
            if (this.field5916 == null && this.field5919) {
                class156 var4 = this.method2393(5838, 262144, arg1, true);
                var5 = var4 == null ? null : var4.field2358;
            } else {
                var5 = this.field5916;
                this.field5916 = null;
            }
            if (var5 != null) {
                class192.method1283(var5, this.field5930, super.field1178, super.field1183, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(BLoa;)V")
    public final void method561(byte arg0, class638 arg1) {
        ++field5929;
        if (arg0 == 111) {
            Object var3 = null;
            class271 var5;
            if (this.field5916 == null && this.field5919) {
                class156 var4 = this.method2393(arg0 ^ 5793, 262144, arg1, true);
                var5 = var4 == null ? null : var4.field2358;
            } else {
                var5 = this.field5916;
                this.field5916 = null;
            }
            if (var5 != null) {
                class293.method1837(var5, this.field5930, super.field1178, super.field1183, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)I")
    public final int method549(int arg0) {
        if (arg0 != 12352) {
            return -113;
        } else {
            ++field5935;
            return this.field5939;
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)V")
    public final void method550(int arg0) {
        ++field5914;
        if (this.field5931 != null) {
            this.field5931.method228();
        }
        if (arg0 > -4) {
            this.method555(64, (class638) null);
        }
    }
}
