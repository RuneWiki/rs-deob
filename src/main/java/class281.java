import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class281 extends class175 {

    @OriginalMember(owner = "client!tia", name = "J", descriptor = "I")
    private int field4063;

    @OriginalMember(owner = "client!tia", name = "E", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!tia", name = "G", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!tia", name = "H", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!tia", name = "L", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!tia", name = "M", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!tia", name = "N", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!tia", name = "O", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!tia", name = "I", descriptor = "[Lnga;")
    public static class539[] field4062;

    @OriginalMember(owner = "client!tia", name = "K", descriptor = "[[[Z")
    public static boolean[][][] field4064;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Ltga;IIZILuq;I)V")
    public static final void method1835(class64 arg0, int arg1, int arg2, boolean arg3, int arg4, class172 arg5, int arg6) {
        ++field4061;
        class414.method2491(arg6, arg5, arg3, arg1 + 35592, arg2, arg4);
        if (arg1 != -23703) {
            method1836((byte) 15, 8, (class154) null, (class154) null, true);
        }
        class348.field5049 = arg0;
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field4063 = (arg1.method1731((byte) 64) << 12) / 255;
        }
        ++field4060;
        if (arg2) {
            method1835((class64) null, -118, -53, false, -41, (class172) null, 59);
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(BILmr;Lmr;Z)I")
    public static final int method1836(byte arg0, int arg1, class154 arg2, class154 arg3, boolean arg4) {
        ++field4065;
        if (arg1 == 1) {
            int var5 = arg2.field3872;
            int var6 = arg3.field3872;
            if (!arg4) {
                if (~var5 == 0) {
                    var5 = 2001;
                }
                if (~var6 == 0) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else {
            if (arg0 <= 34) {
                method1835((class64) null, -32, -23, true, -111, (class172) null, 106);
            }
            if (arg1 == 2) {
                return class307.method1986(arg3.method1070(9342).field7305, arg2.method1070(9342).field7305, class55.field647, 1);
            } else if (arg1 == 3) {
                if (!arg2.field2082.equals("-")) {
                    if (arg3.field2082.equals("-")) {
                        return !arg4 ? -1 : 1;
                    } else {
                        return class307.method1986(arg3.field2082, arg2.field2082, class55.field647, 1);
                    }
                } else if (arg3.field2082.equals("-")) {
                    return 0;
                } else {
                    return arg4 ? -1 : 1;
                }
            } else if (arg1 == 4) {
                if (!arg2.method1772((byte) 43)) {
                    return arg3.method1772((byte) 43) ? -1 : 0;
                } else {
                    return arg3.method1772((byte) 43) ? 0 : 1;
                }
            } else if (~arg1 == -6) {
                if (arg2.method1770((byte) -122)) {
                    return arg3.method1770((byte) -29) ? 0 : 1;
                } else {
                    return arg3.method1770((byte) -38) ? -1 : 0;
                }
            } else if (~arg1 == -7) {
                if (arg2.method1768(256)) {
                    return arg3.method1768(256) ? 0 : 1;
                } else {
                    return !arg3.method1768(256) ? 0 : -1;
                }
            } else if (~arg1 == -8) {
                if (!arg2.method1771(91)) {
                    return arg3.method1771(86) ? -1 : 0;
                } else {
                    return !arg3.method1771(77) ? 1 : 0;
                }
            } else if (~arg1 == -9) {
                int var7 = arg2.field2084;
                int var8 = arg3.field2084;
                if (arg4) {
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                    if (~var8 == -1001) {
                        var8 = -1;
                    }
                } else {
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                    if (~var8 == 0) {
                        var8 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg2.field2086 - arg3.field2086;
            }
        }
    }

    @OriginalMember(owner = "client!tia", name = "c", descriptor = "(B)V")
    public static void method1837(byte arg0) {
        field4062 = null;
        if (arg0 == -92) {
            field4064 = null;
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        if (!arg0) {
            this.method44(115, (class254) null, true);
        }
        ++field4066;
        int[] var3 = super.field2310.method91(0, arg1);
        if (super.field2310.field169) {
            class421.method2532(var3, 0, class598.field8136, this.field4063);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tia", name = "g", descriptor = "(I)V")
    public static final void method1838(int arg0) {
        ++field4068;
        class88.field1251 = null;
        class124.field1716 = null;
        class545.field7530 = null;
        if (arg0 != 1000) {
            method1838(124);
        }
        class704.field9635 = null;
        class249.field3295 = null;
        class583.field7917 = null;
        class464.field6584 = null;
        class346.field4860 = null;
        class761.field10457 = null;
        class603.field8192 = null;
        class348.field5050 = null;
        class166.field2202 = null;
        class412.field5916 = null;
        class780.field10701 = null;
        class559.field7669 = null;
        class405.field5744 = null;
        class180.field2366 = null;
        class734.field9957 = null;
    }

    @OriginalMember(owner = "client!tia", name = "<init>", descriptor = "()V")
    public class281() {
        this(4096);
    }

    @OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(I)V")
    public class281(int arg0) {
        super(0, true);
        this.field4063 = 4096;
        this.field4063 = arg0;
    }
}
