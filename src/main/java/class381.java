import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class381 {

    @OriginalMember(owner = "client!uw", name = "k", descriptor = "S")
    public short field5094;

    @OriginalMember(owner = "client!uw", name = "h", descriptor = "I")
    public int field5091;

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
    public int field5086;

    @OriginalMember(owner = "client!uw", name = "l", descriptor = "B")
    public byte field5095;

    @OriginalMember(owner = "client!uw", name = "i", descriptor = "S")
    public short field5092;

    @OriginalMember(owner = "client!uw", name = "m", descriptor = "S")
    public short field5096;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "B")
    public byte field5084;

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "Z")
    public boolean field5087;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!uw", name = "j", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(BIIIII)V")
    public static final void method2189(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5085++;
        if (arg3 == arg5) {
            class559.method3125(arg3, false, arg2, arg4, arg1);
            return;
        }
        if (arg0 != 55) {
            method2193(79, 55, false);
        }
        if (class128.field1831 <= (arg4 - arg3) && arg3 + arg4 <= class529.field7169 && class469.field6466 <= arg1 - arg5 && class533.field7200 >= arg1 + arg5) {
            class165.method1161(arg5, (byte) 107, arg3, arg2, arg4, arg1);
        } else {
            class524.method2986(arg4, arg3, arg5, arg2, 67, arg1);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V")
    public static final void method2190(int arg0) {
        field5093++;
        class293.field4024.method3755(19713);
        class462.field6369.method3755(19713);
        class143.field2058.method3755(19713);
        class281.field3840.method3755(19713);
        if (arg0 >= -67) {
            method2192(-47, -41, 45, -12, true);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2191(int arg0, byte arg1, int arg2) {
        if (arg1 == -97) {
            field5090++;
            return (arg2 & 0x180) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIIIZ)Lql;")
    public static final class685 method2192(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5089++;
        class685 var5 = new class685();
        if (arg3 != 1) {
            method2189((byte) -114, -36, 35, -64, -58, 72);
        }
        var5.field9774 = arg2;
        var5.field9776 = arg1;
        class4.field26.method968((long) arg0, var5, -1);
        class319.method1922(arg1, -1);
        class78 var6 = class582.method3319((byte) -120, arg0);
        if (var6 != null) {
            class26.method255(var6, -20229);
        }
        if (class578.field8165 != null) {
            class26.method255(class578.field8165, -20229);
            class578.field8165 = null;
        }
        class32.method304(8);
        if (var6 != null) {
            class543.method3063(var6, (byte) 108, !arg4);
        }
        if (!arg4) {
            class97.method705(arg1);
        }
        if (!arg4 && class631.field8758 != -1) {
            class295.method1799((byte) -68, class631.field8758, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIZ)I")
    public static final int method2193(int arg0, int arg1, boolean arg2) {
        field5088++;
        if (arg2) {
            return 110;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
    public class381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field5094 = (short) arg6;
        this.field5091 = arg0;
        this.field5086 = arg10;
        this.field5095 = (byte) arg8;
        this.field5092 = (short) arg5;
        this.field5096 = (short) arg4;
        this.field5084 = (byte) arg7;
        this.field5087 = arg9;
    }
}
