import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class63 {

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Lea;")
    public static class38 field1531 = class9.method46((byte) 104, "<col=ffffff>");

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lea;")
    private static class38 field1535 = class9.method46((byte) 120, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Lea;")
    public static class38 field1533 = class9.method46((byte) 116, "(U0a )2 via: ");

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Lea;")
    public static class38 field1536 = field1535;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field1532 = 0;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Lpg;")
    public static class141 field1537 = new class141();

    @OriginalMember(owner = "client!h", name = "k", descriptor = "Lea;")
    public static class38 field1540 = class9.method46((byte) 105, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!h", name = "l", descriptor = "[[B")
    public static byte[][] field1541 = new byte[250][];

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Lea;")
    public static class38 field1542 = class9.method46((byte) 117, "<col=ffff00>*V");

    @OriginalMember(owner = "client!h", name = "j", descriptor = "Lea;")
    public static class38 field1539 = class9.method46((byte) 123, "(Y");

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lhc;I)V")
    public static final void method447(class66 arg0, int arg1) {
        int var2 = 64 % ((-arg1 - 62) / 36);
        field1538++;
        byte[] var3 = new byte[24];
        if (class166.field3433 != null) {
            try {
                class166.field3433.method881(0L, 0);
                class166.field3433.method885(var3, (byte) 118);
                int var4;
                for (var4 = 0; var4 < 24 && var3[var4] == 0; var4++) {
                }
                if (var4 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var3[var5] = -1;
                }
            }
        }
        arg0.method485(24, 0, 4, var3);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static void method448(int arg0) {
        if (arg0 > -55) {
            method447(null, 56);
        }
        field1533 = null;
        field1535 = null;
        field1531 = null;
        field1540 = null;
        field1539 = null;
        field1541 = null;
        field1537 = null;
        field1542 = null;
        field1536 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)Lg;")
    public static final class55 method449(boolean arg0, int arg1) {
        field1530++;
        class55 var2 = (class55) class154.field3202.method1078((byte) 10, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class130.field2781.method215(arg1, 4, 1);
        class55 var4 = new class55();
        if (var3 != null) {
            var4.method409(-16, new class66(var3), arg1);
        }
        var4.method405(0);
        class154.field3202.method1076((long) arg1, -4, var4);
        if (!arg0) {
            field1539 = null;
        }
        return var4;
    }
}
