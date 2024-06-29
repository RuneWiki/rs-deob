import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class467 implements class159 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Lhg;")
    private class690 field6612;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Lkk;")
    public static class188 field6613 = new class188(8);

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "[[S")
    private static short[][] field6620;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "[[S")
    private static short[][] field6619;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "[[S")
    private static short[][] field6622;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "[[[S")
    public static short[][][] field6621;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Lfp;")
    public static class323 field6617;

    static {
        new class352("", 76);
        field6620 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };
        field6619 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };
        field6622 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };
        field6621 = new short[][][] { field6620, field6619, field6622 };
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2786(byte arg0) {
        field6611++;
        if (class222.field2897 == 7) {
            class415.method2550(false, -25626);
            return;
        }
        class615.field8605 = class333.field4663;
        class333.field4663 = null;
        if (arg0 < 90) {
            method2787((byte) 64);
        }
        class60.method514(false, 13);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Z", line = 24)
    public final boolean method49(int arg0) {
        field6616++;
        if (arg0 != -32252) {
            this.method55(24);
        }
        return true;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V", line = 38)
    public static void method2787(byte arg0) {
        field6620 = null;
        field6621 = null;
        field6617 = null;
        field6622 = null;
        int var1 = -82 % ((arg0 + 34) / 47);
        field6619 = null;
        field6613 = null;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lhg;)V", line = 51)
    public class467(class690 arg0) {
        this.field6612 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V", line = 59)
    public final void method55(int arg0) {
        if (arg0 != 11133) {
            field6620 = null;
        }
        field6615++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)V", line = 70)
    public final void method1056(boolean arg0, int arg1) {
        field6614++;
        if (arg0) {
            class268.field3831.method431(0, 0, class446.field6323, class172.field2348, this.field6612.field9426, 0);
        }
        if (arg1 != -3340) {
            method2786((byte) -119);
        }
    }
}
