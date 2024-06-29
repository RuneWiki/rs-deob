import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class347 extends class314 {

    @OriginalMember(owner = "client!ev", name = "L", descriptor = "[I")
    public static int[] field5128 = new int[14];

    @OriginalMember(owner = "client!ev", name = "G", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!ev", name = "H", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!ev", name = "I", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!ev", name = "J", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!ev", name = "K", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!ev", name = "M", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!ev", name = "F", descriptor = "[B")
    private byte[] field5122;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(IIII)[B", line = 5)
    public final byte[] method2200(int arg0, int arg1, int arg2, int arg3) {
        this.field5122 = new byte[arg0 * arg2 * arg1 * 2];
        if (arg3 < 30) {
            method2202(108, (byte) 54);
        }
        field5126++;
        this.method1686(arg0, -114, arg2, arg1);
        return this.field5122;
    }

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "(B)V", line = 21)
    public static void method2201(byte arg0) {
        if (arg0 >= 78) {
            field5128 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IB)I", line = 33)
    public static final int method2202(int arg0, byte arg1) {
        field5123++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            if (arg1 != 23) {
                method2202(50, (byte) 124);
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "(B)[Lhr;", line = 67)
    public static final class57[] method2203(byte arg0) {
        if (arg0 <= 70) {
            return null;
        } else {
            field5129++;
            return new class57[] { class165.field2341, class457.field6509, class438.field6242, class463.field6594, class147.field2153, class153.field2228, class28.field260, class438.field6249, class758.field10545, class556.field8079 };
        }
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V", line = 85)
    public class347() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIB)V", line = 88)
    public final void method1937(int arg0, int arg1, byte arg2) {
        field5125++;
        int var4 = arg0 * 2;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field5122[var10001] = -1;
        if (arg1 != 0) {
            field5124 = 26;
        }
        int var5 = arg2 & 0xFF;
        this.field5122[var6] = (byte) (var5 * 3 >> 5);
    }
}
