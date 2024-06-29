import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class507 extends class71 {

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public int field7041;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public int field7049;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public int field7043;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "Z")
    public boolean field7040;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public int field7046;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    public int field7047;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "[C")
    public static char[] field7039 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field7045 = 0;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "Lmaa;")
    public static class508 field7044 = new class508(8, 2);

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "Lcu;")
    public static class203 field7050;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "[[[Z")
    public static boolean[][][] field7051;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lal;IIIIILrg;IIIBI)V")
    public static final void method3045(class125 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class557 arg6, int arg7, int arg8, int arg9, byte arg10, int arg11) {
        field7038++;
        class49.field733 = arg4;
        class618.field8299 = arg1;
        class320.field4453 = null;
        class45.field559 = arg0;
        class500.field6979 = arg8;
        class544.field7543 = arg3;
        class419.field5907 = null;
        class699.field9760 = arg9;
        class177.field2419 = arg7;
        class170.field2360 = arg6;
        if (arg10 != -93) {
            method3045(null, 102, 14, -71, 116, 113, null, 93, 117, -73, (byte) 92, 18);
        }
        class304.field4296 = null;
        class55.field784 = arg11;
        class752.field10360 = arg2;
        class702.field9792 = arg5;
        class138.method914((byte) 77);
        class598.field8107 = true;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
    public static void method3046(int arg0) {
        field7039 = null;
        field7051 = null;
        if (arg0 > -6) {
            method3045(null, 43, -103, 41, 120, 77, null, -87, -88, 121, (byte) 117, 55);
        }
        field7050 = null;
        field7044 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIILka;ILiha;)V")
    public static final void method3047(int arg0, int arg1, int arg2, class284 arg3, int arg4, class613 arg5) {
        field7042++;
        if (arg2 < -82 && arg3 != null) {
            arg5.method3478(arg3.method1655(), arg3.method1693(), arg0, arg3.method1681(), arg3.method1666(), arg1, (byte) 75, arg3.method1668(), arg3.method1658(), arg4, arg3.method1678());
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZI)V")
    public static final void method3048(boolean arg0, int arg1) {
        if (arg0 && class461.field6384 != null) {
            class92.field1285 = class461.field6384.field8166;
        } else {
            class92.field1285 = -1;
        }
        field7048++;
        class537.field7447 = 0;
        class655.field8755 = null;
        class226.field3034 = null;
        class461.field6384 = null;
        class461.method2821();
        class461.field6394.method3615((byte) 107);
        class510.field7070 = null;
        class461.field6396 = null;
        field7050 = null;
        class329.field4660 = -1;
        class548.field7626 = null;
        class683.field9477 = null;
        class20.field194 = null;
        class249.field3653 = null;
        class609.field8207 = -1;
        class525.field7297 = null;
        class145.field2035 = null;
        class679.field9446 = null;
        if (class461.field6385 != null) {
            class461.field6385.method10(124);
            class461.field6385.method5(false, 64, 128);
        }
        if (class461.field6379 != null) {
            class461.field6379.method3004(64, 64, true);
        }
        if (class461.field6383 != null) {
            class461.field6383.method715(true, 64);
        }
        class601.field8138.method1897(arg1, 64);
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(IIIIIZ)V")
    public class507(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field7041 = arg2;
        this.field7049 = arg4;
        this.field7043 = arg3;
        this.field7040 = arg5;
        this.field7046 = arg0;
        this.field7047 = arg1;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIBIIII)V")
    public static final void method3049(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field7052++;
        if (arg5 >= class607.field8185 && arg0 <= class726.field10064 && class291.field4181 <= arg6 && class262.field3848 >= arg4) {
            if (arg1 == 1) {
                class528.method3133(arg3, true, arg5, arg4, arg6, arg0);
            } else {
                class606.method3449(arg6, (byte) -110, arg4, arg3, arg1, arg0, arg5);
            }
        } else if (arg1 == 1) {
            class459.method2800(arg3, arg4, arg0, 81, arg6, arg5);
        } else {
            class545.method3219(arg1, arg4, 3, arg0, arg6, arg5, arg3);
        }
        int var7 = -46 / ((arg2 + 59) / 63);
    }
}
