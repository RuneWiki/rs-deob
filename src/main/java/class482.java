import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class482 {

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
    public int field7359 = 8;

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "I")
    public int field7360 = 16777215;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "Loe;")
    public static class127 field7355 = new class127(23, 7);

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "Loe;")
    public static class127 field7362 = new class127(37, -2);

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "Loe;")
    public static class127 field7365 = new class127(107, -2);

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "I")
    public int field7356;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
    public static int field7357;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "I")
    public static int field7358;

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "I")
    public int field7361;

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "I")
    public int field7363;

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "I")
    public int field7364;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
    public int field7366;

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "Z")
    public boolean field7353;

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "[I")
    public static int[] field7367;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILha;I)V", line = 13)
    private final void method2909(int arg0, class40 arg1, int arg2) {
        if (arg0 == 1) {
            this.field7359 = arg1.method254((byte) -99);
        } else if (arg0 == 2) {
            this.field7353 = true;
        } else if (arg0 == 3) {
            this.field7366 = arg1.method249(false);
            this.field7361 = arg1.method249(false);
            this.field7364 = arg1.method249(false);
        } else if (arg0 == 4) {
            this.field7363 = arg1.method257((byte) 99);
        } else if (arg0 == 5) {
            this.field7356 = arg1.method254((byte) -53);
        } else if (arg0 == 6) {
            this.field7360 = arg1.method224(-2);
        }
        int var4 = 6 % ((42 - arg2) / 51);
        field7358++;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lha;I)V", line = 63)
    public final void method2910(class40 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method257((byte) 46);
            if (var3 == 0) {
                field7354++;
                if (arg1 != 0) {
                    field7362 = null;
                    return;
                }
                return;
            }
            this.method2909(var3, arg0, -27);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BILjava/util/Random;)I", line = 93)
    public static final int method2911(byte arg0, int arg1, Random arg2) {
        field7357++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class110.method789(arg1, 1135345664)) {
            return (int) ((long) arg1 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            if (arg0 != 45) {
                field7355 = null;
            }
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class159.method1019(arg1, 51, var4);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V", line = 130)
    public static void method2912(int arg0) {
        field7362 = null;
        field7365 = null;
        field7355 = null;
        int var1 = -22 / ((-arg0 - 52) / 42);
        field7367 = null;
    }
}
