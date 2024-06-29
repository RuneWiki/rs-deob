import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class268 extends InputStream {

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "Lim;")
    public static class353 field3419 = new class353(70, 0);

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "Luv;")
    public static class3 field3421 = new class3(78, 11);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
    public static void method1643(int arg0) {
        field3421 = null;
        int var1 = 27 / ((52 - arg0) / 34);
        field3419 = null;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V")
    public static final void method1644(int arg0) {
        class508.field7087 = new class447[class296.field3844.method2046((byte) 64)][];
        if (arg0 != 30000) {
            field3417 = 50;
        }
        field3420++;
        class567.field7930 = new class447[class296.field3844.method2046((byte) 64)][];
        class71.field965 = new boolean[class296.field3844.method2046((byte) 64)];
    }

    @OriginalMember(owner = "client!fn", name = "read", descriptor = "()I")
    public final int read() {
        field3418++;
        class353.method2204(30000L, 7806);
        return -1;
    }
}
