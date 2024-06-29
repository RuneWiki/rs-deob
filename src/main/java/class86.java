import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class86 extends class64 {

    @OriginalMember(owner = "client!n", name = "kb", descriptor = "I")
    public int field1936 = 0;

    @OriginalMember(owner = "client!n", name = "cb", descriptor = "Lrd;")
    public static class114 field1928 = class84.method656("Classic", (byte) 126);

    @OriginalMember(owner = "client!n", name = "ib", descriptor = "Lrd;")
    public static class114 field1934 = class84.method656("Name eingeben:", (byte) 115);

    @OriginalMember(owner = "client!n", name = "ab", descriptor = "Ldd;")
    public static class26 field1926 = new class26(64);

    @OriginalMember(owner = "client!n", name = "mb", descriptor = "Luc;")
    public static class131 field1938 = new class131(5000);

    @OriginalMember(owner = "client!n", name = "ob", descriptor = "I")
    public static int field1940 = -1;

    @OriginalMember(owner = "client!n", name = "pb", descriptor = "Lrd;")
    private static class114 field1941 = class84.method656("Could not complete login)3", (byte) 127);

    @OriginalMember(owner = "client!n", name = "qb", descriptor = "I")
    public static int field1942 = 0;

    @OriginalMember(owner = "client!n", name = "rb", descriptor = "Lrd;")
    public static class114 field1943 = class84.method656("Begeben Sie sich in ein freies Gebiet)1 um", (byte) 119);

    @OriginalMember(owner = "client!n", name = "tb", descriptor = "Lrd;")
    public static class114 field1945 = class84.method656("auf der Hautpseite)3", (byte) 123);

    @OriginalMember(owner = "client!n", name = "sb", descriptor = "Lrd;")
    public static class114 field1944 = field1941;

    @OriginalMember(owner = "client!n", name = "Z", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!n", name = "bb", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!n", name = "db", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!n", name = "eb", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!n", name = "fb", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!n", name = "gb", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!n", name = "jb", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!n", name = "lb", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!n", name = "nb", descriptor = "Lpc;")
    public static class101 field1939;

    @OriginalMember(owner = "client!n", name = "hb", descriptor = "Ljd;")
    public static class66 field1933;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lid;B)V")
    public final void method659(class60 arg0, byte arg1) {
        if (arg1 != -107) {
            field1940 = 32;
        }
        while (true) {
            int var3 = arg0.method462((byte) 116);
            if (var3 == 0) {
                field1931++;
                return;
            }
            this.method661(arg1 + 107, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lrd;Lrd;ZI)V")
    public static final void method660(class114 arg0, class114 arg1, boolean arg2, int arg3) {
        if (class123.field2899 == -1) {
            class140.field3335 = true;
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0 && class8.field120 != -1) {
            client.field417 = 0;
            class60.field1250 = arg1;
        }
        for (int var4 = 99; var4 > 0; var4--) {
            class28.field557[var4] = class28.field557[var4 - 1];
            class28.field563[var4] = class28.field563[var4 - 1];
            class144.field3425[var4] = class144.field3425[var4 - 1];
        }
        class28.field557[0] = arg3;
        class28.field563[0] = arg0;
        class144.field3425[0] = arg1;
        field1927++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILid;)V")
    private final void method661(int arg0, int arg1, class60 arg2) {
        field1932++;
        if (arg1 == 5) {
            this.field1936 = arg2.method467(255);
        }
        if (arg0 != 0) {
            field1938 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
    public static void method662(int arg0) {
        field1943 = null;
        field1945 = null;
        field1928 = null;
        field1926 = null;
        if (arg0 != -15421) {
            method660(null, null, false, 17);
        }
        field1934 = null;
        field1939 = null;
        field1938 = null;
        field1933 = null;
        field1941 = null;
        field1944 = null;
    }

    @OriginalMember(owner = "client!n", name = "g", descriptor = "(I)V")
    public static final void method663(int arg0) {
        field1925++;
        if (class29.field587 > 0) {
            class18.method128((byte) -61);
            return;
        }
        class12.method101(false, 40);
        class117.field2729 = class18.field343;
        if (arg0 != 32129) {
            field1930 = -64;
        }
        class18.field343 = null;
    }
}
