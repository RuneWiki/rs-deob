import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class150 extends class210 {

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "Ljd;")
    private static class92 field2969 = class202.method1325((byte) 90, "wave:");

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "Ljd;")
    public static class92 field2973 = field2969;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field2971 = 0;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "Ljd;")
    public static class92 field2976 = field2969;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "Loe;")
    public static class139 field2979 = new class139(5);

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "Ljd;")
    private static class92 field2981 = class202.method1325((byte) 90, "Loaded fonts");

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "Ljd;")
    public static class92 field2984 = field2981;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "Ljd;")
    public static class92 field2982 = class202.method1325((byte) 90, " ");

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public int field2970;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "Lla;")
    public class108 field2975;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "Llh;")
    public static class115 field2983;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "Lud;")
    public class192 field2977;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "[B")
    public byte[] field2974;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method968(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class10.field359[0].method1145(arg3, arg1);
        field2978++;
        class10.field359[1].method1145(arg3, arg1 + arg0 - 16);
        int var6 = (arg0 - 32) * arg0 / arg2;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg0 - var6 - 32) * arg4 / (arg2 - arg0);
        class163.method1049(arg3, arg1 + 16, 16, arg0 - 32, class75.field1565);
        class163.method1049(arg3, arg1 + var7 + 16, 16, var6, class129.field2588);
        class163.method1045(arg3, arg1 + var7 + 16, var6, class197.field3837);
        class163.method1045(arg3 + 1, var7 + 16 + arg1, var6, class197.field3837);
        class163.method1043(arg3, arg1 + var7 + 16, 16, class197.field3837);
        class163.method1043(arg3, var7 + arg1 + 17, 16, class197.field3837);
        class163.method1045(arg3 + 15, arg1 + var7 - -16, var6, class146.field2906);
        class163.method1045(arg3 + 14, 17 - -var7 + arg1, var6 - 1, class146.field2906);
        class163.method1043(arg3, arg1 + var7 + var6 + 15, 16, class146.field2906);
        if (arg5) {
            field2984 = null;
        }
        class163.method1043(arg3 + 1, var6 + var7 + arg1 + 14, 15, class146.field2906);
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
    public static void method969(int arg0) {
        field2982 = null;
        field2969 = null;
        field2979 = null;
        field2983 = null;
        field2976 = null;
        field2973 = null;
        field2981 = null;
        if (arg0 == -15) {
            field2984 = null;
        }
    }
}
