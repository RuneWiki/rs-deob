import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class490 extends class281 {

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "[[S")
    public short[][] field6802;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "D")
    public double field6798;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "Ljw;")
    public static class581 field6803 = new class581(110, -2);

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "[F")
    public static float[] field6805 = new float[4];

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)Z")
    public static final boolean method2848(byte arg0, int arg1) {
        field6799++;
        if (arg0 > -15) {
            field6806 = -77;
        }
        return arg1 == 2 || arg1 == 3;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)J")
    public final long method2849(int arg0) {
        if (arg0 > -31) {
            return -58L;
        } else {
            field6801++;
            return (long) (this.field6802[0].length | this.field6802.length << 0);
        }
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V")
    public static void method2850(int arg0) {
        if (arg0 > 28) {
            field6805 = null;
            field6803 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "([[SD)V")
    public class490(short[][] arg0, double arg1) {
        this.field6802 = arg0;
        this.field6798 = arg1;
    }
}
