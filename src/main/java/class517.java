import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class517 {

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "Ler;")
    private class157 field7667 = new class157(256);

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "Lm;")
    private class373 field7670;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Lbv;")
    private class282 field7672;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "Lpg;")
    public static class492 field7665 = new class492(49, -1);

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "Lcm;")
    public static class449 field7677 = new class449(65, 8);

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field7673;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field7676;

    static {
        new class375("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 5)
    public final void method3073(int arg0) {
        field7668++;
        this.field7667.method1015((byte) 118);
        if (arg0 != -1) {
            this.field7670 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V", line = 18)
    public static final void method3074(int arg0, int arg1) {
        if (arg1 == 22320) {
            field7673++;
            if (class5.field74 == null || arg0 > class5.field74.length) {
                class5.field74 = new int[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 39)
    public final void method3075(byte arg0) {
        if (arg0 == -113) {
            field7674++;
            this.field7667.method1016(5, (byte) 117);
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)V", line = 50)
    public static final void method3076(int arg0, int arg1) {
        class24.field360 = arg1 / arg0;
        field7671++;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lbv;Lm;)V", line = 63)
    public class517(class282 arg0, class373 arg1) {
        this.field7670 = arg1;
        this.field7672 = arg0;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)Lpi;", line = 72)
    public static final class231 method3077(boolean arg0) {
        field7676++;
        class231 var1 = (class231) class458.field6721.method2361(0);
        if (var1 == null) {
            if (!arg0) {
                method3074(33, -24);
            }
            return new class231();
        } else {
            class35.field573--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(II)Lwg;", line = 95)
    public final class393 method3078(int arg0, int arg1) {
        field7666++;
        Object var3 = this.field7667.method1013((long) arg1, (byte) -106);
        if (var3 != null) {
            return (class393) var3;
        } else if (this.field7670.method1556(true, arg1)) {
            if (arg0 > -31) {
                method3076(-71, 67);
            }
            class263 var4 = this.field7670.method1558(arg1, (byte) 123);
            int var5 = var4.field3654 ? 64 : this.field7672.field4075;
            class393 var7;
            if (var4.field3670 && this.field7672.method1146()) {
                float[] var6 = this.field7670.method1557(var5, arg1, -67, false, 0.7F, var5);
                var7 = new class393(this.field7672, 3553, 34842, var5, var5, var4.field3673 != 0, var6, 6408);
            } else {
                int[] var8;
                short var9;
                if (var4.field3672 && class255.method1659(-114, var4.field3671)) {
                    var8 = this.field7670.method1552(0.7F, arg1, true, var5, false, var5);
                    var9 = 6407;
                } else {
                    var9 = 6408;
                    var8 = this.field7670.method1551(false, arg1, var5, var5, 0.7F, 19881);
                }
                var7 = new class393(this.field7672, 3553, var9, var5, var5, var4.field3673 != 0, var8, false);
            }
            var7.method2417(true, var4.field3674, var4.field3667);
            this.field7667.method1012(-84, (long) arg1, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBLjb;I)V", line = 150)
    public static final void method3079(int arg0, byte arg1, class499 arg2, int arg3) {
        class430.field6398 = arg2;
        if (arg1 != -111) {
            method3074(85, 52);
        }
        field7669++;
        class14.field244 = arg0;
        class459.field6742 = arg3;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V", line = 163)
    public static void method3080(byte arg0) {
        field7677 = null;
        if (arg0 > -104) {
            method3079(-114, (byte) 48, null, 59);
        }
        field7665 = null;
    }
}
