import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class189 extends class125 {

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "Loa;")
    public class99 field3331;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "[B")
    public static byte[] field3334 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "[I")
    public static int[] field3335 = new int[4];

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "Lwk;")
    public static class273 field3336 = new class273(32);

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "[I")
    public static int[] field3338 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "[[[I")
    public static int[][][] field3337;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public static final void method1288(int arg0) {
        class143.field2514.method1812(arg0 ^ 0xFFFFFFB1);
        field3332++;
        if (arg0 != 1) {
            field3334 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lpf;I)V")
    public static final void method1289(class288 arg0, int arg1) {
        field3330++;
        long var2 = (long) arg1;
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        if (arg0.field5045 == 0) {
            var2 = class130.method857(arg0.field5043, arg0.field5030, arg0.field5040);
        }
        if (arg0.field5045 == 1) {
            var2 = class117.method789(arg0.field5043, arg0.field5030, arg0.field5040);
        }
        if (arg0.field5045 == 2) {
            var2 = class240.method1565(arg0.field5043, arg0.field5030, arg0.field5040);
        }
        if (arg0.field5045 == 3) {
            var2 = class226.method1488(arg0.field5043, arg0.field5030, arg0.field5040);
        }
        if (var2 != 0L) {
            var6 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var4 = (int) var2 >> 14 & 0x1F;
            var5 = (int) var2 >> 20 & 0x3;
        }
        arg0.field5031 = var6;
        arg0.field5042 = var5;
        arg0.field5050 = var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIILpg;II)V")
    public static final void method1290(int arg0, int arg1, int arg2, int arg3, class75 arg4, int arg5, int arg6) {
        if (arg5 != -3) {
            field3334 = null;
        }
        field3333++;
        class259.method1676(arg4.field1325, arg0, 115, arg4.field1301, arg3, arg6, arg1, arg2);
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(B)V")
    public static void method1291(byte arg0) {
        field3337 = null;
        field3335 = null;
        field3338 = null;
        field3336 = null;
        if (arg0 != 52) {
            method1288(37);
        }
        field3334 = null;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class189() {
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Loa;I)V")
    public class189(class99 arg0, int arg1) {
        this.field3331 = arg0;
    }
}
