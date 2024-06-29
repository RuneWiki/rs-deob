import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class90 {

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field1450 = 0;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Lll;")
    public static class211 field1454 = new class211(512);

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field1458 = 0;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "Luf;")
    public static class176 field1459;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public static final void method712(byte arg0) {
        field1456++;
        int var1 = 22 / ((-arg0 - 59) / 48);
        class249.field3839.method1782(104);
        class25.field390.method1782(126);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    public static void method713(byte arg0) {
        if (arg0 > -45) {
            field1458 = -72;
        }
        field1459 = null;
        field1454 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBI)I")
    public static final int method714(int arg0, byte arg1, int arg2) {
        if (arg1 == -89) {
            field1451++;
            int var3 = arg0 >>> 31;
            return (arg0 + var3) / arg2 - var3;
        } else {
            return 69;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
    public static final void method715(byte arg0) {
        if (class239.field3715 == 30) {
            class77.method609(10, 25);
        }
        int var1 = -26 / ((38 - arg0) / 61);
        field1452++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(CB)C")
    public static final char method716(char arg0, byte arg1) {
        field1457++;
        if (arg1 < 75) {
            return (char) 65466;
        } else if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)V")
    public static final void method717(int arg0, boolean arg1) {
        field1453++;
        class179.field2675.method1778(arg0, -46);
        if (arg1) {
            field1450 = 104;
        }
    }
}
