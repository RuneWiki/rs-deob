import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class357 {

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field5266 = 0;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Laba;")
    public static class651 field5265 = new class651(0, 0);

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Llc;")
    public static class435 field5268 = new class435(54, 7);

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Ldu;")
    public static class418 field5269;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "[Ltd;")
    public static class515[] field5267;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;", line = 5)
    public static final String[] method2268(byte arg0, String[] arg1) {
        field5264++;
        String[] var2 = new String[5];
        if (arg0 != 86) {
            return null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 46)
    public static void method2269(byte arg0) {
        field5269 = null;
        field5265 = null;
        field5268 = null;
        field5267 = null;
        int var1 = -43 / ((-arg0 - 51) / 50);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILla;)V", line = 58)
    public static final void method2270(int arg0, class423 arg1) {
        if (arg0 == 0) {
            field5263++;
            class561.field8133 = arg1;
        }
    }
}
