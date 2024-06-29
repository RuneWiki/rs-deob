import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class148 extends class479 {

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Luj;")
    public static class259 field2360 = new class259();

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field2361 = 0;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "[I")
    public static int[] field2363 = new int[1024];

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field2365 = 2;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "Lrn;")
    public static class174 field2366 = new class174(27, -1);

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field2368 = -1;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field2369 = new String[100];

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "F")
    public static float field2367;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "[I")
    public static int[] field2364;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Z")
    public static final boolean method1139(int arg0, int arg1, int arg2) {
        if (arg2 != 21162) {
            method1140(true);
        }
        field2359++;
        return class319.method2082(arg1, arg0, true) || class457.method2723(arg0, -8, arg1);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public static void method1140(boolean arg0) {
        field2364 = null;
        field2366 = null;
        field2360 = null;
        field2363 = null;
        field2369 = null;
        if (arg0) {
            field2361 = -47;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
    public static final void method1141(byte arg0) {
        class83.field1448 = false;
        class495.field7315 = 0;
        class350.field5217 = 1;
        field2362++;
        class106.field1764 = -1;
        class68.field1169 = -3;
        class369.field5586 = 0;
        if (arg0 == 121) {
            class190.field2835 = 0;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBIII)I")
    public static final int method1142(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2358++;
        if (arg1 > -126) {
            method1142(-96, (byte) -78, -104, 11, 106);
        }
        int var5 = 65536 - class528.field7786[arg2 * 8192 / arg3] >> 1;
        return ((65536 - var5) * arg0 >> 16) + (arg4 * var5 >> 16);
    }
}
