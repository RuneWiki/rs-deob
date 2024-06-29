import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class433 extends class125 {

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
    public static int field6210 = 0;

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "Lov;")
    public static class666 field6212 = null;

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!ps", name = "t", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "Lla;")
    public static class423 field6204;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)V")
    public static void method2660(int arg0) {
        if (arg0 != 1) {
            method2662(-100, (byte) -83);
        }
        field6204 = null;
        field6212 = null;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZZILjava/lang/String;Lhga;)V")
    public static final void method2661(boolean arg0, boolean arg1, int arg2, String arg3, class300 arg4) {
        ++field6211;
        if (arg0) {
            if (class300.field4089.startsWith("win") && arg4.field4087) {
                String var5 = null;
                if (class486.field6999 != null) {
                    var5 = class486.field6999.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class432 var6 = class338.method2082(arg4, 0, arg3, -15453);
                    class333.field4519 = var6;
                    class488.field7029 = arg3;
                    class441.field6279 = arg4;
                    return;
                }
            }
            if (class300.field4089.startsWith("mac")) {
                String var7 = null;
                if (class486.field6999 != null) {
                    var7 = class486.field6999.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg1) {
                    class338.method2082(arg4, 1, arg3, -15453);
                    return;
                }
            }
            class338.method2082(arg4, 2, arg3, -15453);
        } else {
            class338.method2082(arg4, 3, arg3, -15453);
        }
        if (arg2 != 0) {
            method2660(-114);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)I")
    public final int method158(byte arg0) {
        ++field6206;
        int var2 = -97 / ((-63 - arg0) / 49);
        return 1;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)V")
    public static final void method2662(int arg0, byte arg1) {
        ++field6208;
        if (~arg0 == -38) {
            class664.field9493 = 3.0F;
        } else if (~arg0 == -51) {
            class664.field9493 = 4.0F;
        } else if (~arg0 == -76) {
            class664.field9493 = 6.0F;
        } else if (~arg0 == -101) {
            class664.field9493 = 8.0F;
        } else if (arg0 == 200) {
            class664.field9493 = 16.0F;
        }
        class120.field1639 = -1;
        class120.field1639 = -1;
        if (arg1 != 67) {
            method2660(94);
        }
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(Z)I")
    public final int method2663(boolean arg0) {
        ++field6205;
        if (arg0) {
            field6202 = -35;
        }
        return super.field1732;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lgp;)V")
    public class433(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)Z")
    public final boolean method2664(int arg0) {
        ++field6203;
        if (arg0 != -7558) {
            return false;
        } else if (super.field1733.method3308(-127)) {
            return false;
        } else {
            return super.field1733.method3309((byte) -22) == class391.field5635;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZI)I")
    public final int method155(boolean arg0, int arg1) {
        ++field6207;
        if (!arg0) {
            method2661(true, false, 106, (String) null, (class300) null);
        }
        if (super.field1733.method3308(-91)) {
            return 3;
        } else {
            return super.field1733.method3309((byte) -22) == class391.field5635 ? 1 : 3;
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(ILgp;)V")
    public class433(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        if (super.field1733.method3309((byte) -22) == class391.field5635) {
            if (super.field1733.method3308(-84)) {
                super.field1732 = 0;
            }
        } else {
            super.field1732 = 1;
        }
        if (!arg0) {
            method2661(false, true, 75, (String) null, (class300) null);
        }
        ++field6213;
        if (~super.field1732 != -1 && super.field1732 != 1) {
            super.field1732 = this.method158((byte) 18);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BI)V")
    public final void method157(byte arg0, int arg1) {
        ++field6209;
        if (arg0 > -32) {
            field6210 = -124;
        }
        super.field1732 = arg1;
    }
}
