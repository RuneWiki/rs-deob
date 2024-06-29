import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class349 extends class176 {

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "Lej;")
    public static class104 field4686 = new class104("Loaded JAGGL", "JAGGL geladen", "JAGGL chargé", "JAGGL carregado");

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "[Lbea;")
    public static class188[] field4696;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "Ldv;")
    public static class566 field4694;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "Lml;")
    public static class325 field4698;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public int field4674;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public int field4675;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public int field4676;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
    public int field4677;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    public int field4678;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    public int field4681;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    public int field4682;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    public int field4683;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    public int field4687;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
    public int field4688;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public int field4690;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public int field4691;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public int field4692;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public int field4693;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public int field4695;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public int field4697;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    public int field4699;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "Lvn;")
    public class260 field4689;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "Ltaa;")
    public class345 field4673;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "Lke;")
    public class514 field4685;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "Lil;")
    public class7 field4680;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIB)V")
    public static final void method2098(int arg0, int arg1, byte arg2) {
        field4679++;
        if (arg2 < 114) {
            field4698 = null;
        }
        if (class37.field767 == class163.field2363) {
            if (!class45.method433(1, arg0, -2, arg1, 0, 81, false, 0, 1)) {
                class45.method433(1, arg0, -3, arg1, 0, -105, false, 0, 1);
            }
        } else if (!class45.method433(1, arg0, -3, arg1, 0, 59, false, 0, 1)) {
            class45.method433(1, arg0, -2, arg1, 0, -118, false, 0, 1);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static void method2099(int arg0) {
        field4696 = null;
        field4694 = null;
        field4698 = null;
        if (arg0 != 0) {
            method2099(-20);
        }
        field4686 = null;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public final void method2100(int arg0) {
        if (arg0 < 31) {
            this.field4676 = -45;
        }
        this.field4680 = null;
        this.field4685 = null;
        this.field4689 = null;
        this.field4673 = null;
        field4700++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZI)V")
    public static final void method2101(int arg0, boolean arg1, int arg2) {
        field4684++;
        if (arg1) {
            field4694 = null;
        }
        class314 var3 = class483.method2819(15, 0, 21303);
        var3.method1959(19793);
        var3.field4230 = arg2;
        var3.field4227 = arg0;
    }

    static {
        new class104("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field4696 = new class188[2048];
        field4694 = new class566(82, 4);
        field4698 = new class325(3, 14);
    }
}
