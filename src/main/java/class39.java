import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class39 {

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "Lri;")
    public static class73 field571;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Lri;")
    public static class73 field573;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "Ljava/lang/String;")
    public static String field572;

    static {
        new class475("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field571 = new class73(41, 8);
        field573 = new class73(91, 6);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 4)
    public static final boolean method235(byte arg0, String arg1) {
        int var2 = 85 / ((arg0 + 10) / 51);
        field568++;
        if (arg1 == null) {
            return false;
        }
        for (int var3 = 0; var3 < class315.field4496; var3++) {
            if (arg1.equalsIgnoreCase(class474.field6980[var3])) {
                return true;
            }
        }
        return arg1.equalsIgnoreCase(class500.field7365.field3548);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIBIIZIF)[I", line = 34)
    public static final int[] method236(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, int arg6, float arg7) {
        field570++;
        int[] var8 = new int[arg1];
        class409 var9 = new class409();
        var9.field6163 = arg5;
        var9.field6166 = arg6;
        var9.field6165 = (int) (arg7 * 4096.0F);
        var9.field6159 = arg4;
        var9.field6157 = arg0;
        int var10 = 28 / ((arg2 + 16) / 51);
        var9.field6155 = arg3;
        var9.method175(-1285532468);
        class374.method2297(arg1, true, 1);
        var9.method2469(var8, 0, 0);
        return var8;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 64)
    public static void method237(byte arg0) {
        field571 = null;
        field572 = null;
        field573 = null;
        if (arg0 >= -19) {
            field571 = null;
        }
    }
}
