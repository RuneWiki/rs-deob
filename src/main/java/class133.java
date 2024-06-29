import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class133 extends class205 {

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    private int field2050 = 0;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "Z")
    public boolean field2049 = false;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    private int field2057 = 0;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    private int field2048 = -1;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
    private int field2065 = -32768;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "I")
    public int field2059;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    private int field2052;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    public int field2063;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
    public int field2064;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    public int field2047;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public int field2042;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "Lql;")
    private class223 field2061;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public static int field2041 = -1;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    public static int field2056 = 0;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
    public static int field2060 = 0;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "Lrj;")
    public static class8 field2045 = new class8();

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "Luf;")
    public static class176 field2055;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "Lgj;")
    private class240 field2043;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)V")
    public final void method927(byte arg0, int arg1) {
        field2051++;
        if (this.field2049) {
            return;
        }
        this.field2057 += arg1;
        while (this.field2061.field3488[this.field2050] < this.field2057) {
            this.field2057 -= this.field2061.field3488[this.field2050];
            this.field2050++;
            if (this.field2050 >= this.field2061.field3484.length) {
                this.field2049 = true;
                break;
            }
        }
        if (arg0 <= 121) {
            method928(54, 118, 58, 99, 122);
        }
        if (!this.field2049) {
            class56.method452((byte) -68, this.field2050, this.field2063, this.field2061, false, this.field2059);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "()I")
    public final int method223() {
        field2046++;
        return this.field2065;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIIII)V")
    public static final void method928(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 3668) {
            return;
        }
        field2054++;
        if (arg3 > arg1) {
            class263.method1788(arg1, -18732, arg4, class156.field2379[arg0], arg3);
        } else {
            class263.method1788(arg3, -18732, arg4, class156.field2379[arg0], arg1);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIIIJILgj;)V")
    public final void method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class240 arg10) {
        class233 var13 = this.method931((byte) 76);
        field2058++;
        if (var13 != null) {
            var13.method225(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2043);
            this.field2065 = var13.method223();
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ)I")
    public static final int method929(int arg0, boolean arg1) {
        field2044++;
        if (arg1) {
            method932((byte) 48);
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static void method930(byte arg0) {
        field2055 = null;
        field2045 = null;
        if (arg0 < 58) {
            field2041 = 30;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIII)V")
    public final void method227(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2053++;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)Lrg;")
    private final class233 method931(byte arg0) {
        field2062++;
        if (arg0 < 49) {
            return null;
        }
        class259 var2 = class23.method189(this.field2052, (byte) -123);
        class233 var3;
        if (this.field2049) {
            var3 = var2.method1717(0, -1, -1, -29868);
        } else {
            var3 = var2.method1717(this.field2057, this.field2048, this.field2050, -29868);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)Lek;")
    public static final class166 method932(byte arg0) {
        if (arg0 != -83) {
            field2056 = 3;
        }
        field2066++;
        try {
            return (class166) Class.forName("ea").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(IIIIIII)V")
    public class133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2059 = arg3;
        this.field2052 = arg0;
        this.field2063 = arg2;
        this.field2064 = arg6 + arg5;
        this.field2047 = arg1;
        this.field2042 = arg4;
        int var8 = class23.method189(this.field2052, (byte) 35).field3963;
        if (var8 == -1) {
            this.field2049 = true;
        } else {
            this.field2049 = false;
            this.field2061 = class28.method224(var8, 70);
        }
        if (this.field2064 == arg6) {
            class56.method452((byte) 95, this.field2050, this.field2063, this.field2061, false, this.field2059);
        }
    }
}
