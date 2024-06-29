import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class334 {

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "Ljo;")
    public static class382 field5170;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field5172;

    static {
        new class347("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
        field5170 = new class382(50);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[F)[F", line = 12)
    public static final float[] method2058(int arg0, int arg1, float[] arg2) {
        field5171++;
        int var3 = 41 / ((11 - arg0) / 47);
        float[] var4 = new float[arg1];
        class442.method2589(arg2, 0, var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjava/lang/String;)I", line = 31)
    public static final int method2059(int arg0, String arg1) {
        field5172++;
        for (int var2 = arg0; var2 < class134.field2006.length; var2++) {
            if (class134.field2006[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 48)
    public static void method2060(int arg0) {
        field5170 = null;
        if (arg0 != -1) {
            method2058(79, -31, null);
        }
    }
}
