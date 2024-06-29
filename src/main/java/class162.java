import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class162 {

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field2649 = 7759444;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Ldf;")
    public static class51 field2653 = class46.method233(")4l=", 100);

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field2654 = 2301979;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "Ldf;")
    private static class51 field2658 = class46.method233("", 100);

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "Ldf;")
    public static class51 field2659 = class46.method233("Okay", 100);

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "Ldf;")
    public static class51 field2652 = field2658;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public int field2650;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public int field2657;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public int field2661;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "J")
    public long field2660;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "Lkb;")
    public class49 field2655;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "Lja;")
    public static class55 field2651;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "Llc;")
    public static class80 field2656;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIILkb;JZ)V")
    public static final void method1144(int arg0, int arg1, int arg2, int arg3, class49 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class162 var8 = new class162();
        var8.field2655 = arg4;
        var8.field2650 = arg1 * 128 + 64;
        var8.field2661 = arg2 * 128 + 64;
        var8.field2657 = arg3;
        var8.field2660 = arg5;
        if (class27.field395[arg0][arg1][arg2] == null) {
            class27.field395[arg0][arg1][arg2] = new class97(arg0, arg1, arg2);
        }
        class27.field395[arg0][arg1][arg2].field1614 = var8;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method1145(int arg0) {
        field2659 = null;
        field2653 = null;
        if (arg0 != -25503) {
            method1144(-5, 51, 98, 69, (class49) null, 15L, false);
        }
        field2658 = null;
        field2651 = null;
        field2656 = null;
        field2652 = null;
    }
}
