import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class636 extends class401 {

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "[I")
    public static int[] field8790 = new int[1024];

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "Z")
    public static boolean field8795 = false;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public int field8787;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public int field8788;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public int field8789;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public int field8792;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public int field8794;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public static int field8796;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public int field8797;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
    public int field8799;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "I")
    public int field8801;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
    public int field8802;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "I")
    public int field8804;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "I")
    public int field8806;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "I")
    public int field8807;

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "I")
    public int field8808;

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "I")
    public int field8809;

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "I")
    public int field8810;

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "I")
    public int field8812;

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
    public int field8815;

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "Lbu;")
    public class19 field8813;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "Lvk;")
    public class336 field8800;

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "Lsf;")
    public class484 field8811;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "Lsfa;")
    public class647 field8798;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Lsea;")
    public static class648 field8791;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "[Lf;")
    public static class702[] field8803;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "[Lf;")
    public static class702[] field8814;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)[Lrg;")
    public static final class596[] method3550(boolean arg0) {
        if (!arg0) {
            method3553(107);
        }
        field8805++;
        return new class596[] { class31.field394, class21.field240, class283.field3876, class285.field3912, class206.field2883, class357.field4732, class77.field1007, class23.field281, class425.field5959, class281.field3847, class356.field4724, class594.field8308, class89.field1280, class413.field5851, class700.field9932 };
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method3551(int arg0) {
        field8791 = null;
        if (arg0 != 1024) {
            method3553(46);
        }
        field8803 = null;
        field8814 = null;
        field8790 = null;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public final void method3552(int arg0) {
        this.field8811 = null;
        if (arg0 != 100) {
            this.field8797 = -105;
        }
        this.field8798 = null;
        this.field8800 = null;
        this.field8813 = null;
        field8796++;
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)I")
    public static final int method3553(int arg0) {
        if (arg0 != 1) {
            field8790 = null;
        }
        field8793++;
        int var1 = class296.field4059.method3065((byte) -78);
        if (class268.field3626.length - 1 > var1) {
            class296.field4059 = class268.field3626[var1 + 1];
        }
        return 100;
    }
}
