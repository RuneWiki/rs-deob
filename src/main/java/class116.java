import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class116 {

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "Ljava/lang/String;")
    private String field1746 = "null";

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "C")
    public char field1748;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "C")
    public char field1749;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    private int field1755;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "Lwa;")
    private class433 field1747;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Lwa;")
    public class433 field1753;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    private final void method771(byte arg0) {
        field1745++;
        this.field1747 = new class433(this.field1753.method2600(-121));
        if (arg0 > -32) {
            this.method778((byte) 118, null);
        }
        for (class141 var2 = (class141) this.field1753.method2608(true); var2 != null; var2 = (class141) this.field1753.method2603(97)) {
            class378 var3 = new class378(var2.field2110, (int) var2.field4736);
            this.field1747.method2606(var3, class43.method273(var2.field2110, 12), 0);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
    public static final void method772(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0) {
            return;
        }
        field1741++;
        class429 var8 = new class429();
        var8.field6418 = arg1;
        var8.field6417 = class317.field4559 + arg5;
        var8.field6411 = arg0;
        var8.field6410 = arg2;
        var8.field6415 = arg7;
        var8.field6414 = arg4;
        var8.field6407 = arg3;
        class504.field7390.method1878(arg6 ^ 0x2, var8);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I[Lf;)V")
    public static final void method773(int arg0, class529[] arg1) {
        field1752++;
        class502.field7367 = arg1.length;
        class337.field4733 = new class529[class502.field7367 + 10];
        if (arg0 < 111) {
            field1759 = -100;
        }
        class187.field2784 = new int[class502.field7367 + 10];
        class520.method3075(arg1, 0, class337.field4733, 0, class502.field7367);
        for (int var2 = 0; var2 < class502.field7367; var2++) {
            class187.field2784[var2] = class337.field4733[var2].method100();
        }
        for (int var3 = class502.field7367; var3 < class337.field4733.length; var3++) {
            class187.field2784[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILoq;IBB)V")
    public static final void method774(int arg0, class239 arg1, int arg2, byte arg3, byte arg4) {
        field1740++;
        int var5 = arg1.field1997[0];
        int var6 = arg1.field1996[0];
        if (var5 < 0 || class30.field323 <= var5 || var6 < 0 || class182.field2661 <= var6 || arg2 < 0 || arg2 >= class30.field323 || arg0 < 0 || arg0 >= class182.field2661) {
            return;
        }
        int var7 = -62 / ((-arg4 - 79) / 46);
        int var8 = class190.method1296(-4, var5, arg2, 0, class150.field2231, var6, arg0, class434.field6500[arg1.field1768], class157.field2288, true, arg1.method847(-1), (byte) -96, 0, 0, 0);
        if (var8 >= 1 && var8 <= 3) {
            for (int var9 = 0; var9 < var8 - 1; var9++) {
                arg1.method1617(class150.field2231[var9], class157.field2288[var9], -73, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method775(int arg0, String arg1) {
        field1756++;
        if (this.field1753 == null) {
            return false;
        }
        if (arg0 > -94) {
            method773(-76, null);
        }
        if (this.field1747 == null) {
            this.method771((byte) -114);
        }
        for (class378 var3 = (class378) this.field1747.method2605(false, class43.method273(arg1, 89)); var3 != null; var3 = (class378) this.field1747.method2609(81)) {
            if (var3.field5765.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)Z")
    public final boolean method776(byte arg0, int arg1) {
        field1758++;
        if (arg0 != 53) {
            field1759 = 46;
        }
        if (this.field1753 == null) {
            return false;
        }
        if (this.field1747 == null) {
            this.method781(-20168);
        }
        class427 var3 = (class427) this.field1747.method2605(false, (long) arg1);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)I")
    public final int method777(int arg0, int arg1) {
        field1751++;
        if (this.field1753 == null) {
            return this.field1755;
        }
        class427 var3 = (class427) this.field1753.method2605(false, (long) arg0);
        if (arg1 == 3461) {
            return var3 == null ? this.field1755 : var3.field6402;
        } else {
            return 23;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLdh;)V")
    public final void method778(byte arg0, class209 arg1) {
        field1757++;
        int var3 = 50 % ((arg0 - 32) / 48);
        while (true) {
            int var4 = arg1.method1428(32122);
            if (var4 == 0) {
                return;
            }
            this.method779(0, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILdh;I)V")
    private final void method779(int arg0, class209 arg1, int arg2) {
        if (arg0 != 0) {
            field1759 = 102;
        }
        field1750++;
        if (arg2 == 1) {
            this.field1749 = class417.method2501(arg1.method1417(false), (byte) -116);
        } else if (arg2 == 2) {
            this.field1748 = class417.method2501(arg1.method1417(false), (byte) -109);
        } else if (arg2 == 3) {
            this.field1746 = arg1.method1449(45);
        } else if (arg2 == 4) {
            this.field1755 = arg1.method1452(arg0 ^ 0xFF00);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method1450((byte) 102);
            this.field1753 = new class433(class476.method2841(var4, true));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1452(arg0 ^ 0xFF00);
                class337 var7;
                if (arg2 == 5) {
                    var7 = new class141(arg1.method1449(96));
                } else {
                    var7 = new class427(arg1.method1452(65280));
                }
                this.field1753.method2606(var7, (long) var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method780(int arg0, int arg1) {
        field1742++;
        if (this.field1753 == null) {
            return this.field1746;
        }
        class141 var3 = (class141) this.field1753.method2605(false, (long) arg0);
        if (arg1 >= -102) {
            return null;
        } else if (var3 == null) {
            return this.field1746;
        } else {
            return var3.field2110;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    private final void method781(int arg0) {
        field1754++;
        if (arg0 != -20168) {
            return;
        }
        this.field1747 = new class433(this.field1753.method2600(-121));
        for (class427 var2 = (class427) this.field1753.method2608(true); var2 != null; var2 = (class427) this.field1753.method2603(arg0 + 20233)) {
            class427 var3 = new class427((int) var2.field4736);
            this.field1747.method2606(var3, (long) var2.field6402, 0);
        }
    }
}
