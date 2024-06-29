import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class183 {

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field3216 = 0;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field3220 = -1;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field3218 = -1;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "[I")
    public static int[] field3217 = new int[256];

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "Lqj;")
    public static class196 field3223 = class80.method502(":assist:", -48);

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "Lnb;")
    public static class95 field3221;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static void method1194(byte arg0) {
        field3223 = null;
        field3221 = null;
        field3217 = null;
        if (arg0 != 48) {
            method1195((byte) -60);
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)J")
    public static final synchronized long method1195(byte arg0) {
        if (arg0 <= 116) {
            return 107L;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < class218.field3910) {
            class186.field3278 += class218.field3910 - var1;
        }
        field3219++;
        class218.field3910 = var1;
        return class186.field3278 + var1;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ldj;I)V")
    public static final void method1196(class137 arg0, int arg1) {
        if (arg0.field2112 == 0) {
            arg0.field2077 = 1024;
        }
        if (arg0.field2112 == 1) {
            arg0.field2077 = 1536;
        }
        field3222++;
        arg0.field2076 = arg1;
        int var2 = arg0.field2089 - class171.field2879;
        int var3 = arg0.field2092 * 128 + arg0.field2049 * 64;
        if (arg0.field2112 == 2) {
            arg0.field2077 = 0;
        }
        if (arg0.field2112 == 3) {
            arg0.field2077 = 512;
        }
        int var4 = arg0.field2067 * 128 + arg0.field2049 * 64;
        arg0.field2085 += (var4 - arg0.field2085) / var2;
        arg0.field2081 += (var3 - arg0.field2081) / var2;
    }
}
