import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class527 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field7766 = 503;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Z")
    public static boolean field7767 = false;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Ljc;")
    public static class356 field7768 = new class356(5, 19);

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field7769;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field7770;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Lla;")
    public static class296 field7765;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method3125(int arg0) {
        field7765 = null;
        if (arg0 <= 5) {
            field7768 = null;
        }
        field7768 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BII)V")
    public static final void method3126(byte arg0, int arg1, int arg2) {
        field7771++;
        if (arg0 == -114) {
            class266 var3 = class308.method1961(true, arg1, 1);
            var3.method1781((byte) 95);
            var3.field4454 = arg2;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;I[BI)I")
    public static final int method3127(String arg0, int arg1, byte[] arg2, int arg3) {
        field7769++;
        int var4 = arg0.length();
        int var5 = arg3;
        int var6 = 0;
        if (arg1 != -4) {
            method3126((byte) 34, -79, 13);
        }
        while (var4 > var6) {
            char var7 = arg0.charAt(var6);
            if (var7 <= '\u007F') {
                arg2[var5++] = (byte) var7;
            } else if (var7 > '߿') {
                arg2[var5++] = (byte) (class338.method2141(var7, 921052) >> 12);
                arg2[var5++] = (byte) class338.method2141(class344.method2224(var7 >> 6, 63), 128);
                arg2[var5++] = (byte) class338.method2141(class344.method2224(63, var7), 128);
            } else {
                arg2[var5++] = (byte) (class338.method2141(var7, 12320) >> 6);
                arg2[var5++] = (byte) class338.method2141(128, class344.method2224(var7, 63));
            }
            var6++;
        }
        return var5 - arg3;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3128(int arg0, int arg1, byte arg2) {
        field7770++;
        if (arg2 >= -81) {
            return false;
        } else {
            return (arg0 & 0x70000) != 0 | class140.method1042(arg0, 34, arg1) || class163.method1122(arg0, 16619, arg1);
        }
    }
}
