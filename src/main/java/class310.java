import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public abstract class class310 extends class34 {

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "Z")
    public volatile boolean field5342 = true;

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    public static int field5340 = 0;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "Lke;")
    public static class256 field5339 = class316.method2202("(Y", 27626);

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "Lke;")
    private static class256 field5343 = class316.method2202("Loading config )2 ", 27626);

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "Lke;")
    public static class256 field5350 = class316.method2202("gr-Un:", 27626);

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "[I")
    public static int[] field5349 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "Lke;")
    public static class256 field5351 = field5343;

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "[I")
    public static int[] field5352 = new int[500];

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "Z")
    public boolean field5341;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "Z")
    public boolean field5344;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lke;I)I", line = 31)
    public static final int method2150(class256 arg0, int arg1) {
        int var2 = 92 / ((60 - arg1) / 60);
        field5345++;
        for (int var3 = 0; var3 < class231.field3964.length; var3++) {
            if (class231.field3964[var3].method1769(arg0, (byte) 67)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V", line = 63)
    public static void method2151(byte arg0) {
        if (arg0 != -115) {
            return;
        }
        field5339 = null;
        field5349 = null;
        field5343 = null;
        field5351 = null;
        field5350 = null;
        field5352 = null;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)[B")
    public abstract byte[] method117(boolean arg0);

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "(I)I")
    public abstract int method118(int arg0);
}
