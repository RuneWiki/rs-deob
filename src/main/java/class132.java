import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class132 extends class735 {

    @OriginalMember(owner = "client!laa", name = "s", descriptor = "J")
    private long field2268 = -1L;

    @OriginalMember(owner = "client!laa", name = "A", descriptor = "Ljava/lang/String;")
    private String field2276 = null;

    @OriginalMember(owner = "client!laa", name = "v", descriptor = "[I")
    public static int[] field2271 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!laa", name = "t", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!laa", name = "u", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!laa", name = "w", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!laa", name = "x", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!laa", name = "y", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!laa", name = "z", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIIIILdja;)V", line = 4)
    public static final void method1105(int arg0, int arg1, int arg2, int arg3, int arg4, class326 arg5) {
        field2273++;
        if (arg1 > -33) {
            method1107(-61, -114);
        }
        if (arg4 < 1 || arg3 < 1 || (class483.field6515 - 2) < arg4 || class65.field926 - 2 < arg3) {
            return;
        }
        if (class325.field4448 == null) {
            return;
        }
        class237 var6 = class707.field9716.method1219(arg2, arg3, arg4, arg0, 120);
        if (var6 == null) {
            return;
        }
        if (var6 instanceof class313) {
            ((class313) var6).method1984(262144, arg5);
            return;
        }
        if (var6 instanceof class412) {
            ((class412) var6).method2440((byte) -120, arg5);
            return;
        }
        if ((var6 instanceof class263)) {
            ((class263) var6).method1719(3, arg5);
        } else if (var6 instanceof class717) {
            ((class717) var6).method3986(arg5, 0);
            return;
        }
        return;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Z)V", line = 47)
    public static void method1106(boolean arg0) {
        if (arg0) {
            field2271 = null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(II)V", line = 58)
    public static final void method1107(int arg0, int arg1) {
        if (arg1 <= 54) {
            field2269 = -99;
        }
        class135.field2283 = 1000000000L / (long) arg0;
        field2275++;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILfca;)V", line = 75)
    public final void method627(int arg0, class93 arg1) {
        if (arg1.method793((byte) 50) != 255) {
            arg1.field1442--;
            this.field2268 = arg1.method770((byte) 91);
        }
        field2272++;
        this.field2276 = arg1.method802(false);
        if (arg0 != 5) {
            this.method627(15, null);
        }
        if (class359.field4904) {
            System.out.println("memberhash:" + this.field2268 + " membername:" + this.field2276);
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(III)I", line = 101)
    public static final int method1108(int arg0, int arg1, int arg2) {
        if (arg2 <= 63) {
            method1108(-75, -51, -113);
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        field2274++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lrh;Z)V", line = 123)
    public final void method624(class280 arg0, boolean arg1) {
        field2270++;
        arg0.method1809((byte) -105, this.field2276, this.field2268);
        if (arg1) {
            method1106(true);
        }
    }
}
