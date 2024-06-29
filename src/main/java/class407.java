import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class407 {

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "Lca;")
    public static class131 field5739 = class496.method2880((byte) -44);

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III)Z")
    public static final boolean method2411(int arg0, int arg1, int arg2) {
        field5741++;
        if (class710.method3922(arg1, (byte) -128, arg0)) {
            return class708.method3915(arg1, false, arg0) | (arg1 & 0xB000) != arg2 | class357.method2184(arg1, arg0, -106) ? true : (class710.method3920(arg0, arg1, -1) | class545.method3094(arg1, arg0, arg2 ^ 0x74FA)) & (arg0 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)Lon;")
    public static final class727 method2412(byte arg0) {
        field5740++;
        if (arg0 >= -21) {
            field5744 = -112;
        }
        try {
            return (class727) Class.forName("km").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIB)I")
    public final int method2413(int arg0, int arg1, byte arg2) {
        if (arg2 != -8) {
            method2415(-125, null, 27);
        }
        field5743++;
        int var4 = class84.field1083 <= arg1 ? arg1 : class84.field1083;
        if (class646.field8899 == this) {
            return 0;
        } else if (class421.field5992 == this) {
            return var4 - arg0;
        } else if (class53.field773 == this) {
            return (var4 - arg0) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(B)V")
    public static void method2414(byte arg0) {
        if (arg0 <= 39) {
            method2415(126, null, 112);
        }
        field5739 = null;
    }

    @OriginalMember(owner = "client!kfa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5738++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method2415(int arg0, String arg1, int arg2) {
        field5742++;
        class548 var3 = class696.method3872(arg2, 2, -1633381944);
        var3.method3130(68);
        if (arg0 >= 103) {
            var3.field7727 = arg1;
        }
    }
}
