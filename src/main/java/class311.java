import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class311 {

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field5267 = 1;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Lmh;")
    public static class128 field5268 = class22.method156(126, "Liste der Welten geladen");

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "[I")
    public static int[] field5270 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field5272 = 2301979;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "J")
    public static volatile long field5269 = 0L;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Ldj;")
    public static class314 field5266;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)I", line = 38)
    public static final int method2113(int arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        field5273++;
        int var5 = -24 % ((23 - arg0) / 32);
        return arg1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 113)
    public static void method2114(int arg0) {
        field5270 = null;
        if (arg0 <= -59) {
            field5268 = null;
            field5266 = null;
        }
    }
}
