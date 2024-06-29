import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class162 {

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "J")
    public long field2769 = 0L;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "Lqe;")
    public static class168 field2771 = class66.method448("Mitglieder)2Welt", -109);

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field2776 = 0;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Lwc;")
    public static class232 field2767 = new class232(64);

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "Lqe;")
    public static class168 field2779 = class66.method448("::errortest", 71);

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "Lqe;")
    public static class168 field2780 = class66.method448("Fertigkeit)2", -116);

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Lqe;")
    public static class168 field2782 = class66.method448("::rect_debug", 56);

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "[Lea;")
    public static class119[] field2786 = new class119[6];

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "[Lqe;")
    public static class168[] field2784 = new class168[100];

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "Lqe;")
    private static class168 field2788 = class66.method448("shake:", -121);

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "Lqe;")
    public static class168 field2785 = field2788;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "Lqe;")
    public static class168 field2783 = field2788;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public int field2768;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public int field2770;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public int field2772;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public int field2773;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public int field2774;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "Lqf;")
    public class13 field2775;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "Lqf;")
    public class13 field2777;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I")
    public static final int method1050(int arg0, int arg1) {
        field2766++;
        return arg1 == 64 ? arg0 >>> 7 : -93;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZZ)I")
    public static final int method1051(int arg0, boolean arg1, boolean arg2) {
        field2787++;
        int var3 = arg0;
        if (arg2) {
            var3 = class213.field3686 + class134.field2338 + arg0;
        }
        if (arg1) {
            var3 += client.field534 + class115.field1888;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII)V")
    public static final void method1052(int arg0, int arg1, int arg2, int arg3) {
        field2778++;
        class129 var4 = class58.method404(arg3, false, arg2);
        if (var4 != null && var4.field2216 != null) {
            class147 var5 = new class147();
            var5.field2566 = var4.field2216;
            var5.field2552 = var4;
            class82.method545(var5, (byte) 106);
        }
        class96.field1520 = arg3;
        class84.field1277 = true;
        class116.field1901 = arg2;
        if (arg1 != 20864) {
            field2786 = null;
        }
        class172.field2985 = arg0;
        class65.method443(var4, 0);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static void method1053(byte arg0) {
        field2780 = null;
        field2782 = null;
        field2785 = null;
        field2771 = null;
        field2779 = null;
        field2784 = null;
        field2783 = null;
        field2786 = null;
        field2767 = null;
        field2788 = null;
        if (arg0 >= -101) {
            field2785 = null;
        }
    }
}
