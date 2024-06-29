import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class498 extends class56 implements class43 {

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    private int field7301;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Lpu;")
    public static class411 field7302 = new class411();

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Lfr;")
    public static class231 field7308 = new class231(8);

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Llo;")
    public static class306 field7311;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static void method2952(int arg0) {
        field7302 = null;
        field7311 = null;
        field7308 = null;
        if (arg0 != -27605) {
            method2952(-24);
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lih;I[BI)V")
    public class498(class214 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field7301 = arg1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[BI)V")
    public final void method314(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field7309;
        this.method389(arg2, arg3);
        if (arg1 < 58) {
            this.method313(125);
        }
        this.field7301 = arg0;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)I")
    public final int method316(byte arg0) {
        ++field7305;
        if (arg0 > -106) {
            this.method316((byte) -38);
        }
        return this.field7301;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)I")
    public final int method315(byte arg0) {
        ++field7306;
        return arg0 != -21 ? -40 : 0;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILec;I)V")
    public static final void method2953(int arg0, int arg1, class68 arg2, int arg3) {
        class140.field2329 = arg0;
        ++field7304;
        if (arg1 > 107) {
            class108.field1935 = arg2;
            class155.field2513 = arg3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)J")
    public final long method313(int arg0) {
        ++field7303;
        return arg0 != -4241 ? -72L : super.field893.method94();
    }

    static {
        new class306("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field7311 = new class306("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");
    }
}
