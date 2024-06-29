import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class9 extends class508 {

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public int field88;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field89 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "[I")
    public static int[] field96 = new int[250];

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "Ldn;")
    public static class201 field93;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "[I")
    public static int[] field97;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "[Lf;")
    public static class404[] field95;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/lang/String;)V", line = 10)
    public static final void method59(int arg0, String arg1) {
        field90++;
        if (arg0 > -123) {
            field93 = null;
        }
        if (!arg1.equals("")) {
            class319.field4106++;
            class420.method2472((byte) -101, class240.field3104);
            class319.field4112.method565(32, class415.method2442(-39, arg1));
            class319.field4112.method597(-128, arg1);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V", line = 32)
    public static void method60(boolean arg0) {
        field93 = null;
        if (arg0) {
            method60(true);
        }
        field97 = null;
        field89 = null;
        field96 = null;
        field95 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)Z", line = 46)
    public static final boolean method61(int arg0, int arg1, int arg2) {
        field91++;
        if (arg2 != 250) {
            field96 = null;
        }
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V", line = 60)
    public class9(int arg0, int arg1) {
        this.field92 = arg0;
        this.field88 = arg1;
    }
}
