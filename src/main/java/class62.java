import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class62 implements Runnable {

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Z")
    public boolean field1571 = true;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Ljava/lang/Object;")
    public Object field1575 = new Object();

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "[I")
    public int[] field1586 = new int[500];

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "[I")
    public int[] field1589 = new int[500];

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public int field1588 = 0;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field1569 = -1;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field1576 = -1;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field1577 = -1;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "Lhb;")
    private static class44 field1578 = class102.method810("Please try using a different world)3", -28606);

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lhb;")
    public static class44 field1572 = field1578;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Lhb;")
    public static class44 field1574 = field1578;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Lhb;")
    public static class44 field1579 = class102.method810("backright1", -28606);

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Lhb;")
    private static class44 field1580 = class102.method810("Enter name of player to delete from list", -28606);

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Lhb;")
    public static class44 field1573 = field1578;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Lhb;")
    public static class44 field1585 = field1578;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Lhb;")
    public static class44 field1582 = field1578;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "[I")
    public static int[] field1568 = new int[500];

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "Lhb;")
    public static class44 field1584 = class102.method810("null", -28606);

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lhb;")
    public static class44 field1570 = field1578;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Lhb;")
    public static class44 field1581 = class102.method810("Spiel)2Engine wird gestartet)3)3)3", -28606);

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Lhb;")
    public static class44 field1583 = field1580;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "[J")
    public static long[] field1587 = new long[200];

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lpc;")
    public static class93 field1566;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 22)
    public static void method566(int arg0) {
        field1579 = null;
        field1570 = null;
        field1566 = null;
        field1583 = null;
        field1568 = null;
        field1580 = null;
        field1584 = null;
        field1581 = null;
        field1574 = null;
        field1585 = null;
        field1587 = null;
        if (arg0 > -71) {
            method566(79);
        }
        field1573 = null;
        field1572 = null;
        field1582 = null;
        field1578 = null;
    }

    @OriginalMember(owner = "client!kb", name = "run", descriptor = "()V", line = 49)
    public final void run() {
        field1567++;
        while (this.field1571) {
            Object var1 = this.field1575;
            synchronized (this.field1575) {
                if (this.field1588 < 500) {
                    this.field1586[this.field1588] = class100.field2519;
                    this.field1589[this.field1588] = class110.field2749;
                    this.field1588++;
                }
            }
            class47.method447((byte) -52, 50L);
        }
    }
}
