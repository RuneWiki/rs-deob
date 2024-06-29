import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class101 {

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Z")
    public static boolean field1570 = false;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field1573 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field1578 = 50;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "[I")
    public static int[] field1569 = new int[field1578];

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "[I")
    public static int[] field1575 = new int[field1578];

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "[I")
    public static int[] field1576 = new int[field1578];

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field1579 = new String[field1578];

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "[I")
    public static int[] field1572 = new int[field1578];

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "[I")
    public static int[] field1577 = new int[field1578];

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "[I")
    public static int[] field1571 = new int[field1578];

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "[I")
    public static int[] field1568 = new int[field1578];

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "[[B")
    public static byte[][] field1574;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static void method672(byte arg0) {
        field1576 = null;
        field1571 = null;
        field1573 = null;
        field1569 = null;
        if (arg0 <= 104) {
            method672((byte) 38);
        }
        field1575 = null;
        field1579 = null;
        field1577 = null;
        field1574 = null;
        field1568 = null;
        field1572 = null;
    }
}
