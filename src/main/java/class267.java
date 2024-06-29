import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class267 {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "[I")
    public static int[] field4067 = new int[32];

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "[S")
    public static short[] field4072;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "Z")
    public static volatile boolean field4069;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "[I")
    public static int[] field4076;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "Z")
    public static boolean field4078;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public int field4070;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public int field4073;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public int field4074;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public int field4075;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "[I")
    public static int[] field4071;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4067[var1] = var0 - 1;
            var0 += var0;
        }
        field4072 = new short[] { 40, 38, 18, 33, 43, 24, 41, 6 };
        field4069 = true;
        field4076 = new int[32];
        field4077 = 255;
        field4078 = true;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V", line = 10)
    public static void method1972(byte arg0) {
        field4076 = null;
        field4072 = null;
        field4071 = null;
        field4067 = null;
        int var1 = -97 % ((-arg0 - 1) / 39);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Lsm;", line = 41)
    public static final class47 method1973(int arg0, int arg1, int arg2) {
        class167 var3 = class302.field4502[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class47 var4 = var3.field2402;
            var3.field2402 = null;
            return var4;
        }
    }
}
