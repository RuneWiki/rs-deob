import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class49 {

    @OriginalMember(owner = "client!en", name = "m", descriptor = "Lqk;")
    public class70 field1022 = new class70();

    @OriginalMember(owner = "client!en", name = "o", descriptor = "I")
    public static int field1024 = 0;

    @OriginalMember(owner = "client!en", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field1026 = new String[100];

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!en", name = "r", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "Lek;")
    public static class206 field1014;

    @OriginalMember(owner = "client!en", name = "p", descriptor = "Lqk;")
    private class70 field1025;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)Lqk;", line = 13)
    public final class70 method429(int arg0) {
        if (arg0 > -58) {
            this.field1025 = (class70) null;
        }
        field1010++;
        class70 var2 = this.field1022.field1292;
        if (this.field1022 == var2) {
            this.field1025 = null;
            return null;
        } else {
            this.field1025 = var2.field1292;
            return var2;
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V", line = 38)
    public static void method430(int arg0) {
        if (arg0 == 0) {
            field1026 = null;
            field1014 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)Lqk;", line = 49)
    public final class70 method431(int arg0) {
        field1021++;
        if (arg0 != 0) {
            this.method436(false);
        }
        class70 var2 = this.field1022.field1290;
        if (this.field1022 == var2) {
            this.field1025 = null;
            return null;
        } else {
            this.field1025 = var2.field1290;
            return var2;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)Lqk;", line = 71)
    public final class70 method432(boolean arg0) {
        field1018++;
        class70 var2 = this.field1022.field1290;
        if (!arg0) {
            field1023 = -35;
        }
        if (this.field1022 == var2) {
            return null;
        } else {
            var2.method535(-2801);
            return var2;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)V", line = 94)
    public static final void method433(int arg0, int arg1) {
        class345.field5444.method896(arg0, (byte) -50);
        if (arg1 == -16212) {
            field1027++;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILqk;)V", line = 107)
    public final void method434(int arg0, class70 arg1) {
        if (arg1.field1292 != null) {
            arg1.method535(-2801);
        }
        if (arg0 != 0) {
            return;
        }
        arg1.field1292 = this.field1022;
        arg1.field1290 = this.field1022.field1290;
        arg1.field1292.field1290 = arg1;
        field1013++;
        arg1.field1290.field1292 = arg1;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)J", line = 125)
    public static final long method435(byte arg0) {
        field1015++;
        return arg0 <= 34 ? -113L : class244.field4056.method37(false);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)Lqk;", line = 140)
    public final class70 method436(boolean arg0) {
        if (!arg0) {
            this.method432(true);
        }
        class70 var2 = this.field1025;
        field1016++;
        if (this.field1022 == var2) {
            this.field1025 = null;
            return null;
        } else {
            this.field1025 = var2.field1292;
            return var2;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lqk;B)V", line = 159)
    public final void method437(class70 arg0, byte arg1) {
        if (arg1 != 51) {
            return;
        }
        if (arg0.field1292 != null) {
            arg0.method535(arg1 - 2852);
        }
        arg0.field1292 = this.field1022.field1292;
        arg0.field1290 = this.field1022;
        field1011++;
        arg0.field1292.field1290 = arg0;
        arg0.field1290.field1292 = arg0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIII)V", line = 177)
    public static final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg4 + 1;
        class344.method2417(class232.field3799[arg4], arg0, arg2, arg3, (byte) -123);
        int var9 = arg5 - 1;
        class344.method2417(class232.field3799[arg5], arg0, arg2, arg3, (byte) -120);
        field1012++;
        int var6 = var8;
        if (arg1 != 23706) {
            field1023 = 18;
        }
        while (var6 <= var9) {
            int[] var7 = class232.field3799[var6];
            var7[arg0] = var7[arg2] = arg3;
            var6++;
        }
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(I)Lqk;", line = 206)
    public final class70 method439(int arg0) {
        field1017++;
        class70 var2 = this.field1025;
        if (this.field1022 == var2) {
            this.field1025 = null;
            return null;
        } else {
            this.field1025 = var2.field1290;
            return arg0 == -28512 ? var2 : (class70) null;
        }
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(I)V", line = 237)
    public final void method440(int arg0) {
        while (true) {
            class70 var2 = this.field1022.field1290;
            if (this.field1022 == var2) {
                if (arg0 >= -12) {
                    field1026 = (String[]) null;
                }
                field1019++;
                this.field1025 = null;
                return;
            }
            var2.method535(-2801);
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(Z)Z", line = 266)
    public final boolean method441(boolean arg0) {
        if (arg0) {
            method430(-60);
        }
        field1020++;
        return this.field1022.field1290 == this.field1022;
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V", line = 281)
    public class49() {
        this.field1022.field1292 = this.field1022;
        this.field1022.field1290 = this.field1022;
    }
}
