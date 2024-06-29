import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class57 {

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Lpe;")
    private static class109 field1144 = class141.method1120(" has logged in)3", 0);

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "[I")
    public static int[] field1149 = new int[500];

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "Lpe;")
    private static class109 field1156 = class141.method1120("Login", 0);

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Lpe;")
    private static class109 field1154 = class141.method1120("Press (Wrecover a locked account(W on front page)3", 0);

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Lpe;")
    public static class109 field1153 = class141.method1120("<img=0>", 0);

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Lpe;")
    public static class109 field1148 = field1144;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "Lpe;")
    public static class109 field1157 = field1156;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Lpe;")
    public static class109 field1159 = field1154;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Lpe;")
    private static class109 field1151 = class141.method1120("Try again in 60 secs)3)3)3", 0);

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "Lpe;")
    public static class109 field1161 = field1151;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public int field1143;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Lma;")
    public class84 field1146;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Lma;")
    public class84 field1155;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "Lma;")
    public class84 field1160;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "[I")
    public static int[] field1142;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method448(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field1159 = null;
        field1156 = null;
        field1154 = null;
        field1148 = null;
        field1151 = null;
        field1149 = null;
        field1142 = null;
        field1144 = null;
        field1157 = null;
        field1161 = null;
        field1153 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IJ)V")
    public static final void method449(int arg0, long arg1) {
        field1152++;
        if (arg1 == 0L) {
            return;
        }
        if (class63.field1295 >= 100) {
            class75.method593(0, class131.field2866, -8870, class35.field784);
            return;
        }
        class109 var3 = class72.method582(false, arg1).method902((byte) 42);
        for (int var4 = 0; var4 < class63.field1295; var4++) {
            if (class38.field838[var4] == arg1) {
                class75.method593(0, class131.field2866, -8870, class44.method405(new class109[] { var3, class151.field3335 }, (byte) -74));
                return;
            }
        }
        for (int var5 = arg0; var5 < class110.field2330; var5++) {
            if (class112.field2415[var5] == arg1) {
                class75.method593(0, class131.field2866, -8870, class44.method405(new class109[] { class91.field1953, var3, class128.field2844 }, (byte) -74));
                return;
            }
        }
        if (var3.method908(class136.field2975.field1051, (byte) 83)) {
            class75.method593(0, class131.field2866, arg0 - 8870, class139.field3041);
            return;
        }
        class38.field838[class63.field1295] = arg1;
        class143.field3155[class63.field1295++] = class72.method582(false, arg1);
        class87.field1851++;
        class75.field1498 = class9.field219;
        class63.field1299.method535(162, arg0 - 25013);
        class63.field1299.method157((byte) 75, arg1);
    }
}
