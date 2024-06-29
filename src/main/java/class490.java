import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class490 extends class192 {

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public int field6483;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "Lqm;")
    public static class380 field6480 = new class380();

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "Lwp;")
    public static class453 field6481 = new class453(55, 2);

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field6482 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(ILct;Lrc;III)V", line = 4)
    public class490(int arg0, class414 arg1, class29 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field6483 = arg5;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V", line = 12)
    public static void method2643(byte arg0) {
        field6481 = null;
        if (arg0 != -115) {
            method2643((byte) 100);
        }
        field6482 = null;
        field6480 = null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)Lwea;", line = 25)
    public final class259 method235(int arg0) {
        if (arg0 <= 38) {
            this.method235(-30);
        }
        field6478++;
        return class1.field8;
    }
}
