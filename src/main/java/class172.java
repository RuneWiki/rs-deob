import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class172 extends RuntimeException {

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2125;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "Ljava/lang/String;")
    public String field2126;

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "I")
    public static int field2127 = 1;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIBLdg;)V")
    public static final void method1169(int arg0, int arg1, byte arg2, class193 arg3) {
        field2128++;
        if (arg2 != 49) {
            method1169(-49, -99, (byte) 24, null);
        }
        int[] var4 = new int[4];
        class443.method2511(var4, 0, var4.length, arg1);
        class370.method2136(var4, arg3, arg0, (byte) 42);
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class172(Throwable arg0, String arg1) {
        this.field2125 = arg0;
        this.field2126 = arg1;
    }
}
