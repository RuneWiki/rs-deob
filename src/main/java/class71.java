import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class71 extends class62 {

    @OriginalMember(owner = "client!le", name = "jb", descriptor = "I")
    public int field1586 = 0;

    @OriginalMember(owner = "client!le", name = "X", descriptor = "Llc;")
    public static class69 field1574 = class69.method470((byte) -104, "Importing maps )2 ");

    @OriginalMember(owner = "client!le", name = "bb", descriptor = "I")
    public static int field1578 = -1;

    @OriginalMember(owner = "client!le", name = "fb", descriptor = "Llc;")
    public static class69 field1582 = class69.method470((byte) -107, "logo");

    @OriginalMember(owner = "client!le", name = "cb", descriptor = "I")
    public static int field1579 = -1;

    @OriginalMember(owner = "client!le", name = "nb", descriptor = "Llc;")
    public static class69 field1590 = class69.method470((byte) -101, "");

    @OriginalMember(owner = "client!le", name = "ib", descriptor = "Llc;")
    public static class69 field1585 = field1590;

    @OriginalMember(owner = "client!le", name = "ob", descriptor = "Llc;")
    public static class69 field1591 = field1590;

    @OriginalMember(owner = "client!le", name = "pb", descriptor = "Llc;")
    public static class69 field1592 = field1590;

    @OriginalMember(owner = "client!le", name = "rb", descriptor = "[[[I")
    public static int[][][] field1594 = new int[4][13][13];

    @OriginalMember(owner = "client!le", name = "hb", descriptor = "Llc;")
    private static class69 field1584 = class69.method470((byte) -106, "Drop");

    @OriginalMember(owner = "client!le", name = "qb", descriptor = "Llc;")
    public static class69 field1593 = class69.method470((byte) -95, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!le", name = "U", descriptor = "Llc;")
    public static class69 field1571 = field1590;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "Llc;")
    public static class69 field1572 = field1584;

    @OriginalMember(owner = "client!le", name = "tb", descriptor = "Z")
    public static boolean field1596 = false;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!le", name = "Z", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!le", name = "ab", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!le", name = "db", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!le", name = "eb", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!le", name = "gb", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!le", name = "kb", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!le", name = "lb", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!le", name = "sb", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "Lkc;")
    public static class63 field1575;

    @OriginalMember(owner = "client!le", name = "mb", descriptor = "Lkc;")
    public static class63 field1589;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(Z)V")
    public static void method503(boolean arg0) {
        field1584 = null;
        field1585 = null;
        field1574 = null;
        field1590 = null;
        field1594 = null;
        field1575 = null;
        if (!arg0) {
            field1596 = true;
        }
        field1571 = null;
        field1589 = null;
        field1591 = null;
        field1592 = null;
        field1593 = null;
        field1572 = null;
        field1582 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILpd;)V")
    public final void method504(int arg0, class94 arg1) {
        if (arg0 != -1) {
            field1592 = null;
        }
        while (true) {
            int var3 = arg1.method703((byte) -104);
            if (var3 == 0) {
                field1587++;
                return;
            }
            this.method506(100, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static final void method505(byte arg0) {
        field1576++;
        Object var1 = class29.field600;
        synchronized (class29.field600) {
            if (arg0 >= -55) {
                method507(54, null);
            }
            while (class53.field1133 != 0) {
                class53.field1133 = -1;
                try {
                    class29.field600.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILpd;)V")
    private final void method506(int arg0, int arg1, class94 arg2) {
        if (arg1 == 5) {
            this.field1586 = arg2.method665(8666);
        }
        field1580++;
        int var4 = 0 / ((-arg0 - 40) / 42);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILoc;)V")
    public static final void method507(int arg0, class87 arg1) {
        field1577++;
        class64.field1354 = arg1;
        if (arg0 > -57) {
            method505((byte) -18);
        }
    }
}
