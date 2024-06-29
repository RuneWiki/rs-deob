import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class221 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "[Z")
    public static boolean[] field3297 = new boolean[100];

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lau;")
    public static class692 field3303 = new class692();

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Liv;")
    public static class565 field3305 = new class565();

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field3307 = 0;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "J")
    public static long field3308 = 0L;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public int field3298;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "J")
    public static long field3302;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lf;")
    public static class257 field3304;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "Ljava/lang/String;")
    public String field3300;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "[I")
    public static int[] field3306;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1476(String[] arg0, int arg1) {
        field3301++;
        String[] var2 = new String[5];
        if (arg1 != -24360) {
            return null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static void method1477(int arg0) {
        field3306 = null;
        field3297 = null;
        if (arg0 <= 44) {
            method1476(null, -103);
        }
        field3303 = null;
        field3304 = null;
        field3305 = null;
    }
}
