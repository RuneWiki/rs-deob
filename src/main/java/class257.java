import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class257 {

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "[I")
    public static int[] field3838 = new int[3];

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field3837;

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)V")
    public static void method1710(int arg0) {
        field3837 = null;
        field3838 = null;
        if (arg0 != 3) {
            method1711(false);
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(Z)V")
    public static final void method1711(boolean arg0) {
        class627.field8774.method1929(108);
        field3839++;
        class645.method3582(1);
        class15.field225 = null;
        class385.field5623 = 0;
        class635.field8859 = null;
        if (arg0) {
            method1711(false);
        }
        class89.field1233.field5459 = 0;
        class598.field8147 = null;
        class584.field7797 = 0;
        class344.method2182(90);
        class83.field1166 = null;
        class181.field2401 = null;
        class671.field9452 = 0;
        class587.field7825 = 0;
        class39.field598 = null;
        class713.field9972 = 0;
        class495.field6848 = null;
    }
}
