import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class563 implements class515 {

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public int field7032;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Lsv;")
    public static class617 field7031 = new class617();

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Ldr;")
    public static class675 field7033 = new class675(68, -1);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Lpfa;")
    public static class275 field7029;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lpfa;")
    public static class275 field7034;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Lpfa;")
    public static class275 field7035;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method2989(int arg0, byte arg1) {
        if (arg1 <= 4) {
            field7027 = 124;
        }
        field7028++;
        class243 var2 = class546.method2926(arg0, 7, true);
        var2.method1455(true);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 17)
    public static void method2990(int arg0) {
        field7035 = null;
        field7031 = null;
        if (arg0 != 0) {
            field7034 = null;
        }
        field7034 = null;
        field7029 = null;
        field7033 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BJ)V", line = 33)
    public static final void method2991(byte arg0, long arg1) {
        field7025++;
        if (arg0 <= 13) {
            return;
        }
        int var3 = class339.field4335 + class67.field815.field8018;
        int var4 = class3.field27 + class67.field815.field8011;
        if (class415.field5323 - var3 < -2000 || class415.field5323 - var3 > 2000 || class305.field3862 - var4 < -2000 || (class305.field3862 - var4) > 2000) {
            class305.field3862 = var4;
            class415.field5323 = var3;
        }
        if (class415.field5323 != var3) {
            int var5 = var3 - class415.field5323;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class415.field5323 += var6;
        }
        if (!class611.field8310.field8695) {
            class689.field9561 += (float) arg1 * class350.field4524 / 6.0F;
            class23.field266 += (float) arg1 * class441.field5547 / 6.0F;
        }
        if (class305.field3862 != var4) {
            int var7 = var4 - class305.field3862;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class305.field3862 += var8;
        }
        class305.method1819((byte) -123);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)Z", line = 127)
    public static final boolean method2992(boolean arg0, int arg1) {
        field7030++;
        class256.field3280 = arg0;
        class340.field4343 = arg1 + 1 & 0xFFFF;
        return true;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Ljd;", line = 141)
    public final class216 method20(byte arg0) {
        field7026++;
        int var2 = -84 / ((-arg0 - 27) / 42);
        return class340.field4342;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(I)V", line = 151)
    public class563(int arg0) {
        this.field7032 = arg0;
    }
}
