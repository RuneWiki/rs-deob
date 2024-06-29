import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class154 extends class13 {

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    private int field2669 = 0;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "Z")
    public boolean field2686 = false;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    private int field2688 = 0;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    private int field2685 = -32768;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public int field2675;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public int field2674;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public int field2678;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public int field2687;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    private int field2691;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public int field2689;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "Lc;")
    private class237 field2681;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field2676 = 0;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "[S")
    public static short[] field2673 = new short[] { 26, 30, 4, 34, 36, 14, 44, 12 };

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public static int field2682 = 0;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "J")
    public static long field2683;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "[Ld;")
    public static class54[] field2690;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
    public final void method1014(int arg0, int arg1) {
        field2679++;
        if (this.field2686) {
            return;
        }
        this.field2688 += arg1;
        if (arg0 <= 125) {
            return;
        }
        while (this.field2681.field4069[this.field2669] < this.field2688) {
            this.field2688 -= this.field2681.field4069[this.field2669];
            this.field2669++;
            if (this.field2681.field4065.length <= this.field2669) {
                this.field2686 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2677++;
        class188 var11 = this.method1018(122);
        if (var11 != null) {
            var11.method49(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2685 = var11.method43();
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public static final void method1015(int arg0) {
        if (class137.field2426 != -1) {
            class229.method1476(false, class137.field2426);
        }
        field2672++;
        for (int var1 = arg0; var1 < class149.field2586; var1++) {
            if (class194.field3372[var1]) {
                class255.field4409[var1] = true;
            }
            class230.field3910[var1] = class194.field3372[var1];
            class194.field3372[var1] = false;
        }
        class8.field90 = null;
        class192.field3360 = -1;
        class246.field4263 = -1;
        class115.field1880 = class133.field2326;
        if (class137.field2426 != -1) {
            class149.field2586 = 0;
            class98.method643(0, 0, false, class223.field3837, class137.field2426, class42.field551, 0, 0, -1);
        }
        class216.method1400();
        class146.field2539 = 0;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
    public static final void method1016(int arg0) {
        if (arg0 != 8) {
            field2676 = -94;
        }
        class74.field1124 = new class47();
        field2670++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static void method1017(byte arg0) {
        field2690 = null;
        field2673 = null;
        if (arg0 < 83) {
            method1019(6, 112, -46);
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)Lqc;")
    private final class188 method1018(int arg0) {
        if (arg0 < 101) {
            return null;
        }
        field2684++;
        class213 var2 = class128.method865(this.field2691, 1);
        class188 var3;
        if (this.field2686) {
            var3 = var2.method1375(-121, -1);
        } else {
            var3 = var2.method1375(-85, this.field2669);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "()I")
    public final int method43() {
        field2680++;
        return this.field2685;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(III)I")
    public static final int method1019(int arg0, int arg1, int arg2) {
        field2671++;
        int var3 = class180.method1185(arg1 - 1, arg0 + arg2, -1) + class180.method1185(arg1 + 1, arg0 - 1, -1) + class180.method1185(arg1 + -1, arg0 + 1, arg2) + class180.method1185(arg1 + 1, arg0 + 1, arg2);
        int var4 = class180.method1185(arg1 - 1, arg0, -1) + class180.method1185(arg1 + 1, arg0, -1) + class180.method1185(arg1, arg0 + -1, -1) + class180.method1185(arg1, arg0 - -1, -1);
        int var5 = class180.method1185(arg1, arg0, -1);
        return var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIIII)V")
    public class154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2675 = arg5 + arg6;
        this.field2674 = arg4;
        this.field2678 = arg1;
        this.field2687 = arg3;
        this.field2691 = arg0;
        this.field2689 = arg2;
        int var8 = class128.method865(this.field2691, 1).field3680;
        if (var8 == -1) {
            this.field2686 = true;
        } else {
            this.field2686 = false;
            this.field2681 = class213.method1370(-1, var8);
        }
    }
}
