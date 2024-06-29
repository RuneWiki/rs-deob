import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class33 extends class272 {

    @OriginalMember(owner = "client!kc", name = "jb", descriptor = "Z")
    public static boolean field669 = false;

    @OriginalMember(owner = "client!kc", name = "hb", descriptor = "[[[I")
    public static int[][][] field667 = new int[2][][];

    @OriginalMember(owner = "client!kc", name = "ib", descriptor = "I")
    public static int field668 = 0;

    @OriginalMember(owner = "client!kc", name = "db", descriptor = "I")
    public static int field663 = 0;

    @OriginalMember(owner = "client!kc", name = "cb", descriptor = "I")
    public static int field662 = 0;

    @OriginalMember(owner = "client!kc", name = "lb", descriptor = "Lqd;")
    public static class40 field671 = class147.method1106("k", (byte) -74);

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "B")
    public byte field660;

    @OriginalMember(owner = "client!kc", name = "bb", descriptor = "I")
    public int field661;

    @OriginalMember(owner = "client!kc", name = "fb", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!kc", name = "gb", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!kc", name = "kb", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!kc", name = "eb", descriptor = "Lsd;")
    public class26 field664;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)[B", line = 7)
    public final byte[] method289(byte arg0) {
        field670++;
        if (this.field4515 || this.field664.field478 < this.field664.field472.length - this.field660) {
            throw new RuntimeException();
        }
        if (arg0 != -56) {
            this.method290((byte) -56);
        }
        return this.field664.field472;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)I", line = 31)
    public final int method290(byte arg0) {
        field666++;
        if (arg0 > -126) {
            return 3;
        } else if (this.field664 == null) {
            return 0;
        } else {
            return this.field664.field478 * 100 / (this.field664.field472.length - this.field660);
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(B)V", line = 46)
    public static void method291(byte arg0) {
        field671 = null;
        if (arg0 != 120) {
            method291((byte) -18);
        }
        field667 = (int[][][]) null;
    }
}
