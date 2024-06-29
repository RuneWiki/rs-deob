import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class20 {

    @OriginalMember(owner = "client!an", name = "d", descriptor = "Lap;")
    public static class335 field288 = new class335("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Ljava/lang/String;")
    public String field286;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lhd;II)Ljava/lang/String;", line = 4)
    public static final String method171(class523 arg0, int arg1, int arg2) {
        field285++;
        if (!client.method1226(arg0).method642(1, arg1) && arg0.field7578 == null) {
            return null;
        }
        if (arg2 != -1) {
            method172((byte) -107);
        }
        if (arg0.field7697 == null || arg0.field7697.length <= arg1 || arg0.field7697[arg1] == null || arg0.field7697[arg1].trim().length() == 0) {
            return class191.field2480 ? "Hidden-" + arg1 : null;
        } else {
            return arg0.field7697[arg1];
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V", line = 31)
    public static void method172(byte arg0) {
        if (arg0 <= -56) {
            field288 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(III)Lqd;", line = 46)
    public static final class314 method173(int arg0, int arg1, int arg2) {
        class490 var3 = class125.field1664[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7126;
    }
}
