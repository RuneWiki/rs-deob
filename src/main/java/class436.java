import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class436 extends InputStream {

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "Lqv;")
    public static class316 field6227 = new class316(44, 12);

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)[Ldh;")
    public static final class216[] method2569(int arg0) {
        field6228++;
        if (arg0 != 12) {
            method2570(78, -39, -90);
        }
        return new class216[] { class368.field5309, class356.field5181, class190.field2781, class258.field3830, class24.field351, class475.field6930, class166.field2494, class216.field3241, class369.field5325, class448.field6437, class393.field5592, class159.field2439, class195.field2819, class69.field1145, class512.field7448 };
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)I")
    public static final int method2570(int arg0, int arg1, int arg2) {
        if (arg1 != -32476) {
            field6227 = null;
        }
        field6229++;
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
    public static void method2571(int arg0) {
        if (arg0 == 44) {
            field6227 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "read", descriptor = "()I")
    public final int read() {
        class477.method2826(30000L, 0);
        field6226++;
        return -1;
    }
}
