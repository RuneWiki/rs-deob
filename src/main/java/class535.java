import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class535 extends class62 {

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "Ljava/lang/Object;")
    private Object field7501;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "[I")
    public static int[] field7497 = new int[14];

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "I")
    public static int field7502 = 0;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "Luaa;")
    public static class370 field7498;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "(I)V", line = 5)
    public static void method3195(int arg0) {
        field7498 = null;
        field7497 = null;
        if (arg0 != -1) {
            method3196(120, null);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[Ljava/lang/String;)V", line = 19)
    public static final void method3196(int arg0, String[] arg1) {
        field7499++;
        if (arg0 > -39) {
            field7502 = 109;
        }
        if (arg1.length <= 1) {
            class577.field8263 = class577.field8263 + arg1[0];
            class718.field10149 += arg1[0].length();
            return;
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2].startsWith("pause")) {
                int var3 = 5;
                try {
                    var3 = Integer.parseInt(arg1[var2].substring(6));
                } catch (Exception var4) {
                }
                class645.method3738("Pausing for " + var3 + " seconds...", (byte) -49);
                class464.field6352 = arg1;
                class200.field2897 = var2 + 1;
                class77.field1053 = class224.method1457((byte) -62) + ((long) (var3 * 1000));
                return;
            }
            class577.field8263 = arg1[var2];
            class633.method3680(-1, false);
        }
    }

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "(I)Ljava/lang/Object;", line = 68)
    public final Object method401(int arg0) {
        if (arg0 != 0) {
            method3195(107);
        }
        field7500++;
        return this.field7501;
    }

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "(I)Z", line = 81)
    public final boolean method398(int arg0) {
        field7503++;
        if (arg0 != 233) {
            this.method398(21);
        }
        return false;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lwf;Ljava/lang/Object;I)V", line = 94)
    public class535(class107 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field7501 = arg1;
    }
}
