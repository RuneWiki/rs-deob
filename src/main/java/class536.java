import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class536 {

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "[I")
    public static int[] field7678 = new int[1000];

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "I")
    public int field7674;

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
    public int field7675;

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "I")
    public static int field7676;

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "I")
    public int field7677;

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "I")
    public int field7679;

    @OriginalMember(owner = "client!rba", name = "g", descriptor = "I")
    public int field7680;

    @OriginalMember(owner = "client!rba", name = "h", descriptor = "I")
    public int field7681;

    @OriginalMember(owner = "client!rba", name = "i", descriptor = "I")
    public int field7682;

    @OriginalMember(owner = "client!rba", name = "j", descriptor = "I")
    public int field7683;

    @OriginalMember(owner = "client!rba", name = "l", descriptor = "I")
    public int field7685;

    @OriginalMember(owner = "client!rba", name = "m", descriptor = "I")
    public int field7686;

    @OriginalMember(owner = "client!rba", name = "n", descriptor = "I")
    public int field7687;

    @OriginalMember(owner = "client!rba", name = "o", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!rba", name = "p", descriptor = "I")
    public int field7689;

    @OriginalMember(owner = "client!rba", name = "k", descriptor = "Lcu;")
    public static class200 field7684;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lrba;I)Z")
    public final boolean method3156(class536 arg0, int arg1) {
        field7688++;
        if (arg1 == 1000) {
            return this.field7674 == arg0.field7674 && this.field7677 == arg0.field7677 && this.field7679 == arg0.field7679;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)V")
    public static void method3157(byte arg0) {
        field7678 = null;
        if (arg0 < 46) {
            method3157((byte) 50);
        }
        field7684 = null;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "([[II)V")
    public static final void method3158(int[][] arg0, int arg1) {
        class77.field1131 = arg0;
        field7676++;
        if (arg1 >= -63) {
            method3158(null, 1);
        }
    }
}
