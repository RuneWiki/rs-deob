import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class145 {

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field2326 = -1;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "J")
    public static long field2331 = 0L;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field2325 = -1;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2332 = "green:";

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public int field2328;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public int field2329;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method992(int arg0) {
        field2332 = null;
        if (arg0 != -1) {
            field2325 = 109;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
    public static final void method993(int arg0, int arg1) {
        if (arg1 >= -14) {
            method992(-43);
        }
        class242.field3836.method1880(-74, arg0);
        class297.field4852.method1880(-97, arg0);
        class104.field1633.method1880(-77, arg0);
        field2330++;
        class302.field4941.method1880(-85, arg0);
    }
}
