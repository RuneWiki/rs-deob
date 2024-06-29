import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class53 extends class108 {

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    public static int field1338 = 0;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "Lgd;")
    public static class40 field1342 = class14.method90(false, "mapmarker");

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "Lba;")
    public static class7 field1343 = new class7(64);

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "Lgd;")
    public static class40 field1346 = class14.method90(false, "Chat panel redrawn");

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    public static int field1349 = -1;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field1347 = 0;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "Lgd;")
    public static class40 field1355 = class14.method90(false, ":duelreq:");

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "Lgd;")
    private static class40 field1354 = class14.method90(false, "Loaded input handler");

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public static int field1348 = 0;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "I")
    public static volatile int field1357 = -1;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "Lgd;")
    public static class40 field1351 = field1354;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "Lgd;")
    public static class40 field1359 = class14.method90(false, " )2>");

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
    public int field1340;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "Lw;")
    public class135 field1344;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "Lnd;")
    public class82 field1339;

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1358;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "[B")
    public byte[] field1341;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "[I")
    public static int[] field1353;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "[I")
    public static int[] field1356;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)Lgd;", line = 14)
    public static final class40 method407(byte arg0, int arg1) {
        if (arg0 < 48) {
            return null;
        }
        field1345++;
        if (arg1 < 100000) {
            return class21.method121(23444, arg1);
        } else if (arg1 < 10000000) {
            return client.method114(true, new class40[] { class21.method121(23444, arg1 / 1000), class74.field1714 });
        } else {
            return client.method114(true, new class40[] { class21.method121(23444, arg1 / 1000000), class4.field91 });
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V", line = 54)
    public static void method408(byte arg0) {
        field1343 = null;
        field1351 = null;
        field1346 = null;
        if (arg0 >= -20) {
            return;
        }
        field1355 = null;
        field1342 = null;
        field1356 = null;
        field1353 = null;
        field1354 = null;
        field1359 = null;
        field1358 = null;
    }
}
