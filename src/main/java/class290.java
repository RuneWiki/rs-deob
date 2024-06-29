import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class290 extends OutputStream {

    @OriginalMember(owner = "client!up", name = "b", descriptor = "[I")
    public static int[] field4241 = new int[32];

    @OriginalMember(owner = "client!up", name = "g", descriptor = "F")
    public static float field4246;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!up", name = "write", descriptor = "(I)V", line = 7)
    public final void write(int arg0) throws IOException {
        field4243++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(CB)I", line = 15)
    public static final int method1860(char arg0, byte arg1) {
        field4242++;
        if (arg1 < 87) {
            return 38;
        } else if (arg0 >= '\u0000' && class749.field10381.length > arg0) {
            return class749.field10381[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ILcga;Z)V", line = 37)
    public static final void method1861(int arg0, class506 arg1, boolean arg2) {
        if (arg1.field7194) {
            if (arg1.field7198 < 0 || class523.method3149(8, arg1.field7188, arg1.field7198)) {
                if (arg2) {
                    class665.method3791(null, (byte) 101, arg1.field7192, arg1.field7200, arg1.field7189, arg1.field7201);
                } else {
                    class754.method4196(arg1.field7201, arg1.field7192, -1, arg1.field7188, -2, arg1.field7200, arg1.field7198, arg1.field7187, arg1.field7189);
                }
                arg1.method3387((byte) 111);
            }
        } else if (arg1.field7197 && arg1.field7189 >= 1 && arg1.field7192 >= 1 && class768.field10571 - 2 >= arg1.field7189 && class350.field4898 - 2 >= arg1.field7192 && (arg1.field7202 < 0 || class523.method3149(8, arg1.field7199, arg1.field7202))) {
            if (arg2) {
                class665.method3791(arg1.field7195, (byte) 101, arg1.field7192, arg1.field7200, arg1.field7189, arg1.field7201);
            } else {
                class754.method4196(arg1.field7201, arg1.field7192, -1, arg1.field7199, -2, arg1.field7200, arg1.field7202, arg1.field7190, arg1.field7189);
            }
            arg1.field7197 = false;
            if (!arg2 && arg1.field7202 == arg1.field7198 && arg1.field7198 == -1) {
                arg1.method3387((byte) 117);
            } else if (!arg2 && arg1.field7202 == arg1.field7198 && arg1.field7190 == arg1.field7187 && arg1.field7199 == arg1.field7188) {
                arg1.method3387((byte) 127);
            }
        }
        if (arg0 > 3) {
            field4240++;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)Ljc;", line = 90)
    public static final class462 method1862(int arg0) {
        if (arg0 != 1) {
            method1863((byte) -47);
        }
        field4244++;
        return class686.field9533;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V", line = 101)
    public static void method1863(byte arg0) {
        if (arg0 != 8) {
            field4245 = -68;
        }
        field4241 = null;
    }
}
