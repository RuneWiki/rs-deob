import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class32 {

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Laf;")
    public static class297 field523 = new class297();

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field526 = 0;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "Lpf;")
    public static class17 field525 = new class17(64);

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "[I")
    public static int[] field527 = new int[14];

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field529 = 0;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field530 = 5063219;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "Laj;")
    public static class151 field528;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static void method202(int arg0) {
        field527 = null;
        field525 = null;
        if (arg0 != 64) {
            method205(89, (byte) 97, (Random) null);
        }
        field528 = null;
        field523 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZIZII)V")
    public static final void method203(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class108.method813(arg2, class201.field3241.length - 1, arg3, arg1, arg4, (byte) -106, arg0);
        field524++;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method204(byte arg0, int arg1) {
        field520++;
        if (arg1 == 100 && class152.field2537 > 0) {
            byte[] var2 = class182.field2894[--class152.field2537];
            class182.field2894[class152.field2537] = null;
            return var2;
        } else if (arg1 == 5000 && class289.field4768 > 0) {
            byte[] var3 = class249.field4216[--class289.field4768];
            class249.field4216[class289.field4768] = null;
            return var3;
        } else if (arg1 == 30000 && class16.field322 > 0) {
            byte[] var4 = class312.field5019[--class16.field322];
            class312.field5019[class16.field322] = null;
            return var4;
        } else {
            if (arg0 != -12) {
                field526 = -42;
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBLjava/util/Random;)I")
    public static final int method205(int arg0, byte arg1, Random arg2) {
        field521++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class283.method1970((byte) 106, arg0)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        } else {
            if (arg1 != 90) {
                field530 = -103;
            }
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class224.method1589(var4, arg0, (byte) 0);
        }
    }
}
