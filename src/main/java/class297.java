import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class297 extends class538 {

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    private int field4089;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    private int field4076;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    private int field4078;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    private int field4082;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    private int field4083;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "Lcb;")
    private class444 field4088;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    private int field4090;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Lwv;")
    private class31 field4077;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "[[[Lnj;")
    public static class205[][][] field4081;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 4)
    public static void method1824(int arg0) {
        if (arg0 <= 97) {
            field4092 = -51;
        }
        field4081 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILjava/lang/String;Ljava/io/File;)V", line = 21)
    public static final void method1825(int arg0, String arg1, File arg2) {
        if (arg0 == -253) {
            class485.field6909.put(arg1, arg2);
            field4080++;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lcb;IIIIII)V", line = 42)
    public class297(class444 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4089 = arg2;
        this.field4076 = arg1;
        this.field4078 = arg6;
        this.field4082 = arg3;
        this.field4083 = arg4;
        this.field4088 = arg0;
        this.field4090 = arg5;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)Lwv;", line = 58)
    public final class31 method1826(boolean arg0) {
        field4086++;
        if (arg0) {
            field4091 = 83;
        }
        if (this.field4077 == null) {
            class48.field569[2] = this.field4082;
            class48.field569[5] = this.field4078;
            class17 var2 = this.field4088.field3092;
            class48.field569[1] = this.field4089;
            class48.field569[4] = this.field4090;
            class48.field569[0] = this.field4076;
            class48.field569[3] = this.field4083;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method109(class48.field569[var5], 1680)) {
                    return null;
                }
                class471 var7 = var2.method110(class48.field569[var5], (byte) 117);
                int var8 = var7.field6651 ? 64 : 128;
                if (var7.field6647 > 0) {
                    var3 = true;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class523.field7482[var6] = var2.method113(var4, false, -4074, var4, 1.0F, class48.field569[var6]);
            }
            this.field4077 = this.field4088.method2690(-1, var4, var3, class523.field7482);
        }
        return this.field4077;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(CI)C", line = 120)
    public static final char method1827(char arg0, int arg1) {
        field4087++;
        if (arg1 != 223) {
            return (char) 65509;
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
}
