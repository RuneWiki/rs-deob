import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class329 extends class36 {

    @OriginalMember(owner = "client!kda", name = "u", descriptor = "I")
    public int field4738 = 0;

    @OriginalMember(owner = "client!kda", name = "x", descriptor = "Lig;")
    public static class206 field4741 = new class206(49, -2);

    @OriginalMember(owner = "client!kda", name = "y", descriptor = "Lea;")
    public static class474 field4742 = new class474("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!kda", name = "p", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!kda", name = "q", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!kda", name = "r", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!kda", name = "s", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!kda", name = "t", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!kda", name = "v", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!kda", name = "w", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IBI)Z", line = 5)
    public static final boolean method2143(int arg0, byte arg1, int arg2) {
        field4737++;
        int var3 = -21 / ((60 - arg1) / 62);
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IILrt;)V", line = 15)
    private final void method2144(int arg0, int arg1, class194 arg2) {
        field4740++;
        if (arg1 == 2) {
            this.field4738 = arg2.method1220(112);
        }
        if (arg0 != 28902) {
            this.method2145(64, null);
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ILrt;)V", line = 31)
    public final void method2145(int arg0, class194 arg1) {
        while (true) {
            int var3 = arg1.method1177(255);
            if (var3 == 0) {
                if (arg0 != 4) {
                    method2149(false);
                }
                field4733++;
                return;
            }
            this.method2144(28902, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZII)Z", line = 55)
    public static final boolean method2146(boolean arg0, int arg1, int arg2) {
        field4735++;
        class385 var3 = class575.field8301.method1499(-7532, arg2);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg0) {
            if (arg1 >= 5 && arg1 <= 8) {
                arg1 = 4;
            }
            return var3.method2458(arg1, -115);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(IBI)I", line = 77)
    public static final int method2147(int arg0, byte arg1, int arg2) {
        field4734++;
        int var3 = class428.method2672(arg0 + 91923, arg2 + 45365, 4, -24906) - (-(class428.method2672(arg0 + 37821, arg2 + 10294, 2, -24906) + -128 >> 1) + -(class428.method2672(arg0, arg2, 1, -24906) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        int var5 = -4 % ((arg1 + 61) / 42);
        return var4;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)V", line = 99)
    public static final void method2148(byte arg0) {
        class100.field1187 = true;
        field4739++;
        if (arg0 <= 28) {
            method2147(-52, (byte) 82, -9);
        }
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(Z)V", line = 111)
    public static void method2149(boolean arg0) {
        if (!arg0) {
            field4742 = null;
        }
        field4742 = null;
        field4741 = null;
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(II)I", line = 122)
    public static final int method2150(int arg0, int arg1) {
        if (arg0 == -128) {
            field4736++;
            return arg1 >>> 8;
        } else {
            return 72;
        }
    }
}
