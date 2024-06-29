import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class227 {

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field3443 = 1;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "F")
    public static float field3444;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Laj;")
    public static class209 field3442;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Lgt;")
    public static class66 field3445;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([[BZLks;)V", line = 3)
    public static final void method1550(byte[][] arg0, boolean arg1, class23 arg2) {
        if (arg1) {
            return;
        }
        field3441++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class194 var11 = new class194(var10);
                int var12 = class277.field4348[var5] >> 8;
                int var13 = class277.field4348[var5] & 0xFF;
                int var14 = var12 * 64 - class422.field6201;
                int var15 = var13 * 64 - class23.field273;
                class425.method2644(27576);
                arg2.method1597(var14, class23.field273, class463.field6857, class422.field6201, var15, var11, -97);
                arg2.method142(var15, !arg1, class376.field5542, var11, var3, var14);
                if (!arg2.field3522 && (class50.field769 / 8) == var12 && (class339.field5086 / 8) == var13 && var3[0] != -1) {
                    class114.field1751 = class335.field5044.method1976(class436.field6496, var3[3], var3[1], (byte) -111, var3[2], var3[0]);
                    class319.field4842 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class277.field4348[var6] >> 8) * 64 - class422.field6201;
            int var8 = (class277.field4348[var6] & 0xFF) * 64 - class23.field273;
            byte[] var9 = arg0[var6];
            if (var9 == null && class339.field5086 < 800) {
                class425.method2644(27576);
                arg2.method1595(var8, 64, var7, 64, 110);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)V", line = 82)
    public static final void method1551(String arg0, byte arg1, String arg2, int arg3) {
        int var4 = 53 % ((-arg1 - 30) / 63);
        field3440++;
        class23.field262 = 2;
        class125.field1877 = arg3;
        class236.method1602(arg2, arg0, -119);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 98)
    public static void method1552(byte arg0) {
        if (arg0 != -16) {
            field3445 = null;
        }
        field3445 = null;
        field3442 = null;
    }
}
