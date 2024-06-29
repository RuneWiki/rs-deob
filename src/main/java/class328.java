import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class328 {

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field5042 = 0;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field5041 = 0;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field5040 = 0;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "Lcn;")
    public static class37 field5044 = new class37(16);

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5046 = "scroll:";

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)Z", line = 6)
    public static final boolean method2321(int arg0, int arg1) {
        field5045++;
        if (class151.field2468[arg1]) {
            return true;
        } else if (class228.field3561.method212(arg1, 25345)) {
            int var2 = class228.field3561.method197((byte) -100, arg1);
            if (var2 == 0) {
                class151.field2468[arg1] = true;
                return true;
            }
            if (class334.field5108[arg1] == null) {
                class334.field5108[arg1] = new class342[var2];
            }
            for (int var3 = arg0; var3 < var2; var3++) {
                if (class334.field5108[arg1][var3] == null) {
                    byte[] var4 = class228.field3561.method187(arg1, var3, -1);
                    if (var4 != null) {
                        class342 var5 = class334.field5108[arg1][var3] = new class342();
                        var5.field5433 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method2409(new class25(var4), arg0 ^ 0x1);
                        } else {
                            var5.method2398(false, new class25(var4));
                        }
                    }
                }
            }
            class151.field2468[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V", line = 70)
    public static void method2322(byte arg0) {
        if (arg0 < -34) {
            field5046 = null;
            field5044 = null;
        }
    }
}
