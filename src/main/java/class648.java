import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class648 extends class482 {

    @OriginalMember(owner = "client!vea", name = "y", descriptor = "[I")
    public static int[] field9214 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!vea", name = "C", descriptor = "[I")
    public static int[] field9218 = new int[4096];

    @OriginalMember(owner = "client!vea", name = "F", descriptor = "[[I")
    public static int[][] field9221;

    @OriginalMember(owner = "client!vea", name = "z", descriptor = "B")
    public byte field9215;

    @OriginalMember(owner = "client!vea", name = "x", descriptor = "I")
    public static int field9213;

    @OriginalMember(owner = "client!vea", name = "B", descriptor = "I")
    public int field9217;

    @OriginalMember(owner = "client!vea", name = "D", descriptor = "I")
    public static int field9219;

    @OriginalMember(owner = "client!vea", name = "E", descriptor = "I")
    public static int field9220;

    @OriginalMember(owner = "client!vea", name = "A", descriptor = "Lofa;")
    public class301 field9216;

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field9218[var0] = class155.method1165((byte) -67, var0);
        }
        field9221 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(I)[B", line = 4)
    public final byte[] method12(int arg0) {
        if (arg0 != 24649) {
            field9221 = null;
        }
        ++field9219;
        if (!super.field6952 && this.field9216.field4534 >= this.field9216.field4543.length + -this.field9215) {
            return this.field9216.field4543;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "(I)V", line = 25)
    public static void method3654(int arg0) {
        if (arg0 == -7030) {
            field9221 = null;
            field9214 = null;
            field9218 = null;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(B)I", line = 39)
    public final int method11(byte arg0) {
        if (arg0 < 105) {
            return 60;
        } else {
            ++field9213;
            return this.field9216 == null ? 0 : this.field9216.field4534 * 100 / (this.field9216.field4543.length + -this.field9215);
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(III)Z", line = 61)
    public static final boolean method3655(int arg0, int arg1, int arg2) {
        ++field9220;
        int var3 = 42 % ((-57 - arg2) / 33);
        return ~(384 & arg0) != -1;
    }
}
