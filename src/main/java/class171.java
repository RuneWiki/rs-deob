import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class171 extends class657 {

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "Z")
    private boolean field2669 = false;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Lin;")
    public static class91 field2666;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILdu;I)V", line = 3)
    public final void method736(int arg0, class357 arg1, int arg2) {
        super.field9010.method4097((byte) 79, arg1);
        if (arg2 != -16776) {
            this.field2669 = false;
        }
        ++field2665;
        super.field9010.method4144(true, arg0);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZBI)V", line = 15)
    public static final void method1284(boolean arg0, byte arg1, int arg2) {
        if (arg1 <= 98) {
            method1284(true, (byte) 34, 120);
        }
        class588.method3356(-2, class497.field6903.method2936(class607.field8336, 544), arg0, arg2);
        ++field2672;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)V", line = 26)
    public final void method735(int arg0, boolean arg1) {
        ++field2668;
        class247 var3 = super.field9010.method4086(-16777216);
        if (arg0 != 15192) {
            this.field2669 = false;
        }
        if (var3 != null && arg1) {
            super.field9010.method4126(1, arg0 + -19574);
            super.field9010.method4097((byte) 96, var3);
            super.field9010.method2260(class210.field2988, arg0 + -15192);
            super.field9010.method4126(1, -4382);
            super.field9010.method4112(class720.field9793, 104, class295.field4131);
            super.field9010.method2248(true, false, 2, class380.field5528, false);
            super.field9010.method4117(0, true, class492.field6814);
            class81 var4 = super.field9010.method4077(false);
            var4.method764(arg0 + -30891, super.field9010.method4100((byte) -44));
            super.field9010.method4099(arg0 ^ -15176, class556.field7682);
            super.field9010.method4126(0, -4382);
            this.field2669 = true;
        } else {
            super.field9010.method4117(0, true, class492.field6814);
        }
    }

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)V", line = 61)
    public static void method1285(int arg0) {
        if (arg0 != 1) {
            field2666 = null;
        }
        field2666 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V", line = 71)
    public final void method728(byte arg0) {
        if (arg0 != 87) {
            field2666 = null;
        }
        ++field2670;
        if (!this.field2669) {
            super.field9010.method4117(0, true, class755.field10544);
        } else {
            super.field9010.method4126(1, -4382);
            super.field9010.method2260(class738.field9929, arg0 ^ 87);
            super.field9010.method4112(class534.field7355, 103, class534.field7355);
            super.field9010.method4096((byte) 47, 2, class4.field31);
            super.field9010.method4117(0, true, class755.field10544);
            super.field9010.method4116(-8629);
            super.field9010.method4097((byte) -111, (class357) null);
            super.field9010.method4126(0, -4382);
            this.field2669 = false;
        }
        super.field9010.method4112(class534.field7355, arg0 ^ 44, class534.field7355);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V", line = 97)
    public final void method730(int arg0, int arg1, int arg2) {
        ++field2673;
        if (arg0 != 10756) {
            this.field2669 = false;
        }
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)Z", line = 110)
    public final boolean method731(int arg0) {
        ++field2671;
        if (arg0 > -57) {
            field2666 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZB)V", line = 122)
    public final void method734(boolean arg0, byte arg1) {
        if (arg1 == -103) {
            ++field2667;
            super.field9010.method4112(class720.field9793, 99, class534.field7355);
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lwga;)V", line = 135)
    public class171(class745 arg0) {
        super(arg0);
    }
}
