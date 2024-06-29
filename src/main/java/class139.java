import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class139 {

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public int field1780;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "Lpea;")
    private class641 field1777;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "Llp;")
    public static class270 field1783 = new class270(14, 0, 4, 1);

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public static int field1785 = 0;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "[I")
    public static int[] field1786 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!vl", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1778++;
        this.field1777.method3501(this.field1780, -111);
        super.finalize();
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IC)Z")
    public static final boolean method959(int arg0, char arg1) {
        if (arg0 != -123) {
            field1786 = null;
        }
        field1779++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method960(boolean arg0, String arg1) {
        if (arg0) {
            method963(-80, 121, 61);
        }
        field1782++;
        if (class112.field1360.startsWith("win")) {
            return arg1 + ".dll";
        } else if (class112.field1360.startsWith("linux")) {
            return "lib" + arg1 + ".so";
        } else if (class112.field1360.startsWith("mac")) {
            return "lib" + arg1 + ".jnilib";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;IILcr;)Lrp;")
    public static final class280 method961(String arg0, int arg1, int arg2, class112 arg3) {
        if (arg1 <= 125) {
            field1783 = null;
        }
        field1781++;
        if (arg2 == 0) {
            return arg3.method624((byte) 78, arg0);
        } else if (arg2 == 1) {
            try {
                class302.method1822(class372.field5359, "openjs", (byte) 127, new Object[] { (new URL(class372.field5359.getCodeBase(), arg0)).toString() });
                class280 var4 = new class280();
                var4.field3773 = 1;
                return var4;
            } catch (Throwable var10) {
                class280 var5 = new class280();
                var5.field3773 = 2;
                return var5;
            }
        } else if (arg2 == 2) {
            try {
                class372.field5359.getAppletContext().showDocument(new URL(class372.field5359.getCodeBase(), arg0), "_blank");
                class280 var6 = new class280();
                var6.field3773 = 1;
                return var6;
            } catch (Exception var11) {
                class280 var7 = new class280();
                var7.field3773 = 2;
                return var7;
            }
        } else if (arg2 == 3) {
            try {
                class302.method1821(class372.field5359, 10049, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                class372.field5359.getAppletContext().showDocument(new URL(class372.field5359.getCodeBase(), arg0), "_top");
                class280 var8 = new class280();
                var8.field3773 = 1;
                return var8;
            } catch (Exception var12) {
                class280 var9 = new class280();
                var9.field3773 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lpea;II)V")
    public class139(class641 arg0, int arg1, int arg2) {
        this.field1780 = arg2;
        this.field1777 = arg0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static void method962(int arg0) {
        field1786 = null;
        field1783 = null;
        if (arg0 != -4) {
            field1786 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Z")
    public static final boolean method963(int arg0, int arg1, int arg2) {
        int var3 = 59 % ((-arg2 - 23) / 53);
        field1784++;
        return class123.method759(123, arg1, arg0) | (arg1 & 0x70000) != 0 || class528.method3000(arg1, (byte) 116, arg0);
    }
}
