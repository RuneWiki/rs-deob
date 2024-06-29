import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class61 extends class121 {

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "I")
    public static int field1628 = -1;

    @OriginalMember(owner = "client!ie", name = "fb", descriptor = "Loc;")
    private static class99 field1636 = class48.method402((byte) -104, "Loading title screen )2 ");

    @OriginalMember(owner = "client!ie", name = "lb", descriptor = "I")
    public static int field1642 = 50;

    @OriginalMember(owner = "client!ie", name = "pb", descriptor = "I")
    public static int field1646 = 0;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "Loc;")
    public static class99 field1625 = field1636;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "[I")
    public static int[] field1629 = new int[field1642];

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "[I")
    public static int[] field1634 = new int[field1642];

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "Loc;")
    public static class99 field1630 = class48.method402((byte) -104, "ams");

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "[I")
    public static int[] field1631 = new int[field1642];

    @OriginalMember(owner = "client!ie", name = "nb", descriptor = "I")
    public static int field1644 = -1;

    @OriginalMember(owner = "client!ie", name = "jb", descriptor = "[I")
    public static int[] field1640 = new int[field1642];

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "Loc;")
    private static class99 field1622 = class48.method402((byte) -104, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!ie", name = "sb", descriptor = "[I")
    public static int[] field1649 = new int[field1642];

    @OriginalMember(owner = "client!ie", name = "gb", descriptor = "[I")
    public static int[] field1637 = new int[field1642];

    @OriginalMember(owner = "client!ie", name = "hb", descriptor = "Loc;")
    public static class99 field1638 = field1622;

    @OriginalMember(owner = "client!ie", name = "eb", descriptor = "[I")
    public static int[] field1635 = new int[field1642];

    @OriginalMember(owner = "client!ie", name = "mb", descriptor = "[Loc;")
    public static class99[] field1643 = new class99[field1642];

    @OriginalMember(owner = "client!ie", name = "ob", descriptor = "B")
    public byte field1645;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!ie", name = "ib", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!ie", name = "kb", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!ie", name = "rb", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!ie", name = "tb", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!ie", name = "ub", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!ie", name = "qb", descriptor = "Loe;")
    public static class102 field1647;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "Lef;")
    public class35 field1627;

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "Lef;")
    public static class35 field1633;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "[I")
    public static int[] field1623;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)V")
    public static final void method539(int arg0, boolean arg1) {
        for (class73 var2 = (class73) class109.field2668.method1002(-116); var2 != null; var2 = (class73) class109.field2668.method1005(2355)) {
            if ((long) arg0 == (var2.field1138 >> 48 & 0xFFFFL)) {
                var2.method394((byte) 91);
            }
        }
        if (!arg1) {
            field1630 = null;
        }
        field1650++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lhe;II)Loc;")
    public static final class99 method540(class54 arg0, int arg1, int arg2) {
        field1651++;
        if (!class140.method1156(false, arg2, class20.method188(arg0, -604452832))) {
            return null;
        } else if (arg0.field1371 == null || arg2 >= arg0.field1371.length || arg0.field1371[arg2] == null || arg0.field1371[arg2].method846(arg1 - 65536).method810(arg1 - 65593) == 0) {
            return class54.field1367 ? class20.method189(new class99[] { class33.field787, class5.method31(arg2, 10) }, 38) : null;
        } else {
            if (arg1 != 65535) {
                method539(6, true);
            }
            return arg0.field1371[arg2];
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)V")
    public static final void method541(boolean arg0) {
        field1641++;
        class73.field1851.method998(arg0);
        class83.field2066.method998(true);
        class94.field2284.method998(true);
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(Z)V")
    public static void method542(boolean arg0) {
        field1647 = null;
        field1633 = null;
        field1638 = null;
        field1630 = null;
        field1622 = null;
        field1631 = null;
        field1629 = null;
        field1635 = null;
        field1643 = null;
        field1636 = null;
        if (!arg0) {
            return;
        }
        field1637 = null;
        field1623 = null;
        field1640 = null;
        field1634 = null;
        field1625 = null;
        field1649 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)V")
    public static final void method543(boolean arg0, int arg1) {
        field1648++;
        if (class118.field2904 == null) {
            return;
        }
        try {
            class57 var2 = new class57(4);
            var2.method514((byte) 73, arg0 ? 2 : 3);
            var2.method477(false, 0);
            class118.field2904.method1214(0, true, var2.field1469, 4);
        } catch (IOException var4) {
            try {
                class118.field2904.method1215(false);
            } catch (Exception var3) {
            }
            class1.field19++;
            class118.field2904 = null;
        }
        if (arg1 > -51) {
            field1625 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLoc;Loc;ZILpc;I)V")
    public static final void method544(byte arg0, class99 arg1, class99 arg2, boolean arg3, int arg4, class105 arg5, int arg6) {
        field1639++;
        int var7 = arg5.method883(arg2, 127);
        int var8 = -45 / ((40 - arg0) / 47);
        int var9 = arg5.method898(arg1, 60, var7);
        class135.method1110(var7, arg5, arg6, 0, var9, arg4, arg3);
    }
}
