import java.awt.Image;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class45 {

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    private int field591 = 0;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[Lpt;")
    public class147[] field571;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public int field582;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "Lec;")
    public static class40 field585 = new class40("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "J")
    public static long field589 = -1L;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "Lec;")
    public static class40 field587 = new class40("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "J")
    private long field590;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Lpt;")
    private class147 field576;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "Lpt;")
    private class147 field592;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Ljava/awt/Image;")
    public static Image field569;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I", line = 7)
    public final int method230(int arg0) {
        field578++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field582; var3++) {
            class147 var4 = this.field571[var3];
            for (class147 var5 = var4.field1779; var5 != var4; var5 = var5.field1779) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lkd;I)V", line = 36)
    public static final void method231(class355 arg0, int arg1) {
        field577++;
        class283.field4124 = 3;
        class437.method2599(true, -58);
        class376.field5363 = 127;
        class304.field4495 = true;
        class427.field6166 = 2;
        class304.field4496 = true;
        class342.field4899 = true;
        class364.field5231 = true;
        class445.field6337 = true;
        class154.field1855 = 0;
        class92.field1143 = 0;
        class346.field4943 = 1;
        class119.field1484 = true;
        class401.field5719 = 0;
        class22.field305 = true;
        class282.field4111 = 0;
        class27.field359 = true;
        class265.field3817 = true;
        class224.field3102 = 255;
        class304.field4494 = 127;
        class191.field2611 = true;
        if (class275.field3918 >= 96) {
            class115.method563((byte) 113, 2);
        } else {
            class115.method563((byte) -128, 0);
        }
        class487.field6914 = false;
        class217.field3010 = class281.field4095 == 1 ? 2 : 4;
        class46.field597 = 0;
        int var2 = -11 % ((-arg1 - 63) / 53);
        class300.field4466 = 2;
        class82.field992 = true;
        class262.field3766 = 2;
        class346.field4949 = true;
        class92.field1146 = false;
        class50.field657 = 0;
        class468.field6577 = false;
        class11 var3 = null;
        try {
            class405 var4 = arg0.method2154(-79);
            while (var4.field5759 == 0) {
                class85.method433(1L, -50);
            }
            if (var4.field5759 == 1) {
                var3 = (class11) var4.field5755;
                byte[] var5 = new byte[(int) var3.method89((byte) -45)];
                int var7;
                for (int var6 = 0; var6 < var5.length; var6 += var7) {
                    var7 = var3.method88(var6, var5, (byte) 117, var5.length - var6);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class349.method2110((byte) 113, new class179(var5));
            }
        } catch (Exception var9) {
        }
        try {
            if (var3 != null) {
                var3.method86((byte) 75);
            }
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I", line = 122)
    public final int method232(int arg0) {
        field572++;
        return arg0 == 21596 ? this.field582 : 18;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IJ)Lpt;", line = 134)
    public final class147 method233(int arg0, long arg1) {
        this.field590 = arg1;
        int var4 = 121 / ((arg0 - 4) / 53);
        field588++;
        class147 var5 = this.field571[(int) (arg1 & (long) (this.field582 - 1))];
        for (this.field576 = var5.field1779; this.field576 != var5; this.field576 = this.field576.field1779) {
            if (this.field576.field1776 == arg1) {
                class147 var6 = this.field576;
                this.field576 = this.field576.field1779;
                return var6;
            }
        }
        this.field576 = null;
        return null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IJLpt;)V", line = 165)
    public final void method234(int arg0, long arg1, class147 arg2) {
        field580++;
        if (arg2.field1777 != null) {
            arg2.method702((byte) -114);
        }
        class147 var5 = this.field571[(int) (arg1 & (long) (this.field582 - 1))];
        arg2.field1779 = var5;
        arg2.field1777 = var5.field1777;
        if (arg0 >= -41) {
            this.field590 = -38L;
        }
        arg2.field1777.field1779 = arg2;
        arg2.field1779.field1777 = arg2;
        arg2.field1776 = arg1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZIILg;III)V", line = 189)
    public static final void method235(boolean arg0, int arg1, int arg2, class470 arg3, int arg4, int arg5, int arg6) {
        class175.field2099 = arg5;
        class80.field957 = arg2;
        class199.field2766 = arg6;
        field583++;
        class269.field3862 = arg1;
        class128.field1581 = arg3;
        class142.field1712 = 1;
        if (arg4 == -47) {
            class349.field5020 = arg0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V", line = 208)
    public final void method236(int arg0) {
        for (int var2 = 0; var2 < this.field582; var2++) {
            class147 var3 = this.field571[var2];
            while (true) {
                class147 var4 = var3.field1779;
                if (var3 == var4) {
                    break;
                }
                var4.method702((byte) -114);
            }
        }
        field584++;
        this.field576 = null;
        this.field592 = null;
        if (arg0 != 3) {
            this.method243(78, (class147[]) null);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)Lpt;", line = 246)
    public final class147 method237(byte arg0) {
        if (arg0 > -6) {
            field569 = null;
        }
        field586++;
        if (this.field576 == null) {
            return null;
        }
        class147 var2 = this.field571[(int) ((long) (this.field582 - 1) & this.field590)];
        while (this.field576 != var2) {
            if (this.field576.field1776 == this.field590) {
                class147 var3 = this.field576;
                this.field576 = this.field576.field1779;
                return var3;
            }
            this.field576 = this.field576.field1779;
        }
        this.field576 = null;
        return null;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V", line = 279)
    public static void method238(int arg0) {
        field587 = null;
        field569 = null;
        if (arg0 != -7) {
            field589 = -30L;
        }
        field585 = null;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)Lpt;", line = 291)
    public final class147 method239(int arg0) {
        field575++;
        if (this.field591 > arg0 && this.field571[this.field591 - 1] != this.field592) {
            class147 var2 = this.field592;
            this.field592 = var2.field1779;
            return var2;
        }
        while (this.field591 < this.field582) {
            class147 var3 = this.field571[this.field591++].field1779;
            if (this.field571[this.field591 - 1] != var3) {
                this.field592 = var3.field1779;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V", line = 320)
    public static final void method240(int arg0, int arg1, int arg2) {
        field579++;
        if (arg0 != 22008) {
            field589 = -3L;
        }
        if (class289.field4317 == class262.field3772) {
            if (!class397.method2377(1, false, 0, arg2, 0, -2, 0, arg1, 1)) {
                class397.method2377(1, false, 0, arg2, 0, -3, 0, arg1, 1);
            }
        } else if (!class397.method2377(1, false, 0, arg2, 0, -3, 0, arg1, 1)) {
            class397.method2377(1, false, 0, arg2, 0, -2, 0, arg1, 1);
        }
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)Lpt;", line = 349)
    public final class147 method241(int arg0) {
        field574++;
        this.field591 = arg0;
        return this.method239(0);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)Z", line = 359)
    public static final boolean method242(int arg0, byte arg1) {
        field573++;
        if (arg0 == 46 || arg0 == 48 || arg0 == 30 || arg0 == 5 || arg0 == 25) {
            return true;
        } else if (arg1 >= -44) {
            return false;
        } else {
            return arg0 == 6 || arg0 == 1008;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[Lpt;)I", line = 381)
    public final int method243(int arg0, class147[] arg1) {
        field570++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field582; var4++) {
            class147 var6 = this.field571[var4];
            for (class147 var7 = var6.field1779; var7 != var6; var7 = var7.field1779) {
                arg1[var3++] = var7;
            }
        }
        int var5 = -80 / ((arg0 - 14) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I)V", line = 413)
    public class45(int arg0) {
        this.field571 = new class147[arg0];
        this.field582 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class147 var3 = this.field571[var2] = new class147();
            var3.field1779 = var3;
            var3.field1777 = var3;
        }
    }
}
