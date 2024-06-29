import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class201 extends class499 {

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "Lwl;")
    public static class280 field2786 = new class280();

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "Lok;")
    public static class166 field2787 = new class166(9, 7);

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "Lub;")
    private class18 field2791;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "Lpc;")
    public static class473 field2790;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "Lgn;")
    public static class493 field2792;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "Lf;")
    public static class529 field2781;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
    public final String method1283(String arg0, int arg1, int arg2) {
        field2788++;
        if (arg2 >= -60) {
            this.method1283(null, 34, -77);
        }
        if (this.field2791 == null) {
            return arg0;
        } else {
            class494 var4 = (class494) this.field2791.method182((long) arg1, (byte) 69);
            return var4 == null ? arg0 : var4.field6857;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)I")
    public final int method1284(int arg0, int arg1, int arg2) {
        field2789++;
        if (this.field2791 == null) {
            return arg2;
        }
        class387 var4 = (class387) this.field2791.method182((long) arg1, (byte) 71);
        if (var4 == null) {
            return arg2;
        } else if (arg0 == 9) {
            return var4.field5264;
        } else {
            return 86;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
    public static final void method1285(int arg0, int arg1) {
        field2780++;
        if (arg0 != -3) {
            field2790 = null;
        }
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        class349.field4708 = arg1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1286(boolean arg0, int arg1) {
        field2785++;
        if (!arg0) {
            method1289(116, 113, false, 117, 85, 53, 37, 125, 108);
        }
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lmd;I)V")
    public final void method1287(class379 arg0, int arg1) {
        if (arg1 != 21732) {
            return;
        }
        field2782++;
        while (true) {
            int var3 = arg0.method2238(255);
            if (var3 == 0) {
                return;
            }
            this.method1290((byte) -13, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method1288(int arg0) {
        field2790 = null;
        if (arg0 != -21042) {
            field2787 = null;
        }
        field2781 = null;
        field2786 = null;
        field2787 = null;
        field2792 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIZIIIIII)Z")
    public static final boolean method1289(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2783++;
        if (arg7 >= (arg3 + arg4) || arg6 + arg7 <= arg4) {
            return false;
        } else if (arg8 < arg1 + arg5 && (arg0 + arg8) > arg5) {
            if (!arg2) {
                method1286(true, 106);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLmd;I)V")
    private final void method1290(byte arg0, class379 arg1, int arg2) {
        if (arg0 != -13) {
            return;
        }
        if (arg2 == 249) {
            int var4 = arg1.method2238(arg0 ^ 0xFFFFFF0C);
            if (this.field2791 == null) {
                int var5 = class321.method1857((byte) 113, var4);
                this.field2791 = new class18(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method2238(255) == 1;
                int var8 = arg1.method2249((byte) 108);
                class42 var9;
                if (var7) {
                    var9 = new class494(arg1.method2218(-76));
                } else {
                    var9 = new class387(arg1.method2232((byte) 124));
                }
                this.field2791.method173((long) var8, var9, (byte) 122);
            }
        }
        field2784++;
    }
}
