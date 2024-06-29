import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class447 extends class590 {

    @OriginalMember(owner = "client!um", name = "y", descriptor = "I")
    public int field6348 = (int) (class488.method2835(30160) / 1000L);

    @OriginalMember(owner = "client!um", name = "x", descriptor = "Ljava/lang/String;")
    public String field6347;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "S")
    public short field6344;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    public static int field6346 = 1339;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "Lh;")
    public static class571 field6345 = new class571(20);

    @OriginalMember(owner = "client!um", name = "A", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field6349;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V")
    public static void method2642(int arg0) {
        field6345 = null;
        field6349 = null;
        if (arg0 != 25822) {
            method2643(126, -108, 99);
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(III)Z")
    public static final boolean method2643(int arg0, int arg1, int arg2) {
        field6350++;
        if (arg2 < 39) {
            return true;
        } else {
            return (arg0 & 0x70000) != 0 | class645.method3720((byte) -73, arg1, arg0) || class376.method2228(16024, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class447(String arg0, int arg1) {
        this.field6347 = arg0;
        this.field6344 = (short) arg1;
    }
}
