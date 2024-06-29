import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class46 {

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "Lik;")
    public class176 field892 = new class176();

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "Lik;")
    private class176 field894;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "[I")
    public static int[] field898;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I[BZLgi;BIII)Les;")
    public static final class320 method454(int arg0, byte[] arg1, boolean arg2, class583 arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 < 59) {
            return null;
        }
        field891++;
        if (!arg3.field8249 && (!class130.method886(1, arg6) || !class130.method886(1, arg7))) {
            return arg3.field8253 ? new class320(arg3, 34037, arg0, arg6, arg7, arg2, arg1, arg5) : new class320(arg3, arg0, arg6, arg7, class32.method326(arg6, false), class32.method326(arg7, false), arg1, arg5);
        } else {
            return new class320(arg3, 3553, arg0, arg6, arg7, arg2, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)Lik;")
    public final class176 method455(byte arg0) {
        field896++;
        if (arg0 != -43) {
            return null;
        }
        class176 var2 = this.field894;
        if (this.field892 == var2) {
            this.field894 = null;
            return null;
        } else {
            this.field894 = var2.field2519;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)Lik;")
    public final class176 method456(byte arg0) {
        if (arg0 > -33) {
            return null;
        }
        field897++;
        class176 var2 = this.field892.field2516;
        if (this.field892 == var2) {
            this.field894 = null;
            return null;
        } else {
            this.field894 = var2.field2516;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ldm;ILik;)V")
    private final void method457(class46 arg0, int arg1, class176 arg2) {
        field895++;
        class176 var4 = this.field892.field2519;
        this.field892.field2519 = arg2.field2519;
        arg2.field2519.field2516 = this.field892;
        if (this.field892 != arg2) {
            arg2.field2519 = arg0.field892.field2519;
            arg2.field2519.field2516 = arg2;
            var4.field2516 = arg0.field892;
            arg0.field892.field2519 = var4;
        }
        int var5 = -58 / ((30 - arg1) / 61);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V")
    public static void method458(boolean arg0) {
        if (arg0) {
            field898 = null;
        }
        field898 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Lik;")
    public final class176 method459(int arg0) {
        if (arg0 != 3553) {
            method458(false);
        }
        field888++;
        class176 var2 = this.field892.field2516;
        if (this.field892 == var2) {
            return null;
        } else {
            var2.method1117(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)Lik;")
    public final class176 method460(byte arg0) {
        int var2 = 111 / ((arg0 + 24) / 59);
        field887++;
        class176 var3 = this.field894;
        if (this.field892 == var3) {
            this.field894 = null;
            return null;
        } else {
            this.field894 = var3.field2516;
            return var3;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ldm;I)V")
    public final void method461(class46 arg0, int arg1) {
        field886++;
        int var3 = -98 % ((-arg1 - 5) / 61);
        this.method457(arg0, 116, this.field892.field2516);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLik;)V")
    public final void method462(byte arg0, class176 arg1) {
        field890++;
        if (arg1.field2519 != null) {
            arg1.method1117(0);
        }
        arg1.field2516 = this.field892.field2516;
        arg1.field2519 = this.field892;
        arg1.field2519.field2516 = arg1;
        if (arg0 <= 41) {
            this.method457(null, -20, null);
        }
        arg1.field2516.field2519 = arg1;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V")
    public class46() {
        this.field892.field2516 = this.field892;
        this.field892.field2519 = this.field892;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lik;I)V")
    public final void method463(class176 arg0, int arg1) {
        field899++;
        if (arg0.field2519 != null) {
            arg0.method1117(0);
        }
        arg0.field2519 = this.field892.field2519;
        arg0.field2516 = this.field892;
        if (arg1 >= -92) {
            this.field892 = null;
        }
        arg0.field2519.field2516 = arg0;
        arg0.field2516.field2519 = arg0;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(Z)I")
    public final int method464(boolean arg0) {
        field900++;
        int var2 = 0;
        if (arg0) {
            this.method463(null, 20);
        }
        for (class176 var3 = this.field892.field2516; var3 != this.field892; var3 = var3.field2516) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(Z)V")
    public final void method465(boolean arg0) {
        while (true) {
            class176 var2 = this.field892.field2516;
            if (this.field892 == var2) {
                field889++;
                this.field894 = null;
                if (!arg0) {
                    this.field894 = null;
                    return;
                }
                return;
            }
            var2.method1117(0);
        }
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(B)Z")
    public final boolean method466(byte arg0) {
        if (arg0 != 87) {
            this.method463(null, -5);
        }
        field885++;
        return this.field892.field2516 == this.field892;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)Lik;")
    public final class176 method467(int arg0) {
        field893++;
        class176 var2 = this.field892.field2519;
        if (this.field892 == var2) {
            this.field894 = null;
            return null;
        }
        this.field894 = var2.field2519;
        if (arg0 != 3344) {
            this.field892 = null;
        }
        return var2;
    }

    static {
        new class104("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
    }
}
