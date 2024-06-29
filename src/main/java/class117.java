import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class117 extends class184 {

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "[I")
    public int[] field2028 = new int[] { -1 };

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "[I")
    public int[] field2036 = new int[] { 0 };

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "Lsf;")
    private static class108 field2022 = class140.method973(255, "Sun");

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "Lsf;")
    private static class108 field2025 = class140.method973(255, "Wed");

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "[I")
    public static int[] field2030 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "Lsf;")
    private static class108 field2034 = class140.method973(255, "level: ");

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "Lsf;")
    private static class108 field2023 = class140.method973(255, "Fri");

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "Lsf;")
    public static class108 field2035 = field2034;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "Lsf;")
    private static class108 field2038 = class140.method973(255, "Mon");

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "[F")
    public static float[] field2031 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "Lsf;")
    private static class108 field2037 = class140.method973(255, "Sat");

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "Lsf;")
    public static class108 field2027 = class140.method973(255, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "Lsf;")
    private static class108 field2040 = class140.method973(255, "Tue");

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "Lsf;")
    private static class108 field2039 = class140.method973(255, "Thu");

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "[Lsf;")
    public static class108[] field2024 = new class108[] { field2022, field2038, field2040, field2025, field2039, field2023, field2037 };

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)I", line = 10)
    public static final int method832(int arg0, byte arg1) {
        field2029++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return arg1 <= 57 ? 69 : var6 + 1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([Lsf;Z)Lsf;", line = 31)
    public static final class108 method833(class108[] arg0, boolean arg1) {
        field2032++;
        if (arg1) {
            return (class108) null;
        } else if (arg0.length >= 2) {
            return class1.method4(0, arg0.length, arg0, (byte) 86);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V", line = 93)
    public static void method834(int arg0) {
        field2037 = null;
        field2025 = null;
        field2039 = null;
        field2038 = null;
        field2040 = null;
        field2031 = null;
        field2034 = null;
        field2024 = null;
        field2022 = null;
        field2030 = null;
        field2027 = null;
        int var1 = -23 % ((-arg0 - 68) / 51);
        field2035 = null;
        field2023 = null;
    }
}
