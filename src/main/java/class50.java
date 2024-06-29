import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class50 {

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Ljf;")
    private static class229 field884 = class212.method1457((byte) 71, "Connection lost)3");

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "Ljf;")
    public static class229 field887 = field884;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Lpc;")
    public static class91 field883 = new class91(64);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "Lek;")
    public static class185 field886;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "Lnf;")
    public static class67 field888;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZLjava/util/Random;)I", line = 14)
    public static final int method413(int arg0, boolean arg1, Random arg2) {
        field885++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class172.method1169(arg0, -1443519519)) {
            return (int) ((long) arg0 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else if (arg1) {
            return -126;
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class241.method1744(var4, arg0, 4913);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lek;II)Z", line = 53)
    public static final boolean method414(class185 arg0, int arg1, int arg2) {
        field882++;
        byte[] var3 = arg0.method1291(arg2, 0);
        if (var3 == null) {
            return false;
        } else {
            class278.method1957(var3, 64);
            int var4 = 10 % ((-arg1 - 23) / 42);
            return true;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V", line = 124)
    public static void method415(boolean arg0) {
        field886 = null;
        field887 = null;
        if (!arg0) {
            field887 = (class229) null;
        }
        field883 = null;
        field884 = null;
        field888 = null;
    }
}
