import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class164 {

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "J")
    public static long field2541 = 0L;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "D")
    public static double field2539 = -1.0D;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Ljf;")
    public static class216 field2542 = new class216(64);

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field2544 = 0;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static void method1131(int arg0) {
        int var1 = -6 % ((arg0 + 56) / 39);
        field2542 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)I")
    public static final int method1132(int arg0, int arg1) {
        if (arg0 < 45) {
            return -122;
        }
        int var2 = arg1 >>> 1;
        field2543++;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLvl;)V")
    public static final void method1133(byte arg0, class73 arg1) {
        class232.field3754 = arg1;
        field2540++;
        if (arg0 != 114) {
            field2539 = 1.1462488201618948D;
        }
    }
}
