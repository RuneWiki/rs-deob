import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class633 implements class186 {

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "Ljava/lang/String;")
    private String field8733;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field8731;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field8734;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field8735;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field8736;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field8737;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mh", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field8739;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Z")
    private boolean field8738;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)I")
    public final int method1248(int arg0) {
        if (arg0 != 27076) {
            this.field8738 = true;
        }
        field8734++;
        int var2 = class26.method180(-110, this.field8733);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field8738 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)Z")
    public final boolean method3548(int arg0) {
        if (arg0 == 97) {
            field8731++;
            return this.field8738;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method3549(String arg0, int arg1) {
        field8736++;
        return arg1 == 99 ? class167.method1168(field8739 == null ? (field8739 = method3552("fha")) : field8739, arg0, arg1 - 99) : false;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Ljava/lang/String;I)J")
    public static final long method3550(String arg0, int arg1) {
        field8737++;
        long var2 = (long) arg1;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (1 - (65 - var6));
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)Lqia;")
    public final class21 method1249(int arg0) {
        field8735++;
        if (arg0 != -32660) {
            this.field8738 = false;
        }
        return class21.field380;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(CI)C")
    public static final char method3551(char arg0, int arg1) {
        field8732++;
        if (arg1 != 207) {
            return 'V';
        } else if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class633(String arg0) {
        this.field8733 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3552(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
