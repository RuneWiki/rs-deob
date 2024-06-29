import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class class758 {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "D")
    public static double field10571;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field10570;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field10572;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field10573;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field10574;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field10576;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Lda;")
    public static class402 field10575;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public abstract void method2226(byte arg0);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IC)Z")
    public static final boolean method4206(int arg0, char arg1) {
        if (arg0 == -91) {
            field10574++;
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIB[B)V")
    public abstract void method2221(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Luv;Z)Ljava/lang/String;")
    public static final String method4207(class755 arg0, boolean arg1) {
        field10570++;
        if (client.method2738(arg0).method1838((byte) 123) == 0) {
            return null;
        }
        if (arg1) {
            method4208((byte) -78);
        }
        if (arg0.field10408 == null || arg0.field10408.trim().length() == 0) {
            return class498.field6966 ? "Hidden-use" : null;
        } else {
            return arg0.field10408;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V")
    public static void method4208(byte arg0) {
        field10575 = null;
        if (arg0 != 20) {
            field10575 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public abstract void method2224(int arg0);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([BIIB)I")
    public abstract int method2227(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)Z")
    public abstract boolean method2223(byte arg0, int arg1) throws IOException;
}
