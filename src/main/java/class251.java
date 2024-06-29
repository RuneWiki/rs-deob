import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class251 {

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "Ltl;")
    private class400 field3611 = new class400(64);

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public int field3619 = 0;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "Lui;")
    private class451 field3613;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public int field3617;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "Lct;")
    public static class285 field3618;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "Lo;")
    public static class332 field3620;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "Lui;")
    public static class451 field3616;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "Lui;")
    public static class451 field3621;

    static {
        new class332("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field3618 = new class285(32, 8);
        field3620 = new class332("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)Lan;", line = 4)
    public final class172 method1599(byte arg0, int arg1) {
        field3610++;
        class400 var3 = this.field3611;
        class172 var4;
        synchronized (this.field3611) {
            var4 = (class172) this.field3611.method2393(-123, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3613.method2691(arg1, 4, 0);
        class172 var6 = new class172();
        var6.field2444 = this;
        var6.field2453 = arg1;
        if (var5 != null) {
            var6.method1190(new class446(var5), (byte) 85);
        }
        var6.method1188(-86);
        class400 var7 = this.field3611;
        synchronized (this.field3611) {
            int var8 = -72 / ((arg0 - 21) / 63);
            this.field3611.method2395(0, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V", line = 34)
    public final void method1600(int arg0) {
        field3612++;
        class400 var2 = this.field3611;
        synchronized (this.field3611) {
            if (arg0 == 0) {
                this.field3611.method2388(126);
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V", line = 50)
    public static void method1601(int arg0) {
        field3620 = null;
        field3621 = null;
        field3618 = null;
        field3616 = null;
        int var1 = 70 % ((arg0 - 48) / 40);
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lgp;ILui;)V", line = 112)
    public class251(class430 arg0, int arg1, class451 arg2) {
        this.field3613 = arg2;
        this.field3617 = this.field3613.method2662(4, (byte) -7);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IB)V", line = 77)
    public final void method1602(int arg0, byte arg1) {
        class400 var3 = this.field3611;
        synchronized (this.field3611) {
            this.field3611.method2389(false, arg0);
        }
        field3615++;
        if (arg1 != -4) {
            method1601(30);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V", line = 97)
    public final void method1603(byte arg0) {
        int var2 = -51 / ((46 - arg0) / 57);
        class400 var3 = this.field3611;
        synchronized (this.field3611) {
            this.field3611.method2401((byte) -40);
        }
        field3614++;
    }
}
