import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class400 {

    @OriginalMember(owner = "client!pca", name = "i", descriptor = "I")
    public int field5384 = 0;

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "[C")
    private static char[] field5377 = new char[64];

    @OriginalMember(owner = "client!pca", name = "h", descriptor = "Lsb;")
    public static class305 field5383;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!pca", name = "g", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!pca", name = "k", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!pca", name = "f", descriptor = "Lbg;")
    public static class373 field5381;

    @OriginalMember(owner = "client!pca", name = "j", descriptor = "[[B")
    public static byte[][] field5385;

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "[[Z")
    public static boolean[][] field5379;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field5377[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field5377[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field5377[var2] = (char) (var2 + 48 - 52);
        }
        field5377[62] = '*';
        field5377[63] = '-';
        field5383 = new class305(21, 8);
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILvj;IIII)Lbr;", line = 5)
    public static final class196 method2251(int arg0, class422 arg1, int arg2, int arg3, int arg4, int arg5) {
        field5386++;
        int var6 = -55 / ((arg5 + 62) / 52);
        if (!arg1.field5966 && (!class483.method2792(arg4, -3) || !class483.method2792(arg3, -3))) {
            return arg1.field5919 ? new class196(arg1, 34037, arg2, arg0, arg4, arg3, true) : new class196(arg1, arg2, arg0, arg4, arg3, class553.method3138(1781323777, arg4), class553.method3138(1781323777, arg3), true);
        } else {
            return new class196(arg1, 3553, arg2, arg0, arg4, arg3, true);
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(BILnp;)V", line = 24)
    private final void method2252(byte arg0, int arg1, class115 arg2) {
        field5380++;
        if (arg0 < 24) {
            this.field5384 = 16;
        }
        if (arg1 == 5) {
            this.field5384 = arg2.method643((byte) -77);
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILnp;)V", line = 40)
    public final void method2253(int arg0, class115 arg1) {
        if (arg0 != 21) {
            return;
        }
        while (true) {
            int var3 = arg1.method620((byte) -128);
            if (var3 == 0) {
                field5376++;
                return;
            }
            this.method2252((byte) 65, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V", line = 60)
    public static void method2254(int arg0) {
        if (arg0 != 65) {
            return;
        }
        field5383 = null;
        field5377 = null;
        field5381 = null;
        field5379 = null;
        field5385 = null;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(BLr;)V", line = 74)
    public static final void method2255(byte arg0, class564 arg1) {
        if (arg0 != -103) {
            method2256((byte) -118);
        }
        for (class339 var2 = (class339) class369.field5054.method1672((byte) 94); var2 != null; var2 = (class339) class369.field5054.method1669(-2747)) {
            if (var2.field4281) {
                var2.method1948(arg1);
            }
        }
        field5382++;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)V", line = 127)
    public static final void method2256(byte arg0) {
        class196.field2265.method88(84);
        field5378++;
        class602.field8467.method88(111);
        if (arg0 <= 101) {
            method2254(-100);
        }
        class32.field308.method88(111);
        class204.field2411.method88(127);
    }
}
