import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class433 implements class369 {

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "I")
    public int field6136;

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "Lpj;")
    public static class132 field6134;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "[Lhp;")
    public static class297[] field6132;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Z)V")
    public static void method2491(boolean arg0) {
        field6134 = null;
        if (!arg0) {
            field6132 = null;
        }
        field6132 = null;
    }

    @OriginalMember(owner = "client!maa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6135++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(BLjava/util/Random;I)I")
    public static final int method2492(byte arg0, Random arg1, int arg2) {
        field6133++;
        if (arg0 != 0) {
            method2492((byte) 122, null, 30);
        }
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class17.method89(arg2, 508337774)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class378.method2194(arg2, (byte) -44, var4);
        }
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class433(String arg0, int arg1) {
        this.field6136 = arg1;
    }
}
