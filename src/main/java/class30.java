import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class30 {

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Lmn;")
    private class236 field501 = new class236();

    @OriginalMember(owner = "client!i", name = "b", descriptor = "[I")
    public static int[] field497 = new int[8];

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Z")
    public static volatile boolean field511 = true;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lmn;")
    private class236 field509;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZZB)V", line = 6)
    public static final void method239(boolean arg0, boolean arg1, byte arg2) {
        field510++;
        if (arg1) {
            class453.field6590--;
            if (class453.field6590 == 0) {
                class65.field971 = null;
            }
        }
        if (arg2 != 47) {
            method248(-41);
        }
        if (!arg0) {
            return;
        }
        class318.field4678--;
        if (class318.field4678 == 0) {
            class31.field518 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)Z", line = 32)
    public final boolean method240(int arg0) {
        if (arg0 != 5) {
            method246((byte) 121);
        }
        field508++;
        return this.field501.field3310 == this.field501;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)Lmn;", line = 44)
    public final class236 method241(int arg0) {
        int var2 = 86 % (arg0 / 62);
        field504++;
        class236 var3 = this.field501.field3310;
        if (this.field501 == var3) {
            return null;
        } else {
            var3.method1435(true);
            return var3;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)Lmn;", line = 64)
    public final class236 method242(boolean arg0) {
        if (arg0) {
            this.method242(false);
        }
        field502++;
        class236 var2 = this.field501.field3310;
        if (this.field501 == var2) {
            this.field509 = null;
            return null;
        } else {
            this.field509 = var2.field3310;
            return var2;
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)I", line = 91)
    public final int method243(int arg0) {
        field505++;
        int var2 = 0;
        if (arg0 != 10692) {
            this.field501 = null;
        }
        class236 var3 = this.field501.field3310;
        while (this.field501 != var3) {
            var3 = var3.field3310;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)Lmn;", line = 115)
    public final class236 method244(byte arg0) {
        field498++;
        class236 var2 = this.field509;
        if (this.field501 == var2) {
            this.field509 = null;
            return null;
        } else {
            this.field509 = var2.field3310;
            return arg0 == -73 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)Lmn;", line = 137)
    public final class236 method245(byte arg0) {
        field507++;
        class236 var2 = this.field501.field3312;
        if (this.field501 == var2) {
            this.field509 = null;
            return null;
        }
        if (arg0 <= 17) {
            field499 = -122;
        }
        this.field509 = var2.field3312;
        return var2;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V", line = 158)
    public static void method246(byte arg0) {
        field497 = null;
        if (arg0 != 18) {
            field499 = 70;
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V", line = 169)
    public final void method247(int arg0) {
        field506++;
        while (true) {
            class236 var2 = this.field501.field3310;
            if (this.field501 == var2) {
                if (arg0 == -14987) {
                    this.field509 = null;
                    return;
                } else {
                    return;
                }
            }
            var2.method1435(true);
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V", line = 194)
    public static final void method248(int arg0) {
        class129.field1649.method251(4, 5);
        field496++;
        class475.field6857.method2732((byte) 113, 5);
        class315.field4621.method1294(5, 0);
        class114.field1471.method2131(69, 5);
        class508.field7744.method567(-18033, 5);
        class405.field5947.method1157(5, false);
        class286.field4083.method2597((byte) -89, 5);
        class53.field820.method2436(5, (byte) 126);
        class78.field1102.method439(5, true);
        class503.field7685.method1170((byte) -51, 5);
        class89.field1220.method476(1118821096, 5);
        class96.field1295.method283(5, (byte) 89);
        class281.field4023.method1267((byte) 115, 5);
        class228.field3209.method1540(5, 51);
        class127.field1627.method1955(5, (byte) 48);
        class75.field1067.method2826(5, 29);
        class66.field988.method2745(5, (byte) -59);
        class481.field6941.method1334((byte) -126, 5);
        class337.field4911.method1591(5, 4836);
        class66.field989.method1387(true, 5);
        class1.method2(-47, 5);
        class65.method456(50, (byte) 116);
        class278.method1702(5, -2);
        class148.method914((byte) -84, 5);
        class399.field5876.method39(false, 5);
        int var1 = 101 % ((26 - arg0) / 43);
        class468.field6754.method39(false, 5);
        class141.field1846.method39(false, 5);
        class413.field6116.method39(false, 5);
        class396.field5841.method39(false, 5);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIILet;Let;)V", line = 236)
    public static final void method249(int arg0, int arg1, int arg2, class403 arg3, class403 arg4) {
        class468 var5 = class323.method1937(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field6778 = arg3;
            var5.field6766 = arg4;
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V", line = 275)
    public class30() {
        this.field501.field3312 = this.field501;
        this.field501.field3310 = this.field501;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLmn;)V", line = 254)
    public final void method250(byte arg0, class236 arg1) {
        if (arg0 != -72) {
            return;
        }
        field503++;
        if (arg1.field3312 != null) {
            arg1.method1435(true);
        }
        arg1.field3312 = this.field501.field3312;
        arg1.field3310 = this.field501;
        arg1.field3312.field3310 = arg1;
        arg1.field3310.field3312 = arg1;
    }
}
