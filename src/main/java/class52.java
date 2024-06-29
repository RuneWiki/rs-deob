import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class52 extends RuntimeException {

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Ljava/lang/String;")
    public String field1345;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1339;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field1335 = 0;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lv;")
    private static class122 field1334 = class55.method425(-74, "This world is full)3");

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lv;")
    private static class122 field1340 = class55.method425(-112, "Login server offline)3");

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field1333 = 0;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field1346 = 0;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field1343 = 0;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Lv;")
    public static class122 field1336 = field1340;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Lv;")
    private static class122 field1347 = class55.method425(-92, "green:");

    @OriginalMember(owner = "client!id", name = "j", descriptor = "Lv;")
    public static class122 field1342 = field1347;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Lv;")
    public static class122 field1348 = field1334;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Lkb;")
    public static class62 field1338;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 3)
    public static void method409(int arg0) {
        field1336 = null;
        field1342 = null;
        int var1 = -17 / ((arg0 + 64) / 34);
        field1338 = null;
        field1348 = null;
        field1347 = null;
        field1334 = null;
        field1340 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 19)
    public static final void method410(byte arg0) {
        if (arg0 != 70) {
            field1338 = null;
        }
        field1341++;
        for (class94 var1 = (class94) class25.field672.method311((byte) 123); var1 != null; var1 = (class94) class25.field672.method302((byte) -30)) {
            if (class34.field848 != var1.field2419 || var1.field2415) {
                var1.method249(0);
            } else if (class16.field396 >= var1.field2430) {
                var1.method746(class64.field1663, arg0 ^ 0x38);
                if (var1.field2415) {
                    var1.method249(arg0 ^ 0x46);
                } else {
                    class90.field2306.method39(var1.field2419, var1.field2403, var1.field2424, var1.field2400, 60, var1, 0, -1, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V", line = 68)
    public static final void method411(int arg0, int arg1) {
        field1337++;
        if (arg0 == -1 || !class109.field2681[arg0]) {
            return;
        }
        class75.field2016.method609(0, arg0);
        if (class76.field2039[arg0] == null || arg1 != 95) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class76.field2039[arg0].length; var3++) {
            if (class76.field2039[arg0][var3] != null) {
                if (class76.field2039[arg0][var3].field941 == 2) {
                    var2 = false;
                } else {
                    class76.field2039[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class76.field2039[arg0] = null;
        }
        class109.field2681[arg0] = false;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V", line = 115)
    public static final void method412(int arg0) {
        if (arg0 != 58) {
            method409(-42);
        }
        class70.field1831 = null;
        class112.field2739 = null;
        class50.field1257 = null;
        class120.field2906 = null;
        class21.field582 = null;
        class14.field362 = null;
        class34.field864 = null;
        class25.field687 = null;
        field1344++;
        class131.field3184 = null;
        class84.field2193 = null;
        class25.field678 = null;
        class100.field2484 = null;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 170)
    public class52(Throwable arg0, String arg1) {
        this.field1345 = arg1;
        this.field1339 = arg0;
    }
}
