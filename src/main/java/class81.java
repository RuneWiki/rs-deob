import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class81 extends class114 {

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "Lia;")
    private class257 field1585 = class30.field580;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "I")
    public static int field1570 = 0;

    @OriginalMember(owner = "client!gh", name = "U", descriptor = "Lia;")
    public static class257 field1584 = class28.method234(-32, "p12_full");

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "Lia;")
    public static class257 field1579 = class28.method234(-29, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "Z")
    public static boolean field1574 = true;

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "[I")
    public static int[] field1581 = new int[128];

    @OriginalMember(owner = "client!gh", name = "W", descriptor = "Lsf;")
    public static class33 field1586 = new class33();

    @OriginalMember(owner = "client!gh", name = "Z", descriptor = "Lie;")
    public static class117 field1589 = new class117(30);

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "I")
    public int field1576;

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
    private int field1578;

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "I")
    public int field1582;

    @OriginalMember(owner = "client!gh", name = "T", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!gh", name = "X", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!gh", name = "Y", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "Lsc;")
    private class56 field1580;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)Lia;")
    public final class257 method604(byte arg0, int arg1) {
        field1587++;
        if (this.field1580 == null) {
            return this.field1585;
        }
        class129 var3 = (class129) this.field1580.method434((byte) -93, (long) arg1);
        if (arg0 != 74) {
            field1589 = null;
        }
        return var3 == null ? this.field1585 : var3.field2311;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lk;IB)V")
    private final void method605(class152 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field1576 = arg0.method1051((byte) -112);
        } else if (arg1 == 2) {
            this.field1582 = arg0.method1051((byte) -61);
        } else if (arg1 == 3) {
            this.field1585 = arg0.method1039(1995);
        } else if (arg1 == 4) {
            this.field1578 = arg0.method1042(112);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method1063(-17162);
            this.field1580 = new class56(class105.method760((byte) 78, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1042(114);
                class30 var7;
                if (arg1 == 5) {
                    var7 = new class129(arg0.method1039(1995));
                } else {
                    var7 = new class220(arg0.method1042(125));
                }
                this.field1580.method424(var7, (byte) -40, (long) var6);
            }
        }
        field1583++;
        int var8 = -66 / ((64 - arg2) / 52);
    }

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "(I)V")
    public static void method606(int arg0) {
        if (arg0 != 8895) {
            field1586 = null;
        }
        field1589 = null;
        field1586 = null;
        field1581 = null;
        field1579 = null;
        field1584 = null;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(II)Lmg;")
    public static final class76 method607(int arg0, int arg1) {
        field1577++;
        int var2 = -128 / ((arg1 + 43) / 55);
        if (arg0 == 0) {
            return new class133();
        } else if (arg0 == 1) {
            return new class194();
        } else if (arg0 == 2) {
            return new class160();
        } else if (arg0 == 3) {
            return new class45();
        } else if (arg0 == 4) {
            return new class258();
        } else if (arg0 == 5) {
            return new class95();
        } else if (arg0 == 6) {
            return new class18();
        } else if (arg0 == 7) {
            return new class255();
        } else if (arg0 == 8) {
            return new class24();
        } else if (arg0 == 9) {
            return new class27();
        } else if (arg0 == 10) {
            return new class32();
        } else if (arg0 == 11) {
            return new class237();
        } else if (arg0 == 12) {
            return new class170();
        } else if (arg0 == 13) {
            return new class70();
        } else if (arg0 == 14) {
            return new class91();
        } else if (arg0 == 15) {
            return new class162();
        } else if (arg0 == 16) {
            return new class145();
        } else if (arg0 == 17) {
            return new class135();
        } else if (arg0 == 18) {
            return new class150();
        } else if (arg0 == 19) {
            return new class215();
        } else if (arg0 == 20) {
            return new class172();
        } else if (arg0 == 21) {
            return new class245();
        } else if (arg0 == 22) {
            return new class208();
        } else if (arg0 == 23) {
            return new class120();
        } else if (arg0 == 24) {
            return new class68();
        } else if (arg0 == 25) {
            return new class15();
        } else if (arg0 == 26) {
            return new class228();
        } else if (arg0 == 27) {
            return new class165();
        } else if (arg0 == 28) {
            return new class35();
        } else if (arg0 == 29) {
            return new class249();
        } else if (arg0 == 30) {
            return new class256();
        } else if (arg0 == 31) {
            return new class26();
        } else if (arg0 == 32) {
            return new class151();
        } else if (arg0 == 33) {
            return new class251();
        } else if (arg0 == 34) {
            return new class158();
        } else if (arg0 == 35) {
            return new class230();
        } else if (arg0 == 36) {
            return new class248();
        } else if (arg0 == 37) {
            return new class53();
        } else if (arg0 == 38) {
            return new class156();
        } else if (arg0 == 39) {
            return new class179();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)V")
    public static final void method608(byte arg0) {
        field1572++;
        if (arg0 == -67) {
            class164.field2857.method833(0);
            class29.field547.method833(0);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lk;I)V")
    public final void method609(class152 arg0, int arg1) {
        int var3 = 117 % ((58 - arg1) / 33);
        while (true) {
            int var4 = arg0.method1051((byte) 94);
            if (var4 == 0) {
                field1575++;
                return;
            }
            this.method605(arg0, var4, (byte) -95);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B")
    public static final byte[] method610(Object arg0, int arg1, boolean arg2) {
        field1573++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg2 ? class193.method1301(0, var3) : var3;
        } else if (arg0 instanceof class250) {
            class250 var4 = (class250) arg0;
            return var4.method1300(92);
        } else if (arg1 == 26) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)I")
    public final int method611(int arg0, byte arg1) {
        field1588++;
        if (this.field1580 == null) {
            return this.field1578;
        }
        class220 var3 = (class220) this.field1580.method434((byte) -93, (long) arg0);
        if (var3 == null) {
            return this.field1578;
        } else {
            if (arg1 > -53) {
                field1586 = null;
            }
            return var3.field3726;
        }
    }
}
