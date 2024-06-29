import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class344 {

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public int field5143;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "[I")
    public int[] field5148;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "[I")
    public int[] field5149;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "[I")
    public static int[] field5141 = new int[500];

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field5144 = 0;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field5145 = 0;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field5142 = 0;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 4)
    public static void method2162(int arg0) {
        if (arg0 == 0) {
            field5141 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)B", line = 20)
    public static final byte method2163(int arg0, int arg1, int arg2) {
        if (arg0 != 15565) {
            return -28;
        }
        field5147++;
        if (arg1 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(I)V", line = 57)
    public class344(int arg0) {
        this.field5143 = arg0;
        this.field5148 = new int[this.field5143];
        this.field5149 = new int[this.field5143];
    }
}
