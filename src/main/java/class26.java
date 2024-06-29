import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class26 extends class14 {

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "I")
    public int field218;

    @OriginalMember(owner = "client!iv", name = "q", descriptor = "I")
    public int field221;

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!iv", name = "p", descriptor = "I")
    public int field220;

    @OriginalMember(owner = "client!iv", name = "t", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
    public int field217;

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "Lfca;")
    public static class661 field225 = new class661();

    @OriginalMember(owner = "client!iv", name = "x", descriptor = "J")
    public static long field228 = 0L;

    @OriginalMember(owner = "client!iv", name = "y", descriptor = "[Lmc;")
    public static class234[] field229 = new class234[2048];

    @OriginalMember(owner = "client!iv", name = "r", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!iv", name = "s", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!iv", name = "v", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!iv", name = "w", descriptor = "J")
    public static long field227;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIIII)J")
    public static final long method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -2120) {
            method114((byte) 78);
        }
        field222++;
        class368.field4499.clear();
        class368.field4499.set(arg5, arg6, arg3, arg0, arg1, arg2);
        return class368.field4499.getTime().getTime();
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lpf;Ldg;IIIIIIIIIIIII)V")
    public class26(class759 arg0, class20 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field218 = arg12;
        this.field221 = arg14;
        this.field219 = arg13;
        this.field220 = arg11;
        this.field224 = arg9;
        this.field217 = arg10;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(BI)V")
    public static final void method113(byte arg0, int arg1) {
        field223++;
        if (class332.field4052 == arg1) {
            return;
        }
        if (arg1 == 13) {
            if (class528.field6708 == null) {
                class369.method2120(class614.field7750, class530.field6723, (byte) -13, class506.field6471);
            } else {
                class49.method318(class530.field6723, (byte) 108);
            }
        }
        if (arg1 != 13 && class530.field6727 != null) {
            class530.field6727.method1817(-110);
            class530.field6727 = null;
        }
        if (arg1 == 3) {
            class589.method3167(client.field6070 != class251.field3425, 1);
        }
        if (arg1 == 7) {
            class17.method70((byte) -105, client.field6070 != class318.field3956);
        }
        if (arg1 == 5) {
            if (class528.field6708 == null) {
                class702.method3803(class506.field6471, class614.field7750, -1);
            } else {
                class745.method4050((byte) -37);
            }
        } else if (arg1 == 6) {
            if (class528.field6708 == null) {
                class369.method2120(class614.field7750, class530.field6723, (byte) -13, class506.field6471);
            } else {
                class49.method318(class530.field6723, (byte) 108);
            }
        } else if (arg1 == 9) {
            if (class528.field6708 == null) {
                class369.method2120(class614.field7750, class530.field6723, (byte) -13, class506.field6471);
            } else {
                class49.method318(class530.field6723, (byte) 108);
            }
        } else if (arg1 == 12) {
            if (class528.field6708 == null) {
                class702.method3803(class506.field6471, class614.field7750, -1);
            } else {
                class745.method4050((byte) -37);
            }
        }
        if (class597.method3225(class332.field4052, (byte) 45)) {
            class735.field9972.field294 = 2;
            class151.field1918.field294 = 2;
            class381.field4740.field294 = 2;
            class655.field8450.field294 = 2;
            class410.field5436.field294 = 2;
            class29.field254.field294 = 2;
            class654.field8390.field294 = 2;
        }
        if (class597.method3225(arg1, (byte) 45)) {
            class774.field10545 = 1;
            class751.field10241 = 0;
            class739.field9996 = 0;
            class331.field4046 = 1;
            class122.field1631 = 0;
            class3.method9(64, true);
            class735.field9972.field294 = 1;
            class151.field1918.field294 = 1;
            class381.field4740.field294 = 1;
            class655.field8450.field294 = 1;
            class410.field5436.field294 = 1;
            class29.field254.field294 = 1;
            class654.field8390.field294 = 1;
        }
        if (arg1 == 11 || arg1 == 3) {
            class393.method2280(38);
        }
        boolean var2 = arg1 == 2 || class217.method1424(false, arg1) || class176.method1123(123, arg1);
        boolean var3 = class332.field4052 == 2 || class217.method1424(false, class332.field4052) || class176.method1123(83, class332.field4052);
        if (var3 != var2) {
            if (var2) {
                class136.field1797 = class780.field10643;
                if (class485.field6252.field6944.method1340(false) == 0) {
                    class417.method2409(true, 2);
                } else {
                    class485.method2720((byte) 107, 0, class485.field6252.field6944.method1340(false), false, class788.field10798, class780.field10643, 2);
                    class309.method1819(false);
                }
                class722.field9484.method683((byte) -104, false);
            } else {
                class417.method2409(true, 2);
                class722.field9484.method683((byte) -91, true);
            }
        }
        if (arg0 != 95) {
            method114((byte) -95);
        }
        if (class597.method3225(arg1, (byte) 45) || arg1 == 13) {
            class576.field7320.method970();
        }
        class332.field4052 = arg1;
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(B)V")
    public static void method114(byte arg0) {
        field225 = null;
        if (arg0 != 83) {
            field227 = 3L;
        }
        field229 = null;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)Lgp;")
    public class576 method3(byte arg0) {
        if (arg0 > -15) {
            return null;
        } else {
            field226++;
            return class278.field3612;
        }
    }
}
