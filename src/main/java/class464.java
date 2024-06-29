import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class464 extends class381 {

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Liba;")
    public static class211 field6679 = new class211(62, 11);

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public int field6677;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public int field6678;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public int field6682;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public int field6683;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public int field6685;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public int field6686;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public int field6687;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public int field6688;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public int field6689;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public int field6690;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public int field6692;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public int field6693;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public int field6695;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    public int field6696;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public int field6697;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
    public int field6703;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    public int field6704;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "Luw;")
    public class12 field6691;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "Lcc;")
    public static class165 field6701;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Lwm;")
    public class396 field6684;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "Ldb;")
    public class91 field6681;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "Llca;")
    public class93 field6702;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "[I")
    public static int[] field6680;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "[I")
    public static int[] field6699;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "[I")
    public static int[] field6700;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public final void method2690(int arg0) {
        this.field6684 = null;
        if (arg0 != 8) {
            this.method2690(-56);
        }
        this.field6691 = null;
        this.field6681 = null;
        field6698++;
        this.field6702 = null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public static void method2691(int arg0) {
        field6700 = null;
        field6680 = null;
        field6701 = null;
        if (arg0 != -1) {
            field6699 = null;
        }
        field6699 = null;
        field6679 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BIII)I")
    public static final int method2692(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 20) {
            field6701 = null;
        }
        field6694++;
        if ((class317.field4622[arg1][arg3][arg2] & 0x8) == 0) {
            return arg1 <= 0 || (class317.field4622[1][arg3][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }
}
