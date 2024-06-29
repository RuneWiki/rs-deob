import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public abstract class class313 {

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public static int field4300 = 0;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "Ldb;")
    public static class298 field4303 = new class298(49, -1);

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "F")
    public static float field4307;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
    public int field4301;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "Ljava/lang/String;")
    public String field4308;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V", line = 3)
    public static void method1866(byte arg0) {
        field4303 = null;
        int var1 = 109 / ((arg0 + 61) / 50);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(III)V", line = 14)
    public static final void method1867(int arg0, int arg1, int arg2) {
        field4304++;
        class382 var3 = class396.method2276(-78, arg1, 0);
        var3.method2232(123);
        var3.field5099 = arg2;
        var3.field5106 = arg0;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V", line = 31)
    public static final void method1868(int arg0) {
        if (class356.field4835 != null) {
            class356.field4835.method3574(-121);
            class356.field4835 = null;
            class516.field6893 = null;
        }
        if (arg0 != 15) {
            field4306 = 118;
        }
        field4305++;
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)Ljava/net/Socket;", line = 48)
    public final Socket method1869(int arg0) throws IOException {
        field4309++;
        return arg0 == 0 ? new Socket(this.field4308, this.field4301) : null;
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method1870(int arg0) throws IOException;
}
