import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class91 {

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "J")
    public long field1327 = 0L;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field1318 = 0;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field1321 = -1;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public int field1317;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public int field1320;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public int field1322;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public int field1323;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public int field1328;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public int field1329;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Lgd;")
    public class310 field1326;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/lang/String;)V", line = 24)
    public static final void method729(int arg0, String arg1) {
        field1325++;
        if (class317.field4927 == null) {
            return;
        }
        long var2 = class224.method1597(true, arg1);
        int var4 = 0;
        if ((long) arg0 == var2) {
            return;
        }
        while (class317.field4927.length > var4 && class317.field4927[var4].field3418 != var2) {
            var4++;
        }
        if (var4 < class317.field4927.length && class317.field4927[var4] != null) {
            class159.field2372.method59(203, (byte) 73);
            class159.field2372.method261(1523335144, class317.field4927[var4].field3418);
            class291.field4575++;
        }
    }
}
