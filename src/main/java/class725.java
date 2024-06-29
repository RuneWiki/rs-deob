import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class725 {

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "Lnd;")
    public static class546 field10114 = new class546(14, 0);

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "Lnd;")
    public static class546 field10120 = new class546(15, 4);

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "Lnd;")
    public static class546 field10121 = new class546(16, -2);

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "Lnd;")
    public static class546 field10123 = new class546(17, 0);

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "Lnd;")
    public static class546 field10124 = new class546(18, -2);

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "Lnd;")
    public static class546 field10125 = new class546(19, -2);

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "Lnd;")
    public static class546 field10126 = new class546(22, -2);

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "Lnd;")
    public static class546 field10127 = new class546(23, 4);

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "Lnd;")
    public static class546 field10128 = new class546(24, -1);

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "Lnd;")
    public static class546 field10129 = new class546(26, 0);

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "Lnd;")
    public static class546 field10130 = new class546(27, 0);

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "Lnd;")
    public static class546 field10131 = new class546(28, -2);

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "[Lnd;")
    private static class546[] field10132 = new class546[32];

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field10113;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field10116;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public static int field10118;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "[B")
    public byte[] field10115;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "[S")
    public short[] field10117;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "[S")
    public short[] field10119;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "[S")
    public short[] field10122;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V")
    public static void method4089(boolean arg0) {
        field10123 = null;
        field10121 = null;
        field10129 = null;
        field10124 = null;
        field10126 = null;
        field10132 = null;
        field10125 = null;
        field10120 = null;
        field10131 = null;
        if (arg0) {
            method4089(true);
        }
        field10130 = null;
        field10114 = null;
        field10128 = null;
        field10127 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lek;")
    public static final class509 method4090(Throwable arg0, String arg1) {
        field10116++;
        class509 var2;
        if ((arg0 instanceof class509)) {
            var2 = (class509) arg0;
            var2.field7247 = var2.field7247 + ' ' + arg1;
        } else {
            var2 = new class509(arg0, arg1);
        }
        return var2;
    }

    static {
        class546[] var0 = class298.method1882(true);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field10132[var0[var1].field7796] = var0[var1];
        }
    }
}
