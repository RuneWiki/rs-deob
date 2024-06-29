import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class60 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Lvc;")
    private static class137 field1283 = class45.method325("flash3:", -46);

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Lvc;")
    public static class137 field1286 = field1283;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lvc;")
    public static class137 field1285 = class45.method325("Willkommen auf RuneScape", -46);

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lvc;")
    public static class137 field1284 = class45.method325("Konfig geladen)3", -46);

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Ljava/lang/Object;")
    public static Object field1290 = new Object();

    @OriginalMember(owner = "client!id", name = "j", descriptor = "[Lwd;")
    public static class144[] field1292 = new class144[4];

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field1295 = 0;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Lvc;")
    public static class137 field1293 = class45.method325("backvmid2", -46);

    @OriginalMember(owner = "client!id", name = "l", descriptor = "[Z")
    public static boolean[] field1294 = new boolean[5];

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Lvc;")
    private static class137 field1296 = class45.method325("Loading ignore list", -46);

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Lvc;")
    public static class137 field1291 = field1296;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static final void method429(int arg0) {
        if (arg0 == 0) {
            class84.field1899 = new class112(32);
            field1288++;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
    public static void method430(boolean arg0) {
        field1296 = null;
        if (!arg0) {
            method431(false, -10);
        }
        field1283 = null;
        field1292 = null;
        field1293 = null;
        field1286 = null;
        field1284 = null;
        field1291 = null;
        field1285 = null;
        field1290 = null;
        field1294 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)Z")
    public static final boolean method431(boolean arg0, int arg1) {
        field1289++;
        if (arg0) {
            return false;
        } else {
            return (arg1 >> 29 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)J")
    public static final synchronized long method432(boolean arg0) {
        field1287++;
        if (!arg0) {
            return 13L;
        }
        long var1 = System.currentTimeMillis();
        if (class143.field3361 > var1) {
            class123.field2863 += class143.field3361 - var1;
        }
        class143.field3361 = var1;
        return var1 + class123.field2863;
    }
}
