import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class297 {

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Lfr;")
    private class231 field4785 = new class231(64);

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "Lfr;")
    public class231 field4790 = new class231(2);

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "Lqs;")
    public class496 field4789;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "Lqs;")
    private class496 field4788;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BI)Lhe;")
    public final class419 method1912(byte arg0, int arg1) {
        field4786++;
        class231 var3 = this.field4785;
        class419 var4;
        synchronized (this.field4785) {
            var4 = (class419) this.field4785.method1593((byte) 115, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field4788;
        byte[] var6;
        synchronized (this.field4788) {
            var6 = this.field4788.method2926(arg1, -107, 33);
        }
        class419 var7 = new class419();
        var7.field6339 = this;
        if (var6 != null) {
            var7.method2573(30295, new class23(var6));
        }
        int var8 = 31 % ((arg0 - 22) / 51);
        class231 var9 = this.field4785;
        synchronized (this.field4785) {
            this.field4785.method1595(var7, (long) arg1, (byte) 82);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)V")
    public final void method1913(int arg0, int arg1) {
        field4784++;
        class231 var3 = this.field4785;
        synchronized (this.field4785) {
            this.field4785.method1603((byte) -105, arg0);
        }
        class231 var4 = this.field4790;
        synchronized (this.field4790) {
            if (arg1 == 64) {
                this.field4790.method1603((byte) -101, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public final void method1914(int arg0) {
        class231 var2 = this.field4785;
        synchronized (this.field4785) {
            this.field4785.method1604(4);
        }
        field4783++;
        if (arg0 > -59) {
            this.field4788 = null;
        }
        class231 var3 = this.field4790;
        synchronized (this.field4790) {
            this.field4790.method1604(4);
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
    public final void method1915(int arg0) {
        field4787++;
        if (arg0 != 64) {
            return;
        }
        class231 var2 = this.field4785;
        synchronized (this.field4785) {
            this.field4785.method1598(-85);
        }
        class231 var3 = this.field4790;
        synchronized (this.field4790) {
            this.field4790.method1598(-89);
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lwv;ILqs;Lqs;)V")
    public class297(class535 arg0, int arg1, class496 arg2, class496 arg3) {
        this.field4789 = arg3;
        this.field4788 = arg2;
        this.field4788.method2940(33, -10511);
    }

    static {
        new class306("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
    }
}
