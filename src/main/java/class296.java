import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class296 {

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field4684 = 0;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "[[[I")
    public static int[][][] field4687;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/StringBuffer;ICI)Ljava/lang/StringBuffer;")
    public static final StringBuffer method1982(StringBuffer arg0, int arg1, char arg2, int arg3) {
        if (arg1 != -127) {
            return null;
        }
        int var4 = arg0.length();
        field4686++;
        arg0.setLength(arg3);
        for (int var5 = var4; var5 < arg3; var5++) {
            arg0.setCharAt(var5, arg2);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Luh;BLpf;Lpf;)V")
    public static final void method1983(class103 arg0, byte arg1, class294 arg2, class294 arg3) {
        if (arg1 <= 52) {
            field4684 = -2;
        }
        class204.field3071 = arg2;
        class290.field4573 = arg3;
        class246.field3679 = arg0;
        if (class204.field3071 != null) {
            class71.field1134 = class204.field3071.method1976(1, 1);
        }
        if (class290.field4573 != null) {
            class244.field3658 = class290.field4573.method1976(1, 1);
        }
        field4683++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIBIII)V")
    public static final void method1984(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -78) {
            method1986((byte) -67);
        }
        int var6 = class86.method565(class243.field3635, arg4, class118.field1782, 8142);
        int var7 = class86.method565(class243.field3635, arg0, class118.field1782, arg2 + 8220);
        field4688++;
        int var8 = class86.method565(class248.field3765, arg3, class163.field2505, arg2 + 8220);
        int var9 = class86.method565(class248.field3765, arg1, class163.field2505, 8142);
        for (int var10 = var6; var10 <= var7; var10++) {
            class64.method429(class23.field284[var10], var8, (byte) 96, arg5, var9);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILpf;I)Lsb;")
    public static final class230 method1985(int arg0, int arg1, class294 arg2, int arg3) {
        field4690++;
        if (arg3 == -3) {
            return class66.method451(arg2, arg0, 2048, arg1) ? class83.method548((byte) 125) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public static void method1986(byte arg0) {
        if (arg0 == 105) {
            field4687 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)I")
    public static final int method1987(int arg0, int arg1, int arg2) {
        field4689++;
        if (arg0 != 65408) {
            method1982((StringBuffer) null, 113, (char) 65503, 91);
        }
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }
}
