import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class471 implements class749 {

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "Lni;")
    private class522 field6518;

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "Ljava/lang/String;")
    private String field6520;

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "[[S")
    private static short[][] field6521 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "[[S")
    private static short[][] field6522 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!maa", name = "i", descriptor = "[[S")
    private static short[][] field6524 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "[[[S")
    public static short[][][] field6516 = new short[][][] { field6521, field6522, field6524 };

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "Lea;")
    public static class547 field6517 = new class547(109, 11);

    @OriginalMember(owner = "client!maa", name = "l", descriptor = "J")
    public static long field6527 = 0L;

    @OriginalMember(owner = "client!maa", name = "m", descriptor = "F")
    public static float field6528 = 0.0F;

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!maa", name = "h", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!maa", name = "j", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!maa", name = "k", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(BLrl;)Z", line = 5)
    public static final boolean method2649(byte arg0, class722 arg1) {
        field6525++;
        class685 var2 = class707.field9894.method4109(arg1.method680(30472), (byte) 119);
        if (var2.field9602 == -1) {
            return true;
        }
        class23 var3 = class593.field8266.method1365(var2.field9602, (byte) -73);
        if (var3.field168 == -1) {
            return true;
        } else if (arg0 == 76) {
            return var3.method90(-87);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)Lmk;", line = 29)
    public final class56 method307(int arg0) {
        if (arg0 == 15763) {
            field6519++;
            return class56.field570;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIIILeda;)V", line = 40)
    public static final void method2650(int arg0, int arg1, int arg2, int arg3, class103 arg4) {
        field6523++;
        if (arg1 != -21568) {
            field6522 = null;
        }
        arg4.field1379.method3384(1571862888, arg2);
        arg4.field1379.method3437(arg0, arg1 + 21696);
        arg4.field1379.method3423(arg3, 1571862888);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)I", line = 55)
    public final int method304(byte arg0) {
        field6526++;
        if (this.field6518.method2874(this.field6520, false)) {
            return 100;
        } else if (arg0 <= 126) {
            return -21;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(B)V", line = 70)
    public static void method2651(byte arg0) {
        field6521 = null;
        field6517 = null;
        field6516 = null;
        if (arg0 >= -5) {
            field6524 = null;
        }
        field6524 = null;
        field6522 = null;
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lni;Ljava/lang/String;)V", line = 97)
    public class471(class522 arg0, String arg1) {
        this.field6518 = arg0;
        this.field6520 = arg1;
    }
}
