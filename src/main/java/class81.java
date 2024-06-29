import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class81 {

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lwm;")
    private static class152 field1134 = class157.method1048("Prepared sound engine", 98);

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Lwm;")
    public static class152 field1135 = class157.method1048(":assistreq:", 127);

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Z")
    public static boolean field1131 = true;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lwm;")
    public static class152 field1130 = field1134;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Lwm;")
    public static class152 field1139 = class157.method1048("m", 127);

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lmd;")
    public static class251 field1132 = new class251();

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "Lwm;")
    private static class152 field1141 = class157.method1048("green:", 102);

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "Lwm;")
    public static class152 field1143 = field1141;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Lwm;")
    public static class152 field1142 = field1141;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Lah;")
    public static class205 field1138;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "[I")
    public static int[] field1140;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 122)
    public static void method534(int arg0) {
        field1130 = null;
        field1142 = null;
        field1134 = null;
        field1135 = null;
        field1139 = null;
        if (arg0 != 20177) {
            field1137 = 57;
        }
        field1132 = null;
        field1140 = null;
        field1141 = null;
        field1138 = null;
        field1143 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(DI)V", line = 189)
    public static final void method535(double arg0, int arg1) {
        field1133++;
        int var3 = -38 / ((arg1 - 82) / 41);
        if (class92.field1282 == arg0) {
            return;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = (int) (Math.pow((double) var4 / 255.0D, arg0) * 255.0D);
            class304.field5231[var4] = var5 > 255 ? 255 : var5;
        }
        class92.field1282 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIJ)Z", line = 217)
    public static final boolean method536(int arg0, int arg1, int arg2, long arg3) {
        class34 var5 = class287.field4857[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field573 != null && var5.field573.field5019 == arg3) {
            return true;
        } else if (var5.field554 != null && var5.field554.field4717 == arg3) {
            return true;
        } else if (var5.field558 != null && var5.field558.field1685 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field579; var6++) {
                if (var5.field580[var6].field4156 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }
}
