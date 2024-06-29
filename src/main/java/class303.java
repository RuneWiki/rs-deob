import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class303 {

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "J")
    public static long field4138 = 0L;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field4135 = 16777215;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "Ldv;")
    public static class566 field4143 = new class566(12, 8);

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Lwk;")
    public static class122 field4139;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Lqg;")
    public static class393 field4141;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[B")
    public byte[] field4134;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "[S")
    public short[] field4136;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "[S")
    public short[] field4140;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "[S")
    public short[] field4142;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLjava/util/Random;I)I")
    public static final int method1924(byte arg0, Random arg1, int arg2) {
        if (arg0 > -55) {
            return -59;
        }
        field4137++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class130.method886(1, arg2)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            return class16.method184(arg2, var4, 1501);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public static void method1925(byte arg0) {
        if (arg0 < 52) {
            method1925((byte) 61);
        }
        field4141 = null;
        field4143 = null;
        field4139 = null;
    }

    static {
        new class104("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
    }
}
