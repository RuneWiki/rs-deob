import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class446 extends class299 {

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "B")
    public byte field6429 = 5;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "Lng;")
    public static class190 field6433 = new class190(64);

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "F")
    public static float field6436;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public int field6426;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public int field6427;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "I")
    public int field6430;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    public int field6431;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    public int field6432;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    public int field6437;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "Lqj;")
    public static class296 field6438;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "[[[B")
    public static byte[][][] field6435;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZIIII)I", line = 6)
    public static final int method2782(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field6428++;
        if (arg0) {
            int var5 = 65536 - class362.field5082[arg4 * 8192 / arg2] >> 1;
            return ((65536 - var5) * arg1 >> 16) + (arg3 * var5 >> 16);
        } else {
            return -112;
        }
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V", line = 19)
    public static void method2783(int arg0) {
        field6433 = null;
        field6438 = null;
        field6435 = null;
        int var1 = 43 / ((arg0 + 51) / 55);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BIIIIII)V", line = 40)
    public static final void method2784(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class379.field5397 <= (arg2 - arg3) && arg2 + arg3 <= class43.field659 && class300.field4164 <= (arg6 - arg3) && arg3 + arg6 <= class398.field5827) {
            class63.method428(arg4, arg5, arg1, arg6, arg2, arg3, 28235);
        } else {
            class86.method602(arg6, -9934, arg3, arg4, arg1, arg5, arg2);
        }
        int var7 = 11 % ((arg0 - 18) / 47);
        field6434++;
    }
}
