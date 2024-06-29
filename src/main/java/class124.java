import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class124 {

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
    public static int field1712 = 0;

    @OriginalMember(owner = "client!bba", name = "j", descriptor = "[F")
    public static float[] field1717 = new float[16];

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "Lmw;")
    public static class517 field1711 = new class517(41, -1);

    @OriginalMember(owner = "client!bba", name = "k", descriptor = "B")
    public byte field1718;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!bba", name = "g", descriptor = "I")
    public int field1714;

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "Ljava/lang/String;")
    public String field1709;

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "Ljava/lang/String;")
    public String field1710;

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "Ljava/lang/String;")
    public String field1713;

    @OriginalMember(owner = "client!bba", name = "h", descriptor = "Ljava/lang/String;")
    public String field1715;

    @OriginalMember(owner = "client!bba", name = "i", descriptor = "[Lhh;")
    public static class140[] field1716;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V", line = 14)
    public static void method890(int arg0) {
        field1716 = null;
        field1711 = null;
        field1717 = null;
        if (arg0 != -10986) {
            field1711 = null;
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(III)Z", line = 26)
    public static final boolean method891(int arg0, int arg1, int arg2) {
        if (arg1 != 13546) {
            field1717 = null;
        }
        field1708++;
        return (arg0 & 0x10000) != 0;
    }
}
