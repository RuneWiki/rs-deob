import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class479 {

    @OriginalMember(owner = "client!du", name = "j", descriptor = "Lnb;")
    private class472 field6776 = new class472();

    @OriginalMember(owner = "client!du", name = "b", descriptor = "Luo;")
    public static class145 field6768 = null;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    public static int field6777 = 0;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "Lmq;")
    public static class104 field6770 = new class104(8);

    @OriginalMember(owner = "client!du", name = "p", descriptor = "Lcs;")
    public static class351 field6782 = new class351(38, 7);

    @OriginalMember(owner = "client!du", name = "r", descriptor = "I")
    public static int field6784 = -50;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "Lnb;")
    private class472 field6780;

    @OriginalMember(owner = "client!du", name = "q", descriptor = "[I")
    public static int[] field6783;

    static {
        new class112("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)Lnb;", line = 4)
    public final class472 method2815(int arg0) {
        field6773++;
        class472 var2 = this.field6776.field6613;
        if (this.field6776 == var2) {
            this.field6780 = null;
            return null;
        }
        if (arg0 != 7) {
            field6768 = null;
        }
        this.field6780 = var2.field6613;
        return var2;
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)I", line = 27)
    public final int method2816(int arg0) {
        int var2 = -108 % (arg0 / 61);
        field6769++;
        int var3 = 0;
        for (class472 var4 = this.field6776.field6614; var4 != this.field6776; var4 = var4.field6614) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ZLnb;)V", line = 53)
    public final void method2817(boolean arg0, class472 arg1) {
        if (arg1.field6613 != null) {
            arg1.method2773(26979);
        }
        field6775++;
        arg1.field6613 = this.field6776.field6613;
        arg1.field6614 = this.field6776;
        arg1.field6613.field6614 = arg1;
        arg1.field6614.field6613 = arg1;
        if (arg0) {
            field6782 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(I)Lnb;", line = 70)
    public final class472 method2818(int arg0) {
        field6772++;
        class472 var2 = this.field6780;
        if (this.field6776 == var2) {
            this.field6780 = null;
            return null;
        }
        if (arg0 != 0) {
            this.field6776 = null;
        }
        this.field6780 = var2.field6614;
        return var2;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V", line = 92)
    public final void method2819(byte arg0) {
        if (arg0 != 4) {
            this.method2822(true);
        }
        field6771++;
        while (true) {
            class472 var2 = this.field6776.field6614;
            if (this.field6776 == var2) {
                this.field6780 = null;
                return;
            }
            var2.method2773(arg0 + 26975);
        }
    }

    @OriginalMember(owner = "client!du", name = "d", descriptor = "(I)Lnb;", line = 123)
    public final class472 method2820(int arg0) {
        field6781++;
        class472 var2 = this.field6776.field6614;
        if (arg0 != 0) {
            method2824(-6, (byte) 26);
        }
        if (this.field6776 == var2) {
            return null;
        } else {
            var2.method2773(26979);
            return var2;
        }
    }

    @OriginalMember(owner = "client!du", name = "e", descriptor = "(I)V", line = 147)
    public static void method2821(int arg0) {
        field6783 = null;
        field6782 = null;
        field6770 = null;
        if (arg0 != 27660) {
            field6783 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)Z", line = 159)
    public final boolean method2822(boolean arg0) {
        field6778++;
        if (arg0) {
            method2824(78, (byte) 62);
        }
        return this.field6776.field6614 == this.field6776;
    }

    @OriginalMember(owner = "client!du", name = "f", descriptor = "(I)Lnb;", line = 171)
    public final class472 method2823(int arg0) {
        field6767++;
        if (arg0 < 36) {
            this.field6780 = null;
        }
        class472 var2 = this.field6776.field6614;
        if (this.field6776 == var2) {
            this.field6780 = null;
            return null;
        } else {
            this.field6780 = var2.field6614;
            return var2;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IB)V", line = 194)
    public static final void method2824(int arg0, byte arg1) {
        if (client.field5498 == null || client.field5498.length < arg0) {
            client.field5498 = new int[arg0];
        }
        if (arg1 != -59) {
            method2821(52);
        }
        field6779++;
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V", line = 219)
    public class479() {
        this.field6776.field6614 = this.field6776;
        this.field6776.field6613 = this.field6776;
    }
}
