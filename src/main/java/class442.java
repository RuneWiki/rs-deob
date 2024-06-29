import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class442 extends class133 implements class171 {

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "Z")
    private boolean field6102;

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "B")
    private byte field6118;

    @OriginalMember(owner = "client!qb", name = "gb", descriptor = "S")
    private short field6125;

    @OriginalMember(owner = "client!qb", name = "fb", descriptor = "Z")
    private boolean field6124;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "B")
    private byte field6105;

    @OriginalMember(owner = "client!qb", name = "eb", descriptor = "B")
    private byte field6123;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "Z")
    private boolean field6099;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "Z")
    private boolean field6111;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "Lgi;")
    private class416 field6100;

    @OriginalMember(owner = "client!qb", name = "cb", descriptor = "Lge;")
    public class386 field6121;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!qb", name = "bb", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!qb", name = "db", descriptor = "I")
    public static int field6122;

    static {
        new class72("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLuo;)V", line = 4)
    public final void method138(byte arg0, class118 arg1) {
        if (arg0 > 78) {
            ++field6112;
        }
    }

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)I", line = 14)
    public final int method2738(int arg0) {
        ++field6098;
        if (arg0 != 4) {
            this.field6125 = 11;
        }
        return this.field6121 == null ? 15 : this.field6121.method1484() / 4;
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V", line = 31)
    public final void method140(int arg0) {
        if (arg0 > -24) {
            this.field6102 = true;
        }
        this.field6099 = false;
        ++field6115;
        if (this.field6121 != null) {
            this.field6121.method1460(-32769 & this.field6121.method1465());
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)Z", line = 46)
    public final boolean method129(int arg0) {
        if (arg0 != 3652) {
            this.method138((byte) 77, (class118) null);
        }
        ++field6110;
        return this.field6099;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Luo;IIZ)Z", line = 58)
    public final boolean method134(class118 arg0, int arg1, int arg2, boolean arg3) {
        ++field6107;
        if (!arg3) {
            return true;
        } else {
            class386 var5 = this.method2740(65536, arg0, -4);
            if (var5 != null) {
                class450 var6 = arg0.method742();
                var6.method929(super.field1516, super.field1521, super.field1514);
                return var5.method1474(arg1, arg2, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLuo;ZI)Lcb;", line = 80)
    private final class52 method2739(byte arg0, class118 arg1, boolean arg2, int arg3) {
        ++field6108;
        class446 var5 = class380.method2361(65535 & this.field6125, -29012);
        if (arg0 != -68) {
            this.method412(-49);
        }
        class279 var6;
        class279 var7;
        if (!this.field6102) {
            var6 = class219.field2709[this.field6118];
            if (~this.field6118 <= -4) {
                var7 = null;
            } else {
                var7 = class219.field2709[this.field6118 + 1];
            }
        } else {
            var7 = class219.field2709[0];
            var6 = class75.field915[this.field6118];
        }
        return var5.method2774(var7, ~this.field6123 != -12 ? this.field6105 : this.field6105 + 4, super.field1521, super.field1514, super.field1516, false, var6, this.field6123 == 11 ? 10 : this.field6123, arg1, arg3, arg2);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Luo;IIIZBLpc;)V", line = 112)
    public final void method137(class118 arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, class22 arg6) {
        ++field6120;
        if (arg6 instanceof class420) {
            class420 var8 = (class420) arg6;
            if (this.field6121 != null && var8.field5743 != null) {
                this.field6121.method1476(var8.field5743, arg2, arg3, arg1, arg4);
            }
        } else if (arg6 instanceof class442) {
            class442 var9 = (class442) arg6;
            if (this.field6121 != null && var9.field6121 != null) {
                this.field6121.method1476(var9.field6121, arg2, arg3, arg1, arg4);
            }
        }
        if (arg5 > -115) {
            this.method2740(75, (class118) null, 97);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Luo;B)V", line = 144)
    public final void method422(class118 arg0, byte arg1) {
        ++field6106;
        Object var3 = null;
        class416 var5;
        if (this.field6100 == null && this.field6111) {
            class52 var4 = this.method2739((byte) -68, arg0, true, 131072);
            var5 = var4 != null ? var4.field611 : null;
        } else {
            var5 = this.field6100;
            this.field6100 = null;
        }
        if (var5 != null) {
            class434.method2649(var5, this.field6118, super.field1516, super.field1514, (boolean[]) null);
        }
        if (arg1 != -7) {
            this.method423(98);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)Z", line = 172)
    public final boolean method412(int arg0) {
        if (arg0 != 18942) {
            this.method420((byte) 105);
        }
        ++field6103;
        return this.field6111;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)I", line = 183)
    public final int method409(int arg0) {
        if (arg0 != -50) {
            this.method409(34);
        }
        ++field6097;
        return 65535 & this.field6125;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILuo;I)Lge;", line = 195)
    private final class386 method2740(int arg0, class118 arg1, int arg2) {
        ++field6117;
        if (this.field6121 != null && ~arg1.method721(this.field6121.method1465(), arg0) == -1) {
            return this.field6121;
        } else {
            if (arg2 != -4) {
                this.method422((class118) null, (byte) -16);
            }
            class52 var4 = this.method2739((byte) -68, arg1, false, arg0);
            return var4 != null ? var4.field610 : null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)I", line = 216)
    public final int method417(byte arg0) {
        ++field6114;
        if (arg0 != -116) {
            this.field6121 = null;
        }
        return this.field6105;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(Luo;B)Lkj;", line = 227)
    public final class175 method130(class118 arg0, byte arg1) {
        ++field6119;
        if (this.field6121 == null) {
            return null;
        } else {
            int var3 = 14 / ((11 - arg1) / 37);
            class450 var4 = arg0.method742();
            var4.method929(super.field1516, super.field1521, super.field1514);
            class175 var5 = null;
            if (this.field6124) {
                var5 = class68.method392((byte) -33, 1);
            }
            this.field6121.method1441(var4, var5 != null ? var5.field2030[0] : null, 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Luo;Lnd;IIIIIZIIIIIIZ)V", line = 252)
    public class442(class118 arg0, class446 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field6215 == -2, class30.method187(0, arg13, arg12));
        this.field6102 = arg7;
        this.field6118 = (byte) arg3;
        this.field6125 = (short) arg1.field6209;
        this.field6124 = arg1.field6235 != 0 && !arg7;
        this.field6105 = (byte) arg13;
        this.field6123 = (byte) arg12;
        this.field6099 = arg14;
        this.field6111 = arg0.method708() && arg1.field6210 && !this.field6102 && class333.field4548 != 0;
        int var16 = 1024;
        if (this.field6099) {
            var16 |= 32768;
        }
        class52 var17 = this.method2739((byte) -68, arg0, this.field6111, var16);
        if (var17 != null) {
            this.field6100 = var17.field611;
            this.field6121 = var17.field610;
            if (this.field6099) {
                this.field6121 = this.field6121.method1459((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V", line = 284)
    public final void method423(int arg0) {
        if (arg0 != 22486) {
            this.field6123 = 19;
        }
        if (this.field6121 != null) {
            this.field6121.method1454();
        }
        ++field6109;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)I", line = 300)
    public final int method420(byte arg0) {
        int var2 = -115 / ((arg0 - -21) / 44);
        ++field6122;
        return this.field6123;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Luo;B)V", line = 315)
    public final void method411(class118 arg0, byte arg1) {
        ++field6101;
        if (arg1 == 88) {
            Object var3 = null;
            class416 var5;
            if (this.field6100 == null && this.field6111) {
                class52 var4 = this.method2739((byte) -68, arg0, true, 131072);
                var5 = var4 == null ? null : var4.field611;
            } else {
                var5 = this.field6100;
                this.field6100 = null;
            }
            if (var5 != null) {
                class183.method1139(var5, this.field6118, super.field1516, super.field1514, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Luo;II)Lge;", line = 342)
    public final class386 method419(class118 arg0, int arg1, int arg2) {
        if (arg1 != -20264) {
            this.field6118 = 18;
        }
        ++field6104;
        return this.method2740(arg2, arg0, arg1 + 20260);
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)I", line = 356)
    public final int method246(byte arg0) {
        if (arg0 != 110) {
            this.field6125 = 2;
        }
        ++field6116;
        return this.field6121 != null ? this.field6121.method1458() : 0;
    }
}
