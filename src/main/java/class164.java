import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class164 extends class186 {

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    private int field2599;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    private int field2609;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    private int field2600;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    private int field2616;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field2602 = -1;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "Z")
    public static boolean field2607 = false;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public static int field2610 = -1;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "[I")
    public static int[] field2606 = new int[2000];

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Llg;")
    public static class160 field2601;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "Lib;")
    public static class56 field2605;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "[Lib;")
    public static class56[] field2608;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lpd;I)V")
    public static final void method1135(class96 arg0, int arg1) {
        if (arg1 <= 96) {
            field2605 = null;
        }
        for (int var2 = 0; class75.field936 > var2; ++var2) {
            int var3 = arg0.method539(-401085592);
            int var4 = arg0.method549(255);
            if (~var4 == -65536) {
                var4 = -1;
            }
            if (class84.field1046[var3] != null) {
                class84.field1046[var3].field3846 = var4;
            }
        }
        ++field2613;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method1136(int arg0) {
        field2601 = null;
        field2606 = null;
        field2605 = null;
        field2608 = null;
        if (arg0 != -1668865908) {
            field2606 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([[II)V")
    public static final void method1137(int[][] arg0, int arg1) {
        class14.field186 = arg0;
        if (arg1 != -1282956820) {
            method1137((int[][]) null, -116);
        }
        ++field2603;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BII)V")
    public final void method291(byte arg0, int arg1, int arg2) {
        ++field2612;
        int var4 = this.field2599 * arg2 >> 12;
        if (arg0 <= -45) {
            int var5 = this.field2600 * arg1 >> 12;
            int var6 = this.field2616 * arg2 >> 12;
            int var7 = this.field2609 * arg1 >> 12;
            class79.method445(var7, var4, var6, var5, super.field2966, 16);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIB)V")
    public final void method293(int arg0, int arg1, byte arg2) {
        ++field2604;
        int var4 = this.field2616 * arg0 >> 12;
        int var5 = this.field2599 * arg0 >> 12;
        int var6 = this.field2609 * arg1 >> 12;
        int var7 = this.field2600 * arg1 >> 12;
        int var8 = 121 % ((arg2 - 90) / 34);
        class160.method1117(super.field2971, super.field2966, var7, var4, -36, super.field2970, var6, var5);
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(IIIIIII)V")
    public class164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2599 = arg2;
        this.field2609 = arg3;
        this.field2600 = arg1;
        this.field2616 = arg0;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(III)V")
    public final void method292(int arg0, int arg1, int arg2) {
        ++field2611;
        if (arg0 != -6) {
            field2607 = true;
        }
    }
}
