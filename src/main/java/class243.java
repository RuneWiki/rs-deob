import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class243 {

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public int field4272 = -1;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Z")
    public static boolean field4265 = false;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Lid;")
    public static class149 field4268 = class60.method382("Lade Konfiguration )2 ", (byte) 124);

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Z")
    public static boolean field4269 = false;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "F")
    public static float field4273;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Lm;")
    public class116 field4267;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "Lee;")
    public static class280 field4276;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "[I")
    public int[] field4274;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "[Lid;")
    public class149[] field4270;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lug;III)V")
    public static final void method1690(class199 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class181.field3264) {
            class231 var4 = class261.field4664[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field4048 != null && var4.field4048.field1764.method1364()) {
                arg0.method1360(var4.field4048.field1764, 128, 0, 0, true);
            }
        }
        if (arg3 < class181.field3264) {
            class231 var5 = class261.field4664[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field4048 != null && var5.field4048.field1764.method1364()) {
                arg0.method1360(var5.field4048.field1764, 0, 0, 128, true);
            }
        }
        if (arg2 < class181.field3264 && arg3 < class129.field2291) {
            class231 var6 = class261.field4664[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field4048 != null && var6.field4048.field1764.method1364()) {
                arg0.method1360(var6.field4048.field1764, 128, 0, 128, true);
            }
        }
        if (arg2 < class181.field3264 && arg3 > 0) {
            class231 var7 = class261.field4664[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field4048 != null && var7.field4048.field1764.method1364()) {
                arg0.method1360(var7.field4048.field1764, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public static void method1691(byte arg0) {
        field4268 = null;
        field4276 = null;
        int var1 = -103 % ((arg0 - 31) / 49);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Lid;")
    public static final class149 method1692(int arg0, byte arg1) {
        field4271++;
        if (arg0 < 999999999) {
            return class211.method1434(arg0, true);
        } else if (arg1 == 11) {
            return class254.field4448;
        } else {
            return null;
        }
    }
}
