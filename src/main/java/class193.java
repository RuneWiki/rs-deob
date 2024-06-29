import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class193 extends class109 {

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Lia;")
    public static class257 field3283 = class28.method234(-72, "::rect_debug");

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "[I")
    public static int[] field3287;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1301(int arg0, byte[] arg1) {
        field3284++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class86.method644(arg1, 0, var3, arg0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZI)I")
    public static final int method1302(boolean arg0, int arg1) {
        field3286++;
        if (arg0) {
            method1303(68);
        }
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
    public static void method1303(int arg0) {
        if (arg0 == -5652) {
            field3283 = null;
            field3287 = null;
        }
    }
}
