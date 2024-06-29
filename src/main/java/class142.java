import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class142 extends class202 {

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public int field2297;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public int field2292;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public int field2298;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public int field2291;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "[I")
    public static int[] field2295 = new int[100];

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "Z")
    public static boolean field2301 = false;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "Ldf;")
    public static class55 field2296;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZ)Z")
    private static final boolean method980(int arg0, boolean arg1) {
        field2293++;
        if (!arg1) {
            method982(-67, 50, (Random) null);
        }
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V")
    public static void method981(int arg0) {
        field2296 = null;
        int var1 = 42 % ((arg0 - 15) / 34);
        field2295 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method982(int arg0, int arg1, Random arg2) {
        field2299++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (method980(arg1, true)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
            if (arg0 != -396321952) {
                method980(73, false);
            }
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class240.method1660(var4, arg1, true);
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(IIII)V")
    public class142(int arg0, int arg1, int arg2, int arg3) {
        this.field2297 = arg0;
        this.field2292 = arg2;
        this.field2298 = arg3;
        this.field2291 = arg1;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)Z")
    public final boolean method983(int arg0, int arg1, int arg2) {
        field2294++;
        if (arg2 != 100) {
            field2296 = null;
        }
        return arg1 >= this.field2297 && arg1 <= this.field2292 && arg0 >= this.field2291 && arg0 <= this.field2298;
    }
}
