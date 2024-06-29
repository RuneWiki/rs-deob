import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class153 extends class26 {

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    private final int field2655;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    private final int field2658;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    private final int field2654;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    private final int field2660;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Lub;")
    public static class227 field2652 = class257.method1749("0(U", 17263);

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field2656 = 0;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Lpf;")
    public static class168 field2653 = new class168(64);

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "Z")
    public static boolean field2662 = false;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "J")
    public static long field2661 = 0L;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "Lub;")
    public static class227 field2659 = class257.method1749("p11_full", 17263);

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "Llc;")
    public static class214 field2664;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "[Lub;")
    public static class227[] field2657;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static final void method960(byte arg0) {
        ++field2650;
        for (int var1 = 0; class147.field2572 > var1; ++var1) {
            int var3 = class131.field2293[var1];
            class225 var4 = class27.field446[var3];
            int var5 = class32.field512.method1471(255);
            if ((var5 & 2) != 0) {
                var5 += class32.field512.method1471(255) << 8;
            }
            class205.method1313((byte) -117, var4, var3, var5);
        }
        int var2 = 79 / ((arg0 - -18) / 34);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static void method961(int arg0) {
        field2657 = null;
        field2659 = null;
        field2652 = null;
        field2653 = null;
        field2664 = null;
        if (arg0 != -9185) {
            method962(-45, 51);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIB)V")
    public final void method106(int arg0, int arg1, byte arg2) {
        if (arg2 != -75) {
            this.method100(-95, -105, -20);
        }
        ++field2651;
        int var4 = this.field2654 * arg0 >> 12;
        int var5 = this.field2660 * arg0 >> 12;
        int var6 = this.field2655 * arg1 >> 12;
        int var7 = this.field2658 * arg1 >> 12;
        class61.method375((byte) 125, var4, var5, var7, var6, super.field433, super.field434);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(IIB)V")
    public final void method103(int arg0, int arg1, byte arg2) {
        ++field2663;
        int var4 = this.field2654 * arg1 >> 12;
        if (arg2 < 98) {
            this.method103(-41, 99, (byte) -59);
        }
        int var5 = this.field2660 * arg1 >> 12;
        int var6 = this.field2655 * arg0 >> 12;
        int var7 = this.field2658 * arg0 >> 12;
        class241.method1607(var5, var7, 119, super.field436, var6, var4);
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IIIIIII)V")
    public class153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2655 = arg1;
        this.field2658 = arg3;
        this.field2654 = arg0;
        this.field2660 = arg2;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
    public final void method100(int arg0, int arg1, int arg2) {
        ++field2649;
        int var4 = this.field2660 * arg1 >> 12;
        int var5 = this.field2655 * arg2 >> 12;
        int var6 = this.field2658 * arg2 >> 12;
        if (arg0 != 512) {
            field2652 = null;
        }
        int var7 = this.field2654 * arg1 >> 12;
        class122.method755(var5, arg0 + -512, var7, super.field434, var6, super.field433, super.field436, var4);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)V")
    public static final void method962(int arg0, int arg1) {
        class213.field3591.method1727(true, arg1);
        ++field2648;
        if (arg0 != 0) {
            method960((byte) 24);
        }
    }
}
