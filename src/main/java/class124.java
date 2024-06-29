import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class124 extends class254 {

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
    public static int field1854 = 0;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
    public int field1846;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
    public int field1848;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    public int field1849;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public int field1850;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
    public int field1853;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "Lga;")
    public static class277 field1851;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "Ljava/lang/String;")
    public String field1844;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)V")
    public static void method863(byte arg0) {
        if (arg0 >= -100) {
            method864(null, (byte) 122);
        }
        field1851 = null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method864(String arg0, byte arg1) {
        field1852++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class174.field2588; var2++) {
            if (arg0.equalsIgnoreCase(class258.field3597[var2])) {
                return var2;
            }
        }
        if (arg1 < 59) {
            field1854 = -126;
        }
        return -1;
    }
}
