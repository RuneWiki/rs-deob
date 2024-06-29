import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class487 extends class10 {

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "[I")
    public int[] field7124;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "[I")
    public int[] field7123;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "Lqp;")
    public static class466 field7125 = new class466("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
    public static int field7127 = 52;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "Lwj;")
    public static class270 field7126 = new class270(63, -1);

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "Ldi;")
    public static class83 field7128 = new class83(25, 7);

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "Lwj;")
    public static class270 field7129 = new class270(70, -1);

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "[I")
    public static int[] field7131 = new int[5];

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "[I")
    public static int[] field7130;

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(II[I[I)V")
    public class487(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field7124 = arg3;
        this.field7123 = arg2;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)V")
    public static void method2860(byte arg0) {
        field7130 = null;
        field7126 = null;
        field7125 = null;
        if (arg0 > -27) {
            method2860((byte) 106);
        }
        field7128 = null;
        field7131 = null;
        field7129 = null;
    }
}
