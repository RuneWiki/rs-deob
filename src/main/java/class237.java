import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class237 extends class337 {

    @OriginalMember(owner = "client!gga", name = "m", descriptor = "I")
    public int field3230;

    @OriginalMember(owner = "client!gga", name = "l", descriptor = "I")
    public int field3229;

    @OriginalMember(owner = "client!gga", name = "n", descriptor = "Ltq;")
    public static class536 field3231 = new class536(8);

    @OriginalMember(owner = "client!gga", name = "r", descriptor = "[[S")
    private static short[][] field3235 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!gga", name = "s", descriptor = "[[S")
    private static short[][] field3236 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!gga", name = "o", descriptor = "[[S")
    private static short[][] field3232 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!gga", name = "q", descriptor = "[[[S")
    public static short[][][] field3234 = new short[][][] { field3235, field3232, field3236 };

    @OriginalMember(owner = "client!gga", name = "p", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)V", line = 4)
    public static void method1569(int arg0) {
        field3231 = null;
        field3232 = null;
        field3234 = null;
        field3235 = null;
        if (arg0 == -8043) {
            field3236 = null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(II)I", line = 19)
    public static int method1570(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(II)V", line = 25)
    public class237(int arg0, int arg1) {
        this.field3230 = arg0;
        this.field3229 = arg1;
    }
}
