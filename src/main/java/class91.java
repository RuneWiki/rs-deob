import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class91 {

    @OriginalMember(owner = "client!eha", name = "d", descriptor = "Z")
    public static boolean field1252 = false;

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "[Lkr;")
    public static class748[] field1250 = new class748[37];

    @OriginalMember(owner = "client!eha", name = "f", descriptor = "[I")
    public static int[] field1254 = new int[8];

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!eha", name = "e", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)V", line = 3)
    public static void method734(int arg0) {
        if (arg0 != 8) {
            method734(54);
        }
        field1250 = null;
        field1254 = null;
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(III)I", line = 23)
    public final int method735(int arg0, int arg1, int arg2) {
        field1253++;
        int var4 = arg2 >= class356.field4586 ? arg2 : class356.field4586;
        if (class309.field4066 == this) {
            return 0;
        } else if (arg0 != 0) {
            return 27;
        } else if (class264.field3332 == this) {
            return var4 - arg1;
        } else if (class123.field1782 == this) {
            return (var4 - arg1) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!eha", name = "toString", descriptor = "()Ljava/lang/String;", line = 48)
    public final String toString() {
        field1251++;
        throw new IllegalStateException();
    }
}
