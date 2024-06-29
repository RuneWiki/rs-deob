import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class31 extends class283 {

    @OriginalMember(owner = "client!mca", name = "k", descriptor = "Z")
    public static boolean field270 = false;

    @OriginalMember(owner = "client!mca", name = "l", descriptor = "Lea;")
    public static class547 field271 = new class547(87, 7);

    @OriginalMember(owner = "client!mca", name = "f", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!mca", name = "g", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!mca", name = "h", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!mca", name = "m", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!mca", name = "n", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!mca", name = "o", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!mca", name = "p", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)V")
    public final void method137(int arg0, int arg1, int arg2) {
        if (arg2 > -2) {
            this.method144((byte) -119);
        }
        ++field269;
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)Z")
    public final boolean method138(int arg0) {
        ++field266;
        if (arg0 != 31565) {
            method139(-54);
        }
        return true;
    }

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "(I)V")
    public static void method139(int arg0) {
        field271 = null;
        if (arg0 != -3) {
            field275 = -98;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lcu;ZI)V")
    public final void method140(class221 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method141(false, false);
        }
        super.field3749.method3006(1, arg0);
        ++field273;
        super.field3749.method3039(260, arg2);
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lac;)V")
    public class31(class541 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZZ)V")
    public final void method141(boolean arg0, boolean arg1) {
        if (arg0) {
            field271 = null;
        }
        ++field265;
        super.field3749.method3048(true, 0);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZI)V")
    public final void method142(boolean arg0, int arg1) {
        if (arg1 == 255) {
            ++field267;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IB)Z")
    public static final boolean method143(int arg0, byte arg1) {
        ++field274;
        int var2 = -111 / ((-43 - arg1) / 52);
        return arg0 == 0 || ~arg0 == -3;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)V")
    public final void method144(byte arg0) {
        super.field3749.method3048(false, 0);
        if (arg0 < 25) {
            field270 = false;
        }
        ++field272;
    }
}
