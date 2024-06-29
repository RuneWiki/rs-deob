import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class522 {

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "Lki;")
    public class499 field7697 = new class499();

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field7687 = 0;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "Z")
    public static volatile boolean field7695 = false;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "Luf;")
    public static class310 field7684 = new class310(83, 8);

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "Lfg;")
    public static class83 field7700 = new class83("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field7689;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public static int field7690;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    public static int field7691;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public static int field7694;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
    public static int field7696;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "Lki;")
    private class499 field7703;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "[[Lss;")
    public static class295[][] field7701;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)I", line = 4)
    public final int method3064(byte arg0) {
        int var2 = 62 / ((arg0 - 70) / 44);
        field7696++;
        int var3 = 0;
        for (class499 var4 = this.field7697.field7336; var4 != this.field7697; var4 = var4.field7336) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V", line = 24)
    public static void method3065(byte arg0) {
        field7684 = null;
        field7701 = null;
        if (arg0 != 126) {
            method3074(-119, 16, -54);
        }
        field7700 = null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)Lki;", line = 36)
    public final class499 method3066(int arg0) {
        if (arg0 != 2) {
            this.field7703 = null;
        }
        field7693++;
        class499 var2 = this.field7703;
        if (this.field7697 == var2) {
            this.field7703 = null;
            return null;
        } else {
            this.field7703 = var2.field7336;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lwo;I)V", line = 62)
    public final void method3067(class522 arg0, int arg1) {
        this.method3073(arg0, 2, this.field7697.field7336);
        if (arg1 <= 99) {
            this.method3075((byte) 126);
        }
        field7686++;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)Z", line = 75)
    public final boolean method3068(int arg0) {
        field7685++;
        if (arg0 == 83) {
            return this.field7697.field7336 == this.field7697;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lki;I)V", line = 105)
    public final void method3069(class499 arg0, int arg1) {
        field7702++;
        if (arg0.field7339 != null) {
            arg0.method2946(-97);
        }
        if (arg1 != 2) {
            this.method3069(null, 114);
        }
        arg0.field7336 = this.field7697.field7336;
        arg0.field7339 = this.field7697;
        arg0.field7339.field7336 = arg0;
        arg0.field7336.field7339 = arg0;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lki;B)V", line = 125)
    public final void method3070(class499 arg0, byte arg1) {
        if (arg0.field7339 != null) {
            arg0.method2946(-107);
        }
        field7692++;
        arg0.field7339 = this.field7697.field7339;
        if (arg1 < -118) {
            arg0.field7336 = this.field7697;
            arg0.field7339.field7336 = arg0;
            arg0.field7336.field7339 = arg0;
        }
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)Lki;", line = 143)
    public final class499 method3071(byte arg0) {
        field7698++;
        class499 var2 = this.field7697.field7336;
        int var3 = 71 % ((arg0 + 63) / 53);
        if (this.field7697 == var2) {
            return null;
        } else {
            var2.method2946(-103);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(B)Lki;", line = 160)
    public final class499 method3072(byte arg0) {
        field7690++;
        if (arg0 < 10) {
            this.method3075((byte) 6);
        }
        class499 var2 = this.field7697.field7336;
        if (this.field7697 == var2) {
            this.field7703 = null;
            return null;
        } else {
            this.field7703 = var2.field7336;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lwo;ILki;)V", line = 184)
    private final void method3073(class522 arg0, int arg1, class499 arg2) {
        field7689++;
        class499 var4 = this.field7697.field7339;
        this.field7697.field7339 = arg2.field7339;
        arg2.field7339.field7336 = this.field7697;
        if (arg1 == 2 && this.field7697 != arg2) {
            arg2.field7339 = arg0.field7697.field7339;
            arg2.field7339.field7336 = arg2;
            var4.field7336 = arg0.field7697;
            arg0.field7697.field7339 = var4;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)I", line = 209)
    public static final int method3074(int arg0, int arg1, int arg2) {
        field7688++;
        if (arg0 != 0) {
            return -88;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(B)Lki;", line = 229)
    public final class499 method3075(byte arg0) {
        int var2 = 92 % ((arg0 - 3) / 43);
        field7691++;
        class499 var3 = this.field7703;
        if (this.field7697 == var3) {
            this.field7703 = null;
            return null;
        } else {
            this.field7703 = var3.field7339;
            return var3;
        }
    }

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "(B)V", line = 257)
    public final void method3076(byte arg0) {
        if (arg0 != -89) {
            this.field7703 = null;
        }
        field7699++;
        while (true) {
            class499 var2 = this.field7697.field7336;
            if (this.field7697 == var2) {
                this.field7703 = null;
                return;
            }
            var2.method2946(-126);
        }
    }

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "(B)Lki;", line = 283)
    public final class499 method3077(byte arg0) {
        field7694++;
        class499 var2 = this.field7697.field7339;
        if (this.field7697 == var2) {
            this.field7703 = null;
            return null;
        }
        if (arg0 >= -53) {
            this.method3073(null, -107, null);
        }
        this.field7703 = var2.field7339;
        return var2;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V", line = 306)
    public class522() {
        this.field7697.field7336 = this.field7697;
        this.field7697.field7339 = this.field7697;
    }
}
