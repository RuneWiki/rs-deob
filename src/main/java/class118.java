import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class118 extends class116 {

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public int field2741 = -1;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public int field2746 = 0;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "Lic;")
    public static class59 field2737 = class59.method433(0, "blaugr-Un:");

    @OriginalMember(owner = "client!r", name = "z", descriptor = "Lic;")
    public static class59 field2744 = class59.method433(0, "::rect_debug");

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static volatile int field2742 = 0;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public int field2738;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public int field2739;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public int field2740;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public int field2743;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public int field2747;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public int field2751;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    public int field2752;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public int field2753;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public int field2755;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "[I")
    public static int[] field2745;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
    public static void method937(byte arg0) {
        field2744 = null;
        field2745 = null;
        if (arg0 > 81) {
            field2737 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
    public static final void method938(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2754++;
        class149 var5 = (class149) class68.field1699.method35((long) arg4, 105);
        if (var5 == null) {
            var5 = new class149();
            class68.field1699.method38(var5, (byte) 91, (long) arg4);
        }
        if (arg1 >= var5.field3261.length) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field3261.length; var8++) {
                var7[var8] = var5.field3261[var8];
                var6[var8] = var5.field3256[var8];
            }
            for (int var9 = var5.field3261.length; var9 < arg1; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field3256 = var6;
            var5.field3261 = var7;
        }
        var5.field3261[arg1] = arg2;
        var5.field3256[arg1] = arg3;
        if (arg0 != 0) {
            field2749 = 106;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILdd;Ldd;)V")
    public static final void method939(int arg0, class26 arg1, class26 arg2) {
        class44.field1124 = arg2;
        field2748++;
        if (arg0 == 0) {
            class4.field93 = arg1;
        }
    }
}
