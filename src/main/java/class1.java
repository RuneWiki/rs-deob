import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class1 extends class102 {

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "[S")
    public static short[] field1 = new short[256];

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "[I")
    public static int[] field5 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "F")
    public static float field4;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)J", line = 17)
    public static final long method1(int arg0, int arg1, int arg2) {
        class36 var3 = class129.field2184[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field531; var4++) {
            class209 var5 = var3.field544[var4];
            if ((var5.field3279 >> 29 & 0x3L) == 2L && var5.field3283 == arg1 && var5.field3291 == arg2) {
                return var5.field3279;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZB)V", line = 39)
    public static final void method2(boolean arg0, byte arg1) {
        field3++;
        if (class353.field5603 != arg0) {
            class353.field5603 = arg0;
            class340.method2395(-18581);
            int var2 = -97 / ((-arg1 - 67) / 52);
        }
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V", line = 72)
    public static void method3(int arg0) {
        field5 = null;
        if (arg0 == 2) {
            field1 = null;
        }
    }
}
