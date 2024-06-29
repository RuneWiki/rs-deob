import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class71 {

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Lmh;")
    public static class128 field1318 = class22.method156(127, ":assist:");

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lmh;")
    public static class128 field1319 = class22.method156(122, "null");

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lq;")
    public static class90 field1320 = new class90(5000);

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lmh;")
    public static class128 field1323 = class22.method156(127, "gleiten:");

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lmh;")
    public static class128 field1322 = class22.method156(127, "Fallen lassen");

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Ldj;")
    public static class314 field1321;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)J", line = 5)
    public static final synchronized long method470(boolean arg0) {
        long var1 = System.currentTimeMillis();
        if (class128.field2186 > var1) {
            class139.field2387 += class128.field2186 - var1;
        }
        class128.field2186 = var1;
        if (!arg0) {
            field1321 = (class314) null;
        }
        field1317++;
        return class139.field2387 + var1;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V", line = 60)
    public static void method471(boolean arg0) {
        if (arg0) {
            return;
        }
        field1319 = null;
        field1322 = null;
        field1321 = null;
        field1318 = null;
        field1320 = null;
        field1323 = null;
    }
}
