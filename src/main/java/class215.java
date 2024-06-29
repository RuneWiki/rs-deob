import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public abstract class class215 extends class419 {

    @OriginalMember(owner = "client!vv", name = "p", descriptor = "Z")
    public boolean field2932 = false;

    @OriginalMember(owner = "client!vv", name = "y", descriptor = "Z")
    public boolean field2941 = false;

    @OriginalMember(owner = "client!vv", name = "r", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!vv", name = "q", descriptor = "I")
    public int field2933;

    @OriginalMember(owner = "client!vv", name = "v", descriptor = "S")
    public short field2938;

    @OriginalMember(owner = "client!vv", name = "t", descriptor = "I")
    public int field2936;

    @OriginalMember(owner = "client!vv", name = "s", descriptor = "Lwq;")
    public static class115 field2935 = new class115(9, 3);

    @OriginalMember(owner = "client!vv", name = "x", descriptor = "[[I")
    public static int[][] field2940 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!vv", name = "u", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!vv", name = "z", descriptor = "[I")
    public static int[] field2942;

    @OriginalMember(owner = "client!vv", name = "w", descriptor = "[[B")
    public static byte[][] field2939;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)I")
    public static final int method1371(int arg0, int arg1, int arg2) {
        field2937++;
        if (arg2 == 1 || arg2 == 3) {
            return class300.field3940[arg1 & 0x3];
        } else if (arg0 == 3) {
            return class307.field4120[arg1 & 0x3];
        } else {
            return 117;
        }
    }

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "(B)V")
    public static void method1372(byte arg0) {
        field2935 = null;
        if (arg0 != 69) {
            field2940 = null;
        }
        field2940 = null;
        field2939 = null;
        field2942 = null;
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(IIIIZZ)V")
    public class215(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field2941 = arg5;
        this.field2932 = arg4;
        this.field2934 = arg0;
        this.field2933 = arg1;
        this.field2938 = (short) arg3;
        this.field2936 = arg2;
    }
}
