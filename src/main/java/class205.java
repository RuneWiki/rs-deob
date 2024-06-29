import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class205 {

    @OriginalMember(owner = "client!dea", name = "w", descriptor = "I")
    private int field2892 = 0;

    @OriginalMember(owner = "client!dea", name = "p", descriptor = "[Lik;")
    public class176[] field2885;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "I")
    public int field2870;

    @OriginalMember(owner = "client!dea", name = "j", descriptor = "Lml;")
    public static class325 field2879 = new class325(9, 3);

    @OriginalMember(owner = "client!dea", name = "v", descriptor = "Z")
    public static boolean field2891;

    @OriginalMember(owner = "client!dea", name = "u", descriptor = "Lhf;")
    public static class333 field2890;

    @OriginalMember(owner = "client!dea", name = "t", descriptor = "F")
    public static float field2889;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!dea", name = "k", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!dea", name = "m", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!dea", name = "n", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!dea", name = "o", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!dea", name = "l", descriptor = "J")
    private long field2881;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "Lik;")
    private class176 field2872;

    @OriginalMember(owner = "client!dea", name = "s", descriptor = "Lik;")
    private class176 field2888;

    @OriginalMember(owner = "client!dea", name = "q", descriptor = "Lao;")
    public static class240 field2886;

    @OriginalMember(owner = "client!dea", name = "r", descriptor = "[I")
    public static int[] field2887;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lik;JI)V")
    public final void method1241(class176 arg0, long arg1, int arg2) {
        field2875++;
        if (arg2 >= -104) {
            return;
        }
        if (arg0.field2519 != null) {
            arg0.method1117(0);
        }
        class176 var5 = this.field2885[(int) ((long) (this.field2870 - 1) & arg1)];
        arg0.field2519 = var5.field2519;
        arg0.field2516 = var5;
        arg0.field2519.field2516 = arg0;
        arg0.field2524 = arg1;
        arg0.field2516.field2519 = arg0;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IJ)Lik;")
    public final class176 method1242(int arg0, long arg1) {
        field2880++;
        this.field2881 = arg1;
        class176 var4 = this.field2885[(int) (arg1 & (long) (this.field2870 - 1))];
        for (this.field2872 = var4.field2516; this.field2872 != var4; this.field2872 = this.field2872.field2516) {
            if (this.field2872.field2524 == arg1) {
                class176 var5 = this.field2872;
                this.field2872 = this.field2872.field2516;
                return var5;
            }
        }
        if (arg0 != 0) {
            this.field2870 = -36;
        }
        this.field2872 = null;
        return null;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)Lik;")
    public final class176 method1243(int arg0) {
        field2877++;
        if (this.field2872 == null) {
            return null;
        }
        class176 var2 = this.field2885[(int) (this.field2881 & (long) (this.field2870 + arg0))];
        while (this.field2872 != var2) {
            if (this.field2872.field2524 == this.field2881) {
                class176 var3 = this.field2872;
                this.field2872 = this.field2872.field2516;
                return var3;
            }
            this.field2872 = this.field2872.field2516;
        }
        this.field2872 = null;
        return null;
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(I)I")
    public final int method1244(int arg0) {
        field2874++;
        return arg0 == 9 ? this.field2870 : 78;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)Lik;")
    public final class176 method1245(byte arg0) {
        field2873++;
        if (arg0 != 95) {
            return null;
        } else if (this.field2892 <= 0 || this.field2885[this.field2892 - 1] == this.field2888) {
            while (this.field2892 < this.field2870) {
                class176 var3 = this.field2885[this.field2892++].field2516;
                if (this.field2885[this.field2892 - 1] != var3) {
                    this.field2888 = var3.field2516;
                    return var3;
                }
            }
            return null;
        } else {
            class176 var2 = this.field2888;
            this.field2888 = var2.field2516;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "([Lik;I)I")
    public final int method1246(class176[] arg0, int arg1) {
        field2871++;
        int var3 = 0;
        if (arg1 > -46) {
            field2886 = null;
        }
        for (int var4 = 0; var4 < this.field2870; var4++) {
            class176 var5 = this.field2885[var4];
            for (class176 var6 = var5.field2516; var6 != var5; var6 = var6.field2516) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "(I)V")
    public final void method1247(int arg0) {
        field2878++;
        for (int var2 = arg0; var2 < this.field2870; var2++) {
            class176 var3 = this.field2885[var2];
            while (true) {
                class176 var4 = var3.field2516;
                if (var3 == var4) {
                    break;
                }
                var4.method1117(0);
            }
        }
        this.field2872 = null;
        this.field2888 = null;
    }

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "(I)Lik;")
    public final class176 method1248(int arg0) {
        field2884++;
        if (arg0 != -1) {
            this.method1245((byte) 101);
        }
        this.field2892 = 0;
        return this.method1245((byte) 95);
    }

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "(I)V")
    public static void method1249(int arg0) {
        field2886 = null;
        field2890 = null;
        int var1 = -108 % ((79 - arg0) / 34);
        field2887 = null;
        field2879 = null;
    }

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "(I)I")
    public final int method1250(int arg0) {
        field2883++;
        int var2 = arg0;
        for (int var3 = 0; var3 < this.field2870; var3++) {
            class176 var4 = this.field2885[var3];
            for (class176 var5 = var4.field2516; var5 != var4; var5 = var5.field2516) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(I)V")
    public class205(int arg0) {
        this.field2885 = new class176[arg0];
        this.field2870 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class176 var3 = this.field2885[var2] = new class176();
            var3.field2516 = var3;
            var3.field2519 = var3;
        }
    }

    static {
        new class104("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field2891 = false;
        field2890 = new class333();
    }
}
