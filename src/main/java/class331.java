import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class331 extends class333 {

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "S")
    public short field4164;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "I")
    public static int field4170 = 0;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
    public static int field4169 = -1;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "Lsb;")
    public static class305 field4166 = new class305(10, 15);

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
    public static void method1917(byte arg0) {
        field4166 = null;
        if (arg0 < 61) {
            field4170 = 23;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public static final void method1918(int arg0) {
        if (arg0 != 16352) {
            method1917((byte) -116);
        }
        if (class405.field5420 != -1) {
            class185.method1124(-1, class405.field5420, -1, -1, false);
            class405.field5420 = -1;
        }
        field4167++;
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
    public class331() {
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBLtf;I)Lef;")
    public static final class581 method1919(int arg0, byte arg1, class701 arg2, int arg3) {
        field4165++;
        byte[] var4 = arg2.method3854((byte) 41, arg3, arg0);
        if (var4 == null) {
            return null;
        } else if (arg1 == -43) {
            return new class581(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1920(int arg0, String arg1) {
        field4168++;
        if (class378.field5122.startsWith("win")) {
            return arg1 + ".dll";
        } else if (class378.field5122.startsWith("linux")) {
            return "lib" + arg1 + ".so";
        } else if (class378.field5122.startsWith("mac")) {
            return "lib" + arg1 + ".dylib";
        } else {
            if (arg0 != 27893) {
                method1920(-90, null);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(S)V")
    public class331(short arg0) {
        this.field4164 = arg0;
    }
}
