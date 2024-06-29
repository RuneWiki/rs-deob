import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class438 extends class407 {

    @OriginalMember(owner = "client!so", name = "S", descriptor = "I")
    public static int field6314 = -1;

    @OriginalMember(owner = "client!so", name = "Q", descriptor = "Lrg;")
    public static class597 field6312 = new class597();

    @OriginalMember(owner = "client!so", name = "U", descriptor = "J")
    public static long field6316 = -1L;

    @OriginalMember(owner = "client!so", name = "V", descriptor = "Lte;")
    public static class571 field6317 = new class571("", 11);

    @OriginalMember(owner = "client!so", name = "W", descriptor = "Lja;")
    public static class254 field6318 = new class254(7, 0, 1, 1);

    @OriginalMember(owner = "client!so", name = "X", descriptor = "Lqfa;")
    public static class85 field6319 = new class85(86, 8);

    @OriginalMember(owner = "client!so", name = "N", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!so", name = "R", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!so", name = "T", descriptor = "[I")
    public static int[] field6315;

    @OriginalMember(owner = "client!so", name = "Y", descriptor = "[Lst;")
    public static class402[] field6320;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(I)V")
    public static void method2651(int arg0) {
        field6318 = null;
        field6320 = null;
        if (arg0 != -33) {
            method2652(true);
        }
        field6312 = null;
        field6319 = null;
        field6317 = null;
        field6315 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V")
    public static final void method2652(boolean arg0) {
        class358.field5340.method2286((byte) -49);
        field6311++;
        for (int var1 = 0; var1 < 32; var1++) {
            class238.field3525[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class168.field2822[var2] = 0L;
        }
        if (!arg0) {
            method2653(-8, -104);
        }
        class50.field1182 = 0;
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(II)Z")
    public static final boolean method2653(int arg0, int arg1) {
        if (arg0 != 0) {
            field6319 = null;
        }
        field6313++;
        return arg1 >= 4 && arg1 <= 8;
    }
}
