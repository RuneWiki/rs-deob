import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class class43 {

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field706 = 50;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "[Lub;")
    public static class227[] field704 = new class227[field706];

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "[I")
    public static int[] field707 = new int[field706];

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "[I")
    public static int[] field712 = new int[field706];

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "[I")
    public static int[] field709 = new int[field706];

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Lub;")
    public static class227 field705 = class257.method1749("Cabbage", 17263);

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "[I")
    public static int[] field708 = new int[field706];

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "[I")
    public static int[] field715 = new int[field706];

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Lub;")
    public static class227 field714 = class257.method1749("gelb:", 17263);

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Lub;")
    public static class227 field710 = class257.method1749("Konfig geladen)3", 17263);

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field722 = 0;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Lub;")
    public static class227 field711 = class257.method1749("::rect_debug", 17263);

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "[I")
    public static int[] field720 = new int[field706];

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "[I")
    public static int[] field724 = new int[field706];

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "[I")
    public static int[] field716;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ln;Ln;I)V")
    public static final void method229(class138 arg0, class138 arg1, int arg2) {
        field703++;
        class230.field4024 = arg1;
        class252.field4367 = arg0;
        if (arg2 != 2) {
            method229((class138) null, (class138) null, -105);
        }
        class173.field2886 = class252.field4367.method875(arg2 - 4, 3);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIZ)Lub;")
    public static final class227 method230(int arg0, int arg1, boolean arg2) {
        field719++;
        return arg0 == -8650 ? class249.method1667(10, arg1, arg2, -67) : null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V")
    public static final void method231(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0;
        int var6 = 0;
        field718++;
        int var7 = -arg0;
        int var8 = class23.method111(arg0 + arg3, class125.field2234, class19.field331, arg4 ^ arg4);
        int var9 = -1;
        int var10 = class23.method111(arg3 - arg0, class125.field2234, class19.field331, 0);
        class246.method1644(arg2, class59.field1094[arg1], var8, var10, arg4 ^ 0x3);
        while (var6 < var5) {
            var9 += 2;
            var7 += var9;
            if (var7 > 0) {
                var5--;
                var7 -= var5 << 1;
                int var11 = arg1 + var5;
                int var12 = arg1 - var5;
                if (var11 >= class161.field2718 && class46.field817 >= var12) {
                    int var13 = class23.method111(arg3 + var6, class125.field2234, class19.field331, arg4 ^ 0x2);
                    int var14 = class23.method111(arg3 - var6, class125.field2234, class19.field331, 0);
                    if (class46.field817 >= var11) {
                        class246.method1644(arg2, class59.field1094[var11], var13, var14, 1);
                    }
                    if (var12 >= class161.field2718) {
                        class246.method1644(arg2, class59.field1094[var12], var13, var14, arg4 - 1);
                    }
                }
            }
            var6++;
            int var15 = arg1 - var6;
            int var16 = arg1 + var6;
            if (var16 >= class161.field2718 && class46.field817 >= var15) {
                int var17 = class23.method111(arg3 + var5, class125.field2234, class19.field331, arg4 - 2);
                int var18 = class23.method111(arg3 - var5, class125.field2234, class19.field331, arg4 ^ 0x2);
                if (var16 <= class46.field817) {
                    class246.method1644(arg2, class59.field1094[var16], var17, var18, 1);
                }
                if (class161.field2718 <= var15) {
                    class246.method1644(arg2, class59.field1094[var15], var17, var18, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBI)I")
    public static final int method232(int arg0, byte arg1, int arg2) {
        field723++;
        if (arg1 != -48) {
            method233((byte) -124);
        }
        int var3 = class148.method936((byte) -73, arg0 + 91923, arg2 + 45365, 4) + (class148.method936((byte) 71, arg0 + 37821, arg2 + 10294, 2) - 128 >> 1) + (class148.method936((byte) -88, arg0, arg2, 1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method233(byte arg0) {
        field704 = null;
        field711 = null;
        field720 = null;
        field708 = null;
        field705 = null;
        field707 = null;
        field710 = null;
        field716 = null;
        field715 = null;
        field712 = null;
        field709 = null;
        if (arg0 == 24) {
            field714 = null;
            field724 = null;
        }
    }
}
