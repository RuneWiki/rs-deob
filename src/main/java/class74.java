import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class74 extends class305 {

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "Ljava/lang/String;")
    public static String field1521 = "slide:";

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "Lsn;")
    public static class318 field1523 = new class318(0, 0);

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    public static int field1525 = 1;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "C")
    private char field1519;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    public int field1515;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "Lgn;")
    public static class257 field1518;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "Ljava/lang/String;")
    public String field1517;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)Z", line = 5)
    public final boolean method559(byte arg0) {
        if (arg0 != -34) {
            field1523 = (class318) null;
        }
        field1516++;
        return this.field1519 == 's';
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILag;)V", line = 23)
    public final void method560(int arg0, class202 arg1) {
        field1522++;
        while (true) {
            int var3 = arg1.method1317((byte) -128);
            if (var3 == 0) {
                if (arg0 != 0) {
                    method562((byte) 111);
                }
                return;
            }
            this.method561(arg1, false, var3);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lag;ZI)V", line = 46)
    private final void method561(class202 arg0, boolean arg1, int arg2) {
        if (arg2 == 1) {
            this.field1519 = class228.method1515(0, arg0.method1333(-128));
        } else if (arg2 == 2) {
            this.field1515 = arg0.method1346(-119);
        } else if (arg2 == 5) {
            this.field1517 = arg0.method1307((byte) 102);
        }
        field1520++;
        if (arg1) {
            this.method559((byte) -102);
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)V", line = 71)
    public static void method562(byte arg0) {
        field1518 = null;
        field1523 = null;
        if (arg0 == 119) {
            field1521 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZC)C", line = 98)
    public static final char method563(boolean arg0, char arg1) {
        field1524++;
        if (arg1 == 'µ' || arg1 == 'ƒ') {
            return arg1;
        } else {
            if (!arg0) {
                field1521 = (String) null;
            }
            return Character.toTitleCase(arg1);
        }
    }
}
