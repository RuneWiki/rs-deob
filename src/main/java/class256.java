import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class256 {

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public int field4048 = -1;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "D")
    public static double field4044 = -1.0D;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4046 = "Loading world list data";

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field4051 = 0;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "[I")
    public static int[] field4056 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Lsb;")
    public class126 field4055;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Lnk;")
    public static class16 field4047;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "[I")
    public int[] field4052;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "[Lpa;")
    public static class2[] field4057;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field4043;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "[[B")
    public static byte[][] field4049;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLlf;I)V", line = 14)
    public static final void method1804(byte arg0, class143 arg1, int arg2) {
        if (arg0 != 114) {
            method1806((byte) 77);
        }
        if (class49.field564 != null) {
            try {
                class49.field564.method459(-8874, 0L);
                class49.field564.method464(arg2, 25756, arg1.field2260, 24);
            } catch (Exception var4) {
            }
        }
        field4054++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V", line = 47)
    public static final void method1805(byte arg0) {
        field4053++;
        class245.field3860.method378(0);
        class293.field4614.method378(0);
        class112.field1558.method378(0);
        if (arg0 >= -2) {
            field4051 = 95;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V", line = 72)
    public static void method1806(byte arg0) {
        field4057 = null;
        field4056 = null;
        int var1 = -72 % ((arg0 - 37) / 51);
        field4049 = (byte[][]) null;
        field4046 = null;
        field4047 = null;
    }
}
