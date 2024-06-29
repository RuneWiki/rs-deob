import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class189 extends class272 {

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "Ljava/lang/Object;")
    private Object field3237;

    @OriginalMember(owner = "client!ij", name = "db", descriptor = "Ljd;")
    public static class85 field3244 = class221.method1499("<col=00ff80>", (byte) -70);

    @OriginalMember(owner = "client!ij", name = "V", descriptor = "Ljd;")
    public static class85 field3236 = class221.method1499("(U0a )2 via: ", (byte) 115);

    @OriginalMember(owner = "client!ij", name = "eb", descriptor = "Ljd;")
    public static class85 field3245 = class221.method1499("Fps:", (byte) 102);

    @OriginalMember(owner = "client!ij", name = "bb", descriptor = "I")
    public static int field3242 = 0;

    @OriginalMember(owner = "client!ij", name = "gb", descriptor = "Lve;")
    public static class184 field3247 = new class184(64);

    @OriginalMember(owner = "client!ij", name = "hb", descriptor = "Ljd;")
    public static class85 field3248 = class221.method1499("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", (byte) 94);

    @OriginalMember(owner = "client!ij", name = "ib", descriptor = "Ltd;")
    public static class70 field3249 = new class70(5000);

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ij", name = "Z", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!ij", name = "ab", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!ij", name = "cb", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!ij", name = "fb", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!ij", name = "jb", descriptor = "Lge;")
    public static class68 field3250;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLjb;)Z")
    public static final boolean method1296(byte arg0, class255 arg1) {
        field3240++;
        if (arg1.field4519 == 205) {
            class153.field2621 = 250;
            return true;
        } else {
            if (arg0 < 4) {
                field3249 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static void method1297(byte arg0) {
        field3249 = null;
        field3250 = null;
        if (arg0 < 95) {
            return;
        }
        field3236 = null;
        field3244 = null;
        field3245 = null;
        field3248 = null;
        field3247 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class217.field3802 <= arg5 && arg1 <= class83.field1513 && arg6 >= class34.field522 && arg4 <= class1.field6) {
            class72.method511(arg3, 0, arg6, arg1, arg4, arg2, arg7, arg5);
        } else {
            class212.method1458(arg3, arg7, 57, arg4, arg2, arg6, arg1, arg5);
        }
        field3243++;
        if (arg0 != 5000) {
            method1296((byte) -110, (class255) null);
        }
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1299(int arg0) {
        if (arg0 <= 8) {
            field3245 = null;
        }
        field3238++;
        return this.field3237;
    }

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "(I)Z")
    public final boolean method1300(int arg0) {
        if (arg0 != 950234311) {
            method1296((byte) -72, (class255) null);
        }
        field3239++;
        return false;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILof;Lof;)V")
    public static final void method1301(int arg0, class253 arg1, class253 arg2) {
        if (arg1.field4372 != null) {
            arg1.method1753(137);
        }
        arg1.field4370 = arg2;
        if (arg0 != -206) {
            method1301(-19, (class253) null, (class253) null);
        }
        field3246++;
        arg1.field4372 = arg2.field4372;
        arg1.field4372.field4370 = arg1;
        arg1.field4370.field4372 = arg1;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class189(Object arg0) {
        this.field3237 = arg0;
    }
}
