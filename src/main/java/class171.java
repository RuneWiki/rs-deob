import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class171 {

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    public static int field2237 = -1;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "Ltca;")
    public static class184 field2243 = new class184(512);

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "Lef;")
    public static class513 field2242;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "[[Lwc;")
    public static class74[][] field2240;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1150(int arg0, byte arg1, int arg2) {
        field2238++;
        int var3 = 66 / ((arg1 - 53) / 59);
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lofa;B)Lofa;")
    public static final class347 method1151(class347 arg0, byte arg1) {
        field2239++;
        if (arg0.field4921 != -1) {
            return class445.method2655(arg0.field4921, (byte) 114);
        } else if (arg1 >= -32) {
            return null;
        } else {
            int var2 = arg0.field5003 >>> 16;
            class187 var3 = new class187(class355.field5178);
            for (class73 var4 = (class73) var3.method1259(-120); var4 != null; var4 = (class73) var3.method1255(65410)) {
                if (var4.field985 == var2) {
                    return class445.method2655((int) var4.field2146, (byte) 108);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(JZ)V")
    public static final void method1152(long arg0, boolean arg1) {
        field2235++;
        if (arg0 <= 0L) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class160.method1105(arg0 - 1L, 1);
            class160.method1105(1L, 1);
        } else {
            class160.method1105(arg0, 1);
        }
        if (arg1) {
            method1156(81, true, null);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
    public static void method1153(int arg0) {
        field2243 = null;
        if (arg0 < 31) {
            method1154(-89);
        }
        field2242 = null;
        field2240 = null;
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)V")
    public static final void method1154(int arg0) {
        class235.field3128.method985((byte) -98);
        field2233++;
        class494.field6961.method1657((byte) -103);
        class723.field9821.method2039((byte) -23);
        class669.field8962.setBackground(Color.black);
        class719.field9785 = arg0;
        class235.field3128 = class335.method2150(true, class669.field8962);
        class494.field6961 = class10.method67((byte) -127, class669.field8962, true);
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)V")
    public static final void method1155(int arg0) {
        class593.field8098.method540(class224.field2897, class125.field1721.field5171.method3709(43) == 1 ? class455.field6515 + 256 << 2 : -1, 0);
        if (arg0 <= 102) {
            method1151(null, (byte) 124);
        }
        field2236++;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZLkha;)V")
    public static final void method1156(int arg0, boolean arg1, class608 arg2) {
        if (arg0 != -26236) {
            field2240 = null;
        }
        if (arg2.field8225) {
            if (arg2.field8227 < 0 || class646.method3583(arg2.field8227, 104, arg2.field8233)) {
                if (arg1) {
                    class193.method1280(arg2.field8215, arg2.field8230, arg2.field8221, arg2.field8232, (byte) -14, null);
                } else {
                    class731.method4037(arg2.field8230, arg2.field8217, arg2.field8232, arg2.field8215, arg2.field8221, arg2.field8227, arg2.field8233, -1, true);
                }
                arg2.method1102((byte) 114);
            }
        } else if (arg2.field8231 && arg2.field8230 >= 1 && arg2.field8232 >= 1 && arg2.field8230 <= (class102.field1467 - 2) && (class393.field5663 - 2) >= arg2.field8232 && (arg2.field8226 < 0 || class646.method3583(arg2.field8226, 69, arg2.field8220))) {
            if (arg1) {
                class193.method1280(arg2.field8215, arg2.field8230, arg2.field8221, arg2.field8232, (byte) -23, arg2.field8222);
            } else {
                class731.method4037(arg2.field8230, arg2.field8228, arg2.field8232, arg2.field8215, arg2.field8221, arg2.field8226, arg2.field8220, -1, true);
            }
            arg2.field8231 = false;
            if (!arg1 && arg2.field8227 == arg2.field8226 && arg2.field8227 == -1) {
                arg2.method1102((byte) 118);
            } else if (!arg1 && arg2.field8227 == arg2.field8226 && arg2.field8228 == arg2.field8217 && arg2.field8233 == arg2.field8220) {
                arg2.method1102((byte) 64);
            }
        }
        field2234++;
    }
}
