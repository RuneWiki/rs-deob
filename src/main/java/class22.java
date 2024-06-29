import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class22 extends class70 {

    @OriginalMember(owner = "client!d", name = "K", descriptor = "Lqf;")
    public static class117 field408 = class72.method514(117, "blinken2:");

    @OriginalMember(owner = "client!d", name = "P", descriptor = "Lqf;")
    public static class117 field413 = class72.method514(103, "::");

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "Lqf;")
    private static class117 field421 = class72.method514(115, "Prepared visibility map");

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "J")
    public static long field423 = 0L;

    @OriginalMember(owner = "client!d", name = "eb", descriptor = "Lqf;")
    public static class117 field427 = class72.method514(102, "Privater Chat");

    @OriginalMember(owner = "client!d", name = "V", descriptor = "Lqf;")
    private static class117 field418 = class72.method514(104, "K");

    @OriginalMember(owner = "client!d", name = "I", descriptor = "Lqf;")
    public static class117 field406 = field418;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "Lqf;")
    public static class117 field409 = class72.method514(120, "<col=00ff80>");

    @OriginalMember(owner = "client!d", name = "J", descriptor = "I")
    public static int field407 = 0;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "I")
    public static int field420 = 0;

    @OriginalMember(owner = "client!d", name = "hb", descriptor = "Lqf;")
    public static class117 field430 = field421;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "Lqf;")
    public static class117 field422 = field418;

    @OriginalMember(owner = "client!d", name = "jb", descriptor = "Lqf;")
    public static class117 field432 = class72.method514(120, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "I")
    public int field419;

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!d", name = "db", descriptor = "I")
    public int field426;

    @OriginalMember(owner = "client!d", name = "gb", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!d", name = "ib", descriptor = "I")
    public int field431;

    @OriginalMember(owner = "client!d", name = "kb", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "Lve;")
    public class148 field411;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "Ljb;")
    public static class64 field410;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "Lba;")
    public class9 field405;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "Lba;")
    public class9 field415;

    @OriginalMember(owner = "client!d", name = "fb", descriptor = "[I")
    public int[] field428;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)V")
    public static final void method177(int arg0, byte arg1) {
        if (arg1 <= 69) {
            field423 = 93L;
        }
        if (class125.field2953 == 0) {
            class36.field771.method1108(-2, arg0);
        } else {
            class125.field2952 = arg0;
        }
        field414++;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V")
    public static void method178(byte arg0) {
        field422 = null;
        field413 = null;
        field406 = null;
        field418 = null;
        field408 = null;
        field410 = null;
        if (arg0 >= -20) {
            method177(110, (byte) 22);
        }
        field427 = null;
        field432 = null;
        field409 = null;
        field421 = null;
        field430 = null;
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
    public final void method179(int arg0) {
        if (arg0 != 0) {
            this.field403 = -110;
        }
        field424++;
        int var2 = this.field426;
        class148 var3 = this.field411.method1181(-16431);
        if (var3 == null) {
            this.field426 = -1;
            this.field416 = 0;
            this.field433 = 0;
            this.field428 = null;
            this.field419 = 0;
        } else {
            this.field426 = var3.field3611;
            this.field419 = var3.field3626 * 128;
            this.field433 = var3.field3629;
            this.field416 = var3.field3610;
            this.field428 = var3.field3634;
        }
        if (this.field426 != var2 && this.field415 != null) {
            class147.field3592.method279(this.field415);
            this.field415 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Z")
    public static final boolean method180(int arg0, int arg1) {
        field429++;
        if (arg1 > -3) {
            field408 = null;
        }
        return (arg0 >> 28 & 0x1) != 0;
    }
}
