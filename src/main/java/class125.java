import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class125 extends class53 {

    @OriginalMember(owner = "client!q", name = "G", descriptor = "Lp;")
    private static class280 field2180 = class18.method140((byte) -120, "Jan");

    @OriginalMember(owner = "client!q", name = "L", descriptor = "[I")
    public static int[] field2185 = new int[99];

    @OriginalMember(owner = "client!q", name = "O", descriptor = "Lp;")
    private static class280 field2188 = class18.method140((byte) -122, "Aug");

    @OriginalMember(owner = "client!q", name = "J", descriptor = "Lp;")
    private static class280 field2183 = class18.method140((byte) -123, "Jun");

    @OriginalMember(owner = "client!q", name = "H", descriptor = "Lp;")
    private static class280 field2181 = class18.method140((byte) -123, "Feb");

    @OriginalMember(owner = "client!q", name = "K", descriptor = "Lp;")
    private static class280 field2184 = class18.method140((byte) -123, "Sep");

    @OriginalMember(owner = "client!q", name = "F", descriptor = "Lp;")
    private static class280 field2179 = class18.method140((byte) -121, "Oct");

    @OriginalMember(owner = "client!q", name = "M", descriptor = "Lp;")
    private static class280 field2186 = class18.method140((byte) -118, "Mar");

    @OriginalMember(owner = "client!q", name = "C", descriptor = "Lp;")
    private static class280 field2177 = class18.method140((byte) -117, "Jul");

    @OriginalMember(owner = "client!q", name = "N", descriptor = "Lp;")
    private static class280 field2187 = class18.method140((byte) -118, "Nov");

    @OriginalMember(owner = "client!q", name = "R", descriptor = "Lp;")
    private static class280 field2191 = class18.method140((byte) -121, "Apr");

    @OriginalMember(owner = "client!q", name = "S", descriptor = "Lp;")
    private static class280 field2192 = class18.method140((byte) -126, "May");

    @OriginalMember(owner = "client!q", name = "T", descriptor = "I")
    public static int field2193 = 0;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "Lp;")
    private static class280 field2194 = class18.method140((byte) -126, "Dec");

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "[Lp;")
    public static class280[] field2190 = new class280[] { field2180, field2181, field2186, field2191, field2192, field2183, field2177, field2188, field2184, field2179, field2187, field2194 };

    @OriginalMember(owner = "client!q", name = "I", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "Ltg;")
    public static class180 field2196;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "Lpf;")
    public static class281 field2178;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "[S")
    public static short[] field2195;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
    public static void method866(boolean arg0) {
        field2184 = null;
        field2195 = null;
        field2185 = null;
        field2183 = null;
        field2192 = null;
        field2191 = null;
        field2188 = null;
        field2194 = null;
        field2187 = null;
        field2177 = null;
        field2190 = null;
        field2179 = null;
        field2178 = null;
        field2196 = null;
        if (!arg0) {
            field2195 = null;
        }
        field2180 = null;
        field2186 = null;
        field2181 = null;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(Z)V")
    public static final void method867(boolean arg0) {
        if (arg0) {
            class103.field1708 = new class19(32);
            field2189++;
        }
    }

    @OriginalMember(owner = "client!q", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method777(int arg0);

    @OriginalMember(owner = "client!q", name = "f", descriptor = "(I)Z")
    public abstract boolean method776(int arg0);

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2185[var1] = var0 / 4;
        }
    }
}
