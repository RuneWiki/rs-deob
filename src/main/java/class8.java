import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class8 {

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "J")
    public long field170 = 0L;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Lia;")
    public static class257 field166 = class28.method234(80, " )2> ");

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public int field161;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public int field171;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public int field173;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public int field176;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lij;")
    public class166 field169;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Lij;")
    public class166 field172;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "[Lme;")
    public static class44[] field160;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method109(int arg0) {
        field160 = null;
        field166 = null;
        if (arg0 != 3963) {
            method109(80);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lia;I)Lia;")
    public static final class257 method110(class257 arg0, int arg1) {
        field163++;
        class209 var2 = class39.method315(true, arg0);
        if (var2 == null) {
            return class89.field1716;
        } else if (arg1 <= 25) {
            return null;
        } else {
            return var2.field3585;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method111(byte[] arg0, boolean arg1) {
        field167++;
        class152 var2 = new class152(arg0);
        int var3 = var2.method1051((byte) -93);
        int var4 = var2.method1042(127);
        if (var4 < 0 || !(class109.field2025 == 0 || class109.field2025 >= var4)) {
            throw new RuntimeException();
        } else if (arg1) {
            return null;
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1050(var7, 0, (byte) 108, var4);
            return var7;
        } else {
            int var5 = var2.method1042(126);
            if (var5 < 0 || !(class109.field2025 == 0 || var5 <= class109.field2025)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class49.method387(var6, var5, arg0, var4, 9);
            } else {
                class17.field375.method1162(var2, 30661, var6);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method112(Random arg0, int arg1, int arg2) {
        field168++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        }
        if (arg2 >= -109) {
            field174 = 104;
        }
        if (class15.method159((byte) -101, arg1)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        }
        int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
        int var4;
        do {
            var4 = arg0.nextInt();
        } while (var3 <= var4);
        return class112.method813(var4, (byte) 120, arg1);
    }
}
