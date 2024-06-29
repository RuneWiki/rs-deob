import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class158 extends class308 implements class415 {

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "Ljg;")
    private class309 field2300;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "Lem;")
    public static class206 field2306 = new class206(18, 0);

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "[[Z")
    public static boolean[][] field2311;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
    public final void method1116(int arg0, int arg1) {
        super.method1116(this.field2300.field4267 * arg0, -22);
        int var3 = -50 / ((-84 - arg1) / 39);
        ++field2302;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Ltba;Ljg;Z)V")
    public class158(class147 arg0, class309 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field2300 = arg1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILgi;)I")
    public static final int method1117(int arg0, class631 arg1) {
        if (arg0 != 8448) {
            field2311 = null;
        }
        ++field2308;
        if (class276.field3814 == arg1) {
            return 7681;
        } else if (class334.field4505 == arg1) {
            return 8448;
        } else if (class127.field1821 == arg1) {
            return 34165;
        } else if (class335.field4510 != arg1) {
            if (class412.field5840 == arg1) {
                return 34023;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            return 260;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lfc;I)Z")
    public static final boolean method1118(class235 arg0, int arg1) {
        if (arg1 != 34023) {
            field2311 = null;
        }
        ++field2299;
        return class542.field7336 == arg0 || class564.field7618 == arg0 || class131.field1878 == arg0 || class188.field2720 == arg0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public final Buffer method1119(int arg0, boolean arg1) {
        ++field2304;
        if (arg0 < 36) {
            method1117(98, (class631) null);
        }
        return super.method1870(super.field4249.field2167, -1, arg1);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)I")
    public final int method905(boolean arg0) {
        ++field2305;
        if (!arg0) {
            this.method1121(false);
        }
        return super.method905(true);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)I")
    public static final int method1120(int arg0, int arg1) {
        if (arg1 < 113) {
            method1118((class235) null, -119);
        }
        ++field2303;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)Z")
    public final boolean method1121(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field2301;
            return super.method1865(25079, super.field4249.field2167);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public final void method1122(int arg0) {
        ++field2309;
        super.method1122(arg0);
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)V")
    public static void method1123(byte arg0) {
        field2311 = null;
        if (arg0 < 45) {
            field2310 = 36;
        }
        field2306 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Ljg;")
    public final class309 method1124(int arg0) {
        ++field2298;
        if (arg0 < 113) {
            field2311 = null;
        }
        return this.field2300;
    }
}
