import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class512 extends RuntimeException {

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Ljava/lang/String;")
    public String field7539;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field7537;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "[B")
    public static byte[] field7536 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "F")
    public static float field7540;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Lqa;")
    public static class129 field7538;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Ljava/lang/String;")
    public static String field7541;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "[I")
    public static int[] field7534;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lwt;I)I")
    public static final int method3051(class16 arg0, int arg1) {
        if (arg1 != 1) {
            method3052(-81);
        }
        field7535++;
        int var2 = arg0.method100((byte) 24, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method100((byte) 30, 5);
        } else if (var2 == 2) {
            var3 = arg0.method100((byte) -79, 8);
        } else {
            var3 = arg0.method100((byte) -126, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method3052(int arg0) {
        field7541 = null;
        field7534 = null;
        field7538 = null;
        field7536 = null;
        int var1 = -1 % ((62 - arg0) / 44);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class512(Throwable arg0, String arg1) {
        this.field7539 = arg1;
        this.field7537 = arg0;
    }
}
