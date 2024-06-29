import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class335 {

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5017 = null;

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "[I")
    public static int[] field5014 = new int[4096];

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "[J")
    public static long[] field5018;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "[I")
    public static int[] field5011;

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "[I")
    public static int[] field5019;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "[[[J")
    public static long[][][] field5016;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V")
    public static void method2161(boolean arg0) {
        if (arg0) {
            method2163((byte) -55);
        }
        field5017 = null;
        field5011 = null;
        field5018 = null;
        field5016 = null;
        field5019 = null;
        field5014 = null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lbd;IZII)V")
    public static final void method2162(class56 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field5012++;
        if (!arg2) {
            method2163((byte) -1);
        }
        for (class509 var5 = (class509) class203.field3124.method1224(-2); var5 != null; var5 = (class509) class203.field3124.method1232(-2)) {
            if (var5.field7197 == arg1 && (arg3 << 9) == var5.field7228 && (arg4 << 9) == var5.field7222 && var5.field7203.field1272 == arg0.field1272) {
                if (var5.field7212 != null) {
                    class50.field1184.method2073(var5.field7212);
                    var5.field7212 = null;
                }
                if (var5.field7221 != null) {
                    class50.field1184.method2073(var5.field7221);
                    var5.field7221 = null;
                }
                var5.method2588(300);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
    public static final void method2163(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class409.field5926[var1] = false;
        }
        if (arg0 != 113) {
            method2162(null, -25, true, 85, -34);
        }
        field5015++;
        class525.field7402 = 0;
        class379.field5609 = -1;
        class494.field7054 = -1;
        class519.field7365 = 0;
        class488.field6995 = -1;
        class266.field3950 = -1;
        class423.field6123 = 1;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field5014[var0] = class696.method3894(0, var0);
        }
        field5018 = new long[100];
    }
}
