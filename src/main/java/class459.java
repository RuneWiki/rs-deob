import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class459 {

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    private int field6754;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "B")
    public byte field6767;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
    public int field6770;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public int field6757;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
    public int field6766;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "Z")
    public static boolean field6759 = false;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
    public static int field6763 = -1;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "Lqe;")
    public static class469 field6755 = new class469(121, 3);

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public int field6758;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public int field6760;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
    public int field6761;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
    public int field6764;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    public int field6765;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
    public int field6768;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "I")
    public int field6772;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
    public int field6774;

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
    public int field6776;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "Lwr;")
    public class459 field6762;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V", line = 12)
    public static void method2800(byte arg0) {
        field6755 = null;
        if (arg0 != 15) {
            method2800((byte) -69);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)Z", line = 23)
    public static final boolean method2801(int arg0) {
        field6775++;
        try {
            class57 var1 = new class57();
            int var2 = 117 % ((-arg0 - 56) / 43);
            byte[] var3 = var1.method403(class684.field9474, true);
            class338.method2155(var3, 127);
            return true;
        } catch (Exception var4) {
            return false;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIII)Lwr;", line = 46)
    public final class459 method2802(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            this.method2804(-29);
        }
        field6777++;
        return new class459(this.field6754, arg1, arg2, arg3, this.field6767);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BZ)V", line = 65)
    public static final void method2803(byte arg0, boolean arg1) {
        field6771++;
        class290.method1858((byte) 22);
        if (!class239.method1585(class87.field1246, (byte) 94)) {
            return;
        }
        if (arg0 != -41) {
            field6759 = false;
        }
        class77.field1072++;
        if (class77.field1072 < 50 && !arg1) {
            return;
        }
        class77.field1072 = 0;
        if (!class439.field6504 && class533.field7668 != null) {
            class748.field10465++;
            class468 var2 = class93.method734(class29.field284, class173.field2684, 8174);
            class120.method872((byte) -47, var2);
            try {
                class691.method3927(arg0 ^ 0xFFFFF9B4);
            } catch (IOException var3) {
                class439.field6504 = true;
            }
        }
        class290.method1858((byte) 69);
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)Lgq;", line = 110)
    public final class516 method2804(int arg0) {
        if (arg0 != -28777) {
            this.field6772 = 112;
        }
        field6773++;
        return class234.method1559(this.field6754, arg0 ^ 0xFFFF8FBA);
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIIB)V", line = 124)
    public class459(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field6754 = arg0;
        this.field6767 = arg4;
        this.field6770 = arg2;
        this.field6757 = arg3;
        this.field6766 = arg1;
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)V", line = 138)
    public static final void method2805(int arg0) {
        if (arg0 < 6) {
            field6769 = -32;
        }
        field6756++;
        for (int var1 = 0; var1 < 100; var1++) {
            class228.field3352[var1] = true;
        }
    }
}
