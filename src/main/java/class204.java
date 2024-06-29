import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class204 {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "[I")
    public static int[] field3287 = new int[5];

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3286 = new String[1000];

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3290 = "flash1:";

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3288 = 10;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "[I")
    public static int[] field3285 = new int[32];

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method1462(int arg0) {
        field3287 = null;
        field3285 = null;
        field3290 = null;
        if (arg0 > -101) {
            method1463(false, -52, 66, true, -25);
        }
        field3286 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZIIZI)V")
    public static final void method1463(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class74.field1155 = 0L;
        int var5 = class115.method725((byte) 94);
        field3289++;
        boolean var6 = arg0;
        if (arg2 <= 0 != var5 <= 0) {
            var6 = true;
        }
        if (arg2 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (class255.field4203.startsWith("mac") && arg2 > 0) {
            arg3 = true;
        }
        if (arg3 && arg2 > 0) {
            var6 = true;
        }
        class22.method127(arg3, var6, true, arg4, arg1, arg2, var5);
    }
}
