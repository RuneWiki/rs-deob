import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class301 {

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field4915 = 0;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public int field4914;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Laj;")
    public static class151 field4912;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Ljava/lang/String;")
    public String field4916;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
    public static final boolean method2056(int arg0, int arg1) {
        field4917++;
        if (class169.field2730[arg1]) {
            return true;
        } else if (class90.field1483.method1133(arg1, -55)) {
            int var2 = class90.field1483.method1132(16777215, arg1);
            if (~var2 == arg0) {
                class169.field2730[arg1] = true;
                return true;
            }
            if (class208.field3515[arg1] == null) {
                class208.field3515[arg1] = new class207[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class208.field3515[arg1][var3] == null) {
                    byte[] var4 = class90.field1483.method1149(arg1, (byte) 70, var3);
                    if (var4 != null) {
                        class207 var5 = class208.field3515[arg1][var3] = new class207();
                        var5.field3405 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1455((byte) 121, new class249(var4));
                        } else {
                            var5.method1450(new class249(var4), 7);
                        }
                    }
                }
            }
            class169.field2730[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method2057(byte arg0) {
        if (arg0 == -106) {
            field4912 = null;
        }
    }
}
