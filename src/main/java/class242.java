import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class242 {

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field3513 = new String[100];

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "Liu;")
    public static class517 field3516 = new class517(70, -2);

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "[S")
    public static short[] field3517;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Loh;B)Ljava/lang/String;", line = 5)
    public static final String method1544(class549 arg0, byte arg1) {
        if (arg1 > -116) {
            field3513 = null;
        }
        field3514++;
        if (client.method3530(arg0).method3051((byte) -70) == 0) {
            return null;
        } else if (arg0.field7639 == null || arg0.field7639.trim().length() == 0) {
            return class640.field9285 ? "Hidden-use" : null;
        } else {
            return arg0.field7639;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V", line = 29)
    public static void method1545(int arg0) {
        if (arg0 != 0) {
            method1545(109);
        }
        field3516 = null;
        field3517 = null;
        field3513 = null;
    }
}
