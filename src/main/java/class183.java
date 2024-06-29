import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class183 {

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2948 = "Loading...";

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public int field2946;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public int field2951;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Llc;")
    public static class86 field2947;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "[B")
    public static byte[] field2944;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)V")
    public static final void method1358(int arg0, boolean arg1) {
        class112.field1613 = -1;
        if (arg0 == 37) {
            class229.field3689 = 3.0F;
        } else if (arg0 == 50) {
            class229.field3689 = 4.0F;
        } else if (arg0 == 75) {
            class229.field3689 = 6.0F;
        } else if (arg0 == 100) {
            class229.field3689 = 8.0F;
        } else if (arg0 == 200) {
            class229.field3689 = 16.0F;
        }
        if (!arg1) {
            field2944 = null;
        }
        class112.field1613 = -1;
        field2943++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V")
    public static final void method1359(int arg0, int arg1) {
        class78.field1127.method1548(arg1, 0);
        if (arg0 != 26893) {
            method1359(-27, -55);
        }
        field2949++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method1360(int arg0) {
        field2948 = null;
        field2947 = null;
        if (arg0 == -1) {
            field2944 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILlc;)V")
    public static final void method1361(int arg0, class86 arg1) {
        class250.field4157 = arg1;
        field2945++;
        if (arg0 != 8812) {
            method1360(86);
        }
    }
}
