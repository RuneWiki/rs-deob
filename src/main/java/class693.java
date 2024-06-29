import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public abstract class class693 {

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "[[I")
    public static int[][] field9764 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field9762 = 503;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field9761;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field9763;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field9765;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V")
    public static void method3879(boolean arg0) {
        if (!arg0) {
            field9764 = null;
        }
        field9764 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(III)Z")
    public static final boolean method3880(int arg0, int arg1, int arg2) {
        if (arg0 != 10) {
            method3880(-45, 113, -41);
        }
        field9765++;
        if (arg1 == 11) {
            arg1 = 10;
        }
        class56 var3 = class237.field3521.method3515(arg2, 50);
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method661(arg1, 0);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ldp;Lom;ZLom;Lom;)Z")
    public static final boolean method3881(class3 arg0, class344 arg1, boolean arg2, class344 arg3, class344 arg4) {
        field9763++;
        class114.field2046 = arg0;
        class336.field5030 = arg3;
        if (!arg2) {
            field9762 = -52;
        }
        class301.field4477 = arg1;
        class234.field3501 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)Ljava/lang/String;")
    public static final String method3882(boolean arg0) {
        field9761++;
        if (arg0) {
            return null;
        } else if (class308.field4551 || class650.field9374 == null) {
            return "";
        } else {
            return class650.field9374.field4468;
        }
    }
}
