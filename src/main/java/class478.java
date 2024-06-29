import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class478 extends class434 {

    @OriginalMember(owner = "client!dn", name = "ab", descriptor = "Ljava/lang/Object;")
    private Object field7072;

    @OriginalMember(owner = "client!dn", name = "bb", descriptor = "Lhga;")
    public static class158 field7073 = new class158(59, -2);

    @OriginalMember(owner = "client!dn", name = "eb", descriptor = "Lhga;")
    public static class158 field7076 = new class158(37, 8);

    @OriginalMember(owner = "client!dn", name = "fb", descriptor = "[Ljava/lang/String;")
    public static String[] field7077 = new String[100];

    @OriginalMember(owner = "client!dn", name = "U", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!dn", name = "cb", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!dn", name = "db", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(B)V", line = 3)
    public static void method2964(byte arg0) {
        if (arg0 <= -84) {
            field7077 = null;
            field7073 = null;
            field7076 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 18)
    public class478(Object arg0, int arg1) {
        super(arg1);
        this.field7072 = arg0;
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 27)
    public final Object method1252(int arg0) {
        if (arg0 != 30659) {
            this.field7072 = null;
        }
        field7074++;
        return this.field7072;
    }

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "(B)V", line = 43)
    public static final void method2965(byte arg0) {
        field7071++;
        class49 var1 = class376.field5862;
        synchronized (class376.field5862) {
            class376.field5862.method569(0);
            if (arg0 != 57) {
                field7077 = null;
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)Z", line = 62)
    public final boolean method1253(int arg0) {
        int var2 = -63 / ((arg0 + 20) / 51);
        field7075++;
        return false;
    }
}
