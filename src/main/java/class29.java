import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class29 extends class306 {

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "Ljava/lang/Object;")
    private Object field364;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field367 = 0;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    public static int field374 = 0;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "Ljava/lang/String;")
    public static String field373 = "Members object";

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class29(Object arg0) {
        this.field364 = arg0;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)Z")
    public final boolean method168(byte arg0) {
        int var2 = -42 % ((arg0 - 22) / 56);
        field366++;
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)V")
    public static void method169(int arg0) {
        field373 = null;
        if (arg0 != 8435) {
            method169(-63);
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method170(byte arg0) {
        field372++;
        if (arg0 != -81) {
            method172(-121, (byte) -83);
        }
        return this.field364;
    }

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "(I)J")
    public static final long method171(int arg0) {
        if (arg0 != 0) {
            method173(90);
        }
        field369++;
        return class41.field513.method137(-123);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)V")
    public static final void method172(int arg0, byte arg1) {
        field370++;
        class87.field1360.method147(arg0, (byte) -117);
        if (arg1 < -117) {
            class33.field412.method147(arg0, (byte) -116);
            class27.field342.method147(arg0, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "(I)V")
    public static final void method173(int arg0) {
        field375++;
        if (class94.field1418 > 0) {
            class227.method1578(0);
        } else {
            class75.field1186 = class103.field1551;
            class103.field1551 = null;
            class229.method1614(arg0, 28);
        }
    }
}
