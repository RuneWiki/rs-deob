import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class331 {

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "[Ljava/lang/String;")
    private String[] field4617;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "S")
    public static short field4616 = 205;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 27)
    public class331(String arg0, String arg1, String arg2, String arg3) {
        this.field4617 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 56)
    public final String method2031(boolean arg0, int arg1) {
        field4620++;
        if (!arg0) {
            field4616 = -98;
        }
        return this.field4617[arg1];
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", line = 73)
    public static final void method2032(int arg0, int arg1, String arg2, String arg3, String arg4, boolean arg5) {
        field4619++;
        class11.method77((byte) 78, -1, arg4, arg2, null, arg0, arg3, arg1);
        if (!arg5) {
            field4616 = 55;
        }
    }

    @OriginalMember(owner = "client!gk", name = "toString", descriptor = "()Ljava/lang/String;", line = 106)
    public final String toString() {
        field4618++;
        throw new IllegalStateException();
    }
}
