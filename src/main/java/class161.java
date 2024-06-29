import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class161 extends class310 {

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
    public int field2312 = (int) (class465.method2818(255) / 1000L);

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "Ljava/lang/String;")
    public String field2309;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "S")
    public short field2310;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "D")
    public static double field2311 = -1.0D;

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 10)
    public class161(String arg0, int arg1) {
        this.field2309 = arg0;
        this.field2310 = (short) arg1;
    }
}
