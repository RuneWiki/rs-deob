import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class436 {

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "I")
    private int field6150;

    @OriginalMember(owner = "client!uaa", name = "l", descriptor = "J")
    private long field6156;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "[I")
    public static int[] field6148 = new int[4];

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "[I")
    public static int[] field6146 = new int[5];

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
    public static int field6145 = 0;

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "Lsb;")
    public static class305 field6151 = new class305(23, 12);

    @OriginalMember(owner = "client!uaa", name = "o", descriptor = "I")
    public static int field6159 = 0;

    @OriginalMember(owner = "client!uaa", name = "n", descriptor = "I")
    public static int field6158 = 0;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!uaa", name = "h", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!uaa", name = "j", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!uaa", name = "m", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "Lho;")
    public static class463 field6153;

    @OriginalMember(owner = "client!uaa", name = "k", descriptor = "Ltf;")
    public static class701 field6155;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)Lij;")
    public final class615 method2500(int arg0, int arg1) {
        field6149++;
        if (arg1 != 0) {
            field6146 = null;
        }
        return class615.method3422(119, this.method2501((byte) -73, arg0));
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BI)I")
    private final int method2501(byte arg0, int arg1) {
        int var3 = 106 % ((arg0 - 21) / 34);
        field6147++;
        return (int) (this.field6156 >> class615.field8668 * arg1) & 0xF;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Lij;I)V")
    private final void method2502(class615 arg0, int arg1) {
        if (arg1 == 0) {
            this.field6156 |= (arg0.field8660 << this.field6150++ * class615.field8668);
            field6157++;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
    public static void method2503(int arg0) {
        field6151 = null;
        field6155 = null;
        if (arg0 <= 4) {
            field6159 = -88;
        }
        field6153 = null;
        field6146 = null;
        field6148 = null;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)I")
    public final int method2504(byte arg0) {
        field6152++;
        int var2 = 49 / ((-arg0 - 89) / 33);
        return this.field6150;
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lij;)V")
    public class436(class615 arg0) {
        this.field6150 = 1;
        this.field6156 = arg0.field8660;
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "([Lij;)V")
    public class436(class615[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method2502(arg0[var2], 0);
        }
    }
}
