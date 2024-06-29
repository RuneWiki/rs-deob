import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class455 extends class150 {

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "[[I")
    public static int[][] field5824 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "[Lwda;")
    public static class251[] field5825;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIII)Z", line = 5)
    public static final boolean method2433(int arg0, int arg1, int arg2, int arg3) {
        field5826++;
        if (!class68.field926) {
            return false;
        } else if (class160.field2109 < 100) {
            return false;
        } else {
            int var4 = class359.field4578[arg0][arg1][arg3];
            if (-class546.field7270 == var4) {
                return false;
            } else if (class546.field7270 == var4) {
                return true;
            } else if (class699.field9887 == class491.field6485) {
                return false;
            } else {
                int var5 = arg1 << class52.field775;
                int var6 = arg3 << class52.field775;
                if (class430.method2271(class491.field6485[arg0].method1562(arg3 + 1, (byte) 51, arg1), class491.field6485[arg0].method1562(arg3 + 1, (byte) 51, arg1 + 1), class702.field9928 + var6 - 1, 26403, var6 + 1, var6 - (-class702.field9928 - -1), class702.field9928 + var5 - 1, class491.field6485[arg0].method1562(arg3, (byte) 51, arg1), var5 + 1, var5 - arg2) && class430.method2271(class491.field6485[arg0].method1562(arg3 + 1, (byte) 51, arg1 + 1), class491.field6485[arg0].method1562(arg3, (byte) 51, arg1 + 1), var6 + class702.field9928 - 1, 26403, var6 + 1, var6 + 1, class702.field9928 + var5 - 1, class491.field6485[arg0].method1562(arg3, (byte) 51, arg1), class702.field9928 + var5 - 1, var5 + 1)) {
                    class352.field4496++;
                    class359.field4578[arg0][arg1][arg3] = class546.field7270;
                    return true;
                } else {
                    class359.field4578[arg0][arg1][arg3] = -class546.field7270;
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lww;B)Z", line = 48)
    public static final boolean method2434(class647 arg0, byte arg1) {
        field5823++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field9090) {
            return false;
        } else if (arg0.method3617(class656.field9241, false)) {
            if (arg1 >= -42) {
                field5825 = null;
            }
            if (class175.field2268.method399(-32748, (long) arg0.field9122) == null) {
                return class227.field2834.method399(-32748, (long) arg0.field9118) == null;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BLes;)Lsl;", line = 78)
    public static final class605 method2435(byte arg0, class630 arg1) {
        field5827++;
        int var2 = 19 / ((arg0 - 54) / 55);
        return new class605(arg1.method3510(116), arg1.method3510(32), arg1.method3510(82), arg1.method3510(103), arg1.method3510(117), arg1.method3510(48), arg1.method3510(42), arg1.method3510(36), arg1.method3517(-1), arg1.method3501(-9268));
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V", line = 97)
    public static void method2436(int arg0) {
        field5824 = null;
        field5825 = null;
        if (arg0 != -1) {
            method2433(-5, -98, -110, -35);
        }
    }
}
