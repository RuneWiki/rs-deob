import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class561 {

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Ljava/lang/String;")
    public String field7438;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "Ljava/lang/String;")
    public String field7439;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Ljava/lang/String;")
    public String field7437;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field7436 = new String[200];

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field7440 = 0;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Laea;")
    public static class47 field7435 = new class47();

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "Ldb;")
    public static class298 field7442 = new class298(69, 9);

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "Ldb;")
    public static class298 field7443 = new class298(104, 2);

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "F")
    public static float field7441;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "Ljca;")
    public static class642 field7444;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static void method3083(byte arg0) {
        field7442 = null;
        if (arg0 <= 120) {
            method3083((byte) -40);
        }
        field7444 = null;
        field7435 = null;
        field7443 = null;
        field7436 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static final void method3084(int arg0) {
        field7434++;
        for (int var1 = 0; var1 < 5; var1++) {
            class141.field2262[var1] = false;
        }
        class480.field6408 = 0;
        class140.field2254 = 1;
        class143.field2307 = -1;
        class173.field2668 = arg0;
        class376.field5068 = arg0;
        class2.field13 = 0;
        class407.field5480 = -1;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)I")
    public static final int method3085(int arg0) {
        if (arg0 != -1) {
            method3084(127);
        }
        field7432++;
        return 46;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class561(String arg0, String arg1, String arg2) {
        this.field7438 = arg0;
        this.field7439 = arg2;
        this.field7437 = arg1;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
    public static final int method3086(int arg0, int arg1) {
        if (arg1 != 12582) {
            method3085(-30);
        }
        field7433++;
        return arg0 == 16711935 ? -1 : class290.method1788(arg0, -122);
    }
}
