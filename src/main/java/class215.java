import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class215 extends class282 {

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "Luf;")
    public class22 field3692;

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "Ljf;")
    public static class229 field3690 = class212.method1457((byte) 72, "Jeter");

    @OriginalMember(owner = "client!ii", name = "U", descriptor = "I")
    public static int field3697 = 0;

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!ii", name = "V", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!ii", name = "W", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "Lkn;")
    public static class198 field3689;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILvc;)V", line = 4)
    public static final void method1477(int arg0, class192 arg1) {
        class122.method863(arg1, 200000, (byte) 5);
        field3696++;
        if (arg0 != -19319) {
            method1479((class67) null, (byte) 92);
        }
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(B)V", line = 21)
    public static final void method1478(byte arg0) {
        class27 var1 = (class27) class282.field4844.method2078(-111);
        field3694++;
        while (var1 != null) {
            class69 var2 = var1.field479;
            if (class16.field254 != var2.field1329 || var2.field1308) {
                var1.method1747((byte) -95);
            } else if (class199.field3475 >= var2.field1327) {
                var2.method509(class146.field2540, (byte) 77);
                if (var2.field1308) {
                    var1.method1747((byte) -117);
                } else {
                    class106.method719(var2.field1329, var2.field1315, var2.field1328, var2.field1307, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class27) class282.field4844.method2080(5);
        }
        if (arg0 != 96) {
            field3699 = 88;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lnf;B)Lnf;", line = 58)
    public static final class67 method1479(class67 arg0, byte arg1) {
        field3695++;
        if (arg0.field1211 != -1) {
            return class96.method662(arg0.field1211, true);
        }
        int var2 = arg0.field1247 >>> 16;
        class267 var3 = new class267(class151.field2618);
        int var4 = 34 / ((-arg1 - 9) / 60);
        for (class321 var5 = (class321) var3.method1879(15504954); var5 != null; var5 = (class321) var3.method1882((byte) 100)) {
            if (var5.field5432 == var2) {
                return class96.method662((int) var5.field4265, true);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Luf;)V", line = 91)
    public class215(class22 arg0) {
        this.field3692 = arg0;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V", line = 104)
    public static void method1480(int arg0) {
        if (arg0 < 0) {
            field3690 = null;
            field3689 = null;
        }
    }
}
