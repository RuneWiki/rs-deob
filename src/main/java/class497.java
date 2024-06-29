import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class497 implements class196 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public int field6754;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public int field6760;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Lma;")
    public class12 field6763;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public int field6759;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public int field6764;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public int field6757;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public int field6765;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Lor;")
    public class594 field6762;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public int field6758;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "[I")
    public static int[] field6755 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "[Li;")
    public static class37[] field6766;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "[[[Z")
    public static boolean[][][] field6756;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 19)
    public static void method2794(byte arg0) {
        field6755 = null;
        if (arg0 <= 114) {
            method2794((byte) 78);
        }
        field6756 = null;
        field6766 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Loh;", line = 31)
    public class370 method640(int arg0) {
        if (arg0 == 58) {
            field6761++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lor;Lma;IIIIIII)V", line = 44)
    public class497(class594 arg0, class12 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field6754 = arg3;
        this.field6760 = arg6;
        this.field6763 = arg1;
        this.field6759 = arg7;
        this.field6764 = arg4;
        this.field6757 = arg5;
        this.field6765 = arg2;
        this.field6762 = arg0;
        this.field6758 = arg8;
    }
}
