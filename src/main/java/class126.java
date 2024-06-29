import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class126 extends class9 {

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "[F")
    public static float[] field1548;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    public int field1540;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    public int field1542;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    public int field1543;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public int field1545;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "Ljr;")
    public class92 field1546;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "Ljava/lang/String;")
    public String field1544;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "[I")
    public int[] field1539;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "[I")
    public int[] field1547;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "[Lpt;")
    public class451[] field1541;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "[Ljava/lang/String;")
    public String[] field1551;

    static {
        new class180("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field1548 = new float[4];
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(II)V", line = 21)
    public static final void method719(int arg0, int arg1) {
        field1549++;
        class539.field7888.method3686((byte) 53, arg1);
        if (arg0 != -6917) {
            method720((byte) -82);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 39)
    public static void method720(byte arg0) {
        if (arg0 != -113) {
            field1548 = null;
        }
        field1548 = null;
    }
}
