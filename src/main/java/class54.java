import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class54 {

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "Z")
    public boolean field840 = false;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public int field839 = 64;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public int field846 = 64;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public int field847 = 1;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public int field843 = 2;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "Z")
    public boolean field844 = false;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public int field845 = -1;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "Lml;")
    public static class263 field838;

    static {
        new class475(" days.", " Tage.", " jours.", " dias.");
        new class475("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILdh;I)V", line = 18)
    public final void method330(int arg0, class209 arg1, int arg2) {
        if (arg2 >= -16) {
            return;
        }
        while (true) {
            int var4 = arg1.method1428(32122);
            if (var4 == 0) {
                field842++;
                return;
            }
            this.method332(arg1, var4, arg0, 7);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 41)
    public static void method331(int arg0) {
        if (arg0 != -1) {
            field838 = null;
        }
        field838 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ldh;III)V", line = 51)
    private final void method332(class209 arg0, int arg1, int arg2, int arg3) {
        field841++;
        if (arg3 != 7) {
            return;
        }
        if (arg1 == 1) {
            this.field845 = arg0.method1450((byte) 107);
            if (this.field845 == 65535) {
                this.field845 = -1;
            }
        } else if (arg1 == 2) {
            this.field839 = arg0.method1450((byte) 124) + 1;
            this.field846 = arg0.method1450((byte) 82) + 1;
        } else if (arg1 == 3) {
            arg0.method1417(false);
        } else if (arg1 == 4) {
            this.field843 = arg0.method1428(32122);
        } else if (arg1 == 5) {
            this.field847 = arg0.method1428(32122);
        } else if (arg1 == 6) {
            this.field844 = true;
            return;
        } else if (arg1 == 7) {
            this.field840 = true;
            return;
        }
    }
}
