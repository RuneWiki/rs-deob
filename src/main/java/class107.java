import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class107 extends class448 implements class323 {

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "Z")
    private boolean field1453;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "B")
    private byte field1459;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "B")
    private byte field1450;

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "S")
    private short field1461;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "B")
    private byte field1445;

    @OriginalMember(owner = "client!ec", name = "gb", descriptor = "Z")
    private boolean field1469;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "Z")
    private boolean field1457;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "Z")
    private boolean field1448;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "Lc;")
    public class507 field1456;

    @OriginalMember(owner = "client!ec", name = "hb", descriptor = "Lj;")
    private class254 field1470;

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "[I")
    public static int[] field1460 = new int[13];

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field1451 = new String[8];

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ec", name = "cb", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!ec", name = "db", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!ec", name = "eb", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!ec", name = "fb", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "(I)V")
    public static void method703(int arg0) {
        if (arg0 != 4) {
            field1451 = null;
        }
        field1460 = null;
        field1451 = null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)I")
    public final int method414(int arg0) {
        if (arg0 != 17350) {
            this.field1470 = null;
        }
        ++field1466;
        return this.field1450;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)Z")
    public final boolean method417(boolean arg0) {
        ++field1447;
        return arg0 ? false : this.field1448;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public final void method173(byte arg0) {
        if (arg0 == -32) {
            this.field1469 = false;
            ++field1465;
            if (this.field1456 != null) {
                this.field1456.method517(-65537 & this.field1456.method475());
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)I")
    public final int method413(int arg0) {
        if (arg0 != -30502) {
            return -100;
        } else {
            ++field1452;
            return this.field1461 & 65535;
        }
    }

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "(I)I")
    public final int method180(int arg0) {
        int var2 = 21 / (-arg0 / 33);
        ++field1455;
        return this.field1456 != null ? this.field1456.method507() : 0;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lqa;B)V")
    public final void method421(class129 arg0, byte arg1) {
        ++field1458;
        Object var3 = null;
        class254 var5;
        if (this.field1470 == null && this.field1448) {
            class445 var4 = this.method704(262144, true, -23, arg0);
            var5 = var4 == null ? null : var4.field6182;
        } else {
            var5 = this.field1470;
            this.field1470 = null;
        }
        if (var5 != null) {
            class24.method161(var5, this.field1459, super.field6239, super.field6241, (boolean[]) null);
        }
        if (arg1 > -88) {
            this.field1445 = -71;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILqa;)Lc;")
    public final class507 method419(int arg0, int arg1, class129 arg2) {
        if (arg1 != -32039) {
            return null;
        } else {
            ++field1444;
            return this.method706(arg0, arg2, 124);
        }
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)Z")
    public final boolean method177(int arg0) {
        if (arg0 != 5) {
            return false;
        } else {
            ++field1467;
            return this.field1469;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Lqa;B)Lvs;")
    public final class465 method172(class129 arg0, byte arg1) {
        ++field1442;
        if (this.field1456 == null) {
            return null;
        } else {
            class142 var3 = arg0.method847();
            int var4 = 107 / ((48 - arg1) / 60);
            var3.method982(super.field6239, super.field6224, super.field6241);
            class465 var5 = null;
            if (this.field1457) {
                var5 = class92.method635(1, -16461);
            }
            this.field1456.method520(var3, var5 != null ? var5.field6843[0] : null, 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(IZILqa;)Ldf;")
    private final class445 method704(int arg0, boolean arg1, int arg2, class129 arg3) {
        ++field1454;
        class402 var5 = class52.field715.method1164(this.field1461 & 65535, 0);
        int var6 = 22 % ((-79 - arg2) / 44);
        class251 var7;
        class251 var8;
        if (this.field1453) {
            var7 = class283.field3620[this.field1459];
            var8 = class405.field5436[0];
        } else {
            var7 = class405.field5436[this.field1459];
            if (~this.field1459 > -4) {
                var8 = class405.field5436[this.field1459 + 1];
            } else {
                var8 = null;
            }
        }
        return var5.method2383(super.field6239, (byte) 20, arg1, arg0, var8, this.field1450 == 11 ? 10 : this.field1450, super.field6224, super.field6241, var7, ~this.field1450 != -12 ? this.field1445 : 4 - -this.field1445, arg3);
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)I")
    public final int method705(byte arg0) {
        ++field1441;
        if (arg0 != 125) {
            return -56;
        } else {
            return this.field1456 == null ? 15 : this.field1456.method519() / 4;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILqa;I)Lc;")
    private final class507 method706(int arg0, class129 arg1, int arg2) {
        ++field1443;
        if (this.field1456 != null && ~arg1.method880(this.field1456.method475(), arg0) == -1) {
            return this.field1456;
        } else {
            if (arg2 < 97) {
                this.method419(-126, -29, (class129) null);
            }
            class445 var4 = this.method704(arg0, false, -124, arg1);
            return var4 != null ? var4.field6188 : null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lqa;I)V")
    public final void method416(class129 arg0, int arg1) {
        if (arg1 != 16663) {
            this.field1459 = -71;
        }
        ++field1463;
        Object var3 = null;
        class254 var5;
        if (this.field1470 == null && this.field1448) {
            class445 var4 = this.method704(262144, true, 29, arg0);
            var5 = var4 != null ? var4.field6182 : null;
        } else {
            var5 = this.field1470;
            this.field1470 = null;
        }
        if (var5 != null) {
            class518.method3076(var5, this.field1459, super.field6239, super.field6241, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZILqa;)Z")
    public final boolean method179(int arg0, boolean arg1, int arg2, class129 arg3) {
        ++field1462;
        class507 var5 = this.method706(131072, arg3, 121);
        if (var5 != null) {
            class142 var6 = arg3.method847();
            var6.method982(super.field6239, super.field6224, super.field6241);
            return var5.method499(arg0, arg2, var6, false);
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lqa;Ljt;IIIIIZIIIIIIZ)V")
    public class107(class129 arg0, class402 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field5344 == -2, class451.method2674(arg13, arg12, (byte) 93));
        this.field1453 = arg7;
        this.field1459 = (byte) arg3;
        this.field1450 = (byte) arg12;
        this.field1461 = (short) arg1.field5377;
        this.field1445 = (byte) arg13;
        this.field1469 = arg14;
        this.field1457 = arg1.field5347 != 0 && !arg7;
        this.field1448 = arg0.method903() && arg1.field5420 && !this.field1453 && class421.field5647.method3097((byte) 117, class520.field7690) != 0;
        int var16 = 2048;
        if (this.field1469) {
            var16 |= 65536;
        }
        class445 var17 = this.method704(var16, this.field1448, 96, arg0);
        if (var17 != null) {
            this.field1456 = var17.field6188;
            this.field1470 = var17.field6182;
            if (this.field1469) {
                this.field1456 = this.field1456.method510((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLrn;ZIILqa;I)V")
    public final void method174(byte arg0, class242 arg1, boolean arg2, int arg3, int arg4, class129 arg5, int arg6) {
        ++field1464;
        if (arg0 != 91) {
            field1460 = null;
        }
        if (arg1 instanceof class218) {
            class218 var8 = (class218) arg1;
            if (this.field1456 != null && var8.field2809 != null) {
                this.field1456.method483(var8.field2809, arg6, arg4, arg3, arg2);
            }
        } else {
            if (arg1 instanceof class107) {
                class107 var9 = (class107) arg1;
                if (this.field1456 != null && var9.field1456 != null) {
                    this.field1456.method483(var9.field1456, arg6, arg4, arg3, arg2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
    public final void method418(int arg0) {
        if (this.field1456 != null) {
            this.field1456.method492();
        }
        if (arg0 != -14924) {
            this.field1453 = false;
        }
        ++field1449;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLqa;)V")
    public final void method175(byte arg0, class129 arg1) {
        ++field1468;
        if (arg0 != 91) {
            this.method174((byte) 0, (class242) null, false, -46, -41, (class129) null, -111);
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)I")
    public final int method415(int arg0) {
        if (arg0 != -15317) {
            this.method417(false);
        }
        ++field1446;
        return this.field1445;
    }
}
