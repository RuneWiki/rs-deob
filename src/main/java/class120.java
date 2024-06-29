import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class120 {

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field2137 = -1;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "[Lfb;")
    public static class68[] field2140 = new class68[8];

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public int field2128;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public int field2129;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public int field2130;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public int field2133;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public int field2134;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public int field2138;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public int field2141;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "[B")
    public byte[] field2132;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "[B")
    public byte[] field2139;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "[[[I")
    public static int[][][] field2136;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)I", line = 17)
    public static final int method873(int arg0, int arg1) {
        field2131++;
        if (arg0 != 8) {
            method874((byte) 68);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)I", line = 40)
    public static final int method874(byte arg0) {
        field2135++;
        if (arg0 > -49) {
            method876((byte) 93, -128);
        }
        return class235.field3855;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 52)
    public static void method875(int arg0) {
        if (arg0 >= 85) {
            field2140 = null;
            field2136 = (int[][][]) null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)V", line = 63)
    public static final void method876(byte arg0, int arg1) {
        field2142++;
        class292.field4729.method896(arg1, (byte) -48);
        int var2 = -92 % ((-arg0 - 26) / 34);
        class200.field3357.method896(arg1, (byte) -47);
        class11.field352.method896(arg1, (byte) -100);
    }
}
