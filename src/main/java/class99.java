import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class99 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "[I")
    public static int[] field1032 = new int[5];

    @OriginalMember(owner = "client!al", name = "c", descriptor = "Lnb;")
    public static class301 field1034 = null;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field1035 = -1;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "J")
    public static long field1036;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BI)I")
    public static final int method688(byte arg0, int arg1) {
        if (arg0 != -52) {
            method688((byte) -19, -117);
        }
        field1033++;
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public static void method689(int arg0) {
        field1034 = null;
        if (arg0 != -6410) {
            method689(-75);
        }
        field1032 = null;
    }
}
