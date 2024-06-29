import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class140 extends class145 {

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "[I")
    public static int[] field2396 = new int[1000];

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "Lmh;")
    public static class128 field2393 = class22.method156(125, "Titelbild ge-Offnet)3");

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "Lmh;")
    public static class128 field2398 = null;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "Lmh;")
    public static class128 field2395 = class22.method156(125, "showVideoAd");

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "Lmh;")
    public static class128 field2406 = class22.method156(123, ")4l=");

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "I")
    public static int field2403 = 0;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "Lmh;")
    public static class128 field2404 = class22.method156(125, "null");

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "[Lcf;")
    public static class123[] field2405 = new class123[2048];

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "Lmh;")
    public class128 field2401;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "Lmh;")
    public class128 field2407;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)Ltd;", line = 5)
    public final class230 method919(byte arg0) {
        int var2 = -128 % ((56 - arg0) / 59);
        field2399++;
        return class3.field60[this.field2494];
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)I", line = 17)
    public static final int method920(int arg0, int arg1, int arg2, int arg3) {
        field2394++;
        int var4 = arg0 & 0x3;
        if (arg3 != 1) {
            return 22;
        } else if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V", line = 59)
    public static void method921(int arg0) {
        field2398 = null;
        int var1 = -87 % ((-arg0 - 66) / 53);
        field2396 = null;
        field2395 = null;
        field2404 = null;
        field2393 = null;
        field2405 = null;
        field2406 = null;
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V", line = 95)
    public static final void method922(int arg0) {
        field2402++;
        class263.field4567.method1159(arg0 ^ 0x69);
        class20.field537 = null;
        class52.field1023 = arg0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZIIIILdj;)V", line = 113)
    public static final void method923(boolean arg0, int arg1, int arg2, int arg3, int arg4, class314 arg5) {
        class194.field3347 = arg1;
        class134.field2332 = arg3;
        class52.field1023 = 1;
        class20.field537 = arg5;
        class20.field540 = arg4;
        int var6 = -19 / ((arg2 - 13) / 57);
        class75.field1406 = 10000;
        field2400++;
        class106.field1809 = arg0;
    }
}
