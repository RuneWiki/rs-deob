import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class481 {

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field7084 = new String[100];

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field7082;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method2829(int arg0) {
        field7082 = null;
        field7084 = null;
        if (arg0 != 100) {
            method2829(13);
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static final void method2830(int arg0) {
        if (arg0 >= -36) {
            field7084 = null;
        }
        class61.field925 = null;
        class534.field7849 = null;
        class317.field4981 = null;
        field7083++;
        class497.field7295 = null;
        class2.field12 = null;
        class15.field167 = null;
        class178.field2825 = null;
        class315.field4961 = null;
        class299.field4800 = null;
    }
}
