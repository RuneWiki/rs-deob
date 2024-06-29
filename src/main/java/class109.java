import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class109 {

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Loh;")
    public static class258 field1927 = class153.method1046(")3)3)3", 92);

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Loh;")
    public static class258 field1930 = class153.method1046("Gegenstand f-Ur Mitglieder", 116);

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Loh;")
    public static class258 field1924 = null;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "[Lck;")
    public static class98[] field1928;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 13)
    public static void method801(int arg0) {
        field1928 = null;
        field1930 = null;
        if (arg0 <= -41) {
            field1927 = null;
            field1924 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V", line = 38)
    public static final void method802(int arg0, int arg1) {
        field1929++;
        class286 var2 = class48.method389(arg0, 11, arg1 ^ 0x5C60);
        var2.method2010((byte) -38);
        if (arg1 != 30098) {
            field1928 = (class98[]) null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)V", line = 51)
    public static final void method803(int arg0, int arg1) {
        class165.field2784 = arg0;
        class299.field5122 = -1;
        class218.field3782 = arg1;
        field1925++;
        class178.method1222(false);
    }
}
