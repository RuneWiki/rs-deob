import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class127 {

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "Ljava/lang/String;")
    private String field1753 = "null";

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "Lhb;")
    public static class250 field1734 = new class250(40, 6);

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "C")
    public char field1737;

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "C")
    public char field1751;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
    private int field1747;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "Ljr;")
    private class357 field1744;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "Ljr;")
    public class357 field1750;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method805(boolean arg0, String arg1) {
        field1740++;
        if (this.field1750 == null) {
            return false;
        }
        if (arg0) {
            method809(-22);
        }
        if (this.field1744 == null) {
            this.method813(29744);
        }
        for (class118 var3 = (class118) this.field1744.method2085(class368.method2153(-126, arg1), -5423); var3 != null; var3 = (class118) this.field1744.method2093(0)) {
            if (var3.field1644.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IBIIIIIII)Z")
    public static final boolean method806(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1738++;
        if (arg1 != 81) {
            method810(74, -84, -115);
        }
        if (arg6 < arg0 + arg3 && arg0 < (arg5 + arg6)) {
            return arg2 + arg4 > arg8 && arg2 < (arg7 + arg8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZLbt;)V")
    public final void method807(boolean arg0, class88 arg1) {
        while (true) {
            int var3 = arg1.method617(2);
            if (var3 == 0) {
                if (arg0) {
                    this.field1751 = '\n';
                }
                field1743++;
                return;
            }
            this.method815((byte) 65, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
    private final void method808(byte arg0) {
        field1739++;
        this.field1744 = new class357(this.field1750.method2094((byte) 91));
        class206 var2 = (class206) this.field1750.method2087(0);
        if (arg0 < 54) {
            this.method805(true, null);
        }
        while (var2 != null) {
            class206 var3 = new class206((int) var2.field7456);
            this.field1744.method2096((long) var2.field2681, var3, (byte) 76);
            var2 = (class206) this.field1750.method2091(-125);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public static void method809(int arg0) {
        if (arg0 == 28935) {
            field1734 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)Z")
    public static final boolean method810(int arg0, int arg1, int arg2) {
        int var3 = 30 / ((arg2 - 19) / 44);
        field1736++;
        return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)I")
    public final int method811(int arg0, int arg1) {
        field1748++;
        if (this.field1750 == null) {
            return this.field1747;
        }
        if (arg1 != -7493) {
            field1745 = 79;
        }
        class206 var3 = (class206) this.field1750.method2085((long) arg0, -5423);
        return var3 == null ? this.field1747 : var3.field2681;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(II)Z")
    public final boolean method812(int arg0, int arg1) {
        field1741++;
        if (this.field1750 == null) {
            return false;
        }
        if (this.field1744 == null) {
            this.method808((byte) 57);
        }
        class206 var3 = (class206) this.field1744.method2085((long) arg0, -5423);
        if (var3 == null) {
            return false;
        } else {
            if (arg1 != 0) {
                this.field1750 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
    private final void method813(int arg0) {
        this.field1744 = new class357(this.field1750.method2094((byte) 91));
        field1752++;
        class372 var2 = (class372) this.field1750.method2087(0);
        if (arg0 != 29744) {
            this.method813(-100);
        }
        while (var2 != null) {
            class118 var3 = new class118(var2.field4830, (int) var2.field7456);
            this.field1744.method2096(class368.method2153(-109, var2.field4830), var3, (byte) 76);
            var2 = (class372) this.field1750.method2091(-128);
        }
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(II)I")
    public static final int method814(int arg0, int arg1) {
        if (arg0 == -19177) {
            field1749++;
            return arg1 & 0xFF;
        } else {
            return -57;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BILbt;)V")
    private final void method815(byte arg0, int arg1, class88 arg2) {
        if (arg1 == 1) {
            this.field1737 = class148.method1027(arg2.method575(-32), (byte) -103);
        } else if (arg1 == 2) {
            this.field1751 = class148.method1027(arg2.method575(arg0 - 180), (byte) 32);
        } else if (arg1 == 3) {
            this.field1753 = arg2.method591(20557);
        } else if (arg1 == 4) {
            this.field1747 = arg2.method578(arg0 ^ 0x24);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method568((byte) 110);
            this.field1750 = new class357(class124.method788(var4, -118));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method578(118);
                class508 var7;
                if (arg1 == 5) {
                    var7 = new class372(arg2.method591(arg0 + 20492));
                } else {
                    var7 = new class206(arg2.method578(106));
                }
                this.field1750.method2096((long) var6, var7, (byte) 76);
            }
        }
        if (arg0 != 65) {
            this.field1751 = (char) 65514;
        }
        field1742++;
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(II)Ljava/lang/String;")
    public final String method816(int arg0, int arg1) {
        field1735++;
        if (this.field1750 == null) {
            return this.field1753;
        }
        if (arg0 != 0) {
            this.field1737 = '\u0005';
        }
        class372 var3 = (class372) this.field1750.method2085((long) arg1, -5423);
        return var3 == null ? this.field1753 : var3.field4830;
    }
}
