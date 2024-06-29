import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class252 {

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Z")
    public static boolean field4402 = false;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field4406 = 0;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field4409 = 0;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field4411 = 0;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public int field4410;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Lcg;")
    public class42 field4403;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "[I")
    public int[] field4407;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "[I")
    public static int[] field4408;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "[[S")
    public static short[][] field4404;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BII)V", line = 16)
    public static final void method1799(byte arg0, int arg1, int arg2) {
        int var3 = -84 % ((-arg0 - 64) / 48);
        class122 var4 = class323.method2175(1, arg1, -25873);
        field4400++;
        var4.method862(-29044);
        var4.field2144 = arg2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZJ)Ljf;", line = 30)
    public static final class229 method1800(boolean arg0, long arg1) {
        field4401++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            if (arg0) {
                field4409 = -37;
            }
            while (var4 != 0L) {
                var3++;
                var4 /= 37L;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class120.field2126[(int) (var7 - (arg1 * 37L))];
            }
            class229 var9 = new class229();
            var9.field3944 = var6;
            var9.field3973 = var6.length;
            return var9;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 98)
    public static void method1801(int arg0) {
        int var1 = -9 / ((-arg0) / 36);
        field4408 = null;
        field4404 = (short[][]) null;
    }
}
