import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class156 extends class86 {

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "Lnf;")
    public class67 field2342;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2347 = "Loaded config";

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public static int field2340 = 0;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    public static int field2348 = 500;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    public static int field2346 = 0;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "[I")
    public static int[] field2345;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)Ljava/lang/String;", line = 12)
    public static final String method1136(int arg0, int arg1) {
        field2344++;
        return arg1 > arg0 ? Integer.toString(arg0) : "*";
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(B)V", line = 26)
    public static final void method1137(byte arg0) {
        int var1 = -1;
        if (arg0 < 56) {
            field2346 = 55;
        }
        while (var1 < class262.field3900) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class225.field3504[var1];
            }
            class121 var3 = class319.field4964[var2];
            if (var3 != null && var3.field4469 > 0) {
                var3.field4469--;
                if (var3.field4469 == 0) {
                    var3.field4518 = null;
                }
            }
            var1++;
        }
        field2343++;
        for (int var4 = 0; var4 < class122.field1923; var4++) {
            int var5 = class126.field1995[var4];
            class45 var6 = class161.field2394[var5];
            if (var6 != null && var6.field4469 > 0) {
                var6.field4469--;
                if (var6.field4469 == 0) {
                    var6.field4518 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V", line = 81)
    public static void method1138(int arg0) {
        if (arg0 == 0) {
            field2345 = null;
            field2347 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lnf;)V", line = 101)
    public class156(class67 arg0) {
        this.field2342 = arg0;
    }
}
