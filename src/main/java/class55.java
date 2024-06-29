import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class55 {

    @OriginalMember(owner = "client!th", name = "n", descriptor = "Laa;")
    public class35 field1102 = new class35();

    @OriginalMember(owner = "client!th", name = "e", descriptor = "[I")
    public static int[] field1093 = new int[14];

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field1094 = 0;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "F")
    public static float field1096;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "Laa;")
    private class35 field1106;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 4)
    public static final void method421(int arg0) {
        class132.field2236 = null;
        class170.field2745 = null;
        class120.field2087 = null;
        class162.field2618 = null;
        class75.field1527 = null;
        if (arg0 != 0) {
            method431(true, (class307) null, (class307) null);
        }
        field1103++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Z", line = 26)
    public final boolean method422(byte arg0) {
        if (arg0 >= -105) {
            this.method425(-112);
        }
        field1095++;
        return this.field1102.field701 == this.field1102;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V", line = 39)
    public static final void method423(byte arg0) {
        if (arg0 != 59) {
            method431(false, (class307) null, (class307) null);
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class39.field747[var1] = false;
        }
        class135.field2271 = 5;
        class344.field5340 = -1;
        class196.field3155 = 0;
        class247.field3821 = 0;
        field1099++;
        class220.field3497 = -1;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)Laa;", line = 67)
    public final class35 method424(int arg0) {
        class35 var2 = this.field1102.field701;
        field1100++;
        if (this.field1102 == var2) {
            this.field1106 = null;
            return null;
        } else {
            this.field1106 = var2.field701;
            return arg0 > -45 ? (class35) null : var2;
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)Laa;", line = 87)
    public final class35 method425(int arg0) {
        field1105++;
        class35 var2 = this.field1106;
        if (arg0 != -32547) {
            this.method425(101);
        }
        if (this.field1102 == var2) {
            this.field1106 = null;
            return null;
        } else {
            this.field1106 = var2.field701;
            return var2;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V", line = 111)
    public static void method426(boolean arg0) {
        if (arg0) {
            field1093 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLaa;)V", line = 128)
    public final void method427(byte arg0, class35 arg1) {
        field1098++;
        if (arg1.field703 != null) {
            arg1.method278((byte) -105);
        }
        arg1.field701 = this.field1102;
        arg1.field703 = this.field1102.field703;
        arg1.field703.field701 = arg1;
        arg1.field701.field703 = arg1;
        int var3 = 127 % ((-arg0) / 57);
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)Laa;", line = 146)
    public final class35 method428(int arg0) {
        if (arg0 != 0) {
            this.method425(114);
        }
        class35 var2 = this.field1102.field703;
        field1104++;
        if (this.field1102 == var2) {
            this.field1106 = null;
            return null;
        } else {
            this.field1106 = var2.field703;
            return var2;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Laa;B)V", line = 166)
    public final void method429(class35 arg0, byte arg1) {
        field1090++;
        if (arg0.field703 != null) {
            arg0.method278((byte) -105);
        }
        arg0.field701 = this.field1102.field701;
        if (arg1 < 126) {
            field1101 = -92;
        }
        arg0.field703 = this.field1102;
        arg0.field703.field701 = arg0;
        arg0.field701.field703 = arg0;
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(I)Laa;", line = 190)
    public final class35 method430(int arg0) {
        if (arg0 != 5) {
            return (class35) null;
        }
        class35 var2 = this.field1102.field701;
        field1097++;
        if (this.field1102 == var2) {
            return null;
        } else {
            var2.method278((byte) -105);
            return var2;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLbm;Lbm;)V", line = 210)
    public static final void method431(boolean arg0, class307 arg1, class307 arg2) {
        class71.field1494 = class169.method1069(class253.field3960, 0, 0, arg1, arg2);
        if (arg0) {
            field1093 = (int[]) null;
        }
        field1091++;
        if (class249.field3893) {
            class61.field1179 = class94.method629(arg2, arg1, 0, -115, class253.field3960);
        } else {
            class61.field1179 = (class237) class71.field1494;
        }
        class33.field674 = class169.method1069(class321.field4895, 0, 0, arg1, arg2);
        class214.field3428 = class169.method1069(class169.field2724, 0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V", line = 234)
    public final void method432(int arg0) {
        field1089++;
        while (true) {
            class35 var2 = this.field1102.field701;
            if (this.field1102 == var2) {
                int var3 = 62 / ((-arg0 - 15) / 47);
                this.field1106 = null;
                return;
            }
            var2.method278((byte) -105);
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V", line = 294)
    public class55() {
        this.field1102.field701 = this.field1102;
        this.field1102.field703 = this.field1102;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(B)Laa;", line = 276)
    public final class35 method433(byte arg0) {
        class35 var2 = this.field1106;
        field1092++;
        if (arg0 != -85) {
            method423((byte) -89);
        }
        if (this.field1102 == var2) {
            this.field1106 = null;
            return null;
        } else {
            this.field1106 = var2.field703;
            return var2;
        }
    }
}
