import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class100 extends class168 {

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "[[I")
    public static int[][] field1949 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "Lob;")
    public static class141 field1952 = class175.method1195(40, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "Lob;")
    public static class141 field1953 = class175.method1195(40, "mapfunction");

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "Lob;")
    public static class141 field1957 = class175.method1195(40, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "Lob;")
    public static class141 field1954 = class175.method1195(40, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "Lpe;")
    public static class154 field1956;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
    public static void method658(byte arg0) {
        field1952 = null;
        if (arg0 != 117) {
            return;
        }
        field1949 = null;
        field1953 = null;
        field1956 = null;
        field1957 = null;
        field1954 = null;
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)V")
    public static final void method659(byte arg0) {
        field1958++;
        if (arg0 != -65) {
            return;
        }
        for (class165 var1 = (class165) class210.field3994.method1103((byte) -9); var1 != null; var1 = (class165) class210.field3994.method1106((byte) 94)) {
            if (var1.field3189 != null) {
                var1.method1140(0);
            }
        }
    }
}
