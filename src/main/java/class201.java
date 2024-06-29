import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class201 {

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field3102 = null;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3103 = Calendar.getInstance();

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field3107 = new String[200];

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "[Lej;")
    public static class251[] field3108 = new class251[50];

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1503(int arg0, int arg1) {
        if (arg0 == 200) {
            class356.field5663.method649((byte) 75, arg1);
            field3105++;
            class327.field5023.method649((byte) 75, arg1);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V", line = 17)
    public static void method1504(int arg0) {
        if (arg0 != -26787) {
            field3102 = (String[]) null;
        }
        field3103 = null;
        field3102 = null;
        field3108 = null;
        field3107 = null;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)V", line = 38)
    public static final void method1505(int arg0, int arg1) {
        field3104++;
        class138 var2 = class149.method1242(arg0, arg1 ^ 0xC, arg1);
        var2.method1152(125);
    }
}
