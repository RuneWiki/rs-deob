import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class295 extends class155 {

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "Lbo;")
    public static class761 field4029 = new class761();

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "Z")
    public static boolean field4033 = false;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "Lgj;")
    public static class662 field4032;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lbr;II)V", line = 11)
    public final void method259(class416 arg0, int arg1, int arg2) {
        super.field2533.method3090(arg0, (byte) -83);
        ++field4026;
        if (arg1 > -71) {
            field4033 = false;
        }
        super.field2533.method3113(-3334, arg2);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZZ)V", line = 24)
    public final void method257(boolean arg0, boolean arg1) {
        ++field4030;
        if (arg0) {
            this.method259((class416) null, -6, 73);
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)V", line = 37)
    public static void method1893(byte arg0) {
        if (arg0 < 27) {
            method1893((byte) 17);
        }
        field4032 = null;
        field4029 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIB)V", line = 48)
    public final void method254(int arg0, int arg1, byte arg2) {
        ++field4031;
        if (arg2 != -92) {
            field4032 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)Z", line = 59)
    public final boolean method250(int arg0) {
        int var2 = 60 / ((arg0 - -8) / 41);
        ++field4024;
        return false;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lsf;)V", line = 70)
    public class295(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZ)V", line = 73)
    public final void method258(int arg0, boolean arg1) {
        if (arg0 == 205) {
            ++field4028;
        }
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)V", line = 84)
    public final void method255(int arg0) {
        if (arg0 <= -119) {
            ++field4027;
        }
    }
}
