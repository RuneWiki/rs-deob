import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class class194 extends class200 {

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    public static int field3407 = 0;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
    public static int field3409 = 0;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "Lwk;")
    public static class273 field3405 = new class273(200);

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "Ltg;")
    public static class182 field3410;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "[Lde;")
    public static class109[] field3406;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)Z")
    public abstract boolean method53(byte arg0);

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method52(byte arg0);

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
    public static final void method1311(int arg0) {
        if (arg0 != -10338) {
            return;
        }
        class64.field1078 = 0;
        client.field2779 = 0;
        class222.method1467(false);
        field3408++;
        class127.method839(115);
        class122.method808((byte) -112);
        class254.method1648(arg0 + 2053671658);
        for (int var1 = 0; var1 < client.field2779; var1++) {
            int var3 = class100.field1715[var1];
            if (class56.field926 != class259.field4515[var3].field1274) {
                if (class259.field4515[var3].field3245 > 0) {
                    class131.method879(-1, class259.field4515[var3]);
                }
                class259.field4515[var3] = null;
            }
        }
        if (class180.field3146 != class129.field2252.field4587) {
            throw new RuntimeException("gpp1 pos:" + class129.field2252.field4587 + " psize:" + class180.field3146);
        }
        for (int var2 = 0; var2 < class190.field3342; var2++) {
            if (class259.field4515[class105.field1765[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class190.field3342);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(B)V")
    public static void method1312(byte arg0) {
        field3410 = null;
        field3405 = null;
        if (arg0 != -94) {
            field3406 = null;
        }
        field3406 = null;
    }
}
