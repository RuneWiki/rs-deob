import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class594 extends class175 {

    @OriginalMember(owner = "client!cv", name = "E", descriptor = "I")
    public static int field8103;

    @OriginalMember(owner = "client!cv", name = "F", descriptor = "I")
    public static int field8104;

    @OriginalMember(owner = "client!cv", name = "G", descriptor = "I")
    public static int field8105;

    @OriginalMember(owner = "client!cv", name = "H", descriptor = "I")
    public static int field8106;

    @OriginalMember(owner = "client!cv", name = "I", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(IIB)Z")
    public static final boolean method3334(int arg0, int arg1, byte arg2) {
        if (arg2 != -119) {
            field8105 = 107;
        }
        ++field8103;
        return (arg1 & 384) != 0;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "()V")
    public class594() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        ++field8104;
        if (!arg0) {
            method3335(5, false, (Random) null);
        }
        int[] var3 = super.field2310.method91(0, arg1);
        if (super.field2310.field169) {
            int[][] var4 = this.method1205(0, arg1, 29179);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class598.field8136 > var8; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IZLjava/util/Random;)I")
    public static final int method3335(int arg0, boolean arg1, Random arg2) {
        if (arg1) {
            field8105 = -56;
        }
        ++field8107;
        if (~arg0 >= -1) {
            throw new IllegalArgumentException();
        } else if (class439.method2627(0, arg0)) {
            return (int) ((long) arg0 * (4294967295L & (long) arg2.nextInt()) >> 32);
        } else {
            int var3 = -((int) (4294967296L % (long) arg0)) + Integer.MIN_VALUE;
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class693.method3780(var4, arg0, -441893025);
        }
    }

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "(I)I")
    public static final int method3336(int arg0) {
        if (arg0 != 16) {
            field8105 = 110;
        }
        ++field8106;
        return 16;
    }
}
