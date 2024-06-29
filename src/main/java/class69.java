import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class69 extends RuntimeException {

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Ljava/lang/String;")
    public String field1220;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1218;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field1222 = 0;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "[Lhe;")
    public static class230[] field1221 = new class230[100];

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field1223 = -1;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Lub;")
    public static class227 field1225 = class257.method1749("leuchten3:", 17263);

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Lub;")
    private static class227 field1226 = class257.method1749("Loaded fonts", 17263);

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "Lub;")
    public static class227 field1227 = class257.method1749(" <col=00ff80>", 17263);

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Lub;")
    public static class227 field1228 = field1226;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Lnh;")
    public static class57 field1217;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "[Lgb;")
    public static class46[] field1224;

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class69(Throwable arg0, String arg1) {
        this.field1220 = arg1;
        this.field1218 = arg0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V")
    public static void method426(boolean arg0) {
        field1226 = null;
        field1227 = null;
        field1228 = null;
        field1221 = null;
        field1224 = null;
        if (!arg0) {
            field1226 = null;
        }
        field1217 = null;
        field1225 = null;
    }
}
