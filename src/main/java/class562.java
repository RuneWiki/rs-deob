import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class562 {

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "[[I")
    public static int[][] field7340 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "Lta;")
    public static class597 field7337;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BLjava/util/Random;I)I", line = 14)
    public static final int method3002(byte arg0, Random arg1, int arg2) {
        field7339++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class386.method2202(-53, arg2)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            if (arg0 != -14) {
                field7335 = -112;
            }
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            return class296.method1750(var4, 127, arg2);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lki;Loa;III)V", line = 44)
    public static final void method3003(class364 arg0, class43 arg1, int arg2, int arg3, int arg4) {
        class453.field5907.method2085((byte) 9);
        field7336++;
        if (class486.field6472) {
            return;
        }
        if (arg4 != 8) {
            field7335 = 117;
        }
        for (class700 var5 = (class700) arg0.method2090(true); var5 != null; var5 = (class700) arg0.method2088(-152)) {
            class576 var6 = class706.field9833.method2291((byte) 117, var5.field9761);
            if (class690.method3760(var6, -17291)) {
                boolean var7 = class84.method642((byte) -7, arg2, arg3, var5, arg1, var6);
                if (var7) {
                    class362.method2075(var6, arg1, (byte) 112, var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(B)V", line = 79)
    public static void method3004(byte arg0) {
        field7340 = null;
        field7337 = null;
        if (arg0 != 109) {
            field7335 = 125;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "toString", descriptor = "()Ljava/lang/String;", line = 90)
    public final String toString() {
        field7334++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IBI)I", line = 98)
    public final int method3005(int arg0, byte arg1, int arg2) {
        field7338++;
        if (arg1 >= -121) {
            return -22;
        }
        int var4 = arg0 < class519.field6796 ? class519.field6796 : arg0;
        if (class565.field7385 == this) {
            return 0;
        } else if (class72.field980 == this) {
            return var4 - arg2;
        } else if (class258.field3483 == this) {
            return (var4 - arg2) / 2;
        } else {
            return 0;
        }
    }
}
