import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class277 {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Lvl;")
    public static class15 field3830 = new class15(53, 3);

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "[[S")
    private static short[][] field3836 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "[[S")
    private static short[][] field3841 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "[[S")
    private static short[][] field3838 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[[[S")
    public static short[][][] field3837 = new short[][][] { field3838, field3841, field3836 };

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public int field3831;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public int field3832;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public int field3840;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public int field3842;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lha;I)V", line = 7)
    public static final void method1781(class66 arg0, int arg1) {
        if (arg1 != 8384) {
            field3838 = null;
        }
        field3835++;
        if (class611.field8532) {
            class739.method4094(arg0, (byte) 89);
        } else {
            class499.method2857(-68, arg0);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 22)
    public static void method1782(int arg0) {
        field3837 = null;
        field3836 = null;
        field3841 = null;
        field3830 = null;
        if (arg0 != 4760) {
            field3836 = null;
        }
        field3838 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZII)Lgj;", line = 39)
    public static final class662 method1783(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg2 != 4760) {
            return null;
        }
        field3839++;
        class241 var4 = null;
        if (class154.field2531 != null) {
            var4 = new class241(arg0, class154.field2531, class371.field5052[arg0], 1000000);
        }
        class473.field6407[arg0] = class352.field4697.method2243(arg0, class561.field7960, true, var4);
        class473.field6407[arg0].method2290(-2);
        return new class662(class473.field6407[arg0], arg1, arg3);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IF)F", line = 75)
    public static final float method1784(int arg0, float arg1) {
        field3833++;
        return arg0 == 5056 ? arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F) : -0.8655969F;
    }
}
