import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class526 implements class171 {

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Ljava/lang/String;")
    private String field7358;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Lwu;")
    private class557 field7359;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "Lag;")
    public static class214 field7362 = new class214(8, 1);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field7356;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field7357;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)I")
    public final int method126(int arg0) {
        field7361++;
        if (arg0 == 23022) {
            return this.field7359.method3326(this.field7358, (byte) -65) ? 100 : 0;
        } else {
            return 24;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/lang/String;I)I")
    public static final int method3132(int arg0, String arg1, int arg2) {
        if (arg2 == -10711) {
            field7355++;
            return class8.method41(arg1, (byte) 118, true, arg0);
        } else {
            return -107;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)Lvm;")
    public final class75 method130(int arg0) {
        if (arg0 != 29067) {
            field7363 = -40;
        }
        field7357++;
        return class75.field1031;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method3133(String arg0, byte arg1) {
        field7356++;
        if (class265.field3618 == null) {
            return;
        }
        class151.field2080++;
        if (arg1 == -49) {
            class120 var2 = class292.method1716(class608.field8668, true, class442.field6071);
            var2.field1653.method184(class678.method3882(arg0, (byte) 109), -76);
            var2.field1653.method187(arg0, (byte) -122);
            class471.method2805(arg1 + 172, var2);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static void method3134(byte arg0) {
        int var1 = 124 / ((-arg0 - 53) / 62);
        field7362 = null;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lwu;Ljava/lang/String;)V")
    public class526(class557 arg0, String arg1) {
        this.field7358 = arg1;
        this.field7359 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BII)Z")
    public static final boolean method3135(byte arg0, int arg1, int arg2) {
        field7360++;
        if (arg0 != -113) {
            method3134((byte) -106);
        }
        return (arg2 & 0x10) != 0;
    }
}
