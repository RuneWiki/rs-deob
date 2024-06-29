import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class148 extends InputStream {

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field2376 = 0;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2373 = "Loading - please wait.";

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "[[S")
    public static short[][] field2377 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 14)
    public static void method1148(int arg0) {
        if (arg0 != -4278) {
            method1150(-6, -63);
        }
        field2377 = (short[][]) null;
        field2373 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V", line = 31)
    public static final void method1149(int arg0, int arg1) {
        if (arg0 == 3650) {
            field2375++;
            class169.field2676.method2334(4, arg1);
            class59.field1010.method2334(4, arg1);
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)V", line = 54)
    public static final void method1150(int arg0, int arg1) {
        class140.field2307[2] = (float) class343.method2418(255, arg0) / 255.0F;
        class140.field2307[0] = (float) class343.method2418(arg0 >> 16, 255) / 255.0F;
        field2372++;
        class140.field2307[1] = (float) class343.method2418(255, arg0 >> 8) / 255.0F;
        class248.method1909((byte) -16, 3);
        class248.method1909((byte) -16, 4);
        if (arg1 != 28946) {
            method1150(110, -49);
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)I", line = 77)
    public static final int method1151(int arg0, int arg1) {
        field2378++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg1 != -13523) {
            field2376 = 77;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!ih", name = "read", descriptor = "()I", line = 122)
    public final int read() {
        field2374++;
        class283.method2076((byte) 89, 30000L);
        return -1;
    }
}
