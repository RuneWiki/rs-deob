import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class542 extends class392 {

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field7500 = 0;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Lin;")
    public static class380 field7496 = new class380(64, 4);

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "Lof;")
    public static class477 field7503;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "[[[Z")
    public static boolean[][][] field7502;

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lw;)V", line = 3)
    public class542(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)Z", line = 6)
    public final boolean method3131(int arg0) {
        ++field7495;
        if (arg0 != 0) {
            return true;
        } else {
            return !super.field5454.method3782((byte) -76);
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(ILw;)V", line = 21)
    public class542(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 25)
    public static void method3132(byte arg0) {
        field7503 = null;
        if (arg0 != -20) {
            method3132((byte) 89);
        }
        field7496 = null;
        field7502 = null;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)I", line = 39)
    public final int method290(int arg0, int arg1) {
        if (arg1 > -124) {
            return -67;
        } else {
            ++field7498;
            return super.field5454.method3782((byte) -118) ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(Z)V", line = 57)
    public final void method291(boolean arg0) {
        if (super.field5454.method3782((byte) -92)) {
            super.field5452 = 0;
        }
        ++field7504;
        if (arg0) {
            this.method3133(79);
        }
        if (super.field5452 != 1 && super.field5452 != 0) {
            super.field5452 = this.method292(!arg0);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)V", line = 74)
    public final void method286(byte arg0, int arg1) {
        int var3 = 106 % ((-80 - arg0) / 38);
        super.field5452 = arg1;
        ++field7501;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)I", line = 88)
    public final int method3133(int arg0) {
        ++field7497;
        return arg0 != 17539 ? -40 : super.field5452;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)I", line = 99)
    public final int method292(boolean arg0) {
        if (!arg0) {
            return 109;
        } else {
            ++field7499;
            return 1;
        }
    }
}
