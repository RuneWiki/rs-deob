import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class51 {

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "Lmq;")
    private class104 field853 = new class104(64);

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "Lfc;")
    private class343 field849;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "[Lhe;")
    public static class147[] field860;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "Ltm;")
    public static class112 field858;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field859;

    static {
        new class112("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field860 = new class147[8];
        field858 = new class112("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 3)
    public static void method401(int arg0) {
        if (arg0 <= 57) {
            field857 = -33;
        }
        field860 = null;
        field858 = null;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V", line = 15)
    public final void method402(int arg0) {
        class104 var2 = this.field853;
        synchronized (this.field853) {
            this.field853.method654(false);
        }
        if (arg0 != -1) {
            field858 = null;
        }
        field850++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)V", line = 34)
    public static final void method403(int arg0, int arg1) {
        field859++;
        if (arg1 != 8) {
            field858 = null;
        }
        class165.field2431 = arg0;
        class104 var2 = class152.field2155;
        synchronized (class152.field2155) {
            class152.field2155.method656(127);
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)Lah;", line = 51)
    public final class319 method404(int arg0, int arg1) {
        field855++;
        class104 var3 = this.field853;
        class319 var4;
        synchronized (this.field853) {
            var4 = (class319) this.field853.method659((long) arg1, (byte) -1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field849.method2029(class234.method1474(245721258, arg1), class388.method2306(arg1, true), arg0 ^ arg0);
        class319 var6 = new class319();
        if (var5 != null) {
            var6.method1928(new class425(var5), arg0 ^ 0x1626);
        }
        class104 var7 = this.field853;
        synchronized (this.field853) {
            this.field853.method653(arg0 + 5761, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(II)V", line = 77)
    public final void method405(int arg0, int arg1) {
        field854++;
        class104 var3 = this.field853;
        synchronized (this.field853) {
            if (arg0 != -32689) {
                this.field853 = null;
            }
            this.field853.method666(arg1, false);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V", line = 90)
    public final void method406(byte arg0) {
        class104 var2 = this.field853;
        synchronized (this.field853) {
            if (arg0 != -62) {
                return;
            }
            this.field853.method656(125);
        }
        field851++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)V", line = 103)
    public final void method407(int arg0, byte arg1) {
        field852++;
        class104 var3 = this.field853;
        synchronized (this.field853) {
            this.field853.method656(99);
            this.field853 = new class104(arg0);
            if (arg1 <= 10) {
                this.method404(118, 107);
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Ldk;ILfc;)V", line = 131)
    public class51(class328 arg0, int arg1, class343 arg2) {
        this.field849 = arg2;
        if (this.field849 != null) {
            int var4 = this.field849.method2027(-101) - 1;
            this.field849.method2054(0, var4);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IBIII)V", line = 155)
    public static final void method408(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class299.field4121 = arg4;
        class248.field3487 = arg3;
        class8.field174 = arg2;
        if (arg1 > -111) {
            method401(-77);
        }
        field856++;
        class53.field874 = arg0;
    }
}
