import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class113 {

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field1607 = -1;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "Z")
    public static boolean field1612 = false;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field1609 = 0;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field1614 = 0;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "[J")
    public static long[] field1615 = new long[100];

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "Lcc;")
    public static class263 field1611;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "[I")
    public static int[] field1610;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 6)
    public static final void method776(int arg0) {
        class345.field5346.method1241(arg0 - 26734);
        if (arg0 == 26851) {
            field1608++;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 23)
    public static final void method777(boolean arg0, String arg1) {
        if (arg0) {
            field1612 = true;
        }
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field1613++;
        System.exit(1);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V", line = 55)
    public static void method778(boolean arg0) {
        field1610 = null;
        if (!arg0) {
            field1612 = true;
        }
        field1611 = null;
        field1615 = null;
    }
}
