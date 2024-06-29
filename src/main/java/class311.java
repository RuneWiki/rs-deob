import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class311 extends class329 {

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    public static int field4223 = -1;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "[I")
    public static int[] field4227 = new int[250];

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "Lrb;")
    public static class283 field4226 = new class283(99, -1);

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V", line = 8)
    public static final void method1795(int arg0) {
        if (class246.field3357 != arg0) {
            class23.method144(false, -1, -1, 23065, class246.field3357);
            class246.field3357 = -1;
        }
        ++field4228;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;ZZBLor;)V", line = 30)
    public static final void method1796(String arg0, boolean arg1, boolean arg2, byte arg3, class173 arg4) {
        if (arg3 > -126) {
            method1795(119);
        }
        ++field4224;
        if (!arg1) {
            class494.method2921((byte) -17, arg4, 3, arg0);
        } else {
            if (class173.field2631.startsWith("win") && ~class173.field2628 != -4) {
                String var5 = null;
                if (arg4.field2623 != null) {
                    var5 = arg4.field2623.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class464 var6 = class494.method2921((byte) -17, arg4, 0, arg0);
                    class100.field1592 = var6;
                    class266.field3575 = arg4;
                    class467.field6761 = arg0;
                    return;
                }
            }
            if (class173.field2631.startsWith("mac")) {
                String var7 = null;
                if (arg4.field2623 != null) {
                    var7 = arg4.field2623.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg2) {
                    class494.method2921((byte) -17, arg4, 1, arg0);
                    return;
                }
            }
            class494.method2921((byte) -17, arg4, 2, arg0);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)[Lkb;", line = 93)
    public static final class139[] method1797(boolean arg0) {
        if (arg0) {
            method1798(false);
        }
        ++field4229;
        return new class139[] { class451.field6608, class170.field2587, class65.field930 };
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(Z)V", line = 106)
    public static void method1798(boolean arg0) {
        field4226 = null;
        if (arg0) {
            method1797(true);
        }
        field4227 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)[[I", line = 121)
    public final int[][] method66(byte arg0, int arg1) {
        ++field4225;
        if (arg0 != -11) {
            return null;
        } else {
            int[][] var3 = super.field536.method337(arg1, (byte) 75);
            if (super.field536.field726 && this.method1943((byte) 75)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg1 % super.field4475 * super.field4475;
                for (int var8 = 0; ~class383.field5502 < ~var8; ++var8) {
                    int var9 = super.field4470[var8 % super.field4480 + var7];
                    var6[var8] = class375.method2245(var9 << 4, 4080);
                    var5[var8] = class375.method2245(var9, 65280) >> 4;
                    var4[var8] = class375.method2245(var9 >> 12, 4080);
                }
            }
            return var3;
        }
    }
}
