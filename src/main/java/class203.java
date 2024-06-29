import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class203 extends class622 {

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "I")
    public static int field2864 = -1;

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "[I")
    public static int[] field2860 = new int[6];

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method1327(byte arg0, int arg1) {
        field2861++;
        class569.method3263(class65.field800.method555(class697.field9900, true), 4, arg1);
        if (arg0 != 63) {
            field2862 = -116;
        }
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)V", line = 23)
    public static void method1328(int arg0) {
        field2860 = null;
        if (arg0 != 6) {
            method1327((byte) -4, -110);
        }
    }
}
