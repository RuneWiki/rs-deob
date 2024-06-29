import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class407 {

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Z")
    public static boolean field6166 = false;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "[I")
    public static int[] field6164 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "Lmn;")
    public static class249 field6167 = new class249(16);

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "[Z")
    public static boolean[] field6170 = new boolean[100];

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field6171 = 0;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "[I")
    public static int[] field6168 = new int[16384];

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "[I")
    public static int[] field6169 = new int[16384];

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field6165;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field6169[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field6168[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILnn;)V", line = 5)
    public static final void method2525(int arg0, int arg1, class289 arg2) {
        field6165++;
        if (arg1 != 4) {
            method2525(-102, 13, null);
        }
        if (class208.field3331 == null) {
            return;
        }
        try {
            class208.field3331.method2093(-1006, 0L);
            class208.field3331.method2088(arg2.field4408, 24, -25627, arg0);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 32)
    public static void method2526(int arg0) {
        field6168 = null;
        field6169 = null;
        field6170 = null;
        field6167 = null;
        field6164 = null;
        if (arg0 != 2) {
            method2525(-117, -73, null);
        }
    }
}
