import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class155 extends class107 {

    @OriginalMember(owner = "client!ct", name = "D", descriptor = "D")
    public double field2198;

    @OriginalMember(owner = "client!ct", name = "y", descriptor = "[[S")
    public short[][] field2194;

    @OriginalMember(owner = "client!ct", name = "z", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ct", name = "A", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!ct", name = "C", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)J", line = 7)
    public final long method1063(int arg0) {
        field2197++;
        if (arg0 != 3899) {
            this.field2198 = -0.7582629873255756D;
        }
        return (long) (this.field2194[0].length | this.field2194.length << 0);
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)I", line = 19)
    public static final int method1064(int arg0, int arg1) {
        field2196++;
        if (arg0 != 127) {
            method1064(33, -78);
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "([SIZ)[S", line = 30)
    public static final short[] method1065(short[] arg0, int arg1, boolean arg2) {
        field2195++;
        short[] var3 = new short[arg1];
        if (arg2) {
            class595.method3466(arg0, 0, var3, 0, arg1);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "([[SD)V", line = 44)
    public class155(short[][] arg0, double arg1) {
        this.field2198 = arg1;
        this.field2194 = arg0;
    }
}
