import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class348 extends OutputStream {

    @OriginalMember(owner = "client!na", name = "e", descriptor = "J")
    public static long field4457 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!na", name = "d", descriptor = "F")
    public static float field4456;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "F")
    public static float field4458;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4459;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 11)
    public static void method1925(int arg0) {
        if (arg0 != -252896726) {
            method1925(71);
        }
        field4459 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)I", line = 21)
    public static final int method1926(int arg0, int arg1) {
        field4455++;
        if (arg1 != -252896726) {
            field4457 = -20L;
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)Lega;", line = 32)
    public static final class359 method1927(int arg0, int arg1) {
        field4453++;
        if (arg1 <= 89) {
            field4459 = null;
        }
        return new class359(arg0, false);
    }

    @OriginalMember(owner = "client!na", name = "write", descriptor = "(I)V", line = 52)
    public final void write(int arg0) throws IOException {
        field4454++;
        throw new IOException();
    }
}
