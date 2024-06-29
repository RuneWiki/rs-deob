import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class319 {

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Lge;")
    private class511 field4730 = new class511(64);

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Lci;")
    private class320 field4731;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Lbd;")
    public static class44 field4728 = new class44("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Lqv;")
    public static class316 field4732 = new class316(54, 3);

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "[I")
    public static int[] field4733 = new int[2];

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field4735 = 0;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "[B")
    public static byte[] field4736 = new byte[2048];

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Lbd;")
    public static class44 field4734 = new class44("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field4738 = new String[100];

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Lqt;")
    public static class459 field4737 = new class459(40, -1);

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "Lrj;")
    public static class430 field4739 = new class430("WTI", 5);

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "D")
    public static double field4740 = -1.0D;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)V")
    public final void method2007(int arg0, boolean arg1) {
        class511 var3 = this.field4730;
        synchronized (this.field4730) {
            this.field4730.method2989(arg1, arg0);
        }
        field4726++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public static void method2008(boolean arg0) {
        field4734 = null;
        field4738 = null;
        field4737 = null;
        field4732 = null;
        field4736 = null;
        field4728 = null;
        if (!arg0) {
            field4733 = null;
            field4739 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public final void method2009(int arg0) {
        field4729++;
        if (arg0 != -1073) {
            field4740 = -1.1102901797818752D;
        }
        class511 var2 = this.field4730;
        synchronized (this.field4730) {
            this.field4730.method2980(-182819096);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public final void method2010(int arg0) {
        field4725++;
        class511 var2 = this.field4730;
        synchronized (this.field4730) {
            this.field4730.method2990((byte) -91);
            if (arg0 != 64) {
                field4739 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)Lns;")
    public final class284 method2011(int arg0, int arg1) {
        field4727++;
        if (arg0 <= 28) {
            this.method2010(16);
        }
        class511 var3 = this.field4730;
        class284 var4;
        synchronized (this.field4730) {
            var4 = (class284) this.field4730.method2982(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class320 var5 = this.field4731;
        byte[] var6;
        synchronized (this.field4731) {
            var6 = this.field4731.method2037(arg1, (byte) -108, 11);
        }
        class284 var7 = new class284();
        if (var6 != null) {
            var7.method1828(-1, new class519(var6));
        }
        class511 var8 = this.field4730;
        synchronized (this.field4730) {
            this.field4730.method2981(var7, 33, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lsn;ILci;)V")
    public class319(class453 arg0, int arg1, class320 arg2) {
        this.field4731 = arg2;
        if (this.field4731 != null) {
            this.field4731.method2030(-10914, 11);
        }
    }
}
