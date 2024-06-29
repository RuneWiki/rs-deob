import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class244 {

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Lmo;")
    private class447 field3366 = new class447();

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field3371 = 0;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Lmo;")
    private class447 field3374;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)Lmo;", line = 7)
    public final class447 method1527(byte arg0) {
        field3378++;
        class447 var2 = this.field3366.field6442;
        if (this.field3366 == var2) {
            this.field3374 = null;
            return null;
        }
        this.field3374 = var2.field6442;
        if (arg0 != 84) {
            this.method1532(58);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)I", line = 28)
    public final int method1528(int arg0) {
        field3367++;
        int var2 = 0;
        for (class447 var3 = this.field3366.field6442; var3 != this.field3366; var3 = var3.field6442) {
            var2++;
        }
        if (arg0 < 43) {
            this.field3366 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V", line = 49)
    public final void method1529(int arg0) {
        while (true) {
            class447 var2 = this.field3366.field6442;
            if (this.field3366 == var2) {
                field3369++;
                if (arg0 > -121) {
                    return;
                }
                this.field3374 = null;
                return;
            }
            var2.method2788((byte) -96);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lmo;Z)V", line = 70)
    public final void method1530(class447 arg0, boolean arg1) {
        if (!arg1) {
            this.method1533(-4);
        }
        if (arg0.field6443 != null) {
            arg0.method2788((byte) -117);
        }
        field3373++;
        arg0.field6442 = this.field3366;
        arg0.field6443 = this.field3366.field6443;
        arg0.field6443.field6442 = arg0;
        arg0.field6442.field6443 = arg0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(CZ)C", line = 91)
    public static final char method1531(char arg0, boolean arg1) {
        field3372++;
        if (!arg1) {
            method1531((char) 65532, true);
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

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 529)
    public class244() {
        this.field3366.field6442 = this.field3366;
        this.field3366.field6443 = this.field3366;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)Lmo;", line = 509)
    public final class447 method1532(int arg0) {
        if (arg0 != -11786) {
            this.field3374 = null;
        }
        field3365++;
        class447 var2 = this.field3374;
        if (this.field3366 == var2) {
            this.field3374 = null;
            return null;
        } else {
            this.field3374 = var2.field6442;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)Lmo;", line = 543)
    public final class447 method1533(int arg0) {
        field3375++;
        class447 var2 = this.field3366.field6442;
        if (arg0 != -4174) {
            field3371 = -120;
        }
        if (this.field3366 == var2) {
            return null;
        } else {
            var2.method2788((byte) -94);
            return var2;
        }
    }
}
