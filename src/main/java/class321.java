import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public abstract class class321 {

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "Lsh;")
    public static class472 field4795;

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "Lct;")
    public static class285 field4797;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)Z")
    public abstract boolean method1972(int arg0);

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)V")
    public static final void method1973(int arg0, byte arg1) {
        class3.method26((byte) 91);
        field4790++;
        int var2 = class156.field2167.method918(arg0, 101).field4458;
        if (arg1 != 25 || var2 == 0) {
            return;
        }
        int var3 = class315.field4736.field62[arg0];
        if (var2 == 6) {
            class479.field6740 = var3;
        }
        if (var2 == 5) {
            class358.field5435 = var3;
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)V")
    public abstract void method1974(int arg0);

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)I")
    public abstract int method1975(int arg0);

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)Lfl;")
    public abstract class131 method1976(int arg0);

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)Z")
    public final boolean method1977(byte arg0) {
        if (arg0 <= 122) {
            field4796 = 123;
        }
        field4791++;
        return this.method1972(6) || this.method1982((byte) -98) || this.method1978(2);
    }

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "(I)Z")
    public abstract boolean method1978(int arg0);

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)I")
    public static final int method1979(byte arg0) {
        field4793++;
        int var1 = -38 / ((arg0 - 37) / 59);
        return 16;
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(B)I")
    public static final int method1980(byte arg0) {
        int var1 = 90 % ((70 - arg0) / 37);
        field4792++;
        class400 var2 = class269.field3975;
        synchronized (class269.field3975) {
            return class269.field3975.method2387(false);
        }
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(B)V")
    public static void method1981(byte arg0) {
        field4795 = null;
        if (arg0 < 32) {
            field4797 = null;
        }
        field4797 = null;
    }

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "(B)Z")
    public abstract boolean method1982(byte arg0);

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "(I)V")
    public abstract void method1983(int arg0);

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "(B)I")
    public abstract int method1984(byte arg0);

    static {
        new class332("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field4796 = 0;
        field4795 = new class472(14, 6);
        field4797 = new class285(2, 3);
    }
}
