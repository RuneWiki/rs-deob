import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class134 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[[B")
    public static byte[][] field1754 = new byte[250][];

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public int field1763;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lvb;")
    public class134 field1755;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Leq;")
    public class144 field1761;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Lza;")
    public static class290 field1759;

    static {
        new class530("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 3)
    public final void method846(int arg0) {
        field1757++;
        if (class75.field931 >= 500) {
            return;
        }
        this.field1755 = class517.field7609;
        this.field1761 = null;
        this.field1763 = 0;
        if (arg0 == -1) {
            class75.field931++;
            class517.field7609 = this;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)[Lql;", line = 30)
    public static final class526[] method847(int arg0) {
        if (arg0 != 24336) {
            method848(-25, null);
        }
        field1760++;
        return new class526[] { class215.field3104, class215.field3105, class215.field3106, class215.field3107, class215.field3108, class215.field3109, class215.field3110, class215.field3111, class215.field3112, class215.field3113, class215.field3114, class215.field3115 };
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/lang/String;)I", line = 41)
    public static final int method848(int arg0, String arg1) {
        field1756++;
        if (arg1 == null) {
            return -1;
        }
        if (arg0 < 80) {
            method848(-100, null);
        }
        for (int var2 = 0; var2 < class520.field7656; var2++) {
            if (arg1.equalsIgnoreCase(class540.field7902[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZLjava/lang/String;I)Z", line = 76)
    public static final boolean method849(int arg0, boolean arg1, String arg2, int arg3) {
        field1758++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        if (arg0 != -98) {
            method850(95, -109);
        }
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg3) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if ((var10 / arg3) != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V", line = 155)
    public static final void method850(int arg0, int arg1) {
        class79.field1033 = arg1;
        field1762++;
        class174 var2 = class66.field842;
        synchronized (class66.field842) {
            class66.field842.method1096((byte) -85);
        }
        class174 var3 = class311.field4524;
        synchronized (class311.field4524) {
            if (arg0 != 36) {
                field1759 = null;
            }
            class311.field4524.method1096((byte) -79);
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V", line = 172)
    public static void method851(int arg0) {
        field1754 = null;
        if (arg0 != 0) {
            field1759 = null;
        }
        field1759 = null;
    }
}
