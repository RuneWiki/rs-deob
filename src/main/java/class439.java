import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class439 extends class605 {

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "J")
    public static long field6402 = 0L;

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "[Lvb;")
    public static class178[] field6407 = new class178[0];

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "Lgf;")
    public static class248 field6403;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZI)V")
    public final void method47(int arg0, boolean arg1, int arg2) {
        ++field6406;
        if (arg1) {
            field6403 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)Z")
    public final boolean method48(boolean arg0) {
        if (arg0) {
            field6402 = 91L;
        }
        ++field6409;
        return true;
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lok;)V")
    public class439(class228 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
    public final void method45(int arg0) {
        if (arg0 != 0) {
            this.method51(false, 114);
        }
        super.field8542.method1521(770, false);
        ++field6405;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V")
    public static void method2604(byte arg0) {
        field6407 = null;
        field6403 = null;
        if (arg0 <= 83) {
            method2604((byte) -28);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZI)V")
    public final void method51(boolean arg0, int arg1) {
        if (arg1 < -127) {
            ++field6401;
            super.field8542.method1521(770, true);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZB)V")
    public final void method46(boolean arg0, byte arg1) {
        ++field6408;
        if (arg1 > -16) {
            this.method46(true, (byte) -65);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILip;I)V")
    public final void method43(int arg0, class657 arg1, int arg2) {
        ++field6404;
        if (arg2 == 0) {
            super.field8542.method1505(-2, arg1);
            super.field8542.method1497(arg0, (byte) -29);
        }
    }
}
