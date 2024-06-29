import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class281 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Z")
    public static boolean field4168 = false;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lrk;")
    public static class419 field4170 = new class419();

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Z")
    public static boolean field4175 = false;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lqu;")
    public static class364 field4176 = new class364(71, 4);

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "F")
    public static float field4178;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "J")
    public static long field4179;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Lua;")
    public static class548 field4172;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)Z")
    public static final boolean method1769(int arg0, int arg1, int arg2) {
        field4169++;
        if (arg0 == -3273) {
            return (arg2 & 0x10000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZIILdda;IZI)V")
    public static final void method1770(boolean arg0, int arg1, int arg2, class597 arg3, int arg4, boolean arg5, int arg6) {
        class110.field1406 = 1;
        class636.field9266 = arg2;
        class212.field3119 = arg0;
        class42.field504 = arg3;
        field4171++;
        class62.field731 = arg1;
        class534.field7910 = arg6;
        class548.field8167 = class240.field3505.method2539(0) / arg4;
        if (arg5) {
            method1770(true, -71, 65, null, 68, false, -89);
        }
        if (class548.field8167 < 1) {
            class548.field8167 = 1;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method1771(int arg0) {
        if (arg0 < -83) {
            field4170 = null;
            field4172 = null;
            field4176 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZB)C")
    public static final char method1772(boolean arg0, byte arg1) {
        if (!arg0) {
            field4172 = null;
        }
        field4173++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class42.field489[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }
}
