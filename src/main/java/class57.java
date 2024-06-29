import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class57 {

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field594 = 1400;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Ljo;")
    public static class303 field593;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "[I")
    public static int[] field592;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "[I")
    public static int[] field597;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILep;Z)V")
    public static final void method387(int arg0, class382 arg1, boolean arg2) {
        field595++;
        if (arg0 < 38) {
            return;
        }
        int var3 = arg1.field5064 == 0 ? arg1.field5035 : arg1.field5064;
        int var4 = arg1.field4976 == 0 ? arg1.field4958 : arg1.field4976;
        class509.method2926(var3, arg2, var4, class271.field3434[arg1.field5055 >> 16], 120, arg1.field5055);
        if (arg1.field4989 != null) {
            class509.method2926(var3, arg2, var4, arg1.field4989, 108, arg1.field5055);
        }
        class454 var5 = (class454) class234.field2982.method3234((byte) -102, (long) arg1.field5055);
        if (var5 != null) {
            class322.method1815(var3, arg2, var4, (byte) -31, var5.field6291);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIB)Z")
    public static final boolean method388(int arg0, int arg1, byte arg2) {
        int var3 = 82 / ((arg2 + 31) / 56);
        field591++;
        return class607.method3387(34, arg0, arg1) | (arg0 & 0x70000) != 0 || class354.method1959(759600449, arg1, arg0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZILjava/net/Socket;)Lqi;")
    public static final class518 method389(boolean arg0, int arg1, Socket arg2) throws IOException {
        field590++;
        if (arg0) {
            method388(92, -102, (byte) -38);
        }
        return new class291(arg2, arg1);
    }

    @OriginalMember(owner = "client!bd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field596++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method390(int arg0) {
        field592 = null;
        if (arg0 != -830098896) {
            field593 = null;
        }
        field593 = null;
        field597 = null;
    }
}
