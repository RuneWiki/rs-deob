import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class248 extends OutputStream {

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field3363 = 0;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "[[Z")
    public static boolean[][] field3368 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "J")
    public static long field3367 = 0L;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "[Lkh;")
    public static class11[] field3369;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Ljf;III)V", line = 3)
    public static final void method1559(class119 arg0, int arg1, int arg2, int arg3) {
        field3364++;
        if (arg1 == 0) {
            class75.field833 = arg3;
            class133.field1840 = arg0;
            class382.field5611 = arg2;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 21)
    public static void method1560(int arg0) {
        field3368 = null;
        field3369 = null;
        if (arg0 != 0) {
            method1559((class119) null, -34, -21, -102);
        }
    }

    @OriginalMember(owner = "client!gr", name = "write", descriptor = "(I)V", line = 35)
    public final void write(int arg0) throws IOException {
        field3365++;
        throw new IOException();
    }
}
