import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class440 {

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "Lbv;")
    public static class567 field6420 = new class567("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "Liu;")
    public static class517 field6421 = new class517(107, 6);

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "[I")
    public static int[] field6423 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "[I")
    public static int[] field6422 = new int[32];

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V", line = 5)
    public static void method2601(int arg0) {
        field6422 = null;
        field6423 = null;
        field6421 = null;
        if (arg0 == 32) {
            field6420 = null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLjk;)V", line = 20)
    public static final void method2602(byte arg0, class170 arg1) {
        if (arg0 <= 8) {
            field6422 = null;
        }
        field6417++;
        for (class154 var2 = (class154) class90.field1611.method427(true); var2 != null; var2 = (class154) class90.field1611.method420(false)) {
            if (var2.field2317 == arg1) {
                if (var2.field2312 != null) {
                    class35.field485.method44(var2.field2312);
                    var2.field2312 = null;
                }
                var2.method911(-52);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZI)Z", line = 57)
    public static final boolean method2603(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method2602((byte) 37, null);
        }
        field6419++;
        return (arg2 & 0x70000) != 0 | class513.method2875(arg0, arg2, 34) || class511.method2866(arg0, arg2, 46);
    }
}
