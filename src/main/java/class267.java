import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class267 {

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field4207 = 0;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "J")
    public static long field4208;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4210;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Z")
    public static boolean field4206;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "[I")
    public static int[] field4205;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method1936(boolean arg0) {
        class319 var1 = class138.field1928;
        synchronized (class138.field1928) {
            class325.field4982 = class242.field3648;
            class43.field509++;
            if (class233.field3395 >= 0) {
                while (class90.field1127 != class233.field3395) {
                    int var3 = class217.field3057[class90.field1127];
                    class90.field1127 = class90.field1127 + 1 & 0x7F;
                    if (var3 < 0) {
                        class184.field2650[~var3] = false;
                    } else {
                        class184.field2650[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class184.field2650[var2] = false;
                }
                class233.field3395 = class90.field1127;
            }
            if (!arg0) {
                return;
            }
            class242.field3648 = class166.field2292;
        }
        field4204++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)Lgg;", line = 48)
    public static final class79 method1937(int arg0, int arg1, int arg2) {
        field4211++;
        for (class79 var3 = (class79) class335.field5171.method1540(63); var3 != null; var3 = (class79) class335.field5171.method1544(27)) {
            if (var3.field1012 && var3.method471(arg0, -19, arg1)) {
                return var3;
            }
        }
        if (arg2 > -90) {
            method1938(-110, 59, -32);
        }
        return null;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(III)J", line = 74)
    public static final long method1938(int arg0, int arg1, int arg2) {
        class225 var3 = class158.field2184[arg0][arg1][arg2];
        return var3 == null || var3.field3213 == null ? 0L : var3.field3213.field656;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lp;Z)Ljava/lang/String;", line = 84)
    public static final String method1939(class107 arg0, boolean arg1) {
        if (arg1) {
            field4203++;
            return class112.method764(-110, 32767, arg0);
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 99)
    public static void method1940(byte arg0) {
        field4210 = null;
        field4205 = null;
        if (arg0 <= 92) {
            field4206 = true;
        }
    }
}
