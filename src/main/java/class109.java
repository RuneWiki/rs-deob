import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class109 extends class47 implements class218 {

    @OriginalMember(owner = "client!io", name = "y", descriptor = "Lpq;")
    public class47 field1527;

    @OriginalMember(owner = "client!io", name = "D", descriptor = "Leh;")
    public static class169 field1532 = new class169(14, 1);

    @OriginalMember(owner = "client!io", name = "F", descriptor = "Leh;")
    public static class169 field1534 = new class169(15, 4);

    @OriginalMember(owner = "client!io", name = "H", descriptor = "Leh;")
    public static class169 field1536 = new class169(16, -2);

    @OriginalMember(owner = "client!io", name = "K", descriptor = "Leh;")
    public static class169 field1539 = new class169(17, 0);

    @OriginalMember(owner = "client!io", name = "M", descriptor = "Leh;")
    public static class169 field1541 = new class169(18, -2);

    @OriginalMember(owner = "client!io", name = "N", descriptor = "Leh;")
    public static class169 field1542 = new class169(20, 6);

    @OriginalMember(owner = "client!io", name = "O", descriptor = "Leh;")
    public static class169 field1543 = new class169(21, 8);

    @OriginalMember(owner = "client!io", name = "P", descriptor = "Leh;")
    public static class169 field1544 = new class169(22, -2);

    @OriginalMember(owner = "client!io", name = "Q", descriptor = "Leh;")
    public static class169 field1545 = new class169(23, 4);

    @OriginalMember(owner = "client!io", name = "R", descriptor = "Leh;")
    public static class169 field1546 = new class169(24, -1);

    @OriginalMember(owner = "client!io", name = "T", descriptor = "[Leh;")
    private static class169[] field1547 = new class169[32];

    @OriginalMember(owner = "client!io", name = "U", descriptor = "Lsh;")
    public static class472 field1548;

    @OriginalMember(owner = "client!io", name = "V", descriptor = "Lct;")
    public static class285 field1549;

    @OriginalMember(owner = "client!io", name = "W", descriptor = "[I")
    public static int[] field1550;

    @OriginalMember(owner = "client!io", name = "X", descriptor = "[I")
    public static int[] field1551;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!io", name = "u", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!io", name = "v", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!io", name = "w", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!io", name = "x", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!io", name = "z", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!io", name = "A", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!io", name = "B", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!io", name = "C", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!io", name = "E", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!io", name = "G", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!io", name = "I", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!io", name = "L", descriptor = "I")
    public static int field1540;

    static {
        class169[] var0 = class425.method2503(2);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field1547[var0[var1].field2407] = var0[var1];
        }
        field1548 = new class472(32, -1);
        field1549 = new class285(20, 12);
        field1550 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
        Math.sqrt(8192.0D);
        field1551 = new int[] { 16, 32, 64, 128 };
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BLtq;)V", line = 4)
    public final void method256(byte arg0, class63 arg1) {
        field1529++;
        if (arg0 != 82) {
            field1534 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(IIILpq;)V", line = 14)
    public class109(int arg0, int arg1, int arg2, class47 arg3) {
        super(arg0, arg1, arg2, false, false);
        this.field1527 = arg3;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BILtq;)Lns;", line = 22)
    public final class57 method255(byte arg0, int arg1, class63 arg2) {
        if (arg0 < 108) {
            return null;
        } else {
            field1530++;
            return null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)I", line = 35)
    public final int method250(byte arg0) {
        int var2 = -77 / ((arg0 + 49) / 60);
        field1521++;
        return 0;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ltq;III)Z", line = 46)
    public final boolean method259(class63 arg0, int arg1, int arg2, int arg3) {
        int var5 = -61 / ((arg2 + 59) / 58);
        field1533++;
        return false;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(Ltq;I)Lcj;", line = 57)
    public final class123 method252(class63 arg0, int arg1) {
        field1528++;
        return arg1 == 2 ? null : null;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(B)I", line = 68)
    public final int method244(byte arg0) {
        if (arg0 > -8) {
            field1543 = null;
        }
        field1523++;
        return 0;
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(I)Z", line = 79)
    public final boolean method253(int arg0) {
        if (arg0 >= -9) {
            this.method257(true);
        }
        field1522++;
        return false;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILtq;)V", line = 94)
    public final void method260(int arg0, class63 arg1) {
        field1537++;
        if (arg0 != 0) {
            field1547 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lje;ILdp;Lus;IIII)V", line = 104)
    public static final void method801(class178 arg0, int arg1, class319 arg2, class401 arg3, int arg4, int arg5, int arg6, int arg7) {
        field1525++;
        if (arg2 == null) {
            return;
        }
        int var8;
        if (class469.field6596 == 4) {
            var8 = (int) class384.field5682 & 0x3FFF;
        } else {
            var8 = (int) class384.field5682 + class347.field5291 & 0x3FFF;
        }
        if (arg7 != 1) {
            return;
        }
        int var9 = Math.max(arg0.field2595 / 2, arg0.field2589 / 2) + 10;
        int var10 = arg1 * arg1 + (arg6 * arg6);
        if (var10 > var9 * var9) {
            return;
        }
        int var11 = class172.field2450[var8];
        int var12 = class172.field2456[var8];
        if (class469.field6596 != 4) {
            var11 = var11 * 256 / (class358.field5437 + 256);
            var12 = var12 * 256 / (class358.field5437 + 256);
        }
        int var13 = arg6 * var11 + (arg1 * var12) >> 15;
        int var14 = arg6 * var12 - arg1 * var11 >> 15;
        arg2.method795(arg0.field2595 / 2 + arg5 - (-var13 - -(arg2.method791() / 2)), arg4 - -(arg0.field2589 / 2) + -var14 - arg2.method789() / 2, arg3, arg5, arg4);
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(Z)I", line = 146)
    public final int method257(boolean arg0) {
        if (arg0) {
            this.method244((byte) 10);
        }
        field1524++;
        return 0;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BZLtq;Lhm;III)V", line = 159)
    public final void method245(byte arg0, boolean arg1, class63 arg2, class352 arg3, int arg4, int arg5, int arg6) {
        field1540++;
        if (arg0 > -41) {
            this.method252((class63) null, 121);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)Z", line = 171)
    public final boolean method254(boolean arg0) {
        field1538++;
        return arg0 ? false : false;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V", line = 183)
    public final void method249(int arg0) {
        field1535++;
        if (arg0 < 56) {
            this.field1527 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)V", line = 193)
    public final void method247(boolean arg0) {
        field1531++;
        if (arg0) {
            this.method255((byte) 41, 103, (class63) null);
        }
    }

    @OriginalMember(owner = "client!io", name = "e", descriptor = "(I)V", line = 206)
    public static void method802(int arg0) {
        if (arg0 < 51) {
            return;
        }
        field1542 = null;
        field1543 = null;
        field1550 = null;
        field1549 = null;
        field1544 = null;
        field1534 = null;
        field1546 = null;
        field1541 = null;
        field1539 = null;
        field1545 = null;
        field1551 = null;
        field1536 = null;
        field1532 = null;
        field1547 = null;
        field1548 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ltq;I)V", line = 232)
    public final void method258(class63 arg0, int arg1) {
        if (arg1 == -22360) {
            field1526++;
        }
    }
}
