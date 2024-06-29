import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class238 {

    @OriginalMember(owner = "client!km", name = "c", descriptor = "Lwm;")
    private class399 field3671 = new class399(64);

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Lph;")
    private class459 field3673;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "Lbj;")
    public static class162 field3672;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "Z")
    public static boolean field3677;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "Z")
    public static boolean field3678;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([BIIIII)Z")
    public static final boolean method1552(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3669++;
        boolean var6 = true;
        class289 var7 = new class289(arg0);
        if (arg4 < 113) {
            field3672 = null;
        }
        int var8 = -1;
        label58: while (true) {
            int var9 = var7.method1819(0);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method1825((byte) -114);
                    if (var13 == 0) {
                        continue label58;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = (var10 & 0xFFE) >> 6;
                    int var16 = var7.method1858(-3256) >> 2;
                    int var17 = arg2 + var15;
                    int var18 = var14 + arg1;
                    if (var17 > 0 && var18 > 0 && var17 < (arg5 - 1) && (arg3 - 1) > var18) {
                        class306 var19 = class123.field2142.method1530((byte) -126, var8);
                        if (var16 != 22 || class186.field2990.field2529 || var19.field4587 != 0 || var19.field4614 == 1 || var19.field4629) {
                            var11 = true;
                            if (!var19.method1960((byte) -43)) {
                                class299.field4527++;
                                var6 = false;
                            }
                        }
                    }
                }
                int var12 = var7.method1825((byte) -114);
                if (var12 == 0) {
                    break;
                }
                var7.method1858(-3256);
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public final void method1553(int arg0) {
        class399 var2 = this.field3671;
        synchronized (this.field3671) {
            this.field3671.method2477(78);
            if (arg0 != 15972) {
                this.method1554((byte) 81);
            }
        }
        field3674++;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
    public final void method1554(byte arg0) {
        field3679++;
        if (arg0 > 60) {
            class399 var2 = this.field3671;
            synchronized (this.field3671) {
                this.field3671.method2475((byte) 67);
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)Ltl;")
    public final class441 method1555(byte arg0, int arg1) {
        field3676++;
        class399 var3 = this.field3671;
        class441 var4;
        synchronized (this.field3671) {
            var4 = (class441) this.field3671.method2478(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0 > -37) {
            return null;
        } else {
            class459 var5 = this.field3673;
            byte[] var6;
            synchronized (this.field3673) {
                var6 = this.field3673.method2757(35, arg1, (byte) -124);
            }
            class441 var7 = new class441();
            if (var6 != null) {
                var7.method2626(false, new class289(var6));
            }
            var7.method2627(-56);
            class399 var8 = this.field3671;
            synchronized (this.field3671) {
                this.field3671.method2472(-116, var7, (long) arg1);
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IZ)V")
    public final void method1556(int arg0, boolean arg1) {
        if (arg1) {
            field3672 = null;
        }
        class399 var3 = this.field3671;
        synchronized (this.field3671) {
            this.field3671.method2471((byte) 98, arg0);
        }
        field3670++;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(B)V")
    public static void method1557(byte arg0) {
        field3672 = null;
        if (arg0 > -80) {
            field3678 = true;
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lkp;ILph;)V")
    public class238(class341 arg0, int arg1, class459 arg2) {
        this.field3673 = arg2;
        if (this.field3673 != null) {
            this.field3673.method2763(35, -3);
        }
    }

    static {
        new class309("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field3672 = new class162(70, -1);
        field3675 = 0;
        field3677 = false;
        field3678 = false;
        new class309("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
    }
}
