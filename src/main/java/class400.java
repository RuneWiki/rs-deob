import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class400 extends class237 {

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field5873 = -1;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public int field5866;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public int field5867;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public int field5868;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public int field5872;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public int field5875;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public int field5876;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "Loa;")
    public static class488 field5877;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "Ljava/lang/String;")
    public String field5874;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "[I")
    public static int[] field5869;

    static {
        new class180("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V", line = 4)
    public static void method2490(int arg0) {
        field5877 = null;
        if (arg0 != 1) {
            field5877 = null;
        }
        field5869 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBIIZLhh;I)V", line = 17)
    public static final void method2491(int arg0, byte arg1, int arg2, int arg3, boolean arg4, class84 arg5, int arg6) {
        class156.field2378 = arg6;
        class251.field3626 = arg5;
        field5871++;
        class459.field6777 = arg0;
        class494.field7205 = arg4;
        class480.field7037 = arg2;
        class43.field655 = 1;
        class264.field3815 = class23.field420.method2121(192) / arg3;
        if (class264.field3815 < 1) {
            class264.field3815 = 1;
        }
        if (arg1 > -86) {
            field5873 = 79;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BII)Z", line = 44)
    public static final boolean method2492(byte arg0, int arg1, int arg2) {
        if (arg0 < 5) {
            method2492((byte) -92, 102, 111);
        }
        field5870++;
        return class97.method769(arg1, arg2, (byte) -116) || class427.method2608(arg1, arg2, 27466);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLqa;Lko;II)V", line = 58)
    public static final void method2493(byte arg0, class162 arg1, class348 arg2, int arg3, int arg4) {
        if (arg0 < 85) {
            return;
        }
        field5878++;
        class282.field4093.method2264(33);
        if (class162.field2453) {
            return;
        }
        for (class42 var5 = (class42) arg2.method2257((byte) 111); var5 != null; var5 = (class42) arg2.method2256(127)) {
            class210 var6 = class2.field15.method1835(36, var5.field649);
            if (class88.method724(var6, 28)) {
                boolean var7 = class23.method198(arg3, 2, arg1, var5, arg4, var6);
                if (var7) {
                    class333.method2196(var6, var5, -28178, arg1);
                }
            }
        }
    }
}
