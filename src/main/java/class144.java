import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class144 {

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "J")
    public long field2683 = 0L;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "J")
    public static long field2688 = 0L;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    public static volatile int field2696 = 0;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "F")
    public static float field2687;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public int field2681;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public int field2684;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public int field2691;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public int field2692;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "I")
    public int field2697;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "Loe;")
    public static class108 field2686;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Ldk;")
    public class179 field2682;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "Ldk;")
    public class179 field2694;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)I")
    public static int method992(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V")
    public static void method993(boolean arg0) {
        field2686 = null;
        if (arg0) {
            method994(-46, 82, -50, -104, 10, -87, -97, 99, -67);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method994(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2685++;
        int var9 = arg2 - arg6;
        int var10 = 62 / ((20 - arg1) / 50);
        int var11 = arg4 - arg3;
        int var12 = (arg7 - arg0 << 16) / var9;
        int var13 = (arg5 - arg8 << 16) / var11;
        class174.method1143(0, arg0, arg3, var13, arg8, 0, -121, arg4, arg2, arg6, var12);
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(II)I")
    public static final int method995(int arg0, int arg1) {
        if (arg1 < 88) {
            field2696 = -37;
        }
        field2693++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILgk;)Lvf;")
    public static final class265 method996(int arg0, int arg1, class6 arg2) {
        field2695++;
        if (arg1 != 23332) {
            return null;
        } else if (!class236.method1577(32, arg0, client.method1474(arg2)) && arg2.field166 == null) {
            return null;
        } else if (arg2.field228 == null || arg2.field228.length <= arg0 || arg2.field228[arg0] == null || arg2.field228[arg0].method1781(arg1 + 7266).method1808((byte) -15) == 0) {
            return class267.field4710 ? class148.method1022(10, new class265[] { class94.field1670, class241.method1609(true, arg0) }) : null;
        } else {
            return arg2.field228[arg0];
        }
    }
}
