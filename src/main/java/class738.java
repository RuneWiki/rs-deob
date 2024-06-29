import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class738 extends RuntimeException {

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "Ljava/lang/String;")
    public String field10271;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field10270;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Ljava/lang/String;")
    public static String field10273 = null;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "F")
    public static float field10274;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field10272;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field10275;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)B", line = 3)
    public static final byte method4124(int arg0, int arg1, int arg2) {
        if (arg2 > -46) {
            method4125(-127);
        }
        field10275++;
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 27)
    public static void method4125(int arg0) {
        if (arg0 != 0) {
            field10272 = 42;
        }
        field10273 = null;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 39)
    public class738(Throwable arg0, String arg1) {
        this.field10271 = arg1;
        this.field10270 = arg0;
    }
}
