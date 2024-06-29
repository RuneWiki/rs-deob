import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class417 extends class445 {

    @OriginalMember(owner = "client!qt", name = "K", descriptor = "I")
    public int field5678;

    @OriginalMember(owner = "client!qt", name = "y", descriptor = "I")
    private int field5666;

    @OriginalMember(owner = "client!qt", name = "F", descriptor = "I")
    public int field5673;

    @OriginalMember(owner = "client!qt", name = "G", descriptor = "I")
    private int field5674;

    @OriginalMember(owner = "client!qt", name = "s", descriptor = "I")
    private int field5660;

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "I")
    public int field5667;

    @OriginalMember(owner = "client!qt", name = "t", descriptor = "I")
    private int field5661;

    @OriginalMember(owner = "client!qt", name = "I", descriptor = "I")
    private int field5676;

    @OriginalMember(owner = "client!qt", name = "w", descriptor = "I")
    public int field5664;

    @OriginalMember(owner = "client!qt", name = "E", descriptor = "Z")
    public static boolean field5672 = false;

    @OriginalMember(owner = "client!qt", name = "u", descriptor = "Lgd;")
    public static class206 field5662 = new class206("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!qt", name = "x", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!qt", name = "A", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!qt", name = "B", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!qt", name = "C", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!qt", name = "D", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!qt", name = "H", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!qt", name = "J", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!qt", name = "v", descriptor = "Lr;")
    public static class110 field5663;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II[II)V")
    public final void method2481(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[2] = this.field5678 - (this.field5666 - arg1);
        arg2[1] = arg3 + this.field5664 - this.field5660;
        arg2[0] = 0;
        if (arg0 != 24) {
            this.field5673 = -63;
        }
        field5675++;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIB)Z")
    public final boolean method2482(int arg0, int arg1, byte arg2) {
        if (arg2 != -23) {
            this.method2488(-86, false, -100);
        }
        field5668++;
        return arg1 >= this.field5664 && arg1 <= this.field5673 && this.field5678 <= arg0 && arg0 <= this.field5667;
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(II[II)V")
    public final void method2483(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[arg1] = this.field5674;
        arg2[2] = this.field5666 - (this.field5678 - arg3);
        arg2[1] = this.field5660 + arg0 - this.field5664;
        field5665++;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IILr;)Lne;")
    public static final class191 method2484(int arg0, int arg1, class110 arg2) {
        if (arg1 == -4357) {
            field5671++;
            byte[] var3 = arg2.method695(arg0, arg1 + 4428);
            return var3 == null ? null : new class191(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIB)Z")
    public final boolean method2485(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -62) {
            method2487((class32) null, 9, -23);
        }
        field5669++;
        return this.field5674 == arg0 && arg2 >= this.field5660 && arg2 <= this.field5661 && arg1 >= this.field5666 && this.field5676 >= arg1;
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V")
    public static void method2486(int arg0) {
        field5663 = null;
        field5662 = null;
        if (arg0 != 2) {
            field5662 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lbt;II)V")
    public static final void method2487(class32 arg0, int arg1, int arg2) {
        field5670++;
        if (arg2 != -20206) {
            field5672 = true;
        }
        if (class48.field644 == null) {
            return;
        }
        try {
            class48.field644.method942(0L, (byte) -118);
            class48.field644.method943(19124, arg1, arg0.field472, 24);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(IZI)Z")
    public final boolean method2488(int arg0, boolean arg1, int arg2) {
        field5677++;
        if (arg1) {
            return this.field5660 <= arg2 && arg2 <= this.field5661 && arg0 >= this.field5666 && this.field5676 >= arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field5678 = arg6;
        this.field5666 = arg2;
        this.field5673 = arg7;
        this.field5674 = arg0;
        this.field5660 = arg1;
        this.field5667 = arg8;
        this.field5661 = arg3;
        this.field5676 = arg4;
        this.field5664 = arg5;
    }
}
