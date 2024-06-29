import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class248 {

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Loh;")
    private static class258 field4291 = class153.method1046("cyan:", 101);

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Loh;")
    public static class258 field4287 = field4291;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Loh;")
    public static class258 field4288 = field4291;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Lea;")
    public static class11 field4293;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "[S")
    public static short[] field4289;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 9)
    public static final void method1689(int arg0) {
        field4290++;
        class311.field5289 = 0;
        class307.field5217 = 0;
        class2.method18(2073);
        class189.method1279((byte) -112);
        class57.method440((byte) 93);
        if (arg0 < 53) {
            return;
        }
        for (int var1 = 0; var1 < class307.field5217; var1++) {
            int var2 = class152.field2615[var1];
            if (class202.field3498 != class16.field214[var2].field951) {
                if (class16.field214[var2].field1906.method1030(64)) {
                    class42.method337(-1, class16.field214[var2]);
                }
                class16.field214[var2].field1906 = null;
                class16.field214[var2] = null;
            }
        }
        if (class241.field4184 != class293.field5036.field4051) {
            throw new RuntimeException("gnp1 pos:" + class293.field5036.field4051 + " psize:" + class241.field4184);
        }
        for (int var3 = 0; var3 < class226.field3895; var3++) {
            if (class16.field214[class92.field1616[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class226.field3895);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BIII)V", line = 62)
    public static final void method1690(byte arg0, int arg1, int arg2, int arg3) {
        field4292++;
        class286 var4 = class48.method389(arg2, 4, 10738);
        if (arg0 <= -119) {
            var4.method2017(-82);
            var4.field4932 = arg3;
            var4.field4926 = arg1;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V", line = 95)
    public static final void method1691(int arg0) {
        field4294++;
        if (arg0 == 0) {
            class23.field290 = new class171[class289.field4987.method1444(true)][];
            class48.field720 = new boolean[class289.field4987.method1444(true)];
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V", line = 113)
    public static void method1692(int arg0) {
        field4287 = null;
        field4288 = null;
        if (arg0 != 10502) {
            method1692(-127);
        }
        field4293 = null;
        field4291 = null;
        field4289 = null;
    }
}
