import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class456 implements class217 {

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public int field6682;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "Luv;")
    public static class2 field6683 = new class2(105, -1);

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "[I")
    public static int[] field6686 = new int[1];

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field6685;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "Ll;")
    public static class127 field6687;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "[Ll;")
    public static class127[] field6688;

    @OriginalMember(owner = "client!sl", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field6685++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBI)I", line = 18)
    public static final int method2650(int arg0, byte arg1, int arg2) {
        field6684++;
        int var3 = 55 / ((arg1 + 71) / 43);
        int var4 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var4 = arg0 * var4;
            }
            arg2 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg2 == 1) {
            return arg0 * var4;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 44)
    public static void method2651(int arg0) {
        if (arg0 == 23195) {
            field6687 = null;
            field6683 = null;
            field6686 = null;
            field6688 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 63)
    public class456(String arg0, int arg1) {
        this.field6682 = arg1;
    }
}
