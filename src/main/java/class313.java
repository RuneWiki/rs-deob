import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class313 {

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Lma;")
    public static class263 field5305 = null;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Ltl;")
    public static class59 field5303 = class85.method639("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 9588);

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Z")
    public static boolean field5308 = false;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "Ltl;")
    public static class59 field5310 = class85.method639("unzap", 9588);

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Ltl;")
    public static class59 field5307 = class85.method639("Lade)3)3)3", 9588);

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Ltl;")
    public static class59 field5311 = class85.method639("Spielwelt erstellt)3", 9588);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public int field5300;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "Ltl;")
    public class59 field5306;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)[F", line = 21)
    public static final float[] method2158(byte arg0) {
        float var1 = class141.method1028() + class141.method1032();
        int var2 = class141.method1027();
        float var3 = (float) ((var2 & 0xFF80) >> 8) / 255.0F;
        class190.field3177[3] = 1.0F;
        float var4 = (float) (var2 >> 16 & 0xFF) / 255.0F;
        float var5 = (float) (var2 & 0xFF) / 255.0F;
        field5309++;
        int var6 = -111 % ((arg0 + 33) / 58);
        float var7 = 0.58823526F;
        class190.field3177[2] = class300.field5137[2] * var5 * var7 * var1;
        class190.field3177[1] = class300.field5137[1] * var3 * var7 * var1;
        class190.field3177[0] = class300.field5137[0] * var4 * var7 * var1;
        return class190.field3177;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIII)V", line = 45)
    public static final void method2159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5302++;
        if (arg2 >= -56) {
            method2159(-13, 105, -85, -15, 75, -95, -19, -47);
        }
        if (arg6 == arg7) {
            class4.method30(arg4, arg5, arg7, arg0, arg3, true, arg1);
        } else if (class69.field1061 <= (arg3 - arg7) && class153.field2504 >= (arg3 + arg7) && (arg1 - arg6) >= class28.field369 && (arg1 + arg6) <= class62.field957) {
            class38.method253(arg5, arg3, arg4, (byte) -111, arg7, arg6, arg0, arg1);
        } else {
            class270.method1887(arg0, -26209, arg5, arg6, arg7, arg4, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V", line = 85)
    public static void method2160(byte arg0) {
        field5311 = null;
        field5310 = null;
        field5307 = null;
        field5303 = null;
        field5305 = null;
        int var1 = -76 / ((-arg0) / 63);
    }
}
