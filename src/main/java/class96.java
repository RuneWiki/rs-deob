import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class96 extends RuntimeException {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Ljava/lang/String;")
    public String field1791;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1795;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Lvd;")
    private static class222 field1793 = class212.method1357("Password: ", 10731);

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "[I")
    public static int[] field1792 = new int[50];

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "Lvd;")
    public static class222 field1797 = field1793;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "[[I")
    public static int[][] field1796 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Lvd;")
    public static class222 field1798 = class212.method1357("Keine Antwort vom Server)3", 10731);

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "[[[B")
    public static byte[][][] field1794;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public static void method607(boolean arg0) {
        field1793 = null;
        field1792 = null;
        if (arg0) {
            field1797 = null;
        }
        field1797 = null;
        field1796 = null;
        field1798 = null;
        field1794 = null;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class96(Throwable arg0, String arg1) {
        this.field1791 = arg1;
        this.field1795 = arg0;
    }
}
