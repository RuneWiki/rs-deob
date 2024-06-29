import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class523 {

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Lqfa;")
    public static class98 field7406 = new class98(9, 7);

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Loi;")
    public static class72 field7405;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static void method3061(byte arg0) {
        field7405 = null;
        field7406 = null;
        int var1 = 89 % ((arg0 - 62) / 35);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([[FI[[S)[[S")
    public static final short[][] method3062(float[][] arg0, int arg1, short[][] arg2) {
        for (int var3 = arg1; var3 < arg0.length; var3++) {
            for (int var4 = 0; var4 < arg2[var3].length; var4++) {
                arg2[var3][var4] = (short) ((int) (arg0[var3][var4] * 16383.0F));
            }
        }
        field7407++;
        return arg2;
    }
}
