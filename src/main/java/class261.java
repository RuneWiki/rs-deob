import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class261 {

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field3961 = 500;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "[C")
    public static char[] field3964 = new char[128];

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)V")
    public static final void method1746(int arg0, byte arg1) {
        class123.field1859 = 20;
        class129.field1927 = arg0;
        field3963++;
        class143.field2096 = 3;
        if (arg1 < 40) {
            method1749((byte) 71, -92);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III[B)I")
    public static final int method1747(int arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = -1;
        field3960++;
        int var5 = 122 / ((54 - arg2) / 56);
        for (int var6 = arg1; var6 < arg0; var6++) {
            var4 = class213.field3181[(arg3[var6] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method1748(int arg0) {
        field3964 = null;
        if (arg0 >= -11) {
            method1747(112, -127, -102, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)V")
    public static final void method1749(byte arg0, int arg1) {
        class3.field51 = arg1;
        class146.field2137 = -1;
        if (arg0 < 109) {
            field3964 = null;
        }
        class61.field973 = -1;
        field3959++;
        class282.method1860(1);
    }
}
