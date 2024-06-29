import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class363 {

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    private int field4968;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "[Ljn;")
    private class507[] field4967;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Ljc;")
    public static class305 field4963 = new class305("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "J")
    private long field4957;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Ll;")
    public static class16 field4965;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Lfo;")
    public static class361 field4960;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Lke;")
    public static class426 field4961;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Ljn;")
    private class507 field4958;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "[[Ljk;")
    public static class450[][] field4969;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Ljn;")
    public final class507 method2163(int arg0) {
        field4970++;
        if (this.field4958 == null) {
            return null;
        }
        class507 var2 = this.field4967[(int) (this.field4957 & (long) (this.field4968 + arg0))];
        while (this.field4958 != var2) {
            if (this.field4958.field7348 == this.field4957) {
                class507 var3 = this.field4958;
                this.field4958 = this.field4958.field7345;
                return var3;
            }
            this.field4958 = this.field4958.field7345;
        }
        this.field4958 = null;
        return null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
    public static void method2164(boolean arg0) {
        field4963 = null;
        field4969 = null;
        if (!arg0) {
            method2164(false);
        }
        field4965 = null;
        field4961 = null;
        field4960 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IJ)Ljn;")
    public final class507 method2165(int arg0, long arg1) {
        field4964++;
        this.field4957 = arg1;
        class507 var4 = this.field4967[(int) ((long) (this.field4968 + arg0) & arg1)];
        for (this.field4958 = var4.field7345; this.field4958 != var4; this.field4958 = this.field4958.field7345) {
            if (this.field4958.field7348 == arg1) {
                class507 var5 = this.field4958;
                this.field4958 = this.field4958.field7345;
                return var5;
            }
        }
        this.field4958 = null;
        return null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljn;BJ)V")
    public final void method2166(class507 arg0, byte arg1, long arg2) {
        if (arg1 != -107) {
            return;
        }
        if (arg0.field7346 != null) {
            arg0.method3022((byte) 54);
        }
        field4966++;
        class507 var5 = this.field4967[(int) ((long) (this.field4968 - 1) & arg2)];
        arg0.field7345 = var5;
        arg0.field7346 = var5.field7346;
        arg0.field7346.field7345 = arg0;
        arg0.field7348 = arg2;
        arg0.field7345.field7346 = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
    public static final void method2167(int arg0, int arg1) {
        if (!class319.field4256.field4678) {
            arg0 = -1;
        }
        field4962++;
        if (class6.field60 == arg0 || arg1 != -29608) {
            return;
        }
        if (arg0 != -1) {
            class93 var2 = class211.field2827.method1340(33, arg0);
            class491 var3 = var2.method519(0);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class381.field5518.method840(new Point(var2.field1118, var2.field1108), var3.method2962(), var3.method2975(), class60.field701, var3.method2974(), -3790);
                class6.field60 = arg0;
            }
        }
        if (arg0 == -1 && class6.field60 != -1) {
            class381.field5518.method840(new Point(), null, -1, class60.field701, -1, -3790);
            class6.field60 = -1;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I)V")
    public class363(int arg0) {
        this.field4968 = arg0;
        this.field4967 = new class507[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class507 var3 = this.field4967[var2] = new class507();
            var3.field7346 = var3;
            var3.field7345 = var3;
        }
    }
}
