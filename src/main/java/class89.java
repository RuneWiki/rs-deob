import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class89 extends class66 {

    @OriginalMember(owner = "client!qda", name = "q", descriptor = "Ljava/lang/String;")
    public String field1073;

    @OriginalMember(owner = "client!qda", name = "s", descriptor = "Leu;")
    public static class444 field1075 = new class444(1, 2);

    @OriginalMember(owner = "client!qda", name = "u", descriptor = "Lor;")
    public static class594 field1077;

    @OriginalMember(owner = "client!qda", name = "w", descriptor = "Lac;")
    public static class501 field1079;

    @OriginalMember(owner = "client!qda", name = "r", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!qda", name = "t", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!qda", name = "v", descriptor = "Ljava/lang/Thread;")
    public static Thread field1078;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V")
    public static void method804(int arg0) {
        field1078 = null;
        if (arg0 == 6394) {
            field1079 = null;
            field1077 = null;
            field1075 = null;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method805(int arg0, String arg1, int arg2, String arg3) {
        field1076++;
        if (arg0 != -29536) {
            field1078 = null;
        }
        class700.field9878 = arg2;
        class665.field9421 = 2;
        class136.method1182(arg3, (byte) -117, false, arg1);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(ILie;I)V")
    public static final void method806(int arg0, class6 arg1, int arg2) {
        if (class685.field9610 != null) {
            try {
                class685.field9610.method3154((byte) -75, 0L);
                class685.field9610.method3158(false, 24, arg2, arg1.field96);
            } catch (Exception var3) {
            }
        }
        if (arg0 != 15090) {
            field1077 = null;
        }
        field1074++;
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "()V")
    public class89() {
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class89(String arg0, int arg1) {
        this.field1073 = arg0;
    }

    static {
        new class307("", 73);
        field1077 = new class594();
        field1079 = new class501("WTI", 5);
    }
}
