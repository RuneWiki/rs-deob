import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class349 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    private static int field5102 = 0;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Z")
    private static boolean field5104 = false;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Lga;")
    private static class420 field5103 = new class420();

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static final synchronized void method2204(int arg0) {
        if (arg0 != 4563) {
            field5102 = 91;
        }
        field5102++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BZ)V")
    public static final synchronized void method2205(byte arg0, boolean arg1) {
        field5104 = arg1;
        if (arg0 > -35) {
            method2207(-73);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILe;)V")
    public static final synchronized void method2206(int arg0, class556 arg1) {
        if (arg0 <= 15) {
            field5103 = null;
        }
        if (field5104) {
            return;
        }
        if (field5102 <= 0) {
            arg1.method156(false);
        } else {
            class352 var2 = new class352();
            var2.field5123 = arg1;
            field5103.method2510(var2, false);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public static final synchronized void method2207(int arg0) {
        while (true) {
            class352 var1 = (class352) field5103.method2507(-116);
            if (var1 == null) {
                if (arg0 < 27) {
                    method2208((byte) 39);
                    return;
                }
                return;
            }
            var1.field5123.method156(true);
            var1.method3117((byte) -87);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static final synchronized void method2208(byte arg0) {
        if (arg0 != 59) {
            field5102 = -21;
        }
        field5102--;
        if (field5102 == 0) {
            method2207(arg0 ^ 0x62);
        }
    }
}
