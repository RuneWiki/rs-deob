import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class117 extends class261 implements class116 {

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "Z")
    private boolean field1429;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "S")
    private short field1427;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "B")
    private byte field1425;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "Z")
    private boolean field1447;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "B")
    private byte field1442;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "B")
    private byte field1431;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "Z")
    private boolean field1436;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "Z")
    private boolean field1430;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "Lqh;")
    public class352 field1441;

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "Lph;")
    private class125 field1438;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "Lku;")
    public static class362 field1446;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILoj;)V")
    public final void method20(int arg0, class280 arg1) {
        ++field1439;
        if (arg0 != 5744) {
            this.method16(false);
        }
        Object var3 = null;
        class125 var5;
        if (this.field1438 == null && this.field1430) {
            class324 var4 = this.method568(131072, arg1, 123, true);
            var5 = var4 == null ? null : var4.field4676;
        } else {
            var5 = this.field1438;
            this.field1438 = null;
        }
        if (var5 != null) {
            class47.method249(var5, this.field1442, super.field3760, super.field3759, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILoj;IZ)Lpr;")
    private final class324 method568(int arg0, class280 arg1, int arg2, boolean arg3) {
        if (arg2 < 4) {
            this.field1436 = true;
        }
        ++field1448;
        class415 var5 = class173.field2084.method2297(50, this.field1427 & 65535);
        class443 var6;
        class443 var7;
        if (!this.field1436) {
            if (this.field1442 >= 3) {
                var6 = null;
            } else {
                var6 = class443.field6329[this.field1442 + 1];
            }
            var7 = class443.field6329[this.field1442];
        } else {
            var6 = class443.field6329[0];
            var7 = class361.field5208[this.field1442];
        }
        return var5.method2466(var7, var6, this.field1425, arg3, this.field1431, super.field3760, (byte) 99, super.field3758, super.field3759, arg1, arg0);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZLa;IBLoj;)V")
    public final void method23(int arg0, int arg1, boolean arg2, class78 arg3, int arg4, byte arg5, class280 arg6) {
        if (arg3 instanceof class117) {
            class117 var8 = (class117) arg3;
            if (this.field1441 != null && var8.field1441 != null) {
                this.field1441.method1745(var8.field1441, arg0, arg1, arg4, arg2);
            }
        } else if (arg3 instanceof class181) {
            class181 var9 = (class181) arg3;
            if (this.field1441 != null && var9.field2323 != null) {
                this.field1441.method1745(var9.field2323, arg0, arg1, arg4, arg2);
            }
        }
        if (arg5 != -65) {
            this.field1438 = null;
        }
        ++field1433;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)Z")
    public final boolean method22(int arg0) {
        if (arg0 > -32) {
            return true;
        } else {
            ++field1443;
            return this.field1430;
        }
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)Z")
    public final boolean method33(int arg0) {
        if (arg0 != 1957) {
            this.field1441 = null;
        }
        ++field1434;
        return this.field1447;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(ILoj;)V")
    public final void method18(int arg0, class280 arg1) {
        ++field1437;
        Object var3 = null;
        class125 var5;
        if (this.field1438 == null && this.field1430) {
            class324 var4 = this.method568(131072, arg1, 102, true);
            var5 = var4 == null ? null : var4.field4676;
        } else {
            var5 = this.field1438;
            this.field1438 = null;
        }
        int var6 = -96 / ((arg0 - 62) / 63);
        if (var5 != null) {
            class200.method1098(var5, this.field1442, super.field3760, super.field3759, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)I")
    public final int method31(byte arg0) {
        ++field1432;
        int var2 = 79 % ((-23 - arg0) / 35);
        return this.field1431;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)I")
    public final int method16(boolean arg0) {
        if (arg0) {
            return 102;
        } else {
            ++field1424;
            return 65535 & this.field1427;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILoj;)Lqh;")
    private final class352 method569(int arg0, int arg1, class280 arg2) {
        if (arg1 < 6) {
            this.method21(-26, (class280) null, (byte) -95);
        }
        ++field1445;
        if (this.field1441 != null && arg2.method1473(this.field1441.method1719(), arg0) == 0) {
            return this.field1441;
        } else {
            class324 var4 = this.method568(arg0, arg2, 127, false);
            return var4 == null ? null : var4.field4681;
        }
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(ILoj;)V")
    public final void method27(int arg0, class280 arg1) {
        ++field1423;
        if (arg0 != 0) {
            this.method23(-72, 87, false, (class78) null, -119, (byte) 79, (class280) null);
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)V")
    public final void method32(int arg0) {
        ++field1426;
        if (arg0 == -2) {
            this.field1447 = false;
            if (this.field1441 != null) {
                this.field1441.method1732(this.field1441.method1719() & -32769);
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILoj;B)Lqh;")
    public final class352 method21(int arg0, class280 arg1, byte arg2) {
        ++field1444;
        return arg2 != -98 ? null : this.method569(arg0, 78, arg1);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        if (arg0 <= 41) {
            this.field1438 = null;
        }
        ++field1428;
        if (this.field1441 != null) {
            this.field1441.method1722();
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILoj;II)Z")
    public final boolean method28(int arg0, class280 arg1, int arg2, int arg3) {
        ++field1449;
        if (arg3 != -6085) {
            return false;
        } else {
            class352 var5 = this.method569(65536, arg3 ^ -6019, arg1);
            if (var5 != null) {
                class327 var6 = arg1.method1456();
                var6.method553(super.field3760, super.field3758, super.field3759);
                return var5.method1695(arg0, arg2, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(ILoj;)Lmg;")
    public final class451 method19(int arg0, class280 arg1) {
        ++field1440;
        if (this.field1441 == null) {
            return null;
        } else {
            class327 var3 = arg1.method1456();
            if (arg0 <= 95) {
                return null;
            } else {
                var3.method553(super.field3760, super.field3758, super.field3759);
                class451 var4 = null;
                if (this.field1429) {
                    var4 = class134.method638(762096108, 1);
                }
                this.field1441.method1716(var3, var4 != null ? var4.field6379[0] : null, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "(I)V")
    public static void method570(int arg0) {
        if (arg0 == 1) {
            field1446 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Loj;Lcu;IIIIZIIZ)V")
    public class117(class280 arg0, class415 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class112.method536(arg7, arg8, -2));
        super.field3760 = (short) arg3;
        this.field1429 = arg1.field5990 != 0 && !arg6;
        this.field1427 = (short) arg1.field5918;
        super.field3759 = (short) arg5;
        this.field1425 = (byte) arg7;
        this.field1447 = arg9;
        this.field1442 = (byte) arg2;
        this.field1431 = (byte) arg8;
        this.field1436 = arg6;
        this.field1430 = arg0.method1474() && arg1.field5960 && !this.field1436 && class427.field6166 != 0;
        int var11 = 1024;
        if (this.field1447) {
            var11 |= 32768;
        }
        class324 var12 = this.method568(var11, arg0, 123, this.field1430);
        if (var12 != null) {
            this.field1441 = var12.field4681;
            this.field1438 = var12.field4676;
            if (this.field1447) {
                this.field1441 = this.field1441.method1749((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)I")
    public final int method26(byte arg0) {
        if (arg0 != 73) {
            return -11;
        } else {
            ++field1435;
            return this.field1425;
        }
    }

    static {
        new class40("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
    }
}
