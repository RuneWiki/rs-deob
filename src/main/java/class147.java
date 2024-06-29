import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class class147 extends class291 {

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
    public int field2131;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "I")
    public int field2133;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
    public int field2123;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public int field2119;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public int field2121;

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "I")
    public int field2134;

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "I")
    public int field2132;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "Lwj;")
    public static class270 field2117 = new class270(21, 2);

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public static int field2130 = 0;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field2127 = new String[100];

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "[Lcq;")
    public static class327[] field2136 = new class327[14];

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "I")
    public static int field2135 = -1;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "Ldi;")
    public static class83 field2128 = new class83(19, 8);

    @OriginalMember(owner = "client!hm", name = "x", descriptor = "Lnj;")
    public static class162 field2137 = new class162(10);

    @OriginalMember(owner = "client!hm", name = "y", descriptor = "I")
    public static int field2138 = 0;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!hm", name = "A", descriptor = "Ljava/awt/Frame;")
    public static Frame field2140;

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "Z")
    public static boolean field2139;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B[BI)I")
    public static final int method986(byte arg0, byte[] arg1, int arg2) {
        field2120++;
        if (arg0 != 62) {
            field2137 = null;
        }
        return class23.method137(arg1, 0, arg2, arg0 + 28);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BI)V")
    public static final void method987(byte arg0, int arg1) {
        class495.field7230 = -1;
        field2124++;
        class295.field4056 = -1;
        class299.field4107 = arg1;
        if (arg0 != -126) {
            method987((byte) 49, -30);
        }
        class279.method1660(false);
    }

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "(I)I")
    public abstract int method988(int arg0);

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "(I)V")
    public static void method989(int arg0) {
        field2127 = null;
        int var1 = 10 / ((arg0 - 69) / 43);
        field2137 = null;
        field2128 = null;
        field2117 = null;
        field2140 = null;
        field2136 = null;
    }

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "(I)V")
    public final void method495(int arg0) {
        field2126++;
        if (arg0 > -104) {
            field2137 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lya;IZLij;III)V")
    public final void method498(class38 arg0, int arg1, boolean arg2, class291 arg3, int arg4, int arg5, int arg6) {
        field2129++;
        if (arg6 != -1) {
            this.method492(-107);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(IIIIIII)V")
    public class147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2131 = arg1;
        this.field2133 = arg6;
        this.field2123 = arg4;
        this.field2119 = arg0;
        this.field2121 = arg2;
        this.field2134 = arg5;
        this.field2132 = arg3;
    }

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "(I)Z")
    public final boolean method492(int arg0) {
        if (arg0 != -1) {
            this.method492(-64);
        }
        field2118++;
        return false;
    }
}
