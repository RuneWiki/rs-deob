import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class143 extends class64 {

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
    public int field2606;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "Lid;")
    public static class149 field2601 = class60.method382("Fallen lassen", (byte) 113);

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public static int field2603 = -1;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "Lid;")
    public static class149 field2604 = class60.method382("p12_full", (byte) 14);

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "[Z")
    public static boolean[] field2611 = new boolean[8];

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "[Lrh;")
    public static class46[] field2609;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIILug;IJ)Z")
    public static final boolean method990(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class199 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class175.method1243(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Lhk;")
    public static final class125 method991(int arg0, int arg1, int arg2) {
        class231 var3 = class261.field4664[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4053;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
    public static final void method992(byte arg0) {
        class35.field505.method1290((byte) -105);
        class210.field3743.method1290((byte) 58);
        int var1 = -62 / ((-arg0 - 50) / 61);
        field2608++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIII)V")
    public static final void method993(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var10000 = arg2 ^ 0xA;
        int var8 = arg0 + 1;
        class141.method987(var10000, arg4, class15.field220[arg0], arg5, arg1);
        field2607++;
        int var9 = arg3 - 1;
        class141.method987(2, arg4, class15.field220[arg3], arg5, arg1);
        int var6 = var8;
        if (arg2 != 8) {
            method991(25, 69, -9);
        }
        while (var6 <= var9) {
            int[] var7 = class15.field220[var6];
            var7[arg4] = var7[arg5] = arg1;
            var6++;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)I")
    public static final int method994(int arg0, int arg1) {
        field2605++;
        if (arg0 != 24838) {
            method991(-77, -103, -124);
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lid;IZ)V")
    public static final void method995(class149 arg0, int arg1, boolean arg2) {
        field2610++;
        class216 var3 = class139.method972(arg1, !arg2, 2);
        if (!arg2) {
            method996((byte) -81);
        }
        var3.method1459(arg2);
        var3.field3815 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(B)V")
    public static void method996(byte arg0) {
        field2601 = null;
        if (arg0 == -31) {
            field2604 = null;
            field2611 = null;
            field2609 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class143() {
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V")
    public class143(int arg0) {
        this.field2606 = arg0;
    }
}
