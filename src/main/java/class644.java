import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class644 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "[S")
    private static short[] field9059 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Z")
    public static boolean field9061 = false;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "[S")
    private static short[] field9063 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "[S")
    private static short[] field9067 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "[S")
    private static short[] field9068 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "[[S")
    public static short[][] field9066 = new short[][] { field9068, field9063, field9067, field9059 };

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field9062;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "[Lqda;")
    public static class112[] field9064;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)I")
    public static final int method3680(int arg0) {
        if (arg0 <= 22) {
            return 86;
        } else {
            field9065++;
            return class463.field6612 == 1 ? class212.field3070 : class333.field4974;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lts;I)V")
    public static final void method3681(class559 arg0, int arg1) {
        if (arg1 < 15) {
            return;
        }
        field9060++;
        class315 var2 = (class315) class649.field9134.method380((byte) -3, (long) arg0.field6361);
        if (var2 == null) {
            return;
        }
        if (var2.field4688 != null) {
            class229.field3307.method3439(var2.field4688);
            var2.field4688 = null;
        }
        var2.method3117((byte) -99);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
    public static void method3682(byte arg0) {
        field9064 = null;
        field9068 = null;
        field9067 = null;
        field9066 = null;
        field9063 = null;
        if (arg0 == -6) {
            field9059 = null;
        }
    }
}
