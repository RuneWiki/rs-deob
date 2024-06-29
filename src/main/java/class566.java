import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class566 {

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[[F")
    public static float[][] field8021 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field8019 = -1;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field8022;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field8023;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field8024;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field8025;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "Lul;")
    public static class523 field8020;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3200(int arg0) {
        if (arg0 != -10) {
            method3200(-25);
        }
        class284.field3601 = null;
        class35.field398 = null;
        class282.field3594 = null;
        class426.field5656 = null;
        class275.field3478 = null;
        class595.field8449 = null;
        class513.field7337 = null;
        field8022++;
        class489.field7097 = null;
        class141.field1609 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V", line = 36)
    public static void method3201(boolean arg0) {
        field8020 = null;
        if (arg0) {
            field8021 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lpe;ZILjava/lang/String;Z)V", line = 69)
    public static final void method3202(class556 arg0, boolean arg1, int arg2, String arg3, boolean arg4) {
        field8025++;
        if (arg1) {
            if (class556.field7916.startsWith("win") && arg0.field7924) {
                String var5 = null;
                if (class485.field7068 != null) {
                    var5 = class485.field7068.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class199 var6 = class646.method3628(0, 1, arg0, arg3);
                    class470.field6565 = arg3;
                    class108.field1255 = var6;
                    class211.field2554 = arg0;
                    return;
                }
            }
            if (class556.field7916.startsWith("mac")) {
                String var7 = null;
                if (class485.field7068 != null) {
                    var7 = class485.field7068.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg4) {
                    class646.method3628(1, 1, arg0, arg3);
                    return;
                }
            }
            class646.method3628(2, 1, arg0, arg3);
        } else {
            class646.method3628(3, 1, arg0, arg3);
        }
        if (arg2 != 48) {
            method3200(23);
        }
    }
}
