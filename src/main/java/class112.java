import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class112 {

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field1724 = 0;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field1726 = 0;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "Lpf;")
    public static class294 field1728;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "[Lsb;")
    public static class230[] field1723;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public static void method725(byte arg0) {
        if (arg0 >= -20) {
            method726(-77, (byte) 6, (Random) null);
        }
        field1723 = null;
        field1728 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBLjava/util/Random;)I")
    public static final int method726(int arg0, byte arg1, Random arg2) {
        field1727++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class147.method893(arg0, (byte) 13)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        } else {
            if (arg1 < 36) {
                method725((byte) 10);
            }
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class83.method549(10833, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjj;)I")
    public static final int method727(byte arg0, class107 arg1) {
        field1725++;
        if (arg0 != 92) {
            field1728 = null;
        }
        int var2 = arg1.field1651;
        class158 var3 = arg1.method928(arg0 + 24748);
        if (arg1.field2303 == var3.field2414) {
            var2 = arg1.field1652;
        } else if (arg1.field2303 == var3.field2430 || arg1.field2303 == var3.field2406 || arg1.field2303 == var3.field2397 || arg1.field2303 == var3.field2409) {
            var2 = arg1.field1650;
        } else if (arg1.field2303 == var3.field2411 || arg1.field2303 == var3.field2419 || arg1.field2303 == var3.field2415 || arg1.field2303 == var3.field2420) {
            var2 = arg1.field1643;
        }
        return var2;
    }
}
