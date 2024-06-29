import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class106 {

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "I")
    public int field1421;

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "Lfc;")
    public static class235 field1419 = new class235(95, -2);

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "Lof;")
    public static class568 field1427 = new class568(9, 7);

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!laa", name = "h", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!laa", name = "i", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljr;B)Lki;", line = 11)
    public static final class651 method801(class96 arg0, byte arg1) {
        field1418++;
        class80 var2 = class496.method2772((byte) -25, arg0);
        int var3 = -83 / ((74 - arg1) / 50);
        int var4 = arg0.method714(false);
        int var5 = arg0.method714(false);
        return new class651(var2.field1108, var2.field1117, var2.field1116, var2.field1118, var2.field1113, var2.field1109, var2.field1110, var4, var5);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZZ)Z", line = 27)
    public static boolean method802(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!laa", name = "toString", descriptor = "()Ljava/lang/String;", line = 34)
    public final String toString() {
        field1426++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZLjava/lang/String;ZLtt;Z)V", line = 43)
    public static final void method803(boolean arg0, String arg1, boolean arg2, class79 arg3, boolean arg4) {
        if (arg4) {
            field1424 = -56;
        }
        field1425++;
        if (!arg0) {
            class158.method1097(arg3, 3, 3, arg1);
            return;
        }
        if (class79.field1095.startsWith("win") && arg3.field1084) {
            String var5 = null;
            if (class188.field2779 != null) {
                var5 = class188.field2779.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class260 var6 = class158.method1097(arg3, 3, 0, arg1);
                class46.field693 = arg3;
                class427.field6007 = var6;
                class448.field6257 = arg1;
                return;
            }
        }
        if (class79.field1095.startsWith("mac")) {
            String var7 = null;
            if (class188.field2779 != null) {
                var7 = class188.field2779.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg2) {
                class158.method1097(arg3, 3, 1, arg1);
                return;
            }
        }
        class158.method1097(arg3, 3, 2, arg1);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)V", line = 109)
    public static void method804(byte arg0) {
        field1427 = null;
        if (arg0 <= 47) {
            method801(null, (byte) -10);
        }
        field1419 = null;
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(IIII)V", line = 127)
    public class106(int arg0, int arg1, int arg2, int arg3) {
        this.field1423 = arg0;
        this.field1421 = arg2;
        this.field1422 = arg1;
        this.field1420 = arg3;
    }
}
