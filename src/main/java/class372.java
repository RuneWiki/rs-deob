import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class372 extends class353 {

    @OriginalMember(owner = "client!hea", name = "q", descriptor = "Z")
    private boolean field5499 = false;

    @OriginalMember(owner = "client!hea", name = "r", descriptor = "Liba;")
    public static class211 field5500 = new class211(55, 8);

    @OriginalMember(owner = "client!hea", name = "x", descriptor = "I")
    public static int field5506 = 0;

    @OriginalMember(owner = "client!hea", name = "y", descriptor = "I")
    public static int field5507 = 0;

    @OriginalMember(owner = "client!hea", name = "z", descriptor = "Ljava/lang/String;")
    public static String field5508 = null;

    @OriginalMember(owner = "client!hea", name = "n", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!hea", name = "o", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!hea", name = "p", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!hea", name = "s", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!hea", name = "t", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!hea", name = "u", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!hea", name = "v", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!hea", name = "w", descriptor = "[I")
    public static int[] field5505;

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(IZ)V", line = 3)
    public final void method485(int arg0, boolean arg1) {
        super.field5242.method3013(class492.field6998, 123, class519.field7276);
        if (arg0 >= 1) {
            ++field5498;
        }
    }

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(I)V", line = 14)
    public final void method490(int arg0) {
        ++field5503;
        if (this.field5499) {
            super.field5242.method3050(1, 0);
            super.field5242.method765(class497.field7032, (byte) 58);
            super.field5242.method3013(class492.field6998, 60, class492.field6998);
            super.field5242.method3025(class475.field6812, -1, 2);
            super.field5242.method3019(0, 0, class283.field3777);
            super.field5242.method3003(1);
            super.field5242.method3011(-127, (class689) null);
            super.field5242.method3050(0, 0);
            this.field5499 = false;
        } else {
            super.field5242.method3019(0, 0, class283.field3777);
        }
        if (arg0 != -2144900407) {
            this.method490(72);
        }
        super.field5242.method3013(class492.field6998, arg0 ^ -2144900451, class492.field6998);
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(B)Z", line = 43)
    public final boolean method493(byte arg0) {
        ++field5504;
        if (arg0 > -20) {
            field5508 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IZI)V", line = 55)
    public final void method486(int arg0, boolean arg1, int arg2) {
        ++field5501;
        if (arg1) {
            field5508 = null;
        }
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lum;)V", line = 150)
    public class372(class528 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lmv;B)V", line = 72)
    public static final void method2293(class295 arg0, byte arg1) {
        if (arg1 != 42) {
            field5505 = null;
        }
        class259.field3356 = 0;
        class27.field474 = 0;
        ++field5497;
        class165.field2320 = new class383();
        class91.field1384 = new class292[1024];
        class46.field714 = new class16[class322.field4686[class311.field4571] + 1];
        class218.field2904 = 0;
        class89.field1357 = 0;
        class509.method2892(arg0, (byte) 48);
        class150.method1071(arg0, -68);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILqda;I)V", line = 94)
    public final void method484(int arg0, class689 arg1, int arg2) {
        super.field5242.method3011(arg0 + -8184, arg1);
        ++field5502;
        super.field5242.method3037(arg2, true);
        if (arg0 != 8056) {
            method2294((byte) -24);
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IZ)V", line = 106)
    public final void method491(int arg0, boolean arg1) {
        if (arg0 >= -121) {
            field5506 = -78;
        }
        ++field5496;
        class447 var3 = super.field5242.method2999(true);
        if (var3 != null && arg1) {
            super.field5242.method3050(1, 0);
            super.field5242.method3011(-127, var3);
            super.field5242.method765(class457.field6609, (byte) 75);
            super.field5242.method3050(1, 0);
            super.field5242.method3013(class481.field6884, 61, class519.field7276);
            super.field5242.method768(true, false, class11.field273, 2, 3);
            super.field5242.method3019(0, 0, class443.field6428);
            class300 var4 = super.field5242.method3032(-30);
            var4.method1881(false, super.field5242.method3039((byte) -86));
            super.field5242.method3045(-122, class22.field404);
            super.field5242.method3050(0, 0);
            this.field5499 = true;
        } else {
            super.field5242.method3019(0, 0, class443.field6428);
        }
    }

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(B)V", line = 138)
    public static void method2294(byte arg0) {
        field5500 = null;
        field5505 = null;
        field5508 = null;
        if (arg0 != 94) {
            method2293((class295) null, (byte) -42);
        }
    }
}
