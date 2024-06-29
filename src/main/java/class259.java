import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class259 extends class110 {

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field3941 = 0;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "[[[I")
    public static int[][][] field3943 = new int[4][13][13];

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    public static int field3944 = 0;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "Lea;")
    public static class235 field3942;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V", line = 4)
    public static void method1760(byte arg0) {
        if (arg0 < -21) {
            field3942 = null;
            field3943 = (int[][][]) null;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V", line = 17)
    public class259() {
        super(0, true);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Llm;Llm;ILlm;Llm;)V", line = 21)
    public static final void method1761(class210 arg0, class210 arg1, int arg2, class210 arg3, class210 arg4) {
        class115.field1764 = arg4;
        field3940++;
        class138.field2094 = arg3;
        if (arg2 != -18124) {
            field3943 = (int[][][]) ((int[][][]) null);
        }
        class120.field1882 = arg1;
        class318.field4786 = arg0;
        class278.field4231 = new class329[class138.field2094.method1445(-17371)][];
        class44.field560 = new boolean[class138.field2094.method1445(-17371)];
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[I", line = 41)
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 1) {
            field3944 = -71;
        }
        field3939++;
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            class85.method592(var3, 0, class124.field1936, class177.field2615[arg1]);
        }
        return var3;
    }
}
