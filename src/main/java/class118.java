import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class118 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Lp;")
    public static class280 field2110 = class18.method140((byte) -127, "underlay");

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Lp;")
    public static class280 field2113 = class18.method140((byte) -122, ":");

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field2118 = 0;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Lp;")
    public static class280 field2121 = class18.method140((byte) -122, "loginscreen");

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Lp;")
    public static class280 field2116 = class18.method140((byte) -121, "Prendre");

    @OriginalMember(owner = "client!u", name = "k", descriptor = "[I")
    public static int[] field2120 = new int[256];

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Lp;")
    public static class280 field2119 = class18.method140((byte) -122, "details");

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Lug;")
    public static class198 field2117;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method843(String arg0, byte arg1) throws ClassNotFoundException {
        field2111++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else {
            if (arg1 > -38) {
                field2120 = null;
            }
            if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIB)I")
    public static final int method844(int arg0, int arg1, int arg2, byte arg3) {
        field2112++;
        if (arg3 != 119) {
            return 68;
        }
        if (arg1 > 243) {
            arg0 >>= 0x4;
        } else if (arg1 > 217) {
            arg0 >>= 0x3;
        } else if (arg1 > 192) {
            arg0 >>= 0x2;
        } else if (arg1 > 179) {
            arg0 >>= 0x1;
        }
        return (arg2 >> 2 << 10) + (arg0 >> 5 << 7) + (arg1 >> 1);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method845(int arg0) {
        field2117 = null;
        field2119 = null;
        field2110 = null;
        field2116 = null;
        field2121 = null;
        if (arg0 != 256) {
            field2120 = null;
        }
        field2120 = null;
        field2113 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(JI)V")
    public static final void method846(long arg0, int arg1) {
        field2114++;
        if (arg0 == 0L) {
            return;
        }
        class34.field627.method551(97, true);
        class34.field627.method219(arg0, -105);
        if (arg1 != -1026649567) {
            method846(-40L, -21);
        }
        class4.field115++;
    }
}
