import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class492 {

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "Z")
    public boolean field7084;

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!pga", name = "i", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "Lfg;")
    public class436 field7085;

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "Lfg;")
    public class436 field7089;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "Lfm;")
    public static class456 field7082;

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "Z")
    public boolean field7087;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(CI)C", line = 3)
    public static final char method2992(char arg0, int arg1) {
        field7083++;
        if (arg1 != -2066) {
            field7082 = null;
        }
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
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

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V", line = 404)
    public static void method2993(int arg0) {
        field7082 = null;
        if (arg0 < 65) {
            method2992('\u0012', -13);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIII)V", line = 420)
    public static final void method2994(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7091++;
        if (arg3 != -19583) {
            field7090 = 15;
        }
        if (arg5 >= class200.field2976 && class204.field3061 >= arg4 && arg2 >= class377.field5458 && arg0 <= class362.field5291) {
            class585.method3447(-1, arg4, arg0, arg5, arg1, arg2);
        } else {
            class497.method3022(arg5, arg1, arg2, arg3 + 19584, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(I)Z", line = 439)
    public final boolean method2995(int arg0) {
        field7088++;
        if (arg0 != 246) {
            this.field7087 = true;
        }
        return this.field7087 && !this.field7084;
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Z)V", line = 449)
    public class492(boolean arg0) {
        this.field7084 = arg0;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljw;)V", line = 457)
    public static final void method2996(class280 arg0) {
        class391.field5644.method402(arg0.field3923, arg0.field3922 + (arg0.method595(32767) >> 1), arg0.field3916, class425.field6150);
        arg0.field3919 = class425.field6150[0];
        arg0.field3925 = class425.field6150[1];
        arg0.field3926 = class425.field6150[2];
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Z)V", line = 463)
    public final void method2997(boolean arg0) {
        if (this.field7089 != null) {
            this.field7089.method175(-111);
        }
        field7086++;
        if (!arg0) {
            this.field7084 = true;
        }
        this.field7087 = false;
    }
}
