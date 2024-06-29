import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class122 {

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "Lag;")
    public class325 field1510 = new class325();

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field1513 = 0;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Lec;")
    public static class40 field1515 = new class40("Loaded input handler", "Eingabeprozedur geladen.", "Gestionnaire de saisie chargé", "Gerenciador de entradas carregado");

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "[I")
    public static int[] field1519 = new int[4096];

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "Lco;")
    public static class210 field1520 = new class210(4);

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field1521 = 0;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "Lag;")
    private class325 field1518;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Lvm;")
    public static class347 field1512;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V", line = 7)
    public final void method586(byte arg0) {
        while (true) {
            class325 var2 = this.field1510.field4684;
            if (this.field1510 == var2) {
                if (arg0 != -122) {
                    return;
                }
                field1516++;
                this.field1518 = null;
                return;
            }
            var2.method1977(true);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)Lag;", line = 37)
    public final class325 method587(byte arg0) {
        field1511++;
        class325 var2 = this.field1518;
        if (this.field1510 == var2) {
            this.field1518 = null;
            return null;
        }
        this.field1518 = var2.field4684;
        if (arg0 < 84) {
            this.field1510 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILag;)V", line = 57)
    public final void method588(int arg0, class325 arg1) {
        if (arg1.field4689 != null) {
            arg1.method1977(true);
        }
        field1509++;
        arg1.field4684 = this.field1510;
        arg1.field4689 = this.field1510.field4689;
        arg1.field4689.field4684 = arg1;
        arg1.field4684.field4689 = arg1;
        if (arg0 != 4096) {
            this.field1510 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V", line = 127)
    public class122() {
        this.field1510.field4684 = this.field1510;
        this.field1510.field4689 = this.field1510;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V", line = 79)
    public static void method589(boolean arg0) {
        field1515 = null;
        field1520 = null;
        field1512 = null;
        if (!arg0) {
            method589(false);
        }
        field1519 = null;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)Lag;", line = 107)
    public final class325 method590(byte arg0) {
        field1514++;
        class325 var2 = this.field1510.field4684;
        if (arg0 > -10) {
            this.method588(-1, (class325) null);
        }
        if (this.field1510 == var2) {
            this.field1518 = null;
            return null;
        } else {
            this.field1518 = var2.field4684;
            return var2;
        }
    }
}
