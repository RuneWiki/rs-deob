import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class109 extends class443 {

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "I")
    public int field1430 = 1;

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "Ljava/lang/String;")
    public static String field1423 = "Face here";

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "C")
    public char field1426;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "[Ll;")
    public static class315[] field1428;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method819(String arg0, byte arg1) {
        int var2 = -68 % ((arg1 - 30) / 59);
        field1427++;
        if (arg0 == null) {
            return;
        }
        String var3 = class350.method2310(arg0, (byte) 105);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class184.field2479; var4++) {
            String var5 = class350.method2310(class373.field5504[var4], (byte) 101);
            if (var5 != null && var5.equals(var3)) {
                class184.field2479--;
                for (int var6 = var4; var6 < class184.field2479; var6++) {
                    class373.field5504[var6] = class373.field5504[var6 + 1];
                    class7.field89[var6] = class7.field89[var6 + 1];
                    class335.field4962[var6] = class335.field4962[var6 + 1];
                    class309.field4577[var6] = class309.field4577[var6 + 1];
                    class400.field5862[var6] = class400.field5862[var6 + 1];
                }
                class453.field6586++;
                class365.field5399 = class394.field5732;
                class140.field1797.method1833(-20379, 168);
                class140.field1797.method2204(class9.method61((byte) -117, arg0), 8);
                class140.field1797.method2214(arg0, -102);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lfb;Z)V")
    public final void method820(class341 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method2233((byte) 104);
            if (var3 == 0) {
                field1422++;
                if (!arg1) {
                    field1423 = null;
                    return;
                }
                return;
            }
            this.method821(arg0, var3, (byte) 100);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lfb;IB)V")
    private final void method821(class341 arg0, int arg1, byte arg2) {
        if (arg2 < 61) {
            method822((byte) 27);
        }
        field1425++;
        if (arg1 == 1) {
            this.field1426 = class95.method758(arg0.method2211(255), false);
        } else if (arg1 == 2) {
            this.field1430 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(B)V")
    public static void method822(byte arg0) {
        if (arg0 != 74) {
            method819((String) null, (byte) -83);
        }
        field1423 = null;
        field1428 = null;
    }
}
