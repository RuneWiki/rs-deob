import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class357 {

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
    private int field4601 = 0;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public int field4591;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "[Llf;")
    public class508[] field4583;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "Loi;")
    public static class169 field4581 = new class169("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "J")
    private long field4594;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "Llf;")
    private class508 field4588;

    @OriginalMember(owner = "client!jr", name = "v", descriptor = "Llf;")
    private class508 field4602;

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "[[Z")
    public static boolean[][] field4598;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IB)I")
    public static final int method2084(int arg0, byte arg1) {
        field4589++;
        int var2 = -50 % ((27 - arg1) / 42);
        return arg0 == 16711935 ? -1 : class203.method1330((byte) -108, arg0);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(JI)Llf;")
    public final class508 method2085(long arg0, int arg1) {
        if (arg1 != -5423) {
            return null;
        }
        field4585++;
        this.field4594 = arg0;
        class508 var4 = this.field4583[(int) ((long) (this.field4591 - 1) & arg0)];
        for (this.field4588 = var4.field7454; this.field4588 != var4; this.field4588 = this.field4588.field7454) {
            if (this.field4588.field7456 == arg0) {
                class508 var5 = this.field4588;
                this.field4588 = this.field4588.field7454;
                return var5;
            }
        }
        this.field4588 = null;
        return null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
    public static void method2086(int arg0) {
        field4598 = null;
        field4581 = null;
        if (arg0 != 0) {
            method2092(68, false, -82, -24, false);
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)Llf;")
    public final class508 method2087(int arg0) {
        field4584++;
        this.field4601 = arg0;
        return this.method2091(-126);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
    public final void method2088(byte arg0) {
        for (int var2 = 0; var2 < this.field4591; var2++) {
            class508 var3 = this.field4583[var2];
            while (true) {
                class508 var4 = var3.field7454;
                if (var3 == var4) {
                    break;
                }
                var4.method3021(109);
            }
        }
        if (arg0 != 116) {
            this.method2095(63);
        }
        field4590++;
        this.field4588 = null;
        this.field4602 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZIZ)Ljava/lang/String;")
    public static final String method2089(int arg0, boolean arg1, int arg2, boolean arg3) {
        field4592++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg3 && arg2 >= 0) {
            int var4 = 2;
            int var5 = arg2 / arg0;
            if (!arg1) {
                return null;
            }
            while (var5 != 0) {
                var4++;
                var5 /= arg0;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg0;
                int var9 = var8 - (arg0 * arg2);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)V")
    public static final void method2090(int arg0, int arg1) {
        class510 var2 = class470.field6877[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class510 var4 = class470.field6877[var3][arg0][arg1] = class470.field6877[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field7484--;
                for (class319 var5 = var4.field7494; var5 != null; var5 = var5.field4102) {
                    class448 var6 = var5.field4107;
                    if (var6.field6238 == arg0 && var6.field6228 == arg1) {
                        var6.field6220--;
                    }
                }
            }
        }
        if (class470.field6877[0][arg0][arg1] == null) {
            class470.field6877[0][arg0][arg1] = new class510(0, arg0, arg1);
            class470.field6877[0][arg0][arg1].field7500 = 1;
        }
        class470.field6877[0][arg0][arg1].field7483 = var2;
        class470.field6877[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)Llf;")
    public final class508 method2091(int arg0) {
        field4586++;
        if (this.field4601 > 0 && this.field4583[this.field4601 - 1] != this.field4602) {
            class508 var2 = this.field4602;
            this.field4602 = var2.field7454;
            return var2;
        }
        if (arg0 > -121) {
            this.field4588 = null;
        }
        while (this.field4601 < this.field4591) {
            class508 var3 = this.field4583[this.field4601++].field7454;
            if (this.field4583[this.field4601 - 1] != var3) {
                this.field4602 = var3.field7454;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZIIZ)V")
    public static final void method2092(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        class418.method2456(arg3, arg1, 0, arg4, class167.field2177.length - 1, arg0, true);
        field4596++;
        class432.field5950 = null;
        if (arg2 == 29927) {
            class457.field6376 = 0;
        }
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)Llf;")
    public final class508 method2093(int arg0) {
        if (arg0 != 0) {
            this.method2087(-87);
        }
        field4593++;
        if (this.field4588 == null) {
            return null;
        }
        class508 var2 = this.field4583[(int) ((long) (this.field4591 - 1) & this.field4594)];
        while (this.field4588 != var2) {
            if (this.field4588.field7456 == this.field4594) {
                class508 var3 = this.field4588;
                this.field4588 = this.field4588.field7454;
                return var3;
            }
            this.field4588 = this.field4588.field7454;
        }
        this.field4588 = null;
        return null;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)I")
    public final int method2094(byte arg0) {
        if (arg0 == 91) {
            field4595++;
            return this.field4591;
        } else {
            return -42;
        }
    }

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)I")
    public final int method2095(int arg0) {
        field4582++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field4591; var3++) {
            class508 var4 = this.field4583[var3];
            class508 var5 = var4.field7454;
            while (var4 != var5) {
                var5 = var5.field7454;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(JLlf;B)V")
    public final void method2096(long arg0, class508 arg1, byte arg2) {
        if (arg2 != 76) {
            return;
        }
        field4597++;
        if (arg1.field7455 != null) {
            arg1.method3021(-101);
        }
        class508 var5 = this.field4583[(int) (arg0 & (long) (this.field4591 - 1))];
        arg1.field7455 = var5.field7455;
        arg1.field7454 = var5;
        arg1.field7455.field7454 = arg1;
        arg1.field7456 = arg0;
        arg1.field7454.field7455 = arg1;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(I)V")
    public class357(int arg0) {
        this.field4591 = arg0;
        this.field4583 = new class508[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class508 var3 = this.field4583[var2] = new class508();
            var3.field7454 = var3;
            var3.field7455 = var3;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B[Llf;)I")
    public final int method2097(byte arg0, class508[] arg1) {
        field4587++;
        int var3 = 0;
        if (arg0 != -78) {
            return 10;
        }
        for (int var4 = 0; var4 < this.field4591; var4++) {
            class508 var5 = this.field4583[var4];
            for (class508 var6 = var5.field7454; var6 != var5; var6 = var6.field7454) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    static {
        new class169("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        field4600 = 0;
    }
}
