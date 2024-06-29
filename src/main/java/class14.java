import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class14 {

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "J")
    public static long field292 = 0L;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field293 = "rating: ";

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static final void method125(int arg0) {
        class233.field3646 = null;
        class280.field4553 = null;
        class45.field668 = null;
        if (arg0 != -32734) {
            field291 = 69;
        }
        class125.field2011 = null;
        class169.field2780 = null;
        field289++;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 < 15) {
            return;
        }
        int var7 = arg4 - arg6;
        int var8 = arg2 + arg6;
        int var9 = arg5 + arg6;
        field290++;
        for (int var10 = arg2; var10 < var8; var10++) {
            class309.method2096(arg1, arg0, (byte) -117, class232.field3629[var10], arg5);
        }
        int var11 = arg0 - arg6;
        for (int var12 = arg4; var12 > var7; var12--) {
            class309.method2096(arg1, arg0, (byte) -117, class232.field3629[var12], arg5);
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class232.field3629[var13];
            class309.method2096(arg1, var9, (byte) -117, var14, arg5);
            class309.method2096(arg1, arg0, (byte) -117, var14, var11);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    public static void method127(int arg0) {
        if (arg0 == 0) {
            field293 = null;
        }
    }
}
