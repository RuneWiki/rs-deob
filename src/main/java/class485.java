import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class485 {

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Lrj;")
    private class15 field6876 = new class15();

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Lec;")
    public static class40 field6871 = new class40("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Lsd;")
    public static class74 field6879 = new class74(97, 8);

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Lvf;")
    public static class166 field6882;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Lrj;")
    private class15 field6880;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)Lrj;")
    public final class15 method2862(int arg0) {
        if (arg0 != 2) {
            field6884 = -69;
        }
        field6874++;
        class15 var2 = this.field6876.field197;
        if (this.field6876 == var2) {
            this.field6880 = null;
            return null;
        } else {
            this.field6880 = var2.field197;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BII)V")
    public static final void method2863(byte arg0, int arg1, int arg2) {
        if (class158.field1877 != arg1) {
            class236.field3260 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class236.field3260[var3] = (var3 << 12) / arg1;
            }
            class158.field1877 = arg1;
            class154.field1857 = arg1 * 32;
            class474.field6656 = arg1 - 1;
        }
        field6878++;
        if (class388.field5561 != arg2) {
            if (class158.field1877 == arg2) {
                class156.field1865 = class236.field3260;
            } else {
                class156.field1865 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class156.field1865[var4] = (var4 << 12) / arg2;
                }
            }
            class388.field5561 = arg2;
            class208.field2886 = arg2 - 1;
        }
        if (arg0 > -124) {
            field6884 = -51;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
    public final void method2864(int arg0) {
        if (arg0 != 551432450) {
            return;
        }
        while (true) {
            class15 var2 = this.field6876.field197;
            if (this.field6876 == var2) {
                field6875++;
                this.field6880 = null;
                return;
            }
            var2.method104((byte) -61);
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)Lrj;")
    public final class15 method2865(int arg0) {
        field6877++;
        class15 var2 = this.field6876.field197;
        if (arg0 != 2) {
            return null;
        } else if (this.field6876 == var2) {
            return null;
        } else {
            var2.method104((byte) -88);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lrj;I)V")
    public final void method2866(class15 arg0, int arg1) {
        if (arg1 != 674847596) {
            return;
        }
        field6881++;
        if (arg0.field200 != null) {
            arg0.method104((byte) -67);
        }
        arg0.field197 = this.field6876;
        arg0.field200 = this.field6876.field200;
        arg0.field200.field197 = arg0;
        arg0.field197.field200 = arg0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I")
    public static final int method2867(int arg0, int arg1, int arg2) {
        field6883++;
        int var3 = class185.method1005(-114, arg2 + 91923, arg0 + 45365, 4) + ((class185.method1005(arg1 ^ 0x1B63, arg2 + 37821, arg0 + 10294, 2) - 128 >> 1) - -(class185.method1005(arg1 ^ 0x1B6E, arg2, arg0, 1) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg1 != -6926) {
            method2870(55);
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)I")
    public final int method2868(byte arg0) {
        field6873++;
        if (arg0 > -67) {
            this.field6880 = null;
        }
        int var2 = 0;
        class15 var3 = this.field6876.field197;
        while (this.field6876 != var3) {
            var3 = var3.field197;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)Lrj;")
    public final class15 method2869(boolean arg0) {
        field6872++;
        if (!arg0) {
            this.field6876 = null;
        }
        class15 var2 = this.field6880;
        if (this.field6876 == var2) {
            this.field6880 = null;
            return null;
        } else {
            this.field6880 = var2.field197;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V")
    public static void method2870(int arg0) {
        field6871 = null;
        if (arg0 != 128) {
            method2863((byte) -42, -106, -39);
        }
        field6879 = null;
        field6882 = null;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    public class485() {
        this.field6876.field200 = this.field6876;
        this.field6876.field197 = this.field6876;
    }

    static {
        new class135("", 73);
        field6882 = new class166();
        new class40("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field6884 = 0;
    }
}
