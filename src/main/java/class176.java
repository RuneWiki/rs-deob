import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class176 {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field2818 = 0;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "[I")
    public static int[] field2821 = new int[14];

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V", line = 11)
    public static void method1327(byte arg0) {
        field2821 = null;
        int var1 = 23 / ((arg0 + 31) / 35);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I", line = 20)
    public static final int method1328(int arg0, int arg1) {
        field2820++;
        if (arg1 != -5459) {
            method1327((byte) -27);
        }
        return arg0 >>> 8;
    }
}
