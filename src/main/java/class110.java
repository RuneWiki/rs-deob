import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class110 {

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field2098 = 0;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Lhj;")
    public static class69 field2099 = class181.method1318("welle2:", (byte) -120);

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "S")
    public static short field2103 = 32767;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field2093 = 0;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Lnc;")
    public static class83 field2095;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "Lnc;")
    public static class83 field2100;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBI)I")
    public static final int method824(int arg0, byte arg1, int arg2) {
        field2094++;
        int var3 = -36 % ((arg1 - 59) / 55);
        int var4 = 0;
        while (arg0 > 0) {
            arg0--;
            var4 = var4 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
        }
        return var4;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILhj;)I")
    public static final int method825(int arg0, class69 arg1) {
        field2097++;
        int var2 = 45 / ((arg0 + 79) / 42);
        return arg1.method441((byte) 73) + 1;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static void method826(byte arg0) {
        field2095 = null;
        field2099 = null;
        field2100 = null;
        if (arg0 != 125) {
            field2099 = null;
        }
    }
}
