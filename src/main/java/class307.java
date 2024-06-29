import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class307 extends InputStream {

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "[I")
    public static int[] field3879 = new int[8];

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "[S")
    private static short[] field3881 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "[S")
    private static short[] field3878 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "Z")
    public static boolean field3882 = false;

    @OriginalMember(owner = "client!ofa", name = "f", descriptor = "[S")
    private static short[] field3883 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
    public static int field3880 = 0;

    @OriginalMember(owner = "client!ofa", name = "h", descriptor = "[S")
    private static short[] field3885 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!ofa", name = "i", descriptor = "[[S")
    public static short[][] field3886 = new short[][] { field3878, field3885, field3881, field3883 };

    @OriginalMember(owner = "client!ofa", name = "j", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!ofa", name = "g", descriptor = "Luda;")
    public static class420 field3884;

    @OriginalMember(owner = "client!ofa", name = "k", descriptor = "[I")
    public static int[] field3888;

    @OriginalMember(owner = "client!ofa", name = "read", descriptor = "()I")
    public final int read() {
        field3887++;
        class700.method3867(29279, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)V")
    public static void method1823(int arg0) {
        field3886 = null;
        field3888 = null;
        field3881 = null;
        field3884 = null;
        field3878 = null;
        field3883 = null;
        field3885 = null;
        field3879 = null;
        if (arg0 != -31961) {
            field3882 = true;
        }
    }
}
