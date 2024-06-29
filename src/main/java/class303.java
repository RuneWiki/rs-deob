import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class303 extends class187 {

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "Lof;")
    public class421 field4122;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "[I")
    public static int[] field4117 = new int[100];

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method1784(byte arg0, int arg1) {
        field4121++;
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg1 < 10000000) {
            return "<col=ffffff>" + arg1 / 1000 + class57.field575 + "</col>";
        } else {
            if (arg0 < 3) {
                field4117 = null;
            }
            return "<col=00ff80>" + arg1 / 1000000 + class317.field4229 + "</col>";
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lvm;I[[[BBIIIIIIIII)V")
    public static final void method1785(class322 arg0, int arg1, byte[][][] arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field4116++;
        if (arg3 < 88) {
            method1788((byte) -63);
        }
        if (arg4 == 0 || arg12 == 0) {
            return;
        }
        if (arg4 == 9) {
            arg1 = arg1 + 1 & 0x3;
            arg4 = 1;
        }
        if (arg4 == 10) {
            arg4 = 1;
            arg1 = arg1 + 3 & 0x3;
        }
        if (arg4 == 11) {
            arg1 = arg1 + 3 & 0x3;
            arg4 = 8;
        }
        arg0.method1597(arg10, arg6, arg7, arg11, arg8, arg5, arg2[arg4 - 1][arg1], arg12, arg9);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)V")
    public static final void method1786(int arg0, byte arg1) {
        class242.field3303 = false;
        class412.field5953 = arg0;
        class109.field1333 = -1;
        class425.field6234 = 0;
        class266.field3616 = null;
        class252.field3445 = 1;
        if (arg1 > -19) {
            field4119 = 35;
        }
        field4118++;
        class27.field259 = -1;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lvm;IIILmk;)V")
    public static final void method1787(class322 arg0, int arg1, int arg2, int arg3, class154 arg4) {
        class338.field4512.method829(false);
        field4120++;
        if (class42.field437) {
            return;
        }
        if (arg2 != 24993) {
            method1786(95, (byte) 30);
        }
        for (class216 var5 = (class216) arg4.method814((byte) 90); var5 != null; var5 = (class216) arg4.method827(112)) {
            class228 var6 = class283.method1668(arg2 ^ 0xFFFF9E04, var5.field2903);
            if (class342.method2005(var6, true)) {
                boolean var7 = class142.method773(arg0, var5, var6, arg3, arg2 ^ 0xFFFF9E34, arg1);
                if (var7) {
                    class110.method582(arg2 - 22468, arg0, var5, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lof;)V")
    public class303(class421 arg0) {
        this.field4122 = arg0;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
    public static void method1788(byte arg0) {
        if (arg0 == -113) {
            field4117 = null;
        }
    }
}
