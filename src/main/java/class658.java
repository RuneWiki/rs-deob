import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class658 {

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field9104 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field9109 = -1;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field9105;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field9107;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "[I")
    public static int[] field9110;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V")
    public static final void method3696(boolean arg0) {
        if (arg0) {
            method3699(25, 8, 16, -74, -6);
        }
        if (class178.field2810 != null) {
            class178.field2810.method594(0);
            class178.field2810 = null;
            class435.field5928 = null;
        }
        field9107++;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZLpt;)Lpt;")
    public static final class558 method3697(boolean arg0, class558 arg1) {
        field9106++;
        if (arg0) {
            class558 var2 = arg1 == null ? new class558() : new class558(arg1);
            var2.method3222(9, 240, 128);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(Z)V")
    public static void method3698(boolean arg0) {
        field9110 = null;
        field9104 = null;
        if (arg0) {
            method3698(false);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method3699(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9105++;
        if (!class378.field5160 || !class633.field8766) {
            return false;
        } else if (arg1 != -22727) {
            return true;
        } else if (class22.field461 < 100) {
            return false;
        } else if (class757.method4186(arg2, (byte) -49, arg3, arg4)) {
            int var5 = arg3 << class654.field9055;
            int var6 = arg4 << class654.field9055;
            if (class307.method1955(class365.field4955, arg0, class365.field4955, -1, var6, var5, class745.field10286[arg2].method1897((byte) -34, arg4, arg3))) {
                class608.field8485++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
