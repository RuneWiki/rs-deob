import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class147 {

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Lgg;")
    public static class63 field3100 = class116.method911(43, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Lgg;")
    public static class63 field3102 = class116.method911(43, "<br>");

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Lgg;")
    private static class63 field3107 = class116.method911(43, "Players");

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "Lgg;")
    public static class63 field3109 = field3107;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field3111 = -1;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public int field3099;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public int field3101;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public int field3104;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public int field3106;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "J")
    public long field3097;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Ld;")
    public class30 field3103;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "Ld;")
    public class30 field3105;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Ld;")
    public class30 field3110;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)I")
    public static final int method1028(int arg0, int arg1, int arg2) {
        field3108++;
        if (arg0 == -1) {
            long var3 = (long) ((arg2 << 16) + arg1);
            return class97.field2311 != null && class97.field2311.field3612 == var3 ? class17.field416.field54 * 99 / (class17.field416.field48.length - class97.field2311.field2520) + 1 : 0;
        } else {
            return 68;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method1029(int arg0) {
        field3109 = null;
        field3102 = null;
        if (arg0 == 493262000) {
            field3100 = null;
            field3107 = null;
        }
    }
}
