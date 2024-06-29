import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class160 extends class384 implements class33 {

    @OriginalMember(owner = "client!se", name = "v", descriptor = "Lwq;")
    private class674 field2294;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "Z")
    public static boolean field2305 = false;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public static int field2307 = 0;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "[I")
    public static int[] field2296;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "[I")
    public static int[] field2301;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "[Lsia;")
    public static class151[] field2308;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "[[[B")
    public static byte[][][] field2297;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)Lwq;")
    public final class674 method176(int arg0) {
        ++field2302;
        return arg0 != 29119 ? null : this.field2294;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public final void method175(int arg0) {
        int var2 = -124 / ((arg0 - -17) / 40);
        super.method175(-86);
        ++field2303;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V")
    public final void method174(int arg0, byte arg1) {
        ++field2306;
        super.method174(this.field2294.field9586 * arg0, arg1);
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lmba;Lwq;Z)V")
    public class160(class643 arg0, class674 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field2294 = arg1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(CB)C")
    public static final char method1137(char arg0, byte arg1) {
        ++field2300;
        if (arg1 > -60) {
            return '}';
        } else if (arg0 == 198) {
            return 'E';
        } else if (arg0 == 230) {
            return 'e';
        } else if (~arg0 == -224) {
            return 's';
        } else if (~arg0 == -339) {
            return 'E';
        } else {
            return (char) (~arg0 == -340 ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    public final Buffer method177(boolean arg0, byte arg1) {
        if (arg1 > -99) {
            field2307 = -107;
        }
        ++field2304;
        return super.method2366(arg0, -6633, super.field5548.field9237);
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)Z")
    public static final boolean method1138(int arg0) {
        ++field2298;
        return arg0 <= class369.field5392;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)I")
    public final int method1105(boolean arg0) {
        ++field2299;
        if (arg0) {
            this.field2294 = null;
        }
        return super.method1105(false);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
    public static final void method1139(byte arg0) {
        class501.field7280.method2220(false);
        int var1 = 73 / ((arg0 - 58) / 51);
        ++field2292;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V")
    public static void method1140(byte arg0) {
        field2297 = null;
        if (arg0 != -113) {
            field2293 = 13;
        }
        field2301 = null;
        field2296 = null;
        field2308 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)Z")
    public final boolean method178(byte arg0) {
        if (arg0 >= -100) {
            field2296 = null;
        }
        ++field2295;
        return super.method2371(-31668, super.field5548.field9237);
    }
}
