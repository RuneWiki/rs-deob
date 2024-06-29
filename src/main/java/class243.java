import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class243 implements class104 {

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "Lffa;")
    public class562 field3257;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "Loca;")
    public class573 field3261;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public int field3258;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public int field3259;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public int field3262;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "[I")
    public static int[] field3256 = new int[25];

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Lej;")
    public static class694 field3260 = new class694();

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "[I")
    public static int[] field3264 = new int[1];

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V", line = 12)
    public static void method1524(byte arg0) {
        field3264 = null;
        field3260 = null;
        if (arg0 != -80) {
            method1524((byte) 94);
        }
        field3256 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)Lfl;", line = 32)
    public class103 method318(int arg0) {
        field3263++;
        return arg0 == -26207 ? class549.field7128 : null;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(ILffa;Loca;II)V", line = 42)
    public class243(int arg0, class562 arg1, class573 arg2, int arg3, int arg4) {
        this.field3257 = arg1;
        this.field3261 = arg2;
        this.field3258 = arg3;
        this.field3259 = arg0;
        this.field3262 = arg4;
    }
}
