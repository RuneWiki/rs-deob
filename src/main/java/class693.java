import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public abstract class class693 {

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "[[S")
    private static short[][] field9748 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "I")
    public static int field9747 = 2;

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "[[S")
    private static short[][] field9746 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!sfa", name = "g", descriptor = "[Leca;")
    public static class755[] field9751 = new class755[14];

    @OriginalMember(owner = "client!sfa", name = "h", descriptor = "[[S")
    private static short[][] field9752 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "[[[S")
    public static short[][][] field9745 = new short[][][] { field9746, field9748, field9752 };

    @OriginalMember(owner = "client!sfa", name = "f", descriptor = "I")
    public static int field9750;

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "Lgba;")
    public static class664 field9749;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Leq;III)Lsha;", line = 14)
    public static final class725 method3896(class209 arg0, int arg1, int arg2, int arg3) {
        field9750++;
        class35 var4 = new class35(arg0.method1453(arg2, -128, arg1));
        class725 var5 = new class725(arg2, var4.method272(2), var4.method272(2), var4.method234((byte) -100), var4.method234((byte) -97), var4.method273(255) == 1, var4.method273(255), var4.method273(255));
        int var6 = var4.method273(arg3 - 336);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field10151.method1526(new class620(var4.method273(arg3 - 336), var4.method253(-13900), var4.method253(arg3 - 14491), var4.method253(-13900), var4.method253(-13900), var4.method253(-13900), var4.method253(-13900), var4.method253(-13900), var4.method253(-13900)), -19);
        }
        if (arg3 != 591) {
            method3896(null, 31, 69, 53);
        }
        var5.method4038((byte) 81);
        return var5;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V", line = 45)
    public static void method3897(int arg0) {
        field9749 = null;
        if (arg0 != -3545) {
            return;
        }
        field9751 = null;
        field9745 = null;
        field9748 = null;
        field9752 = null;
        field9746 = null;
    }
}
