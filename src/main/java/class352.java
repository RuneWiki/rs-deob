import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class352 extends OutputStream {

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Lkca;")
    public static class73 field5024 = new class73(11, -1);

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!lg", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field5023++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method2232(int arg0) {
        int var1 = 62 / ((-arg0 - 23) / 48);
        field5024 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BII)V")
    public static final void method2233(byte arg0, int arg1, int arg2) {
        if (arg0 <= 93) {
            return;
        }
        field5022++;
        if (class408.field6151 == class184.field2291) {
            if (!class242.method1612(arg2, 1, false, 0, -2, 1, 0, (byte) 68, arg1)) {
                class242.method1612(arg2, 1, false, 0, -3, 1, 0, (byte) 78, arg1);
            }
        } else if (!class242.method1612(arg2, 1, false, 0, -3, 1, 0, (byte) 93, arg1)) {
            class242.method1612(arg2, 1, false, 0, -2, 1, 0, (byte) 66, arg1);
        }
    }
}
