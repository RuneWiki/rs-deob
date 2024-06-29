import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class178 {

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Z")
    public static boolean field2556 = false;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field2558 = 0;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "[[B")
    public static byte[][] field2560;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1241(int arg0) {
        field2559++;
        for (int var1 = 0; var1 < 5; var1++) {
            class71.field1021[var1] = false;
        }
        int var2 = 32 % ((74 - arg0) / 34);
        class288.field4364 = 0;
        class261.field3949 = -1;
        class86.field1208 = 5;
        class174.field2507 = -1;
        class76.field1116 = 0;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V", line = 42)
    public static void method1242(int arg0) {
        if (arg0 != 0) {
            field2560 = (byte[][]) ((byte[][]) null);
        }
        field2560 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILph;I)Lln;", line = 53)
    public static final class118 method1243(int arg0, class361 arg1, int arg2) {
        if (arg0 != 0) {
            field2556 = false;
        }
        field2561++;
        return class329.method2282(9, arg2, arg1) ? class92.method722(0) : null;
    }
}
