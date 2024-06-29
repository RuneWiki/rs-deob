import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class275 {

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "[[I")
    public static int[][] field4248 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4250 = "glow1:";

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field4252 = new String[500];

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1886(int arg0, int arg1) {
        field4251++;
        if (arg1 > 91) {
            class321.field5014.method2175(arg0, -1401253017);
            class149.field2261.method2175(arg0, -1401253017);
            class229.field3639.method2175(arg0, -1401253017);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 19)
    public static void method1887(byte arg0) {
        if (arg0 != 109) {
            field4248 = (int[][]) ((int[][]) null);
        }
        field4250 = null;
        field4248 = (int[][]) null;
        field4252 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ll;I)V", line = 32)
    public static final void method1888(class133 arg0, int arg1) {
        field4247++;
        if (arg1 != -3546) {
            method1887((byte) 41);
        }
        class31.field451 = arg0;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)I", line = 59)
    public static final int method1889(int arg0, boolean arg1) {
        field4249++;
        if (!arg1) {
            field4248 = (int[][]) ((int[][]) null);
        }
        return arg0 & 0x7F;
    }
}
