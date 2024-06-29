import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class42 implements class344 {

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "Ljava/lang/String;")
    private String field478;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "Lwm;")
    private class30 field480;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "Luw;")
    public static class208 field481 = new class208(93, 10);

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)Ldca;", line = 8)
    public final class571 method254(byte arg0) {
        int var2 = 54 / ((48 - arg0) / 51);
        field476++;
        return class571.field7221;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(Z)V", line = 18)
    public static void method255(boolean arg0) {
        if (!arg0) {
            field481 = null;
        }
        field481 = null;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)I", line = 29)
    public final int method256(boolean arg0) {
        field479++;
        if (this.field480.method141(this.field478, 80)) {
            return 100;
        } else if (arg0) {
            return -105;
        } else {
            return this.field480.method151(this.field478, 0);
        }
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lwm;Ljava/lang/String;)V", line = 45)
    public class42(class30 arg0, String arg1) {
        this.field478 = arg1;
        this.field480 = arg0;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(III)Z", line = 54)
    public static final boolean method257(int arg0, int arg1, int arg2) {
        field477++;
        if (arg0 != 93) {
            method255(true);
        }
        return (arg1 & 0x60000) != 0 | class168.method1067(arg1, arg2, (byte) -107) || class92.method554(arg1, (byte) 84, arg2) || class551.method2988(arg1, 15954, arg2);
    }
}
